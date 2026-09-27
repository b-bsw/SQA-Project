package org.jfree.data.statistics;

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
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.Range range4 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        java.util.List list6 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.Range range10 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number13 = defaultBoxAndWhiskerCategoryDataset0.getMinOutlier((java.lang.Comparable) Double.NaN, (java.lang.Comparable) 10.0f);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (NaN) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(range10);
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number14 = defaultBoxAndWhiskerCategoryDataset0.getValue((int) 'a', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(datasetGroup6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
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
            org.jfree.data.statistics.BoxAndWhiskerItem boxAndWhiskerItem12 = defaultBoxAndWhiskerCategoryDataset0.getItem((int) 'a', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number4 = defaultBoxAndWhiskerCategoryDataset0.getMedianValue((int) (short) 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = defaultBoxAndWhiskerCategoryDataset0.data;
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        java.util.EventListener eventListener10 = null;
        boolean boolean11 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener10);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        double double14 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener15);
        org.junit.Assert.assertNull(keyedObjects2D5);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        java.util.List list5 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        int int9 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) ' ');
        org.jfree.data.KeyedObjects2D keyedObjects2D10 = defaultBoxAndWhiskerCategoryDataset0.data;
        double double12 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(keyedObjects2D10);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
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
            java.lang.Number number12 = defaultBoxAndWhiskerCategoryDataset0.getMedianValue((int) 'a', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
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
        java.util.List list11 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number14 = defaultBoxAndWhiskerCategoryDataset0.getMaxOutlier((java.lang.Comparable) (short) 100, (java.lang.Comparable) false);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (100) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(list11);
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
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
        org.jfree.data.general.DatasetChangeListener datasetChangeListener20 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener20);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number24 = defaultBoxAndWhiskerCategoryDataset0.getMinOutlier(0, (int) ' ');
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
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNotNull(datasetGroup19);
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10L);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) '4');
        java.util.EventListener eventListener8 = null;
        boolean boolean9 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener8);
        org.jfree.data.general.DatasetGroup datasetGroup10 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(datasetGroup10);
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.statistics.BoxAndWhiskerItem boxAndWhiskerItem7 = defaultBoxAndWhiskerCategoryDataset0.getItem((int) (short) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.KeyedObjects2D keyedObjects2D4 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.Range range6 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        double double8 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        org.junit.Assert.assertNull(keyedObjects2D4);
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
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
        org.jfree.data.statistics.BoxAndWhiskerItem boxAndWhiskerItem13 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultBoxAndWhiskerCategoryDataset0.add(boxAndWhiskerItem13, (java.lang.Comparable) 1.0f, (java.lang.Comparable) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
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
            java.lang.Number number23 = defaultBoxAndWhiskerCategoryDataset8.getMinOutlier((java.lang.Comparable) 0.0d, (java.lang.Comparable) (byte) -1);
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
        org.junit.Assert.assertNotNull(keyedObjects2D19);
        org.junit.Assert.assertNotNull(keyedObjects2D20);
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
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
        org.jfree.data.KeyedObjects2D keyedObjects2D23 = defaultBoxAndWhiskerCategoryDataset8.data;
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNull(keyedObjects2D7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(keyedObjects2D23);
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = defaultBoxAndWhiskerCategoryDataset0.data;
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = defaultBoxAndWhiskerCategoryDataset0.getQ1Value((java.lang.Comparable) (-1), (java.lang.Comparable) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(keyedObjects2D5);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
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
        org.jfree.data.general.DatasetGroup datasetGroup12 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        java.util.EventListener eventListener13 = null;
        boolean boolean14 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener13);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number7 = defaultBoxAndWhiskerCategoryDataset0.getMinOutlier((int) (short) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 0L);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 1.0f);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener5);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        int int9 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup10 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number13 = defaultBoxAndWhiskerCategoryDataset0.getMaxOutlier((int) (short) 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup10);
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.statistics.BoxAndWhiskerItem boxAndWhiskerItem9 = defaultBoxAndWhiskerCategoryDataset0.getItem((int) '4', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
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
        org.jfree.data.general.DatasetChangeListener datasetChangeListener13 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number17 = defaultBoxAndWhiskerCategoryDataset0.getMinRegularValue((int) (byte) -1, (int) (byte) -1);
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
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
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
        org.jfree.data.general.DatasetGroup datasetGroup14 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(keyedObjects2D7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(keyedObjects2D10);
        org.junit.Assert.assertNotNull(datasetGroup11);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNotNull(datasetGroup14);
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) "hi!");
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.general.DatasetGroup datasetGroup9 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener10);
        int int12 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        int int14 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) '4');
        org.jfree.data.KeyedObjects2D keyedObjects2D15 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(keyedObjects2D15);
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.Range range4 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener6);
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int10 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 'a');
        java.util.List list11 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        double double13 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        java.util.EventListener eventListener14 = null;
        boolean boolean15 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener14);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        java.lang.Comparable comparable5 = null;
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex(comparable5);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        int int9 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = defaultBoxAndWhiskerCategoryDataset0.getMinRegularValue((-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(datasetGroup4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
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
        java.lang.Object obj14 = defaultBoxAndWhiskerCategoryDataset0.clone();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int1 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        java.util.EventListener eventListener4 = null;
        boolean boolean5 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener4);
        java.util.EventListener eventListener6 = null;
        boolean boolean7 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = defaultBoxAndWhiskerCategoryDataset0.getMaxOutlier((int) (byte) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
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
        org.jfree.data.Range range24 = defaultBoxAndWhiskerCategoryDataset8.getRangeBounds(false);
        org.jfree.data.KeyedObjects2D keyedObjects2D25 = defaultBoxAndWhiskerCategoryDataset8.data;
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNull(keyedObjects2D7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(keyedObjects2D17);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertNotNull(keyedObjects2D25);
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int1 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup2 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.Range range5 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) -1);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset8 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D9 = null;
        defaultBoxAndWhiskerCategoryDataset8.data = keyedObjects2D9;
        double double12 = defaultBoxAndWhiskerCategoryDataset8.getRangeUpperBound(true);
        double double14 = defaultBoxAndWhiskerCategoryDataset8.getRangeLowerBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D15 = defaultBoxAndWhiskerCategoryDataset8.data;
        boolean boolean16 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset8);
        org.jfree.data.statistics.BoxAndWhiskerItem boxAndWhiskerItem17 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultBoxAndWhiskerCategoryDataset0.add(boxAndWhiskerItem17, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(datasetGroup2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertNull(keyedObjects2D15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
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
        int int14 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup15 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup15);
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        boolean boolean4 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) 100L);
        org.jfree.data.Range range6 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        java.util.EventListener eventListener7 = null;
        boolean boolean8 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener7);
        org.jfree.data.general.DatasetGroup datasetGroup9 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(datasetGroup9);
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number7 = defaultBoxAndWhiskerCategoryDataset0.getMaxRegularValue((java.lang.Comparable) 'a', (java.lang.Comparable) 1.0f);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (a) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        java.util.List list4 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener5);
        org.jfree.data.general.DatasetGroup datasetGroup7 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable9 = defaultBoxAndWhiskerCategoryDataset0.getColumnKey(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(datasetGroup7);
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (-1L));
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        java.util.List list8 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        java.util.EventListener eventListener9 = null;
        boolean boolean10 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener9);
        org.jfree.data.Range range12 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number15 = defaultBoxAndWhiskerCategoryDataset0.getMinOutlier((java.lang.Comparable) (short) 100, (java.lang.Comparable) 1.0d);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (100) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(range12);
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int1 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        java.util.EventListener eventListener4 = null;
        boolean boolean5 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener4);
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = defaultBoxAndWhiskerCategoryDataset0.getQ3Value(100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        java.util.EventListener eventListener7 = null;
        boolean boolean8 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener7);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number6 = defaultBoxAndWhiskerCategoryDataset0.getValue((int) '4', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        java.util.List list5 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        double double11 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        double double13 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
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
            java.lang.Number number11 = defaultBoxAndWhiskerCategoryDataset0.getMaxOutlier((java.lang.Comparable) 0.0f, (java.lang.Comparable) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
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
            java.lang.Number number21 = defaultBoxAndWhiskerCategoryDataset0.getValue((java.lang.Comparable) '4', (java.lang.Comparable) (short) 0);
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
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        java.util.List list4 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) false);
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        double double10 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number13 = defaultBoxAndWhiskerCategoryDataset0.getMinRegularValue((int) (byte) 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
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
        double double25 = defaultBoxAndWhiskerCategoryDataset8.getRangeUpperBound(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener26 = null;
        defaultBoxAndWhiskerCategoryDataset8.removeChangeListener(datasetChangeListener26);
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
        org.junit.Assert.assertTrue(Double.isNaN(double25));
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
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
        double double14 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        java.util.EventListener eventListener15 = null;
        boolean boolean16 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener15);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        java.util.List list4 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = defaultBoxAndWhiskerCategoryDataset0.getMedianValue((int) '4', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = defaultBoxAndWhiskerCategoryDataset0.data;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list9 = defaultBoxAndWhiskerCategoryDataset0.getOutliers((java.lang.Comparable) 10.0f, (java.lang.Comparable) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(keyedObjects2D5);
        org.junit.Assert.assertNull(keyedObjects2D6);
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener4);
        org.jfree.data.Range range7 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = defaultBoxAndWhiskerCategoryDataset0.getValue((java.lang.Comparable) false, (java.lang.Comparable) Double.NaN);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (false) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(range7);
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        java.util.List list5 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        org.jfree.data.Range range9 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = defaultBoxAndWhiskerCategoryDataset0.getValue((int) '#', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(range9);
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
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
        org.jfree.data.statistics.BoxAndWhiskerItem boxAndWhiskerItem13 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultBoxAndWhiskerCategoryDataset0.add(boxAndWhiskerItem13, (java.lang.Comparable) 100L, (java.lang.Comparable) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(keyedObjects2D5);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNull(keyedObjects2D8);
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.Range range4 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener6);
        int int9 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) 1.0d);
        java.util.EventListener eventListener10 = null;
        boolean boolean11 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list14 = defaultBoxAndWhiskerCategoryDataset0.getOutliers((int) (byte) 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) Double.NaN);
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = defaultBoxAndWhiskerCategoryDataset0.getMaxOutlier((java.lang.Comparable) (short) 100, (java.lang.Comparable) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (100) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
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
        double double25 = defaultBoxAndWhiskerCategoryDataset8.getRangeLowerBound(false);
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
        org.junit.Assert.assertTrue(Double.isNaN(double25));
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (short) 100);
        java.util.List list5 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.Range range9 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        double double11 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        int int13 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
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
        java.util.List list26 = defaultBoxAndWhiskerCategoryDataset8.getColumnKeys();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset27 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double29 = defaultBoxAndWhiskerCategoryDataset27.getRangeUpperBound(true);
        double double31 = defaultBoxAndWhiskerCategoryDataset27.getRangeLowerBound(true);
        java.util.EventListener eventListener32 = null;
        boolean boolean33 = defaultBoxAndWhiskerCategoryDataset27.hasListener(eventListener32);
        int int34 = defaultBoxAndWhiskerCategoryDataset27.getRowCount();
        double double36 = defaultBoxAndWhiskerCategoryDataset27.getRangeLowerBound(true);
        java.util.List list37 = defaultBoxAndWhiskerCategoryDataset27.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            defaultBoxAndWhiskerCategoryDataset8.add(list37, (java.lang.Comparable) (short) -1, (java.lang.Comparable) 0.0f);
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
        org.junit.Assert.assertNotNull(keyedObjects2D17);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertNotNull(datasetGroup25);
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertNotNull(list37);
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener6);
        java.util.List list8 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        java.lang.Object obj9 = defaultBoxAndWhiskerCategoryDataset0.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.statistics.BoxAndWhiskerItem boxAndWhiskerItem12 = defaultBoxAndWhiskerCategoryDataset0.getItem(0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(keyedObjects2D5);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
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
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener11);
        java.lang.Comparable comparable13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number15 = defaultBoxAndWhiskerCategoryDataset0.getMeanValue(comparable13, (java.lang.Comparable) '4');
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
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number16 = defaultBoxAndWhiskerCategoryDataset0.getValue((java.lang.Comparable) (short) 10, (java.lang.Comparable) 0L);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (10) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(datasetGroup12);
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        java.util.EventListener eventListener5 = null;
        boolean boolean6 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener5);
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.general.DatasetChangeListener datasetChangeListener9 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener9);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(keyedObjects2D8);
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
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
            java.lang.Number number17 = defaultBoxAndWhiskerCategoryDataset0.getMaxRegularValue((int) '#', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
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
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
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
            java.lang.Number number13 = defaultBoxAndWhiskerCategoryDataset0.getMinOutlier((java.lang.Comparable) 100L, (java.lang.Comparable) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (100) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(keyedObjects2D9);
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) "hi!");
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.general.DatasetGroup datasetGroup9 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener10);
        int int12 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetGroup datasetGroup13 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener14 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener14);
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(datasetGroup13);
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
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
        org.jfree.data.general.DatasetGroup datasetGroup12 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener13 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener13);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup12);
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
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
        int int12 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) -1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener13 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number17 = defaultBoxAndWhiskerCategoryDataset0.getMaxOutlier(10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(datasetGroup6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) Double.NaN);
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener8);
        int int11 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 100.0f);
        java.util.List list12 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener13 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener13);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list17 = defaultBoxAndWhiskerCategoryDataset0.getOutliers((java.lang.Comparable) 10.0f, (java.lang.Comparable) 0.0f);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (10.0) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
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
            java.lang.Number number16 = defaultBoxAndWhiskerCategoryDataset0.getMaxOutlier((java.lang.Comparable) (short) 1, (java.lang.Comparable) "");
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (1) not recognised.");
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
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 0L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number5 = defaultBoxAndWhiskerCategoryDataset0.getMinOutlier((java.lang.Comparable) 'a', (java.lang.Comparable) 'a');
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (a) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        java.util.List list5 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        double double11 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.general.DatasetGroup datasetGroup12 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number15 = defaultBoxAndWhiskerCategoryDataset0.getValue((java.lang.Comparable) 100L, (java.lang.Comparable) 0);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (100) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNotNull(datasetGroup12);
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        double double5 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = defaultBoxAndWhiskerCategoryDataset0.getMinRegularValue((int) '#', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3068");
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
        java.util.List list26 = defaultBoxAndWhiskerCategoryDataset8.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number29 = defaultBoxAndWhiskerCategoryDataset8.getMedianValue((java.lang.Comparable) 0.0d, (java.lang.Comparable) 10);
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
        org.junit.Assert.assertNotNull(keyedObjects2D17);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(list26);
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
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
        org.jfree.data.KeyedObjects2D keyedObjects2D20 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.junit.Assert.assertNull(keyedObjects2D5);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNull(keyedObjects2D8);
        org.junit.Assert.assertNotNull(datasetGroup10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(datasetGroup12);
        org.junit.Assert.assertNotNull(datasetGroup15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(keyedObjects2D20);
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3070");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = defaultBoxAndWhiskerCategoryDataset0.getMeanValue((-1), (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
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
        int int14 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        int int16 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number19 = defaultBoxAndWhiskerCategoryDataset0.getMaxOutlier(100, (int) (byte) 1);
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3072");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10L);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (-1.0f));
        org.jfree.data.general.DatasetGroup datasetGroup7 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        java.util.List list10 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.statistics.BoxAndWhiskerItem boxAndWhiskerItem11 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultBoxAndWhiskerCategoryDataset0.add(boxAndWhiskerItem11, (java.lang.Comparable) 0, (java.lang.Comparable) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) "hi!");
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.general.DatasetGroup datasetGroup9 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener10);
        int int12 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetGroup datasetGroup13 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        java.lang.Object obj14 = defaultBoxAndWhiskerCategoryDataset0.clone();
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(datasetGroup13);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3074");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.Range range4 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        java.util.List list6 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.Range range10 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        int int11 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.statistics.BoxAndWhiskerItem boxAndWhiskerItem12 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultBoxAndWhiskerCategoryDataset0.add(boxAndWhiskerItem12, (java.lang.Comparable) 1.0d, (java.lang.Comparable) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3075");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = defaultBoxAndWhiskerCategoryDataset0.data;
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        double double8 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        java.lang.Comparable comparable9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = defaultBoxAndWhiskerCategoryDataset0.getMaxRegularValue(comparable9, (java.lang.Comparable) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'rowKey' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(keyedObjects2D5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3076");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener3);
        org.jfree.data.general.DatasetGroup datasetGroup5 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable7 = defaultBoxAndWhiskerCategoryDataset0.getRowKey((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetGroup5);
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3077");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        java.util.List list5 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) '4');
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = defaultBoxAndWhiskerCategoryDataset0.getQ1Value((java.lang.Comparable) 100.0f, (java.lang.Comparable) 10.0f);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (100.0) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3078");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        java.util.List list4 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = defaultBoxAndWhiskerCategoryDataset0.getMeanValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 1);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (100.0) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3079");
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
            java.lang.Number number11 = defaultBoxAndWhiskerCategoryDataset0.getValue((java.lang.Comparable) 10, (java.lang.Comparable) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (10) not recognised.");
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
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3080");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list12 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(datasetGroup7);
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3081");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = defaultBoxAndWhiskerCategoryDataset0.getMaxRegularValue((int) (short) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3082");
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
        org.jfree.data.statistics.BoxAndWhiskerItem boxAndWhiskerItem16 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultBoxAndWhiskerCategoryDataset9.add(boxAndWhiskerItem16, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) (-1.0d));
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
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3083");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int1 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = defaultBoxAndWhiskerCategoryDataset0.data;
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.statistics.BoxAndWhiskerItem boxAndWhiskerItem7 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultBoxAndWhiskerCategoryDataset0.add(boxAndWhiskerItem7, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(keyedObjects2D5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3084");
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
        java.util.List list19 = defaultBoxAndWhiskerCategoryDataset8.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number22 = defaultBoxAndWhiskerCategoryDataset8.getMinRegularValue((int) (byte) -1, 100);
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
        org.junit.Assert.assertNotNull(list19);
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3085");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number14 = defaultBoxAndWhiskerCategoryDataset0.getMedianValue((java.lang.Comparable) 0, (java.lang.Comparable) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(datasetGroup7);
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3086");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        java.util.List list5 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        org.jfree.data.general.DatasetGroup datasetGroup6 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        java.util.List list7 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = defaultBoxAndWhiskerCategoryDataset0.getValue((java.lang.Comparable) (short) 10, (java.lang.Comparable) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (10) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(datasetGroup6);
        org.junit.Assert.assertNotNull(list7);
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3087");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = defaultBoxAndWhiskerCategoryDataset0.data;
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        java.util.List list7 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.general.DatasetGroup datasetGroup9 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int11 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 0.0d);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener12);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(keyedObjects2D5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(keyedObjects2D8);
        org.junit.Assert.assertNotNull(datasetGroup9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3088");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        java.util.List list4 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener8);
        java.lang.Object obj10 = defaultBoxAndWhiskerCategoryDataset0.clone();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3089");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) "hi!");
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = defaultBoxAndWhiskerCategoryDataset0.getMaxRegularValue((java.lang.Comparable) 0L, (java.lang.Comparable) true);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (0) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3090");
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
        int int14 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable16 = defaultBoxAndWhiskerCategoryDataset0.getColumnKey(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3091");
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
            java.lang.Number number23 = defaultBoxAndWhiskerCategoryDataset8.getQ3Value((java.lang.Comparable) (short) 10, (java.lang.Comparable) 0);
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
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3092");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int1 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup2 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.Range range5 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) -1);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset8 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D9 = null;
        defaultBoxAndWhiskerCategoryDataset8.data = keyedObjects2D9;
        double double12 = defaultBoxAndWhiskerCategoryDataset8.getRangeUpperBound(true);
        double double14 = defaultBoxAndWhiskerCategoryDataset8.getRangeLowerBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D15 = defaultBoxAndWhiskerCategoryDataset8.data;
        boolean boolean16 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset8);
        org.jfree.data.Range range18 = defaultBoxAndWhiskerCategoryDataset8.getRangeBounds(false);
        java.lang.Comparable comparable19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number21 = defaultBoxAndWhiskerCategoryDataset8.getMedianValue(comparable19, (java.lang.Comparable) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(datasetGroup2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertNull(keyedObjects2D15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(range18);
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3093");
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
        int int13 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        java.util.List list14 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset15 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double17 = defaultBoxAndWhiskerCategoryDataset15.getRangeUpperBound(true);
        double double19 = defaultBoxAndWhiskerCategoryDataset15.getRangeLowerBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D20 = defaultBoxAndWhiskerCategoryDataset15.data;
        int int21 = defaultBoxAndWhiskerCategoryDataset15.getColumnCount();
        java.util.List list22 = defaultBoxAndWhiskerCategoryDataset15.getRowKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D23 = defaultBoxAndWhiskerCategoryDataset15.data;
        double double25 = defaultBoxAndWhiskerCategoryDataset15.getRangeUpperBound(true);
        java.util.List list26 = defaultBoxAndWhiskerCategoryDataset15.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            defaultBoxAndWhiskerCategoryDataset0.add(list26, (java.lang.Comparable) 1L, (java.lang.Comparable) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Range(double, double): require lower (Infinity) <= upper (-Infinity).");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(datasetGroup12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertNotNull(keyedObjects2D20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(keyedObjects2D23);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertNotNull(list26);
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3094");
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
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset12 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup13 = defaultBoxAndWhiskerCategoryDataset12.getGroup();
        double double15 = defaultBoxAndWhiskerCategoryDataset12.getRangeLowerBound(false);
        java.util.List list16 = defaultBoxAndWhiskerCategoryDataset12.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener17 = null;
        defaultBoxAndWhiskerCategoryDataset12.removeChangeListener(datasetChangeListener17);
        org.jfree.data.general.DatasetGroup datasetGroup19 = defaultBoxAndWhiskerCategoryDataset12.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup19);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(keyedObjects2D7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(datasetGroup13);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNotNull(datasetGroup19);
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3095");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) 0);
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = defaultBoxAndWhiskerCategoryDataset0.getMedianValue((java.lang.Comparable) (-1), (java.lang.Comparable) 'a');
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (-1) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3096");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener5);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(keyedObjects2D7);
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3097");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        java.util.List list4 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.Range range6 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        double double8 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener9 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener9);
        java.util.EventListener eventListener11 = null;
        boolean boolean12 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener11);
        org.jfree.data.Range range14 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number19 = defaultBoxAndWhiskerCategoryDataset0.getMaxOutlier((int) '#', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(range14);
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3098");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int1 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number5 = defaultBoxAndWhiskerCategoryDataset0.getMinRegularValue((java.lang.Comparable) '4', (java.lang.Comparable) 'a');
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (4) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3099");
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
            java.util.List list14 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
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
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3100");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10L);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        int int9 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 100.0d);
        java.util.List list10 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        int int12 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number15 = defaultBoxAndWhiskerCategoryDataset0.getMaxOutlier((java.lang.Comparable) true, (java.lang.Comparable) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (true) not recognised.");
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3101");
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
        java.util.List list21 = defaultBoxAndWhiskerCategoryDataset8.getRowKeys();
        defaultBoxAndWhiskerCategoryDataset8.validateObject();
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNull(keyedObjects2D7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(list21);
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3102");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        java.util.List list5 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        int int9 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) ' ');
        int int10 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        int int11 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3103");
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
        int int12 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) -1);
        java.lang.Class<?> wildcardClass13 = defaultBoxAndWhiskerCategoryDataset0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(datasetGroup6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3104");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) "hi!");
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.general.DatasetGroup datasetGroup9 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener10);
        int int12 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number15 = defaultBoxAndWhiskerCategoryDataset0.getQ1Value((java.lang.Comparable) (byte) 10, (java.lang.Comparable) '#');
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (10) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3105");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.Range range4 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        org.jfree.data.general.DatasetGroup datasetGroup5 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 0L);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list11 = defaultBoxAndWhiskerCategoryDataset0.getOutliers((java.lang.Comparable) 10L, (java.lang.Comparable) (-1));
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (10) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertNotNull(datasetGroup5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3106");
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
            org.jfree.data.statistics.BoxAndWhiskerItem boxAndWhiskerItem12 = defaultBoxAndWhiskerCategoryDataset0.getItem((int) (byte) 1, (int) (byte) 100);
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
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3107");
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
        java.util.List list17 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        double double19 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
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
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3108");
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
            java.util.List list26 = defaultBoxAndWhiskerCategoryDataset9.getOutliers(100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
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
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNotNull(datasetGroup22);
        org.junit.Assert.assertNotNull(list23);
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3109");
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
            java.lang.Number number22 = defaultBoxAndWhiskerCategoryDataset0.getMinOutlier((java.lang.Comparable) (byte) 10, (java.lang.Comparable) 0.0d);
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
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3110");
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
        double double14 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3111");
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
            java.lang.Number number22 = defaultBoxAndWhiskerCategoryDataset0.getMaxRegularValue((java.lang.Comparable) (short) 10, (java.lang.Comparable) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (10) not recognised.");
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
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNotNull(datasetGroup19);
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3112");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener5);
        org.jfree.data.Range range8 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = defaultBoxAndWhiskerCategoryDataset0.getMeanValue((java.lang.Comparable) Double.NaN, (java.lang.Comparable) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(range8);
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3113");
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
        java.lang.Object obj14 = defaultBoxAndWhiskerCategoryDataset0.clone();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3114");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list6 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3115");
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
        org.jfree.data.Range range28 = defaultBoxAndWhiskerCategoryDataset8.getRangeBounds(false);
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
        org.junit.Assert.assertNotNull(range28);
    }

    @Test
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3116");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        java.util.List list5 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        org.jfree.data.general.DatasetGroup datasetGroup6 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        java.util.List list7 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        java.util.EventListener eventListener8 = null;
        boolean boolean9 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener8);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(datasetGroup6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3117");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.Range range4 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener6);
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int9 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = defaultBoxAndWhiskerCategoryDataset0.getQ1Value((int) (short) 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3118");
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
            java.lang.Number number17 = defaultBoxAndWhiskerCategoryDataset0.getMaxRegularValue((int) (short) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
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
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3119");
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
            org.jfree.data.statistics.BoxAndWhiskerItem boxAndWhiskerItem26 = defaultBoxAndWhiskerCategoryDataset8.getItem((int) '4', (int) (byte) 100);
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
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
    }

    @Test
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3120");
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
        int int14 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener15);
        java.lang.Class<?> wildcardClass17 = defaultBoxAndWhiskerCategoryDataset0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3121");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int1 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup2 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.Range range5 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 10);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(datasetGroup2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3122");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int1 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = defaultBoxAndWhiskerCategoryDataset0.data;
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) 1);
        java.lang.Object obj8 = defaultBoxAndWhiskerCategoryDataset0.clone();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(keyedObjects2D5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3123");
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
        int int14 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number19 = defaultBoxAndWhiskerCategoryDataset0.getMinRegularValue((java.lang.Comparable) 0L, (java.lang.Comparable) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (0) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3124");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        double double5 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.Range range7 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        int int9 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) Double.NaN);
        java.lang.Comparable comparable11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = defaultBoxAndWhiskerCategoryDataset0.getMinRegularValue((java.lang.Comparable) (short) 0, comparable11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'columnKey' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3125");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int1 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup2 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        java.util.List list4 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) 100L);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(datasetGroup2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(keyedObjects2D7);
    }

    @Test
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3126");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable11 = defaultBoxAndWhiskerCategoryDataset0.getColumnKey((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(keyedObjects2D7);
    }

    @Test
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3127");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        java.util.List list9 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = defaultBoxAndWhiskerCategoryDataset0.getMaxRegularValue((int) 'a', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3128");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int1 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = defaultBoxAndWhiskerCategoryDataset0.data;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable7 = defaultBoxAndWhiskerCategoryDataset0.getColumnKey(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(keyedObjects2D5);
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3129");
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
            java.lang.Number number18 = defaultBoxAndWhiskerCategoryDataset0.getMeanValue(0, (int) ' ');
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
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3130");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        java.util.EventListener eventListener5 = null;
        boolean boolean6 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener5);
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        double double11 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3131");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        double double5 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.Range range9 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener10);
        int int12 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number15 = defaultBoxAndWhiskerCategoryDataset0.getMinRegularValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (100) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3132");
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
        java.util.List list22 = defaultBoxAndWhiskerCategoryDataset8.getColumnKeys();
        defaultBoxAndWhiskerCategoryDataset8.validateObject();
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNull(keyedObjects2D7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(keyedObjects2D19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(list22);
    }

    @Test
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3133");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) "hi!");
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        java.util.List list7 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = defaultBoxAndWhiskerCategoryDataset0.getMaxOutlier((int) (byte) 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(list7);
    }

    @Test
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3134");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10L);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) 10.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D9 = defaultBoxAndWhiskerCategoryDataset0.data;
        int int10 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener11);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(keyedObjects2D9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3135");
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
        java.util.List list15 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3136");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 1L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = defaultBoxAndWhiskerCategoryDataset0.getMinRegularValue((java.lang.Comparable) "", (java.lang.Comparable) 1);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key () not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3137");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset8 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int9 = defaultBoxAndWhiskerCategoryDataset8.getRowCount();
        double double11 = defaultBoxAndWhiskerCategoryDataset8.getRangeLowerBound(true);
        java.util.EventListener eventListener12 = null;
        boolean boolean13 = defaultBoxAndWhiskerCategoryDataset8.hasListener(eventListener12);
        double double15 = defaultBoxAndWhiskerCategoryDataset8.getRangeLowerBound(true);
        java.util.List list16 = defaultBoxAndWhiskerCategoryDataset8.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            defaultBoxAndWhiskerCategoryDataset0.add(list16, (java.lang.Comparable) 1.0d, (java.lang.Comparable) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Range(double, double): require lower (Infinity) <= upper (-Infinity).");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertNotNull(list16);
    }

    @Test
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3138");
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
        int int14 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number17 = defaultBoxAndWhiskerCategoryDataset0.getMeanValue((java.lang.Comparable) true, (java.lang.Comparable) 100.0f);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (true) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(datasetGroup12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3139");
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
        java.util.EventListener eventListener21 = null;
        boolean boolean22 = defaultBoxAndWhiskerCategoryDataset8.hasListener(eventListener21);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNull(keyedObjects2D7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(keyedObjects2D17);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3140");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener1);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) "");
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = defaultBoxAndWhiskerCategoryDataset0.data;
        java.util.List list6 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        double double8 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(keyedObjects2D5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3141");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        double double5 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = defaultBoxAndWhiskerCategoryDataset0.getValue((java.lang.Comparable) (-1L), (java.lang.Comparable) 1L);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (-1) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3142");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) "hi!");
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        java.util.EventListener eventListener7 = null;
        boolean boolean8 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener7);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        double double11 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        org.jfree.data.general.DatasetGroup datasetGroup12 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNotNull(datasetGroup12);
    }

    @Test
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3143");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10L);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = defaultBoxAndWhiskerCategoryDataset0.data;
        java.lang.Object obj7 = defaultBoxAndWhiskerCategoryDataset0.clone();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(keyedObjects2D6);
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3144");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) "hi!");
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        java.util.EventListener eventListener7 = null;
        boolean boolean8 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener7);
        java.util.EventListener eventListener9 = null;
        boolean boolean10 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number13 = defaultBoxAndWhiskerCategoryDataset0.getQ1Value((int) (short) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3145");
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
            org.jfree.data.statistics.BoxAndWhiskerItem boxAndWhiskerItem30 = defaultBoxAndWhiskerCategoryDataset0.getItem(0, (int) (byte) 1);
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(datasetGroup26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test3146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3146");
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
        double double22 = defaultBoxAndWhiskerCategoryDataset8.getRangeUpperBound(true);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.statistics.BoxAndWhiskerItem boxAndWhiskerItem25 = defaultBoxAndWhiskerCategoryDataset8.getItem((int) '4', 1);
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
        org.junit.Assert.assertNotNull(keyedObjects2D19);
        org.junit.Assert.assertNotNull(keyedObjects2D20);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
    }

    @Test
    public void test3147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3147");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = defaultBoxAndWhiskerCategoryDataset0.data;
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        java.util.List list7 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.general.DatasetGroup datasetGroup9 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset10 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup11 = defaultBoxAndWhiskerCategoryDataset10.getGroup();
        int int12 = defaultBoxAndWhiskerCategoryDataset10.getColumnCount();
        org.jfree.data.general.DatasetGroup datasetGroup13 = defaultBoxAndWhiskerCategoryDataset10.getGroup();
        boolean boolean15 = defaultBoxAndWhiskerCategoryDataset10.equals((java.lang.Object) (byte) 1);
        org.jfree.data.general.DatasetGroup datasetGroup16 = defaultBoxAndWhiskerCategoryDataset10.getGroup();
        int int17 = defaultBoxAndWhiskerCategoryDataset10.getColumnCount();
        java.util.List list18 = defaultBoxAndWhiskerCategoryDataset10.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            defaultBoxAndWhiskerCategoryDataset0.add(list18, (java.lang.Comparable) ' ', (java.lang.Comparable) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Range(double, double): require lower (Infinity) <= upper (-Infinity).");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(keyedObjects2D5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(keyedObjects2D8);
        org.junit.Assert.assertNotNull(datasetGroup9);
        org.junit.Assert.assertNotNull(datasetGroup11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(datasetGroup13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(datasetGroup16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(list18);
    }

    @Test
    public void test3148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3148");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int1 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        java.util.EventListener eventListener4 = null;
        boolean boolean5 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener4);
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        int int9 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10.0d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test3149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3149");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) Double.NaN);
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = defaultBoxAndWhiskerCategoryDataset0.data;
        java.util.List list9 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable11 = defaultBoxAndWhiskerCategoryDataset0.getRowKey(10);
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
    }

    @Test
    public void test3150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3150");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int1 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = defaultBoxAndWhiskerCategoryDataset0.data;
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener7);
        double double10 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(keyedObjects2D5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test3151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3151");
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
        org.jfree.data.general.DatasetGroup datasetGroup13 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number17 = defaultBoxAndWhiskerCategoryDataset0.getMinOutlier((int) (short) 1, (int) 'a');
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(datasetGroup13);
    }

    @Test
    public void test3152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3152");
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
        java.lang.Object obj14 = defaultBoxAndWhiskerCategoryDataset0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number17 = defaultBoxAndWhiskerCategoryDataset0.getMedianValue((int) '4', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test3153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3153");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) "hi!");
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        java.util.EventListener eventListener7 = null;
        boolean boolean8 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener7);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.general.DatasetGroup datasetGroup10 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        org.jfree.data.general.DatasetGroup datasetGroup11 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(datasetGroup10);
        org.junit.Assert.assertNotNull(datasetGroup11);
    }

    @Test
    public void test3154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3154");
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
            java.lang.Number number13 = defaultBoxAndWhiskerCategoryDataset0.getQ1Value((int) (byte) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(keyedObjects2D7);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test3155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3155");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) Double.NaN);
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = defaultBoxAndWhiskerCategoryDataset0.data;
        java.util.List list9 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        java.lang.Object obj10 = null;
        boolean boolean11 = defaultBoxAndWhiskerCategoryDataset0.equals(obj10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener12);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list16 = defaultBoxAndWhiskerCategoryDataset0.getOutliers((java.lang.Comparable) "", (java.lang.Comparable) 1.0d);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key () not recognised.");
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
    }

    @Test
    public void test3156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3156");
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
            java.lang.Number number21 = defaultBoxAndWhiskerCategoryDataset0.getValue((java.lang.Comparable) (-1.0d), (java.lang.Comparable) "hi!");
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
    public void test3157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3157");
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
        java.util.List list11 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D12 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(keyedObjects2D12);
    }

    @Test
    public void test3158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3158");
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
        java.util.List list25 = defaultBoxAndWhiskerCategoryDataset8.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.statistics.BoxAndWhiskerItem boxAndWhiskerItem28 = defaultBoxAndWhiskerCategoryDataset8.getItem(0, (int) (short) 1);
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertNotNull(list25);
    }

    @Test
    public void test3159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3159");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener3);
        org.jfree.data.general.DatasetGroup datasetGroup5 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.junit.Assert.assertNotNull(datasetGroup5);
    }

    @Test
    public void test3160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3160");
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
        int int14 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener15);
        int int18 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable20 = defaultBoxAndWhiskerCategoryDataset0.getRowKey((int) (short) 1);
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test3161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3161");
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
        java.lang.Object obj18 = defaultBoxAndWhiskerCategoryDataset0.clone();
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
        org.junit.Assert.assertNotNull(obj18);
    }

    @Test
    public void test3162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3162");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int1 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup2 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset5 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener6 = null;
        boolean boolean7 = defaultBoxAndWhiskerCategoryDataset5.hasListener(eventListener6);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultBoxAndWhiskerCategoryDataset5.removeChangeListener(datasetChangeListener8);
        int int11 = defaultBoxAndWhiskerCategoryDataset5.getRowIndex((java.lang.Comparable) (byte) 1);
        java.util.List list12 = defaultBoxAndWhiskerCategoryDataset5.getColumnKeys();
        int int13 = defaultBoxAndWhiskerCategoryDataset5.getColumnCount();
        java.util.EventListener eventListener14 = null;
        boolean boolean15 = defaultBoxAndWhiskerCategoryDataset5.hasListener(eventListener14);
        java.util.List list16 = defaultBoxAndWhiskerCategoryDataset5.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            defaultBoxAndWhiskerCategoryDataset0.add(list16, (java.lang.Comparable) (short) 1, (java.lang.Comparable) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Range(double, double): require lower (Infinity) <= upper (-Infinity).");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(datasetGroup2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(list16);
    }

    @Test
    public void test3163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3163");
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
            java.lang.Number number15 = defaultBoxAndWhiskerCategoryDataset0.getMedianValue((int) (short) -1, (int) (byte) 100);
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
    public void test3164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3164");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener5);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener7);
        double double10 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.statistics.BoxAndWhiskerItem boxAndWhiskerItem13 = defaultBoxAndWhiskerCategoryDataset0.getItem(1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test3165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3165");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.Range range9 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(keyedObjects2D7);
        org.junit.Assert.assertNotNull(range9);
    }

    @Test
    public void test3166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3166");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (-1L));
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        double double8 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        int int10 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test3167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3167");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = defaultBoxAndWhiskerCategoryDataset0.data;
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        java.util.List list7 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = defaultBoxAndWhiskerCategoryDataset0.data;
        double double10 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        int int11 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(keyedObjects2D5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(keyedObjects2D8);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test3168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3168");
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
            java.lang.Number number14 = defaultBoxAndWhiskerCategoryDataset0.getQ1Value((java.lang.Comparable) true, (java.lang.Comparable) 1L);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (true) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
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
    public void test3169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3169");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) "hi!");
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        java.util.EventListener eventListener7 = null;
        boolean boolean8 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener7);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.general.DatasetGroup datasetGroup10 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int11 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.statistics.BoxAndWhiskerItem boxAndWhiskerItem12 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultBoxAndWhiskerCategoryDataset0.add(boxAndWhiskerItem12, (java.lang.Comparable) 100.0f, (java.lang.Comparable) Double.NaN);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(datasetGroup10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test3170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3170");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.Range range4 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        java.util.List list6 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.Range range10 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number13 = defaultBoxAndWhiskerCategoryDataset0.getMinOutlier((java.lang.Comparable) "hi!", (java.lang.Comparable) Double.NaN);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (hi!) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(range10);
    }

    @Test
    public void test3171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3171");
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
            java.lang.Number number14 = defaultBoxAndWhiskerCategoryDataset0.getValue((java.lang.Comparable) 0.0d, (java.lang.Comparable) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(keyedObjects2D7);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test3172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3172");
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
        int int12 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable14 = defaultBoxAndWhiskerCategoryDataset0.getRowKey((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(datasetGroup6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test3173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3173");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 0L);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 1.0f);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener5);
        double double8 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener9 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number13 = defaultBoxAndWhiskerCategoryDataset0.getQ3Value((int) (byte) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test3174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3174");
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
        double double20 = defaultBoxAndWhiskerCategoryDataset8.getRangeLowerBound(true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNull(keyedObjects2D7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
    }

    @Test
    public void test3175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3175");
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
        int int15 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        java.lang.Comparable comparable16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number18 = defaultBoxAndWhiskerCategoryDataset0.getMinRegularValue(comparable16, (java.lang.Comparable) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'rowKey' argument.");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test3176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3176");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable17 = defaultBoxAndWhiskerCategoryDataset0.getRowKey((int) (short) -1);
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
    public void test3177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3177");
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
            java.lang.Number number14 = defaultBoxAndWhiskerCategoryDataset0.getMaxRegularValue((int) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
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
    public void test3178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3178");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        boolean boolean9 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) (-1));
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener12);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener14 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener14);
        java.util.List list16 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(list16);
    }

    @Test
    public void test3179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3179");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int1 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup2 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.Range range5 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 10);
        int int9 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (short) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(datasetGroup2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test3180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3180");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        java.util.List list4 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.Range range6 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        java.util.List list8 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        org.jfree.data.Range range10 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number13 = defaultBoxAndWhiskerCategoryDataset0.getMeanValue((-1), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(range10);
    }

    @Test
    public void test3181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3181");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number17 = defaultBoxAndWhiskerCategoryDataset0.getMinOutlier((java.lang.Comparable) false, (java.lang.Comparable) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(keyedObjects2D5);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3182");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.Range range4 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener6);
        java.lang.Comparable comparable9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = defaultBoxAndWhiskerCategoryDataset0.getMinOutlier((java.lang.Comparable) 0L, comparable9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'columnKey' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test3183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3183");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int1 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        java.util.EventListener eventListener4 = null;
        boolean boolean5 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener4);
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        java.util.List list8 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D9 = defaultBoxAndWhiskerCategoryDataset0.data;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = defaultBoxAndWhiskerCategoryDataset0.getMinOutlier((int) (byte) 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(keyedObjects2D9);
    }

    @Test
    public void test3184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3184");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        java.util.EventListener eventListener4 = null;
        boolean boolean5 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener4);
        java.util.List list6 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 100L);
        java.util.List list9 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        java.util.List list10 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number13 = defaultBoxAndWhiskerCategoryDataset0.getMinOutlier((int) 'a', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    public void test3185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3185");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        java.util.List list5 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        double double11 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        java.util.List list12 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test3186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3186");
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
            java.lang.Comparable comparable24 = defaultBoxAndWhiskerCategoryDataset8.getRowKey((int) (byte) 1);
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
        org.junit.Assert.assertTrue(Double.isNaN(double22));
    }

    @Test
    public void test3187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3187");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) "hi!");
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.general.DatasetGroup datasetGroup9 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener12);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list16 = defaultBoxAndWhiskerCategoryDataset0.getOutliers((java.lang.Comparable) 10, (java.lang.Comparable) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (10) not recognised.");
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
    public void test3188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3188");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.Range range4 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        java.util.List list5 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = defaultBoxAndWhiskerCategoryDataset0.data;
        java.util.List list7 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        java.lang.Class<?> wildcardClass8 = list7.getClass();
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(keyedObjects2D6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3189");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number23 = defaultBoxAndWhiskerCategoryDataset8.getQ1Value(10, 1);
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
        org.junit.Assert.assertNotNull(list20);
    }

    @Test
    public void test3190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3190");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int1 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) '#');
        java.util.List list5 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = defaultBoxAndWhiskerCategoryDataset0.getMinRegularValue((java.lang.Comparable) '#', (java.lang.Comparable) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (#) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(list5);
    }

    @Test
    public void test3191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3191");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetGroup datasetGroup3 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        boolean boolean5 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) (byte) 1);
        org.jfree.data.general.DatasetGroup datasetGroup6 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = defaultBoxAndWhiskerCategoryDataset0.getMaxOutlier((int) (short) 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(datasetGroup3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(datasetGroup6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3192");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = defaultBoxAndWhiskerCategoryDataset0.data;
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        java.util.List list7 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset9 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup10 = defaultBoxAndWhiskerCategoryDataset9.getGroup();
        double double12 = defaultBoxAndWhiskerCategoryDataset9.getRangeLowerBound(false);
        defaultBoxAndWhiskerCategoryDataset9.validateObject();
        defaultBoxAndWhiskerCategoryDataset9.validateObject();
        double double16 = defaultBoxAndWhiskerCategoryDataset9.getRangeUpperBound(true);
        org.jfree.data.Range range18 = defaultBoxAndWhiskerCategoryDataset9.getRangeBounds(true);
        defaultBoxAndWhiskerCategoryDataset9.validateObject();
        int int21 = defaultBoxAndWhiskerCategoryDataset9.getRowIndex((java.lang.Comparable) "");
        java.util.List list22 = defaultBoxAndWhiskerCategoryDataset9.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            defaultBoxAndWhiskerCategoryDataset0.add(list22, (java.lang.Comparable) (short) 100, (java.lang.Comparable) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Range(double, double): require lower (Infinity) <= upper (-Infinity).");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(keyedObjects2D5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(keyedObjects2D8);
        org.junit.Assert.assertNotNull(datasetGroup10);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(list22);
    }

    @Test
    public void test3193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3193");
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
            java.lang.Number number13 = defaultBoxAndWhiskerCategoryDataset0.getQ3Value((int) 'a', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(keyedObjects2D7);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test3194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3194");
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
            java.util.List list11 = defaultBoxAndWhiskerCategoryDataset0.getOutliers((int) ' ', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(datasetGroup7);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test3195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3195");
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
            java.util.List list26 = defaultBoxAndWhiskerCategoryDataset8.getOutliers((java.lang.Comparable) 100.0f, (java.lang.Comparable) 10.0f);
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup23);
    }

    @Test
    public void test3196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3196");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.KeyedObjects2D keyedObjects2D4 = defaultBoxAndWhiskerCategoryDataset0.data;
        java.util.List list5 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = defaultBoxAndWhiskerCategoryDataset0.getMinOutlier((java.lang.Comparable) Double.NaN, (java.lang.Comparable) 100.0f);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (NaN) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(keyedObjects2D3);
        org.junit.Assert.assertNotNull(keyedObjects2D4);
        org.junit.Assert.assertNotNull(list5);
    }

    @Test
    public void test3197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3197");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.Range range4 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        org.jfree.data.general.DatasetGroup datasetGroup5 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        java.util.EventListener eventListener6 = null;
        boolean boolean7 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener6);
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        int int10 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertNotNull(datasetGroup5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test3198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3198");
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
        java.util.EventListener eventListener13 = null;
        boolean boolean14 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener13);
        double double16 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        org.junit.Assert.assertNull(keyedObjects2D5);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNull(keyedObjects2D8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
    }

    @Test
    public void test3199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3199");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10L);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) 10.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D9 = defaultBoxAndWhiskerCategoryDataset0.data;
        int int10 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        java.util.EventListener eventListener11 = null;
        boolean boolean12 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener11);
        java.util.EventListener eventListener13 = null;
        boolean boolean14 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener13);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(keyedObjects2D9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3200");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10L);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) 10.0f);
        int int10 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 10);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test3201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3201");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int1 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup2 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.Range range5 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) -1);
        org.jfree.data.general.DatasetGroup datasetGroup8 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int10 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) 0.0d);
        org.jfree.data.statistics.BoxAndWhiskerItem boxAndWhiskerItem11 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultBoxAndWhiskerCategoryDataset0.add(boxAndWhiskerItem11, (java.lang.Comparable) '4', (java.lang.Comparable) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test3202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3202");
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
            java.lang.Number number19 = defaultBoxAndWhiskerCategoryDataset0.getQ1Value((java.lang.Comparable) 10L, (java.lang.Comparable) 0.0d);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (10) not recognised.");
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
    public void test3203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3203");
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
            java.lang.Number number29 = defaultBoxAndWhiskerCategoryDataset8.getValue(100, 0);
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(keyedObjects2D26);
    }

    @Test
    public void test3204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3204");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 0L);
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        double double5 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = defaultBoxAndWhiskerCategoryDataset0.getQ3Value((java.lang.Comparable) (short) 100, (java.lang.Comparable) "");
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (100) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test3205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3205");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int1 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        java.util.EventListener eventListener4 = null;
        boolean boolean5 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener4);
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = defaultBoxAndWhiskerCategoryDataset0.getMinRegularValue((int) (short) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test3206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3206");
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
        org.jfree.data.general.DatasetChangeListener datasetChangeListener16 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener16);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset18 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener19 = null;
        boolean boolean20 = defaultBoxAndWhiskerCategoryDataset18.hasListener(eventListener19);
        int int22 = defaultBoxAndWhiskerCategoryDataset18.getRowIndex((java.lang.Comparable) 10L);
        int int23 = defaultBoxAndWhiskerCategoryDataset18.getRowCount();
        int int24 = defaultBoxAndWhiskerCategoryDataset18.getColumnCount();
        int int25 = defaultBoxAndWhiskerCategoryDataset18.getColumnCount();
        int int27 = defaultBoxAndWhiskerCategoryDataset18.getRowIndex((java.lang.Comparable) 100.0d);
        java.util.List list28 = defaultBoxAndWhiskerCategoryDataset18.getColumnKeys();
        org.jfree.data.Range range30 = defaultBoxAndWhiskerCategoryDataset18.getRangeBounds(false);
        org.jfree.data.Range range32 = defaultBoxAndWhiskerCategoryDataset18.getRangeBounds(true);
        org.jfree.data.general.DatasetGroup datasetGroup33 = defaultBoxAndWhiskerCategoryDataset18.getGroup();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener34 = null;
        defaultBoxAndWhiskerCategoryDataset18.removeChangeListener(datasetChangeListener34);
        double double37 = defaultBoxAndWhiskerCategoryDataset18.getRangeUpperBound(false);
        java.util.List list38 = defaultBoxAndWhiskerCategoryDataset18.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            defaultBoxAndWhiskerCategoryDataset0.add(list38, (java.lang.Comparable) 10.0f, (java.lang.Comparable) (byte) 100);
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertNotNull(range30);
        org.junit.Assert.assertNotNull(range32);
        org.junit.Assert.assertNotNull(datasetGroup33);
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertNotNull(list38);
    }

    @Test
    public void test3207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3207");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.KeyedObjects2D keyedObjects2D4 = defaultBoxAndWhiskerCategoryDataset0.data;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number7 = defaultBoxAndWhiskerCategoryDataset0.getQ3Value((int) (byte) 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(keyedObjects2D3);
        org.junit.Assert.assertNotNull(keyedObjects2D4);
    }

    @Test
    public void test3208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3208");
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
            java.util.List list16 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
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
    public void test3209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3209");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int1 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        java.util.List list3 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) 1.0d);
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test3210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3210");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10L);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        java.util.List list6 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        double double8 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = defaultBoxAndWhiskerCategoryDataset0.getMaxRegularValue((java.lang.Comparable) 10.0f, (java.lang.Comparable) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (10.0) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test3211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3211");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable6 = defaultBoxAndWhiskerCategoryDataset0.getRowKey((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test3212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3212");
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
        int int19 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D20 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D20;
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }
}

