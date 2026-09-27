package org.jfree.data.statistics;

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
        int int15 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number18 = defaultBoxAndWhiskerCategoryDataset0.getMinOutlier((int) (short) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list19 = defaultBoxAndWhiskerCategoryDataset9.getOutliers((java.lang.Comparable) (byte) -1, (java.lang.Comparable) (-1.0f));
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (-1) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNotNull(keyedObjects2D14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(list16);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (-1L));
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        java.util.List list8 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = defaultBoxAndWhiskerCategoryDataset0.getMinRegularValue((java.lang.Comparable) "hi!", (java.lang.Comparable) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (hi!) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        java.util.List list7 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int10 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) '4');
        java.util.EventListener eventListener11 = null;
        boolean boolean12 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number15 = defaultBoxAndWhiskerCategoryDataset0.getQ1Value((java.lang.Comparable) (short) 100, (java.lang.Comparable) 100.0f);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (100) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        java.util.EventListener eventListener4 = null;
        boolean boolean5 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener4);
        java.util.List list6 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 100L);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener9 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number13 = defaultBoxAndWhiskerCategoryDataset0.getMeanValue((java.lang.Comparable) "", (java.lang.Comparable) '#');
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key () not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int1 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup2 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number5 = defaultBoxAndWhiskerCategoryDataset0.getQ3Value((java.lang.Comparable) 10, (java.lang.Comparable) false);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (10) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(datasetGroup2);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
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
        org.jfree.data.general.DatasetGroup datasetGroup11 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number14 = defaultBoxAndWhiskerCategoryDataset0.getQ1Value((java.lang.Comparable) 0.0d, (java.lang.Comparable) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(keyedObjects2D5);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNull(keyedObjects2D8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(datasetGroup11);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
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
        int int17 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        double double19 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        java.util.List list20 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list23 = defaultBoxAndWhiskerCategoryDataset0.getOutliers(100, (int) (byte) -1);
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
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertNotNull(list20);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int1 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = defaultBoxAndWhiskerCategoryDataset0.data;
        java.util.EventListener eventListener6 = null;
        boolean boolean7 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = defaultBoxAndWhiskerCategoryDataset0.getMedianValue((java.lang.Comparable) (-1), (java.lang.Comparable) false);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (-1) not recognised.");
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
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
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
            java.util.List list13 = defaultBoxAndWhiskerCategoryDataset0.getOutliers((java.lang.Comparable) (-1.0d), (java.lang.Comparable) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (-1.0) not recognised.");
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
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
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
            java.lang.Comparable comparable17 = defaultBoxAndWhiskerCategoryDataset0.getColumnKey((int) (byte) 100);
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
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = defaultBoxAndWhiskerCategoryDataset0.data;
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.Range range8 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        int int10 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number13 = defaultBoxAndWhiskerCategoryDataset0.getQ1Value((int) (short) 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(keyedObjects2D5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.Range range4 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener6);
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int10 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number13 = defaultBoxAndWhiskerCategoryDataset0.getMaxOutlier(0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        java.util.List list4 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = defaultBoxAndWhiskerCategoryDataset0.getMedianValue((java.lang.Comparable) (byte) 10, (java.lang.Comparable) "hi!");
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (10) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int1 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) '4');
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener5);
        double double8 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        java.lang.Object obj9 = defaultBoxAndWhiskerCategoryDataset0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list12 = defaultBoxAndWhiskerCategoryDataset0.getOutliers((int) (short) 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
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
        java.util.List list19 = defaultBoxAndWhiskerCategoryDataset8.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number22 = defaultBoxAndWhiskerCategoryDataset8.getValue((int) (short) 10, (int) 'a');
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(list19);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
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
        int int22 = defaultBoxAndWhiskerCategoryDataset8.getColumnIndex((java.lang.Comparable) (-1.0d));
        int int24 = defaultBoxAndWhiskerCategoryDataset8.getColumnIndex((java.lang.Comparable) "hi!");
        int int25 = defaultBoxAndWhiskerCategoryDataset8.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup26 = defaultBoxAndWhiskerCategoryDataset8.getGroup();
        double double28 = defaultBoxAndWhiskerCategoryDataset8.getRangeLowerBound(false);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNull(keyedObjects2D7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(datasetGroup26);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int1 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup2 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.Range range5 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) -1);
        org.jfree.data.general.DatasetGroup datasetGroup8 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable10 = defaultBoxAndWhiskerCategoryDataset0.getRowKey((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(datasetGroup2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup8);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 0L);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 1.0f);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener5);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener8);
        org.jfree.data.KeyedObjects2D keyedObjects2D10 = defaultBoxAndWhiskerCategoryDataset0.data;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number13 = defaultBoxAndWhiskerCategoryDataset0.getMeanValue((-1), (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(keyedObjects2D10);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
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
            java.lang.Number number16 = defaultBoxAndWhiskerCategoryDataset0.getMedianValue((java.lang.Comparable) (byte) -1, (java.lang.Comparable) 10L);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (-1) not recognised.");
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
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
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
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener11);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener13 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener13);
        org.junit.Assert.assertNull(keyedObjects2D5);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNull(keyedObjects2D8);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        java.util.List list4 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        java.util.EventListener eventListener5 = null;
        boolean boolean6 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener5);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.statistics.BoxAndWhiskerItem boxAndWhiskerItem9 = defaultBoxAndWhiskerCategoryDataset0.getItem((int) (short) 100, 0);
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
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
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
        java.lang.Comparable comparable15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number17 = defaultBoxAndWhiskerCategoryDataset0.getMedianValue(comparable15, (java.lang.Comparable) 0.0f);
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
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        java.lang.Comparable comparable8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = defaultBoxAndWhiskerCategoryDataset0.getMaxOutlier((java.lang.Comparable) 1.0f, comparable8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'columnKey' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        java.util.EventListener eventListener5 = null;
        boolean boolean6 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener5);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        java.lang.Class<?> wildcardClass8 = defaultBoxAndWhiskerCategoryDataset0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
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
        java.lang.Class<?> wildcardClass15 = defaultBoxAndWhiskerCategoryDataset0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        java.lang.Comparable comparable5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number6 = defaultBoxAndWhiskerCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), comparable5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'columnKey' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) Double.NaN);
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = defaultBoxAndWhiskerCategoryDataset0.getMedianValue((int) (byte) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
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
            java.lang.Number number16 = defaultBoxAndWhiskerCategoryDataset0.getMedianValue((int) 'a', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        java.util.List list7 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        int int9 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = defaultBoxAndWhiskerCategoryDataset0.getQ1Value(1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D7;
        org.jfree.data.general.DatasetGroup datasetGroup9 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener10);
        org.jfree.data.statistics.BoxAndWhiskerItem boxAndWhiskerItem12 = null;
        java.lang.Comparable comparable13 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultBoxAndWhiskerCategoryDataset0.add(boxAndWhiskerItem12, comparable13, (java.lang.Comparable) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup9);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 0L);
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable11 = defaultBoxAndWhiskerCategoryDataset0.getRowKey((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        java.util.List list4 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) false);
        int int9 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) "hi!");
        java.util.EventListener eventListener10 = null;
        boolean boolean11 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener10);
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = defaultBoxAndWhiskerCategoryDataset0.data;
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        java.util.List list5 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.junit.Assert.assertNotNull(keyedObjects2D1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener1);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) "");
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = defaultBoxAndWhiskerCategoryDataset0.data;
        java.lang.Class<?> wildcardClass6 = defaultBoxAndWhiskerCategoryDataset0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(keyedObjects2D5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
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
        int int27 = defaultBoxAndWhiskerCategoryDataset8.getColumnIndex((java.lang.Comparable) 'a');
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
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
            java.lang.Number number21 = defaultBoxAndWhiskerCategoryDataset0.getMaxOutlier((java.lang.Comparable) (-1L), (java.lang.Comparable) (short) 0);
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
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        java.util.List list5 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(list5);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int1 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = defaultBoxAndWhiskerCategoryDataset0.data;
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) 1);
        java.util.List list8 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(keyedObjects2D5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        java.util.List list5 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = defaultBoxAndWhiskerCategoryDataset0.getMeanValue((java.lang.Comparable) (-1.0f), (java.lang.Comparable) 0);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (-1.0) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        java.util.EventListener eventListener4 = null;
        boolean boolean5 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener4);
        java.util.List list6 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 100L);
        java.util.List list9 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        java.util.List list10 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        java.lang.Class<?> wildcardClass11 = list10.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
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
            java.lang.Number number12 = defaultBoxAndWhiskerCategoryDataset0.getMeanValue((java.lang.Comparable) (-1), (java.lang.Comparable) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(datasetGroup7);
        org.junit.Assert.assertNotNull(range9);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
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
            java.lang.Number number21 = defaultBoxAndWhiskerCategoryDataset0.getQ1Value((int) (byte) 1, (int) (byte) 10);
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
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (-1L));
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        java.util.EventListener eventListener8 = null;
        boolean boolean9 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener8);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number14 = defaultBoxAndWhiskerCategoryDataset0.getMinOutlier((int) ' ', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number15 = defaultBoxAndWhiskerCategoryDataset0.getMaxOutlier((int) (byte) 0, (-1));
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
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        java.util.List list7 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        int int10 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        java.util.EventListener eventListener11 = null;
        boolean boolean12 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number15 = defaultBoxAndWhiskerCategoryDataset0.getMedianValue((java.lang.Comparable) ' ', (java.lang.Comparable) 0L);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key ( ) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
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
            java.lang.Number number14 = defaultBoxAndWhiskerCategoryDataset0.getMinOutlier((int) (short) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number24 = defaultBoxAndWhiskerCategoryDataset8.getMedianValue(100, 0);
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetGroup datasetGroup3 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        boolean boolean5 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = defaultBoxAndWhiskerCategoryDataset0.getMedianValue((int) (short) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(datasetGroup3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number7 = defaultBoxAndWhiskerCategoryDataset0.getQ3Value((java.lang.Comparable) Double.NaN, (java.lang.Comparable) '4');
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (NaN) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(datasetGroup4);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
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
        int int22 = defaultBoxAndWhiskerCategoryDataset8.getColumnIndex((java.lang.Comparable) (-1.0d));
        int int24 = defaultBoxAndWhiskerCategoryDataset8.getColumnIndex((java.lang.Comparable) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number27 = defaultBoxAndWhiskerCategoryDataset8.getMaxRegularValue(10, (int) '#');
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = defaultBoxAndWhiskerCategoryDataset0.getValue((java.lang.Comparable) (byte) 100, (java.lang.Comparable) ' ');
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (100) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (-1L));
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        java.util.List list8 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        java.lang.Object obj9 = defaultBoxAndWhiskerCategoryDataset0.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.statistics.BoxAndWhiskerItem boxAndWhiskerItem12 = defaultBoxAndWhiskerCategoryDataset0.getItem((int) '#', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number7 = defaultBoxAndWhiskerCategoryDataset0.getMedianValue(10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
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
            java.lang.Number number13 = defaultBoxAndWhiskerCategoryDataset0.getQ1Value((int) (short) 1, (int) (short) 1);
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
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number21 = defaultBoxAndWhiskerCategoryDataset0.getMaxOutlier((java.lang.Comparable) "", (java.lang.Comparable) 10L);
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
        org.junit.Assert.assertTrue(Double.isNaN(double18));
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
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
        double double20 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        java.util.EventListener eventListener21 = null;
        boolean boolean22 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener21);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup10);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) Double.NaN);
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        java.util.List list8 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list11 = defaultBoxAndWhiskerCategoryDataset0.getOutliers((java.lang.Comparable) Double.NaN, (java.lang.Comparable) 0.0f);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (NaN) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        java.util.EventListener eventListener4 = null;
        boolean boolean5 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener4);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = defaultBoxAndWhiskerCategoryDataset0.getQ1Value((java.lang.Comparable) 10L, (java.lang.Comparable) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (10) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (-1L));
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        java.util.EventListener eventListener8 = null;
        boolean boolean9 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = defaultBoxAndWhiskerCategoryDataset0.getQ1Value((int) (byte) -1, (int) (short) 1);
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
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) "hi!");
        double double8 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = defaultBoxAndWhiskerCategoryDataset0.getMinOutlier((int) (byte) 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) "hi!");
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.general.DatasetGroup datasetGroup9 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        org.jfree.data.KeyedObjects2D keyedObjects2D10 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset11 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup12 = defaultBoxAndWhiskerCategoryDataset11.getGroup();
        double double14 = defaultBoxAndWhiskerCategoryDataset11.getRangeLowerBound(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultBoxAndWhiskerCategoryDataset11.removeChangeListener(datasetChangeListener15);
        int int17 = defaultBoxAndWhiskerCategoryDataset11.getRowCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener18 = null;
        defaultBoxAndWhiskerCategoryDataset11.addChangeListener(datasetChangeListener18);
        org.jfree.data.general.DatasetGroup datasetGroup20 = defaultBoxAndWhiskerCategoryDataset11.getGroup();
        java.util.List list21 = defaultBoxAndWhiskerCategoryDataset11.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            defaultBoxAndWhiskerCategoryDataset0.add(list21, (java.lang.Comparable) (short) 100, (java.lang.Comparable) 1);
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
        org.junit.Assert.assertNotNull(datasetGroup12);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(datasetGroup20);
        org.junit.Assert.assertNotNull(list21);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = defaultBoxAndWhiskerCategoryDataset0.data;
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) "hi!");
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        org.jfree.data.statistics.BoxAndWhiskerItem boxAndWhiskerItem5 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultBoxAndWhiskerCategoryDataset0.add(boxAndWhiskerItem5, (java.lang.Comparable) 100, (java.lang.Comparable) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(keyedObjects2D1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup4);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.KeyedObjects2D keyedObjects2D2 = defaultBoxAndWhiskerCategoryDataset0.data;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number5 = defaultBoxAndWhiskerCategoryDataset0.getMinOutlier((int) 'a', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(keyedObjects2D1);
        org.junit.Assert.assertNotNull(keyedObjects2D2);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
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
        java.util.List list15 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultBoxAndWhiskerCategoryDataset0.add(list15, (java.lang.Comparable) (short) 10, (java.lang.Comparable) true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'values' argument.");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        boolean boolean3 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) 100.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number6 = defaultBoxAndWhiskerCategoryDataset0.getMinOutlier((int) (short) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        java.util.List list5 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        org.jfree.data.Range range9 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        double double11 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        int int13 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 1);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset14 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener15 = null;
        boolean boolean16 = defaultBoxAndWhiskerCategoryDataset14.hasListener(eventListener15);
        int int18 = defaultBoxAndWhiskerCategoryDataset14.getRowIndex((java.lang.Comparable) 10L);
        int int19 = defaultBoxAndWhiskerCategoryDataset14.getRowCount();
        int int20 = defaultBoxAndWhiskerCategoryDataset14.getColumnCount();
        int int21 = defaultBoxAndWhiskerCategoryDataset14.getColumnCount();
        int int23 = defaultBoxAndWhiskerCategoryDataset14.getRowIndex((java.lang.Comparable) 100.0d);
        java.util.List list24 = defaultBoxAndWhiskerCategoryDataset14.getColumnKeys();
        org.jfree.data.Range range26 = defaultBoxAndWhiskerCategoryDataset14.getRangeBounds(false);
        org.jfree.data.Range range28 = defaultBoxAndWhiskerCategoryDataset14.getRangeBounds(true);
        org.jfree.data.general.DatasetGroup datasetGroup29 = defaultBoxAndWhiskerCategoryDataset14.getGroup();
        java.util.List list30 = defaultBoxAndWhiskerCategoryDataset14.getRowKeys();
        java.util.List list31 = defaultBoxAndWhiskerCategoryDataset14.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            defaultBoxAndWhiskerCategoryDataset0.add(list31, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Range(double, double): require lower (Infinity) <= upper (-Infinity).");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertNotNull(datasetGroup29);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertNotNull(list31);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = defaultBoxAndWhiskerCategoryDataset0.getMinRegularValue((int) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.Range range4 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        org.jfree.data.Range range6 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertNotNull(range6);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (-1L));
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        java.lang.Class<?> wildcardClass10 = defaultBoxAndWhiskerCategoryDataset0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
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
        double double14 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        java.lang.Class<?> wildcardClass15 = defaultBoxAndWhiskerCategoryDataset0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(keyedObjects2D7);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNull(keyedObjects2D10);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = defaultBoxAndWhiskerCategoryDataset0.getValue((java.lang.Comparable) ' ', (java.lang.Comparable) (-1.0d));
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key ( ) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.Range range4 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener5);
        java.util.List list7 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = defaultBoxAndWhiskerCategoryDataset0.data;
        boolean boolean10 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number13 = defaultBoxAndWhiskerCategoryDataset0.getMinOutlier((java.lang.Comparable) '#', (java.lang.Comparable) 100);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (#) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(keyedObjects2D8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = defaultBoxAndWhiskerCategoryDataset0.data;
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        java.util.List list4 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number7 = defaultBoxAndWhiskerCategoryDataset0.getMinRegularValue((-1), (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(keyedObjects2D1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(list4);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (short) 100);
        java.util.List list5 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.Range range9 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        double double11 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        int int13 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number16 = defaultBoxAndWhiskerCategoryDataset0.getMinRegularValue((int) (short) 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
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
        java.util.EventListener eventListener12 = null;
        boolean boolean13 = defaultBoxAndWhiskerCategoryDataset11.hasListener(eventListener12);
        int int15 = defaultBoxAndWhiskerCategoryDataset11.getRowIndex((java.lang.Comparable) 10L);
        int int16 = defaultBoxAndWhiskerCategoryDataset11.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup17 = defaultBoxAndWhiskerCategoryDataset11.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup17);
        java.lang.Class<?> wildcardClass19 = datasetGroup17.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(keyedObjects2D7);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNull(keyedObjects2D10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(datasetGroup17);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener4);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener7);
        org.jfree.data.general.DatasetGroup datasetGroup9 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        java.util.List list10 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number13 = defaultBoxAndWhiskerCategoryDataset0.getMaxRegularValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) (-1.0f));
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (1) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(datasetGroup9);
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
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
        double double22 = defaultBoxAndWhiskerCategoryDataset8.getRangeUpperBound(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number25 = defaultBoxAndWhiskerCategoryDataset8.getQ3Value((int) '#', (int) (short) 1);
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int1 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) '4');
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener5);
        double double8 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        java.util.EventListener eventListener9 = null;
        boolean boolean10 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number13 = defaultBoxAndWhiskerCategoryDataset0.getValue((java.lang.Comparable) (byte) 0, (java.lang.Comparable) 'a');
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (0) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
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
            java.util.List list16 = defaultBoxAndWhiskerCategoryDataset0.getOutliers(10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
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
            int int11 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(keyedObjects2D7);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number6 = defaultBoxAndWhiskerCategoryDataset0.getMeanValue(0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
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
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.statistics.BoxAndWhiskerItem boxAndWhiskerItem16 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultBoxAndWhiskerCategoryDataset0.add(boxAndWhiskerItem16, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) 0);
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
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
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
            java.lang.Comparable comparable17 = defaultBoxAndWhiskerCategoryDataset0.getRowKey((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
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
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
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
        java.util.List list14 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D15 = defaultBoxAndWhiskerCategoryDataset0.data;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number18 = defaultBoxAndWhiskerCategoryDataset0.getQ1Value((int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(keyedObjects2D15);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = defaultBoxAndWhiskerCategoryDataset0.data;
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = defaultBoxAndWhiskerCategoryDataset0.getMaxOutlier((int) ' ', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(keyedObjects2D5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        java.util.EventListener eventListener4 = null;
        boolean boolean5 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable7 = defaultBoxAndWhiskerCategoryDataset0.getRowKey((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
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
            java.lang.Number number25 = defaultBoxAndWhiskerCategoryDataset8.getQ1Value(10, (int) ' ');
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
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener5);
        double double8 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        java.util.List list9 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        java.lang.Object obj10 = defaultBoxAndWhiskerCategoryDataset0.clone();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = defaultBoxAndWhiskerCategoryDataset0.getQ3Value((java.lang.Comparable) 'a', (java.lang.Comparable) 100L);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (a) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
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
        int int20 = defaultBoxAndWhiskerCategoryDataset8.getColumnCount();
        java.lang.Comparable comparable22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number23 = defaultBoxAndWhiskerCategoryDataset8.getQ3Value((java.lang.Comparable) (byte) -1, comparable22);
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
        org.junit.Assert.assertNotNull(keyedObjects2D19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
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
            java.lang.Number number10 = defaultBoxAndWhiskerCategoryDataset0.getMaxOutlier((-1), (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.general.DatasetGroup datasetGroup8 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable10 = defaultBoxAndWhiskerCategoryDataset0.getRowKey((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(datasetGroup8);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
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
        java.util.List list16 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        int int17 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list20 = defaultBoxAndWhiskerCategoryDataset0.getOutliers((int) (short) 0, (int) 'a');
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
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
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
        java.util.List list14 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number17 = defaultBoxAndWhiskerCategoryDataset0.getMeanValue((int) (short) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
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
        int int15 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 1);
        double double17 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        java.util.List list18 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertNotNull(list18);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        java.util.List list5 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        org.jfree.data.Range range9 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        double double11 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
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
        int int25 = defaultBoxAndWhiskerCategoryDataset8.getRowIndex((java.lang.Comparable) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number28 = defaultBoxAndWhiskerCategoryDataset8.getMaxRegularValue((java.lang.Comparable) 10L, (java.lang.Comparable) '4');
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10L);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) 10.0f);
        double double10 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        int int11 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number14 = defaultBoxAndWhiskerCategoryDataset0.getMedianValue((int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        java.util.EventListener eventListener4 = null;
        boolean boolean5 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener4);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener6);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        java.util.List list5 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        int int9 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) ' ');
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number14 = defaultBoxAndWhiskerCategoryDataset0.getMinRegularValue((java.lang.Comparable) (-1), (java.lang.Comparable) ' ');
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (-1) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10L);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup6 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        java.util.EventListener eventListener8 = null;
        boolean boolean9 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = defaultBoxAndWhiskerCategoryDataset0.getMaxOutlier((java.lang.Comparable) (-1), (java.lang.Comparable) (-1L));
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (-1) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(datasetGroup6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        java.util.EventListener eventListener5 = null;
        boolean boolean6 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener5);
        org.jfree.data.general.DatasetGroup datasetGroup7 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        java.lang.Class<?> wildcardClass8 = defaultBoxAndWhiskerCategoryDataset0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(datasetGroup7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetGroup datasetGroup3 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener4);
        org.jfree.data.general.DatasetGroup datasetGroup6 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = defaultBoxAndWhiskerCategoryDataset0.getMinRegularValue((java.lang.Comparable) 1, (java.lang.Comparable) 0.0d);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (1) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(datasetGroup3);
        org.junit.Assert.assertNotNull(datasetGroup6);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.Range range4 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        java.util.List list5 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = defaultBoxAndWhiskerCategoryDataset0.data;
        double double8 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset9 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double11 = defaultBoxAndWhiskerCategoryDataset9.getRangeUpperBound(true);
        org.jfree.data.Range range13 = defaultBoxAndWhiskerCategoryDataset9.getRangeBounds(true);
        int int14 = defaultBoxAndWhiskerCategoryDataset9.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultBoxAndWhiskerCategoryDataset9.addChangeListener(datasetChangeListener15);
        int int18 = defaultBoxAndWhiskerCategoryDataset9.getColumnIndex((java.lang.Comparable) 1.0d);
        java.util.List list19 = defaultBoxAndWhiskerCategoryDataset9.getColumnKeys();
        java.util.List list20 = defaultBoxAndWhiskerCategoryDataset9.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            defaultBoxAndWhiskerCategoryDataset0.add(list20, (java.lang.Comparable) 10.0f, (java.lang.Comparable) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Range(double, double): require lower (Infinity) <= upper (-Infinity).");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(keyedObjects2D6);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertNotNull(list20);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
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
        double double25 = defaultBoxAndWhiskerCategoryDataset8.getRangeLowerBound(true);
        org.jfree.data.Range range27 = defaultBoxAndWhiskerCategoryDataset8.getRangeBounds(false);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNull(keyedObjects2D7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertNotNull(range27);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10L);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (-1.0f));
        org.jfree.data.general.DatasetGroup datasetGroup7 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = defaultBoxAndWhiskerCategoryDataset0.getMaxRegularValue((java.lang.Comparable) true, (java.lang.Comparable) "");
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (true) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.Range range4 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener6);
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        double double10 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener11);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener13 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener13);
        java.util.EventListener eventListener15 = null;
        boolean boolean16 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener15);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
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
        java.util.List list18 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
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
        org.junit.Assert.assertNotNull(list18);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10L);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup6 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        java.util.List list8 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener9 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener9);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list13 = defaultBoxAndWhiskerCategoryDataset0.getOutliers((int) '#', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        java.util.List list3 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        java.util.List list4 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.Range range6 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertNotNull(keyedObjects2D7);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number7 = defaultBoxAndWhiskerCategoryDataset0.getQ3Value(10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10L);
        org.jfree.data.Range range7 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = defaultBoxAndWhiskerCategoryDataset0.getMinOutlier((java.lang.Comparable) '4', (java.lang.Comparable) 100);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (4) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(range7);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list7 = defaultBoxAndWhiskerCategoryDataset0.getOutliers((java.lang.Comparable) '#', (java.lang.Comparable) (-1.0d));
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (#) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.Range range4 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener6);
        int int9 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) 1.0d);
        java.util.List list10 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        int int12 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) '#');
        org.jfree.data.general.DatasetChangeListener datasetChangeListener13 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number17 = defaultBoxAndWhiskerCategoryDataset0.getMaxOutlier(0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener4);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener7);
        org.jfree.data.general.DatasetGroup datasetGroup9 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        org.jfree.data.statistics.BoxAndWhiskerItem boxAndWhiskerItem10 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultBoxAndWhiskerCategoryDataset0.add(boxAndWhiskerItem10, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(datasetGroup9);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.Range range4 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        java.lang.Object obj6 = defaultBoxAndWhiskerCategoryDataset0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable8 = defaultBoxAndWhiskerCategoryDataset0.getColumnKey((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        java.util.List list7 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int10 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) '4');
        int int12 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) false);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list15 = defaultBoxAndWhiskerCategoryDataset0.getOutliers((int) (short) 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
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
        org.jfree.data.KeyedObjects2D keyedObjects2D20 = defaultBoxAndWhiskerCategoryDataset8.data;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number23 = defaultBoxAndWhiskerCategoryDataset8.getMedianValue((java.lang.Comparable) 0, (java.lang.Comparable) (-1.0f));
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
        org.junit.Assert.assertNotNull(keyedObjects2D19);
        org.junit.Assert.assertNotNull(keyedObjects2D20);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.Range range4 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        java.lang.Object obj6 = defaultBoxAndWhiskerCategoryDataset0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = defaultBoxAndWhiskerCategoryDataset0.getQ1Value((java.lang.Comparable) 0L, (java.lang.Comparable) false);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (0) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = defaultBoxAndWhiskerCategoryDataset0.data;
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener8);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener10);
        org.junit.Assert.assertNull(keyedObjects2D5);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number7 = defaultBoxAndWhiskerCategoryDataset0.getQ3Value((java.lang.Comparable) 10L, (java.lang.Comparable) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (10) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.Range range4 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener5);
        java.util.List list7 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = defaultBoxAndWhiskerCategoryDataset0.data;
        boolean boolean10 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list13 = defaultBoxAndWhiskerCategoryDataset0.getOutliers(0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(keyedObjects2D8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
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
        org.jfree.data.Range range14 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number17 = defaultBoxAndWhiskerCategoryDataset0.getMinRegularValue((int) ' ', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(range14);
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int1 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup2 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        java.util.List list4 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultBoxAndWhiskerCategoryDataset0.add(list4, (java.lang.Comparable) 100.0f, (java.lang.Comparable) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'values' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(datasetGroup2);
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
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
        double double22 = defaultBoxAndWhiskerCategoryDataset8.getRangeLowerBound(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number25 = defaultBoxAndWhiskerCategoryDataset8.getValue((int) (byte) 0, (int) (short) 1);
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
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
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
        double double14 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        java.util.EventListener eventListener15 = null;
        boolean boolean16 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener15);
        java.util.EventListener eventListener17 = null;
        boolean boolean18 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable20 = defaultBoxAndWhiskerCategoryDataset0.getRowKey((int) (byte) 10);
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
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = defaultBoxAndWhiskerCategoryDataset0.data;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = defaultBoxAndWhiskerCategoryDataset0.getMaxRegularValue((int) (short) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(keyedObjects2D5);
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
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
            java.util.List list12 = defaultBoxAndWhiskerCategoryDataset0.getOutliers((int) (short) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup9);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
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
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset16 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener17 = null;
        boolean boolean18 = defaultBoxAndWhiskerCategoryDataset16.hasListener(eventListener17);
        int int20 = defaultBoxAndWhiskerCategoryDataset16.getRowIndex((java.lang.Comparable) 10L);
        int int21 = defaultBoxAndWhiskerCategoryDataset16.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup22 = defaultBoxAndWhiskerCategoryDataset16.getGroup();
        int int23 = defaultBoxAndWhiskerCategoryDataset16.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener24 = null;
        defaultBoxAndWhiskerCategoryDataset16.addChangeListener(datasetChangeListener24);
        double double27 = defaultBoxAndWhiskerCategoryDataset16.getRangeUpperBound(true);
        java.util.List list28 = defaultBoxAndWhiskerCategoryDataset16.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            defaultBoxAndWhiskerCategoryDataset0.add(list28, (java.lang.Comparable) 1.0d, (java.lang.Comparable) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Range(double, double): require lower (Infinity) <= upper (-Infinity).");
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
        org.junit.Assert.assertNotNull(keyedObjects2D15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(datasetGroup22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertNotNull(list28);
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
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
            java.util.List list16 = defaultBoxAndWhiskerCategoryDataset0.getOutliers((java.lang.Comparable) 10, (java.lang.Comparable) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (10) not recognised.");
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
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number6 = defaultBoxAndWhiskerCategoryDataset0.getMinRegularValue((int) '4', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
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
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number14 = defaultBoxAndWhiskerCategoryDataset0.getMedianValue((int) (byte) 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(keyedObjects2D7);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10L);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup6 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener8);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(datasetGroup6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int1 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup2 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.Range range5 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) -1);
        org.jfree.data.general.DatasetGroup datasetGroup8 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int10 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number13 = defaultBoxAndWhiskerCategoryDataset0.getMeanValue((int) (byte) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(datasetGroup2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
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
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable18 = defaultBoxAndWhiskerCategoryDataset0.getColumnKey(0);
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
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10L);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.Range range8 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = defaultBoxAndWhiskerCategoryDataset0.getQ3Value((java.lang.Comparable) (short) 10, (java.lang.Comparable) "hi!");
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (10) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(range8);
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10L);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        int int9 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 100.0d);
        java.util.List list10 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        int int12 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) (-1));
        java.lang.Object obj13 = defaultBoxAndWhiskerCategoryDataset0.clone();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable22 = defaultBoxAndWhiskerCategoryDataset8.getRowKey((int) (short) 0);
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
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list7 = defaultBoxAndWhiskerCategoryDataset0.getOutliers((int) ' ', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10L);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (-1.0f));
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = defaultBoxAndWhiskerCategoryDataset0.getMaxRegularValue((java.lang.Comparable) 100, (java.lang.Comparable) 10.0d);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (100) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
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
            java.util.List list19 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
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
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        java.util.List list5 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = defaultBoxAndWhiskerCategoryDataset0.getQ3Value((int) (byte) 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.Range range4 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener6);
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int10 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number13 = defaultBoxAndWhiskerCategoryDataset0.getMinRegularValue((int) (short) 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        java.util.EventListener eventListener4 = null;
        boolean boolean5 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener4);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = defaultBoxAndWhiskerCategoryDataset0.getMedianValue((java.lang.Comparable) (byte) 1, (java.lang.Comparable) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (1) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
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
            int int13 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(keyedObjects2D5);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNull(keyedObjects2D8);
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
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
        java.util.List list21 = defaultBoxAndWhiskerCategoryDataset8.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.statistics.BoxAndWhiskerItem boxAndWhiskerItem24 = defaultBoxAndWhiskerCategoryDataset8.getItem(0, (int) '4');
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
        org.junit.Assert.assertNotNull(list21);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10L);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup6 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener8);
        double double11 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        java.util.List list12 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D13 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(datasetGroup6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(keyedObjects2D13);
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
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
            java.lang.Comparable comparable13 = defaultBoxAndWhiskerCategoryDataset0.getRowKey((int) (short) 100);
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
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener1);
        java.lang.Object obj3 = defaultBoxAndWhiskerCategoryDataset0.clone();
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
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
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset14 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double16 = defaultBoxAndWhiskerCategoryDataset14.getRangeUpperBound(true);
        double double18 = defaultBoxAndWhiskerCategoryDataset14.getRangeLowerBound(true);
        java.util.EventListener eventListener19 = null;
        boolean boolean20 = defaultBoxAndWhiskerCategoryDataset14.hasListener(eventListener19);
        int int21 = defaultBoxAndWhiskerCategoryDataset14.getRowCount();
        java.util.List list22 = defaultBoxAndWhiskerCategoryDataset14.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            defaultBoxAndWhiskerCategoryDataset0.add(list22, (java.lang.Comparable) true, (java.lang.Comparable) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Range(double, double): require lower (Infinity) <= upper (-Infinity).");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(list22);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
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
        int int24 = defaultBoxAndWhiskerCategoryDataset8.getRowIndex((java.lang.Comparable) ' ');
        org.jfree.data.general.DatasetChangeListener datasetChangeListener25 = null;
        defaultBoxAndWhiskerCategoryDataset8.removeChangeListener(datasetChangeListener25);
        org.jfree.data.general.DatasetGroup datasetGroup27 = defaultBoxAndWhiskerCategoryDataset8.getGroup();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number30 = defaultBoxAndWhiskerCategoryDataset8.getMaxOutlier((int) (byte) 10, (int) '#');
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
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup27);
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        java.util.EventListener eventListener5 = null;
        boolean boolean6 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener5);
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = defaultBoxAndWhiskerCategoryDataset0.data;
        double double10 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number13 = defaultBoxAndWhiskerCategoryDataset0.getMinOutlier((int) '4', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(keyedObjects2D8);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (-1L));
        java.lang.Class<?> wildcardClass6 = defaultBoxAndWhiskerCategoryDataset0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
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
        int int15 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.Range range17 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number20 = defaultBoxAndWhiskerCategoryDataset0.getMedianValue((java.lang.Comparable) 10.0f, (java.lang.Comparable) 'a');
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (10.0) not recognised.");
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(range17);
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
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
        org.jfree.data.KeyedObjects2D keyedObjects2D10 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.general.DatasetGroup datasetGroup11 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        // The following exception was thrown during execution in test generation
        try {
            int int13 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(keyedObjects2D7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(keyedObjects2D10);
        org.junit.Assert.assertNotNull(datasetGroup11);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
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
        org.jfree.data.general.DatasetChangeListener datasetChangeListener22 = null;
        defaultBoxAndWhiskerCategoryDataset8.addChangeListener(datasetChangeListener22);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener24 = null;
        defaultBoxAndWhiskerCategoryDataset8.removeChangeListener(datasetChangeListener24);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number28 = defaultBoxAndWhiskerCategoryDataset8.getMinRegularValue((int) (short) -1, (int) (short) 0);
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
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
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
            org.jfree.data.statistics.BoxAndWhiskerItem boxAndWhiskerItem18 = defaultBoxAndWhiskerCategoryDataset0.getItem((int) (short) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener5);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener7);
        java.lang.Comparable comparable10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = defaultBoxAndWhiskerCategoryDataset0.getMeanValue((java.lang.Comparable) 0, comparable10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
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
        int int22 = defaultBoxAndWhiskerCategoryDataset8.getColumnIndex((java.lang.Comparable) (-1.0d));
        int int24 = defaultBoxAndWhiskerCategoryDataset8.getColumnIndex((java.lang.Comparable) "hi!");
        int int25 = defaultBoxAndWhiskerCategoryDataset8.getRowCount();
        java.util.List list26 = defaultBoxAndWhiskerCategoryDataset8.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number29 = defaultBoxAndWhiskerCategoryDataset8.getQ3Value(1, (int) (short) 100);
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(list26);
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
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
            java.lang.Number number15 = defaultBoxAndWhiskerCategoryDataset0.getMaxRegularValue((-1), (int) '#');
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
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
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
        java.lang.Object obj13 = defaultBoxAndWhiskerCategoryDataset0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number16 = defaultBoxAndWhiskerCategoryDataset0.getMinRegularValue((java.lang.Comparable) 1L, (java.lang.Comparable) 100L);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (1) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 0L);
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        java.util.List list4 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        java.lang.Object obj5 = defaultBoxAndWhiskerCategoryDataset0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = defaultBoxAndWhiskerCategoryDataset0.getQ3Value((int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number5 = defaultBoxAndWhiskerCategoryDataset0.getQ3Value((int) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
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
        double double14 = defaultBoxAndWhiskerCategoryDataset11.getRangeLowerBound(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultBoxAndWhiskerCategoryDataset11.removeChangeListener(datasetChangeListener15);
        int int17 = defaultBoxAndWhiskerCategoryDataset11.getRowCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener18 = null;
        defaultBoxAndWhiskerCategoryDataset11.addChangeListener(datasetChangeListener18);
        org.jfree.data.general.DatasetGroup datasetGroup20 = defaultBoxAndWhiskerCategoryDataset11.getGroup();
        java.util.List list21 = defaultBoxAndWhiskerCategoryDataset11.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            defaultBoxAndWhiskerCategoryDataset0.add(list21, (java.lang.Comparable) 100, (java.lang.Comparable) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(keyedObjects2D7);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNull(keyedObjects2D10);
        org.junit.Assert.assertNotNull(datasetGroup12);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(datasetGroup20);
        org.junit.Assert.assertNotNull(list21);
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10L);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (-1.0f));
        java.lang.Object obj7 = defaultBoxAndWhiskerCategoryDataset0.clone();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        java.util.List list7 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int10 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) '4');
        int int11 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number14 = defaultBoxAndWhiskerCategoryDataset0.getMaxRegularValue((java.lang.Comparable) 1.0f, (java.lang.Comparable) '4');
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (1.0) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        java.util.List list4 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener5);
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int9 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = defaultBoxAndWhiskerCategoryDataset0.getQ1Value(1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
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
        org.jfree.data.statistics.BoxAndWhiskerItem boxAndWhiskerItem16 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultBoxAndWhiskerCategoryDataset0.add(boxAndWhiskerItem16, (java.lang.Comparable) (short) 0, (java.lang.Comparable) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(range15);
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 0L);
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        java.util.List list4 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        java.lang.Comparable comparable5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number7 = defaultBoxAndWhiskerCategoryDataset0.getQ1Value(comparable5, (java.lang.Comparable) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'rowKey' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(list4);
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) "hi!");
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        double double8 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        java.util.EventListener eventListener5 = null;
        boolean boolean6 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener5);
        double double8 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = defaultBoxAndWhiskerCategoryDataset0.getQ1Value((java.lang.Comparable) 10.0d, (java.lang.Comparable) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (10.0) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
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
            java.lang.Number number17 = defaultBoxAndWhiskerCategoryDataset4.getQ1Value((java.lang.Comparable) 1L, (java.lang.Comparable) '#');
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
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        java.util.List list5 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        int int9 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        double double5 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.Range range9 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = defaultBoxAndWhiskerCategoryDataset0.getQ1Value((int) (short) 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(range9);
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int1 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10.0d);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = defaultBoxAndWhiskerCategoryDataset0.getValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) "hi!");
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (10.0) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D7;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset9 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener10 = null;
        boolean boolean11 = defaultBoxAndWhiskerCategoryDataset9.hasListener(eventListener10);
        int int13 = defaultBoxAndWhiskerCategoryDataset9.getRowIndex((java.lang.Comparable) 10L);
        int int14 = defaultBoxAndWhiskerCategoryDataset9.getRowCount();
        int int15 = defaultBoxAndWhiskerCategoryDataset9.getColumnCount();
        int int16 = defaultBoxAndWhiskerCategoryDataset9.getColumnCount();
        int int18 = defaultBoxAndWhiskerCategoryDataset9.getRowIndex((java.lang.Comparable) 100.0d);
        java.util.List list19 = defaultBoxAndWhiskerCategoryDataset9.getColumnKeys();
        boolean boolean20 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset9);
        java.util.List list21 = defaultBoxAndWhiskerCategoryDataset9.getRowKeys();
        org.jfree.data.statistics.BoxAndWhiskerItem boxAndWhiskerItem22 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultBoxAndWhiskerCategoryDataset9.add(boxAndWhiskerItem22, (java.lang.Comparable) 1L, (java.lang.Comparable) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(list21);
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) Double.NaN);
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = defaultBoxAndWhiskerCategoryDataset0.data;
        java.util.List list9 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        java.lang.Comparable comparable11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = defaultBoxAndWhiskerCategoryDataset0.getMaxRegularValue((java.lang.Comparable) '4', comparable11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'columnKey' argument.");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
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
        java.util.List list19 = defaultBoxAndWhiskerCategoryDataset8.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number22 = defaultBoxAndWhiskerCategoryDataset8.getQ1Value((java.lang.Comparable) (byte) -1, (java.lang.Comparable) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (-1) not recognised.");
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
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
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
        int int22 = defaultBoxAndWhiskerCategoryDataset8.getColumnIndex((java.lang.Comparable) (-1.0d));
        org.jfree.data.general.DatasetGroup datasetGroup23 = defaultBoxAndWhiskerCategoryDataset8.getGroup();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number26 = defaultBoxAndWhiskerCategoryDataset8.getMedianValue((int) (short) 1, (int) (byte) 0);
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup23);
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
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
            java.lang.Number number21 = defaultBoxAndWhiskerCategoryDataset0.getMaxRegularValue((java.lang.Comparable) 1L, (java.lang.Comparable) true);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (1) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
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
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable8 = defaultBoxAndWhiskerCategoryDataset0.getColumnKey((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10L);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (-1.0f));
        org.jfree.data.general.DatasetGroup datasetGroup7 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = defaultBoxAndWhiskerCategoryDataset0.getValue(0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup7);
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number5 = defaultBoxAndWhiskerCategoryDataset0.getMinOutlier((java.lang.Comparable) 0L, (java.lang.Comparable) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
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
        java.util.EventListener eventListener12 = null;
        boolean boolean13 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener12);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number19 = defaultBoxAndWhiskerCategoryDataset0.getQ1Value((java.lang.Comparable) 100L, (java.lang.Comparable) "hi!");
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (100) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
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
        java.lang.Object obj13 = defaultBoxAndWhiskerCategoryDataset0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable15 = defaultBoxAndWhiskerCategoryDataset0.getColumnKey((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
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
            org.jfree.data.statistics.BoxAndWhiskerItem boxAndWhiskerItem14 = defaultBoxAndWhiskerCategoryDataset0.getItem((int) (short) 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(keyedObjects2D5);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNull(keyedObjects2D8);
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.Range range9 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        int int12 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number15 = defaultBoxAndWhiskerCategoryDataset0.getQ1Value((java.lang.Comparable) (byte) 0, (java.lang.Comparable) 1.0d);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (0) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
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
        double double14 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        java.util.EventListener eventListener15 = null;
        boolean boolean16 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number19 = defaultBoxAndWhiskerCategoryDataset0.getMinRegularValue((int) (short) 100, (int) ' ');
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
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 0L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number5 = defaultBoxAndWhiskerCategoryDataset0.getMinRegularValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) true);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (10.0) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        java.util.List list4 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener5);
        org.jfree.data.general.DatasetGroup datasetGroup7 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        java.lang.Object obj8 = defaultBoxAndWhiskerCategoryDataset0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list11 = defaultBoxAndWhiskerCategoryDataset0.getOutliers((java.lang.Comparable) "", (java.lang.Comparable) 100.0d);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key () not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(datasetGroup7);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = defaultBoxAndWhiskerCategoryDataset0.data;
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.KeyedObjects2D keyedObjects2D9 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number14 = defaultBoxAndWhiskerCategoryDataset0.getQ1Value((int) (short) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(keyedObjects2D5);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNull(keyedObjects2D8);
        org.junit.Assert.assertNull(keyedObjects2D9);
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = defaultBoxAndWhiskerCategoryDataset0.data;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number4 = defaultBoxAndWhiskerCategoryDataset0.getQ3Value((java.lang.Comparable) false, (java.lang.Comparable) 100.0f);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (false) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(keyedObjects2D1);
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
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
            java.lang.Number number12 = defaultBoxAndWhiskerCategoryDataset0.getQ1Value((java.lang.Comparable) (-1.0d), (java.lang.Comparable) '4');
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (-1.0) not recognised.");
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
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
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
            java.lang.Number number18 = defaultBoxAndWhiskerCategoryDataset6.getMinOutlier((int) (short) 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
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
        int int18 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number21 = defaultBoxAndWhiskerCategoryDataset0.getQ3Value(1, (int) (short) 10);
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
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
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
        double double19 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number22 = defaultBoxAndWhiskerCategoryDataset0.getValue((java.lang.Comparable) 1, (java.lang.Comparable) "");
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (1) not recognised.");
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
        org.junit.Assert.assertTrue(Double.isNaN(double19));
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 0L);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 1.0f);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener5);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener8);
        org.jfree.data.KeyedObjects2D keyedObjects2D10 = defaultBoxAndWhiskerCategoryDataset0.data;
        java.lang.Class<?> wildcardClass11 = defaultBoxAndWhiskerCategoryDataset0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(keyedObjects2D10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
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
        java.util.EventListener eventListener12 = null;
        boolean boolean13 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener12);
        double double15 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10L);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup6 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        java.util.List list8 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        double double10 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(datasetGroup6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        java.util.List list5 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) '4');
        java.lang.Comparable comparable9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = defaultBoxAndWhiskerCategoryDataset0.getMinOutlier(comparable9, (java.lang.Comparable) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'rowKey' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (-1L));
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset10 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list11 = defaultBoxAndWhiskerCategoryDataset10.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            defaultBoxAndWhiskerCategoryDataset0.add(list11, (java.lang.Comparable) 10, (java.lang.Comparable) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Range(double, double): require lower (Infinity) <= upper (-Infinity).");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list11);
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) "hi!");
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = defaultBoxAndWhiskerCategoryDataset0.getMinOutlier((java.lang.Comparable) 100L, (java.lang.Comparable) '#');
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (100) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list21 = defaultBoxAndWhiskerCategoryDataset8.getOutliers(0, (-1));
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
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
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
        double double22 = defaultBoxAndWhiskerCategoryDataset8.getRangeUpperBound(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number25 = defaultBoxAndWhiskerCategoryDataset8.getMeanValue((java.lang.Comparable) '4', (java.lang.Comparable) (-1.0d));
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
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
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        java.lang.Object obj14 = defaultBoxAndWhiskerCategoryDataset0.clone();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(datasetGroup12);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        java.util.List list7 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int10 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) '4');
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener11);
        int int14 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 1);
        java.lang.Class<?> wildcardClass15 = defaultBoxAndWhiskerCategoryDataset0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
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
        org.jfree.data.KeyedObjects2D keyedObjects2D10 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener11);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.KeyedObjects2D keyedObjects2D14 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(keyedObjects2D7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(keyedObjects2D10);
        org.junit.Assert.assertNull(keyedObjects2D14);
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
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
            java.lang.Number number16 = defaultBoxAndWhiskerCategoryDataset0.getMinRegularValue((int) 'a', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 0");
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
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
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
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener11);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(keyedObjects2D5);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
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
            java.lang.Comparable comparable12 = defaultBoxAndWhiskerCategoryDataset0.getColumnKey(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
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
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.Range range9 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = defaultBoxAndWhiskerCategoryDataset0.clone();
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
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10L);
        org.jfree.data.Range range7 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        java.lang.Comparable comparable11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list12 = defaultBoxAndWhiskerCategoryDataset0.getOutliers((java.lang.Comparable) "hi!", comparable11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'columnKey' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
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
        int int22 = defaultBoxAndWhiskerCategoryDataset8.getColumnIndex((java.lang.Comparable) (-1.0d));
        int int24 = defaultBoxAndWhiskerCategoryDataset8.getColumnIndex((java.lang.Comparable) "hi!");
        int int25 = defaultBoxAndWhiskerCategoryDataset8.getRowCount();
        java.util.List list26 = defaultBoxAndWhiskerCategoryDataset8.getRowKeys();
        int int27 = defaultBoxAndWhiskerCategoryDataset8.getRowCount();
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNull(keyedObjects2D7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        java.util.List list4 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener8);
        int int11 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 100);
        java.lang.Class<?> wildcardClass12 = defaultBoxAndWhiskerCategoryDataset0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        java.util.List list3 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.statistics.BoxAndWhiskerItem boxAndWhiskerItem6 = defaultBoxAndWhiskerCategoryDataset0.getItem((int) 'a', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(list3);
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.KeyedObjects2D keyedObjects2D4 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = defaultBoxAndWhiskerCategoryDataset0.getMaxRegularValue((java.lang.Comparable) 100L, (java.lang.Comparable) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(keyedObjects2D4);
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 0L);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 1.0f);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener5);
        java.util.EventListener eventListener7 = null;
        boolean boolean8 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener7);
        org.jfree.data.KeyedObjects2D keyedObjects2D9 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(keyedObjects2D9);
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
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
        org.jfree.data.KeyedObjects2D keyedObjects2D10 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener11);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number16 = defaultBoxAndWhiskerCategoryDataset0.getMedianValue((int) (short) 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(keyedObjects2D7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(keyedObjects2D10);
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.statistics.BoxAndWhiskerItem boxAndWhiskerItem9 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultBoxAndWhiskerCategoryDataset0.add(boxAndWhiskerItem9, (java.lang.Comparable) 10.0d, (java.lang.Comparable) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener3);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable8 = defaultBoxAndWhiskerCategoryDataset0.getColumnKey(0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.Range range4 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener6);
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        double double10 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number15 = defaultBoxAndWhiskerCategoryDataset0.getMaxOutlier((java.lang.Comparable) 0.0f, (java.lang.Comparable) ' ');
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (0.0) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int1 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number7 = defaultBoxAndWhiskerCategoryDataset0.getMaxOutlier((java.lang.Comparable) 10L, (java.lang.Comparable) '#');
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (10) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
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
        java.util.List list16 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list19 = defaultBoxAndWhiskerCategoryDataset0.getOutliers((int) (byte) -1, (int) 'a');
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
        org.junit.Assert.assertNotNull(list16);
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        java.util.List list4 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.general.DatasetGroup datasetGroup8 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(datasetGroup8);
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.Range range4 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        org.jfree.data.statistics.BoxAndWhiskerItem boxAndWhiskerItem5 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultBoxAndWhiskerCategoryDataset0.add(boxAndWhiskerItem5, (java.lang.Comparable) 1L, (java.lang.Comparable) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(range4);
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (-1L));
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = defaultBoxAndWhiskerCategoryDataset0.getMinRegularValue((int) (byte) 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        java.util.List list5 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        org.jfree.data.general.DatasetGroup datasetGroup6 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        java.lang.Class<?> wildcardClass7 = datasetGroup6.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(datasetGroup6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        int int9 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 1.0f);
        java.lang.Class<?> wildcardClass10 = defaultBoxAndWhiskerCategoryDataset0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) "hi!");
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        java.util.EventListener eventListener7 = null;
        boolean boolean8 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = defaultBoxAndWhiskerCategoryDataset0.getMaxRegularValue(100, (int) (short) 1);
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
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 1L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable6 = defaultBoxAndWhiskerCategoryDataset0.getRowKey((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number4 = defaultBoxAndWhiskerCategoryDataset0.getMinRegularValue(1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.Range range4 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener5);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener7);
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(range4);
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int1 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable8 = defaultBoxAndWhiskerCategoryDataset0.getRowKey((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
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
        org.jfree.data.general.DatasetChangeListener datasetChangeListener22 = null;
        defaultBoxAndWhiskerCategoryDataset8.addChangeListener(datasetChangeListener22);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number26 = defaultBoxAndWhiskerCategoryDataset8.getMaxRegularValue((java.lang.Comparable) "hi!", (java.lang.Comparable) 'a');
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (hi!) not recognised.");
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
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        java.util.List list5 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        int int9 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) ' ');
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener10);
        int int13 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 10);
        double double15 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener8);
        org.jfree.data.KeyedObjects2D keyedObjects2D10 = defaultBoxAndWhiskerCategoryDataset0.data;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number13 = defaultBoxAndWhiskerCategoryDataset0.getMeanValue(0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(keyedObjects2D7);
        org.junit.Assert.assertNotNull(keyedObjects2D10);
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.Range range4 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener6);
        int int9 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) 1.0d);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener10);
        java.util.List list12 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number15 = defaultBoxAndWhiskerCategoryDataset0.getMaxRegularValue((int) (short) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = defaultBoxAndWhiskerCategoryDataset0.clone();
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
        org.junit.Assert.assertTrue(Double.isNaN(double18));
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        double double8 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = defaultBoxAndWhiskerCategoryDataset0.getMinOutlier((int) (short) 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
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
            java.lang.Number number10 = defaultBoxAndWhiskerCategoryDataset0.getMeanValue((int) (byte) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        java.util.List list9 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D10 = defaultBoxAndWhiskerCategoryDataset0.data;
        java.lang.Class<?> wildcardClass11 = keyedObjects2D10.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(keyedObjects2D10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        java.util.List list4 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.Range range6 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        java.util.List list8 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = defaultBoxAndWhiskerCategoryDataset0.getQ3Value((-1), (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int1 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        java.util.EventListener eventListener4 = null;
        boolean boolean5 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener4);
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 1);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset8 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double10 = defaultBoxAndWhiskerCategoryDataset8.getRangeUpperBound(true);
        double double12 = defaultBoxAndWhiskerCategoryDataset8.getRangeLowerBound(true);
        defaultBoxAndWhiskerCategoryDataset8.validateObject();
        int int14 = defaultBoxAndWhiskerCategoryDataset8.getColumnCount();
        defaultBoxAndWhiskerCategoryDataset8.validateObject();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener16 = null;
        defaultBoxAndWhiskerCategoryDataset8.removeChangeListener(datasetChangeListener16);
        java.util.List list18 = defaultBoxAndWhiskerCategoryDataset8.getColumnKeys();
        java.lang.Comparable comparable20 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultBoxAndWhiskerCategoryDataset0.add(list18, (java.lang.Comparable) (-1), comparable20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'columnKey' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(list18);
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener4);
        java.util.EventListener eventListener6 = null;
        boolean boolean7 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener6);
        java.util.List list8 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
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
        int int25 = defaultBoxAndWhiskerCategoryDataset8.getRowIndex((java.lang.Comparable) (short) 10);
        org.jfree.data.statistics.BoxAndWhiskerItem boxAndWhiskerItem26 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultBoxAndWhiskerCategoryDataset8.add(boxAndWhiskerItem26, (java.lang.Comparable) (short) 100, (java.lang.Comparable) (short) 0);
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
        org.junit.Assert.assertNotNull(keyedObjects2D17);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number19 = defaultBoxAndWhiskerCategoryDataset9.getMaxOutlier((java.lang.Comparable) 100L, (java.lang.Comparable) 1.0f);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (100) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNotNull(keyedObjects2D14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(list16);
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetGroup datasetGroup3 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        boolean boolean5 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) (byte) 1);
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = defaultBoxAndWhiskerCategoryDataset0.data;
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 100);
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(datasetGroup3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(keyedObjects2D6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        java.util.List list9 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D10 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.general.DatasetGroup datasetGroup11 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(keyedObjects2D10);
        org.junit.Assert.assertNotNull(datasetGroup11);
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        java.util.List list3 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        java.util.List list4 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = defaultBoxAndWhiskerCategoryDataset0.getMaxRegularValue(0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
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
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        java.util.List list4 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = defaultBoxAndWhiskerCategoryDataset0.getValue((java.lang.Comparable) (-1.0f), (java.lang.Comparable) true);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (-1.0) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(list4);
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
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
            java.util.List list13 = defaultBoxAndWhiskerCategoryDataset0.getOutliers((int) (short) 1, (int) ' ');
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
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.general.DatasetGroup datasetGroup6 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 0L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = defaultBoxAndWhiskerCategoryDataset0.getMaxOutlier((int) (byte) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
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
        double double14 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        java.util.EventListener eventListener15 = null;
        boolean boolean16 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener15);
        java.util.EventListener eventListener17 = null;
        boolean boolean18 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener17);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener19 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener19);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener5);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2256");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 0L);
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        int int10 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number13 = defaultBoxAndWhiskerCategoryDataset0.getMaxOutlier((int) (short) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2257");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 0L);
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        java.util.List list4 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        java.lang.Object obj5 = defaultBoxAndWhiskerCategoryDataset0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = defaultBoxAndWhiskerCategoryDataset0.getQ3Value((int) (short) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2258");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 0L);
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        int int10 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D11 = defaultBoxAndWhiskerCategoryDataset0.data;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number14 = defaultBoxAndWhiskerCategoryDataset0.getQ1Value(0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(keyedObjects2D11);
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2259");
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
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        double double17 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(keyedObjects2D7);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNull(keyedObjects2D10);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2260");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        org.jfree.data.Range range6 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset7 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double9 = defaultBoxAndWhiskerCategoryDataset7.getRangeUpperBound(true);
        org.jfree.data.Range range11 = defaultBoxAndWhiskerCategoryDataset7.getRangeBounds(true);
        int int12 = defaultBoxAndWhiskerCategoryDataset7.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener13 = null;
        defaultBoxAndWhiskerCategoryDataset7.addChangeListener(datasetChangeListener13);
        int int15 = defaultBoxAndWhiskerCategoryDataset7.getRowCount();
        int int16 = defaultBoxAndWhiskerCategoryDataset7.getRowCount();
        java.util.List list17 = defaultBoxAndWhiskerCategoryDataset7.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            defaultBoxAndWhiskerCategoryDataset0.add(list17, (java.lang.Comparable) 100.0d, (java.lang.Comparable) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Range(double, double): require lower (Infinity) <= upper (-Infinity).");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(datasetGroup4);
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(list17);
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2261");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        java.util.List list9 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.statistics.BoxAndWhiskerItem boxAndWhiskerItem12 = defaultBoxAndWhiskerCategoryDataset0.getItem((int) (short) 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2262");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.Range range4 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener6);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener8);
        int int11 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) "");
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2263");
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
        java.util.EventListener eventListener16 = null;
        boolean boolean17 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener16);
        java.lang.Class<?> wildcardClass18 = defaultBoxAndWhiskerCategoryDataset0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(keyedObjects2D7);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNull(keyedObjects2D10);
        org.junit.Assert.assertNotNull(datasetGroup12);
        org.junit.Assert.assertNotNull(datasetGroup13);
        org.junit.Assert.assertNull(keyedObjects2D15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2264");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener4);
        java.lang.Object obj6 = defaultBoxAndWhiskerCategoryDataset0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = defaultBoxAndWhiskerCategoryDataset0.getQ1Value(100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2265");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D7;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset9 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener10 = null;
        boolean boolean11 = defaultBoxAndWhiskerCategoryDataset9.hasListener(eventListener10);
        int int13 = defaultBoxAndWhiskerCategoryDataset9.getRowIndex((java.lang.Comparable) 10L);
        int int14 = defaultBoxAndWhiskerCategoryDataset9.getRowCount();
        int int15 = defaultBoxAndWhiskerCategoryDataset9.getColumnCount();
        int int16 = defaultBoxAndWhiskerCategoryDataset9.getColumnCount();
        int int18 = defaultBoxAndWhiskerCategoryDataset9.getRowIndex((java.lang.Comparable) 100.0d);
        java.util.List list19 = defaultBoxAndWhiskerCategoryDataset9.getColumnKeys();
        boolean boolean20 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable22 = defaultBoxAndWhiskerCategoryDataset9.getRowKey(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2266");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = defaultBoxAndWhiskerCategoryDataset0.data;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable7 = defaultBoxAndWhiskerCategoryDataset0.getColumnKey((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(keyedObjects2D5);
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2267");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = defaultBoxAndWhiskerCategoryDataset0.data;
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset8 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D9 = null;
        defaultBoxAndWhiskerCategoryDataset8.data = keyedObjects2D9;
        org.jfree.data.KeyedObjects2D keyedObjects2D11 = null;
        defaultBoxAndWhiskerCategoryDataset8.data = keyedObjects2D11;
        org.jfree.data.KeyedObjects2D keyedObjects2D13 = defaultBoxAndWhiskerCategoryDataset8.data;
        double double15 = defaultBoxAndWhiskerCategoryDataset8.getRangeLowerBound(false);
        org.jfree.data.KeyedObjects2D keyedObjects2D16 = defaultBoxAndWhiskerCategoryDataset8.data;
        boolean boolean17 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) keyedObjects2D16);
        int int19 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 10);
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(keyedObjects2D5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(keyedObjects2D13);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertNull(keyedObjects2D16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2268");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable2 = defaultBoxAndWhiskerCategoryDataset0.getColumnKey(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2269");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number7 = defaultBoxAndWhiskerCategoryDataset0.getQ3Value(100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2270");
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
        org.jfree.data.KeyedObjects2D keyedObjects2D10 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener11);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number16 = defaultBoxAndWhiskerCategoryDataset0.getMaxOutlier((int) (short) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(keyedObjects2D7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(keyedObjects2D10);
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2271");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        java.util.List list7 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        int int9 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2272");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10L);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) '4');
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset8 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D9 = null;
        defaultBoxAndWhiskerCategoryDataset8.data = keyedObjects2D9;
        org.jfree.data.KeyedObjects2D keyedObjects2D11 = null;
        defaultBoxAndWhiskerCategoryDataset8.data = keyedObjects2D11;
        org.jfree.data.KeyedObjects2D keyedObjects2D13 = defaultBoxAndWhiskerCategoryDataset8.data;
        double double15 = defaultBoxAndWhiskerCategoryDataset8.getRangeLowerBound(false);
        org.jfree.data.KeyedObjects2D keyedObjects2D16 = defaultBoxAndWhiskerCategoryDataset8.data;
        java.util.EventListener eventListener17 = null;
        boolean boolean18 = defaultBoxAndWhiskerCategoryDataset8.hasListener(eventListener17);
        org.jfree.data.general.DatasetGroup datasetGroup19 = defaultBoxAndWhiskerCategoryDataset8.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup19);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number23 = defaultBoxAndWhiskerCategoryDataset0.getQ1Value((int) ' ', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(keyedObjects2D13);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertNull(keyedObjects2D16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(datasetGroup19);
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2273");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener4);
        java.util.EventListener eventListener6 = null;
        boolean boolean7 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener6);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset8 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double10 = defaultBoxAndWhiskerCategoryDataset8.getRangeUpperBound(true);
        defaultBoxAndWhiskerCategoryDataset8.validateObject();
        int int13 = defaultBoxAndWhiskerCategoryDataset8.getRowIndex((java.lang.Comparable) (-1L));
        double double15 = defaultBoxAndWhiskerCategoryDataset8.getRangeUpperBound(true);
        java.util.List list16 = defaultBoxAndWhiskerCategoryDataset8.getRowKeys();
        java.util.List list17 = defaultBoxAndWhiskerCategoryDataset8.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            defaultBoxAndWhiskerCategoryDataset0.add(list17, (java.lang.Comparable) ' ', (java.lang.Comparable) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Range(double, double): require lower (Infinity) <= upper (-Infinity).");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNotNull(list17);
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2274");
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
        java.util.EventListener eventListener23 = null;
        boolean boolean24 = defaultBoxAndWhiskerCategoryDataset22.hasListener(eventListener23);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener25 = null;
        defaultBoxAndWhiskerCategoryDataset22.removeChangeListener(datasetChangeListener25);
        int int28 = defaultBoxAndWhiskerCategoryDataset22.getRowIndex((java.lang.Comparable) (byte) 1);
        double double30 = defaultBoxAndWhiskerCategoryDataset22.getRangeLowerBound(true);
        double double32 = defaultBoxAndWhiskerCategoryDataset22.getRangeLowerBound(true);
        java.util.List list33 = defaultBoxAndWhiskerCategoryDataset22.getColumnKeys();
        int int35 = defaultBoxAndWhiskerCategoryDataset22.getColumnIndex((java.lang.Comparable) 10.0d);
        java.util.List list36 = defaultBoxAndWhiskerCategoryDataset22.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            defaultBoxAndWhiskerCategoryDataset8.add(list36, (java.lang.Comparable) (-1.0f), (java.lang.Comparable) 'a');
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertNotNull(list33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(list36);
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2275");
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
        java.util.List list19 = defaultBoxAndWhiskerCategoryDataset8.getRowKeys();
        int int21 = defaultBoxAndWhiskerCategoryDataset8.getColumnIndex((java.lang.Comparable) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number24 = defaultBoxAndWhiskerCategoryDataset8.getMinOutlier((int) (byte) 0, (int) (short) 100);
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
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2276");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        java.lang.Object obj5 = defaultBoxAndWhiskerCategoryDataset0.clone();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset6 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double8 = defaultBoxAndWhiskerCategoryDataset6.getRangeUpperBound(true);
        int int9 = defaultBoxAndWhiskerCategoryDataset6.getColumnCount();
        double double11 = defaultBoxAndWhiskerCategoryDataset6.getRangeLowerBound(true);
        double double13 = defaultBoxAndWhiskerCategoryDataset6.getRangeUpperBound(false);
        org.jfree.data.Range range15 = defaultBoxAndWhiskerCategoryDataset6.getRangeBounds(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener16 = null;
        defaultBoxAndWhiskerCategoryDataset6.removeChangeListener(datasetChangeListener16);
        java.util.EventListener eventListener18 = null;
        boolean boolean19 = defaultBoxAndWhiskerCategoryDataset6.hasListener(eventListener18);
        double double21 = defaultBoxAndWhiskerCategoryDataset6.getRangeLowerBound(true);
        java.util.List list22 = defaultBoxAndWhiskerCategoryDataset6.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            defaultBoxAndWhiskerCategoryDataset0.add(list22, (java.lang.Comparable) 1.0f, (java.lang.Comparable) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Range(double, double): require lower (Infinity) <= upper (-Infinity).");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNotNull(list22);
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2277");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        java.util.List list3 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(list3);
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2278");
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
            java.lang.Comparable comparable11 = defaultBoxAndWhiskerCategoryDataset0.getColumnKey((int) (byte) 1);
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
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2279");
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
        double double19 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.statistics.BoxAndWhiskerItem boxAndWhiskerItem22 = defaultBoxAndWhiskerCategoryDataset0.getItem(10, (int) (byte) 1);
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
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2280");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = defaultBoxAndWhiskerCategoryDataset0.data;
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        java.util.List list4 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number7 = defaultBoxAndWhiskerCategoryDataset0.getMaxRegularValue((java.lang.Comparable) 10, (java.lang.Comparable) 1L);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (10) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(keyedObjects2D1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(list4);
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2281");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = defaultBoxAndWhiskerCategoryDataset0.data;
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        java.util.List list5 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = defaultBoxAndWhiskerCategoryDataset0.getQ3Value((java.lang.Comparable) false, (java.lang.Comparable) '4');
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (false) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(keyedObjects2D1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(list5);
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2282");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 0L);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 1.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number7 = defaultBoxAndWhiskerCategoryDataset0.getMedianValue((java.lang.Comparable) 100, (java.lang.Comparable) 1.0f);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (100) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2283");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = defaultBoxAndWhiskerCategoryDataset0.getQ3Value((java.lang.Comparable) 100.0f, (java.lang.Comparable) 100);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (100.0) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2284");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        java.util.EventListener eventListener5 = null;
        boolean boolean6 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener5);
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = defaultBoxAndWhiskerCategoryDataset0.getQ3Value((java.lang.Comparable) 100.0f, (java.lang.Comparable) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (100.0) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2285");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        java.lang.Object obj4 = defaultBoxAndWhiskerCategoryDataset0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number7 = defaultBoxAndWhiskerCategoryDataset0.getMedianValue((int) '4', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(obj4);
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2286");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = defaultBoxAndWhiskerCategoryDataset0.data;
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = defaultBoxAndWhiskerCategoryDataset0.getQ1Value((java.lang.Comparable) "", (java.lang.Comparable) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(keyedObjects2D5);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2287");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10L);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) "hi!");
        java.util.List list7 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = defaultBoxAndWhiskerCategoryDataset0.getValue((int) ' ', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list7);
    }

    @Test
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2288");
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
            java.lang.Comparable comparable11 = defaultBoxAndWhiskerCategoryDataset0.getColumnKey((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2289");
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
            java.lang.Number number12 = defaultBoxAndWhiskerCategoryDataset0.getQ3Value((java.lang.Comparable) 10.0f, (java.lang.Comparable) 0.0d);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (10.0) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2290");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int1 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) '4');
        org.jfree.data.Range range6 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        java.util.EventListener eventListener7 = null;
        boolean boolean8 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener7);
        int int10 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) (-1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2291");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10L);
        org.jfree.data.Range range7 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = defaultBoxAndWhiskerCategoryDataset0.getMedianValue((int) (short) 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2292");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetGroup datasetGroup3 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = defaultBoxAndWhiskerCategoryDataset0.getMeanValue(100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(datasetGroup3);
    }

    @Test
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2293");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int1 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        java.util.List list3 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        java.util.EventListener eventListener4 = null;
        boolean boolean5 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener4);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2294");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener5);
        double double8 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        org.jfree.data.general.DatasetGroup datasetGroup9 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertNotNull(datasetGroup9);
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2295");
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
        int int17 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        double double19 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.general.DatasetGroup datasetGroup20 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
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
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertNotNull(datasetGroup20);
    }

    @Test
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2296");
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
        org.jfree.data.general.DatasetChangeListener datasetChangeListener13 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number17 = defaultBoxAndWhiskerCategoryDataset0.getMinRegularValue((int) ' ', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
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
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2297");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.Range range4 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener6);
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int9 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        java.util.List list10 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.Range range12 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        java.lang.Object obj13 = defaultBoxAndWhiskerCategoryDataset0.clone();
        java.lang.Comparable comparable15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number16 = defaultBoxAndWhiskerCategoryDataset0.getMinRegularValue((java.lang.Comparable) (-1L), comparable15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'columnKey' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2298");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (short) 100);
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        double double8 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2299");
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
        java.util.List list16 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        java.lang.Class<?> wildcardClass17 = list16.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2300");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.Range range4 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        java.util.List list5 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) -1);
        org.jfree.data.general.DatasetGroup datasetGroup8 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = defaultBoxAndWhiskerCategoryDataset0.getMaxOutlier((int) '#', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup8);
    }

    @Test
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2301");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10L);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) 10.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D9 = defaultBoxAndWhiskerCategoryDataset0.data;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = defaultBoxAndWhiskerCategoryDataset0.getMinOutlier((int) (short) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(keyedObjects2D9);
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2302");
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
            java.lang.Number number20 = defaultBoxAndWhiskerCategoryDataset0.getMaxOutlier((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0f);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (100) not recognised.");
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
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2303");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) "");
        int int10 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 0.0d);
        double double12 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(datasetGroup4);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2304");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        boolean boolean4 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) 100L);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener5);
        org.jfree.data.general.DatasetGroup datasetGroup7 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        org.jfree.data.statistics.BoxAndWhiskerItem boxAndWhiskerItem8 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultBoxAndWhiskerCategoryDataset0.add(boxAndWhiskerItem8, (java.lang.Comparable) (-1.0f), (java.lang.Comparable) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(datasetGroup7);
    }

    @Test
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2305");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int1 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number7 = defaultBoxAndWhiskerCategoryDataset0.getMaxOutlier((java.lang.Comparable) true, (java.lang.Comparable) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (true) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2306");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        java.util.EventListener eventListener5 = null;
        boolean boolean6 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener5);
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener10);
        int int13 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2307");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener5);
        double double8 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable10 = defaultBoxAndWhiskerCategoryDataset0.getRowKey(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2308");
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
        java.lang.Class<?> wildcardClass21 = range20.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNull(keyedObjects2D7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(keyedObjects2D17);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2309");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener8);
        org.jfree.data.KeyedObjects2D keyedObjects2D10 = defaultBoxAndWhiskerCategoryDataset0.data;
        int int12 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number15 = defaultBoxAndWhiskerCategoryDataset0.getMedianValue((java.lang.Comparable) (-1.0f), (java.lang.Comparable) 100.0d);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (-1.0) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(keyedObjects2D7);
        org.junit.Assert.assertNotNull(keyedObjects2D10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2310");
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
        org.jfree.data.general.DatasetChangeListener datasetChangeListener17 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number21 = defaultBoxAndWhiskerCategoryDataset0.getQ3Value((int) (short) 1, (int) (byte) 10);
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
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2311");
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
            java.lang.Comparable comparable12 = defaultBoxAndWhiskerCategoryDataset0.getRowKey(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2312");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset7 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup8 = defaultBoxAndWhiskerCategoryDataset7.getGroup();
        double double10 = defaultBoxAndWhiskerCategoryDataset7.getRangeLowerBound(false);
        int int12 = defaultBoxAndWhiskerCategoryDataset7.getRowIndex((java.lang.Comparable) Double.NaN);
        double double14 = defaultBoxAndWhiskerCategoryDataset7.getRangeUpperBound(false);
        java.util.List list15 = defaultBoxAndWhiskerCategoryDataset7.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            defaultBoxAndWhiskerCategoryDataset0.add(list15, (java.lang.Comparable) 100L, (java.lang.Comparable) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Range(double, double): require lower (Infinity) <= upper (-Infinity).");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(datasetGroup8);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2313");
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
            java.util.List list10 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup9);
    }

    @Test
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2314");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) Double.NaN);
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = defaultBoxAndWhiskerCategoryDataset0.getMaxOutlier((int) (byte) 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2315");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        java.util.List list5 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        int int9 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) ' ');
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener10);
        int int13 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.statistics.BoxAndWhiskerItem boxAndWhiskerItem16 = defaultBoxAndWhiskerCategoryDataset0.getItem((int) (byte) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2316");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        java.util.EventListener eventListener4 = null;
        boolean boolean5 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = defaultBoxAndWhiskerCategoryDataset0.getMedianValue((int) (byte) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2317");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener5);
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 1L);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        java.util.List list10 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test2318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2318");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10L);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.Range range8 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        int int9 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2319");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        java.util.EventListener eventListener4 = null;
        boolean boolean5 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener4);
        java.util.List list6 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 100L);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener9 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener9);
        int int11 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2320");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        java.util.List list7 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        java.lang.Object obj9 = defaultBoxAndWhiskerCategoryDataset0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = defaultBoxAndWhiskerCategoryDataset0.getMaxRegularValue((java.lang.Comparable) 0, (java.lang.Comparable) "hi!");
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (0) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test2321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2321");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener4);
        org.jfree.data.general.DatasetGroup datasetGroup6 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = defaultBoxAndWhiskerCategoryDataset0.getQ1Value(100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(datasetGroup6);
    }

    @Test
    public void test2322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2322");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (-1L));
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.general.DatasetGroup datasetGroup9 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener10);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(datasetGroup9);
    }

    @Test
    public void test2323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2323");
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
        java.util.List list18 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        org.jfree.data.general.DatasetGroup datasetGroup19 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number22 = defaultBoxAndWhiskerCategoryDataset0.getMaxRegularValue((int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
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
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNotNull(datasetGroup19);
    }

    @Test
    public void test2324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2324");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int1 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) '4');
        org.jfree.data.Range range6 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = defaultBoxAndWhiskerCategoryDataset0.getMinOutlier((int) (short) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(range6);
    }

    @Test
    public void test2325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2325");
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
        java.util.List list18 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        org.jfree.data.general.DatasetGroup datasetGroup19 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number22 = defaultBoxAndWhiskerCategoryDataset0.getMinRegularValue(1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
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
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNotNull(datasetGroup19);
    }

    @Test
    public void test2326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2326");
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
        java.lang.Class<?> wildcardClass18 = defaultBoxAndWhiskerCategoryDataset0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2327");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number16 = defaultBoxAndWhiskerCategoryDataset0.getMedianValue((-1), 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test2328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2328");
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
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener11);
        java.util.EventListener eventListener13 = null;
        boolean boolean14 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener13);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset15 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener16 = null;
        boolean boolean17 = defaultBoxAndWhiskerCategoryDataset15.hasListener(eventListener16);
        int int19 = defaultBoxAndWhiskerCategoryDataset15.getRowIndex((java.lang.Comparable) (short) 100);
        java.util.List list20 = defaultBoxAndWhiskerCategoryDataset15.getColumnKeys();
        double double22 = defaultBoxAndWhiskerCategoryDataset15.getRangeUpperBound(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener23 = null;
        defaultBoxAndWhiskerCategoryDataset15.addChangeListener(datasetChangeListener23);
        boolean boolean25 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset15);
        org.junit.Assert.assertNull(keyedObjects2D5);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test2329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2329");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10L);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) 10.0f);
        double double10 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        int int11 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        double double13 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
    }

    @Test
    public void test2330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2330");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        java.util.EventListener eventListener5 = null;
        boolean boolean6 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener5);
        org.jfree.data.general.DatasetGroup datasetGroup7 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        org.jfree.data.Range range9 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        double double11 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener12);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(datasetGroup7);
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test2331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2331");
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
            java.lang.Number number12 = defaultBoxAndWhiskerCategoryDataset0.getMaxOutlier((java.lang.Comparable) 1.0d, (java.lang.Comparable) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (1.0) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(datasetGroup9);
    }

    @Test
    public void test2332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2332");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        java.util.EventListener eventListener8 = null;
        boolean boolean9 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener8);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2333");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener1);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) "");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.statistics.BoxAndWhiskerItem boxAndWhiskerItem7 = defaultBoxAndWhiskerCategoryDataset0.getItem((int) (byte) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test2334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2334");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        java.util.List list4 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.Range range6 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        double double8 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener9 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number13 = defaultBoxAndWhiskerCategoryDataset0.getValue((java.lang.Comparable) (-1.0f), (java.lang.Comparable) true);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (-1.0) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test2335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2335");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) Double.NaN);
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = defaultBoxAndWhiskerCategoryDataset0.data;
        java.util.List list9 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        java.util.List list10 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(keyedObjects2D8);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test2336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2336");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.Range range6 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        org.jfree.data.Range range8 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertNotNull(range8);
    }

    @Test
    public void test2337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2337");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        java.util.List list5 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        java.util.List list10 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        org.jfree.data.general.DatasetGroup datasetGroup11 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(datasetGroup11);
    }

    @Test
    public void test2338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2338");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = defaultBoxAndWhiskerCategoryDataset0.data;
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        double double8 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = defaultBoxAndWhiskerCategoryDataset0.getValue((int) ' ', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(keyedObjects2D5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test2339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2339");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetGroup datasetGroup3 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        boolean boolean5 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) (byte) 1);
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = defaultBoxAndWhiskerCategoryDataset0.data;
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(datasetGroup3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(keyedObjects2D6);
    }

    @Test
    public void test2340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2340");
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
        int int22 = defaultBoxAndWhiskerCategoryDataset8.getColumnIndex((java.lang.Comparable) (-1.0d));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number25 = defaultBoxAndWhiskerCategoryDataset8.getMedianValue((java.lang.Comparable) 0.0d, (java.lang.Comparable) (-1.0d));
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (0.0) not recognised.");
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test2341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2341");
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
        int int15 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 1);
        int int17 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number20 = defaultBoxAndWhiskerCategoryDataset0.getMinRegularValue((int) (short) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test2342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2342");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.Range range7 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        java.util.EventListener eventListener9 = null;
        boolean boolean10 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener9);
        java.lang.Class<?> wildcardClass11 = defaultBoxAndWhiskerCategoryDataset0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2343");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = defaultBoxAndWhiskerCategoryDataset0.getQ3Value((java.lang.Comparable) (-1L), (java.lang.Comparable) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (-1) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2344");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list5 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2345");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        java.util.List list4 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable8 = defaultBoxAndWhiskerCategoryDataset0.getRowKey(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test2346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2346");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        double double8 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        double double10 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.Range range12 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        double double14 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number17 = defaultBoxAndWhiskerCategoryDataset0.getQ3Value((java.lang.Comparable) (short) 0, (java.lang.Comparable) '#');
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (0) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
    }

    @Test
    public void test2347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2347");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10L);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) 10.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D9 = defaultBoxAndWhiskerCategoryDataset0.data;
        int int10 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset11 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener12 = null;
        boolean boolean13 = defaultBoxAndWhiskerCategoryDataset11.hasListener(eventListener12);
        int int15 = defaultBoxAndWhiskerCategoryDataset11.getRowIndex((java.lang.Comparable) 10L);
        int int16 = defaultBoxAndWhiskerCategoryDataset11.getRowCount();
        int int17 = defaultBoxAndWhiskerCategoryDataset11.getColumnCount();
        int int18 = defaultBoxAndWhiskerCategoryDataset11.getColumnCount();
        int int20 = defaultBoxAndWhiskerCategoryDataset11.getRowIndex((java.lang.Comparable) 100.0d);
        java.util.List list21 = defaultBoxAndWhiskerCategoryDataset11.getColumnKeys();
        java.util.List list22 = defaultBoxAndWhiskerCategoryDataset11.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            defaultBoxAndWhiskerCategoryDataset0.add(list22, (java.lang.Comparable) 100.0f, (java.lang.Comparable) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Range(double, double): require lower (Infinity) <= upper (-Infinity).");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(keyedObjects2D9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNotNull(list22);
    }

    @Test
    public void test2348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2348");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.Range range7 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable11 = defaultBoxAndWhiskerCategoryDataset0.getColumnKey((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test2349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2349");
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
        int int15 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number18 = defaultBoxAndWhiskerCategoryDataset0.getMinRegularValue((java.lang.Comparable) Double.NaN, (java.lang.Comparable) 100);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (NaN) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2350");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10L);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) '4');
        java.util.EventListener eventListener8 = null;
        boolean boolean9 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener8);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list12 = defaultBoxAndWhiskerCategoryDataset0.getOutliers((java.lang.Comparable) 10.0d, (java.lang.Comparable) 100.0f);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (10.0) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2351");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.Range range4 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener5);
        org.jfree.data.Range range8 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        java.util.EventListener eventListener9 = null;
        boolean boolean10 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener9);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener11);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.statistics.BoxAndWhiskerItem boxAndWhiskerItem15 = defaultBoxAndWhiskerCategoryDataset0.getItem(0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2352");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10L);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        int int9 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 100.0d);
        int int11 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) 1.0f);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener12);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test2353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2353");
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
        double double13 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.junit.Assert.assertNull(keyedObjects2D5);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNull(keyedObjects2D8);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
    }

    @Test
    public void test2354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2354");
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
        int int13 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number16 = defaultBoxAndWhiskerCategoryDataset0.getQ3Value((java.lang.Comparable) 1L, (java.lang.Comparable) 10L);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (1) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test2355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2355");
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
        java.util.List list19 = defaultBoxAndWhiskerCategoryDataset8.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number22 = defaultBoxAndWhiskerCategoryDataset8.getMaxOutlier((java.lang.Comparable) 10.0f, (java.lang.Comparable) "");
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(list19);
    }

    @Test
    public void test2356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2356");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener4);
        java.util.EventListener eventListener6 = null;
        boolean boolean7 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener6);
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.statistics.BoxAndWhiskerItem boxAndWhiskerItem9 = null;
        java.lang.Comparable comparable11 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultBoxAndWhiskerCategoryDataset0.add(boxAndWhiskerItem9, (java.lang.Comparable) 0.0f, comparable11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'columnKey' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2357");
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
        org.jfree.data.general.DatasetChangeListener datasetChangeListener13 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener13);
        int int15 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list18 = defaultBoxAndWhiskerCategoryDataset0.getOutliers((java.lang.Comparable) (byte) 0, (java.lang.Comparable) 100);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (0) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2358");
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
            java.lang.Number number21 = defaultBoxAndWhiskerCategoryDataset0.getMinRegularValue((-1), (int) (byte) 100);
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
    public void test2359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2359");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int1 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10.0d);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        java.lang.Comparable comparable8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = defaultBoxAndWhiskerCategoryDataset0.getQ3Value((java.lang.Comparable) 10.0f, comparable8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'columnKey' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2360");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int1 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup2 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        java.lang.Object obj5 = defaultBoxAndWhiskerCategoryDataset0.clone();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(datasetGroup2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test2361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2361");
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
        org.jfree.data.Range range20 = defaultBoxAndWhiskerCategoryDataset8.getRangeBounds(false);
        int int22 = defaultBoxAndWhiskerCategoryDataset8.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.statistics.BoxAndWhiskerItem boxAndWhiskerItem23 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultBoxAndWhiskerCategoryDataset8.add(boxAndWhiskerItem23, (java.lang.Comparable) '4', (java.lang.Comparable) 'a');
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
        org.junit.Assert.assertNotNull(keyedObjects2D17);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test2362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2362");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (short) 100);
        java.util.List list5 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.Range range9 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        double double11 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list14 = defaultBoxAndWhiskerCategoryDataset0.getOutliers((int) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test2363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2363");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 0L);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 1.0f);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener5);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener8);
        org.jfree.data.KeyedObjects2D keyedObjects2D10 = defaultBoxAndWhiskerCategoryDataset0.data;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number13 = defaultBoxAndWhiskerCategoryDataset0.getMinOutlier((int) ' ', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(keyedObjects2D10);
    }

    @Test
    public void test2364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2364");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.Range range4 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener6);
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int10 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable12 = defaultBoxAndWhiskerCategoryDataset0.getColumnKey((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2365");
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
            java.lang.Comparable comparable12 = defaultBoxAndWhiskerCategoryDataset0.getRowKey((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2366");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.Range range4 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener6);
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int9 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        java.util.List list10 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.Range range12 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        java.lang.Object obj13 = defaultBoxAndWhiskerCategoryDataset0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number16 = defaultBoxAndWhiskerCategoryDataset0.getMinRegularValue(1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test2367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2367");
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
        org.jfree.data.KeyedObjects2D keyedObjects2D13 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(keyedObjects2D5);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(datasetGroup9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(keyedObjects2D13);
    }

    @Test
    public void test2368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2368");
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
            java.lang.Number number16 = defaultBoxAndWhiskerCategoryDataset0.getMinRegularValue((int) (short) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
    }

    @Test
    public void test2369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2369");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        java.util.EventListener eventListener4 = null;
        boolean boolean5 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = defaultBoxAndWhiskerCategoryDataset0.getMinRegularValue((java.lang.Comparable) 10L, (java.lang.Comparable) 100.0f);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (10) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2370");
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
            java.util.List list15 = defaultBoxAndWhiskerCategoryDataset0.getOutliers((java.lang.Comparable) (byte) 10, (java.lang.Comparable) 100);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (10) not recognised.");
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
    public void test2371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2371");
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
        org.jfree.data.KeyedObjects2D keyedObjects2D10 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.general.DatasetGroup datasetGroup11 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double13 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        java.lang.Comparable comparable14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number16 = defaultBoxAndWhiskerCategoryDataset0.getMedianValue(comparable14, (java.lang.Comparable) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(keyedObjects2D7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(keyedObjects2D10);
        org.junit.Assert.assertNotNull(datasetGroup11);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
    }

    @Test
    public void test2372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2372");
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
        int int13 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 1);
        java.lang.Object obj14 = defaultBoxAndWhiskerCategoryDataset0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable16 = defaultBoxAndWhiskerCategoryDataset0.getRowKey((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test2373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2373");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int10 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 1L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number13 = defaultBoxAndWhiskerCategoryDataset0.getMaxRegularValue((java.lang.Comparable) 0.0d, (java.lang.Comparable) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (0.0) not recognised.");
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
    public void test2374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2374");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.Range range4 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener6);
        int int9 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) 1.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = defaultBoxAndWhiskerCategoryDataset0.getMeanValue((int) (short) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test2375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2375");
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
            java.lang.Number number24 = defaultBoxAndWhiskerCategoryDataset8.getQ3Value((int) (byte) 0, (int) ' ');
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
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertNotNull(obj21);
    }

    @Test
    public void test2376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2376");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D7;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset9 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener10 = null;
        boolean boolean11 = defaultBoxAndWhiskerCategoryDataset9.hasListener(eventListener10);
        int int13 = defaultBoxAndWhiskerCategoryDataset9.getRowIndex((java.lang.Comparable) 10L);
        int int14 = defaultBoxAndWhiskerCategoryDataset9.getRowCount();
        int int15 = defaultBoxAndWhiskerCategoryDataset9.getColumnCount();
        int int16 = defaultBoxAndWhiskerCategoryDataset9.getColumnCount();
        int int18 = defaultBoxAndWhiskerCategoryDataset9.getRowIndex((java.lang.Comparable) 100.0d);
        java.util.List list19 = defaultBoxAndWhiskerCategoryDataset9.getColumnKeys();
        boolean boolean20 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset9);
        java.util.List list21 = defaultBoxAndWhiskerCategoryDataset9.getRowKeys();
        org.jfree.data.general.DatasetGroup datasetGroup22 = defaultBoxAndWhiskerCategoryDataset9.getGroup();
        java.util.List list23 = defaultBoxAndWhiskerCategoryDataset9.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number26 = defaultBoxAndWhiskerCategoryDataset9.getMaxRegularValue((java.lang.Comparable) "", (java.lang.Comparable) "hi!");
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key () not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNotNull(datasetGroup22);
        org.junit.Assert.assertNotNull(list23);
    }

    @Test
    public void test2377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2377");
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
            java.lang.Number number12 = defaultBoxAndWhiskerCategoryDataset0.getMinRegularValue((java.lang.Comparable) 0, (java.lang.Comparable) 1.0d);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (0) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test2378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2378");
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
        double double19 = defaultBoxAndWhiskerCategoryDataset8.getRangeUpperBound(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number22 = defaultBoxAndWhiskerCategoryDataset8.getMaxOutlier((int) (byte) 1, (int) (short) 0);
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
        org.junit.Assert.assertTrue(Double.isNaN(double19));
    }

    @Test
    public void test2379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2379");
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
        double double12 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list13 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
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
    public void test2380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2380");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener5);
        java.lang.Class<?> wildcardClass7 = defaultBoxAndWhiskerCategoryDataset0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2381");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        java.util.EventListener eventListener4 = null;
        boolean boolean5 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener4);
        java.util.List list6 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 100L);
        java.util.List list9 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        java.util.List list10 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        org.jfree.data.statistics.BoxAndWhiskerItem boxAndWhiskerItem11 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultBoxAndWhiskerCategoryDataset0.add(boxAndWhiskerItem11, (java.lang.Comparable) 0.0f, (java.lang.Comparable) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test2382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2382");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        java.lang.Comparable comparable7 = null;
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex(comparable7);
        java.lang.Comparable comparable10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = defaultBoxAndWhiskerCategoryDataset0.getMinRegularValue((java.lang.Comparable) (short) 1, comparable10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'columnKey' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(datasetGroup4);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test2383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2383");
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
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener11);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset13 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener14 = null;
        boolean boolean15 = defaultBoxAndWhiskerCategoryDataset13.hasListener(eventListener14);
        int int17 = defaultBoxAndWhiskerCategoryDataset13.getRowIndex((java.lang.Comparable) 10L);
        int int18 = defaultBoxAndWhiskerCategoryDataset13.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup19 = defaultBoxAndWhiskerCategoryDataset13.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup19);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable22 = defaultBoxAndWhiskerCategoryDataset0.getColumnKey(100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(keyedObjects2D5);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(datasetGroup19);
    }

    @Test
    public void test2384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2384");
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
            java.lang.Number number23 = defaultBoxAndWhiskerCategoryDataset0.getQ3Value((java.lang.Comparable) Double.NaN, (java.lang.Comparable) (-1L));
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
    public void test2385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2385");
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
        int int18 = defaultBoxAndWhiskerCategoryDataset9.getColumnIndex((java.lang.Comparable) true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable20 = defaultBoxAndWhiskerCategoryDataset9.getRowKey(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
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
    public void test2386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2386");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10L);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = defaultBoxAndWhiskerCategoryDataset0.getMedianValue((java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1.0d);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (-1.0) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2387");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = defaultBoxAndWhiskerCategoryDataset0.data;
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.Range range8 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        int int10 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset11 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener12 = null;
        boolean boolean13 = defaultBoxAndWhiskerCategoryDataset11.hasListener(eventListener12);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener14 = null;
        defaultBoxAndWhiskerCategoryDataset11.removeChangeListener(datasetChangeListener14);
        java.util.List list16 = defaultBoxAndWhiskerCategoryDataset11.getColumnKeys();
        int int18 = defaultBoxAndWhiskerCategoryDataset11.getRowIndex((java.lang.Comparable) (byte) 1);
        double double20 = defaultBoxAndWhiskerCategoryDataset11.getRangeLowerBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener21 = null;
        defaultBoxAndWhiskerCategoryDataset11.removeChangeListener(datasetChangeListener21);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener23 = null;
        defaultBoxAndWhiskerCategoryDataset11.addChangeListener(datasetChangeListener23);
        java.util.List list25 = defaultBoxAndWhiskerCategoryDataset11.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            defaultBoxAndWhiskerCategoryDataset0.add(list25, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Range(double, double): require lower (Infinity) <= upper (-Infinity).");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(keyedObjects2D5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertNotNull(list25);
    }

    @Test
    public void test2388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2388");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        java.util.List list9 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D10 = defaultBoxAndWhiskerCategoryDataset0.data;
        int int11 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number14 = defaultBoxAndWhiskerCategoryDataset0.getMinOutlier(10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(keyedObjects2D10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2389");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int1 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup2 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        java.util.List list4 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number7 = defaultBoxAndWhiskerCategoryDataset0.getMeanValue((int) (short) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(datasetGroup2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(list4);
    }

    @Test
    public void test2390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2390");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) "hi!");
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        java.util.EventListener eventListener7 = null;
        boolean boolean8 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener7);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.general.DatasetGroup datasetGroup10 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset11 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double13 = defaultBoxAndWhiskerCategoryDataset11.getRangeUpperBound(true);
        double double15 = defaultBoxAndWhiskerCategoryDataset11.getRangeLowerBound(true);
        defaultBoxAndWhiskerCategoryDataset11.validateObject();
        double double18 = defaultBoxAndWhiskerCategoryDataset11.getRangeUpperBound(false);
        int int19 = defaultBoxAndWhiskerCategoryDataset11.getRowCount();
        int int21 = defaultBoxAndWhiskerCategoryDataset11.getColumnIndex((java.lang.Comparable) 'a');
        org.jfree.data.Range range23 = defaultBoxAndWhiskerCategoryDataset11.getRangeBounds(false);
        java.util.List list24 = defaultBoxAndWhiskerCategoryDataset11.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            defaultBoxAndWhiskerCategoryDataset0.add(list24, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Range(double, double): require lower (Infinity) <= upper (-Infinity).");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(datasetGroup10);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertNotNull(list24);
    }

    @Test
    public void test2391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2391");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number14 = defaultBoxAndWhiskerCategoryDataset0.getValue(100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
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
    public void test2392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2392");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (short) 100);
        java.util.List list5 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.Range range9 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        double double11 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number14 = defaultBoxAndWhiskerCategoryDataset0.getMinOutlier((java.lang.Comparable) (byte) 100, (java.lang.Comparable) (-1.0d));
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (100) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test2393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2393");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (-1L));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = defaultBoxAndWhiskerCategoryDataset0.getMeanValue((java.lang.Comparable) 100.0f, (java.lang.Comparable) true);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (100.0) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test2394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2394");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number5 = defaultBoxAndWhiskerCategoryDataset0.getMaxRegularValue((int) (short) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2395");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetGroup datasetGroup3 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener4);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = defaultBoxAndWhiskerCategoryDataset0.getMaxRegularValue(0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(datasetGroup3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2396");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = defaultBoxAndWhiskerCategoryDataset0.data;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(keyedObjects2D5);
        org.junit.Assert.assertNull(keyedObjects2D6);
    }

    @Test
    public void test2397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2397");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number7 = defaultBoxAndWhiskerCategoryDataset0.getMaxRegularValue((java.lang.Comparable) (short) 10, (java.lang.Comparable) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (10) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2398");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int1 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        java.util.List list3 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = defaultBoxAndWhiskerCategoryDataset0.getMaxOutlier(10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(list3);
    }

    @Test
    public void test2399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2399");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int1 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup2 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.Range range5 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) -1);
        org.jfree.data.general.DatasetGroup datasetGroup8 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int10 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number13 = defaultBoxAndWhiskerCategoryDataset0.getMaxOutlier((java.lang.Comparable) (short) 0, (java.lang.Comparable) 0L);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (0) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(datasetGroup2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2400");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10L);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (-1.0f));
        org.jfree.data.general.DatasetGroup datasetGroup7 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        java.util.List list10 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable12 = defaultBoxAndWhiskerCategoryDataset0.getColumnKey((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test2401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2401");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = defaultBoxAndWhiskerCategoryDataset0.data;
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable9 = defaultBoxAndWhiskerCategoryDataset0.getColumnKey((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(keyedObjects2D5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2402");
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
            java.lang.Number number16 = defaultBoxAndWhiskerCategoryDataset0.getMaxRegularValue((int) '#', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
    }

    @Test
    public void test2403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2403");
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
        org.jfree.data.Range range15 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        org.jfree.data.statistics.BoxAndWhiskerItem boxAndWhiskerItem16 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultBoxAndWhiskerCategoryDataset0.add(boxAndWhiskerItem16, (java.lang.Comparable) 100.0f, (java.lang.Comparable) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(range15);
    }

    @Test
    public void test2404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2404");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.Range range6 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(range6);
    }

    @Test
    public void test2405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2405");
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
        java.util.EventListener eventListener17 = null;
        boolean boolean18 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener17);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset19 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D20 = null;
        defaultBoxAndWhiskerCategoryDataset19.data = keyedObjects2D20;
        org.jfree.data.KeyedObjects2D keyedObjects2D22 = null;
        defaultBoxAndWhiskerCategoryDataset19.data = keyedObjects2D22;
        java.util.EventListener eventListener24 = null;
        boolean boolean25 = defaultBoxAndWhiskerCategoryDataset19.hasListener(eventListener24);
        org.jfree.data.general.DatasetGroup datasetGroup26 = defaultBoxAndWhiskerCategoryDataset19.getGroup();
        boolean boolean27 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) datasetGroup26);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number30 = defaultBoxAndWhiskerCategoryDataset0.getMinRegularValue((int) (byte) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(keyedObjects2D12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(datasetGroup26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test2406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2406");
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
            java.lang.Number number15 = defaultBoxAndWhiskerCategoryDataset0.getQ1Value((java.lang.Comparable) 100.0d, (java.lang.Comparable) false);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (100.0) not recognised.");
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
    public void test2407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2407");
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
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset11 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double13 = defaultBoxAndWhiskerCategoryDataset11.getRangeUpperBound(true);
        int int14 = defaultBoxAndWhiskerCategoryDataset11.getColumnCount();
        double double16 = defaultBoxAndWhiskerCategoryDataset11.getRangeLowerBound(true);
        double double18 = defaultBoxAndWhiskerCategoryDataset11.getRangeUpperBound(false);
        org.jfree.data.Range range20 = defaultBoxAndWhiskerCategoryDataset11.getRangeBounds(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener21 = null;
        defaultBoxAndWhiskerCategoryDataset11.removeChangeListener(datasetChangeListener21);
        org.jfree.data.general.DatasetGroup datasetGroup23 = defaultBoxAndWhiskerCategoryDataset11.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup23);
        java.lang.Class<?> wildcardClass25 = datasetGroup23.getClass();
        org.junit.Assert.assertNull(keyedObjects2D5);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(datasetGroup23);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2408");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = defaultBoxAndWhiskerCategoryDataset0.data;
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        java.util.List list4 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        org.jfree.data.general.DatasetGroup datasetGroup5 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        org.junit.Assert.assertNotNull(keyedObjects2D1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(datasetGroup5);
    }

    @Test
    public void test2409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2409");
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
            java.lang.Number number21 = defaultBoxAndWhiskerCategoryDataset8.getQ1Value((int) (byte) 0, (int) (short) 1);
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
    }

    @Test
    public void test2410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2410");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.Range range4 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = defaultBoxAndWhiskerCategoryDataset0.getMaxOutlier((java.lang.Comparable) 100, (java.lang.Comparable) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (100) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2411");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = defaultBoxAndWhiskerCategoryDataset0.getMedianValue((int) (byte) 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2412");
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
            java.lang.Number number17 = defaultBoxAndWhiskerCategoryDataset0.getMinRegularValue((java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10L);
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
    public void test2413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2413");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 1L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test2414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2414");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        int int10 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2415");
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
        org.jfree.data.Range range14 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number17 = defaultBoxAndWhiskerCategoryDataset0.getMaxOutlier((java.lang.Comparable) 10.0f, (java.lang.Comparable) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (10.0) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(range14);
    }

    @Test
    public void test2416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2416");
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
            java.lang.Number number14 = defaultBoxAndWhiskerCategoryDataset0.getMinOutlier(100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
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
    public void test2417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2417");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10L);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup6 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        java.util.EventListener eventListener8 = null;
        boolean boolean9 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener8);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.statistics.BoxAndWhiskerItem boxAndWhiskerItem12 = defaultBoxAndWhiskerCategoryDataset0.getItem((int) (byte) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(datasetGroup6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2418");
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
        org.jfree.data.general.DatasetChangeListener datasetChangeListener13 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener13);
        int int15 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number18 = defaultBoxAndWhiskerCategoryDataset0.getMaxRegularValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 0L);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (0) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2419");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number17 = defaultBoxAndWhiskerCategoryDataset0.getMeanValue((java.lang.Comparable) false, (java.lang.Comparable) 0.0f);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (false) not recognised.");
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
    public void test2420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2420");
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
        java.lang.Object obj19 = defaultBoxAndWhiskerCategoryDataset8.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable21 = defaultBoxAndWhiskerCategoryDataset8.getColumnKey((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
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
        org.junit.Assert.assertNotNull(obj19);
    }

    @Test
    public void test2421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2421");
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
            java.lang.Number number17 = defaultBoxAndWhiskerCategoryDataset0.getQ3Value((java.lang.Comparable) 'a', (java.lang.Comparable) (-1));
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (a) not recognised.");
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
    public void test2422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2422");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetGroup datasetGroup3 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        boolean boolean5 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) (byte) 1);
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) 0L);
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = defaultBoxAndWhiskerCategoryDataset0.getMeanValue((int) (byte) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(datasetGroup3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2423");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        java.lang.Comparable comparable8 = null;
        int int9 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex(comparable8);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        java.util.List list11 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number14 = defaultBoxAndWhiskerCategoryDataset0.getMedianValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (1) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(keyedObjects2D7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(list11);
    }

    @Test
    public void test2424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2424");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        java.util.List list7 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int10 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) '4');
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener11);
        int int14 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 1);
        org.jfree.data.KeyedObjects2D keyedObjects2D15 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D15;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test2425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2425");
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
            java.util.List list15 = defaultBoxAndWhiskerCategoryDataset0.getOutliers((java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1.0d);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (-1.0) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test2426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2426");
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
        double double22 = defaultBoxAndWhiskerCategoryDataset8.getRangeUpperBound(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number25 = defaultBoxAndWhiskerCategoryDataset8.getQ3Value((java.lang.Comparable) (-1.0f), (java.lang.Comparable) Double.NaN);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (-1.0) not recognised.");
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
        org.junit.Assert.assertTrue(Double.isNaN(double22));
    }

    @Test
    public void test2427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2427");
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
            java.lang.Number number13 = defaultBoxAndWhiskerCategoryDataset0.getQ1Value((java.lang.Comparable) 0L, (java.lang.Comparable) 10.0f);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (0) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test2428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2428");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener5);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test2429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2429");
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
        double double14 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable16 = defaultBoxAndWhiskerCategoryDataset0.getColumnKey((int) (byte) 100);
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
    public void test2430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2430");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number23 = defaultBoxAndWhiskerCategoryDataset8.getMinOutlier(10, (int) (byte) 10);
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
    }

    @Test
    public void test2431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2431");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        java.lang.Comparable comparable5 = null;
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex(comparable5);
        java.util.List list7 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = defaultBoxAndWhiskerCategoryDataset0.getMaxRegularValue((int) (short) 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(datasetGroup4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list7);
    }

    @Test
    public void test2432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2432");
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
        org.jfree.data.general.DatasetChangeListener datasetChangeListener14 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener14);
        org.jfree.data.general.DatasetGroup datasetGroup16 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable18 = defaultBoxAndWhiskerCategoryDataset0.getColumnKey(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(datasetGroup16);
    }

    @Test
    public void test2433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2433");
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
        java.util.EventListener eventListener15 = null;
        boolean boolean16 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener15);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(keyedObjects2D11);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2434");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener4);
        org.jfree.data.general.DatasetGroup datasetGroup6 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        java.lang.Object obj7 = defaultBoxAndWhiskerCategoryDataset0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = defaultBoxAndWhiskerCategoryDataset0.getMeanValue((java.lang.Comparable) (short) -1, (java.lang.Comparable) (-1));
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (-1) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(datasetGroup6);
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test2435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2435");
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
        int int15 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        java.lang.Object obj16 = defaultBoxAndWhiskerCategoryDataset0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number19 = defaultBoxAndWhiskerCategoryDataset0.getMaxOutlier((java.lang.Comparable) 1L, (java.lang.Comparable) (-1L));
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (1) not recognised.");
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(obj16);
    }

    @Test
    public void test2436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2436");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10L);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (-1.0f));
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = defaultBoxAndWhiskerCategoryDataset0.data;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = defaultBoxAndWhiskerCategoryDataset0.getValue((int) (byte) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(keyedObjects2D7);
        org.junit.Assert.assertNotNull(keyedObjects2D8);
    }

    @Test
    public void test2437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2437");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetGroup datasetGroup3 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener4);
        org.jfree.data.general.DatasetGroup datasetGroup6 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10L);
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(datasetGroup3);
        org.junit.Assert.assertNotNull(datasetGroup6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test2438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2438");
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
            java.lang.Number number13 = defaultBoxAndWhiskerCategoryDataset0.getMinOutlier((int) ' ', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
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
    public void test2439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2439");
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
        org.jfree.data.Range range20 = defaultBoxAndWhiskerCategoryDataset8.getRangeBounds(false);
        java.lang.Comparable comparable22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number23 = defaultBoxAndWhiskerCategoryDataset8.getValue((java.lang.Comparable) (-1), comparable22);
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
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNotNull(range20);
    }

    @Test
    public void test2440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2440");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int1 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup2 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.Range range5 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) -1);
        org.jfree.data.general.DatasetGroup datasetGroup8 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = defaultBoxAndWhiskerCategoryDataset0.getMinOutlier((int) (byte) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(datasetGroup2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup8);
    }

    @Test
    public void test2441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2441");
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
        double double14 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        java.util.EventListener eventListener15 = null;
        boolean boolean16 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener15);
        org.jfree.data.Range range18 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number21 = defaultBoxAndWhiskerCategoryDataset0.getMinOutlier((int) '#', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
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
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(range18);
    }

    @Test
    public void test2442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2442");
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
        java.lang.Object obj16 = null;
        boolean boolean17 = defaultBoxAndWhiskerCategoryDataset0.equals(obj16);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2443");
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
        int int20 = defaultBoxAndWhiskerCategoryDataset8.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable22 = defaultBoxAndWhiskerCategoryDataset8.getRowKey((int) (byte) 100);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test2444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2444");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        boolean boolean4 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) 100L);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener5);
        org.jfree.data.general.DatasetGroup datasetGroup7 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener8);
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(datasetGroup7);
    }

    @Test
    public void test2445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2445");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        boolean boolean4 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) 100L);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener5);
        org.jfree.data.general.DatasetGroup datasetGroup7 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = defaultBoxAndWhiskerCategoryDataset0.getMedianValue(0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(datasetGroup7);
    }

    @Test
    public void test2446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2446");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (-1L));
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        java.util.List list8 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        java.util.List list9 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetGroup datasetGroup10 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number13 = defaultBoxAndWhiskerCategoryDataset0.getMinRegularValue(10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(datasetGroup10);
    }

    @Test
    public void test2447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2447");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D7;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset9 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener10 = null;
        boolean boolean11 = defaultBoxAndWhiskerCategoryDataset9.hasListener(eventListener10);
        int int13 = defaultBoxAndWhiskerCategoryDataset9.getRowIndex((java.lang.Comparable) 10L);
        int int14 = defaultBoxAndWhiskerCategoryDataset9.getRowCount();
        int int15 = defaultBoxAndWhiskerCategoryDataset9.getColumnCount();
        int int16 = defaultBoxAndWhiskerCategoryDataset9.getColumnCount();
        int int18 = defaultBoxAndWhiskerCategoryDataset9.getRowIndex((java.lang.Comparable) 100.0d);
        java.util.List list19 = defaultBoxAndWhiskerCategoryDataset9.getColumnKeys();
        boolean boolean20 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number23 = defaultBoxAndWhiskerCategoryDataset0.getMinRegularValue((int) (short) 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2448");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.Range range4 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        java.util.List list5 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = defaultBoxAndWhiskerCategoryDataset0.data;
        java.util.List list7 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = defaultBoxAndWhiskerCategoryDataset0.getMaxRegularValue((int) (short) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(keyedObjects2D6);
        org.junit.Assert.assertNotNull(list7);
    }

    @Test
    public void test2449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2449");
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
        java.util.EventListener eventListener12 = null;
        boolean boolean13 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener12);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number17 = defaultBoxAndWhiskerCategoryDataset0.getMinOutlier((java.lang.Comparable) '4', (java.lang.Comparable) '4');
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (4) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2450");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = defaultBoxAndWhiskerCategoryDataset0.getMedianValue((java.lang.Comparable) 'a', (java.lang.Comparable) (-1.0f));
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (a) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test2451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2451");
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
        org.jfree.data.Range range20 = defaultBoxAndWhiskerCategoryDataset8.getRangeBounds(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number23 = defaultBoxAndWhiskerCategoryDataset8.getMinRegularValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) '4');
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
        org.junit.Assert.assertNotNull(keyedObjects2D17);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNotNull(range20);
    }

    @Test
    public void test2452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2452");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        double double5 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable9 = defaultBoxAndWhiskerCategoryDataset0.getRowKey((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test2453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2453");
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
            java.lang.Number number17 = defaultBoxAndWhiskerCategoryDataset0.getMinRegularValue((java.lang.Comparable) 0.0f, (java.lang.Comparable) 1.0f);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (0.0) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
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
    public void test2454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2454");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        double double8 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        double double10 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.Range range12 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        double double14 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number17 = defaultBoxAndWhiskerCategoryDataset0.getMinRegularValue((java.lang.Comparable) (byte) 0, (java.lang.Comparable) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (0) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
    }

    @Test
    public void test2455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2455");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int1 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10.0d);
        java.util.EventListener eventListener6 = null;
        boolean boolean7 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener6);
        java.util.EventListener eventListener8 = null;
        boolean boolean9 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener8);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2456");
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
        java.util.List list16 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        org.jfree.data.Range range18 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNotNull(range18);
    }

    @Test
    public void test2457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2457");
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
        org.jfree.data.Range range13 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number16 = defaultBoxAndWhiskerCategoryDataset0.getQ3Value((int) (short) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(keyedObjects2D5);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(range13);
    }

    @Test
    public void test2458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2458");
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
        double double22 = defaultBoxAndWhiskerCategoryDataset8.getRangeLowerBound(false);
        java.util.List list23 = defaultBoxAndWhiskerCategoryDataset8.getRowKeys();
        java.util.EventListener eventListener24 = null;
        boolean boolean25 = defaultBoxAndWhiskerCategoryDataset8.hasListener(eventListener24);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNull(keyedObjects2D7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(keyedObjects2D17);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test2459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2459");
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
        java.util.List list23 = defaultBoxAndWhiskerCategoryDataset8.getColumnKeys();
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNull(keyedObjects2D7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(keyedObjects2D17);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertNotNull(list23);
    }

    @Test
    public void test2460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2460");
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
        java.util.EventListener eventListener22 = null;
        boolean boolean23 = defaultBoxAndWhiskerCategoryDataset8.hasListener(eventListener22);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNull(keyedObjects2D7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(keyedObjects2D19);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test2461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2461");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.Range range9 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = defaultBoxAndWhiskerCategoryDataset0.getMedianValue((int) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(range9);
    }

    @Test
    public void test2462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2462");
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
        org.jfree.data.Range range14 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable18 = defaultBoxAndWhiskerCategoryDataset0.getRowKey(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(range14);
    }

    @Test
    public void test2463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2463");
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
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener15);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test2464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2464");
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
        org.jfree.data.KeyedObjects2D keyedObjects2D12 = defaultBoxAndWhiskerCategoryDataset0.data;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(keyedObjects2D7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNull(keyedObjects2D12);
    }

    @Test
    public void test2465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2465");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D7;
        org.jfree.data.general.DatasetGroup datasetGroup9 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list12 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup9);
    }

    @Test
    public void test2466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2466");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = defaultBoxAndWhiskerCategoryDataset0.getQ1Value((java.lang.Comparable) 10, (java.lang.Comparable) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (10) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2467");
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
            java.lang.Number number22 = defaultBoxAndWhiskerCategoryDataset8.getValue((int) (byte) 10, (int) (byte) -1);
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(list19);
    }

    @Test
    public void test2468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2468");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener5);
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 1L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = defaultBoxAndWhiskerCategoryDataset0.getMedianValue((int) 'a', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test2469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2469");
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
        int int14 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number17 = defaultBoxAndWhiskerCategoryDataset0.getQ3Value((int) '#', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
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
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test2470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2470");
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
        java.util.EventListener eventListener15 = null;
        boolean boolean16 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener15);
        java.util.EventListener eventListener17 = null;
        boolean boolean18 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener17);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2471");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int1 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup2 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.Range range5 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) -1);
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        java.util.List list10 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(datasetGroup2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test2472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2472");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        java.util.EventListener eventListener4 = null;
        boolean boolean5 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener4);
        java.util.List list6 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 100L);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener9 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener9);
        int int12 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 100.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test2473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2473");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int1 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) '4');
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener5);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener7);
        double double10 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test2474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2474");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener3);
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset6 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int8 = defaultBoxAndWhiskerCategoryDataset6.getRowIndex((java.lang.Comparable) 0L);
        int int10 = defaultBoxAndWhiskerCategoryDataset6.getRowIndex((java.lang.Comparable) 1.0f);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset6.removeChangeListener(datasetChangeListener11);
        defaultBoxAndWhiskerCategoryDataset6.validateObject();
        int int15 = defaultBoxAndWhiskerCategoryDataset6.getRowIndex((java.lang.Comparable) (short) 0);
        int int16 = defaultBoxAndWhiskerCategoryDataset6.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup17 = defaultBoxAndWhiskerCategoryDataset6.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup17);
        org.junit.Assert.assertNull(keyedObjects2D5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(datasetGroup17);
    }

    @Test
    public void test2475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2475");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener6);
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = defaultBoxAndWhiskerCategoryDataset0.getQ1Value((java.lang.Comparable) '4', (java.lang.Comparable) 100L);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (4) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(keyedObjects2D5);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test2476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2476");
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
            java.util.List list14 = defaultBoxAndWhiskerCategoryDataset0.getOutliers((java.lang.Comparable) 10, (java.lang.Comparable) "hi!");
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (10) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test2477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2477");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D7;
        org.jfree.data.general.DatasetGroup datasetGroup9 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        org.jfree.data.KeyedObjects2D keyedObjects2D10 = defaultBoxAndWhiskerCategoryDataset0.data;
        double double12 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.statistics.BoxAndWhiskerItem boxAndWhiskerItem15 = defaultBoxAndWhiskerCategoryDataset0.getItem((int) 'a', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup9);
        org.junit.Assert.assertNull(keyedObjects2D10);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test2478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2478");
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
        double double22 = defaultBoxAndWhiskerCategoryDataset8.getRangeLowerBound(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener23 = null;
        defaultBoxAndWhiskerCategoryDataset8.removeChangeListener(datasetChangeListener23);
        org.jfree.data.general.DatasetGroup datasetGroup25 = defaultBoxAndWhiskerCategoryDataset8.getGroup();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number28 = defaultBoxAndWhiskerCategoryDataset8.getQ1Value((java.lang.Comparable) (-1.0d), (java.lang.Comparable) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (-1.0) not recognised.");
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
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertNotNull(datasetGroup25);
    }

    @Test
    public void test2479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2479");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetGroup datasetGroup3 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        boolean boolean5 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) (byte) 1);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(datasetGroup3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2480");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.Range range4 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        org.jfree.data.general.DatasetGroup datasetGroup5 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = defaultBoxAndWhiskerCategoryDataset0.getValue((-1), (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertNotNull(datasetGroup5);
    }

    @Test
    public void test2481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2481");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.Range range4 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable6 = defaultBoxAndWhiskerCategoryDataset0.getColumnKey(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(range4);
    }

    @Test
    public void test2482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2482");
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
        org.jfree.data.general.DatasetGroup datasetGroup11 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list12 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(keyedObjects2D5);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNull(keyedObjects2D8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(datasetGroup11);
    }

    @Test
    public void test2483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2483");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int1 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) '4');
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener5);
        double double8 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list11 = defaultBoxAndWhiskerCategoryDataset0.getOutliers((java.lang.Comparable) 1.0d, (java.lang.Comparable) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (1.0) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test2484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2484");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener6);
        java.util.List list8 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        org.jfree.data.general.DatasetGroup datasetGroup9 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double11 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        int int13 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) 1L);
        org.jfree.data.KeyedObjects2D keyedObjects2D14 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(keyedObjects2D5);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(datasetGroup9);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(keyedObjects2D14);
    }

    @Test
    public void test2485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2485");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list9 = defaultBoxAndWhiskerCategoryDataset0.getOutliers(10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test2486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2486");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        java.util.List list4 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number7 = defaultBoxAndWhiskerCategoryDataset0.getMinOutlier((int) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(list4);
    }

    @Test
    public void test2487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2487");
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
        java.util.EventListener eventListener17 = null;
        boolean boolean18 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener17);
        int int20 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(keyedObjects2D12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test2488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2488");
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
        java.util.List list16 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number19 = defaultBoxAndWhiskerCategoryDataset0.getQ1Value((java.lang.Comparable) 'a', (java.lang.Comparable) 10.0d);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (a) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(list16);
    }

    @Test
    public void test2489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2489");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 0L);
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        int int10 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int11 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.statistics.BoxAndWhiskerItem boxAndWhiskerItem14 = defaultBoxAndWhiskerCategoryDataset0.getItem(100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2490");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (-1L));
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable9 = defaultBoxAndWhiskerCategoryDataset0.getRowKey((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test2491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2491");
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
        double double20 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(keyedObjects2D12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
    }

    @Test
    public void test2492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2492");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        java.util.List list5 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        double double12 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        java.util.EventListener eventListener13 = null;
        boolean boolean14 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener13);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2493");
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
            java.util.List list15 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
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
    public void test2494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2494");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener5);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener7);
        double double10 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number13 = defaultBoxAndWhiskerCategoryDataset0.getMaxOutlier((int) (byte) 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test2495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2495");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (-1L));
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        java.util.EventListener eventListener8 = null;
        boolean boolean9 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener8);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset10 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double12 = defaultBoxAndWhiskerCategoryDataset10.getRangeUpperBound(true);
        double double14 = defaultBoxAndWhiskerCategoryDataset10.getRangeLowerBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultBoxAndWhiskerCategoryDataset10.removeChangeListener(datasetChangeListener15);
        double double18 = defaultBoxAndWhiskerCategoryDataset10.getRangeLowerBound(false);
        java.util.List list19 = defaultBoxAndWhiskerCategoryDataset10.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            defaultBoxAndWhiskerCategoryDataset0.add(list19, (java.lang.Comparable) "", (java.lang.Comparable) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Range(double, double): require lower (Infinity) <= upper (-Infinity).");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertNotNull(list19);
    }

    @Test
    public void test2496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2496");
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
        double double25 = defaultBoxAndWhiskerCategoryDataset8.getRangeLowerBound(true);
        java.lang.Comparable comparable27 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number28 = defaultBoxAndWhiskerCategoryDataset8.getMinRegularValue((java.lang.Comparable) 1.0f, comparable27);
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
    }

    @Test
    public void test2497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2497");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10L);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (-1.0f));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = defaultBoxAndWhiskerCategoryDataset0.getMaxRegularValue((int) ' ', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test2498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2498");
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
        double double22 = defaultBoxAndWhiskerCategoryDataset8.getRangeLowerBound(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener23 = null;
        defaultBoxAndWhiskerCategoryDataset8.removeChangeListener(datasetChangeListener23);
        int int26 = defaultBoxAndWhiskerCategoryDataset8.getColumnIndex((java.lang.Comparable) (byte) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNull(keyedObjects2D7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(keyedObjects2D17);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test2499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2499");
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
        int int15 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list18 = defaultBoxAndWhiskerCategoryDataset0.getOutliers((int) (byte) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2500");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = defaultBoxAndWhiskerCategoryDataset0.data;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = defaultBoxAndWhiskerCategoryDataset0.getMeanValue(10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(keyedObjects2D5);
    }
}

