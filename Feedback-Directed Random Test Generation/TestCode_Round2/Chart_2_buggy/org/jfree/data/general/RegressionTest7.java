package org.jfree.data.general;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest7 {

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
    public void test3501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3501");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        java.lang.Number number18 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset17);
        java.lang.Number number19 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(categoryDataset17);
        org.jfree.data.Range range21 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset17, true);
        org.jfree.data.Range range22 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset17);
        boolean boolean23 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset17);
        java.lang.Number number24 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset17);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertNotNull(categoryDataset17);
        org.junit.Assert.assertEquals("'" + number18 + "' != '" + 0.0d + "'", number18, 0.0d);
        org.junit.Assert.assertEquals("'" + number19 + "' != '" + 100.0d + "'", number19, 100.0d);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + number24 + "' != '" + 0.0d + "'", number24, 0.0d);
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
        java.lang.Number[] numberArray6 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray11 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray21 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray22 = new java.lang.Number[][] { numberArray6, numberArray11, numberArray16, numberArray21 };
        org.jfree.data.category.CategoryDataset categoryDataset23 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray22);
        org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset23);
        java.lang.Number number25 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset23);
        org.jfree.data.Range range26 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset23);
        org.jfree.data.pie.PieDataset pieDataset28 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset23, 1);
        double double29 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset28);
        org.junit.Assert.assertNotNull(numberArray6);
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertNotNull(numberArray16);
        org.junit.Assert.assertNotNull(numberArray21);
        org.junit.Assert.assertNotNull(numberArray22);
        org.junit.Assert.assertNotNull(categoryDataset23);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertEquals("'" + number25 + "' != '" + 400.0d + "'", number25, 400.0d);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(pieDataset28);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 4.0d + "'", double29 == 4.0d);
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
        double[] doubleArray9 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray16 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray17 = new double[][] { doubleArray9, doubleArray16 };
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray17);
        org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset18, false);
        org.jfree.data.pie.PieDataset pieDataset22 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset18, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset25 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset22, (java.lang.Comparable) ' ', (double) '#');
        org.jfree.data.category.CategoryDataset categoryDataset26 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) '4', (org.jfree.data.KeyedValues) pieDataset22);
        java.lang.Number number27 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset26);
        boolean boolean28 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset26);
        org.jfree.data.Range range29 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset26);
        org.jfree.data.Range range31 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset26, true);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertNotNull(categoryDataset18);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(pieDataset22);
        org.junit.Assert.assertNotNull(pieDataset25);
        org.junit.Assert.assertNotNull(categoryDataset26);
        org.junit.Assert.assertEquals("'" + number27 + "' != '" + 0.0d + "'", number27, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(range29);
        org.junit.Assert.assertNotNull(range31);
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
        java.lang.Number[] numberArray6 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray11 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray21 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray22 = new java.lang.Number[][] { numberArray6, numberArray11, numberArray16, numberArray21 };
        org.jfree.data.category.CategoryDataset categoryDataset23 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray22);
        org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset23);
        org.jfree.data.Range range26 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset23, true);
        org.jfree.data.Range range28 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset23, false);
        org.jfree.data.Range range29 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset23);
        org.jfree.data.Range range31 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset23, 400.0d);
        org.jfree.data.Range range32 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset23);
        org.jfree.data.Range range34 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset23, true);
        org.jfree.data.Range range36 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset23, false);
        java.lang.Number number37 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset23);
        org.junit.Assert.assertNotNull(numberArray6);
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertNotNull(numberArray16);
        org.junit.Assert.assertNotNull(numberArray21);
        org.junit.Assert.assertNotNull(numberArray22);
        org.junit.Assert.assertNotNull(categoryDataset23);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertNotNull(range29);
        org.junit.Assert.assertNotNull(range31);
        org.junit.Assert.assertNotNull(range32);
        org.junit.Assert.assertNotNull(range34);
        org.junit.Assert.assertNotNull(range36);
        org.junit.Assert.assertEquals("'" + number37 + "' != '" + 0.0d + "'", number37, 0.0d);
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
        double[] doubleArray10 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray17 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray18 = new double[][] { doubleArray10, doubleArray17 };
        org.jfree.data.category.CategoryDataset categoryDataset19 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray18);
        org.jfree.data.Range range21 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset19, false);
        org.jfree.data.pie.PieDataset pieDataset23 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset19, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset26 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset23, (java.lang.Comparable) 100L, (double) 1);
        boolean boolean27 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset23);
        boolean boolean28 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset23);
        org.jfree.data.category.CategoryDataset categoryDataset29 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 10L, (org.jfree.data.KeyedValues) pieDataset23);
        org.jfree.data.pie.PieDataset pieDataset33 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset23, (java.lang.Comparable) (short) 0, (double) 10.0f, 0);
        org.jfree.data.category.CategoryDataset categoryDataset34 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) "", (org.jfree.data.KeyedValues) pieDataset23);
        boolean boolean35 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset23);
        org.jfree.data.pie.PieDataset pieDataset38 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset23, (java.lang.Comparable) 112.0d, (double) (byte) 10);
        double double39 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset23);
        org.jfree.data.pie.PieDataset pieDataset43 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset23, (java.lang.Comparable) (-1.0f), (double) 'a', (int) (byte) 0);
        boolean boolean44 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset23);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(categoryDataset19);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertNotNull(pieDataset23);
        org.junit.Assert.assertNotNull(pieDataset26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(categoryDataset29);
        org.junit.Assert.assertNotNull(pieDataset33);
        org.junit.Assert.assertNotNull(categoryDataset34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(pieDataset38);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 130.0d + "'", double39 == 130.0d);
        org.junit.Assert.assertNotNull(pieDataset43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
        org.jfree.data.function.Function2D function2D0 = null;
        java.lang.Comparable comparable4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries5 = org.jfree.data.general.DatasetUtilities.sampleFunction2DToSeries(function2D0, (double) (byte) 1, 130.0d, 0, comparable4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
        double[] doubleArray2 = new double[] {};
        double[][] doubleArray3 = new double[][] { doubleArray2 };
        org.jfree.data.category.CategoryDataset categoryDataset4 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray3);
        org.jfree.data.Range range6 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset4, (double) '4');
        org.jfree.data.Range range7 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset4);
        java.lang.Number number8 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset4);
        org.jfree.data.Range range9 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset4);
        java.lang.Number number10 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset4);
        org.jfree.data.pie.PieDataset pieDataset12 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset4, 10);
        org.jfree.data.pie.PieDataset pieDataset14 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset4, (java.lang.Comparable) '4');
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(categoryDataset4);
        org.junit.Assert.assertNull(range6);
        org.junit.Assert.assertNull(range7);
        org.junit.Assert.assertNull(number8);
        org.junit.Assert.assertNull(range9);
        org.junit.Assert.assertNull(number10);
        org.junit.Assert.assertNotNull(pieDataset12);
        org.junit.Assert.assertNotNull(pieDataset14);
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, false);
        org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset17);
        org.jfree.data.Range range21 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset17);
        java.lang.Number number22 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset17);
        java.lang.Number number23 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(categoryDataset17);
        org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset17);
        org.jfree.data.Range range26 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, false);
        org.jfree.data.Range range28 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset17, (double) 1);
        java.lang.Number number29 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset17);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset31 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset17, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertNotNull(categoryDataset17);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertEquals("'" + number22 + "' != '" + 0.0d + "'", number22, 0.0d);
        org.junit.Assert.assertEquals("'" + number23 + "' != '" + 100.0d + "'", number23, 100.0d);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertEquals("'" + number29 + "' != '" + 200.0d + "'", number29, 200.0d);
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, false);
        org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset17);
        org.jfree.data.Range range22 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset17, true);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertNotNull(categoryDataset17);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(range22);
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        java.lang.Number number18 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(categoryDataset17);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset17);
        java.lang.Number number20 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset17);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertNotNull(categoryDataset17);
        org.junit.Assert.assertEquals("'" + number18 + "' != '" + 100.0d + "'", number18, 100.0d);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertEquals("'" + number20 + "' != '" + 0.0d + "'", number20, 0.0d);
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, false);
        org.jfree.data.pie.PieDataset pieDataset21 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset17, (int) (short) 0);
        org.jfree.data.Range range22 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset17);
        java.lang.Number number23 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(categoryDataset17);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertNotNull(categoryDataset17);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertNotNull(pieDataset21);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertEquals("'" + number23 + "' != '" + 100.0d + "'", number23, 100.0d);
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
        double[] doubleArray2 = new double[] {};
        double[][] doubleArray3 = new double[][] { doubleArray2 };
        org.jfree.data.category.CategoryDataset categoryDataset4 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray3);
        java.lang.Number number5 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(categoryDataset4);
        org.jfree.data.Range range7 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset4, false);
        java.lang.Number number8 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset4);
        org.jfree.data.pie.PieDataset pieDataset10 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset4, (java.lang.Comparable) 1.0d);
        org.jfree.data.pie.PieDataset pieDataset12 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset4, (int) (byte) 0);
        org.jfree.data.pie.PieDataset pieDataset14 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset4, (int) (short) 100);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(categoryDataset4);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertNull(range7);
        org.junit.Assert.assertNull(number8);
        org.junit.Assert.assertNotNull(pieDataset10);
        org.junit.Assert.assertNotNull(pieDataset12);
        org.junit.Assert.assertNotNull(pieDataset14);
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
        double[][] doubleArray10 = new double[][] {};
        org.jfree.data.category.CategoryDataset categoryDataset11 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray10);
        org.jfree.data.category.CategoryDataset categoryDataset12 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray10);
        org.jfree.data.category.CategoryDataset categoryDataset13 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray10);
        org.jfree.data.category.CategoryDataset categoryDataset14 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray10);
        org.jfree.data.category.CategoryDataset categoryDataset15 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray10);
        java.lang.Number number16 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset15);
        org.jfree.data.Range range18 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset15, (double) 1.0f);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[][] {});
        org.junit.Assert.assertNotNull(categoryDataset11);
        org.junit.Assert.assertNotNull(categoryDataset12);
        org.junit.Assert.assertNotNull(categoryDataset13);
        org.junit.Assert.assertNotNull(categoryDataset14);
        org.junit.Assert.assertNotNull(categoryDataset15);
        org.junit.Assert.assertNull(number16);
        org.junit.Assert.assertNull(range18);
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
        java.lang.Number[] numberArray10 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray15 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray20 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray25 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray26 = new java.lang.Number[][] { numberArray10, numberArray15, numberArray20, numberArray25 };
        org.jfree.data.category.CategoryDataset categoryDataset27 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray26);
        org.jfree.data.category.CategoryDataset categoryDataset28 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray26);
        org.jfree.data.category.CategoryDataset categoryDataset29 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray26);
        org.jfree.data.Range range31 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset29, true);
        org.jfree.data.Range range33 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset29, true);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(numberArray15);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertNotNull(numberArray25);
        org.junit.Assert.assertNotNull(numberArray26);
        org.junit.Assert.assertNotNull(categoryDataset27);
        org.junit.Assert.assertNotNull(categoryDataset28);
        org.junit.Assert.assertNotNull(categoryDataset29);
        org.junit.Assert.assertNotNull(range31);
        org.junit.Assert.assertNotNull(range33);
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
        java.lang.Number[] numberArray6 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray11 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray21 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray22 = new java.lang.Number[][] { numberArray6, numberArray11, numberArray16, numberArray21 };
        org.jfree.data.category.CategoryDataset categoryDataset23 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray22);
        java.lang.Number number24 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(categoryDataset23);
        java.lang.Number number25 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset23);
        org.jfree.data.Range range27 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset23, false);
        org.jfree.data.KeyToGroupMap keyToGroupMap28 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range29 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset23, keyToGroupMap28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray6);
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertNotNull(numberArray16);
        org.junit.Assert.assertNotNull(numberArray21);
        org.junit.Assert.assertNotNull(numberArray22);
        org.junit.Assert.assertNotNull(categoryDataset23);
        org.junit.Assert.assertEquals("'" + number24 + "' != '" + 100.0d + "'", number24, 100.0d);
        org.junit.Assert.assertEquals("'" + number25 + "' != '" + 400.0d + "'", number25, 400.0d);
        org.junit.Assert.assertNotNull(range27);
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
        double[] doubleArray6 = new double[] {};
        double[][] doubleArray7 = new double[][] { doubleArray6 };
        org.jfree.data.category.CategoryDataset categoryDataset8 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray7);
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray7);
        org.jfree.data.category.CategoryDataset categoryDataset10 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray7);
        org.jfree.data.pie.PieDataset pieDataset12 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset10, (java.lang.Comparable) (byte) 1);
        org.jfree.data.Range range13 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset10);
        java.lang.Number number14 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(categoryDataset10);
        java.lang.Number number15 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset10);
        org.jfree.data.Range range17 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset10, true);
        java.lang.Number number18 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset10);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertNotNull(categoryDataset8);
        org.junit.Assert.assertNotNull(categoryDataset9);
        org.junit.Assert.assertNotNull(categoryDataset10);
        org.junit.Assert.assertNotNull(pieDataset12);
        org.junit.Assert.assertNull(range13);
        org.junit.Assert.assertNull(number14);
        org.junit.Assert.assertNull(number15);
        org.junit.Assert.assertNull(range17);
        org.junit.Assert.assertNull(number18);
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        java.lang.Number number18 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset17);
        boolean boolean19 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset17);
        org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset17);
        java.lang.Number number21 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset17);
        org.jfree.data.Range range22 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset17);
        java.lang.Number number23 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset17);
        org.jfree.data.Range range25 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset17, true);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertNotNull(categoryDataset17);
        org.junit.Assert.assertEquals("'" + number18 + "' != '" + 0.0d + "'", number18, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertEquals("'" + number21 + "' != '" + 200.0d + "'", number21, 200.0d);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertEquals("'" + number23 + "' != '" + 0.0d + "'", number23, 0.0d);
        org.junit.Assert.assertNotNull(range25);
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
        double[] doubleArray2 = new double[] {};
        double[][] doubleArray3 = new double[][] { doubleArray2 };
        org.jfree.data.category.CategoryDataset categoryDataset4 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray3);
        org.jfree.data.pie.PieDataset pieDataset6 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset4, (java.lang.Comparable) (-1.0f));
        org.jfree.data.Range range8 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset4, false);
        boolean boolean9 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset4);
        org.jfree.data.Range range10 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset4);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(categoryDataset4);
        org.junit.Assert.assertNotNull(pieDataset6);
        org.junit.Assert.assertNull(range8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(range10);
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
        double[][] doubleArray4 = new double[][] {};
        org.jfree.data.category.CategoryDataset categoryDataset5 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray4);
        org.jfree.data.category.CategoryDataset categoryDataset6 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray4);
        org.jfree.data.Range range7 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset6);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[][] {});
        org.junit.Assert.assertNotNull(categoryDataset5);
        org.junit.Assert.assertNotNull(categoryDataset6);
        org.junit.Assert.assertNull(range7);
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
        double[] doubleArray2 = new double[] {};
        double[][] doubleArray3 = new double[][] { doubleArray2 };
        org.jfree.data.category.CategoryDataset categoryDataset4 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray3);
        org.jfree.data.Range range6 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset4, (double) '4');
        org.jfree.data.Range range8 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset4, false);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(categoryDataset4);
        org.junit.Assert.assertNull(range6);
        org.junit.Assert.assertNull(range8);
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset17, false);
        org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset17);
        org.jfree.data.Range range22 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset17, (double) (short) 10);
        org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, true);
        org.jfree.data.Range range26 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset17, (double) 100.0f);
        org.jfree.data.KeyToGroupMap keyToGroupMap27 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range28 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset17, keyToGroupMap27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertNotNull(categoryDataset17);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertNotNull(range26);
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
        java.lang.Number[] numberArray6 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray11 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray21 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray22 = new java.lang.Number[][] { numberArray6, numberArray11, numberArray16, numberArray21 };
        org.jfree.data.category.CategoryDataset categoryDataset23 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray22);
        org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset23);
        org.jfree.data.Range range26 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset23, true);
        org.jfree.data.Range range27 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset23);
        org.jfree.data.Range range29 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset23, false);
        org.jfree.data.pie.PieDataset pieDataset31 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset23, (int) (byte) 0);
        org.jfree.data.Range range32 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset23);
        org.junit.Assert.assertNotNull(numberArray6);
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertNotNull(numberArray16);
        org.junit.Assert.assertNotNull(numberArray21);
        org.junit.Assert.assertNotNull(numberArray22);
        org.junit.Assert.assertNotNull(categoryDataset23);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertNotNull(range29);
        org.junit.Assert.assertNotNull(pieDataset31);
        org.junit.Assert.assertNotNull(range32);
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
        double[] doubleArray10 = new double[] { (short) 0, (byte) 0 };
        double[][] doubleArray11 = new double[][] { doubleArray10 };
        org.jfree.data.category.CategoryDataset categoryDataset12 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray11);
        org.jfree.data.category.CategoryDataset categoryDataset13 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray11);
        org.jfree.data.category.CategoryDataset categoryDataset14 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray11);
        org.jfree.data.category.CategoryDataset categoryDataset15 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray11);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertNotNull(categoryDataset12);
        org.junit.Assert.assertNotNull(categoryDataset13);
        org.junit.Assert.assertNotNull(categoryDataset14);
        org.junit.Assert.assertNotNull(categoryDataset15);
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
        org.jfree.data.function.Function2D function2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries5 = org.jfree.data.general.DatasetUtilities.sampleFunction2DToSeries(function2D0, 112.0d, 0.0d, (int) (byte) 10, (java.lang.Comparable) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
        double[] doubleArray10 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray17 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray18 = new double[][] { doubleArray10, doubleArray17 };
        org.jfree.data.category.CategoryDataset categoryDataset19 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray18);
        org.jfree.data.Range range21 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset19, false);
        org.jfree.data.pie.PieDataset pieDataset23 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset19, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset26 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset23, (java.lang.Comparable) 100L, (double) 1);
        org.jfree.data.pie.PieDataset pieDataset29 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset23, (java.lang.Comparable) (short) 1, 130.0d);
        org.jfree.data.category.CategoryDataset categoryDataset30 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) (-1L), (org.jfree.data.KeyedValues) pieDataset23);
        double double31 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset23);
        boolean boolean32 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset23);
        org.jfree.data.category.CategoryDataset categoryDataset33 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) "", (org.jfree.data.KeyedValues) pieDataset23);
        org.jfree.data.Range range34 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset33);
        java.lang.Number number35 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset33);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(categoryDataset19);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertNotNull(pieDataset23);
        org.junit.Assert.assertNotNull(pieDataset26);
        org.junit.Assert.assertNotNull(pieDataset29);
        org.junit.Assert.assertNotNull(categoryDataset30);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 130.0d + "'", double31 == 130.0d);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(categoryDataset33);
        org.junit.Assert.assertNotNull(range34);
        org.junit.Assert.assertEquals("'" + number35 + "' != '" + 0.0d + "'", number35, 0.0d);
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
        double[] doubleArray9 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray16 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray17 = new double[][] { doubleArray9, doubleArray16 };
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray17);
        org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset18, false);
        org.jfree.data.pie.PieDataset pieDataset22 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset18, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset25 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset22, (java.lang.Comparable) 100L, (double) 1);
        org.jfree.data.category.CategoryDataset categoryDataset26 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) (-1L), (org.jfree.data.KeyedValues) pieDataset25);
        org.jfree.data.Range range27 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset26);
        org.jfree.data.Range range29 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset26, false);
        java.lang.Number number30 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset26);
        java.lang.Number number31 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset26);
        org.jfree.data.Range range33 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset26, true);
        org.jfree.data.Range range35 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset26, false);
        java.lang.Class<?> wildcardClass36 = range35.getClass();
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertNotNull(categoryDataset18);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(pieDataset22);
        org.junit.Assert.assertNotNull(pieDataset25);
        org.junit.Assert.assertNotNull(categoryDataset26);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertNotNull(range29);
        org.junit.Assert.assertEquals("'" + number30 + "' != '" + 130.0d + "'", number30, 130.0d);
        org.junit.Assert.assertEquals("'" + number31 + "' != '" + 130.0d + "'", number31, 130.0d);
        org.junit.Assert.assertNotNull(range33);
        org.junit.Assert.assertNotNull(range35);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
        double[][] doubleArray9 = new double[][] {};
        org.jfree.data.category.CategoryDataset categoryDataset10 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray9);
        org.jfree.data.category.CategoryDataset categoryDataset11 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray9);
        org.jfree.data.category.CategoryDataset categoryDataset12 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray9);
        org.jfree.data.category.CategoryDataset categoryDataset13 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray9);
        org.jfree.data.Range range15 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset13, false);
        org.jfree.data.pie.PieDataset pieDataset17 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset13, (java.lang.Comparable) (short) 1);
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) false, (org.jfree.data.KeyedValues) pieDataset17);
        org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset18, false);
        org.jfree.data.pie.PieDataset pieDataset22 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset18, (java.lang.Comparable) 100L);
        org.jfree.data.pie.PieDataset pieDataset24 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset18, (java.lang.Comparable) 1.0d);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[][] {});
        org.junit.Assert.assertNotNull(categoryDataset10);
        org.junit.Assert.assertNotNull(categoryDataset11);
        org.junit.Assert.assertNotNull(categoryDataset12);
        org.junit.Assert.assertNotNull(categoryDataset13);
        org.junit.Assert.assertNull(range15);
        org.junit.Assert.assertNotNull(pieDataset17);
        org.junit.Assert.assertNotNull(categoryDataset18);
        org.junit.Assert.assertNull(range20);
        org.junit.Assert.assertNotNull(pieDataset22);
        org.junit.Assert.assertNotNull(pieDataset24);
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, false);
        org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset17);
        org.jfree.data.Range range22 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, false);
        org.jfree.data.Range range23 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset17);
        org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset17);
        org.jfree.data.Range range26 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset17, false);
        java.lang.Number number27 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset17);
        java.lang.Number number28 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset17);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertNotNull(categoryDataset17);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertEquals("'" + number27 + "' != '" + 0.0d + "'", number27, 0.0d);
        org.junit.Assert.assertEquals("'" + number28 + "' != '" + 0.0d + "'", number28, 0.0d);
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
        double[] doubleArray7 = new double[] {};
        double[][] doubleArray8 = new double[][] { doubleArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray8);
        org.jfree.data.category.CategoryDataset categoryDataset10 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray8);
        org.jfree.data.category.CategoryDataset categoryDataset11 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray8);
        org.jfree.data.pie.PieDataset pieDataset13 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset11, (java.lang.Comparable) 0);
        boolean boolean14 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset13);
        org.jfree.data.pie.PieDataset pieDataset17 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset13, (java.lang.Comparable) (byte) 100, (double) (short) 100);
        org.jfree.data.pie.PieDataset pieDataset20 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset17, (java.lang.Comparable) 0, (double) (-1L));
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) (-1L), (org.jfree.data.KeyedValues) pieDataset20);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertNotNull(categoryDataset9);
        org.junit.Assert.assertNotNull(categoryDataset10);
        org.junit.Assert.assertNotNull(categoryDataset11);
        org.junit.Assert.assertNotNull(pieDataset13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(pieDataset17);
        org.junit.Assert.assertNotNull(pieDataset20);
        org.junit.Assert.assertNotNull(categoryDataset21);
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
        double[] doubleArray10 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray17 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray18 = new double[][] { doubleArray10, doubleArray17 };
        org.jfree.data.category.CategoryDataset categoryDataset19 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray18);
        org.jfree.data.category.CategoryDataset categoryDataset20 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray18);
        org.jfree.data.Range range21 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset20);
        org.jfree.data.Range range23 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset20, false);
        java.lang.Number number24 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset20);
        org.jfree.data.Range range26 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset20, (double) (byte) 100);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(categoryDataset19);
        org.junit.Assert.assertNotNull(categoryDataset20);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertEquals("'" + number24 + "' != '" + 0.0d + "'", number24, 0.0d);
        org.junit.Assert.assertNotNull(range26);
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
        java.lang.Number[][] numberArray6 = new java.lang.Number[][] {};
        org.jfree.data.category.CategoryDataset categoryDataset7 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray6);
        org.jfree.data.category.CategoryDataset categoryDataset8 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray6);
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray6);
        org.junit.Assert.assertNotNull(numberArray6);
        org.junit.Assert.assertArrayEquals(numberArray6, new java.lang.Number[][] {});
        org.junit.Assert.assertNotNull(categoryDataset7);
        org.junit.Assert.assertNotNull(categoryDataset8);
        org.junit.Assert.assertNotNull(categoryDataset9);
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
        double[] doubleArray9 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray16 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray17 = new double[][] { doubleArray9, doubleArray16 };
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray17);
        org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset18, false);
        org.jfree.data.pie.PieDataset pieDataset22 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset18, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset25 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset22, (java.lang.Comparable) 100L, (double) 1);
        org.jfree.data.pie.PieDataset pieDataset28 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset22, (java.lang.Comparable) (short) 1, 130.0d);
        boolean boolean29 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset22);
        boolean boolean30 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset22);
        boolean boolean31 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset22);
        double double32 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset22);
        org.jfree.data.pie.PieDataset pieDataset35 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset22, (java.lang.Comparable) (short) 10, (double) 'a');
        org.jfree.data.category.CategoryDataset categoryDataset36 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 4.0d, (org.jfree.data.KeyedValues) pieDataset35);
        java.lang.Class<?> wildcardClass37 = pieDataset35.getClass();
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertNotNull(categoryDataset18);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(pieDataset22);
        org.junit.Assert.assertNotNull(pieDataset25);
        org.junit.Assert.assertNotNull(pieDataset28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 130.0d + "'", double32 == 130.0d);
        org.junit.Assert.assertNotNull(pieDataset35);
        org.junit.Assert.assertNotNull(categoryDataset36);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
        java.lang.Number[] numberArray6 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray11 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray21 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray22 = new java.lang.Number[][] { numberArray6, numberArray11, numberArray16, numberArray21 };
        org.jfree.data.category.CategoryDataset categoryDataset23 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray22);
        org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset23);
        org.jfree.data.Range range26 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset23, false);
        org.jfree.data.Range range27 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset23);
        org.jfree.data.Range range29 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset23, false);
        java.lang.Number number30 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset23);
        java.lang.Number number31 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset23);
        org.jfree.data.Range range33 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset23, false);
        org.jfree.data.pie.PieDataset pieDataset35 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset23, (int) (byte) 0);
        org.junit.Assert.assertNotNull(numberArray6);
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertNotNull(numberArray16);
        org.junit.Assert.assertNotNull(numberArray21);
        org.junit.Assert.assertNotNull(numberArray22);
        org.junit.Assert.assertNotNull(categoryDataset23);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertNotNull(range29);
        org.junit.Assert.assertEquals("'" + number30 + "' != '" + 0.0d + "'", number30, 0.0d);
        org.junit.Assert.assertEquals("'" + number31 + "' != '" + 1.0d + "'", number31, 1.0d);
        org.junit.Assert.assertNotNull(range33);
        org.junit.Assert.assertNotNull(pieDataset35);
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, false);
        org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset17);
        org.jfree.data.Range range21 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset17);
        java.lang.Number number22 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset17);
        java.lang.Number number23 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(categoryDataset17);
        org.jfree.data.Range range25 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset17, (double) (-1.0f));
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset27 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset17, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertNotNull(categoryDataset17);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertEquals("'" + number22 + "' != '" + 0.0d + "'", number22, 0.0d);
        org.junit.Assert.assertEquals("'" + number23 + "' != '" + 100.0d + "'", number23, 100.0d);
        org.junit.Assert.assertNotNull(range25);
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
        double[] doubleArray4 = new double[] { (short) 0, (byte) 0 };
        double[][] doubleArray5 = new double[][] { doubleArray4 };
        org.jfree.data.category.CategoryDataset categoryDataset6 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray5);
        org.jfree.data.Range range8 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset6, true);
        org.jfree.data.Range range9 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset6);
        java.lang.Class<?> wildcardClass10 = categoryDataset6.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(categoryDataset6);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3536");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, false);
        org.jfree.data.pie.PieDataset pieDataset21 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset17, (int) (short) 0);
        org.jfree.data.Range range23 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset17, false);
        java.lang.Number number24 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset17);
        org.jfree.data.Range range26 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset17, false);
        boolean boolean27 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset17);
        org.jfree.data.Range range29 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset17, 20.0d);
        boolean boolean30 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset17);
        org.jfree.data.pie.PieDataset pieDataset32 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset17, 1);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertNotNull(categoryDataset17);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertNotNull(pieDataset21);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertEquals("'" + number24 + "' != '" + 200.0d + "'", number24, 200.0d);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(range29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(pieDataset32);
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
        java.lang.Number[] numberArray6 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray11 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray21 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray22 = new java.lang.Number[][] { numberArray6, numberArray11, numberArray16, numberArray21 };
        org.jfree.data.category.CategoryDataset categoryDataset23 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray22);
        org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset23);
        org.jfree.data.Range range26 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset23, true);
        org.jfree.data.Range range28 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset23, false);
        org.jfree.data.Range range29 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset23);
        org.jfree.data.Range range31 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset23, 400.0d);
        org.jfree.data.Range range32 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset23);
        org.jfree.data.Range range34 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset23, true);
        org.jfree.data.Range range36 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset23, (double) 100);
        org.jfree.data.Range range37 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset23);
        org.jfree.data.Range range38 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset23);
        org.junit.Assert.assertNotNull(numberArray6);
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertNotNull(numberArray16);
        org.junit.Assert.assertNotNull(numberArray21);
        org.junit.Assert.assertNotNull(numberArray22);
        org.junit.Assert.assertNotNull(categoryDataset23);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertNotNull(range29);
        org.junit.Assert.assertNotNull(range31);
        org.junit.Assert.assertNotNull(range32);
        org.junit.Assert.assertNotNull(range34);
        org.junit.Assert.assertNotNull(range36);
        org.junit.Assert.assertNotNull(range37);
        org.junit.Assert.assertNotNull(range38);
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
        java.lang.Number[] numberArray6 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray11 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray21 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray22 = new java.lang.Number[][] { numberArray6, numberArray11, numberArray16, numberArray21 };
        org.jfree.data.category.CategoryDataset categoryDataset23 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray22);
        org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset23);
        org.jfree.data.Range range26 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset23, true);
        java.lang.Number number27 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset23);
        java.lang.Number number28 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset23);
        org.jfree.data.Range range30 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset23, 0.0d);
        java.lang.Number number31 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset23);
        org.jfree.data.Range range32 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset23);
        org.jfree.data.Range range34 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset23, false);
        org.junit.Assert.assertNotNull(numberArray6);
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertNotNull(numberArray16);
        org.junit.Assert.assertNotNull(numberArray21);
        org.junit.Assert.assertNotNull(numberArray22);
        org.junit.Assert.assertNotNull(categoryDataset23);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertEquals("'" + number27 + "' != '" + 1.0d + "'", number27, 1.0d);
        org.junit.Assert.assertEquals("'" + number28 + "' != '" + 1.0d + "'", number28, 1.0d);
        org.junit.Assert.assertNotNull(range30);
        org.junit.Assert.assertEquals("'" + number31 + "' != '" + 400.0d + "'", number31, 400.0d);
        org.junit.Assert.assertNotNull(range32);
        org.junit.Assert.assertNotNull(range34);
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
        java.lang.Comparable[] comparableArray2 = new java.lang.Comparable[] { 112.0d, (short) -1 };
        java.lang.Comparable[] comparableArray9 = new java.lang.Comparable[] { 10, (-1L), 10L, 112.0d, 200.0d, (-1L) };
        double[][] doubleArray10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.category.CategoryDataset categoryDataset11 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray2, comparableArray9, doubleArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Duplicate items in 'columnKeys'.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparableArray2);
        org.junit.Assert.assertNotNull(comparableArray9);
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3540");
        java.lang.Number[] numberArray6 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray11 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray21 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray22 = new java.lang.Number[][] { numberArray6, numberArray11, numberArray16, numberArray21 };
        org.jfree.data.category.CategoryDataset categoryDataset23 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray22);
        org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset23);
        org.jfree.data.Range range26 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset23, false);
        org.jfree.data.Range range28 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset23, true);
        org.jfree.data.Range range29 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset23);
        org.jfree.data.Range range31 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset23, false);
        org.jfree.data.Range range32 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset23);
        java.lang.Number number33 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(categoryDataset23);
        org.jfree.data.pie.PieDataset pieDataset35 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset23, (int) (byte) 0);
        java.lang.Number number36 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset23);
        org.junit.Assert.assertNotNull(numberArray6);
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertNotNull(numberArray16);
        org.junit.Assert.assertNotNull(numberArray21);
        org.junit.Assert.assertNotNull(numberArray22);
        org.junit.Assert.assertNotNull(categoryDataset23);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertNotNull(range29);
        org.junit.Assert.assertNotNull(range31);
        org.junit.Assert.assertNotNull(range32);
        org.junit.Assert.assertEquals("'" + number33 + "' != '" + 100.0d + "'", number33, 100.0d);
        org.junit.Assert.assertNotNull(pieDataset35);
        org.junit.Assert.assertEquals("'" + number36 + "' != '" + 400.0d + "'", number36, 400.0d);
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3541");
        java.lang.Number[] numberArray6 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray11 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray21 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray22 = new java.lang.Number[][] { numberArray6, numberArray11, numberArray16, numberArray21 };
        org.jfree.data.category.CategoryDataset categoryDataset23 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray22);
        org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset23);
        org.jfree.data.Range range26 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset23, true);
        org.jfree.data.Range range27 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset23);
        org.jfree.data.Range range28 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset23);
        org.jfree.data.Range range29 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset23);
        org.junit.Assert.assertNotNull(numberArray6);
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertNotNull(numberArray16);
        org.junit.Assert.assertNotNull(numberArray21);
        org.junit.Assert.assertNotNull(numberArray22);
        org.junit.Assert.assertNotNull(categoryDataset23);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertNotNull(range29);
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3542");
        java.lang.Number[] numberArray6 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray11 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray21 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray22 = new java.lang.Number[][] { numberArray6, numberArray11, numberArray16, numberArray21 };
        org.jfree.data.category.CategoryDataset categoryDataset23 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray22);
        org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset23);
        java.lang.Number number25 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset23);
        org.jfree.data.Range range26 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset23);
        org.jfree.data.Range range28 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset23, (double) 100.0f);
        org.jfree.data.Range range29 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset23);
        org.jfree.data.Range range30 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset23);
        java.lang.Number number31 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset23);
        org.jfree.data.Range range32 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset23);
        org.jfree.data.Range range34 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset23, false);
        org.junit.Assert.assertNotNull(numberArray6);
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertNotNull(numberArray16);
        org.junit.Assert.assertNotNull(numberArray21);
        org.junit.Assert.assertNotNull(numberArray22);
        org.junit.Assert.assertNotNull(categoryDataset23);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertEquals("'" + number25 + "' != '" + 400.0d + "'", number25, 400.0d);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertNotNull(range29);
        org.junit.Assert.assertNotNull(range30);
        org.junit.Assert.assertEquals("'" + number31 + "' != '" + 1.0d + "'", number31, 1.0d);
        org.junit.Assert.assertNotNull(range32);
        org.junit.Assert.assertNotNull(range34);
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3543");
        double[] doubleArray9 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray16 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray17 = new double[][] { doubleArray9, doubleArray16 };
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray17);
        org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset18, false);
        org.jfree.data.pie.PieDataset pieDataset22 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset18, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset25 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset22, (java.lang.Comparable) 100L, (double) 1);
        org.jfree.data.pie.PieDataset pieDataset28 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset22, (java.lang.Comparable) 100.0d, (double) 'a');
        org.jfree.data.pie.PieDataset pieDataset31 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset22, (java.lang.Comparable) (short) 1, (double) 10);
        double double32 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset31);
        org.jfree.data.category.CategoryDataset categoryDataset33 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) (byte) 1, (org.jfree.data.KeyedValues) pieDataset31);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertNotNull(categoryDataset18);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(pieDataset22);
        org.junit.Assert.assertNotNull(pieDataset25);
        org.junit.Assert.assertNotNull(pieDataset28);
        org.junit.Assert.assertNotNull(pieDataset31);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 130.0d + "'", double32 == 130.0d);
        org.junit.Assert.assertNotNull(categoryDataset33);
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3544");
        org.jfree.data.function.Function2D function2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataset xYDataset5 = org.jfree.data.general.DatasetUtilities.sampleFunction2D(function2D0, 0.0d, 200.0d, (-1), (java.lang.Comparable) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3545");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset17, false);
        org.jfree.data.Range range21 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset17, true);
        org.jfree.data.pie.PieDataset pieDataset23 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset17, (int) (short) 0);
        java.lang.Class<?> wildcardClass24 = categoryDataset17.getClass();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertNotNull(categoryDataset17);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertNotNull(pieDataset23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3546");
        java.lang.Number[] numberArray6 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray11 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray21 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray22 = new java.lang.Number[][] { numberArray6, numberArray11, numberArray16, numberArray21 };
        org.jfree.data.category.CategoryDataset categoryDataset23 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray22);
        java.lang.Number number24 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(categoryDataset23);
        java.lang.Number number25 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(categoryDataset23);
        boolean boolean26 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset23);
        org.jfree.data.Range range27 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset23);
        java.lang.Number number28 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(categoryDataset23);
        org.jfree.data.pie.PieDataset pieDataset30 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset23, (int) (byte) 1);
        org.junit.Assert.assertNotNull(numberArray6);
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertNotNull(numberArray16);
        org.junit.Assert.assertNotNull(numberArray21);
        org.junit.Assert.assertNotNull(numberArray22);
        org.junit.Assert.assertNotNull(categoryDataset23);
        org.junit.Assert.assertEquals("'" + number24 + "' != '" + 100.0d + "'", number24, 100.0d);
        org.junit.Assert.assertEquals("'" + number25 + "' != '" + 100.0d + "'", number25, 100.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertEquals("'" + number28 + "' != '" + 100.0d + "'", number28, 100.0d);
        org.junit.Assert.assertNotNull(pieDataset30);
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3547");
        double[] doubleArray10 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray17 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray18 = new double[][] { doubleArray10, doubleArray17 };
        org.jfree.data.category.CategoryDataset categoryDataset19 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray18);
        org.jfree.data.Range range21 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset19, false);
        org.jfree.data.pie.PieDataset pieDataset23 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset19, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset26 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset23, (java.lang.Comparable) 100L, (double) 1);
        boolean boolean27 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset23);
        boolean boolean28 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset23);
        org.jfree.data.category.CategoryDataset categoryDataset29 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 10L, (org.jfree.data.KeyedValues) pieDataset23);
        org.jfree.data.pie.PieDataset pieDataset33 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset23, (java.lang.Comparable) (short) 0, (double) 10.0f, 0);
        org.jfree.data.category.CategoryDataset categoryDataset34 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) "", (org.jfree.data.KeyedValues) pieDataset23);
        boolean boolean35 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset23);
        org.jfree.data.pie.PieDataset pieDataset38 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset23, (java.lang.Comparable) 112.0d, (double) (byte) 10);
        double double39 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset23);
        boolean boolean40 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset23);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(categoryDataset19);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertNotNull(pieDataset23);
        org.junit.Assert.assertNotNull(pieDataset26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(categoryDataset29);
        org.junit.Assert.assertNotNull(pieDataset33);
        org.junit.Assert.assertNotNull(categoryDataset34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(pieDataset38);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 130.0d + "'", double39 == 130.0d);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3548");
        org.jfree.data.function.Function2D function2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataset xYDataset5 = org.jfree.data.general.DatasetUtilities.sampleFunction2D(function2D0, (double) 0, (double) (short) 100, (int) (byte) 1, (java.lang.Comparable) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3549");
        java.lang.Number[] numberArray6 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray11 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray21 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray22 = new java.lang.Number[][] { numberArray6, numberArray11, numberArray16, numberArray21 };
        org.jfree.data.category.CategoryDataset categoryDataset23 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray22);
        org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset23);
        org.jfree.data.Range range26 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset23, true);
        java.lang.Number number27 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset23);
        org.jfree.data.Range range29 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset23, true);
        java.lang.Number number30 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset23);
        java.util.List list31 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range33 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(categoryDataset23, list31, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'visibleSeriesKeys' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray6);
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertNotNull(numberArray16);
        org.junit.Assert.assertNotNull(numberArray21);
        org.junit.Assert.assertNotNull(numberArray22);
        org.junit.Assert.assertNotNull(categoryDataset23);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertEquals("'" + number27 + "' != '" + 1.0d + "'", number27, 1.0d);
        org.junit.Assert.assertNotNull(range29);
        org.junit.Assert.assertEquals("'" + number30 + "' != '" + 400.0d + "'", number30, 400.0d);
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3550");
        java.lang.Number[] numberArray6 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray11 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray21 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray22 = new java.lang.Number[][] { numberArray6, numberArray11, numberArray16, numberArray21 };
        org.jfree.data.category.CategoryDataset categoryDataset23 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray22);
        org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset23);
        org.jfree.data.Range range26 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset23, false);
        boolean boolean27 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset23);
        java.lang.Number number28 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset23);
        java.lang.Number number29 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(categoryDataset23);
        org.jfree.data.Range range31 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset23, (double) 0);
        org.jfree.data.Range range32 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset23);
        org.junit.Assert.assertNotNull(numberArray6);
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertNotNull(numberArray16);
        org.junit.Assert.assertNotNull(numberArray21);
        org.junit.Assert.assertNotNull(numberArray22);
        org.junit.Assert.assertNotNull(categoryDataset23);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + number28 + "' != '" + 400.0d + "'", number28, 400.0d);
        org.junit.Assert.assertEquals("'" + number29 + "' != '" + 100.0d + "'", number29, 100.0d);
        org.junit.Assert.assertNotNull(range31);
        org.junit.Assert.assertNotNull(range32);
    }

    @Test
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3551");
        org.jfree.data.function.Function2D function2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries5 = org.jfree.data.general.DatasetUtilities.sampleFunction2DToSeries(function2D0, 0.0d, (double) (-1L), 0, (java.lang.Comparable) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3552");
        java.lang.Number[] numberArray6 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray11 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray21 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray22 = new java.lang.Number[][] { numberArray6, numberArray11, numberArray16, numberArray21 };
        org.jfree.data.category.CategoryDataset categoryDataset23 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray22);
        java.lang.Number number24 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(categoryDataset23);
        java.lang.Number number25 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset23);
        org.jfree.data.Range range27 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset23, true);
        org.jfree.data.Range range28 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset23);
        java.lang.Number number29 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset23);
        org.junit.Assert.assertNotNull(numberArray6);
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertNotNull(numberArray16);
        org.junit.Assert.assertNotNull(numberArray21);
        org.junit.Assert.assertNotNull(numberArray22);
        org.junit.Assert.assertNotNull(categoryDataset23);
        org.junit.Assert.assertEquals("'" + number24 + "' != '" + 100.0d + "'", number24, 100.0d);
        org.junit.Assert.assertEquals("'" + number25 + "' != '" + 0.0d + "'", number25, 0.0d);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertEquals("'" + number29 + "' != '" + 400.0d + "'", number29, 400.0d);
    }

    @Test
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3553");
        double[] doubleArray10 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray17 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray18 = new double[][] { doubleArray10, doubleArray17 };
        org.jfree.data.category.CategoryDataset categoryDataset19 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray18);
        org.jfree.data.Range range21 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset19, false);
        org.jfree.data.pie.PieDataset pieDataset23 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset19, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset26 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset23, (java.lang.Comparable) 100L, (double) 1);
        boolean boolean27 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset23);
        boolean boolean28 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset23);
        org.jfree.data.category.CategoryDataset categoryDataset29 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 10L, (org.jfree.data.KeyedValues) pieDataset23);
        org.jfree.data.pie.PieDataset pieDataset33 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset23, (java.lang.Comparable) (short) 0, (double) 10.0f, 0);
        org.jfree.data.category.CategoryDataset categoryDataset34 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) "", (org.jfree.data.KeyedValues) pieDataset23);
        org.jfree.data.Range range35 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset34);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(categoryDataset19);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertNotNull(pieDataset23);
        org.junit.Assert.assertNotNull(pieDataset26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(categoryDataset29);
        org.junit.Assert.assertNotNull(pieDataset33);
        org.junit.Assert.assertNotNull(categoryDataset34);
        org.junit.Assert.assertNotNull(range35);
    }

    @Test
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3554");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, false);
        org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset17);
        org.jfree.data.Range range21 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset17);
        java.lang.Number number22 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset17);
        java.lang.Number number23 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(categoryDataset17);
        org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset17);
        java.lang.Number number25 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset17);
        java.lang.Number number26 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset17);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset28 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset17, (java.lang.Comparable) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertNotNull(categoryDataset17);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertEquals("'" + number22 + "' != '" + 0.0d + "'", number22, 0.0d);
        org.junit.Assert.assertEquals("'" + number23 + "' != '" + 100.0d + "'", number23, 100.0d);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertEquals("'" + number25 + "' != '" + 200.0d + "'", number25, 200.0d);
        org.junit.Assert.assertEquals("'" + number26 + "' != '" + 0.0d + "'", number26, 0.0d);
    }

    @Test
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3555");
        double[] doubleArray9 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray16 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray17 = new double[][] { doubleArray9, doubleArray16 };
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray17);
        org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset18, false);
        org.jfree.data.pie.PieDataset pieDataset22 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset18, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset25 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset22, (java.lang.Comparable) ' ', (double) '#');
        org.jfree.data.category.CategoryDataset categoryDataset26 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) '4', (org.jfree.data.KeyedValues) pieDataset22);
        java.lang.Number number27 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset26);
        org.jfree.data.Range range28 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset26);
        org.jfree.data.Range range29 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset26);
        java.lang.Number number30 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset26);
        org.jfree.data.Range range32 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset26, true);
        boolean boolean33 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset26);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertNotNull(categoryDataset18);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(pieDataset22);
        org.junit.Assert.assertNotNull(pieDataset25);
        org.junit.Assert.assertNotNull(categoryDataset26);
        org.junit.Assert.assertEquals("'" + number27 + "' != '" + 0.0d + "'", number27, 0.0d);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertNotNull(range29);
        org.junit.Assert.assertEquals("'" + number30 + "' != '" + 0.0d + "'", number30, 0.0d);
        org.junit.Assert.assertNotNull(range32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3556");
        java.lang.Number[] numberArray6 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray11 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray21 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray22 = new java.lang.Number[][] { numberArray6, numberArray11, numberArray16, numberArray21 };
        org.jfree.data.category.CategoryDataset categoryDataset23 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray22);
        org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset23);
        org.jfree.data.Range range26 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset23, false);
        org.jfree.data.Range range27 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset23);
        org.jfree.data.Range range29 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset23, false);
        java.lang.Number number30 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset23);
        java.lang.Number number31 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset23);
        org.jfree.data.Range range33 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset23, false);
        java.lang.Number number34 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset23);
        java.util.List list35 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range37 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(categoryDataset23, list35, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'visibleSeriesKeys' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray6);
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertNotNull(numberArray16);
        org.junit.Assert.assertNotNull(numberArray21);
        org.junit.Assert.assertNotNull(numberArray22);
        org.junit.Assert.assertNotNull(categoryDataset23);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertNotNull(range29);
        org.junit.Assert.assertEquals("'" + number30 + "' != '" + 0.0d + "'", number30, 0.0d);
        org.junit.Assert.assertEquals("'" + number31 + "' != '" + 1.0d + "'", number31, 1.0d);
        org.junit.Assert.assertNotNull(range33);
        org.junit.Assert.assertEquals("'" + number34 + "' != '" + 1.0d + "'", number34, 1.0d);
    }

    @Test
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3557");
        double[] doubleArray9 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray16 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray17 = new double[][] { doubleArray9, doubleArray16 };
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray17);
        org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset18, false);
        org.jfree.data.pie.PieDataset pieDataset22 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset18, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset25 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset22, (java.lang.Comparable) 100L, (double) 1);
        org.jfree.data.pie.PieDataset pieDataset28 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset22, (java.lang.Comparable) (short) 1, 130.0d);
        org.jfree.data.category.CategoryDataset categoryDataset29 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) (-1L), (org.jfree.data.KeyedValues) pieDataset22);
        org.jfree.data.Range range30 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset29);
        org.jfree.data.Range range32 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset29, false);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertNotNull(categoryDataset18);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(pieDataset22);
        org.junit.Assert.assertNotNull(pieDataset25);
        org.junit.Assert.assertNotNull(pieDataset28);
        org.junit.Assert.assertNotNull(categoryDataset29);
        org.junit.Assert.assertNotNull(range30);
        org.junit.Assert.assertNotNull(range32);
    }

    @Test
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3558");
        java.lang.Number[] numberArray6 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray11 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray21 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray22 = new java.lang.Number[][] { numberArray6, numberArray11, numberArray16, numberArray21 };
        org.jfree.data.category.CategoryDataset categoryDataset23 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray22);
        org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset23);
        java.lang.Number number25 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset23);
        org.jfree.data.Range range26 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset23);
        org.jfree.data.Range range28 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset23, true);
        org.jfree.data.Range range29 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset23);
        org.jfree.data.Range range30 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset23);
        org.jfree.data.Range range31 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset23);
        java.lang.Number number32 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(categoryDataset23);
        java.lang.Number number33 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(categoryDataset23);
        org.junit.Assert.assertNotNull(numberArray6);
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertNotNull(numberArray16);
        org.junit.Assert.assertNotNull(numberArray21);
        org.junit.Assert.assertNotNull(numberArray22);
        org.junit.Assert.assertNotNull(categoryDataset23);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertEquals("'" + number25 + "' != '" + 1.0d + "'", number25, 1.0d);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertNotNull(range29);
        org.junit.Assert.assertNotNull(range30);
        org.junit.Assert.assertNotNull(range31);
        org.junit.Assert.assertEquals("'" + number32 + "' != '" + 100.0d + "'", number32, 100.0d);
        org.junit.Assert.assertEquals("'" + number33 + "' != '" + 100.0d + "'", number33, 100.0d);
    }

    @Test
    public void test3559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3559");
        double[] doubleArray10 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray17 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray18 = new double[][] { doubleArray10, doubleArray17 };
        org.jfree.data.category.CategoryDataset categoryDataset19 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray18);
        org.jfree.data.Range range21 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset19, false);
        org.jfree.data.pie.PieDataset pieDataset23 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset19, (int) (short) 0);
        org.jfree.data.category.CategoryDataset categoryDataset24 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) (byte) 100, (org.jfree.data.KeyedValues) pieDataset23);
        org.jfree.data.category.CategoryDataset categoryDataset25 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 'a', (org.jfree.data.KeyedValues) pieDataset23);
        org.jfree.data.KeyToGroupMap keyToGroupMap26 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range27 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset25, keyToGroupMap26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(categoryDataset19);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertNotNull(pieDataset23);
        org.junit.Assert.assertNotNull(categoryDataset24);
        org.junit.Assert.assertNotNull(categoryDataset25);
    }

    @Test
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3560");
        double[] doubleArray10 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray17 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray18 = new double[][] { doubleArray10, doubleArray17 };
        org.jfree.data.category.CategoryDataset categoryDataset19 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray18);
        org.jfree.data.Range range21 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset19, false);
        org.jfree.data.pie.PieDataset pieDataset23 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset19, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset26 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset23, (java.lang.Comparable) 100L, (double) 1);
        double double27 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset23);
        boolean boolean28 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset23);
        org.jfree.data.category.CategoryDataset categoryDataset29 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) (short) -1, (org.jfree.data.KeyedValues) pieDataset23);
        org.jfree.data.category.CategoryDataset categoryDataset30 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) (short) 0, (org.jfree.data.KeyedValues) pieDataset23);
        org.jfree.data.pie.PieDataset pieDataset34 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset23, (java.lang.Comparable) (-1), 20.0d, (int) (byte) 100);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(categoryDataset19);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertNotNull(pieDataset23);
        org.junit.Assert.assertNotNull(pieDataset26);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 130.0d + "'", double27 == 130.0d);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(categoryDataset29);
        org.junit.Assert.assertNotNull(categoryDataset30);
        org.junit.Assert.assertNotNull(pieDataset34);
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3561");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        java.lang.Number[] numberArray8 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray18 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray23 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray24 = new java.lang.Number[][] { numberArray8, numberArray13, numberArray18, numberArray23 };
        org.jfree.data.category.CategoryDataset categoryDataset25 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray24);
        java.lang.Number number26 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(categoryDataset25);
        org.jfree.data.Range range28 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset25, true);
        java.lang.Number number29 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset25);
        org.jfree.data.Range range30 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset25);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range32 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(xYDataset0, list1, range30, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray13);
        org.junit.Assert.assertNotNull(numberArray18);
        org.junit.Assert.assertNotNull(numberArray23);
        org.junit.Assert.assertNotNull(numberArray24);
        org.junit.Assert.assertNotNull(categoryDataset25);
        org.junit.Assert.assertEquals("'" + number26 + "' != '" + 100.0d + "'", number26, 100.0d);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertEquals("'" + number29 + "' != '" + 1.0d + "'", number29, 1.0d);
        org.junit.Assert.assertNotNull(range30);
    }

    @Test
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3562");
        double[] doubleArray2 = new double[] {};
        double[][] doubleArray3 = new double[][] { doubleArray2 };
        org.jfree.data.category.CategoryDataset categoryDataset4 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray3);
        java.lang.Number number5 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(categoryDataset4);
        org.jfree.data.Range range7 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset4, true);
        org.jfree.data.Range range8 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset4);
        org.jfree.data.Range range9 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset4);
        org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset4, (int) (short) 0);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(categoryDataset4);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertNull(range7);
        org.junit.Assert.assertNull(range8);
        org.junit.Assert.assertNull(range9);
        org.junit.Assert.assertNotNull(pieDataset11);
    }

    @Test
    public void test3563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3563");
        java.lang.Number[][] numberArray2 = new java.lang.Number[][] {};
        org.jfree.data.category.CategoryDataset categoryDataset3 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray2);
        org.junit.Assert.assertNotNull(numberArray2);
        org.junit.Assert.assertArrayEquals(numberArray2, new java.lang.Number[][] {});
        org.junit.Assert.assertNotNull(categoryDataset3);
    }

    @Test
    public void test3564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3564");
        java.lang.Number[] numberArray8 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray18 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray23 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray24 = new java.lang.Number[][] { numberArray8, numberArray13, numberArray18, numberArray23 };
        org.jfree.data.category.CategoryDataset categoryDataset25 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray24);
        org.jfree.data.category.CategoryDataset categoryDataset26 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray24);
        org.jfree.data.Range range27 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset26);
        org.jfree.data.Range range29 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset26, false);
        org.jfree.data.Range range30 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset26);
        org.jfree.data.Range range32 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset26, true);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray13);
        org.junit.Assert.assertNotNull(numberArray18);
        org.junit.Assert.assertNotNull(numberArray23);
        org.junit.Assert.assertNotNull(numberArray24);
        org.junit.Assert.assertNotNull(categoryDataset25);
        org.junit.Assert.assertNotNull(categoryDataset26);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertNotNull(range29);
        org.junit.Assert.assertNotNull(range30);
        org.junit.Assert.assertNotNull(range32);
    }

    @Test
    public void test3565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3565");
        double[] doubleArray10 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray17 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray18 = new double[][] { doubleArray10, doubleArray17 };
        org.jfree.data.category.CategoryDataset categoryDataset19 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray18);
        org.jfree.data.category.CategoryDataset categoryDataset20 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray18);
        org.jfree.data.Range range21 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset20);
        org.jfree.data.Range range23 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset20, false);
        java.lang.Number number24 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset20);
        org.jfree.data.Range range25 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset20);
        java.lang.Number number26 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset20);
        org.jfree.data.Range range27 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset20);
        org.jfree.data.Range range28 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset20);
        org.jfree.data.Range range30 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset20, false);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(categoryDataset19);
        org.junit.Assert.assertNotNull(categoryDataset20);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertEquals("'" + number24 + "' != '" + 0.0d + "'", number24, 0.0d);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertEquals("'" + number26 + "' != '" + 0.0d + "'", number26, 0.0d);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertNotNull(range30);
    }

    @Test
    public void test3566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3566");
        double[][] doubleArray2 = new double[][] {};
        org.jfree.data.category.CategoryDataset categoryDataset3 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray2);
        boolean boolean4 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset3);
        org.jfree.data.pie.PieDataset pieDataset6 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset3, (int) (byte) -1);
        org.jfree.data.pie.PieDataset pieDataset9 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset6, (java.lang.Comparable) (-1), 400.0d);
        org.jfree.data.pie.PieDataset pieDataset12 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset6, (java.lang.Comparable) (-1.0f), (double) 10);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[][] {});
        org.junit.Assert.assertNotNull(categoryDataset3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(pieDataset6);
        org.junit.Assert.assertNotNull(pieDataset9);
        org.junit.Assert.assertNotNull(pieDataset12);
    }

    @Test
    public void test3567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3567");
        double[] doubleArray11 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray18 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray19 = new double[][] { doubleArray11, doubleArray18 };
        org.jfree.data.category.CategoryDataset categoryDataset20 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray19);
        org.jfree.data.Range range22 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset20, false);
        org.jfree.data.pie.PieDataset pieDataset24 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset20, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset27 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset24, (java.lang.Comparable) 100L, (double) 1);
        org.jfree.data.pie.PieDataset pieDataset30 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset24, (java.lang.Comparable) (short) 1, 130.0d);
        org.jfree.data.category.CategoryDataset categoryDataset31 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) (-1L), (org.jfree.data.KeyedValues) pieDataset24);
        double double32 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset24);
        boolean boolean33 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset24);
        org.jfree.data.category.CategoryDataset categoryDataset34 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) "", (org.jfree.data.KeyedValues) pieDataset24);
        org.jfree.data.pie.PieDataset pieDataset38 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset24, (java.lang.Comparable) (short) 0, (double) 1, (int) (short) 1);
        org.jfree.data.category.CategoryDataset categoryDataset39 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) true, (org.jfree.data.KeyedValues) pieDataset24);
        org.jfree.data.Range range41 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset39, false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset43 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset39, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertNotNull(categoryDataset20);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertNotNull(pieDataset24);
        org.junit.Assert.assertNotNull(pieDataset27);
        org.junit.Assert.assertNotNull(pieDataset30);
        org.junit.Assert.assertNotNull(categoryDataset31);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 130.0d + "'", double32 == 130.0d);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(categoryDataset34);
        org.junit.Assert.assertNotNull(pieDataset38);
        org.junit.Assert.assertNotNull(categoryDataset39);
        org.junit.Assert.assertNotNull(range41);
    }

    @Test
    public void test3568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3568");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        java.lang.Number number18 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(categoryDataset17);
        java.lang.Number number19 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset17);
        org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset17);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertNotNull(categoryDataset17);
        org.junit.Assert.assertEquals("'" + number18 + "' != '" + 100.0d + "'", number18, 100.0d);
        org.junit.Assert.assertEquals("'" + number19 + "' != '" + 200.0d + "'", number19, 200.0d);
        org.junit.Assert.assertNotNull(range20);
    }

    @Test
    public void test3569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3569");
        double[][] doubleArray8 = new double[][] {};
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray8);
        org.jfree.data.category.CategoryDataset categoryDataset10 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray8);
        org.jfree.data.category.CategoryDataset categoryDataset11 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray8);
        org.jfree.data.category.CategoryDataset categoryDataset12 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray8);
        org.jfree.data.Range range14 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset12, true);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[][] {});
        org.junit.Assert.assertNotNull(categoryDataset9);
        org.junit.Assert.assertNotNull(categoryDataset10);
        org.junit.Assert.assertNotNull(categoryDataset11);
        org.junit.Assert.assertNotNull(categoryDataset12);
        org.junit.Assert.assertNull(range14);
    }

    @Test
    public void test3570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3570");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, false);
        org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset17);
        org.jfree.data.Range range21 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset17);
        java.lang.Number number22 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset17);
        java.lang.Number number23 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(categoryDataset17);
        org.jfree.data.Range range25 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset17, (double) 1L);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset27 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset17, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertNotNull(categoryDataset17);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertEquals("'" + number22 + "' != '" + 0.0d + "'", number22, 0.0d);
        org.junit.Assert.assertEquals("'" + number23 + "' != '" + 100.0d + "'", number23, 100.0d);
        org.junit.Assert.assertNotNull(range25);
    }

    @Test
    public void test3571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3571");
        double[] doubleArray10 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray17 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray18 = new double[][] { doubleArray10, doubleArray17 };
        org.jfree.data.category.CategoryDataset categoryDataset19 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray18);
        org.jfree.data.Range range21 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset19, false);
        org.jfree.data.pie.PieDataset pieDataset23 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset19, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset26 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset23, (java.lang.Comparable) 100L, (double) 1);
        org.jfree.data.pie.PieDataset pieDataset29 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset23, (java.lang.Comparable) (short) 1, 130.0d);
        org.jfree.data.category.CategoryDataset categoryDataset30 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) (-1L), (org.jfree.data.KeyedValues) pieDataset23);
        double double31 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset23);
        boolean boolean32 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset23);
        org.jfree.data.category.CategoryDataset categoryDataset33 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) "", (org.jfree.data.KeyedValues) pieDataset23);
        boolean boolean34 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset33);
        java.lang.Number number35 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset33);
        java.lang.Class<?> wildcardClass36 = number35.getClass();
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(categoryDataset19);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertNotNull(pieDataset23);
        org.junit.Assert.assertNotNull(pieDataset26);
        org.junit.Assert.assertNotNull(pieDataset29);
        org.junit.Assert.assertNotNull(categoryDataset30);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 130.0d + "'", double31 == 130.0d);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(categoryDataset33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + number35 + "' != '" + 0.0d + "'", number35, 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test3572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3572");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset2 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset0, (java.lang.Comparable) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3573");
        java.lang.Comparable[] comparableArray3 = new java.lang.Comparable[] { (short) 10, 4.0d, (short) 1 };
        java.lang.Comparable[] comparableArray7 = new java.lang.Comparable[] { false, ' ', (-1L) };
        double[][] doubleArray8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray3, comparableArray7, doubleArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparableArray3);
        org.junit.Assert.assertNotNull(comparableArray7);
    }

    @Test
    public void test3574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3574");
        java.lang.Number[] numberArray6 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray11 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray21 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray22 = new java.lang.Number[][] { numberArray6, numberArray11, numberArray16, numberArray21 };
        org.jfree.data.category.CategoryDataset categoryDataset23 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray22);
        org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset23);
        org.jfree.data.Range range26 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset23, true);
        boolean boolean27 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset23);
        java.lang.Number number28 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset23);
        java.lang.Number number29 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset23);
        org.jfree.data.Range range30 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset23);
        org.jfree.data.Range range32 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset23, false);
        org.junit.Assert.assertNotNull(numberArray6);
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertNotNull(numberArray16);
        org.junit.Assert.assertNotNull(numberArray21);
        org.junit.Assert.assertNotNull(numberArray22);
        org.junit.Assert.assertNotNull(categoryDataset23);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + number28 + "' != '" + 400.0d + "'", number28, 400.0d);
        org.junit.Assert.assertEquals("'" + number29 + "' != '" + 0.0d + "'", number29, 0.0d);
        org.junit.Assert.assertNotNull(range30);
        org.junit.Assert.assertNotNull(range32);
    }

    @Test
    public void test3575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3575");
        java.lang.Number[] numberArray6 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray11 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray21 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray22 = new java.lang.Number[][] { numberArray6, numberArray11, numberArray16, numberArray21 };
        org.jfree.data.category.CategoryDataset categoryDataset23 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray22);
        org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset23);
        org.jfree.data.Range range26 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset23, false);
        org.jfree.data.Range range28 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset23, true);
        org.jfree.data.Range range30 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset23, false);
        org.jfree.data.Range range31 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset23);
        org.jfree.data.Range range33 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset23, 10.0d);
        org.junit.Assert.assertNotNull(numberArray6);
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertNotNull(numberArray16);
        org.junit.Assert.assertNotNull(numberArray21);
        org.junit.Assert.assertNotNull(numberArray22);
        org.junit.Assert.assertNotNull(categoryDataset23);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertNotNull(range30);
        org.junit.Assert.assertNotNull(range31);
        org.junit.Assert.assertNotNull(range33);
    }

    @Test
    public void test3576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3576");
        java.lang.Number[] numberArray6 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray11 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray21 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray22 = new java.lang.Number[][] { numberArray6, numberArray11, numberArray16, numberArray21 };
        org.jfree.data.category.CategoryDataset categoryDataset23 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray22);
        org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset23);
        org.jfree.data.Range range26 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset23, true);
        org.jfree.data.Range range28 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset23, false);
        org.jfree.data.Range range29 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset23);
        boolean boolean30 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset23);
        org.jfree.data.Range range32 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset23, true);
        org.jfree.data.Range range33 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset23);
        org.jfree.data.Range range34 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset23);
        org.jfree.data.pie.PieDataset pieDataset36 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset23, 0);
        org.junit.Assert.assertNotNull(numberArray6);
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertNotNull(numberArray16);
        org.junit.Assert.assertNotNull(numberArray21);
        org.junit.Assert.assertNotNull(numberArray22);
        org.junit.Assert.assertNotNull(categoryDataset23);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertNotNull(range29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(range32);
        org.junit.Assert.assertNotNull(range33);
        org.junit.Assert.assertNotNull(range34);
        org.junit.Assert.assertNotNull(pieDataset36);
    }

    @Test
    public void test3577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3577");
        double[][] doubleArray8 = new double[][] {};
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray8);
        org.jfree.data.category.CategoryDataset categoryDataset10 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray8);
        org.jfree.data.category.CategoryDataset categoryDataset11 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray8);
        org.jfree.data.category.CategoryDataset categoryDataset12 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray8);
        org.jfree.data.Range range14 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset12, true);
        org.jfree.data.pie.PieDataset pieDataset16 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset12, (java.lang.Comparable) (short) 100);
        java.lang.Comparable comparable17 = null;
        org.jfree.data.pie.PieDataset pieDataset20 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset16, comparable17, (double) 0.0f, (int) (short) 10);
        org.jfree.data.pie.PieDataset pieDataset24 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset20, (java.lang.Comparable) '#', (double) '#', (int) (byte) 1);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[][] {});
        org.junit.Assert.assertNotNull(categoryDataset9);
        org.junit.Assert.assertNotNull(categoryDataset10);
        org.junit.Assert.assertNotNull(categoryDataset11);
        org.junit.Assert.assertNotNull(categoryDataset12);
        org.junit.Assert.assertNull(range14);
        org.junit.Assert.assertNotNull(pieDataset16);
        org.junit.Assert.assertNotNull(pieDataset20);
        org.junit.Assert.assertNotNull(pieDataset24);
    }

    @Test
    public void test3578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3578");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, false);
        org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset17);
        org.jfree.data.Range range21 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset17);
        java.lang.Number number22 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset17);
        org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, true);
        org.jfree.data.Range range26 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset17, (double) (short) 10);
        java.lang.Number number27 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(categoryDataset17);
        java.lang.Number number28 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(categoryDataset17);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertNotNull(categoryDataset17);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertEquals("'" + number22 + "' != '" + 0.0d + "'", number22, 0.0d);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertEquals("'" + number27 + "' != '" + 100.0d + "'", number27, 100.0d);
        org.junit.Assert.assertEquals("'" + number28 + "' != '" + 100.0d + "'", number28, 100.0d);
    }

    @Test
    public void test3579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3579");
        java.lang.Number[] numberArray6 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray11 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray21 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray22 = new java.lang.Number[][] { numberArray6, numberArray11, numberArray16, numberArray21 };
        org.jfree.data.category.CategoryDataset categoryDataset23 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray22);
        java.lang.Number number24 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(categoryDataset23);
        org.jfree.data.Range range26 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset23, true);
        org.jfree.data.Range range28 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset23, true);
        org.jfree.data.Range range29 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset23);
        java.lang.Number number30 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(categoryDataset23);
        org.junit.Assert.assertNotNull(numberArray6);
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertNotNull(numberArray16);
        org.junit.Assert.assertNotNull(numberArray21);
        org.junit.Assert.assertNotNull(numberArray22);
        org.junit.Assert.assertNotNull(categoryDataset23);
        org.junit.Assert.assertEquals("'" + number24 + "' != '" + 100.0d + "'", number24, 100.0d);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertNotNull(range29);
        org.junit.Assert.assertEquals("'" + number30 + "' != '" + 100.0d + "'", number30, 100.0d);
    }

    @Test
    public void test3580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3580");
        java.lang.Number[] numberArray6 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray11 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray21 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray22 = new java.lang.Number[][] { numberArray6, numberArray11, numberArray16, numberArray21 };
        org.jfree.data.category.CategoryDataset categoryDataset23 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray22);
        org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset23);
        org.jfree.data.Range range26 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset23, true);
        org.jfree.data.Range range28 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset23, false);
        org.jfree.data.Range range29 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset23);
        java.lang.Number number30 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(categoryDataset23);
        org.jfree.data.Range range31 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset23);
        org.junit.Assert.assertNotNull(numberArray6);
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertNotNull(numberArray16);
        org.junit.Assert.assertNotNull(numberArray21);
        org.junit.Assert.assertNotNull(numberArray22);
        org.junit.Assert.assertNotNull(categoryDataset23);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertNotNull(range29);
        org.junit.Assert.assertEquals("'" + number30 + "' != '" + 100.0d + "'", number30, 100.0d);
        org.junit.Assert.assertNotNull(range31);
    }

    @Test
    public void test3581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3581");
        double[][] doubleArray9 = new double[][] {};
        org.jfree.data.category.CategoryDataset categoryDataset10 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray9);
        org.jfree.data.category.CategoryDataset categoryDataset11 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray9);
        org.jfree.data.category.CategoryDataset categoryDataset12 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray9);
        org.jfree.data.category.CategoryDataset categoryDataset13 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray9);
        org.jfree.data.Range range15 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset13, false);
        org.jfree.data.pie.PieDataset pieDataset17 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset13, (java.lang.Comparable) (short) 1);
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) false, (org.jfree.data.KeyedValues) pieDataset17);
        double double19 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset17);
        boolean boolean20 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset17);
        boolean boolean21 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset17);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[][] {});
        org.junit.Assert.assertNotNull(categoryDataset10);
        org.junit.Assert.assertNotNull(categoryDataset11);
        org.junit.Assert.assertNotNull(categoryDataset12);
        org.junit.Assert.assertNotNull(categoryDataset13);
        org.junit.Assert.assertNull(range15);
        org.junit.Assert.assertNotNull(pieDataset17);
        org.junit.Assert.assertNotNull(categoryDataset18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test3582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3582");
        java.lang.Number[] numberArray6 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray11 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray21 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray22 = new java.lang.Number[][] { numberArray6, numberArray11, numberArray16, numberArray21 };
        org.jfree.data.category.CategoryDataset categoryDataset23 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray22);
        org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset23);
        org.jfree.data.Range range26 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset23, true);
        java.lang.Number number27 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset23);
        org.jfree.data.Range range29 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset23, true);
        org.jfree.data.Range range31 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset23, true);
        org.jfree.data.Range range32 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset23);
        java.lang.Number number33 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset23);
        org.jfree.data.Range range34 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset23);
        org.jfree.data.Range range36 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset23, true);
        org.junit.Assert.assertNotNull(numberArray6);
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertNotNull(numberArray16);
        org.junit.Assert.assertNotNull(numberArray21);
        org.junit.Assert.assertNotNull(numberArray22);
        org.junit.Assert.assertNotNull(categoryDataset23);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertEquals("'" + number27 + "' != '" + 1.0d + "'", number27, 1.0d);
        org.junit.Assert.assertNotNull(range29);
        org.junit.Assert.assertNotNull(range31);
        org.junit.Assert.assertNotNull(range32);
        org.junit.Assert.assertEquals("'" + number33 + "' != '" + 0.0d + "'", number33, 0.0d);
        org.junit.Assert.assertNotNull(range34);
        org.junit.Assert.assertNotNull(range36);
    }

    @Test
    public void test3583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3583");
        double[] doubleArray9 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray16 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray17 = new double[][] { doubleArray9, doubleArray16 };
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray17);
        org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset18, false);
        org.jfree.data.pie.PieDataset pieDataset22 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset18, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset25 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset22, (java.lang.Comparable) 100L, (double) 1);
        org.jfree.data.pie.PieDataset pieDataset28 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset22, (java.lang.Comparable) (short) 1, 130.0d);
        org.jfree.data.category.CategoryDataset categoryDataset29 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) (-1L), (org.jfree.data.KeyedValues) pieDataset22);
        double double30 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset22);
        org.jfree.data.pie.PieDataset pieDataset33 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset22, (java.lang.Comparable) 0.0f, (double) (byte) 1);
        double double34 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset33);
        double double35 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset33);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertNotNull(categoryDataset18);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(pieDataset22);
        org.junit.Assert.assertNotNull(pieDataset25);
        org.junit.Assert.assertNotNull(pieDataset28);
        org.junit.Assert.assertNotNull(categoryDataset29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 130.0d + "'", double30 == 130.0d);
        org.junit.Assert.assertNotNull(pieDataset33);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 130.0d + "'", double34 == 130.0d);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 130.0d + "'", double35 == 130.0d);
    }

    @Test
    public void test3584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3584");
        double[] doubleArray3 = new double[] {};
        double[][] doubleArray4 = new double[][] { doubleArray3 };
        org.jfree.data.category.CategoryDataset categoryDataset5 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray4);
        org.jfree.data.pie.PieDataset pieDataset7 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset5, (java.lang.Comparable) (-1.0f));
        org.jfree.data.pie.PieDataset pieDataset10 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset7, (java.lang.Comparable) 100, 0.0d);
        org.jfree.data.pie.PieDataset pieDataset13 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset10, (java.lang.Comparable) (byte) -1, (double) 1);
        boolean boolean14 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset13);
        org.jfree.data.category.CategoryDataset categoryDataset15 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 112.0d, (org.jfree.data.KeyedValues) pieDataset13);
        org.jfree.data.Range range17 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset15, true);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertNotNull(categoryDataset5);
        org.junit.Assert.assertNotNull(pieDataset7);
        org.junit.Assert.assertNotNull(pieDataset10);
        org.junit.Assert.assertNotNull(pieDataset13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(categoryDataset15);
        org.junit.Assert.assertNull(range17);
    }

    @Test
    public void test3585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3585");
        java.lang.Number[] numberArray6 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray11 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray21 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray22 = new java.lang.Number[][] { numberArray6, numberArray11, numberArray16, numberArray21 };
        org.jfree.data.category.CategoryDataset categoryDataset23 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray22);
        org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset23);
        org.jfree.data.Range range26 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset23, true);
        org.jfree.data.Range range27 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset23);
        java.lang.Number number28 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset23);
        org.jfree.data.Range range29 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset23);
        org.jfree.data.Range range31 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset23, 200.0d);
        org.junit.Assert.assertNotNull(numberArray6);
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertNotNull(numberArray16);
        org.junit.Assert.assertNotNull(numberArray21);
        org.junit.Assert.assertNotNull(numberArray22);
        org.junit.Assert.assertNotNull(categoryDataset23);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertEquals("'" + number28 + "' != '" + 400.0d + "'", number28, 400.0d);
        org.junit.Assert.assertNotNull(range29);
        org.junit.Assert.assertNotNull(range31);
    }

    @Test
    public void test3586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3586");
        java.lang.Number[] numberArray6 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray11 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray21 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray22 = new java.lang.Number[][] { numberArray6, numberArray11, numberArray16, numberArray21 };
        org.jfree.data.category.CategoryDataset categoryDataset23 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray22);
        org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset23);
        org.jfree.data.Range range25 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset23);
        java.lang.Number number26 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(categoryDataset23);
        boolean boolean27 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset23);
        org.jfree.data.Range range28 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset23);
        org.junit.Assert.assertNotNull(numberArray6);
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertNotNull(numberArray16);
        org.junit.Assert.assertNotNull(numberArray21);
        org.junit.Assert.assertNotNull(numberArray22);
        org.junit.Assert.assertNotNull(categoryDataset23);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertEquals("'" + number26 + "' != '" + 100.0d + "'", number26, 100.0d);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(range28);
    }

    @Test
    public void test3587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3587");
        java.lang.Number[] numberArray8 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray18 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray23 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray24 = new java.lang.Number[][] { numberArray8, numberArray13, numberArray18, numberArray23 };
        org.jfree.data.category.CategoryDataset categoryDataset25 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray24);
        org.jfree.data.category.CategoryDataset categoryDataset26 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray24);
        org.jfree.data.Range range27 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset26);
        boolean boolean28 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset26);
        org.jfree.data.Range range29 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset26);
        org.jfree.data.Range range30 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset26);
        org.jfree.data.Range range32 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset26, false);
        org.jfree.data.Range range34 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset26, (double) (byte) 10);
        java.lang.Number number35 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset26);
        org.jfree.data.Range range36 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset26);
        org.jfree.data.Range range37 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset26);
        org.jfree.data.Range range39 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset26, (double) ' ');
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray13);
        org.junit.Assert.assertNotNull(numberArray18);
        org.junit.Assert.assertNotNull(numberArray23);
        org.junit.Assert.assertNotNull(numberArray24);
        org.junit.Assert.assertNotNull(categoryDataset25);
        org.junit.Assert.assertNotNull(categoryDataset26);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(range29);
        org.junit.Assert.assertNotNull(range30);
        org.junit.Assert.assertNotNull(range32);
        org.junit.Assert.assertNotNull(range34);
        org.junit.Assert.assertEquals("'" + number35 + "' != '" + 0.0d + "'", number35, 0.0d);
        org.junit.Assert.assertNotNull(range36);
        org.junit.Assert.assertNotNull(range37);
        org.junit.Assert.assertNotNull(range39);
    }

    @Test
    public void test3588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3588");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, false);
        org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset17);
        org.jfree.data.Range range21 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset17);
        java.lang.Number number22 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset17);
        java.lang.Number number23 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(categoryDataset17);
        org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset17);
        org.jfree.data.Range range26 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, false);
        org.jfree.data.Range range28 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset17, (double) 1);
        org.jfree.data.Range range30 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset17, true);
        java.lang.Number number31 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset17);
        org.jfree.data.Range range32 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset17);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertNotNull(categoryDataset17);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertEquals("'" + number22 + "' != '" + 0.0d + "'", number22, 0.0d);
        org.junit.Assert.assertEquals("'" + number23 + "' != '" + 100.0d + "'", number23, 100.0d);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertNotNull(range30);
        org.junit.Assert.assertEquals("'" + number31 + "' != '" + 0.0d + "'", number31, 0.0d);
        org.junit.Assert.assertNotNull(range32);
    }

    @Test
    public void test3589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3589");
        org.jfree.data.function.Function2D function2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries5 = org.jfree.data.general.DatasetUtilities.sampleFunction2DToSeries(function2D0, (double) (-1L), (double) 100L, (int) (short) 10, (java.lang.Comparable) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3590");
        double[] doubleArray9 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray16 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray17 = new double[][] { doubleArray9, doubleArray16 };
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray17);
        org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset18, false);
        org.jfree.data.pie.PieDataset pieDataset22 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset18, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset25 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset22, (java.lang.Comparable) 100L, (double) 1);
        org.jfree.data.category.CategoryDataset categoryDataset26 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 10L, (org.jfree.data.KeyedValues) pieDataset22);
        org.jfree.data.Range range28 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset26, 0.0d);
        org.jfree.data.Range range29 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset26);
        org.jfree.data.Range range31 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset26, true);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertNotNull(categoryDataset18);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(pieDataset22);
        org.junit.Assert.assertNotNull(pieDataset25);
        org.junit.Assert.assertNotNull(categoryDataset26);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertNotNull(range29);
        org.junit.Assert.assertNotNull(range31);
    }

    @Test
    public void test3591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3591");
        java.lang.Number[] numberArray10 = new java.lang.Number[] { (-1.0f), (-1.0d), 1L, 100, 200.0d, 1 };
        java.lang.Number[][] numberArray11 = new java.lang.Number[][] { numberArray10 };
        org.jfree.data.category.CategoryDataset categoryDataset12 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray11);
        org.jfree.data.category.CategoryDataset categoryDataset13 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray11);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertNotNull(categoryDataset12);
        org.junit.Assert.assertNotNull(categoryDataset13);
    }

    @Test
    public void test3592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3592");
        org.jfree.data.function.Function2D function2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataset xYDataset5 = org.jfree.data.general.DatasetUtilities.sampleFunction2D(function2D0, 130.0d, 400.0d, 100, (java.lang.Comparable) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3593");
        java.lang.Number[] numberArray6 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray11 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray21 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray22 = new java.lang.Number[][] { numberArray6, numberArray11, numberArray16, numberArray21 };
        org.jfree.data.category.CategoryDataset categoryDataset23 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray22);
        org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset23);
        org.jfree.data.Range range26 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset23, false);
        org.jfree.data.Range range28 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset23, true);
        org.jfree.data.Range range29 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset23);
        org.jfree.data.pie.PieDataset pieDataset31 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset23, (int) (byte) 0);
        org.jfree.data.Range range32 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset23);
        boolean boolean33 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset23);
        java.lang.Number number34 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(categoryDataset23);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset36 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset23, (java.lang.Comparable) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray6);
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertNotNull(numberArray16);
        org.junit.Assert.assertNotNull(numberArray21);
        org.junit.Assert.assertNotNull(numberArray22);
        org.junit.Assert.assertNotNull(categoryDataset23);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertNotNull(range29);
        org.junit.Assert.assertNotNull(pieDataset31);
        org.junit.Assert.assertNotNull(range32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + number34 + "' != '" + 100.0d + "'", number34, 100.0d);
    }

    @Test
    public void test3594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3594");
        java.lang.Comparable[] comparableArray3 = new java.lang.Comparable[] { 1L, (short) 10, 'a' };
        java.lang.Comparable[] comparableArray5 = new java.lang.Comparable[] { 1.0f };
        double[] doubleArray10 = new double[] {};
        double[][] doubleArray11 = new double[][] { doubleArray10 };
        org.jfree.data.category.CategoryDataset categoryDataset12 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray11);
        org.jfree.data.category.CategoryDataset categoryDataset13 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray11);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.category.CategoryDataset categoryDataset14 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray3, comparableArray5, doubleArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The number of row keys does not match the number of rows in the data array.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparableArray3);
        org.junit.Assert.assertNotNull(comparableArray5);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertNotNull(categoryDataset12);
        org.junit.Assert.assertNotNull(categoryDataset13);
    }

    @Test
    public void test3595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3595");
        double[] doubleArray9 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray16 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray17 = new double[][] { doubleArray9, doubleArray16 };
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray17);
        org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset18, false);
        org.jfree.data.pie.PieDataset pieDataset22 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset18, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset25 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset22, (java.lang.Comparable) 100L, (double) 1);
        org.jfree.data.category.CategoryDataset categoryDataset26 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) (-1L), (org.jfree.data.KeyedValues) pieDataset25);
        org.jfree.data.Range range27 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset26);
        org.jfree.data.Range range29 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset26, false);
        java.lang.Number number30 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset26);
        java.lang.Number number31 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset26);
        org.jfree.data.Range range33 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset26, true);
        org.jfree.data.Range range35 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset26, false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset37 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset26, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertNotNull(categoryDataset18);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(pieDataset22);
        org.junit.Assert.assertNotNull(pieDataset25);
        org.junit.Assert.assertNotNull(categoryDataset26);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertNotNull(range29);
        org.junit.Assert.assertEquals("'" + number30 + "' != '" + 130.0d + "'", number30, 130.0d);
        org.junit.Assert.assertEquals("'" + number31 + "' != '" + 130.0d + "'", number31, 130.0d);
        org.junit.Assert.assertNotNull(range33);
        org.junit.Assert.assertNotNull(range35);
    }

    @Test
    public void test3596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3596");
        double[] doubleArray3 = new double[] {};
        double[][] doubleArray4 = new double[][] { doubleArray3 };
        org.jfree.data.category.CategoryDataset categoryDataset5 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray4);
        org.jfree.data.pie.PieDataset pieDataset7 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset5, (java.lang.Comparable) (-1.0f));
        org.jfree.data.pie.PieDataset pieDataset10 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset7, (java.lang.Comparable) 100, 0.0d);
        org.jfree.data.pie.PieDataset pieDataset13 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset10, (java.lang.Comparable) (byte) -1, (double) 1);
        boolean boolean14 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset13);
        org.jfree.data.pie.PieDataset pieDataset17 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset13, (java.lang.Comparable) (byte) 1, (double) (byte) 1);
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 0.0f, (org.jfree.data.KeyedValues) pieDataset17);
        boolean boolean19 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset18);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertNotNull(categoryDataset5);
        org.junit.Assert.assertNotNull(pieDataset7);
        org.junit.Assert.assertNotNull(pieDataset10);
        org.junit.Assert.assertNotNull(pieDataset13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(pieDataset17);
        org.junit.Assert.assertNotNull(categoryDataset18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test3597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3597");
        java.lang.Number[] numberArray6 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray11 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray21 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray22 = new java.lang.Number[][] { numberArray6, numberArray11, numberArray16, numberArray21 };
        org.jfree.data.category.CategoryDataset categoryDataset23 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray22);
        org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset23);
        org.jfree.data.Range range26 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset23, true);
        org.jfree.data.Range range28 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset23, false);
        org.jfree.data.Range range29 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset23);
        org.jfree.data.Range range30 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset23);
        org.jfree.data.Range range32 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset23, false);
        org.jfree.data.Range range34 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset23, true);
        org.junit.Assert.assertNotNull(numberArray6);
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertNotNull(numberArray16);
        org.junit.Assert.assertNotNull(numberArray21);
        org.junit.Assert.assertNotNull(numberArray22);
        org.junit.Assert.assertNotNull(categoryDataset23);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertNotNull(range29);
        org.junit.Assert.assertNotNull(range30);
        org.junit.Assert.assertNotNull(range32);
        org.junit.Assert.assertNotNull(range34);
    }

    @Test
    public void test3598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3598");
        double[] doubleArray4 = new double[] {};
        double[][] doubleArray5 = new double[][] { doubleArray4 };
        org.jfree.data.category.CategoryDataset categoryDataset6 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray5);
        org.jfree.data.category.CategoryDataset categoryDataset7 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray5);
        boolean boolean8 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset7);
        org.jfree.data.pie.PieDataset pieDataset10 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset7, (int) ' ');
        org.jfree.data.Range range12 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset7, true);
        org.jfree.data.Range range14 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset7, 1.0d);
        org.jfree.data.pie.PieDataset pieDataset16 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset7, (java.lang.Comparable) 100.0f);
        java.lang.Number number17 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(categoryDataset7);
        org.jfree.data.Range range18 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset7);
        org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset7, false);
        org.jfree.data.Range range21 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset7);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(categoryDataset6);
        org.junit.Assert.assertNotNull(categoryDataset7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(pieDataset10);
        org.junit.Assert.assertNull(range12);
        org.junit.Assert.assertNull(range14);
        org.junit.Assert.assertNotNull(pieDataset16);
        org.junit.Assert.assertNull(number17);
        org.junit.Assert.assertNull(range18);
        org.junit.Assert.assertNull(range20);
        org.junit.Assert.assertNull(range21);
    }

    @Test
    public void test3599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3599");
        double[] doubleArray10 = new double[] {};
        double[][] doubleArray11 = new double[][] { doubleArray10 };
        org.jfree.data.category.CategoryDataset categoryDataset12 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray11);
        org.jfree.data.category.CategoryDataset categoryDataset13 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray11);
        org.jfree.data.category.CategoryDataset categoryDataset14 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray11);
        org.jfree.data.category.CategoryDataset categoryDataset15 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray11);
        org.jfree.data.category.CategoryDataset categoryDataset16 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray11);
        java.util.List list17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(categoryDataset16, list17, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'visibleSeriesKeys' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertNotNull(categoryDataset12);
        org.junit.Assert.assertNotNull(categoryDataset13);
        org.junit.Assert.assertNotNull(categoryDataset14);
        org.junit.Assert.assertNotNull(categoryDataset15);
        org.junit.Assert.assertNotNull(categoryDataset16);
    }

    @Test
    public void test3600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3600");
        org.jfree.data.function.Function2D function2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries5 = org.jfree.data.general.DatasetUtilities.sampleFunction2DToSeries(function2D0, 130.0d, (double) (short) 1, 1, (java.lang.Comparable) 130.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3601");
        double[] doubleArray9 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray16 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray17 = new double[][] { doubleArray9, doubleArray16 };
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray17);
        org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset18, false);
        org.jfree.data.pie.PieDataset pieDataset22 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset18, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset25 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset22, (java.lang.Comparable) 100L, (double) 1);
        boolean boolean26 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset22);
        boolean boolean27 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset22);
        org.jfree.data.category.CategoryDataset categoryDataset28 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 10L, (org.jfree.data.KeyedValues) pieDataset22);
        java.lang.Number number29 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset28);
        org.jfree.data.Range range31 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset28, (double) (short) 1);
        org.jfree.data.Range range32 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset28);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertNotNull(categoryDataset18);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(pieDataset22);
        org.junit.Assert.assertNotNull(pieDataset25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(categoryDataset28);
        org.junit.Assert.assertEquals("'" + number29 + "' != '" + 0.0d + "'", number29, 0.0d);
        org.junit.Assert.assertNotNull(range31);
        org.junit.Assert.assertNotNull(range32);
    }

    @Test
    public void test3602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3602");
        java.lang.Number[] numberArray6 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray11 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray21 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray22 = new java.lang.Number[][] { numberArray6, numberArray11, numberArray16, numberArray21 };
        org.jfree.data.category.CategoryDataset categoryDataset23 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray22);
        org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset23);
        org.jfree.data.Range range26 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset23, true);
        java.lang.Number number27 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset23);
        org.jfree.data.Range range29 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset23, true);
        org.jfree.data.Range range31 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset23, true);
        org.jfree.data.Range range33 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset23, true);
        java.lang.Number number34 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset23);
        org.jfree.data.Range range36 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset23, false);
        org.jfree.data.KeyToGroupMap keyToGroupMap37 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range38 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset23, keyToGroupMap37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray6);
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertNotNull(numberArray16);
        org.junit.Assert.assertNotNull(numberArray21);
        org.junit.Assert.assertNotNull(numberArray22);
        org.junit.Assert.assertNotNull(categoryDataset23);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertEquals("'" + number27 + "' != '" + 1.0d + "'", number27, 1.0d);
        org.junit.Assert.assertNotNull(range29);
        org.junit.Assert.assertNotNull(range31);
        org.junit.Assert.assertNotNull(range33);
        org.junit.Assert.assertEquals("'" + number34 + "' != '" + 1.0d + "'", number34, 1.0d);
        org.junit.Assert.assertNotNull(range36);
    }

    @Test
    public void test3603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3603");
        java.lang.Number[] numberArray6 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray11 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray21 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray22 = new java.lang.Number[][] { numberArray6, numberArray11, numberArray16, numberArray21 };
        org.jfree.data.category.CategoryDataset categoryDataset23 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray22);
        org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset23);
        org.jfree.data.Range range26 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset23, true);
        java.lang.Number number27 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset23);
        java.lang.Number number28 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset23);
        java.lang.Number number29 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(categoryDataset23);
        boolean boolean30 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset23);
        org.junit.Assert.assertNotNull(numberArray6);
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertNotNull(numberArray16);
        org.junit.Assert.assertNotNull(numberArray21);
        org.junit.Assert.assertNotNull(numberArray22);
        org.junit.Assert.assertNotNull(categoryDataset23);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertEquals("'" + number27 + "' != '" + 1.0d + "'", number27, 1.0d);
        org.junit.Assert.assertEquals("'" + number28 + "' != '" + 1.0d + "'", number28, 1.0d);
        org.junit.Assert.assertEquals("'" + number29 + "' != '" + 100.0d + "'", number29, 100.0d);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test3604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3604");
        java.lang.Number[] numberArray10 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray15 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray20 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray25 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray26 = new java.lang.Number[][] { numberArray10, numberArray15, numberArray20, numberArray25 };
        org.jfree.data.category.CategoryDataset categoryDataset27 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray26);
        org.jfree.data.category.CategoryDataset categoryDataset28 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray26);
        org.jfree.data.category.CategoryDataset categoryDataset29 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray26);
        java.lang.Number number30 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset29);
        java.lang.Number number31 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset29);
        java.lang.Number number32 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(categoryDataset29);
        java.lang.Number number33 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(categoryDataset29);
        java.lang.Class<?> wildcardClass34 = categoryDataset29.getClass();
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(numberArray15);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertNotNull(numberArray25);
        org.junit.Assert.assertNotNull(numberArray26);
        org.junit.Assert.assertNotNull(categoryDataset27);
        org.junit.Assert.assertNotNull(categoryDataset28);
        org.junit.Assert.assertNotNull(categoryDataset29);
        org.junit.Assert.assertEquals("'" + number30 + "' != '" + 400.0d + "'", number30, 400.0d);
        org.junit.Assert.assertEquals("'" + number31 + "' != '" + 400.0d + "'", number31, 400.0d);
        org.junit.Assert.assertEquals("'" + number32 + "' != '" + 100.0d + "'", number32, 100.0d);
        org.junit.Assert.assertEquals("'" + number33 + "' != '" + 100.0d + "'", number33, 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test3605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3605");
        org.jfree.data.function.Function2D function2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries5 = org.jfree.data.general.DatasetUtilities.sampleFunction2DToSeries(function2D0, (double) ' ', (double) 10L, (int) ' ', (java.lang.Comparable) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3606");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, false);
        org.jfree.data.pie.PieDataset pieDataset21 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset17, (int) (short) 0);
        org.jfree.data.Range range23 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset17, false);
        java.lang.Number number24 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset17);
        org.jfree.data.Range range26 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset17, false);
        org.jfree.data.Range range28 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset17, true);
        org.jfree.data.Range range30 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, false);
        org.jfree.data.Range range31 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset17);
        org.jfree.data.Range range33 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset17, false);
        java.lang.Number number34 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset17);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertNotNull(categoryDataset17);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertNotNull(pieDataset21);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertEquals("'" + number24 + "' != '" + 200.0d + "'", number24, 200.0d);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertNotNull(range30);
        org.junit.Assert.assertNotNull(range31);
        org.junit.Assert.assertNotNull(range33);
        org.junit.Assert.assertEquals("'" + number34 + "' != '" + 0.0d + "'", number34, 0.0d);
    }

    @Test
    public void test3607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3607");
        double[][] doubleArray6 = new double[][] {};
        org.jfree.data.category.CategoryDataset categoryDataset7 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray6);
        org.jfree.data.category.CategoryDataset categoryDataset8 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray6);
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray6);
        org.jfree.data.KeyToGroupMap keyToGroupMap10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range11 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset9, keyToGroupMap10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[][] {});
        org.junit.Assert.assertNotNull(categoryDataset7);
        org.junit.Assert.assertNotNull(categoryDataset8);
        org.junit.Assert.assertNotNull(categoryDataset9);
    }

    @Test
    public void test3608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3608");
        org.jfree.data.function.Function2D function2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries5 = org.jfree.data.general.DatasetUtilities.sampleFunction2DToSeries(function2D0, (double) (short) 0, (double) '#', 10, (java.lang.Comparable) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3609");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset17, false);
        org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset17);
        org.jfree.data.Range range22 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset17, (double) 1);
        boolean boolean23 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset17);
        java.lang.Number number24 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset17);
        org.jfree.data.Range range25 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset17);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertNotNull(categoryDataset17);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + number24 + "' != '" + 0.0d + "'", number24, 0.0d);
        org.junit.Assert.assertNotNull(range25);
    }

    @Test
    public void test3610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3610");
        org.jfree.data.function.Function2D function2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries5 = org.jfree.data.general.DatasetUtilities.sampleFunction2DToSeries(function2D0, (double) 10, (double) '4', (int) (byte) 100, (java.lang.Comparable) 4.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3611");
        java.lang.Number[][] numberArray12 = new java.lang.Number[][] {};
        org.jfree.data.category.CategoryDataset categoryDataset13 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray12);
        org.jfree.data.category.CategoryDataset categoryDataset14 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray12);
        org.jfree.data.category.CategoryDataset categoryDataset15 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray12);
        org.jfree.data.category.CategoryDataset categoryDataset16 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray12);
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray12);
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray12);
        org.junit.Assert.assertNotNull(numberArray12);
        org.junit.Assert.assertArrayEquals(numberArray12, new java.lang.Number[][] {});
        org.junit.Assert.assertNotNull(categoryDataset13);
        org.junit.Assert.assertNotNull(categoryDataset14);
        org.junit.Assert.assertNotNull(categoryDataset15);
        org.junit.Assert.assertNotNull(categoryDataset16);
        org.junit.Assert.assertNotNull(categoryDataset17);
        org.junit.Assert.assertNotNull(categoryDataset18);
    }

    @Test
    public void test3612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3612");
        double[] doubleArray10 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray17 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray18 = new double[][] { doubleArray10, doubleArray17 };
        org.jfree.data.category.CategoryDataset categoryDataset19 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray18);
        org.jfree.data.Range range21 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset19, false);
        org.jfree.data.pie.PieDataset pieDataset23 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset19, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset26 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset23, (java.lang.Comparable) ' ', (double) '#');
        org.jfree.data.category.CategoryDataset categoryDataset27 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) '4', (org.jfree.data.KeyedValues) pieDataset23);
        boolean boolean28 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset23);
        org.jfree.data.category.CategoryDataset categoryDataset29 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 0.0d, (org.jfree.data.KeyedValues) pieDataset23);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(categoryDataset19);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertNotNull(pieDataset23);
        org.junit.Assert.assertNotNull(pieDataset26);
        org.junit.Assert.assertNotNull(categoryDataset27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(categoryDataset29);
    }

    @Test
    public void test3613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3613");
        org.jfree.data.function.Function2D function2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries5 = org.jfree.data.general.DatasetUtilities.sampleFunction2DToSeries(function2D0, (double) ' ', 20.0d, (-1), (java.lang.Comparable) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3614");
        double[] doubleArray10 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray17 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray18 = new double[][] { doubleArray10, doubleArray17 };
        org.jfree.data.category.CategoryDataset categoryDataset19 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray18);
        org.jfree.data.Range range21 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset19, false);
        org.jfree.data.pie.PieDataset pieDataset23 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset19, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset26 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset23, (java.lang.Comparable) 100L, (double) 1);
        org.jfree.data.pie.PieDataset pieDataset29 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset23, (java.lang.Comparable) (short) 1, 130.0d);
        boolean boolean30 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset23);
        boolean boolean31 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset23);
        boolean boolean32 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset23);
        double double33 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset23);
        org.jfree.data.category.CategoryDataset categoryDataset34 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) ' ', (org.jfree.data.KeyedValues) pieDataset23);
        org.jfree.data.category.CategoryDataset categoryDataset35 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) (-1.0d), (org.jfree.data.KeyedValues) pieDataset23);
        org.jfree.data.pie.PieDataset pieDataset37 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset35, 0);
        double double38 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset37);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(categoryDataset19);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertNotNull(pieDataset23);
        org.junit.Assert.assertNotNull(pieDataset26);
        org.junit.Assert.assertNotNull(pieDataset29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 130.0d + "'", double33 == 130.0d);
        org.junit.Assert.assertNotNull(categoryDataset34);
        org.junit.Assert.assertNotNull(categoryDataset35);
        org.junit.Assert.assertNotNull(pieDataset37);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 10.0d + "'", double38 == 10.0d);
    }

    @Test
    public void test3615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3615");
        double[] doubleArray11 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray18 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray19 = new double[][] { doubleArray11, doubleArray18 };
        org.jfree.data.category.CategoryDataset categoryDataset20 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray19);
        org.jfree.data.Range range22 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset20, false);
        org.jfree.data.pie.PieDataset pieDataset24 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset20, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset27 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset24, (java.lang.Comparable) 100L, (double) 1);
        org.jfree.data.pie.PieDataset pieDataset30 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset24, (java.lang.Comparable) (short) 1, 130.0d);
        boolean boolean31 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset24);
        boolean boolean32 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset24);
        boolean boolean33 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset24);
        double double34 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset24);
        org.jfree.data.category.CategoryDataset categoryDataset35 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) ' ', (org.jfree.data.KeyedValues) pieDataset24);
        org.jfree.data.category.CategoryDataset categoryDataset36 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) (-1.0d), (org.jfree.data.KeyedValues) pieDataset24);
        double double37 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset24);
        double double38 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset24);
        org.jfree.data.category.CategoryDataset categoryDataset39 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) (-1), (org.jfree.data.KeyedValues) pieDataset24);
        org.jfree.data.pie.PieDataset pieDataset43 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset24, (java.lang.Comparable) "hi!", (double) (byte) -1, (int) (short) -1);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertNotNull(categoryDataset20);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertNotNull(pieDataset24);
        org.junit.Assert.assertNotNull(pieDataset27);
        org.junit.Assert.assertNotNull(pieDataset30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 130.0d + "'", double34 == 130.0d);
        org.junit.Assert.assertNotNull(categoryDataset35);
        org.junit.Assert.assertNotNull(categoryDataset36);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 130.0d + "'", double37 == 130.0d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 130.0d + "'", double38 == 130.0d);
        org.junit.Assert.assertNotNull(categoryDataset39);
        org.junit.Assert.assertNotNull(pieDataset43);
    }

    @Test
    public void test3616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3616");
        double[] doubleArray2 = new double[] {};
        double[][] doubleArray3 = new double[][] { doubleArray2 };
        org.jfree.data.category.CategoryDataset categoryDataset4 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray3);
        org.jfree.data.pie.PieDataset pieDataset6 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset4, (java.lang.Comparable) (-1.0f));
        org.jfree.data.pie.PieDataset pieDataset9 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset6, (java.lang.Comparable) '4', (double) (short) 1);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(categoryDataset4);
        org.junit.Assert.assertNotNull(pieDataset6);
        org.junit.Assert.assertNotNull(pieDataset9);
    }

    @Test
    public void test3617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3617");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, false);
        org.jfree.data.pie.PieDataset pieDataset21 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset17, (int) (short) 0);
        org.jfree.data.Range range23 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset17, false);
        java.lang.Number number24 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset17);
        org.jfree.data.Range range26 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset17, false);
        org.jfree.data.Range range28 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset17, true);
        java.lang.Number number29 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset17);
        org.jfree.data.Range range31 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset17, (double) 100L);
        java.lang.Class<?> wildcardClass32 = categoryDataset17.getClass();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertNotNull(categoryDataset17);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertNotNull(pieDataset21);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertEquals("'" + number24 + "' != '" + 200.0d + "'", number24, 200.0d);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertEquals("'" + number29 + "' != '" + 0.0d + "'", number29, 0.0d);
        org.junit.Assert.assertNotNull(range31);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test3618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3618");
        double[] doubleArray6 = new double[] {};
        double[][] doubleArray7 = new double[][] { doubleArray6 };
        org.jfree.data.category.CategoryDataset categoryDataset8 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray7);
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray7);
        org.jfree.data.category.CategoryDataset categoryDataset10 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray7);
        org.jfree.data.Range range11 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset10);
        org.jfree.data.pie.PieDataset pieDataset13 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset10, (java.lang.Comparable) 100);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertNotNull(categoryDataset8);
        org.junit.Assert.assertNotNull(categoryDataset9);
        org.junit.Assert.assertNotNull(categoryDataset10);
        org.junit.Assert.assertNull(range11);
        org.junit.Assert.assertNotNull(pieDataset13);
    }

    @Test
    public void test3619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3619");
        double[][] doubleArray10 = new double[][] {};
        org.jfree.data.category.CategoryDataset categoryDataset11 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray10);
        org.jfree.data.category.CategoryDataset categoryDataset12 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray10);
        org.jfree.data.category.CategoryDataset categoryDataset13 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray10);
        org.jfree.data.category.CategoryDataset categoryDataset14 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray10);
        org.jfree.data.Range range16 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset14, true);
        org.jfree.data.pie.PieDataset pieDataset18 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset14, (java.lang.Comparable) (byte) 10);
        org.jfree.data.category.CategoryDataset categoryDataset19 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 1L, (org.jfree.data.KeyedValues) pieDataset18);
        org.jfree.data.category.CategoryDataset categoryDataset20 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) (short) 0, (org.jfree.data.KeyedValues) pieDataset18);
        org.jfree.data.pie.PieDataset pieDataset24 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset18, (java.lang.Comparable) 'a', 0.0d, (int) (short) -1);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[][] {});
        org.junit.Assert.assertNotNull(categoryDataset11);
        org.junit.Assert.assertNotNull(categoryDataset12);
        org.junit.Assert.assertNotNull(categoryDataset13);
        org.junit.Assert.assertNotNull(categoryDataset14);
        org.junit.Assert.assertNull(range16);
        org.junit.Assert.assertNotNull(pieDataset18);
        org.junit.Assert.assertNotNull(categoryDataset19);
        org.junit.Assert.assertNotNull(categoryDataset20);
        org.junit.Assert.assertNotNull(pieDataset24);
    }

    @Test
    public void test3620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3620");
        java.lang.Number[] numberArray6 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray11 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray21 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray22 = new java.lang.Number[][] { numberArray6, numberArray11, numberArray16, numberArray21 };
        org.jfree.data.category.CategoryDataset categoryDataset23 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray22);
        org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset23);
        java.lang.Number number25 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset23);
        org.jfree.data.Range range26 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset23);
        org.jfree.data.Range range28 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset23, true);
        org.jfree.data.Range range29 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset23);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset31 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset23, (java.lang.Comparable) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray6);
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertNotNull(numberArray16);
        org.junit.Assert.assertNotNull(numberArray21);
        org.junit.Assert.assertNotNull(numberArray22);
        org.junit.Assert.assertNotNull(categoryDataset23);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertEquals("'" + number25 + "' != '" + 1.0d + "'", number25, 1.0d);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertNotNull(range29);
    }

    @Test
    public void test3621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3621");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset17, false);
        org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset17);
        org.jfree.data.Range range22 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset17, (double) (short) 10);
        org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, true);
        org.jfree.data.Range range26 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, true);
        org.jfree.data.Range range27 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset17);
        org.jfree.data.Range range28 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset17);
        java.lang.Number number29 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset17);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertNotNull(categoryDataset17);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertEquals("'" + number29 + "' != '" + 200.0d + "'", number29, 200.0d);
    }

    @Test
    public void test3622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3622");
        java.lang.Number[] numberArray10 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray15 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray20 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray25 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray26 = new java.lang.Number[][] { numberArray10, numberArray15, numberArray20, numberArray25 };
        org.jfree.data.category.CategoryDataset categoryDataset27 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray26);
        org.jfree.data.category.CategoryDataset categoryDataset28 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray26);
        org.jfree.data.category.CategoryDataset categoryDataset29 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray26);
        java.lang.Number number30 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset29);
        java.lang.Number number31 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset29);
        org.jfree.data.Range range32 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset29);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset34 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset29, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(numberArray15);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertNotNull(numberArray25);
        org.junit.Assert.assertNotNull(numberArray26);
        org.junit.Assert.assertNotNull(categoryDataset27);
        org.junit.Assert.assertNotNull(categoryDataset28);
        org.junit.Assert.assertNotNull(categoryDataset29);
        org.junit.Assert.assertEquals("'" + number30 + "' != '" + 400.0d + "'", number30, 400.0d);
        org.junit.Assert.assertEquals("'" + number31 + "' != '" + 0.0d + "'", number31, 0.0d);
        org.junit.Assert.assertNotNull(range32);
    }

    @Test
    public void test3623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3623");
        java.lang.Number[] numberArray6 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray11 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray21 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray22 = new java.lang.Number[][] { numberArray6, numberArray11, numberArray16, numberArray21 };
        org.jfree.data.category.CategoryDataset categoryDataset23 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray22);
        org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset23);
        org.jfree.data.Range range26 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset23, false);
        org.jfree.data.Range range28 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset23, true);
        org.jfree.data.Range range29 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset23);
        org.jfree.data.Range range31 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset23, 10.0d);
        boolean boolean32 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset23);
        org.jfree.data.Range range33 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset23);
        org.jfree.data.pie.PieDataset pieDataset35 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset23, (int) (byte) 0);
        org.jfree.data.Range range36 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset23);
        org.junit.Assert.assertNotNull(numberArray6);
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertNotNull(numberArray16);
        org.junit.Assert.assertNotNull(numberArray21);
        org.junit.Assert.assertNotNull(numberArray22);
        org.junit.Assert.assertNotNull(categoryDataset23);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertNotNull(range29);
        org.junit.Assert.assertNotNull(range31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(range33);
        org.junit.Assert.assertNotNull(pieDataset35);
        org.junit.Assert.assertNotNull(range36);
    }

    @Test
    public void test3624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3624");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, false);
        org.jfree.data.pie.PieDataset pieDataset21 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset17, (int) (short) 0);
        boolean boolean22 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset17);
        org.jfree.data.Range range23 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset17);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertNotNull(categoryDataset17);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertNotNull(pieDataset21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(range23);
    }

    @Test
    public void test3625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3625");
        java.lang.Number[] numberArray6 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray11 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray21 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray22 = new java.lang.Number[][] { numberArray6, numberArray11, numberArray16, numberArray21 };
        org.jfree.data.category.CategoryDataset categoryDataset23 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray22);
        org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset23);
        org.jfree.data.Range range26 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset23, true);
        java.lang.Number number27 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset23);
        org.jfree.data.Range range29 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset23, true);
        org.jfree.data.Range range31 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset23, true);
        org.jfree.data.pie.PieDataset pieDataset33 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset23, 0);
        org.jfree.data.Range range35 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset23, false);
        org.junit.Assert.assertNotNull(numberArray6);
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertNotNull(numberArray16);
        org.junit.Assert.assertNotNull(numberArray21);
        org.junit.Assert.assertNotNull(numberArray22);
        org.junit.Assert.assertNotNull(categoryDataset23);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertEquals("'" + number27 + "' != '" + 1.0d + "'", number27, 1.0d);
        org.junit.Assert.assertNotNull(range29);
        org.junit.Assert.assertNotNull(range31);
        org.junit.Assert.assertNotNull(pieDataset33);
        org.junit.Assert.assertNotNull(range35);
    }

    @Test
    public void test3626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3626");
        java.lang.Number[] numberArray6 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray11 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray21 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray22 = new java.lang.Number[][] { numberArray6, numberArray11, numberArray16, numberArray21 };
        org.jfree.data.category.CategoryDataset categoryDataset23 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray22);
        org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset23);
        org.jfree.data.Range range26 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset23, true);
        boolean boolean27 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset23);
        org.jfree.data.Range range28 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset23);
        org.jfree.data.Range range29 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset23);
        java.lang.Number number30 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset23);
        java.lang.Number number31 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(categoryDataset23);
        org.junit.Assert.assertNotNull(numberArray6);
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertNotNull(numberArray16);
        org.junit.Assert.assertNotNull(numberArray21);
        org.junit.Assert.assertNotNull(numberArray22);
        org.junit.Assert.assertNotNull(categoryDataset23);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertNotNull(range29);
        org.junit.Assert.assertEquals("'" + number30 + "' != '" + 0.0d + "'", number30, 0.0d);
        org.junit.Assert.assertEquals("'" + number31 + "' != '" + 100.0d + "'", number31, 100.0d);
    }

    @Test
    public void test3627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3627");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        java.lang.Number number18 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(categoryDataset17);
        java.lang.Number number19 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset17);
        org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset17);
        org.jfree.data.Range range21 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset17);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertNotNull(categoryDataset17);
        org.junit.Assert.assertEquals("'" + number18 + "' != '" + 100.0d + "'", number18, 100.0d);
        org.junit.Assert.assertEquals("'" + number19 + "' != '" + 200.0d + "'", number19, 200.0d);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(range21);
    }

    @Test
    public void test3628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3628");
        org.jfree.data.function.Function2D function2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries5 = org.jfree.data.general.DatasetUtilities.sampleFunction2DToSeries(function2D0, 0.0d, 20.0d, (int) ' ', (java.lang.Comparable) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3629");
        java.lang.Number[] numberArray8 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray18 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray23 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray24 = new java.lang.Number[][] { numberArray8, numberArray13, numberArray18, numberArray23 };
        org.jfree.data.category.CategoryDataset categoryDataset25 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray24);
        org.jfree.data.category.CategoryDataset categoryDataset26 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray24);
        org.jfree.data.Range range28 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset26, (double) (-1.0f));
        org.jfree.data.Range range30 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset26, (double) (byte) 10);
        org.jfree.data.Range range31 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset26);
        java.lang.Number number32 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset26);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray13);
        org.junit.Assert.assertNotNull(numberArray18);
        org.junit.Assert.assertNotNull(numberArray23);
        org.junit.Assert.assertNotNull(numberArray24);
        org.junit.Assert.assertNotNull(categoryDataset25);
        org.junit.Assert.assertNotNull(categoryDataset26);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertNotNull(range30);
        org.junit.Assert.assertNotNull(range31);
        org.junit.Assert.assertEquals("'" + number32 + "' != '" + 1.0d + "'", number32, 1.0d);
    }

    @Test
    public void test3630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3630");
        java.lang.Number[] numberArray6 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray11 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray21 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray22 = new java.lang.Number[][] { numberArray6, numberArray11, numberArray16, numberArray21 };
        org.jfree.data.category.CategoryDataset categoryDataset23 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray22);
        org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset23);
        org.jfree.data.Range range26 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset23, true);
        org.jfree.data.Range range27 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset23);
        org.jfree.data.Range range28 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset23);
        org.jfree.data.Range range29 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset23);
        org.jfree.data.pie.PieDataset pieDataset31 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset23, (int) (byte) 1);
        double double32 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset31);
        boolean boolean33 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset31);
        org.junit.Assert.assertNotNull(numberArray6);
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertNotNull(numberArray16);
        org.junit.Assert.assertNotNull(numberArray21);
        org.junit.Assert.assertNotNull(numberArray22);
        org.junit.Assert.assertNotNull(categoryDataset23);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertNotNull(range29);
        org.junit.Assert.assertNotNull(pieDataset31);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 4.0d + "'", double32 == 4.0d);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test3631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3631");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset17, false);
        org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset17);
        org.jfree.data.Range range22 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset17, (double) (short) 10);
        org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset17, (double) (byte) 1);
        org.jfree.data.Range range25 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset17);
        java.lang.Number number26 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset17);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertNotNull(categoryDataset17);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertEquals("'" + number26 + "' != '" + 0.0d + "'", number26, 0.0d);
    }

    @Test
    public void test3632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3632");
        java.lang.Number[] numberArray10 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray15 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray20 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray25 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray26 = new java.lang.Number[][] { numberArray10, numberArray15, numberArray20, numberArray25 };
        org.jfree.data.category.CategoryDataset categoryDataset27 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray26);
        org.jfree.data.category.CategoryDataset categoryDataset28 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray26);
        org.jfree.data.category.CategoryDataset categoryDataset29 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray26);
        java.lang.Number number30 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(categoryDataset29);
        java.lang.Number number31 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset29);
        java.lang.Number number32 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset29);
        org.jfree.data.Range range33 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset29);
        org.jfree.data.Range range34 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset29);
        org.jfree.data.Range range36 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset29, true);
        java.util.List list37 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range39 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(categoryDataset29, list37, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'visibleSeriesKeys' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(numberArray15);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertNotNull(numberArray25);
        org.junit.Assert.assertNotNull(numberArray26);
        org.junit.Assert.assertNotNull(categoryDataset27);
        org.junit.Assert.assertNotNull(categoryDataset28);
        org.junit.Assert.assertNotNull(categoryDataset29);
        org.junit.Assert.assertEquals("'" + number30 + "' != '" + 100.0d + "'", number30, 100.0d);
        org.junit.Assert.assertEquals("'" + number31 + "' != '" + 400.0d + "'", number31, 400.0d);
        org.junit.Assert.assertEquals("'" + number32 + "' != '" + 0.0d + "'", number32, 0.0d);
        org.junit.Assert.assertNotNull(range33);
        org.junit.Assert.assertNotNull(range34);
        org.junit.Assert.assertNotNull(range36);
    }

    @Test
    public void test3633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3633");
        java.lang.Number[] numberArray6 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray11 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray21 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray22 = new java.lang.Number[][] { numberArray6, numberArray11, numberArray16, numberArray21 };
        org.jfree.data.category.CategoryDataset categoryDataset23 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray22);
        org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset23);
        org.jfree.data.Range range26 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset23, true);
        org.jfree.data.Range range28 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset23, false);
        org.jfree.data.Range range29 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset23);
        java.lang.Number number30 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset23);
        org.jfree.data.Range range31 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset23);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset33 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset23, (java.lang.Comparable) 112.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray6);
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertNotNull(numberArray16);
        org.junit.Assert.assertNotNull(numberArray21);
        org.junit.Assert.assertNotNull(numberArray22);
        org.junit.Assert.assertNotNull(categoryDataset23);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertNotNull(range29);
        org.junit.Assert.assertEquals("'" + number30 + "' != '" + 0.0d + "'", number30, 0.0d);
        org.junit.Assert.assertNotNull(range31);
    }

    @Test
    public void test3634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3634");
        double[] doubleArray9 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray16 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray17 = new double[][] { doubleArray9, doubleArray16 };
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray17);
        org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset18, false);
        org.jfree.data.pie.PieDataset pieDataset22 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset18, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset25 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset22, (java.lang.Comparable) 100L, (double) 1);
        double double26 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset22);
        org.jfree.data.category.CategoryDataset categoryDataset27 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 10L, (org.jfree.data.KeyedValues) pieDataset22);
        java.lang.Number number28 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset27);
        org.jfree.data.Range range30 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset27, true);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertNotNull(categoryDataset18);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(pieDataset22);
        org.junit.Assert.assertNotNull(pieDataset25);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 130.0d + "'", double26 == 130.0d);
        org.junit.Assert.assertNotNull(categoryDataset27);
        org.junit.Assert.assertEquals("'" + number28 + "' != '" + 100.0d + "'", number28, 100.0d);
        org.junit.Assert.assertNotNull(range30);
    }

    @Test
    public void test3635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3635");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, false);
        org.jfree.data.pie.PieDataset pieDataset21 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset17, (int) (short) 0);
        org.jfree.data.Range range23 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset17, false);
        java.lang.Number number24 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset17);
        org.jfree.data.Range range26 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset17, false);
        org.jfree.data.Range range28 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset17, true);
        org.jfree.data.Range range29 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset17);
        java.lang.Number number30 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(categoryDataset17);
        org.jfree.data.Range range32 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset17, true);
        java.util.List list33 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range35 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(categoryDataset17, list33, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'visibleSeriesKeys' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertNotNull(categoryDataset17);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertNotNull(pieDataset21);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertEquals("'" + number24 + "' != '" + 200.0d + "'", number24, 200.0d);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertNotNull(range29);
        org.junit.Assert.assertEquals("'" + number30 + "' != '" + 100.0d + "'", number30, 100.0d);
        org.junit.Assert.assertNotNull(range32);
    }

    @Test
    public void test3636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3636");
        java.lang.Number[] numberArray6 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray11 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray21 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray22 = new java.lang.Number[][] { numberArray6, numberArray11, numberArray16, numberArray21 };
        org.jfree.data.category.CategoryDataset categoryDataset23 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray22);
        java.lang.Number number24 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(categoryDataset23);
        org.jfree.data.Range range26 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset23, true);
        boolean boolean27 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset23);
        java.lang.Number number28 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset23);
        org.jfree.data.pie.PieDataset pieDataset30 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset23, 0);
        org.jfree.data.pie.PieDataset pieDataset34 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset30, (java.lang.Comparable) 1L, (double) 1, (int) (short) -1);
        java.lang.Comparable comparable35 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset38 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset34, comparable35, (double) (short) 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray6);
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertNotNull(numberArray16);
        org.junit.Assert.assertNotNull(numberArray21);
        org.junit.Assert.assertNotNull(numberArray22);
        org.junit.Assert.assertNotNull(categoryDataset23);
        org.junit.Assert.assertEquals("'" + number24 + "' != '" + 100.0d + "'", number24, 100.0d);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + number28 + "' != '" + 400.0d + "'", number28, 400.0d);
        org.junit.Assert.assertNotNull(pieDataset30);
        org.junit.Assert.assertNotNull(pieDataset34);
    }

    @Test
    public void test3637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3637");
        double[] doubleArray9 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray16 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray17 = new double[][] { doubleArray9, doubleArray16 };
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray17);
        org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset18, false);
        org.jfree.data.pie.PieDataset pieDataset22 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset18, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset25 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset22, (java.lang.Comparable) 100L, (double) 1);
        boolean boolean26 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset22);
        boolean boolean27 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset22);
        org.jfree.data.category.CategoryDataset categoryDataset28 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) (-1.0d), (org.jfree.data.KeyedValues) pieDataset22);
        org.jfree.data.Range range30 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset28, true);
        java.lang.Number number31 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset28);
        org.jfree.data.Range range32 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset28);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertNotNull(categoryDataset18);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(pieDataset22);
        org.junit.Assert.assertNotNull(pieDataset25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(categoryDataset28);
        org.junit.Assert.assertNotNull(range30);
        org.junit.Assert.assertEquals("'" + number31 + "' != '" + 0.0d + "'", number31, 0.0d);
        org.junit.Assert.assertNotNull(range32);
    }

    @Test
    public void test3638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3638");
        double[] doubleArray9 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray16 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray17 = new double[][] { doubleArray9, doubleArray16 };
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray17);
        org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset18, false);
        org.jfree.data.pie.PieDataset pieDataset22 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset18, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset25 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset22, (java.lang.Comparable) 100L, (double) 1);
        boolean boolean26 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset22);
        boolean boolean27 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset22);
        org.jfree.data.category.CategoryDataset categoryDataset28 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 10L, (org.jfree.data.KeyedValues) pieDataset22);
        org.jfree.data.Range range29 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset28);
        org.jfree.data.Range range30 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset28);
        org.jfree.data.Range range32 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset28, false);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertNotNull(categoryDataset18);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(pieDataset22);
        org.junit.Assert.assertNotNull(pieDataset25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(categoryDataset28);
        org.junit.Assert.assertNotNull(range29);
        org.junit.Assert.assertNotNull(range30);
        org.junit.Assert.assertNotNull(range32);
    }

    @Test
    public void test3639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3639");
        java.lang.Number[] numberArray6 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray11 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray21 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray22 = new java.lang.Number[][] { numberArray6, numberArray11, numberArray16, numberArray21 };
        org.jfree.data.category.CategoryDataset categoryDataset23 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray22);
        java.lang.Number number24 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(categoryDataset23);
        java.lang.Number number25 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset23);
        org.jfree.data.Range range27 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset23, true);
        org.jfree.data.Range range28 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset23);
        org.jfree.data.Range range30 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset23, true);
        org.junit.Assert.assertNotNull(numberArray6);
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertNotNull(numberArray16);
        org.junit.Assert.assertNotNull(numberArray21);
        org.junit.Assert.assertNotNull(numberArray22);
        org.junit.Assert.assertNotNull(categoryDataset23);
        org.junit.Assert.assertEquals("'" + number24 + "' != '" + 100.0d + "'", number24, 100.0d);
        org.junit.Assert.assertEquals("'" + number25 + "' != '" + 0.0d + "'", number25, 0.0d);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertNotNull(range30);
    }

    @Test
    public void test3640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3640");
        java.lang.Number[] numberArray6 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray11 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray21 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray22 = new java.lang.Number[][] { numberArray6, numberArray11, numberArray16, numberArray21 };
        org.jfree.data.category.CategoryDataset categoryDataset23 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray22);
        org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset23);
        org.jfree.data.Range range26 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset23, true);
        java.lang.Number number27 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset23);
        org.jfree.data.Range range29 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset23, true);
        org.jfree.data.Range range31 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset23, true);
        org.jfree.data.Range range33 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset23, true);
        java.lang.Number number34 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset23);
        org.jfree.data.Range range36 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset23, false);
        org.jfree.data.Range range38 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset23, true);
        org.jfree.data.Range range39 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset23);
        org.jfree.data.pie.PieDataset pieDataset41 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset23, 0);
        org.jfree.data.Range range42 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset23);
        org.jfree.data.Range range43 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset23);
        org.junit.Assert.assertNotNull(numberArray6);
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertNotNull(numberArray16);
        org.junit.Assert.assertNotNull(numberArray21);
        org.junit.Assert.assertNotNull(numberArray22);
        org.junit.Assert.assertNotNull(categoryDataset23);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertEquals("'" + number27 + "' != '" + 1.0d + "'", number27, 1.0d);
        org.junit.Assert.assertNotNull(range29);
        org.junit.Assert.assertNotNull(range31);
        org.junit.Assert.assertNotNull(range33);
        org.junit.Assert.assertEquals("'" + number34 + "' != '" + 1.0d + "'", number34, 1.0d);
        org.junit.Assert.assertNotNull(range36);
        org.junit.Assert.assertNotNull(range38);
        org.junit.Assert.assertNotNull(range39);
        org.junit.Assert.assertNotNull(pieDataset41);
        org.junit.Assert.assertNotNull(range42);
        org.junit.Assert.assertNotNull(range43);
    }

    @Test
    public void test3641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3641");
        double[] doubleArray3 = new double[] {};
        double[][] doubleArray4 = new double[][] { doubleArray3 };
        org.jfree.data.category.CategoryDataset categoryDataset5 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray4);
        org.jfree.data.pie.PieDataset pieDataset7 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset5, (java.lang.Comparable) (-1.0f));
        org.jfree.data.pie.PieDataset pieDataset10 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset7, (java.lang.Comparable) 100, 0.0d);
        org.jfree.data.pie.PieDataset pieDataset13 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset10, (java.lang.Comparable) (byte) -1, (double) 1);
        double double14 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset10);
        org.jfree.data.category.CategoryDataset categoryDataset15 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 10L, (org.jfree.data.KeyedValues) pieDataset10);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertNotNull(categoryDataset5);
        org.junit.Assert.assertNotNull(pieDataset7);
        org.junit.Assert.assertNotNull(pieDataset10);
        org.junit.Assert.assertNotNull(pieDataset13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(categoryDataset15);
    }

    @Test
    public void test3642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3642");
        org.jfree.data.function.Function2D function2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries5 = org.jfree.data.general.DatasetUtilities.sampleFunction2DToSeries(function2D0, (double) '4', (double) 10, (int) (byte) 100, (java.lang.Comparable) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3643");
        double[] doubleArray10 = new double[] {};
        double[][] doubleArray11 = new double[][] { doubleArray10 };
        org.jfree.data.category.CategoryDataset categoryDataset12 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray11);
        org.jfree.data.category.CategoryDataset categoryDataset13 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray11);
        org.jfree.data.category.CategoryDataset categoryDataset14 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray11);
        org.jfree.data.category.CategoryDataset categoryDataset15 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray11);
        org.jfree.data.category.CategoryDataset categoryDataset16 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray11);
        java.lang.Number number17 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset16);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertNotNull(categoryDataset12);
        org.junit.Assert.assertNotNull(categoryDataset13);
        org.junit.Assert.assertNotNull(categoryDataset14);
        org.junit.Assert.assertNotNull(categoryDataset15);
        org.junit.Assert.assertNotNull(categoryDataset16);
        org.junit.Assert.assertNull(number17);
    }

    @Test
    public void test3644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3644");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, false);
        org.jfree.data.pie.PieDataset pieDataset21 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset17, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset24 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset21, (java.lang.Comparable) 100L, (double) 1);
        org.jfree.data.pie.PieDataset pieDataset27 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset21, (java.lang.Comparable) (short) 1, 130.0d);
        boolean boolean28 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset27);
        org.jfree.data.pie.PieDataset pieDataset31 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset27, (java.lang.Comparable) "hi!", 4.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertNotNull(categoryDataset17);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertNotNull(pieDataset21);
        org.junit.Assert.assertNotNull(pieDataset24);
        org.junit.Assert.assertNotNull(pieDataset27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(pieDataset31);
    }

    @Test
    public void test3645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3645");
        double[] doubleArray8 = new double[] {};
        double[][] doubleArray9 = new double[][] { doubleArray8 };
        org.jfree.data.category.CategoryDataset categoryDataset10 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray9);
        org.jfree.data.category.CategoryDataset categoryDataset11 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray9);
        org.jfree.data.category.CategoryDataset categoryDataset12 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray9);
        org.jfree.data.category.CategoryDataset categoryDataset13 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray9);
        org.jfree.data.Range range15 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset13, (double) (short) 10);
        org.jfree.data.Range range16 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset13);
        java.lang.Number number17 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(categoryDataset13);
        boolean boolean18 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset13);
        boolean boolean19 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset13);
        org.jfree.data.KeyToGroupMap keyToGroupMap20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range21 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset13, keyToGroupMap20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertNotNull(categoryDataset10);
        org.junit.Assert.assertNotNull(categoryDataset11);
        org.junit.Assert.assertNotNull(categoryDataset12);
        org.junit.Assert.assertNotNull(categoryDataset13);
        org.junit.Assert.assertNull(range15);
        org.junit.Assert.assertNull(range16);
        org.junit.Assert.assertNull(number17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test3646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3646");
        java.lang.Number[] numberArray10 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray15 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray20 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray25 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray26 = new java.lang.Number[][] { numberArray10, numberArray15, numberArray20, numberArray25 };
        org.jfree.data.category.CategoryDataset categoryDataset27 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray26);
        org.jfree.data.category.CategoryDataset categoryDataset28 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray26);
        org.jfree.data.category.CategoryDataset categoryDataset29 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray26);
        java.lang.Number number30 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset29);
        java.lang.Number number31 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset29);
        org.jfree.data.Range range33 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset29, false);
        org.jfree.data.Range range34 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset29);
        java.lang.Number number35 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset29);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(numberArray15);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertNotNull(numberArray25);
        org.junit.Assert.assertNotNull(numberArray26);
        org.junit.Assert.assertNotNull(categoryDataset27);
        org.junit.Assert.assertNotNull(categoryDataset28);
        org.junit.Assert.assertNotNull(categoryDataset29);
        org.junit.Assert.assertEquals("'" + number30 + "' != '" + 400.0d + "'", number30, 400.0d);
        org.junit.Assert.assertEquals("'" + number31 + "' != '" + 0.0d + "'", number31, 0.0d);
        org.junit.Assert.assertNotNull(range33);
        org.junit.Assert.assertNotNull(range34);
        org.junit.Assert.assertEquals("'" + number35 + "' != '" + 0.0d + "'", number35, 0.0d);
    }

    @Test
    public void test3647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3647");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, false);
        org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset17);
        org.jfree.data.Range range21 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset17);
        org.jfree.data.Range range23 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset17, false);
        java.lang.Number number24 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset17);
        java.lang.Number number25 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset17);
        org.jfree.data.Range range26 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset17);
        boolean boolean27 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset17);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertNotNull(categoryDataset17);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertEquals("'" + number24 + "' != '" + 0.0d + "'", number24, 0.0d);
        org.junit.Assert.assertEquals("'" + number25 + "' != '" + 0.0d + "'", number25, 0.0d);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test3648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3648");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        java.lang.Number number18 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset17);
        boolean boolean19 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset17);
        boolean boolean20 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset17);
        java.lang.Number number21 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(categoryDataset17);
        org.jfree.data.Range range23 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset17, false);
        java.lang.Number number24 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset17);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertNotNull(categoryDataset17);
        org.junit.Assert.assertEquals("'" + number18 + "' != '" + 0.0d + "'", number18, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + number21 + "' != '" + 100.0d + "'", number21, 100.0d);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertEquals("'" + number24 + "' != '" + 0.0d + "'", number24, 0.0d);
    }

    @Test
    public void test3649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3649");
        org.jfree.data.function.Function2D function2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries5 = org.jfree.data.general.DatasetUtilities.sampleFunction2DToSeries(function2D0, 10.0d, 0.0d, 0, (java.lang.Comparable) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3650");
        double[] doubleArray10 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray17 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray18 = new double[][] { doubleArray10, doubleArray17 };
        org.jfree.data.category.CategoryDataset categoryDataset19 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray18);
        org.jfree.data.Range range21 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset19, false);
        org.jfree.data.pie.PieDataset pieDataset23 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset19, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset26 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset23, (java.lang.Comparable) 100L, (double) 1);
        org.jfree.data.pie.PieDataset pieDataset29 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset23, (java.lang.Comparable) (short) 1, 130.0d);
        org.jfree.data.category.CategoryDataset categoryDataset30 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) (-1L), (org.jfree.data.KeyedValues) pieDataset23);
        double double31 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset23);
        boolean boolean32 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset23);
        org.jfree.data.category.CategoryDataset categoryDataset33 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) "", (org.jfree.data.KeyedValues) pieDataset23);
        org.jfree.data.Range range34 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset33);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset36 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset33, (java.lang.Comparable) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(categoryDataset19);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertNotNull(pieDataset23);
        org.junit.Assert.assertNotNull(pieDataset26);
        org.junit.Assert.assertNotNull(pieDataset29);
        org.junit.Assert.assertNotNull(categoryDataset30);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 130.0d + "'", double31 == 130.0d);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(categoryDataset33);
        org.junit.Assert.assertNotNull(range34);
    }

    @Test
    public void test3651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3651");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        java.lang.Number[] numberArray8 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray18 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray23 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray24 = new java.lang.Number[][] { numberArray8, numberArray13, numberArray18, numberArray23 };
        org.jfree.data.category.CategoryDataset categoryDataset25 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray24);
        org.jfree.data.Range range27 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset25, true);
        org.jfree.data.Range range29 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset25, false);
        org.jfree.data.Range range31 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset25, true);
        java.lang.Number number32 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset25);
        java.lang.Number number33 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(categoryDataset25);
        java.lang.Number number34 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset25);
        org.jfree.data.Range range35 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset25);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range37 = org.jfree.data.general.DatasetUtilities.findRangeBounds(xYDataset0, list1, range35, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray13);
        org.junit.Assert.assertNotNull(numberArray18);
        org.junit.Assert.assertNotNull(numberArray23);
        org.junit.Assert.assertNotNull(numberArray24);
        org.junit.Assert.assertNotNull(categoryDataset25);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertNotNull(range29);
        org.junit.Assert.assertNotNull(range31);
        org.junit.Assert.assertEquals("'" + number32 + "' != '" + 0.0d + "'", number32, 0.0d);
        org.junit.Assert.assertEquals("'" + number33 + "' != '" + 100.0d + "'", number33, 100.0d);
        org.junit.Assert.assertEquals("'" + number34 + "' != '" + 1.0d + "'", number34, 1.0d);
        org.junit.Assert.assertNotNull(range35);
    }
}

