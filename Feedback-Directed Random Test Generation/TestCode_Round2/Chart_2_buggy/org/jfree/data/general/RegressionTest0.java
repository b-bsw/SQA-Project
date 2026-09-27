package org.jfree.data.general;

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
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        org.jfree.data.Range range2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range4 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(xYDataset0, list1, range2, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range1 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset0, (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range1 = org.jfree.data.general.DatasetUtilities.iterateXYRangeBounds(xYDataset0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range3 = org.jfree.data.general.DatasetUtilities.findDomainBounds(xYDataset0, list1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset2 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset0, (java.lang.Comparable) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(categoryDataset0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(xYDataset0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds(xYDataset0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range1 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(xYDataset0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range1 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.jfree.data.general.DatasetUtilities.findMinimumDomainValue(xYDataset0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        org.jfree.data.pie.PieDataset pieDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset4 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset0, (java.lang.Comparable) (-1.0d), (double) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset2 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset0, (java.lang.Comparable) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        org.jfree.data.xy.TableXYDataset tableXYDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.jfree.data.general.DatasetUtilities.calculateStackTotal(tableXYDataset0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        java.util.List list1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range3 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(categoryDataset0, list1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.findDomainBounds(xYDataset0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        boolean boolean1 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(xYDataset0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range1 = org.jfree.data.general.DatasetUtilities.findDomainBounds(xYDataset0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.jfree.data.pie.PieDataset pieDataset0 = null;
        boolean boolean1 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.jfree.data.general.DatasetUtilities.findMaximumDomainValue(xYDataset0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(xYDataset0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range1 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(xYDataset0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset21 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset17, (java.lang.Comparable) (-1.0f));
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
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        org.jfree.data.xy.TableXYDataset tableXYDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range1 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(tableXYDataset0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, false);
        java.util.List list20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range22 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset17, list20, false);
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
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset2 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset0, (java.lang.Comparable) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        org.jfree.data.function.Function2D function2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries5 = org.jfree.data.general.DatasetUtilities.sampleFunction2DToSeries(function2D0, (double) '4', (double) 1, (int) (byte) 0, (java.lang.Comparable) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.findRangeBounds(xYDataset0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        org.jfree.data.function.Function2D function2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataset xYDataset5 = org.jfree.data.general.DatasetUtilities.sampleFunction2D(function2D0, (-1.0d), 0.0d, 1, (java.lang.Comparable) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        java.lang.Number[] numberArray6 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray11 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray21 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray22 = new java.lang.Number[][] { numberArray6, numberArray11, numberArray16, numberArray21 };
        org.jfree.data.category.CategoryDataset categoryDataset23 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray22);
        org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset23);
        org.jfree.data.KeyToGroupMap keyToGroupMap25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range26 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset23, keyToGroupMap25);
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
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, false);
        org.jfree.data.pie.PieDataset pieDataset21 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset17, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset23 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset17, (java.lang.Comparable) 100.0d);
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
        org.junit.Assert.assertNotNull(pieDataset21);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        double[] doubleArray10 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray17 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray18 = new double[][] { doubleArray10, doubleArray17 };
        org.jfree.data.category.CategoryDataset categoryDataset19 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray18);
        org.jfree.data.Range range21 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset19, false);
        org.jfree.data.pie.PieDataset pieDataset23 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset19, (int) (short) 0);
        org.jfree.data.Range range25 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset19, false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range27 = org.jfree.data.general.DatasetUtilities.findRangeBounds(xYDataset0, list1, range25, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(range25);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        org.jfree.data.function.Function2D function2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries5 = org.jfree.data.general.DatasetUtilities.sampleFunction2DToSeries(function2D0, (double) '#', (double) 1, (int) (byte) 1, (java.lang.Comparable) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range1 = org.jfree.data.general.DatasetUtilities.findRangeBounds(xYDataset0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        java.lang.Number[] numberArray6 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray11 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray21 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray22 = new java.lang.Number[][] { numberArray6, numberArray11, numberArray16, numberArray21 };
        org.jfree.data.category.CategoryDataset categoryDataset23 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray22);
        java.util.List list24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range26 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(categoryDataset23, list24, false);
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
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        org.jfree.data.xy.TableXYDataset tableXYDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(tableXYDataset0, (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        java.lang.Number[] numberArray8 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray18 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray23 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray24 = new java.lang.Number[][] { numberArray8, numberArray13, numberArray18, numberArray23 };
        org.jfree.data.category.CategoryDataset categoryDataset25 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray24);
        org.jfree.data.Range range27 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset25, false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range29 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(xYDataset0, list1, range27, true);
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
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, false);
        org.jfree.data.pie.PieDataset pieDataset21 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset17, (int) (short) 0);
        java.lang.Comparable comparable22 = null;
        org.jfree.data.pie.PieDataset pieDataset25 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset21, comparable22, (double) 10L, (int) (byte) 100);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertNotNull(categoryDataset17);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertNotNull(pieDataset21);
        org.junit.Assert.assertNotNull(pieDataset25);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        org.jfree.data.function.Function2D function2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataset xYDataset5 = org.jfree.data.general.DatasetUtilities.sampleFunction2D(function2D0, (double) (-1L), (double) 10L, (int) (short) 0, (java.lang.Comparable) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range3 = org.jfree.data.general.DatasetUtilities.iterateToFindDomainBounds(xYDataset0, list1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.findDomainBounds(xYDataset0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(xYDataset0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, false);
        org.jfree.data.pie.PieDataset pieDataset21 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset17, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset24 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset21, (java.lang.Comparable) 10L, (double) (-1L));
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertNotNull(categoryDataset17);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertNotNull(pieDataset21);
        org.junit.Assert.assertNotNull(pieDataset24);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        java.lang.Comparable[] comparableArray6 = new java.lang.Comparable[] { (byte) -1, 0.0d, 200.0d, '#', (-1), '4' };
        java.lang.Comparable[] comparableArray11 = new java.lang.Comparable[] { (short) 10, 1, (byte) 100, (short) 1 };
        double[] doubleArray16 = new double[] {};
        double[][] doubleArray17 = new double[][] { doubleArray16 };
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray17);
        org.jfree.data.category.CategoryDataset categoryDataset19 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray17);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.category.CategoryDataset categoryDataset20 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray6, comparableArray11, doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The number of row keys does not match the number of rows in the data array.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparableArray6);
        org.junit.Assert.assertNotNull(comparableArray11);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertNotNull(categoryDataset18);
        org.junit.Assert.assertNotNull(categoryDataset19);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        double[] doubleArray10 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray17 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray18 = new double[][] { doubleArray10, doubleArray17 };
        org.jfree.data.category.CategoryDataset categoryDataset19 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray18);
        org.jfree.data.Range range21 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset19, false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range23 = org.jfree.data.general.DatasetUtilities.findRangeBounds(xYDataset0, list1, range21, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(categoryDataset19);
        org.junit.Assert.assertNotNull(range21);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, false);
        org.jfree.data.pie.PieDataset pieDataset21 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset17, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset23 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset17, (java.lang.Comparable) 1);
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
        org.junit.Assert.assertNotNull(pieDataset21);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.findRangeBounds(xYDataset0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range3 = org.jfree.data.general.DatasetUtilities.findDomainBounds(xYDataset0, list1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, false);
        org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset17);
        org.jfree.data.KeyToGroupMap keyToGroupMap21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range22 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset17, keyToGroupMap21);
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
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        org.jfree.data.function.Function2D function2D0 = null;
        java.lang.Comparable comparable4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries5 = org.jfree.data.general.DatasetUtilities.sampleFunction2DToSeries(function2D0, (double) 1.0f, (double) 1, (int) (byte) 1, comparable4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        java.lang.Number[] numberArray10 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray15 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray20 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray25 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray26 = new java.lang.Number[][] { numberArray10, numberArray15, numberArray20, numberArray25 };
        org.jfree.data.category.CategoryDataset categoryDataset27 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray26);
        org.jfree.data.category.CategoryDataset categoryDataset28 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray26);
        org.jfree.data.category.CategoryDataset categoryDataset29 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray26);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset31 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset29, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 4");
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
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        java.lang.Comparable[] comparableArray1 = new java.lang.Comparable[] { 10 };
        java.lang.Comparable[] comparableArray6 = new java.lang.Comparable[] { 200.0d, 100L, (-1), 100L };
        double[] doubleArray8 = new double[] { 10.0d };
        double[] doubleArray10 = new double[] { 10.0d };
        double[][] doubleArray11 = new double[][] { doubleArray8, doubleArray10 };
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.category.CategoryDataset categoryDataset12 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray1, comparableArray6, doubleArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Duplicate items in 'columnKeys'.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparableArray1);
        org.junit.Assert.assertNotNull(comparableArray6);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        org.jfree.data.function.Function2D function2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries5 = org.jfree.data.general.DatasetUtilities.sampleFunction2DToSeries(function2D0, (double) (-1.0f), (double) '4', (int) ' ', (java.lang.Comparable) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds(xYDataset0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        org.jfree.data.function.Function2D function2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries5 = org.jfree.data.general.DatasetUtilities.sampleFunction2DToSeries(function2D0, (double) 10.0f, (double) 10, (int) (short) 100, (java.lang.Comparable) true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset19 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset17, (int) (byte) -1);
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
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        java.lang.Comparable[] comparableArray0 = new java.lang.Comparable[] {};
        java.lang.Comparable[] comparableArray4 = new java.lang.Comparable[] { true, "", 1L };
        double[] doubleArray9 = new double[] {};
        double[][] doubleArray10 = new double[][] { doubleArray9 };
        org.jfree.data.category.CategoryDataset categoryDataset11 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray10);
        org.jfree.data.category.CategoryDataset categoryDataset12 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray10);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.category.CategoryDataset categoryDataset13 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray0, comparableArray4, doubleArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The number of row keys does not match the number of rows in the data array.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparableArray0);
        org.junit.Assert.assertArrayEquals(comparableArray0, new java.lang.Comparable[] {});
        org.junit.Assert.assertNotNull(comparableArray4);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertNotNull(categoryDataset11);
        org.junit.Assert.assertNotNull(categoryDataset12);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        double[] doubleArray10 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray17 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray18 = new double[][] { doubleArray10, doubleArray17 };
        org.jfree.data.category.CategoryDataset categoryDataset19 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray18);
        org.jfree.data.Range range21 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset19, false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range23 = org.jfree.data.general.DatasetUtilities.findRangeBounds(xYDataset0, list1, range21, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(categoryDataset19);
        org.junit.Assert.assertNotNull(range21);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        org.jfree.data.xy.TableXYDataset tableXYDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(tableXYDataset0, (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        org.jfree.data.xy.TableXYDataset tableXYDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(tableXYDataset0, (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        org.jfree.data.function.Function2D function2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries5 = org.jfree.data.general.DatasetUtilities.sampleFunction2DToSeries(function2D0, (double) 0.0f, (double) '4', 10, (java.lang.Comparable) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        org.jfree.data.xy.TableXYDataset tableXYDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.jfree.data.general.DatasetUtilities.calculateStackTotal(tableXYDataset0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        double[] doubleArray10 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray17 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray18 = new double[][] { doubleArray10, doubleArray17 };
        org.jfree.data.category.CategoryDataset categoryDataset19 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray18);
        org.jfree.data.Range range21 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset19, false);
        org.jfree.data.Range range22 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset19);
        org.jfree.data.Range range23 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset19);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range25 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(xYDataset0, list1, range23, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(categoryDataset19);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertNotNull(range23);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, false);
        org.jfree.data.pie.PieDataset pieDataset21 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset17, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset24 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset21, (java.lang.Comparable) 100L, (double) 1);
        org.jfree.data.pie.PieDataset pieDataset27 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset21, (java.lang.Comparable) (short) 1, 130.0d);
        org.jfree.data.pie.PieDataset pieDataset31 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset27, (java.lang.Comparable) 100.0f, (double) (-1), (int) ' ');
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
        org.junit.Assert.assertNotNull(pieDataset31);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        double[] doubleArray9 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray16 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray17 = new double[][] { doubleArray9, doubleArray16 };
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray17);
        org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset18, false);
        org.jfree.data.pie.PieDataset pieDataset22 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset18, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset25 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset22, (java.lang.Comparable) 100L, (double) 1);
        org.jfree.data.category.CategoryDataset categoryDataset26 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) (-1L), (org.jfree.data.KeyedValues) pieDataset25);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset28 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset26, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 1");
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
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        double[] doubleArray10 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray17 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray18 = new double[][] { doubleArray10, doubleArray17 };
        org.jfree.data.category.CategoryDataset categoryDataset19 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray18);
        org.jfree.data.Range range21 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset19, false);
        org.jfree.data.Range range22 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset19);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(xYDataset0, list1, range22, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(categoryDataset19);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertNotNull(range22);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        java.lang.Number[] numberArray6 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray11 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray21 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray22 = new java.lang.Number[][] { numberArray6, numberArray11, numberArray16, numberArray21 };
        org.jfree.data.category.CategoryDataset categoryDataset23 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray22);
        org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset23);
        org.jfree.data.Range range26 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset23, false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset28 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset23, (java.lang.Comparable) 0.0f);
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
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, false);
        org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset17);
        java.lang.Class<?> wildcardClass21 = categoryDataset17.getClass();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertNotNull(categoryDataset17);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        org.jfree.data.function.Function2D function2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries5 = org.jfree.data.general.DatasetUtilities.sampleFunction2DToSeries(function2D0, (double) '4', (double) 1, (int) (short) 0, (java.lang.Comparable) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, false);
        org.jfree.data.pie.PieDataset pieDataset21 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset17, (int) (short) 0);
        java.util.List list22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset17, list22, false);
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
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        java.lang.Number[] numberArray10 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray15 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray20 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray25 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray26 = new java.lang.Number[][] { numberArray10, numberArray15, numberArray20, numberArray25 };
        org.jfree.data.category.CategoryDataset categoryDataset27 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray26);
        org.jfree.data.category.CategoryDataset categoryDataset28 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray26);
        org.jfree.data.category.CategoryDataset categoryDataset29 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray26);
        java.lang.Number number30 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset29);
        java.util.List list31 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range33 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(categoryDataset29, list31, true);
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
        org.junit.Assert.assertEquals("'" + number30 + "' != '" + 0.0d + "'", number30, 0.0d);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        org.jfree.data.function.Function2D function2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataset xYDataset5 = org.jfree.data.general.DatasetUtilities.sampleFunction2D(function2D0, (double) ' ', (double) 0, 0, (java.lang.Comparable) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset17, false);
        java.util.List list20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range22 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset17, list20, true);
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
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.jfree.data.function.Function2D function2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries5 = org.jfree.data.general.DatasetUtilities.sampleFunction2DToSeries(function2D0, (double) (byte) -1, (double) 1.0f, (int) (short) 10, (java.lang.Comparable) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        double[] doubleArray9 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray16 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray17 = new double[][] { doubleArray9, doubleArray16 };
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray17);
        org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset18, false);
        org.jfree.data.pie.PieDataset pieDataset22 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset18, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset25 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset22, (java.lang.Comparable) 100L, (double) 1);
        double double26 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset22);
        org.jfree.data.category.CategoryDataset categoryDataset27 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 10L, (org.jfree.data.KeyedValues) pieDataset22);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset29 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset27, (java.lang.Comparable) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
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
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 130.0d + "'", double26 == 130.0d);
        org.junit.Assert.assertNotNull(categoryDataset27);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, false);
        org.jfree.data.pie.PieDataset pieDataset21 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset17, (int) (short) 0);
        org.jfree.data.Range range22 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset17);
        org.jfree.data.KeyToGroupMap keyToGroupMap23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset17, keyToGroupMap23);
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
        org.junit.Assert.assertNotNull(pieDataset21);
        org.junit.Assert.assertNotNull(range22);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range3 = org.jfree.data.general.DatasetUtilities.iterateToFindDomainBounds(xYDataset0, list1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        org.jfree.data.function.Function2D function2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries5 = org.jfree.data.general.DatasetUtilities.sampleFunction2DToSeries(function2D0, 400.0d, (double) 100, (int) (byte) 0, (java.lang.Comparable) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range1 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds(xYDataset0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset2 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset0, (java.lang.Comparable) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        double[] doubleArray10 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray17 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray18 = new double[][] { doubleArray10, doubleArray17 };
        org.jfree.data.category.CategoryDataset categoryDataset19 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray18);
        org.jfree.data.Range range21 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset19, false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range23 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(xYDataset0, list1, range21, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(categoryDataset19);
        org.junit.Assert.assertNotNull(range21);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        org.jfree.data.function.Function2D function2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataset xYDataset5 = org.jfree.data.general.DatasetUtilities.sampleFunction2D(function2D0, (double) 1, (double) 1, (int) (byte) -1, (java.lang.Comparable) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        java.lang.Comparable[] comparableArray4 = new java.lang.Comparable[] { false, (short) 10, 0.0f, (byte) 100 };
        java.lang.Comparable[] comparableArray7 = new java.lang.Comparable[] { 1.0d, (-1.0f) };
        double[] doubleArray10 = new double[] {};
        double[][] doubleArray11 = new double[][] { doubleArray10 };
        org.jfree.data.category.CategoryDataset categoryDataset12 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray11);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.category.CategoryDataset categoryDataset13 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray4, comparableArray7, doubleArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The number of row keys does not match the number of rows in the data array.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparableArray4);
        org.junit.Assert.assertNotNull(comparableArray7);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertNotNull(categoryDataset12);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        java.lang.Comparable[] comparableArray2 = new java.lang.Comparable[] { 400.0d, (short) 0 };
        java.lang.Comparable[] comparableArray9 = new java.lang.Comparable[] { 0, 0L, (byte) -1, "", (-1L), 0.0d };
        double[][] doubleArray10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.category.CategoryDataset categoryDataset11 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray2, comparableArray9, doubleArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparableArray2);
        org.junit.Assert.assertNotNull(comparableArray9);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        org.jfree.data.function.Function2D function2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries5 = org.jfree.data.general.DatasetUtilities.sampleFunction2DToSeries(function2D0, (double) 0.0f, (double) (short) -1, (int) (byte) 10, (java.lang.Comparable) 200.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        java.lang.Comparable[] comparableArray4 = new java.lang.Comparable[] { 10.0f, 400.0d, 0.0f, '4' };
        java.lang.Comparable[] comparableArray5 = new java.lang.Comparable[] {};
        double[] doubleArray7 = new double[] { 10 };
        double[] doubleArray9 = new double[] { 10 };
        double[][] doubleArray10 = new double[][] { doubleArray7, doubleArray9 };
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.category.CategoryDataset categoryDataset11 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray4, comparableArray5, doubleArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The number of row keys does not match the number of rows in the data array.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparableArray4);
        org.junit.Assert.assertNotNull(comparableArray5);
        org.junit.Assert.assertArrayEquals(comparableArray5, new java.lang.Comparable[] {});
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        java.lang.Number[] numberArray8 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray18 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray23 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray24 = new java.lang.Number[][] { numberArray8, numberArray13, numberArray18, numberArray23 };
        org.jfree.data.category.CategoryDataset categoryDataset25 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray24);
        org.jfree.data.category.CategoryDataset categoryDataset26 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray24);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset28 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset26, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray13);
        org.junit.Assert.assertNotNull(numberArray18);
        org.junit.Assert.assertNotNull(numberArray23);
        org.junit.Assert.assertNotNull(numberArray24);
        org.junit.Assert.assertNotNull(categoryDataset25);
        org.junit.Assert.assertNotNull(categoryDataset26);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        java.lang.Number number18 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset17);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset20 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset17, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertNotNull(categoryDataset17);
        org.junit.Assert.assertEquals("'" + number18 + "' != '" + 0.0d + "'", number18, 0.0d);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        java.util.List list1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range3 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset0, list1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        double[] doubleArray4 = new double[] { (short) 0, (byte) 0 };
        double[][] doubleArray5 = new double[][] { doubleArray4 };
        org.jfree.data.category.CategoryDataset categoryDataset6 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray5);
        org.jfree.data.pie.PieDataset pieDataset8 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset6, 0);
        java.util.List list9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range11 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset6, list9, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'visibleSeriesKeys' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(categoryDataset6);
        org.junit.Assert.assertNotNull(pieDataset8);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        java.lang.Number[] numberArray8 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray18 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray23 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray24 = new java.lang.Number[][] { numberArray8, numberArray13, numberArray18, numberArray23 };
        org.jfree.data.category.CategoryDataset categoryDataset25 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray24);
        org.jfree.data.Range range26 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset25);
        java.lang.Number number27 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset25);
        org.jfree.data.Range range28 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset25);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range30 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(xYDataset0, list1, range28, false);
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
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertEquals("'" + number27 + "' != '" + 1.0d + "'", number27, 1.0d);
        org.junit.Assert.assertNotNull(range28);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset17, false);
        java.lang.Number number20 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset17);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset22 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset17, (java.lang.Comparable) 1);
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
        org.junit.Assert.assertEquals("'" + number20 + "' != '" + 0.0d + "'", number20, 0.0d);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.jfree.data.xy.TableXYDataset tableXYDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.jfree.data.general.DatasetUtilities.calculateStackTotal(tableXYDataset0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        java.lang.Number[] numberArray8 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray18 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray23 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray24 = new java.lang.Number[][] { numberArray8, numberArray13, numberArray18, numberArray23 };
        org.jfree.data.category.CategoryDataset categoryDataset25 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray24);
        org.jfree.data.Range range26 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset25);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range28 = org.jfree.data.general.DatasetUtilities.findRangeBounds(xYDataset0, list1, range26, false);
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
        org.junit.Assert.assertNotNull(range26);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        java.lang.Number number18 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset17);
        boolean boolean19 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset17);
        org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset17);
        java.util.List list21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range23 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset17, list21, false);
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
        org.junit.Assert.assertEquals("'" + number18 + "' != '" + 0.0d + "'", number18, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(range20);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        java.lang.Number number18 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset17);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset20 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset17, (int) (short) -1);
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
        org.junit.Assert.assertEquals("'" + number18 + "' != '" + 0.0d + "'", number18, 0.0d);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.jfree.data.pie.PieDataset pieDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset4 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset0, (java.lang.Comparable) 100.0f, (double) 0L, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset17, false);
        java.lang.Number number20 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset17);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset22 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset17, (java.lang.Comparable) 100L);
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
        org.junit.Assert.assertEquals("'" + number20 + "' != '" + 0.0d + "'", number20, 0.0d);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        java.lang.Comparable[] comparableArray2 = new java.lang.Comparable[] { (byte) 10, (byte) 10 };
        java.lang.Comparable[] comparableArray5 = new java.lang.Comparable[] { 1.0f, 1.0f };
        double[] doubleArray10 = new double[] {};
        double[][] doubleArray11 = new double[][] { doubleArray10 };
        org.jfree.data.category.CategoryDataset categoryDataset12 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray11);
        org.jfree.data.category.CategoryDataset categoryDataset13 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray11);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.category.CategoryDataset categoryDataset14 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray2, comparableArray5, doubleArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Duplicate items in 'rowKeys'.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparableArray2);
        org.junit.Assert.assertNotNull(comparableArray5);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertNotNull(categoryDataset12);
        org.junit.Assert.assertNotNull(categoryDataset13);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        double[] doubleArray10 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray17 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray18 = new double[][] { doubleArray10, doubleArray17 };
        org.jfree.data.category.CategoryDataset categoryDataset19 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray18);
        org.jfree.data.Range range21 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset19, false);
        org.jfree.data.Range range22 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset19);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(xYDataset0, list1, range22, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(categoryDataset19);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertNotNull(range22);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        java.lang.Number[] numberArray12 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray17 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray22 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray27 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray28 = new java.lang.Number[][] { numberArray12, numberArray17, numberArray22, numberArray27 };
        org.jfree.data.category.CategoryDataset categoryDataset29 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray28);
        org.jfree.data.category.CategoryDataset categoryDataset30 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray28);
        org.jfree.data.category.CategoryDataset categoryDataset31 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray28);
        org.jfree.data.category.CategoryDataset categoryDataset32 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray28);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset34 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset32, (java.lang.Comparable) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray12);
        org.junit.Assert.assertNotNull(numberArray17);
        org.junit.Assert.assertNotNull(numberArray22);
        org.junit.Assert.assertNotNull(numberArray27);
        org.junit.Assert.assertNotNull(numberArray28);
        org.junit.Assert.assertNotNull(categoryDataset29);
        org.junit.Assert.assertNotNull(categoryDataset30);
        org.junit.Assert.assertNotNull(categoryDataset31);
        org.junit.Assert.assertNotNull(categoryDataset32);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        java.lang.Number[] numberArray6 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray11 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray21 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray22 = new java.lang.Number[][] { numberArray6, numberArray11, numberArray16, numberArray21 };
        org.jfree.data.category.CategoryDataset categoryDataset23 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray22);
        org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset23);
        org.jfree.data.Range range26 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset23, true);
        java.lang.Number number27 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset23);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset29 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset23, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 4");
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
        org.junit.Assert.assertEquals("'" + number27 + "' != '" + 1.0d + "'", number27, 1.0d);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        org.jfree.data.function.Function2D function2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries5 = org.jfree.data.general.DatasetUtilities.sampleFunction2DToSeries(function2D0, (double) '#', (double) 10L, 10, (java.lang.Comparable) 200.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        java.lang.Number[] numberArray8 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray18 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray23 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray24 = new java.lang.Number[][] { numberArray8, numberArray13, numberArray18, numberArray23 };
        org.jfree.data.category.CategoryDataset categoryDataset25 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray24);
        org.jfree.data.Range range26 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset25);
        org.jfree.data.Range range27 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset25);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range29 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(xYDataset0, list1, range27, false);
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
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range27);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        java.lang.Number[] numberArray10 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray15 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray20 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray25 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray26 = new java.lang.Number[][] { numberArray10, numberArray15, numberArray20, numberArray25 };
        org.jfree.data.category.CategoryDataset categoryDataset27 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray26);
        org.jfree.data.category.CategoryDataset categoryDataset28 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray26);
        org.jfree.data.category.CategoryDataset categoryDataset29 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray26);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset31 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset29, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 4");
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
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
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
        org.jfree.data.pie.PieDataset pieDataset30 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset28, 0);
        java.util.List list31 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range33 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset28, list31, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'visibleSeriesKeys' argument.");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(categoryDataset28);
        org.junit.Assert.assertNotNull(pieDataset30);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        java.lang.Number[] numberArray8 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray18 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray23 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray24 = new java.lang.Number[][] { numberArray8, numberArray13, numberArray18, numberArray23 };
        org.jfree.data.category.CategoryDataset categoryDataset25 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray24);
        org.jfree.data.Range range26 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset25);
        org.jfree.data.Range range28 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset25, true);
        org.jfree.data.Range range29 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset25);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range31 = org.jfree.data.general.DatasetUtilities.findRangeBounds(xYDataset0, list1, range29, true);
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
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertNotNull(range29);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, false);
        org.jfree.data.pie.PieDataset pieDataset21 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset17, (int) (short) 0);
        org.jfree.data.Range range23 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset17, false);
        java.lang.Comparable comparable24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset25 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset17, comparable24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
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
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
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
        java.util.List list29 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range31 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset23, list29, true);
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
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(range28);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        java.lang.Number[] numberArray8 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray18 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray23 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray24 = new java.lang.Number[][] { numberArray8, numberArray13, numberArray18, numberArray23 };
        org.jfree.data.category.CategoryDataset categoryDataset25 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray24);
        org.jfree.data.Range range26 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset25);
        org.jfree.data.Range range28 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset25, true);
        org.jfree.data.Range range30 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset25, false);
        org.jfree.data.Range range31 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset25);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range33 = org.jfree.data.general.DatasetUtilities.findRangeBounds(xYDataset0, list1, range31, false);
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
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertNotNull(range30);
        org.junit.Assert.assertNotNull(range31);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        double[] doubleArray10 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray17 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray18 = new double[][] { doubleArray10, doubleArray17 };
        org.jfree.data.category.CategoryDataset categoryDataset19 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray18);
        org.jfree.data.Range range21 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset19, false);
        org.jfree.data.pie.PieDataset pieDataset23 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset19, (int) (short) 0);
        org.jfree.data.Range range25 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset19, false);
        java.lang.Number number26 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset19);
        org.jfree.data.Range range28 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset19, false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range30 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(xYDataset0, list1, range28, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertEquals("'" + number26 + "' != '" + 200.0d + "'", number26, 200.0d);
        org.junit.Assert.assertNotNull(range28);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, false);
        org.jfree.data.pie.PieDataset pieDataset21 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset17, (int) (short) 0);
        java.lang.Number number22 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(categoryDataset17);
        java.util.List list23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range25 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset17, list23, false);
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
        org.junit.Assert.assertEquals("'" + number22 + "' != '" + 100.0d + "'", number22, 100.0d);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, false);
        org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset17);
        org.jfree.data.Range range21 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset17);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset23 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset17, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 2");
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
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        org.jfree.data.xy.TableXYDataset tableXYDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(tableXYDataset0, (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        org.jfree.data.function.Function2D function2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataset xYDataset5 = org.jfree.data.general.DatasetUtilities.sampleFunction2D(function2D0, (double) 'a', (double) 100.0f, (int) 'a', (java.lang.Comparable) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        org.jfree.data.function.Function2D function2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries5 = org.jfree.data.general.DatasetUtilities.sampleFunction2DToSeries(function2D0, (double) 1, 0.0d, (int) '#', (java.lang.Comparable) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.jfree.data.xy.TableXYDataset tableXYDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(tableXYDataset0, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        double[] doubleArray9 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray16 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray17 = new double[][] { doubleArray9, doubleArray16 };
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray17);
        org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset18, false);
        org.jfree.data.pie.PieDataset pieDataset22 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset18, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset25 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset22, (java.lang.Comparable) 100L, (double) 1);
        org.jfree.data.category.CategoryDataset categoryDataset26 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 130.0d, (org.jfree.data.KeyedValues) pieDataset25);
        java.lang.Class<?> wildcardClass27 = categoryDataset26.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        java.lang.Number[] numberArray6 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray11 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray21 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray22 = new java.lang.Number[][] { numberArray6, numberArray11, numberArray16, numberArray21 };
        org.jfree.data.category.CategoryDataset categoryDataset23 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray22);
        org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset23);
        org.jfree.data.Range range26 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset23, true);
        java.lang.Number number27 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset23);
        java.util.List list28 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range30 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(categoryDataset23, list28, false);
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
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        org.jfree.data.function.Function2D function2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries5 = org.jfree.data.general.DatasetUtilities.sampleFunction2DToSeries(function2D0, (double) 10.0f, (double) 1.0f, (int) '#', (java.lang.Comparable) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        org.jfree.data.function.Function2D function2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataset xYDataset5 = org.jfree.data.general.DatasetUtilities.sampleFunction2D(function2D0, 130.0d, (double) '#', (int) 'a', (java.lang.Comparable) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        java.lang.Number[] numberArray6 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray11 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray21 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray22 = new java.lang.Number[][] { numberArray6, numberArray11, numberArray16, numberArray21 };
        org.jfree.data.category.CategoryDataset categoryDataset23 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray22);
        org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset23);
        java.lang.Number number25 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset23);
        java.util.List list26 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range28 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(categoryDataset23, list26, false);
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
        org.junit.Assert.assertEquals("'" + number25 + "' != '" + 1.0d + "'", number25, 1.0d);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
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
        java.util.List list32 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range34 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset23, list32, false);
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
        org.junit.Assert.assertNotNull(range31);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        java.lang.Number[] numberArray6 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray11 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray21 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray22 = new java.lang.Number[][] { numberArray6, numberArray11, numberArray16, numberArray21 };
        org.jfree.data.category.CategoryDataset categoryDataset23 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray22);
        org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset23);
        org.jfree.data.Range range26 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset23, true);
        org.jfree.data.Range range28 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset23, false);
        org.jfree.data.KeyToGroupMap keyToGroupMap29 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range30 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset23, keyToGroupMap29);
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
        org.junit.Assert.assertNotNull(range28);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        java.lang.Number number18 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset17);
        boolean boolean19 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset17);
        org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset17);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset22 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset17, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertNotNull(categoryDataset17);
        org.junit.Assert.assertEquals("'" + number18 + "' != '" + 0.0d + "'", number18, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(range20);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        double[] doubleArray4 = new double[] { (short) 0, (byte) 0 };
        double[][] doubleArray5 = new double[][] { doubleArray4 };
        org.jfree.data.category.CategoryDataset categoryDataset6 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray5);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset8 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset6, (java.lang.Comparable) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(categoryDataset6);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range1 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        java.lang.Number[] numberArray6 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray11 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray21 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray22 = new java.lang.Number[][] { numberArray6, numberArray11, numberArray16, numberArray21 };
        org.jfree.data.category.CategoryDataset categoryDataset23 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray22);
        org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset23);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset26 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset23, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 4");
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
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        org.jfree.data.function.Function2D function2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataset xYDataset5 = org.jfree.data.general.DatasetUtilities.sampleFunction2D(function2D0, (double) '4', (double) (byte) 100, (int) ' ', (java.lang.Comparable) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        org.jfree.data.function.Function2D function2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataset xYDataset5 = org.jfree.data.general.DatasetUtilities.sampleFunction2D(function2D0, 10.0d, (double) (-1L), (int) (short) -1, (java.lang.Comparable) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        org.jfree.data.xy.TableXYDataset tableXYDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(tableXYDataset0, (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, false);
        org.jfree.data.pie.PieDataset pieDataset21 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset17, (int) (short) 0);
        org.jfree.data.Range range23 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset17, false);
        java.lang.Number number24 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset17);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset26 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset17, (java.lang.Comparable) "hi!");
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
        org.junit.Assert.assertNotNull(pieDataset21);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertEquals("'" + number24 + "' != '" + 200.0d + "'", number24, 200.0d);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        org.jfree.data.xy.TableXYDataset tableXYDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.jfree.data.general.DatasetUtilities.calculateStackTotal(tableXYDataset0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        java.lang.Comparable[] comparableArray0 = new java.lang.Comparable[] {};
        java.lang.Comparable[] comparableArray3 = new java.lang.Comparable[] { 100.0f, 10L };
        double[] doubleArray8 = new double[] {};
        double[][] doubleArray9 = new double[][] { doubleArray8 };
        org.jfree.data.category.CategoryDataset categoryDataset10 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray9);
        org.jfree.data.category.CategoryDataset categoryDataset11 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray9);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.category.CategoryDataset categoryDataset12 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray0, comparableArray3, doubleArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The number of row keys does not match the number of rows in the data array.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparableArray0);
        org.junit.Assert.assertArrayEquals(comparableArray0, new java.lang.Comparable[] {});
        org.junit.Assert.assertNotNull(comparableArray3);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertNotNull(categoryDataset10);
        org.junit.Assert.assertNotNull(categoryDataset11);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        double[] doubleArray4 = new double[] { (short) 0, (byte) 0 };
        double[][] doubleArray5 = new double[][] { doubleArray4 };
        org.jfree.data.category.CategoryDataset categoryDataset6 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray5);
        java.util.List list7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range9 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(categoryDataset6, list7, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'visibleSeriesKeys' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(categoryDataset6);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        java.lang.Number[] numberArray8 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray18 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray23 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray24 = new java.lang.Number[][] { numberArray8, numberArray13, numberArray18, numberArray23 };
        org.jfree.data.category.CategoryDataset categoryDataset25 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray24);
        org.jfree.data.Range range26 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset25);
        org.jfree.data.Range range28 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset25, true);
        java.lang.Number number29 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset25);
        org.jfree.data.Range range31 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset25, true);
        java.lang.Number number32 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset25);
        org.jfree.data.Range range34 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset25, false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range36 = org.jfree.data.general.DatasetUtilities.findRangeBounds(xYDataset0, list1, range34, true);
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
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertEquals("'" + number29 + "' != '" + 1.0d + "'", number29, 1.0d);
        org.junit.Assert.assertNotNull(range31);
        org.junit.Assert.assertEquals("'" + number32 + "' != '" + 400.0d + "'", number32, 400.0d);
        org.junit.Assert.assertNotNull(range34);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        java.lang.Number[] numberArray10 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray15 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray20 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray25 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray26 = new java.lang.Number[][] { numberArray10, numberArray15, numberArray20, numberArray25 };
        org.jfree.data.category.CategoryDataset categoryDataset27 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray26);
        org.jfree.data.category.CategoryDataset categoryDataset28 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray26);
        org.jfree.data.Range range29 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset28);
        org.jfree.data.Range range31 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset28, (double) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range33 = org.jfree.data.general.DatasetUtilities.findRangeBounds(xYDataset0, list1, range31, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
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
        org.junit.Assert.assertNotNull(range29);
        org.junit.Assert.assertNotNull(range31);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, false);
        org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset17);
        org.jfree.data.Range range21 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset17);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset23 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset17, (java.lang.Comparable) (short) 10);
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
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
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
        org.jfree.data.Range range32 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset23, false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset34 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset23, (java.lang.Comparable) 1.0f);
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
        org.junit.Assert.assertEquals("'" + number27 + "' != '" + 1.0d + "'", number27, 1.0d);
        org.junit.Assert.assertNotNull(range29);
        org.junit.Assert.assertEquals("'" + number30 + "' != '" + 400.0d + "'", number30, 400.0d);
        org.junit.Assert.assertNotNull(range32);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        org.jfree.data.xy.TableXYDataset tableXYDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(tableXYDataset0, (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        java.lang.Number[] numberArray8 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray18 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray23 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray24 = new java.lang.Number[][] { numberArray8, numberArray13, numberArray18, numberArray23 };
        org.jfree.data.category.CategoryDataset categoryDataset25 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray24);
        java.lang.Number number26 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(categoryDataset25);
        org.jfree.data.Range range28 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset25, true);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range30 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(xYDataset0, list1, range28, false);
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
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset19 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset17, (int) (byte) -1);
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
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        double[] doubleArray9 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray16 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray17 = new double[][] { doubleArray9, doubleArray16 };
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray17);
        org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset18, false);
        org.jfree.data.pie.PieDataset pieDataset22 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset18, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset25 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset22, (java.lang.Comparable) 100L, (double) 1);
        org.jfree.data.category.CategoryDataset categoryDataset26 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) (-1L), (org.jfree.data.KeyedValues) pieDataset25);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset28 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset26, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
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
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        org.jfree.data.function.Function2D function2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries5 = org.jfree.data.general.DatasetUtilities.sampleFunction2DToSeries(function2D0, (double) (-1.0f), 10.0d, (int) (byte) 10, (java.lang.Comparable) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset31 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset23, (java.lang.Comparable) (-1));
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
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
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
        java.lang.Class<?> wildcardClass34 = range33.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        java.lang.Comparable[] comparableArray6 = new java.lang.Comparable[] { "hi!", 1.0f, 130.0d, (byte) 10, "", false };
        java.lang.Comparable[] comparableArray8 = new java.lang.Comparable[] { (short) 1 };
        double[][] doubleArray9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.category.CategoryDataset categoryDataset10 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray6, comparableArray8, doubleArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparableArray6);
        org.junit.Assert.assertNotNull(comparableArray8);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        java.lang.Comparable[] comparableArray6 = new java.lang.Comparable[] { 1L, (-1), (short) 10, (byte) 0, (-1L), (byte) 0 };
        java.lang.Comparable[] comparableArray8 = new java.lang.Comparable[] { 1L };
        double[] doubleArray13 = new double[] {};
        double[][] doubleArray14 = new double[][] { doubleArray13 };
        org.jfree.data.category.CategoryDataset categoryDataset15 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray14);
        org.jfree.data.category.CategoryDataset categoryDataset16 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray14);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray6, comparableArray8, doubleArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Duplicate items in 'rowKeys'.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparableArray6);
        org.junit.Assert.assertNotNull(comparableArray8);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertNotNull(categoryDataset15);
        org.junit.Assert.assertNotNull(categoryDataset16);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        java.lang.Number[] numberArray8 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray18 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray23 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray24 = new java.lang.Number[][] { numberArray8, numberArray13, numberArray18, numberArray23 };
        org.jfree.data.category.CategoryDataset categoryDataset25 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray24);
        org.jfree.data.Range range26 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset25);
        java.lang.Number number27 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset25);
        org.jfree.data.Range range29 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset25, (double) 100L);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range31 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(xYDataset0, list1, range29, false);
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
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertEquals("'" + number27 + "' != '" + 1.0d + "'", number27, 1.0d);
        org.junit.Assert.assertNotNull(range29);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        java.lang.Number[] numberArray8 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray18 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray23 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray24 = new java.lang.Number[][] { numberArray8, numberArray13, numberArray18, numberArray23 };
        org.jfree.data.category.CategoryDataset categoryDataset25 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray24);
        org.jfree.data.Range range26 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset25);
        org.jfree.data.Range range28 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset25, true);
        org.jfree.data.Range range30 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset25, false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range32 = org.jfree.data.general.DatasetUtilities.findRangeBounds(xYDataset0, list1, range30, true);
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
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertNotNull(range30);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        double[] doubleArray10 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray17 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray18 = new double[][] { doubleArray10, doubleArray17 };
        org.jfree.data.category.CategoryDataset categoryDataset19 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray18);
        org.jfree.data.category.CategoryDataset categoryDataset20 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray18);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset22 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset20, (java.lang.Comparable) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(categoryDataset19);
        org.junit.Assert.assertNotNull(categoryDataset20);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        org.jfree.data.function.Function2D function2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries5 = org.jfree.data.general.DatasetUtilities.sampleFunction2DToSeries(function2D0, 130.0d, (double) 0L, (int) (byte) -1, (java.lang.Comparable) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        double[] doubleArray4 = new double[] {};
        double[][] doubleArray5 = new double[][] { doubleArray4 };
        org.jfree.data.category.CategoryDataset categoryDataset6 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray5);
        org.jfree.data.category.CategoryDataset categoryDataset7 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray5);
        boolean boolean8 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset7);
        org.jfree.data.KeyToGroupMap keyToGroupMap9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range10 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset7, keyToGroupMap9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(categoryDataset6);
        org.junit.Assert.assertNotNull(categoryDataset7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        java.lang.Comparable[] comparableArray1 = new java.lang.Comparable[] { 200.0d };
        java.lang.Comparable[] comparableArray3 = new java.lang.Comparable[] { ' ' };
        double[] doubleArray10 = new double[] { (short) 0, (byte) 0 };
        double[][] doubleArray11 = new double[][] { doubleArray10 };
        org.jfree.data.category.CategoryDataset categoryDataset12 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray11);
        org.jfree.data.category.CategoryDataset categoryDataset13 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray11);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.category.CategoryDataset categoryDataset14 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray1, comparableArray3, doubleArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The number of column keys does not match the number of columns in the data array.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparableArray1);
        org.junit.Assert.assertNotNull(comparableArray3);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertNotNull(categoryDataset12);
        org.junit.Assert.assertNotNull(categoryDataset13);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        org.jfree.data.xy.TableXYDataset tableXYDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(tableXYDataset0, (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        java.lang.Comparable[] comparableArray2 = new java.lang.Comparable[] { (byte) 1, 1 };
        java.lang.Comparable[] comparableArray7 = new java.lang.Comparable[] { (-1), (short) -1, 400.0d, (byte) 1 };
        double[] doubleArray12 = new double[] {};
        double[][] doubleArray13 = new double[][] { doubleArray12 };
        org.jfree.data.category.CategoryDataset categoryDataset14 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray13);
        org.jfree.data.category.CategoryDataset categoryDataset15 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray13);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.category.CategoryDataset categoryDataset16 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray2, comparableArray7, doubleArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The number of row keys does not match the number of rows in the data array.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparableArray2);
        org.junit.Assert.assertNotNull(comparableArray7);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertNotNull(categoryDataset14);
        org.junit.Assert.assertNotNull(categoryDataset15);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        java.lang.Number[] numberArray10 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray15 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray20 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray25 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray26 = new java.lang.Number[][] { numberArray10, numberArray15, numberArray20, numberArray25 };
        org.jfree.data.category.CategoryDataset categoryDataset27 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray26);
        org.jfree.data.category.CategoryDataset categoryDataset28 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray26);
        org.jfree.data.category.CategoryDataset categoryDataset29 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray26);
        java.lang.Number number30 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset29);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset32 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset29, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 4");
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
        org.junit.Assert.assertEquals("'" + number30 + "' != '" + 1.0d + "'", number30, 1.0d);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        java.lang.Number[] numberArray10 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray15 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray20 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray25 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray26 = new java.lang.Number[][] { numberArray10, numberArray15, numberArray20, numberArray25 };
        org.jfree.data.category.CategoryDataset categoryDataset27 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray26);
        org.jfree.data.category.CategoryDataset categoryDataset28 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray26);
        org.jfree.data.category.CategoryDataset categoryDataset29 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray26);
        org.junit.Assert.assertNotNull(numberArray10);
        org.junit.Assert.assertNotNull(numberArray15);
        org.junit.Assert.assertNotNull(numberArray20);
        org.junit.Assert.assertNotNull(numberArray25);
        org.junit.Assert.assertNotNull(numberArray26);
        org.junit.Assert.assertNotNull(categoryDataset27);
        org.junit.Assert.assertNotNull(categoryDataset28);
        org.junit.Assert.assertNotNull(categoryDataset29);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        double[][] doubleArray2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.category.CategoryDataset categoryDataset3 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, false);
        org.jfree.data.pie.PieDataset pieDataset21 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset17, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset24 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset21, (java.lang.Comparable) 100L, (double) 1);
        org.jfree.data.pie.PieDataset pieDataset27 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset21, (java.lang.Comparable) (short) 1, 130.0d);
        boolean boolean28 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset21);
        org.jfree.data.pie.PieDataset pieDataset32 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset21, (java.lang.Comparable) 0.0f, (double) (byte) 1, (int) (short) 10);
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
        org.junit.Assert.assertNotNull(pieDataset32);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        org.jfree.data.xy.TableXYDataset tableXYDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.jfree.data.general.DatasetUtilities.calculateStackTotal(tableXYDataset0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        org.jfree.data.xy.TableXYDataset tableXYDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(tableXYDataset0, (double) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        java.lang.Number[] numberArray10 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray15 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray20 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray25 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray26 = new java.lang.Number[][] { numberArray10, numberArray15, numberArray20, numberArray25 };
        org.jfree.data.category.CategoryDataset categoryDataset27 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray26);
        org.jfree.data.category.CategoryDataset categoryDataset28 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray26);
        org.jfree.data.Range range29 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset28);
        org.jfree.data.Range range31 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset28, (double) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range33 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(xYDataset0, list1, range31, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
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
        org.junit.Assert.assertNotNull(range29);
        org.junit.Assert.assertNotNull(range31);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        java.lang.Number[] numberArray8 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray18 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray23 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray24 = new java.lang.Number[][] { numberArray8, numberArray13, numberArray18, numberArray23 };
        org.jfree.data.category.CategoryDataset categoryDataset25 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray24);
        org.jfree.data.category.CategoryDataset categoryDataset26 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray24);
        org.jfree.data.Range range27 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset26);
        java.util.List list28 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range30 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(categoryDataset26, list28, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'visibleSeriesKeys' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray13);
        org.junit.Assert.assertNotNull(numberArray18);
        org.junit.Assert.assertNotNull(numberArray23);
        org.junit.Assert.assertNotNull(numberArray24);
        org.junit.Assert.assertNotNull(categoryDataset25);
        org.junit.Assert.assertNotNull(categoryDataset26);
        org.junit.Assert.assertNotNull(range27);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset33 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset23, (-1));
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
        org.junit.Assert.assertNotNull(range31);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        org.jfree.data.xy.TableXYDataset tableXYDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(tableXYDataset0, (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        java.lang.Number[] numberArray8 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray18 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray23 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray24 = new java.lang.Number[][] { numberArray8, numberArray13, numberArray18, numberArray23 };
        org.jfree.data.category.CategoryDataset categoryDataset25 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray24);
        org.jfree.data.Range range26 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset25);
        org.jfree.data.Range range28 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset25, true);
        org.jfree.data.Range range30 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset25, false);
        org.jfree.data.Range range31 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset25);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range33 = org.jfree.data.general.DatasetUtilities.findRangeBounds(xYDataset0, list1, range31, true);
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
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertNotNull(range30);
        org.junit.Assert.assertNotNull(range31);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        java.lang.Number[] numberArray8 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray18 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray23 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray24 = new java.lang.Number[][] { numberArray8, numberArray13, numberArray18, numberArray23 };
        org.jfree.data.category.CategoryDataset categoryDataset25 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray24);
        org.jfree.data.Range range26 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset25);
        org.jfree.data.Range range28 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset25, true);
        java.lang.Number number29 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset25);
        org.jfree.data.Range range31 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset25, true);
        org.jfree.data.Range range33 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset25, true);
        org.jfree.data.Range range35 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset25, true);
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
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertEquals("'" + number29 + "' != '" + 1.0d + "'", number29, 1.0d);
        org.junit.Assert.assertNotNull(range31);
        org.junit.Assert.assertNotNull(range33);
        org.junit.Assert.assertNotNull(range35);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        java.lang.Number[] numberArray8 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray18 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray23 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray24 = new java.lang.Number[][] { numberArray8, numberArray13, numberArray18, numberArray23 };
        org.jfree.data.category.CategoryDataset categoryDataset25 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray24);
        org.jfree.data.category.CategoryDataset categoryDataset26 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray24);
        org.jfree.data.Range range27 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset26);
        org.jfree.data.Range range29 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset26, (double) 'a');
        org.jfree.data.KeyToGroupMap keyToGroupMap30 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range31 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset26, keyToGroupMap30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray13);
        org.junit.Assert.assertNotNull(numberArray18);
        org.junit.Assert.assertNotNull(numberArray23);
        org.junit.Assert.assertNotNull(numberArray24);
        org.junit.Assert.assertNotNull(categoryDataset25);
        org.junit.Assert.assertNotNull(categoryDataset26);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertNotNull(range29);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        java.lang.Comparable[] comparableArray4 = new java.lang.Comparable[] { 100.0f, 100L, 200.0d, 400.0d };
        java.lang.Comparable[] comparableArray11 = new java.lang.Comparable[] { (-1.0d), (byte) 1, 0L, 1.0f, 'a', 200.0d };
        double[] doubleArray22 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray29 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray30 = new double[][] { doubleArray22, doubleArray29 };
        org.jfree.data.category.CategoryDataset categoryDataset31 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray30);
        org.jfree.data.category.CategoryDataset categoryDataset32 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray30);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.category.CategoryDataset categoryDataset33 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray4, comparableArray11, doubleArray30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The number of row keys does not match the number of rows in the data array.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparableArray4);
        org.junit.Assert.assertNotNull(comparableArray11);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertNotNull(categoryDataset31);
        org.junit.Assert.assertNotNull(categoryDataset32);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        java.lang.Number[] numberArray10 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray15 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray20 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray25 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray26 = new java.lang.Number[][] { numberArray10, numberArray15, numberArray20, numberArray25 };
        org.jfree.data.category.CategoryDataset categoryDataset27 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray26);
        org.jfree.data.category.CategoryDataset categoryDataset28 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray26);
        org.jfree.data.category.CategoryDataset categoryDataset29 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray26);
        java.lang.Number number30 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset29);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset32 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset29, (java.lang.Comparable) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 4");
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
        org.junit.Assert.assertEquals("'" + number30 + "' != '" + 1.0d + "'", number30, 1.0d);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        org.jfree.data.xy.TableXYDataset tableXYDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(tableXYDataset0, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        boolean boolean1 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        java.lang.Number[] numberArray8 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray18 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray23 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray24 = new java.lang.Number[][] { numberArray8, numberArray13, numberArray18, numberArray23 };
        org.jfree.data.category.CategoryDataset categoryDataset25 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray24);
        org.jfree.data.Range range26 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset25);
        org.jfree.data.Range range28 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset25, true);
        boolean boolean29 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset25);
        org.jfree.data.Range range30 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset25);
        org.jfree.data.Range range31 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset25);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range33 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(xYDataset0, list1, range31, false);
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
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(range30);
        org.junit.Assert.assertNotNull(range31);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        java.lang.Number[] numberArray6 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray11 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray21 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray22 = new java.lang.Number[][] { numberArray6, numberArray11, numberArray16, numberArray21 };
        org.jfree.data.category.CategoryDataset categoryDataset23 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray22);
        org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset23);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset26 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset23, (java.lang.Comparable) (byte) 1);
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
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        java.lang.Number[] numberArray8 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray18 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray23 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray24 = new java.lang.Number[][] { numberArray8, numberArray13, numberArray18, numberArray23 };
        org.jfree.data.category.CategoryDataset categoryDataset25 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray24);
        org.jfree.data.Range range26 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset25);
        org.jfree.data.Range range28 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset25, true);
        org.jfree.data.Range range29 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset25);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range31 = org.jfree.data.general.DatasetUtilities.findRangeBounds(xYDataset0, list1, range29, false);
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
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertNotNull(range29);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.jfree.data.xy.TableXYDataset tableXYDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(tableXYDataset0, (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, false);
        org.jfree.data.pie.PieDataset pieDataset21 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset17, (int) (short) 0);
        org.jfree.data.Range range23 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset17, false);
        org.jfree.data.Range range25 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, false);
        org.jfree.data.KeyToGroupMap keyToGroupMap26 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range27 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset17, keyToGroupMap26);
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
        org.junit.Assert.assertNotNull(pieDataset21);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertNotNull(range25);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        java.lang.Number[] numberArray6 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray11 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray21 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray22 = new java.lang.Number[][] { numberArray6, numberArray11, numberArray16, numberArray21 };
        org.jfree.data.category.CategoryDataset categoryDataset23 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray22);
        org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset23);
        org.jfree.data.Range range26 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset23, true);
        java.lang.Number number27 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset23);
        org.jfree.data.Range range28 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset23);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset30 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset23, (java.lang.Comparable) (short) 1);
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
        org.junit.Assert.assertEquals("'" + number27 + "' != '" + 1.0d + "'", number27, 1.0d);
        org.junit.Assert.assertNotNull(range28);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        java.lang.Comparable[] comparableArray0 = null;
        java.lang.Comparable[] comparableArray1 = null;
        double[] doubleArray12 = new double[] { (short) 0, (byte) 0 };
        double[][] doubleArray13 = new double[][] { doubleArray12 };
        org.jfree.data.category.CategoryDataset categoryDataset14 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray13);
        org.jfree.data.category.CategoryDataset categoryDataset15 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray13);
        org.jfree.data.category.CategoryDataset categoryDataset16 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray13);
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray13);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray0, comparableArray1, doubleArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'rowKeys' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertNotNull(categoryDataset14);
        org.junit.Assert.assertNotNull(categoryDataset15);
        org.junit.Assert.assertNotNull(categoryDataset16);
        org.junit.Assert.assertNotNull(categoryDataset17);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
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
        org.jfree.data.Range range34 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset23, false);
        org.jfree.data.Range range35 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset23);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset37 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset23, (java.lang.Comparable) 1L);
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
        org.junit.Assert.assertEquals("'" + number27 + "' != '" + 1.0d + "'", number27, 1.0d);
        org.junit.Assert.assertNotNull(range29);
        org.junit.Assert.assertNotNull(range31);
        org.junit.Assert.assertNotNull(range32);
        org.junit.Assert.assertNotNull(range34);
        org.junit.Assert.assertNotNull(range35);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
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
        java.lang.Class<?> wildcardClass31 = pieDataset22.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset17, false);
        org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset17);
        org.jfree.data.Range range22 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset17, (double) 1);
        org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, true);
        java.lang.Class<?> wildcardClass25 = categoryDataset17.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, false);
        org.jfree.data.pie.PieDataset pieDataset21 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset17, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset24 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset21, (java.lang.Comparable) 100L, (double) 1);
        double double25 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset21);
        boolean boolean26 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset21);
        org.jfree.data.pie.PieDataset pieDataset29 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset21, (java.lang.Comparable) 1, (double) (-1.0f));
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertNotNull(categoryDataset17);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertNotNull(pieDataset21);
        org.junit.Assert.assertNotNull(pieDataset24);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 130.0d + "'", double25 == 130.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(pieDataset29);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        org.jfree.data.Range range2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range4 = org.jfree.data.general.DatasetUtilities.findRangeBounds(xYDataset0, list1, range2, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        double[] doubleArray10 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray17 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray18 = new double[][] { doubleArray10, doubleArray17 };
        org.jfree.data.category.CategoryDataset categoryDataset19 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray18);
        org.jfree.data.Range range21 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset19, false);
        org.jfree.data.pie.PieDataset pieDataset23 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset19, (int) (short) 0);
        org.jfree.data.Range range25 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset19, false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range27 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(xYDataset0, list1, range25, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(range25);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        java.lang.Comparable[] comparableArray2 = new java.lang.Comparable[] { 10L, true };
        java.lang.Comparable[] comparableArray8 = new java.lang.Comparable[] { 100, (-1.0d), (short) 0, 100.0f, (short) 0 };
        double[] doubleArray15 = new double[] {};
        double[][] doubleArray16 = new double[][] { doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray16);
        org.jfree.data.category.CategoryDataset categoryDataset19 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray16);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.category.CategoryDataset categoryDataset20 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray2, comparableArray8, doubleArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Duplicate items in 'columnKeys'.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparableArray2);
        org.junit.Assert.assertNotNull(comparableArray8);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertNotNull(categoryDataset17);
        org.junit.Assert.assertNotNull(categoryDataset18);
        org.junit.Assert.assertNotNull(categoryDataset19);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        java.lang.Comparable[] comparableArray5 = new java.lang.Comparable[] { (short) -1, (byte) 0, "", (byte) -1, (byte) 100 };
        java.lang.Comparable[] comparableArray6 = new java.lang.Comparable[] {};
        double[] doubleArray19 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray26 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray27 = new double[][] { doubleArray19, doubleArray26 };
        org.jfree.data.category.CategoryDataset categoryDataset28 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray27);
        org.jfree.data.category.CategoryDataset categoryDataset29 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray27);
        org.jfree.data.category.CategoryDataset categoryDataset30 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray27);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.category.CategoryDataset categoryDataset31 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray5, comparableArray6, doubleArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The number of row keys does not match the number of rows in the data array.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparableArray5);
        org.junit.Assert.assertNotNull(comparableArray6);
        org.junit.Assert.assertArrayEquals(comparableArray6, new java.lang.Comparable[] {});
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertArrayEquals(doubleArray26, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertNotNull(categoryDataset28);
        org.junit.Assert.assertNotNull(categoryDataset29);
        org.junit.Assert.assertNotNull(categoryDataset30);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        org.jfree.data.xy.TableXYDataset tableXYDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(tableXYDataset0, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, false);
        org.jfree.data.pie.PieDataset pieDataset21 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset17, (int) (short) 0);
        org.jfree.data.Range range23 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset17, false);
        org.jfree.data.KeyToGroupMap keyToGroupMap24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range25 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset17, keyToGroupMap24);
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
        org.junit.Assert.assertNotNull(pieDataset21);
        org.junit.Assert.assertNotNull(range23);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        java.lang.Number[] numberArray8 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray18 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray23 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray24 = new java.lang.Number[][] { numberArray8, numberArray13, numberArray18, numberArray23 };
        org.jfree.data.category.CategoryDataset categoryDataset25 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray24);
        java.lang.Number number26 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(categoryDataset25);
        org.jfree.data.Range range28 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset25, true);
        org.jfree.data.Range range30 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset25, (double) (-1.0f));
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
        org.junit.Assert.assertNotNull(range30);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        org.jfree.data.function.Function2D function2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries5 = org.jfree.data.general.DatasetUtilities.sampleFunction2DToSeries(function2D0, (double) 1, (double) 100, (int) (short) 10, (java.lang.Comparable) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        org.jfree.data.xy.TableXYDataset tableXYDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.jfree.data.general.DatasetUtilities.calculateStackTotal(tableXYDataset0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        java.lang.Number[] numberArray6 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray11 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray21 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray22 = new java.lang.Number[][] { numberArray6, numberArray11, numberArray16, numberArray21 };
        org.jfree.data.category.CategoryDataset categoryDataset23 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray22);
        org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset23);
        java.lang.Number number25 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset23);
        org.jfree.data.Range range27 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset23, (double) 100L);
        java.lang.Class<?> wildcardClass28 = categoryDataset23.getClass();
        org.junit.Assert.assertNotNull(numberArray6);
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertNotNull(numberArray16);
        org.junit.Assert.assertNotNull(numberArray21);
        org.junit.Assert.assertNotNull(numberArray22);
        org.junit.Assert.assertNotNull(categoryDataset23);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertEquals("'" + number25 + "' != '" + 1.0d + "'", number25, 1.0d);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        double[] doubleArray9 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray16 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray17 = new double[][] { doubleArray9, doubleArray16 };
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray17);
        org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset18, false);
        org.jfree.data.pie.PieDataset pieDataset22 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset18, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset25 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset22, (java.lang.Comparable) ' ', (double) '#');
        org.jfree.data.category.CategoryDataset categoryDataset26 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) '4', (org.jfree.data.KeyedValues) pieDataset22);
        org.jfree.data.pie.PieDataset pieDataset29 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset22, (java.lang.Comparable) (short) 0, (double) (short) 0);
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
        org.junit.Assert.assertNotNull(pieDataset29);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        double[] doubleArray9 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray16 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray17 = new double[][] { doubleArray9, doubleArray16 };
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray17);
        org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset18, false);
        org.jfree.data.pie.PieDataset pieDataset22 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset18, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset25 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset22, (java.lang.Comparable) 100L, (double) 1);
        org.jfree.data.pie.PieDataset pieDataset28 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset22, (java.lang.Comparable) (short) 1, 130.0d);
        org.jfree.data.category.CategoryDataset categoryDataset29 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) (-1L), (org.jfree.data.KeyedValues) pieDataset22);
        org.jfree.data.pie.PieDataset pieDataset32 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset22, (java.lang.Comparable) (byte) 1, (double) (short) -1);
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
        org.junit.Assert.assertNotNull(pieDataset32);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
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
        org.jfree.data.Range range34 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset23, false);
        boolean boolean35 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset23);
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
        org.junit.Assert.assertNotNull(range34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset17, false);
        org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset17);
        org.jfree.data.Range range22 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset17, (double) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset24 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset17, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 6");
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
        org.junit.Assert.assertNotNull(range22);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        java.lang.Number[] numberArray6 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray11 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray21 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray22 = new java.lang.Number[][] { numberArray6, numberArray11, numberArray16, numberArray21 };
        org.jfree.data.category.CategoryDataset categoryDataset23 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray22);
        org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset23);
        org.jfree.data.Range range26 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset23, true);
        java.lang.Number number27 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset23);
        org.jfree.data.Range range28 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset23);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset30 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset23, (java.lang.Comparable) 100);
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
        org.junit.Assert.assertEquals("'" + number27 + "' != '" + 1.0d + "'", number27, 1.0d);
        org.junit.Assert.assertNotNull(range28);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, false);
        org.jfree.data.pie.PieDataset pieDataset21 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset17, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset24 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset21, (java.lang.Comparable) 100L, (double) 1);
        org.jfree.data.pie.PieDataset pieDataset27 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset21, (java.lang.Comparable) (short) 1, 130.0d);
        java.lang.Class<?> wildcardClass28 = pieDataset21.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
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
        java.util.List list32 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range34 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(categoryDataset29, list32, false);
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
        org.junit.Assert.assertEquals("'" + number30 + "' != '" + 400.0d + "'", number30, 400.0d);
        org.junit.Assert.assertEquals("'" + number31 + "' != '" + 400.0d + "'", number31, 400.0d);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
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
        org.jfree.data.Range range34 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset23, false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset36 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset23, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 4");
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
        org.junit.Assert.assertEquals("'" + number27 + "' != '" + 1.0d + "'", number27, 1.0d);
        org.junit.Assert.assertNotNull(range29);
        org.junit.Assert.assertNotNull(range31);
        org.junit.Assert.assertNotNull(range32);
        org.junit.Assert.assertNotNull(range34);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        java.lang.Number[] numberArray6 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray11 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray21 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray22 = new java.lang.Number[][] { numberArray6, numberArray11, numberArray16, numberArray21 };
        org.jfree.data.category.CategoryDataset categoryDataset23 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray22);
        org.jfree.data.Range range25 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset23, false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset27 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset23, (java.lang.Comparable) (byte) 1);
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
        org.junit.Assert.assertNotNull(range25);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset31 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset23, (java.lang.Comparable) (byte) 10);
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
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        java.lang.Number[] numberArray8 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray18 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray23 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray24 = new java.lang.Number[][] { numberArray8, numberArray13, numberArray18, numberArray23 };
        org.jfree.data.category.CategoryDataset categoryDataset25 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray24);
        org.jfree.data.category.CategoryDataset categoryDataset26 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray24);
        org.jfree.data.Range range27 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset26);
        boolean boolean28 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset26);
        java.lang.Number number29 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(categoryDataset26);
        java.util.List list30 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range32 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(categoryDataset26, list30, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'visibleSeriesKeys' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray13);
        org.junit.Assert.assertNotNull(numberArray18);
        org.junit.Assert.assertNotNull(numberArray23);
        org.junit.Assert.assertNotNull(numberArray24);
        org.junit.Assert.assertNotNull(categoryDataset25);
        org.junit.Assert.assertNotNull(categoryDataset26);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + number29 + "' != '" + 100.0d + "'", number29, 100.0d);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        org.jfree.data.xy.TableXYDataset tableXYDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.jfree.data.general.DatasetUtilities.calculateStackTotal(tableXYDataset0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        java.lang.Number[] numberArray6 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray11 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray21 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray22 = new java.lang.Number[][] { numberArray6, numberArray11, numberArray16, numberArray21 };
        org.jfree.data.category.CategoryDataset categoryDataset23 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray22);
        org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset23);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset26 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset23, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 4");
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
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        java.lang.Number[] numberArray8 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray18 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray23 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray24 = new java.lang.Number[][] { numberArray8, numberArray13, numberArray18, numberArray23 };
        org.jfree.data.category.CategoryDataset categoryDataset25 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray24);
        org.jfree.data.Range range26 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset25);
        org.jfree.data.Range range28 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset25, true);
        java.lang.Number number29 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset25);
        org.jfree.data.Range range31 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset25, true);
        org.jfree.data.Range range33 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset25, true);
        org.jfree.data.Range range35 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset25, true);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range37 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(xYDataset0, list1, range35, false);
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
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertEquals("'" + number29 + "' != '" + 1.0d + "'", number29, 1.0d);
        org.junit.Assert.assertNotNull(range31);
        org.junit.Assert.assertNotNull(range33);
        org.junit.Assert.assertNotNull(range35);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        org.jfree.data.function.Function2D function2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries5 = org.jfree.data.general.DatasetUtilities.sampleFunction2DToSeries(function2D0, 0.0d, (double) 10, (int) (byte) 0, (java.lang.Comparable) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        org.jfree.data.function.Function2D function2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataset xYDataset5 = org.jfree.data.general.DatasetUtilities.sampleFunction2D(function2D0, (double) 0L, (double) 0L, (int) '4', (java.lang.Comparable) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        java.lang.Number[] numberArray8 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray18 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray23 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray24 = new java.lang.Number[][] { numberArray8, numberArray13, numberArray18, numberArray23 };
        org.jfree.data.category.CategoryDataset categoryDataset25 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray24);
        org.jfree.data.Range range26 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset25);
        org.jfree.data.Range range28 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset25, true);
        java.lang.Number number29 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset25);
        org.jfree.data.Range range30 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset25);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range32 = org.jfree.data.general.DatasetUtilities.findRangeBounds(xYDataset0, list1, range30, false);
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
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertEquals("'" + number29 + "' != '" + 1.0d + "'", number29, 1.0d);
        org.junit.Assert.assertNotNull(range30);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        double[] doubleArray10 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray17 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray18 = new double[][] { doubleArray10, doubleArray17 };
        org.jfree.data.category.CategoryDataset categoryDataset19 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray18);
        org.jfree.data.Range range21 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset19, false);
        org.jfree.data.Range range22 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset19);
        org.jfree.data.Range range23 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset19);
        java.lang.Number number24 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset19);
        org.jfree.data.Range range26 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset19, true);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range28 = org.jfree.data.general.DatasetUtilities.findRangeBounds(xYDataset0, list1, range26, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(categoryDataset19);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertEquals("'" + number24 + "' != '" + 0.0d + "'", number24, 0.0d);
        org.junit.Assert.assertNotNull(range26);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        double[] doubleArray9 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray16 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray17 = new double[][] { doubleArray9, doubleArray16 };
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray17);
        org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset18, false);
        org.jfree.data.pie.PieDataset pieDataset22 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset18, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset25 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset22, (java.lang.Comparable) 100L, (double) 1);
        org.jfree.data.pie.PieDataset pieDataset28 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset22, (java.lang.Comparable) (short) 1, 130.0d);
        org.jfree.data.category.CategoryDataset categoryDataset29 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) (-1L), (org.jfree.data.KeyedValues) pieDataset22);
        org.jfree.data.KeyToGroupMap keyToGroupMap30 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range31 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset29, keyToGroupMap30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNotNull(pieDataset28);
        org.junit.Assert.assertNotNull(categoryDataset29);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.jfree.data.xy.TableXYDataset tableXYDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(tableXYDataset0, (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        java.lang.Comparable[] comparableArray2 = new java.lang.Comparable[] { false, (byte) 0 };
        java.lang.Comparable[] comparableArray3 = new java.lang.Comparable[] {};
        double[][] doubleArray4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.category.CategoryDataset categoryDataset5 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray2, comparableArray3, doubleArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparableArray2);
        org.junit.Assert.assertNotNull(comparableArray3);
        org.junit.Assert.assertArrayEquals(comparableArray3, new java.lang.Comparable[] {});
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        org.jfree.data.function.Function2D function2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataset xYDataset5 = org.jfree.data.general.DatasetUtilities.sampleFunction2D(function2D0, 100.0d, (double) 10, (int) ' ', (java.lang.Comparable) 130.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range30 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(xYDataset0, list1, range28, false);
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
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        java.lang.Number[] numberArray6 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray11 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray21 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray22 = new java.lang.Number[][] { numberArray6, numberArray11, numberArray16, numberArray21 };
        org.jfree.data.category.CategoryDataset categoryDataset23 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray22);
        org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset23);
        org.jfree.data.Range range25 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset23);
        java.lang.Number number26 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(categoryDataset23);
        java.lang.Comparable comparable27 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset28 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset23, comparable27);
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
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertEquals("'" + number26 + "' != '" + 100.0d + "'", number26, 100.0d);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, false);
        org.jfree.data.pie.PieDataset pieDataset21 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset17, (int) (short) 0);
        java.lang.Number number22 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(categoryDataset17);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset24 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset17, (java.lang.Comparable) 1.0d);
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
        org.junit.Assert.assertNotNull(pieDataset21);
        org.junit.Assert.assertEquals("'" + number22 + "' != '" + 100.0d + "'", number22, 100.0d);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        org.jfree.data.function.Function2D function2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries5 = org.jfree.data.general.DatasetUtilities.sampleFunction2DToSeries(function2D0, (double) (byte) 0, (double) (byte) 0, (int) '#', (java.lang.Comparable) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        double[] doubleArray10 = new double[] { (short) 0, (byte) 0 };
        double[][] doubleArray11 = new double[][] { doubleArray10 };
        org.jfree.data.category.CategoryDataset categoryDataset12 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray11);
        org.jfree.data.category.CategoryDataset categoryDataset13 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray11);
        org.jfree.data.category.CategoryDataset categoryDataset14 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray11);
        org.jfree.data.category.CategoryDataset categoryDataset15 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray11);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset17 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset15, (java.lang.Comparable) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertNotNull(categoryDataset12);
        org.junit.Assert.assertNotNull(categoryDataset13);
        org.junit.Assert.assertNotNull(categoryDataset14);
        org.junit.Assert.assertNotNull(categoryDataset15);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        double[] doubleArray4 = new double[] { (short) 0, (byte) 0 };
        double[][] doubleArray5 = new double[][] { doubleArray4 };
        org.jfree.data.category.CategoryDataset categoryDataset6 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray5);
        org.jfree.data.pie.PieDataset pieDataset8 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset6, 0);
        org.jfree.data.pie.PieDataset pieDataset12 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset8, (java.lang.Comparable) 100.0d, (double) 'a', 1);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(categoryDataset6);
        org.junit.Assert.assertNotNull(pieDataset8);
        org.junit.Assert.assertNotNull(pieDataset12);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        java.lang.Number[] numberArray10 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray15 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray20 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray25 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray26 = new java.lang.Number[][] { numberArray10, numberArray15, numberArray20, numberArray25 };
        org.jfree.data.category.CategoryDataset categoryDataset27 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray26);
        org.jfree.data.category.CategoryDataset categoryDataset28 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray26);
        org.jfree.data.category.CategoryDataset categoryDataset29 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray26);
        java.lang.Number number30 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset29);
        boolean boolean31 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset29);
        java.util.List list32 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range34 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset29, list32, false);
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
        org.junit.Assert.assertEquals("'" + number30 + "' != '" + 1.0d + "'", number30, 1.0d);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        java.lang.Number[] numberArray6 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray11 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray21 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray22 = new java.lang.Number[][] { numberArray6, numberArray11, numberArray16, numberArray21 };
        org.jfree.data.category.CategoryDataset categoryDataset23 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray22);
        org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset23);
        org.jfree.data.Range range26 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset23, true);
        java.lang.Number number27 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset23);
        java.util.List list28 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range30 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(categoryDataset23, list28, true);
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
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        org.jfree.data.Range range2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range4 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(xYDataset0, list1, range2, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
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
        java.util.List list30 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range32 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(categoryDataset23, list30, true);
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
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        java.lang.Comparable[] comparableArray6 = new java.lang.Comparable[] { ' ', (-1L), 0.0f, "hi!", 400.0d, (-1L) };
        java.lang.Comparable[] comparableArray10 = new java.lang.Comparable[] { 10, 1.0d, 1 };
        double[] doubleArray17 = new double[] {};
        double[][] doubleArray18 = new double[][] { doubleArray17 };
        org.jfree.data.category.CategoryDataset categoryDataset19 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray18);
        org.jfree.data.category.CategoryDataset categoryDataset20 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray18);
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray18);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.category.CategoryDataset categoryDataset22 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray6, comparableArray10, doubleArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Duplicate items in 'rowKeys'.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparableArray6);
        org.junit.Assert.assertNotNull(comparableArray10);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(categoryDataset19);
        org.junit.Assert.assertNotNull(categoryDataset20);
        org.junit.Assert.assertNotNull(categoryDataset21);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        org.jfree.data.xy.TableXYDataset tableXYDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(tableXYDataset0, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, false);
        org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset17);
        org.jfree.data.Range range21 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset17);
        java.lang.Number number22 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset17);
        org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, true);
        java.lang.Number number25 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset17);
        org.jfree.data.KeyToGroupMap keyToGroupMap26 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range27 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset17, keyToGroupMap26);
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
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertEquals("'" + number22 + "' != '" + 0.0d + "'", number22, 0.0d);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertEquals("'" + number25 + "' != '" + 0.0d + "'", number25, 0.0d);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        double[] doubleArray9 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray16 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray17 = new double[][] { doubleArray9, doubleArray16 };
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray17);
        org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset18, false);
        org.jfree.data.pie.PieDataset pieDataset22 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset18, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset25 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset22, (java.lang.Comparable) 100L, (double) 1);
        org.jfree.data.category.CategoryDataset categoryDataset26 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) (-1L), (org.jfree.data.KeyedValues) pieDataset25);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset28 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset26, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
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
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        org.jfree.data.xy.TableXYDataset tableXYDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.jfree.data.general.DatasetUtilities.calculateStackTotal(tableXYDataset0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        java.lang.Number[] numberArray6 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray11 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray21 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray22 = new java.lang.Number[][] { numberArray6, numberArray11, numberArray16, numberArray21 };
        org.jfree.data.category.CategoryDataset categoryDataset23 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray22);
        org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset23);
        java.lang.Number number25 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset23);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset27 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset23, (java.lang.Comparable) (byte) -1);
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
        org.junit.Assert.assertEquals("'" + number25 + "' != '" + 400.0d + "'", number25, 400.0d);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        double[] doubleArray6 = new double[] { (short) 0, (byte) 0 };
        double[][] doubleArray7 = new double[][] { doubleArray6 };
        org.jfree.data.category.CategoryDataset categoryDataset8 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray7);
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray7);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, (java.lang.Comparable) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertNotNull(categoryDataset8);
        org.junit.Assert.assertNotNull(categoryDataset9);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        java.lang.Number[] numberArray6 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray11 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray21 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray22 = new java.lang.Number[][] { numberArray6, numberArray11, numberArray16, numberArray21 };
        org.jfree.data.category.CategoryDataset categoryDataset23 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray22);
        org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset23);
        org.jfree.data.Range range26 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset23, true);
        java.lang.Number number27 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset23);
        org.jfree.data.Range range28 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset23);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset30 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset23, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 4");
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
        org.junit.Assert.assertEquals("'" + number27 + "' != '" + 1.0d + "'", number27, 1.0d);
        org.junit.Assert.assertNotNull(range28);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        double[] doubleArray8 = new double[] { (short) 0, (byte) 0 };
        double[][] doubleArray9 = new double[][] { doubleArray8 };
        org.jfree.data.category.CategoryDataset categoryDataset10 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray9);
        org.jfree.data.category.CategoryDataset categoryDataset11 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray9);
        org.jfree.data.category.CategoryDataset categoryDataset12 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray9);
        java.util.List list13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range15 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset12, list13, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'visibleSeriesKeys' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertNotNull(categoryDataset10);
        org.junit.Assert.assertNotNull(categoryDataset11);
        org.junit.Assert.assertNotNull(categoryDataset12);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        java.lang.Comparable[] comparableArray4 = new java.lang.Comparable[] { 10.0f, 0.0d, 100L, ' ' };
        java.lang.Comparable[] comparableArray10 = new java.lang.Comparable[] { 1, (short) 100, 0.0f, false, 130.0d };
        double[] doubleArray19 = new double[] { (short) 0, (byte) 0 };
        double[][] doubleArray20 = new double[][] { doubleArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray20);
        org.jfree.data.category.CategoryDataset categoryDataset22 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray20);
        org.jfree.data.category.CategoryDataset categoryDataset23 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray20);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.category.CategoryDataset categoryDataset24 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray4, comparableArray10, doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The number of row keys does not match the number of rows in the data array.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparableArray4);
        org.junit.Assert.assertNotNull(comparableArray10);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertNotNull(categoryDataset21);
        org.junit.Assert.assertNotNull(categoryDataset22);
        org.junit.Assert.assertNotNull(categoryDataset23);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, false);
        org.jfree.data.pie.PieDataset pieDataset21 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset17, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset24 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset21, (java.lang.Comparable) ' ', (double) '#');
        org.jfree.data.pie.PieDataset pieDataset28 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset24, (java.lang.Comparable) false, (double) 10L, (int) (short) 100);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertNotNull(categoryDataset17);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertNotNull(pieDataset21);
        org.junit.Assert.assertNotNull(pieDataset24);
        org.junit.Assert.assertNotNull(pieDataset28);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset33 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset23, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 4");
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
        org.junit.Assert.assertEquals("'" + number27 + "' != '" + 1.0d + "'", number27, 1.0d);
        org.junit.Assert.assertNotNull(range29);
        org.junit.Assert.assertNotNull(range31);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.jfree.data.function.Function2D function2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries5 = org.jfree.data.general.DatasetUtilities.sampleFunction2DToSeries(function2D0, (double) 'a', (double) (short) 1, 1, (java.lang.Comparable) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset31 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset23, (java.lang.Comparable) 1);
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
        org.junit.Assert.assertEquals("'" + number27 + "' != '" + 1.0d + "'", number27, 1.0d);
        org.junit.Assert.assertNotNull(range29);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset17, false);
        java.lang.Number number20 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset17);
        org.jfree.data.pie.PieDataset pieDataset22 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset17, 0);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertNotNull(categoryDataset17);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertEquals("'" + number20 + "' != '" + 0.0d + "'", number20, 0.0d);
        org.junit.Assert.assertNotNull(pieDataset22);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset33 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset29, (java.lang.Comparable) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 4");
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
        org.junit.Assert.assertEquals("'" + number30 + "' != '" + 100.0d + "'", number30, 100.0d);
        org.junit.Assert.assertEquals("'" + number31 + "' != '" + 400.0d + "'", number31, 400.0d);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        double[] doubleArray10 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray17 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray18 = new double[][] { doubleArray10, doubleArray17 };
        org.jfree.data.category.CategoryDataset categoryDataset19 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray18);
        org.jfree.data.Range range21 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset19, false);
        org.jfree.data.pie.PieDataset pieDataset23 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset19, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset26 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset23, (java.lang.Comparable) 100L, (double) 1);
        org.jfree.data.category.CategoryDataset categoryDataset27 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 130.0d, (org.jfree.data.KeyedValues) pieDataset26);
        org.jfree.data.category.CategoryDataset categoryDataset28 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) (byte) 100, (org.jfree.data.KeyedValues) pieDataset26);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset30 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset28, (java.lang.Comparable) (-1.0f));
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
        org.junit.Assert.assertNotNull(categoryDataset27);
        org.junit.Assert.assertNotNull(categoryDataset28);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset2 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        java.lang.Comparable comparable0 = null;
        double[] doubleArray9 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray16 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray17 = new double[][] { doubleArray9, doubleArray16 };
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray17);
        org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset18, false);
        org.jfree.data.pie.PieDataset pieDataset22 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset18, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset25 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset22, (java.lang.Comparable) 100L, (double) 1);
        org.jfree.data.pie.PieDataset pieDataset29 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset22, (java.lang.Comparable) false, (double) 100.0f, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.category.CategoryDataset categoryDataset30 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparable0, (org.jfree.data.KeyedValues) pieDataset29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'rowKey' argument.");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(pieDataset29);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        java.lang.Number[] numberArray6 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray11 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray21 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray22 = new java.lang.Number[][] { numberArray6, numberArray11, numberArray16, numberArray21 };
        org.jfree.data.category.CategoryDataset categoryDataset23 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray22);
        org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset23);
        org.jfree.data.Range range26 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset23, true);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset28 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset23, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 4");
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
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, false);
        org.jfree.data.pie.PieDataset pieDataset21 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset17, (int) (short) 0);
        double double22 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset21);
        boolean boolean23 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset21);
        org.jfree.data.pie.PieDataset pieDataset26 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset21, (java.lang.Comparable) (-1L), 400.0d);
        java.lang.Class<?> wildcardClass27 = pieDataset21.getClass();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertNotNull(categoryDataset17);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertNotNull(pieDataset21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 130.0d + "'", double22 == 130.0d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(pieDataset26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        double[] doubleArray9 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray16 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray17 = new double[][] { doubleArray9, doubleArray16 };
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray17);
        org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset18, false);
        org.jfree.data.pie.PieDataset pieDataset22 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset18, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset25 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset22, (java.lang.Comparable) 100L, (double) 1);
        org.jfree.data.category.CategoryDataset categoryDataset26 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 10.0f, (org.jfree.data.KeyedValues) pieDataset25);
        org.jfree.data.pie.PieDataset pieDataset29 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset25, (java.lang.Comparable) 100L, 400.0d);
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
        org.junit.Assert.assertNotNull(pieDataset29);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        org.jfree.data.function.Function2D function2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries5 = org.jfree.data.general.DatasetUtilities.sampleFunction2DToSeries(function2D0, (double) '#', (double) (short) 0, 0, (java.lang.Comparable) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
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
        java.lang.Class<?> wildcardClass32 = range31.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        java.lang.Number[] numberArray8 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray18 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray23 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray24 = new java.lang.Number[][] { numberArray8, numberArray13, numberArray18, numberArray23 };
        org.jfree.data.category.CategoryDataset categoryDataset25 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray24);
        org.jfree.data.category.CategoryDataset categoryDataset26 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray24);
        org.jfree.data.Range range27 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset26);
        org.jfree.data.Range range29 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset26, (double) 'a');
        java.util.List list30 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range32 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(categoryDataset26, list30, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'visibleSeriesKeys' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray13);
        org.junit.Assert.assertNotNull(numberArray18);
        org.junit.Assert.assertNotNull(numberArray23);
        org.junit.Assert.assertNotNull(numberArray24);
        org.junit.Assert.assertNotNull(categoryDataset25);
        org.junit.Assert.assertNotNull(categoryDataset26);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertNotNull(range29);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        java.lang.Number[] numberArray8 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray18 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray23 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray24 = new java.lang.Number[][] { numberArray8, numberArray13, numberArray18, numberArray23 };
        org.jfree.data.category.CategoryDataset categoryDataset25 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray24);
        java.lang.Number number26 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(categoryDataset25);
        org.jfree.data.Range range28 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset25, true);
        org.jfree.data.Range range30 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset25, true);
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
        org.junit.Assert.assertNotNull(range30);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
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
        java.lang.Number number35 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset23);
        java.lang.Number number36 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset23);
        java.util.List list37 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range39 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset23, list37, false);
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
        org.junit.Assert.assertNotNull(range31);
        org.junit.Assert.assertNotNull(range33);
        org.junit.Assert.assertEquals("'" + number34 + "' != '" + 1.0d + "'", number34, 1.0d);
        org.junit.Assert.assertEquals("'" + number35 + "' != '" + 0.0d + "'", number35, 0.0d);
        org.junit.Assert.assertEquals("'" + number36 + "' != '" + 0.0d + "'", number36, 0.0d);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        org.jfree.data.xy.TableXYDataset tableXYDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(tableXYDataset0, 200.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset2 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        org.jfree.data.function.Function2D function2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataset xYDataset5 = org.jfree.data.general.DatasetUtilities.sampleFunction2D(function2D0, (double) (byte) 1, (double) 10, 100, (java.lang.Comparable) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        org.jfree.data.function.Function2D function2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries5 = org.jfree.data.general.DatasetUtilities.sampleFunction2DToSeries(function2D0, 0.0d, (double) 0, 10, (java.lang.Comparable) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        java.lang.Number[] numberArray6 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray11 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray21 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray22 = new java.lang.Number[][] { numberArray6, numberArray11, numberArray16, numberArray21 };
        org.jfree.data.category.CategoryDataset categoryDataset23 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray22);
        org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset23);
        org.jfree.data.Range range26 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset23, true);
        java.lang.Number number27 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset23);
        boolean boolean28 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset23);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset30 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset23, (java.lang.Comparable) 200.0d);
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
        org.junit.Assert.assertEquals("'" + number27 + "' != '" + 1.0d + "'", number27, 1.0d);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        java.lang.Number[] numberArray6 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray11 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray21 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray22 = new java.lang.Number[][] { numberArray6, numberArray11, numberArray16, numberArray21 };
        org.jfree.data.category.CategoryDataset categoryDataset23 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray22);
        org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset23);
        java.lang.Number number25 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset23);
        org.jfree.data.Range range26 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset23);
        org.jfree.data.Range range27 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset23);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset29 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset23, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 4");
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
        org.junit.Assert.assertNotNull(range27);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset2 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset0, (java.lang.Comparable) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, false);
        java.lang.Number number20 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(categoryDataset17);
        org.jfree.data.KeyToGroupMap keyToGroupMap21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range22 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset17, keyToGroupMap21);
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
        org.junit.Assert.assertEquals("'" + number20 + "' != '" + 100.0d + "'", number20, 100.0d);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        org.jfree.data.xy.TableXYDataset tableXYDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.jfree.data.general.DatasetUtilities.calculateStackTotal(tableXYDataset0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        java.lang.Number number18 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset17);
        boolean boolean19 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset17);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset21 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset17, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertNotNull(categoryDataset17);
        org.junit.Assert.assertEquals("'" + number18 + "' != '" + 0.0d + "'", number18, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        java.lang.Number[] numberArray6 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray11 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray21 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray22 = new java.lang.Number[][] { numberArray6, numberArray11, numberArray16, numberArray21 };
        org.jfree.data.category.CategoryDataset categoryDataset23 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray22);
        org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset23);
        org.jfree.data.Range range26 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset23, false);
        java.lang.Class<?> wildcardClass27 = categoryDataset23.getClass();
        org.junit.Assert.assertNotNull(numberArray6);
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertNotNull(numberArray16);
        org.junit.Assert.assertNotNull(numberArray21);
        org.junit.Assert.assertNotNull(numberArray22);
        org.junit.Assert.assertNotNull(categoryDataset23);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        java.lang.Number[] numberArray8 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray18 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray23 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray24 = new java.lang.Number[][] { numberArray8, numberArray13, numberArray18, numberArray23 };
        org.jfree.data.category.CategoryDataset categoryDataset25 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray24);
        org.jfree.data.Range range26 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset25);
        org.jfree.data.Range range28 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset25, false);
        org.jfree.data.Range range30 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset25, true);
        org.jfree.data.Range range31 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset25);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range33 = org.jfree.data.general.DatasetUtilities.findRangeBounds(xYDataset0, list1, range31, true);
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
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertNotNull(range30);
        org.junit.Assert.assertNotNull(range31);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        java.lang.Number[] numberArray6 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray11 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray21 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray22 = new java.lang.Number[][] { numberArray6, numberArray11, numberArray16, numberArray21 };
        org.jfree.data.category.CategoryDataset categoryDataset23 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray22);
        java.lang.Number number24 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(categoryDataset23);
        org.jfree.data.Range range26 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset23, true);
        org.jfree.data.Range range28 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset23, (double) (-1.0f));
        java.util.List list29 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range31 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset23, list29, true);
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
        org.junit.Assert.assertEquals("'" + number24 + "' != '" + 100.0d + "'", number24, 100.0d);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range28);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
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
        java.util.List list30 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range32 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset23, list30, false);
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
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertNotNull(range29);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        double[] doubleArray10 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray17 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray18 = new double[][] { doubleArray10, doubleArray17 };
        org.jfree.data.category.CategoryDataset categoryDataset19 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray18);
        org.jfree.data.Range range21 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset19, false);
        org.jfree.data.pie.PieDataset pieDataset23 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset19, (int) (short) 0);
        org.jfree.data.Range range25 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset19, false);
        org.jfree.data.Range range27 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset19, false);
        org.jfree.data.Range range29 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset19, true);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range31 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(xYDataset0, list1, range29, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertNotNull(range29);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset17, false);
        org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset17);
        org.jfree.data.Range range22 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset17, (double) 1);
        org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, true);
        java.util.List list25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range27 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset17, list25, false);
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
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertNotNull(range24);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        double[] doubleArray6 = new double[] {};
        double[][] doubleArray7 = new double[][] { doubleArray6 };
        org.jfree.data.category.CategoryDataset categoryDataset8 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray7);
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray7);
        org.jfree.data.category.CategoryDataset categoryDataset10 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray7);
        org.jfree.data.Range range11 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = range11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertNotNull(categoryDataset8);
        org.junit.Assert.assertNotNull(categoryDataset9);
        org.junit.Assert.assertNotNull(categoryDataset10);
        org.junit.Assert.assertNull(range11);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        double[] doubleArray10 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray17 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray18 = new double[][] { doubleArray10, doubleArray17 };
        org.jfree.data.category.CategoryDataset categoryDataset19 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray18);
        org.jfree.data.Range range21 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset19, false);
        org.jfree.data.Range range22 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset19);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.findRangeBounds(xYDataset0, list1, range22, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(categoryDataset19);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertNotNull(range22);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        java.lang.Number[] numberArray6 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray11 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray21 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray22 = new java.lang.Number[][] { numberArray6, numberArray11, numberArray16, numberArray21 };
        org.jfree.data.category.CategoryDataset categoryDataset23 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray22);
        org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset23);
        org.jfree.data.Range range26 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset23, false);
        boolean boolean27 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset23);
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
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        org.jfree.data.xy.TableXYDataset tableXYDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(tableXYDataset0, (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
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
        boolean boolean31 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset22);
        org.jfree.data.pie.PieDataset pieDataset35 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset22, (java.lang.Comparable) (-1L), (double) 1.0f, (int) (short) 100);
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
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(pieDataset35);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        java.lang.Number[] numberArray12 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray17 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray22 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray27 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray28 = new java.lang.Number[][] { numberArray12, numberArray17, numberArray22, numberArray27 };
        org.jfree.data.category.CategoryDataset categoryDataset29 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray28);
        org.jfree.data.category.CategoryDataset categoryDataset30 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray28);
        org.jfree.data.category.CategoryDataset categoryDataset31 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray28);
        org.jfree.data.category.CategoryDataset categoryDataset32 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray28);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset34 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset32, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray12);
        org.junit.Assert.assertNotNull(numberArray17);
        org.junit.Assert.assertNotNull(numberArray22);
        org.junit.Assert.assertNotNull(numberArray27);
        org.junit.Assert.assertNotNull(numberArray28);
        org.junit.Assert.assertNotNull(categoryDataset29);
        org.junit.Assert.assertNotNull(categoryDataset30);
        org.junit.Assert.assertNotNull(categoryDataset31);
        org.junit.Assert.assertNotNull(categoryDataset32);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        java.lang.Comparable[] comparableArray6 = new java.lang.Comparable[] { 100.0d, 130.0d, 0, 10.0d, 0.0d, (byte) -1 };
        java.lang.Comparable[] comparableArray13 = new java.lang.Comparable[] { (byte) 0, (short) 10, (-1L), (short) 100, 10.0d, false };
        double[] doubleArray18 = new double[] { (short) 0, (byte) 0 };
        double[][] doubleArray19 = new double[][] { doubleArray18 };
        org.jfree.data.category.CategoryDataset categoryDataset20 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray19);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray6, comparableArray13, doubleArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The number of row keys does not match the number of rows in the data array.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparableArray6);
        org.junit.Assert.assertNotNull(comparableArray13);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertNotNull(categoryDataset20);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        java.lang.Number number18 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset17);
        boolean boolean19 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset17);
        java.lang.Number number20 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset17);
        org.jfree.data.Range range22 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset17, (double) 0);
        java.lang.Number number23 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset17);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset25 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset17, (-1));
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
        org.junit.Assert.assertEquals("'" + number18 + "' != '" + 0.0d + "'", number18, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + number20 + "' != '" + 200.0d + "'", number20, 200.0d);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertEquals("'" + number23 + "' != '" + 200.0d + "'", number23, 200.0d);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        org.jfree.data.function.Function2D function2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataset xYDataset5 = org.jfree.data.general.DatasetUtilities.sampleFunction2D(function2D0, (double) (byte) 100, (double) 100.0f, (int) (short) 0, (java.lang.Comparable) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        double[] doubleArray9 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray16 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray17 = new double[][] { doubleArray9, doubleArray16 };
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray17);
        org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset18, false);
        org.jfree.data.pie.PieDataset pieDataset22 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset18, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset25 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset22, (java.lang.Comparable) 100L, (double) 1);
        org.jfree.data.category.CategoryDataset categoryDataset26 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 130.0d, (org.jfree.data.KeyedValues) pieDataset25);
        java.util.List list27 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range29 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset26, list27, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'visibleSeriesKeys' argument.");
        } catch (java.lang.IllegalArgumentException e) {
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
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        org.jfree.data.function.Function2D function2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataset xYDataset5 = org.jfree.data.general.DatasetUtilities.sampleFunction2D(function2D0, (double) 100.0f, (double) 0L, 0, (java.lang.Comparable) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        org.jfree.data.xy.TableXYDataset tableXYDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(tableXYDataset0, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        java.lang.Number number18 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(categoryDataset17);
        org.jfree.data.KeyToGroupMap keyToGroupMap19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset17, keyToGroupMap19);
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
        org.junit.Assert.assertEquals("'" + number18 + "' != '" + 100.0d + "'", number18, 100.0d);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.data.KeyToGroupMap keyToGroupMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset0, keyToGroupMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        org.jfree.data.xy.TableXYDataset tableXYDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.jfree.data.general.DatasetUtilities.calculateStackTotal(tableXYDataset0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, false);
        org.jfree.data.pie.PieDataset pieDataset21 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset17, (int) (short) 0);
        org.jfree.data.Range range22 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset17);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset24 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset17, (java.lang.Comparable) 100L);
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
        org.junit.Assert.assertNotNull(pieDataset21);
        org.junit.Assert.assertNotNull(range22);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        java.lang.Comparable[] comparableArray4 = new java.lang.Comparable[] { 1.0f, 100, (byte) 100, 10L };
        java.lang.Comparable[] comparableArray10 = new java.lang.Comparable[] { 'a', 100, (short) 1, (-1L), 10.0f };
        double[] doubleArray19 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray26 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray27 = new double[][] { doubleArray19, doubleArray26 };
        org.jfree.data.category.CategoryDataset categoryDataset28 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray27);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.category.CategoryDataset categoryDataset29 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray4, comparableArray10, doubleArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The number of row keys does not match the number of rows in the data array.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparableArray4);
        org.junit.Assert.assertNotNull(comparableArray10);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertArrayEquals(doubleArray26, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertNotNull(categoryDataset28);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        double[] doubleArray10 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray17 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray18 = new double[][] { doubleArray10, doubleArray17 };
        org.jfree.data.category.CategoryDataset categoryDataset19 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray18);
        org.jfree.data.Range range21 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset19, false);
        org.jfree.data.Range range22 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset19);
        org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset19, false);
        java.lang.Number number25 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset19);
        org.jfree.data.Range range26 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset19);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range28 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(xYDataset0, list1, range26, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(categoryDataset19);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertEquals("'" + number25 + "' != '" + 0.0d + "'", number25, 0.0d);
        org.junit.Assert.assertNotNull(range26);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset27 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset17, (java.lang.Comparable) 400.0d);
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
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertEquals("'" + number25 + "' != '" + 200.0d + "'", number25, 200.0d);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
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
        org.jfree.data.Range range28 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset17, true);
        java.util.List list29 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range31 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset17, list29, false);
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
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertEquals("'" + number22 + "' != '" + 0.0d + "'", number22, 0.0d);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range28);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, false);
        org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset17);
        org.jfree.data.Range range21 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset17);
        java.lang.Number number22 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset17);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset24 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset17, (java.lang.Comparable) 0.0d);
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
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
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
        org.jfree.data.KeyToGroupMap keyToGroupMap35 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range36 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset23, keyToGroupMap35);
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
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.jfree.data.function.Function2D function2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataset xYDataset5 = org.jfree.data.general.DatasetUtilities.sampleFunction2D(function2D0, (double) '#', (double) 1, (int) '4', (java.lang.Comparable) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset0, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        double[] doubleArray2 = new double[] {};
        double[][] doubleArray3 = new double[][] { doubleArray2 };
        org.jfree.data.category.CategoryDataset categoryDataset4 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray3);
        org.jfree.data.pie.PieDataset pieDataset6 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset4, (java.lang.Comparable) (-1.0f));
        org.jfree.data.KeyToGroupMap keyToGroupMap7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range8 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset4, keyToGroupMap7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(categoryDataset4);
        org.junit.Assert.assertNotNull(pieDataset6);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        double[] doubleArray4 = new double[] { (short) 0, (byte) 0 };
        double[][] doubleArray5 = new double[][] { doubleArray4 };
        org.jfree.data.category.CategoryDataset categoryDataset6 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray5);
        org.jfree.data.pie.PieDataset pieDataset8 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset6, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset10 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset6, (java.lang.Comparable) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(categoryDataset6);
        org.junit.Assert.assertNotNull(pieDataset8);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, false);
        org.jfree.data.pie.PieDataset pieDataset21 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset17, (int) (short) 0);
        org.jfree.data.Range range22 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset17);
        java.util.List list23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range25 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset17, list23, true);
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
        org.junit.Assert.assertNotNull(range22);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset29 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset17, (java.lang.Comparable) ' ');
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
        org.junit.Assert.assertNotNull(pieDataset21);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertEquals("'" + number24 + "' != '" + 200.0d + "'", number24, 200.0d);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        org.jfree.data.function.Function2D function2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries5 = org.jfree.data.general.DatasetUtilities.sampleFunction2DToSeries(function2D0, (double) 1L, (double) (-1), (int) (short) 1, (java.lang.Comparable) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        java.lang.Number[] numberArray6 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray11 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray21 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray22 = new java.lang.Number[][] { numberArray6, numberArray11, numberArray16, numberArray21 };
        org.jfree.data.category.CategoryDataset categoryDataset23 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray22);
        org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset23);
        org.jfree.data.Range range26 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset23, true);
        java.lang.Number number27 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset23);
        org.jfree.data.Range range28 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset23);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset30 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset23, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 4");
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
        org.junit.Assert.assertEquals("'" + number27 + "' != '" + 1.0d + "'", number27, 1.0d);
        org.junit.Assert.assertNotNull(range28);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        double[] doubleArray10 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray17 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray18 = new double[][] { doubleArray10, doubleArray17 };
        org.jfree.data.category.CategoryDataset categoryDataset19 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray18);
        org.jfree.data.Range range21 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset19, false);
        org.jfree.data.pie.PieDataset pieDataset23 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset19, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset26 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset23, (java.lang.Comparable) 100L, (double) 1);
        org.jfree.data.category.CategoryDataset categoryDataset27 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 130.0d, (org.jfree.data.KeyedValues) pieDataset26);
        org.jfree.data.category.CategoryDataset categoryDataset28 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) (byte) 100, (org.jfree.data.KeyedValues) pieDataset26);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset30 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset28, (java.lang.Comparable) 10L);
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
        org.junit.Assert.assertNotNull(categoryDataset27);
        org.junit.Assert.assertNotNull(categoryDataset28);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        org.jfree.data.xy.TableXYDataset tableXYDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.jfree.data.general.DatasetUtilities.calculateStackTotal(tableXYDataset0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset33 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset29, (java.lang.Comparable) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 4");
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
        org.junit.Assert.assertEquals("'" + number30 + "' != '" + 100.0d + "'", number30, 100.0d);
        org.junit.Assert.assertEquals("'" + number31 + "' != '" + 400.0d + "'", number31, 400.0d);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        java.lang.Number[] numberArray8 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray18 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray23 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray24 = new java.lang.Number[][] { numberArray8, numberArray13, numberArray18, numberArray23 };
        org.jfree.data.category.CategoryDataset categoryDataset25 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray24);
        org.jfree.data.Range range26 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset25);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range28 = org.jfree.data.general.DatasetUtilities.findRangeBounds(xYDataset0, list1, range26, true);
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
        org.junit.Assert.assertNotNull(range26);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        double[] doubleArray4 = new double[] {};
        double[][] doubleArray5 = new double[][] { doubleArray4 };
        org.jfree.data.category.CategoryDataset categoryDataset6 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray5);
        org.jfree.data.category.CategoryDataset categoryDataset7 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray5);
        boolean boolean8 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset7);
        org.jfree.data.pie.PieDataset pieDataset10 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset7, (int) ' ');
        org.jfree.data.Range range12 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset7, true);
        org.jfree.data.Range range14 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset7, 1.0d);
        org.jfree.data.pie.PieDataset pieDataset16 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset7, (int) (byte) 0);
        java.lang.Class<?> wildcardClass17 = pieDataset16.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        org.jfree.data.xy.TableXYDataset tableXYDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(tableXYDataset0, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        double[] doubleArray4 = new double[] { (short) 0, (byte) 0 };
        double[][] doubleArray5 = new double[][] { doubleArray4 };
        org.jfree.data.category.CategoryDataset categoryDataset6 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray5);
        java.lang.Number number7 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset6);
        boolean boolean8 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset6);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(categoryDataset6);
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + 0.0d + "'", number7, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        java.lang.Number[] numberArray8 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray18 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray23 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray24 = new java.lang.Number[][] { numberArray8, numberArray13, numberArray18, numberArray23 };
        org.jfree.data.category.CategoryDataset categoryDataset25 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray24);
        org.jfree.data.Range range27 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset25, true);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range29 = org.jfree.data.general.DatasetUtilities.findRangeBounds(xYDataset0, list1, range27, true);
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
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        java.lang.Number[] numberArray6 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray11 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray21 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray22 = new java.lang.Number[][] { numberArray6, numberArray11, numberArray16, numberArray21 };
        org.jfree.data.category.CategoryDataset categoryDataset23 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray22);
        org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset23);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset26 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset23, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 4");
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
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset17, false);
        org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset17);
        org.jfree.data.Range range22 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset17, (double) 1);
        boolean boolean23 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset17);
        org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset17);
        java.util.List list25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range27 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset17, list25, false);
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
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(range24);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        java.lang.Number[] numberArray12 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray17 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray22 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray27 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray28 = new java.lang.Number[][] { numberArray12, numberArray17, numberArray22, numberArray27 };
        org.jfree.data.category.CategoryDataset categoryDataset29 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray28);
        org.jfree.data.category.CategoryDataset categoryDataset30 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray28);
        org.jfree.data.category.CategoryDataset categoryDataset31 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray28);
        org.jfree.data.category.CategoryDataset categoryDataset32 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray28);
        org.jfree.data.Range range34 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset32, true);
        java.util.List list35 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range37 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset32, list35, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'visibleSeriesKeys' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray12);
        org.junit.Assert.assertNotNull(numberArray17);
        org.junit.Assert.assertNotNull(numberArray22);
        org.junit.Assert.assertNotNull(numberArray27);
        org.junit.Assert.assertNotNull(numberArray28);
        org.junit.Assert.assertNotNull(categoryDataset29);
        org.junit.Assert.assertNotNull(categoryDataset30);
        org.junit.Assert.assertNotNull(categoryDataset31);
        org.junit.Assert.assertNotNull(categoryDataset32);
        org.junit.Assert.assertNotNull(range34);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        org.jfree.data.function.Function2D function2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataset xYDataset5 = org.jfree.data.general.DatasetUtilities.sampleFunction2D(function2D0, (double) ' ', (double) 100, (int) (byte) -1, (java.lang.Comparable) 200.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        org.jfree.data.pie.PieDataset pieDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset3 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset0, (java.lang.Comparable) 0, 200.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, false);
        org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset17);
        org.jfree.data.Range range22 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, false);
        java.lang.Number number23 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset17);
        org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset17);
        java.lang.Number number25 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset17);
        java.util.List list26 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range28 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset17, list26, true);
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
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertEquals("'" + number23 + "' != '" + 0.0d + "'", number23, 0.0d);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertEquals("'" + number25 + "' != '" + 0.0d + "'", number25, 0.0d);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        java.lang.Number[] numberArray8 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray18 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray23 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray24 = new java.lang.Number[][] { numberArray8, numberArray13, numberArray18, numberArray23 };
        org.jfree.data.category.CategoryDataset categoryDataset25 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray24);
        org.jfree.data.Range range26 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset25);
        java.lang.Number number27 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset25);
        org.jfree.data.Range range28 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset25);
        org.jfree.data.Range range30 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset25, true);
        org.jfree.data.Range range31 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset25);
        org.jfree.data.Range range32 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset25);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range34 = org.jfree.data.general.DatasetUtilities.findRangeBounds(xYDataset0, list1, range32, false);
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
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertEquals("'" + number27 + "' != '" + 1.0d + "'", number27, 1.0d);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertNotNull(range30);
        org.junit.Assert.assertNotNull(range31);
        org.junit.Assert.assertNotNull(range32);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
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
        java.lang.Number number35 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset23);
        java.lang.Class<?> wildcardClass36 = categoryDataset23.getClass();
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
        org.junit.Assert.assertEquals("'" + number35 + "' != '" + 0.0d + "'", number35, 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, false);
        org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset17);
        org.jfree.data.Range range21 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset17);
        java.lang.Number number22 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset17);
        java.lang.Number number23 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(categoryDataset17);
        java.util.List list24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range26 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset17, list24, true);
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
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertEquals("'" + number22 + "' != '" + 0.0d + "'", number22, 0.0d);
        org.junit.Assert.assertEquals("'" + number23 + "' != '" + 100.0d + "'", number23, 100.0d);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        org.jfree.data.xy.TableXYDataset tableXYDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(tableXYDataset0, (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        org.jfree.data.function.Function2D function2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataset xYDataset5 = org.jfree.data.general.DatasetUtilities.sampleFunction2D(function2D0, (double) 0.0f, 100.0d, (int) (byte) 10, (java.lang.Comparable) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        java.lang.Comparable[] comparableArray4 = new java.lang.Comparable[] { 100.0d, 1.0d, (byte) 100, "hi!" };
        java.lang.Comparable[] comparableArray10 = new java.lang.Comparable[] { 0, ' ', 'a', 1, ' ' };
        double[] doubleArray21 = new double[] { (short) 0, (byte) 0 };
        double[][] doubleArray22 = new double[][] { doubleArray21 };
        org.jfree.data.category.CategoryDataset categoryDataset23 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray22);
        org.jfree.data.category.CategoryDataset categoryDataset24 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray22);
        org.jfree.data.category.CategoryDataset categoryDataset25 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray22);
        org.jfree.data.category.CategoryDataset categoryDataset26 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray22);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.category.CategoryDataset categoryDataset27 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray4, comparableArray10, doubleArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Duplicate items in 'columnKeys'.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparableArray4);
        org.junit.Assert.assertNotNull(comparableArray10);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertNotNull(categoryDataset23);
        org.junit.Assert.assertNotNull(categoryDataset24);
        org.junit.Assert.assertNotNull(categoryDataset25);
        org.junit.Assert.assertNotNull(categoryDataset26);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        java.lang.Number[] numberArray6 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray11 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray21 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray22 = new java.lang.Number[][] { numberArray6, numberArray11, numberArray16, numberArray21 };
        org.jfree.data.category.CategoryDataset categoryDataset23 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray22);
        org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset23);
        org.jfree.data.Range range26 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset23, true);
        org.jfree.data.Range range27 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset23);
        java.util.List list28 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range30 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(categoryDataset23, list28, true);
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
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        java.lang.Number number18 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset17);
        boolean boolean19 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset17);
        java.lang.Number number20 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset17);
        java.lang.Number number21 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset17);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset23 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset17, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertNotNull(categoryDataset17);
        org.junit.Assert.assertEquals("'" + number18 + "' != '" + 0.0d + "'", number18, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + number20 + "' != '" + 200.0d + "'", number20, 200.0d);
        org.junit.Assert.assertEquals("'" + number21 + "' != '" + 0.0d + "'", number21, 0.0d);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
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
        java.lang.Comparable comparable31 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset32 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset23, comparable31);
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
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertNotNull(range29);
        org.junit.Assert.assertEquals("'" + number30 + "' != '" + 0.0d + "'", number30, 0.0d);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset17, false);
        org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset17);
        org.jfree.data.Range range22 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset17, (double) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset24 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset17, (java.lang.Comparable) '4');
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
        org.junit.Assert.assertNotNull(range22);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        org.jfree.data.function.Function2D function2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries5 = org.jfree.data.general.DatasetUtilities.sampleFunction2DToSeries(function2D0, 130.0d, 400.0d, 0, (java.lang.Comparable) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        double[] doubleArray12 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray19 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray20 = new double[][] { doubleArray12, doubleArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray20);
        org.jfree.data.category.CategoryDataset categoryDataset22 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray20);
        org.jfree.data.category.CategoryDataset categoryDataset23 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray20);
        org.jfree.data.pie.PieDataset pieDataset25 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset23, (int) (byte) 1);
        java.util.List list26 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range28 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(categoryDataset23, list26, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'visibleSeriesKeys' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertNotNull(categoryDataset21);
        org.junit.Assert.assertNotNull(categoryDataset22);
        org.junit.Assert.assertNotNull(categoryDataset23);
        org.junit.Assert.assertNotNull(pieDataset25);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        java.lang.Number number18 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset17);
        boolean boolean19 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset17);
        org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset17);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset22 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset17, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertNotNull(categoryDataset17);
        org.junit.Assert.assertEquals("'" + number18 + "' != '" + 0.0d + "'", number18, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(range20);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        java.lang.Number[] numberArray8 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray18 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray23 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray24 = new java.lang.Number[][] { numberArray8, numberArray13, numberArray18, numberArray23 };
        org.jfree.data.category.CategoryDataset categoryDataset25 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray24);
        org.jfree.data.Range range26 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset25);
        org.jfree.data.Range range28 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset25, true);
        org.jfree.data.Range range30 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset25, false);
        org.jfree.data.Range range31 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset25);
        org.jfree.data.Range range33 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset25, true);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range35 = org.jfree.data.general.DatasetUtilities.findRangeBounds(xYDataset0, list1, range33, true);
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
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertNotNull(range30);
        org.junit.Assert.assertNotNull(range31);
        org.junit.Assert.assertNotNull(range33);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset2 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, false);
        org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset17);
        org.jfree.data.KeyToGroupMap keyToGroupMap21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range22 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset17, keyToGroupMap21);
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
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        double[] doubleArray10 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray17 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray18 = new double[][] { doubleArray10, doubleArray17 };
        org.jfree.data.category.CategoryDataset categoryDataset19 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray18);
        org.jfree.data.Range range21 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset19, false);
        org.jfree.data.pie.PieDataset pieDataset23 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset19, (int) (short) 0);
        org.jfree.data.Range range25 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset19, false);
        java.lang.Number number26 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset19);
        org.jfree.data.Range range28 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset19, false);
        org.jfree.data.Range range30 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset19, true);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range32 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(xYDataset0, list1, range30, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertEquals("'" + number26 + "' != '" + 200.0d + "'", number26, 200.0d);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertNotNull(range30);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
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
        java.lang.Number number30 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset23);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset32 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset23, (java.lang.Comparable) (byte) -1);
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
        org.junit.Assert.assertEquals("'" + number30 + "' != '" + 400.0d + "'", number30, 400.0d);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        java.lang.Number[] numberArray10 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray15 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray20 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray25 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray26 = new java.lang.Number[][] { numberArray10, numberArray15, numberArray20, numberArray25 };
        org.jfree.data.category.CategoryDataset categoryDataset27 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray26);
        org.jfree.data.category.CategoryDataset categoryDataset28 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray26);
        org.jfree.data.Range range29 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset28);
        boolean boolean30 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset28);
        org.jfree.data.Range range31 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset28);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range33 = org.jfree.data.general.DatasetUtilities.findRangeBounds(xYDataset0, list1, range31, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
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
        org.junit.Assert.assertNotNull(range29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(range31);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
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
        org.jfree.data.Range range34 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset23, false);
        org.jfree.data.Range range35 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset23);
        org.jfree.data.pie.PieDataset pieDataset37 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset23, (int) (byte) 1);
        org.jfree.data.KeyToGroupMap keyToGroupMap38 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range39 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset23, keyToGroupMap38);
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
        org.junit.Assert.assertNotNull(range32);
        org.junit.Assert.assertNotNull(range34);
        org.junit.Assert.assertNotNull(range35);
        org.junit.Assert.assertNotNull(pieDataset37);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        java.lang.Number[] numberArray8 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray18 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray23 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray24 = new java.lang.Number[][] { numberArray8, numberArray13, numberArray18, numberArray23 };
        org.jfree.data.category.CategoryDataset categoryDataset25 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray24);
        org.jfree.data.Range range26 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset25);
        org.jfree.data.Range range28 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset25, true);
        java.lang.Number number29 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset25);
        org.jfree.data.Range range31 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset25, true);
        org.jfree.data.Range range33 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset25, true);
        org.jfree.data.Range range35 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset25, true);
        org.jfree.data.Range range37 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset25, true);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range39 = org.jfree.data.general.DatasetUtilities.findRangeBounds(xYDataset0, list1, range37, true);
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
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertEquals("'" + number29 + "' != '" + 1.0d + "'", number29, 1.0d);
        org.junit.Assert.assertNotNull(range31);
        org.junit.Assert.assertNotNull(range33);
        org.junit.Assert.assertNotNull(range35);
        org.junit.Assert.assertNotNull(range37);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        java.lang.Number[] numberArray8 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray18 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray23 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray24 = new java.lang.Number[][] { numberArray8, numberArray13, numberArray18, numberArray23 };
        org.jfree.data.category.CategoryDataset categoryDataset25 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray24);
        java.lang.Number number26 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(categoryDataset25);
        org.jfree.data.Range range28 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset25, true);
        org.jfree.data.Range range30 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset25, (double) (-1.0f));
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range32 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(xYDataset0, list1, range30, false);
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
        org.junit.Assert.assertNotNull(range30);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        double[] doubleArray10 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray17 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray18 = new double[][] { doubleArray10, doubleArray17 };
        org.jfree.data.category.CategoryDataset categoryDataset19 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray18);
        org.jfree.data.Range range21 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset19, false);
        org.jfree.data.pie.PieDataset pieDataset23 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset19, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset26 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset23, (java.lang.Comparable) 100L, (double) 1);
        org.jfree.data.category.CategoryDataset categoryDataset27 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 130.0d, (org.jfree.data.KeyedValues) pieDataset26);
        org.jfree.data.category.CategoryDataset categoryDataset28 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) (byte) 100, (org.jfree.data.KeyedValues) pieDataset26);
        org.jfree.data.Range range30 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset28, true);
        java.util.List list31 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range33 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(categoryDataset28, list31, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'visibleSeriesKeys' argument.");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(categoryDataset27);
        org.junit.Assert.assertNotNull(categoryDataset28);
        org.junit.Assert.assertNotNull(range30);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
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
        org.jfree.data.pie.PieDataset pieDataset37 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset33, (java.lang.Comparable) 100, 130.0d, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset40 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset33, (java.lang.Comparable) "", (double) 10.0f);
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
        org.junit.Assert.assertNotNull(pieDataset37);
        org.junit.Assert.assertNotNull(pieDataset40);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        java.lang.Comparable[] comparableArray1 = new java.lang.Comparable[] { '#' };
        java.lang.Comparable[] comparableArray7 = new java.lang.Comparable[] { (byte) -1, '#', (byte) 100, (-1L), 200.0d };
        double[] doubleArray16 = new double[] { (short) 0, (byte) 0 };
        double[][] doubleArray17 = new double[][] { doubleArray16 };
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray17);
        org.jfree.data.category.CategoryDataset categoryDataset19 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray17);
        org.jfree.data.category.CategoryDataset categoryDataset20 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray17);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray1, comparableArray7, doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The number of column keys does not match the number of columns in the data array.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparableArray1);
        org.junit.Assert.assertNotNull(comparableArray7);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertNotNull(categoryDataset18);
        org.junit.Assert.assertNotNull(categoryDataset19);
        org.junit.Assert.assertNotNull(categoryDataset20);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        org.jfree.data.xy.TableXYDataset tableXYDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(tableXYDataset0, (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        java.lang.Number number18 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset17);
        org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, true);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset22 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset17, (java.lang.Comparable) 10.0d);
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
        org.junit.Assert.assertEquals("'" + number18 + "' != '" + 0.0d + "'", number18, 0.0d);
        org.junit.Assert.assertNotNull(range20);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
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
        org.jfree.data.Range range35 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset23);
        java.lang.Class<?> wildcardClass36 = range35.getClass();
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
        org.junit.Assert.assertNotNull(range35);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        org.jfree.data.xy.TableXYDataset tableXYDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(tableXYDataset0, 400.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, false);
        org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset17);
        org.jfree.data.Range range22 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, false);
        java.lang.Number number23 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset17);
        org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset17);
        java.lang.Class<?> wildcardClass25 = range24.getClass();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertNotNull(categoryDataset17);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertEquals("'" + number23 + "' != '" + 0.0d + "'", number23, 0.0d);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        java.lang.Number[] numberArray8 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray18 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray23 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray24 = new java.lang.Number[][] { numberArray8, numberArray13, numberArray18, numberArray23 };
        org.jfree.data.category.CategoryDataset categoryDataset25 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray24);
        org.jfree.data.category.CategoryDataset categoryDataset26 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray24);
        java.lang.Class<?> wildcardClass27 = numberArray24.getClass();
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray13);
        org.junit.Assert.assertNotNull(numberArray18);
        org.junit.Assert.assertNotNull(numberArray23);
        org.junit.Assert.assertNotNull(numberArray24);
        org.junit.Assert.assertNotNull(categoryDataset25);
        org.junit.Assert.assertNotNull(categoryDataset26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        org.jfree.data.function.Function2D function2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries5 = org.jfree.data.general.DatasetUtilities.sampleFunction2DToSeries(function2D0, (double) (byte) 100, (double) (short) 10, (int) (byte) 0, (java.lang.Comparable) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        java.lang.Number[] numberArray8 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray18 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray23 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray24 = new java.lang.Number[][] { numberArray8, numberArray13, numberArray18, numberArray23 };
        org.jfree.data.category.CategoryDataset categoryDataset25 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray24);
        org.jfree.data.Range range26 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset25);
        java.lang.Number number27 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset25);
        org.jfree.data.Range range28 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset25);
        org.jfree.data.Range range30 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset25, true);
        org.jfree.data.Range range31 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset25);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range33 = org.jfree.data.general.DatasetUtilities.findRangeBounds(xYDataset0, list1, range31, true);
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
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertEquals("'" + number27 + "' != '" + 1.0d + "'", number27, 1.0d);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertNotNull(range30);
        org.junit.Assert.assertNotNull(range31);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.jfree.data.function.Function2D function2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries5 = org.jfree.data.general.DatasetUtilities.sampleFunction2DToSeries(function2D0, (double) (short) -1, (double) (byte) 0, (int) '4', (java.lang.Comparable) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        org.jfree.data.function.Function2D function2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataset xYDataset5 = org.jfree.data.general.DatasetUtilities.sampleFunction2D(function2D0, (double) 'a', (double) (-1L), (int) (byte) 0, (java.lang.Comparable) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        double[] doubleArray12 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray19 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray20 = new double[][] { doubleArray12, doubleArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray20);
        org.jfree.data.category.CategoryDataset categoryDataset22 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray20);
        org.jfree.data.category.CategoryDataset categoryDataset23 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray20);
        org.jfree.data.pie.PieDataset pieDataset25 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset23, (int) (byte) 1);
        java.lang.Class<?> wildcardClass26 = pieDataset25.getClass();
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertNotNull(categoryDataset21);
        org.junit.Assert.assertNotNull(categoryDataset22);
        org.junit.Assert.assertNotNull(categoryDataset23);
        org.junit.Assert.assertNotNull(pieDataset25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        double[] doubleArray4 = new double[] { (short) 0, (byte) 0 };
        double[][] doubleArray5 = new double[][] { doubleArray4 };
        org.jfree.data.category.CategoryDataset categoryDataset6 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray5);
        org.jfree.data.pie.PieDataset pieDataset8 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset6, 0);
        org.jfree.data.Range range9 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset6);
        boolean boolean10 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset6);
        java.lang.Class<?> wildcardClass11 = categoryDataset6.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(categoryDataset6);
        org.junit.Assert.assertNotNull(pieDataset8);
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset31 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset23, (java.lang.Comparable) (-1L));
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
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        java.lang.Number[] numberArray6 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray11 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray21 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray22 = new java.lang.Number[][] { numberArray6, numberArray11, numberArray16, numberArray21 };
        org.jfree.data.category.CategoryDataset categoryDataset23 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray22);
        java.lang.Number number24 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(categoryDataset23);
        org.jfree.data.Range range26 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset23, (double) (-1L));
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset28 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset23, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        org.jfree.data.function.Function2D function2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries5 = org.jfree.data.general.DatasetUtilities.sampleFunction2DToSeries(function2D0, 0.0d, (double) (-1), (int) '4', (java.lang.Comparable) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        java.lang.Number[] numberArray8 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray18 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray23 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray24 = new java.lang.Number[][] { numberArray8, numberArray13, numberArray18, numberArray23 };
        org.jfree.data.category.CategoryDataset categoryDataset25 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray24);
        org.jfree.data.Range range26 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset25);
        org.jfree.data.Range range28 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset25, true);
        org.jfree.data.Range range30 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset25, false);
        org.jfree.data.Range range32 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset25, 10.0d);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range34 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(xYDataset0, list1, range32, true);
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
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertNotNull(range30);
        org.junit.Assert.assertNotNull(range32);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        java.lang.Comparable[] comparableArray0 = new java.lang.Comparable[] {};
        java.lang.Comparable[] comparableArray5 = new java.lang.Comparable[] { 'a', '4', "", '#' };
        double[] doubleArray18 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray25 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray26 = new double[][] { doubleArray18, doubleArray25 };
        org.jfree.data.category.CategoryDataset categoryDataset27 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray26);
        org.jfree.data.category.CategoryDataset categoryDataset28 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray26);
        org.jfree.data.category.CategoryDataset categoryDataset29 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray26);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.category.CategoryDataset categoryDataset30 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray0, comparableArray5, doubleArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The number of row keys does not match the number of rows in the data array.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparableArray0);
        org.junit.Assert.assertArrayEquals(comparableArray0, new java.lang.Comparable[] {});
        org.junit.Assert.assertNotNull(comparableArray5);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertNotNull(categoryDataset27);
        org.junit.Assert.assertNotNull(categoryDataset28);
        org.junit.Assert.assertNotNull(categoryDataset29);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
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
        org.jfree.data.pie.PieDataset pieDataset35 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset29, (int) (byte) 0);
        java.util.List list36 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range38 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(categoryDataset29, list36, false);
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
        org.junit.Assert.assertEquals("'" + number30 + "' != '" + 400.0d + "'", number30, 400.0d);
        org.junit.Assert.assertEquals("'" + number31 + "' != '" + 400.0d + "'", number31, 400.0d);
        org.junit.Assert.assertEquals("'" + number32 + "' != '" + 100.0d + "'", number32, 100.0d);
        org.junit.Assert.assertEquals("'" + number33 + "' != '" + 100.0d + "'", number33, 100.0d);
        org.junit.Assert.assertNotNull(pieDataset35);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        org.jfree.data.function.Function2D function2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataset xYDataset5 = org.jfree.data.general.DatasetUtilities.sampleFunction2D(function2D0, (double) (-1), 200.0d, (int) (short) -1, (java.lang.Comparable) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        org.jfree.data.pie.PieDataset pieDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double1 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.jfree.data.function.Function2D function2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataset xYDataset5 = org.jfree.data.general.DatasetUtilities.sampleFunction2D(function2D0, (double) (short) 1, (double) 0L, (int) (short) 100, (java.lang.Comparable) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        org.jfree.data.function.Function2D function2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataset xYDataset5 = org.jfree.data.general.DatasetUtilities.sampleFunction2D(function2D0, 0.0d, (double) (byte) -1, (int) (byte) 100, (java.lang.Comparable) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        java.lang.Number[] numberArray8 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray18 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray23 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray24 = new java.lang.Number[][] { numberArray8, numberArray13, numberArray18, numberArray23 };
        org.jfree.data.category.CategoryDataset categoryDataset25 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray24);
        org.jfree.data.category.CategoryDataset categoryDataset26 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray24);
        org.jfree.data.Range range27 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset26);
        org.jfree.data.Range range28 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset26);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset30 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset26, (java.lang.Comparable) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray13);
        org.junit.Assert.assertNotNull(numberArray18);
        org.junit.Assert.assertNotNull(numberArray23);
        org.junit.Assert.assertNotNull(numberArray24);
        org.junit.Assert.assertNotNull(categoryDataset25);
        org.junit.Assert.assertNotNull(categoryDataset26);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertNotNull(range28);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
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
        org.jfree.data.Range range35 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset23);
        org.jfree.data.Range range37 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset23, false);
        java.lang.Class<?> wildcardClass38 = categoryDataset23.getClass();
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
        org.junit.Assert.assertNotNull(range35);
        org.junit.Assert.assertNotNull(range37);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        java.lang.Number number18 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset17);
        boolean boolean19 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset17);
        java.lang.Number number20 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset17);
        org.jfree.data.Range range22 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset17, (double) 0);
        java.lang.Number number23 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset17);
        org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset17);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset26 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset17, (java.lang.Comparable) 0.0f);
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
        org.junit.Assert.assertEquals("'" + number18 + "' != '" + 0.0d + "'", number18, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + number20 + "' != '" + 200.0d + "'", number20, 200.0d);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertEquals("'" + number23 + "' != '" + 200.0d + "'", number23, 200.0d);
        org.junit.Assert.assertNotNull(range24);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, false);
        org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset17);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset22 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset17, (java.lang.Comparable) 1L);
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
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        double[] doubleArray9 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray16 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray17 = new double[][] { doubleArray9, doubleArray16 };
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray17);
        org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset18, false);
        org.jfree.data.pie.PieDataset pieDataset22 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset18, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset25 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset22, (java.lang.Comparable) 100L, (double) 1);
        org.jfree.data.category.CategoryDataset categoryDataset26 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) (-1L), (org.jfree.data.KeyedValues) pieDataset25);
        java.util.List list27 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range29 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset26, list27, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'visibleSeriesKeys' argument.");
        } catch (java.lang.IllegalArgumentException e) {
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
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        java.lang.Number[] numberArray8 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray18 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray23 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray24 = new java.lang.Number[][] { numberArray8, numberArray13, numberArray18, numberArray23 };
        org.jfree.data.category.CategoryDataset categoryDataset25 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray24);
        org.jfree.data.Range range26 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset25);
        java.lang.Number number27 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset25);
        org.jfree.data.Range range28 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset25);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range30 = org.jfree.data.general.DatasetUtilities.findRangeBounds(xYDataset0, list1, range28, false);
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
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertEquals("'" + number27 + "' != '" + 400.0d + "'", number27, 400.0d);
        org.junit.Assert.assertNotNull(range28);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        java.lang.Number[] numberArray8 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray18 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray23 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray24 = new java.lang.Number[][] { numberArray8, numberArray13, numberArray18, numberArray23 };
        org.jfree.data.category.CategoryDataset categoryDataset25 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray24);
        org.jfree.data.Range range26 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset25);
        org.jfree.data.Range range28 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset25, true);
        java.lang.Number number29 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset25);
        org.jfree.data.Range range31 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset25, true);
        org.jfree.data.Range range33 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset25, true);
        org.jfree.data.Range range35 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset25, true);
        java.lang.Number number36 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset25);
        org.jfree.data.Range range37 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset25);
        org.jfree.data.Range range39 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset25, false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range41 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(xYDataset0, list1, range39, false);
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
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertEquals("'" + number29 + "' != '" + 1.0d + "'", number29, 1.0d);
        org.junit.Assert.assertNotNull(range31);
        org.junit.Assert.assertNotNull(range33);
        org.junit.Assert.assertNotNull(range35);
        org.junit.Assert.assertEquals("'" + number36 + "' != '" + 1.0d + "'", number36, 1.0d);
        org.junit.Assert.assertNotNull(range37);
        org.junit.Assert.assertNotNull(range39);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        java.lang.Number[] numberArray6 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray11 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray21 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray22 = new java.lang.Number[][] { numberArray6, numberArray11, numberArray16, numberArray21 };
        org.jfree.data.category.CategoryDataset categoryDataset23 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray22);
        java.lang.Number number24 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(categoryDataset23);
        org.jfree.data.Range range26 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset23, true);
        org.jfree.data.Range range28 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset23, (double) (-1.0f));
        org.jfree.data.KeyToGroupMap keyToGroupMap29 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range30 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset23, keyToGroupMap29);
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
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range28);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        double[] doubleArray9 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray16 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray17 = new double[][] { doubleArray9, doubleArray16 };
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray17);
        org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset18, false);
        org.jfree.data.pie.PieDataset pieDataset22 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset18, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset25 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset22, (java.lang.Comparable) 100L, (double) 1);
        org.jfree.data.pie.PieDataset pieDataset28 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset22, (java.lang.Comparable) (short) 1, 130.0d);
        org.jfree.data.category.CategoryDataset categoryDataset29 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) (-1L), (org.jfree.data.KeyedValues) pieDataset22);
        org.jfree.data.pie.PieDataset pieDataset33 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset22, (java.lang.Comparable) (short) -1, 130.0d, (int) (short) 100);
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
        org.junit.Assert.assertNotNull(pieDataset33);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
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
        double double29 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset22);
        boolean boolean30 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset22);
        org.jfree.data.pie.PieDataset pieDataset34 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset22, (java.lang.Comparable) 10.0d, (double) 0, (int) (byte) 1);
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
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 130.0d + "'", double29 == 130.0d);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(pieDataset34);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        org.jfree.data.function.Function2D function2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataset xYDataset5 = org.jfree.data.general.DatasetUtilities.sampleFunction2D(function2D0, (double) 100.0f, (double) (-1), (int) '#', (java.lang.Comparable) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        java.lang.Number[] numberArray8 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray18 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray23 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray24 = new java.lang.Number[][] { numberArray8, numberArray13, numberArray18, numberArray23 };
        org.jfree.data.category.CategoryDataset categoryDataset25 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray24);
        org.jfree.data.category.CategoryDataset categoryDataset26 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray24);
        org.jfree.data.Range range27 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset26);
        java.util.List list28 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range30 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset26, list28, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'visibleSeriesKeys' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray13);
        org.junit.Assert.assertNotNull(numberArray18);
        org.junit.Assert.assertNotNull(numberArray23);
        org.junit.Assert.assertNotNull(numberArray24);
        org.junit.Assert.assertNotNull(categoryDataset25);
        org.junit.Assert.assertNotNull(categoryDataset26);
        org.junit.Assert.assertNotNull(range27);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        java.lang.Number[] numberArray8 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray18 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray23 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray24 = new java.lang.Number[][] { numberArray8, numberArray13, numberArray18, numberArray23 };
        org.jfree.data.category.CategoryDataset categoryDataset25 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray24);
        org.jfree.data.Range range26 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset25);
        org.jfree.data.Range range28 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset25, true);
        org.jfree.data.Range range30 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset25, false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range32 = org.jfree.data.general.DatasetUtilities.findRangeBounds(xYDataset0, list1, range30, false);
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
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertNotNull(range30);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        java.lang.Number[] numberArray6 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray11 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray21 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray22 = new java.lang.Number[][] { numberArray6, numberArray11, numberArray16, numberArray21 };
        org.jfree.data.category.CategoryDataset categoryDataset23 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray22);
        java.lang.Number number24 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(categoryDataset23);
        org.jfree.data.Range range26 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset23, true);
        org.jfree.data.Range range28 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset23, true);
        org.jfree.data.Range range29 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset23);
        java.util.List list30 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range32 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset23, list30, true);
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
        org.junit.Assert.assertEquals("'" + number24 + "' != '" + 100.0d + "'", number24, 100.0d);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertNotNull(range29);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        double[] doubleArray10 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray17 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray18 = new double[][] { doubleArray10, doubleArray17 };
        org.jfree.data.category.CategoryDataset categoryDataset19 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray18);
        org.jfree.data.category.CategoryDataset categoryDataset20 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray18);
        org.jfree.data.Range range21 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset20);
        org.jfree.data.Range range22 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset20);
        java.util.List list23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range25 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(categoryDataset20, list23, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'visibleSeriesKeys' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(categoryDataset19);
        org.junit.Assert.assertNotNull(categoryDataset20);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertNotNull(range22);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        java.lang.Number[] numberArray6 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray11 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray21 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray22 = new java.lang.Number[][] { numberArray6, numberArray11, numberArray16, numberArray21 };
        org.jfree.data.category.CategoryDataset categoryDataset23 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray22);
        org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset23);
        java.lang.Number number25 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset23);
        org.jfree.data.Range range27 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset23, (-1.0d));
        java.util.List list28 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range30 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset23, list28, true);
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
        org.junit.Assert.assertEquals("'" + number25 + "' != '" + 1.0d + "'", number25, 1.0d);
        org.junit.Assert.assertNotNull(range27);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        java.lang.Number number18 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset17);
        boolean boolean19 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset17);
        org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset17);
        org.jfree.data.KeyToGroupMap keyToGroupMap21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range22 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset17, keyToGroupMap21);
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
        org.junit.Assert.assertEquals("'" + number18 + "' != '" + 0.0d + "'", number18, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(range20);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        org.jfree.data.xy.TableXYDataset tableXYDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(tableXYDataset0, (double) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        java.lang.Number[] numberArray8 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray18 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray23 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray24 = new java.lang.Number[][] { numberArray8, numberArray13, numberArray18, numberArray23 };
        org.jfree.data.category.CategoryDataset categoryDataset25 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray24);
        org.jfree.data.Range range26 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset25);
        org.jfree.data.Range range28 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset25, true);
        java.lang.Number number29 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset25);
        org.jfree.data.Range range31 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset25, true);
        org.jfree.data.Range range33 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset25, true);
        org.jfree.data.Range range35 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset25, true);
        java.lang.Number number36 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset25);
        org.jfree.data.Range range38 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset25, false);
        org.jfree.data.Range range40 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset25, true);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range42 = org.jfree.data.general.DatasetUtilities.findRangeBounds(xYDataset0, list1, range40, false);
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
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertEquals("'" + number29 + "' != '" + 1.0d + "'", number29, 1.0d);
        org.junit.Assert.assertNotNull(range31);
        org.junit.Assert.assertNotNull(range33);
        org.junit.Assert.assertNotNull(range35);
        org.junit.Assert.assertEquals("'" + number36 + "' != '" + 1.0d + "'", number36, 1.0d);
        org.junit.Assert.assertNotNull(range38);
        org.junit.Assert.assertNotNull(range40);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        java.lang.Comparable[] comparableArray4 = new java.lang.Comparable[] { (-1.0d), 0.0f, 10.0f, 0.0f };
        java.lang.Comparable[] comparableArray9 = new java.lang.Comparable[] { 1L, '4', (-1L), '#' };
        double[] doubleArray12 = new double[] {};
        double[][] doubleArray13 = new double[][] { doubleArray12 };
        org.jfree.data.category.CategoryDataset categoryDataset14 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray13);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.category.CategoryDataset categoryDataset15 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray4, comparableArray9, doubleArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Duplicate items in 'rowKeys'.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparableArray4);
        org.junit.Assert.assertNotNull(comparableArray9);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertNotNull(categoryDataset14);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
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
        java.lang.Number number35 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset23);
        org.jfree.data.Range range36 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset23);
        java.util.List list37 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range39 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(categoryDataset23, list37, false);
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
        org.junit.Assert.assertNotNull(range31);
        org.junit.Assert.assertNotNull(range33);
        org.junit.Assert.assertEquals("'" + number34 + "' != '" + 1.0d + "'", number34, 1.0d);
        org.junit.Assert.assertEquals("'" + number35 + "' != '" + 0.0d + "'", number35, 0.0d);
        org.junit.Assert.assertNotNull(range36);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        java.lang.Number[] numberArray8 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray18 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray23 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray24 = new java.lang.Number[][] { numberArray8, numberArray13, numberArray18, numberArray23 };
        org.jfree.data.category.CategoryDataset categoryDataset25 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray24);
        org.jfree.data.category.CategoryDataset categoryDataset26 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray24);
        org.jfree.data.Range range28 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset26, (double) (-1.0f));
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset30 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset26, (java.lang.Comparable) 400.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberArray13);
        org.junit.Assert.assertNotNull(numberArray18);
        org.junit.Assert.assertNotNull(numberArray23);
        org.junit.Assert.assertNotNull(numberArray24);
        org.junit.Assert.assertNotNull(categoryDataset25);
        org.junit.Assert.assertNotNull(categoryDataset26);
        org.junit.Assert.assertNotNull(range28);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
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
        org.jfree.data.KeyToGroupMap keyToGroupMap32 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range33 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset29, keyToGroupMap32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertEquals("'" + number31 + "' != '" + 400.0d + "'", number31, 400.0d);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        org.jfree.data.function.Function2D function2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataset xYDataset5 = org.jfree.data.general.DatasetUtilities.sampleFunction2D(function2D0, (-1.0d), 0.0d, 1, (java.lang.Comparable) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset30 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset23, (java.lang.Comparable) "hi!");
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
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertNotNull(range28);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        java.lang.Comparable[] comparableArray5 = new java.lang.Comparable[] { 400.0d, (short) 1, (byte) 1, false, (-1L) };
        java.lang.Comparable[] comparableArray11 = new java.lang.Comparable[] { '#', (byte) 100, 10.0f, true, 100L };
        double[] doubleArray24 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray31 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray32 = new double[][] { doubleArray24, doubleArray31 };
        org.jfree.data.category.CategoryDataset categoryDataset33 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray32);
        org.jfree.data.category.CategoryDataset categoryDataset34 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray32);
        org.jfree.data.category.CategoryDataset categoryDataset35 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray32);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.category.CategoryDataset categoryDataset36 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray5, comparableArray11, doubleArray32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The number of row keys does not match the number of rows in the data array.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparableArray5);
        org.junit.Assert.assertNotNull(comparableArray11);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertArrayEquals(doubleArray31, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertNotNull(categoryDataset33);
        org.junit.Assert.assertNotNull(categoryDataset34);
        org.junit.Assert.assertNotNull(categoryDataset35);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        double[] doubleArray8 = new double[] { (short) 0, (byte) 0 };
        double[][] doubleArray9 = new double[][] { doubleArray8 };
        org.jfree.data.category.CategoryDataset categoryDataset10 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray9);
        org.jfree.data.category.CategoryDataset categoryDataset11 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray9);
        org.jfree.data.category.CategoryDataset categoryDataset12 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray9);
        org.jfree.data.Range range14 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset12, true);
        org.jfree.data.Range range15 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset12);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset17 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset12, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertNotNull(categoryDataset10);
        org.junit.Assert.assertNotNull(categoryDataset11);
        org.junit.Assert.assertNotNull(categoryDataset12);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertNotNull(range15);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        java.lang.Number number18 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset17);
        boolean boolean19 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset17);
        java.lang.Number number20 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset17);
        org.jfree.data.Range range22 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset17, (double) 0);
        java.lang.Number number23 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset17);
        java.util.List list24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range26 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset17, list24, false);
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
        org.junit.Assert.assertEquals("'" + number18 + "' != '" + 0.0d + "'", number18, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + number20 + "' != '" + 200.0d + "'", number20, 200.0d);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertEquals("'" + number23 + "' != '" + 200.0d + "'", number23, 200.0d);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        java.lang.Number[] numberArray6 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray11 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray21 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray22 = new java.lang.Number[][] { numberArray6, numberArray11, numberArray16, numberArray21 };
        org.jfree.data.category.CategoryDataset categoryDataset23 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray22);
        org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset23);
        java.lang.Number number25 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset23);
        org.jfree.data.Range range26 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset23);
        org.jfree.data.Range range28 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset23, true);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset30 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset23, (java.lang.Comparable) (-1.0f));
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
        org.junit.Assert.assertEquals("'" + number25 + "' != '" + 400.0d + "'", number25, 400.0d);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range28);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        double[] doubleArray6 = new double[] {};
        double[][] doubleArray7 = new double[][] { doubleArray6 };
        org.jfree.data.category.CategoryDataset categoryDataset8 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray7);
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray7);
        org.jfree.data.category.CategoryDataset categoryDataset10 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray7);
        org.jfree.data.Range range11 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset10);
        java.util.List list12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range14 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(categoryDataset10, list12, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'visibleSeriesKeys' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertNotNull(categoryDataset8);
        org.junit.Assert.assertNotNull(categoryDataset9);
        org.junit.Assert.assertNotNull(categoryDataset10);
        org.junit.Assert.assertNull(range11);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        java.lang.Number[] numberArray6 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray11 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray21 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray22 = new java.lang.Number[][] { numberArray6, numberArray11, numberArray16, numberArray21 };
        org.jfree.data.category.CategoryDataset categoryDataset23 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray22);
        org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset23);
        org.jfree.data.Range range26 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset23, true);
        org.jfree.data.Range range27 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset23);
        java.util.List list28 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range30 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(categoryDataset23, list28, false);
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
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
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
        org.jfree.data.pie.PieDataset pieDataset31 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset22, (java.lang.Comparable) 1.0d, (double) 0L);
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
        org.junit.Assert.assertNotNull(pieDataset31);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        java.lang.Number[] numberArray8 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray18 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray23 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray24 = new java.lang.Number[][] { numberArray8, numberArray13, numberArray18, numberArray23 };
        org.jfree.data.category.CategoryDataset categoryDataset25 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray24);
        org.jfree.data.Range range26 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset25);
        org.jfree.data.Range range28 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset25, true);
        java.lang.Number number29 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset25);
        org.jfree.data.Range range31 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset25, true);
        org.jfree.data.Range range33 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset25, true);
        org.jfree.data.Range range35 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset25, true);
        java.lang.Number number36 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset25);
        org.jfree.data.Range range38 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset25, false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range40 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(xYDataset0, list1, range38, false);
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
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertEquals("'" + number29 + "' != '" + 1.0d + "'", number29, 1.0d);
        org.junit.Assert.assertNotNull(range31);
        org.junit.Assert.assertNotNull(range33);
        org.junit.Assert.assertNotNull(range35);
        org.junit.Assert.assertEquals("'" + number36 + "' != '" + 1.0d + "'", number36, 1.0d);
        org.junit.Assert.assertNotNull(range38);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        double[] doubleArray12 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray19 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray20 = new double[][] { doubleArray12, doubleArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray20);
        org.jfree.data.category.CategoryDataset categoryDataset22 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray20);
        org.jfree.data.Range range23 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset22);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range25 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(xYDataset0, list1, range23, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertNotNull(categoryDataset21);
        org.junit.Assert.assertNotNull(categoryDataset22);
        org.junit.Assert.assertNotNull(range23);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        org.jfree.data.function.Function2D function2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataset xYDataset5 = org.jfree.data.general.DatasetUtilities.sampleFunction2D(function2D0, 400.0d, 10.0d, (int) (byte) 10, (java.lang.Comparable) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        double[] doubleArray10 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray17 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray18 = new double[][] { doubleArray10, doubleArray17 };
        org.jfree.data.category.CategoryDataset categoryDataset19 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray18);
        org.jfree.data.category.CategoryDataset categoryDataset20 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray18);
        org.jfree.data.Range range21 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset20);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset23 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset20, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(categoryDataset19);
        org.junit.Assert.assertNotNull(categoryDataset20);
        org.junit.Assert.assertNotNull(range21);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        org.jfree.data.function.Function2D function2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataset xYDataset5 = org.jfree.data.general.DatasetUtilities.sampleFunction2D(function2D0, (-1.0d), (double) 10.0f, (int) (byte) -1, (java.lang.Comparable) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        org.jfree.data.function.Function2D function2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataset xYDataset5 = org.jfree.data.general.DatasetUtilities.sampleFunction2D(function2D0, 20.0d, (double) 10.0f, (int) (short) 10, (java.lang.Comparable) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        java.lang.Number[] numberArray6 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray11 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray21 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray22 = new java.lang.Number[][] { numberArray6, numberArray11, numberArray16, numberArray21 };
        org.jfree.data.category.CategoryDataset categoryDataset23 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray22);
        org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset23);
        java.lang.Number number25 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset23);
        java.lang.Number number26 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(categoryDataset23);
        java.util.List list27 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range29 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset23, list27, true);
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
        org.junit.Assert.assertEquals("'" + number25 + "' != '" + 1.0d + "'", number25, 1.0d);
        org.junit.Assert.assertEquals("'" + number26 + "' != '" + 100.0d + "'", number26, 100.0d);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
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
        org.jfree.data.Range range34 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset23, false);
        org.jfree.data.Range range35 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset23);
        org.jfree.data.pie.PieDataset pieDataset37 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset23, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset39 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset23, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 4");
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
        org.junit.Assert.assertEquals("'" + number27 + "' != '" + 1.0d + "'", number27, 1.0d);
        org.junit.Assert.assertNotNull(range29);
        org.junit.Assert.assertNotNull(range31);
        org.junit.Assert.assertNotNull(range32);
        org.junit.Assert.assertNotNull(range34);
        org.junit.Assert.assertNotNull(range35);
        org.junit.Assert.assertNotNull(pieDataset37);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        java.lang.Number[] numberArray10 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray15 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray20 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray25 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray26 = new java.lang.Number[][] { numberArray10, numberArray15, numberArray20, numberArray25 };
        org.jfree.data.category.CategoryDataset categoryDataset27 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray26);
        org.jfree.data.category.CategoryDataset categoryDataset28 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray26);
        org.jfree.data.Range range29 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset28);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range31 = org.jfree.data.general.DatasetUtilities.findRangeBounds(xYDataset0, list1, range29, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
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
        org.junit.Assert.assertNotNull(range29);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, false);
        org.jfree.data.pie.PieDataset pieDataset21 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset17, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset24 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset21, (java.lang.Comparable) ' ', (double) '#');
        org.jfree.data.pie.PieDataset pieDataset27 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset24, (java.lang.Comparable) (byte) 1, (double) 10);
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
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
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
        org.jfree.data.Range range32 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset23, false);
        org.jfree.data.Range range33 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset23);
        java.lang.Comparable comparable34 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset35 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset23, comparable34);
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
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertEquals("'" + number27 + "' != '" + 1.0d + "'", number27, 1.0d);
        org.junit.Assert.assertNotNull(range29);
        org.junit.Assert.assertEquals("'" + number30 + "' != '" + 400.0d + "'", number30, 400.0d);
        org.junit.Assert.assertNotNull(range32);
        org.junit.Assert.assertNotNull(range33);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, false);
        org.jfree.data.pie.PieDataset pieDataset21 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset17, (int) (short) 0);
        org.jfree.data.Range range23 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset17, false);
        org.jfree.data.Range range25 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, false);
        org.jfree.data.Range range27 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset17, true);
        java.util.List list28 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range30 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset17, list28, true);
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
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertNotNull(range27);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        double[] doubleArray10 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray17 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray18 = new double[][] { doubleArray10, doubleArray17 };
        org.jfree.data.category.CategoryDataset categoryDataset19 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray18);
        org.jfree.data.Range range21 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset19, false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range23 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(xYDataset0, list1, range21, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(categoryDataset19);
        org.junit.Assert.assertNotNull(range21);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        java.lang.Number[] numberArray6 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray11 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray21 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray22 = new java.lang.Number[][] { numberArray6, numberArray11, numberArray16, numberArray21 };
        org.jfree.data.category.CategoryDataset categoryDataset23 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray22);
        org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset23);
        java.util.List list25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range27 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(categoryDataset23, list25, true);
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
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        java.lang.Number[] numberArray6 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray11 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray21 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray22 = new java.lang.Number[][] { numberArray6, numberArray11, numberArray16, numberArray21 };
        org.jfree.data.category.CategoryDataset categoryDataset23 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray22);
        org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset23);
        org.jfree.data.Range range26 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset23, false);
        boolean boolean27 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset23);
        org.jfree.data.Range range28 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset23);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset30 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset23, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 4");
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
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(range28);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.jfree.data.function.Function2D function2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries5 = org.jfree.data.general.DatasetUtilities.sampleFunction2DToSeries(function2D0, (double) 100.0f, (double) (short) -1, 0, (java.lang.Comparable) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        java.lang.Comparable[] comparableArray6 = new java.lang.Comparable[] { 0, 10.0d, (byte) 1, ' ', (short) 100, (short) -1 };
        java.lang.Comparable[] comparableArray7 = null;
        double[] doubleArray20 = new double[] { (short) 0, (byte) 0 };
        double[][] doubleArray21 = new double[][] { doubleArray20 };
        org.jfree.data.category.CategoryDataset categoryDataset22 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray21);
        org.jfree.data.category.CategoryDataset categoryDataset23 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray21);
        org.jfree.data.category.CategoryDataset categoryDataset24 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray21);
        org.jfree.data.category.CategoryDataset categoryDataset25 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray21);
        org.jfree.data.category.CategoryDataset categoryDataset26 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray21);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.category.CategoryDataset categoryDataset27 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray6, comparableArray7, doubleArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'columnKeys' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparableArray6);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertNotNull(categoryDataset22);
        org.junit.Assert.assertNotNull(categoryDataset23);
        org.junit.Assert.assertNotNull(categoryDataset24);
        org.junit.Assert.assertNotNull(categoryDataset25);
        org.junit.Assert.assertNotNull(categoryDataset26);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        double[] doubleArray9 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray16 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray17 = new double[][] { doubleArray9, doubleArray16 };
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray17);
        org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset18, false);
        org.jfree.data.pie.PieDataset pieDataset22 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset18, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset25 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset22, (java.lang.Comparable) 100L, (double) 1);
        org.jfree.data.category.CategoryDataset categoryDataset26 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) (-1L), (org.jfree.data.KeyedValues) pieDataset25);
        org.jfree.data.Range range27 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset26);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset29 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset26, (java.lang.Comparable) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
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
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        java.lang.Number number18 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset17);
        boolean boolean19 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset17);
        boolean boolean20 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset17);
        java.lang.Number number21 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(categoryDataset17);
        java.util.List list22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset17, list22, true);
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
        org.junit.Assert.assertEquals("'" + number18 + "' != '" + 0.0d + "'", number18, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + number21 + "' != '" + 100.0d + "'", number21, 100.0d);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        org.jfree.data.xy.TableXYDataset tableXYDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.jfree.data.general.DatasetUtilities.calculateStackTotal(tableXYDataset0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        double[] doubleArray10 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray17 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray18 = new double[][] { doubleArray10, doubleArray17 };
        org.jfree.data.category.CategoryDataset categoryDataset19 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray18);
        org.jfree.data.category.CategoryDataset categoryDataset20 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray18);
        org.jfree.data.Range range21 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset20);
        org.jfree.data.Range range23 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset20, false);
        java.util.List list24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range26 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(categoryDataset20, list24, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'visibleSeriesKeys' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(categoryDataset19);
        org.junit.Assert.assertNotNull(categoryDataset20);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertNotNull(range23);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, false);
        org.jfree.data.pie.PieDataset pieDataset21 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset17, (int) (short) 0);
        org.jfree.data.Range range23 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset17, false);
        org.jfree.data.pie.PieDataset pieDataset25 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset17, 0);
        org.jfree.data.pie.PieDataset pieDataset29 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset25, (java.lang.Comparable) (byte) -1, 10.0d, 10);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertNotNull(categoryDataset17);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertNotNull(pieDataset21);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertNotNull(pieDataset25);
        org.junit.Assert.assertNotNull(pieDataset29);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        double[] doubleArray10 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray17 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray18 = new double[][] { doubleArray10, doubleArray17 };
        org.jfree.data.category.CategoryDataset categoryDataset19 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray18);
        java.lang.Number number20 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset19);
        org.jfree.data.Range range22 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset19, true);
        org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset19, false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range26 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(xYDataset0, list1, range24, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(categoryDataset19);
        org.junit.Assert.assertEquals("'" + number20 + "' != '" + 0.0d + "'", number20, 0.0d);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertNotNull(range24);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        java.lang.Number[] numberArray10 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray15 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray20 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray25 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray26 = new java.lang.Number[][] { numberArray10, numberArray15, numberArray20, numberArray25 };
        org.jfree.data.category.CategoryDataset categoryDataset27 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray26);
        org.jfree.data.category.CategoryDataset categoryDataset28 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray26);
        org.jfree.data.Range range30 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset28, (double) (-1.0f));
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range32 = org.jfree.data.general.DatasetUtilities.findRangeBounds(xYDataset0, list1, range30, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
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
        org.junit.Assert.assertNotNull(range30);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        org.jfree.data.function.Function2D function2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataset xYDataset5 = org.jfree.data.general.DatasetUtilities.sampleFunction2D(function2D0, (double) '4', (double) (short) 10, (int) (short) 10, (java.lang.Comparable) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        org.jfree.data.KeyedValues keyedValues1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.category.CategoryDataset categoryDataset2 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 20.0d, keyedValues1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'rowData' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        org.jfree.data.function.Function2D function2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataset xYDataset5 = org.jfree.data.general.DatasetUtilities.sampleFunction2D(function2D0, (double) 10L, (double) 1L, (int) (short) 10, (java.lang.Comparable) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        org.jfree.data.Range range2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range4 = org.jfree.data.general.DatasetUtilities.findRangeBounds(xYDataset0, list1, range2, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        java.lang.Number[] numberArray6 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray11 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray21 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray22 = new java.lang.Number[][] { numberArray6, numberArray11, numberArray16, numberArray21 };
        org.jfree.data.category.CategoryDataset categoryDataset23 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray22);
        java.lang.Number number24 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(categoryDataset23);
        org.jfree.data.Range range26 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset23, (double) (-1L));
        org.jfree.data.Range range28 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset23, false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset30 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset23, (int) (short) -1);
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
        org.junit.Assert.assertEquals("'" + number24 + "' != '" + 100.0d + "'", number24, 100.0d);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range28);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
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
        org.jfree.data.Range range33 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset23, false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset35 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset23, (java.lang.Comparable) ' ');
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
        org.junit.Assert.assertNotNull(range31);
        org.junit.Assert.assertNotNull(range33);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        java.lang.Number[] numberArray10 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray15 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray20 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray25 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray26 = new java.lang.Number[][] { numberArray10, numberArray15, numberArray20, numberArray25 };
        org.jfree.data.category.CategoryDataset categoryDataset27 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray26);
        org.jfree.data.category.CategoryDataset categoryDataset28 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray26);
        org.jfree.data.category.CategoryDataset categoryDataset29 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray26);
        java.util.List list30 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range32 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(categoryDataset29, list30, true);
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
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        java.lang.Number[] numberArray14 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray24 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray29 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray30 = new java.lang.Number[][] { numberArray14, numberArray19, numberArray24, numberArray29 };
        org.jfree.data.category.CategoryDataset categoryDataset31 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray30);
        org.jfree.data.category.CategoryDataset categoryDataset32 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray30);
        org.jfree.data.category.CategoryDataset categoryDataset33 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray30);
        org.jfree.data.category.CategoryDataset categoryDataset34 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray30);
        org.jfree.data.category.CategoryDataset categoryDataset35 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray30);
        org.junit.Assert.assertNotNull(numberArray14);
        org.junit.Assert.assertNotNull(numberArray19);
        org.junit.Assert.assertNotNull(numberArray24);
        org.junit.Assert.assertNotNull(numberArray29);
        org.junit.Assert.assertNotNull(numberArray30);
        org.junit.Assert.assertNotNull(categoryDataset31);
        org.junit.Assert.assertNotNull(categoryDataset32);
        org.junit.Assert.assertNotNull(categoryDataset33);
        org.junit.Assert.assertNotNull(categoryDataset34);
        org.junit.Assert.assertNotNull(categoryDataset35);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        java.lang.Number[] numberArray6 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray11 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray21 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray22 = new java.lang.Number[][] { numberArray6, numberArray11, numberArray16, numberArray21 };
        org.jfree.data.category.CategoryDataset categoryDataset23 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray22);
        org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset23);
        java.lang.Number number25 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset23);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset27 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset23, (java.lang.Comparable) 10L);
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
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        java.lang.Comparable[] comparableArray2 = new java.lang.Comparable[] { (short) 1, 100 };
        java.lang.Comparable[] comparableArray3 = new java.lang.Comparable[] {};
        double[] doubleArray16 = new double[] { (short) 0, (byte) 0 };
        double[][] doubleArray17 = new double[][] { doubleArray16 };
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray17);
        org.jfree.data.category.CategoryDataset categoryDataset19 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray17);
        org.jfree.data.category.CategoryDataset categoryDataset20 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray17);
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray17);
        org.jfree.data.category.CategoryDataset categoryDataset22 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray17);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.category.CategoryDataset categoryDataset23 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray2, comparableArray3, doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The number of row keys does not match the number of rows in the data array.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparableArray2);
        org.junit.Assert.assertNotNull(comparableArray3);
        org.junit.Assert.assertArrayEquals(comparableArray3, new java.lang.Comparable[] {});
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertNotNull(categoryDataset18);
        org.junit.Assert.assertNotNull(categoryDataset19);
        org.junit.Assert.assertNotNull(categoryDataset20);
        org.junit.Assert.assertNotNull(categoryDataset21);
        org.junit.Assert.assertNotNull(categoryDataset22);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        java.lang.Number[] numberArray8 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray18 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray23 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray24 = new java.lang.Number[][] { numberArray8, numberArray13, numberArray18, numberArray23 };
        org.jfree.data.category.CategoryDataset categoryDataset25 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray24);
        org.jfree.data.Range range26 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset25);
        org.jfree.data.Range range28 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset25, true);
        java.lang.Number number29 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset25);
        org.jfree.data.Range range31 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset25, true);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range33 = org.jfree.data.general.DatasetUtilities.findRangeBounds(xYDataset0, list1, range31, true);
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
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertEquals("'" + number29 + "' != '" + 1.0d + "'", number29, 1.0d);
        org.junit.Assert.assertNotNull(range31);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
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
        org.jfree.data.Range range35 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset23);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset37 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset23, (java.lang.Comparable) "");
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
        org.junit.Assert.assertEquals("'" + number27 + "' != '" + 1.0d + "'", number27, 1.0d);
        org.junit.Assert.assertNotNull(range29);
        org.junit.Assert.assertNotNull(range31);
        org.junit.Assert.assertNotNull(range33);
        org.junit.Assert.assertEquals("'" + number34 + "' != '" + 1.0d + "'", number34, 1.0d);
        org.junit.Assert.assertNotNull(range35);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        java.lang.Number[] numberArray8 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray18 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray23 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray24 = new java.lang.Number[][] { numberArray8, numberArray13, numberArray18, numberArray23 };
        org.jfree.data.category.CategoryDataset categoryDataset25 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray24);
        org.jfree.data.Range range26 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset25);
        org.jfree.data.Range range28 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset25, true);
        java.lang.Number number29 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset25);
        org.jfree.data.Range range31 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset25, true);
        org.jfree.data.Range range33 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset25, true);
        org.jfree.data.Range range35 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset25, true);
        org.jfree.data.Range range37 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset25, true);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range39 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(xYDataset0, list1, range37, false);
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
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertEquals("'" + number29 + "' != '" + 1.0d + "'", number29, 1.0d);
        org.junit.Assert.assertNotNull(range31);
        org.junit.Assert.assertNotNull(range33);
        org.junit.Assert.assertNotNull(range35);
        org.junit.Assert.assertNotNull(range37);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        org.jfree.data.xy.TableXYDataset tableXYDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(tableXYDataset0, 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        java.lang.Number[] numberArray6 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray11 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray21 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray22 = new java.lang.Number[][] { numberArray6, numberArray11, numberArray16, numberArray21 };
        org.jfree.data.category.CategoryDataset categoryDataset23 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray22);
        org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset23);
        java.lang.Number number25 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset23);
        org.jfree.data.Range range27 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset23, (double) 100L);
        java.util.List list28 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range30 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset23, list28, true);
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
        org.junit.Assert.assertEquals("'" + number25 + "' != '" + 1.0d + "'", number25, 1.0d);
        org.junit.Assert.assertNotNull(range27);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, false);
        org.jfree.data.pie.PieDataset pieDataset21 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset17, (int) (short) 0);
        org.jfree.data.Range range23 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset17, false);
        java.lang.Number number24 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset17);
        org.jfree.data.Range range25 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset17);
        org.jfree.data.Range range27 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset17, 130.0d);
        java.lang.Class<?> wildcardClass28 = categoryDataset17.getClass();
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
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, false);
        org.jfree.data.pie.PieDataset pieDataset21 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset17, (int) (short) 0);
        java.lang.Number number22 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(categoryDataset17);
        java.lang.Number number23 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset17);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset25 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset17, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 6");
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
        org.junit.Assert.assertNotNull(pieDataset21);
        org.junit.Assert.assertEquals("'" + number22 + "' != '" + 100.0d + "'", number22, 100.0d);
        org.junit.Assert.assertEquals("'" + number23 + "' != '" + 0.0d + "'", number23, 0.0d);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        java.lang.Number[] numberArray8 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray18 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray23 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray24 = new java.lang.Number[][] { numberArray8, numberArray13, numberArray18, numberArray23 };
        org.jfree.data.category.CategoryDataset categoryDataset25 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray24);
        org.jfree.data.Range range26 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset25);
        org.jfree.data.Range range28 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset25, false);
        org.jfree.data.Range range30 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset25, true);
        org.jfree.data.Range range31 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset25);
        org.jfree.data.Range range33 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset25, 10.0d);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range35 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(xYDataset0, list1, range33, true);
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
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertNotNull(range30);
        org.junit.Assert.assertNotNull(range31);
        org.junit.Assert.assertNotNull(range33);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        java.lang.Number[] numberArray14 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray24 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray29 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray30 = new java.lang.Number[][] { numberArray14, numberArray19, numberArray24, numberArray29 };
        org.jfree.data.category.CategoryDataset categoryDataset31 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray30);
        org.jfree.data.category.CategoryDataset categoryDataset32 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray30);
        org.jfree.data.category.CategoryDataset categoryDataset33 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray30);
        org.jfree.data.category.CategoryDataset categoryDataset34 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray30);
        org.jfree.data.category.CategoryDataset categoryDataset35 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray30);
        java.util.List list36 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range38 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset35, list36, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'visibleSeriesKeys' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray14);
        org.junit.Assert.assertNotNull(numberArray19);
        org.junit.Assert.assertNotNull(numberArray24);
        org.junit.Assert.assertNotNull(numberArray29);
        org.junit.Assert.assertNotNull(numberArray30);
        org.junit.Assert.assertNotNull(categoryDataset31);
        org.junit.Assert.assertNotNull(categoryDataset32);
        org.junit.Assert.assertNotNull(categoryDataset33);
        org.junit.Assert.assertNotNull(categoryDataset34);
        org.junit.Assert.assertNotNull(categoryDataset35);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        org.jfree.data.function.Function2D function2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries5 = org.jfree.data.general.DatasetUtilities.sampleFunction2DToSeries(function2D0, (double) (short) 100, 400.0d, (int) (byte) 1, (java.lang.Comparable) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset0, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        org.jfree.data.xy.TableXYDataset tableXYDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.jfree.data.general.DatasetUtilities.calculateStackTotal(tableXYDataset0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        java.lang.Number number18 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset17);
        java.util.List list19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range21 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset17, list19, false);
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
        org.junit.Assert.assertEquals("'" + number18 + "' != '" + 0.0d + "'", number18, 0.0d);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        java.lang.Number[] numberArray8 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray18 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray23 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray24 = new java.lang.Number[][] { numberArray8, numberArray13, numberArray18, numberArray23 };
        org.jfree.data.category.CategoryDataset categoryDataset25 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray24);
        java.lang.Number number26 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(categoryDataset25);
        org.jfree.data.Range range28 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset25, (double) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range30 = org.jfree.data.general.DatasetUtilities.findRangeBounds(xYDataset0, list1, range28, false);
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
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, false);
        org.jfree.data.pie.PieDataset pieDataset21 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset17, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset24 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset21, (java.lang.Comparable) 100L, (double) 1);
        org.jfree.data.pie.PieDataset pieDataset27 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset21, (java.lang.Comparable) (short) 1, 130.0d);
        boolean boolean28 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset21);
        boolean boolean29 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset21);
        boolean boolean30 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset21);
        double double31 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset21);
        org.jfree.data.pie.PieDataset pieDataset34 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset21, (java.lang.Comparable) 100L, (double) (short) 10);
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
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 130.0d + "'", double31 == 130.0d);
        org.junit.Assert.assertNotNull(pieDataset34);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, false);
        java.lang.Class<?> wildcardClass20 = range19.getClass();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertNotNull(categoryDataset17);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, false);
        org.jfree.data.pie.PieDataset pieDataset21 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset17, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset24 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset21, (java.lang.Comparable) 100L, (double) 1);
        org.jfree.data.pie.PieDataset pieDataset27 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset21, (java.lang.Comparable) (short) 1, 130.0d);
        boolean boolean28 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset21);
        java.lang.Comparable comparable29 = null;
        org.jfree.data.pie.PieDataset pieDataset32 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset21, comparable29, (double) 10.0f, (int) (short) 100);
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
        org.junit.Assert.assertNotNull(pieDataset32);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        double[] doubleArray10 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray17 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray18 = new double[][] { doubleArray10, doubleArray17 };
        org.jfree.data.category.CategoryDataset categoryDataset19 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray18);
        org.jfree.data.Range range21 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset19, false);
        org.jfree.data.pie.PieDataset pieDataset23 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset19, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset26 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset23, (java.lang.Comparable) 100L, (double) 1);
        org.jfree.data.category.CategoryDataset categoryDataset27 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 130.0d, (org.jfree.data.KeyedValues) pieDataset26);
        org.jfree.data.category.CategoryDataset categoryDataset28 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) (byte) 100, (org.jfree.data.KeyedValues) pieDataset26);
        org.jfree.data.Range range30 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset28, true);
        java.util.List list31 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range33 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset28, list31, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'visibleSeriesKeys' argument.");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(categoryDataset27);
        org.junit.Assert.assertNotNull(categoryDataset28);
        org.junit.Assert.assertNotNull(range30);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
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
        org.jfree.data.Range range35 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset23);
        java.util.List list36 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range38 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(categoryDataset23, list36, true);
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
        org.junit.Assert.assertNotNull(range31);
        org.junit.Assert.assertNotNull(range33);
        org.junit.Assert.assertEquals("'" + number34 + "' != '" + 1.0d + "'", number34, 1.0d);
        org.junit.Assert.assertNotNull(range35);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        java.lang.Number[] numberArray12 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray17 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray22 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray27 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray28 = new java.lang.Number[][] { numberArray12, numberArray17, numberArray22, numberArray27 };
        org.jfree.data.category.CategoryDataset categoryDataset29 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray28);
        org.jfree.data.category.CategoryDataset categoryDataset30 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray28);
        org.jfree.data.category.CategoryDataset categoryDataset31 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray28);
        org.jfree.data.category.CategoryDataset categoryDataset32 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray28);
        org.jfree.data.KeyToGroupMap keyToGroupMap33 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range34 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset32, keyToGroupMap33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberArray12);
        org.junit.Assert.assertNotNull(numberArray17);
        org.junit.Assert.assertNotNull(numberArray22);
        org.junit.Assert.assertNotNull(numberArray27);
        org.junit.Assert.assertNotNull(numberArray28);
        org.junit.Assert.assertNotNull(categoryDataset29);
        org.junit.Assert.assertNotNull(categoryDataset30);
        org.junit.Assert.assertNotNull(categoryDataset31);
        org.junit.Assert.assertNotNull(categoryDataset32);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        java.lang.Number[] numberArray6 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray11 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray21 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray22 = new java.lang.Number[][] { numberArray6, numberArray11, numberArray16, numberArray21 };
        org.jfree.data.category.CategoryDataset categoryDataset23 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray22);
        java.lang.Number number24 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(categoryDataset23);
        org.jfree.data.Range range26 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset23, true);
        org.jfree.data.Range range27 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset23);
        java.lang.Number number28 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset23);
        org.jfree.data.Range range30 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset23, (double) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset32 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset23, (java.lang.Comparable) 400.0d);
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
        org.junit.Assert.assertEquals("'" + number24 + "' != '" + 100.0d + "'", number24, 100.0d);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertEquals("'" + number28 + "' != '" + 400.0d + "'", number28, 400.0d);
        org.junit.Assert.assertNotNull(range30);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset17, false);
        org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset17);
        org.jfree.data.Range range22 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset17, (double) (short) 10);
        org.jfree.data.Range range23 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset17);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset25 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset17, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 6");
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
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertNotNull(range23);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        java.lang.Number number18 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset17);
        boolean boolean19 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset17);
        java.util.List list20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range22 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(categoryDataset17, list20, true);
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
        org.junit.Assert.assertEquals("'" + number18 + "' != '" + 0.0d + "'", number18, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        java.lang.Number[] numberArray8 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray18 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray23 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray24 = new java.lang.Number[][] { numberArray8, numberArray13, numberArray18, numberArray23 };
        org.jfree.data.category.CategoryDataset categoryDataset25 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray24);
        org.jfree.data.Range range26 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset25);
        org.jfree.data.Range range27 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset25);
        boolean boolean28 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset25);
        org.jfree.data.Range range29 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset25);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range31 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(xYDataset0, list1, range29, false);
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
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(range29);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        double[] doubleArray10 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray17 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray18 = new double[][] { doubleArray10, doubleArray17 };
        org.jfree.data.category.CategoryDataset categoryDataset19 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray18);
        org.jfree.data.Range range21 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset19, false);
        org.jfree.data.Range range22 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset19);
        org.jfree.data.Range range23 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset19);
        java.lang.Number number24 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset19);
        java.lang.Number number25 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(categoryDataset19);
        org.jfree.data.Range range27 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset19, (double) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range29 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(xYDataset0, list1, range27, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(categoryDataset19);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertEquals("'" + number24 + "' != '" + 0.0d + "'", number24, 0.0d);
        org.junit.Assert.assertEquals("'" + number25 + "' != '" + 100.0d + "'", number25, 100.0d);
        org.junit.Assert.assertNotNull(range27);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        double[] doubleArray6 = new double[] {};
        double[][] doubleArray7 = new double[][] { doubleArray6 };
        org.jfree.data.category.CategoryDataset categoryDataset8 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray7);
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray7);
        org.jfree.data.category.CategoryDataset categoryDataset10 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray7);
        org.jfree.data.pie.PieDataset pieDataset12 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset10, (java.lang.Comparable) 0);
        org.jfree.data.Range range13 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset10);
        java.util.List list14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range16 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(categoryDataset10, list14, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'visibleSeriesKeys' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertNotNull(categoryDataset8);
        org.junit.Assert.assertNotNull(categoryDataset9);
        org.junit.Assert.assertNotNull(categoryDataset10);
        org.junit.Assert.assertNotNull(pieDataset12);
        org.junit.Assert.assertNull(range13);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        java.lang.Number[] numberArray10 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray15 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray20 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray25 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray26 = new java.lang.Number[][] { numberArray10, numberArray15, numberArray20, numberArray25 };
        org.jfree.data.category.CategoryDataset categoryDataset27 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray26);
        org.jfree.data.category.CategoryDataset categoryDataset28 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray26);
        org.jfree.data.Range range29 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset28);
        boolean boolean30 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset28);
        org.jfree.data.Range range31 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset28);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range33 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(xYDataset0, list1, range31, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
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
        org.junit.Assert.assertNotNull(range29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(range31);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
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
        double double29 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset22);
        boolean boolean30 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset22);
        org.jfree.data.pie.PieDataset pieDataset33 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset22, (java.lang.Comparable) (byte) 100, (-1.0d));
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
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 130.0d + "'", double29 == 130.0d);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(pieDataset33);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        org.jfree.data.function.Function2D function2D0 = null;
        java.lang.Comparable comparable4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataset xYDataset5 = org.jfree.data.general.DatasetUtilities.sampleFunction2D(function2D0, (double) (byte) 1, 10.0d, (int) (short) -1, comparable4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
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
        org.jfree.data.Range range34 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset23, false);
        org.jfree.data.Range range35 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset23);
        org.jfree.data.pie.PieDataset pieDataset37 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset23, (int) (byte) 1);
        org.jfree.data.pie.PieDataset pieDataset41 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset37, (java.lang.Comparable) 0, (double) 1L, (int) (short) 10);
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
        org.junit.Assert.assertNotNull(range34);
        org.junit.Assert.assertNotNull(range35);
        org.junit.Assert.assertNotNull(pieDataset37);
        org.junit.Assert.assertNotNull(pieDataset41);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        double[] doubleArray6 = new double[] { (short) 0, (byte) 0 };
        double[][] doubleArray7 = new double[][] { doubleArray6 };
        org.jfree.data.category.CategoryDataset categoryDataset8 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray7);
        org.jfree.data.pie.PieDataset pieDataset10 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset8, 0);
        org.jfree.data.Range range11 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset8);
        org.jfree.data.Range range13 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset8, true);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range15 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(xYDataset0, list1, range13, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertNotNull(categoryDataset8);
        org.junit.Assert.assertNotNull(pieDataset10);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range13);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        double[] doubleArray10 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray17 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray18 = new double[][] { doubleArray10, doubleArray17 };
        org.jfree.data.category.CategoryDataset categoryDataset19 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray18);
        java.lang.Number number20 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset19);
        boolean boolean21 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset19);
        org.jfree.data.Range range22 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset19);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.findRangeBounds(xYDataset0, list1, range22, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(categoryDataset19);
        org.junit.Assert.assertEquals("'" + number20 + "' != '" + 0.0d + "'", number20, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(range22);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        java.lang.Number[] numberArray8 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray18 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray23 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray24 = new java.lang.Number[][] { numberArray8, numberArray13, numberArray18, numberArray23 };
        org.jfree.data.category.CategoryDataset categoryDataset25 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray24);
        org.jfree.data.Range range26 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset25);
        org.jfree.data.Range range28 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset25, false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range30 = org.jfree.data.general.DatasetUtilities.findRangeBounds(xYDataset0, list1, range28, false);
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
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range28);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset17, false);
        org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset17);
        org.jfree.data.Range range22 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset17, (double) (short) 10);
        org.jfree.data.Range range23 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset17);
        org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset17);
        boolean boolean25 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset17);
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
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + number26 + "' != '" + 0.0d + "'", number26, 0.0d);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.jfree.data.xy.TableXYDataset tableXYDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range2 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(tableXYDataset0, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        org.jfree.data.xy.TableXYDataset tableXYDataset0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.jfree.data.general.DatasetUtilities.calculateStackTotal(tableXYDataset0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        double[] doubleArray10 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray17 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray18 = new double[][] { doubleArray10, doubleArray17 };
        org.jfree.data.category.CategoryDataset categoryDataset19 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray18);
        org.jfree.data.category.CategoryDataset categoryDataset20 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray18);
        org.jfree.data.Range range21 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset20);
        org.jfree.data.Range range22 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset20);
        java.lang.Number number23 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(categoryDataset20);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(categoryDataset19);
        org.junit.Assert.assertNotNull(categoryDataset20);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertEquals("'" + number23 + "' != '" + 100.0d + "'", number23, 100.0d);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        double[] doubleArray10 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray17 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray18 = new double[][] { doubleArray10, doubleArray17 };
        org.jfree.data.category.CategoryDataset categoryDataset19 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray18);
        org.jfree.data.Range range21 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset19, false);
        org.jfree.data.Range range22 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset19);
        org.jfree.data.Range range23 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset19);
        java.lang.Number number24 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset19);
        java.lang.Number number25 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(categoryDataset19);
        org.jfree.data.Range range26 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset19);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range28 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(xYDataset0, list1, range26, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(categoryDataset19);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertEquals("'" + number24 + "' != '" + 0.0d + "'", number24, 0.0d);
        org.junit.Assert.assertEquals("'" + number25 + "' != '" + 100.0d + "'", number25, 100.0d);
        org.junit.Assert.assertNotNull(range26);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
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
        org.jfree.data.Range range35 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset23);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset37 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset23, (java.lang.Comparable) (-1.0d));
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
        org.junit.Assert.assertEquals("'" + number27 + "' != '" + 1.0d + "'", number27, 1.0d);
        org.junit.Assert.assertNotNull(range29);
        org.junit.Assert.assertNotNull(range31);
        org.junit.Assert.assertNotNull(range33);
        org.junit.Assert.assertEquals("'" + number34 + "' != '" + 1.0d + "'", number34, 1.0d);
        org.junit.Assert.assertNotNull(range35);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, false);
        org.jfree.data.pie.PieDataset pieDataset21 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset17, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset24 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset21, (java.lang.Comparable) ' ', (double) '#');
        boolean boolean25 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset24);
        org.jfree.data.pie.PieDataset pieDataset29 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset24, (java.lang.Comparable) 0.0d, (double) 100L, (int) (byte) 1);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertNotNull(categoryDataset17);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertNotNull(pieDataset21);
        org.junit.Assert.assertNotNull(pieDataset24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(pieDataset29);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, false);
        org.jfree.data.pie.PieDataset pieDataset21 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset17, (int) (short) 0);
        org.jfree.data.Range range23 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset17, false);
        org.jfree.data.Range range25 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, false);
        java.lang.Class<?> wildcardClass26 = range25.getClass();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertNotNull(categoryDataset17);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertNotNull(pieDataset21);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, false);
        org.jfree.data.pie.PieDataset pieDataset21 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset17, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset24 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset21, (java.lang.Comparable) ' ', (double) '#');
        boolean boolean25 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset24);
        boolean boolean26 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset24);
        org.jfree.data.pie.PieDataset pieDataset29 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset24, (java.lang.Comparable) (short) 1, (double) 0L);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertNotNull(categoryDataset17);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertNotNull(pieDataset21);
        org.junit.Assert.assertNotNull(pieDataset24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(pieDataset29);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        java.lang.Comparable[] comparableArray3 = new java.lang.Comparable[] { (byte) 1, 1.0d, (-1.0f) };
        java.lang.Comparable[] comparableArray4 = new java.lang.Comparable[] {};
        double[][] doubleArray7 = new double[][] {};
        org.jfree.data.category.CategoryDataset categoryDataset8 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray7);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray3, comparableArray4, doubleArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The number of row keys does not match the number of rows in the data array.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparableArray3);
        org.junit.Assert.assertNotNull(comparableArray4);
        org.junit.Assert.assertArrayEquals(comparableArray4, new java.lang.Comparable[] {});
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[][] {});
        org.junit.Assert.assertNotNull(categoryDataset8);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        double[] doubleArray4 = new double[] { (short) 0, (byte) 0 };
        double[][] doubleArray5 = new double[][] { doubleArray4 };
        org.jfree.data.category.CategoryDataset categoryDataset6 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray5);
        org.jfree.data.pie.PieDataset pieDataset8 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset6, 0);
        org.jfree.data.Range range9 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset6);
        org.jfree.data.KeyToGroupMap keyToGroupMap10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range11 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset6, keyToGroupMap10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(categoryDataset6);
        org.junit.Assert.assertNotNull(pieDataset8);
        org.junit.Assert.assertNotNull(range9);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        java.lang.Number[] numberArray8 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray18 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray23 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray24 = new java.lang.Number[][] { numberArray8, numberArray13, numberArray18, numberArray23 };
        org.jfree.data.category.CategoryDataset categoryDataset25 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray24);
        org.jfree.data.Range range26 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset25);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range28 = org.jfree.data.general.DatasetUtilities.findRangeBounds(xYDataset0, list1, range26, false);
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
        org.junit.Assert.assertNotNull(range26);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
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
        boolean boolean29 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset23);
        org.jfree.data.KeyToGroupMap keyToGroupMap30 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range31 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset23, keyToGroupMap30);
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
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        java.lang.Number[] numberArray8 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray18 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray23 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray24 = new java.lang.Number[][] { numberArray8, numberArray13, numberArray18, numberArray23 };
        org.jfree.data.category.CategoryDataset categoryDataset25 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray24);
        org.jfree.data.Range range26 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset25);
        org.jfree.data.Range range28 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset25, true);
        java.lang.Number number29 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset25);
        org.jfree.data.Range range31 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset25, true);
        org.jfree.data.Range range33 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset25, true);
        org.jfree.data.Range range34 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset25);
        org.jfree.data.Range range36 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset25, false);
        org.jfree.data.Range range37 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset25);
        java.lang.Number number38 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(categoryDataset25);
        org.jfree.data.Range range40 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset25, true);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range42 = org.jfree.data.general.DatasetUtilities.findRangeBounds(xYDataset0, list1, range40, false);
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
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertEquals("'" + number29 + "' != '" + 1.0d + "'", number29, 1.0d);
        org.junit.Assert.assertNotNull(range31);
        org.junit.Assert.assertNotNull(range33);
        org.junit.Assert.assertNotNull(range34);
        org.junit.Assert.assertNotNull(range36);
        org.junit.Assert.assertNotNull(range37);
        org.junit.Assert.assertEquals("'" + number38 + "' != '" + 100.0d + "'", number38, 100.0d);
        org.junit.Assert.assertNotNull(range40);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
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
        java.lang.Class<?> wildcardClass32 = number31.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.jfree.data.function.Function2D function2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataset xYDataset5 = org.jfree.data.general.DatasetUtilities.sampleFunction2D(function2D0, (double) (byte) 100, (double) (short) 10, 0, (java.lang.Comparable) 400.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        java.lang.Comparable[] comparableArray6 = new java.lang.Comparable[] { (-1L), (byte) 0, 0.0d, (-1.0f), 10.0d, 20.0d };
        java.lang.Comparable[] comparableArray10 = new java.lang.Comparable[] { (-1.0f), 1, 1 };
        double[] doubleArray16 = new double[] { 'a', (-1.0f), (-1), 0L, (byte) -1 };
        double[] doubleArray22 = new double[] { 'a', (-1.0f), (-1), 0L, (byte) -1 };
        double[] doubleArray28 = new double[] { 'a', (-1.0f), (-1), 0L, (byte) -1 };
        double[] doubleArray34 = new double[] { 'a', (-1.0f), (-1), 0L, (byte) -1 };
        double[] doubleArray40 = new double[] { 'a', (-1.0f), (-1), 0L, (byte) -1 };
        double[] doubleArray46 = new double[] { 'a', (-1.0f), (-1), 0L, (byte) -1 };
        double[][] doubleArray47 = new double[][] { doubleArray16, doubleArray22, doubleArray28, doubleArray34, doubleArray40, doubleArray46 };
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.category.CategoryDataset categoryDataset48 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray6, comparableArray10, doubleArray47);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Duplicate items in 'columnKeys'.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparableArray6);
        org.junit.Assert.assertNotNull(comparableArray10);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 97.0d, (-1.0d), (-1.0d), 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 97.0d, (-1.0d), (-1.0d), 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertArrayEquals(doubleArray28, new double[] { 97.0d, (-1.0d), (-1.0d), 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] { 97.0d, (-1.0d), (-1.0d), 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertArrayEquals(doubleArray40, new double[] { 97.0d, (-1.0d), (-1.0d), 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertArrayEquals(doubleArray46, new double[] { 97.0d, (-1.0d), (-1.0d), 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray47);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        double[] doubleArray4 = new double[] {};
        double[][] doubleArray5 = new double[][] { doubleArray4 };
        org.jfree.data.category.CategoryDataset categoryDataset6 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray5);
        org.jfree.data.category.CategoryDataset categoryDataset7 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray5);
        boolean boolean8 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset7);
        org.jfree.data.Range range10 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset7, (double) (byte) 0);
        org.jfree.data.Range range11 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset7);
        java.lang.Number number12 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(categoryDataset7);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(categoryDataset6);
        org.junit.Assert.assertNotNull(categoryDataset7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(range10);
        org.junit.Assert.assertNull(range11);
        org.junit.Assert.assertNull(number12);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        java.lang.Number number18 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset17);
        boolean boolean19 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset17);
        org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset17);
        java.lang.Number number21 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset17);
        org.jfree.data.Range range22 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset17);
        org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset17, false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset26 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset17, (java.lang.Comparable) (short) 0);
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
        org.junit.Assert.assertEquals("'" + number18 + "' != '" + 0.0d + "'", number18, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertEquals("'" + number21 + "' != '" + 200.0d + "'", number21, 200.0d);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertNotNull(range24);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        org.jfree.data.function.Function2D function2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries5 = org.jfree.data.general.DatasetUtilities.sampleFunction2DToSeries(function2D0, 130.0d, (double) 0, (int) (byte) -1, (java.lang.Comparable) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        java.lang.Number[] numberArray8 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray18 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray23 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray24 = new java.lang.Number[][] { numberArray8, numberArray13, numberArray18, numberArray23 };
        org.jfree.data.category.CategoryDataset categoryDataset25 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray24);
        org.jfree.data.Range range26 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset25);
        org.jfree.data.Range range28 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset25, true);
        java.lang.Number number29 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset25);
        org.jfree.data.Range range30 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset25);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range32 = org.jfree.data.general.DatasetUtilities.findRangeBounds(xYDataset0, list1, range30, true);
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
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertEquals("'" + number29 + "' != '" + 1.0d + "'", number29, 1.0d);
        org.junit.Assert.assertNotNull(range30);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
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
        boolean boolean31 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset22);
        org.jfree.data.pie.PieDataset pieDataset34 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset22, (java.lang.Comparable) '#', (double) 10);
        org.jfree.data.pie.PieDataset pieDataset38 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset34, (java.lang.Comparable) 0.0f, (-1.0d), 0);
        java.lang.Class<?> wildcardClass39 = pieDataset34.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(pieDataset34);
        org.junit.Assert.assertNotNull(pieDataset38);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        double[] doubleArray10 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray17 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray18 = new double[][] { doubleArray10, doubleArray17 };
        org.jfree.data.category.CategoryDataset categoryDataset19 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray18);
        org.jfree.data.Range range21 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset19, false);
        org.jfree.data.pie.PieDataset pieDataset23 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset19, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset26 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset23, (java.lang.Comparable) 100L, (double) 1);
        org.jfree.data.category.CategoryDataset categoryDataset27 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 130.0d, (org.jfree.data.KeyedValues) pieDataset26);
        org.jfree.data.category.CategoryDataset categoryDataset28 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) (byte) 100, (org.jfree.data.KeyedValues) pieDataset26);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset30 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset28, (java.lang.Comparable) '#');
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
        org.junit.Assert.assertNotNull(categoryDataset27);
        org.junit.Assert.assertNotNull(categoryDataset28);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        org.jfree.data.function.Function2D function2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries5 = org.jfree.data.general.DatasetUtilities.sampleFunction2DToSeries(function2D0, (double) 0L, (double) '4', (int) (short) 10, (java.lang.Comparable) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        java.util.List list1 = null;
        double[] doubleArray10 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray17 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray18 = new double[][] { doubleArray10, doubleArray17 };
        org.jfree.data.category.CategoryDataset categoryDataset19 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray18);
        org.jfree.data.Range range21 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset19, false);
        org.jfree.data.pie.PieDataset pieDataset23 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset19, (int) (short) 0);
        org.jfree.data.Range range25 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset19, false);
        java.lang.Number number26 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset19);
        org.jfree.data.Range range28 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset19, false);
        org.jfree.data.Range range30 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset19, true);
        org.jfree.data.Range range31 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset19);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range33 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(xYDataset0, list1, range31, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertEquals("'" + number26 + "' != '" + 200.0d + "'", number26, 200.0d);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertNotNull(range30);
        org.junit.Assert.assertNotNull(range31);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        java.lang.Number[] numberArray6 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray11 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray21 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray22 = new java.lang.Number[][] { numberArray6, numberArray11, numberArray16, numberArray21 };
        org.jfree.data.category.CategoryDataset categoryDataset23 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray22);
        java.lang.Number number24 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(categoryDataset23);
        org.jfree.data.Range range26 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset23, true);
        org.jfree.data.Range range27 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset23);
        java.lang.Number number28 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset23);
        org.jfree.data.Range range30 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset23, (double) 0);
        java.util.List list31 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range33 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(categoryDataset23, list31, false);
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
        org.junit.Assert.assertEquals("'" + number24 + "' != '" + 100.0d + "'", number24, 100.0d);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertEquals("'" + number28 + "' != '" + 400.0d + "'", number28, 400.0d);
        org.junit.Assert.assertNotNull(range30);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        java.lang.Number number18 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset17);
        boolean boolean19 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset17);
        org.jfree.data.Range range21 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset17, true);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset23 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset17, (java.lang.Comparable) 1);
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
        org.junit.Assert.assertEquals("'" + number18 + "' != '" + 0.0d + "'", number18, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(range21);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        java.lang.Number[] numberArray6 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray11 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray21 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray22 = new java.lang.Number[][] { numberArray6, numberArray11, numberArray16, numberArray21 };
        org.jfree.data.category.CategoryDataset categoryDataset23 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray22);
        java.lang.Number number24 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(categoryDataset23);
        org.jfree.data.Range range26 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset23, true);
        org.jfree.data.Range range27 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset23);
        java.lang.Number number28 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset23);
        org.jfree.data.Range range30 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset23, (double) 0);
        org.jfree.data.Range range32 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset23, true);
        java.util.List list33 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range35 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset23, list33, false);
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
        org.junit.Assert.assertEquals("'" + number24 + "' != '" + 100.0d + "'", number24, 100.0d);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertEquals("'" + number28 + "' != '" + 400.0d + "'", number28, 400.0d);
        org.junit.Assert.assertNotNull(range30);
        org.junit.Assert.assertNotNull(range32);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        java.lang.Number[] numberArray6 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray11 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray21 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray22 = new java.lang.Number[][] { numberArray6, numberArray11, numberArray16, numberArray21 };
        org.jfree.data.category.CategoryDataset categoryDataset23 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray22);
        java.lang.Number number24 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(categoryDataset23);
        org.jfree.data.Range range26 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset23, (double) (-1L));
        org.jfree.data.Range range28 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset23, false);
        org.jfree.data.KeyToGroupMap keyToGroupMap29 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range30 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset23, keyToGroupMap29);
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
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range28);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        java.lang.Comparable[] comparableArray1 = new java.lang.Comparable[] { '4' };
        java.lang.Comparable[] comparableArray3 = new java.lang.Comparable[] { (short) 100 };
        double[][] doubleArray4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.category.CategoryDataset categoryDataset5 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray1, comparableArray3, doubleArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparableArray1);
        org.junit.Assert.assertNotNull(comparableArray3);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
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
        org.jfree.data.category.CategoryDataset categoryDataset34 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) (-1.0d), (org.jfree.data.KeyedValues) pieDataset33);
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
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
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
        boolean boolean31 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset22);
        org.jfree.data.pie.PieDataset pieDataset34 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset22, (java.lang.Comparable) '#', (double) 10);
        java.lang.Class<?> wildcardClass35 = pieDataset22.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(pieDataset34);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.pie.PieDataset pieDataset32 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset23, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 4");
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
        org.junit.Assert.assertNotNull(range30);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        java.util.List list1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range3 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(categoryDataset0, list1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        double[] doubleArray2 = new double[] {};
        double[][] doubleArray3 = new double[][] { doubleArray2 };
        org.jfree.data.category.CategoryDataset categoryDataset4 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray3);
        java.lang.Number number5 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(categoryDataset4);
        java.lang.Number number6 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset4);
        java.util.List list7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range9 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(categoryDataset4, list7, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'visibleSeriesKeys' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(categoryDataset4);
        org.junit.Assert.assertNull(number5);
        org.junit.Assert.assertNull(number6);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        org.jfree.data.function.Function2D function2D0 = null;
        java.lang.Comparable comparable4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataset xYDataset5 = org.jfree.data.general.DatasetUtilities.sampleFunction2D(function2D0, 0.0d, (double) (short) 1, (int) '4', comparable4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'f' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        double[] doubleArray8 = new double[] { (short) 0, (byte) 0 };
        double[][] doubleArray9 = new double[][] { doubleArray8 };
        org.jfree.data.category.CategoryDataset categoryDataset10 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray9);
        org.jfree.data.category.CategoryDataset categoryDataset11 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray9);
        org.jfree.data.category.CategoryDataset categoryDataset12 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray9);
        java.util.List list13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range15 = org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(categoryDataset12, list13, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'visibleSeriesKeys' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertNotNull(categoryDataset10);
        org.junit.Assert.assertNotNull(categoryDataset11);
        org.junit.Assert.assertNotNull(categoryDataset12);
    }
}

