package org.jfree.data.statistics;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

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
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset4 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = null;
        defaultBoxAndWhiskerCategoryDataset4.data = keyedObjects2D5;
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = null;
        defaultBoxAndWhiskerCategoryDataset4.data = keyedObjects2D7;
        java.util.EventListener eventListener9 = null;
        boolean boolean10 = defaultBoxAndWhiskerCategoryDataset4.hasListener(eventListener9);
        org.jfree.data.KeyedObjects2D keyedObjects2D11 = defaultBoxAndWhiskerCategoryDataset4.data;
        double double13 = defaultBoxAndWhiskerCategoryDataset4.getRangeUpperBound(true);
        boolean boolean14 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset4);
        java.util.List list15 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultBoxAndWhiskerCategoryDataset4.add(list15, (java.lang.Comparable) 100, (java.lang.Comparable) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'values' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(keyedObjects2D11);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) "hi!");
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list9 = defaultBoxAndWhiskerCategoryDataset0.getOutliers((-1), 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        java.util.EventListener eventListener5 = null;
        boolean boolean6 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener5);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset10 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener11 = null;
        boolean boolean12 = defaultBoxAndWhiskerCategoryDataset10.hasListener(eventListener11);
        int int13 = defaultBoxAndWhiskerCategoryDataset10.getColumnCount();
        org.jfree.data.general.DatasetGroup datasetGroup14 = defaultBoxAndWhiskerCategoryDataset10.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number18 = defaultBoxAndWhiskerCategoryDataset0.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(keyedObjects2D7);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(datasetGroup14);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int10 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list13 = defaultBoxAndWhiskerCategoryDataset0.getOutliers((java.lang.Comparable) 100L, (java.lang.Comparable) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (100) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        double double5 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable9 = defaultBoxAndWhiskerCategoryDataset0.getColumnKey((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number7 = defaultBoxAndWhiskerCategoryDataset0.getMaxRegularValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (100) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset8 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener9 = null;
        boolean boolean10 = defaultBoxAndWhiskerCategoryDataset8.hasListener(eventListener9);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset8.removeChangeListener(datasetChangeListener11);
        java.util.List list13 = defaultBoxAndWhiskerCategoryDataset8.getColumnKeys();
        int int15 = defaultBoxAndWhiskerCategoryDataset8.getRowIndex((java.lang.Comparable) (byte) 1);
        boolean boolean16 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset8);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener17 = null;
        defaultBoxAndWhiskerCategoryDataset8.addChangeListener(datasetChangeListener17);
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = defaultBoxAndWhiskerCategoryDataset8.data;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number22 = defaultBoxAndWhiskerCategoryDataset8.getMinRegularValue((int) (short) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNull(keyedObjects2D7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(keyedObjects2D19);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 0L);
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number7 = defaultBoxAndWhiskerCategoryDataset0.getMedianValue((int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        java.util.List list5 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener10);
        org.jfree.data.KeyedObjects2D keyedObjects2D12 = defaultBoxAndWhiskerCategoryDataset0.data;
        java.util.EventListener eventListener13 = null;
        boolean boolean14 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener13);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list17 = defaultBoxAndWhiskerCategoryDataset0.getOutliers((int) '4', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(keyedObjects2D12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset8 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener9 = null;
        boolean boolean10 = defaultBoxAndWhiskerCategoryDataset8.hasListener(eventListener9);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset8.removeChangeListener(datasetChangeListener11);
        java.util.List list13 = defaultBoxAndWhiskerCategoryDataset8.getColumnKeys();
        int int15 = defaultBoxAndWhiskerCategoryDataset8.getRowIndex((java.lang.Comparable) (byte) 1);
        boolean boolean16 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset8);
        int int18 = defaultBoxAndWhiskerCategoryDataset8.getColumnIndex((java.lang.Comparable) (-1L));
        int int19 = defaultBoxAndWhiskerCategoryDataset8.getColumnCount();
        defaultBoxAndWhiskerCategoryDataset8.validateObject();
        defaultBoxAndWhiskerCategoryDataset8.validateObject();
        defaultBoxAndWhiskerCategoryDataset8.validateObject();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number25 = defaultBoxAndWhiskerCategoryDataset8.getMedianValue((java.lang.Comparable) 10, (java.lang.Comparable) 1.0f);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (10) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNull(keyedObjects2D7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener5);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = defaultBoxAndWhiskerCategoryDataset0.getMaxRegularValue((java.lang.Comparable) 0.0f, (java.lang.Comparable) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetGroup datasetGroup3 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        boolean boolean5 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) (byte) 1);
        org.jfree.data.general.DatasetGroup datasetGroup6 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = defaultBoxAndWhiskerCategoryDataset0.getMinRegularValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 1);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (0) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(datasetGroup3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(datasetGroup6);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10L);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        int int9 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 100.0d);
        java.util.List list10 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        org.jfree.data.Range range12 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        org.jfree.data.Range range14 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        org.jfree.data.general.DatasetGroup datasetGroup15 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener16 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener16);
        double double19 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number22 = defaultBoxAndWhiskerCategoryDataset0.getMinRegularValue(0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertNotNull(datasetGroup15);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int1 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        java.util.EventListener eventListener4 = null;
        boolean boolean5 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener4);
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = defaultBoxAndWhiskerCategoryDataset0.getQ1Value((java.lang.Comparable) (-1.0f), (java.lang.Comparable) 1);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (-1.0) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        java.util.List list5 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener11);
        java.lang.Comparable comparable14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number15 = defaultBoxAndWhiskerCategoryDataset0.getValue((java.lang.Comparable) (short) 1, comparable14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'columnKey' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset8 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener9 = null;
        boolean boolean10 = defaultBoxAndWhiskerCategoryDataset8.hasListener(eventListener9);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset8.removeChangeListener(datasetChangeListener11);
        java.util.List list13 = defaultBoxAndWhiskerCategoryDataset8.getColumnKeys();
        int int15 = defaultBoxAndWhiskerCategoryDataset8.getRowIndex((java.lang.Comparable) (byte) 1);
        boolean boolean16 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset8);
        int int18 = defaultBoxAndWhiskerCategoryDataset8.getColumnIndex((java.lang.Comparable) (-1L));
        int int19 = defaultBoxAndWhiskerCategoryDataset8.getColumnCount();
        defaultBoxAndWhiskerCategoryDataset8.validateObject();
        defaultBoxAndWhiskerCategoryDataset8.validateObject();
        defaultBoxAndWhiskerCategoryDataset8.validateObject();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable24 = defaultBoxAndWhiskerCategoryDataset8.getColumnKey((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNull(keyedObjects2D7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        java.util.List list5 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener10);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.statistics.BoxAndWhiskerItem boxAndWhiskerItem14 = defaultBoxAndWhiskerCategoryDataset0.getItem((int) (byte) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.Range range4 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener6);
        int int9 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) 1.0d);
        java.util.List list10 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        java.util.List list11 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener12);
        org.jfree.data.statistics.BoxAndWhiskerItem boxAndWhiskerItem14 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultBoxAndWhiskerCategoryDataset0.add(boxAndWhiskerItem14, (java.lang.Comparable) "hi!", (java.lang.Comparable) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(list11);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset8 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener9 = null;
        boolean boolean10 = defaultBoxAndWhiskerCategoryDataset8.hasListener(eventListener9);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset8.removeChangeListener(datasetChangeListener11);
        java.util.List list13 = defaultBoxAndWhiskerCategoryDataset8.getColumnKeys();
        int int15 = defaultBoxAndWhiskerCategoryDataset8.getRowIndex((java.lang.Comparable) (byte) 1);
        boolean boolean16 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset8);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener17 = null;
        defaultBoxAndWhiskerCategoryDataset8.removeChangeListener(datasetChangeListener17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number21 = defaultBoxAndWhiskerCategoryDataset8.getMinRegularValue((java.lang.Comparable) (byte) 10, (java.lang.Comparable) 10);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (10) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNull(keyedObjects2D7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = defaultBoxAndWhiskerCategoryDataset0.data;
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = defaultBoxAndWhiskerCategoryDataset0.data;
        java.util.EventListener eventListener9 = null;
        boolean boolean10 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number13 = defaultBoxAndWhiskerCategoryDataset0.getValue((int) (short) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(keyedObjects2D5);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNull(keyedObjects2D8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        java.lang.Comparable comparable7 = null;
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex(comparable7);
        java.lang.Object obj9 = defaultBoxAndWhiskerCategoryDataset0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable11 = defaultBoxAndWhiskerCategoryDataset0.getRowKey((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(datasetGroup4);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        java.util.List list5 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        double double12 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        int int13 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number16 = defaultBoxAndWhiskerCategoryDataset0.getMinOutlier((java.lang.Comparable) 1, (java.lang.Comparable) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (1) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10L);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = defaultBoxAndWhiskerCategoryDataset0.data;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = defaultBoxAndWhiskerCategoryDataset0.getValue((int) (byte) 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(keyedObjects2D6);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D7;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset9 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup10 = defaultBoxAndWhiskerCategoryDataset9.getGroup();
        double double12 = defaultBoxAndWhiskerCategoryDataset9.getRangeLowerBound(false);
        java.util.List list13 = defaultBoxAndWhiskerCategoryDataset9.getRowKeys();
        org.jfree.data.Range range15 = defaultBoxAndWhiskerCategoryDataset9.getRangeBounds(true);
        boolean boolean16 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) range15);
        java.util.EventListener eventListener17 = null;
        boolean boolean18 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener17);
        java.util.EventListener eventListener19 = null;
        boolean boolean20 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener19);
        java.lang.Comparable comparable21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number23 = defaultBoxAndWhiskerCategoryDataset0.getMeanValue(comparable21, (java.lang.Comparable) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup10);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = defaultBoxAndWhiskerCategoryDataset0.getMaxOutlier((java.lang.Comparable) true, (java.lang.Comparable) 100L);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (true) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetGroup datasetGroup3 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable6 = defaultBoxAndWhiskerCategoryDataset0.getRowKey((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(datasetGroup3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        java.util.List list5 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener10);
        org.jfree.data.KeyedObjects2D keyedObjects2D12 = defaultBoxAndWhiskerCategoryDataset0.data;
        java.util.EventListener eventListener13 = null;
        boolean boolean14 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener13);
        double double16 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        java.util.List list17 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number20 = defaultBoxAndWhiskerCategoryDataset0.getValue(0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(keyedObjects2D12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertNotNull(list17);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int1 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) '4');
        org.jfree.data.Range range6 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = defaultBoxAndWhiskerCategoryDataset0.getMaxOutlier((java.lang.Comparable) Double.NaN, (java.lang.Comparable) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (NaN) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(range6);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = defaultBoxAndWhiskerCategoryDataset0.data;
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number6 = defaultBoxAndWhiskerCategoryDataset0.getQ1Value(100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(keyedObjects2D1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        java.util.EventListener eventListener5 = null;
        boolean boolean6 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener5);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D10 = defaultBoxAndWhiskerCategoryDataset0.data;
        double double12 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number15 = defaultBoxAndWhiskerCategoryDataset0.getMaxRegularValue((int) ' ', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(keyedObjects2D7);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNull(keyedObjects2D10);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetGroup datasetGroup3 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener4);
        org.jfree.data.general.DatasetGroup datasetGroup6 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        java.util.EventListener eventListener7 = null;
        boolean boolean8 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = defaultBoxAndWhiskerCategoryDataset0.getQ1Value((-1), (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(datasetGroup3);
        org.junit.Assert.assertNotNull(datasetGroup6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset3 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener4 = null;
        boolean boolean5 = defaultBoxAndWhiskerCategoryDataset3.hasListener(eventListener4);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultBoxAndWhiskerCategoryDataset3.removeChangeListener(datasetChangeListener6);
        int int9 = defaultBoxAndWhiskerCategoryDataset3.getRowIndex((java.lang.Comparable) (byte) 1);
        double double11 = defaultBoxAndWhiskerCategoryDataset3.getRangeLowerBound(true);
        double double13 = defaultBoxAndWhiskerCategoryDataset3.getRangeLowerBound(true);
        java.util.List list14 = defaultBoxAndWhiskerCategoryDataset3.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            defaultBoxAndWhiskerCategoryDataset0.add(list14, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Range(double, double): require lower (Infinity) <= upper (-Infinity).");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        java.util.EventListener eventListener5 = null;
        boolean boolean6 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener5);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        java.util.EventListener eventListener8 = null;
        boolean boolean9 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener8);
        org.jfree.data.Range range11 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number16 = defaultBoxAndWhiskerCategoryDataset0.getQ3Value((java.lang.Comparable) (byte) 0, (java.lang.Comparable) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(keyedObjects2D7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(range11);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        java.util.EventListener eventListener5 = null;
        boolean boolean6 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener5);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset10 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener11 = null;
        boolean boolean12 = defaultBoxAndWhiskerCategoryDataset10.hasListener(eventListener11);
        int int13 = defaultBoxAndWhiskerCategoryDataset10.getColumnCount();
        org.jfree.data.general.DatasetGroup datasetGroup14 = defaultBoxAndWhiskerCategoryDataset10.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup14);
        org.jfree.data.Range range17 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(keyedObjects2D7);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(datasetGroup14);
        org.junit.Assert.assertNotNull(range17);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (-1L));
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        java.util.EventListener eventListener8 = null;
        boolean boolean9 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener8);
        org.jfree.data.KeyedObjects2D keyedObjects2D10 = defaultBoxAndWhiskerCategoryDataset0.data;
        int int11 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(keyedObjects2D10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        double double8 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        double double10 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        double double12 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable14 = defaultBoxAndWhiskerCategoryDataset0.getColumnKey((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 0L);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 1.0f);
        java.lang.Class<?> wildcardClass5 = defaultBoxAndWhiskerCategoryDataset0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        java.util.List list7 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        java.util.EventListener eventListener9 = null;
        boolean boolean10 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable12 = defaultBoxAndWhiskerCategoryDataset0.getRowKey(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener3);
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = defaultBoxAndWhiskerCategoryDataset0.data;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable7 = defaultBoxAndWhiskerCategoryDataset0.getColumnKey((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(keyedObjects2D5);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D7;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = defaultBoxAndWhiskerCategoryDataset0.getMinOutlier(0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10L);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        int int9 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 100.0d);
        java.util.List list10 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number13 = defaultBoxAndWhiskerCategoryDataset0.getQ3Value((java.lang.Comparable) 10.0d, (java.lang.Comparable) '#');
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (10.0) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = defaultBoxAndWhiskerCategoryDataset0.getMinRegularValue((java.lang.Comparable) (byte) 10, (java.lang.Comparable) 100.0f);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (10) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        java.lang.Comparable comparable7 = null;
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex(comparable7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = defaultBoxAndWhiskerCategoryDataset0.getMinOutlier((java.lang.Comparable) "hi!", (java.lang.Comparable) 0);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (hi!) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(datasetGroup4);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset8 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener9 = null;
        boolean boolean10 = defaultBoxAndWhiskerCategoryDataset8.hasListener(eventListener9);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset8.removeChangeListener(datasetChangeListener11);
        java.util.List list13 = defaultBoxAndWhiskerCategoryDataset8.getColumnKeys();
        int int15 = defaultBoxAndWhiskerCategoryDataset8.getRowIndex((java.lang.Comparable) (byte) 1);
        boolean boolean16 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset8);
        int int18 = defaultBoxAndWhiskerCategoryDataset8.getColumnIndex((java.lang.Comparable) (-1L));
        org.jfree.data.general.DatasetChangeListener datasetChangeListener19 = null;
        defaultBoxAndWhiskerCategoryDataset8.removeChangeListener(datasetChangeListener19);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener21 = null;
        defaultBoxAndWhiskerCategoryDataset8.addChangeListener(datasetChangeListener21);
        int int23 = defaultBoxAndWhiskerCategoryDataset8.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list26 = defaultBoxAndWhiskerCategoryDataset8.getOutliers(10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNull(keyedObjects2D7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        java.util.EventListener eventListener4 = null;
        boolean boolean5 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener4);
        java.lang.Class<?> wildcardClass6 = defaultBoxAndWhiskerCategoryDataset0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset8 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener9 = null;
        boolean boolean10 = defaultBoxAndWhiskerCategoryDataset8.hasListener(eventListener9);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset8.removeChangeListener(datasetChangeListener11);
        java.util.List list13 = defaultBoxAndWhiskerCategoryDataset8.getColumnKeys();
        int int15 = defaultBoxAndWhiskerCategoryDataset8.getRowIndex((java.lang.Comparable) (byte) 1);
        boolean boolean16 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset8);
        org.jfree.data.KeyedObjects2D keyedObjects2D17 = defaultBoxAndWhiskerCategoryDataset8.data;
        defaultBoxAndWhiskerCategoryDataset8.validateObject();
        double double20 = defaultBoxAndWhiskerCategoryDataset8.getRangeUpperBound(true);
        int int21 = defaultBoxAndWhiskerCategoryDataset8.getColumnCount();
        int int23 = defaultBoxAndWhiskerCategoryDataset8.getRowIndex((java.lang.Comparable) '#');
        java.util.List list24 = defaultBoxAndWhiskerCategoryDataset8.getRowKeys();
        int int25 = defaultBoxAndWhiskerCategoryDataset8.getRowCount();
        boolean boolean27 = defaultBoxAndWhiskerCategoryDataset8.equals((java.lang.Object) 0);
        java.lang.Comparable comparable29 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number30 = defaultBoxAndWhiskerCategoryDataset8.getValue((java.lang.Comparable) (byte) -1, comparable29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'columnKey' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNull(keyedObjects2D7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(keyedObjects2D17);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10L);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup6 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        java.util.List list8 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = defaultBoxAndWhiskerCategoryDataset0.getMaxOutlier((java.lang.Comparable) (short) -1, (java.lang.Comparable) 10.0d);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (-1) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(datasetGroup6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10L);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.KeyedObjects2D keyedObjects2D10 = defaultBoxAndWhiskerCategoryDataset0.data;
        int int11 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number14 = defaultBoxAndWhiskerCategoryDataset0.getMinRegularValue((java.lang.Comparable) 100, (java.lang.Comparable) 1L);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (100) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(keyedObjects2D10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable2 = defaultBoxAndWhiskerCategoryDataset0.getRowKey((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        java.util.EventListener eventListener5 = null;
        boolean boolean6 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener5);
        org.jfree.data.general.DatasetGroup datasetGroup7 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        org.jfree.data.statistics.BoxAndWhiskerItem boxAndWhiskerItem8 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultBoxAndWhiskerCategoryDataset0.add(boxAndWhiskerItem8, (java.lang.Comparable) 'a', (java.lang.Comparable) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(datasetGroup7);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        java.util.EventListener eventListener4 = null;
        boolean boolean5 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener4);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = defaultBoxAndWhiskerCategoryDataset0.getMaxRegularValue(10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = defaultBoxAndWhiskerCategoryDataset0.data;
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener8);
        java.util.EventListener eventListener10 = null;
        boolean boolean11 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener10);
        java.lang.Comparable comparable13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number14 = defaultBoxAndWhiskerCategoryDataset0.getQ3Value((java.lang.Comparable) 0L, comparable13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(keyedObjects2D5);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = defaultBoxAndWhiskerCategoryDataset0.getMaxRegularValue((java.lang.Comparable) true, (java.lang.Comparable) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (true) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener4);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        java.util.EventListener eventListener7 = null;
        boolean boolean8 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener7);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset9 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D10 = null;
        defaultBoxAndWhiskerCategoryDataset9.data = keyedObjects2D10;
        org.jfree.data.KeyedObjects2D keyedObjects2D12 = null;
        defaultBoxAndWhiskerCategoryDataset9.data = keyedObjects2D12;
        double double15 = defaultBoxAndWhiskerCategoryDataset9.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D16 = defaultBoxAndWhiskerCategoryDataset9.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset17 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener18 = null;
        boolean boolean19 = defaultBoxAndWhiskerCategoryDataset17.hasListener(eventListener18);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener20 = null;
        defaultBoxAndWhiskerCategoryDataset17.removeChangeListener(datasetChangeListener20);
        java.util.List list22 = defaultBoxAndWhiskerCategoryDataset17.getColumnKeys();
        int int24 = defaultBoxAndWhiskerCategoryDataset17.getRowIndex((java.lang.Comparable) (byte) 1);
        boolean boolean25 = defaultBoxAndWhiskerCategoryDataset9.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset17);
        org.jfree.data.KeyedObjects2D keyedObjects2D26 = defaultBoxAndWhiskerCategoryDataset17.data;
        defaultBoxAndWhiskerCategoryDataset17.validateObject();
        double double29 = defaultBoxAndWhiskerCategoryDataset17.getRangeUpperBound(true);
        int int30 = defaultBoxAndWhiskerCategoryDataset17.getColumnCount();
        int int32 = defaultBoxAndWhiskerCategoryDataset17.getRowIndex((java.lang.Comparable) '#');
        java.util.List list33 = defaultBoxAndWhiskerCategoryDataset17.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            defaultBoxAndWhiskerCategoryDataset0.add(list33, (java.lang.Comparable) (short) 0, (java.lang.Comparable) Double.NaN);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Range(double, double): require lower (Infinity) <= upper (-Infinity).");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertNull(keyedObjects2D16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(keyedObjects2D26);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(list33);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener3);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = defaultBoxAndWhiskerCategoryDataset0.getQ1Value(0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset8 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener9 = null;
        boolean boolean10 = defaultBoxAndWhiskerCategoryDataset8.hasListener(eventListener9);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset8.removeChangeListener(datasetChangeListener11);
        java.util.List list13 = defaultBoxAndWhiskerCategoryDataset8.getColumnKeys();
        int int15 = defaultBoxAndWhiskerCategoryDataset8.getRowIndex((java.lang.Comparable) (byte) 1);
        boolean boolean16 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset8);
        org.jfree.data.KeyedObjects2D keyedObjects2D17 = defaultBoxAndWhiskerCategoryDataset8.data;
        defaultBoxAndWhiskerCategoryDataset8.validateObject();
        double double20 = defaultBoxAndWhiskerCategoryDataset8.getRangeUpperBound(true);
        int int21 = defaultBoxAndWhiskerCategoryDataset8.getColumnCount();
        int int23 = defaultBoxAndWhiskerCategoryDataset8.getRowIndex((java.lang.Comparable) '#');
        java.util.List list24 = defaultBoxAndWhiskerCategoryDataset8.getRowKeys();
        int int25 = defaultBoxAndWhiskerCategoryDataset8.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number28 = defaultBoxAndWhiskerCategoryDataset8.getMeanValue((int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNull(keyedObjects2D7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(keyedObjects2D17);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        java.lang.Comparable comparable8 = null;
        int int9 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex(comparable8);
        java.lang.Comparable comparable10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = defaultBoxAndWhiskerCategoryDataset0.getQ1Value(comparable10, (java.lang.Comparable) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'rowKey' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(keyedObjects2D7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        java.util.List list5 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener10);
        org.jfree.data.KeyedObjects2D keyedObjects2D12 = defaultBoxAndWhiskerCategoryDataset0.data;
        java.util.EventListener eventListener13 = null;
        boolean boolean14 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener13);
        double double16 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener17 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number21 = defaultBoxAndWhiskerCategoryDataset0.getMinRegularValue((int) (byte) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(keyedObjects2D12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        boolean boolean3 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) 100.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number6 = defaultBoxAndWhiskerCategoryDataset0.getMaxOutlier((java.lang.Comparable) (short) 10, (java.lang.Comparable) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (10) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        org.jfree.data.general.DatasetGroup datasetGroup2 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number5 = defaultBoxAndWhiskerCategoryDataset0.getQ1Value((int) (byte) 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertNotNull(datasetGroup2);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener5);
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 1L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = defaultBoxAndWhiskerCategoryDataset0.getMaxOutlier((java.lang.Comparable) true, (java.lang.Comparable) "hi!");
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (true) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.Range range4 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = defaultBoxAndWhiskerCategoryDataset0.getMinOutlier(1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10L);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        int int9 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 100.0d);
        java.util.List list10 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        org.jfree.data.Range range12 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        org.jfree.data.Range range14 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number17 = defaultBoxAndWhiskerCategoryDataset0.getMinOutlier((java.lang.Comparable) 100L, (java.lang.Comparable) 1.0f);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (100) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(range14);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetGroup datasetGroup3 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        boolean boolean5 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) (byte) 1);
        org.jfree.data.general.DatasetGroup datasetGroup6 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = defaultBoxAndWhiskerCategoryDataset0.getMeanValue((java.lang.Comparable) ' ', (java.lang.Comparable) 1.0f);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key ( ) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(datasetGroup3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(datasetGroup6);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        java.util.List list5 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener10);
        org.jfree.data.KeyedObjects2D keyedObjects2D12 = defaultBoxAndWhiskerCategoryDataset0.data;
        java.util.EventListener eventListener13 = null;
        boolean boolean14 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number17 = defaultBoxAndWhiskerCategoryDataset0.getMaxOutlier((int) (short) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(keyedObjects2D12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10L);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup6 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = defaultBoxAndWhiskerCategoryDataset0.getQ3Value(1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(datasetGroup6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10L);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup6 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = defaultBoxAndWhiskerCategoryDataset0.getValue(1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(datasetGroup6);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener6);
        org.jfree.data.statistics.BoxAndWhiskerItem boxAndWhiskerItem8 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultBoxAndWhiskerCategoryDataset0.add(boxAndWhiskerItem8, (java.lang.Comparable) '#', (java.lang.Comparable) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.Range range9 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        java.lang.Comparable comparable10 = null;
        java.lang.Comparable comparable11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = defaultBoxAndWhiskerCategoryDataset0.getQ1Value(comparable10, comparable11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNull(keyedObjects2D7);
        org.junit.Assert.assertNotNull(range9);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        java.util.EventListener eventListener5 = null;
        boolean boolean6 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener5);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D10 = defaultBoxAndWhiskerCategoryDataset0.data;
        double double12 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number15 = defaultBoxAndWhiskerCategoryDataset0.getMinRegularValue((java.lang.Comparable) (byte) 0, (java.lang.Comparable) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(keyedObjects2D7);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNull(keyedObjects2D10);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.Range range8 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(range8);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        double double8 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        org.jfree.data.statistics.BoxAndWhiskerItem boxAndWhiskerItem9 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultBoxAndWhiskerCategoryDataset0.add(boxAndWhiskerItem9, (java.lang.Comparable) 100.0f, (java.lang.Comparable) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = defaultBoxAndWhiskerCategoryDataset0.data;
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        java.util.List list5 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = defaultBoxAndWhiskerCategoryDataset0.getMinRegularValue((java.lang.Comparable) 1L, (java.lang.Comparable) 0L);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (1) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(keyedObjects2D1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(list5);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = defaultBoxAndWhiskerCategoryDataset0.data;
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        java.util.List list7 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        java.lang.Object obj8 = defaultBoxAndWhiskerCategoryDataset0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = defaultBoxAndWhiskerCategoryDataset0.getMeanValue((java.lang.Comparable) "hi!", (java.lang.Comparable) "");
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (hi!) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(keyedObjects2D5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number7 = defaultBoxAndWhiskerCategoryDataset0.getMaxOutlier((int) (short) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        java.util.List list5 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        double double12 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        int int13 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list16 = defaultBoxAndWhiskerCategoryDataset0.getOutliers((java.lang.Comparable) 1, (java.lang.Comparable) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (1) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = defaultBoxAndWhiskerCategoryDataset0.getValue((java.lang.Comparable) (byte) -1, (java.lang.Comparable) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (-1) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(keyedObjects2D7);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset4 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = null;
        defaultBoxAndWhiskerCategoryDataset4.data = keyedObjects2D5;
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = null;
        defaultBoxAndWhiskerCategoryDataset4.data = keyedObjects2D7;
        java.util.EventListener eventListener9 = null;
        boolean boolean10 = defaultBoxAndWhiskerCategoryDataset4.hasListener(eventListener9);
        org.jfree.data.KeyedObjects2D keyedObjects2D11 = defaultBoxAndWhiskerCategoryDataset4.data;
        double double13 = defaultBoxAndWhiskerCategoryDataset4.getRangeUpperBound(true);
        boolean boolean14 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset4);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = defaultBoxAndWhiskerCategoryDataset4.getRowCount();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(keyedObjects2D11);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list7 = defaultBoxAndWhiskerCategoryDataset0.getOutliers((java.lang.Comparable) 1, (java.lang.Comparable) 10.0f);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (1) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.general.DatasetGroup datasetGroup6 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list9 = defaultBoxAndWhiskerCategoryDataset0.getOutliers((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (0) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup6);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        java.util.List list7 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = defaultBoxAndWhiskerCategoryDataset0.getQ1Value((java.lang.Comparable) (byte) 1, (java.lang.Comparable) 100);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (1) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10L);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) 10.0f);
        double double10 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number13 = defaultBoxAndWhiskerCategoryDataset0.getMaxRegularValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (100) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset8 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener9 = null;
        boolean boolean10 = defaultBoxAndWhiskerCategoryDataset8.hasListener(eventListener9);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset8.removeChangeListener(datasetChangeListener11);
        java.util.List list13 = defaultBoxAndWhiskerCategoryDataset8.getColumnKeys();
        int int15 = defaultBoxAndWhiskerCategoryDataset8.getRowIndex((java.lang.Comparable) (byte) 1);
        boolean boolean16 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset8);
        int int18 = defaultBoxAndWhiskerCategoryDataset8.getColumnIndex((java.lang.Comparable) (-1L));
        int int19 = defaultBoxAndWhiskerCategoryDataset8.getColumnCount();
        defaultBoxAndWhiskerCategoryDataset8.validateObject();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable22 = defaultBoxAndWhiskerCategoryDataset8.getRowKey((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNull(keyedObjects2D7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10L);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        int int9 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 100.0d);
        java.util.List list10 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        org.jfree.data.Range range12 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        org.jfree.data.Range range14 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        org.jfree.data.general.DatasetGroup datasetGroup15 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener16 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener16);
        double double19 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number22 = defaultBoxAndWhiskerCategoryDataset0.getMinRegularValue((int) ' ', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertNotNull(datasetGroup15);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        java.util.List list5 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        double double12 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        java.util.List list13 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        java.lang.Comparable comparable15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number17 = defaultBoxAndWhiskerCategoryDataset0.getMedianValue(comparable15, (java.lang.Comparable) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'rowKey' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) Double.NaN);
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.Range range10 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        int int11 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        java.lang.Comparable comparable12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number14 = defaultBoxAndWhiskerCategoryDataset0.getMeanValue(comparable12, (java.lang.Comparable) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'rowKey' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(keyedObjects2D8);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int1 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup2 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        java.util.EventListener eventListener4 = null;
        boolean boolean5 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener4);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(datasetGroup2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        java.util.List list4 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = defaultBoxAndWhiskerCategoryDataset0.getMeanValue((int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(list4);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        java.lang.Comparable comparable4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number5 = defaultBoxAndWhiskerCategoryDataset0.getQ1Value((java.lang.Comparable) (short) 0, comparable4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'columnKey' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset8 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener9 = null;
        boolean boolean10 = defaultBoxAndWhiskerCategoryDataset8.hasListener(eventListener9);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset8.removeChangeListener(datasetChangeListener11);
        java.util.List list13 = defaultBoxAndWhiskerCategoryDataset8.getColumnKeys();
        int int15 = defaultBoxAndWhiskerCategoryDataset8.getRowIndex((java.lang.Comparable) (byte) 1);
        boolean boolean16 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset8);
        int int18 = defaultBoxAndWhiskerCategoryDataset8.getColumnIndex((java.lang.Comparable) (-1L));
        org.jfree.data.general.DatasetChangeListener datasetChangeListener19 = null;
        defaultBoxAndWhiskerCategoryDataset8.addChangeListener(datasetChangeListener19);
        java.util.List list21 = defaultBoxAndWhiskerCategoryDataset8.getRowKeys();
        double double23 = defaultBoxAndWhiskerCategoryDataset8.getRangeUpperBound(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number26 = defaultBoxAndWhiskerCategoryDataset8.getMedianValue((java.lang.Comparable) Double.NaN, (java.lang.Comparable) 10.0f);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (NaN) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNull(keyedObjects2D7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D7;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset9 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup10 = defaultBoxAndWhiskerCategoryDataset9.getGroup();
        double double12 = defaultBoxAndWhiskerCategoryDataset9.getRangeLowerBound(false);
        java.util.List list13 = defaultBoxAndWhiskerCategoryDataset9.getRowKeys();
        org.jfree.data.Range range15 = defaultBoxAndWhiskerCategoryDataset9.getRangeBounds(true);
        boolean boolean16 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) range15);
        java.util.EventListener eventListener17 = null;
        boolean boolean18 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener17);
        double double20 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number23 = defaultBoxAndWhiskerCategoryDataset0.getMinRegularValue((int) (byte) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup10);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        java.util.List list3 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener4);
        org.jfree.data.general.DatasetGroup datasetGroup6 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        org.jfree.data.statistics.BoxAndWhiskerItem boxAndWhiskerItem7 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultBoxAndWhiskerCategoryDataset0.add(boxAndWhiskerItem7, (java.lang.Comparable) 1L, (java.lang.Comparable) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(datasetGroup6);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        java.util.EventListener eventListener5 = null;
        boolean boolean6 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener5);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = defaultBoxAndWhiskerCategoryDataset0.getMinRegularValue((int) (byte) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(keyedObjects2D7);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        java.util.EventListener eventListener5 = null;
        boolean boolean6 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener5);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D10 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset11 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup12 = defaultBoxAndWhiskerCategoryDataset11.getGroup();
        org.jfree.data.general.DatasetGroup datasetGroup13 = defaultBoxAndWhiskerCategoryDataset11.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup13);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number18 = defaultBoxAndWhiskerCategoryDataset0.getMinRegularValue((java.lang.Comparable) 100L, (java.lang.Comparable) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(keyedObjects2D7);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNull(keyedObjects2D10);
        org.junit.Assert.assertNotNull(datasetGroup12);
        org.junit.Assert.assertNotNull(datasetGroup13);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D7;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset9 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup10 = defaultBoxAndWhiskerCategoryDataset9.getGroup();
        double double12 = defaultBoxAndWhiskerCategoryDataset9.getRangeLowerBound(false);
        java.util.List list13 = defaultBoxAndWhiskerCategoryDataset9.getRowKeys();
        org.jfree.data.Range range15 = defaultBoxAndWhiskerCategoryDataset9.getRangeBounds(true);
        boolean boolean16 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) range15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = defaultBoxAndWhiskerCategoryDataset0.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup10);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = defaultBoxAndWhiskerCategoryDataset0.data;
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener8);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list13 = defaultBoxAndWhiskerCategoryDataset0.getOutliers((int) (byte) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(keyedObjects2D5);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        java.util.EventListener eventListener5 = null;
        boolean boolean6 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener5);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        java.util.EventListener eventListener8 = null;
        boolean boolean9 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener8);
        org.jfree.data.Range range11 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener12);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list14 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(keyedObjects2D7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(range11);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = defaultBoxAndWhiskerCategoryDataset0.data;
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.Range range8 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(keyedObjects2D5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(range8);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        java.util.List list4 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.Range range6 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = defaultBoxAndWhiskerCategoryDataset0.getQ3Value((java.lang.Comparable) (short) 1, (java.lang.Comparable) 10.0d);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (1) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(range6);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10L);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.Range range8 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = defaultBoxAndWhiskerCategoryDataset0.getMedianValue((java.lang.Comparable) (short) -1, (java.lang.Comparable) '4');
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (-1) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(keyedObjects2D6);
        org.junit.Assert.assertNotNull(range8);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        java.util.List list7 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int10 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list13 = defaultBoxAndWhiskerCategoryDataset0.getOutliers((java.lang.Comparable) 1L, (java.lang.Comparable) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (1) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        java.util.EventListener eventListener5 = null;
        boolean boolean6 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener5);
        org.jfree.data.general.DatasetGroup datasetGroup7 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list10 = defaultBoxAndWhiskerCategoryDataset0.getOutliers((int) 'a', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(datasetGroup7);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10L);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        int int9 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 100.0d);
        java.util.List list10 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        java.lang.Object obj11 = defaultBoxAndWhiskerCategoryDataset0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number14 = defaultBoxAndWhiskerCategoryDataset0.getMinOutlier((java.lang.Comparable) (byte) -1, (java.lang.Comparable) 'a');
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (-1) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        java.util.EventListener eventListener5 = null;
        boolean boolean6 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener5);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D10 = defaultBoxAndWhiskerCategoryDataset0.data;
        double double12 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.statistics.BoxAndWhiskerItem boxAndWhiskerItem13 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultBoxAndWhiskerCategoryDataset0.add(boxAndWhiskerItem13, (java.lang.Comparable) 10L, (java.lang.Comparable) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(keyedObjects2D7);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNull(keyedObjects2D10);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D7;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset9 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup10 = defaultBoxAndWhiskerCategoryDataset9.getGroup();
        double double12 = defaultBoxAndWhiskerCategoryDataset9.getRangeLowerBound(false);
        java.util.List list13 = defaultBoxAndWhiskerCategoryDataset9.getRowKeys();
        org.jfree.data.Range range15 = defaultBoxAndWhiskerCategoryDataset9.getRangeBounds(true);
        boolean boolean16 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) range15);
        double double18 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        java.lang.Class<?> wildcardClass19 = defaultBoxAndWhiskerCategoryDataset0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup10);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        java.util.List list5 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener10);
        org.jfree.data.KeyedObjects2D keyedObjects2D12 = defaultBoxAndWhiskerCategoryDataset0.data;
        java.util.EventListener eventListener13 = null;
        boolean boolean14 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener13);
        double double16 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        java.util.List list17 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number20 = defaultBoxAndWhiskerCategoryDataset0.getMedianValue((java.lang.Comparable) (-1.0f), (java.lang.Comparable) 10L);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (-1.0) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(keyedObjects2D12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertNotNull(list17);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number7 = defaultBoxAndWhiskerCategoryDataset0.getValue((int) ' ', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener5);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener7);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list11 = defaultBoxAndWhiskerCategoryDataset0.getOutliers((int) (byte) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        java.util.EventListener eventListener5 = null;
        boolean boolean6 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener5);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset10 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener11 = null;
        boolean boolean12 = defaultBoxAndWhiskerCategoryDataset10.hasListener(eventListener11);
        int int13 = defaultBoxAndWhiskerCategoryDataset10.getColumnCount();
        org.jfree.data.general.DatasetGroup datasetGroup14 = defaultBoxAndWhiskerCategoryDataset10.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup14);
        org.jfree.data.statistics.BoxAndWhiskerItem boxAndWhiskerItem16 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultBoxAndWhiskerCategoryDataset0.add(boxAndWhiskerItem16, (java.lang.Comparable) 10.0d, (java.lang.Comparable) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(keyedObjects2D7);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(datasetGroup14);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 0L);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 1.0f);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener5);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        java.util.List list8 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultBoxAndWhiskerCategoryDataset0.add(list8, (java.lang.Comparable) (short) 1, (java.lang.Comparable) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'values' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) Double.NaN);
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = defaultBoxAndWhiskerCategoryDataset0.data;
        java.util.List list9 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        java.lang.Object obj10 = null;
        boolean boolean11 = defaultBoxAndWhiskerCategoryDataset0.equals(obj10);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset12 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener13 = null;
        boolean boolean14 = defaultBoxAndWhiskerCategoryDataset12.hasListener(eventListener13);
        int int16 = defaultBoxAndWhiskerCategoryDataset12.getRowIndex((java.lang.Comparable) 10L);
        int int17 = defaultBoxAndWhiskerCategoryDataset12.getRowCount();
        int int18 = defaultBoxAndWhiskerCategoryDataset12.getColumnCount();
        int int19 = defaultBoxAndWhiskerCategoryDataset12.getColumnCount();
        int int21 = defaultBoxAndWhiskerCategoryDataset12.getRowIndex((java.lang.Comparable) 100.0d);
        java.util.List list22 = defaultBoxAndWhiskerCategoryDataset12.getColumnKeys();
        org.jfree.data.Range range24 = defaultBoxAndWhiskerCategoryDataset12.getRangeBounds(false);
        org.jfree.data.Range range26 = defaultBoxAndWhiskerCategoryDataset12.getRangeBounds(false);
        java.util.List list27 = defaultBoxAndWhiskerCategoryDataset12.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            defaultBoxAndWhiskerCategoryDataset0.add(list27, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Range(double, double): require lower (Infinity) <= upper (-Infinity).");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(keyedObjects2D8);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(list27);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int1 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup2 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.Range range5 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = defaultBoxAndWhiskerCategoryDataset0.getMinOutlier((java.lang.Comparable) 1.0d, (java.lang.Comparable) 10L);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (1.0) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(datasetGroup2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(range5);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10L);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        int int9 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 100.0d);
        java.util.List list10 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        org.jfree.data.Range range12 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        org.jfree.data.Range range14 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D15 = defaultBoxAndWhiskerCategoryDataset0.data;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable17 = defaultBoxAndWhiskerCategoryDataset0.getRowKey((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertNotNull(keyedObjects2D15);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener4);
        java.util.EventListener eventListener6 = null;
        boolean boolean7 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = defaultBoxAndWhiskerCategoryDataset0.getQ1Value((int) (short) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener7);
        int int10 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) 1.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number13 = defaultBoxAndWhiskerCategoryDataset0.getQ3Value((java.lang.Comparable) 1L, (java.lang.Comparable) 10);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (1) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) Double.NaN);
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = defaultBoxAndWhiskerCategoryDataset0.data;
        java.util.List list9 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        java.lang.Object obj10 = null;
        boolean boolean11 = defaultBoxAndWhiskerCategoryDataset0.equals(obj10);
        double double13 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number16 = defaultBoxAndWhiskerCategoryDataset0.getMinRegularValue((int) ' ', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(keyedObjects2D8);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        java.util.EventListener eventListener5 = null;
        boolean boolean6 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener5);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener7);
        org.jfree.data.KeyedObjects2D keyedObjects2D9 = defaultBoxAndWhiskerCategoryDataset0.data;
        java.util.List list10 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number13 = defaultBoxAndWhiskerCategoryDataset0.getValue((int) (byte) 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(keyedObjects2D9);
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener5);
        org.jfree.data.Range range8 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable10 = defaultBoxAndWhiskerCategoryDataset0.getColumnKey((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(range8);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener4);
        java.lang.Comparable comparable6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = defaultBoxAndWhiskerCategoryDataset0.getMaxOutlier(comparable6, (java.lang.Comparable) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'rowKey' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = defaultBoxAndWhiskerCategoryDataset0.getMinOutlier((int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        java.util.List list4 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.Range range6 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        double double8 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list11 = defaultBoxAndWhiskerCategoryDataset0.getOutliers((int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener6);
        java.util.List list8 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        java.lang.Class<?> wildcardClass9 = list8.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(keyedObjects2D5);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10L);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        int int9 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 100.0d);
        java.util.List list10 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        org.jfree.data.Range range12 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        org.jfree.data.Range range14 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        org.jfree.data.general.DatasetGroup datasetGroup15 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number18 = defaultBoxAndWhiskerCategoryDataset0.getQ3Value(100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertNotNull(datasetGroup15);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10L);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        int int9 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 100.0d);
        java.util.List list10 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        org.jfree.data.Range range12 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        org.jfree.data.Range range14 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number17 = defaultBoxAndWhiskerCategoryDataset0.getMeanValue((int) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(range14);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        java.util.List list5 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener10);
        org.jfree.data.KeyedObjects2D keyedObjects2D12 = defaultBoxAndWhiskerCategoryDataset0.data;
        java.util.EventListener eventListener13 = null;
        boolean boolean14 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener13);
        double double16 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        java.util.List list17 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number20 = defaultBoxAndWhiskerCategoryDataset0.getValue((java.lang.Comparable) '#', (java.lang.Comparable) (-1));
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (#) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(keyedObjects2D12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertNotNull(list17);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        java.util.List list7 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D9 = defaultBoxAndWhiskerCategoryDataset0.data;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = defaultBoxAndWhiskerCategoryDataset0.getMeanValue((java.lang.Comparable) "", (java.lang.Comparable) 100.0f);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key () not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(keyedObjects2D9);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        java.util.List list4 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        int int9 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = defaultBoxAndWhiskerCategoryDataset0.getMinOutlier((int) 'a', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.statistics.BoxAndWhiskerItem boxAndWhiskerItem7 = defaultBoxAndWhiskerCategoryDataset0.getItem((int) (short) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D7;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset9 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup10 = defaultBoxAndWhiskerCategoryDataset9.getGroup();
        double double12 = defaultBoxAndWhiskerCategoryDataset9.getRangeLowerBound(false);
        java.util.List list13 = defaultBoxAndWhiskerCategoryDataset9.getRowKeys();
        org.jfree.data.Range range15 = defaultBoxAndWhiskerCategoryDataset9.getRangeBounds(true);
        boolean boolean16 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) range15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number19 = defaultBoxAndWhiskerCategoryDataset0.getQ1Value((int) (short) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup10);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number5 = defaultBoxAndWhiskerCategoryDataset0.getMedianValue((int) '#', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        java.util.EventListener eventListener5 = null;
        boolean boolean6 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener5);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = defaultBoxAndWhiskerCategoryDataset0.getMedianValue((java.lang.Comparable) 10, (java.lang.Comparable) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(keyedObjects2D7);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        java.util.List list4 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener5);
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = defaultBoxAndWhiskerCategoryDataset0.getQ1Value((java.lang.Comparable) 100.0f, (java.lang.Comparable) 100.0d);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (100.0) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10L);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.statistics.BoxAndWhiskerItem boxAndWhiskerItem12 = defaultBoxAndWhiskerCategoryDataset0.getItem((int) (short) 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        java.util.List list5 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list13 = defaultBoxAndWhiskerCategoryDataset0.getOutliers(10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        double double8 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        double double10 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        double double12 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list15 = defaultBoxAndWhiskerCategoryDataset0.getOutliers(100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10L);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (-1.0f));
        org.jfree.data.general.DatasetGroup datasetGroup7 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        java.lang.Object obj9 = defaultBoxAndWhiskerCategoryDataset0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = defaultBoxAndWhiskerCategoryDataset0.getMinRegularValue((java.lang.Comparable) 1, (java.lang.Comparable) false);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (1) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (-1L));
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        java.util.EventListener eventListener8 = null;
        boolean boolean9 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = defaultBoxAndWhiskerCategoryDataset0.getMeanValue((int) (byte) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener5);
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 1L);
        org.jfree.data.statistics.BoxAndWhiskerItem boxAndWhiskerItem9 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultBoxAndWhiskerCategoryDataset0.add(boxAndWhiskerItem9, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.Range range4 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener6);
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        double double10 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        boolean boolean13 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number16 = defaultBoxAndWhiskerCategoryDataset0.getMaxOutlier((java.lang.Comparable) true, (java.lang.Comparable) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (true) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        java.util.EventListener eventListener4 = null;
        boolean boolean5 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = defaultBoxAndWhiskerCategoryDataset0.getValue((java.lang.Comparable) (-1.0d), (java.lang.Comparable) '4');
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (-1.0) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10L);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.KeyedObjects2D keyedObjects2D10 = defaultBoxAndWhiskerCategoryDataset0.data;
        double double12 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number15 = defaultBoxAndWhiskerCategoryDataset0.getMinRegularValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (0) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(keyedObjects2D10);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = defaultBoxAndWhiskerCategoryDataset0.getMaxOutlier((int) (byte) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D7;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset9 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup10 = defaultBoxAndWhiskerCategoryDataset9.getGroup();
        double double12 = defaultBoxAndWhiskerCategoryDataset9.getRangeLowerBound(false);
        java.util.List list13 = defaultBoxAndWhiskerCategoryDataset9.getRowKeys();
        org.jfree.data.Range range15 = defaultBoxAndWhiskerCategoryDataset9.getRangeBounds(true);
        boolean boolean16 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) range15);
        java.lang.Comparable comparable18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number19 = defaultBoxAndWhiskerCategoryDataset0.getQ3Value((java.lang.Comparable) 1.0d, comparable18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup10);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener4);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener7);
        org.jfree.data.general.DatasetGroup datasetGroup9 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable11 = defaultBoxAndWhiskerCategoryDataset0.getRowKey((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(datasetGroup9);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        java.util.EventListener eventListener4 = null;
        boolean boolean5 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener4);
        java.util.List list6 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = defaultBoxAndWhiskerCategoryDataset0.getMeanValue((java.lang.Comparable) 0.0f, (java.lang.Comparable) (-1));
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (0.0) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(list6);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        java.util.EventListener eventListener5 = null;
        boolean boolean6 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener5);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D10 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset11 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup12 = defaultBoxAndWhiskerCategoryDataset11.getGroup();
        org.jfree.data.general.DatasetGroup datasetGroup13 = defaultBoxAndWhiskerCategoryDataset11.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup13);
        org.jfree.data.KeyedObjects2D keyedObjects2D15 = defaultBoxAndWhiskerCategoryDataset0.data;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number18 = defaultBoxAndWhiskerCategoryDataset0.getQ3Value((int) (byte) 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(keyedObjects2D7);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNull(keyedObjects2D10);
        org.junit.Assert.assertNotNull(datasetGroup12);
        org.junit.Assert.assertNotNull(datasetGroup13);
        org.junit.Assert.assertNull(keyedObjects2D15);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = defaultBoxAndWhiskerCategoryDataset0.data;
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.Range range8 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset9 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double11 = defaultBoxAndWhiskerCategoryDataset9.getRangeUpperBound(true);
        org.jfree.data.Range range13 = defaultBoxAndWhiskerCategoryDataset9.getRangeBounds(true);
        int int14 = defaultBoxAndWhiskerCategoryDataset9.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultBoxAndWhiskerCategoryDataset9.addChangeListener(datasetChangeListener15);
        int int18 = defaultBoxAndWhiskerCategoryDataset9.getColumnIndex((java.lang.Comparable) 1.0d);
        java.util.List list19 = defaultBoxAndWhiskerCategoryDataset9.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            defaultBoxAndWhiskerCategoryDataset0.add(list19, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Range(double, double): require lower (Infinity) <= upper (-Infinity).");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(keyedObjects2D5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(list19);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener6);
        java.util.List list8 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        org.jfree.data.general.DatasetGroup datasetGroup9 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        java.lang.Object obj10 = defaultBoxAndWhiskerCategoryDataset0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number13 = defaultBoxAndWhiskerCategoryDataset0.getMeanValue((int) (byte) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(keyedObjects2D5);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(datasetGroup9);
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        java.util.List list3 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        java.util.List list4 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list9 = defaultBoxAndWhiskerCategoryDataset0.getOutliers((int) '4', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) "hi!");
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset9 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D10 = null;
        defaultBoxAndWhiskerCategoryDataset9.data = keyedObjects2D10;
        org.jfree.data.KeyedObjects2D keyedObjects2D12 = null;
        defaultBoxAndWhiskerCategoryDataset9.data = keyedObjects2D12;
        double double15 = defaultBoxAndWhiskerCategoryDataset9.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D16 = defaultBoxAndWhiskerCategoryDataset9.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset17 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener18 = null;
        boolean boolean19 = defaultBoxAndWhiskerCategoryDataset17.hasListener(eventListener18);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener20 = null;
        defaultBoxAndWhiskerCategoryDataset17.removeChangeListener(datasetChangeListener20);
        java.util.List list22 = defaultBoxAndWhiskerCategoryDataset17.getColumnKeys();
        int int24 = defaultBoxAndWhiskerCategoryDataset17.getRowIndex((java.lang.Comparable) (byte) 1);
        boolean boolean25 = defaultBoxAndWhiskerCategoryDataset9.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset17);
        int int27 = defaultBoxAndWhiskerCategoryDataset17.getColumnIndex((java.lang.Comparable) (-1L));
        int int28 = defaultBoxAndWhiskerCategoryDataset17.getColumnCount();
        java.util.List list29 = defaultBoxAndWhiskerCategoryDataset17.getRowKeys();
        java.lang.Comparable comparable30 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultBoxAndWhiskerCategoryDataset0.add(list29, comparable30, (java.lang.Comparable) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'rowKey' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertNull(keyedObjects2D16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(list29);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset8 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener9 = null;
        boolean boolean10 = defaultBoxAndWhiskerCategoryDataset8.hasListener(eventListener9);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset8.removeChangeListener(datasetChangeListener11);
        java.util.List list13 = defaultBoxAndWhiskerCategoryDataset8.getColumnKeys();
        int int15 = defaultBoxAndWhiskerCategoryDataset8.getRowIndex((java.lang.Comparable) (byte) 1);
        boolean boolean16 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset8);
        org.jfree.data.KeyedObjects2D keyedObjects2D17 = defaultBoxAndWhiskerCategoryDataset8.data;
        defaultBoxAndWhiskerCategoryDataset8.validateObject();
        double double20 = defaultBoxAndWhiskerCategoryDataset8.getRangeUpperBound(true);
        int int21 = defaultBoxAndWhiskerCategoryDataset8.getColumnCount();
        int int23 = defaultBoxAndWhiskerCategoryDataset8.getRowIndex((java.lang.Comparable) '#');
        java.util.List list24 = defaultBoxAndWhiskerCategoryDataset8.getRowKeys();
        int int25 = defaultBoxAndWhiskerCategoryDataset8.getRowCount();
        boolean boolean27 = defaultBoxAndWhiskerCategoryDataset8.equals((java.lang.Object) 0);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener28 = null;
        defaultBoxAndWhiskerCategoryDataset8.addChangeListener(datasetChangeListener28);
        java.lang.Class<?> wildcardClass30 = defaultBoxAndWhiskerCategoryDataset8.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNull(keyedObjects2D7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(keyedObjects2D17);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        java.lang.Object obj4 = defaultBoxAndWhiskerCategoryDataset0.clone();
        java.lang.Comparable comparable5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number7 = defaultBoxAndWhiskerCategoryDataset0.getValue(comparable5, (java.lang.Comparable) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'rowKey' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(obj4);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        java.util.EventListener eventListener5 = null;
        boolean boolean6 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener5);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = defaultBoxAndWhiskerCategoryDataset0.getMaxOutlier((int) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int1 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.statistics.BoxAndWhiskerItem boxAndWhiskerItem7 = defaultBoxAndWhiskerCategoryDataset0.getItem((int) (byte) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = defaultBoxAndWhiskerCategoryDataset0.data;
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = defaultBoxAndWhiskerCategoryDataset0.getMaxRegularValue((java.lang.Comparable) 1, (java.lang.Comparable) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(keyedObjects2D5);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable10 = defaultBoxAndWhiskerCategoryDataset0.getColumnKey((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset8 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener9 = null;
        boolean boolean10 = defaultBoxAndWhiskerCategoryDataset8.hasListener(eventListener9);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset8.removeChangeListener(datasetChangeListener11);
        java.util.List list13 = defaultBoxAndWhiskerCategoryDataset8.getColumnKeys();
        int int15 = defaultBoxAndWhiskerCategoryDataset8.getRowIndex((java.lang.Comparable) (byte) 1);
        boolean boolean16 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset8);
        org.jfree.data.KeyedObjects2D keyedObjects2D17 = defaultBoxAndWhiskerCategoryDataset8.data;
        defaultBoxAndWhiskerCategoryDataset8.validateObject();
        double double20 = defaultBoxAndWhiskerCategoryDataset8.getRangeUpperBound(true);
        int int21 = defaultBoxAndWhiskerCategoryDataset8.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number24 = defaultBoxAndWhiskerCategoryDataset8.getMinRegularValue(100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNull(keyedObjects2D7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(keyedObjects2D17);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D7;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset9 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup10 = defaultBoxAndWhiskerCategoryDataset9.getGroup();
        double double12 = defaultBoxAndWhiskerCategoryDataset9.getRangeLowerBound(false);
        java.util.List list13 = defaultBoxAndWhiskerCategoryDataset9.getRowKeys();
        org.jfree.data.Range range15 = defaultBoxAndWhiskerCategoryDataset9.getRangeBounds(true);
        boolean boolean16 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) range15);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener17 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number21 = defaultBoxAndWhiskerCategoryDataset0.getMedianValue((java.lang.Comparable) (-1.0f), (java.lang.Comparable) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup10);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number6 = defaultBoxAndWhiskerCategoryDataset0.getMinOutlier((int) (byte) 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener5);
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 1L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = defaultBoxAndWhiskerCategoryDataset0.getMeanValue((int) (byte) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10L);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup6 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = defaultBoxAndWhiskerCategoryDataset0.getMeanValue((int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(datasetGroup6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int1 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup2 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number5 = defaultBoxAndWhiskerCategoryDataset0.getMinRegularValue((-1), (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(datasetGroup2);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        java.util.List list7 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D9 = defaultBoxAndWhiskerCategoryDataset0.data;
        int int11 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 1.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number14 = defaultBoxAndWhiskerCategoryDataset0.getValue((int) (byte) 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(keyedObjects2D9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = defaultBoxAndWhiskerCategoryDataset0.data;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = defaultBoxAndWhiskerCategoryDataset0.getMeanValue((java.lang.Comparable) (-1L), (java.lang.Comparable) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (-1) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(keyedObjects2D5);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetGroup datasetGroup3 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        boolean boolean5 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) (byte) 1);
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) 0L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = defaultBoxAndWhiskerCategoryDataset0.getMedianValue((-1), (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(datasetGroup3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (short) 100);
        java.util.List list5 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.Range range9 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = defaultBoxAndWhiskerCategoryDataset0.getMinOutlier((java.lang.Comparable) Double.NaN, (java.lang.Comparable) 10);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (NaN) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(range9);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 0L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number5 = defaultBoxAndWhiskerCategoryDataset0.getMedianValue((int) (short) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.Range range4 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        org.jfree.data.general.DatasetGroup datasetGroup5 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        java.lang.Object obj6 = defaultBoxAndWhiskerCategoryDataset0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = defaultBoxAndWhiskerCategoryDataset0.getMaxRegularValue((int) (short) 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertNotNull(datasetGroup5);
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        java.util.List list5 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number16 = defaultBoxAndWhiskerCategoryDataset0.getMedianValue((int) 'a', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        java.util.EventListener eventListener5 = null;
        boolean boolean6 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener5);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        java.util.EventListener eventListener8 = null;
        boolean boolean9 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener8);
        org.jfree.data.Range range11 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number16 = defaultBoxAndWhiskerCategoryDataset0.getMaxOutlier((java.lang.Comparable) "hi!", (java.lang.Comparable) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(keyedObjects2D7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(range11);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int1 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) '4');
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener5);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener7);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset9 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener10 = null;
        boolean boolean11 = defaultBoxAndWhiskerCategoryDataset9.hasListener(eventListener10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultBoxAndWhiskerCategoryDataset9.removeChangeListener(datasetChangeListener12);
        java.util.List list14 = defaultBoxAndWhiskerCategoryDataset9.getColumnKeys();
        int int16 = defaultBoxAndWhiskerCategoryDataset9.getRowIndex((java.lang.Comparable) (byte) 1);
        double double18 = defaultBoxAndWhiskerCategoryDataset9.getRangeLowerBound(true);
        defaultBoxAndWhiskerCategoryDataset9.validateObject();
        double double21 = defaultBoxAndWhiskerCategoryDataset9.getRangeLowerBound(true);
        java.util.List list22 = defaultBoxAndWhiskerCategoryDataset9.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            defaultBoxAndWhiskerCategoryDataset0.add(list22, (java.lang.Comparable) "", (java.lang.Comparable) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Range(double, double): require lower (Infinity) <= upper (-Infinity).");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNotNull(list22);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 0L);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 1.0f);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener5);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        int int9 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = defaultBoxAndWhiskerCategoryDataset0.getValue((java.lang.Comparable) (byte) 1, (java.lang.Comparable) (-1.0f));
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (1) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        java.util.EventListener eventListener5 = null;
        boolean boolean6 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener5);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D10 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset11 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup12 = defaultBoxAndWhiskerCategoryDataset11.getGroup();
        org.jfree.data.general.DatasetGroup datasetGroup13 = defaultBoxAndWhiskerCategoryDataset11.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup13);
        java.util.EventListener eventListener15 = null;
        boolean boolean16 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener15);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list19 = defaultBoxAndWhiskerCategoryDataset0.getOutliers((int) (byte) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(keyedObjects2D7);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNull(keyedObjects2D10);
        org.junit.Assert.assertNotNull(datasetGroup12);
        org.junit.Assert.assertNotNull(datasetGroup13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset8 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener9 = null;
        boolean boolean10 = defaultBoxAndWhiskerCategoryDataset8.hasListener(eventListener9);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset8.removeChangeListener(datasetChangeListener11);
        java.util.List list13 = defaultBoxAndWhiskerCategoryDataset8.getColumnKeys();
        int int15 = defaultBoxAndWhiskerCategoryDataset8.getRowIndex((java.lang.Comparable) (byte) 1);
        boolean boolean16 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset8);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener17 = null;
        defaultBoxAndWhiskerCategoryDataset8.addChangeListener(datasetChangeListener17);
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = defaultBoxAndWhiskerCategoryDataset8.data;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number22 = defaultBoxAndWhiskerCategoryDataset8.getQ3Value((int) '#', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNull(keyedObjects2D7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(keyedObjects2D19);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        java.util.EventListener eventListener5 = null;
        boolean boolean6 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener5);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D10 = defaultBoxAndWhiskerCategoryDataset0.data;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number13 = defaultBoxAndWhiskerCategoryDataset0.getMinOutlier((int) (short) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(keyedObjects2D7);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNull(keyedObjects2D10);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = defaultBoxAndWhiskerCategoryDataset0.data;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable7 = defaultBoxAndWhiskerCategoryDataset0.getColumnKey(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(keyedObjects2D5);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset8 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener9 = null;
        boolean boolean10 = defaultBoxAndWhiskerCategoryDataset8.hasListener(eventListener9);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset8.removeChangeListener(datasetChangeListener11);
        java.util.List list13 = defaultBoxAndWhiskerCategoryDataset8.getColumnKeys();
        int int15 = defaultBoxAndWhiskerCategoryDataset8.getRowIndex((java.lang.Comparable) (byte) 1);
        boolean boolean16 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset8);
        org.jfree.data.Range range18 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        double double20 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNull(keyedObjects2D7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        java.lang.Object obj10 = defaultBoxAndWhiskerCategoryDataset0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number13 = defaultBoxAndWhiskerCategoryDataset0.getMinRegularValue((int) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = defaultBoxAndWhiskerCategoryDataset0.data;
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.statistics.BoxAndWhiskerItem boxAndWhiskerItem9 = defaultBoxAndWhiskerCategoryDataset0.getItem((-1), 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(keyedObjects2D5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.Range range4 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = defaultBoxAndWhiskerCategoryDataset0.getQ1Value(0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = defaultBoxAndWhiskerCategoryDataset0.data;
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.general.DatasetChangeListener datasetChangeListener9 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener9);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener11);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list13 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(keyedObjects2D5);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNull(keyedObjects2D8);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable11 = defaultBoxAndWhiskerCategoryDataset0.getColumnKey((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 0L);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 1.0f);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener5);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener8);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset10 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D11 = null;
        defaultBoxAndWhiskerCategoryDataset10.data = keyedObjects2D11;
        org.jfree.data.KeyedObjects2D keyedObjects2D13 = null;
        defaultBoxAndWhiskerCategoryDataset10.data = keyedObjects2D13;
        java.util.EventListener eventListener15 = null;
        boolean boolean16 = defaultBoxAndWhiskerCategoryDataset10.hasListener(eventListener15);
        org.jfree.data.general.DatasetGroup datasetGroup17 = defaultBoxAndWhiskerCategoryDataset10.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup17);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(datasetGroup17);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        java.util.List list4 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        java.lang.Class<?> wildcardClass7 = defaultBoxAndWhiskerCategoryDataset0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        double double5 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable7 = defaultBoxAndWhiskerCategoryDataset0.getRowKey((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset8 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener9 = null;
        boolean boolean10 = defaultBoxAndWhiskerCategoryDataset8.hasListener(eventListener9);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset8.removeChangeListener(datasetChangeListener11);
        java.util.List list13 = defaultBoxAndWhiskerCategoryDataset8.getColumnKeys();
        int int15 = defaultBoxAndWhiskerCategoryDataset8.getRowIndex((java.lang.Comparable) (byte) 1);
        boolean boolean16 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset8);
        org.jfree.data.KeyedObjects2D keyedObjects2D17 = defaultBoxAndWhiskerCategoryDataset8.data;
        defaultBoxAndWhiskerCategoryDataset8.validateObject();
        org.jfree.data.Range range20 = defaultBoxAndWhiskerCategoryDataset8.getRangeBounds(false);
        double double22 = defaultBoxAndWhiskerCategoryDataset8.getRangeLowerBound(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number25 = defaultBoxAndWhiskerCategoryDataset8.getQ1Value((int) (short) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNull(keyedObjects2D7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(keyedObjects2D17);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10L);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (-1.0f));
        org.jfree.data.general.DatasetGroup datasetGroup7 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        java.lang.Object obj9 = defaultBoxAndWhiskerCategoryDataset0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = defaultBoxAndWhiskerCategoryDataset0.getMinRegularValue((java.lang.Comparable) (byte) 1, (java.lang.Comparable) 0.0f);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (1) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.Range range4 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        java.util.List list6 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        java.util.List list7 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(list7);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (short) 100);
        java.util.List list5 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable9 = defaultBoxAndWhiskerCategoryDataset0.getColumnKey((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) "hi!");
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        java.util.EventListener eventListener7 = null;
        boolean boolean8 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener7);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.statistics.BoxAndWhiskerItem boxAndWhiskerItem12 = defaultBoxAndWhiskerCategoryDataset0.getItem((int) (byte) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset8 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener9 = null;
        boolean boolean10 = defaultBoxAndWhiskerCategoryDataset8.hasListener(eventListener9);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset8.removeChangeListener(datasetChangeListener11);
        java.util.List list13 = defaultBoxAndWhiskerCategoryDataset8.getColumnKeys();
        int int15 = defaultBoxAndWhiskerCategoryDataset8.getRowIndex((java.lang.Comparable) (byte) 1);
        boolean boolean16 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset8);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener17 = null;
        defaultBoxAndWhiskerCategoryDataset8.addChangeListener(datasetChangeListener17);
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = defaultBoxAndWhiskerCategoryDataset8.data;
        java.util.List list20 = defaultBoxAndWhiskerCategoryDataset8.getRowKeys();
        int int21 = defaultBoxAndWhiskerCategoryDataset8.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number24 = defaultBoxAndWhiskerCategoryDataset8.getMeanValue((java.lang.Comparable) 100.0f, (java.lang.Comparable) 100.0d);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (100.0) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNull(keyedObjects2D7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(keyedObjects2D19);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        java.util.EventListener eventListener5 = null;
        boolean boolean6 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener5);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D10 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset11 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup12 = defaultBoxAndWhiskerCategoryDataset11.getGroup();
        org.jfree.data.general.DatasetGroup datasetGroup13 = defaultBoxAndWhiskerCategoryDataset11.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup13);
        org.jfree.data.Range range16 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list19 = defaultBoxAndWhiskerCategoryDataset0.getOutliers((int) (short) 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(keyedObjects2D7);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNull(keyedObjects2D10);
        org.junit.Assert.assertNotNull(datasetGroup12);
        org.junit.Assert.assertNotNull(datasetGroup13);
        org.junit.Assert.assertNotNull(range16);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        java.util.EventListener eventListener5 = null;
        boolean boolean6 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener5);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        double double11 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        double double13 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list16 = defaultBoxAndWhiskerCategoryDataset0.getOutliers((int) (byte) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(keyedObjects2D7);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetGroup datasetGroup3 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener4);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = defaultBoxAndWhiskerCategoryDataset0.getMinRegularValue((int) '4', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(datasetGroup3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        java.util.List list5 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number14 = defaultBoxAndWhiskerCategoryDataset0.getMeanValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 1);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (0) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        java.util.List list5 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        double double12 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        java.util.List list13 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number16 = defaultBoxAndWhiskerCategoryDataset0.getMinRegularValue((java.lang.Comparable) (byte) 100, (java.lang.Comparable) 0L);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (100) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number6 = defaultBoxAndWhiskerCategoryDataset0.getMaxOutlier(10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        java.util.List list7 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int10 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number13 = defaultBoxAndWhiskerCategoryDataset0.getValue((int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (short) 100);
        java.util.List list5 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        java.lang.Class<?> wildcardClass6 = list5.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 0L);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 1.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number7 = defaultBoxAndWhiskerCategoryDataset0.getValue((int) (short) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        java.util.List list4 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        int int9 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = defaultBoxAndWhiskerCategoryDataset0.getMinRegularValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (100) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        java.util.List list5 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener12);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list16 = defaultBoxAndWhiskerCategoryDataset0.getOutliers((java.lang.Comparable) 100.0f, (java.lang.Comparable) 1.0f);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (100.0) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        java.util.EventListener eventListener5 = null;
        boolean boolean6 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener5);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D10 = defaultBoxAndWhiskerCategoryDataset0.data;
        double double12 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number16 = defaultBoxAndWhiskerCategoryDataset0.getQ1Value((java.lang.Comparable) 1.0f, (java.lang.Comparable) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(keyedObjects2D7);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNull(keyedObjects2D10);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener4);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = defaultBoxAndWhiskerCategoryDataset0.getQ3Value((java.lang.Comparable) 100.0d, (java.lang.Comparable) ' ');
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (100.0) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        java.util.List list4 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        java.util.EventListener eventListener5 = null;
        boolean boolean6 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = defaultBoxAndWhiskerCategoryDataset0.getMaxOutlier((int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        java.util.EventListener eventListener5 = null;
        boolean boolean6 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener5);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D10 = defaultBoxAndWhiskerCategoryDataset0.data;
        double double12 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.statistics.BoxAndWhiskerItem boxAndWhiskerItem14 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultBoxAndWhiskerCategoryDataset0.add(boxAndWhiskerItem14, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(keyedObjects2D7);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNull(keyedObjects2D10);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        java.util.List list5 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener10);
        org.jfree.data.general.DatasetGroup datasetGroup12 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number15 = defaultBoxAndWhiskerCategoryDataset0.getValue((int) (byte) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(datasetGroup12);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        java.util.List list5 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = defaultBoxAndWhiskerCategoryDataset0.getMaxRegularValue(1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list5);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = defaultBoxAndWhiskerCategoryDataset0.getMinOutlier((int) (byte) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) Double.NaN);
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = defaultBoxAndWhiskerCategoryDataset0.data;
        java.util.List list9 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable11 = defaultBoxAndWhiskerCategoryDataset0.getRowKey((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(keyedObjects2D8);
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        java.util.List list4 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = defaultBoxAndWhiskerCategoryDataset0.getQ3Value((int) (byte) 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (short) 100);
        java.util.List list5 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.Range range9 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = defaultBoxAndWhiskerCategoryDataset0.getValue((int) '4', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(range9);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) "hi!");
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.general.DatasetGroup datasetGroup9 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        org.jfree.data.KeyedObjects2D keyedObjects2D10 = defaultBoxAndWhiskerCategoryDataset0.data;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number13 = defaultBoxAndWhiskerCategoryDataset0.getQ1Value((java.lang.Comparable) (-1.0d), (java.lang.Comparable) 10.0d);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (-1.0) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup9);
        org.junit.Assert.assertNotNull(keyedObjects2D10);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = defaultBoxAndWhiskerCategoryDataset0.data;
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 1.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable10 = defaultBoxAndWhiskerCategoryDataset0.getColumnKey((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(keyedObjects2D5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        java.util.List list5 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener10);
        double double13 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number16 = defaultBoxAndWhiskerCategoryDataset0.getMaxRegularValue((java.lang.Comparable) 10.0f, (java.lang.Comparable) 100.0d);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (10.0) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = defaultBoxAndWhiskerCategoryDataset0.getMaxOutlier((int) (byte) 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (short) 100);
        java.util.List list5 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = defaultBoxAndWhiskerCategoryDataset0.getQ1Value((int) (short) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(list5);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        java.lang.Object obj10 = defaultBoxAndWhiskerCategoryDataset0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable12 = defaultBoxAndWhiskerCategoryDataset0.getColumnKey((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        java.lang.Comparable comparable8 = null;
        int int9 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex(comparable8);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number13 = defaultBoxAndWhiskerCategoryDataset0.getMaxRegularValue(10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(keyedObjects2D7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (-1L));
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        java.util.List list8 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        java.util.List list9 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable11 = defaultBoxAndWhiskerCategoryDataset0.getColumnKey((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        java.util.List list4 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list9 = defaultBoxAndWhiskerCategoryDataset0.getOutliers((int) (byte) 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (short) 100);
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = defaultBoxAndWhiskerCategoryDataset0.getMedianValue(1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = defaultBoxAndWhiskerCategoryDataset0.getMinOutlier((int) 'a', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = defaultBoxAndWhiskerCategoryDataset0.data;
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset7 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup8 = defaultBoxAndWhiskerCategoryDataset7.getGroup();
        int int9 = defaultBoxAndWhiskerCategoryDataset7.getColumnCount();
        java.util.List list10 = defaultBoxAndWhiskerCategoryDataset7.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            defaultBoxAndWhiskerCategoryDataset0.add(list10, (java.lang.Comparable) "hi!", (java.lang.Comparable) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Range(double, double): require lower (Infinity) <= upper (-Infinity).");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(keyedObjects2D5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(datasetGroup8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        java.util.List list5 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        java.util.List list11 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number16 = defaultBoxAndWhiskerCategoryDataset0.getValue((int) (short) 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list11);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener6);
        java.util.List list8 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        org.jfree.data.general.DatasetGroup datasetGroup9 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int10 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number13 = defaultBoxAndWhiskerCategoryDataset0.getMaxOutlier((java.lang.Comparable) 'a', (java.lang.Comparable) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (a) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(keyedObjects2D5);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(datasetGroup9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        java.util.List list4 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = defaultBoxAndWhiskerCategoryDataset0.getMinOutlier((java.lang.Comparable) 0, (java.lang.Comparable) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (0) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10L);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup6 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = defaultBoxAndWhiskerCategoryDataset0.getValue(100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(datasetGroup6);
        org.junit.Assert.assertNotNull(keyedObjects2D7);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = defaultBoxAndWhiskerCategoryDataset0.data;
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 1.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = defaultBoxAndWhiskerCategoryDataset0.getQ3Value((int) (short) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(keyedObjects2D5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset8 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener9 = null;
        boolean boolean10 = defaultBoxAndWhiskerCategoryDataset8.hasListener(eventListener9);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset8.removeChangeListener(datasetChangeListener11);
        java.util.List list13 = defaultBoxAndWhiskerCategoryDataset8.getColumnKeys();
        int int15 = defaultBoxAndWhiskerCategoryDataset8.getRowIndex((java.lang.Comparable) (byte) 1);
        boolean boolean16 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset8);
        int int18 = defaultBoxAndWhiskerCategoryDataset8.getColumnIndex((java.lang.Comparable) (-1L));
        org.jfree.data.general.DatasetChangeListener datasetChangeListener19 = null;
        defaultBoxAndWhiskerCategoryDataset8.addChangeListener(datasetChangeListener19);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number23 = defaultBoxAndWhiskerCategoryDataset8.getValue((java.lang.Comparable) 10.0f, (java.lang.Comparable) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (10.0) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNull(keyedObjects2D7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) "hi!");
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.general.DatasetGroup datasetGroup9 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = defaultBoxAndWhiskerCategoryDataset0.getMinOutlier((java.lang.Comparable) ' ', (java.lang.Comparable) false);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key ( ) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup9);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10L);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) 10.0f);
        int int10 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) 100L);
        int int12 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number15 = defaultBoxAndWhiskerCategoryDataset0.getMaxRegularValue((java.lang.Comparable) (-1), (java.lang.Comparable) 0.0f);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (-1) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = defaultBoxAndWhiskerCategoryDataset0.data;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.statistics.BoxAndWhiskerItem boxAndWhiskerItem8 = defaultBoxAndWhiskerCategoryDataset0.getItem(0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(keyedObjects2D5);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10L);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.statistics.BoxAndWhiskerItem boxAndWhiskerItem7 = defaultBoxAndWhiskerCategoryDataset0.getItem(10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        java.util.List list5 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = defaultBoxAndWhiskerCategoryDataset0.getMeanValue((int) (byte) 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        java.util.List list5 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        double double12 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        java.util.List list13 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number16 = defaultBoxAndWhiskerCategoryDataset0.getMinRegularValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10.0d);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (0) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset8 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener9 = null;
        boolean boolean10 = defaultBoxAndWhiskerCategoryDataset8.hasListener(eventListener9);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset8.removeChangeListener(datasetChangeListener11);
        java.util.List list13 = defaultBoxAndWhiskerCategoryDataset8.getColumnKeys();
        int int15 = defaultBoxAndWhiskerCategoryDataset8.getRowIndex((java.lang.Comparable) (byte) 1);
        boolean boolean16 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset8);
        org.jfree.data.KeyedObjects2D keyedObjects2D17 = defaultBoxAndWhiskerCategoryDataset8.data;
        defaultBoxAndWhiskerCategoryDataset8.validateObject();
        int int20 = defaultBoxAndWhiskerCategoryDataset8.getRowIndex((java.lang.Comparable) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable22 = defaultBoxAndWhiskerCategoryDataset8.getRowKey((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNull(keyedObjects2D7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(keyedObjects2D17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = defaultBoxAndWhiskerCategoryDataset0.getQ1Value((int) 'a', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        java.lang.Comparable comparable6 = null;
        java.lang.Comparable comparable7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = defaultBoxAndWhiskerCategoryDataset0.getValue(comparable6, comparable7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'rowKey' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        double double8 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        double double10 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        java.util.List list11 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        java.util.List list12 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        double double14 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number17 = defaultBoxAndWhiskerCategoryDataset0.getMinRegularValue((int) (byte) 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset8 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener9 = null;
        boolean boolean10 = defaultBoxAndWhiskerCategoryDataset8.hasListener(eventListener9);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset8.removeChangeListener(datasetChangeListener11);
        java.util.List list13 = defaultBoxAndWhiskerCategoryDataset8.getColumnKeys();
        int int15 = defaultBoxAndWhiskerCategoryDataset8.getRowIndex((java.lang.Comparable) (byte) 1);
        boolean boolean16 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset8);
        int int18 = defaultBoxAndWhiskerCategoryDataset8.getColumnIndex((java.lang.Comparable) (-1L));
        org.jfree.data.general.DatasetChangeListener datasetChangeListener19 = null;
        defaultBoxAndWhiskerCategoryDataset8.addChangeListener(datasetChangeListener19);
        java.util.List list21 = defaultBoxAndWhiskerCategoryDataset8.getRowKeys();
        double double23 = defaultBoxAndWhiskerCategoryDataset8.getRangeUpperBound(false);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list26 = defaultBoxAndWhiskerCategoryDataset8.getOutliers((java.lang.Comparable) '4', (java.lang.Comparable) 0L);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (4) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNull(keyedObjects2D7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        double double8 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        double double10 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        java.util.List list11 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        int int13 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) 10.0d);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener14 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener14);
        double double17 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number20 = defaultBoxAndWhiskerCategoryDataset0.getQ1Value(0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.general.DatasetGroup datasetGroup7 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        java.lang.Class<?> wildcardClass8 = defaultBoxAndWhiskerCategoryDataset0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(datasetGroup7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) Double.NaN);
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.Range range10 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        org.jfree.data.general.DatasetGroup datasetGroup11 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        org.jfree.data.statistics.BoxAndWhiskerItem boxAndWhiskerItem12 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultBoxAndWhiskerCategoryDataset0.add(boxAndWhiskerItem12, (java.lang.Comparable) (short) 0, (java.lang.Comparable) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(keyedObjects2D8);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(datasetGroup11);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number7 = defaultBoxAndWhiskerCategoryDataset0.getMeanValue((int) (byte) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener3);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = defaultBoxAndWhiskerCategoryDataset0.getQ1Value((int) 'a', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        java.util.EventListener eventListener4 = null;
        boolean boolean5 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener4);
        java.util.List list6 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable8 = defaultBoxAndWhiskerCategoryDataset0.getRowKey((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(list6);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        java.util.List list3 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        java.util.List list4 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 1);
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 0L);
        int int9 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        java.util.List list7 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int10 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) '4');
        double double12 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        java.lang.Object obj13 = defaultBoxAndWhiskerCategoryDataset0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number16 = defaultBoxAndWhiskerCategoryDataset0.getMedianValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 10.0d);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (100.0) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset8 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener9 = null;
        boolean boolean10 = defaultBoxAndWhiskerCategoryDataset8.hasListener(eventListener9);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset8.removeChangeListener(datasetChangeListener11);
        java.util.List list13 = defaultBoxAndWhiskerCategoryDataset8.getColumnKeys();
        int int15 = defaultBoxAndWhiskerCategoryDataset8.getRowIndex((java.lang.Comparable) (byte) 1);
        boolean boolean16 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset8);
        int int18 = defaultBoxAndWhiskerCategoryDataset8.getColumnIndex((java.lang.Comparable) (-1L));
        org.jfree.data.general.DatasetChangeListener datasetChangeListener19 = null;
        defaultBoxAndWhiskerCategoryDataset8.removeChangeListener(datasetChangeListener19);
        java.lang.Comparable comparable21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number23 = defaultBoxAndWhiskerCategoryDataset8.getMinRegularValue(comparable21, (java.lang.Comparable) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'rowKey' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNull(keyedObjects2D7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        double double8 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        double double10 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        java.util.List list11 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        int int13 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) 10.0d);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener14 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener14);
        double double17 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number21 = defaultBoxAndWhiskerCategoryDataset0.getMaxRegularValue((int) (short) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener6);
        java.util.List list8 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        org.jfree.data.general.DatasetGroup datasetGroup9 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int10 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        int int12 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable14 = defaultBoxAndWhiskerCategoryDataset0.getColumnKey((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(keyedObjects2D5);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(datasetGroup9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset8 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener9 = null;
        boolean boolean10 = defaultBoxAndWhiskerCategoryDataset8.hasListener(eventListener9);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset8.removeChangeListener(datasetChangeListener11);
        java.util.List list13 = defaultBoxAndWhiskerCategoryDataset8.getColumnKeys();
        int int15 = defaultBoxAndWhiskerCategoryDataset8.getRowIndex((java.lang.Comparable) (byte) 1);
        boolean boolean16 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset8);
        int int18 = defaultBoxAndWhiskerCategoryDataset8.getColumnIndex((java.lang.Comparable) (-1L));
        org.jfree.data.general.DatasetChangeListener datasetChangeListener19 = null;
        defaultBoxAndWhiskerCategoryDataset8.removeChangeListener(datasetChangeListener19);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener21 = null;
        defaultBoxAndWhiskerCategoryDataset8.addChangeListener(datasetChangeListener21);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number25 = defaultBoxAndWhiskerCategoryDataset8.getQ1Value((java.lang.Comparable) 1.0f, (java.lang.Comparable) 100.0f);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (1.0) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNull(keyedObjects2D7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int1 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) '4');
        org.jfree.data.Range range6 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        java.util.EventListener eventListener7 = null;
        boolean boolean8 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = defaultBoxAndWhiskerCategoryDataset0.getValue((java.lang.Comparable) (byte) -1, (java.lang.Comparable) 1.0d);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (-1) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        java.util.EventListener eventListener5 = null;
        boolean boolean6 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener5);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener7);
        org.jfree.data.KeyedObjects2D keyedObjects2D9 = defaultBoxAndWhiskerCategoryDataset0.data;
        java.util.List list10 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list13 = defaultBoxAndWhiskerCategoryDataset0.getOutliers(10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(keyedObjects2D9);
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        java.util.List list5 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener10);
        org.jfree.data.KeyedObjects2D keyedObjects2D12 = defaultBoxAndWhiskerCategoryDataset0.data;
        java.lang.Comparable comparable14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list15 = defaultBoxAndWhiskerCategoryDataset0.getOutliers((java.lang.Comparable) 100.0f, comparable14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'columnKey' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(keyedObjects2D12);
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        java.util.EventListener eventListener5 = null;
        boolean boolean6 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener5);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number13 = defaultBoxAndWhiskerCategoryDataset0.getQ3Value((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(keyedObjects2D7);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        double double8 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        double double10 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        java.util.List list11 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        java.util.List list12 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        java.lang.Class<?> wildcardClass13 = list12.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        double double8 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        double double10 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        java.util.List list11 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        java.util.List list12 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.Range range14 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number17 = defaultBoxAndWhiskerCategoryDataset0.getValue((java.lang.Comparable) (-1), (java.lang.Comparable) '4');
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (-1) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(range14);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int1 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        java.util.EventListener eventListener4 = null;
        boolean boolean5 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener4);
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = defaultBoxAndWhiskerCategoryDataset0.getMinOutlier((int) ' ', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = defaultBoxAndWhiskerCategoryDataset0.data;
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        java.util.List list5 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset6 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int7 = defaultBoxAndWhiskerCategoryDataset6.getRowCount();
        int int8 = defaultBoxAndWhiskerCategoryDataset6.getColumnCount();
        int int10 = defaultBoxAndWhiskerCategoryDataset6.getRowIndex((java.lang.Comparable) '4');
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset6.addChangeListener(datasetChangeListener11);
        java.util.List list13 = defaultBoxAndWhiskerCategoryDataset6.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            defaultBoxAndWhiskerCategoryDataset0.add(list13, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Range(double, double): require lower (Infinity) <= upper (-Infinity).");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(keyedObjects2D1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10L);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        int int9 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 100.0d);
        java.util.List list10 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        org.jfree.data.Range range12 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        org.jfree.data.Range range14 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        org.jfree.data.general.DatasetGroup datasetGroup15 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener16 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener16);
        double double19 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number22 = defaultBoxAndWhiskerCategoryDataset0.getValue(1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertNotNull(datasetGroup15);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10L);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable7 = defaultBoxAndWhiskerCategoryDataset0.getColumnKey((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int1 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = defaultBoxAndWhiskerCategoryDataset0.data;
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.statistics.BoxAndWhiskerItem boxAndWhiskerItem9 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultBoxAndWhiskerCategoryDataset0.add(boxAndWhiskerItem9, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(keyedObjects2D5);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        java.util.List list5 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener12);
        org.jfree.data.Range range15 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number18 = defaultBoxAndWhiskerCategoryDataset0.getValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) "");
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (1) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(range15);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset8 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener9 = null;
        boolean boolean10 = defaultBoxAndWhiskerCategoryDataset8.hasListener(eventListener9);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset8.removeChangeListener(datasetChangeListener11);
        java.util.List list13 = defaultBoxAndWhiskerCategoryDataset8.getColumnKeys();
        int int15 = defaultBoxAndWhiskerCategoryDataset8.getRowIndex((java.lang.Comparable) (byte) 1);
        boolean boolean16 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset8);
        int int18 = defaultBoxAndWhiskerCategoryDataset8.getColumnIndex((java.lang.Comparable) (-1L));
        int int19 = defaultBoxAndWhiskerCategoryDataset8.getColumnCount();
        java.util.List list20 = defaultBoxAndWhiskerCategoryDataset8.getRowKeys();
        int int21 = defaultBoxAndWhiskerCategoryDataset8.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list24 = defaultBoxAndWhiskerCategoryDataset8.getOutliers((-1), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNull(keyedObjects2D7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        java.util.EventListener eventListener5 = null;
        boolean boolean6 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener5);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = defaultBoxAndWhiskerCategoryDataset0.getQ1Value((java.lang.Comparable) 0L, (java.lang.Comparable) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(keyedObjects2D7);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.statistics.BoxAndWhiskerItem boxAndWhiskerItem7 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultBoxAndWhiskerCategoryDataset0.add(boxAndWhiskerItem7, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (short) 100);
        java.lang.Object obj5 = defaultBoxAndWhiskerCategoryDataset0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = defaultBoxAndWhiskerCategoryDataset0.getQ1Value(0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (-1L));
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        java.util.EventListener eventListener8 = null;
        boolean boolean9 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener8);
        org.jfree.data.KeyedObjects2D keyedObjects2D10 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.general.DatasetGroup datasetGroup11 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(keyedObjects2D10);
        org.junit.Assert.assertNotNull(datasetGroup11);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        double double8 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        double double10 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        java.util.List list11 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        java.util.List list12 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        java.util.List list13 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        int int14 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number17 = defaultBoxAndWhiskerCategoryDataset0.getMaxOutlier((java.lang.Comparable) (-1L), (java.lang.Comparable) '4');
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (-1) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.Range range4 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = defaultBoxAndWhiskerCategoryDataset0.getValue((int) 'a', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.Range range4 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener6);
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        double double10 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset11 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D12 = null;
        defaultBoxAndWhiskerCategoryDataset11.data = keyedObjects2D12;
        org.jfree.data.KeyedObjects2D keyedObjects2D14 = null;
        defaultBoxAndWhiskerCategoryDataset11.data = keyedObjects2D14;
        java.util.EventListener eventListener16 = null;
        boolean boolean17 = defaultBoxAndWhiskerCategoryDataset11.hasListener(eventListener16);
        org.jfree.data.general.DatasetGroup datasetGroup18 = defaultBoxAndWhiskerCategoryDataset11.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup18);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number22 = defaultBoxAndWhiskerCategoryDataset0.getValue((java.lang.Comparable) 0L, (java.lang.Comparable) 100);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (0) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(datasetGroup18);
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = defaultBoxAndWhiskerCategoryDataset0.data;
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        java.util.List list7 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = defaultBoxAndWhiskerCategoryDataset0.data;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = defaultBoxAndWhiskerCategoryDataset0.getQ3Value((java.lang.Comparable) 1L, (java.lang.Comparable) 1.0d);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (1) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(keyedObjects2D5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(keyedObjects2D8);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int1 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number5 = defaultBoxAndWhiskerCategoryDataset0.getMeanValue((java.lang.Comparable) 10, (java.lang.Comparable) (-1.0f));
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (10) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        java.util.EventListener eventListener5 = null;
        boolean boolean6 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener5);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D10 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset11 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup12 = defaultBoxAndWhiskerCategoryDataset11.getGroup();
        org.jfree.data.general.DatasetGroup datasetGroup13 = defaultBoxAndWhiskerCategoryDataset11.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup13);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        // The following exception was thrown during execution in test generation
        try {
            int int17 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(keyedObjects2D7);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNull(keyedObjects2D10);
        org.junit.Assert.assertNotNull(datasetGroup12);
        org.junit.Assert.assertNotNull(datasetGroup13);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (-1L));
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        java.util.List list8 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = defaultBoxAndWhiskerCategoryDataset0.getMaxRegularValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (10.0) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D7;
        org.jfree.data.general.DatasetGroup datasetGroup9 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list12 = defaultBoxAndWhiskerCategoryDataset0.getOutliers((java.lang.Comparable) true, (java.lang.Comparable) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup9);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.KeyedObjects2D keyedObjects2D4 = defaultBoxAndWhiskerCategoryDataset0.data;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number7 = defaultBoxAndWhiskerCategoryDataset0.getMedianValue((java.lang.Comparable) 'a', (java.lang.Comparable) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(keyedObjects2D4);
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener4);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset6 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup7 = defaultBoxAndWhiskerCategoryDataset6.getGroup();
        int int8 = defaultBoxAndWhiskerCategoryDataset6.getColumnCount();
        java.util.List list9 = defaultBoxAndWhiskerCategoryDataset6.getRowKeys();
        java.util.List list10 = defaultBoxAndWhiskerCategoryDataset6.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            defaultBoxAndWhiskerCategoryDataset0.add(list10, (java.lang.Comparable) 100L, (java.lang.Comparable) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Range(double, double): require lower (Infinity) <= upper (-Infinity).");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(datasetGroup7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = defaultBoxAndWhiskerCategoryDataset0.getMaxRegularValue((java.lang.Comparable) (short) 10, (java.lang.Comparable) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (10) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 0L);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 1.0f);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener5);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener8);
        int int11 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number14 = defaultBoxAndWhiskerCategoryDataset0.getQ1Value((int) '4', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) 100.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = defaultBoxAndWhiskerCategoryDataset0.getMinRegularValue((java.lang.Comparable) (-1.0d), (java.lang.Comparable) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (-1.0) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        double double5 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.Range range9 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = defaultBoxAndWhiskerCategoryDataset0.getValue((java.lang.Comparable) 0.0f, (java.lang.Comparable) 10.0d);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (0.0) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(range9);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        java.util.List list7 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        java.util.EventListener eventListener9 = null;
        boolean boolean10 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number13 = defaultBoxAndWhiskerCategoryDataset0.getQ3Value((int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 0L);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 1.0f);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener5);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = defaultBoxAndWhiskerCategoryDataset0.getMeanValue((java.lang.Comparable) (byte) 100, (java.lang.Comparable) 100);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (100) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetGroup datasetGroup3 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        boolean boolean5 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) (byte) 1);
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) 0L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = defaultBoxAndWhiskerCategoryDataset0.getMaxOutlier((int) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(datasetGroup3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.Range range4 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener6);
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int9 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number13 = defaultBoxAndWhiskerCategoryDataset0.getMinOutlier((java.lang.Comparable) '4', (java.lang.Comparable) 100.0d);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (4) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        java.util.List list5 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        java.util.List list10 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number13 = defaultBoxAndWhiskerCategoryDataset0.getMinOutlier((java.lang.Comparable) 0L, (java.lang.Comparable) 1.0f);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (0) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = defaultBoxAndWhiskerCategoryDataset0.data;
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.general.DatasetChangeListener datasetChangeListener9 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener9);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number14 = defaultBoxAndWhiskerCategoryDataset0.getMinRegularValue((java.lang.Comparable) ' ', (java.lang.Comparable) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(keyedObjects2D5);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNull(keyedObjects2D8);
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D7;
        org.jfree.data.general.DatasetGroup datasetGroup9 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        org.jfree.data.statistics.BoxAndWhiskerItem boxAndWhiskerItem10 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultBoxAndWhiskerCategoryDataset0.add(boxAndWhiskerItem10, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup9);
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.Range range4 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener6);
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int9 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D10 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(keyedObjects2D10);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D7;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset9 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double11 = defaultBoxAndWhiskerCategoryDataset9.getRangeUpperBound(true);
        double double13 = defaultBoxAndWhiskerCategoryDataset9.getRangeLowerBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D14 = defaultBoxAndWhiskerCategoryDataset9.data;
        boolean boolean15 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset9);
        java.util.List list16 = defaultBoxAndWhiskerCategoryDataset9.getRowKeys();
        int int18 = defaultBoxAndWhiskerCategoryDataset9.getColumnIndex((java.lang.Comparable) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number21 = defaultBoxAndWhiskerCategoryDataset9.getQ1Value(100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNotNull(keyedObjects2D14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int1 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup2 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.Range range5 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = defaultBoxAndWhiskerCategoryDataset0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 'a');
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (0) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(datasetGroup2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(range5);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number4 = defaultBoxAndWhiskerCategoryDataset0.getValue((int) (byte) 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetGroup1);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        java.util.List list5 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener12);
        java.util.List list14 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list17 = defaultBoxAndWhiskerCategoryDataset0.getOutliers((int) (byte) 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int1 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) '4');
        org.jfree.data.Range range6 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        java.util.EventListener eventListener7 = null;
        boolean boolean8 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener7);
        org.jfree.data.statistics.BoxAndWhiskerItem boxAndWhiskerItem9 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultBoxAndWhiskerCategoryDataset0.add(boxAndWhiskerItem9, (java.lang.Comparable) 0, (java.lang.Comparable) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        java.util.List list5 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener10);
        org.jfree.data.KeyedObjects2D keyedObjects2D12 = defaultBoxAndWhiskerCategoryDataset0.data;
        java.util.List list13 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        double double15 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(keyedObjects2D12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset8 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener9 = null;
        boolean boolean10 = defaultBoxAndWhiskerCategoryDataset8.hasListener(eventListener9);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset8.removeChangeListener(datasetChangeListener11);
        java.util.List list13 = defaultBoxAndWhiskerCategoryDataset8.getColumnKeys();
        int int15 = defaultBoxAndWhiskerCategoryDataset8.getRowIndex((java.lang.Comparable) (byte) 1);
        boolean boolean16 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset8);
        int int18 = defaultBoxAndWhiskerCategoryDataset8.getColumnIndex((java.lang.Comparable) (-1L));
        int int19 = defaultBoxAndWhiskerCategoryDataset8.getColumnCount();
        defaultBoxAndWhiskerCategoryDataset8.validateObject();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number23 = defaultBoxAndWhiskerCategoryDataset8.getQ3Value((java.lang.Comparable) 10.0f, (java.lang.Comparable) 0L);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (10.0) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNull(keyedObjects2D7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 0L);
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number6 = defaultBoxAndWhiskerCategoryDataset0.getMinRegularValue((java.lang.Comparable) (-1.0d), (java.lang.Comparable) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (-1.0) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) Double.NaN);
        java.lang.Object obj6 = defaultBoxAndWhiskerCategoryDataset0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = defaultBoxAndWhiskerCategoryDataset0.getValue((int) (short) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int1 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number6 = defaultBoxAndWhiskerCategoryDataset0.getValue((int) 'a', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.Range range4 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener6);
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        double double10 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        java.util.List list12 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset13 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup14 = defaultBoxAndWhiskerCategoryDataset13.getGroup();
        double double16 = defaultBoxAndWhiskerCategoryDataset13.getRangeLowerBound(false);
        int int18 = defaultBoxAndWhiskerCategoryDataset13.getRowIndex((java.lang.Comparable) "hi!");
        int int19 = defaultBoxAndWhiskerCategoryDataset13.getColumnCount();
        int int21 = defaultBoxAndWhiskerCategoryDataset13.getColumnIndex((java.lang.Comparable) (byte) 10);
        java.util.List list22 = defaultBoxAndWhiskerCategoryDataset13.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            defaultBoxAndWhiskerCategoryDataset0.add(list22, (java.lang.Comparable) false, (java.lang.Comparable) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Range(double, double): require lower (Infinity) <= upper (-Infinity).");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(datasetGroup14);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(list22);
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10L);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        int int9 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 100.0d);
        java.util.List list10 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        org.jfree.data.Range range12 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        org.jfree.data.Range range14 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        org.jfree.data.Range range16 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        int int17 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        java.lang.Comparable comparable18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number20 = defaultBoxAndWhiskerCategoryDataset0.getMaxRegularValue(comparable18, (java.lang.Comparable) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'rowKey' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int1 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) '4');
        org.jfree.data.Range range6 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        java.util.EventListener eventListener7 = null;
        boolean boolean8 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = defaultBoxAndWhiskerCategoryDataset0.getMeanValue((-1), (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        java.util.EventListener eventListener5 = null;
        boolean boolean6 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener5);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D10 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset11 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup12 = defaultBoxAndWhiskerCategoryDataset11.getGroup();
        org.jfree.data.general.DatasetGroup datasetGroup13 = defaultBoxAndWhiskerCategoryDataset11.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup13);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.statistics.BoxAndWhiskerItem boxAndWhiskerItem17 = defaultBoxAndWhiskerCategoryDataset0.getItem((int) (byte) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(keyedObjects2D7);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNull(keyedObjects2D10);
        org.junit.Assert.assertNotNull(datasetGroup12);
        org.junit.Assert.assertNotNull(datasetGroup13);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (-1L));
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = defaultBoxAndWhiskerCategoryDataset0.getQ3Value((java.lang.Comparable) (short) 100, (java.lang.Comparable) ' ');
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (100) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset8 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener9 = null;
        boolean boolean10 = defaultBoxAndWhiskerCategoryDataset8.hasListener(eventListener9);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset8.removeChangeListener(datasetChangeListener11);
        java.util.List list13 = defaultBoxAndWhiskerCategoryDataset8.getColumnKeys();
        int int15 = defaultBoxAndWhiskerCategoryDataset8.getRowIndex((java.lang.Comparable) (byte) 1);
        boolean boolean16 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset8);
        org.jfree.data.Range range18 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number21 = defaultBoxAndWhiskerCategoryDataset0.getMaxOutlier((int) 'a', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNull(keyedObjects2D7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(range18);
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int1 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        java.util.EventListener eventListener4 = null;
        boolean boolean5 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener4);
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        int int9 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 'a');
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset10 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double12 = defaultBoxAndWhiskerCategoryDataset10.getRangeUpperBound(true);
        double double14 = defaultBoxAndWhiskerCategoryDataset10.getRangeLowerBound(true);
        java.util.EventListener eventListener15 = null;
        boolean boolean16 = defaultBoxAndWhiskerCategoryDataset10.hasListener(eventListener15);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener17 = null;
        defaultBoxAndWhiskerCategoryDataset10.addChangeListener(datasetChangeListener17);
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = defaultBoxAndWhiskerCategoryDataset10.data;
        java.util.List list20 = defaultBoxAndWhiskerCategoryDataset10.getColumnKeys();
        java.util.List list21 = defaultBoxAndWhiskerCategoryDataset10.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            defaultBoxAndWhiskerCategoryDataset0.add(list21, (java.lang.Comparable) (short) 100, (java.lang.Comparable) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Range(double, double): require lower (Infinity) <= upper (-Infinity).");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(keyedObjects2D19);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertNotNull(list21);
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10L);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) "hi!");
        org.jfree.data.statistics.BoxAndWhiskerItem boxAndWhiskerItem7 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultBoxAndWhiskerCategoryDataset0.add(boxAndWhiskerItem7, (java.lang.Comparable) 10.0f, (java.lang.Comparable) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset8 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener9 = null;
        boolean boolean10 = defaultBoxAndWhiskerCategoryDataset8.hasListener(eventListener9);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset8.removeChangeListener(datasetChangeListener11);
        java.util.List list13 = defaultBoxAndWhiskerCategoryDataset8.getColumnKeys();
        int int15 = defaultBoxAndWhiskerCategoryDataset8.getRowIndex((java.lang.Comparable) (byte) 1);
        boolean boolean16 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset8);
        int int18 = defaultBoxAndWhiskerCategoryDataset8.getColumnIndex((java.lang.Comparable) (-1L));
        int int19 = defaultBoxAndWhiskerCategoryDataset8.getColumnCount();
        defaultBoxAndWhiskerCategoryDataset8.validateObject();
        int int21 = defaultBoxAndWhiskerCategoryDataset8.getColumnCount();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset22 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup23 = defaultBoxAndWhiskerCategoryDataset22.getGroup();
        int int24 = defaultBoxAndWhiskerCategoryDataset22.getColumnCount();
        org.jfree.data.Range range26 = defaultBoxAndWhiskerCategoryDataset22.getRangeBounds(false);
        java.util.List list27 = defaultBoxAndWhiskerCategoryDataset22.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            defaultBoxAndWhiskerCategoryDataset8.add(list27, (java.lang.Comparable) true, (java.lang.Comparable) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Range(double, double): require lower (Infinity) <= upper (-Infinity).");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNull(keyedObjects2D7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(datasetGroup23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(list27);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        java.util.List list5 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        org.jfree.data.general.DatasetGroup datasetGroup6 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = defaultBoxAndWhiskerCategoryDataset0.getQ1Value((java.lang.Comparable) 100.0f, (java.lang.Comparable) "hi!");
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (100.0) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(datasetGroup6);
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) 100.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = defaultBoxAndWhiskerCategoryDataset0.getValue((java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0f);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (100) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = defaultBoxAndWhiskerCategoryDataset0.data;
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset9 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup10 = defaultBoxAndWhiskerCategoryDataset9.getGroup();
        int int11 = defaultBoxAndWhiskerCategoryDataset9.getColumnCount();
        org.jfree.data.general.DatasetGroup datasetGroup12 = defaultBoxAndWhiskerCategoryDataset9.getGroup();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener13 = null;
        defaultBoxAndWhiskerCategoryDataset9.removeChangeListener(datasetChangeListener13);
        org.jfree.data.general.DatasetGroup datasetGroup15 = defaultBoxAndWhiskerCategoryDataset9.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup15);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.general.DatasetGroup datasetGroup18 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list19 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(keyedObjects2D5);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNull(keyedObjects2D8);
        org.junit.Assert.assertNotNull(datasetGroup10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(datasetGroup12);
        org.junit.Assert.assertNotNull(datasetGroup15);
        org.junit.Assert.assertNotNull(datasetGroup18);
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        java.util.EventListener eventListener4 = null;
        boolean boolean5 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener4);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = defaultBoxAndWhiskerCategoryDataset0.getQ1Value((int) (byte) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10L);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup6 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset7 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double9 = defaultBoxAndWhiskerCategoryDataset7.getRangeUpperBound(true);
        double double11 = defaultBoxAndWhiskerCategoryDataset7.getRangeLowerBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D12 = defaultBoxAndWhiskerCategoryDataset7.data;
        org.jfree.data.general.DatasetChangeListener datasetChangeListener13 = null;
        defaultBoxAndWhiskerCategoryDataset7.addChangeListener(datasetChangeListener13);
        java.util.List list15 = defaultBoxAndWhiskerCategoryDataset7.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            defaultBoxAndWhiskerCategoryDataset0.add(list15, (java.lang.Comparable) 10.0d, (java.lang.Comparable) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Range(double, double): require lower (Infinity) <= upper (-Infinity).");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(datasetGroup6);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNotNull(keyedObjects2D12);
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        java.util.EventListener eventListener5 = null;
        boolean boolean6 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener5);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = defaultBoxAndWhiskerCategoryDataset0.getMaxRegularValue((java.lang.Comparable) 100.0f, (java.lang.Comparable) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset8 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener9 = null;
        boolean boolean10 = defaultBoxAndWhiskerCategoryDataset8.hasListener(eventListener9);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset8.removeChangeListener(datasetChangeListener11);
        java.util.List list13 = defaultBoxAndWhiskerCategoryDataset8.getColumnKeys();
        int int15 = defaultBoxAndWhiskerCategoryDataset8.getRowIndex((java.lang.Comparable) (byte) 1);
        boolean boolean16 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset8);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener17 = null;
        defaultBoxAndWhiskerCategoryDataset8.addChangeListener(datasetChangeListener17);
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = defaultBoxAndWhiskerCategoryDataset8.data;
        java.util.List list20 = defaultBoxAndWhiskerCategoryDataset8.getRowKeys();
        int int21 = defaultBoxAndWhiskerCategoryDataset8.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number24 = defaultBoxAndWhiskerCategoryDataset8.getMinRegularValue(100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNull(keyedObjects2D7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(keyedObjects2D19);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset8 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener9 = null;
        boolean boolean10 = defaultBoxAndWhiskerCategoryDataset8.hasListener(eventListener9);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset8.removeChangeListener(datasetChangeListener11);
        java.util.List list13 = defaultBoxAndWhiskerCategoryDataset8.getColumnKeys();
        int int15 = defaultBoxAndWhiskerCategoryDataset8.getRowIndex((java.lang.Comparable) (byte) 1);
        boolean boolean16 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset8);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener17 = null;
        defaultBoxAndWhiskerCategoryDataset8.addChangeListener(datasetChangeListener17);
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = defaultBoxAndWhiskerCategoryDataset8.data;
        int int21 = defaultBoxAndWhiskerCategoryDataset8.getColumnIndex((java.lang.Comparable) 1L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number24 = defaultBoxAndWhiskerCategoryDataset8.getQ3Value((int) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNull(keyedObjects2D7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(keyedObjects2D19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number7 = defaultBoxAndWhiskerCategoryDataset0.getMaxRegularValue((java.lang.Comparable) (byte) 1, (java.lang.Comparable) (-1.0d));
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (1) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(datasetGroup4);
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener5);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable10 = defaultBoxAndWhiskerCategoryDataset0.getColumnKey((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10L);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        int int9 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 100.0d);
        java.util.List list10 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        org.jfree.data.Range range12 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        org.jfree.data.Range range14 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        int int15 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number18 = defaultBoxAndWhiskerCategoryDataset0.getMinOutlier(10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset8 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener9 = null;
        boolean boolean10 = defaultBoxAndWhiskerCategoryDataset8.hasListener(eventListener9);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset8.removeChangeListener(datasetChangeListener11);
        java.util.List list13 = defaultBoxAndWhiskerCategoryDataset8.getColumnKeys();
        int int15 = defaultBoxAndWhiskerCategoryDataset8.getRowIndex((java.lang.Comparable) (byte) 1);
        boolean boolean16 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset8);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener17 = null;
        defaultBoxAndWhiskerCategoryDataset8.addChangeListener(datasetChangeListener17);
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = defaultBoxAndWhiskerCategoryDataset8.data;
        defaultBoxAndWhiskerCategoryDataset8.validateObject();
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNull(keyedObjects2D7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(keyedObjects2D19);
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset8 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener9 = null;
        boolean boolean10 = defaultBoxAndWhiskerCategoryDataset8.hasListener(eventListener9);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset8.removeChangeListener(datasetChangeListener11);
        java.util.List list13 = defaultBoxAndWhiskerCategoryDataset8.getColumnKeys();
        int int15 = defaultBoxAndWhiskerCategoryDataset8.getRowIndex((java.lang.Comparable) (byte) 1);
        boolean boolean16 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset8);
        org.jfree.data.KeyedObjects2D keyedObjects2D17 = defaultBoxAndWhiskerCategoryDataset8.data;
        defaultBoxAndWhiskerCategoryDataset8.validateObject();
        org.jfree.data.Range range20 = defaultBoxAndWhiskerCategoryDataset8.getRangeBounds(false);
        double double22 = defaultBoxAndWhiskerCategoryDataset8.getRangeLowerBound(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number25 = defaultBoxAndWhiskerCategoryDataset8.getMaxRegularValue((int) (byte) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNull(keyedObjects2D7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(keyedObjects2D17);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset8 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener9 = null;
        boolean boolean10 = defaultBoxAndWhiskerCategoryDataset8.hasListener(eventListener9);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset8.removeChangeListener(datasetChangeListener11);
        java.util.List list13 = defaultBoxAndWhiskerCategoryDataset8.getColumnKeys();
        int int15 = defaultBoxAndWhiskerCategoryDataset8.getRowIndex((java.lang.Comparable) (byte) 1);
        boolean boolean16 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset8);
        org.jfree.data.KeyedObjects2D keyedObjects2D17 = defaultBoxAndWhiskerCategoryDataset8.data;
        defaultBoxAndWhiskerCategoryDataset8.validateObject();
        double double20 = defaultBoxAndWhiskerCategoryDataset8.getRangeUpperBound(true);
        int int21 = defaultBoxAndWhiskerCategoryDataset8.getColumnCount();
        int int23 = defaultBoxAndWhiskerCategoryDataset8.getRowIndex((java.lang.Comparable) '#');
        java.util.List list24 = defaultBoxAndWhiskerCategoryDataset8.getRowKeys();
        int int25 = defaultBoxAndWhiskerCategoryDataset8.getRowCount();
        boolean boolean27 = defaultBoxAndWhiskerCategoryDataset8.equals((java.lang.Object) 0);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener28 = null;
        defaultBoxAndWhiskerCategoryDataset8.addChangeListener(datasetChangeListener28);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset30 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double32 = defaultBoxAndWhiskerCategoryDataset30.getRangeUpperBound(true);
        double double34 = defaultBoxAndWhiskerCategoryDataset30.getRangeLowerBound(true);
        java.util.List list35 = defaultBoxAndWhiskerCategoryDataset30.getColumnKeys();
        java.lang.Comparable comparable37 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultBoxAndWhiskerCategoryDataset8.add(list35, (java.lang.Comparable) 100.0f, comparable37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'columnKey' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNull(keyedObjects2D7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(keyedObjects2D17);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertNotNull(list35);
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener4);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        java.util.EventListener eventListener7 = null;
        boolean boolean8 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = defaultBoxAndWhiskerCategoryDataset0.getQ1Value((int) (byte) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 0L);
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number6 = defaultBoxAndWhiskerCategoryDataset0.getMinRegularValue((java.lang.Comparable) (short) 10, (java.lang.Comparable) true);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (10) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.Range range7 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        java.lang.Comparable comparable9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list10 = defaultBoxAndWhiskerCategoryDataset0.getOutliers((java.lang.Comparable) (short) 100, comparable9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'columnKey' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(range7);
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        boolean boolean4 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) 100L);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener5);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.statistics.BoxAndWhiskerItem boxAndWhiskerItem9 = defaultBoxAndWhiskerCategoryDataset0.getItem((int) (short) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener6);
        java.util.List list8 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        org.jfree.data.general.DatasetGroup datasetGroup9 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int10 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        int int12 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number15 = defaultBoxAndWhiskerCategoryDataset0.getMedianValue((int) (short) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(keyedObjects2D5);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(datasetGroup9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset8 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener9 = null;
        boolean boolean10 = defaultBoxAndWhiskerCategoryDataset8.hasListener(eventListener9);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset8.removeChangeListener(datasetChangeListener11);
        java.util.List list13 = defaultBoxAndWhiskerCategoryDataset8.getColumnKeys();
        int int15 = defaultBoxAndWhiskerCategoryDataset8.getRowIndex((java.lang.Comparable) (byte) 1);
        boolean boolean16 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset8);
        org.jfree.data.KeyedObjects2D keyedObjects2D17 = defaultBoxAndWhiskerCategoryDataset8.data;
        defaultBoxAndWhiskerCategoryDataset8.validateObject();
        double double20 = defaultBoxAndWhiskerCategoryDataset8.getRangeUpperBound(true);
        int int21 = defaultBoxAndWhiskerCategoryDataset8.getColumnCount();
        int int23 = defaultBoxAndWhiskerCategoryDataset8.getRowIndex((java.lang.Comparable) '#');
        java.util.List list24 = defaultBoxAndWhiskerCategoryDataset8.getRowKeys();
        int int25 = defaultBoxAndWhiskerCategoryDataset8.getRowCount();
        boolean boolean27 = defaultBoxAndWhiskerCategoryDataset8.equals((java.lang.Object) 0);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener28 = null;
        defaultBoxAndWhiskerCategoryDataset8.addChangeListener(datasetChangeListener28);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number32 = defaultBoxAndWhiskerCategoryDataset8.getQ3Value((int) '#', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNull(keyedObjects2D7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(keyedObjects2D17);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) "hi!");
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.general.DatasetGroup datasetGroup9 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        org.jfree.data.KeyedObjects2D keyedObjects2D10 = defaultBoxAndWhiskerCategoryDataset0.data;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number13 = defaultBoxAndWhiskerCategoryDataset0.getQ1Value((int) (byte) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup9);
        org.junit.Assert.assertNotNull(keyedObjects2D10);
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int1 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup2 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list5 = defaultBoxAndWhiskerCategoryDataset0.getOutliers((int) (byte) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(datasetGroup2);
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = defaultBoxAndWhiskerCategoryDataset0.data;
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset9 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup10 = defaultBoxAndWhiskerCategoryDataset9.getGroup();
        int int11 = defaultBoxAndWhiskerCategoryDataset9.getColumnCount();
        org.jfree.data.general.DatasetGroup datasetGroup12 = defaultBoxAndWhiskerCategoryDataset9.getGroup();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener13 = null;
        defaultBoxAndWhiskerCategoryDataset9.removeChangeListener(datasetChangeListener13);
        org.jfree.data.general.DatasetGroup datasetGroup15 = defaultBoxAndWhiskerCategoryDataset9.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup15);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        java.util.EventListener eventListener18 = null;
        boolean boolean19 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener18);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number22 = defaultBoxAndWhiskerCategoryDataset0.getMinRegularValue((int) (byte) 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(keyedObjects2D5);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNull(keyedObjects2D8);
        org.junit.Assert.assertNotNull(datasetGroup10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(datasetGroup12);
        org.junit.Assert.assertNotNull(datasetGroup15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.Range range7 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = defaultBoxAndWhiskerCategoryDataset0.getMinRegularValue((int) (byte) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        java.util.EventListener eventListener5 = null;
        boolean boolean6 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener5);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D10 = defaultBoxAndWhiskerCategoryDataset0.data;
        double double12 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        double double14 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number17 = defaultBoxAndWhiskerCategoryDataset0.getQ1Value((java.lang.Comparable) (byte) 10, (java.lang.Comparable) Double.NaN);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(keyedObjects2D7);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNull(keyedObjects2D10);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.Range range4 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener6);
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        double double10 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.general.DatasetGroup datasetGroup12 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number15 = defaultBoxAndWhiskerCategoryDataset0.getMaxOutlier((int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(datasetGroup12);
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) Double.NaN);
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = defaultBoxAndWhiskerCategoryDataset0.data;
        java.util.List list9 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        java.util.EventListener eventListener10 = null;
        boolean boolean11 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number14 = defaultBoxAndWhiskerCategoryDataset0.getMinOutlier((int) (short) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(keyedObjects2D8);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int1 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) '4');
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener5);
        java.util.List list7 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.statistics.BoxAndWhiskerItem boxAndWhiskerItem10 = defaultBoxAndWhiskerCategoryDataset0.getItem(0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(list7);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.lang.Object obj1 = defaultBoxAndWhiskerCategoryDataset0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number4 = defaultBoxAndWhiskerCategoryDataset0.getMedianValue((int) (byte) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        double double8 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        double double10 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number13 = defaultBoxAndWhiskerCategoryDataset0.getValue(100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        java.util.EventListener eventListener5 = null;
        boolean boolean6 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener5);
        org.jfree.data.general.DatasetGroup datasetGroup7 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        org.jfree.data.Range range9 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable11 = defaultBoxAndWhiskerCategoryDataset0.getRowKey((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(datasetGroup7);
        org.junit.Assert.assertNotNull(range9);
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        java.util.List list7 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int10 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) '4');
        double double12 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.statistics.BoxAndWhiskerItem boxAndWhiskerItem15 = defaultBoxAndWhiskerCategoryDataset0.getItem(1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10L);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup6 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        java.lang.Object obj8 = defaultBoxAndWhiskerCategoryDataset0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = defaultBoxAndWhiskerCategoryDataset0.getValue((java.lang.Comparable) (byte) 100, (java.lang.Comparable) 1.0f);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (100) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(datasetGroup6);
        org.junit.Assert.assertNotNull(keyedObjects2D7);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) Double.NaN);
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = defaultBoxAndWhiskerCategoryDataset0.data;
        java.util.List list9 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = defaultBoxAndWhiskerCategoryDataset0.getValue(0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(keyedObjects2D8);
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 0L);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 1.0f);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener5);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener8);
        int int11 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number14 = defaultBoxAndWhiskerCategoryDataset0.getMeanValue((int) (byte) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = defaultBoxAndWhiskerCategoryDataset0.data;
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = defaultBoxAndWhiskerCategoryDataset0.data;
        java.util.EventListener eventListener9 = null;
        boolean boolean10 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener9);
        double double12 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number15 = defaultBoxAndWhiskerCategoryDataset0.getMaxOutlier((int) (short) 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(keyedObjects2D5);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNull(keyedObjects2D8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10L);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup6 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = defaultBoxAndWhiskerCategoryDataset0.getQ1Value(0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(datasetGroup6);
        org.junit.Assert.assertNotNull(keyedObjects2D7);
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.Range range4 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number7 = defaultBoxAndWhiskerCategoryDataset0.getMinOutlier((java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (-1.0) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(range4);
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10L);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.KeyedObjects2D keyedObjects2D10 = defaultBoxAndWhiskerCategoryDataset0.data;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable12 = defaultBoxAndWhiskerCategoryDataset0.getRowKey((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(keyedObjects2D10);
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = defaultBoxAndWhiskerCategoryDataset0.getMaxRegularValue((java.lang.Comparable) (short) -1, (java.lang.Comparable) 100.0f);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (-1) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        java.util.List list4 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset5 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = null;
        defaultBoxAndWhiskerCategoryDataset5.data = keyedObjects2D6;
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = null;
        defaultBoxAndWhiskerCategoryDataset5.data = keyedObjects2D8;
        java.util.EventListener eventListener10 = null;
        boolean boolean11 = defaultBoxAndWhiskerCategoryDataset5.hasListener(eventListener10);
        boolean boolean12 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) eventListener10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 0L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = defaultBoxAndWhiskerCategoryDataset0.getQ3Value((int) (short) 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        java.util.List list4 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener5);
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.Range range9 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(range9);
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        java.util.List list5 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.statistics.BoxAndWhiskerItem boxAndWhiskerItem10 = defaultBoxAndWhiskerCategoryDataset0.getItem((int) (short) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.KeyedObjects2D keyedObjects2D4 = defaultBoxAndWhiskerCategoryDataset0.data;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(keyedObjects2D4);
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.statistics.BoxAndWhiskerItem boxAndWhiskerItem9 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultBoxAndWhiskerCategoryDataset0.add(boxAndWhiskerItem9, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(keyedObjects2D7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        java.util.List list5 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener10);
        org.jfree.data.KeyedObjects2D keyedObjects2D12 = defaultBoxAndWhiskerCategoryDataset0.data;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable14 = defaultBoxAndWhiskerCategoryDataset0.getColumnKey((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(keyedObjects2D12);
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetGroup datasetGroup3 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener4);
        org.jfree.data.general.DatasetGroup datasetGroup6 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        java.util.EventListener eventListener7 = null;
        boolean boolean8 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = defaultBoxAndWhiskerCategoryDataset0.getMaxOutlier((int) '4', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(datasetGroup3);
        org.junit.Assert.assertNotNull(datasetGroup6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        java.lang.Object obj10 = defaultBoxAndWhiskerCategoryDataset0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number13 = defaultBoxAndWhiskerCategoryDataset0.getMinRegularValue((int) (byte) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number7 = defaultBoxAndWhiskerCategoryDataset0.getMinRegularValue((java.lang.Comparable) 10.0f, (java.lang.Comparable) 10);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (10.0) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset8 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener9 = null;
        boolean boolean10 = defaultBoxAndWhiskerCategoryDataset8.hasListener(eventListener9);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset8.removeChangeListener(datasetChangeListener11);
        java.util.List list13 = defaultBoxAndWhiskerCategoryDataset8.getColumnKeys();
        int int15 = defaultBoxAndWhiskerCategoryDataset8.getRowIndex((java.lang.Comparable) (byte) 1);
        boolean boolean16 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset8);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener17 = null;
        defaultBoxAndWhiskerCategoryDataset8.removeChangeListener(datasetChangeListener17);
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = defaultBoxAndWhiskerCategoryDataset8.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset20 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double22 = defaultBoxAndWhiskerCategoryDataset20.getRangeUpperBound(true);
        double double24 = defaultBoxAndWhiskerCategoryDataset20.getRangeLowerBound(true);
        double double26 = defaultBoxAndWhiskerCategoryDataset20.getRangeLowerBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D27 = defaultBoxAndWhiskerCategoryDataset20.data;
        java.lang.Comparable comparable28 = null;
        int int29 = defaultBoxAndWhiskerCategoryDataset20.getRowIndex(comparable28);
        defaultBoxAndWhiskerCategoryDataset20.validateObject();
        java.util.List list31 = defaultBoxAndWhiskerCategoryDataset20.getColumnKeys();
        java.lang.Comparable comparable32 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultBoxAndWhiskerCategoryDataset8.add(list31, comparable32, (java.lang.Comparable) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'rowKey' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNull(keyedObjects2D7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(keyedObjects2D19);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertNotNull(keyedObjects2D27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(list31);
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10L);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) '4');
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset8 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener9 = null;
        boolean boolean10 = defaultBoxAndWhiskerCategoryDataset8.hasListener(eventListener9);
        int int12 = defaultBoxAndWhiskerCategoryDataset8.getRowIndex((java.lang.Comparable) 10L);
        int int13 = defaultBoxAndWhiskerCategoryDataset8.getRowCount();
        int int14 = defaultBoxAndWhiskerCategoryDataset8.getColumnCount();
        int int15 = defaultBoxAndWhiskerCategoryDataset8.getColumnCount();
        int int17 = defaultBoxAndWhiskerCategoryDataset8.getRowIndex((java.lang.Comparable) 100.0d);
        java.util.List list18 = defaultBoxAndWhiskerCategoryDataset8.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            defaultBoxAndWhiskerCategoryDataset0.add(list18, (java.lang.Comparable) (short) 100, (java.lang.Comparable) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Range(double, double): require lower (Infinity) <= upper (-Infinity).");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(list18);
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10L);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) 10.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D9 = defaultBoxAndWhiskerCategoryDataset0.data;
        int int11 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) '4');
        java.util.List list12 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number15 = defaultBoxAndWhiskerCategoryDataset0.getMaxOutlier((int) (byte) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(keyedObjects2D9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset8 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener9 = null;
        boolean boolean10 = defaultBoxAndWhiskerCategoryDataset8.hasListener(eventListener9);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset8.removeChangeListener(datasetChangeListener11);
        java.util.List list13 = defaultBoxAndWhiskerCategoryDataset8.getColumnKeys();
        int int15 = defaultBoxAndWhiskerCategoryDataset8.getRowIndex((java.lang.Comparable) (byte) 1);
        boolean boolean16 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset8);
        org.jfree.data.KeyedObjects2D keyedObjects2D17 = defaultBoxAndWhiskerCategoryDataset8.data;
        defaultBoxAndWhiskerCategoryDataset8.validateObject();
        double double20 = defaultBoxAndWhiskerCategoryDataset8.getRangeUpperBound(true);
        int int21 = defaultBoxAndWhiskerCategoryDataset8.getColumnCount();
        int int23 = defaultBoxAndWhiskerCategoryDataset8.getRowIndex((java.lang.Comparable) '#');
        java.util.List list24 = defaultBoxAndWhiskerCategoryDataset8.getRowKeys();
        int int25 = defaultBoxAndWhiskerCategoryDataset8.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D26 = defaultBoxAndWhiskerCategoryDataset8.data;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number29 = defaultBoxAndWhiskerCategoryDataset8.getValue((java.lang.Comparable) 1.0d, (java.lang.Comparable) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (1.0) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNull(keyedObjects2D7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(keyedObjects2D17);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(keyedObjects2D26);
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset8 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener9 = null;
        boolean boolean10 = defaultBoxAndWhiskerCategoryDataset8.hasListener(eventListener9);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset8.removeChangeListener(datasetChangeListener11);
        java.util.List list13 = defaultBoxAndWhiskerCategoryDataset8.getColumnKeys();
        int int15 = defaultBoxAndWhiskerCategoryDataset8.getRowIndex((java.lang.Comparable) (byte) 1);
        boolean boolean16 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset8);
        int int18 = defaultBoxAndWhiskerCategoryDataset8.getColumnIndex((java.lang.Comparable) (-1L));
        int int19 = defaultBoxAndWhiskerCategoryDataset8.getColumnCount();
        int int20 = defaultBoxAndWhiskerCategoryDataset8.getColumnCount();
        org.jfree.data.general.DatasetGroup datasetGroup21 = defaultBoxAndWhiskerCategoryDataset8.getGroup();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number24 = defaultBoxAndWhiskerCategoryDataset8.getMinRegularValue((int) (byte) 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNull(keyedObjects2D7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(datasetGroup21);
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        org.jfree.data.general.DatasetGroup datasetGroup2 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number6 = defaultBoxAndWhiskerCategoryDataset0.getMinOutlier((java.lang.Comparable) 100.0f, (java.lang.Comparable) 100.0d);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (100.0) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertNotNull(datasetGroup2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset8 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener9 = null;
        boolean boolean10 = defaultBoxAndWhiskerCategoryDataset8.hasListener(eventListener9);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset8.removeChangeListener(datasetChangeListener11);
        java.util.List list13 = defaultBoxAndWhiskerCategoryDataset8.getColumnKeys();
        int int15 = defaultBoxAndWhiskerCategoryDataset8.getRowIndex((java.lang.Comparable) (byte) 1);
        boolean boolean16 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset8);
        org.jfree.data.KeyedObjects2D keyedObjects2D17 = defaultBoxAndWhiskerCategoryDataset8.data;
        defaultBoxAndWhiskerCategoryDataset8.validateObject();
        double double20 = defaultBoxAndWhiskerCategoryDataset8.getRangeUpperBound(true);
        int int21 = defaultBoxAndWhiskerCategoryDataset8.getColumnCount();
        int int23 = defaultBoxAndWhiskerCategoryDataset8.getRowIndex((java.lang.Comparable) '#');
        java.util.List list24 = defaultBoxAndWhiskerCategoryDataset8.getRowKeys();
        int int25 = defaultBoxAndWhiskerCategoryDataset8.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number28 = defaultBoxAndWhiskerCategoryDataset8.getQ3Value((java.lang.Comparable) (byte) 0, (java.lang.Comparable) ' ');
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (0) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNull(keyedObjects2D7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(keyedObjects2D17);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int1 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10.0d);
        java.util.EventListener eventListener6 = null;
        boolean boolean7 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = defaultBoxAndWhiskerCategoryDataset0.getMaxRegularValue(100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        java.util.List list5 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        int int9 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = defaultBoxAndWhiskerCategoryDataset0.getValue((int) '#', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int1 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number6 = defaultBoxAndWhiskerCategoryDataset0.getMedianValue(1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        double double8 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        double double10 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        java.util.List list11 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        int int13 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) 10.0d);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset14 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int15 = defaultBoxAndWhiskerCategoryDataset14.getRowCount();
        int int16 = defaultBoxAndWhiskerCategoryDataset14.getColumnCount();
        java.util.List list17 = defaultBoxAndWhiskerCategoryDataset14.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            defaultBoxAndWhiskerCategoryDataset0.add(list17, (java.lang.Comparable) (-1.0f), (java.lang.Comparable) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Range(double, double): require lower (Infinity) <= upper (-Infinity).");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(list17);
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.general.DatasetGroup datasetGroup8 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = defaultBoxAndWhiskerCategoryDataset0.getQ1Value((int) ' ', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(datasetGroup8);
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        java.lang.Comparable comparable7 = null;
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex(comparable7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = defaultBoxAndWhiskerCategoryDataset0.getMaxOutlier((-1), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(datasetGroup4);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 0L);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 1.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number7 = defaultBoxAndWhiskerCategoryDataset0.getQ1Value((int) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset8 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener9 = null;
        boolean boolean10 = defaultBoxAndWhiskerCategoryDataset8.hasListener(eventListener9);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset8.removeChangeListener(datasetChangeListener11);
        java.util.List list13 = defaultBoxAndWhiskerCategoryDataset8.getColumnKeys();
        int int15 = defaultBoxAndWhiskerCategoryDataset8.getRowIndex((java.lang.Comparable) (byte) 1);
        boolean boolean16 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset8);
        java.util.EventListener eventListener17 = null;
        boolean boolean18 = defaultBoxAndWhiskerCategoryDataset8.hasListener(eventListener17);
        java.util.List list19 = defaultBoxAndWhiskerCategoryDataset8.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number22 = defaultBoxAndWhiskerCategoryDataset8.getValue((java.lang.Comparable) (byte) 1, (java.lang.Comparable) 0);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (1) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNull(keyedObjects2D7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(list19);
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(keyedObjects2D5);
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        double double8 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        double double10 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable14 = defaultBoxAndWhiskerCategoryDataset0.getRowKey((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        double double8 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = defaultBoxAndWhiskerCategoryDataset0.getMeanValue(10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = defaultBoxAndWhiskerCategoryDataset0.getMeanValue(10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10L);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        int int9 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 100.0d);
        java.util.List list10 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        org.jfree.data.Range range12 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        org.jfree.data.Range range14 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D15 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.general.DatasetChangeListener datasetChangeListener16 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener16);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener18 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener18);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertNotNull(keyedObjects2D15);
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10L);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        int int9 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 100.0d);
        java.util.List list10 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number13 = defaultBoxAndWhiskerCategoryDataset0.getQ1Value(0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int1 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        java.util.List list3 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset4 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double6 = defaultBoxAndWhiskerCategoryDataset4.getRangeUpperBound(true);
        defaultBoxAndWhiskerCategoryDataset4.validateObject();
        java.util.EventListener eventListener8 = null;
        boolean boolean9 = defaultBoxAndWhiskerCategoryDataset4.hasListener(eventListener8);
        java.util.List list10 = defaultBoxAndWhiskerCategoryDataset4.getColumnKeys();
        java.lang.Comparable comparable12 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultBoxAndWhiskerCategoryDataset0.add(list10, (java.lang.Comparable) 1.0d, comparable12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'columnKey' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.Range range4 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener6);
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int9 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        java.util.List list11 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.statistics.BoxAndWhiskerItem boxAndWhiskerItem14 = defaultBoxAndWhiskerCategoryDataset0.getItem((int) ' ', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(list11);
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10L);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) 10.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = defaultBoxAndWhiskerCategoryDataset0.getMinRegularValue((java.lang.Comparable) 100, (java.lang.Comparable) 1L);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (100) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D7;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset9 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double11 = defaultBoxAndWhiskerCategoryDataset9.getRangeUpperBound(true);
        double double13 = defaultBoxAndWhiskerCategoryDataset9.getRangeLowerBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D14 = defaultBoxAndWhiskerCategoryDataset9.data;
        boolean boolean15 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable17 = defaultBoxAndWhiskerCategoryDataset9.getRowKey((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNotNull(keyedObjects2D14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (-1L));
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        java.util.List list8 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        java.util.List list9 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = defaultBoxAndWhiskerCategoryDataset0.getMinRegularValue(0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        java.util.List list3 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        java.util.List list4 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = defaultBoxAndWhiskerCategoryDataset0.getMedianValue(1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset8 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener9 = null;
        boolean boolean10 = defaultBoxAndWhiskerCategoryDataset8.hasListener(eventListener9);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset8.removeChangeListener(datasetChangeListener11);
        java.util.List list13 = defaultBoxAndWhiskerCategoryDataset8.getColumnKeys();
        int int15 = defaultBoxAndWhiskerCategoryDataset8.getRowIndex((java.lang.Comparable) (byte) 1);
        boolean boolean16 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset8);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener17 = null;
        defaultBoxAndWhiskerCategoryDataset8.addChangeListener(datasetChangeListener17);
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = defaultBoxAndWhiskerCategoryDataset8.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset20 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double22 = defaultBoxAndWhiskerCategoryDataset20.getRangeUpperBound(true);
        double double24 = defaultBoxAndWhiskerCategoryDataset20.getRangeLowerBound(true);
        java.util.EventListener eventListener25 = null;
        boolean boolean26 = defaultBoxAndWhiskerCategoryDataset20.hasListener(eventListener25);
        int int27 = defaultBoxAndWhiskerCategoryDataset20.getRowCount();
        java.util.List list28 = defaultBoxAndWhiskerCategoryDataset20.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            defaultBoxAndWhiskerCategoryDataset8.add(list28, (java.lang.Comparable) 10.0d, (java.lang.Comparable) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Range(double, double): require lower (Infinity) <= upper (-Infinity).");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNull(keyedObjects2D7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(keyedObjects2D19);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(list28);
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener4);
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10L);
        int int9 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) 1L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable11 = defaultBoxAndWhiskerCategoryDataset0.getColumnKey((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        java.lang.Object obj5 = defaultBoxAndWhiskerCategoryDataset0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list8 = defaultBoxAndWhiskerCategoryDataset0.getOutliers((java.lang.Comparable) (byte) 0, (java.lang.Comparable) 0.0f);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (0) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetGroup datasetGroup3 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list8 = defaultBoxAndWhiskerCategoryDataset0.getOutliers((java.lang.Comparable) 10L, (java.lang.Comparable) 0.0f);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (10) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(datasetGroup3);
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.Range range4 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener6);
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener9 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener9);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.KeyedObjects2D keyedObjects2D4 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = defaultBoxAndWhiskerCategoryDataset0.getQ1Value((int) (byte) 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(keyedObjects2D4);
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset8 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener9 = null;
        boolean boolean10 = defaultBoxAndWhiskerCategoryDataset8.hasListener(eventListener9);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset8.removeChangeListener(datasetChangeListener11);
        java.util.List list13 = defaultBoxAndWhiskerCategoryDataset8.getColumnKeys();
        int int15 = defaultBoxAndWhiskerCategoryDataset8.getRowIndex((java.lang.Comparable) (byte) 1);
        boolean boolean16 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset8);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener17 = null;
        defaultBoxAndWhiskerCategoryDataset8.addChangeListener(datasetChangeListener17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number21 = defaultBoxAndWhiskerCategoryDataset8.getQ1Value((int) (byte) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNull(keyedObjects2D7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        double double5 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.Range range7 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = defaultBoxAndWhiskerCategoryDataset0.getValue((int) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.Range range4 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.Range range7 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(range7);
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        java.util.List list4 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.Range range6 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        double double8 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        org.jfree.data.statistics.BoxAndWhiskerItem boxAndWhiskerItem9 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultBoxAndWhiskerCategoryDataset0.add(boxAndWhiskerItem9, (java.lang.Comparable) 100.0d, (java.lang.Comparable) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        double double8 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        double double10 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        java.util.List list11 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        java.util.List list12 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        java.lang.Class<?> wildcardClass13 = list12.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = defaultBoxAndWhiskerCategoryDataset0.getValue((java.lang.Comparable) (byte) -1, (java.lang.Comparable) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener5);
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 1L);
        double double10 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number13 = defaultBoxAndWhiskerCategoryDataset0.getMaxRegularValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) (-1L));
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (10.0) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        java.util.List list7 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int10 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) '4');
        double double12 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        java.lang.Object obj13 = defaultBoxAndWhiskerCategoryDataset0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number16 = defaultBoxAndWhiskerCategoryDataset0.getMinRegularValue((java.lang.Comparable) 100, (java.lang.Comparable) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (100) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetGroup datasetGroup3 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        boolean boolean5 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) (byte) 1);
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) 0L);
        org.jfree.data.statistics.BoxAndWhiskerItem boxAndWhiskerItem8 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultBoxAndWhiskerCategoryDataset0.add(boxAndWhiskerItem8, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(datasetGroup3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        java.util.EventListener eventListener5 = null;
        boolean boolean6 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener5);
        org.jfree.data.general.DatasetGroup datasetGroup7 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list10 = defaultBoxAndWhiskerCategoryDataset0.getOutliers((java.lang.Comparable) (short) 0, (java.lang.Comparable) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(datasetGroup7);
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener4);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = defaultBoxAndWhiskerCategoryDataset0.getQ3Value((java.lang.Comparable) true, (java.lang.Comparable) 'a');
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (true) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener5);
        double double8 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable10 = defaultBoxAndWhiskerCategoryDataset0.getRowKey((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        java.util.EventListener eventListener5 = null;
        boolean boolean6 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener5);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener7);
        org.jfree.data.KeyedObjects2D keyedObjects2D9 = defaultBoxAndWhiskerCategoryDataset0.data;
        java.lang.Comparable comparable11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = defaultBoxAndWhiskerCategoryDataset0.getQ3Value((java.lang.Comparable) 100.0d, comparable11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'columnKey' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(keyedObjects2D9);
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        java.util.List list5 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = defaultBoxAndWhiskerCategoryDataset0.getMeanValue((java.lang.Comparable) 1L, (java.lang.Comparable) 1L);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (1) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(list5);
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int1 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup2 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number5 = defaultBoxAndWhiskerCategoryDataset0.getQ3Value(10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(datasetGroup2);
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = defaultBoxAndWhiskerCategoryDataset0.getMaxOutlier((java.lang.Comparable) 1.0f, (java.lang.Comparable) '4');
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (1.0) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener6);
        java.lang.Object obj8 = defaultBoxAndWhiskerCategoryDataset0.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.statistics.BoxAndWhiskerItem boxAndWhiskerItem11 = defaultBoxAndWhiskerCategoryDataset0.getItem((int) ' ', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(keyedObjects2D5);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list9 = defaultBoxAndWhiskerCategoryDataset0.getOutliers((int) (short) 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = defaultBoxAndWhiskerCategoryDataset0.data;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number6 = defaultBoxAndWhiskerCategoryDataset0.getQ1Value((int) (byte) 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(keyedObjects2D3);
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        java.util.EventListener eventListener5 = null;
        boolean boolean6 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener5);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D10 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset11 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup12 = defaultBoxAndWhiskerCategoryDataset11.getGroup();
        org.jfree.data.general.DatasetGroup datasetGroup13 = defaultBoxAndWhiskerCategoryDataset11.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number17 = defaultBoxAndWhiskerCategoryDataset0.getMaxOutlier((java.lang.Comparable) (-1.0d), (java.lang.Comparable) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(keyedObjects2D7);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNull(keyedObjects2D10);
        org.junit.Assert.assertNotNull(datasetGroup12);
        org.junit.Assert.assertNotNull(datasetGroup13);
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset8 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener9 = null;
        boolean boolean10 = defaultBoxAndWhiskerCategoryDataset8.hasListener(eventListener9);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset8.removeChangeListener(datasetChangeListener11);
        java.util.List list13 = defaultBoxAndWhiskerCategoryDataset8.getColumnKeys();
        int int15 = defaultBoxAndWhiskerCategoryDataset8.getRowIndex((java.lang.Comparable) (byte) 1);
        boolean boolean16 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset8);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener17 = null;
        defaultBoxAndWhiskerCategoryDataset8.addChangeListener(datasetChangeListener17);
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = defaultBoxAndWhiskerCategoryDataset8.data;
        java.util.List list20 = defaultBoxAndWhiskerCategoryDataset8.getRowKeys();
        java.lang.Object obj21 = defaultBoxAndWhiskerCategoryDataset8.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number24 = defaultBoxAndWhiskerCategoryDataset8.getQ1Value((java.lang.Comparable) (short) 10, (java.lang.Comparable) 100.0f);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (10) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNull(keyedObjects2D7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(keyedObjects2D19);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertNotNull(obj21);
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        java.util.EventListener eventListener4 = null;
        boolean boolean5 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener4);
        java.util.List list6 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 100L);
        java.util.List list9 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D10 = defaultBoxAndWhiskerCategoryDataset0.data;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number13 = defaultBoxAndWhiskerCategoryDataset0.getValue((java.lang.Comparable) '4', (java.lang.Comparable) 10);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (4) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(keyedObjects2D10);
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10L);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup6 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = defaultBoxAndWhiskerCategoryDataset0.getMeanValue(10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(datasetGroup6);
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset8 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener9 = null;
        boolean boolean10 = defaultBoxAndWhiskerCategoryDataset8.hasListener(eventListener9);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset8.removeChangeListener(datasetChangeListener11);
        java.util.List list13 = defaultBoxAndWhiskerCategoryDataset8.getColumnKeys();
        int int15 = defaultBoxAndWhiskerCategoryDataset8.getRowIndex((java.lang.Comparable) (byte) 1);
        boolean boolean16 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset8);
        org.jfree.data.KeyedObjects2D keyedObjects2D17 = defaultBoxAndWhiskerCategoryDataset8.data;
        java.util.List list18 = defaultBoxAndWhiskerCategoryDataset8.getRowKeys();
        int int20 = defaultBoxAndWhiskerCategoryDataset8.getColumnIndex((java.lang.Comparable) true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number23 = defaultBoxAndWhiskerCategoryDataset8.getMedianValue((java.lang.Comparable) 1L, (java.lang.Comparable) 100.0d);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (1) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNull(keyedObjects2D7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(keyedObjects2D17);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (-1L));
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        java.util.EventListener eventListener8 = null;
        boolean boolean9 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener8);
        org.jfree.data.KeyedObjects2D keyedObjects2D10 = defaultBoxAndWhiskerCategoryDataset0.data;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number13 = defaultBoxAndWhiskerCategoryDataset0.getValue((int) ' ', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(keyedObjects2D10);
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        java.util.List list4 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.Range range6 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = defaultBoxAndWhiskerCategoryDataset0.getValue((int) (byte) 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(range6);
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        java.util.List list4 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = defaultBoxAndWhiskerCategoryDataset0.getQ1Value((java.lang.Comparable) false, (java.lang.Comparable) (-1.0f));
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (false) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) Double.NaN);
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.Range range10 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        int int11 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number14 = defaultBoxAndWhiskerCategoryDataset0.getMeanValue((int) (short) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(keyedObjects2D8);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 0L);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 1.0f);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener5);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        int int9 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (short) 0);
        int int10 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        java.lang.Class<?> wildcardClass11 = defaultBoxAndWhiskerCategoryDataset0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset8 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener9 = null;
        boolean boolean10 = defaultBoxAndWhiskerCategoryDataset8.hasListener(eventListener9);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset8.removeChangeListener(datasetChangeListener11);
        java.util.List list13 = defaultBoxAndWhiskerCategoryDataset8.getColumnKeys();
        int int15 = defaultBoxAndWhiskerCategoryDataset8.getRowIndex((java.lang.Comparable) (byte) 1);
        boolean boolean16 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset8);
        org.jfree.data.KeyedObjects2D keyedObjects2D17 = defaultBoxAndWhiskerCategoryDataset8.data;
        defaultBoxAndWhiskerCategoryDataset8.validateObject();
        double double20 = defaultBoxAndWhiskerCategoryDataset8.getRangeUpperBound(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number23 = defaultBoxAndWhiskerCategoryDataset8.getValue((java.lang.Comparable) 10L, (java.lang.Comparable) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (10) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNull(keyedObjects2D7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(keyedObjects2D17);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) "hi!");
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.general.DatasetGroup datasetGroup9 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        org.jfree.data.KeyedObjects2D keyedObjects2D10 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset11 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener12 = null;
        boolean boolean13 = defaultBoxAndWhiskerCategoryDataset11.hasListener(eventListener12);
        int int15 = defaultBoxAndWhiskerCategoryDataset11.getRowIndex((java.lang.Comparable) 10L);
        int int16 = defaultBoxAndWhiskerCategoryDataset11.getRowCount();
        int int17 = defaultBoxAndWhiskerCategoryDataset11.getColumnCount();
        int int18 = defaultBoxAndWhiskerCategoryDataset11.getColumnCount();
        int int20 = defaultBoxAndWhiskerCategoryDataset11.getRowIndex((java.lang.Comparable) 100.0d);
        java.util.List list21 = defaultBoxAndWhiskerCategoryDataset11.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            defaultBoxAndWhiskerCategoryDataset0.add(list21, (java.lang.Comparable) 1L, (java.lang.Comparable) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Range(double, double): require lower (Infinity) <= upper (-Infinity).");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup9);
        org.junit.Assert.assertNotNull(keyedObjects2D10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(list21);
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        java.util.EventListener eventListener5 = null;
        boolean boolean6 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener5);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        java.util.EventListener eventListener8 = null;
        boolean boolean9 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener8);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.statistics.BoxAndWhiskerItem boxAndWhiskerItem12 = defaultBoxAndWhiskerCategoryDataset0.getItem((int) (short) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(keyedObjects2D7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = defaultBoxAndWhiskerCategoryDataset0.data;
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = defaultBoxAndWhiskerCategoryDataset0.data;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = defaultBoxAndWhiskerCategoryDataset0.getMinRegularValue((int) '#', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(keyedObjects2D5);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNull(keyedObjects2D8);
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        java.util.EventListener eventListener5 = null;
        boolean boolean6 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener5);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        double double11 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number14 = defaultBoxAndWhiskerCategoryDataset0.getMaxOutlier((java.lang.Comparable) (short) 1, (java.lang.Comparable) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(keyedObjects2D7);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        java.util.List list4 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) false);
        java.lang.Object obj8 = defaultBoxAndWhiskerCategoryDataset0.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.statistics.BoxAndWhiskerItem boxAndWhiskerItem11 = defaultBoxAndWhiskerCategoryDataset0.getItem(0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = defaultBoxAndWhiskerCategoryDataset0.data;
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable11 = defaultBoxAndWhiskerCategoryDataset0.getRowKey((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(keyedObjects2D5);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset8 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener9 = null;
        boolean boolean10 = defaultBoxAndWhiskerCategoryDataset8.hasListener(eventListener9);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset8.removeChangeListener(datasetChangeListener11);
        java.util.List list13 = defaultBoxAndWhiskerCategoryDataset8.getColumnKeys();
        int int15 = defaultBoxAndWhiskerCategoryDataset8.getRowIndex((java.lang.Comparable) (byte) 1);
        boolean boolean16 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset8);
        org.jfree.data.KeyedObjects2D keyedObjects2D17 = defaultBoxAndWhiskerCategoryDataset8.data;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number20 = defaultBoxAndWhiskerCategoryDataset8.getMinRegularValue(1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNull(keyedObjects2D7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(keyedObjects2D17);
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int1 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        java.util.List list3 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        java.lang.Class<?> wildcardClass4 = defaultBoxAndWhiskerCategoryDataset0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.Range range8 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = defaultBoxAndWhiskerCategoryDataset0.getValue((int) (byte) 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(range8);
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener4);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset6 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener7 = null;
        boolean boolean8 = defaultBoxAndWhiskerCategoryDataset6.hasListener(eventListener7);
        int int10 = defaultBoxAndWhiskerCategoryDataset6.getRowIndex((java.lang.Comparable) 10L);
        int int12 = defaultBoxAndWhiskerCategoryDataset6.getRowIndex((java.lang.Comparable) (-1.0f));
        org.jfree.data.general.DatasetGroup datasetGroup13 = defaultBoxAndWhiskerCategoryDataset6.getGroup();
        int int14 = defaultBoxAndWhiskerCategoryDataset6.getRowCount();
        boolean boolean15 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number18 = defaultBoxAndWhiskerCategoryDataset0.getValue((int) (byte) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) Double.NaN);
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = defaultBoxAndWhiskerCategoryDataset0.data;
        java.util.List list9 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = defaultBoxAndWhiskerCategoryDataset0.getQ3Value((java.lang.Comparable) (-1.0f), (java.lang.Comparable) 1.0d);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (-1.0) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(keyedObjects2D8);
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (-1L));
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        double double8 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = defaultBoxAndWhiskerCategoryDataset0.getQ1Value((int) (byte) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        java.util.List list5 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        int int11 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number14 = defaultBoxAndWhiskerCategoryDataset0.getQ1Value((int) (byte) 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int1 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = defaultBoxAndWhiskerCategoryDataset0.getMinRegularValue((int) '4', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10L);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.KeyedObjects2D keyedObjects2D10 = defaultBoxAndWhiskerCategoryDataset0.data;
        int int11 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list14 = defaultBoxAndWhiskerCategoryDataset0.getOutliers(10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(keyedObjects2D10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener4);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.Range range8 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = defaultBoxAndWhiskerCategoryDataset0.getQ3Value((int) (short) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(range8);
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10L);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.KeyedObjects2D keyedObjects2D10 = defaultBoxAndWhiskerCategoryDataset0.data;
        int int11 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        java.util.List list12 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        java.util.List list13 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list16 = defaultBoxAndWhiskerCategoryDataset0.getOutliers((java.lang.Comparable) (byte) 100, (java.lang.Comparable) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (100) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(keyedObjects2D10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        double double8 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.statistics.BoxAndWhiskerItem boxAndWhiskerItem11 = defaultBoxAndWhiskerCategoryDataset0.getItem((int) (byte) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.Range range4 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        java.util.List list5 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = defaultBoxAndWhiskerCategoryDataset0.data;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.statistics.BoxAndWhiskerItem boxAndWhiskerItem9 = defaultBoxAndWhiskerCategoryDataset0.getItem((int) '4', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(keyedObjects2D6);
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        java.util.List list5 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number15 = defaultBoxAndWhiskerCategoryDataset0.getQ1Value((java.lang.Comparable) 1.0d, (java.lang.Comparable) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (1.0) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        java.util.EventListener eventListener5 = null;
        boolean boolean6 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener5);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = defaultBoxAndWhiskerCategoryDataset0.getMeanValue((int) '#', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(keyedObjects2D7);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        java.util.EventListener eventListener5 = null;
        boolean boolean6 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener5);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D10 = defaultBoxAndWhiskerCategoryDataset0.data;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(keyedObjects2D7);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNull(keyedObjects2D10);
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.Range range4 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener6);
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int9 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        java.util.List list10 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        java.lang.Class<?> wildcardClass11 = defaultBoxAndWhiskerCategoryDataset0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int1 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = defaultBoxAndWhiskerCategoryDataset0.data;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = defaultBoxAndWhiskerCategoryDataset0.getValue((int) (byte) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(keyedObjects2D5);
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list9 = defaultBoxAndWhiskerCategoryDataset0.getOutliers((java.lang.Comparable) (byte) 1, (java.lang.Comparable) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = defaultBoxAndWhiskerCategoryDataset0.getMeanValue((java.lang.Comparable) 100L, (java.lang.Comparable) 'a');
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (100) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        java.util.EventListener eventListener5 = null;
        boolean boolean6 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener5);
        org.jfree.data.general.DatasetGroup datasetGroup7 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        org.jfree.data.Range range9 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        org.jfree.data.general.DatasetGroup datasetGroup10 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number13 = defaultBoxAndWhiskerCategoryDataset0.getMaxOutlier(0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(datasetGroup7);
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertNotNull(datasetGroup10);
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        java.util.EventListener eventListener5 = null;
        boolean boolean6 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener5);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = defaultBoxAndWhiskerCategoryDataset0.getMeanValue((int) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(keyedObjects2D7);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.Range range4 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener6);
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        double double10 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset11 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D12 = null;
        defaultBoxAndWhiskerCategoryDataset11.data = keyedObjects2D12;
        org.jfree.data.KeyedObjects2D keyedObjects2D14 = null;
        defaultBoxAndWhiskerCategoryDataset11.data = keyedObjects2D14;
        java.util.EventListener eventListener16 = null;
        boolean boolean17 = defaultBoxAndWhiskerCategoryDataset11.hasListener(eventListener16);
        org.jfree.data.general.DatasetGroup datasetGroup18 = defaultBoxAndWhiskerCategoryDataset11.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup18);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number22 = defaultBoxAndWhiskerCategoryDataset0.getMeanValue(0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(datasetGroup18);
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        org.jfree.data.general.DatasetGroup datasetGroup2 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.statistics.BoxAndWhiskerItem boxAndWhiskerItem4 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultBoxAndWhiskerCategoryDataset0.add(boxAndWhiskerItem4, (java.lang.Comparable) (byte) 1, (java.lang.Comparable) Double.NaN);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertNotNull(datasetGroup2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int10 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) 'a');
        org.jfree.data.Range range12 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        java.util.List list13 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list16 = defaultBoxAndWhiskerCategoryDataset0.getOutliers((java.lang.Comparable) 1.0d, (java.lang.Comparable) "");
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (1.0) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 0L);
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number6 = defaultBoxAndWhiskerCategoryDataset0.getMeanValue((java.lang.Comparable) 100L, (java.lang.Comparable) 1);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (100) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset8 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener9 = null;
        boolean boolean10 = defaultBoxAndWhiskerCategoryDataset8.hasListener(eventListener9);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset8.removeChangeListener(datasetChangeListener11);
        java.util.List list13 = defaultBoxAndWhiskerCategoryDataset8.getColumnKeys();
        int int15 = defaultBoxAndWhiskerCategoryDataset8.getRowIndex((java.lang.Comparable) (byte) 1);
        boolean boolean16 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset8);
        org.jfree.data.KeyedObjects2D keyedObjects2D17 = defaultBoxAndWhiskerCategoryDataset8.data;
        defaultBoxAndWhiskerCategoryDataset8.validateObject();
        double double20 = defaultBoxAndWhiskerCategoryDataset8.getRangeUpperBound(true);
        int int21 = defaultBoxAndWhiskerCategoryDataset8.getColumnCount();
        java.lang.Comparable comparable23 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number24 = defaultBoxAndWhiskerCategoryDataset8.getMaxRegularValue((java.lang.Comparable) 10L, comparable23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'columnKey' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNull(keyedObjects2D7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(keyedObjects2D17);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        double double8 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.statistics.BoxAndWhiskerItem boxAndWhiskerItem11 = defaultBoxAndWhiskerCategoryDataset0.getItem((-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.Range range4 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener6);
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = defaultBoxAndWhiskerCategoryDataset0.getMinRegularValue((int) '#', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (-1L));
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = defaultBoxAndWhiskerCategoryDataset0.getQ3Value((java.lang.Comparable) (short) 1, (java.lang.Comparable) true);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (1) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.Range range4 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener5);
        org.jfree.data.Range range8 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = defaultBoxAndWhiskerCategoryDataset0.getValue((java.lang.Comparable) 1.0f, (java.lang.Comparable) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (1.0) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertNotNull(range8);
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset8 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener9 = null;
        boolean boolean10 = defaultBoxAndWhiskerCategoryDataset8.hasListener(eventListener9);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset8.removeChangeListener(datasetChangeListener11);
        java.util.List list13 = defaultBoxAndWhiskerCategoryDataset8.getColumnKeys();
        int int15 = defaultBoxAndWhiskerCategoryDataset8.getRowIndex((java.lang.Comparable) (byte) 1);
        boolean boolean16 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset8);
        org.jfree.data.Range range18 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number21 = defaultBoxAndWhiskerCategoryDataset0.getQ3Value((java.lang.Comparable) '4', (java.lang.Comparable) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNull(keyedObjects2D7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(range18);
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset8 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener9 = null;
        boolean boolean10 = defaultBoxAndWhiskerCategoryDataset8.hasListener(eventListener9);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset8.removeChangeListener(datasetChangeListener11);
        java.util.List list13 = defaultBoxAndWhiskerCategoryDataset8.getColumnKeys();
        int int15 = defaultBoxAndWhiskerCategoryDataset8.getRowIndex((java.lang.Comparable) (byte) 1);
        boolean boolean16 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset8);
        org.jfree.data.Range range18 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        double double20 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number23 = defaultBoxAndWhiskerCategoryDataset0.getMaxOutlier((java.lang.Comparable) (short) 10, (java.lang.Comparable) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNull(keyedObjects2D7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) Double.NaN);
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = defaultBoxAndWhiskerCategoryDataset0.data;
        java.util.List list9 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        java.lang.Object obj10 = null;
        boolean boolean11 = defaultBoxAndWhiskerCategoryDataset0.equals(obj10);
        double double13 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number16 = defaultBoxAndWhiskerCategoryDataset0.getQ3Value((java.lang.Comparable) 0, (java.lang.Comparable) 100);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (0) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(keyedObjects2D8);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.Range range4 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        org.jfree.data.general.DatasetGroup datasetGroup5 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = defaultBoxAndWhiskerCategoryDataset0.getMaxOutlier((java.lang.Comparable) 100, (java.lang.Comparable) (-1.0f));
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (100) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertNotNull(datasetGroup5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10L);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        int int9 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 100.0d);
        java.util.List list10 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        org.jfree.data.Range range12 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        org.jfree.data.Range range14 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        org.jfree.data.general.DatasetGroup datasetGroup15 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        java.util.List list16 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number19 = defaultBoxAndWhiskerCategoryDataset0.getMinRegularValue((java.lang.Comparable) "hi!", (java.lang.Comparable) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (hi!) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertNotNull(datasetGroup15);
        org.junit.Assert.assertNotNull(list16);
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        java.util.List list4 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener5);
        org.jfree.data.general.DatasetGroup datasetGroup7 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        java.util.List list8 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = defaultBoxAndWhiskerCategoryDataset0.getValue((java.lang.Comparable) "", (java.lang.Comparable) "hi!");
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key () not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(datasetGroup7);
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) Double.NaN);
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.Range range10 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        int int11 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number14 = defaultBoxAndWhiskerCategoryDataset0.getMeanValue((int) (byte) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(keyedObjects2D8);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = defaultBoxAndWhiskerCategoryDataset0.data;
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.statistics.BoxAndWhiskerItem boxAndWhiskerItem4 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultBoxAndWhiskerCategoryDataset0.add(boxAndWhiskerItem4, (java.lang.Comparable) false, (java.lang.Comparable) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(keyedObjects2D1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        double double8 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        double double10 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        java.util.List list11 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        int int13 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) 10.0d);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener14 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener14);
        double double17 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number21 = defaultBoxAndWhiskerCategoryDataset0.getValue((int) (byte) 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = defaultBoxAndWhiskerCategoryDataset0.data;
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = defaultBoxAndWhiskerCategoryDataset0.data;
        java.util.EventListener eventListener9 = null;
        boolean boolean10 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener9);
        double double12 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.Range range14 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number17 = defaultBoxAndWhiskerCategoryDataset0.getMedianValue((java.lang.Comparable) 1L, (java.lang.Comparable) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(keyedObjects2D5);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNull(keyedObjects2D8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNotNull(range14);
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        java.util.EventListener eventListener5 = null;
        boolean boolean6 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener5);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = defaultBoxAndWhiskerCategoryDataset0.getMedianValue((java.lang.Comparable) 100L, (java.lang.Comparable) '4');
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (100) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10L);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        int int9 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 100.0d);
        java.util.List list10 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        org.jfree.data.Range range12 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        org.jfree.data.Range range14 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number17 = defaultBoxAndWhiskerCategoryDataset0.getMeanValue((int) (byte) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(range14);
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.Range range4 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener6);
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        double double10 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list14 = defaultBoxAndWhiskerCategoryDataset0.getOutliers((int) '4', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list9 = defaultBoxAndWhiskerCategoryDataset0.getOutliers((int) (short) 1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10L);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.KeyedObjects2D keyedObjects2D10 = defaultBoxAndWhiskerCategoryDataset0.data;
        int int11 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        java.util.List list12 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        java.util.List list13 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        java.util.List list14 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        org.jfree.data.statistics.BoxAndWhiskerItem boxAndWhiskerItem15 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultBoxAndWhiskerCategoryDataset0.add(boxAndWhiskerItem15, (java.lang.Comparable) "hi!", (java.lang.Comparable) Double.NaN);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(keyedObjects2D10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetGroup datasetGroup3 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = defaultBoxAndWhiskerCategoryDataset0.getMedianValue((java.lang.Comparable) 0, (java.lang.Comparable) 0.0f);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (0) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(datasetGroup3);
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        java.util.EventListener eventListener5 = null;
        boolean boolean6 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener5);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D10 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset11 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup12 = defaultBoxAndWhiskerCategoryDataset11.getGroup();
        org.jfree.data.general.DatasetGroup datasetGroup13 = defaultBoxAndWhiskerCategoryDataset11.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup13);
        java.util.EventListener eventListener15 = null;
        boolean boolean16 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number19 = defaultBoxAndWhiskerCategoryDataset0.getMinOutlier((int) '4', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(keyedObjects2D7);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNull(keyedObjects2D10);
        org.junit.Assert.assertNotNull(datasetGroup12);
        org.junit.Assert.assertNotNull(datasetGroup13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        java.util.List list4 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable7 = defaultBoxAndWhiskerCategoryDataset0.getRowKey((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(list4);
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        java.util.EventListener eventListener5 = null;
        boolean boolean6 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener5);
        double double8 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.general.DatasetGroup datasetGroup9 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertNotNull(datasetGroup9);
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        java.util.List list4 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = defaultBoxAndWhiskerCategoryDataset0.getMinOutlier((java.lang.Comparable) 10, (java.lang.Comparable) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (10) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(list4);
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener3);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset5 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener6 = null;
        boolean boolean7 = defaultBoxAndWhiskerCategoryDataset5.hasListener(eventListener6);
        int int9 = defaultBoxAndWhiskerCategoryDataset5.getRowIndex((java.lang.Comparable) 10L);
        int int11 = defaultBoxAndWhiskerCategoryDataset5.getRowIndex((java.lang.Comparable) "hi!");
        boolean boolean12 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) int11);
        org.jfree.data.general.DatasetGroup datasetGroup13 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number16 = defaultBoxAndWhiskerCategoryDataset0.getMinRegularValue(0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(datasetGroup13);
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) "hi!");
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.general.DatasetGroup datasetGroup9 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = defaultBoxAndWhiskerCategoryDataset0.getMedianValue((int) (short) 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup9);
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener3);
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = defaultBoxAndWhiskerCategoryDataset0.data;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable7 = defaultBoxAndWhiskerCategoryDataset0.getRowKey((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(keyedObjects2D5);
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = defaultBoxAndWhiskerCategoryDataset0.getMeanValue((int) (byte) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = defaultBoxAndWhiskerCategoryDataset0.data;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = defaultBoxAndWhiskerCategoryDataset0.getMedianValue((int) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(keyedObjects2D5);
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        java.util.List list5 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        java.util.List list11 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        int int12 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number15 = defaultBoxAndWhiskerCategoryDataset0.getQ3Value((int) (byte) 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable6 = defaultBoxAndWhiskerCategoryDataset0.getColumnKey(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener4);
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10L);
        int int9 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) 1L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = defaultBoxAndWhiskerCategoryDataset0.getMinRegularValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) 1L);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (1) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) Double.NaN);
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = defaultBoxAndWhiskerCategoryDataset0.data;
        java.util.List list9 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = defaultBoxAndWhiskerCategoryDataset0.getMedianValue((java.lang.Comparable) 1.0d, (java.lang.Comparable) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (1.0) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(keyedObjects2D8);
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int1 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = defaultBoxAndWhiskerCategoryDataset0.data;
        java.util.EventListener eventListener6 = null;
        boolean boolean7 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = defaultBoxAndWhiskerCategoryDataset0.getMinRegularValue((java.lang.Comparable) (-1.0d), (java.lang.Comparable) false);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (-1.0) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(keyedObjects2D5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int1 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) '4');
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener5);
        java.util.List list7 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = defaultBoxAndWhiskerCategoryDataset0.getMinOutlier((int) (byte) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(list7);
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        java.util.List list5 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener10);
        org.jfree.data.KeyedObjects2D keyedObjects2D12 = defaultBoxAndWhiskerCategoryDataset0.data;
        java.util.EventListener eventListener13 = null;
        boolean boolean14 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener13);
        int int16 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (short) 1);
        java.lang.Object obj17 = defaultBoxAndWhiskerCategoryDataset0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number20 = defaultBoxAndWhiskerCategoryDataset0.getMeanValue((java.lang.Comparable) 1.0f, (java.lang.Comparable) "");
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (1.0) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(keyedObjects2D12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(obj17);
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = defaultBoxAndWhiskerCategoryDataset0.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNull(keyedObjects2D7);
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener5);
        org.jfree.data.Range range8 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list11 = defaultBoxAndWhiskerCategoryDataset0.getOutliers(0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(range8);
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = defaultBoxAndWhiskerCategoryDataset0.getMinOutlier((java.lang.Comparable) (short) -1, (java.lang.Comparable) "hi!");
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (-1) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(keyedObjects2D7);
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup6 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = defaultBoxAndWhiskerCategoryDataset0.getMaxOutlier((int) (short) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(datasetGroup6);
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 0L);
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.statistics.BoxAndWhiskerItem boxAndWhiskerItem7 = defaultBoxAndWhiskerCategoryDataset0.getItem((int) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = defaultBoxAndWhiskerCategoryDataset0.data;
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 1.0d);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.statistics.BoxAndWhiskerItem boxAndWhiskerItem11 = defaultBoxAndWhiskerCategoryDataset0.getItem((-1), (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(keyedObjects2D5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }
}

