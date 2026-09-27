package org.jfree.data.category;

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
        java.lang.Number[] numberArray2 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray5 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray8 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[][] numberArray9 = new java.lang.Number[][] { numberArray2, numberArray5, numberArray8 };
        java.lang.Number[][] numberArray10 = null;
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset11 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultIntervalCategoryDataset11.addChangeListener(datasetChangeListener12);
        int int14 = defaultIntervalCategoryDataset11.getCategoryCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultIntervalCategoryDataset11.addChangeListener(datasetChangeListener15);
        java.lang.Comparable[] comparableArray20 = new java.lang.Comparable[] { (byte) -1, (short) 1, (byte) -1 };
        defaultIntervalCategoryDataset11.setSeriesKeys(comparableArray20);
        defaultIntervalCategoryDataset11.validateObject();
        int int23 = defaultIntervalCategoryDataset11.getSeriesCount();
        boolean boolean25 = defaultIntervalCategoryDataset11.equals((java.lang.Object) 1.0f);
        java.lang.Comparable comparable27 = defaultIntervalCategoryDataset11.getRowKey(0);
        java.lang.Number[] numberArray30 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray33 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray36 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[][] numberArray37 = new java.lang.Number[][] { numberArray30, numberArray33, numberArray36 };
        java.lang.Number[][] numberArray38 = null;
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset39 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray37, numberArray38);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener40 = null;
        defaultIntervalCategoryDataset39.addChangeListener(datasetChangeListener40);
        int int42 = defaultIntervalCategoryDataset39.getCategoryCount();
        int int43 = defaultIntervalCategoryDataset39.getCategoryCount();
        org.jfree.data.general.SeriesChangeEvent seriesChangeEvent44 = null;
        defaultIntervalCategoryDataset39.seriesChanged(seriesChangeEvent44);
        int int46 = defaultIntervalCategoryDataset39.getCategoryCount();
        org.jfree.data.general.DatasetGroup datasetGroup47 = defaultIntervalCategoryDataset39.getGroup();
        defaultIntervalCategoryDataset11.setGroup(datasetGroup47);
        defaultIntervalCategoryDataset11.validateObject();
        java.util.List list50 = defaultIntervalCategoryDataset11.getRowKeys();
        org.jfree.data.general.DatasetGroup datasetGroup51 = defaultIntervalCategoryDataset11.getGroup();
        int int53 = defaultIntervalCategoryDataset11.getSeriesIndex((java.lang.Comparable) '4');
        // The following exception was thrown during execution in test generation
        try {
            defaultIntervalCategoryDataset11.setEndValue(1, (java.lang.Comparable) (byte) 0, (java.lang.Number) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray2);
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(comparableArray20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + comparable27 + "' != '" + (byte) -1 + "'", comparable27, (byte) -1);
        org.junit.Assert.assertNotNull(numberArray30);
        org.junit.Assert.assertNotNull(numberArray33);
        org.junit.Assert.assertNotNull(numberArray36);
        org.junit.Assert.assertNotNull(numberArray37);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 2 + "'", int42 == 2);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2 + "'", int43 == 2);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 2 + "'", int46 == 2);
        org.junit.Assert.assertNotNull(datasetGroup47);
        org.junit.Assert.assertNotNull(list50);
        org.junit.Assert.assertNotNull(datasetGroup51);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        java.lang.Number[] numberArray2 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray5 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray8 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[][] numberArray9 = new java.lang.Number[][] { numberArray2, numberArray5, numberArray8 };
        java.lang.Number[][] numberArray10 = null;
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset11 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultIntervalCategoryDataset11.addChangeListener(datasetChangeListener12);
        int int14 = defaultIntervalCategoryDataset11.getCategoryCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultIntervalCategoryDataset11.addChangeListener(datasetChangeListener15);
        java.lang.Comparable[] comparableArray20 = new java.lang.Comparable[] { (byte) -1, (short) 1, (byte) -1 };
        defaultIntervalCategoryDataset11.setSeriesKeys(comparableArray20);
        int int23 = defaultIntervalCategoryDataset11.indexOf((java.lang.Comparable) false);
        java.lang.String[] strArray28 = new java.lang.String[] { "", "hi!", "", "" };
        java.lang.Number[][] numberArray29 = null;
        java.lang.Number[] numberArray30 = new java.lang.Number[] {};
        java.lang.Number[] numberArray31 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray32 = new java.lang.Number[][] { numberArray30, numberArray31 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset33 = new org.jfree.data.category.DefaultIntervalCategoryDataset(strArray28, numberArray29, numberArray32);
        java.lang.Number[] numberArray36 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray39 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray42 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[][] numberArray43 = new java.lang.Number[][] { numberArray36, numberArray39, numberArray42 };
        java.lang.Number[][] numberArray44 = null;
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset45 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray43, numberArray44);
        int int46 = defaultIntervalCategoryDataset45.getSeriesCount();
        boolean boolean47 = defaultIntervalCategoryDataset33.hasListener((java.util.EventListener) defaultIntervalCategoryDataset45);
        boolean boolean48 = defaultIntervalCategoryDataset11.hasListener((java.util.EventListener) defaultIntervalCategoryDataset33);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener49 = null;
        defaultIntervalCategoryDataset33.addChangeListener(datasetChangeListener49);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener51 = null;
        defaultIntervalCategoryDataset33.removeChangeListener(datasetChangeListener51);
        int int53 = defaultIntervalCategoryDataset33.getSeriesCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number56 = defaultIntervalCategoryDataset33.getEndValue(10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: DefaultIntervalCategoryDataset.getValue(): series index out of range.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray2);
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(comparableArray20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertArrayEquals(strArray28, new java.lang.String[] { "", "hi!", "", "" });
        org.junit.Assert.assertNotNull(numberArray30);
        org.junit.Assert.assertArrayEquals(numberArray30, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray31);
        org.junit.Assert.assertArrayEquals(numberArray31, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray32);
        org.junit.Assert.assertNotNull(numberArray36);
        org.junit.Assert.assertNotNull(numberArray39);
        org.junit.Assert.assertNotNull(numberArray42);
        org.junit.Assert.assertNotNull(numberArray43);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 3 + "'", int46 == 3);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        double[] doubleArray4 = new double[] { (short) 10, '4', 1, 100.0f };
        double[] doubleArray9 = new double[] { (short) 10, '4', 1, 100.0f };
        double[] doubleArray14 = new double[] { (short) 10, '4', 1, 100.0f };
        double[][] doubleArray15 = new double[][] { doubleArray4, doubleArray9, doubleArray14 };
        double[] doubleArray20 = new double[] { (-1L), 1.0f, 3, 100.0f };
        double[] doubleArray25 = new double[] { (-1L), 1.0f, 3, 100.0f };
        double[] doubleArray30 = new double[] { (-1L), 1.0f, 3, 100.0f };
        double[][] doubleArray31 = new double[][] { doubleArray20, doubleArray25, doubleArray30 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset32 = new org.jfree.data.category.DefaultIntervalCategoryDataset(doubleArray15, doubleArray31);
        double[] doubleArray38 = new double[] { (short) 100, 100L, (-1), 100.0f, '4' };
        double[] doubleArray44 = new double[] { (short) 100, 100L, (-1), 100.0f, '4' };
        double[] doubleArray50 = new double[] { (short) 100, 100L, (-1), 100.0f, '4' };
        double[] doubleArray56 = new double[] { (short) 100, 100L, (-1), 100.0f, '4' };
        double[] doubleArray62 = new double[] { (short) 100, 100L, (-1), 100.0f, '4' };
        double[][] doubleArray63 = new double[][] { doubleArray38, doubleArray44, doubleArray50, doubleArray56, doubleArray62 };
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset64 = new org.jfree.data.category.DefaultIntervalCategoryDataset(doubleArray31, doubleArray63);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: DefaultIntervalCategoryDataset: the number of series in the start value dataset does not match the number of series in the end value dataset.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, 52.0d, 1.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 10.0d, 52.0d, 1.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 10.0d, 52.0d, 1.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { (-1.0d), 1.0d, 3.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { (-1.0d), 1.0d, 3.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertArrayEquals(doubleArray30, new double[] { (-1.0d), 1.0d, 3.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { 100.0d, 100.0d, (-1.0d), 100.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertArrayEquals(doubleArray44, new double[] { 100.0d, 100.0d, (-1.0d), 100.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertArrayEquals(doubleArray50, new double[] { 100.0d, 100.0d, (-1.0d), 100.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertArrayEquals(doubleArray56, new double[] { 100.0d, 100.0d, (-1.0d), 100.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertArrayEquals(doubleArray62, new double[] { 100.0d, 100.0d, (-1.0d), 100.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray63);
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        java.lang.Number[] numberArray2 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray5 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray8 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[][] numberArray9 = new java.lang.Number[][] { numberArray2, numberArray5, numberArray8 };
        java.lang.Number[][] numberArray10 = null;
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset11 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultIntervalCategoryDataset11.addChangeListener(datasetChangeListener12);
        int int14 = defaultIntervalCategoryDataset11.getCategoryCount();
        int int15 = defaultIntervalCategoryDataset11.getCategoryCount();
        org.jfree.data.general.SeriesChangeEvent seriesChangeEvent16 = null;
        defaultIntervalCategoryDataset11.seriesChanged(seriesChangeEvent16);
        int int18 = defaultIntervalCategoryDataset11.getCategoryCount();
        org.jfree.data.general.DatasetGroup datasetGroup19 = defaultIntervalCategoryDataset11.getGroup();
        defaultIntervalCategoryDataset11.validateObject();
        java.lang.Comparable[] comparableArray23 = new java.lang.Comparable[] { (-1.0f), 1 };
        defaultIntervalCategoryDataset11.setCategoryKeys(comparableArray23);
        java.lang.String[] strArray29 = new java.lang.String[] { "", "hi!", "", "" };
        java.lang.Number[][] numberArray30 = null;
        java.lang.Number[] numberArray31 = new java.lang.Number[] {};
        java.lang.Number[] numberArray32 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray33 = new java.lang.Number[][] { numberArray31, numberArray32 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset34 = new org.jfree.data.category.DefaultIntervalCategoryDataset(strArray29, numberArray30, numberArray33);
        java.lang.Number[] numberArray37 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray40 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray43 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[][] numberArray44 = new java.lang.Number[][] { numberArray37, numberArray40, numberArray43 };
        java.lang.Number[][] numberArray45 = null;
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset46 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray44, numberArray45);
        java.lang.Number[] numberArray47 = new java.lang.Number[] {};
        java.lang.Number[] numberArray48 = new java.lang.Number[] {};
        java.lang.Number[] numberArray49 = new java.lang.Number[] {};
        java.lang.Number[] numberArray50 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray51 = new java.lang.Number[][] { numberArray47, numberArray48, numberArray49, numberArray50 };
        java.lang.Number[][] numberArray52 = null;
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset53 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray51, numberArray52);
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset54 = new org.jfree.data.category.DefaultIntervalCategoryDataset(comparableArray23, (java.lang.Comparable[]) strArray29, numberArray45, numberArray52);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener55 = null;
        defaultIntervalCategoryDataset54.addChangeListener(datasetChangeListener55);
        java.util.List list57 = defaultIntervalCategoryDataset54.getColumnKeys();
        org.junit.Assert.assertNotNull(numberArray2);
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNotNull(datasetGroup19);
        org.junit.Assert.assertNotNull(comparableArray23);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { "", "hi!", "", "" });
        org.junit.Assert.assertNotNull(numberArray31);
        org.junit.Assert.assertArrayEquals(numberArray31, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray32);
        org.junit.Assert.assertArrayEquals(numberArray32, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray33);
        org.junit.Assert.assertNotNull(numberArray37);
        org.junit.Assert.assertNotNull(numberArray40);
        org.junit.Assert.assertNotNull(numberArray43);
        org.junit.Assert.assertNotNull(numberArray44);
        org.junit.Assert.assertNotNull(numberArray47);
        org.junit.Assert.assertArrayEquals(numberArray47, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray48);
        org.junit.Assert.assertArrayEquals(numberArray48, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray49);
        org.junit.Assert.assertArrayEquals(numberArray49, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray50);
        org.junit.Assert.assertArrayEquals(numberArray50, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray51);
        org.junit.Assert.assertNotNull(list57);
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        java.lang.Number[] numberArray2 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray5 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray8 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[][] numberArray9 = new java.lang.Number[][] { numberArray2, numberArray5, numberArray8 };
        java.lang.Number[][] numberArray10 = null;
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset11 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultIntervalCategoryDataset11.addChangeListener(datasetChangeListener12);
        int int14 = defaultIntervalCategoryDataset11.getCategoryCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultIntervalCategoryDataset11.addChangeListener(datasetChangeListener15);
        java.lang.Comparable[] comparableArray20 = new java.lang.Comparable[] { (byte) -1, (short) 1, (byte) -1 };
        defaultIntervalCategoryDataset11.setSeriesKeys(comparableArray20);
        boolean boolean23 = defaultIntervalCategoryDataset11.equals((java.lang.Object) 1L);
        java.util.List list24 = defaultIntervalCategoryDataset11.getRowKeys();
        java.util.List list25 = defaultIntervalCategoryDataset11.getColumnKeys();
        java.util.List list26 = defaultIntervalCategoryDataset11.getRowKeys();
        java.lang.Number[] numberArray29 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray32 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray35 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[][] numberArray36 = new java.lang.Number[][] { numberArray29, numberArray32, numberArray35 };
        java.lang.Number[][] numberArray37 = null;
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset38 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray36, numberArray37);
        int int39 = defaultIntervalCategoryDataset38.getSeriesCount();
        int int40 = defaultIntervalCategoryDataset38.getCategoryCount();
        boolean boolean42 = defaultIntervalCategoryDataset38.equals((java.lang.Object) 1.0f);
        boolean boolean43 = defaultIntervalCategoryDataset11.equals((java.lang.Object) defaultIntervalCategoryDataset38);
        int int45 = defaultIntervalCategoryDataset11.getRowIndex((java.lang.Comparable) 1);
        int int46 = defaultIntervalCategoryDataset11.getCategoryCount();
        java.util.List list47 = defaultIntervalCategoryDataset11.getRowKeys();
        int int49 = defaultIntervalCategoryDataset11.indexOf((java.lang.Comparable) '#');
        int int51 = defaultIntervalCategoryDataset11.getSeriesIndex((java.lang.Comparable) (byte) 1);
        org.jfree.data.general.SeriesChangeEvent seriesChangeEvent52 = null;
        defaultIntervalCategoryDataset11.seriesChanged(seriesChangeEvent52);
        org.junit.Assert.assertNotNull(numberArray2);
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(comparableArray20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertNotNull(numberArray29);
        org.junit.Assert.assertNotNull(numberArray32);
        org.junit.Assert.assertNotNull(numberArray35);
        org.junit.Assert.assertNotNull(numberArray36);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 3 + "'", int39 == 3);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 2 + "'", int40 == 2);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 2 + "'", int46 == 2);
        org.junit.Assert.assertNotNull(list47);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        java.lang.Number[] numberArray2 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray5 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray8 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[][] numberArray9 = new java.lang.Number[][] { numberArray2, numberArray5, numberArray8 };
        java.lang.Number[][] numberArray10 = null;
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset11 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultIntervalCategoryDataset11.addChangeListener(datasetChangeListener12);
        int int14 = defaultIntervalCategoryDataset11.getCategoryCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultIntervalCategoryDataset11.addChangeListener(datasetChangeListener15);
        java.lang.Comparable[] comparableArray20 = new java.lang.Comparable[] { (byte) -1, (short) 1, (byte) -1 };
        defaultIntervalCategoryDataset11.setSeriesKeys(comparableArray20);
        int int23 = defaultIntervalCategoryDataset11.indexOf((java.lang.Comparable) false);
        org.jfree.data.general.DatasetGroup datasetGroup24 = defaultIntervalCategoryDataset11.getGroup();
        int int26 = defaultIntervalCategoryDataset11.getRowIndex((java.lang.Comparable) (short) 0);
        java.lang.Number[] numberArray29 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray32 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray35 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[][] numberArray36 = new java.lang.Number[][] { numberArray29, numberArray32, numberArray35 };
        java.lang.Number[][] numberArray37 = null;
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset38 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray36, numberArray37);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener39 = null;
        defaultIntervalCategoryDataset38.addChangeListener(datasetChangeListener39);
        int int41 = defaultIntervalCategoryDataset38.getCategoryCount();
        boolean boolean42 = defaultIntervalCategoryDataset11.equals((java.lang.Object) int41);
        int int43 = defaultIntervalCategoryDataset11.getCategoryCount();
        int int44 = defaultIntervalCategoryDataset11.getSeriesCount();
        int int45 = defaultIntervalCategoryDataset11.getRowCount();
        int int47 = defaultIntervalCategoryDataset11.getRowIndex((java.lang.Comparable) 100L);
        org.junit.Assert.assertNotNull(numberArray2);
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(comparableArray20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(numberArray29);
        org.junit.Assert.assertNotNull(numberArray32);
        org.junit.Assert.assertNotNull(numberArray35);
        org.junit.Assert.assertNotNull(numberArray36);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 2 + "'", int41 == 2);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2 + "'", int43 == 2);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 3 + "'", int44 == 3);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 3 + "'", int45 == 3);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        java.lang.Number[] numberArray2 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray5 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray8 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[][] numberArray9 = new java.lang.Number[][] { numberArray2, numberArray5, numberArray8 };
        java.lang.Number[][] numberArray10 = null;
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset11 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray10);
        int int12 = defaultIntervalCategoryDataset11.getSeriesCount();
        int int13 = defaultIntervalCategoryDataset11.getCategoryCount();
        java.lang.Number[] numberArray16 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray22 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[][] numberArray23 = new java.lang.Number[][] { numberArray16, numberArray19, numberArray22 };
        java.lang.Number[][] numberArray24 = null;
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset25 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray23, numberArray24);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener26 = null;
        defaultIntervalCategoryDataset25.addChangeListener(datasetChangeListener26);
        int int28 = defaultIntervalCategoryDataset25.getCategoryCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener29 = null;
        defaultIntervalCategoryDataset25.addChangeListener(datasetChangeListener29);
        java.lang.Comparable[] comparableArray34 = new java.lang.Comparable[] { (byte) -1, (short) 1, (byte) -1 };
        defaultIntervalCategoryDataset25.setSeriesKeys(comparableArray34);
        boolean boolean37 = defaultIntervalCategoryDataset25.equals((java.lang.Object) 1L);
        boolean boolean38 = defaultIntervalCategoryDataset11.hasListener((java.util.EventListener) defaultIntervalCategoryDataset25);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener39 = null;
        defaultIntervalCategoryDataset11.removeChangeListener(datasetChangeListener39);
        org.jfree.data.general.DatasetGroup datasetGroup41 = defaultIntervalCategoryDataset11.getGroup();
        org.junit.Assert.assertNotNull(numberArray2);
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNotNull(numberArray16);
        org.junit.Assert.assertNotNull(numberArray19);
        org.junit.Assert.assertNotNull(numberArray22);
        org.junit.Assert.assertNotNull(numberArray23);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2 + "'", int28 == 2);
        org.junit.Assert.assertNotNull(comparableArray34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(datasetGroup41);
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        java.lang.Number[] numberArray2 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray5 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray8 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[][] numberArray9 = new java.lang.Number[][] { numberArray2, numberArray5, numberArray8 };
        java.lang.Number[][] numberArray10 = null;
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset11 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray10);
        java.lang.String[] strArray16 = new java.lang.String[] { "", "hi!", "", "" };
        java.lang.Number[][] numberArray17 = null;
        java.lang.Number[] numberArray18 = new java.lang.Number[] {};
        java.lang.Number[] numberArray19 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray20 = new java.lang.Number[][] { numberArray18, numberArray19 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset21 = new org.jfree.data.category.DefaultIntervalCategoryDataset(strArray16, numberArray17, numberArray20);
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset22 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray17);
        java.lang.Number[] numberArray23 = new java.lang.Number[] {};
        java.lang.Number[] numberArray24 = new java.lang.Number[] {};
        java.lang.Number[] numberArray25 = new java.lang.Number[] {};
        java.lang.Number[] numberArray26 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray27 = new java.lang.Number[][] { numberArray23, numberArray24, numberArray25, numberArray26 };
        java.lang.Number[][] numberArray28 = null;
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset29 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray27, numberArray28);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset30 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: DefaultIntervalCategoryDataset: the number of series in the start value dataset does not match the number of series in the end value dataset.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray2);
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "", "hi!", "", "" });
        org.junit.Assert.assertNotNull(numberArray18);
        org.junit.Assert.assertArrayEquals(numberArray18, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray19);
        org.junit.Assert.assertArrayEquals(numberArray19, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertNotNull(numberArray23);
        org.junit.Assert.assertArrayEquals(numberArray23, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray24);
        org.junit.Assert.assertArrayEquals(numberArray24, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray25);
        org.junit.Assert.assertArrayEquals(numberArray25, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray26);
        org.junit.Assert.assertArrayEquals(numberArray26, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray27);
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        java.lang.Number[] numberArray2 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray5 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray8 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[][] numberArray9 = new java.lang.Number[][] { numberArray2, numberArray5, numberArray8 };
        java.lang.Number[][] numberArray10 = null;
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset11 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultIntervalCategoryDataset11.addChangeListener(datasetChangeListener12);
        int int14 = defaultIntervalCategoryDataset11.getCategoryCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultIntervalCategoryDataset11.addChangeListener(datasetChangeListener15);
        java.lang.Comparable[] comparableArray20 = new java.lang.Comparable[] { (byte) -1, (short) 1, (byte) -1 };
        defaultIntervalCategoryDataset11.setSeriesKeys(comparableArray20);
        boolean boolean23 = defaultIntervalCategoryDataset11.equals((java.lang.Object) 1L);
        java.util.List list24 = defaultIntervalCategoryDataset11.getColumnKeys();
        int int25 = defaultIntervalCategoryDataset11.getRowCount();
        defaultIntervalCategoryDataset11.validateObject();
        // The following exception was thrown during execution in test generation
        try {
            int int27 = defaultIntervalCategoryDataset11.getColumnCount();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray2);
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(comparableArray20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        java.lang.Number[] numberArray2 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray5 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray8 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[][] numberArray9 = new java.lang.Number[][] { numberArray2, numberArray5, numberArray8 };
        java.lang.Number[][] numberArray10 = null;
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset11 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultIntervalCategoryDataset11.addChangeListener(datasetChangeListener12);
        int int14 = defaultIntervalCategoryDataset11.getCategoryCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultIntervalCategoryDataset11.addChangeListener(datasetChangeListener15);
        java.lang.Comparable[] comparableArray20 = new java.lang.Comparable[] { (byte) -1, (short) 1, (byte) -1 };
        defaultIntervalCategoryDataset11.setSeriesKeys(comparableArray20);
        int int23 = defaultIntervalCategoryDataset11.indexOf((java.lang.Comparable) false);
        org.jfree.data.general.DatasetGroup datasetGroup24 = defaultIntervalCategoryDataset11.getGroup();
        int int26 = defaultIntervalCategoryDataset11.getRowIndex((java.lang.Comparable) (short) 0);
        java.lang.Number[] numberArray29 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray32 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray35 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[][] numberArray36 = new java.lang.Number[][] { numberArray29, numberArray32, numberArray35 };
        java.lang.Number[][] numberArray37 = null;
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset38 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray36, numberArray37);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener39 = null;
        defaultIntervalCategoryDataset38.addChangeListener(datasetChangeListener39);
        int int41 = defaultIntervalCategoryDataset38.getCategoryCount();
        boolean boolean42 = defaultIntervalCategoryDataset11.equals((java.lang.Object) int41);
        int int43 = defaultIntervalCategoryDataset11.getSeriesCount();
        int int45 = defaultIntervalCategoryDataset11.getRowIndex((java.lang.Comparable) (short) -1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener46 = null;
        defaultIntervalCategoryDataset11.addChangeListener(datasetChangeListener46);
        org.junit.Assert.assertNotNull(numberArray2);
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(comparableArray20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(numberArray29);
        org.junit.Assert.assertNotNull(numberArray32);
        org.junit.Assert.assertNotNull(numberArray35);
        org.junit.Assert.assertNotNull(numberArray36);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 2 + "'", int41 == 2);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 3 + "'", int43 == 3);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        java.lang.Number[] numberArray2 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray5 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray8 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[][] numberArray9 = new java.lang.Number[][] { numberArray2, numberArray5, numberArray8 };
        java.lang.Number[][] numberArray10 = null;
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset11 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray10);
        int int12 = defaultIntervalCategoryDataset11.getSeriesCount();
        int int13 = defaultIntervalCategoryDataset11.getCategoryCount();
        java.util.List list14 = defaultIntervalCategoryDataset11.getColumnKeys();
        java.util.List list15 = defaultIntervalCategoryDataset11.getRowKeys();
        java.lang.Object obj16 = null;
        boolean boolean17 = defaultIntervalCategoryDataset11.equals(obj16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable19 = defaultIntervalCategoryDataset11.getColumnKey(5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray2);
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        java.lang.Number[] numberArray2 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray5 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray8 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[][] numberArray9 = new java.lang.Number[][] { numberArray2, numberArray5, numberArray8 };
        java.lang.Number[][] numberArray10 = null;
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset11 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultIntervalCategoryDataset11.addChangeListener(datasetChangeListener12);
        int int14 = defaultIntervalCategoryDataset11.getCategoryCount();
        int int15 = defaultIntervalCategoryDataset11.getSeriesCount();
        org.jfree.data.general.DatasetGroup datasetGroup16 = defaultIntervalCategoryDataset11.getGroup();
        int int17 = defaultIntervalCategoryDataset11.getCategoryCount();
        // The following exception was thrown during execution in test generation
        try {
            int int19 = defaultIntervalCategoryDataset11.getColumnIndex((java.lang.Comparable) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray2);
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNotNull(datasetGroup16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!", "", "" };
        java.lang.Number[][] numberArray5 = null;
        java.lang.Number[] numberArray6 = new java.lang.Number[] {};
        java.lang.Number[] numberArray7 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray6, numberArray7 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset9 = new org.jfree.data.category.DefaultIntervalCategoryDataset(strArray4, numberArray5, numberArray8);
        java.lang.Number[] numberArray12 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray15 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray18 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[][] numberArray19 = new java.lang.Number[][] { numberArray12, numberArray15, numberArray18 };
        java.lang.Number[][] numberArray20 = null;
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset21 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray19, numberArray20);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener22 = null;
        defaultIntervalCategoryDataset21.addChangeListener(datasetChangeListener22);
        int int24 = defaultIntervalCategoryDataset21.getCategoryCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener25 = null;
        defaultIntervalCategoryDataset21.addChangeListener(datasetChangeListener25);
        java.lang.Comparable[] comparableArray30 = new java.lang.Comparable[] { (byte) -1, (short) 1, (byte) -1 };
        defaultIntervalCategoryDataset21.setSeriesKeys(comparableArray30);
        int int33 = defaultIntervalCategoryDataset21.indexOf((java.lang.Comparable) false);
        org.jfree.data.general.DatasetGroup datasetGroup34 = defaultIntervalCategoryDataset21.getGroup();
        int int36 = defaultIntervalCategoryDataset21.getRowIndex((java.lang.Comparable) (short) 0);
        java.lang.Number[] numberArray39 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray42 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray45 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[][] numberArray46 = new java.lang.Number[][] { numberArray39, numberArray42, numberArray45 };
        java.lang.Number[][] numberArray47 = null;
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset48 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray46, numberArray47);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener49 = null;
        defaultIntervalCategoryDataset48.addChangeListener(datasetChangeListener49);
        int int51 = defaultIntervalCategoryDataset48.getCategoryCount();
        boolean boolean52 = defaultIntervalCategoryDataset21.equals((java.lang.Object) int51);
        int int53 = defaultIntervalCategoryDataset21.getSeriesCount();
        boolean boolean54 = defaultIntervalCategoryDataset9.hasListener((java.util.EventListener) defaultIntervalCategoryDataset21);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener55 = null;
        defaultIntervalCategoryDataset9.addChangeListener(datasetChangeListener55);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener57 = null;
        defaultIntervalCategoryDataset9.addChangeListener(datasetChangeListener57);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number61 = defaultIntervalCategoryDataset9.getEndValue(0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: DefaultIntervalCategoryDataset.getValue(): series index out of range.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "hi!", "", "" });
        org.junit.Assert.assertNotNull(numberArray6);
        org.junit.Assert.assertArrayEquals(numberArray6, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertArrayEquals(numberArray7, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray12);
        org.junit.Assert.assertNotNull(numberArray15);
        org.junit.Assert.assertNotNull(numberArray18);
        org.junit.Assert.assertNotNull(numberArray19);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertNotNull(comparableArray30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(numberArray39);
        org.junit.Assert.assertNotNull(numberArray42);
        org.junit.Assert.assertNotNull(numberArray45);
        org.junit.Assert.assertNotNull(numberArray46);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 2 + "'", int51 == 2);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 3 + "'", int53 == 3);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        java.lang.Number[] numberArray2 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray5 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray8 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[][] numberArray9 = new java.lang.Number[][] { numberArray2, numberArray5, numberArray8 };
        java.lang.Number[][] numberArray10 = null;
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset11 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray10);
        int int12 = defaultIntervalCategoryDataset11.getSeriesCount();
        org.jfree.data.general.DatasetGroup datasetGroup13 = defaultIntervalCategoryDataset11.getGroup();
        java.util.EventListener eventListener14 = null;
        boolean boolean15 = defaultIntervalCategoryDataset11.hasListener(eventListener14);
        java.util.List list16 = defaultIntervalCategoryDataset11.getColumnKeys();
        int int17 = defaultIntervalCategoryDataset11.getSeriesCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener18 = null;
        defaultIntervalCategoryDataset11.addChangeListener(datasetChangeListener18);
        int int20 = defaultIntervalCategoryDataset11.getCategoryCount();
        org.jfree.data.general.DatasetGroup datasetGroup21 = defaultIntervalCategoryDataset11.getGroup();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number24 = defaultIntervalCategoryDataset11.getEndValue((int) (short) 0, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: DefaultIntervalCategoryDataset.getValue(): category index out of range.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray2);
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(datasetGroup13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertNotNull(datasetGroup21);
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        java.lang.Number[] numberArray2 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray5 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray8 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[][] numberArray9 = new java.lang.Number[][] { numberArray2, numberArray5, numberArray8 };
        java.lang.Number[][] numberArray10 = null;
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset11 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultIntervalCategoryDataset11.addChangeListener(datasetChangeListener12);
        int int14 = defaultIntervalCategoryDataset11.getCategoryCount();
        int int15 = defaultIntervalCategoryDataset11.getCategoryCount();
        org.jfree.data.general.SeriesChangeEvent seriesChangeEvent16 = null;
        defaultIntervalCategoryDataset11.seriesChanged(seriesChangeEvent16);
        org.jfree.data.general.SeriesChangeEvent seriesChangeEvent18 = null;
        defaultIntervalCategoryDataset11.seriesChanged(seriesChangeEvent18);
        org.jfree.data.general.SeriesChangeEvent seriesChangeEvent20 = null;
        defaultIntervalCategoryDataset11.seriesChanged(seriesChangeEvent20);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = defaultIntervalCategoryDataset11.getRowIndex((java.lang.Comparable) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray2);
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        java.lang.Number[] numberArray2 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray5 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray8 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[][] numberArray9 = new java.lang.Number[][] { numberArray2, numberArray5, numberArray8 };
        java.lang.Number[][] numberArray10 = null;
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset11 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray10);
        java.util.List list12 = defaultIntervalCategoryDataset11.getColumnKeys();
        int int13 = defaultIntervalCategoryDataset11.getSeriesCount();
        org.jfree.data.general.DatasetGroup datasetGroup14 = defaultIntervalCategoryDataset11.getGroup();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable16 = defaultIntervalCategoryDataset11.getRowKey((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray2);
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertNotNull(datasetGroup14);
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        java.lang.Number[] numberArray2 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray5 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray8 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[][] numberArray9 = new java.lang.Number[][] { numberArray2, numberArray5, numberArray8 };
        java.lang.Number[][] numberArray10 = null;
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset11 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultIntervalCategoryDataset11.addChangeListener(datasetChangeListener12);
        int int14 = defaultIntervalCategoryDataset11.getCategoryCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultIntervalCategoryDataset11.addChangeListener(datasetChangeListener15);
        java.lang.Comparable[] comparableArray20 = new java.lang.Comparable[] { (byte) -1, (short) 1, (byte) -1 };
        defaultIntervalCategoryDataset11.setSeriesKeys(comparableArray20);
        int int23 = defaultIntervalCategoryDataset11.indexOf((java.lang.Comparable) false);
        org.jfree.data.general.DatasetGroup datasetGroup24 = defaultIntervalCategoryDataset11.getGroup();
        int int26 = defaultIntervalCategoryDataset11.getRowIndex((java.lang.Comparable) (short) 0);
        java.lang.Number[] numberArray29 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray32 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray35 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[][] numberArray36 = new java.lang.Number[][] { numberArray29, numberArray32, numberArray35 };
        java.lang.Number[][] numberArray37 = null;
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset38 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray36, numberArray37);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener39 = null;
        defaultIntervalCategoryDataset38.addChangeListener(datasetChangeListener39);
        int int41 = defaultIntervalCategoryDataset38.getCategoryCount();
        boolean boolean42 = defaultIntervalCategoryDataset11.equals((java.lang.Object) int41);
        int int43 = defaultIntervalCategoryDataset11.getCategoryCount();
        java.lang.Object obj44 = null;
        boolean boolean45 = defaultIntervalCategoryDataset11.equals(obj44);
        java.lang.Comparable comparable46 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number48 = defaultIntervalCategoryDataset11.getEndValue(comparable46, (java.lang.Comparable) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray2);
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(comparableArray20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(numberArray29);
        org.junit.Assert.assertNotNull(numberArray32);
        org.junit.Assert.assertNotNull(numberArray35);
        org.junit.Assert.assertNotNull(numberArray36);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 2 + "'", int41 == 2);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2 + "'", int43 == 2);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
        java.lang.Number[] numberArray2 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray5 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray8 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[][] numberArray9 = new java.lang.Number[][] { numberArray2, numberArray5, numberArray8 };
        java.lang.Number[][] numberArray10 = null;
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset11 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultIntervalCategoryDataset11.addChangeListener(datasetChangeListener12);
        int int14 = defaultIntervalCategoryDataset11.getCategoryCount();
        int int15 = defaultIntervalCategoryDataset11.getCategoryCount();
        org.jfree.data.general.SeriesChangeEvent seriesChangeEvent16 = null;
        defaultIntervalCategoryDataset11.seriesChanged(seriesChangeEvent16);
        int int18 = defaultIntervalCategoryDataset11.getCategoryCount();
        org.jfree.data.general.DatasetGroup datasetGroup19 = defaultIntervalCategoryDataset11.getGroup();
        defaultIntervalCategoryDataset11.validateObject();
        java.lang.Comparable[] comparableArray23 = new java.lang.Comparable[] { (-1.0f), 1 };
        defaultIntervalCategoryDataset11.setCategoryKeys(comparableArray23);
        java.lang.String[] strArray29 = new java.lang.String[] { "", "hi!", "", "" };
        java.lang.Number[][] numberArray30 = null;
        java.lang.Number[] numberArray31 = new java.lang.Number[] {};
        java.lang.Number[] numberArray32 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray33 = new java.lang.Number[][] { numberArray31, numberArray32 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset34 = new org.jfree.data.category.DefaultIntervalCategoryDataset(strArray29, numberArray30, numberArray33);
        java.lang.Number[] numberArray37 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray40 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray43 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[][] numberArray44 = new java.lang.Number[][] { numberArray37, numberArray40, numberArray43 };
        java.lang.Number[][] numberArray45 = null;
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset46 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray44, numberArray45);
        java.lang.Number[] numberArray47 = new java.lang.Number[] {};
        java.lang.Number[] numberArray48 = new java.lang.Number[] {};
        java.lang.Number[] numberArray49 = new java.lang.Number[] {};
        java.lang.Number[] numberArray50 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray51 = new java.lang.Number[][] { numberArray47, numberArray48, numberArray49, numberArray50 };
        java.lang.Number[][] numberArray52 = null;
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset53 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray51, numberArray52);
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset54 = new org.jfree.data.category.DefaultIntervalCategoryDataset(comparableArray23, (java.lang.Comparable[]) strArray29, numberArray45, numberArray52);
        int int55 = defaultIntervalCategoryDataset54.getSeriesCount();
        defaultIntervalCategoryDataset54.validateObject();
        org.junit.Assert.assertNotNull(numberArray2);
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNotNull(datasetGroup19);
        org.junit.Assert.assertNotNull(comparableArray23);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { "", "hi!", "", "" });
        org.junit.Assert.assertNotNull(numberArray31);
        org.junit.Assert.assertArrayEquals(numberArray31, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray32);
        org.junit.Assert.assertArrayEquals(numberArray32, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray33);
        org.junit.Assert.assertNotNull(numberArray37);
        org.junit.Assert.assertNotNull(numberArray40);
        org.junit.Assert.assertNotNull(numberArray43);
        org.junit.Assert.assertNotNull(numberArray44);
        org.junit.Assert.assertNotNull(numberArray47);
        org.junit.Assert.assertArrayEquals(numberArray47, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray48);
        org.junit.Assert.assertArrayEquals(numberArray48, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray49);
        org.junit.Assert.assertArrayEquals(numberArray49, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray50);
        org.junit.Assert.assertArrayEquals(numberArray50, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray51);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        java.lang.Number[] numberArray2 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray5 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray8 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[][] numberArray9 = new java.lang.Number[][] { numberArray2, numberArray5, numberArray8 };
        java.lang.Number[][] numberArray10 = null;
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset11 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultIntervalCategoryDataset11.addChangeListener(datasetChangeListener12);
        int int14 = defaultIntervalCategoryDataset11.getCategoryCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultIntervalCategoryDataset11.addChangeListener(datasetChangeListener15);
        java.lang.Comparable[] comparableArray20 = new java.lang.Comparable[] { (byte) -1, (short) 1, (byte) -1 };
        defaultIntervalCategoryDataset11.setSeriesKeys(comparableArray20);
        defaultIntervalCategoryDataset11.validateObject();
        java.lang.Number[] numberArray28 = new java.lang.Number[] { 100, 1L, (-1.0f), 10, 10 };
        java.lang.Number[] numberArray34 = new java.lang.Number[] { 100, 1L, (-1.0f), 10, 10 };
        java.lang.Number[] numberArray40 = new java.lang.Number[] { 100, 1L, (-1.0f), 10, 10 };
        java.lang.Number[] numberArray46 = new java.lang.Number[] { 100, 1L, (-1.0f), 10, 10 };
        java.lang.Number[] numberArray52 = new java.lang.Number[] { 100, 1L, (-1.0f), 10, 10 };
        java.lang.Number[] numberArray58 = new java.lang.Number[] { 100, 1L, (-1.0f), 10, 10 };
        java.lang.Number[][] numberArray59 = new java.lang.Number[][] { numberArray28, numberArray34, numberArray40, numberArray46, numberArray52, numberArray58 };
        java.lang.Number[] numberArray62 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray65 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray68 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[][] numberArray69 = new java.lang.Number[][] { numberArray62, numberArray65, numberArray68 };
        java.lang.Number[][] numberArray70 = null;
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset71 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray69, numberArray70);
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset72 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray59, numberArray70);
        org.jfree.data.general.SeriesChangeEvent seriesChangeEvent73 = null;
        defaultIntervalCategoryDataset72.seriesChanged(seriesChangeEvent73);
        org.jfree.data.general.DatasetGroup datasetGroup75 = defaultIntervalCategoryDataset72.getGroup();
        org.jfree.data.general.SeriesChangeEvent seriesChangeEvent76 = null;
        defaultIntervalCategoryDataset72.seriesChanged(seriesChangeEvent76);
        boolean boolean78 = defaultIntervalCategoryDataset11.hasListener((java.util.EventListener) defaultIntervalCategoryDataset72);
        int int79 = defaultIntervalCategoryDataset72.getSeriesCount();
        org.junit.Assert.assertNotNull(numberArray2);
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(comparableArray20);
        org.junit.Assert.assertNotNull(numberArray28);
        org.junit.Assert.assertNotNull(numberArray34);
        org.junit.Assert.assertNotNull(numberArray40);
        org.junit.Assert.assertNotNull(numberArray46);
        org.junit.Assert.assertNotNull(numberArray52);
        org.junit.Assert.assertNotNull(numberArray58);
        org.junit.Assert.assertNotNull(numberArray59);
        org.junit.Assert.assertNotNull(numberArray62);
        org.junit.Assert.assertNotNull(numberArray65);
        org.junit.Assert.assertNotNull(numberArray68);
        org.junit.Assert.assertNotNull(numberArray69);
        org.junit.Assert.assertNotNull(datasetGroup75);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 6 + "'", int79 == 6);
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        java.lang.Number[] numberArray2 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray5 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray8 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[][] numberArray9 = new java.lang.Number[][] { numberArray2, numberArray5, numberArray8 };
        java.lang.Number[][] numberArray10 = null;
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset11 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray10);
        java.util.List list12 = defaultIntervalCategoryDataset11.getColumnKeys();
        int int13 = defaultIntervalCategoryDataset11.getSeriesCount();
        defaultIntervalCategoryDataset11.validateObject();
        java.lang.Object obj15 = null;
        boolean boolean16 = defaultIntervalCategoryDataset11.equals(obj15);
        org.jfree.data.general.SeriesChangeEvent seriesChangeEvent17 = null;
        defaultIntervalCategoryDataset11.seriesChanged(seriesChangeEvent17);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener19 = null;
        defaultIntervalCategoryDataset11.removeChangeListener(datasetChangeListener19);
        java.lang.Comparable[] comparableArray21 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultIntervalCategoryDataset11.setCategoryKeys(comparableArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'categoryKeys' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray2);
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        java.lang.Number[] numberArray2 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray5 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray8 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[][] numberArray9 = new java.lang.Number[][] { numberArray2, numberArray5, numberArray8 };
        java.lang.Number[][] numberArray10 = null;
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset11 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultIntervalCategoryDataset11.addChangeListener(datasetChangeListener12);
        int int14 = defaultIntervalCategoryDataset11.getCategoryCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultIntervalCategoryDataset11.addChangeListener(datasetChangeListener15);
        java.lang.Comparable[] comparableArray20 = new java.lang.Comparable[] { (byte) -1, (short) 1, (byte) -1 };
        defaultIntervalCategoryDataset11.setSeriesKeys(comparableArray20);
        defaultIntervalCategoryDataset11.validateObject();
        int int23 = defaultIntervalCategoryDataset11.getSeriesCount();
        boolean boolean25 = defaultIntervalCategoryDataset11.equals((java.lang.Object) 1.0f);
        java.lang.Comparable comparable27 = defaultIntervalCategoryDataset11.getRowKey(0);
        java.lang.Number[] numberArray30 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray33 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray36 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[][] numberArray37 = new java.lang.Number[][] { numberArray30, numberArray33, numberArray36 };
        java.lang.Number[][] numberArray38 = null;
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset39 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray37, numberArray38);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener40 = null;
        defaultIntervalCategoryDataset39.addChangeListener(datasetChangeListener40);
        int int42 = defaultIntervalCategoryDataset39.getCategoryCount();
        int int43 = defaultIntervalCategoryDataset39.getCategoryCount();
        org.jfree.data.general.SeriesChangeEvent seriesChangeEvent44 = null;
        defaultIntervalCategoryDataset39.seriesChanged(seriesChangeEvent44);
        int int46 = defaultIntervalCategoryDataset39.getCategoryCount();
        org.jfree.data.general.DatasetGroup datasetGroup47 = defaultIntervalCategoryDataset39.getGroup();
        defaultIntervalCategoryDataset11.setGroup(datasetGroup47);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number51 = defaultIntervalCategoryDataset11.getEndValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 10.0d);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unknown 'series' key.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray2);
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(comparableArray20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + comparable27 + "' != '" + (byte) -1 + "'", comparable27, (byte) -1);
        org.junit.Assert.assertNotNull(numberArray30);
        org.junit.Assert.assertNotNull(numberArray33);
        org.junit.Assert.assertNotNull(numberArray36);
        org.junit.Assert.assertNotNull(numberArray37);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 2 + "'", int42 == 2);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2 + "'", int43 == 2);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 2 + "'", int46 == 2);
        org.junit.Assert.assertNotNull(datasetGroup47);
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        java.lang.Number[] numberArray2 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray5 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray8 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[][] numberArray9 = new java.lang.Number[][] { numberArray2, numberArray5, numberArray8 };
        java.lang.Number[][] numberArray10 = null;
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset11 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultIntervalCategoryDataset11.addChangeListener(datasetChangeListener12);
        int int14 = defaultIntervalCategoryDataset11.getCategoryCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultIntervalCategoryDataset11.addChangeListener(datasetChangeListener15);
        java.lang.Comparable[] comparableArray20 = new java.lang.Comparable[] { (byte) -1, (short) 1, (byte) -1 };
        defaultIntervalCategoryDataset11.setSeriesKeys(comparableArray20);
        org.jfree.data.general.DatasetGroup datasetGroup22 = defaultIntervalCategoryDataset11.getGroup();
        int int23 = defaultIntervalCategoryDataset11.getCategoryCount();
        int int25 = defaultIntervalCategoryDataset11.getRowIndex((java.lang.Comparable) (-1L));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number28 = defaultIntervalCategoryDataset11.getEndValue((int) (short) 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: DefaultIntervalCategoryDataset.getValue(): series index out of range.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray2);
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(comparableArray20);
        org.junit.Assert.assertNotNull(datasetGroup22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        java.lang.Number[] numberArray2 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray5 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray8 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[][] numberArray9 = new java.lang.Number[][] { numberArray2, numberArray5, numberArray8 };
        java.lang.Number[][] numberArray10 = null;
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset11 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultIntervalCategoryDataset11.addChangeListener(datasetChangeListener12);
        int int14 = defaultIntervalCategoryDataset11.getCategoryCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultIntervalCategoryDataset11.addChangeListener(datasetChangeListener15);
        java.lang.Comparable[] comparableArray20 = new java.lang.Comparable[] { (byte) -1, (short) 1, (byte) -1 };
        defaultIntervalCategoryDataset11.setSeriesKeys(comparableArray20);
        org.jfree.data.general.DatasetGroup datasetGroup22 = defaultIntervalCategoryDataset11.getGroup();
        int int23 = defaultIntervalCategoryDataset11.getCategoryCount();
        int int25 = defaultIntervalCategoryDataset11.indexOf((java.lang.Comparable) (byte) 0);
        org.jfree.data.general.DatasetGroup datasetGroup26 = defaultIntervalCategoryDataset11.getGroup();
        int int28 = defaultIntervalCategoryDataset11.indexOf((java.lang.Comparable) (-1L));
        org.junit.Assert.assertNotNull(numberArray2);
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(comparableArray20);
        org.junit.Assert.assertNotNull(datasetGroup22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        double[] doubleArray4 = new double[] { (short) 10, '4', 1, 100.0f };
        double[] doubleArray9 = new double[] { (short) 10, '4', 1, 100.0f };
        double[] doubleArray14 = new double[] { (short) 10, '4', 1, 100.0f };
        double[][] doubleArray15 = new double[][] { doubleArray4, doubleArray9, doubleArray14 };
        double[] doubleArray20 = new double[] { (-1L), 1.0f, 3, 100.0f };
        double[] doubleArray25 = new double[] { (-1L), 1.0f, 3, 100.0f };
        double[] doubleArray30 = new double[] { (-1L), 1.0f, 3, 100.0f };
        double[][] doubleArray31 = new double[][] { doubleArray20, doubleArray25, doubleArray30 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset32 = new org.jfree.data.category.DefaultIntervalCategoryDataset(doubleArray15, doubleArray31);
        double[] doubleArray34 = new double[] { ' ' };
        double[] doubleArray36 = new double[] { ' ' };
        double[] doubleArray38 = new double[] { ' ' };
        double[] doubleArray40 = new double[] { ' ' };
        double[] doubleArray42 = new double[] { ' ' };
        double[][] doubleArray43 = new double[][] { doubleArray34, doubleArray36, doubleArray38, doubleArray40, doubleArray42 };
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset44 = new org.jfree.data.category.DefaultIntervalCategoryDataset(doubleArray15, doubleArray43);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: DefaultIntervalCategoryDataset: the number of series in the start value dataset does not match the number of series in the end value dataset.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, 52.0d, 1.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 10.0d, 52.0d, 1.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 10.0d, 52.0d, 1.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { (-1.0d), 1.0d, 3.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { (-1.0d), 1.0d, 3.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertArrayEquals(doubleArray30, new double[] { (-1.0d), 1.0d, 3.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] { 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertArrayEquals(doubleArray36, new double[] { 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertArrayEquals(doubleArray40, new double[] { 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertArrayEquals(doubleArray42, new double[] { 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray43);
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        java.lang.Number[] numberArray2 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray5 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray8 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[][] numberArray9 = new java.lang.Number[][] { numberArray2, numberArray5, numberArray8 };
        java.lang.Number[][] numberArray10 = null;
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset11 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultIntervalCategoryDataset11.addChangeListener(datasetChangeListener12);
        int int14 = defaultIntervalCategoryDataset11.getCategoryCount();
        int int15 = defaultIntervalCategoryDataset11.getSeriesCount();
        org.jfree.data.general.DatasetGroup datasetGroup16 = defaultIntervalCategoryDataset11.getGroup();
        java.util.List list17 = defaultIntervalCategoryDataset11.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number20 = defaultIntervalCategoryDataset11.getStartValue((java.lang.Comparable) '4', (java.lang.Comparable) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray2);
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNotNull(datasetGroup16);
        org.junit.Assert.assertNotNull(list17);
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        java.lang.Number[] numberArray2 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray5 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray8 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[][] numberArray9 = new java.lang.Number[][] { numberArray2, numberArray5, numberArray8 };
        java.lang.Number[][] numberArray10 = null;
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset11 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultIntervalCategoryDataset11.addChangeListener(datasetChangeListener12);
        int int14 = defaultIntervalCategoryDataset11.getCategoryCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultIntervalCategoryDataset11.addChangeListener(datasetChangeListener15);
        java.lang.Comparable[] comparableArray20 = new java.lang.Comparable[] { (byte) -1, (short) 1, (byte) -1 };
        defaultIntervalCategoryDataset11.setSeriesKeys(comparableArray20);
        defaultIntervalCategoryDataset11.validateObject();
        int int23 = defaultIntervalCategoryDataset11.getSeriesCount();
        boolean boolean25 = defaultIntervalCategoryDataset11.equals((java.lang.Object) 1.0f);
        java.lang.Comparable comparable27 = defaultIntervalCategoryDataset11.getRowKey(0);
        int int28 = defaultIntervalCategoryDataset11.getSeriesCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable30 = defaultIntervalCategoryDataset11.getColumnKey((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray2);
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(comparableArray20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + comparable27 + "' != '" + (byte) -1 + "'", comparable27, (byte) -1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        java.lang.Number[] numberArray2 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray5 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray8 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[][] numberArray9 = new java.lang.Number[][] { numberArray2, numberArray5, numberArray8 };
        java.lang.Number[][] numberArray10 = null;
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset11 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultIntervalCategoryDataset11.addChangeListener(datasetChangeListener12);
        int int14 = defaultIntervalCategoryDataset11.getCategoryCount();
        int int15 = defaultIntervalCategoryDataset11.getCategoryCount();
        org.jfree.data.general.SeriesChangeEvent seriesChangeEvent16 = null;
        defaultIntervalCategoryDataset11.seriesChanged(seriesChangeEvent16);
        int int18 = defaultIntervalCategoryDataset11.getCategoryCount();
        org.jfree.data.general.DatasetGroup datasetGroup19 = defaultIntervalCategoryDataset11.getGroup();
        defaultIntervalCategoryDataset11.validateObject();
        java.lang.Comparable[] comparableArray23 = new java.lang.Comparable[] { (-1.0f), 1 };
        defaultIntervalCategoryDataset11.setCategoryKeys(comparableArray23);
        java.lang.String[] strArray29 = new java.lang.String[] { "", "hi!", "", "" };
        java.lang.Number[][] numberArray30 = null;
        java.lang.Number[] numberArray31 = new java.lang.Number[] {};
        java.lang.Number[] numberArray32 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray33 = new java.lang.Number[][] { numberArray31, numberArray32 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset34 = new org.jfree.data.category.DefaultIntervalCategoryDataset(strArray29, numberArray30, numberArray33);
        java.lang.Number[] numberArray37 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray40 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray43 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[][] numberArray44 = new java.lang.Number[][] { numberArray37, numberArray40, numberArray43 };
        java.lang.Number[][] numberArray45 = null;
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset46 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray44, numberArray45);
        java.lang.Number[] numberArray47 = new java.lang.Number[] {};
        java.lang.Number[] numberArray48 = new java.lang.Number[] {};
        java.lang.Number[] numberArray49 = new java.lang.Number[] {};
        java.lang.Number[] numberArray50 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray51 = new java.lang.Number[][] { numberArray47, numberArray48, numberArray49, numberArray50 };
        java.lang.Number[][] numberArray52 = null;
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset53 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray51, numberArray52);
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset54 = new org.jfree.data.category.DefaultIntervalCategoryDataset(comparableArray23, (java.lang.Comparable[]) strArray29, numberArray45, numberArray52);
        int int55 = defaultIntervalCategoryDataset54.getSeriesCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number58 = defaultIntervalCategoryDataset54.getStartValue(5, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: DefaultIntervalCategoryDataset.getValue(): series index out of range.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray2);
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNotNull(datasetGroup19);
        org.junit.Assert.assertNotNull(comparableArray23);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { "", "hi!", "", "" });
        org.junit.Assert.assertNotNull(numberArray31);
        org.junit.Assert.assertArrayEquals(numberArray31, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray32);
        org.junit.Assert.assertArrayEquals(numberArray32, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray33);
        org.junit.Assert.assertNotNull(numberArray37);
        org.junit.Assert.assertNotNull(numberArray40);
        org.junit.Assert.assertNotNull(numberArray43);
        org.junit.Assert.assertNotNull(numberArray44);
        org.junit.Assert.assertNotNull(numberArray47);
        org.junit.Assert.assertArrayEquals(numberArray47, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray48);
        org.junit.Assert.assertArrayEquals(numberArray48, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray49);
        org.junit.Assert.assertArrayEquals(numberArray49, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray50);
        org.junit.Assert.assertArrayEquals(numberArray50, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray51);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        java.lang.Number[] numberArray2 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray5 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray8 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[][] numberArray9 = new java.lang.Number[][] { numberArray2, numberArray5, numberArray8 };
        java.lang.Number[][] numberArray10 = null;
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset11 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultIntervalCategoryDataset11.addChangeListener(datasetChangeListener12);
        int int14 = defaultIntervalCategoryDataset11.getCategoryCount();
        int int15 = defaultIntervalCategoryDataset11.getCategoryCount();
        org.jfree.data.general.SeriesChangeEvent seriesChangeEvent16 = null;
        defaultIntervalCategoryDataset11.seriesChanged(seriesChangeEvent16);
        java.lang.Number[] numberArray20 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray23 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray26 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[][] numberArray27 = new java.lang.Number[][] { numberArray20, numberArray23, numberArray26 };
        java.lang.Number[][] numberArray28 = null;
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset29 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray27, numberArray28);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener30 = null;
        defaultIntervalCategoryDataset29.addChangeListener(datasetChangeListener30);
        int int32 = defaultIntervalCategoryDataset29.getCategoryCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener33 = null;
        defaultIntervalCategoryDataset29.addChangeListener(datasetChangeListener33);
        java.lang.Comparable[] comparableArray38 = new java.lang.Comparable[] { (byte) -1, (short) 1, (byte) -1 };
        defaultIntervalCategoryDataset29.setSeriesKeys(comparableArray38);
        defaultIntervalCategoryDataset29.validateObject();
        int int41 = defaultIntervalCategoryDataset29.getSeriesCount();
        boolean boolean43 = defaultIntervalCategoryDataset29.equals((java.lang.Object) 1.0f);
        boolean boolean44 = defaultIntervalCategoryDataset11.hasListener((java.util.EventListener) defaultIntervalCategoryDataset29);
        int int45 = defaultIntervalCategoryDataset11.getSeriesCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener46 = null;
        defaultIntervalCategoryDataset11.removeChangeListener(datasetChangeListener46);
        java.util.List list48 = defaultIntervalCategoryDataset11.getRowKeys();
        org.junit.Assert.assertNotNull(numberArray2);
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertNotNull(numberArray23);
        org.junit.Assert.assertNotNull(numberArray26);
        org.junit.Assert.assertNotNull(numberArray27);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2 + "'", int32 == 2);
        org.junit.Assert.assertNotNull(comparableArray38);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 3 + "'", int41 == 3);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 3 + "'", int45 == 3);
        org.junit.Assert.assertNotNull(list48);
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        java.lang.Number[] numberArray2 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray5 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray8 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[][] numberArray9 = new java.lang.Number[][] { numberArray2, numberArray5, numberArray8 };
        java.lang.Number[][] numberArray10 = null;
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset11 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray10);
        int int12 = defaultIntervalCategoryDataset11.getSeriesCount();
        int int13 = defaultIntervalCategoryDataset11.getCategoryCount();
        java.lang.Number[] numberArray16 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray22 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[][] numberArray23 = new java.lang.Number[][] { numberArray16, numberArray19, numberArray22 };
        java.lang.Number[][] numberArray24 = null;
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset25 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray23, numberArray24);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener26 = null;
        defaultIntervalCategoryDataset25.addChangeListener(datasetChangeListener26);
        int int28 = defaultIntervalCategoryDataset25.getCategoryCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener29 = null;
        defaultIntervalCategoryDataset25.addChangeListener(datasetChangeListener29);
        java.lang.Comparable[] comparableArray34 = new java.lang.Comparable[] { (byte) -1, (short) 1, (byte) -1 };
        defaultIntervalCategoryDataset25.setSeriesKeys(comparableArray34);
        boolean boolean37 = defaultIntervalCategoryDataset25.equals((java.lang.Object) 1L);
        boolean boolean38 = defaultIntervalCategoryDataset11.hasListener((java.util.EventListener) defaultIntervalCategoryDataset25);
        int int40 = defaultIntervalCategoryDataset25.getRowIndex((java.lang.Comparable) 10.0f);
        java.lang.Comparable comparable42 = defaultIntervalCategoryDataset25.getRowKey((int) (short) 0);
        org.jfree.data.general.SeriesChangeEvent seriesChangeEvent43 = null;
        defaultIntervalCategoryDataset25.seriesChanged(seriesChangeEvent43);
        int int46 = defaultIntervalCategoryDataset25.getRowIndex((java.lang.Comparable) 10L);
        int int48 = defaultIntervalCategoryDataset25.getRowIndex((java.lang.Comparable) 100.0d);
        java.util.List list49 = defaultIntervalCategoryDataset25.getRowKeys();
        int int51 = defaultIntervalCategoryDataset25.getSeriesIndex((java.lang.Comparable) 100L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number54 = defaultIntervalCategoryDataset25.getStartValue((java.lang.Comparable) ' ', (java.lang.Comparable) 100L);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unknown 'series' key.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray2);
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNotNull(numberArray16);
        org.junit.Assert.assertNotNull(numberArray19);
        org.junit.Assert.assertNotNull(numberArray22);
        org.junit.Assert.assertNotNull(numberArray23);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2 + "'", int28 == 2);
        org.junit.Assert.assertNotNull(comparableArray34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertEquals("'" + comparable42 + "' != '" + (byte) -1 + "'", comparable42, (byte) -1);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(list49);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!", "", "" };
        java.lang.Number[][] numberArray5 = null;
        java.lang.Number[] numberArray6 = new java.lang.Number[] {};
        java.lang.Number[] numberArray7 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray6, numberArray7 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset9 = new org.jfree.data.category.DefaultIntervalCategoryDataset(strArray4, numberArray5, numberArray8);
        java.lang.Number[] numberArray12 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray15 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray18 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[][] numberArray19 = new java.lang.Number[][] { numberArray12, numberArray15, numberArray18 };
        java.lang.Number[][] numberArray20 = null;
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset21 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray19, numberArray20);
        int int22 = defaultIntervalCategoryDataset21.getSeriesCount();
        boolean boolean23 = defaultIntervalCategoryDataset9.hasListener((java.util.EventListener) defaultIntervalCategoryDataset21);
        java.lang.Number[] numberArray26 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray29 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray32 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[][] numberArray33 = new java.lang.Number[][] { numberArray26, numberArray29, numberArray32 };
        java.lang.Number[][] numberArray34 = null;
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset35 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray33, numberArray34);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener36 = null;
        defaultIntervalCategoryDataset35.addChangeListener(datasetChangeListener36);
        int int38 = defaultIntervalCategoryDataset35.getCategoryCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener39 = null;
        defaultIntervalCategoryDataset35.addChangeListener(datasetChangeListener39);
        java.lang.Comparable[] comparableArray44 = new java.lang.Comparable[] { (byte) -1, (short) 1, (byte) -1 };
        defaultIntervalCategoryDataset35.setSeriesKeys(comparableArray44);
        int int47 = defaultIntervalCategoryDataset35.indexOf((java.lang.Comparable) false);
        org.jfree.data.general.DatasetGroup datasetGroup48 = defaultIntervalCategoryDataset35.getGroup();
        int int50 = defaultIntervalCategoryDataset35.getRowIndex((java.lang.Comparable) (short) 0);
        boolean boolean51 = defaultIntervalCategoryDataset21.hasListener((java.util.EventListener) defaultIntervalCategoryDataset35);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number54 = defaultIntervalCategoryDataset21.getStartValue(10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: DefaultIntervalCategoryDataset.getValue(): series index out of range.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "hi!", "", "" });
        org.junit.Assert.assertNotNull(numberArray6);
        org.junit.Assert.assertArrayEquals(numberArray6, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertArrayEquals(numberArray7, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray12);
        org.junit.Assert.assertNotNull(numberArray15);
        org.junit.Assert.assertNotNull(numberArray18);
        org.junit.Assert.assertNotNull(numberArray19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(numberArray26);
        org.junit.Assert.assertNotNull(numberArray29);
        org.junit.Assert.assertNotNull(numberArray32);
        org.junit.Assert.assertNotNull(numberArray33);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2 + "'", int38 == 2);
        org.junit.Assert.assertNotNull(comparableArray44);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup48);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        java.lang.Number[] numberArray2 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray5 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray8 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[][] numberArray9 = new java.lang.Number[][] { numberArray2, numberArray5, numberArray8 };
        java.lang.Number[][] numberArray10 = null;
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset11 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultIntervalCategoryDataset11.addChangeListener(datasetChangeListener12);
        int int14 = defaultIntervalCategoryDataset11.getCategoryCount();
        org.jfree.data.general.DatasetGroup datasetGroup15 = defaultIntervalCategoryDataset11.getGroup();
        defaultIntervalCategoryDataset11.validateObject();
        java.util.List list17 = defaultIntervalCategoryDataset11.getRowKeys();
        int int18 = defaultIntervalCategoryDataset11.getSeriesCount();
        org.junit.Assert.assertNotNull(numberArray2);
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(datasetGroup15);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        java.lang.Number[] numberArray2 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray5 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray8 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[][] numberArray9 = new java.lang.Number[][] { numberArray2, numberArray5, numberArray8 };
        java.lang.Number[][] numberArray10 = null;
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset11 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray10);
        java.util.List list12 = defaultIntervalCategoryDataset11.getColumnKeys();
        int int13 = defaultIntervalCategoryDataset11.getSeriesCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener14 = null;
        defaultIntervalCategoryDataset11.addChangeListener(datasetChangeListener14);
        java.util.List list16 = defaultIntervalCategoryDataset11.getRowKeys();
        org.jfree.data.general.DatasetGroup datasetGroup17 = defaultIntervalCategoryDataset11.getGroup();
        java.util.List list18 = defaultIntervalCategoryDataset11.getColumnKeys();
        org.jfree.data.general.SeriesChangeEvent seriesChangeEvent19 = null;
        defaultIntervalCategoryDataset11.seriesChanged(seriesChangeEvent19);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = defaultIntervalCategoryDataset11.getRowIndex((java.lang.Comparable) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray2);
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNotNull(datasetGroup17);
        org.junit.Assert.assertNotNull(list18);
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
        java.lang.Number[] numberArray2 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray5 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray8 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[][] numberArray9 = new java.lang.Number[][] { numberArray2, numberArray5, numberArray8 };
        java.lang.Number[][] numberArray10 = null;
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset11 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultIntervalCategoryDataset11.addChangeListener(datasetChangeListener12);
        int int14 = defaultIntervalCategoryDataset11.getCategoryCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultIntervalCategoryDataset11.addChangeListener(datasetChangeListener15);
        java.lang.Comparable[] comparableArray20 = new java.lang.Comparable[] { (byte) -1, (short) 1, (byte) -1 };
        defaultIntervalCategoryDataset11.setSeriesKeys(comparableArray20);
        boolean boolean23 = defaultIntervalCategoryDataset11.equals((java.lang.Object) 1L);
        java.util.List list24 = defaultIntervalCategoryDataset11.getColumnKeys();
        java.util.List list25 = defaultIntervalCategoryDataset11.getRowKeys();
        java.util.List list26 = defaultIntervalCategoryDataset11.getRowKeys();
        org.jfree.data.general.SeriesChangeEvent seriesChangeEvent27 = null;
        defaultIntervalCategoryDataset11.seriesChanged(seriesChangeEvent27);
        int int30 = defaultIntervalCategoryDataset11.getRowIndex((java.lang.Comparable) 100);
        int int32 = defaultIntervalCategoryDataset11.indexOf((java.lang.Comparable) 'a');
        org.junit.Assert.assertNotNull(numberArray2);
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(comparableArray20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        java.lang.Number[] numberArray2 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray5 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray8 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[][] numberArray9 = new java.lang.Number[][] { numberArray2, numberArray5, numberArray8 };
        java.lang.Number[][] numberArray10 = null;
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset11 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray10);
        int int12 = defaultIntervalCategoryDataset11.getSeriesCount();
        int int13 = defaultIntervalCategoryDataset11.getCategoryCount();
        java.lang.Number[] numberArray16 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray22 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[][] numberArray23 = new java.lang.Number[][] { numberArray16, numberArray19, numberArray22 };
        java.lang.Number[][] numberArray24 = null;
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset25 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray23, numberArray24);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener26 = null;
        defaultIntervalCategoryDataset25.addChangeListener(datasetChangeListener26);
        int int28 = defaultIntervalCategoryDataset25.getCategoryCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener29 = null;
        defaultIntervalCategoryDataset25.addChangeListener(datasetChangeListener29);
        java.lang.Comparable[] comparableArray34 = new java.lang.Comparable[] { (byte) -1, (short) 1, (byte) -1 };
        defaultIntervalCategoryDataset25.setSeriesKeys(comparableArray34);
        boolean boolean37 = defaultIntervalCategoryDataset25.equals((java.lang.Object) 1L);
        boolean boolean38 = defaultIntervalCategoryDataset11.hasListener((java.util.EventListener) defaultIntervalCategoryDataset25);
        int int39 = defaultIntervalCategoryDataset25.getSeriesCount();
        org.jfree.data.general.SeriesChangeEvent seriesChangeEvent40 = null;
        defaultIntervalCategoryDataset25.seriesChanged(seriesChangeEvent40);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener42 = null;
        defaultIntervalCategoryDataset25.addChangeListener(datasetChangeListener42);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener44 = null;
        defaultIntervalCategoryDataset25.removeChangeListener(datasetChangeListener44);
        org.junit.Assert.assertNotNull(numberArray2);
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNotNull(numberArray16);
        org.junit.Assert.assertNotNull(numberArray19);
        org.junit.Assert.assertNotNull(numberArray22);
        org.junit.Assert.assertNotNull(numberArray23);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2 + "'", int28 == 2);
        org.junit.Assert.assertNotNull(comparableArray34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 3 + "'", int39 == 3);
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        java.lang.Number[] numberArray2 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray5 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray8 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[][] numberArray9 = new java.lang.Number[][] { numberArray2, numberArray5, numberArray8 };
        java.lang.Number[][] numberArray10 = null;
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset11 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultIntervalCategoryDataset11.addChangeListener(datasetChangeListener12);
        int int14 = defaultIntervalCategoryDataset11.getCategoryCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultIntervalCategoryDataset11.addChangeListener(datasetChangeListener15);
        java.lang.Comparable[] comparableArray20 = new java.lang.Comparable[] { (byte) -1, (short) 1, (byte) -1 };
        defaultIntervalCategoryDataset11.setSeriesKeys(comparableArray20);
        boolean boolean23 = defaultIntervalCategoryDataset11.equals((java.lang.Object) 1L);
        java.util.List list24 = defaultIntervalCategoryDataset11.getRowKeys();
        java.util.List list25 = defaultIntervalCategoryDataset11.getColumnKeys();
        java.util.List list26 = defaultIntervalCategoryDataset11.getRowKeys();
        java.lang.Number[] numberArray29 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray32 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray35 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[][] numberArray36 = new java.lang.Number[][] { numberArray29, numberArray32, numberArray35 };
        java.lang.Number[][] numberArray37 = null;
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset38 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray36, numberArray37);
        int int39 = defaultIntervalCategoryDataset38.getSeriesCount();
        int int40 = defaultIntervalCategoryDataset38.getCategoryCount();
        boolean boolean42 = defaultIntervalCategoryDataset38.equals((java.lang.Object) 1.0f);
        boolean boolean43 = defaultIntervalCategoryDataset11.equals((java.lang.Object) defaultIntervalCategoryDataset38);
        org.jfree.data.general.DatasetGroup datasetGroup44 = defaultIntervalCategoryDataset11.getGroup();
        org.jfree.data.general.SeriesChangeEvent seriesChangeEvent45 = null;
        defaultIntervalCategoryDataset11.seriesChanged(seriesChangeEvent45);
        java.lang.Comparable comparable47 = null;
        int int48 = defaultIntervalCategoryDataset11.indexOf(comparable47);
        org.junit.Assert.assertNotNull(numberArray2);
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(comparableArray20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertNotNull(numberArray29);
        org.junit.Assert.assertNotNull(numberArray32);
        org.junit.Assert.assertNotNull(numberArray35);
        org.junit.Assert.assertNotNull(numberArray36);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 3 + "'", int39 == 3);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 2 + "'", int40 == 2);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(datasetGroup44);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        java.lang.Number[] numberArray2 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray5 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray8 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[][] numberArray9 = new java.lang.Number[][] { numberArray2, numberArray5, numberArray8 };
        java.lang.Number[][] numberArray10 = null;
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset11 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray10);
        int int12 = defaultIntervalCategoryDataset11.getSeriesCount();
        org.jfree.data.general.DatasetGroup datasetGroup13 = defaultIntervalCategoryDataset11.getGroup();
        java.util.EventListener eventListener14 = null;
        boolean boolean15 = defaultIntervalCategoryDataset11.hasListener(eventListener14);
        java.lang.Number[] numberArray18 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray21 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray24 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[][] numberArray25 = new java.lang.Number[][] { numberArray18, numberArray21, numberArray24 };
        java.lang.Number[][] numberArray26 = null;
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset27 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray25, numberArray26);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener28 = null;
        defaultIntervalCategoryDataset27.addChangeListener(datasetChangeListener28);
        int int30 = defaultIntervalCategoryDataset27.getCategoryCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener31 = null;
        defaultIntervalCategoryDataset27.addChangeListener(datasetChangeListener31);
        java.lang.Comparable[] comparableArray36 = new java.lang.Comparable[] { (byte) -1, (short) 1, (byte) -1 };
        defaultIntervalCategoryDataset27.setSeriesKeys(comparableArray36);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener38 = null;
        defaultIntervalCategoryDataset27.addChangeListener(datasetChangeListener38);
        boolean boolean40 = defaultIntervalCategoryDataset11.hasListener((java.util.EventListener) datasetChangeListener38);
        java.util.List list41 = defaultIntervalCategoryDataset11.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable43 = defaultIntervalCategoryDataset11.getRowKey((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray2);
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(datasetGroup13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(numberArray18);
        org.junit.Assert.assertNotNull(numberArray21);
        org.junit.Assert.assertNotNull(numberArray24);
        org.junit.Assert.assertNotNull(numberArray25);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertNotNull(comparableArray36);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(list41);
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        java.lang.Comparable[] comparableArray1 = new java.lang.Comparable[] { 100L };
        java.lang.Number[] numberArray4 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[][] numberArray11 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10 };
        java.lang.Number[][] numberArray12 = null;
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset13 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray11, numberArray12);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener14 = null;
        defaultIntervalCategoryDataset13.addChangeListener(datasetChangeListener14);
        int int16 = defaultIntervalCategoryDataset13.getCategoryCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener17 = null;
        defaultIntervalCategoryDataset13.addChangeListener(datasetChangeListener17);
        java.lang.Comparable[] comparableArray22 = new java.lang.Comparable[] { (byte) -1, (short) 1, (byte) -1 };
        defaultIntervalCategoryDataset13.setSeriesKeys(comparableArray22);
        java.lang.Number[] numberArray24 = new java.lang.Number[] {};
        java.lang.Number[] numberArray25 = new java.lang.Number[] {};
        java.lang.Number[] numberArray26 = new java.lang.Number[] {};
        java.lang.Number[] numberArray27 = new java.lang.Number[] {};
        java.lang.Number[] numberArray28 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray29 = new java.lang.Number[][] { numberArray24, numberArray25, numberArray26, numberArray27, numberArray28 };
        java.lang.Number[] numberArray32 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray35 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray38 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[][] numberArray39 = new java.lang.Number[][] { numberArray32, numberArray35, numberArray38 };
        java.lang.Number[][] numberArray40 = null;
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset41 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray39, numberArray40);
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset42 = new org.jfree.data.category.DefaultIntervalCategoryDataset(comparableArray1, comparableArray22, numberArray29, numberArray40);
        int int43 = defaultIntervalCategoryDataset42.getCategoryCount();
        int int44 = defaultIntervalCategoryDataset42.getSeriesCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number47 = defaultIntervalCategoryDataset42.getEndValue((int) (short) 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: DefaultIntervalCategoryDataset.getValue(): category index out of range.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparableArray1);
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertNotNull(comparableArray22);
        org.junit.Assert.assertNotNull(numberArray24);
        org.junit.Assert.assertArrayEquals(numberArray24, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray25);
        org.junit.Assert.assertArrayEquals(numberArray25, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray26);
        org.junit.Assert.assertArrayEquals(numberArray26, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray27);
        org.junit.Assert.assertArrayEquals(numberArray27, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray28);
        org.junit.Assert.assertArrayEquals(numberArray28, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray29);
        org.junit.Assert.assertNotNull(numberArray32);
        org.junit.Assert.assertNotNull(numberArray35);
        org.junit.Assert.assertNotNull(numberArray38);
        org.junit.Assert.assertNotNull(numberArray39);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 5 + "'", int44 == 5);
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        java.lang.Number[] numberArray2 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray5 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray8 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[][] numberArray9 = new java.lang.Number[][] { numberArray2, numberArray5, numberArray8 };
        java.lang.Number[][] numberArray10 = null;
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset11 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultIntervalCategoryDataset11.addChangeListener(datasetChangeListener12);
        int int14 = defaultIntervalCategoryDataset11.getCategoryCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultIntervalCategoryDataset11.addChangeListener(datasetChangeListener15);
        java.lang.Comparable[] comparableArray20 = new java.lang.Comparable[] { (byte) -1, (short) 1, (byte) -1 };
        defaultIntervalCategoryDataset11.setSeriesKeys(comparableArray20);
        int int23 = defaultIntervalCategoryDataset11.indexOf((java.lang.Comparable) false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener24 = null;
        defaultIntervalCategoryDataset11.addChangeListener(datasetChangeListener24);
        int int27 = defaultIntervalCategoryDataset11.getSeriesIndex((java.lang.Comparable) 0.0f);
        int int29 = defaultIntervalCategoryDataset11.getSeriesIndex((java.lang.Comparable) (short) 100);
        int int31 = defaultIntervalCategoryDataset11.getSeriesIndex((java.lang.Comparable) (byte) -1);
        int int32 = defaultIntervalCategoryDataset11.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable34 = defaultIntervalCategoryDataset11.getSeriesKey((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No such series : 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray2);
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(comparableArray20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 3 + "'", int32 == 3);
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        java.lang.Number[] numberArray2 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray5 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray8 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[][] numberArray9 = new java.lang.Number[][] { numberArray2, numberArray5, numberArray8 };
        java.lang.Number[][] numberArray10 = null;
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset11 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultIntervalCategoryDataset11.addChangeListener(datasetChangeListener12);
        int int14 = defaultIntervalCategoryDataset11.getCategoryCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultIntervalCategoryDataset11.addChangeListener(datasetChangeListener15);
        java.lang.Comparable[] comparableArray20 = new java.lang.Comparable[] { (byte) -1, (short) 1, (byte) -1 };
        defaultIntervalCategoryDataset11.setSeriesKeys(comparableArray20);
        defaultIntervalCategoryDataset11.validateObject();
        int int23 = defaultIntervalCategoryDataset11.getSeriesCount();
        java.lang.Number[] numberArray26 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray29 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray32 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[][] numberArray33 = new java.lang.Number[][] { numberArray26, numberArray29, numberArray32 };
        java.lang.Number[][] numberArray34 = null;
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset35 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray33, numberArray34);
        int int36 = defaultIntervalCategoryDataset35.getSeriesCount();
        org.jfree.data.general.DatasetGroup datasetGroup37 = defaultIntervalCategoryDataset35.getGroup();
        java.util.EventListener eventListener38 = null;
        boolean boolean39 = defaultIntervalCategoryDataset35.hasListener(eventListener38);
        java.util.List list40 = defaultIntervalCategoryDataset35.getColumnKeys();
        boolean boolean41 = defaultIntervalCategoryDataset11.equals((java.lang.Object) defaultIntervalCategoryDataset35);
        java.lang.Number number44 = defaultIntervalCategoryDataset11.getStartValue(0, 1);
        int int46 = defaultIntervalCategoryDataset11.getRowIndex((java.lang.Comparable) (short) 10);
        org.junit.Assert.assertNotNull(numberArray2);
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(comparableArray20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertNotNull(numberArray26);
        org.junit.Assert.assertNotNull(numberArray29);
        org.junit.Assert.assertNotNull(numberArray32);
        org.junit.Assert.assertNotNull(numberArray33);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 3 + "'", int36 == 3);
        org.junit.Assert.assertNotNull(datasetGroup37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(list40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + number44 + "' != '" + (short) 10 + "'", number44, (short) 10);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
        java.lang.Number[] numberArray2 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray5 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray8 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[][] numberArray9 = new java.lang.Number[][] { numberArray2, numberArray5, numberArray8 };
        java.lang.Number[][] numberArray10 = null;
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset11 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultIntervalCategoryDataset11.addChangeListener(datasetChangeListener12);
        int int14 = defaultIntervalCategoryDataset11.getCategoryCount();
        int int15 = defaultIntervalCategoryDataset11.getCategoryCount();
        org.jfree.data.general.SeriesChangeEvent seriesChangeEvent16 = null;
        defaultIntervalCategoryDataset11.seriesChanged(seriesChangeEvent16);
        java.lang.Number[] numberArray20 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray23 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray26 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[][] numberArray27 = new java.lang.Number[][] { numberArray20, numberArray23, numberArray26 };
        java.lang.Number[][] numberArray28 = null;
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset29 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray27, numberArray28);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener30 = null;
        defaultIntervalCategoryDataset29.addChangeListener(datasetChangeListener30);
        int int32 = defaultIntervalCategoryDataset29.getCategoryCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener33 = null;
        defaultIntervalCategoryDataset29.addChangeListener(datasetChangeListener33);
        java.lang.Comparable[] comparableArray38 = new java.lang.Comparable[] { (byte) -1, (short) 1, (byte) -1 };
        defaultIntervalCategoryDataset29.setSeriesKeys(comparableArray38);
        defaultIntervalCategoryDataset29.validateObject();
        int int41 = defaultIntervalCategoryDataset29.getSeriesCount();
        boolean boolean43 = defaultIntervalCategoryDataset29.equals((java.lang.Object) 1.0f);
        boolean boolean44 = defaultIntervalCategoryDataset11.hasListener((java.util.EventListener) defaultIntervalCategoryDataset29);
        int int45 = defaultIntervalCategoryDataset11.getSeriesCount();
        org.jfree.data.general.SeriesChangeEvent seriesChangeEvent46 = null;
        defaultIntervalCategoryDataset11.seriesChanged(seriesChangeEvent46);
        int int48 = defaultIntervalCategoryDataset11.getCategoryCount();
        // The following exception was thrown during execution in test generation
        try {
            int int50 = defaultIntervalCategoryDataset11.getRowIndex((java.lang.Comparable) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray2);
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertNotNull(numberArray23);
        org.junit.Assert.assertNotNull(numberArray26);
        org.junit.Assert.assertNotNull(numberArray27);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2 + "'", int32 == 2);
        org.junit.Assert.assertNotNull(comparableArray38);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 3 + "'", int41 == 3);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 3 + "'", int45 == 3);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 2 + "'", int48 == 2);
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        java.lang.Number[] numberArray2 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray5 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray8 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[][] numberArray9 = new java.lang.Number[][] { numberArray2, numberArray5, numberArray8 };
        java.lang.Number[][] numberArray10 = null;
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset11 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray10);
        int int12 = defaultIntervalCategoryDataset11.getSeriesCount();
        org.jfree.data.general.DatasetGroup datasetGroup13 = defaultIntervalCategoryDataset11.getGroup();
        java.util.EventListener eventListener14 = null;
        boolean boolean15 = defaultIntervalCategoryDataset11.hasListener(eventListener14);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener16 = null;
        defaultIntervalCategoryDataset11.addChangeListener(datasetChangeListener16);
        org.jfree.data.general.SeriesChangeEvent seriesChangeEvent18 = null;
        defaultIntervalCategoryDataset11.seriesChanged(seriesChangeEvent18);
        org.jfree.data.general.SeriesChangeEvent seriesChangeEvent20 = null;
        defaultIntervalCategoryDataset11.seriesChanged(seriesChangeEvent20);
        org.junit.Assert.assertNotNull(numberArray2);
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(datasetGroup13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
        java.lang.Number[] numberArray2 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray5 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray8 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[][] numberArray9 = new java.lang.Number[][] { numberArray2, numberArray5, numberArray8 };
        java.lang.Number[][] numberArray10 = null;
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset11 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultIntervalCategoryDataset11.addChangeListener(datasetChangeListener12);
        int int14 = defaultIntervalCategoryDataset11.getCategoryCount();
        int int15 = defaultIntervalCategoryDataset11.getSeriesCount();
        org.jfree.data.general.SeriesChangeEvent seriesChangeEvent16 = null;
        defaultIntervalCategoryDataset11.seriesChanged(seriesChangeEvent16);
        int int18 = defaultIntervalCategoryDataset11.getCategoryCount();
        java.util.List list19 = defaultIntervalCategoryDataset11.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener20 = null;
        defaultIntervalCategoryDataset11.removeChangeListener(datasetChangeListener20);
        int int22 = defaultIntervalCategoryDataset11.getSeriesCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number25 = defaultIntervalCategoryDataset11.getValue((java.lang.Comparable) false, (java.lang.Comparable) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray2);
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!", "", "" };
        java.lang.Number[][] numberArray5 = null;
        java.lang.Number[] numberArray6 = new java.lang.Number[] {};
        java.lang.Number[] numberArray7 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray6, numberArray7 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset9 = new org.jfree.data.category.DefaultIntervalCategoryDataset(strArray4, numberArray5, numberArray8);
        java.lang.Number[] numberArray10 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray11 = new java.lang.Number[][] { numberArray10 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset12 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray5, numberArray11);
        java.lang.String[] strArray17 = new java.lang.String[] { "", "hi!", "", "" };
        java.lang.Number[][] numberArray18 = null;
        java.lang.Number[] numberArray19 = new java.lang.Number[] {};
        java.lang.Number[] numberArray20 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray21 = new java.lang.Number[][] { numberArray19, numberArray20 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset22 = new org.jfree.data.category.DefaultIntervalCategoryDataset(strArray17, numberArray18, numberArray21);
        java.lang.String[] strArray28 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.lang.Comparable[] comparableArray30 = new java.lang.Comparable[] { 100L };
        java.lang.Number[] numberArray33 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray36 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray39 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[][] numberArray40 = new java.lang.Number[][] { numberArray33, numberArray36, numberArray39 };
        java.lang.Number[][] numberArray41 = null;
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset42 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray40, numberArray41);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener43 = null;
        defaultIntervalCategoryDataset42.addChangeListener(datasetChangeListener43);
        int int45 = defaultIntervalCategoryDataset42.getCategoryCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener46 = null;
        defaultIntervalCategoryDataset42.addChangeListener(datasetChangeListener46);
        java.lang.Comparable[] comparableArray51 = new java.lang.Comparable[] { (byte) -1, (short) 1, (byte) -1 };
        defaultIntervalCategoryDataset42.setSeriesKeys(comparableArray51);
        java.lang.Number[] numberArray53 = new java.lang.Number[] {};
        java.lang.Number[] numberArray54 = new java.lang.Number[] {};
        java.lang.Number[] numberArray55 = new java.lang.Number[] {};
        java.lang.Number[] numberArray56 = new java.lang.Number[] {};
        java.lang.Number[] numberArray57 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray58 = new java.lang.Number[][] { numberArray53, numberArray54, numberArray55, numberArray56, numberArray57 };
        java.lang.Number[] numberArray61 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray64 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray67 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[][] numberArray68 = new java.lang.Number[][] { numberArray61, numberArray64, numberArray67 };
        java.lang.Number[][] numberArray69 = null;
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset70 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray68, numberArray69);
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset71 = new org.jfree.data.category.DefaultIntervalCategoryDataset(comparableArray30, comparableArray51, numberArray58, numberArray69);
        java.lang.Number[] numberArray74 = new java.lang.Number[] { (byte) 1, 3 };
        java.lang.Number[] numberArray77 = new java.lang.Number[] { (byte) 1, 3 };
        java.lang.Number[] numberArray80 = new java.lang.Number[] { (byte) 1, 3 };
        java.lang.Number[] numberArray83 = new java.lang.Number[] { (byte) 1, 3 };
        java.lang.Number[][] numberArray84 = new java.lang.Number[][] { numberArray74, numberArray77, numberArray80, numberArray83 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset85 = new org.jfree.data.category.DefaultIntervalCategoryDataset(strArray28, numberArray69, numberArray84);
        java.lang.Number[] numberArray86 = new java.lang.Number[] {};
        java.lang.Number[] numberArray87 = new java.lang.Number[] {};
        java.lang.Number[] numberArray88 = new java.lang.Number[] {};
        java.lang.Number[] numberArray89 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray90 = new java.lang.Number[][] { numberArray86, numberArray87, numberArray88, numberArray89 };
        java.lang.Number[][] numberArray91 = null;
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset92 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray90, numberArray91);
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset93 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray69, numberArray90);
        java.lang.Number[][] numberArray94 = null;
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset95 = new org.jfree.data.category.DefaultIntervalCategoryDataset(strArray17, numberArray90, numberArray94);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset96 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray11, numberArray90);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: DefaultIntervalCategoryDataset: the number of series in the start value dataset does not match the number of series in the end value dataset.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "hi!", "", "" });
        org.junit.Assert.assertNotNull(numberArray6);
        org.junit.Assert.assertArrayEquals(numberArray6, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertArrayEquals(numberArray7, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertArrayEquals(numberArray10, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "", "hi!", "", "" });
        org.junit.Assert.assertNotNull(numberArray19);
        org.junit.Assert.assertArrayEquals(numberArray19, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertArrayEquals(numberArray20, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray21);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertArrayEquals(strArray28, new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(comparableArray30);
        org.junit.Assert.assertNotNull(numberArray33);
        org.junit.Assert.assertNotNull(numberArray36);
        org.junit.Assert.assertNotNull(numberArray39);
        org.junit.Assert.assertNotNull(numberArray40);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2 + "'", int45 == 2);
        org.junit.Assert.assertNotNull(comparableArray51);
        org.junit.Assert.assertNotNull(numberArray53);
        org.junit.Assert.assertArrayEquals(numberArray53, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray54);
        org.junit.Assert.assertArrayEquals(numberArray54, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray55);
        org.junit.Assert.assertArrayEquals(numberArray55, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray56);
        org.junit.Assert.assertArrayEquals(numberArray56, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray57);
        org.junit.Assert.assertArrayEquals(numberArray57, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray58);
        org.junit.Assert.assertNotNull(numberArray61);
        org.junit.Assert.assertNotNull(numberArray64);
        org.junit.Assert.assertNotNull(numberArray67);
        org.junit.Assert.assertNotNull(numberArray68);
        org.junit.Assert.assertNotNull(numberArray74);
        org.junit.Assert.assertNotNull(numberArray77);
        org.junit.Assert.assertNotNull(numberArray80);
        org.junit.Assert.assertNotNull(numberArray83);
        org.junit.Assert.assertNotNull(numberArray84);
        org.junit.Assert.assertNotNull(numberArray86);
        org.junit.Assert.assertArrayEquals(numberArray86, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray87);
        org.junit.Assert.assertArrayEquals(numberArray87, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray88);
        org.junit.Assert.assertArrayEquals(numberArray88, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray89);
        org.junit.Assert.assertArrayEquals(numberArray89, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray90);
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
        double[] doubleArray4 = new double[] { (short) 100, 1.0d, 6, (byte) 10 };
        double[] doubleArray9 = new double[] { (short) 100, 1.0d, 6, (byte) 10 };
        double[] doubleArray14 = new double[] { (short) 100, 1.0d, 6, (byte) 10 };
        double[] doubleArray19 = new double[] { (short) 100, 1.0d, 6, (byte) 10 };
        double[] doubleArray24 = new double[] { (short) 100, 1.0d, 6, (byte) 10 };
        double[] doubleArray29 = new double[] { (short) 100, 1.0d, 6, (byte) 10 };
        double[][] doubleArray30 = new double[][] { doubleArray4, doubleArray9, doubleArray14, doubleArray19, doubleArray24, doubleArray29 };
        double[] doubleArray35 = new double[] { (short) 10, '4', 1, 100.0f };
        double[] doubleArray40 = new double[] { (short) 10, '4', 1, 100.0f };
        double[] doubleArray45 = new double[] { (short) 10, '4', 1, 100.0f };
        double[][] doubleArray46 = new double[][] { doubleArray35, doubleArray40, doubleArray45 };
        double[] doubleArray51 = new double[] { (-1L), 1.0f, 3, 100.0f };
        double[] doubleArray56 = new double[] { (-1L), 1.0f, 3, 100.0f };
        double[] doubleArray61 = new double[] { (-1L), 1.0f, 3, 100.0f };
        double[][] doubleArray62 = new double[][] { doubleArray51, doubleArray56, doubleArray61 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset63 = new org.jfree.data.category.DefaultIntervalCategoryDataset(doubleArray46, doubleArray62);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset64 = new org.jfree.data.category.DefaultIntervalCategoryDataset(doubleArray30, doubleArray46);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: DefaultIntervalCategoryDataset: the number of series in the start value dataset does not match the number of series in the end value dataset.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d, 1.0d, 6.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 100.0d, 1.0d, 6.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 100.0d, 1.0d, 6.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 100.0d, 1.0d, 6.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] { 100.0d, 1.0d, 6.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 100.0d, 1.0d, 6.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { 10.0d, 52.0d, 1.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertArrayEquals(doubleArray40, new double[] { 10.0d, 52.0d, 1.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertArrayEquals(doubleArray45, new double[] { 10.0d, 52.0d, 1.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertArrayEquals(doubleArray51, new double[] { (-1.0d), 1.0d, 3.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertArrayEquals(doubleArray56, new double[] { (-1.0d), 1.0d, 3.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertArrayEquals(doubleArray61, new double[] { (-1.0d), 1.0d, 3.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray62);
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
        java.lang.Number[] numberArray2 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray5 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray8 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[][] numberArray9 = new java.lang.Number[][] { numberArray2, numberArray5, numberArray8 };
        java.lang.Number[][] numberArray10 = null;
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset11 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultIntervalCategoryDataset11.addChangeListener(datasetChangeListener12);
        int int14 = defaultIntervalCategoryDataset11.getCategoryCount();
        int int15 = defaultIntervalCategoryDataset11.getCategoryCount();
        org.jfree.data.general.SeriesChangeEvent seriesChangeEvent16 = null;
        defaultIntervalCategoryDataset11.seriesChanged(seriesChangeEvent16);
        java.lang.Number[] numberArray20 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray23 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray26 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[][] numberArray27 = new java.lang.Number[][] { numberArray20, numberArray23, numberArray26 };
        java.lang.Number[][] numberArray28 = null;
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset29 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray27, numberArray28);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener30 = null;
        defaultIntervalCategoryDataset29.addChangeListener(datasetChangeListener30);
        int int32 = defaultIntervalCategoryDataset29.getCategoryCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener33 = null;
        defaultIntervalCategoryDataset29.addChangeListener(datasetChangeListener33);
        java.lang.Comparable[] comparableArray38 = new java.lang.Comparable[] { (byte) -1, (short) 1, (byte) -1 };
        defaultIntervalCategoryDataset29.setSeriesKeys(comparableArray38);
        defaultIntervalCategoryDataset29.validateObject();
        int int41 = defaultIntervalCategoryDataset29.getSeriesCount();
        boolean boolean43 = defaultIntervalCategoryDataset29.equals((java.lang.Object) 1.0f);
        boolean boolean44 = defaultIntervalCategoryDataset11.hasListener((java.util.EventListener) defaultIntervalCategoryDataset29);
        defaultIntervalCategoryDataset11.validateObject();
        int int46 = defaultIntervalCategoryDataset11.getSeriesCount();
        defaultIntervalCategoryDataset11.validateObject();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener48 = null;
        defaultIntervalCategoryDataset11.removeChangeListener(datasetChangeListener48);
        org.junit.Assert.assertNotNull(numberArray2);
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertNotNull(numberArray23);
        org.junit.Assert.assertNotNull(numberArray26);
        org.junit.Assert.assertNotNull(numberArray27);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2 + "'", int32 == 2);
        org.junit.Assert.assertNotNull(comparableArray38);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 3 + "'", int41 == 3);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 3 + "'", int46 == 3);
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
        java.lang.Number[] numberArray2 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray5 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray8 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[][] numberArray9 = new java.lang.Number[][] { numberArray2, numberArray5, numberArray8 };
        java.lang.Number[][] numberArray10 = null;
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset11 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultIntervalCategoryDataset11.addChangeListener(datasetChangeListener12);
        int int14 = defaultIntervalCategoryDataset11.getCategoryCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultIntervalCategoryDataset11.addChangeListener(datasetChangeListener15);
        java.lang.Comparable[] comparableArray20 = new java.lang.Comparable[] { (byte) -1, (short) 1, (byte) -1 };
        defaultIntervalCategoryDataset11.setSeriesKeys(comparableArray20);
        int int23 = defaultIntervalCategoryDataset11.indexOf((java.lang.Comparable) false);
        java.lang.String[] strArray28 = new java.lang.String[] { "", "hi!", "", "" };
        java.lang.Number[][] numberArray29 = null;
        java.lang.Number[] numberArray30 = new java.lang.Number[] {};
        java.lang.Number[] numberArray31 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray32 = new java.lang.Number[][] { numberArray30, numberArray31 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset33 = new org.jfree.data.category.DefaultIntervalCategoryDataset(strArray28, numberArray29, numberArray32);
        java.lang.Number[] numberArray36 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray39 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray42 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[][] numberArray43 = new java.lang.Number[][] { numberArray36, numberArray39, numberArray42 };
        java.lang.Number[][] numberArray44 = null;
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset45 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray43, numberArray44);
        int int46 = defaultIntervalCategoryDataset45.getSeriesCount();
        boolean boolean47 = defaultIntervalCategoryDataset33.hasListener((java.util.EventListener) defaultIntervalCategoryDataset45);
        boolean boolean48 = defaultIntervalCategoryDataset11.hasListener((java.util.EventListener) defaultIntervalCategoryDataset33);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener49 = null;
        defaultIntervalCategoryDataset33.addChangeListener(datasetChangeListener49);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener51 = null;
        defaultIntervalCategoryDataset33.removeChangeListener(datasetChangeListener51);
        defaultIntervalCategoryDataset33.validateObject();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable55 = defaultIntervalCategoryDataset33.getSeriesKey(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No such series : 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray2);
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(comparableArray20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertArrayEquals(strArray28, new java.lang.String[] { "", "hi!", "", "" });
        org.junit.Assert.assertNotNull(numberArray30);
        org.junit.Assert.assertArrayEquals(numberArray30, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray31);
        org.junit.Assert.assertArrayEquals(numberArray31, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray32);
        org.junit.Assert.assertNotNull(numberArray36);
        org.junit.Assert.assertNotNull(numberArray39);
        org.junit.Assert.assertNotNull(numberArray42);
        org.junit.Assert.assertNotNull(numberArray43);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 3 + "'", int46 == 3);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        java.lang.Number[] numberArray2 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray5 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray8 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[][] numberArray9 = new java.lang.Number[][] { numberArray2, numberArray5, numberArray8 };
        java.lang.Number[][] numberArray10 = null;
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset11 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultIntervalCategoryDataset11.addChangeListener(datasetChangeListener12);
        int int14 = defaultIntervalCategoryDataset11.getCategoryCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultIntervalCategoryDataset11.addChangeListener(datasetChangeListener15);
        java.lang.Comparable[] comparableArray20 = new java.lang.Comparable[] { (byte) -1, (short) 1, (byte) -1 };
        defaultIntervalCategoryDataset11.setSeriesKeys(comparableArray20);
        java.lang.Number[] numberArray24 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray27 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray30 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[][] numberArray31 = new java.lang.Number[][] { numberArray24, numberArray27, numberArray30 };
        java.lang.Number[][] numberArray32 = null;
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset33 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray31, numberArray32);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener34 = null;
        defaultIntervalCategoryDataset33.addChangeListener(datasetChangeListener34);
        int int36 = defaultIntervalCategoryDataset33.getCategoryCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener37 = null;
        defaultIntervalCategoryDataset33.addChangeListener(datasetChangeListener37);
        org.jfree.data.general.DatasetGroup datasetGroup39 = defaultIntervalCategoryDataset33.getGroup();
        boolean boolean40 = defaultIntervalCategoryDataset11.hasListener((java.util.EventListener) defaultIntervalCategoryDataset33);
        // The following exception was thrown during execution in test generation
        try {
            defaultIntervalCategoryDataset11.setEndValue(0, (java.lang.Comparable) 100.0d, (java.lang.Number) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray2);
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(comparableArray20);
        org.junit.Assert.assertNotNull(numberArray24);
        org.junit.Assert.assertNotNull(numberArray27);
        org.junit.Assert.assertNotNull(numberArray30);
        org.junit.Assert.assertNotNull(numberArray31);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2 + "'", int36 == 2);
        org.junit.Assert.assertNotNull(datasetGroup39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
        java.lang.Number[] numberArray2 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray5 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray8 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[][] numberArray9 = new java.lang.Number[][] { numberArray2, numberArray5, numberArray8 };
        java.lang.Number[][] numberArray10 = null;
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset11 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultIntervalCategoryDataset11.addChangeListener(datasetChangeListener12);
        int int14 = defaultIntervalCategoryDataset11.getCategoryCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultIntervalCategoryDataset11.addChangeListener(datasetChangeListener15);
        java.lang.Comparable[] comparableArray20 = new java.lang.Comparable[] { (byte) -1, (short) 1, (byte) -1 };
        defaultIntervalCategoryDataset11.setSeriesKeys(comparableArray20);
        int int23 = defaultIntervalCategoryDataset11.indexOf((java.lang.Comparable) false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener24 = null;
        defaultIntervalCategoryDataset11.removeChangeListener(datasetChangeListener24);
        int int27 = defaultIntervalCategoryDataset11.getRowIndex((java.lang.Comparable) (short) 100);
        org.jfree.data.general.DatasetGroup datasetGroup28 = defaultIntervalCategoryDataset11.getGroup();
        int int30 = defaultIntervalCategoryDataset11.getSeriesIndex((java.lang.Comparable) (byte) 100);
        org.jfree.data.general.DatasetGroup datasetGroup31 = defaultIntervalCategoryDataset11.getGroup();
        int int32 = defaultIntervalCategoryDataset11.getSeriesCount();
        org.junit.Assert.assertNotNull(numberArray2);
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(comparableArray20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 3 + "'", int32 == 3);
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        java.lang.Number[] numberArray2 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray5 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray8 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[][] numberArray9 = new java.lang.Number[][] { numberArray2, numberArray5, numberArray8 };
        java.lang.Number[][] numberArray10 = null;
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset11 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultIntervalCategoryDataset11.addChangeListener(datasetChangeListener12);
        int int14 = defaultIntervalCategoryDataset11.getCategoryCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultIntervalCategoryDataset11.addChangeListener(datasetChangeListener15);
        java.lang.Comparable[] comparableArray20 = new java.lang.Comparable[] { (byte) -1, (short) 1, (byte) -1 };
        defaultIntervalCategoryDataset11.setSeriesKeys(comparableArray20);
        boolean boolean23 = defaultIntervalCategoryDataset11.equals((java.lang.Object) 1L);
        java.util.List list24 = defaultIntervalCategoryDataset11.getColumnKeys();
        int int25 = defaultIntervalCategoryDataset11.getRowCount();
        defaultIntervalCategoryDataset11.validateObject();
        defaultIntervalCategoryDataset11.validateObject();
        java.util.List list28 = defaultIntervalCategoryDataset11.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number31 = defaultIntervalCategoryDataset11.getStartValue((int) (short) 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: DefaultIntervalCategoryDataset.getValue(): category index out of range.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray2);
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(comparableArray20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertNotNull(list28);
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
        java.lang.Number[] numberArray2 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray5 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray8 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[][] numberArray9 = new java.lang.Number[][] { numberArray2, numberArray5, numberArray8 };
        java.lang.Number[][] numberArray10 = null;
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset11 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultIntervalCategoryDataset11.addChangeListener(datasetChangeListener12);
        int int14 = defaultIntervalCategoryDataset11.getCategoryCount();
        org.jfree.data.general.DatasetGroup datasetGroup15 = defaultIntervalCategoryDataset11.getGroup();
        org.jfree.data.general.DatasetGroup datasetGroup16 = defaultIntervalCategoryDataset11.getGroup();
        org.junit.Assert.assertNotNull(numberArray2);
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(datasetGroup15);
        org.junit.Assert.assertNotNull(datasetGroup16);
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
        java.lang.Number[] numberArray2 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray5 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray8 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[][] numberArray9 = new java.lang.Number[][] { numberArray2, numberArray5, numberArray8 };
        java.lang.Number[][] numberArray10 = null;
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset11 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray10);
        java.util.List list12 = defaultIntervalCategoryDataset11.getColumnKeys();
        int int13 = defaultIntervalCategoryDataset11.getSeriesCount();
        defaultIntervalCategoryDataset11.validateObject();
        java.lang.Object obj15 = null;
        boolean boolean16 = defaultIntervalCategoryDataset11.equals(obj15);
        org.jfree.data.general.DatasetGroup datasetGroup17 = defaultIntervalCategoryDataset11.getGroup();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener18 = null;
        defaultIntervalCategoryDataset11.addChangeListener(datasetChangeListener18);
        org.junit.Assert.assertNotNull(numberArray2);
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(datasetGroup17);
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!", "", "" };
        java.lang.Number[][] numberArray5 = null;
        java.lang.Number[] numberArray6 = new java.lang.Number[] {};
        java.lang.Number[] numberArray7 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray6, numberArray7 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset9 = new org.jfree.data.category.DefaultIntervalCategoryDataset(strArray4, numberArray5, numberArray8);
        java.lang.Number[] numberArray10 = new java.lang.Number[] {};
        java.lang.Number[] numberArray11 = new java.lang.Number[] {};
        java.lang.Number[] numberArray12 = new java.lang.Number[] {};
        java.lang.Number[] numberArray13 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray14 = new java.lang.Number[][] { numberArray10, numberArray11, numberArray12, numberArray13 };
        java.lang.Number[][] numberArray15 = null;
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset16 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray14, numberArray15);
        java.lang.Number[][] numberArray17 = null;
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset18 = new org.jfree.data.category.DefaultIntervalCategoryDataset(strArray4, numberArray15, numberArray17);
        org.jfree.data.general.DatasetGroup datasetGroup19 = defaultIntervalCategoryDataset18.getGroup();
        int int20 = defaultIntervalCategoryDataset18.getCategoryCount();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "hi!", "", "" });
        org.junit.Assert.assertNotNull(numberArray6);
        org.junit.Assert.assertArrayEquals(numberArray6, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertArrayEquals(numberArray7, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertArrayEquals(numberArray10, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertArrayEquals(numberArray11, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray12);
        org.junit.Assert.assertArrayEquals(numberArray12, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray13);
        org.junit.Assert.assertArrayEquals(numberArray13, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray14);
        org.junit.Assert.assertNotNull(datasetGroup19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        java.lang.Number[] numberArray2 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray5 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray8 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[][] numberArray9 = new java.lang.Number[][] { numberArray2, numberArray5, numberArray8 };
        java.lang.Number[][] numberArray10 = null;
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset11 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultIntervalCategoryDataset11.addChangeListener(datasetChangeListener12);
        int int14 = defaultIntervalCategoryDataset11.getCategoryCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultIntervalCategoryDataset11.addChangeListener(datasetChangeListener15);
        java.lang.Comparable[] comparableArray20 = new java.lang.Comparable[] { (byte) -1, (short) 1, (byte) -1 };
        defaultIntervalCategoryDataset11.setSeriesKeys(comparableArray20);
        defaultIntervalCategoryDataset11.validateObject();
        int int23 = defaultIntervalCategoryDataset11.getSeriesCount();
        boolean boolean25 = defaultIntervalCategoryDataset11.equals((java.lang.Object) 1.0f);
        java.lang.Comparable comparable27 = defaultIntervalCategoryDataset11.getRowKey(0);
        java.lang.Number[] numberArray30 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray33 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray36 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[][] numberArray37 = new java.lang.Number[][] { numberArray30, numberArray33, numberArray36 };
        java.lang.Number[][] numberArray38 = null;
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset39 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray37, numberArray38);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener40 = null;
        defaultIntervalCategoryDataset39.addChangeListener(datasetChangeListener40);
        int int42 = defaultIntervalCategoryDataset39.getCategoryCount();
        int int43 = defaultIntervalCategoryDataset39.getCategoryCount();
        org.jfree.data.general.SeriesChangeEvent seriesChangeEvent44 = null;
        defaultIntervalCategoryDataset39.seriesChanged(seriesChangeEvent44);
        int int46 = defaultIntervalCategoryDataset39.getCategoryCount();
        org.jfree.data.general.DatasetGroup datasetGroup47 = defaultIntervalCategoryDataset39.getGroup();
        defaultIntervalCategoryDataset11.setGroup(datasetGroup47);
        defaultIntervalCategoryDataset11.validateObject();
        java.util.List list50 = defaultIntervalCategoryDataset11.getRowKeys();
        org.jfree.data.general.DatasetGroup datasetGroup51 = defaultIntervalCategoryDataset11.getGroup();
        int int53 = defaultIntervalCategoryDataset11.getSeriesIndex((java.lang.Comparable) '4');
        java.util.List list54 = defaultIntervalCategoryDataset11.getColumnKeys();
        int int56 = defaultIntervalCategoryDataset11.getSeriesIndex((java.lang.Comparable) '4');
        java.util.List list57 = defaultIntervalCategoryDataset11.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable59 = defaultIntervalCategoryDataset11.getRowKey(6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'row' argument is out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray2);
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(comparableArray20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + comparable27 + "' != '" + (byte) -1 + "'", comparable27, (byte) -1);
        org.junit.Assert.assertNotNull(numberArray30);
        org.junit.Assert.assertNotNull(numberArray33);
        org.junit.Assert.assertNotNull(numberArray36);
        org.junit.Assert.assertNotNull(numberArray37);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 2 + "'", int42 == 2);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2 + "'", int43 == 2);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 2 + "'", int46 == 2);
        org.junit.Assert.assertNotNull(datasetGroup47);
        org.junit.Assert.assertNotNull(list50);
        org.junit.Assert.assertNotNull(datasetGroup51);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertNotNull(list54);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertNotNull(list57);
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        java.lang.Number[] numberArray2 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray5 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray8 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[][] numberArray9 = new java.lang.Number[][] { numberArray2, numberArray5, numberArray8 };
        java.lang.Number[][] numberArray10 = null;
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset11 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultIntervalCategoryDataset11.addChangeListener(datasetChangeListener12);
        int int14 = defaultIntervalCategoryDataset11.getCategoryCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultIntervalCategoryDataset11.addChangeListener(datasetChangeListener15);
        java.lang.Comparable[] comparableArray20 = new java.lang.Comparable[] { (byte) -1, (short) 1, (byte) -1 };
        defaultIntervalCategoryDataset11.setSeriesKeys(comparableArray20);
        int int23 = defaultIntervalCategoryDataset11.indexOf((java.lang.Comparable) false);
        org.jfree.data.general.DatasetGroup datasetGroup24 = defaultIntervalCategoryDataset11.getGroup();
        int int26 = defaultIntervalCategoryDataset11.getRowIndex((java.lang.Comparable) (short) 0);
        java.lang.Number[] numberArray29 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray32 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray35 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[][] numberArray36 = new java.lang.Number[][] { numberArray29, numberArray32, numberArray35 };
        java.lang.Number[][] numberArray37 = null;
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset38 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray36, numberArray37);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener39 = null;
        defaultIntervalCategoryDataset38.addChangeListener(datasetChangeListener39);
        int int41 = defaultIntervalCategoryDataset38.getCategoryCount();
        boolean boolean42 = defaultIntervalCategoryDataset11.equals((java.lang.Object) int41);
        int int43 = defaultIntervalCategoryDataset11.getCategoryCount();
        java.lang.Object obj44 = null;
        boolean boolean45 = defaultIntervalCategoryDataset11.equals(obj44);
        java.util.List list46 = defaultIntervalCategoryDataset11.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener47 = null;
        defaultIntervalCategoryDataset11.removeChangeListener(datasetChangeListener47);
        defaultIntervalCategoryDataset11.validateObject();
        org.junit.Assert.assertNotNull(numberArray2);
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(comparableArray20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(numberArray29);
        org.junit.Assert.assertNotNull(numberArray32);
        org.junit.Assert.assertNotNull(numberArray35);
        org.junit.Assert.assertNotNull(numberArray36);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 2 + "'", int41 == 2);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2 + "'", int43 == 2);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(list46);
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
        java.lang.Comparable[] comparableArray1 = new java.lang.Comparable[] { 100L };
        java.lang.Number[] numberArray4 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[][] numberArray11 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10 };
        java.lang.Number[][] numberArray12 = null;
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset13 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray11, numberArray12);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener14 = null;
        defaultIntervalCategoryDataset13.addChangeListener(datasetChangeListener14);
        int int16 = defaultIntervalCategoryDataset13.getCategoryCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener17 = null;
        defaultIntervalCategoryDataset13.addChangeListener(datasetChangeListener17);
        java.lang.Comparable[] comparableArray22 = new java.lang.Comparable[] { (byte) -1, (short) 1, (byte) -1 };
        defaultIntervalCategoryDataset13.setSeriesKeys(comparableArray22);
        java.lang.Number[] numberArray24 = new java.lang.Number[] {};
        java.lang.Number[] numberArray25 = new java.lang.Number[] {};
        java.lang.Number[] numberArray26 = new java.lang.Number[] {};
        java.lang.Number[] numberArray27 = new java.lang.Number[] {};
        java.lang.Number[] numberArray28 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray29 = new java.lang.Number[][] { numberArray24, numberArray25, numberArray26, numberArray27, numberArray28 };
        java.lang.Number[] numberArray32 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray35 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray38 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[][] numberArray39 = new java.lang.Number[][] { numberArray32, numberArray35, numberArray38 };
        java.lang.Number[][] numberArray40 = null;
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset41 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray39, numberArray40);
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset42 = new org.jfree.data.category.DefaultIntervalCategoryDataset(comparableArray1, comparableArray22, numberArray29, numberArray40);
        int int43 = defaultIntervalCategoryDataset42.getCategoryCount();
        int int44 = defaultIntervalCategoryDataset42.getSeriesCount();
        java.util.List list45 = defaultIntervalCategoryDataset42.getRowKeys();
        defaultIntervalCategoryDataset42.validateObject();
        int int47 = defaultIntervalCategoryDataset42.getCategoryCount();
        org.jfree.data.general.DatasetGroup datasetGroup48 = defaultIntervalCategoryDataset42.getGroup();
        int int49 = defaultIntervalCategoryDataset42.getSeriesCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable51 = defaultIntervalCategoryDataset42.getRowKey((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparableArray1);
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertNotNull(comparableArray22);
        org.junit.Assert.assertNotNull(numberArray24);
        org.junit.Assert.assertArrayEquals(numberArray24, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray25);
        org.junit.Assert.assertArrayEquals(numberArray25, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray26);
        org.junit.Assert.assertArrayEquals(numberArray26, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray27);
        org.junit.Assert.assertArrayEquals(numberArray27, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray28);
        org.junit.Assert.assertArrayEquals(numberArray28, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray29);
        org.junit.Assert.assertNotNull(numberArray32);
        org.junit.Assert.assertNotNull(numberArray35);
        org.junit.Assert.assertNotNull(numberArray38);
        org.junit.Assert.assertNotNull(numberArray39);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 5 + "'", int44 == 5);
        org.junit.Assert.assertNotNull(list45);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(datasetGroup48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 5 + "'", int49 == 5);
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
        java.lang.Number[] numberArray2 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray5 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray8 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[][] numberArray9 = new java.lang.Number[][] { numberArray2, numberArray5, numberArray8 };
        java.lang.Number[][] numberArray10 = null;
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset11 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultIntervalCategoryDataset11.addChangeListener(datasetChangeListener12);
        int int14 = defaultIntervalCategoryDataset11.getCategoryCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultIntervalCategoryDataset11.removeChangeListener(datasetChangeListener15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number19 = defaultIntervalCategoryDataset11.getStartValue(5, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: DefaultIntervalCategoryDataset.getValue(): series index out of range.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray2);
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
        java.lang.Number[] numberArray2 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray5 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray8 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[][] numberArray9 = new java.lang.Number[][] { numberArray2, numberArray5, numberArray8 };
        java.lang.Number[][] numberArray10 = null;
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset11 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultIntervalCategoryDataset11.addChangeListener(datasetChangeListener12);
        int int14 = defaultIntervalCategoryDataset11.getCategoryCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultIntervalCategoryDataset11.addChangeListener(datasetChangeListener15);
        java.lang.Comparable[] comparableArray20 = new java.lang.Comparable[] { (byte) -1, (short) 1, (byte) -1 };
        defaultIntervalCategoryDataset11.setSeriesKeys(comparableArray20);
        defaultIntervalCategoryDataset11.validateObject();
        int int23 = defaultIntervalCategoryDataset11.getSeriesCount();
        boolean boolean25 = defaultIntervalCategoryDataset11.equals((java.lang.Object) 1.0f);
        java.lang.Comparable comparable27 = defaultIntervalCategoryDataset11.getRowKey(0);
        java.lang.Number[] numberArray30 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray33 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray36 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[][] numberArray37 = new java.lang.Number[][] { numberArray30, numberArray33, numberArray36 };
        java.lang.Number[][] numberArray38 = null;
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset39 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray37, numberArray38);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener40 = null;
        defaultIntervalCategoryDataset39.addChangeListener(datasetChangeListener40);
        int int42 = defaultIntervalCategoryDataset39.getCategoryCount();
        int int43 = defaultIntervalCategoryDataset39.getCategoryCount();
        org.jfree.data.general.SeriesChangeEvent seriesChangeEvent44 = null;
        defaultIntervalCategoryDataset39.seriesChanged(seriesChangeEvent44);
        int int46 = defaultIntervalCategoryDataset39.getCategoryCount();
        org.jfree.data.general.DatasetGroup datasetGroup47 = defaultIntervalCategoryDataset39.getGroup();
        defaultIntervalCategoryDataset11.setGroup(datasetGroup47);
        defaultIntervalCategoryDataset11.validateObject();
        java.util.List list50 = defaultIntervalCategoryDataset11.getRowKeys();
        org.jfree.data.general.DatasetGroup datasetGroup51 = defaultIntervalCategoryDataset11.getGroup();
        int int53 = defaultIntervalCategoryDataset11.getSeriesIndex((java.lang.Comparable) '4');
        java.util.List list54 = defaultIntervalCategoryDataset11.getColumnKeys();
        int int55 = defaultIntervalCategoryDataset11.getCategoryCount();
        int int57 = defaultIntervalCategoryDataset11.getRowIndex((java.lang.Comparable) 1.0d);
        java.lang.String[] strArray62 = new java.lang.String[] { "", "hi!", "", "" };
        java.lang.Number[][] numberArray63 = null;
        java.lang.Number[] numberArray64 = new java.lang.Number[] {};
        java.lang.Number[] numberArray65 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray66 = new java.lang.Number[][] { numberArray64, numberArray65 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset67 = new org.jfree.data.category.DefaultIntervalCategoryDataset(strArray62, numberArray63, numberArray66);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener68 = null;
        defaultIntervalCategoryDataset67.removeChangeListener(datasetChangeListener68);
        org.jfree.data.general.SeriesChangeEvent seriesChangeEvent70 = null;
        defaultIntervalCategoryDataset67.seriesChanged(seriesChangeEvent70);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener72 = null;
        defaultIntervalCategoryDataset67.addChangeListener(datasetChangeListener72);
        org.jfree.data.general.SeriesChangeEvent seriesChangeEvent74 = null;
        defaultIntervalCategoryDataset67.seriesChanged(seriesChangeEvent74);
        boolean boolean76 = defaultIntervalCategoryDataset11.equals((java.lang.Object) seriesChangeEvent74);
        org.junit.Assert.assertNotNull(numberArray2);
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(comparableArray20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + comparable27 + "' != '" + (byte) -1 + "'", comparable27, (byte) -1);
        org.junit.Assert.assertNotNull(numberArray30);
        org.junit.Assert.assertNotNull(numberArray33);
        org.junit.Assert.assertNotNull(numberArray36);
        org.junit.Assert.assertNotNull(numberArray37);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 2 + "'", int42 == 2);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2 + "'", int43 == 2);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 2 + "'", int46 == 2);
        org.junit.Assert.assertNotNull(datasetGroup47);
        org.junit.Assert.assertNotNull(list50);
        org.junit.Assert.assertNotNull(datasetGroup51);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertNotNull(list54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 2 + "'", int55 == 2);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertArrayEquals(strArray62, new java.lang.String[] { "", "hi!", "", "" });
        org.junit.Assert.assertNotNull(numberArray64);
        org.junit.Assert.assertArrayEquals(numberArray64, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray65);
        org.junit.Assert.assertArrayEquals(numberArray65, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray66);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        java.lang.Number[] numberArray2 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray5 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray8 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[][] numberArray9 = new java.lang.Number[][] { numberArray2, numberArray5, numberArray8 };
        java.lang.Number[][] numberArray10 = null;
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset11 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultIntervalCategoryDataset11.addChangeListener(datasetChangeListener12);
        int int14 = defaultIntervalCategoryDataset11.getCategoryCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultIntervalCategoryDataset11.addChangeListener(datasetChangeListener15);
        java.lang.Comparable[] comparableArray20 = new java.lang.Comparable[] { (byte) -1, (short) 1, (byte) -1 };
        defaultIntervalCategoryDataset11.setSeriesKeys(comparableArray20);
        defaultIntervalCategoryDataset11.validateObject();
        int int23 = defaultIntervalCategoryDataset11.getSeriesCount();
        java.lang.Number[] numberArray26 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray29 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray32 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[][] numberArray33 = new java.lang.Number[][] { numberArray26, numberArray29, numberArray32 };
        java.lang.Number[][] numberArray34 = null;
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset35 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray33, numberArray34);
        int int36 = defaultIntervalCategoryDataset35.getSeriesCount();
        org.jfree.data.general.DatasetGroup datasetGroup37 = defaultIntervalCategoryDataset35.getGroup();
        java.util.EventListener eventListener38 = null;
        boolean boolean39 = defaultIntervalCategoryDataset35.hasListener(eventListener38);
        java.util.List list40 = defaultIntervalCategoryDataset35.getColumnKeys();
        boolean boolean41 = defaultIntervalCategoryDataset11.equals((java.lang.Object) defaultIntervalCategoryDataset35);
        java.lang.Number number44 = defaultIntervalCategoryDataset11.getStartValue(0, 1);
        int int45 = defaultIntervalCategoryDataset11.getCategoryCount();
        org.junit.Assert.assertNotNull(numberArray2);
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(comparableArray20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertNotNull(numberArray26);
        org.junit.Assert.assertNotNull(numberArray29);
        org.junit.Assert.assertNotNull(numberArray32);
        org.junit.Assert.assertNotNull(numberArray33);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 3 + "'", int36 == 3);
        org.junit.Assert.assertNotNull(datasetGroup37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(list40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + number44 + "' != '" + (short) 10 + "'", number44, (short) 10);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2 + "'", int45 == 2);
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        java.lang.Number[] numberArray2 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray5 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray8 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[][] numberArray9 = new java.lang.Number[][] { numberArray2, numberArray5, numberArray8 };
        java.lang.Number[][] numberArray10 = null;
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset11 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultIntervalCategoryDataset11.addChangeListener(datasetChangeListener12);
        int int14 = defaultIntervalCategoryDataset11.getCategoryCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultIntervalCategoryDataset11.addChangeListener(datasetChangeListener15);
        java.lang.Comparable[] comparableArray20 = new java.lang.Comparable[] { (byte) -1, (short) 1, (byte) -1 };
        defaultIntervalCategoryDataset11.setSeriesKeys(comparableArray20);
        int int23 = defaultIntervalCategoryDataset11.indexOf((java.lang.Comparable) false);
        org.jfree.data.general.DatasetGroup datasetGroup24 = defaultIntervalCategoryDataset11.getGroup();
        int int26 = defaultIntervalCategoryDataset11.getRowIndex((java.lang.Comparable) (short) 0);
        java.lang.Number[] numberArray29 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray32 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray35 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[][] numberArray36 = new java.lang.Number[][] { numberArray29, numberArray32, numberArray35 };
        java.lang.Number[][] numberArray37 = null;
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset38 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray36, numberArray37);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener39 = null;
        defaultIntervalCategoryDataset38.addChangeListener(datasetChangeListener39);
        int int41 = defaultIntervalCategoryDataset38.getCategoryCount();
        boolean boolean42 = defaultIntervalCategoryDataset11.equals((java.lang.Object) int41);
        int int43 = defaultIntervalCategoryDataset11.getSeriesCount();
        org.jfree.data.general.SeriesChangeEvent seriesChangeEvent44 = null;
        defaultIntervalCategoryDataset11.seriesChanged(seriesChangeEvent44);
        int int47 = defaultIntervalCategoryDataset11.getRowIndex((java.lang.Comparable) (short) 100);
        int int48 = defaultIntervalCategoryDataset11.getCategoryCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener49 = null;
        defaultIntervalCategoryDataset11.addChangeListener(datasetChangeListener49);
        // The following exception was thrown during execution in test generation
        try {
            int int52 = defaultIntervalCategoryDataset11.getCategoryIndex((java.lang.Comparable) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray2);
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(comparableArray20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(numberArray29);
        org.junit.Assert.assertNotNull(numberArray32);
        org.junit.Assert.assertNotNull(numberArray35);
        org.junit.Assert.assertNotNull(numberArray36);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 2 + "'", int41 == 2);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 3 + "'", int43 == 3);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 2 + "'", int48 == 2);
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
        java.lang.Number[] numberArray5 = new java.lang.Number[] { 100, 1L, (-1.0f), 10, 10 };
        java.lang.Number[] numberArray11 = new java.lang.Number[] { 100, 1L, (-1.0f), 10, 10 };
        java.lang.Number[] numberArray17 = new java.lang.Number[] { 100, 1L, (-1.0f), 10, 10 };
        java.lang.Number[] numberArray23 = new java.lang.Number[] { 100, 1L, (-1.0f), 10, 10 };
        java.lang.Number[] numberArray29 = new java.lang.Number[] { 100, 1L, (-1.0f), 10, 10 };
        java.lang.Number[] numberArray35 = new java.lang.Number[] { 100, 1L, (-1.0f), 10, 10 };
        java.lang.Number[][] numberArray36 = new java.lang.Number[][] { numberArray5, numberArray11, numberArray17, numberArray23, numberArray29, numberArray35 };
        java.lang.Number[] numberArray39 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray42 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray45 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[][] numberArray46 = new java.lang.Number[][] { numberArray39, numberArray42, numberArray45 };
        java.lang.Number[][] numberArray47 = null;
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset48 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray46, numberArray47);
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset49 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray36, numberArray47);
        org.jfree.data.general.SeriesChangeEvent seriesChangeEvent50 = null;
        defaultIntervalCategoryDataset49.seriesChanged(seriesChangeEvent50);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener52 = null;
        defaultIntervalCategoryDataset49.addChangeListener(datasetChangeListener52);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener54 = null;
        defaultIntervalCategoryDataset49.removeChangeListener(datasetChangeListener54);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener56 = null;
        defaultIntervalCategoryDataset49.addChangeListener(datasetChangeListener56);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener58 = null;
        defaultIntervalCategoryDataset49.addChangeListener(datasetChangeListener58);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable61 = defaultIntervalCategoryDataset49.getSeriesKey((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertNotNull(numberArray17);
        org.junit.Assert.assertNotNull(numberArray23);
        org.junit.Assert.assertNotNull(numberArray29);
        org.junit.Assert.assertNotNull(numberArray35);
        org.junit.Assert.assertNotNull(numberArray36);
        org.junit.Assert.assertNotNull(numberArray39);
        org.junit.Assert.assertNotNull(numberArray42);
        org.junit.Assert.assertNotNull(numberArray45);
        org.junit.Assert.assertNotNull(numberArray46);
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
        java.lang.Number[] numberArray2 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray5 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray8 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[][] numberArray9 = new java.lang.Number[][] { numberArray2, numberArray5, numberArray8 };
        java.lang.Number[][] numberArray10 = null;
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset11 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultIntervalCategoryDataset11.addChangeListener(datasetChangeListener12);
        int int14 = defaultIntervalCategoryDataset11.getCategoryCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultIntervalCategoryDataset11.addChangeListener(datasetChangeListener15);
        java.lang.Comparable[] comparableArray20 = new java.lang.Comparable[] { (byte) -1, (short) 1, (byte) -1 };
        defaultIntervalCategoryDataset11.setSeriesKeys(comparableArray20);
        int int23 = defaultIntervalCategoryDataset11.indexOf((java.lang.Comparable) false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener24 = null;
        defaultIntervalCategoryDataset11.addChangeListener(datasetChangeListener24);
        int int27 = defaultIntervalCategoryDataset11.indexOf((java.lang.Comparable) 100);
        int int28 = defaultIntervalCategoryDataset11.getCategoryCount();
        org.jfree.data.general.DatasetGroup datasetGroup29 = defaultIntervalCategoryDataset11.getGroup();
        org.jfree.data.general.SeriesChangeEvent seriesChangeEvent30 = null;
        defaultIntervalCategoryDataset11.seriesChanged(seriesChangeEvent30);
        int int32 = defaultIntervalCategoryDataset11.getCategoryCount();
        org.junit.Assert.assertNotNull(numberArray2);
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(comparableArray20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2 + "'", int28 == 2);
        org.junit.Assert.assertNotNull(datasetGroup29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2 + "'", int32 == 2);
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
        java.lang.Number[] numberArray2 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray5 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray8 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[][] numberArray9 = new java.lang.Number[][] { numberArray2, numberArray5, numberArray8 };
        java.lang.Number[][] numberArray10 = null;
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset11 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray10);
        int int12 = defaultIntervalCategoryDataset11.getSeriesCount();
        org.jfree.data.general.DatasetGroup datasetGroup13 = defaultIntervalCategoryDataset11.getGroup();
        org.jfree.data.general.DatasetGroup datasetGroup14 = defaultIntervalCategoryDataset11.getGroup();
        java.lang.String[] strArray20 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.lang.Comparable[] comparableArray22 = new java.lang.Comparable[] { 100L };
        java.lang.Number[] numberArray25 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray28 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray31 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[][] numberArray32 = new java.lang.Number[][] { numberArray25, numberArray28, numberArray31 };
        java.lang.Number[][] numberArray33 = null;
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset34 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray32, numberArray33);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener35 = null;
        defaultIntervalCategoryDataset34.addChangeListener(datasetChangeListener35);
        int int37 = defaultIntervalCategoryDataset34.getCategoryCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener38 = null;
        defaultIntervalCategoryDataset34.addChangeListener(datasetChangeListener38);
        java.lang.Comparable[] comparableArray43 = new java.lang.Comparable[] { (byte) -1, (short) 1, (byte) -1 };
        defaultIntervalCategoryDataset34.setSeriesKeys(comparableArray43);
        java.lang.Number[] numberArray45 = new java.lang.Number[] {};
        java.lang.Number[] numberArray46 = new java.lang.Number[] {};
        java.lang.Number[] numberArray47 = new java.lang.Number[] {};
        java.lang.Number[] numberArray48 = new java.lang.Number[] {};
        java.lang.Number[] numberArray49 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray50 = new java.lang.Number[][] { numberArray45, numberArray46, numberArray47, numberArray48, numberArray49 };
        java.lang.Number[] numberArray53 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray56 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray59 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[][] numberArray60 = new java.lang.Number[][] { numberArray53, numberArray56, numberArray59 };
        java.lang.Number[][] numberArray61 = null;
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset62 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray60, numberArray61);
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset63 = new org.jfree.data.category.DefaultIntervalCategoryDataset(comparableArray22, comparableArray43, numberArray50, numberArray61);
        java.lang.Number[] numberArray66 = new java.lang.Number[] { (byte) 1, 3 };
        java.lang.Number[] numberArray69 = new java.lang.Number[] { (byte) 1, 3 };
        java.lang.Number[] numberArray72 = new java.lang.Number[] { (byte) 1, 3 };
        java.lang.Number[] numberArray75 = new java.lang.Number[] { (byte) 1, 3 };
        java.lang.Number[][] numberArray76 = new java.lang.Number[][] { numberArray66, numberArray69, numberArray72, numberArray75 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset77 = new org.jfree.data.category.DefaultIntervalCategoryDataset(strArray20, numberArray61, numberArray76);
        java.lang.String[] strArray82 = new java.lang.String[] { "", "hi!", "", "" };
        java.lang.Number[][] numberArray83 = null;
        java.lang.Number[] numberArray84 = new java.lang.Number[] {};
        java.lang.Number[] numberArray85 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray86 = new java.lang.Number[][] { numberArray84, numberArray85 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset87 = new org.jfree.data.category.DefaultIntervalCategoryDataset(strArray82, numberArray83, numberArray86);
        java.lang.Number[][] numberArray88 = null;
        java.lang.Number[][] numberArray89 = null;
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset90 = new org.jfree.data.category.DefaultIntervalCategoryDataset((java.lang.Comparable[]) strArray20, (java.lang.Comparable[]) strArray82, numberArray88, numberArray89);
        // The following exception was thrown during execution in test generation
        try {
            defaultIntervalCategoryDataset11.setCategoryKeys((java.lang.Comparable[]) strArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The number of categories does not match the data.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray2);
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(datasetGroup13);
        org.junit.Assert.assertNotNull(datasetGroup14);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(comparableArray22);
        org.junit.Assert.assertNotNull(numberArray25);
        org.junit.Assert.assertNotNull(numberArray28);
        org.junit.Assert.assertNotNull(numberArray31);
        org.junit.Assert.assertNotNull(numberArray32);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2 + "'", int37 == 2);
        org.junit.Assert.assertNotNull(comparableArray43);
        org.junit.Assert.assertNotNull(numberArray45);
        org.junit.Assert.assertArrayEquals(numberArray45, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray46);
        org.junit.Assert.assertArrayEquals(numberArray46, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray47);
        org.junit.Assert.assertArrayEquals(numberArray47, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray48);
        org.junit.Assert.assertArrayEquals(numberArray48, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray49);
        org.junit.Assert.assertArrayEquals(numberArray49, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray50);
        org.junit.Assert.assertNotNull(numberArray53);
        org.junit.Assert.assertNotNull(numberArray56);
        org.junit.Assert.assertNotNull(numberArray59);
        org.junit.Assert.assertNotNull(numberArray60);
        org.junit.Assert.assertNotNull(numberArray66);
        org.junit.Assert.assertNotNull(numberArray69);
        org.junit.Assert.assertNotNull(numberArray72);
        org.junit.Assert.assertNotNull(numberArray75);
        org.junit.Assert.assertNotNull(numberArray76);
        org.junit.Assert.assertNotNull(strArray82);
        org.junit.Assert.assertArrayEquals(strArray82, new java.lang.String[] { "", "hi!", "", "" });
        org.junit.Assert.assertNotNull(numberArray84);
        org.junit.Assert.assertArrayEquals(numberArray84, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray85);
        org.junit.Assert.assertArrayEquals(numberArray85, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray86);
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
        java.lang.Number[] numberArray2 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray5 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray8 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[][] numberArray9 = new java.lang.Number[][] { numberArray2, numberArray5, numberArray8 };
        java.lang.Number[][] numberArray10 = null;
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset11 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray10);
        java.util.List list12 = defaultIntervalCategoryDataset11.getColumnKeys();
        int int13 = defaultIntervalCategoryDataset11.getSeriesCount();
        defaultIntervalCategoryDataset11.validateObject();
        java.util.List list15 = defaultIntervalCategoryDataset11.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number18 = defaultIntervalCategoryDataset11.getStartValue((java.lang.Comparable) 4, (java.lang.Comparable) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray2);
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
        java.lang.Number[] numberArray2 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray5 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray8 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[][] numberArray9 = new java.lang.Number[][] { numberArray2, numberArray5, numberArray8 };
        java.lang.Number[][] numberArray10 = null;
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset11 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray10);
        org.jfree.data.general.SeriesChangeEvent seriesChangeEvent12 = null;
        defaultIntervalCategoryDataset11.seriesChanged(seriesChangeEvent12);
        defaultIntervalCategoryDataset11.validateObject();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultIntervalCategoryDataset11.addChangeListener(datasetChangeListener15);
        org.junit.Assert.assertNotNull(numberArray2);
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray9);
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
        java.lang.Number[] numberArray2 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray5 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray8 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[][] numberArray9 = new java.lang.Number[][] { numberArray2, numberArray5, numberArray8 };
        java.lang.Number[][] numberArray10 = null;
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset11 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray10);
        java.util.List list12 = defaultIntervalCategoryDataset11.getColumnKeys();
        int int13 = defaultIntervalCategoryDataset11.getSeriesCount();
        java.util.List list14 = defaultIntervalCategoryDataset11.getRowKeys();
        int int15 = defaultIntervalCategoryDataset11.getSeriesCount();
        int int16 = defaultIntervalCategoryDataset11.getCategoryCount();
        org.junit.Assert.assertNotNull(numberArray2);
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
        java.lang.Number[] numberArray2 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray5 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray8 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[][] numberArray9 = new java.lang.Number[][] { numberArray2, numberArray5, numberArray8 };
        java.lang.Number[][] numberArray10 = null;
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset11 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray10);
        java.util.List list12 = defaultIntervalCategoryDataset11.getColumnKeys();
        int int13 = defaultIntervalCategoryDataset11.getSeriesCount();
        defaultIntervalCategoryDataset11.validateObject();
        java.lang.Object obj15 = null;
        boolean boolean16 = defaultIntervalCategoryDataset11.equals(obj15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable18 = defaultIntervalCategoryDataset11.getSeriesKey(0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray2);
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
        java.lang.Number[] numberArray2 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray5 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray8 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[][] numberArray9 = new java.lang.Number[][] { numberArray2, numberArray5, numberArray8 };
        java.lang.Number[][] numberArray10 = null;
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset11 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultIntervalCategoryDataset11.addChangeListener(datasetChangeListener12);
        int int14 = defaultIntervalCategoryDataset11.getCategoryCount();
        int int15 = defaultIntervalCategoryDataset11.getCategoryCount();
        org.jfree.data.general.SeriesChangeEvent seriesChangeEvent16 = null;
        defaultIntervalCategoryDataset11.seriesChanged(seriesChangeEvent16);
        java.lang.Number[] numberArray20 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray23 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray26 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[][] numberArray27 = new java.lang.Number[][] { numberArray20, numberArray23, numberArray26 };
        java.lang.Number[][] numberArray28 = null;
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset29 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray27, numberArray28);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener30 = null;
        defaultIntervalCategoryDataset29.addChangeListener(datasetChangeListener30);
        int int32 = defaultIntervalCategoryDataset29.getCategoryCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener33 = null;
        defaultIntervalCategoryDataset29.addChangeListener(datasetChangeListener33);
        java.lang.Comparable[] comparableArray38 = new java.lang.Comparable[] { (byte) -1, (short) 1, (byte) -1 };
        defaultIntervalCategoryDataset29.setSeriesKeys(comparableArray38);
        defaultIntervalCategoryDataset29.validateObject();
        int int41 = defaultIntervalCategoryDataset29.getSeriesCount();
        boolean boolean43 = defaultIntervalCategoryDataset29.equals((java.lang.Object) 1.0f);
        boolean boolean44 = defaultIntervalCategoryDataset11.hasListener((java.util.EventListener) defaultIntervalCategoryDataset29);
        defaultIntervalCategoryDataset11.validateObject();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener46 = null;
        defaultIntervalCategoryDataset11.removeChangeListener(datasetChangeListener46);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener48 = null;
        defaultIntervalCategoryDataset11.addChangeListener(datasetChangeListener48);
        org.junit.Assert.assertNotNull(numberArray2);
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertNotNull(numberArray23);
        org.junit.Assert.assertNotNull(numberArray26);
        org.junit.Assert.assertNotNull(numberArray27);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2 + "'", int32 == 2);
        org.junit.Assert.assertNotNull(comparableArray38);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 3 + "'", int41 == 3);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
        double[] doubleArray4 = new double[] { (short) 10, '4', 1, 100.0f };
        double[] doubleArray9 = new double[] { (short) 10, '4', 1, 100.0f };
        double[] doubleArray14 = new double[] { (short) 10, '4', 1, 100.0f };
        double[][] doubleArray15 = new double[][] { doubleArray4, doubleArray9, doubleArray14 };
        double[] doubleArray20 = new double[] { (-1L), 1.0f, 3, 100.0f };
        double[] doubleArray25 = new double[] { (-1L), 1.0f, 3, 100.0f };
        double[] doubleArray30 = new double[] { (-1L), 1.0f, 3, 100.0f };
        double[][] doubleArray31 = new double[][] { doubleArray20, doubleArray25, doubleArray30 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset32 = new org.jfree.data.category.DefaultIntervalCategoryDataset(doubleArray15, doubleArray31);
        double[] doubleArray36 = new double[] { 10L, (short) 1, 0 };
        double[] doubleArray40 = new double[] { 10L, (short) 1, 0 };
        double[] doubleArray44 = new double[] { 10L, (short) 1, 0 };
        double[] doubleArray48 = new double[] { 10L, (short) 1, 0 };
        double[] doubleArray52 = new double[] { 10L, (short) 1, 0 };
        double[] doubleArray56 = new double[] { 10L, (short) 1, 0 };
        double[][] doubleArray57 = new double[][] { doubleArray36, doubleArray40, doubleArray44, doubleArray48, doubleArray52, doubleArray56 };
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset58 = new org.jfree.data.category.DefaultIntervalCategoryDataset(doubleArray15, doubleArray57);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: DefaultIntervalCategoryDataset: the number of series in the start value dataset does not match the number of series in the end value dataset.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, 52.0d, 1.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 10.0d, 52.0d, 1.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 10.0d, 52.0d, 1.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { (-1.0d), 1.0d, 3.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { (-1.0d), 1.0d, 3.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertArrayEquals(doubleArray30, new double[] { (-1.0d), 1.0d, 3.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertArrayEquals(doubleArray36, new double[] { 10.0d, 1.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertArrayEquals(doubleArray40, new double[] { 10.0d, 1.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertArrayEquals(doubleArray44, new double[] { 10.0d, 1.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertArrayEquals(doubleArray48, new double[] { 10.0d, 1.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertArrayEquals(doubleArray52, new double[] { 10.0d, 1.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertArrayEquals(doubleArray56, new double[] { 10.0d, 1.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray57);
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!", "", "" };
        java.lang.Number[][] numberArray5 = null;
        java.lang.Number[] numberArray6 = new java.lang.Number[] {};
        java.lang.Number[] numberArray7 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray6, numberArray7 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset9 = new org.jfree.data.category.DefaultIntervalCategoryDataset(strArray4, numberArray5, numberArray8);
        java.lang.Number[] numberArray12 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray15 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray18 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[][] numberArray19 = new java.lang.Number[][] { numberArray12, numberArray15, numberArray18 };
        java.lang.Number[][] numberArray20 = null;
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset21 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray19, numberArray20);
        int int22 = defaultIntervalCategoryDataset21.getSeriesCount();
        boolean boolean23 = defaultIntervalCategoryDataset9.hasListener((java.util.EventListener) defaultIntervalCategoryDataset21);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener24 = null;
        defaultIntervalCategoryDataset9.addChangeListener(datasetChangeListener24);
        java.lang.Number number28 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultIntervalCategoryDataset9.setStartValue((int) ' ', (java.lang.Comparable) 10.0d, number28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: DefaultIntervalCategoryDataset.setValue: series outside valid range.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "hi!", "", "" });
        org.junit.Assert.assertNotNull(numberArray6);
        org.junit.Assert.assertArrayEquals(numberArray6, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertArrayEquals(numberArray7, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray12);
        org.junit.Assert.assertNotNull(numberArray15);
        org.junit.Assert.assertNotNull(numberArray18);
        org.junit.Assert.assertNotNull(numberArray19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
        java.lang.Number[] numberArray2 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray5 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray8 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[][] numberArray9 = new java.lang.Number[][] { numberArray2, numberArray5, numberArray8 };
        java.lang.Number[][] numberArray10 = null;
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset11 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultIntervalCategoryDataset11.addChangeListener(datasetChangeListener12);
        int int14 = defaultIntervalCategoryDataset11.getCategoryCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultIntervalCategoryDataset11.addChangeListener(datasetChangeListener15);
        java.lang.Comparable[] comparableArray20 = new java.lang.Comparable[] { (byte) -1, (short) 1, (byte) -1 };
        defaultIntervalCategoryDataset11.setSeriesKeys(comparableArray20);
        int int23 = defaultIntervalCategoryDataset11.indexOf((java.lang.Comparable) false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener24 = null;
        defaultIntervalCategoryDataset11.removeChangeListener(datasetChangeListener24);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener26 = null;
        defaultIntervalCategoryDataset11.addChangeListener(datasetChangeListener26);
        org.jfree.data.general.SeriesChangeEvent seriesChangeEvent28 = null;
        defaultIntervalCategoryDataset11.seriesChanged(seriesChangeEvent28);
        org.junit.Assert.assertNotNull(numberArray2);
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(comparableArray20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
        java.lang.Number[] numberArray2 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray5 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray8 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[][] numberArray9 = new java.lang.Number[][] { numberArray2, numberArray5, numberArray8 };
        java.lang.Number[][] numberArray10 = null;
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset11 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultIntervalCategoryDataset11.addChangeListener(datasetChangeListener12);
        int int14 = defaultIntervalCategoryDataset11.getCategoryCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultIntervalCategoryDataset11.addChangeListener(datasetChangeListener15);
        java.lang.Comparable[] comparableArray20 = new java.lang.Comparable[] { (byte) -1, (short) 1, (byte) -1 };
        defaultIntervalCategoryDataset11.setSeriesKeys(comparableArray20);
        boolean boolean23 = defaultIntervalCategoryDataset11.equals((java.lang.Object) 1L);
        java.util.List list24 = defaultIntervalCategoryDataset11.getColumnKeys();
        int int25 = defaultIntervalCategoryDataset11.getRowCount();
        defaultIntervalCategoryDataset11.validateObject();
        defaultIntervalCategoryDataset11.validateObject();
        int int28 = defaultIntervalCategoryDataset11.getCategoryCount();
        int int30 = defaultIntervalCategoryDataset11.getRowIndex((java.lang.Comparable) (byte) 1);
        org.junit.Assert.assertNotNull(numberArray2);
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(comparableArray20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2 + "'", int28 == 2);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
        java.lang.Number[] numberArray2 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray5 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray8 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[][] numberArray9 = new java.lang.Number[][] { numberArray2, numberArray5, numberArray8 };
        java.lang.Number[][] numberArray10 = null;
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset11 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultIntervalCategoryDataset11.addChangeListener(datasetChangeListener12);
        int int14 = defaultIntervalCategoryDataset11.getCategoryCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultIntervalCategoryDataset11.addChangeListener(datasetChangeListener15);
        java.lang.Comparable[] comparableArray20 = new java.lang.Comparable[] { (byte) -1, (short) 1, (byte) -1 };
        defaultIntervalCategoryDataset11.setSeriesKeys(comparableArray20);
        int int23 = defaultIntervalCategoryDataset11.indexOf((java.lang.Comparable) false);
        org.jfree.data.general.DatasetGroup datasetGroup24 = defaultIntervalCategoryDataset11.getGroup();
        int int26 = defaultIntervalCategoryDataset11.getRowIndex((java.lang.Comparable) (short) 0);
        java.lang.Number[] numberArray29 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray32 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray35 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[][] numberArray36 = new java.lang.Number[][] { numberArray29, numberArray32, numberArray35 };
        java.lang.Number[][] numberArray37 = null;
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset38 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray36, numberArray37);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener39 = null;
        defaultIntervalCategoryDataset38.addChangeListener(datasetChangeListener39);
        int int41 = defaultIntervalCategoryDataset38.getCategoryCount();
        boolean boolean42 = defaultIntervalCategoryDataset11.equals((java.lang.Object) int41);
        int int43 = defaultIntervalCategoryDataset11.getCategoryCount();
        java.lang.Object obj44 = null;
        boolean boolean45 = defaultIntervalCategoryDataset11.equals(obj44);
        java.lang.Comparable comparable47 = defaultIntervalCategoryDataset11.getRowKey(1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener48 = null;
        defaultIntervalCategoryDataset11.addChangeListener(datasetChangeListener48);
        java.lang.Comparable comparable51 = defaultIntervalCategoryDataset11.getRowKey(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number54 = defaultIntervalCategoryDataset11.getValue((-1), (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: DefaultIntervalCategoryDataset.getValue(): series index out of range.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray2);
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(comparableArray20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(numberArray29);
        org.junit.Assert.assertNotNull(numberArray32);
        org.junit.Assert.assertNotNull(numberArray35);
        org.junit.Assert.assertNotNull(numberArray36);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 2 + "'", int41 == 2);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2 + "'", int43 == 2);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + comparable47 + "' != '" + (short) 1 + "'", comparable47, (short) 1);
        org.junit.Assert.assertEquals("'" + comparable51 + "' != '" + (byte) -1 + "'", comparable51, (byte) -1);
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
        java.lang.Number[] numberArray2 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray5 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray8 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[][] numberArray9 = new java.lang.Number[][] { numberArray2, numberArray5, numberArray8 };
        java.lang.Number[][] numberArray10 = null;
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset11 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultIntervalCategoryDataset11.addChangeListener(datasetChangeListener12);
        int int14 = defaultIntervalCategoryDataset11.getCategoryCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultIntervalCategoryDataset11.addChangeListener(datasetChangeListener15);
        java.lang.Comparable[] comparableArray20 = new java.lang.Comparable[] { (byte) -1, (short) 1, (byte) -1 };
        defaultIntervalCategoryDataset11.setSeriesKeys(comparableArray20);
        defaultIntervalCategoryDataset11.validateObject();
        int int23 = defaultIntervalCategoryDataset11.getSeriesCount();
        boolean boolean25 = defaultIntervalCategoryDataset11.equals((java.lang.Object) 1.0f);
        java.lang.Comparable comparable27 = defaultIntervalCategoryDataset11.getRowKey(0);
        java.lang.Comparable comparable28 = null;
        int int29 = defaultIntervalCategoryDataset11.indexOf(comparable28);
        java.util.List list30 = defaultIntervalCategoryDataset11.getRowKeys();
        int int31 = defaultIntervalCategoryDataset11.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup32 = defaultIntervalCategoryDataset11.getGroup();
        org.junit.Assert.assertNotNull(numberArray2);
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(comparableArray20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + comparable27 + "' != '" + (byte) -1 + "'", comparable27, (byte) -1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 3 + "'", int31 == 3);
        org.junit.Assert.assertNotNull(datasetGroup32);
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!", "", "" };
        java.lang.Number[][] numberArray5 = null;
        java.lang.Number[] numberArray6 = new java.lang.Number[] {};
        java.lang.Number[] numberArray7 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray6, numberArray7 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset9 = new org.jfree.data.category.DefaultIntervalCategoryDataset(strArray4, numberArray5, numberArray8);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultIntervalCategoryDataset9.removeChangeListener(datasetChangeListener10);
        org.jfree.data.general.SeriesChangeEvent seriesChangeEvent12 = null;
        defaultIntervalCategoryDataset9.seriesChanged(seriesChangeEvent12);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener14 = null;
        defaultIntervalCategoryDataset9.addChangeListener(datasetChangeListener14);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener16 = null;
        defaultIntervalCategoryDataset9.removeChangeListener(datasetChangeListener16);
        org.jfree.data.general.DatasetGroup datasetGroup18 = defaultIntervalCategoryDataset9.getGroup();
        java.lang.Number[] numberArray21 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray24 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray27 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[][] numberArray28 = new java.lang.Number[][] { numberArray21, numberArray24, numberArray27 };
        java.lang.Number[][] numberArray29 = null;
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset30 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray28, numberArray29);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener31 = null;
        defaultIntervalCategoryDataset30.addChangeListener(datasetChangeListener31);
        int int33 = defaultIntervalCategoryDataset30.getCategoryCount();
        int int34 = defaultIntervalCategoryDataset30.getCategoryCount();
        org.jfree.data.general.SeriesChangeEvent seriesChangeEvent35 = null;
        defaultIntervalCategoryDataset30.seriesChanged(seriesChangeEvent35);
        java.lang.Number[] numberArray39 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray42 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray45 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[][] numberArray46 = new java.lang.Number[][] { numberArray39, numberArray42, numberArray45 };
        java.lang.Number[][] numberArray47 = null;
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset48 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray46, numberArray47);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener49 = null;
        defaultIntervalCategoryDataset48.addChangeListener(datasetChangeListener49);
        int int51 = defaultIntervalCategoryDataset48.getCategoryCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener52 = null;
        defaultIntervalCategoryDataset48.addChangeListener(datasetChangeListener52);
        java.lang.Comparable[] comparableArray57 = new java.lang.Comparable[] { (byte) -1, (short) 1, (byte) -1 };
        defaultIntervalCategoryDataset48.setSeriesKeys(comparableArray57);
        defaultIntervalCategoryDataset48.validateObject();
        int int60 = defaultIntervalCategoryDataset48.getSeriesCount();
        boolean boolean62 = defaultIntervalCategoryDataset48.equals((java.lang.Object) 1.0f);
        boolean boolean63 = defaultIntervalCategoryDataset30.hasListener((java.util.EventListener) defaultIntervalCategoryDataset48);
        java.util.List list64 = defaultIntervalCategoryDataset30.getRowKeys();
        java.lang.Number number67 = defaultIntervalCategoryDataset30.getStartValue((int) (byte) 0, (int) (short) 0);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener68 = null;
        defaultIntervalCategoryDataset30.addChangeListener(datasetChangeListener68);
        java.util.List list70 = defaultIntervalCategoryDataset30.getColumnKeys();
        boolean boolean71 = defaultIntervalCategoryDataset9.hasListener((java.util.EventListener) defaultIntervalCategoryDataset30);
        int int72 = defaultIntervalCategoryDataset30.getCategoryCount();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "hi!", "", "" });
        org.junit.Assert.assertNotNull(numberArray6);
        org.junit.Assert.assertArrayEquals(numberArray6, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertArrayEquals(numberArray7, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(datasetGroup18);
        org.junit.Assert.assertNotNull(numberArray21);
        org.junit.Assert.assertNotNull(numberArray24);
        org.junit.Assert.assertNotNull(numberArray27);
        org.junit.Assert.assertNotNull(numberArray28);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2 + "'", int33 == 2);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2 + "'", int34 == 2);
        org.junit.Assert.assertNotNull(numberArray39);
        org.junit.Assert.assertNotNull(numberArray42);
        org.junit.Assert.assertNotNull(numberArray45);
        org.junit.Assert.assertNotNull(numberArray46);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 2 + "'", int51 == 2);
        org.junit.Assert.assertNotNull(comparableArray57);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 3 + "'", int60 == 3);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(list64);
        org.junit.Assert.assertEquals("'" + number67 + "' != '" + 1.0f + "'", number67, 1.0f);
        org.junit.Assert.assertNotNull(list70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 2 + "'", int72 == 2);
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
        java.lang.Number[] numberArray2 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray5 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray8 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[][] numberArray9 = new java.lang.Number[][] { numberArray2, numberArray5, numberArray8 };
        java.lang.Number[][] numberArray10 = null;
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset11 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultIntervalCategoryDataset11.addChangeListener(datasetChangeListener12);
        int int14 = defaultIntervalCategoryDataset11.getCategoryCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultIntervalCategoryDataset11.addChangeListener(datasetChangeListener15);
        java.lang.Comparable[] comparableArray20 = new java.lang.Comparable[] { (byte) -1, (short) 1, (byte) -1 };
        defaultIntervalCategoryDataset11.setSeriesKeys(comparableArray20);
        int int23 = defaultIntervalCategoryDataset11.indexOf((java.lang.Comparable) false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener24 = null;
        defaultIntervalCategoryDataset11.addChangeListener(datasetChangeListener24);
        java.lang.Comparable comparable27 = defaultIntervalCategoryDataset11.getRowKey((int) (short) 1);
        java.util.List list28 = defaultIntervalCategoryDataset11.getColumnKeys();
        java.lang.Comparable comparable29 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number31 = defaultIntervalCategoryDataset11.getStartValue(comparable29, (java.lang.Comparable) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray2);
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(comparableArray20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertEquals("'" + comparable27 + "' != '" + (short) 1 + "'", comparable27, (short) 1);
        org.junit.Assert.assertNotNull(list28);
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
        java.lang.Number[] numberArray2 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray5 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray8 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[][] numberArray9 = new java.lang.Number[][] { numberArray2, numberArray5, numberArray8 };
        java.lang.Number[][] numberArray10 = null;
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset11 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultIntervalCategoryDataset11.addChangeListener(datasetChangeListener12);
        int int14 = defaultIntervalCategoryDataset11.getCategoryCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultIntervalCategoryDataset11.addChangeListener(datasetChangeListener15);
        java.lang.Comparable[] comparableArray20 = new java.lang.Comparable[] { (byte) -1, (short) 1, (byte) -1 };
        defaultIntervalCategoryDataset11.setSeriesKeys(comparableArray20);
        java.lang.Number[] numberArray24 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray27 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray30 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[][] numberArray31 = new java.lang.Number[][] { numberArray24, numberArray27, numberArray30 };
        java.lang.Number[][] numberArray32 = null;
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset33 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray31, numberArray32);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener34 = null;
        defaultIntervalCategoryDataset33.addChangeListener(datasetChangeListener34);
        int int36 = defaultIntervalCategoryDataset33.getCategoryCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener37 = null;
        defaultIntervalCategoryDataset33.addChangeListener(datasetChangeListener37);
        org.jfree.data.general.DatasetGroup datasetGroup39 = defaultIntervalCategoryDataset33.getGroup();
        boolean boolean40 = defaultIntervalCategoryDataset11.hasListener((java.util.EventListener) defaultIntervalCategoryDataset33);
        java.util.List list41 = defaultIntervalCategoryDataset11.getRowKeys();
        int int42 = defaultIntervalCategoryDataset11.getCategoryCount();
        org.junit.Assert.assertNotNull(numberArray2);
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(comparableArray20);
        org.junit.Assert.assertNotNull(numberArray24);
        org.junit.Assert.assertNotNull(numberArray27);
        org.junit.Assert.assertNotNull(numberArray30);
        org.junit.Assert.assertNotNull(numberArray31);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2 + "'", int36 == 2);
        org.junit.Assert.assertNotNull(datasetGroup39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(list41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 2 + "'", int42 == 2);
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!", "", "" };
        java.lang.Number[][] numberArray5 = null;
        java.lang.Number[] numberArray6 = new java.lang.Number[] {};
        java.lang.Number[] numberArray7 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray6, numberArray7 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset9 = new org.jfree.data.category.DefaultIntervalCategoryDataset(strArray4, numberArray5, numberArray8);
        java.lang.Number[] numberArray12 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray15 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray18 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[][] numberArray19 = new java.lang.Number[][] { numberArray12, numberArray15, numberArray18 };
        java.lang.Number[][] numberArray20 = null;
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset21 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray19, numberArray20);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener22 = null;
        defaultIntervalCategoryDataset21.addChangeListener(datasetChangeListener22);
        int int24 = defaultIntervalCategoryDataset21.getCategoryCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener25 = null;
        defaultIntervalCategoryDataset21.addChangeListener(datasetChangeListener25);
        java.lang.Comparable[] comparableArray30 = new java.lang.Comparable[] { (byte) -1, (short) 1, (byte) -1 };
        defaultIntervalCategoryDataset21.setSeriesKeys(comparableArray30);
        int int33 = defaultIntervalCategoryDataset21.indexOf((java.lang.Comparable) false);
        org.jfree.data.general.DatasetGroup datasetGroup34 = defaultIntervalCategoryDataset21.getGroup();
        int int36 = defaultIntervalCategoryDataset21.getRowIndex((java.lang.Comparable) (short) 0);
        java.lang.Number[] numberArray39 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray42 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray45 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[][] numberArray46 = new java.lang.Number[][] { numberArray39, numberArray42, numberArray45 };
        java.lang.Number[][] numberArray47 = null;
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset48 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray46, numberArray47);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener49 = null;
        defaultIntervalCategoryDataset48.addChangeListener(datasetChangeListener49);
        int int51 = defaultIntervalCategoryDataset48.getCategoryCount();
        boolean boolean52 = defaultIntervalCategoryDataset21.equals((java.lang.Object) int51);
        int int53 = defaultIntervalCategoryDataset21.getSeriesCount();
        boolean boolean54 = defaultIntervalCategoryDataset9.hasListener((java.util.EventListener) defaultIntervalCategoryDataset21);
        int int55 = defaultIntervalCategoryDataset21.getRowCount();
        int int57 = defaultIntervalCategoryDataset21.getRowIndex((java.lang.Comparable) ' ');
        int int59 = defaultIntervalCategoryDataset21.indexOf((java.lang.Comparable) (byte) 0);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "hi!", "", "" });
        org.junit.Assert.assertNotNull(numberArray6);
        org.junit.Assert.assertArrayEquals(numberArray6, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertArrayEquals(numberArray7, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray12);
        org.junit.Assert.assertNotNull(numberArray15);
        org.junit.Assert.assertNotNull(numberArray18);
        org.junit.Assert.assertNotNull(numberArray19);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertNotNull(comparableArray30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(datasetGroup34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(numberArray39);
        org.junit.Assert.assertNotNull(numberArray42);
        org.junit.Assert.assertNotNull(numberArray45);
        org.junit.Assert.assertNotNull(numberArray46);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 2 + "'", int51 == 2);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 3 + "'", int53 == 3);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 3 + "'", int55 == 3);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
        java.lang.Number[] numberArray2 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray5 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray8 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[][] numberArray9 = new java.lang.Number[][] { numberArray2, numberArray5, numberArray8 };
        java.lang.Number[][] numberArray10 = null;
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset11 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray10);
        int int12 = defaultIntervalCategoryDataset11.getSeriesCount();
        int int13 = defaultIntervalCategoryDataset11.getCategoryCount();
        java.util.List list14 = defaultIntervalCategoryDataset11.getColumnKeys();
        java.util.List list15 = defaultIntervalCategoryDataset11.getRowKeys();
        java.lang.Number[] numberArray18 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray21 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray24 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[][] numberArray25 = new java.lang.Number[][] { numberArray18, numberArray21, numberArray24 };
        java.lang.Number[][] numberArray26 = null;
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset27 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray25, numberArray26);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener28 = null;
        defaultIntervalCategoryDataset27.addChangeListener(datasetChangeListener28);
        int int30 = defaultIntervalCategoryDataset27.getCategoryCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener31 = null;
        defaultIntervalCategoryDataset27.addChangeListener(datasetChangeListener31);
        java.lang.Comparable[] comparableArray36 = new java.lang.Comparable[] { (byte) -1, (short) 1, (byte) -1 };
        defaultIntervalCategoryDataset27.setSeriesKeys(comparableArray36);
        boolean boolean39 = defaultIntervalCategoryDataset27.equals((java.lang.Object) 1L);
        java.util.List list40 = defaultIntervalCategoryDataset27.getRowKeys();
        boolean boolean41 = defaultIntervalCategoryDataset11.equals((java.lang.Object) list40);
        int int42 = defaultIntervalCategoryDataset11.getCategoryCount();
        java.util.List list43 = defaultIntervalCategoryDataset11.getColumnKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener44 = null;
        defaultIntervalCategoryDataset11.removeChangeListener(datasetChangeListener44);
        org.jfree.data.general.DatasetGroup datasetGroup46 = defaultIntervalCategoryDataset11.getGroup();
        org.jfree.data.general.DatasetGroup datasetGroup47 = defaultIntervalCategoryDataset11.getGroup();
        java.lang.Comparable comparable49 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultIntervalCategoryDataset11.setStartValue(2, comparable49, (java.lang.Number) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray2);
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(numberArray18);
        org.junit.Assert.assertNotNull(numberArray21);
        org.junit.Assert.assertNotNull(numberArray24);
        org.junit.Assert.assertNotNull(numberArray25);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertNotNull(comparableArray36);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(list40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 2 + "'", int42 == 2);
        org.junit.Assert.assertNotNull(list43);
        org.junit.Assert.assertNotNull(datasetGroup46);
        org.junit.Assert.assertNotNull(datasetGroup47);
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
        java.lang.Number[] numberArray2 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray5 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray8 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[][] numberArray9 = new java.lang.Number[][] { numberArray2, numberArray5, numberArray8 };
        java.lang.Number[][] numberArray10 = null;
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset11 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultIntervalCategoryDataset11.addChangeListener(datasetChangeListener12);
        int int14 = defaultIntervalCategoryDataset11.getCategoryCount();
        int int15 = defaultIntervalCategoryDataset11.getCategoryCount();
        org.jfree.data.general.SeriesChangeEvent seriesChangeEvent16 = null;
        defaultIntervalCategoryDataset11.seriesChanged(seriesChangeEvent16);
        java.lang.Number[] numberArray20 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray23 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray26 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[][] numberArray27 = new java.lang.Number[][] { numberArray20, numberArray23, numberArray26 };
        java.lang.Number[][] numberArray28 = null;
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset29 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray27, numberArray28);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener30 = null;
        defaultIntervalCategoryDataset29.addChangeListener(datasetChangeListener30);
        int int32 = defaultIntervalCategoryDataset29.getCategoryCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener33 = null;
        defaultIntervalCategoryDataset29.addChangeListener(datasetChangeListener33);
        java.lang.Comparable[] comparableArray38 = new java.lang.Comparable[] { (byte) -1, (short) 1, (byte) -1 };
        defaultIntervalCategoryDataset29.setSeriesKeys(comparableArray38);
        defaultIntervalCategoryDataset29.validateObject();
        int int41 = defaultIntervalCategoryDataset29.getSeriesCount();
        boolean boolean43 = defaultIntervalCategoryDataset29.equals((java.lang.Object) 1.0f);
        boolean boolean44 = defaultIntervalCategoryDataset11.hasListener((java.util.EventListener) defaultIntervalCategoryDataset29);
        int int45 = defaultIntervalCategoryDataset11.getSeriesCount();
        org.jfree.data.general.SeriesChangeEvent seriesChangeEvent46 = null;
        defaultIntervalCategoryDataset11.seriesChanged(seriesChangeEvent46);
        defaultIntervalCategoryDataset11.validateObject();
        java.util.List list49 = defaultIntervalCategoryDataset11.getColumnKeys();
        java.lang.Class<?> wildcardClass50 = defaultIntervalCategoryDataset11.getClass();
        org.junit.Assert.assertNotNull(numberArray2);
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertNotNull(numberArray23);
        org.junit.Assert.assertNotNull(numberArray26);
        org.junit.Assert.assertNotNull(numberArray27);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2 + "'", int32 == 2);
        org.junit.Assert.assertNotNull(comparableArray38);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 3 + "'", int41 == 3);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 3 + "'", int45 == 3);
        org.junit.Assert.assertNotNull(list49);
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
        java.lang.Number[] numberArray2 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray5 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray8 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[][] numberArray9 = new java.lang.Number[][] { numberArray2, numberArray5, numberArray8 };
        java.lang.Number[][] numberArray10 = null;
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset11 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultIntervalCategoryDataset11.addChangeListener(datasetChangeListener12);
        int int14 = defaultIntervalCategoryDataset11.getCategoryCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultIntervalCategoryDataset11.addChangeListener(datasetChangeListener15);
        java.lang.Comparable[] comparableArray20 = new java.lang.Comparable[] { (byte) -1, (short) 1, (byte) -1 };
        defaultIntervalCategoryDataset11.setSeriesKeys(comparableArray20);
        defaultIntervalCategoryDataset11.validateObject();
        int int23 = defaultIntervalCategoryDataset11.getSeriesCount();
        boolean boolean25 = defaultIntervalCategoryDataset11.equals((java.lang.Object) 1.0f);
        java.lang.Comparable comparable27 = defaultIntervalCategoryDataset11.getRowKey(0);
        java.lang.Number[] numberArray30 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray33 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray36 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[][] numberArray37 = new java.lang.Number[][] { numberArray30, numberArray33, numberArray36 };
        java.lang.Number[][] numberArray38 = null;
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset39 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray37, numberArray38);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener40 = null;
        defaultIntervalCategoryDataset39.addChangeListener(datasetChangeListener40);
        int int42 = defaultIntervalCategoryDataset39.getCategoryCount();
        int int43 = defaultIntervalCategoryDataset39.getCategoryCount();
        org.jfree.data.general.SeriesChangeEvent seriesChangeEvent44 = null;
        defaultIntervalCategoryDataset39.seriesChanged(seriesChangeEvent44);
        int int46 = defaultIntervalCategoryDataset39.getCategoryCount();
        org.jfree.data.general.DatasetGroup datasetGroup47 = defaultIntervalCategoryDataset39.getGroup();
        defaultIntervalCategoryDataset11.setGroup(datasetGroup47);
        defaultIntervalCategoryDataset11.validateObject();
        java.util.List list50 = defaultIntervalCategoryDataset11.getRowKeys();
        org.jfree.data.general.DatasetGroup datasetGroup51 = defaultIntervalCategoryDataset11.getGroup();
        int int52 = defaultIntervalCategoryDataset11.getCategoryCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener53 = null;
        defaultIntervalCategoryDataset11.addChangeListener(datasetChangeListener53);
        // The following exception was thrown during execution in test generation
        try {
            int int56 = defaultIntervalCategoryDataset11.getColumnIndex((java.lang.Comparable) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray2);
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(comparableArray20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + comparable27 + "' != '" + (byte) -1 + "'", comparable27, (byte) -1);
        org.junit.Assert.assertNotNull(numberArray30);
        org.junit.Assert.assertNotNull(numberArray33);
        org.junit.Assert.assertNotNull(numberArray36);
        org.junit.Assert.assertNotNull(numberArray37);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 2 + "'", int42 == 2);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2 + "'", int43 == 2);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 2 + "'", int46 == 2);
        org.junit.Assert.assertNotNull(datasetGroup47);
        org.junit.Assert.assertNotNull(list50);
        org.junit.Assert.assertNotNull(datasetGroup51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 2 + "'", int52 == 2);
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!", "", "" };
        java.lang.Number[][] numberArray5 = null;
        java.lang.Number[] numberArray6 = new java.lang.Number[] {};
        java.lang.Number[] numberArray7 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray6, numberArray7 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset9 = new org.jfree.data.category.DefaultIntervalCategoryDataset(strArray4, numberArray5, numberArray8);
        java.lang.Number[] numberArray12 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray15 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray18 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[][] numberArray19 = new java.lang.Number[][] { numberArray12, numberArray15, numberArray18 };
        java.lang.Number[][] numberArray20 = null;
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset21 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray19, numberArray20);
        int int22 = defaultIntervalCategoryDataset21.getSeriesCount();
        boolean boolean23 = defaultIntervalCategoryDataset9.hasListener((java.util.EventListener) defaultIntervalCategoryDataset21);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener24 = null;
        defaultIntervalCategoryDataset9.addChangeListener(datasetChangeListener24);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = defaultIntervalCategoryDataset9.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "hi!", "", "" });
        org.junit.Assert.assertNotNull(numberArray6);
        org.junit.Assert.assertArrayEquals(numberArray6, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertArrayEquals(numberArray7, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray12);
        org.junit.Assert.assertNotNull(numberArray15);
        org.junit.Assert.assertNotNull(numberArray18);
        org.junit.Assert.assertNotNull(numberArray19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
        java.lang.Number[] numberArray2 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray5 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray8 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[][] numberArray9 = new java.lang.Number[][] { numberArray2, numberArray5, numberArray8 };
        java.lang.Number[][] numberArray10 = null;
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset11 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultIntervalCategoryDataset11.addChangeListener(datasetChangeListener12);
        int int14 = defaultIntervalCategoryDataset11.getCategoryCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultIntervalCategoryDataset11.addChangeListener(datasetChangeListener15);
        java.lang.Comparable[] comparableArray20 = new java.lang.Comparable[] { (byte) -1, (short) 1, (byte) -1 };
        defaultIntervalCategoryDataset11.setSeriesKeys(comparableArray20);
        int int23 = defaultIntervalCategoryDataset11.indexOf((java.lang.Comparable) false);
        int int25 = defaultIntervalCategoryDataset11.getRowIndex((java.lang.Comparable) 10);
        int int27 = defaultIntervalCategoryDataset11.getSeriesIndex((java.lang.Comparable) (short) 0);
        java.util.List list28 = defaultIntervalCategoryDataset11.getRowKeys();
        int int29 = defaultIntervalCategoryDataset11.getCategoryCount();
        java.lang.Number[] numberArray32 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray35 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray38 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[][] numberArray39 = new java.lang.Number[][] { numberArray32, numberArray35, numberArray38 };
        java.lang.Number[][] numberArray40 = null;
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset41 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray39, numberArray40);
        java.util.List list42 = defaultIntervalCategoryDataset41.getColumnKeys();
        int int43 = defaultIntervalCategoryDataset41.getSeriesCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener44 = null;
        defaultIntervalCategoryDataset41.addChangeListener(datasetChangeListener44);
        java.util.List list46 = defaultIntervalCategoryDataset41.getRowKeys();
        org.jfree.data.general.DatasetGroup datasetGroup47 = defaultIntervalCategoryDataset41.getGroup();
        org.jfree.data.general.DatasetGroup datasetGroup48 = defaultIntervalCategoryDataset41.getGroup();
        defaultIntervalCategoryDataset11.setGroup(datasetGroup48);
        java.lang.Comparable comparable51 = defaultIntervalCategoryDataset11.getRowKey((int) (short) 0);
        org.junit.Assert.assertNotNull(numberArray2);
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(comparableArray20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2 + "'", int29 == 2);
        org.junit.Assert.assertNotNull(numberArray32);
        org.junit.Assert.assertNotNull(numberArray35);
        org.junit.Assert.assertNotNull(numberArray38);
        org.junit.Assert.assertNotNull(numberArray39);
        org.junit.Assert.assertNotNull(list42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 3 + "'", int43 == 3);
        org.junit.Assert.assertNotNull(list46);
        org.junit.Assert.assertNotNull(datasetGroup47);
        org.junit.Assert.assertNotNull(datasetGroup48);
        org.junit.Assert.assertEquals("'" + comparable51 + "' != '" + (byte) -1 + "'", comparable51, (byte) -1);
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
        java.lang.Comparable[] comparableArray1 = new java.lang.Comparable[] { 100L };
        java.lang.Number[] numberArray4 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray7 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray10 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[][] numberArray11 = new java.lang.Number[][] { numberArray4, numberArray7, numberArray10 };
        java.lang.Number[][] numberArray12 = null;
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset13 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray11, numberArray12);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener14 = null;
        defaultIntervalCategoryDataset13.addChangeListener(datasetChangeListener14);
        int int16 = defaultIntervalCategoryDataset13.getCategoryCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener17 = null;
        defaultIntervalCategoryDataset13.addChangeListener(datasetChangeListener17);
        java.lang.Comparable[] comparableArray22 = new java.lang.Comparable[] { (byte) -1, (short) 1, (byte) -1 };
        defaultIntervalCategoryDataset13.setSeriesKeys(comparableArray22);
        java.lang.Number[] numberArray24 = new java.lang.Number[] {};
        java.lang.Number[] numberArray25 = new java.lang.Number[] {};
        java.lang.Number[] numberArray26 = new java.lang.Number[] {};
        java.lang.Number[] numberArray27 = new java.lang.Number[] {};
        java.lang.Number[] numberArray28 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray29 = new java.lang.Number[][] { numberArray24, numberArray25, numberArray26, numberArray27, numberArray28 };
        java.lang.Number[] numberArray32 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray35 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray38 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[][] numberArray39 = new java.lang.Number[][] { numberArray32, numberArray35, numberArray38 };
        java.lang.Number[][] numberArray40 = null;
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset41 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray39, numberArray40);
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset42 = new org.jfree.data.category.DefaultIntervalCategoryDataset(comparableArray1, comparableArray22, numberArray29, numberArray40);
        int int43 = defaultIntervalCategoryDataset42.getCategoryCount();
        defaultIntervalCategoryDataset42.validateObject();
        int int45 = defaultIntervalCategoryDataset42.getSeriesCount();
        org.jfree.data.general.DatasetGroup datasetGroup46 = defaultIntervalCategoryDataset42.getGroup();
        org.junit.Assert.assertNotNull(comparableArray1);
        org.junit.Assert.assertNotNull(numberArray4);
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertNotNull(comparableArray22);
        org.junit.Assert.assertNotNull(numberArray24);
        org.junit.Assert.assertArrayEquals(numberArray24, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray25);
        org.junit.Assert.assertArrayEquals(numberArray25, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray26);
        org.junit.Assert.assertArrayEquals(numberArray26, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray27);
        org.junit.Assert.assertArrayEquals(numberArray27, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray28);
        org.junit.Assert.assertArrayEquals(numberArray28, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray29);
        org.junit.Assert.assertNotNull(numberArray32);
        org.junit.Assert.assertNotNull(numberArray35);
        org.junit.Assert.assertNotNull(numberArray38);
        org.junit.Assert.assertNotNull(numberArray39);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 5 + "'", int45 == 5);
        org.junit.Assert.assertNotNull(datasetGroup46);
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
        java.lang.Number[] numberArray2 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray5 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[] numberArray8 = new java.lang.Number[] { 1.0f, (short) 10 };
        java.lang.Number[][] numberArray9 = new java.lang.Number[][] { numberArray2, numberArray5, numberArray8 };
        java.lang.Number[][] numberArray10 = null;
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset11 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray9, numberArray10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultIntervalCategoryDataset11.addChangeListener(datasetChangeListener12);
        int int14 = defaultIntervalCategoryDataset11.getCategoryCount();
        int int15 = defaultIntervalCategoryDataset11.getSeriesCount();
        java.util.List list16 = defaultIntervalCategoryDataset11.getColumnKeys();
        java.util.List list17 = defaultIntervalCategoryDataset11.getColumnKeys();
        defaultIntervalCategoryDataset11.validateObject();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener19 = null;
        defaultIntervalCategoryDataset11.removeChangeListener(datasetChangeListener19);
        org.junit.Assert.assertNotNull(numberArray2);
        org.junit.Assert.assertNotNull(numberArray5);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNotNull(list17);
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!", "", "" };
        java.lang.Number[][] numberArray5 = null;
        java.lang.Number[] numberArray6 = new java.lang.Number[] {};
        java.lang.Number[] numberArray7 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray8 = new java.lang.Number[][] { numberArray6, numberArray7 };
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset9 = new org.jfree.data.category.DefaultIntervalCategoryDataset(strArray4, numberArray5, numberArray8);
        java.lang.Number[] numberArray10 = new java.lang.Number[] {};
        java.lang.Number[] numberArray11 = new java.lang.Number[] {};
        java.lang.Number[] numberArray12 = new java.lang.Number[] {};
        java.lang.Number[] numberArray13 = new java.lang.Number[] {};
        java.lang.Number[][] numberArray14 = new java.lang.Number[][] { numberArray10, numberArray11, numberArray12, numberArray13 };
        java.lang.Number[][] numberArray15 = null;
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset16 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray14, numberArray15);
        java.lang.Number[][] numberArray17 = null;
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset18 = new org.jfree.data.category.DefaultIntervalCategoryDataset(strArray4, numberArray15, numberArray17);
        org.jfree.data.general.DatasetGroup datasetGroup19 = defaultIntervalCategoryDataset18.getGroup();
        java.util.List list20 = defaultIntervalCategoryDataset18.getRowKeys();
        defaultIntervalCategoryDataset18.validateObject();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "hi!", "", "" });
        org.junit.Assert.assertNotNull(numberArray6);
        org.junit.Assert.assertArrayEquals(numberArray6, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray7);
        org.junit.Assert.assertArrayEquals(numberArray7, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertArrayEquals(numberArray10, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertArrayEquals(numberArray11, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray12);
        org.junit.Assert.assertArrayEquals(numberArray12, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray13);
        org.junit.Assert.assertArrayEquals(numberArray13, new java.lang.Number[] {});
        org.junit.Assert.assertNotNull(numberArray14);
        org.junit.Assert.assertNotNull(datasetGroup19);
        org.junit.Assert.assertNotNull(list20);
    }
}

