package org.jfree.data.general;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

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
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test001");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, false);
        org.jfree.data.pie.PieDataset pieDataset21 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset17, (int) (short) 0);
        java.lang.Comparable comparable22 = null;
        org.jfree.data.pie.PieDataset pieDataset25 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset21, comparable22, (double) 10L, (int) (byte) 100);
        boolean boolean26 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset21 and pieDataset25", pieDataset21.equals(pieDataset25) ? pieDataset21.hashCode() == pieDataset25.hashCode() : true);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, false);
        org.jfree.data.pie.PieDataset pieDataset21 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset17, (int) (short) 0);
        java.lang.Comparable comparable22 = null;
        org.jfree.data.pie.PieDataset pieDataset25 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset21, comparable22, (double) 10L, (int) (byte) 100);
        java.lang.Class<?> wildcardClass26 = pieDataset25.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset21 and pieDataset25", pieDataset21.equals(pieDataset25) ? pieDataset21.hashCode() == pieDataset25.hashCode() : true);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, false);
        org.jfree.data.pie.PieDataset pieDataset21 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset17, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset24 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset21, (java.lang.Comparable) 10L, (double) (-1L));
        org.jfree.data.pie.PieDataset pieDataset27 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset24, (java.lang.Comparable) 10L, 100.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset21 and pieDataset24", pieDataset21.equals(pieDataset24) ? pieDataset21.hashCode() == pieDataset24.hashCode() : true);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, false);
        org.jfree.data.pie.PieDataset pieDataset21 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset17, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset24 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset21, (java.lang.Comparable) 100L, (double) 1);
        org.jfree.data.pie.PieDataset pieDataset28 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset21, (java.lang.Comparable) false, (double) 100.0f, (int) (short) 100);
        boolean boolean29 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset21 and pieDataset28", pieDataset21.equals(pieDataset28) ? pieDataset21.hashCode() == pieDataset28.hashCode() : true);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        double[] doubleArray9 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray16 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray17 = new double[][] { doubleArray9, doubleArray16 };
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray17);
        org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset18, false);
        org.jfree.data.pie.PieDataset pieDataset22 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset18, (int) (short) 0);
        java.lang.Comparable comparable23 = null;
        org.jfree.data.pie.PieDataset pieDataset26 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset22, comparable23, (double) 10L, (int) (byte) 100);
        org.jfree.data.category.CategoryDataset categoryDataset27 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 1.0d, (org.jfree.data.KeyedValues) pieDataset26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset22 and pieDataset26", pieDataset22.equals(pieDataset26) ? pieDataset22.hashCode() == pieDataset26.hashCode() : true);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, false);
        org.jfree.data.pie.PieDataset pieDataset21 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset17, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset24 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset21, (java.lang.Comparable) 100L, (double) 1);
        org.jfree.data.pie.PieDataset pieDataset27 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset21, (java.lang.Comparable) (short) 1, 130.0d);
        org.jfree.data.pie.PieDataset pieDataset31 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset27, (java.lang.Comparable) 100.0f, (double) (-1), (int) ' ');
        boolean boolean32 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset27 and pieDataset31", pieDataset27.equals(pieDataset31) ? pieDataset27.hashCode() == pieDataset31.hashCode() : true);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
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
        org.jfree.data.pie.PieDataset pieDataset32 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset28, 0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset22 and pieDataset30", pieDataset22.equals(pieDataset30) ? pieDataset22.hashCode() == pieDataset30.hashCode() : true);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, false);
        org.jfree.data.pie.PieDataset pieDataset21 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset17, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset24 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset21, (java.lang.Comparable) 100L, (double) 1);
        org.jfree.data.pie.PieDataset pieDataset28 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset21, (java.lang.Comparable) false, (double) 100.0f, (int) (short) 100);
        org.jfree.data.pie.PieDataset pieDataset31 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset21, (java.lang.Comparable) (-1.0f), (double) (byte) 1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset21 and pieDataset28", pieDataset21.equals(pieDataset28) ? pieDataset21.hashCode() == pieDataset28.hashCode() : true);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, false);
        org.jfree.data.pie.PieDataset pieDataset21 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset17, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset24 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset21, (java.lang.Comparable) 100L, (double) 1);
        org.jfree.data.pie.PieDataset pieDataset27 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset21, (java.lang.Comparable) (short) 1, 130.0d);
        org.jfree.data.pie.PieDataset pieDataset31 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset27, (java.lang.Comparable) 100.0f, (double) (-1), (int) ' ');
        java.lang.Class<?> wildcardClass32 = pieDataset31.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset27 and pieDataset31", pieDataset27.equals(pieDataset31) ? pieDataset27.hashCode() == pieDataset31.hashCode() : true);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, false);
        org.jfree.data.pie.PieDataset pieDataset21 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset17, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset24 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset21, (java.lang.Comparable) 10L, (double) (-1L));
        boolean boolean25 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset21 and pieDataset24", pieDataset21.equals(pieDataset24) ? pieDataset21.hashCode() == pieDataset24.hashCode() : true);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        double[] doubleArray12 = new double[] { (short) 0, (byte) 0 };
        double[][] doubleArray13 = new double[][] { doubleArray12 };
        org.jfree.data.category.CategoryDataset categoryDataset14 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray13);
        org.jfree.data.category.CategoryDataset categoryDataset15 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray13);
        org.jfree.data.category.CategoryDataset categoryDataset16 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray13);
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray13);
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset15 and categoryDataset17", categoryDataset15.equals(categoryDataset17) ? categoryDataset15.hashCode() == categoryDataset17.hashCode() : true);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        java.lang.Number[] numberArray12 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray17 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray22 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray27 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray28 = new java.lang.Number[][] { numberArray12, numberArray17, numberArray22, numberArray27 };
        org.jfree.data.category.CategoryDataset categoryDataset29 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray28);
        org.jfree.data.category.CategoryDataset categoryDataset30 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray28);
        org.jfree.data.category.CategoryDataset categoryDataset31 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray28);
        org.jfree.data.category.CategoryDataset categoryDataset32 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset29 and categoryDataset31", categoryDataset29.equals(categoryDataset31) ? categoryDataset29.hashCode() == categoryDataset31.hashCode() : true);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, false);
        org.jfree.data.pie.PieDataset pieDataset21 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset17, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset24 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset21, (java.lang.Comparable) 100L, (double) 1);
        org.jfree.data.pie.PieDataset pieDataset28 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset21, (java.lang.Comparable) false, (double) 100.0f, (int) (short) 100);
        org.jfree.data.pie.PieDataset pieDataset32 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset21, (java.lang.Comparable) 100.0f, (double) ' ', (int) (short) 0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset21 and pieDataset28", pieDataset21.equals(pieDataset28) ? pieDataset21.hashCode() == pieDataset28.hashCode() : true);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, false);
        org.jfree.data.pie.PieDataset pieDataset21 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset17, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset24 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset21, (java.lang.Comparable) 100L, (double) 1);
        org.jfree.data.pie.PieDataset pieDataset27 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset21, (java.lang.Comparable) (short) 1, 130.0d);
        org.jfree.data.pie.PieDataset pieDataset31 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset27, (java.lang.Comparable) 100.0f, (double) (-1), (int) ' ');
        org.jfree.data.pie.PieDataset pieDataset34 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset27, (java.lang.Comparable) 100L, (double) 10L);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset27 and pieDataset31", pieDataset27.equals(pieDataset31) ? pieDataset27.hashCode() == pieDataset31.hashCode() : true);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, false);
        org.jfree.data.pie.PieDataset pieDataset21 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset17, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset24 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset21, (java.lang.Comparable) 10L, (double) (-1L));
        boolean boolean25 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset21 and pieDataset24", pieDataset21.equals(pieDataset24) ? pieDataset21.hashCode() == pieDataset24.hashCode() : true);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        java.lang.Number[] numberArray12 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray17 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray22 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray27 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray28 = new java.lang.Number[][] { numberArray12, numberArray17, numberArray22, numberArray27 };
        org.jfree.data.category.CategoryDataset categoryDataset29 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray28);
        org.jfree.data.category.CategoryDataset categoryDataset30 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray28);
        org.jfree.data.category.CategoryDataset categoryDataset31 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray28);
        org.jfree.data.category.CategoryDataset categoryDataset32 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray28);
        org.jfree.data.Range range33 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset29 and categoryDataset32", categoryDataset29.equals(categoryDataset32) ? categoryDataset29.hashCode() == categoryDataset32.hashCode() : true);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        double[] doubleArray9 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray16 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray17 = new double[][] { doubleArray9, doubleArray16 };
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray17);
        org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset18, false);
        org.jfree.data.pie.PieDataset pieDataset22 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset18, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset25 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset22, (java.lang.Comparable) 100L, (double) 1);
        org.jfree.data.pie.PieDataset pieDataset28 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset22, (java.lang.Comparable) (short) 1, 130.0d);
        org.jfree.data.pie.PieDataset pieDataset32 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset28, (java.lang.Comparable) 100.0f, (double) (-1), (int) ' ');
        org.jfree.data.category.CategoryDataset categoryDataset33 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) '4', (org.jfree.data.KeyedValues) pieDataset28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset28 and pieDataset32", pieDataset28.equals(pieDataset32) ? pieDataset28.hashCode() == pieDataset32.hashCode() : true);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        double[] doubleArray12 = new double[] { (short) 0, (byte) 0 };
        double[][] doubleArray13 = new double[][] { doubleArray12 };
        org.jfree.data.category.CategoryDataset categoryDataset14 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray13);
        org.jfree.data.category.CategoryDataset categoryDataset15 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray13);
        org.jfree.data.category.CategoryDataset categoryDataset16 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray13);
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray13);
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset15 and categoryDataset17", categoryDataset15.equals(categoryDataset17) ? categoryDataset15.hashCode() == categoryDataset17.hashCode() : true);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
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
        boolean boolean33 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset21 and pieDataset32", pieDataset21.equals(pieDataset32) ? pieDataset21.hashCode() == pieDataset32.hashCode() : true);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        java.lang.Number[] numberArray10 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray15 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray20 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray25 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray26 = new java.lang.Number[][] { numberArray10, numberArray15, numberArray20, numberArray25 };
        org.jfree.data.category.CategoryDataset categoryDataset27 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray26);
        org.jfree.data.category.CategoryDataset categoryDataset28 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray26);
        org.jfree.data.category.CategoryDataset categoryDataset29 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray26);
        org.jfree.data.Range range30 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset27 and categoryDataset29", categoryDataset27.equals(categoryDataset29) ? categoryDataset27.hashCode() == categoryDataset29.hashCode() : true);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        double[] doubleArray9 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray16 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray17 = new double[][] { doubleArray9, doubleArray16 };
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray17);
        org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset18, false);
        org.jfree.data.pie.PieDataset pieDataset22 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset18, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset25 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset22, (java.lang.Comparable) ' ', (double) '#');
        org.jfree.data.category.CategoryDataset categoryDataset26 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) '4', (org.jfree.data.KeyedValues) pieDataset22);
        org.jfree.data.pie.PieDataset pieDataset29 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset22, (java.lang.Comparable) (short) 0, (double) (short) 0);
        boolean boolean30 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset22 and pieDataset29", pieDataset22.equals(pieDataset29) ? pieDataset22.hashCode() == pieDataset29.hashCode() : true);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        java.lang.Number[] numberArray12 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray17 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray22 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray27 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray28 = new java.lang.Number[][] { numberArray12, numberArray17, numberArray22, numberArray27 };
        org.jfree.data.category.CategoryDataset categoryDataset29 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray28);
        org.jfree.data.category.CategoryDataset categoryDataset30 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray28);
        org.jfree.data.category.CategoryDataset categoryDataset31 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray28);
        org.jfree.data.category.CategoryDataset categoryDataset32 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset29 and categoryDataset31", categoryDataset29.equals(categoryDataset31) ? categoryDataset29.hashCode() == categoryDataset31.hashCode() : true);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, false);
        org.jfree.data.pie.PieDataset pieDataset21 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset17, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset24 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset21, (java.lang.Comparable) 100L, (double) 1);
        org.jfree.data.pie.PieDataset pieDataset27 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset21, (java.lang.Comparable) (short) 1, 130.0d);
        org.jfree.data.pie.PieDataset pieDataset31 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset27, (java.lang.Comparable) 100.0f, (double) (-1), (int) ' ');
        boolean boolean32 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset27 and pieDataset31", pieDataset27.equals(pieDataset31) ? pieDataset27.hashCode() == pieDataset31.hashCode() : true);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
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
        org.jfree.data.pie.PieDataset pieDataset31 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset29, 0);
        org.jfree.data.category.CategoryDataset categoryDataset32 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 130.0d, (org.jfree.data.KeyedValues) pieDataset31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset23 and pieDataset31", pieDataset23.equals(pieDataset31) ? pieDataset23.hashCode() == pieDataset31.hashCode() : true);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
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
        boolean boolean31 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset22 and pieDataset30", pieDataset22.equals(pieDataset30) ? pieDataset22.hashCode() == pieDataset30.hashCode() : true);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
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
        boolean boolean30 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset21 and pieDataset29", pieDataset21.equals(pieDataset29) ? pieDataset21.hashCode() == pieDataset29.hashCode() : true);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        java.lang.Number[] numberArray10 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray15 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray20 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray25 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray26 = new java.lang.Number[][] { numberArray10, numberArray15, numberArray20, numberArray25 };
        org.jfree.data.category.CategoryDataset categoryDataset27 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray26);
        org.jfree.data.category.CategoryDataset categoryDataset28 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray26);
        org.jfree.data.category.CategoryDataset categoryDataset29 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray26);
        org.jfree.data.Range range31 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset29, false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset28 and categoryDataset29", categoryDataset28.equals(categoryDataset29) ? categoryDataset28.hashCode() == categoryDataset29.hashCode() : true);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        double[] doubleArray4 = new double[] { (short) 0, (byte) 0 };
        double[][] doubleArray5 = new double[][] { doubleArray4 };
        org.jfree.data.category.CategoryDataset categoryDataset6 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray5);
        org.jfree.data.pie.PieDataset pieDataset8 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset6, 0);
        org.jfree.data.pie.PieDataset pieDataset12 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset8, (java.lang.Comparable) 100.0d, (double) 'a', 1);
        boolean boolean13 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset8 and pieDataset12", pieDataset8.equals(pieDataset12) ? pieDataset8.hashCode() == pieDataset12.hashCode() : true);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, false);
        org.jfree.data.pie.PieDataset pieDataset21 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset17, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset24 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset21, (java.lang.Comparable) 100L, (double) 1);
        org.jfree.data.pie.PieDataset pieDataset27 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset21, (java.lang.Comparable) (short) 1, 130.0d);
        org.jfree.data.pie.PieDataset pieDataset31 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset27, (java.lang.Comparable) 100.0f, (double) (-1), (int) ' ');
        double double32 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset27 and pieDataset31", pieDataset27.equals(pieDataset31) ? pieDataset27.hashCode() == pieDataset31.hashCode() : true);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        double[] doubleArray9 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray16 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray17 = new double[][] { doubleArray9, doubleArray16 };
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray17);
        org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset18, false);
        org.jfree.data.pie.PieDataset pieDataset22 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset18, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset25 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset22, (java.lang.Comparable) ' ', (double) '#');
        org.jfree.data.category.CategoryDataset categoryDataset26 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) '4', (org.jfree.data.KeyedValues) pieDataset22);
        org.jfree.data.pie.PieDataset pieDataset29 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset22, (java.lang.Comparable) (short) 0, (double) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset33 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset22, (java.lang.Comparable) '#', 100.0d, (int) (byte) 100);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset22 and pieDataset29", pieDataset22.equals(pieDataset29) ? pieDataset22.hashCode() == pieDataset29.hashCode() : true);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        double[] doubleArray9 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray16 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray17 = new double[][] { doubleArray9, doubleArray16 };
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray17);
        org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset18, false);
        org.jfree.data.pie.PieDataset pieDataset22 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset18, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset25 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset22, (java.lang.Comparable) ' ', (double) '#');
        org.jfree.data.category.CategoryDataset categoryDataset26 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) '4', (org.jfree.data.KeyedValues) pieDataset22);
        org.jfree.data.pie.PieDataset pieDataset29 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset22, (java.lang.Comparable) (short) 0, (double) (short) 0);
        double double30 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset22 and pieDataset29", pieDataset22.equals(pieDataset29) ? pieDataset22.hashCode() == pieDataset29.hashCode() : true);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        double[] doubleArray9 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray16 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray17 = new double[][] { doubleArray9, doubleArray16 };
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray17);
        org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset18, false);
        org.jfree.data.pie.PieDataset pieDataset22 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset18, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset25 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset22, (java.lang.Comparable) ' ', (double) '#');
        org.jfree.data.category.CategoryDataset categoryDataset26 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) '4', (org.jfree.data.KeyedValues) pieDataset22);
        org.jfree.data.pie.PieDataset pieDataset29 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset22, (java.lang.Comparable) (short) 0, (double) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset32 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset29, (java.lang.Comparable) (-1), (double) 100);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset22 and pieDataset29", pieDataset22.equals(pieDataset29) ? pieDataset22.hashCode() == pieDataset29.hashCode() : true);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        java.lang.Number[] numberArray10 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray15 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray20 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray25 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray26 = new java.lang.Number[][] { numberArray10, numberArray15, numberArray20, numberArray25 };
        org.jfree.data.category.CategoryDataset categoryDataset27 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray26);
        org.jfree.data.category.CategoryDataset categoryDataset28 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray26);
        org.jfree.data.category.CategoryDataset categoryDataset29 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray26);
        java.lang.Class<?> wildcardClass30 = numberArray26.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset28 and categoryDataset29", categoryDataset28.equals(categoryDataset29) ? categoryDataset28.hashCode() == categoryDataset29.hashCode() : true);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        java.lang.Number[] numberArray10 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray15 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray20 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray25 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray26 = new java.lang.Number[][] { numberArray10, numberArray15, numberArray20, numberArray25 };
        org.jfree.data.category.CategoryDataset categoryDataset27 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray26);
        org.jfree.data.category.CategoryDataset categoryDataset28 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray26);
        org.jfree.data.category.CategoryDataset categoryDataset29 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray26);
        org.jfree.data.pie.PieDataset pieDataset31 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset29, 0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset27 and categoryDataset29", categoryDataset27.equals(categoryDataset29) ? categoryDataset27.hashCode() == categoryDataset29.hashCode() : true);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        double[] doubleArray14 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray21 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray22 = new double[][] { doubleArray14, doubleArray21 };
        org.jfree.data.category.CategoryDataset categoryDataset23 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray22);
        org.jfree.data.category.CategoryDataset categoryDataset24 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray22);
        org.jfree.data.category.CategoryDataset categoryDataset25 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray22);
        org.jfree.data.category.CategoryDataset categoryDataset26 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset23 and categoryDataset25", categoryDataset23.equals(categoryDataset25) ? categoryDataset23.hashCode() == categoryDataset25.hashCode() : true);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, false);
        org.jfree.data.pie.PieDataset pieDataset21 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset17, (int) (short) 0);
        java.lang.Comparable comparable22 = null;
        org.jfree.data.pie.PieDataset pieDataset25 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset21, comparable22, (double) 10L, (int) (byte) 100);
        org.jfree.data.pie.PieDataset pieDataset29 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset21, (java.lang.Comparable) (byte) 0, (double) (byte) 100, (int) (short) -1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset21 and pieDataset25", pieDataset21.equals(pieDataset25) ? pieDataset21.hashCode() == pieDataset25.hashCode() : true);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        double[] doubleArray9 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray16 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray17 = new double[][] { doubleArray9, doubleArray16 };
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray17);
        org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset18, false);
        org.jfree.data.pie.PieDataset pieDataset22 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset18, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset25 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset22, (java.lang.Comparable) 100L, (double) 1);
        org.jfree.data.category.CategoryDataset categoryDataset26 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 10.0f, (org.jfree.data.KeyedValues) pieDataset25);
        org.jfree.data.pie.PieDataset pieDataset29 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset25, (java.lang.Comparable) 100L, 400.0d);
        boolean boolean30 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset25 and pieDataset29", pieDataset25.equals(pieDataset29) ? pieDataset25.hashCode() == pieDataset29.hashCode() : true);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        java.lang.Number[] numberArray10 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray15 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray20 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray25 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray26 = new java.lang.Number[][] { numberArray10, numberArray15, numberArray20, numberArray25 };
        org.jfree.data.category.CategoryDataset categoryDataset27 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray26);
        org.jfree.data.category.CategoryDataset categoryDataset28 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray26);
        org.jfree.data.category.CategoryDataset categoryDataset29 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray26);
        org.jfree.data.Range range30 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset27 and categoryDataset29", categoryDataset27.equals(categoryDataset29) ? categoryDataset27.hashCode() == categoryDataset29.hashCode() : true);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        java.lang.Number[] numberArray10 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray15 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray20 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray25 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray26 = new java.lang.Number[][] { numberArray10, numberArray15, numberArray20, numberArray25 };
        org.jfree.data.category.CategoryDataset categoryDataset27 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray26);
        org.jfree.data.category.CategoryDataset categoryDataset28 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray26);
        org.jfree.data.category.CategoryDataset categoryDataset29 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray26);
        java.lang.Number number30 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset27 and categoryDataset29", categoryDataset27.equals(categoryDataset29) ? categoryDataset27.hashCode() == categoryDataset29.hashCode() : true);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
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
        org.jfree.data.pie.PieDataset pieDataset38 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset22, (java.lang.Comparable) 1.0f, (double) ' ');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset22 and pieDataset35", pieDataset22.equals(pieDataset35) ? pieDataset22.hashCode() == pieDataset35.hashCode() : true);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, false);
        org.jfree.data.pie.PieDataset pieDataset21 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset17, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset24 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset21, (java.lang.Comparable) ' ', (double) '#');
        org.jfree.data.pie.PieDataset pieDataset28 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset24, (java.lang.Comparable) false, (double) 10L, (int) (short) 100);
        org.jfree.data.pie.PieDataset pieDataset31 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset24, (java.lang.Comparable) (byte) 10, (double) 1L);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset24 and pieDataset28", pieDataset24.equals(pieDataset28) ? pieDataset24.hashCode() == pieDataset28.hashCode() : true);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        double[] doubleArray9 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray16 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray17 = new double[][] { doubleArray9, doubleArray16 };
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray17);
        org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset18, false);
        org.jfree.data.pie.PieDataset pieDataset22 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset18, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset25 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset22, (java.lang.Comparable) ' ', (double) '#');
        org.jfree.data.category.CategoryDataset categoryDataset26 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) '4', (org.jfree.data.KeyedValues) pieDataset22);
        org.jfree.data.pie.PieDataset pieDataset29 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset22, (java.lang.Comparable) (short) 0, (double) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset32 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset22, (java.lang.Comparable) "", (double) 10L);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset22 and pieDataset29", pieDataset22.equals(pieDataset29) ? pieDataset22.hashCode() == pieDataset29.hashCode() : true);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
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
        double double33 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset22 and pieDataset32", pieDataset22.equals(pieDataset32) ? pieDataset22.hashCode() == pieDataset32.hashCode() : true);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
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
        org.jfree.data.pie.PieDataset pieDataset32 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset21, (java.lang.Comparable) (-1), (double) 0L);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset21 and pieDataset29", pieDataset21.equals(pieDataset29) ? pieDataset21.hashCode() == pieDataset29.hashCode() : true);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        double[] doubleArray10 = new double[] { (short) 0, (byte) 0 };
        double[][] doubleArray11 = new double[][] { doubleArray10 };
        org.jfree.data.category.CategoryDataset categoryDataset12 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray11);
        org.jfree.data.category.CategoryDataset categoryDataset13 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray11);
        org.jfree.data.category.CategoryDataset categoryDataset14 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray11);
        org.jfree.data.category.CategoryDataset categoryDataset15 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset13 and categoryDataset14", categoryDataset13.equals(categoryDataset14) ? categoryDataset13.hashCode() == categoryDataset14.hashCode() : true);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        java.lang.Number[] numberArray12 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray17 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray22 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray27 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray28 = new java.lang.Number[][] { numberArray12, numberArray17, numberArray22, numberArray27 };
        org.jfree.data.category.CategoryDataset categoryDataset29 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray28);
        org.jfree.data.category.CategoryDataset categoryDataset30 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray28);
        org.jfree.data.category.CategoryDataset categoryDataset31 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray28);
        org.jfree.data.category.CategoryDataset categoryDataset32 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray28);
        boolean boolean33 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset29 and categoryDataset32", categoryDataset29.equals(categoryDataset32) ? categoryDataset29.hashCode() == categoryDataset32.hashCode() : true);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        java.lang.Number[] numberArray10 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray15 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray20 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray25 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray26 = new java.lang.Number[][] { numberArray10, numberArray15, numberArray20, numberArray25 };
        org.jfree.data.category.CategoryDataset categoryDataset27 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray26);
        org.jfree.data.category.CategoryDataset categoryDataset28 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray26);
        org.jfree.data.category.CategoryDataset categoryDataset29 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray26);
        org.jfree.data.Range range31 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset29, false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset27 and categoryDataset29", categoryDataset27.equals(categoryDataset29) ? categoryDataset27.hashCode() == categoryDataset29.hashCode() : true);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        double[] doubleArray9 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray16 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray17 = new double[][] { doubleArray9, doubleArray16 };
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray17);
        org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset18, false);
        org.jfree.data.pie.PieDataset pieDataset22 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset18, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset25 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset22, (java.lang.Comparable) ' ', (double) '#');
        org.jfree.data.category.CategoryDataset categoryDataset26 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) '4', (org.jfree.data.KeyedValues) pieDataset22);
        org.jfree.data.pie.PieDataset pieDataset29 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset22, (java.lang.Comparable) (short) 0, (double) (short) 0);
        boolean boolean30 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset22 and pieDataset29", pieDataset22.equals(pieDataset29) ? pieDataset22.hashCode() == pieDataset29.hashCode() : true);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
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
        java.lang.Class<?> wildcardClass41 = pieDataset40.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset33 and pieDataset40", pieDataset33.equals(pieDataset40) ? pieDataset33.hashCode() == pieDataset40.hashCode() : true);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        double[] doubleArray8 = new double[] { (short) 0, (byte) 0 };
        double[][] doubleArray9 = new double[][] { doubleArray8 };
        org.jfree.data.category.CategoryDataset categoryDataset10 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray9);
        org.jfree.data.category.CategoryDataset categoryDataset11 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray9);
        org.jfree.data.category.CategoryDataset categoryDataset12 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray9);
        org.jfree.data.Range range13 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset11 and categoryDataset12", categoryDataset11.equals(categoryDataset12) ? categoryDataset11.hashCode() == categoryDataset12.hashCode() : true);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        double[] doubleArray5 = new double[] { (short) 0, (byte) 0 };
        double[][] doubleArray6 = new double[][] { doubleArray5 };
        org.jfree.data.category.CategoryDataset categoryDataset7 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray6);
        org.jfree.data.pie.PieDataset pieDataset9 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset7, 0);
        org.jfree.data.pie.PieDataset pieDataset13 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset9, (java.lang.Comparable) 100.0d, (double) 'a', 1);
        org.jfree.data.category.CategoryDataset categoryDataset14 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) (-1L), (org.jfree.data.KeyedValues) pieDataset13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset9 and pieDataset13", pieDataset9.equals(pieDataset13) ? pieDataset9.hashCode() == pieDataset13.hashCode() : true);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        java.lang.Number[] numberArray14 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray24 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray29 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray30 = new java.lang.Number[][] { numberArray14, numberArray19, numberArray24, numberArray29 };
        org.jfree.data.category.CategoryDataset categoryDataset31 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray30);
        org.jfree.data.category.CategoryDataset categoryDataset32 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray30);
        org.jfree.data.category.CategoryDataset categoryDataset33 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray30);
        org.jfree.data.category.CategoryDataset categoryDataset34 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray30);
        org.jfree.data.category.CategoryDataset categoryDataset35 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset31 and categoryDataset34", categoryDataset31.equals(categoryDataset34) ? categoryDataset31.hashCode() == categoryDataset34.hashCode() : true);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        double[] doubleArray10 = new double[] { (short) 0, (byte) 0 };
        double[][] doubleArray11 = new double[][] { doubleArray10 };
        org.jfree.data.category.CategoryDataset categoryDataset12 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray11);
        org.jfree.data.category.CategoryDataset categoryDataset13 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray11);
        org.jfree.data.category.CategoryDataset categoryDataset14 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray11);
        org.jfree.data.category.CategoryDataset categoryDataset15 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray11);
        java.lang.Class<?> wildcardClass16 = categoryDataset15.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset13 and categoryDataset15", categoryDataset13.equals(categoryDataset15) ? categoryDataset13.hashCode() == categoryDataset15.hashCode() : true);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        java.lang.Number[] numberArray10 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray15 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray20 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray25 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray26 = new java.lang.Number[][] { numberArray10, numberArray15, numberArray20, numberArray25 };
        org.jfree.data.category.CategoryDataset categoryDataset27 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray26);
        org.jfree.data.category.CategoryDataset categoryDataset28 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray26);
        org.jfree.data.category.CategoryDataset categoryDataset29 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray26);
        org.jfree.data.Range range31 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset29, true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset28 and categoryDataset29", categoryDataset28.equals(categoryDataset29) ? categoryDataset28.hashCode() == categoryDataset29.hashCode() : true);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
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
        boolean boolean33 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset22 and pieDataset32", pieDataset22.equals(pieDataset32) ? pieDataset22.hashCode() == pieDataset32.hashCode() : true);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
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
        double double33 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset22 and pieDataset32", pieDataset22.equals(pieDataset32) ? pieDataset22.hashCode() == pieDataset32.hashCode() : true);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        double[] doubleArray10 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray17 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray18 = new double[][] { doubleArray10, doubleArray17 };
        org.jfree.data.category.CategoryDataset categoryDataset19 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray18);
        org.jfree.data.Range range21 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset19, false);
        org.jfree.data.pie.PieDataset pieDataset23 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset19, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset26 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset23, (java.lang.Comparable) 100L, (double) 1);
        org.jfree.data.category.CategoryDataset categoryDataset27 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 10.0f, (org.jfree.data.KeyedValues) pieDataset26);
        org.jfree.data.pie.PieDataset pieDataset30 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset26, (java.lang.Comparable) 100L, 400.0d);
        org.jfree.data.category.CategoryDataset categoryDataset31 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) (short) 10, (org.jfree.data.KeyedValues) pieDataset30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset26 and pieDataset30", pieDataset26.equals(pieDataset30) ? pieDataset26.hashCode() == pieDataset30.hashCode() : true);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        java.lang.Number[] numberArray12 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray17 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray22 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray27 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray28 = new java.lang.Number[][] { numberArray12, numberArray17, numberArray22, numberArray27 };
        org.jfree.data.category.CategoryDataset categoryDataset29 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray28);
        org.jfree.data.category.CategoryDataset categoryDataset30 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray28);
        org.jfree.data.category.CategoryDataset categoryDataset31 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray28);
        org.jfree.data.category.CategoryDataset categoryDataset32 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset30 and categoryDataset31", categoryDataset30.equals(categoryDataset31) ? categoryDataset30.hashCode() == categoryDataset31.hashCode() : true);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        java.lang.Number[] numberArray12 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray17 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray22 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray27 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray28 = new java.lang.Number[][] { numberArray12, numberArray17, numberArray22, numberArray27 };
        org.jfree.data.category.CategoryDataset categoryDataset29 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray28);
        org.jfree.data.category.CategoryDataset categoryDataset30 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray28);
        org.jfree.data.category.CategoryDataset categoryDataset31 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray28);
        org.jfree.data.category.CategoryDataset categoryDataset32 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray28);
        java.lang.Number number33 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset29 and categoryDataset32", categoryDataset29.equals(categoryDataset32) ? categoryDataset29.hashCode() == categoryDataset32.hashCode() : true);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
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
        org.jfree.data.pie.PieDataset pieDataset36 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset23, (java.lang.Comparable) (-1L), (double) 1.0f, (int) (short) 100);
        org.jfree.data.category.CategoryDataset categoryDataset37 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) false, (org.jfree.data.KeyedValues) pieDataset23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset23 and pieDataset36", pieDataset23.equals(pieDataset36) ? pieDataset23.hashCode() == pieDataset36.hashCode() : true);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        double[] doubleArray14 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray21 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray22 = new double[][] { doubleArray14, doubleArray21 };
        org.jfree.data.category.CategoryDataset categoryDataset23 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray22);
        org.jfree.data.category.CategoryDataset categoryDataset24 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray22);
        org.jfree.data.category.CategoryDataset categoryDataset25 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray22);
        org.jfree.data.category.CategoryDataset categoryDataset26 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset23 and categoryDataset25", categoryDataset23.equals(categoryDataset25) ? categoryDataset23.hashCode() == categoryDataset25.hashCode() : true);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        double[] doubleArray8 = new double[] { (short) 0, (byte) 0 };
        double[][] doubleArray9 = new double[][] { doubleArray8 };
        org.jfree.data.category.CategoryDataset categoryDataset10 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray9);
        org.jfree.data.category.CategoryDataset categoryDataset11 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray9);
        org.jfree.data.category.CategoryDataset categoryDataset12 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray9);
        org.jfree.data.Range range13 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset11 and categoryDataset12", categoryDataset11.equals(categoryDataset12) ? categoryDataset11.hashCode() == categoryDataset12.hashCode() : true);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
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
        boolean boolean30 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset21 and pieDataset29", pieDataset21.equals(pieDataset29) ? pieDataset21.hashCode() == pieDataset29.hashCode() : true);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        java.lang.Number[] numberArray12 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray17 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray22 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray27 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray28 = new java.lang.Number[][] { numberArray12, numberArray17, numberArray22, numberArray27 };
        org.jfree.data.category.CategoryDataset categoryDataset29 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray28);
        org.jfree.data.category.CategoryDataset categoryDataset30 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray28);
        org.jfree.data.category.CategoryDataset categoryDataset31 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray28);
        org.jfree.data.category.CategoryDataset categoryDataset32 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset29 and categoryDataset31", categoryDataset29.equals(categoryDataset31) ? categoryDataset29.hashCode() == categoryDataset31.hashCode() : true);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, false);
        org.jfree.data.pie.PieDataset pieDataset21 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset17, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset24 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset21, (java.lang.Comparable) ' ', (double) '#');
        org.jfree.data.pie.PieDataset pieDataset27 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset24, (java.lang.Comparable) (byte) 1, (double) 10);
        double double28 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset24 and pieDataset27", pieDataset24.equals(pieDataset27) ? pieDataset24.hashCode() == pieDataset27.hashCode() : true);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
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
        double double32 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset22 and pieDataset31", pieDataset22.equals(pieDataset31) ? pieDataset22.hashCode() == pieDataset31.hashCode() : true);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
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
        org.jfree.data.pie.PieDataset pieDataset35 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset32, (java.lang.Comparable) false, 130.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset21 and pieDataset32", pieDataset21.equals(pieDataset32) ? pieDataset21.hashCode() == pieDataset32.hashCode() : true);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        java.lang.Number[] numberArray14 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray24 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray29 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray30 = new java.lang.Number[][] { numberArray14, numberArray19, numberArray24, numberArray29 };
        org.jfree.data.category.CategoryDataset categoryDataset31 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray30);
        org.jfree.data.category.CategoryDataset categoryDataset32 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray30);
        org.jfree.data.category.CategoryDataset categoryDataset33 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray30);
        org.jfree.data.category.CategoryDataset categoryDataset34 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray30);
        org.jfree.data.category.CategoryDataset categoryDataset35 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset31 and categoryDataset34", categoryDataset31.equals(categoryDataset34) ? categoryDataset31.hashCode() == categoryDataset34.hashCode() : true);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        double[] doubleArray10 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray17 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray18 = new double[][] { doubleArray10, doubleArray17 };
        org.jfree.data.category.CategoryDataset categoryDataset19 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray18);
        org.jfree.data.category.CategoryDataset categoryDataset20 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray18);
        org.jfree.data.Range range22 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset20, false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset19 and categoryDataset20", categoryDataset19.equals(categoryDataset20) ? categoryDataset19.hashCode() == categoryDataset20.hashCode() : true);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        double[] doubleArray14 = new double[] { (short) 0, (byte) 0 };
        double[][] doubleArray15 = new double[][] { doubleArray14 };
        org.jfree.data.category.CategoryDataset categoryDataset16 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray15);
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray15);
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray15);
        org.jfree.data.category.CategoryDataset categoryDataset19 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray15);
        org.jfree.data.category.CategoryDataset categoryDataset20 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray15);
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset18 and categoryDataset20", categoryDataset18.equals(categoryDataset20) ? categoryDataset18.hashCode() == categoryDataset20.hashCode() : true);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, false);
        org.jfree.data.pie.PieDataset pieDataset21 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset17, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset24 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset21, (java.lang.Comparable) ' ', (double) '#');
        org.jfree.data.pie.PieDataset pieDataset27 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset24, (java.lang.Comparable) (byte) 1, (double) 10);
        boolean boolean28 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset24 and pieDataset27", pieDataset24.equals(pieDataset27) ? pieDataset24.hashCode() == pieDataset27.hashCode() : true);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        java.lang.Number[] numberArray16 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray21 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray26 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray31 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray32 = new java.lang.Number[][] { numberArray16, numberArray21, numberArray26, numberArray31 };
        org.jfree.data.category.CategoryDataset categoryDataset33 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray32);
        org.jfree.data.category.CategoryDataset categoryDataset34 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray32);
        org.jfree.data.category.CategoryDataset categoryDataset35 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray32);
        org.jfree.data.category.CategoryDataset categoryDataset36 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray32);
        org.jfree.data.category.CategoryDataset categoryDataset37 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray32);
        org.jfree.data.category.CategoryDataset categoryDataset38 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset33 and categoryDataset37", categoryDataset33.equals(categoryDataset37) ? categoryDataset33.hashCode() == categoryDataset37.hashCode() : true);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
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
        java.lang.Number number31 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset22 and pieDataset30", pieDataset22.equals(pieDataset30) ? pieDataset22.hashCode() == pieDataset30.hashCode() : true);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
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
        double double32 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset22 and pieDataset31", pieDataset22.equals(pieDataset31) ? pieDataset22.hashCode() == pieDataset31.hashCode() : true);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
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
        org.jfree.data.pie.PieDataset pieDataset36 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset32, (java.lang.Comparable) (short) 1, (double) 10.0f, 100);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset22 and pieDataset32", pieDataset22.equals(pieDataset32) ? pieDataset22.hashCode() == pieDataset32.hashCode() : true);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        java.lang.Number[] numberArray10 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray15 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray20 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray25 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray26 = new java.lang.Number[][] { numberArray10, numberArray15, numberArray20, numberArray25 };
        org.jfree.data.category.CategoryDataset categoryDataset27 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray26);
        org.jfree.data.category.CategoryDataset categoryDataset28 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray26);
        org.jfree.data.category.CategoryDataset categoryDataset29 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray26);
        java.lang.Number number30 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(categoryDataset29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset27 and categoryDataset29", categoryDataset27.equals(categoryDataset29) ? categoryDataset27.hashCode() == categoryDataset29.hashCode() : true);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        java.lang.Number[] numberArray7 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray12 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray17 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray22 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray23 = new java.lang.Number[][] { numberArray7, numberArray12, numberArray17, numberArray22 };
        org.jfree.data.category.CategoryDataset categoryDataset24 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray23);
        org.jfree.data.Range range25 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset24);
        org.jfree.data.Range range27 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset24, true);
        java.lang.Number number28 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset24);
        org.jfree.data.Range range30 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset24, true);
        org.jfree.data.Range range32 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset24, true);
        org.jfree.data.Range range33 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset24);
        org.jfree.data.Range range35 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset24, false);
        org.jfree.data.Range range36 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset24);
        org.jfree.data.pie.PieDataset pieDataset38 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset24, (int) (byte) 1);
        org.jfree.data.pie.PieDataset pieDataset41 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset38, (java.lang.Comparable) 10L, 0.0d);
        org.jfree.data.category.CategoryDataset categoryDataset42 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 100.0d, (org.jfree.data.KeyedValues) pieDataset38);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset38 and pieDataset41", pieDataset38.equals(pieDataset41) ? pieDataset38.hashCode() == pieDataset41.hashCode() : true);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
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
        org.jfree.data.pie.PieDataset pieDataset36 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset21, (java.lang.Comparable) 400.0d, (double) (byte) 10, (int) (byte) 0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset21 and pieDataset32", pieDataset21.equals(pieDataset32) ? pieDataset21.hashCode() == pieDataset32.hashCode() : true);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        java.lang.Number[] numberArray10 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray15 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray20 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray25 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray26 = new java.lang.Number[][] { numberArray10, numberArray15, numberArray20, numberArray25 };
        org.jfree.data.category.CategoryDataset categoryDataset27 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray26);
        org.jfree.data.category.CategoryDataset categoryDataset28 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray26);
        org.jfree.data.category.CategoryDataset categoryDataset29 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray26);
        org.jfree.data.Range range31 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset29, true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset27 and categoryDataset29", categoryDataset27.equals(categoryDataset29) ? categoryDataset27.hashCode() == categoryDataset29.hashCode() : true);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        java.lang.Comparable[] comparableArray1 = new java.lang.Comparable[] { true };
        java.lang.Comparable[] comparableArray4 = new java.lang.Comparable[] { (byte) -1, 0.0f };
        double[] doubleArray17 = new double[] { (short) 0, (byte) 0 };
        double[][] doubleArray18 = new double[][] { doubleArray17 };
        org.jfree.data.category.CategoryDataset categoryDataset19 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray18);
        org.jfree.data.category.CategoryDataset categoryDataset20 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray18);
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray18);
        org.jfree.data.category.CategoryDataset categoryDataset22 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray18);
        org.jfree.data.category.CategoryDataset categoryDataset23 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray18);
        org.jfree.data.category.CategoryDataset categoryDataset24 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray1, comparableArray4, doubleArray18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset19 and categoryDataset23", categoryDataset19.equals(categoryDataset23) ? categoryDataset19.hashCode() == categoryDataset23.hashCode() : true);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        double[] doubleArray12 = new double[] { (short) 0, (byte) 0 };
        double[][] doubleArray13 = new double[][] { doubleArray12 };
        org.jfree.data.category.CategoryDataset categoryDataset14 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray13);
        org.jfree.data.category.CategoryDataset categoryDataset15 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray13);
        org.jfree.data.category.CategoryDataset categoryDataset16 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray13);
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray13);
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset14 and categoryDataset17", categoryDataset14.equals(categoryDataset17) ? categoryDataset14.hashCode() == categoryDataset17.hashCode() : true);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, false);
        org.jfree.data.pie.PieDataset pieDataset21 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset17, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset24 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset21, (java.lang.Comparable) 10L, (double) (-1L));
        org.jfree.data.pie.PieDataset pieDataset28 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset21, (java.lang.Comparable) 1.0f, (double) (-1), (int) (short) 100);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset21 and pieDataset24", pieDataset21.equals(pieDataset24) ? pieDataset21.hashCode() == pieDataset24.hashCode() : true);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        java.lang.Number[] numberArray12 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray17 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray22 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray27 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray28 = new java.lang.Number[][] { numberArray12, numberArray17, numberArray22, numberArray27 };
        org.jfree.data.category.CategoryDataset categoryDataset29 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray28);
        org.jfree.data.category.CategoryDataset categoryDataset30 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray28);
        org.jfree.data.category.CategoryDataset categoryDataset31 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray28);
        org.jfree.data.category.CategoryDataset categoryDataset32 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset29 and categoryDataset31", categoryDataset29.equals(categoryDataset31) ? categoryDataset29.hashCode() == categoryDataset31.hashCode() : true);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
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
        double double30 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset23);
        boolean boolean31 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset23);
        org.jfree.data.pie.PieDataset pieDataset34 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset23, (java.lang.Comparable) (byte) 100, (-1.0d));
        org.jfree.data.category.CategoryDataset categoryDataset35 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) (byte) 100, (org.jfree.data.KeyedValues) pieDataset23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset23 and pieDataset34", pieDataset23.equals(pieDataset34) ? pieDataset23.hashCode() == pieDataset34.hashCode() : true);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, false);
        org.jfree.data.pie.PieDataset pieDataset21 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset17, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset24 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset21, (java.lang.Comparable) 100L, (double) 1);
        org.jfree.data.pie.PieDataset pieDataset28 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset21, (java.lang.Comparable) false, (double) 100.0f, (int) (short) 100);
        boolean boolean29 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset21 and pieDataset28", pieDataset21.equals(pieDataset28) ? pieDataset21.hashCode() == pieDataset28.hashCode() : true);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
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
        boolean boolean33 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset21 and pieDataset32", pieDataset21.equals(pieDataset32) ? pieDataset21.hashCode() == pieDataset32.hashCode() : true);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        java.lang.Number[] numberArray16 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray21 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray26 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray31 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray32 = new java.lang.Number[][] { numberArray16, numberArray21, numberArray26, numberArray31 };
        org.jfree.data.category.CategoryDataset categoryDataset33 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray32);
        org.jfree.data.category.CategoryDataset categoryDataset34 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray32);
        org.jfree.data.category.CategoryDataset categoryDataset35 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray32);
        org.jfree.data.category.CategoryDataset categoryDataset36 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray32);
        org.jfree.data.category.CategoryDataset categoryDataset37 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray32);
        org.jfree.data.category.CategoryDataset categoryDataset38 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset36 and categoryDataset37", categoryDataset36.equals(categoryDataset37) ? categoryDataset36.hashCode() == categoryDataset37.hashCode() : true);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
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
        org.jfree.data.pie.PieDataset pieDataset36 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset33, (java.lang.Comparable) (-1), 1.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset22 and pieDataset33", pieDataset22.equals(pieDataset33) ? pieDataset22.hashCode() == pieDataset33.hashCode() : true);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
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
        org.jfree.data.category.CategoryDataset categoryDataset35 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) (-1L), (org.jfree.data.KeyedValues) pieDataset24);
        boolean boolean36 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset31 and categoryDataset35", categoryDataset31.equals(categoryDataset35) ? categoryDataset31.hashCode() == categoryDataset35.hashCode() : true);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, false);
        org.jfree.data.pie.PieDataset pieDataset21 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset17, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset24 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset21, (java.lang.Comparable) 100L, (double) 1);
        org.jfree.data.pie.PieDataset pieDataset27 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset21, (java.lang.Comparable) (short) 1, 130.0d);
        org.jfree.data.pie.PieDataset pieDataset31 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset27, (java.lang.Comparable) 100.0f, (double) (-1), (int) ' ');
        org.jfree.data.pie.PieDataset pieDataset34 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset31, (java.lang.Comparable) (short) 10, (double) (byte) 100);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset27 and pieDataset31", pieDataset27.equals(pieDataset31) ? pieDataset27.hashCode() == pieDataset31.hashCode() : true);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        java.lang.Number[] numberArray12 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray17 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray22 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray27 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray28 = new java.lang.Number[][] { numberArray12, numberArray17, numberArray22, numberArray27 };
        org.jfree.data.category.CategoryDataset categoryDataset29 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray28);
        org.jfree.data.category.CategoryDataset categoryDataset30 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray28);
        org.jfree.data.category.CategoryDataset categoryDataset31 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray28);
        org.jfree.data.category.CategoryDataset categoryDataset32 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray28);
        org.jfree.data.Range range34 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset32, (double) (byte) 0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset29 and categoryDataset32", categoryDataset29.equals(categoryDataset32) ? categoryDataset29.hashCode() == categoryDataset32.hashCode() : true);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        double[] doubleArray11 = new double[] { 130.0d, (-1.0f), 1L, 100.0f, 1L };
        double[] doubleArray17 = new double[] { 130.0d, (-1.0f), 1L, 100.0f, 1L };
        double[] doubleArray23 = new double[] { 130.0d, (-1.0f), 1L, 100.0f, 1L };
        double[] doubleArray29 = new double[] { 130.0d, (-1.0f), 1L, 100.0f, 1L };
        double[] doubleArray35 = new double[] { 130.0d, (-1.0f), 1L, 100.0f, 1L };
        double[] doubleArray41 = new double[] { 130.0d, (-1.0f), 1L, 100.0f, 1L };
        double[][] doubleArray42 = new double[][] { doubleArray11, doubleArray17, doubleArray23, doubleArray29, doubleArray35, doubleArray41 };
        org.jfree.data.category.CategoryDataset categoryDataset43 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray42);
        org.jfree.data.category.CategoryDataset categoryDataset44 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray42);
        org.jfree.data.category.CategoryDataset categoryDataset45 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray42);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset43 and categoryDataset44", categoryDataset43.equals(categoryDataset44) ? categoryDataset43.hashCode() == categoryDataset44.hashCode() : true);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        java.lang.Number[] numberArray10 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray15 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray20 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray25 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray26 = new java.lang.Number[][] { numberArray10, numberArray15, numberArray20, numberArray25 };
        org.jfree.data.category.CategoryDataset categoryDataset27 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray26);
        org.jfree.data.category.CategoryDataset categoryDataset28 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray26);
        org.jfree.data.category.CategoryDataset categoryDataset29 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray26);
        java.lang.Number number30 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset27 and categoryDataset29", categoryDataset27.equals(categoryDataset29) ? categoryDataset27.hashCode() == categoryDataset29.hashCode() : true);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
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
        org.jfree.data.pie.PieDataset pieDataset43 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset40, (java.lang.Comparable) 0L, (double) 0.0f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset33 and pieDataset40", pieDataset33.equals(pieDataset40) ? pieDataset33.hashCode() == pieDataset40.hashCode() : true);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, false);
        org.jfree.data.pie.PieDataset pieDataset21 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset17, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset25 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset21, (java.lang.Comparable) (byte) 100, (double) 0.0f, (int) '4');
        org.jfree.data.pie.PieDataset pieDataset28 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset25, (java.lang.Comparable) 130.0d, (double) 1L);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset21 and pieDataset25", pieDataset21.equals(pieDataset25) ? pieDataset21.hashCode() == pieDataset25.hashCode() : true);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        java.lang.Number[] numberArray10 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray15 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray20 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray25 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray26 = new java.lang.Number[][] { numberArray10, numberArray15, numberArray20, numberArray25 };
        org.jfree.data.category.CategoryDataset categoryDataset27 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray26);
        org.jfree.data.category.CategoryDataset categoryDataset28 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray26);
        org.jfree.data.category.CategoryDataset categoryDataset29 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray26);
        org.jfree.data.Range range31 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset29, 400.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset27 and categoryDataset29", categoryDataset27.equals(categoryDataset29) ? categoryDataset27.hashCode() == categoryDataset29.hashCode() : true);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        double[] doubleArray9 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray16 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray17 = new double[][] { doubleArray9, doubleArray16 };
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray17);
        org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset18, false);
        org.jfree.data.pie.PieDataset pieDataset22 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset18, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset25 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset22, (java.lang.Comparable) 100L, (double) 1);
        org.jfree.data.pie.PieDataset pieDataset28 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset22, (java.lang.Comparable) (short) 1, 130.0d);
        org.jfree.data.pie.PieDataset pieDataset32 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset28, (java.lang.Comparable) 100.0f, (double) (-1), (int) ' ');
        org.jfree.data.category.CategoryDataset categoryDataset33 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 100, (org.jfree.data.KeyedValues) pieDataset32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset28 and pieDataset32", pieDataset28.equals(pieDataset32) ? pieDataset28.hashCode() == pieDataset32.hashCode() : true);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        double[] doubleArray11 = new double[] { 130.0d, (-1.0f), 1L, 100.0f, 1L };
        double[] doubleArray17 = new double[] { 130.0d, (-1.0f), 1L, 100.0f, 1L };
        double[] doubleArray23 = new double[] { 130.0d, (-1.0f), 1L, 100.0f, 1L };
        double[] doubleArray29 = new double[] { 130.0d, (-1.0f), 1L, 100.0f, 1L };
        double[] doubleArray35 = new double[] { 130.0d, (-1.0f), 1L, 100.0f, 1L };
        double[] doubleArray41 = new double[] { 130.0d, (-1.0f), 1L, 100.0f, 1L };
        double[][] doubleArray42 = new double[][] { doubleArray11, doubleArray17, doubleArray23, doubleArray29, doubleArray35, doubleArray41 };
        org.jfree.data.category.CategoryDataset categoryDataset43 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray42);
        org.jfree.data.category.CategoryDataset categoryDataset44 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray42);
        org.jfree.data.category.CategoryDataset categoryDataset45 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray42);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset43 and categoryDataset44", categoryDataset43.equals(categoryDataset44) ? categoryDataset43.hashCode() == categoryDataset44.hashCode() : true);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
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
        org.jfree.data.pie.PieDataset pieDataset40 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset37, (java.lang.Comparable) 10L, 0.0d);
        org.jfree.data.pie.PieDataset pieDataset43 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset40, (java.lang.Comparable) true, (double) (-1));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset37 and pieDataset40", pieDataset37.equals(pieDataset40) ? pieDataset37.hashCode() == pieDataset40.hashCode() : true);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        double[] doubleArray9 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray16 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray17 = new double[][] { doubleArray9, doubleArray16 };
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray17);
        org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset18, false);
        org.jfree.data.pie.PieDataset pieDataset22 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset18, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset25 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset22, (java.lang.Comparable) 100L, (double) 1);
        org.jfree.data.pie.PieDataset pieDataset28 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset22, (java.lang.Comparable) (short) 1, 130.0d);
        boolean boolean29 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset22);
        org.jfree.data.pie.PieDataset pieDataset33 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset22, (java.lang.Comparable) 0.0f, (double) (byte) 1, (int) (short) 10);
        org.jfree.data.category.CategoryDataset categoryDataset34 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 10.0d, (org.jfree.data.KeyedValues) pieDataset22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset22 and pieDataset33", pieDataset22.equals(pieDataset33) ? pieDataset22.hashCode() == pieDataset33.hashCode() : true);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        double[] doubleArray10 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray17 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray18 = new double[][] { doubleArray10, doubleArray17 };
        org.jfree.data.category.CategoryDataset categoryDataset19 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray18);
        org.jfree.data.Range range21 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset19, false);
        org.jfree.data.pie.PieDataset pieDataset23 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset19, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset26 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset23, (java.lang.Comparable) 100L, (double) 1);
        org.jfree.data.pie.PieDataset pieDataset29 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset23, (java.lang.Comparable) (short) 1, 130.0d);
        org.jfree.data.category.CategoryDataset categoryDataset30 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) (-1L), (org.jfree.data.KeyedValues) pieDataset23);
        org.jfree.data.pie.PieDataset pieDataset34 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset23, (java.lang.Comparable) (short) -1, 130.0d, (int) (short) 100);
        org.jfree.data.category.CategoryDataset categoryDataset35 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) (-1L), (org.jfree.data.KeyedValues) pieDataset23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset23 and pieDataset34", pieDataset23.equals(pieDataset34) ? pieDataset23.hashCode() == pieDataset34.hashCode() : true);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        double[] doubleArray10 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray17 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray18 = new double[][] { doubleArray10, doubleArray17 };
        org.jfree.data.category.CategoryDataset categoryDataset19 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray18);
        org.jfree.data.Range range21 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset19, false);
        org.jfree.data.pie.PieDataset pieDataset23 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset19, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset26 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset23, (java.lang.Comparable) 100L, (double) 1);
        org.jfree.data.category.CategoryDataset categoryDataset27 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 10.0f, (org.jfree.data.KeyedValues) pieDataset26);
        org.jfree.data.pie.PieDataset pieDataset30 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset26, (java.lang.Comparable) 100L, 400.0d);
        org.jfree.data.category.CategoryDataset categoryDataset31 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) ' ', (org.jfree.data.KeyedValues) pieDataset26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset26 and pieDataset30", pieDataset26.equals(pieDataset30) ? pieDataset26.hashCode() == pieDataset30.hashCode() : true);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        java.lang.Number[] numberArray14 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray24 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray29 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray30 = new java.lang.Number[][] { numberArray14, numberArray19, numberArray24, numberArray29 };
        org.jfree.data.category.CategoryDataset categoryDataset31 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray30);
        org.jfree.data.category.CategoryDataset categoryDataset32 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray30);
        org.jfree.data.category.CategoryDataset categoryDataset33 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray30);
        org.jfree.data.category.CategoryDataset categoryDataset34 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray30);
        org.jfree.data.category.CategoryDataset categoryDataset35 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray30);
        org.jfree.data.Range range36 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset32 and categoryDataset35", categoryDataset32.equals(categoryDataset35) ? categoryDataset32.hashCode() == categoryDataset35.hashCode() : true);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        java.lang.Number[] numberArray16 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray21 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray26 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray31 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray32 = new java.lang.Number[][] { numberArray16, numberArray21, numberArray26, numberArray31 };
        org.jfree.data.category.CategoryDataset categoryDataset33 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray32);
        org.jfree.data.category.CategoryDataset categoryDataset34 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray32);
        org.jfree.data.category.CategoryDataset categoryDataset35 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray32);
        org.jfree.data.category.CategoryDataset categoryDataset36 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray32);
        org.jfree.data.category.CategoryDataset categoryDataset37 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray32);
        org.jfree.data.category.CategoryDataset categoryDataset38 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset35 and categoryDataset37", categoryDataset35.equals(categoryDataset37) ? categoryDataset35.hashCode() == categoryDataset37.hashCode() : true);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        double[] doubleArray14 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray21 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray22 = new double[][] { doubleArray14, doubleArray21 };
        org.jfree.data.category.CategoryDataset categoryDataset23 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray22);
        org.jfree.data.category.CategoryDataset categoryDataset24 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray22);
        org.jfree.data.category.CategoryDataset categoryDataset25 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray22);
        org.jfree.data.category.CategoryDataset categoryDataset26 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray22);
        org.jfree.data.Range range27 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset23 and categoryDataset26", categoryDataset23.equals(categoryDataset26) ? categoryDataset23.hashCode() == categoryDataset26.hashCode() : true);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
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
        org.jfree.data.pie.PieDataset pieDataset36 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset33, (java.lang.Comparable) "hi!", (double) 10.0f);
        double double37 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset36);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset33 and pieDataset36", pieDataset33.equals(pieDataset36) ? pieDataset33.hashCode() == pieDataset36.hashCode() : true);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        java.lang.Number[] numberArray16 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray21 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray26 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray31 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray32 = new java.lang.Number[][] { numberArray16, numberArray21, numberArray26, numberArray31 };
        org.jfree.data.category.CategoryDataset categoryDataset33 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray32);
        org.jfree.data.category.CategoryDataset categoryDataset34 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray32);
        org.jfree.data.category.CategoryDataset categoryDataset35 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray32);
        org.jfree.data.category.CategoryDataset categoryDataset36 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray32);
        org.jfree.data.category.CategoryDataset categoryDataset37 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray32);
        org.jfree.data.category.CategoryDataset categoryDataset38 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset36 and categoryDataset37", categoryDataset36.equals(categoryDataset37) ? categoryDataset36.hashCode() == categoryDataset37.hashCode() : true);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, false);
        org.jfree.data.pie.PieDataset pieDataset21 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset17, (int) (short) 0);
        double double22 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset21);
        boolean boolean23 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset21);
        org.jfree.data.pie.PieDataset pieDataset27 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset21, (java.lang.Comparable) 10.0f, (double) (short) 10, (int) (short) 1);
        org.jfree.data.pie.PieDataset pieDataset31 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset27, (java.lang.Comparable) 100L, (double) 100.0f, (int) (short) 100);
        boolean boolean32 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset27 and pieDataset31", pieDataset27.equals(pieDataset31) ? pieDataset27.hashCode() == pieDataset31.hashCode() : true);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        double[] doubleArray9 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray16 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray17 = new double[][] { doubleArray9, doubleArray16 };
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray17);
        org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset18, false);
        org.jfree.data.pie.PieDataset pieDataset22 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset18, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset25 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset22, (java.lang.Comparable) 100L, (double) 1);
        org.jfree.data.pie.PieDataset pieDataset28 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset22, (java.lang.Comparable) (short) 1, 130.0d);
        boolean boolean29 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset22);
        java.lang.Comparable comparable30 = null;
        org.jfree.data.pie.PieDataset pieDataset33 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset22, comparable30, (double) 10.0f, (int) (short) 100);
        org.jfree.data.category.CategoryDataset categoryDataset34 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 1, (org.jfree.data.KeyedValues) pieDataset33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset22 and pieDataset33", pieDataset22.equals(pieDataset33) ? pieDataset22.hashCode() == pieDataset33.hashCode() : true);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, false);
        org.jfree.data.pie.PieDataset pieDataset21 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset17, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset24 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset21, (java.lang.Comparable) ' ', (double) '#');
        boolean boolean25 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset24);
        org.jfree.data.pie.PieDataset pieDataset28 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset24, (java.lang.Comparable) (short) 0, (double) (short) 100);
        org.jfree.data.pie.PieDataset pieDataset32 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset24, (java.lang.Comparable) 100.0f, (double) 100L, 0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset24 and pieDataset28", pieDataset24.equals(pieDataset28) ? pieDataset24.hashCode() == pieDataset28.hashCode() : true);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        double[] doubleArray10 = new double[] { (short) 0, (byte) 0 };
        double[][] doubleArray11 = new double[][] { doubleArray10 };
        org.jfree.data.category.CategoryDataset categoryDataset12 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray11);
        org.jfree.data.category.CategoryDataset categoryDataset13 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray11);
        org.jfree.data.category.CategoryDataset categoryDataset14 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray11);
        org.jfree.data.category.CategoryDataset categoryDataset15 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray11);
        org.jfree.data.Range range16 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset13 and categoryDataset15", categoryDataset13.equals(categoryDataset15) ? categoryDataset13.hashCode() == categoryDataset15.hashCode() : true);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
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
        org.jfree.data.pie.PieDataset pieDataset37 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset34, (java.lang.Comparable) 100, 0.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset24 and pieDataset34", pieDataset24.equals(pieDataset34) ? pieDataset24.hashCode() == pieDataset34.hashCode() : true);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        java.lang.Number[] numberArray12 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray17 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray22 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray27 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray28 = new java.lang.Number[][] { numberArray12, numberArray17, numberArray22, numberArray27 };
        org.jfree.data.category.CategoryDataset categoryDataset29 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray28);
        org.jfree.data.category.CategoryDataset categoryDataset30 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray28);
        org.jfree.data.category.CategoryDataset categoryDataset31 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray28);
        org.jfree.data.category.CategoryDataset categoryDataset32 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset29 and categoryDataset31", categoryDataset29.equals(categoryDataset31) ? categoryDataset29.hashCode() == categoryDataset31.hashCode() : true);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, false);
        org.jfree.data.pie.PieDataset pieDataset21 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset17, (int) (short) 0);
        org.jfree.data.Range range23 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset17, false);
        org.jfree.data.pie.PieDataset pieDataset25 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset17, 0);
        org.jfree.data.pie.PieDataset pieDataset29 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset25, (java.lang.Comparable) (byte) -1, 10.0d, 10);
        boolean boolean30 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset25 and pieDataset29", pieDataset25.equals(pieDataset29) ? pieDataset25.hashCode() == pieDataset29.hashCode() : true);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        double[] doubleArray12 = new double[] { (short) 0, (byte) 0 };
        double[][] doubleArray13 = new double[][] { doubleArray12 };
        org.jfree.data.category.CategoryDataset categoryDataset14 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray13);
        org.jfree.data.category.CategoryDataset categoryDataset15 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray13);
        org.jfree.data.category.CategoryDataset categoryDataset16 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray13);
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray13);
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray13);
        java.lang.Number number19 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(categoryDataset18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset14 and categoryDataset18", categoryDataset14.equals(categoryDataset18) ? categoryDataset14.hashCode() == categoryDataset18.hashCode() : true);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        java.lang.Number[] numberArray12 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray17 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray22 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray27 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray28 = new java.lang.Number[][] { numberArray12, numberArray17, numberArray22, numberArray27 };
        org.jfree.data.category.CategoryDataset categoryDataset29 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray28);
        org.jfree.data.category.CategoryDataset categoryDataset30 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray28);
        org.jfree.data.category.CategoryDataset categoryDataset31 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray28);
        org.jfree.data.category.CategoryDataset categoryDataset32 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset30 and categoryDataset31", categoryDataset30.equals(categoryDataset31) ? categoryDataset30.hashCode() == categoryDataset31.hashCode() : true);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        double[] doubleArray4 = new double[] { (short) 0, (byte) 0 };
        double[][] doubleArray5 = new double[][] { doubleArray4 };
        org.jfree.data.category.CategoryDataset categoryDataset6 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray5);
        org.jfree.data.pie.PieDataset pieDataset8 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset6, 0);
        org.jfree.data.pie.PieDataset pieDataset12 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset8, (java.lang.Comparable) 100.0d, (double) 'a', 1);
        boolean boolean13 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset8 and pieDataset12", pieDataset8.equals(pieDataset12) ? pieDataset8.hashCode() == pieDataset12.hashCode() : true);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        java.lang.Number[] numberArray14 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray24 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray29 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray30 = new java.lang.Number[][] { numberArray14, numberArray19, numberArray24, numberArray29 };
        org.jfree.data.category.CategoryDataset categoryDataset31 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray30);
        org.jfree.data.category.CategoryDataset categoryDataset32 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray30);
        org.jfree.data.category.CategoryDataset categoryDataset33 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray30);
        org.jfree.data.category.CategoryDataset categoryDataset34 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray30);
        org.jfree.data.category.CategoryDataset categoryDataset35 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray30);
        java.lang.Number number36 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(categoryDataset35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset31 and categoryDataset35", categoryDataset31.equals(categoryDataset35) ? categoryDataset31.hashCode() == categoryDataset35.hashCode() : true);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, false);
        org.jfree.data.pie.PieDataset pieDataset21 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset17, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset24 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset21, (java.lang.Comparable) 100L, (double) 1);
        org.jfree.data.pie.PieDataset pieDataset27 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset21, (java.lang.Comparable) (short) 1, 130.0d);
        org.jfree.data.pie.PieDataset pieDataset31 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset27, (java.lang.Comparable) 100.0f, (double) (-1), (int) ' ');
        org.jfree.data.pie.PieDataset pieDataset34 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset31, (java.lang.Comparable) 0.0f, 100.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset27 and pieDataset31", pieDataset27.equals(pieDataset31) ? pieDataset27.hashCode() == pieDataset31.hashCode() : true);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        double[] doubleArray12 = new double[] { (short) 0, (byte) 0 };
        double[][] doubleArray13 = new double[][] { doubleArray12 };
        org.jfree.data.category.CategoryDataset categoryDataset14 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray13);
        org.jfree.data.category.CategoryDataset categoryDataset15 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray13);
        org.jfree.data.category.CategoryDataset categoryDataset16 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray13);
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray13);
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset15 and categoryDataset17", categoryDataset15.equals(categoryDataset17) ? categoryDataset15.hashCode() == categoryDataset17.hashCode() : true);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        java.lang.Number[] numberArray10 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray15 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray20 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray25 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray26 = new java.lang.Number[][] { numberArray10, numberArray15, numberArray20, numberArray25 };
        org.jfree.data.category.CategoryDataset categoryDataset27 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray26);
        org.jfree.data.category.CategoryDataset categoryDataset28 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray26);
        org.jfree.data.category.CategoryDataset categoryDataset29 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset27 and categoryDataset28", categoryDataset27.equals(categoryDataset28) ? categoryDataset27.hashCode() == categoryDataset28.hashCode() : true);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        java.lang.Number[] numberArray16 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray21 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray26 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray31 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray32 = new java.lang.Number[][] { numberArray16, numberArray21, numberArray26, numberArray31 };
        org.jfree.data.category.CategoryDataset categoryDataset33 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray32);
        org.jfree.data.category.CategoryDataset categoryDataset34 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray32);
        org.jfree.data.category.CategoryDataset categoryDataset35 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray32);
        org.jfree.data.category.CategoryDataset categoryDataset36 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray32);
        org.jfree.data.category.CategoryDataset categoryDataset37 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray32);
        org.jfree.data.category.CategoryDataset categoryDataset38 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset33 and categoryDataset37", categoryDataset33.equals(categoryDataset37) ? categoryDataset33.hashCode() == categoryDataset37.hashCode() : true);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        java.lang.Number[] numberArray14 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray24 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray29 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray30 = new java.lang.Number[][] { numberArray14, numberArray19, numberArray24, numberArray29 };
        org.jfree.data.category.CategoryDataset categoryDataset31 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray30);
        org.jfree.data.category.CategoryDataset categoryDataset32 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray30);
        org.jfree.data.category.CategoryDataset categoryDataset33 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray30);
        org.jfree.data.category.CategoryDataset categoryDataset34 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray30);
        org.jfree.data.category.CategoryDataset categoryDataset35 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset31 and categoryDataset34", categoryDataset31.equals(categoryDataset34) ? categoryDataset31.hashCode() == categoryDataset34.hashCode() : true);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        double[] doubleArray9 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray16 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray17 = new double[][] { doubleArray9, doubleArray16 };
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray17);
        org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset18, false);
        org.jfree.data.pie.PieDataset pieDataset22 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset18, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset25 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset22, (java.lang.Comparable) 100L, (double) 1);
        org.jfree.data.category.CategoryDataset categoryDataset26 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 10.0f, (org.jfree.data.KeyedValues) pieDataset25);
        org.jfree.data.pie.PieDataset pieDataset29 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset25, (java.lang.Comparable) 100L, 400.0d);
        org.jfree.data.pie.PieDataset pieDataset32 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset29, (java.lang.Comparable) (short) -1, (double) 1L);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset25 and pieDataset29", pieDataset25.equals(pieDataset29) ? pieDataset25.hashCode() == pieDataset29.hashCode() : true);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
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
        double double42 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset37);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset37 and pieDataset41", pieDataset37.equals(pieDataset41) ? pieDataset37.hashCode() == pieDataset41.hashCode() : true);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        java.lang.Number[] numberArray14 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray24 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray29 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray30 = new java.lang.Number[][] { numberArray14, numberArray19, numberArray24, numberArray29 };
        org.jfree.data.category.CategoryDataset categoryDataset31 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray30);
        org.jfree.data.category.CategoryDataset categoryDataset32 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray30);
        org.jfree.data.category.CategoryDataset categoryDataset33 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray30);
        org.jfree.data.category.CategoryDataset categoryDataset34 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray30);
        org.jfree.data.category.CategoryDataset categoryDataset35 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray30);
        java.lang.Number number36 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset31 and categoryDataset35", categoryDataset31.equals(categoryDataset35) ? categoryDataset31.hashCode() == categoryDataset35.hashCode() : true);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        double[] doubleArray9 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray16 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray17 = new double[][] { doubleArray9, doubleArray16 };
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray17);
        org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset18, false);
        org.jfree.data.pie.PieDataset pieDataset22 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset18, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset25 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset22, (java.lang.Comparable) ' ', (double) '#');
        org.jfree.data.pie.PieDataset pieDataset29 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset25, (java.lang.Comparable) false, (double) 10L, (int) (short) 100);
        org.jfree.data.category.CategoryDataset categoryDataset30 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 400.0d, (org.jfree.data.KeyedValues) pieDataset29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset25 and pieDataset29", pieDataset25.equals(pieDataset29) ? pieDataset25.hashCode() == pieDataset29.hashCode() : true);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
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
        org.jfree.data.pie.PieDataset pieDataset35 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset21, (java.lang.Comparable) 'a', (double) 'a');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset21 and pieDataset32", pieDataset21.equals(pieDataset32) ? pieDataset21.hashCode() == pieDataset32.hashCode() : true);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, false);
        org.jfree.data.pie.PieDataset pieDataset21 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset17, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset24 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset21, (java.lang.Comparable) ' ', (double) '#');
        boolean boolean25 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset24);
        org.jfree.data.pie.PieDataset pieDataset28 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset24, (java.lang.Comparable) (short) 0, (double) (short) 100);
        double double29 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset24 and pieDataset28", pieDataset24.equals(pieDataset28) ? pieDataset24.hashCode() == pieDataset28.hashCode() : true);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        double[] doubleArray14 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray21 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray22 = new double[][] { doubleArray14, doubleArray21 };
        org.jfree.data.category.CategoryDataset categoryDataset23 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray22);
        org.jfree.data.category.CategoryDataset categoryDataset24 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray22);
        org.jfree.data.category.CategoryDataset categoryDataset25 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray22);
        org.jfree.data.category.CategoryDataset categoryDataset26 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset23 and categoryDataset25", categoryDataset23.equals(categoryDataset25) ? categoryDataset23.hashCode() == categoryDataset25.hashCode() : true);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
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
        org.jfree.data.pie.PieDataset pieDataset45 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset41, (java.lang.Comparable) "hi!", 1.0d, (int) 'a');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset37 and pieDataset41", pieDataset37.equals(pieDataset41) ? pieDataset37.hashCode() == pieDataset41.hashCode() : true);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
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
        org.jfree.data.category.CategoryDataset categoryDataset35 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) (-1L), (org.jfree.data.KeyedValues) pieDataset24);
        double double36 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset31 and categoryDataset35", categoryDataset31.equals(categoryDataset35) ? categoryDataset31.hashCode() == categoryDataset35.hashCode() : true);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        double[] doubleArray9 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray16 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray17 = new double[][] { doubleArray9, doubleArray16 };
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray17);
        org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset18, false);
        org.jfree.data.pie.PieDataset pieDataset22 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset18, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset25 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset22, (java.lang.Comparable) 100L, (double) 1);
        double double26 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset22);
        org.jfree.data.category.CategoryDataset categoryDataset27 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 100.0f, (org.jfree.data.KeyedValues) pieDataset22);
        org.jfree.data.pie.PieDataset pieDataset30 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset22, (java.lang.Comparable) 10, (double) (-1));
        boolean boolean31 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset22 and pieDataset30", pieDataset22.equals(pieDataset30) ? pieDataset22.hashCode() == pieDataset30.hashCode() : true);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
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
        org.jfree.data.pie.PieDataset pieDataset43 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset40, (java.lang.Comparable) 400.0d, 130.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset33 and pieDataset40", pieDataset33.equals(pieDataset40) ? pieDataset33.hashCode() == pieDataset40.hashCode() : true);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        java.lang.Number[] numberArray12 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray17 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray22 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray27 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray28 = new java.lang.Number[][] { numberArray12, numberArray17, numberArray22, numberArray27 };
        org.jfree.data.category.CategoryDataset categoryDataset29 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray28);
        org.jfree.data.category.CategoryDataset categoryDataset30 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray28);
        org.jfree.data.category.CategoryDataset categoryDataset31 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray28);
        org.jfree.data.category.CategoryDataset categoryDataset32 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset29 and categoryDataset31", categoryDataset29.equals(categoryDataset31) ? categoryDataset29.hashCode() == categoryDataset31.hashCode() : true);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
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
        org.jfree.data.pie.PieDataset pieDataset34 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset23, (java.lang.Comparable) 0.0f, (double) (byte) 1);
        org.jfree.data.pie.PieDataset pieDataset37 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset34, (java.lang.Comparable) "hi!", (double) 10.0f);
        org.jfree.data.category.CategoryDataset categoryDataset38 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) true, (org.jfree.data.KeyedValues) pieDataset37);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset34 and pieDataset37", pieDataset34.equals(pieDataset37) ? pieDataset34.hashCode() == pieDataset37.hashCode() : true);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
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
        boolean boolean36 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset35);
        boolean boolean37 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset35);
        org.jfree.data.pie.PieDataset pieDataset41 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset35, (java.lang.Comparable) 0, (double) 1, (int) '4');
        java.lang.Comparable comparable42 = null;
        org.jfree.data.pie.PieDataset pieDataset45 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset41, comparable42, (double) 10L, (int) (byte) 100);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset35 and pieDataset41", pieDataset35.equals(pieDataset41) ? pieDataset35.hashCode() == pieDataset41.hashCode() : true);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        double[] doubleArray14 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray21 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray22 = new double[][] { doubleArray14, doubleArray21 };
        org.jfree.data.category.CategoryDataset categoryDataset23 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray22);
        org.jfree.data.category.CategoryDataset categoryDataset24 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray22);
        org.jfree.data.category.CategoryDataset categoryDataset25 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray22);
        org.jfree.data.category.CategoryDataset categoryDataset26 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset23 and categoryDataset25", categoryDataset23.equals(categoryDataset25) ? categoryDataset23.hashCode() == categoryDataset25.hashCode() : true);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, false);
        org.jfree.data.pie.PieDataset pieDataset21 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset17, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset24 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset21, (java.lang.Comparable) 100L, (double) 1);
        org.jfree.data.pie.PieDataset pieDataset27 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset21, (java.lang.Comparable) (short) 1, 130.0d);
        org.jfree.data.pie.PieDataset pieDataset31 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset27, (java.lang.Comparable) 100.0f, (double) (-1), (int) ' ');
        org.jfree.data.pie.PieDataset pieDataset34 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset27, (java.lang.Comparable) 1L, (double) (-1L));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset27 and pieDataset31", pieDataset27.equals(pieDataset31) ? pieDataset27.hashCode() == pieDataset31.hashCode() : true);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        double[] doubleArray10 = new double[] { (short) 0, (byte) 0 };
        double[][] doubleArray11 = new double[][] { doubleArray10 };
        org.jfree.data.category.CategoryDataset categoryDataset12 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray11);
        org.jfree.data.category.CategoryDataset categoryDataset13 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray11);
        org.jfree.data.category.CategoryDataset categoryDataset14 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray11);
        org.jfree.data.category.CategoryDataset categoryDataset15 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray11);
        java.lang.Number number16 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset13 and categoryDataset15", categoryDataset13.equals(categoryDataset15) ? categoryDataset13.hashCode() == categoryDataset15.hashCode() : true);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, false);
        org.jfree.data.pie.PieDataset pieDataset21 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset17, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset25 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset21, (java.lang.Comparable) (byte) 100, (double) 0.0f, (int) '4');
        double double26 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset21 and pieDataset25", pieDataset21.equals(pieDataset25) ? pieDataset21.hashCode() == pieDataset25.hashCode() : true);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
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
        org.jfree.data.pie.PieDataset pieDataset36 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset22, (java.lang.Comparable) 100L, 20.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset22 and pieDataset33", pieDataset22.equals(pieDataset33) ? pieDataset22.hashCode() == pieDataset33.hashCode() : true);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
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
        double double36 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset23);
        org.jfree.data.pie.PieDataset pieDataset40 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset23, (java.lang.Comparable) (short) 10, (double) (short) 10, (int) (byte) -1);
        double double41 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset40);
        org.jfree.data.pie.PieDataset pieDataset44 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset40, (java.lang.Comparable) ' ', (double) 100L);
        org.jfree.data.pie.PieDataset pieDataset47 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset40, (java.lang.Comparable) 130.0d, 20.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset40 and pieDataset44", pieDataset40.equals(pieDataset44) ? pieDataset40.hashCode() == pieDataset44.hashCode() : true);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        java.lang.Number[] numberArray12 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray17 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray22 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray27 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray28 = new java.lang.Number[][] { numberArray12, numberArray17, numberArray22, numberArray27 };
        org.jfree.data.category.CategoryDataset categoryDataset29 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray28);
        org.jfree.data.category.CategoryDataset categoryDataset30 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray28);
        org.jfree.data.category.CategoryDataset categoryDataset31 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray28);
        org.jfree.data.category.CategoryDataset categoryDataset32 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray28);
        org.jfree.data.pie.PieDataset pieDataset34 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset32, (int) (byte) 1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset29 and categoryDataset32", categoryDataset29.equals(categoryDataset32) ? categoryDataset29.hashCode() == categoryDataset32.hashCode() : true);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, false);
        org.jfree.data.pie.PieDataset pieDataset21 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset17, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset24 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset21, (java.lang.Comparable) ' ', (double) '#');
        org.jfree.data.pie.PieDataset pieDataset27 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset24, (java.lang.Comparable) (byte) 1, (double) 10);
        java.lang.Class<?> wildcardClass28 = pieDataset24.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset24 and pieDataset27", pieDataset24.equals(pieDataset27) ? pieDataset24.hashCode() == pieDataset27.hashCode() : true);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        double[] doubleArray9 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray16 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray17 = new double[][] { doubleArray9, doubleArray16 };
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray17);
        org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset18, false);
        org.jfree.data.pie.PieDataset pieDataset22 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset18, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset25 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset22, (java.lang.Comparable) 100L, (double) 1);
        org.jfree.data.category.CategoryDataset categoryDataset26 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 10.0f, (org.jfree.data.KeyedValues) pieDataset25);
        org.jfree.data.pie.PieDataset pieDataset29 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset25, (java.lang.Comparable) 100L, 400.0d);
        boolean boolean30 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset25 and pieDataset29", pieDataset25.equals(pieDataset29) ? pieDataset25.hashCode() == pieDataset29.hashCode() : true);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        java.lang.Number[] numberArray14 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray24 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray29 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray30 = new java.lang.Number[][] { numberArray14, numberArray19, numberArray24, numberArray29 };
        org.jfree.data.category.CategoryDataset categoryDataset31 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray30);
        org.jfree.data.category.CategoryDataset categoryDataset32 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray30);
        org.jfree.data.category.CategoryDataset categoryDataset33 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray30);
        org.jfree.data.category.CategoryDataset categoryDataset34 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray30);
        org.jfree.data.category.CategoryDataset categoryDataset35 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray30);
        org.jfree.data.Range range37 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset35, false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset31 and categoryDataset35", categoryDataset31.equals(categoryDataset35) ? categoryDataset31.hashCode() == categoryDataset35.hashCode() : true);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        double[] doubleArray8 = new double[] { (short) 0, (byte) 0 };
        double[][] doubleArray9 = new double[][] { doubleArray8 };
        org.jfree.data.category.CategoryDataset categoryDataset10 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray9);
        org.jfree.data.category.CategoryDataset categoryDataset11 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray9);
        org.jfree.data.category.CategoryDataset categoryDataset12 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray9);
        org.jfree.data.Range range13 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset10 and categoryDataset12", categoryDataset10.equals(categoryDataset12) ? categoryDataset10.hashCode() == categoryDataset12.hashCode() : true);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        double[] doubleArray14 = new double[] { (short) 0, (byte) 0 };
        double[][] doubleArray15 = new double[][] { doubleArray14 };
        org.jfree.data.category.CategoryDataset categoryDataset16 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray15);
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray15);
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray15);
        org.jfree.data.category.CategoryDataset categoryDataset19 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray15);
        org.jfree.data.category.CategoryDataset categoryDataset20 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray15);
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset18 and categoryDataset20", categoryDataset18.equals(categoryDataset20) ? categoryDataset18.hashCode() == categoryDataset20.hashCode() : true);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
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
        org.jfree.data.pie.PieDataset pieDataset35 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset23, (java.lang.Comparable) '#', (double) 10);
        org.jfree.data.pie.PieDataset pieDataset39 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset35, (java.lang.Comparable) (-1L), 0.0d, (int) (byte) 1);
        org.jfree.data.category.CategoryDataset categoryDataset40 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) (-1.0d), (org.jfree.data.KeyedValues) pieDataset35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset35 and pieDataset39", pieDataset35.equals(pieDataset39) ? pieDataset35.hashCode() == pieDataset39.hashCode() : true);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        double[] doubleArray9 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray16 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray17 = new double[][] { doubleArray9, doubleArray16 };
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray17);
        org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset18, false);
        org.jfree.data.pie.PieDataset pieDataset22 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset18, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset25 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset22, (java.lang.Comparable) 10L, (double) (-1L));
        org.jfree.data.category.CategoryDataset categoryDataset26 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) (byte) -1, (org.jfree.data.KeyedValues) pieDataset25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset22 and pieDataset25", pieDataset22.equals(pieDataset25) ? pieDataset22.hashCode() == pieDataset25.hashCode() : true);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        java.lang.Number[] numberArray12 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray17 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray22 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray27 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray28 = new java.lang.Number[][] { numberArray12, numberArray17, numberArray22, numberArray27 };
        org.jfree.data.category.CategoryDataset categoryDataset29 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray28);
        org.jfree.data.category.CategoryDataset categoryDataset30 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray28);
        org.jfree.data.category.CategoryDataset categoryDataset31 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray28);
        org.jfree.data.category.CategoryDataset categoryDataset32 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset30 and categoryDataset31", categoryDataset30.equals(categoryDataset31) ? categoryDataset30.hashCode() == categoryDataset31.hashCode() : true);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        java.lang.Number[] numberArray14 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray24 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray29 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray30 = new java.lang.Number[][] { numberArray14, numberArray19, numberArray24, numberArray29 };
        org.jfree.data.category.CategoryDataset categoryDataset31 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray30);
        org.jfree.data.category.CategoryDataset categoryDataset32 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray30);
        org.jfree.data.category.CategoryDataset categoryDataset33 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray30);
        org.jfree.data.category.CategoryDataset categoryDataset34 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray30);
        org.jfree.data.category.CategoryDataset categoryDataset35 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray30);
        java.lang.Class<?> wildcardClass36 = numberArray30.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset31 and categoryDataset35", categoryDataset31.equals(categoryDataset35) ? categoryDataset31.hashCode() == categoryDataset35.hashCode() : true);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        double[] doubleArray10 = new double[] { (short) 0, (byte) 0 };
        double[][] doubleArray11 = new double[][] { doubleArray10 };
        org.jfree.data.category.CategoryDataset categoryDataset12 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray11);
        org.jfree.data.category.CategoryDataset categoryDataset13 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray11);
        org.jfree.data.category.CategoryDataset categoryDataset14 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray11);
        org.jfree.data.category.CategoryDataset categoryDataset15 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset13 and categoryDataset14", categoryDataset13.equals(categoryDataset14) ? categoryDataset13.hashCode() == categoryDataset14.hashCode() : true);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
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
        double double38 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset33);
        org.jfree.data.pie.PieDataset pieDataset42 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset33, (java.lang.Comparable) (short) -1, (double) (byte) 10, (int) ' ');
        org.jfree.data.pie.PieDataset pieDataset46 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset33, (java.lang.Comparable) 1.0d, 100.0d, (int) (short) -1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset33 and pieDataset42", pieDataset33.equals(pieDataset42) ? pieDataset33.hashCode() == pieDataset42.hashCode() : true);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
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
        boolean boolean30 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset24 and pieDataset29", pieDataset24.equals(pieDataset29) ? pieDataset24.hashCode() == pieDataset29.hashCode() : true);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, false);
        org.jfree.data.pie.PieDataset pieDataset21 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset17, (int) (short) 0);
        double double22 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset21);
        boolean boolean23 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset21);
        org.jfree.data.pie.PieDataset pieDataset26 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset21, (java.lang.Comparable) (-1L), 400.0d);
        org.jfree.data.pie.PieDataset pieDataset30 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset26, (java.lang.Comparable) 1.0d, 0.0d, (int) (short) 10);
        java.lang.Comparable comparable31 = null;
        org.jfree.data.pie.PieDataset pieDataset33 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset30, comparable31, 200.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset26 and pieDataset30", pieDataset26.equals(pieDataset30) ? pieDataset26.hashCode() == pieDataset30.hashCode() : true);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
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
        double double36 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset23);
        org.jfree.data.pie.PieDataset pieDataset40 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset23, (java.lang.Comparable) (short) 10, (double) (short) 10, (int) (byte) -1);
        double double41 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset40);
        org.jfree.data.pie.PieDataset pieDataset44 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset40, (java.lang.Comparable) ' ', (double) 100L);
        org.jfree.data.pie.PieDataset pieDataset47 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset40, (java.lang.Comparable) 400.0d, (double) (-1.0f));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset40 and pieDataset44", pieDataset40.equals(pieDataset44) ? pieDataset40.hashCode() == pieDataset44.hashCode() : true);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        java.lang.Number[] numberArray12 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray17 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray22 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray27 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray28 = new java.lang.Number[][] { numberArray12, numberArray17, numberArray22, numberArray27 };
        org.jfree.data.category.CategoryDataset categoryDataset29 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray28);
        org.jfree.data.category.CategoryDataset categoryDataset30 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray28);
        org.jfree.data.category.CategoryDataset categoryDataset31 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray28);
        org.jfree.data.category.CategoryDataset categoryDataset32 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset29 and categoryDataset31", categoryDataset29.equals(categoryDataset31) ? categoryDataset29.hashCode() == categoryDataset31.hashCode() : true);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, false);
        org.jfree.data.pie.PieDataset pieDataset21 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset17, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset24 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset21, (java.lang.Comparable) ' ', (double) '#');
        boolean boolean25 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset24);
        org.jfree.data.pie.PieDataset pieDataset28 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset24, (java.lang.Comparable) (short) 0, (double) (short) 100);
        org.jfree.data.pie.PieDataset pieDataset31 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset28, (java.lang.Comparable) ' ', (double) (-1));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset24 and pieDataset28", pieDataset24.equals(pieDataset28) ? pieDataset24.hashCode() == pieDataset28.hashCode() : true);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        java.lang.Number[] numberArray16 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray21 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray26 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray31 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray32 = new java.lang.Number[][] { numberArray16, numberArray21, numberArray26, numberArray31 };
        org.jfree.data.category.CategoryDataset categoryDataset33 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray32);
        org.jfree.data.category.CategoryDataset categoryDataset34 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray32);
        org.jfree.data.category.CategoryDataset categoryDataset35 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray32);
        org.jfree.data.category.CategoryDataset categoryDataset36 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray32);
        org.jfree.data.category.CategoryDataset categoryDataset37 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray32);
        org.jfree.data.category.CategoryDataset categoryDataset38 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset33 and categoryDataset37", categoryDataset33.equals(categoryDataset37) ? categoryDataset33.hashCode() == categoryDataset37.hashCode() : true);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        java.lang.Number[] numberArray10 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray15 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray20 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray25 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray26 = new java.lang.Number[][] { numberArray10, numberArray15, numberArray20, numberArray25 };
        org.jfree.data.category.CategoryDataset categoryDataset27 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray26);
        org.jfree.data.category.CategoryDataset categoryDataset28 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray26);
        org.jfree.data.category.CategoryDataset categoryDataset29 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray26);
        org.jfree.data.Range range31 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset29, true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset27 and categoryDataset29", categoryDataset27.equals(categoryDataset29) ? categoryDataset27.hashCode() == categoryDataset29.hashCode() : true);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        double[] doubleArray9 = new double[] { 130.0d, (-1.0f), 1L, 100.0f, 1L };
        double[] doubleArray15 = new double[] { 130.0d, (-1.0f), 1L, 100.0f, 1L };
        double[] doubleArray21 = new double[] { 130.0d, (-1.0f), 1L, 100.0f, 1L };
        double[] doubleArray27 = new double[] { 130.0d, (-1.0f), 1L, 100.0f, 1L };
        double[] doubleArray33 = new double[] { 130.0d, (-1.0f), 1L, 100.0f, 1L };
        double[] doubleArray39 = new double[] { 130.0d, (-1.0f), 1L, 100.0f, 1L };
        double[][] doubleArray40 = new double[][] { doubleArray9, doubleArray15, doubleArray21, doubleArray27, doubleArray33, doubleArray39 };
        org.jfree.data.category.CategoryDataset categoryDataset41 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray40);
        org.jfree.data.category.CategoryDataset categoryDataset42 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray40);
        org.jfree.data.Range range43 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset42);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset41 and categoryDataset42", categoryDataset41.equals(categoryDataset42) ? categoryDataset41.hashCode() == categoryDataset42.hashCode() : true);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
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
        org.jfree.data.pie.PieDataset pieDataset32 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset24, (java.lang.Comparable) 1.0d, (double) (short) 0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset24 and pieDataset29", pieDataset24.equals(pieDataset29) ? pieDataset24.hashCode() == pieDataset29.hashCode() : true);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        java.lang.Number[] numberArray16 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray21 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray26 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray31 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray32 = new java.lang.Number[][] { numberArray16, numberArray21, numberArray26, numberArray31 };
        org.jfree.data.category.CategoryDataset categoryDataset33 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray32);
        org.jfree.data.category.CategoryDataset categoryDataset34 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray32);
        org.jfree.data.category.CategoryDataset categoryDataset35 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray32);
        org.jfree.data.category.CategoryDataset categoryDataset36 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray32);
        org.jfree.data.category.CategoryDataset categoryDataset37 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray32);
        org.jfree.data.category.CategoryDataset categoryDataset38 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset35 and categoryDataset37", categoryDataset35.equals(categoryDataset37) ? categoryDataset35.hashCode() == categoryDataset37.hashCode() : true);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, false);
        org.jfree.data.pie.PieDataset pieDataset21 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset17, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset24 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset21, (java.lang.Comparable) 100L, (double) 1);
        org.jfree.data.pie.PieDataset pieDataset28 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset21, (java.lang.Comparable) false, (double) 100.0f, (int) (short) 100);
        org.jfree.data.pie.PieDataset pieDataset32 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset28, (java.lang.Comparable) (-1.0d), (double) (short) 100, 10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset21 and pieDataset28", pieDataset21.equals(pieDataset28) ? pieDataset21.hashCode() == pieDataset28.hashCode() : true);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
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
        org.jfree.data.pie.PieDataset pieDataset37 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset23, (java.lang.Comparable) (short) 0, (double) 1, (int) (short) 1);
        org.jfree.data.pie.PieDataset pieDataset41 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset23, (java.lang.Comparable) (short) 0, (double) 100.0f, (int) '#');
        org.jfree.data.pie.PieDataset pieDataset44 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset41, (java.lang.Comparable) (byte) 0, 130.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset23 and pieDataset41", pieDataset23.equals(pieDataset41) ? pieDataset23.hashCode() == pieDataset41.hashCode() : true);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        java.lang.Number[] numberArray14 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray24 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray29 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray30 = new java.lang.Number[][] { numberArray14, numberArray19, numberArray24, numberArray29 };
        org.jfree.data.category.CategoryDataset categoryDataset31 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray30);
        org.jfree.data.category.CategoryDataset categoryDataset32 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray30);
        org.jfree.data.category.CategoryDataset categoryDataset33 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray30);
        org.jfree.data.category.CategoryDataset categoryDataset34 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray30);
        org.jfree.data.category.CategoryDataset categoryDataset35 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray30);
        boolean boolean36 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset31 and categoryDataset35", categoryDataset31.equals(categoryDataset35) ? categoryDataset31.hashCode() == categoryDataset35.hashCode() : true);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        java.lang.Number[] numberArray12 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray17 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray22 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray27 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray28 = new java.lang.Number[][] { numberArray12, numberArray17, numberArray22, numberArray27 };
        org.jfree.data.category.CategoryDataset categoryDataset29 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray28);
        org.jfree.data.category.CategoryDataset categoryDataset30 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray28);
        org.jfree.data.category.CategoryDataset categoryDataset31 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray28);
        org.jfree.data.category.CategoryDataset categoryDataset32 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset30 and categoryDataset31", categoryDataset30.equals(categoryDataset31) ? categoryDataset30.hashCode() == categoryDataset31.hashCode() : true);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        java.lang.Number[] numberArray10 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray15 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray20 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray25 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray26 = new java.lang.Number[][] { numberArray10, numberArray15, numberArray20, numberArray25 };
        org.jfree.data.category.CategoryDataset categoryDataset27 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray26);
        org.jfree.data.category.CategoryDataset categoryDataset28 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray26);
        org.jfree.data.category.CategoryDataset categoryDataset29 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray26);
        org.jfree.data.Range range30 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset28 and categoryDataset29", categoryDataset28.equals(categoryDataset29) ? categoryDataset28.hashCode() == categoryDataset29.hashCode() : true);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        java.lang.Number[] numberArray14 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray24 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray29 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray30 = new java.lang.Number[][] { numberArray14, numberArray19, numberArray24, numberArray29 };
        org.jfree.data.category.CategoryDataset categoryDataset31 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray30);
        org.jfree.data.category.CategoryDataset categoryDataset32 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray30);
        org.jfree.data.category.CategoryDataset categoryDataset33 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray30);
        org.jfree.data.category.CategoryDataset categoryDataset34 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray30);
        org.jfree.data.category.CategoryDataset categoryDataset35 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset31 and categoryDataset34", categoryDataset31.equals(categoryDataset34) ? categoryDataset31.hashCode() == categoryDataset34.hashCode() : true);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
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
        org.jfree.data.Range range36 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset31 and categoryDataset35", categoryDataset31.equals(categoryDataset35) ? categoryDataset31.hashCode() == categoryDataset35.hashCode() : true);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
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
        double double38 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset33);
        org.jfree.data.pie.PieDataset pieDataset42 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset33, (java.lang.Comparable) (short) -1, (double) (byte) 10, (int) ' ');
        double double43 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset33 and pieDataset42", pieDataset33.equals(pieDataset42) ? pieDataset33.hashCode() == pieDataset42.hashCode() : true);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        java.lang.Number[] numberArray10 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray15 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray20 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray25 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray26 = new java.lang.Number[][] { numberArray10, numberArray15, numberArray20, numberArray25 };
        org.jfree.data.category.CategoryDataset categoryDataset27 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray26);
        org.jfree.data.category.CategoryDataset categoryDataset28 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray26);
        org.jfree.data.category.CategoryDataset categoryDataset29 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset27 and categoryDataset28", categoryDataset27.equals(categoryDataset28) ? categoryDataset27.hashCode() == categoryDataset28.hashCode() : true);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        java.lang.Number[] numberArray16 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray21 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray26 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray31 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray32 = new java.lang.Number[][] { numberArray16, numberArray21, numberArray26, numberArray31 };
        org.jfree.data.category.CategoryDataset categoryDataset33 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray32);
        org.jfree.data.category.CategoryDataset categoryDataset34 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray32);
        org.jfree.data.category.CategoryDataset categoryDataset35 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray32);
        org.jfree.data.category.CategoryDataset categoryDataset36 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray32);
        org.jfree.data.category.CategoryDataset categoryDataset37 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray32);
        org.jfree.data.category.CategoryDataset categoryDataset38 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset36 and categoryDataset37", categoryDataset36.equals(categoryDataset37) ? categoryDataset36.hashCode() == categoryDataset37.hashCode() : true);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        java.lang.Number[] numberArray14 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray24 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray29 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray30 = new java.lang.Number[][] { numberArray14, numberArray19, numberArray24, numberArray29 };
        org.jfree.data.category.CategoryDataset categoryDataset31 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray30);
        org.jfree.data.category.CategoryDataset categoryDataset32 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray30);
        org.jfree.data.category.CategoryDataset categoryDataset33 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray30);
        org.jfree.data.category.CategoryDataset categoryDataset34 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray30);
        org.jfree.data.category.CategoryDataset categoryDataset35 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray30);
        org.jfree.data.Range range37 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset35, true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset33 and categoryDataset35", categoryDataset33.equals(categoryDataset35) ? categoryDataset33.hashCode() == categoryDataset35.hashCode() : true);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, false);
        org.jfree.data.pie.PieDataset pieDataset21 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset17, (int) (short) 0);
        org.jfree.data.Range range22 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset17);
        org.jfree.data.pie.PieDataset pieDataset24 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset17, (int) (short) 1);
        org.jfree.data.Range range25 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset21 and pieDataset24", pieDataset21.equals(pieDataset24) ? pieDataset21.hashCode() == pieDataset24.hashCode() : true);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
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
        double double36 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset23);
        org.jfree.data.pie.PieDataset pieDataset39 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset23, (java.lang.Comparable) "", (double) (-1.0f));
        boolean boolean40 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset39);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset23 and pieDataset39", pieDataset23.equals(pieDataset39) ? pieDataset23.hashCode() == pieDataset39.hashCode() : true);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
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
        double double32 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset22);
        java.lang.Comparable comparable33 = null;
        org.jfree.data.pie.PieDataset pieDataset36 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset22, comparable33, (double) (byte) 0, (int) (byte) 1);
        org.jfree.data.pie.PieDataset pieDataset40 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset36, (java.lang.Comparable) '#', (double) 100L, 1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset22 and pieDataset36", pieDataset22.equals(pieDataset36) ? pieDataset22.hashCode() == pieDataset36.hashCode() : true);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, false);
        org.jfree.data.pie.PieDataset pieDataset21 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset17, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset24 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset21, (java.lang.Comparable) ' ', (double) '#');
        boolean boolean25 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset24);
        org.jfree.data.pie.PieDataset pieDataset28 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset24, (java.lang.Comparable) (short) 0, (double) (short) 100);
        boolean boolean29 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset24 and pieDataset28", pieDataset24.equals(pieDataset28) ? pieDataset24.hashCode() == pieDataset28.hashCode() : true);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
        java.lang.Number[] numberArray12 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray17 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray22 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray27 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray28 = new java.lang.Number[][] { numberArray12, numberArray17, numberArray22, numberArray27 };
        org.jfree.data.category.CategoryDataset categoryDataset29 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray28);
        org.jfree.data.category.CategoryDataset categoryDataset30 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray28);
        org.jfree.data.category.CategoryDataset categoryDataset31 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray28);
        org.jfree.data.category.CategoryDataset categoryDataset32 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset30 and categoryDataset31", categoryDataset30.equals(categoryDataset31) ? categoryDataset30.hashCode() == categoryDataset31.hashCode() : true);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, false);
        org.jfree.data.pie.PieDataset pieDataset21 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset17, (int) (short) 0);
        java.lang.Comparable comparable22 = null;
        org.jfree.data.pie.PieDataset pieDataset25 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset21, comparable22, (double) 10L, (int) (byte) 100);
        org.jfree.data.pie.PieDataset pieDataset29 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset25, (java.lang.Comparable) (short) -1, 0.0d, (int) '#');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset21 and pieDataset25", pieDataset21.equals(pieDataset25) ? pieDataset21.hashCode() == pieDataset25.hashCode() : true);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
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
        org.jfree.data.category.CategoryDataset categoryDataset35 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) (-1L), (org.jfree.data.KeyedValues) pieDataset24);
        org.jfree.data.Range range36 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset31 and categoryDataset35", categoryDataset31.equals(categoryDataset35) ? categoryDataset31.hashCode() == categoryDataset35.hashCode() : true);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
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
        org.jfree.data.category.CategoryDataset categoryDataset37 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) ' ', (org.jfree.data.KeyedValues) pieDataset24);
        org.jfree.data.pie.PieDataset pieDataset40 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset24, (java.lang.Comparable) '4', (double) 100);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset35 and categoryDataset37", categoryDataset35.equals(categoryDataset37) ? categoryDataset35.hashCode() == categoryDataset37.hashCode() : true);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        java.lang.Number[] numberArray14 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray24 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray29 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray30 = new java.lang.Number[][] { numberArray14, numberArray19, numberArray24, numberArray29 };
        org.jfree.data.category.CategoryDataset categoryDataset31 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray30);
        org.jfree.data.category.CategoryDataset categoryDataset32 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray30);
        org.jfree.data.category.CategoryDataset categoryDataset33 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray30);
        org.jfree.data.category.CategoryDataset categoryDataset34 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray30);
        org.jfree.data.category.CategoryDataset categoryDataset35 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray30);
        org.jfree.data.Range range36 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset33 and categoryDataset35", categoryDataset33.equals(categoryDataset35) ? categoryDataset33.hashCode() == categoryDataset35.hashCode() : true);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
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
        boolean boolean33 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset22 and pieDataset32", pieDataset22.equals(pieDataset32) ? pieDataset22.hashCode() == pieDataset32.hashCode() : true);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
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
        boolean boolean36 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset35);
        boolean boolean37 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset35);
        org.jfree.data.pie.PieDataset pieDataset41 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset35, (java.lang.Comparable) 0, (double) 1, (int) '4');
        org.jfree.data.pie.PieDataset pieDataset44 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset35, (java.lang.Comparable) 'a', (double) (short) 0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset35 and pieDataset41", pieDataset35.equals(pieDataset41) ? pieDataset35.hashCode() == pieDataset41.hashCode() : true);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        double[] doubleArray9 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray16 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray17 = new double[][] { doubleArray9, doubleArray16 };
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray17);
        org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset18, false);
        org.jfree.data.pie.PieDataset pieDataset22 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset18, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset25 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset22, (java.lang.Comparable) 100L, (double) 1);
        org.jfree.data.category.CategoryDataset categoryDataset26 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 10.0f, (org.jfree.data.KeyedValues) pieDataset25);
        org.jfree.data.pie.PieDataset pieDataset29 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset25, (java.lang.Comparable) 100L, 400.0d);
        org.jfree.data.pie.PieDataset pieDataset32 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset29, (java.lang.Comparable) (byte) 1, 20.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset25 and pieDataset29", pieDataset25.equals(pieDataset29) ? pieDataset25.hashCode() == pieDataset29.hashCode() : true);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        java.lang.Number[] numberArray10 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray15 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray20 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray25 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray26 = new java.lang.Number[][] { numberArray10, numberArray15, numberArray20, numberArray25 };
        org.jfree.data.category.CategoryDataset categoryDataset27 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray26);
        org.jfree.data.category.CategoryDataset categoryDataset28 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray26);
        org.jfree.data.category.CategoryDataset categoryDataset29 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray26);
        java.lang.Number number30 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset27 and categoryDataset29", categoryDataset27.equals(categoryDataset29) ? categoryDataset27.hashCode() == categoryDataset29.hashCode() : true);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
        double[] doubleArray9 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray16 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray17 = new double[][] { doubleArray9, doubleArray16 };
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray17);
        org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset18, false);
        org.jfree.data.pie.PieDataset pieDataset22 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset18, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset25 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset22, (java.lang.Comparable) 100L, (double) 1);
        double double26 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset22);
        org.jfree.data.category.CategoryDataset categoryDataset27 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 100.0f, (org.jfree.data.KeyedValues) pieDataset22);
        org.jfree.data.pie.PieDataset pieDataset30 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset22, (java.lang.Comparable) 10, (double) (-1));
        org.jfree.data.pie.PieDataset pieDataset33 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset22, (java.lang.Comparable) (byte) 0, (double) 'a');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset22 and pieDataset30", pieDataset22.equals(pieDataset30) ? pieDataset22.hashCode() == pieDataset30.hashCode() : true);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
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
        org.jfree.data.Range range31 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset22 and pieDataset30", pieDataset22.equals(pieDataset30) ? pieDataset22.hashCode() == pieDataset30.hashCode() : true);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
        java.lang.Number[] numberArray12 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray17 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray22 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray27 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray28 = new java.lang.Number[][] { numberArray12, numberArray17, numberArray22, numberArray27 };
        org.jfree.data.category.CategoryDataset categoryDataset29 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray28);
        org.jfree.data.category.CategoryDataset categoryDataset30 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray28);
        org.jfree.data.category.CategoryDataset categoryDataset31 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray28);
        org.jfree.data.category.CategoryDataset categoryDataset32 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset30 and categoryDataset31", categoryDataset30.equals(categoryDataset31) ? categoryDataset30.hashCode() == categoryDataset31.hashCode() : true);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
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
        org.jfree.data.pie.PieDataset pieDataset34 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset23, (java.lang.Comparable) 0.0f, (double) (byte) 1);
        org.jfree.data.pie.PieDataset pieDataset38 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset34, (java.lang.Comparable) 100, 130.0d, (int) (short) 0);
        double double39 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset34);
        org.jfree.data.pie.PieDataset pieDataset43 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset34, (java.lang.Comparable) (short) -1, (double) (byte) 10, (int) ' ');
        org.jfree.data.category.CategoryDataset categoryDataset44 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) (byte) 100, (org.jfree.data.KeyedValues) pieDataset34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset34 and pieDataset43", pieDataset34.equals(pieDataset43) ? pieDataset34.hashCode() == pieDataset43.hashCode() : true);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
        double[] doubleArray12 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray19 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray20 = new double[][] { doubleArray12, doubleArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray20);
        org.jfree.data.category.CategoryDataset categoryDataset22 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray20);
        org.jfree.data.category.CategoryDataset categoryDataset23 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray20);
        org.jfree.data.Range range25 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset23, 200.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset21 and categoryDataset23", categoryDataset21.equals(categoryDataset23) ? categoryDataset21.hashCode() == categoryDataset23.hashCode() : true);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, false);
        java.lang.Number number20 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(categoryDataset17);
        org.jfree.data.pie.PieDataset pieDataset22 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset17, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset26 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset22, (java.lang.Comparable) (byte) 100, (double) (-1), 10);
        org.jfree.data.pie.PieDataset pieDataset29 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset26, (java.lang.Comparable) (byte) -1, (double) 1L);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset22 and pieDataset26", pieDataset22.equals(pieDataset26) ? pieDataset22.hashCode() == pieDataset26.hashCode() : true);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
        java.lang.Number[] numberArray14 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray24 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray29 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray30 = new java.lang.Number[][] { numberArray14, numberArray19, numberArray24, numberArray29 };
        org.jfree.data.category.CategoryDataset categoryDataset31 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray30);
        org.jfree.data.category.CategoryDataset categoryDataset32 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray30);
        org.jfree.data.category.CategoryDataset categoryDataset33 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray30);
        org.jfree.data.category.CategoryDataset categoryDataset34 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray30);
        org.jfree.data.category.CategoryDataset categoryDataset35 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset31 and categoryDataset34", categoryDataset31.equals(categoryDataset34) ? categoryDataset31.hashCode() == categoryDataset34.hashCode() : true);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
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
        double double36 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset22 and pieDataset35", pieDataset22.equals(pieDataset35) ? pieDataset22.hashCode() == pieDataset35.hashCode() : true);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
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
        double double33 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset23);
        java.lang.Comparable comparable34 = null;
        org.jfree.data.pie.PieDataset pieDataset37 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset23, comparable34, (double) (byte) 0, (int) (byte) 1);
        org.jfree.data.category.CategoryDataset categoryDataset38 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 0.0d, (org.jfree.data.KeyedValues) pieDataset37);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset23 and pieDataset37", pieDataset23.equals(pieDataset37) ? pieDataset23.hashCode() == pieDataset37.hashCode() : true);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
        double[] doubleArray16 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray23 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray24 = new double[][] { doubleArray16, doubleArray23 };
        org.jfree.data.category.CategoryDataset categoryDataset25 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray24);
        org.jfree.data.category.CategoryDataset categoryDataset26 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray24);
        org.jfree.data.category.CategoryDataset categoryDataset27 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray24);
        org.jfree.data.category.CategoryDataset categoryDataset28 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray24);
        org.jfree.data.category.CategoryDataset categoryDataset29 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset25 and categoryDataset28", categoryDataset25.equals(categoryDataset28) ? categoryDataset25.hashCode() == categoryDataset28.hashCode() : true);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
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
        org.jfree.data.pie.PieDataset pieDataset33 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset29, (java.lang.Comparable) (short) -1, (double) 10L, (int) (byte) 1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset24 and pieDataset29", pieDataset24.equals(pieDataset29) ? pieDataset24.hashCode() == pieDataset29.hashCode() : true);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
        double[] doubleArray10 = new double[] { (short) 0, (byte) 0 };
        double[][] doubleArray11 = new double[][] { doubleArray10 };
        org.jfree.data.category.CategoryDataset categoryDataset12 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray11);
        org.jfree.data.category.CategoryDataset categoryDataset13 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray11);
        org.jfree.data.category.CategoryDataset categoryDataset14 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray11);
        org.jfree.data.category.CategoryDataset categoryDataset15 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray11);
        org.jfree.data.Range range17 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset15, (double) 10L);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset13 and categoryDataset15", categoryDataset13.equals(categoryDataset15) ? categoryDataset13.hashCode() == categoryDataset15.hashCode() : true);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
        java.lang.Number[] numberArray16 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray21 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray26 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray31 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray32 = new java.lang.Number[][] { numberArray16, numberArray21, numberArray26, numberArray31 };
        org.jfree.data.category.CategoryDataset categoryDataset33 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray32);
        org.jfree.data.category.CategoryDataset categoryDataset34 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray32);
        org.jfree.data.category.CategoryDataset categoryDataset35 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray32);
        org.jfree.data.category.CategoryDataset categoryDataset36 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray32);
        org.jfree.data.category.CategoryDataset categoryDataset37 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray32);
        org.jfree.data.category.CategoryDataset categoryDataset38 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset33 and categoryDataset37", categoryDataset33.equals(categoryDataset37) ? categoryDataset33.hashCode() == categoryDataset37.hashCode() : true);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
        double[] doubleArray10 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray17 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray18 = new double[][] { doubleArray10, doubleArray17 };
        org.jfree.data.category.CategoryDataset categoryDataset19 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray18);
        org.jfree.data.category.CategoryDataset categoryDataset20 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray18);
        java.lang.Number number21 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(categoryDataset20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset19 and categoryDataset20", categoryDataset19.equals(categoryDataset20) ? categoryDataset19.hashCode() == categoryDataset20.hashCode() : true);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test204");
        double[] doubleArray9 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray16 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray17 = new double[][] { doubleArray9, doubleArray16 };
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray17);
        org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset18, false);
        org.jfree.data.pie.PieDataset pieDataset22 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset18, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset25 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset22, (java.lang.Comparable) 100L, (double) 1);
        double double26 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset22);
        org.jfree.data.category.CategoryDataset categoryDataset27 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 100.0f, (org.jfree.data.KeyedValues) pieDataset22);
        org.jfree.data.pie.PieDataset pieDataset30 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset22, (java.lang.Comparable) 10, (double) (-1));
        org.jfree.data.pie.PieDataset pieDataset33 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset30, (java.lang.Comparable) "", (double) (short) 10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset22 and pieDataset30", pieDataset22.equals(pieDataset30) ? pieDataset22.hashCode() == pieDataset30.hashCode() : true);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test205");
        java.lang.Number[] numberArray16 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray21 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray26 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray31 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray32 = new java.lang.Number[][] { numberArray16, numberArray21, numberArray26, numberArray31 };
        org.jfree.data.category.CategoryDataset categoryDataset33 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray32);
        org.jfree.data.category.CategoryDataset categoryDataset34 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray32);
        org.jfree.data.category.CategoryDataset categoryDataset35 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray32);
        org.jfree.data.category.CategoryDataset categoryDataset36 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray32);
        org.jfree.data.category.CategoryDataset categoryDataset37 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray32);
        org.jfree.data.category.CategoryDataset categoryDataset38 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset35 and categoryDataset37", categoryDataset35.equals(categoryDataset37) ? categoryDataset35.hashCode() == categoryDataset37.hashCode() : true);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test206");
        java.lang.Number[] numberArray10 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray15 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray20 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray25 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray26 = new java.lang.Number[][] { numberArray10, numberArray15, numberArray20, numberArray25 };
        org.jfree.data.category.CategoryDataset categoryDataset27 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray26);
        org.jfree.data.category.CategoryDataset categoryDataset28 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray26);
        org.jfree.data.category.CategoryDataset categoryDataset29 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray26);
        org.jfree.data.Range range31 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset29, false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset28 and categoryDataset29", categoryDataset28.equals(categoryDataset29) ? categoryDataset28.hashCode() == categoryDataset29.hashCode() : true);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test207");
        java.lang.Number[] numberArray10 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray15 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray20 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray25 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray26 = new java.lang.Number[][] { numberArray10, numberArray15, numberArray20, numberArray25 };
        org.jfree.data.category.CategoryDataset categoryDataset27 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray26);
        org.jfree.data.category.CategoryDataset categoryDataset28 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray26);
        org.jfree.data.category.CategoryDataset categoryDataset29 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset27 and categoryDataset28", categoryDataset27.equals(categoryDataset28) ? categoryDataset27.hashCode() == categoryDataset28.hashCode() : true);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test208");
        double[] doubleArray12 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray19 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray20 = new double[][] { doubleArray12, doubleArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray20);
        org.jfree.data.category.CategoryDataset categoryDataset22 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray20);
        org.jfree.data.category.CategoryDataset categoryDataset23 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset21 and categoryDataset22", categoryDataset21.equals(categoryDataset22) ? categoryDataset21.hashCode() == categoryDataset22.hashCode() : true);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test209");
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
        org.jfree.data.pie.PieDataset pieDataset35 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset32, (java.lang.Comparable) "hi!", (double) (-1.0f));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset21 and pieDataset32", pieDataset21.equals(pieDataset32) ? pieDataset21.hashCode() == pieDataset32.hashCode() : true);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test210");
        java.lang.Number[] numberArray16 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray21 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray26 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray31 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray32 = new java.lang.Number[][] { numberArray16, numberArray21, numberArray26, numberArray31 };
        org.jfree.data.category.CategoryDataset categoryDataset33 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray32);
        org.jfree.data.category.CategoryDataset categoryDataset34 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray32);
        org.jfree.data.category.CategoryDataset categoryDataset35 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray32);
        org.jfree.data.category.CategoryDataset categoryDataset36 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray32);
        org.jfree.data.category.CategoryDataset categoryDataset37 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray32);
        org.jfree.data.category.CategoryDataset categoryDataset38 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset35 and categoryDataset37", categoryDataset35.equals(categoryDataset37) ? categoryDataset35.hashCode() == categoryDataset37.hashCode() : true);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test211");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, false);
        org.jfree.data.pie.PieDataset pieDataset21 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset17, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset24 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset21, (java.lang.Comparable) 100L, (double) 1);
        org.jfree.data.pie.PieDataset pieDataset28 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset21, (java.lang.Comparable) true, 200.0d, (int) (short) 10);
        org.jfree.data.pie.PieDataset pieDataset31 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset21, (java.lang.Comparable) 0.0d, (double) (byte) 1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset21 and pieDataset28", pieDataset21.equals(pieDataset28) ? pieDataset21.hashCode() == pieDataset28.hashCode() : true);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test212");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, false);
        org.jfree.data.pie.PieDataset pieDataset21 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset17, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset24 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset21, (java.lang.Comparable) 10L, (double) (-1L));
        org.jfree.data.pie.PieDataset pieDataset28 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset21, (java.lang.Comparable) (short) 100, (double) 10.0f, 0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset21 and pieDataset24", pieDataset21.equals(pieDataset24) ? pieDataset21.hashCode() == pieDataset24.hashCode() : true);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test213");
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
        org.jfree.data.category.CategoryDataset categoryDataset37 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) ' ', (org.jfree.data.KeyedValues) pieDataset24);
        double double38 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset35 and categoryDataset37", categoryDataset35.equals(categoryDataset37) ? categoryDataset35.hashCode() == categoryDataset37.hashCode() : true);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test214");
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
        org.jfree.data.category.CategoryDataset categoryDataset37 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) ' ', (org.jfree.data.KeyedValues) pieDataset24);
        java.lang.Number number38 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(categoryDataset37);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset35 and categoryDataset37", categoryDataset35.equals(categoryDataset37) ? categoryDataset35.hashCode() == categoryDataset37.hashCode() : true);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test215");
        double[] doubleArray14 = new double[] { (short) 0, (byte) 0 };
        double[][] doubleArray15 = new double[][] { doubleArray14 };
        org.jfree.data.category.CategoryDataset categoryDataset16 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray15);
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray15);
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray15);
        org.jfree.data.category.CategoryDataset categoryDataset19 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray15);
        org.jfree.data.category.CategoryDataset categoryDataset20 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray15);
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset18 and categoryDataset20", categoryDataset18.equals(categoryDataset20) ? categoryDataset18.hashCode() == categoryDataset20.hashCode() : true);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test216");
        java.lang.Number[] numberArray10 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray15 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray20 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray25 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray26 = new java.lang.Number[][] { numberArray10, numberArray15, numberArray20, numberArray25 };
        org.jfree.data.category.CategoryDataset categoryDataset27 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray26);
        org.jfree.data.category.CategoryDataset categoryDataset28 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray26);
        org.jfree.data.category.CategoryDataset categoryDataset29 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray26);
        org.jfree.data.Range range30 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset28 and categoryDataset29", categoryDataset28.equals(categoryDataset29) ? categoryDataset28.hashCode() == categoryDataset29.hashCode() : true);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test217");
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
        org.jfree.data.pie.PieDataset pieDataset35 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset22, (java.lang.Comparable) (short) 100, (double) 100L);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset22 and pieDataset32", pieDataset22.equals(pieDataset32) ? pieDataset22.hashCode() == pieDataset32.hashCode() : true);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test218");
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
        org.jfree.data.pie.PieDataset pieDataset34 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset23, (java.lang.Comparable) 0.0f, (double) (byte) 1);
        org.jfree.data.pie.PieDataset pieDataset38 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset34, (java.lang.Comparable) 100, 130.0d, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset42 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset38, (java.lang.Comparable) 1L, (double) 0L, (int) ' ');
        org.jfree.data.category.CategoryDataset categoryDataset43 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) (-1.0f), (org.jfree.data.KeyedValues) pieDataset38);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset38 and pieDataset42", pieDataset38.equals(pieDataset42) ? pieDataset38.hashCode() == pieDataset42.hashCode() : true);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test219");
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
        org.jfree.data.pie.PieDataset pieDataset36 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset33, (java.lang.Comparable) 200.0d, (double) 'a');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset22 and pieDataset33", pieDataset22.equals(pieDataset33) ? pieDataset22.hashCode() == pieDataset33.hashCode() : true);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test220");
        double[] doubleArray14 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray21 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray22 = new double[][] { doubleArray14, doubleArray21 };
        org.jfree.data.category.CategoryDataset categoryDataset23 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray22);
        org.jfree.data.category.CategoryDataset categoryDataset24 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray22);
        org.jfree.data.category.CategoryDataset categoryDataset25 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray22);
        org.jfree.data.category.CategoryDataset categoryDataset26 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray22);
        java.lang.Number number27 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset24 and categoryDataset26", categoryDataset24.equals(categoryDataset26) ? categoryDataset24.hashCode() == categoryDataset26.hashCode() : true);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test221");
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
        double double30 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset23);
        boolean boolean31 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset23);
        org.jfree.data.pie.PieDataset pieDataset34 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset23, (java.lang.Comparable) (byte) 100, (-1.0d));
        org.jfree.data.category.CategoryDataset categoryDataset35 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) (-1), (org.jfree.data.KeyedValues) pieDataset34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset23 and pieDataset34", pieDataset23.equals(pieDataset34) ? pieDataset23.hashCode() == pieDataset34.hashCode() : true);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test222");
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
        org.jfree.data.pie.PieDataset pieDataset44 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset37, (java.lang.Comparable) 0L, (double) 0L);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset37 and pieDataset41", pieDataset37.equals(pieDataset41) ? pieDataset37.hashCode() == pieDataset41.hashCode() : true);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test223");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, false);
        org.jfree.data.pie.PieDataset pieDataset21 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset17, (int) (short) 0);
        java.lang.Number number22 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(categoryDataset17);
        org.jfree.data.Range range23 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset17);
        org.jfree.data.Range range25 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, false);
        org.jfree.data.Range range27 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset17, true);
        org.jfree.data.Range range29 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset17, (double) 1);
        org.jfree.data.pie.PieDataset pieDataset31 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset17, (int) (byte) 1);
        org.jfree.data.Range range32 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset21 and pieDataset31", pieDataset21.equals(pieDataset31) ? pieDataset21.hashCode() == pieDataset31.hashCode() : true);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test224");
        double[] doubleArray16 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray23 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray24 = new double[][] { doubleArray16, doubleArray23 };
        org.jfree.data.category.CategoryDataset categoryDataset25 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray24);
        org.jfree.data.category.CategoryDataset categoryDataset26 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray24);
        org.jfree.data.category.CategoryDataset categoryDataset27 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray24);
        org.jfree.data.category.CategoryDataset categoryDataset28 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray24);
        org.jfree.data.category.CategoryDataset categoryDataset29 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset26 and categoryDataset28", categoryDataset26.equals(categoryDataset28) ? categoryDataset26.hashCode() == categoryDataset28.hashCode() : true);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test225");
        double[] doubleArray6 = new double[] { (short) 0, (byte) 0 };
        double[][] doubleArray7 = new double[][] { doubleArray6 };
        org.jfree.data.category.CategoryDataset categoryDataset8 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray7);
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray7);
        java.lang.Number number10 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset9);
        org.jfree.data.pie.PieDataset pieDataset12 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset15 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset12, (java.lang.Comparable) (short) 100, (double) (short) 10);
        double double16 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset12 and pieDataset15", pieDataset12.equals(pieDataset15) ? pieDataset12.hashCode() == pieDataset15.hashCode() : true);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test226");
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
        org.jfree.data.pie.PieDataset pieDataset35 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset23, (java.lang.Comparable) '#', (double) 10);
        org.jfree.data.pie.PieDataset pieDataset39 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset35, (java.lang.Comparable) (-1L), 0.0d, (int) (byte) 1);
        org.jfree.data.category.CategoryDataset categoryDataset40 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 100.0f, (org.jfree.data.KeyedValues) pieDataset35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset35 and pieDataset39", pieDataset35.equals(pieDataset39) ? pieDataset35.hashCode() == pieDataset39.hashCode() : true);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test227");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, false);
        org.jfree.data.pie.PieDataset pieDataset21 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset17, (int) (short) 0);
        double double22 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset21);
        org.jfree.data.pie.PieDataset pieDataset26 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset21, (java.lang.Comparable) (-1L), (double) (short) 0, (int) (short) 10);
        org.jfree.data.pie.PieDataset pieDataset29 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset21, (java.lang.Comparable) (byte) 100, (double) 0.0f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset21 and pieDataset26", pieDataset21.equals(pieDataset26) ? pieDataset21.hashCode() == pieDataset26.hashCode() : true);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test228");
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
        org.jfree.data.pie.PieDataset pieDataset40 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset37, (java.lang.Comparable) 10L, 0.0d);
        java.lang.Class<?> wildcardClass41 = pieDataset40.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset37 and pieDataset40", pieDataset37.equals(pieDataset40) ? pieDataset37.hashCode() == pieDataset40.hashCode() : true);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test229");
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
        java.lang.Number number31 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(categoryDataset28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset22 and pieDataset30", pieDataset22.equals(pieDataset30) ? pieDataset22.hashCode() == pieDataset30.hashCode() : true);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test230");
        java.lang.Number[] numberArray16 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray21 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray26 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray31 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray32 = new java.lang.Number[][] { numberArray16, numberArray21, numberArray26, numberArray31 };
        org.jfree.data.category.CategoryDataset categoryDataset33 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray32);
        org.jfree.data.category.CategoryDataset categoryDataset34 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray32);
        org.jfree.data.category.CategoryDataset categoryDataset35 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray32);
        org.jfree.data.category.CategoryDataset categoryDataset36 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray32);
        org.jfree.data.category.CategoryDataset categoryDataset37 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray32);
        org.jfree.data.category.CategoryDataset categoryDataset38 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset34 and categoryDataset37", categoryDataset34.equals(categoryDataset37) ? categoryDataset34.hashCode() == categoryDataset37.hashCode() : true);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test231");
        double[] doubleArray10 = new double[] { (short) 0, (byte) 0 };
        double[][] doubleArray11 = new double[][] { doubleArray10 };
        org.jfree.data.category.CategoryDataset categoryDataset12 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray11);
        org.jfree.data.category.CategoryDataset categoryDataset13 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray11);
        org.jfree.data.category.CategoryDataset categoryDataset14 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray11);
        org.jfree.data.category.CategoryDataset categoryDataset15 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray11);
        org.jfree.data.Range range17 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset15, true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset12 and categoryDataset15", categoryDataset12.equals(categoryDataset15) ? categoryDataset12.hashCode() == categoryDataset15.hashCode() : true);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test232");
        double[] doubleArray10 = new double[] { (short) 0, (byte) 0 };
        double[][] doubleArray11 = new double[][] { doubleArray10 };
        org.jfree.data.category.CategoryDataset categoryDataset12 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray11);
        org.jfree.data.category.CategoryDataset categoryDataset13 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray11);
        org.jfree.data.category.CategoryDataset categoryDataset14 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray11);
        org.jfree.data.category.CategoryDataset categoryDataset15 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset12 and categoryDataset14", categoryDataset12.equals(categoryDataset14) ? categoryDataset12.hashCode() == categoryDataset14.hashCode() : true);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test233");
        double[] doubleArray16 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray23 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray24 = new double[][] { doubleArray16, doubleArray23 };
        org.jfree.data.category.CategoryDataset categoryDataset25 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray24);
        org.jfree.data.category.CategoryDataset categoryDataset26 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray24);
        org.jfree.data.category.CategoryDataset categoryDataset27 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray24);
        org.jfree.data.category.CategoryDataset categoryDataset28 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray24);
        org.jfree.data.category.CategoryDataset categoryDataset29 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset25 and categoryDataset28", categoryDataset25.equals(categoryDataset28) ? categoryDataset25.hashCode() == categoryDataset28.hashCode() : true);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test234");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, false);
        org.jfree.data.pie.PieDataset pieDataset21 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset17, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset24 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset21, (java.lang.Comparable) ' ', (double) '#');
        org.jfree.data.pie.PieDataset pieDataset28 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset24, (java.lang.Comparable) false, (double) 10L, (int) (short) 100);
        java.lang.Comparable comparable29 = null;
        org.jfree.data.pie.PieDataset pieDataset31 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset24, comparable29, (double) 'a');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset24 and pieDataset28", pieDataset24.equals(pieDataset28) ? pieDataset24.hashCode() == pieDataset28.hashCode() : true);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test235");
        java.lang.Number[] numberArray10 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray15 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray20 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray25 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray26 = new java.lang.Number[][] { numberArray10, numberArray15, numberArray20, numberArray25 };
        org.jfree.data.category.CategoryDataset categoryDataset27 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray26);
        org.jfree.data.category.CategoryDataset categoryDataset28 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray26);
        org.jfree.data.category.CategoryDataset categoryDataset29 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray26);
        java.lang.Number number30 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(categoryDataset29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset28 and categoryDataset29", categoryDataset28.equals(categoryDataset29) ? categoryDataset28.hashCode() == categoryDataset29.hashCode() : true);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test236");
        double[] doubleArray16 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray23 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray24 = new double[][] { doubleArray16, doubleArray23 };
        org.jfree.data.category.CategoryDataset categoryDataset25 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray24);
        org.jfree.data.category.CategoryDataset categoryDataset26 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray24);
        org.jfree.data.category.CategoryDataset categoryDataset27 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray24);
        org.jfree.data.category.CategoryDataset categoryDataset28 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray24);
        org.jfree.data.category.CategoryDataset categoryDataset29 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset25 and categoryDataset28", categoryDataset25.equals(categoryDataset28) ? categoryDataset25.hashCode() == categoryDataset28.hashCode() : true);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test237");
        double[] doubleArray10 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray17 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray18 = new double[][] { doubleArray10, doubleArray17 };
        org.jfree.data.category.CategoryDataset categoryDataset19 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray18);
        org.jfree.data.Range range21 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset19, false);
        org.jfree.data.pie.PieDataset pieDataset23 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset19, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset26 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset23, (java.lang.Comparable) 100L, (double) 1);
        org.jfree.data.pie.PieDataset pieDataset29 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset23, (java.lang.Comparable) (short) 1, 130.0d);
        org.jfree.data.category.CategoryDataset categoryDataset30 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) (-1L), (org.jfree.data.KeyedValues) pieDataset23);
        org.jfree.data.pie.PieDataset pieDataset33 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset23, (java.lang.Comparable) (byte) 1, (double) (short) -1);
        org.jfree.data.category.CategoryDataset categoryDataset34 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) (short) 0, (org.jfree.data.KeyedValues) pieDataset33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset23 and pieDataset33", pieDataset23.equals(pieDataset33) ? pieDataset23.hashCode() == pieDataset33.hashCode() : true);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test238");
        java.lang.Number[] numberArray16 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray21 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray26 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray31 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray32 = new java.lang.Number[][] { numberArray16, numberArray21, numberArray26, numberArray31 };
        org.jfree.data.category.CategoryDataset categoryDataset33 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray32);
        org.jfree.data.category.CategoryDataset categoryDataset34 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray32);
        org.jfree.data.category.CategoryDataset categoryDataset35 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray32);
        org.jfree.data.category.CategoryDataset categoryDataset36 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray32);
        org.jfree.data.category.CategoryDataset categoryDataset37 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray32);
        org.jfree.data.category.CategoryDataset categoryDataset38 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset35 and categoryDataset37", categoryDataset35.equals(categoryDataset37) ? categoryDataset35.hashCode() == categoryDataset37.hashCode() : true);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test239");
        double[] doubleArray9 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray16 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray17 = new double[][] { doubleArray9, doubleArray16 };
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray17);
        org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset18, false);
        java.lang.Number number21 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(categoryDataset18);
        org.jfree.data.pie.PieDataset pieDataset23 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset18, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset27 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset23, (java.lang.Comparable) (byte) 100, (double) (-1), 10);
        org.jfree.data.category.CategoryDataset categoryDataset28 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 0.0d, (org.jfree.data.KeyedValues) pieDataset23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset23 and pieDataset27", pieDataset23.equals(pieDataset27) ? pieDataset23.hashCode() == pieDataset27.hashCode() : true);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test240");
        java.lang.Number[] numberArray14 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray24 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray29 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray30 = new java.lang.Number[][] { numberArray14, numberArray19, numberArray24, numberArray29 };
        org.jfree.data.category.CategoryDataset categoryDataset31 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray30);
        org.jfree.data.category.CategoryDataset categoryDataset32 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray30);
        org.jfree.data.category.CategoryDataset categoryDataset33 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray30);
        org.jfree.data.category.CategoryDataset categoryDataset34 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray30);
        org.jfree.data.category.CategoryDataset categoryDataset35 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset31 and categoryDataset34", categoryDataset31.equals(categoryDataset34) ? categoryDataset31.hashCode() == categoryDataset34.hashCode() : true);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test241");
        java.lang.Number[] numberArray16 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray21 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray26 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray31 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray32 = new java.lang.Number[][] { numberArray16, numberArray21, numberArray26, numberArray31 };
        org.jfree.data.category.CategoryDataset categoryDataset33 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray32);
        org.jfree.data.category.CategoryDataset categoryDataset34 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray32);
        org.jfree.data.category.CategoryDataset categoryDataset35 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray32);
        org.jfree.data.category.CategoryDataset categoryDataset36 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray32);
        org.jfree.data.category.CategoryDataset categoryDataset37 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray32);
        org.jfree.data.category.CategoryDataset categoryDataset38 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset36 and categoryDataset37", categoryDataset36.equals(categoryDataset37) ? categoryDataset36.hashCode() == categoryDataset37.hashCode() : true);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test242");
        double[] doubleArray14 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray21 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray22 = new double[][] { doubleArray14, doubleArray21 };
        org.jfree.data.category.CategoryDataset categoryDataset23 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray22);
        org.jfree.data.category.CategoryDataset categoryDataset24 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray22);
        org.jfree.data.category.CategoryDataset categoryDataset25 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray22);
        org.jfree.data.category.CategoryDataset categoryDataset26 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset24 and categoryDataset25", categoryDataset24.equals(categoryDataset25) ? categoryDataset24.hashCode() == categoryDataset25.hashCode() : true);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test243");
        java.lang.Number[] numberArray16 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray21 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray26 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray31 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray32 = new java.lang.Number[][] { numberArray16, numberArray21, numberArray26, numberArray31 };
        org.jfree.data.category.CategoryDataset categoryDataset33 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray32);
        org.jfree.data.category.CategoryDataset categoryDataset34 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray32);
        org.jfree.data.category.CategoryDataset categoryDataset35 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray32);
        org.jfree.data.category.CategoryDataset categoryDataset36 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray32);
        org.jfree.data.category.CategoryDataset categoryDataset37 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray32);
        org.jfree.data.category.CategoryDataset categoryDataset38 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset35 and categoryDataset37", categoryDataset35.equals(categoryDataset37) ? categoryDataset35.hashCode() == categoryDataset37.hashCode() : true);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test244");
        java.lang.Number[] numberArray10 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray15 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray20 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray25 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray26 = new java.lang.Number[][] { numberArray10, numberArray15, numberArray20, numberArray25 };
        org.jfree.data.category.CategoryDataset categoryDataset27 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray26);
        org.jfree.data.category.CategoryDataset categoryDataset28 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray26);
        org.jfree.data.category.CategoryDataset categoryDataset29 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray26);
        java.lang.Number number30 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(categoryDataset29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset28 and categoryDataset29", categoryDataset28.equals(categoryDataset29) ? categoryDataset28.hashCode() == categoryDataset29.hashCode() : true);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test245");
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
        org.jfree.data.pie.PieDataset pieDataset41 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset37, (java.lang.Comparable) 1L, (double) 0L, (int) ' ');
        double double42 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset41);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset37 and pieDataset41", pieDataset37.equals(pieDataset41) ? pieDataset37.hashCode() == pieDataset41.hashCode() : true);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test246");
        java.lang.Number[] numberArray16 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray21 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray26 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray31 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray32 = new java.lang.Number[][] { numberArray16, numberArray21, numberArray26, numberArray31 };
        org.jfree.data.category.CategoryDataset categoryDataset33 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray32);
        org.jfree.data.category.CategoryDataset categoryDataset34 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray32);
        org.jfree.data.category.CategoryDataset categoryDataset35 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray32);
        org.jfree.data.category.CategoryDataset categoryDataset36 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray32);
        org.jfree.data.category.CategoryDataset categoryDataset37 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray32);
        org.jfree.data.category.CategoryDataset categoryDataset38 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset34 and categoryDataset37", categoryDataset34.equals(categoryDataset37) ? categoryDataset34.hashCode() == categoryDataset37.hashCode() : true);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test247");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, false);
        org.jfree.data.pie.PieDataset pieDataset21 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset17, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset24 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset21, (java.lang.Comparable) 100L, (double) 1);
        double double25 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset21);
        boolean boolean26 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset21);
        org.jfree.data.pie.PieDataset pieDataset29 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset21, (java.lang.Comparable) (byte) 100, (double) '4');
        org.jfree.data.pie.PieDataset pieDataset33 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset29, (java.lang.Comparable) (short) 100, (double) (short) 1, (int) (short) 1);
        org.jfree.data.pie.PieDataset pieDataset36 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset33, (java.lang.Comparable) (byte) 0, (double) 10L);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset29 and pieDataset33", pieDataset29.equals(pieDataset33) ? pieDataset29.hashCode() == pieDataset33.hashCode() : true);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test248");
        double[] doubleArray9 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray16 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray17 = new double[][] { doubleArray9, doubleArray16 };
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray17);
        org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset18, false);
        org.jfree.data.pie.PieDataset pieDataset22 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset18, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset25 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset22, (java.lang.Comparable) 100L, (double) 1);
        org.jfree.data.category.CategoryDataset categoryDataset26 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 10.0f, (org.jfree.data.KeyedValues) pieDataset25);
        org.jfree.data.pie.PieDataset pieDataset29 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset25, (java.lang.Comparable) 100L, 400.0d);
        double double30 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset25 and pieDataset29", pieDataset25.equals(pieDataset29) ? pieDataset25.hashCode() == pieDataset29.hashCode() : true);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test249");
        double[] doubleArray2 = new double[] {};
        double[][] doubleArray3 = new double[][] { doubleArray2 };
        org.jfree.data.category.CategoryDataset categoryDataset4 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray3);
        org.jfree.data.pie.PieDataset pieDataset6 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset4, (java.lang.Comparable) (-1.0f));
        org.jfree.data.pie.PieDataset pieDataset9 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset6, (java.lang.Comparable) 100, 0.0d);
        org.jfree.data.pie.PieDataset pieDataset12 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset9, (java.lang.Comparable) (byte) -1, (double) 1);
        org.jfree.data.pie.PieDataset pieDataset15 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset12, (java.lang.Comparable) 10, (double) ' ');
        org.jfree.data.pie.PieDataset pieDataset19 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset12, (java.lang.Comparable) (short) 0, (double) 'a', (int) (byte) 0);
        org.jfree.data.pie.PieDataset pieDataset22 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset12, (java.lang.Comparable) (byte) 100, 10.0d);
        org.jfree.data.pie.PieDataset pieDataset26 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset22, (java.lang.Comparable) (short) 1, 112.0d, (int) (byte) -1);
        org.jfree.data.pie.PieDataset pieDataset29 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset26, (java.lang.Comparable) (byte) 1, 0.0d);
        boolean boolean30 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset26 and pieDataset29", pieDataset26.equals(pieDataset29) ? pieDataset26.hashCode() == pieDataset29.hashCode() : true);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test250");
        double[] doubleArray15 = new double[] { 130.0d, (-1.0f), 1L, 100.0f, 1L };
        double[] doubleArray21 = new double[] { 130.0d, (-1.0f), 1L, 100.0f, 1L };
        double[] doubleArray27 = new double[] { 130.0d, (-1.0f), 1L, 100.0f, 1L };
        double[] doubleArray33 = new double[] { 130.0d, (-1.0f), 1L, 100.0f, 1L };
        double[] doubleArray39 = new double[] { 130.0d, (-1.0f), 1L, 100.0f, 1L };
        double[] doubleArray45 = new double[] { 130.0d, (-1.0f), 1L, 100.0f, 1L };
        double[][] doubleArray46 = new double[][] { doubleArray15, doubleArray21, doubleArray27, doubleArray33, doubleArray39, doubleArray45 };
        org.jfree.data.category.CategoryDataset categoryDataset47 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray46);
        org.jfree.data.category.CategoryDataset categoryDataset48 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray46);
        org.jfree.data.category.CategoryDataset categoryDataset49 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray46);
        org.jfree.data.category.CategoryDataset categoryDataset50 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray46);
        org.jfree.data.category.CategoryDataset categoryDataset51 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray46);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset49 and categoryDataset50", categoryDataset49.equals(categoryDataset50) ? categoryDataset49.hashCode() == categoryDataset50.hashCode() : true);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test251");
        double[] doubleArray12 = new double[] { (short) 0, (byte) 0 };
        double[][] doubleArray13 = new double[][] { doubleArray12 };
        org.jfree.data.category.CategoryDataset categoryDataset14 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray13);
        org.jfree.data.category.CategoryDataset categoryDataset15 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray13);
        org.jfree.data.category.CategoryDataset categoryDataset16 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray13);
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray13);
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray13);
        org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset18, true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset16 and categoryDataset18", categoryDataset16.equals(categoryDataset18) ? categoryDataset16.hashCode() == categoryDataset18.hashCode() : true);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test252");
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
        org.jfree.data.pie.PieDataset pieDataset37 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset35, (int) (short) 1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset34 and categoryDataset35", categoryDataset34.equals(categoryDataset35) ? categoryDataset34.hashCode() == categoryDataset35.hashCode() : true);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test253");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, false);
        java.lang.Number number20 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(categoryDataset17);
        org.jfree.data.pie.PieDataset pieDataset22 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset17, (int) (short) 0);
        boolean boolean23 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset22);
        org.jfree.data.pie.PieDataset pieDataset27 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset22, (java.lang.Comparable) ' ', (double) 0, (int) (short) 100);
        double double28 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset22 and pieDataset27", pieDataset22.equals(pieDataset27) ? pieDataset22.hashCode() == pieDataset27.hashCode() : true);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test254");
        double[] doubleArray12 = new double[] { (short) 0, (byte) 0 };
        double[][] doubleArray13 = new double[][] { doubleArray12 };
        org.jfree.data.category.CategoryDataset categoryDataset14 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray13);
        org.jfree.data.category.CategoryDataset categoryDataset15 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray13);
        org.jfree.data.category.CategoryDataset categoryDataset16 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray13);
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray13);
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray13);
        java.lang.Number number19 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset15 and categoryDataset18", categoryDataset15.equals(categoryDataset18) ? categoryDataset15.hashCode() == categoryDataset18.hashCode() : true);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test255");
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
        org.jfree.data.pie.PieDataset pieDataset41 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset24, (java.lang.Comparable) (short) 10, (double) (short) 10, (int) (byte) -1);
        double double42 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset41);
        org.jfree.data.pie.PieDataset pieDataset45 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset41, (java.lang.Comparable) ' ', (double) 100L);
        org.jfree.data.category.CategoryDataset categoryDataset46 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 0, (org.jfree.data.KeyedValues) pieDataset41);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset41 and pieDataset45", pieDataset41.equals(pieDataset45) ? pieDataset41.hashCode() == pieDataset45.hashCode() : true);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test256");
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
        boolean boolean36 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset35);
        boolean boolean37 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset35);
        org.jfree.data.pie.PieDataset pieDataset41 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset35, (java.lang.Comparable) 0, (double) 1, (int) '4');
        double double42 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset41);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset35 and pieDataset41", pieDataset35.equals(pieDataset41) ? pieDataset35.hashCode() == pieDataset41.hashCode() : true);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test257");
        double[] doubleArray9 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray16 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray17 = new double[][] { doubleArray9, doubleArray16 };
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray17);
        org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset18, false);
        org.jfree.data.pie.PieDataset pieDataset22 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset18, (int) (short) 0);
        org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset18, false);
        org.jfree.data.pie.PieDataset pieDataset26 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset18, 0);
        org.jfree.data.pie.PieDataset pieDataset30 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset26, (java.lang.Comparable) (byte) -1, 10.0d, 10);
        org.jfree.data.category.CategoryDataset categoryDataset31 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) (byte) 1, (org.jfree.data.KeyedValues) pieDataset26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset26 and pieDataset30", pieDataset26.equals(pieDataset30) ? pieDataset26.hashCode() == pieDataset30.hashCode() : true);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test258");
        double[] doubleArray10 = new double[] { (short) 0, (byte) 0 };
        double[][] doubleArray11 = new double[][] { doubleArray10 };
        org.jfree.data.category.CategoryDataset categoryDataset12 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray11);
        org.jfree.data.category.CategoryDataset categoryDataset13 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray11);
        org.jfree.data.category.CategoryDataset categoryDataset14 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray11);
        org.jfree.data.category.CategoryDataset categoryDataset15 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset13 and categoryDataset14", categoryDataset13.equals(categoryDataset14) ? categoryDataset13.hashCode() == categoryDataset14.hashCode() : true);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test259");
        double[] doubleArray10 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray17 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray18 = new double[][] { doubleArray10, doubleArray17 };
        org.jfree.data.category.CategoryDataset categoryDataset19 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray18);
        org.jfree.data.Range range21 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset19, false);
        org.jfree.data.pie.PieDataset pieDataset23 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset19, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset26 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset23, (java.lang.Comparable) 100L, (double) 1);
        org.jfree.data.category.CategoryDataset categoryDataset27 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 10.0f, (org.jfree.data.KeyedValues) pieDataset26);
        org.jfree.data.pie.PieDataset pieDataset30 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset26, (java.lang.Comparable) 100L, 400.0d);
        org.jfree.data.category.CategoryDataset categoryDataset31 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) ' ', (org.jfree.data.KeyedValues) pieDataset30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset26 and pieDataset30", pieDataset26.equals(pieDataset30) ? pieDataset26.hashCode() == pieDataset30.hashCode() : true);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test260");
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
        org.jfree.data.pie.PieDataset pieDataset36 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset32, (java.lang.Comparable) (-1.0f), (double) (short) -1, (int) (short) 100);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset22 and pieDataset32", pieDataset22.equals(pieDataset32) ? pieDataset22.hashCode() == pieDataset32.hashCode() : true);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test261");
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
        double double30 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset23);
        boolean boolean31 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset23);
        org.jfree.data.pie.PieDataset pieDataset34 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset23, (java.lang.Comparable) (byte) 100, (-1.0d));
        org.jfree.data.category.CategoryDataset categoryDataset35 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) (-1L), (org.jfree.data.KeyedValues) pieDataset34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset23 and pieDataset34", pieDataset23.equals(pieDataset34) ? pieDataset23.hashCode() == pieDataset34.hashCode() : true);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test262");
        java.lang.Number[] numberArray16 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray21 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray26 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray31 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray32 = new java.lang.Number[][] { numberArray16, numberArray21, numberArray26, numberArray31 };
        org.jfree.data.category.CategoryDataset categoryDataset33 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray32);
        org.jfree.data.category.CategoryDataset categoryDataset34 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray32);
        org.jfree.data.category.CategoryDataset categoryDataset35 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray32);
        org.jfree.data.category.CategoryDataset categoryDataset36 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray32);
        org.jfree.data.category.CategoryDataset categoryDataset37 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray32);
        org.jfree.data.category.CategoryDataset categoryDataset38 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset33 and categoryDataset37", categoryDataset33.equals(categoryDataset37) ? categoryDataset33.hashCode() == categoryDataset37.hashCode() : true);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test263");
        java.lang.Number[] numberArray12 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray17 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray22 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray27 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray28 = new java.lang.Number[][] { numberArray12, numberArray17, numberArray22, numberArray27 };
        org.jfree.data.category.CategoryDataset categoryDataset29 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray28);
        org.jfree.data.category.CategoryDataset categoryDataset30 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray28);
        org.jfree.data.category.CategoryDataset categoryDataset31 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray28);
        org.jfree.data.category.CategoryDataset categoryDataset32 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray28);
        java.lang.Class<?> wildcardClass33 = numberArray28.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset29 and categoryDataset32", categoryDataset29.equals(categoryDataset32) ? categoryDataset29.hashCode() == categoryDataset32.hashCode() : true);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test264");
        double[] doubleArray9 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray16 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray17 = new double[][] { doubleArray9, doubleArray16 };
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray17);
        org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset18, false);
        org.jfree.data.pie.PieDataset pieDataset22 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset18, (int) (short) 0);
        double double23 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset22);
        double double24 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset22);
        org.jfree.data.pie.PieDataset pieDataset27 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset22, (java.lang.Comparable) 0.0d, 10.0d);
        double double28 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset22);
        org.jfree.data.pie.PieDataset pieDataset32 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset22, (java.lang.Comparable) (-1.0d), (double) (short) 10, (int) (short) 10);
        org.jfree.data.category.CategoryDataset categoryDataset33 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 0L, (org.jfree.data.KeyedValues) pieDataset32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset22 and pieDataset32", pieDataset22.equals(pieDataset32) ? pieDataset22.hashCode() == pieDataset32.hashCode() : true);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test265");
        java.lang.Number[] numberArray14 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray24 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray29 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray30 = new java.lang.Number[][] { numberArray14, numberArray19, numberArray24, numberArray29 };
        org.jfree.data.category.CategoryDataset categoryDataset31 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray30);
        org.jfree.data.category.CategoryDataset categoryDataset32 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray30);
        org.jfree.data.category.CategoryDataset categoryDataset33 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray30);
        org.jfree.data.category.CategoryDataset categoryDataset34 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray30);
        org.jfree.data.category.CategoryDataset categoryDataset35 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset33 and categoryDataset34", categoryDataset33.equals(categoryDataset34) ? categoryDataset33.hashCode() == categoryDataset34.hashCode() : true);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test266");
        java.lang.Number[] numberArray9 = new java.lang.Number[] { (byte) 0, 1.0d, 112.0d };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (byte) 0, 1.0d, 112.0d };
        java.lang.Number[][] numberArray14 = new java.lang.Number[][] { numberArray9, numberArray13 };
        org.jfree.data.category.CategoryDataset categoryDataset15 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray14);
        org.jfree.data.category.CategoryDataset categoryDataset16 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray14);
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray14);
        java.lang.Number number18 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset16 and categoryDataset17", categoryDataset16.equals(categoryDataset17) ? categoryDataset16.hashCode() == categoryDataset17.hashCode() : true);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test267");
        double[] doubleArray12 = new double[] { (short) 0, (byte) 0 };
        double[][] doubleArray13 = new double[][] { doubleArray12 };
        org.jfree.data.category.CategoryDataset categoryDataset14 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray13);
        org.jfree.data.category.CategoryDataset categoryDataset15 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray13);
        org.jfree.data.category.CategoryDataset categoryDataset16 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray13);
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray13);
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset14 and categoryDataset17", categoryDataset14.equals(categoryDataset17) ? categoryDataset14.hashCode() == categoryDataset17.hashCode() : true);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test268");
        java.lang.Number[] numberArray14 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray24 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray29 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray30 = new java.lang.Number[][] { numberArray14, numberArray19, numberArray24, numberArray29 };
        org.jfree.data.category.CategoryDataset categoryDataset31 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray30);
        org.jfree.data.category.CategoryDataset categoryDataset32 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray30);
        org.jfree.data.category.CategoryDataset categoryDataset33 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray30);
        org.jfree.data.category.CategoryDataset categoryDataset34 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray30);
        org.jfree.data.category.CategoryDataset categoryDataset35 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray30);
        org.jfree.data.Range range37 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset35, (double) (short) 1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset33 and categoryDataset35", categoryDataset33.equals(categoryDataset35) ? categoryDataset33.hashCode() == categoryDataset35.hashCode() : true);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test269");
        double[] doubleArray2 = new double[] {};
        double[][] doubleArray3 = new double[][] { doubleArray2 };
        org.jfree.data.category.CategoryDataset categoryDataset4 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray3);
        org.jfree.data.pie.PieDataset pieDataset6 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset4, (java.lang.Comparable) (-1.0f));
        org.jfree.data.pie.PieDataset pieDataset9 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset6, (java.lang.Comparable) 100, 0.0d);
        org.jfree.data.pie.PieDataset pieDataset12 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset9, (java.lang.Comparable) (byte) -1, (double) 1);
        org.jfree.data.pie.PieDataset pieDataset15 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset12, (java.lang.Comparable) 10, (double) ' ');
        org.jfree.data.pie.PieDataset pieDataset19 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset12, (java.lang.Comparable) (short) 0, (double) 'a', (int) (byte) 0);
        org.jfree.data.pie.PieDataset pieDataset22 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset12, (java.lang.Comparable) (byte) 100, 10.0d);
        org.jfree.data.pie.PieDataset pieDataset26 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset22, (java.lang.Comparable) (short) 1, 112.0d, (int) (byte) -1);
        org.jfree.data.pie.PieDataset pieDataset29 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset26, (java.lang.Comparable) (byte) 1, 0.0d);
        org.jfree.data.pie.PieDataset pieDataset32 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset26, (java.lang.Comparable) (-1), (double) 1.0f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset26 and pieDataset29", pieDataset26.equals(pieDataset29) ? pieDataset26.hashCode() == pieDataset29.hashCode() : true);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test270");
        double[] doubleArray12 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray19 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray20 = new double[][] { doubleArray12, doubleArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray20);
        org.jfree.data.category.CategoryDataset categoryDataset22 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray20);
        org.jfree.data.category.CategoryDataset categoryDataset23 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset21 and categoryDataset22", categoryDataset21.equals(categoryDataset22) ? categoryDataset21.hashCode() == categoryDataset22.hashCode() : true);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test271");
        double[] doubleArray14 = new double[] { (short) 0, (byte) 0 };
        double[][] doubleArray15 = new double[][] { doubleArray14 };
        org.jfree.data.category.CategoryDataset categoryDataset16 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray15);
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray15);
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray15);
        org.jfree.data.category.CategoryDataset categoryDataset19 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray15);
        org.jfree.data.category.CategoryDataset categoryDataset20 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray15);
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset16 and categoryDataset20", categoryDataset16.equals(categoryDataset20) ? categoryDataset16.hashCode() == categoryDataset20.hashCode() : true);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test272");
        java.lang.Number[] numberArray16 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray21 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray26 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray31 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray32 = new java.lang.Number[][] { numberArray16, numberArray21, numberArray26, numberArray31 };
        org.jfree.data.category.CategoryDataset categoryDataset33 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray32);
        org.jfree.data.category.CategoryDataset categoryDataset34 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray32);
        org.jfree.data.category.CategoryDataset categoryDataset35 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray32);
        org.jfree.data.category.CategoryDataset categoryDataset36 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray32);
        org.jfree.data.category.CategoryDataset categoryDataset37 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray32);
        org.jfree.data.category.CategoryDataset categoryDataset38 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset33 and categoryDataset37", categoryDataset33.equals(categoryDataset37) ? categoryDataset33.hashCode() == categoryDataset37.hashCode() : true);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test273");
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
        org.jfree.data.pie.PieDataset pieDataset35 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset32, (java.lang.Comparable) true, (double) (short) 1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset21 and pieDataset32", pieDataset21.equals(pieDataset32) ? pieDataset21.hashCode() == pieDataset32.hashCode() : true);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test274");
        java.lang.Number[] numberArray14 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray24 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray29 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray30 = new java.lang.Number[][] { numberArray14, numberArray19, numberArray24, numberArray29 };
        org.jfree.data.category.CategoryDataset categoryDataset31 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray30);
        org.jfree.data.category.CategoryDataset categoryDataset32 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray30);
        org.jfree.data.category.CategoryDataset categoryDataset33 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray30);
        org.jfree.data.category.CategoryDataset categoryDataset34 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray30);
        org.jfree.data.category.CategoryDataset categoryDataset35 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset33 and categoryDataset34", categoryDataset33.equals(categoryDataset34) ? categoryDataset33.hashCode() == categoryDataset34.hashCode() : true);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test275");
        double[] doubleArray14 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray21 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray22 = new double[][] { doubleArray14, doubleArray21 };
        org.jfree.data.category.CategoryDataset categoryDataset23 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray22);
        org.jfree.data.category.CategoryDataset categoryDataset24 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray22);
        org.jfree.data.category.CategoryDataset categoryDataset25 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray22);
        org.jfree.data.category.CategoryDataset categoryDataset26 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset24 and categoryDataset25", categoryDataset24.equals(categoryDataset25) ? categoryDataset24.hashCode() == categoryDataset25.hashCode() : true);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test276");
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
        boolean boolean36 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset35);
        boolean boolean37 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset35);
        org.jfree.data.pie.PieDataset pieDataset41 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset35, (java.lang.Comparable) 0, (double) 1, (int) '4');
        double double42 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset35 and pieDataset41", pieDataset35.equals(pieDataset41) ? pieDataset35.hashCode() == pieDataset41.hashCode() : true);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test277");
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
        org.jfree.data.pie.PieDataset pieDataset38 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset34, (java.lang.Comparable) (-1L), 0.0d, (int) (byte) 1);
        boolean boolean39 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset34 and pieDataset38", pieDataset34.equals(pieDataset38) ? pieDataset34.hashCode() == pieDataset38.hashCode() : true);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test278");
        java.lang.Number[] numberArray16 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray21 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray26 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray31 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray32 = new java.lang.Number[][] { numberArray16, numberArray21, numberArray26, numberArray31 };
        org.jfree.data.category.CategoryDataset categoryDataset33 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray32);
        org.jfree.data.category.CategoryDataset categoryDataset34 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray32);
        org.jfree.data.category.CategoryDataset categoryDataset35 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray32);
        org.jfree.data.category.CategoryDataset categoryDataset36 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray32);
        org.jfree.data.category.CategoryDataset categoryDataset37 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray32);
        org.jfree.data.category.CategoryDataset categoryDataset38 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset33 and categoryDataset37", categoryDataset33.equals(categoryDataset37) ? categoryDataset33.hashCode() == categoryDataset37.hashCode() : true);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test279");
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
        org.jfree.data.pie.PieDataset pieDataset34 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset31, (java.lang.Comparable) '4', (double) '4');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset22 and pieDataset31", pieDataset22.equals(pieDataset31) ? pieDataset22.hashCode() == pieDataset31.hashCode() : true);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test280");
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
        org.jfree.data.pie.PieDataset pieDataset36 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset33, (java.lang.Comparable) "hi!", (double) 10.0f);
        boolean boolean37 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset33 and pieDataset36", pieDataset33.equals(pieDataset36) ? pieDataset33.hashCode() == pieDataset36.hashCode() : true);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test281");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, false);
        org.jfree.data.pie.PieDataset pieDataset21 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset17, (int) (short) 0);
        double double22 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset21);
        org.jfree.data.pie.PieDataset pieDataset26 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset21, (java.lang.Comparable) (-1L), (double) (short) 0, (int) (short) 10);
        double double27 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset21 and pieDataset26", pieDataset21.equals(pieDataset26) ? pieDataset21.hashCode() == pieDataset26.hashCode() : true);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test282");
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
        org.jfree.data.pie.PieDataset pieDataset36 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset21, (java.lang.Comparable) ' ', (double) (short) 0, (int) '#');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset21 and pieDataset32", pieDataset21.equals(pieDataset32) ? pieDataset21.hashCode() == pieDataset32.hashCode() : true);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test283");
        java.lang.Number[] numberArray10 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray15 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray20 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray25 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray26 = new java.lang.Number[][] { numberArray10, numberArray15, numberArray20, numberArray25 };
        org.jfree.data.category.CategoryDataset categoryDataset27 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray26);
        org.jfree.data.category.CategoryDataset categoryDataset28 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray26);
        org.jfree.data.category.CategoryDataset categoryDataset29 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray26);
        java.lang.Number number30 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset28 and categoryDataset29", categoryDataset28.equals(categoryDataset29) ? categoryDataset28.hashCode() == categoryDataset29.hashCode() : true);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test284");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, false);
        org.jfree.data.pie.PieDataset pieDataset21 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset17, (int) (short) 0);
        double double22 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset21);
        org.jfree.data.pie.PieDataset pieDataset26 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset21, (java.lang.Comparable) (-1L), (double) (short) 0, (int) (short) 10);
        org.jfree.data.pie.PieDataset pieDataset29 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset26, (java.lang.Comparable) "hi!", (double) (byte) -1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset21 and pieDataset26", pieDataset21.equals(pieDataset26) ? pieDataset21.hashCode() == pieDataset26.hashCode() : true);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test285");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, false);
        org.jfree.data.pie.PieDataset pieDataset21 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset17, (int) (short) 0);
        org.jfree.data.Range range22 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset17);
        org.jfree.data.pie.PieDataset pieDataset24 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset17, (int) (short) 1);
        org.jfree.data.Range range25 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset21 and pieDataset24", pieDataset21.equals(pieDataset24) ? pieDataset21.hashCode() == pieDataset24.hashCode() : true);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test286");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, false);
        org.jfree.data.pie.PieDataset pieDataset21 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset17, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset24 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset21, (java.lang.Comparable) 100L, (double) 1);
        org.jfree.data.pie.PieDataset pieDataset27 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset21, (java.lang.Comparable) (short) 1, 130.0d);
        org.jfree.data.pie.PieDataset pieDataset31 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset21, (java.lang.Comparable) "", (double) (byte) 1, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset34 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset31, (java.lang.Comparable) (byte) 1, (double) 100L);
        boolean boolean35 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset31 and pieDataset34", pieDataset31.equals(pieDataset34) ? pieDataset31.hashCode() == pieDataset34.hashCode() : true);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test287");
        double[] doubleArray9 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray16 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray17 = new double[][] { doubleArray9, doubleArray16 };
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray17);
        org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset18, false);
        java.lang.Number number21 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(categoryDataset18);
        org.jfree.data.pie.PieDataset pieDataset23 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset18, (int) (short) 0);
        boolean boolean24 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset23);
        org.jfree.data.pie.PieDataset pieDataset28 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset23, (java.lang.Comparable) ' ', (double) 0, (int) (short) 100);
        org.jfree.data.category.CategoryDataset categoryDataset29 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) (-1L), (org.jfree.data.KeyedValues) pieDataset23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset23 and pieDataset28", pieDataset23.equals(pieDataset28) ? pieDataset23.hashCode() == pieDataset28.hashCode() : true);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test288");
        java.lang.Number[] numberArray14 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray24 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray29 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray30 = new java.lang.Number[][] { numberArray14, numberArray19, numberArray24, numberArray29 };
        org.jfree.data.category.CategoryDataset categoryDataset31 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray30);
        org.jfree.data.category.CategoryDataset categoryDataset32 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray30);
        org.jfree.data.category.CategoryDataset categoryDataset33 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray30);
        org.jfree.data.category.CategoryDataset categoryDataset34 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray30);
        org.jfree.data.category.CategoryDataset categoryDataset35 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset33 and categoryDataset34", categoryDataset33.equals(categoryDataset34) ? categoryDataset33.hashCode() == categoryDataset34.hashCode() : true);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test289");
        java.lang.Number[] numberArray14 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray24 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray29 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray30 = new java.lang.Number[][] { numberArray14, numberArray19, numberArray24, numberArray29 };
        org.jfree.data.category.CategoryDataset categoryDataset31 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray30);
        org.jfree.data.category.CategoryDataset categoryDataset32 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray30);
        org.jfree.data.category.CategoryDataset categoryDataset33 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray30);
        org.jfree.data.category.CategoryDataset categoryDataset34 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray30);
        org.jfree.data.category.CategoryDataset categoryDataset35 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset31 and categoryDataset34", categoryDataset31.equals(categoryDataset34) ? categoryDataset31.hashCode() == categoryDataset34.hashCode() : true);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test290");
        java.lang.Number[] numberArray10 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray15 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray20 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray25 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray26 = new java.lang.Number[][] { numberArray10, numberArray15, numberArray20, numberArray25 };
        org.jfree.data.category.CategoryDataset categoryDataset27 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray26);
        org.jfree.data.category.CategoryDataset categoryDataset28 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray26);
        org.jfree.data.category.CategoryDataset categoryDataset29 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray26);
        org.jfree.data.Range range30 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset27 and categoryDataset29", categoryDataset27.equals(categoryDataset29) ? categoryDataset27.hashCode() == categoryDataset29.hashCode() : true);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test291");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, false);
        org.jfree.data.pie.PieDataset pieDataset21 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset17, (int) (short) 0);
        double double22 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset21);
        boolean boolean23 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset21);
        org.jfree.data.pie.PieDataset pieDataset26 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset21, (java.lang.Comparable) (-1L), 400.0d);
        boolean boolean27 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset21);
        org.jfree.data.pie.PieDataset pieDataset30 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset21, (java.lang.Comparable) (short) 0, (double) (byte) 1);
        org.jfree.data.pie.PieDataset pieDataset33 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset30, (java.lang.Comparable) (short) 10, 4.0d);
        org.jfree.data.pie.PieDataset pieDataset37 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset30, (java.lang.Comparable) (byte) 1, (double) 0.0f, (int) (short) 0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset30 and pieDataset33", pieDataset30.equals(pieDataset33) ? pieDataset30.hashCode() == pieDataset33.hashCode() : true);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test292");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, false);
        org.jfree.data.pie.PieDataset pieDataset21 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset17, (int) (short) 0);
        double double22 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset21);
        boolean boolean23 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset21);
        org.jfree.data.pie.PieDataset pieDataset27 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset21, (java.lang.Comparable) 10.0f, (double) (short) 10, (int) (short) 1);
        org.jfree.data.pie.PieDataset pieDataset31 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset27, (java.lang.Comparable) 100L, (double) 100.0f, (int) (short) 100);
        org.jfree.data.pie.PieDataset pieDataset34 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset27, (java.lang.Comparable) 130.0d, (double) (short) 100);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset27 and pieDataset31", pieDataset27.equals(pieDataset31) ? pieDataset27.hashCode() == pieDataset31.hashCode() : true);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test293");
        java.lang.Number[] numberArray11 = new java.lang.Number[] { (byte) 0, 1.0d, 112.0d };
        java.lang.Number[] numberArray15 = new java.lang.Number[] { (byte) 0, 1.0d, 112.0d };
        java.lang.Number[][] numberArray16 = new java.lang.Number[][] { numberArray11, numberArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray16);
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray16);
        org.jfree.data.category.CategoryDataset categoryDataset19 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray16);
        org.jfree.data.category.CategoryDataset categoryDataset20 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset18 and categoryDataset19", categoryDataset18.equals(categoryDataset19) ? categoryDataset18.hashCode() == categoryDataset19.hashCode() : true);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test294");
        double[] doubleArray9 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray16 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray17 = new double[][] { doubleArray9, doubleArray16 };
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray17);
        org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset18, false);
        org.jfree.data.pie.PieDataset pieDataset22 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset18, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset25 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset22, (java.lang.Comparable) 100L, (double) 1);
        org.jfree.data.pie.PieDataset pieDataset28 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset22, (java.lang.Comparable) (short) 1, 130.0d);
        org.jfree.data.pie.PieDataset pieDataset32 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset22, (java.lang.Comparable) "", (double) (byte) 1, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset35 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset32, (java.lang.Comparable) (byte) 1, (double) 100L);
        org.jfree.data.category.CategoryDataset categoryDataset36 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) (byte) 1, (org.jfree.data.KeyedValues) pieDataset35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset32 and pieDataset35", pieDataset32.equals(pieDataset35) ? pieDataset32.hashCode() == pieDataset35.hashCode() : true);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test295");
        java.lang.Number[] numberArray6 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray11 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray21 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray22 = new java.lang.Number[][] { numberArray6, numberArray11, numberArray16, numberArray21 };
        org.jfree.data.category.CategoryDataset categoryDataset23 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray22);
        java.lang.Number number24 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(categoryDataset23);
        org.jfree.data.Range range26 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset23, true);
        java.lang.Number number27 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset23);
        org.jfree.data.pie.PieDataset pieDataset29 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset23, 0);
        org.jfree.data.pie.PieDataset pieDataset33 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset29, (java.lang.Comparable) (byte) 0, (double) (byte) 10, (int) 'a');
        org.jfree.data.pie.PieDataset pieDataset36 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset33, (java.lang.Comparable) (-1), (double) 0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset29 and pieDataset33", pieDataset29.equals(pieDataset33) ? pieDataset29.hashCode() == pieDataset33.hashCode() : true);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test296");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, false);
        org.jfree.data.pie.PieDataset pieDataset21 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset17, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset24 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset21, (java.lang.Comparable) ' ', (double) '#');
        org.jfree.data.pie.PieDataset pieDataset27 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset24, (java.lang.Comparable) (byte) 1, (double) 10);
        double double28 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset24 and pieDataset27", pieDataset24.equals(pieDataset27) ? pieDataset24.hashCode() == pieDataset27.hashCode() : true);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test297");
        java.lang.Number[] numberArray11 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray21 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray26 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray27 = new java.lang.Number[][] { numberArray11, numberArray16, numberArray21, numberArray26 };
        org.jfree.data.category.CategoryDataset categoryDataset28 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray27);
        org.jfree.data.category.CategoryDataset categoryDataset29 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray27);
        org.jfree.data.category.CategoryDataset categoryDataset30 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray27);
        java.lang.Number number31 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset30);
        java.lang.Number number32 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset30);
        java.lang.Number number33 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(categoryDataset30);
        java.lang.Number number34 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(categoryDataset30);
        org.jfree.data.pie.PieDataset pieDataset36 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset30, (int) (byte) 0);
        boolean boolean37 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset36);
        boolean boolean38 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset36);
        org.jfree.data.pie.PieDataset pieDataset42 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset36, (java.lang.Comparable) 0, (double) 1, (int) '4');
        org.jfree.data.category.CategoryDataset categoryDataset43 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 1L, (org.jfree.data.KeyedValues) pieDataset36);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset36 and pieDataset42", pieDataset36.equals(pieDataset42) ? pieDataset36.hashCode() == pieDataset42.hashCode() : true);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test298");
        java.lang.Number[] numberArray16 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray21 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray26 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray31 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray32 = new java.lang.Number[][] { numberArray16, numberArray21, numberArray26, numberArray31 };
        org.jfree.data.category.CategoryDataset categoryDataset33 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray32);
        org.jfree.data.category.CategoryDataset categoryDataset34 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray32);
        org.jfree.data.category.CategoryDataset categoryDataset35 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray32);
        org.jfree.data.category.CategoryDataset categoryDataset36 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray32);
        org.jfree.data.category.CategoryDataset categoryDataset37 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray32);
        org.jfree.data.category.CategoryDataset categoryDataset38 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset33 and categoryDataset37", categoryDataset33.equals(categoryDataset37) ? categoryDataset33.hashCode() == categoryDataset37.hashCode() : true);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test299");
        java.lang.Number[] numberArray14 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray24 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray29 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray30 = new java.lang.Number[][] { numberArray14, numberArray19, numberArray24, numberArray29 };
        org.jfree.data.category.CategoryDataset categoryDataset31 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray30);
        org.jfree.data.category.CategoryDataset categoryDataset32 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray30);
        org.jfree.data.category.CategoryDataset categoryDataset33 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray30);
        org.jfree.data.category.CategoryDataset categoryDataset34 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray30);
        org.jfree.data.category.CategoryDataset categoryDataset35 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset31 and categoryDataset34", categoryDataset31.equals(categoryDataset34) ? categoryDataset31.hashCode() == categoryDataset34.hashCode() : true);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test300");
        java.lang.Number[] numberArray10 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray15 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray20 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray25 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray26 = new java.lang.Number[][] { numberArray10, numberArray15, numberArray20, numberArray25 };
        org.jfree.data.category.CategoryDataset categoryDataset27 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray26);
        org.jfree.data.category.CategoryDataset categoryDataset28 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray26);
        org.jfree.data.category.CategoryDataset categoryDataset29 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray26);
        java.lang.Class<?> wildcardClass30 = numberArray26.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset27 and categoryDataset29", categoryDataset27.equals(categoryDataset29) ? categoryDataset27.hashCode() == categoryDataset29.hashCode() : true);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test301");
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
        org.jfree.data.pie.PieDataset pieDataset32 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset29, (java.lang.Comparable) 100.0d, (double) (short) 100);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset21 and pieDataset29", pieDataset21.equals(pieDataset29) ? pieDataset21.hashCode() == pieDataset29.hashCode() : true);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test302");
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
        java.lang.Comparable comparable32 = null;
        org.jfree.data.pie.PieDataset pieDataset35 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset31, comparable32, 1.0d, (int) (byte) 100);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset22 and pieDataset31", pieDataset22.equals(pieDataset31) ? pieDataset22.hashCode() == pieDataset31.hashCode() : true);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test303");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, false);
        org.jfree.data.pie.PieDataset pieDataset21 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset17, (int) (short) 0);
        org.jfree.data.Range range23 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset17, false);
        org.jfree.data.pie.PieDataset pieDataset25 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset17, 0);
        org.jfree.data.pie.PieDataset pieDataset29 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset25, (java.lang.Comparable) (byte) -1, 10.0d, 10);
        java.lang.Class<?> wildcardClass30 = pieDataset29.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset25 and pieDataset29", pieDataset25.equals(pieDataset29) ? pieDataset25.hashCode() == pieDataset29.hashCode() : true);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test304");
        double[] doubleArray12 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray19 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray20 = new double[][] { doubleArray12, doubleArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray20);
        org.jfree.data.Range range23 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset21, false);
        org.jfree.data.pie.PieDataset pieDataset25 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset21, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset28 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset25, (java.lang.Comparable) 100L, (double) 1);
        org.jfree.data.pie.PieDataset pieDataset31 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset25, (java.lang.Comparable) (short) 1, 130.0d);
        org.jfree.data.category.CategoryDataset categoryDataset32 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) (-1L), (org.jfree.data.KeyedValues) pieDataset25);
        double double33 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset25);
        boolean boolean34 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset25);
        boolean boolean35 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset25);
        org.jfree.data.category.CategoryDataset categoryDataset36 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 10, (org.jfree.data.KeyedValues) pieDataset25);
        org.jfree.data.category.CategoryDataset categoryDataset37 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) (-1), (org.jfree.data.KeyedValues) pieDataset25);
        org.jfree.data.pie.PieDataset pieDataset40 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset25, (java.lang.Comparable) "hi!", (double) (byte) -1);
        org.jfree.data.category.CategoryDataset categoryDataset41 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) (byte) 100, (org.jfree.data.KeyedValues) pieDataset25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset25 and pieDataset40", pieDataset25.equals(pieDataset40) ? pieDataset25.hashCode() == pieDataset40.hashCode() : true);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test305");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, false);
        org.jfree.data.pie.PieDataset pieDataset21 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset17, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset24 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset21, (java.lang.Comparable) 10L, (double) (-1L));
        java.lang.Class<?> wildcardClass25 = pieDataset21.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset21 and pieDataset24", pieDataset21.equals(pieDataset24) ? pieDataset21.hashCode() == pieDataset24.hashCode() : true);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test306");
        double[] doubleArray10 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray17 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray18 = new double[][] { doubleArray10, doubleArray17 };
        org.jfree.data.category.CategoryDataset categoryDataset19 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray18);
        org.jfree.data.Range range21 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset19, false);
        org.jfree.data.pie.PieDataset pieDataset23 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset19, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset26 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset23, (java.lang.Comparable) 100L, (double) 1);
        org.jfree.data.category.CategoryDataset categoryDataset27 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) (-1L), (org.jfree.data.KeyedValues) pieDataset26);
        org.jfree.data.pie.PieDataset pieDataset30 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset26, (java.lang.Comparable) 100.0d, (double) 1);
        org.jfree.data.category.CategoryDataset categoryDataset31 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 1, (org.jfree.data.KeyedValues) pieDataset30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset26 and pieDataset30", pieDataset26.equals(pieDataset30) ? pieDataset26.hashCode() == pieDataset30.hashCode() : true);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test307");
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
        org.jfree.data.pie.PieDataset pieDataset38 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset23, (java.lang.Comparable) 10.0f, (double) 1);
        org.jfree.data.pie.PieDataset pieDataset42 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset38, (java.lang.Comparable) 100.0d, 130.0d, (int) '4');
        org.jfree.data.pie.PieDataset pieDataset45 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset42, (java.lang.Comparable) (short) 100, (double) 0L);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset38 and pieDataset42", pieDataset38.equals(pieDataset42) ? pieDataset38.hashCode() == pieDataset42.hashCode() : true);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test308");
        java.lang.Number[] numberArray12 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray17 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray22 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray27 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray28 = new java.lang.Number[][] { numberArray12, numberArray17, numberArray22, numberArray27 };
        org.jfree.data.category.CategoryDataset categoryDataset29 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray28);
        org.jfree.data.category.CategoryDataset categoryDataset30 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray28);
        org.jfree.data.category.CategoryDataset categoryDataset31 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray28);
        org.jfree.data.category.CategoryDataset categoryDataset32 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray28);
        org.jfree.data.Range range33 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset29 and categoryDataset32", categoryDataset29.equals(categoryDataset32) ? categoryDataset29.hashCode() == categoryDataset32.hashCode() : true);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test309");
        double[] doubleArray9 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray16 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray17 = new double[][] { doubleArray9, doubleArray16 };
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray17);
        org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset18, false);
        org.jfree.data.pie.PieDataset pieDataset22 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset18, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset25 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset22, (java.lang.Comparable) 100L, (double) 1);
        org.jfree.data.pie.PieDataset pieDataset28 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset22, (java.lang.Comparable) (short) 1, 130.0d);
        org.jfree.data.pie.PieDataset pieDataset32 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset22, (java.lang.Comparable) "", (double) (byte) 1, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset35 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset32, (java.lang.Comparable) (byte) 1, (double) 100L);
        org.jfree.data.category.CategoryDataset categoryDataset36 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) false, (org.jfree.data.KeyedValues) pieDataset35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset32 and pieDataset35", pieDataset32.equals(pieDataset35) ? pieDataset32.hashCode() == pieDataset35.hashCode() : true);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test310");
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
        org.jfree.data.pie.PieDataset pieDataset38 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset34, (java.lang.Comparable) (-1L), 0.0d, (int) (byte) 1);
        org.jfree.data.pie.PieDataset pieDataset41 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset38, (java.lang.Comparable) 0.0d, (double) 10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset34 and pieDataset38", pieDataset34.equals(pieDataset38) ? pieDataset34.hashCode() == pieDataset38.hashCode() : true);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test311");
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
        org.jfree.data.pie.PieDataset pieDataset40 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset37, (java.lang.Comparable) 10L, 0.0d);
        double double41 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset40);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset37 and pieDataset40", pieDataset37.equals(pieDataset40) ? pieDataset37.hashCode() == pieDataset40.hashCode() : true);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test312");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, false);
        org.jfree.data.pie.PieDataset pieDataset21 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset17, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset24 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset21, (java.lang.Comparable) 10L, (double) (-1L));
        org.jfree.data.pie.PieDataset pieDataset27 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset21, (java.lang.Comparable) 0.0f, (double) (short) -1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset21 and pieDataset24", pieDataset21.equals(pieDataset24) ? pieDataset21.hashCode() == pieDataset24.hashCode() : true);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test313");
        double[] doubleArray6 = new double[] { (short) 0, (byte) 0 };
        double[][] doubleArray7 = new double[][] { doubleArray6 };
        org.jfree.data.category.CategoryDataset categoryDataset8 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray7);
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray7);
        java.lang.Number number10 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset9);
        org.jfree.data.pie.PieDataset pieDataset12 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset15 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset12, (java.lang.Comparable) (short) 100, (double) (short) 10);
        boolean boolean16 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset12 and pieDataset15", pieDataset12.equals(pieDataset15) ? pieDataset12.hashCode() == pieDataset15.hashCode() : true);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test314");
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
        org.jfree.data.pie.PieDataset pieDataset36 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset33, (java.lang.Comparable) "hi!", (double) 10.0f);
        double double37 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset33 and pieDataset36", pieDataset33.equals(pieDataset36) ? pieDataset33.hashCode() == pieDataset36.hashCode() : true);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test315");
        double[] doubleArray9 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray16 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray17 = new double[][] { doubleArray9, doubleArray16 };
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray17);
        org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset18, false);
        org.jfree.data.pie.PieDataset pieDataset22 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset18, (int) (short) 0);
        org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset18, false);
        org.jfree.data.pie.PieDataset pieDataset26 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset18, 0);
        double double27 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset26);
        org.jfree.data.category.CategoryDataset categoryDataset28 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) "", (org.jfree.data.KeyedValues) pieDataset26);
        org.jfree.data.Range range29 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset28);
        org.jfree.data.pie.PieDataset pieDataset31 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset28, 0);
        java.lang.Class<?> wildcardClass32 = pieDataset31.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset26 and pieDataset31", pieDataset26.equals(pieDataset31) ? pieDataset26.hashCode() == pieDataset31.hashCode() : true);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test316");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, false);
        org.jfree.data.pie.PieDataset pieDataset21 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset17, (int) (short) 0);
        double double22 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset21);
        boolean boolean23 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset21);
        org.jfree.data.pie.PieDataset pieDataset27 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset21, (java.lang.Comparable) 10.0f, (double) (short) 10, (int) (short) 1);
        org.jfree.data.pie.PieDataset pieDataset31 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset21, (java.lang.Comparable) (-1), 1.0d, (int) ' ');
        boolean boolean32 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset21 and pieDataset31", pieDataset21.equals(pieDataset31) ? pieDataset21.hashCode() == pieDataset31.hashCode() : true);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test317");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, false);
        org.jfree.data.pie.PieDataset pieDataset21 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset17, (int) (short) 0);
        org.jfree.data.Range range23 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset17, false);
        org.jfree.data.pie.PieDataset pieDataset25 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset17, 0);
        org.jfree.data.pie.PieDataset pieDataset29 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset25, (java.lang.Comparable) (byte) -1, 10.0d, 10);
        org.jfree.data.pie.PieDataset pieDataset33 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset29, (java.lang.Comparable) (byte) -1, 20.0d, (int) (short) -1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset25 and pieDataset29", pieDataset25.equals(pieDataset29) ? pieDataset25.hashCode() == pieDataset29.hashCode() : true);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test318");
        double[] doubleArray9 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray16 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray17 = new double[][] { doubleArray9, doubleArray16 };
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray17);
        org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset18, false);
        org.jfree.data.pie.PieDataset pieDataset22 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset18, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset25 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset22, (java.lang.Comparable) 100L, (double) 1);
        org.jfree.data.pie.PieDataset pieDataset28 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset22, (java.lang.Comparable) (short) 1, 130.0d);
        boolean boolean29 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset28);
        org.jfree.data.category.CategoryDataset categoryDataset30 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 0.0d, (org.jfree.data.KeyedValues) pieDataset28);
        org.jfree.data.pie.PieDataset pieDataset32 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset30, 0);
        org.jfree.data.pie.PieDataset pieDataset35 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset32, (java.lang.Comparable) "", (double) 100);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset28 and pieDataset32", pieDataset28.equals(pieDataset32) ? pieDataset28.hashCode() == pieDataset32.hashCode() : true);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test319");
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
        org.jfree.data.pie.PieDataset pieDataset37 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset23, (java.lang.Comparable) (short) 0, (double) 1, (int) (short) 1);
        org.jfree.data.pie.PieDataset pieDataset41 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset23, (java.lang.Comparable) (short) 0, (double) 100.0f, (int) '#');
        org.jfree.data.pie.PieDataset pieDataset44 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset41, (java.lang.Comparable) 0.0d, (double) (byte) 0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset23 and pieDataset41", pieDataset23.equals(pieDataset41) ? pieDataset23.hashCode() == pieDataset41.hashCode() : true);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test320");
        double[] doubleArray9 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray16 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray17 = new double[][] { doubleArray9, doubleArray16 };
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray17);
        org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset18, false);
        org.jfree.data.pie.PieDataset pieDataset22 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset18, (int) (short) 0);
        double double23 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset22);
        boolean boolean24 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset22);
        org.jfree.data.pie.PieDataset pieDataset28 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset22, (java.lang.Comparable) 10.0f, (double) (short) 10, (int) (short) 1);
        org.jfree.data.pie.PieDataset pieDataset32 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset28, (java.lang.Comparable) 100L, (double) 100.0f, (int) (short) 100);
        org.jfree.data.category.CategoryDataset categoryDataset33 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 10L, (org.jfree.data.KeyedValues) pieDataset28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset28 and pieDataset32", pieDataset28.equals(pieDataset32) ? pieDataset28.hashCode() == pieDataset32.hashCode() : true);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test321");
        double[] doubleArray12 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray19 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray20 = new double[][] { doubleArray12, doubleArray19 };
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray20);
        org.jfree.data.category.CategoryDataset categoryDataset22 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray20);
        org.jfree.data.category.CategoryDataset categoryDataset23 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset21 and categoryDataset22", categoryDataset21.equals(categoryDataset22) ? categoryDataset21.hashCode() == categoryDataset22.hashCode() : true);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test322");
        double[] doubleArray13 = new double[] { 130.0d, (-1.0f), 1L, 100.0f, 1L };
        double[] doubleArray19 = new double[] { 130.0d, (-1.0f), 1L, 100.0f, 1L };
        double[] doubleArray25 = new double[] { 130.0d, (-1.0f), 1L, 100.0f, 1L };
        double[] doubleArray31 = new double[] { 130.0d, (-1.0f), 1L, 100.0f, 1L };
        double[] doubleArray37 = new double[] { 130.0d, (-1.0f), 1L, 100.0f, 1L };
        double[] doubleArray43 = new double[] { 130.0d, (-1.0f), 1L, 100.0f, 1L };
        double[][] doubleArray44 = new double[][] { doubleArray13, doubleArray19, doubleArray25, doubleArray31, doubleArray37, doubleArray43 };
        org.jfree.data.category.CategoryDataset categoryDataset45 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray44);
        org.jfree.data.category.CategoryDataset categoryDataset46 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray44);
        org.jfree.data.category.CategoryDataset categoryDataset47 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray44);
        org.jfree.data.category.CategoryDataset categoryDataset48 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray44);
        java.lang.Number number49 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset48);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset47 and categoryDataset48", categoryDataset47.equals(categoryDataset48) ? categoryDataset47.hashCode() == categoryDataset48.hashCode() : true);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test323");
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
        org.jfree.data.pie.PieDataset pieDataset37 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset23, (java.lang.Comparable) 10.0d, (double) 100.0f, (-1));
        org.jfree.data.category.CategoryDataset categoryDataset38 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 10L, (org.jfree.data.KeyedValues) pieDataset37);
        org.jfree.data.pie.PieDataset pieDataset41 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset37, (java.lang.Comparable) 10, 200.0d);
        org.jfree.data.pie.PieDataset pieDataset44 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset37, (java.lang.Comparable) 130.0d, (double) 1.0f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset37 and pieDataset41", pieDataset37.equals(pieDataset41) ? pieDataset37.hashCode() == pieDataset41.hashCode() : true);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test324");
        double[] doubleArray9 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray16 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray17 = new double[][] { doubleArray9, doubleArray16 };
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray17);
        org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset18, false);
        org.jfree.data.pie.PieDataset pieDataset22 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset18, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset25 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset22, (java.lang.Comparable) 100L, (double) 1);
        double double26 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset22);
        boolean boolean27 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset22);
        org.jfree.data.category.CategoryDataset categoryDataset28 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) (short) -1, (org.jfree.data.KeyedValues) pieDataset22);
        java.lang.Number number29 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset28);
        org.jfree.data.Range range30 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset28);
        org.jfree.data.pie.PieDataset pieDataset32 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset28, (java.lang.Comparable) (short) -1);
        java.lang.Class<?> wildcardClass33 = pieDataset32.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset22 and pieDataset32", pieDataset22.equals(pieDataset32) ? pieDataset22.hashCode() == pieDataset32.hashCode() : true);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test325");
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
        org.jfree.data.pie.PieDataset pieDataset38 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset23, (java.lang.Comparable) 10.0f, (double) 1);
        org.jfree.data.pie.PieDataset pieDataset42 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset38, (java.lang.Comparable) 100.0d, 130.0d, (int) '4');
        java.lang.Comparable comparable43 = null;
        org.jfree.data.pie.PieDataset pieDataset45 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset42, comparable43, 1.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset38 and pieDataset42", pieDataset38.equals(pieDataset42) ? pieDataset38.hashCode() == pieDataset42.hashCode() : true);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test326");
        java.lang.Comparable[] comparableArray1 = new java.lang.Comparable[] { 400.0d };
        java.lang.Comparable[] comparableArray4 = new java.lang.Comparable[] { (byte) 0, 100.0f };
        double[] doubleArray17 = new double[] { (short) 0, (byte) 0 };
        double[][] doubleArray18 = new double[][] { doubleArray17 };
        org.jfree.data.category.CategoryDataset categoryDataset19 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray18);
        org.jfree.data.category.CategoryDataset categoryDataset20 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray18);
        org.jfree.data.category.CategoryDataset categoryDataset21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray18);
        org.jfree.data.category.CategoryDataset categoryDataset22 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray18);
        org.jfree.data.category.CategoryDataset categoryDataset23 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray18);
        org.jfree.data.category.CategoryDataset categoryDataset24 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(comparableArray1, comparableArray4, doubleArray18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset21 and categoryDataset23", categoryDataset21.equals(categoryDataset23) ? categoryDataset21.hashCode() == categoryDataset23.hashCode() : true);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test327");
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
        org.jfree.data.pie.PieDataset pieDataset31 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset22, (java.lang.Comparable) (short) 10, 0.0d);
        org.jfree.data.pie.PieDataset pieDataset34 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset31, (java.lang.Comparable) 10, (double) (-1));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset22 and pieDataset31", pieDataset22.equals(pieDataset31) ? pieDataset22.hashCode() == pieDataset31.hashCode() : true);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test328");
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
        org.jfree.data.pie.PieDataset pieDataset37 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset23, (java.lang.Comparable) 10.0d, (double) 100.0f, (-1));
        org.jfree.data.category.CategoryDataset categoryDataset38 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 10L, (org.jfree.data.KeyedValues) pieDataset37);
        org.jfree.data.pie.PieDataset pieDataset41 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset37, (java.lang.Comparable) 10, 200.0d);
        org.jfree.data.pie.PieDataset pieDataset44 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset37, (java.lang.Comparable) 20.0d, (double) 10L);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset37 and pieDataset41", pieDataset37.equals(pieDataset41) ? pieDataset37.hashCode() == pieDataset41.hashCode() : true);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test329");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, false);
        org.jfree.data.pie.PieDataset pieDataset21 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset17, (int) (short) 0);
        double double22 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset21);
        org.jfree.data.pie.PieDataset pieDataset26 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset21, (java.lang.Comparable) (-1L), (double) (short) 0, (int) (short) 10);
        org.jfree.data.pie.PieDataset pieDataset30 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset21, (java.lang.Comparable) 0L, 100.0d, (int) (byte) 10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset21 and pieDataset26", pieDataset21.equals(pieDataset26) ? pieDataset21.hashCode() == pieDataset26.hashCode() : true);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test330");
        java.lang.Number[] numberArray14 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray24 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray29 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray30 = new java.lang.Number[][] { numberArray14, numberArray19, numberArray24, numberArray29 };
        org.jfree.data.category.CategoryDataset categoryDataset31 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray30);
        org.jfree.data.category.CategoryDataset categoryDataset32 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray30);
        org.jfree.data.category.CategoryDataset categoryDataset33 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray30);
        org.jfree.data.category.CategoryDataset categoryDataset34 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray30);
        org.jfree.data.category.CategoryDataset categoryDataset35 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset31 and categoryDataset34", categoryDataset31.equals(categoryDataset34) ? categoryDataset31.hashCode() == categoryDataset34.hashCode() : true);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test331");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, false);
        org.jfree.data.pie.PieDataset pieDataset21 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset17, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset24 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset21, (java.lang.Comparable) 100L, (double) 1);
        org.jfree.data.pie.PieDataset pieDataset27 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset21, (java.lang.Comparable) (short) 1, 130.0d);
        org.jfree.data.pie.PieDataset pieDataset31 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset21, (java.lang.Comparable) "", (double) (byte) 1, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset34 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset31, (java.lang.Comparable) (byte) 1, (double) 100L);
        java.lang.Class<?> wildcardClass35 = pieDataset34.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset31 and pieDataset34", pieDataset31.equals(pieDataset34) ? pieDataset31.hashCode() == pieDataset34.hashCode() : true);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test332");
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
        boolean boolean33 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset21 and pieDataset32", pieDataset21.equals(pieDataset32) ? pieDataset21.hashCode() == pieDataset32.hashCode() : true);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test333");
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
        org.jfree.data.pie.PieDataset pieDataset30 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset20, 0);
        org.jfree.data.pie.PieDataset pieDataset33 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset30, (java.lang.Comparable) 1.0d, 0.0d);
        double double34 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset30 and pieDataset33", pieDataset30.equals(pieDataset33) ? pieDataset30.hashCode() == pieDataset33.hashCode() : true);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test334");
        java.lang.Number[] numberArray10 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray15 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray20 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray25 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray26 = new java.lang.Number[][] { numberArray10, numberArray15, numberArray20, numberArray25 };
        org.jfree.data.category.CategoryDataset categoryDataset27 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray26);
        org.jfree.data.category.CategoryDataset categoryDataset28 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray26);
        org.jfree.data.category.CategoryDataset categoryDataset29 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray26);
        org.jfree.data.pie.PieDataset pieDataset31 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset29, (int) (short) 1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset27 and categoryDataset29", categoryDataset27.equals(categoryDataset29) ? categoryDataset27.hashCode() == categoryDataset29.hashCode() : true);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test335");
        double[] doubleArray9 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray16 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray17 = new double[][] { doubleArray9, doubleArray16 };
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray17);
        org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset18, false);
        org.jfree.data.pie.PieDataset pieDataset22 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset18, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset25 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset22, (java.lang.Comparable) 100L, (double) 1);
        org.jfree.data.pie.PieDataset pieDataset28 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset22, (java.lang.Comparable) (short) 1, 130.0d);
        boolean boolean29 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset28);
        org.jfree.data.category.CategoryDataset categoryDataset30 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 0.0d, (org.jfree.data.KeyedValues) pieDataset28);
        org.jfree.data.pie.PieDataset pieDataset32 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset30, 0);
        java.lang.Class<?> wildcardClass33 = pieDataset32.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset28 and pieDataset32", pieDataset28.equals(pieDataset32) ? pieDataset28.hashCode() == pieDataset32.hashCode() : true);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test336");
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
        org.jfree.data.category.CategoryDataset categoryDataset37 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) ' ', (org.jfree.data.KeyedValues) pieDataset24);
        org.jfree.data.pie.PieDataset pieDataset40 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset24, (java.lang.Comparable) '4', (double) 0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset35 and categoryDataset37", categoryDataset35.equals(categoryDataset37) ? categoryDataset35.hashCode() == categoryDataset37.hashCode() : true);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test337");
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
        org.jfree.data.pie.PieDataset pieDataset38 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset30, (java.lang.Comparable) 0L, 10.0d, 10);
        double double39 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset30 and pieDataset38", pieDataset30.equals(pieDataset38) ? pieDataset30.hashCode() == pieDataset38.hashCode() : true);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test338");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, false);
        org.jfree.data.pie.PieDataset pieDataset21 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset17, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset24 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset21, (java.lang.Comparable) ' ', (double) '#');
        boolean boolean25 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset24);
        org.jfree.data.pie.PieDataset pieDataset28 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset24, (java.lang.Comparable) (short) 0, (double) (short) 100);
        double double29 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset24 and pieDataset28", pieDataset24.equals(pieDataset28) ? pieDataset24.hashCode() == pieDataset28.hashCode() : true);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test339");
        java.lang.Number[] numberArray12 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray17 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray22 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray27 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray28 = new java.lang.Number[][] { numberArray12, numberArray17, numberArray22, numberArray27 };
        org.jfree.data.category.CategoryDataset categoryDataset29 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray28);
        org.jfree.data.category.CategoryDataset categoryDataset30 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray28);
        org.jfree.data.category.CategoryDataset categoryDataset31 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray28);
        org.jfree.data.category.CategoryDataset categoryDataset32 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset30 and categoryDataset31", categoryDataset30.equals(categoryDataset31) ? categoryDataset30.hashCode() == categoryDataset31.hashCode() : true);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test340");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, false);
        org.jfree.data.pie.PieDataset pieDataset21 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset17, (int) (short) 0);
        double double22 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset21);
        org.jfree.data.pie.PieDataset pieDataset26 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset21, (java.lang.Comparable) (-1L), (double) (short) 0, (int) (short) 10);
        double double27 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset21 and pieDataset26", pieDataset21.equals(pieDataset26) ? pieDataset21.hashCode() == pieDataset26.hashCode() : true);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test341");
        java.lang.Number[] numberArray11 = new java.lang.Number[] { (byte) 0, 1.0d, 112.0d };
        java.lang.Number[] numberArray15 = new java.lang.Number[] { (byte) 0, 1.0d, 112.0d };
        java.lang.Number[][] numberArray16 = new java.lang.Number[][] { numberArray11, numberArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray16);
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray16);
        org.jfree.data.category.CategoryDataset categoryDataset19 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray16);
        org.jfree.data.category.CategoryDataset categoryDataset20 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset17 and categoryDataset19", categoryDataset17.equals(categoryDataset19) ? categoryDataset17.hashCode() == categoryDataset19.hashCode() : true);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test342");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, false);
        org.jfree.data.pie.PieDataset pieDataset21 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset17, (int) (short) 0);
        double double22 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset21);
        boolean boolean23 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset21);
        org.jfree.data.pie.PieDataset pieDataset26 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset21, (java.lang.Comparable) (-1L), 400.0d);
        org.jfree.data.pie.PieDataset pieDataset30 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset26, (java.lang.Comparable) 1.0d, 0.0d, (int) (short) 10);
        double double31 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset26 and pieDataset30", pieDataset26.equals(pieDataset30) ? pieDataset26.hashCode() == pieDataset30.hashCode() : true);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test343");
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
        boolean boolean35 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset34);
        org.jfree.data.pie.PieDataset pieDataset39 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset34, (java.lang.Comparable) (-1.0d), (double) (byte) 100, (int) ' ');
        boolean boolean40 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset34 and pieDataset39", pieDataset34.equals(pieDataset39) ? pieDataset34.hashCode() == pieDataset39.hashCode() : true);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test344");
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
        org.jfree.data.Range range29 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset23);
        org.jfree.data.pie.PieDataset pieDataset31 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset23, 0);
        org.jfree.data.pie.PieDataset pieDataset35 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset31, (java.lang.Comparable) 100L, (double) 10.0f, (int) (short) -1);
        org.jfree.data.pie.PieDataset pieDataset38 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset35, (java.lang.Comparable) (-1L), (double) 1.0f);
        org.jfree.data.pie.PieDataset pieDataset41 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset38, (java.lang.Comparable) 1, (double) ' ');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset35 and pieDataset38", pieDataset35.equals(pieDataset38) ? pieDataset35.hashCode() == pieDataset38.hashCode() : true);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test345");
        java.lang.Number[] numberArray14 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray24 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray29 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray30 = new java.lang.Number[][] { numberArray14, numberArray19, numberArray24, numberArray29 };
        org.jfree.data.category.CategoryDataset categoryDataset31 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray30);
        org.jfree.data.category.CategoryDataset categoryDataset32 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray30);
        org.jfree.data.category.CategoryDataset categoryDataset33 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray30);
        org.jfree.data.category.CategoryDataset categoryDataset34 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray30);
        org.jfree.data.category.CategoryDataset categoryDataset35 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray30);
        org.jfree.data.Range range36 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(categoryDataset35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset33 and categoryDataset35", categoryDataset33.equals(categoryDataset35) ? categoryDataset33.hashCode() == categoryDataset35.hashCode() : true);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test346");
        double[] doubleArray8 = new double[] { (short) 0, (byte) 0 };
        double[][] doubleArray9 = new double[][] { doubleArray8 };
        org.jfree.data.category.CategoryDataset categoryDataset10 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray9);
        org.jfree.data.category.CategoryDataset categoryDataset11 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray9);
        org.jfree.data.category.CategoryDataset categoryDataset12 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray9);
        java.lang.Number number13 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset12);
        java.lang.Number number14 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset12);
        org.jfree.data.Range range16 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset12, true);
        org.jfree.data.pie.PieDataset pieDataset18 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset12, 0);
        java.lang.Comparable comparable19 = null;
        org.jfree.data.pie.PieDataset pieDataset22 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset18, comparable19, (double) (byte) 1, (int) (short) 10);
        org.jfree.data.pie.PieDataset pieDataset26 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset22, (java.lang.Comparable) (short) 0, (double) 1.0f, (int) (byte) 100);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset18 and pieDataset22", pieDataset18.equals(pieDataset22) ? pieDataset18.hashCode() == pieDataset22.hashCode() : true);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test347");
        double[] doubleArray5 = new double[] { (short) 0, (byte) 0 };
        double[][] doubleArray6 = new double[][] { doubleArray5 };
        org.jfree.data.category.CategoryDataset categoryDataset7 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray6);
        org.jfree.data.pie.PieDataset pieDataset9 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset7, 0);
        org.jfree.data.pie.PieDataset pieDataset13 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset9, (java.lang.Comparable) 100.0d, (double) 'a', 1);
        org.jfree.data.category.CategoryDataset categoryDataset14 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) "", (org.jfree.data.KeyedValues) pieDataset9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset9 and pieDataset13", pieDataset9.equals(pieDataset13) ? pieDataset9.hashCode() == pieDataset13.hashCode() : true);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test348");
        java.lang.Number[] numberArray9 = new java.lang.Number[] { (byte) 0, 1.0d, 112.0d };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { (byte) 0, 1.0d, 112.0d };
        java.lang.Number[][] numberArray14 = new java.lang.Number[][] { numberArray9, numberArray13 };
        org.jfree.data.category.CategoryDataset categoryDataset15 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray14);
        org.jfree.data.category.CategoryDataset categoryDataset16 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray14);
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray14);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset17, (double) (-1.0f));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset15 and categoryDataset17", categoryDataset15.equals(categoryDataset17) ? categoryDataset15.hashCode() == categoryDataset17.hashCode() : true);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test349");
        double[] doubleArray8 = new double[] { (short) 0, (byte) 0 };
        double[][] doubleArray9 = new double[][] { doubleArray8 };
        org.jfree.data.category.CategoryDataset categoryDataset10 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray9);
        org.jfree.data.category.CategoryDataset categoryDataset11 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray9);
        org.jfree.data.category.CategoryDataset categoryDataset12 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray9);
        org.jfree.data.Range range14 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset12, true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset11 and categoryDataset12", categoryDataset11.equals(categoryDataset12) ? categoryDataset11.hashCode() == categoryDataset12.hashCode() : true);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test350");
        java.lang.Number[] numberArray14 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray24 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray29 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray30 = new java.lang.Number[][] { numberArray14, numberArray19, numberArray24, numberArray29 };
        org.jfree.data.category.CategoryDataset categoryDataset31 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray30);
        org.jfree.data.category.CategoryDataset categoryDataset32 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray30);
        org.jfree.data.category.CategoryDataset categoryDataset33 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray30);
        org.jfree.data.category.CategoryDataset categoryDataset34 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray30);
        org.jfree.data.category.CategoryDataset categoryDataset35 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset32 and categoryDataset34", categoryDataset32.equals(categoryDataset34) ? categoryDataset32.hashCode() == categoryDataset34.hashCode() : true);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test351");
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
        double double32 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset22);
        java.lang.Comparable comparable33 = null;
        org.jfree.data.pie.PieDataset pieDataset36 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset22, comparable33, (double) (byte) 0, (int) (byte) 1);
        double double37 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset36);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset22 and pieDataset36", pieDataset22.equals(pieDataset36) ? pieDataset22.hashCode() == pieDataset36.hashCode() : true);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test352");
        double[] doubleArray6 = new double[] { (short) 0, (byte) 0 };
        double[][] doubleArray7 = new double[][] { doubleArray6 };
        org.jfree.data.category.CategoryDataset categoryDataset8 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray7);
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray7);
        java.lang.Number number10 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset9);
        org.jfree.data.pie.PieDataset pieDataset12 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset9, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset16 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset12, (java.lang.Comparable) (short) 1, 400.0d, (int) (byte) 100);
        boolean boolean17 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset12 and pieDataset16", pieDataset12.equals(pieDataset16) ? pieDataset12.hashCode() == pieDataset16.hashCode() : true);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test353");
        java.lang.Number[] numberArray7 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray12 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray17 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray22 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray23 = new java.lang.Number[][] { numberArray7, numberArray12, numberArray17, numberArray22 };
        org.jfree.data.category.CategoryDataset categoryDataset24 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray23);
        java.lang.Number number25 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(categoryDataset24);
        org.jfree.data.Range range27 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset24, true);
        java.lang.Number number28 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset24);
        org.jfree.data.pie.PieDataset pieDataset30 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset24, 0);
        org.jfree.data.category.CategoryDataset categoryDataset31 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) (byte) -1, (org.jfree.data.KeyedValues) pieDataset30);
        org.jfree.data.pie.PieDataset pieDataset35 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset30, (java.lang.Comparable) (byte) -1, (double) ' ', 100);
        org.jfree.data.pie.PieDataset pieDataset38 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset30, (java.lang.Comparable) 'a', (double) (short) -1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset30 and pieDataset35", pieDataset30.equals(pieDataset35) ? pieDataset30.hashCode() == pieDataset35.hashCode() : true);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test354");
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
        org.jfree.data.category.CategoryDataset categoryDataset35 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) (-1L), (org.jfree.data.KeyedValues) pieDataset24);
        org.jfree.data.pie.PieDataset pieDataset38 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset24, (java.lang.Comparable) (short) 10, 10.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset31 and categoryDataset35", categoryDataset31.equals(categoryDataset35) ? categoryDataset31.hashCode() == categoryDataset35.hashCode() : true);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test355");
        java.lang.Number[] numberArray14 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray24 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray29 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray30 = new java.lang.Number[][] { numberArray14, numberArray19, numberArray24, numberArray29 };
        org.jfree.data.category.CategoryDataset categoryDataset31 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray30);
        org.jfree.data.category.CategoryDataset categoryDataset32 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray30);
        org.jfree.data.category.CategoryDataset categoryDataset33 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray30);
        org.jfree.data.category.CategoryDataset categoryDataset34 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray30);
        org.jfree.data.category.CategoryDataset categoryDataset35 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset33 and categoryDataset34", categoryDataset33.equals(categoryDataset34) ? categoryDataset33.hashCode() == categoryDataset34.hashCode() : true);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test356");
        double[] doubleArray12 = new double[] { (short) 0, (byte) 0 };
        double[][] doubleArray13 = new double[][] { doubleArray12 };
        org.jfree.data.category.CategoryDataset categoryDataset14 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray13);
        org.jfree.data.category.CategoryDataset categoryDataset15 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray13);
        org.jfree.data.category.CategoryDataset categoryDataset16 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray13);
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray13);
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset16 and categoryDataset17", categoryDataset16.equals(categoryDataset17) ? categoryDataset16.hashCode() == categoryDataset17.hashCode() : true);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test357");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, false);
        org.jfree.data.pie.PieDataset pieDataset21 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset17, (int) (short) 0);
        java.lang.Number number22 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(categoryDataset17);
        org.jfree.data.Range range23 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset17);
        org.jfree.data.Range range25 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, false);
        org.jfree.data.Range range27 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset17, true);
        org.jfree.data.Range range29 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset17, (double) 1);
        org.jfree.data.pie.PieDataset pieDataset31 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset17, (int) (byte) 1);
        org.jfree.data.Range range32 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset21 and pieDataset31", pieDataset21.equals(pieDataset31) ? pieDataset21.hashCode() == pieDataset31.hashCode() : true);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test358");
        java.lang.Number[] numberArray14 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray24 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray29 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray30 = new java.lang.Number[][] { numberArray14, numberArray19, numberArray24, numberArray29 };
        org.jfree.data.category.CategoryDataset categoryDataset31 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray30);
        org.jfree.data.category.CategoryDataset categoryDataset32 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", numberArray30);
        org.jfree.data.category.CategoryDataset categoryDataset33 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray30);
        org.jfree.data.category.CategoryDataset categoryDataset34 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray30);
        org.jfree.data.category.CategoryDataset categoryDataset35 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset33 and categoryDataset34", categoryDataset33.equals(categoryDataset34) ? categoryDataset33.hashCode() == categoryDataset34.hashCode() : true);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test359");
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
        org.jfree.data.pie.PieDataset pieDataset36 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset22, (java.lang.Comparable) (short) -1, (double) (byte) 100, (int) (byte) 1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset22 and pieDataset32", pieDataset22.equals(pieDataset32) ? pieDataset22.hashCode() == pieDataset32.hashCode() : true);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test360");
        double[] doubleArray9 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray16 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray17 = new double[][] { doubleArray9, doubleArray16 };
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray17);
        org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset18, false);
        org.jfree.data.pie.PieDataset pieDataset22 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset18, (int) (short) 0);
        org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset18, false);
        org.jfree.data.pie.PieDataset pieDataset26 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset18, 0);
        double double27 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset26);
        org.jfree.data.category.CategoryDataset categoryDataset28 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) "", (org.jfree.data.KeyedValues) pieDataset26);
        org.jfree.data.Range range29 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset28);
        org.jfree.data.pie.PieDataset pieDataset31 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset28, 0);
        java.lang.Number number32 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset26 and pieDataset31", pieDataset26.equals(pieDataset31) ? pieDataset26.hashCode() == pieDataset31.hashCode() : true);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test361");
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
        org.jfree.data.pie.PieDataset pieDataset31 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset22, (java.lang.Comparable) (short) 10, 0.0d);
        double double32 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset22 and pieDataset31", pieDataset22.equals(pieDataset31) ? pieDataset22.hashCode() == pieDataset31.hashCode() : true);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test362");
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
        org.jfree.data.pie.PieDataset pieDataset35 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset32, (java.lang.Comparable) 112.0d, (double) '4');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset21 and pieDataset32", pieDataset21.equals(pieDataset32) ? pieDataset21.hashCode() == pieDataset32.hashCode() : true);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test363");
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
        org.jfree.data.pie.PieDataset pieDataset32 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset22, (java.lang.Comparable) 200.0d, (double) 10L);
        org.jfree.data.pie.PieDataset pieDataset35 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset32, (java.lang.Comparable) 10.0d, (double) 0);
        boolean boolean36 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset32 and pieDataset35", pieDataset32.equals(pieDataset35) ? pieDataset32.hashCode() == pieDataset35.hashCode() : true);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test364");
        double[] doubleArray9 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray16 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray17 = new double[][] { doubleArray9, doubleArray16 };
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray17);
        org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset18, false);
        org.jfree.data.pie.PieDataset pieDataset22 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset18, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset25 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset22, (java.lang.Comparable) 100L, (double) 1);
        double double26 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset22);
        boolean boolean27 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset22);
        org.jfree.data.category.CategoryDataset categoryDataset28 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) (-1), (org.jfree.data.KeyedValues) pieDataset22);
        org.jfree.data.Range range29 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset28);
        org.jfree.data.pie.PieDataset pieDataset31 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset28, 0);
        java.lang.Number number32 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(categoryDataset28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset22 and pieDataset31", pieDataset22.equals(pieDataset31) ? pieDataset22.hashCode() == pieDataset31.hashCode() : true);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test365");
        double[] doubleArray9 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray16 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray17 = new double[][] { doubleArray9, doubleArray16 };
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray17);
        org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset18, false);
        org.jfree.data.pie.PieDataset pieDataset22 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset18, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset25 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset22, (java.lang.Comparable) 100L, (double) 1);
        org.jfree.data.pie.PieDataset pieDataset28 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset22, (java.lang.Comparable) (short) 1, 130.0d);
        boolean boolean29 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset28);
        org.jfree.data.category.CategoryDataset categoryDataset30 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 0.0d, (org.jfree.data.KeyedValues) pieDataset28);
        org.jfree.data.pie.PieDataset pieDataset32 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset30, 0);
        double double33 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset28 and pieDataset32", pieDataset28.equals(pieDataset32) ? pieDataset28.hashCode() == pieDataset32.hashCode() : true);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test366");
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
        org.jfree.data.pie.PieDataset pieDataset41 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset38, (java.lang.Comparable) (byte) -1, (double) '#');
        boolean boolean42 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset41);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset38 and pieDataset41", pieDataset38.equals(pieDataset41) ? pieDataset38.hashCode() == pieDataset41.hashCode() : true);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test367");
        double[] doubleArray10 = new double[] { (short) 0, (byte) 0 };
        double[][] doubleArray11 = new double[][] { doubleArray10 };
        org.jfree.data.category.CategoryDataset categoryDataset12 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray11);
        org.jfree.data.category.CategoryDataset categoryDataset13 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray11);
        org.jfree.data.category.CategoryDataset categoryDataset14 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray11);
        org.jfree.data.category.CategoryDataset categoryDataset15 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray11);
        org.jfree.data.Range range17 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset15, (double) (short) -1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset12 and categoryDataset15", categoryDataset12.equals(categoryDataset15) ? categoryDataset12.hashCode() == categoryDataset15.hashCode() : true);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test368");
        java.lang.Number[] numberArray8 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray13 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray18 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray23 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray24 = new java.lang.Number[][] { numberArray8, numberArray13, numberArray18, numberArray23 };
        org.jfree.data.category.CategoryDataset categoryDataset25 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray24);
        java.lang.Number number26 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(categoryDataset25);
        org.jfree.data.Range range28 = org.jfree.data.general.DatasetUtilities.findRangeBounds(categoryDataset25, true);
        java.lang.Number number29 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(categoryDataset25);
        org.jfree.data.pie.PieDataset pieDataset31 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset25, 0);
        org.jfree.data.category.CategoryDataset categoryDataset32 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) (byte) -1, (org.jfree.data.KeyedValues) pieDataset31);
        org.jfree.data.pie.PieDataset pieDataset36 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset31, (java.lang.Comparable) (byte) -1, (double) ' ', 100);
        org.jfree.data.category.CategoryDataset categoryDataset37 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 0L, (org.jfree.data.KeyedValues) pieDataset36);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset31 and pieDataset36", pieDataset31.equals(pieDataset36) ? pieDataset31.hashCode() == pieDataset36.hashCode() : true);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test369");
        double[] doubleArray12 = new double[] { (short) 0, (byte) 0 };
        double[][] doubleArray13 = new double[][] { doubleArray12 };
        org.jfree.data.category.CategoryDataset categoryDataset14 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray13);
        org.jfree.data.category.CategoryDataset categoryDataset15 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray13);
        org.jfree.data.category.CategoryDataset categoryDataset16 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray13);
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray13);
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray13);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset14 and categoryDataset18", categoryDataset14.equals(categoryDataset18) ? categoryDataset14.hashCode() == categoryDataset18.hashCode() : true);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test370");
        double[] doubleArray7 = new double[] { (short) 0, (byte) 0 };
        double[][] doubleArray8 = new double[][] { doubleArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray8);
        org.jfree.data.category.CategoryDataset categoryDataset10 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray8);
        java.lang.Number number11 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset10);
        org.jfree.data.pie.PieDataset pieDataset13 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset10, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset16 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset13, (java.lang.Comparable) (short) 100, (double) (short) 10);
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 1.0d, (org.jfree.data.KeyedValues) pieDataset13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset13 and pieDataset16", pieDataset13.equals(pieDataset16) ? pieDataset13.hashCode() == pieDataset16.hashCode() : true);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test371");
        double[] doubleArray10 = new double[] { (short) 0, (byte) 0 };
        double[][] doubleArray11 = new double[][] { doubleArray10 };
        org.jfree.data.category.CategoryDataset categoryDataset12 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray11);
        org.jfree.data.category.CategoryDataset categoryDataset13 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray11);
        org.jfree.data.category.CategoryDataset categoryDataset14 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray11);
        org.jfree.data.category.CategoryDataset categoryDataset15 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset12 and categoryDataset14", categoryDataset12.equals(categoryDataset14) ? categoryDataset12.hashCode() == categoryDataset14.hashCode() : true);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test372");
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
        org.jfree.data.pie.PieDataset pieDataset41 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset33, (java.lang.Comparable) 'a', (double) (short) 0, 10);
        org.jfree.data.pie.PieDataset pieDataset45 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset33, (java.lang.Comparable) 20.0d, (double) 'a', (int) (byte) 1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset33 and pieDataset41", pieDataset33.equals(pieDataset41) ? pieDataset33.hashCode() == pieDataset41.hashCode() : true);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test373");
        java.lang.Number[] numberArray14 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray19 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray24 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray29 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray30 = new java.lang.Number[][] { numberArray14, numberArray19, numberArray24, numberArray29 };
        org.jfree.data.category.CategoryDataset categoryDataset31 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray30);
        org.jfree.data.category.CategoryDataset categoryDataset32 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray30);
        org.jfree.data.category.CategoryDataset categoryDataset33 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray30);
        org.jfree.data.category.CategoryDataset categoryDataset34 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray30);
        org.jfree.data.category.CategoryDataset categoryDataset35 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset31 and categoryDataset34", categoryDataset31.equals(categoryDataset34) ? categoryDataset31.hashCode() == categoryDataset34.hashCode() : true);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test374");
        double[] doubleArray9 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray16 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray17 = new double[][] { doubleArray9, doubleArray16 };
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray17);
        org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset18, false);
        org.jfree.data.pie.PieDataset pieDataset22 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset18, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset25 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset22, (java.lang.Comparable) 100L, (double) 1);
        org.jfree.data.category.CategoryDataset categoryDataset26 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) (-1L), (org.jfree.data.KeyedValues) pieDataset25);
        org.jfree.data.pie.PieDataset pieDataset29 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset25, (java.lang.Comparable) 100.0d, (double) 1);
        boolean boolean30 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset25 and pieDataset29", pieDataset25.equals(pieDataset29) ? pieDataset25.hashCode() == pieDataset29.hashCode() : true);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test375");
        double[] doubleArray4 = new double[] {};
        double[][] doubleArray5 = new double[][] { doubleArray4 };
        org.jfree.data.category.CategoryDataset categoryDataset6 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray5);
        org.jfree.data.category.CategoryDataset categoryDataset7 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray5);
        boolean boolean8 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(categoryDataset7);
        org.jfree.data.pie.PieDataset pieDataset10 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset7, (int) ' ');
        org.jfree.data.Range range12 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset7, true);
        org.jfree.data.Range range14 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(categoryDataset7, 1.0d);
        org.jfree.data.pie.PieDataset pieDataset16 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset7, (java.lang.Comparable) 100.0f);
        org.jfree.data.pie.PieDataset pieDataset19 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset16, (java.lang.Comparable) (short) 1, (double) (byte) 0);
        org.jfree.data.pie.PieDataset pieDataset23 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset19, (java.lang.Comparable) 'a', (double) (-1), 10);
        org.jfree.data.pie.PieDataset pieDataset27 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset19, (java.lang.Comparable) 0.0f, (double) ' ', 0);
        org.jfree.data.pie.PieDataset pieDataset30 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset27, (java.lang.Comparable) 0, (double) 10);
        double double31 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset27 and pieDataset30", pieDataset27.equals(pieDataset30) ? pieDataset27.hashCode() == pieDataset30.hashCode() : true);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test376");
        double[] doubleArray9 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray16 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray17 = new double[][] { doubleArray9, doubleArray16 };
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray17);
        org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset18, false);
        org.jfree.data.pie.PieDataset pieDataset22 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset18, (int) (short) 0);
        org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset18, false);
        org.jfree.data.pie.PieDataset pieDataset26 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset18, 0);
        double double27 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset26);
        org.jfree.data.category.CategoryDataset categoryDataset28 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) "", (org.jfree.data.KeyedValues) pieDataset26);
        org.jfree.data.pie.PieDataset pieDataset31 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset26, (java.lang.Comparable) 'a', 20.0d);
        org.jfree.data.pie.PieDataset pieDataset35 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset26, (java.lang.Comparable) 100, 130.0d, (int) ' ');
        java.lang.Class<?> wildcardClass36 = pieDataset26.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset26 and pieDataset35", pieDataset26.equals(pieDataset35) ? pieDataset26.hashCode() == pieDataset35.hashCode() : true);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test377");
        double[] doubleArray10 = new double[] { (short) 0, (byte) 0 };
        double[][] doubleArray11 = new double[][] { doubleArray10 };
        org.jfree.data.category.CategoryDataset categoryDataset12 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray11);
        org.jfree.data.category.CategoryDataset categoryDataset13 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray11);
        org.jfree.data.category.CategoryDataset categoryDataset14 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray11);
        org.jfree.data.category.CategoryDataset categoryDataset15 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset12 and categoryDataset14", categoryDataset12.equals(categoryDataset14) ? categoryDataset12.hashCode() == categoryDataset14.hashCode() : true);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test378");
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
        double double35 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset23);
        org.jfree.data.pie.PieDataset pieDataset38 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset23, (java.lang.Comparable) (byte) 1, 0.0d);
        org.jfree.data.pie.PieDataset pieDataset41 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset38, (java.lang.Comparable) false, (double) 0L);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset23 and pieDataset38", pieDataset23.equals(pieDataset38) ? pieDataset23.hashCode() == pieDataset38.hashCode() : true);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test379");
        double[] doubleArray14 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray21 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray22 = new double[][] { doubleArray14, doubleArray21 };
        org.jfree.data.category.CategoryDataset categoryDataset23 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray22);
        org.jfree.data.category.CategoryDataset categoryDataset24 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray22);
        org.jfree.data.category.CategoryDataset categoryDataset25 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray22);
        org.jfree.data.category.CategoryDataset categoryDataset26 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray22);
        java.lang.Class<?> wildcardClass27 = categoryDataset26.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset23 and categoryDataset26", categoryDataset23.equals(categoryDataset26) ? categoryDataset23.hashCode() == categoryDataset26.hashCode() : true);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test380");
        double[] doubleArray9 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray16 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray17 = new double[][] { doubleArray9, doubleArray16 };
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray17);
        org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset18, false);
        org.jfree.data.pie.PieDataset pieDataset22 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset18, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset25 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset22, (java.lang.Comparable) 100L, (double) 1);
        org.jfree.data.pie.PieDataset pieDataset28 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset22, (java.lang.Comparable) (short) 1, 130.0d);
        boolean boolean29 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset28);
        org.jfree.data.category.CategoryDataset categoryDataset30 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 0.0d, (org.jfree.data.KeyedValues) pieDataset28);
        org.jfree.data.pie.PieDataset pieDataset32 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset30, 0);
        org.jfree.data.Range range33 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(categoryDataset30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset28 and pieDataset32", pieDataset28.equals(pieDataset32) ? pieDataset28.hashCode() == pieDataset32.hashCode() : true);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test381");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, false);
        org.jfree.data.pie.PieDataset pieDataset21 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset17, (int) (short) 0);
        double double22 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset21);
        boolean boolean23 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset21);
        org.jfree.data.pie.PieDataset pieDataset27 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset21, (java.lang.Comparable) 10.0f, (double) (short) 10, (int) (short) 1);
        org.jfree.data.pie.PieDataset pieDataset31 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset27, (java.lang.Comparable) 100L, (double) 100.0f, (int) (short) 100);
        org.jfree.data.pie.PieDataset pieDataset35 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset31, (java.lang.Comparable) 20.0d, (double) 0, (int) (byte) 10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset27 and pieDataset31", pieDataset27.equals(pieDataset31) ? pieDataset27.hashCode() == pieDataset31.hashCode() : true);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test382");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, false);
        org.jfree.data.pie.PieDataset pieDataset21 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset17, (int) (short) 0);
        java.lang.Number number22 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(categoryDataset17);
        org.jfree.data.Range range24 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, true);
        java.lang.Number number25 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset17);
        org.jfree.data.pie.PieDataset pieDataset27 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset17, 0);
        boolean boolean28 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset21 and pieDataset27", pieDataset21.equals(pieDataset27) ? pieDataset21.hashCode() == pieDataset27.hashCode() : true);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test383");
        double[] doubleArray7 = new double[] { (short) 0, (byte) 0 };
        double[][] doubleArray8 = new double[][] { doubleArray7 };
        org.jfree.data.category.CategoryDataset categoryDataset9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray8);
        org.jfree.data.category.CategoryDataset categoryDataset10 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray8);
        java.lang.Number number11 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset10);
        org.jfree.data.pie.PieDataset pieDataset13 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset10, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset16 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset13, (java.lang.Comparable) (short) 100, (double) (short) 10);
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) (-1L), (org.jfree.data.KeyedValues) pieDataset16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset13 and pieDataset16", pieDataset13.equals(pieDataset16) ? pieDataset13.hashCode() == pieDataset16.hashCode() : true);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test384");
        double[] doubleArray9 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray16 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray17 = new double[][] { doubleArray9, doubleArray16 };
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray17);
        org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset18, false);
        org.jfree.data.pie.PieDataset pieDataset22 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset18, (int) (short) 0);
        double double23 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset22);
        boolean boolean24 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset22);
        org.jfree.data.pie.PieDataset pieDataset28 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset22, (java.lang.Comparable) 10.0f, (double) (short) 10, (int) (short) 1);
        org.jfree.data.pie.PieDataset pieDataset32 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset28, (java.lang.Comparable) 100L, (double) 100.0f, (int) (short) 100);
        org.jfree.data.category.CategoryDataset categoryDataset33 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 0L, (org.jfree.data.KeyedValues) pieDataset28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset28 and pieDataset32", pieDataset28.equals(pieDataset32) ? pieDataset28.hashCode() == pieDataset32.hashCode() : true);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test385");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, false);
        org.jfree.data.pie.PieDataset pieDataset21 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset17, (int) (short) 0);
        double double22 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset21);
        boolean boolean23 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset21);
        org.jfree.data.pie.PieDataset pieDataset27 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset21, (java.lang.Comparable) 10.0f, (double) (short) 10, (int) (short) 1);
        org.jfree.data.pie.PieDataset pieDataset31 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset27, (java.lang.Comparable) 100L, (double) 100.0f, (int) (short) 100);
        org.jfree.data.pie.PieDataset pieDataset35 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset31, (java.lang.Comparable) 10L, (double) (-1), (int) (short) -1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset27 and pieDataset31", pieDataset27.equals(pieDataset31) ? pieDataset27.hashCode() == pieDataset31.hashCode() : true);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test386");
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
        org.jfree.data.pie.PieDataset pieDataset37 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset23, (java.lang.Comparable) 10.0d, (double) 100.0f, (-1));
        org.jfree.data.category.CategoryDataset categoryDataset38 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 10L, (org.jfree.data.KeyedValues) pieDataset37);
        org.jfree.data.pie.PieDataset pieDataset41 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset37, (java.lang.Comparable) 10, 200.0d);
        boolean boolean42 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset41);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset37 and pieDataset41", pieDataset37.equals(pieDataset41) ? pieDataset37.hashCode() == pieDataset41.hashCode() : true);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test387");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, false);
        org.jfree.data.pie.PieDataset pieDataset21 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset17, (int) (short) 0);
        double double22 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset21);
        boolean boolean23 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset21);
        org.jfree.data.pie.PieDataset pieDataset26 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset21, (java.lang.Comparable) (-1L), 400.0d);
        org.jfree.data.pie.PieDataset pieDataset30 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset26, (java.lang.Comparable) 0.0d, (double) 100, (int) (short) -1);
        org.jfree.data.pie.PieDataset pieDataset34 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset26, (java.lang.Comparable) 1, (double) 1.0f, 10);
        boolean boolean35 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset26 and pieDataset34", pieDataset26.equals(pieDataset34) ? pieDataset26.hashCode() == pieDataset34.hashCode() : true);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test388");
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
        org.jfree.data.pie.PieDataset pieDataset35 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset21, (java.lang.Comparable) '#', (double) (short) -1, (int) (short) 0);
        double double36 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset21);
        org.jfree.data.pie.PieDataset pieDataset39 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset21, (java.lang.Comparable) '#', (double) (-1.0f));
        boolean boolean40 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset21 and pieDataset39", pieDataset21.equals(pieDataset39) ? pieDataset21.hashCode() == pieDataset39.hashCode() : true);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test389");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, false);
        org.jfree.data.pie.PieDataset pieDataset21 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset17, (int) (short) 0);
        double double22 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset21);
        boolean boolean23 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset21);
        org.jfree.data.pie.PieDataset pieDataset26 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset21, (java.lang.Comparable) (-1L), 400.0d);
        org.jfree.data.pie.PieDataset pieDataset30 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset26, (java.lang.Comparable) 0.0d, (double) 100, (int) (short) -1);
        org.jfree.data.pie.PieDataset pieDataset34 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset26, (java.lang.Comparable) 1, (double) 1.0f, 10);
        double double35 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset26 and pieDataset34", pieDataset26.equals(pieDataset34) ? pieDataset26.hashCode() == pieDataset34.hashCode() : true);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test390");
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
        org.jfree.data.pie.PieDataset pieDataset37 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset23, (java.lang.Comparable) (short) 0, (double) 1, (int) (short) 1);
        org.jfree.data.pie.PieDataset pieDataset41 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset23, (java.lang.Comparable) (short) 0, (double) 100.0f, (int) '#');
        org.jfree.data.pie.PieDataset pieDataset44 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset23, (java.lang.Comparable) false, 400.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset23 and pieDataset41", pieDataset23.equals(pieDataset41) ? pieDataset23.hashCode() == pieDataset41.hashCode() : true);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test391");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, false);
        org.jfree.data.pie.PieDataset pieDataset21 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset17, (int) (short) 0);
        double double22 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset21);
        org.jfree.data.pie.PieDataset pieDataset26 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset21, (java.lang.Comparable) (-1L), (double) (short) 0, (int) (short) 10);
        boolean boolean27 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset21 and pieDataset26", pieDataset21.equals(pieDataset26) ? pieDataset21.hashCode() == pieDataset26.hashCode() : true);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test392");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, false);
        org.jfree.data.pie.PieDataset pieDataset21 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset17, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset24 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset21, (java.lang.Comparable) 100L, (double) 1);
        org.jfree.data.pie.PieDataset pieDataset28 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset21, (java.lang.Comparable) false, (double) 100.0f, (int) (short) 100);
        double double29 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset21 and pieDataset28", pieDataset21.equals(pieDataset28) ? pieDataset21.hashCode() == pieDataset28.hashCode() : true);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test393");
        double[] doubleArray9 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray16 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray17 = new double[][] { doubleArray9, doubleArray16 };
        org.jfree.data.category.CategoryDataset categoryDataset18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray17);
        org.jfree.data.Range range20 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset18, false);
        org.jfree.data.pie.PieDataset pieDataset22 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset18, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset25 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset22, (java.lang.Comparable) 100L, (double) 1);
        double double26 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset22);
        org.jfree.data.category.CategoryDataset categoryDataset27 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) 100.0f, (org.jfree.data.KeyedValues) pieDataset22);
        org.jfree.data.pie.PieDataset pieDataset30 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset22, (java.lang.Comparable) 10, (double) (-1));
        double double31 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset22 and pieDataset30", pieDataset22.equals(pieDataset30) ? pieDataset22.hashCode() == pieDataset30.hashCode() : true);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test394");
        double[] doubleArray18 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray25 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray26 = new double[][] { doubleArray18, doubleArray25 };
        org.jfree.data.category.CategoryDataset categoryDataset27 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray26);
        org.jfree.data.category.CategoryDataset categoryDataset28 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "hi!", doubleArray26);
        org.jfree.data.category.CategoryDataset categoryDataset29 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", doubleArray26);
        org.jfree.data.category.CategoryDataset categoryDataset30 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", doubleArray26);
        org.jfree.data.category.CategoryDataset categoryDataset31 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray26);
        org.jfree.data.category.CategoryDataset categoryDataset32 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryDataset27 and categoryDataset31", categoryDataset27.equals(categoryDataset31) ? categoryDataset27.hashCode() == categoryDataset31.hashCode() : true);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test395");
        java.lang.Number[] numberArray11 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray16 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray21 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[] numberArray26 = new java.lang.Number[] { 100.0f, 1.0f, (short) 10, 1L };
        java.lang.Number[][] numberArray27 = new java.lang.Number[][] { numberArray11, numberArray16, numberArray21, numberArray26 };
        org.jfree.data.category.CategoryDataset categoryDataset28 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "hi!", numberArray27);
        org.jfree.data.category.CategoryDataset categoryDataset29 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", numberArray27);
        org.jfree.data.category.CategoryDataset categoryDataset30 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("hi!", "", numberArray27);
        java.lang.Number number31 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset30);
        java.lang.Number number32 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(categoryDataset30);
        java.lang.Number number33 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(categoryDataset30);
        java.lang.Number number34 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(categoryDataset30);
        org.jfree.data.pie.PieDataset pieDataset36 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(categoryDataset30, (int) (byte) 0);
        boolean boolean37 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset36);
        boolean boolean38 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset36);
        org.jfree.data.category.CategoryDataset categoryDataset39 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable) (byte) 10, (org.jfree.data.KeyedValues) pieDataset36);
        org.jfree.data.pie.PieDataset pieDataset43 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset36, (java.lang.Comparable) (byte) 1, (double) 100L, (int) '4');
        double double44 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset36);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset36 and pieDataset43", pieDataset36.equals(pieDataset43) ? pieDataset36.hashCode() == pieDataset43.hashCode() : true);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test396");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, false);
        org.jfree.data.pie.PieDataset pieDataset21 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset17, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset24 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset21, (java.lang.Comparable) 100L, (double) 1);
        boolean boolean25 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset21);
        boolean boolean26 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset21);
        double double27 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset21);
        org.jfree.data.pie.PieDataset pieDataset31 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset21, (java.lang.Comparable) (byte) 100, (double) 1, (int) (byte) 0);
        org.jfree.data.pie.PieDataset pieDataset34 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset31, (java.lang.Comparable) (-1), (double) 'a');
        org.jfree.data.pie.PieDataset pieDataset37 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset34, (java.lang.Comparable) (byte) 1, 20.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset31 and pieDataset34", pieDataset31.equals(pieDataset34) ? pieDataset31.hashCode() == pieDataset34.hashCode() : true);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test397");
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
        org.jfree.data.pie.PieDataset pieDataset37 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset22, (java.lang.Comparable) 10L, (double) 10.0f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset22 and pieDataset34", pieDataset22.equals(pieDataset34) ? pieDataset22.hashCode() == pieDataset34.hashCode() : true);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test398");
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
        org.jfree.data.pie.PieDataset pieDataset32 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset22, (java.lang.Comparable) 200.0d, (double) 10L);
        org.jfree.data.pie.PieDataset pieDataset35 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset22, (java.lang.Comparable) 20.0d, (double) (short) 0);
        boolean boolean36 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(pieDataset22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset22 and pieDataset35", pieDataset22.equals(pieDataset35) ? pieDataset22.hashCode() == pieDataset35.hashCode() : true);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test399");
        double[] doubleArray8 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 10, 0L, 10.0d, 0L, 100.0d, (short) 10 };
        double[][] doubleArray16 = new double[][] { doubleArray8, doubleArray15 };
        org.jfree.data.category.CategoryDataset categoryDataset17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "", doubleArray16);
        org.jfree.data.Range range19 = org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(categoryDataset17, false);
        org.jfree.data.pie.PieDataset pieDataset21 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(categoryDataset17, (int) (short) 0);
        org.jfree.data.pie.PieDataset pieDataset24 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset21, (java.lang.Comparable) ' ', (double) '#');
        org.jfree.data.pie.PieDataset pieDataset28 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset24, (java.lang.Comparable) false, (double) 10L, (int) (short) 100);
        double double29 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset24 and pieDataset28", pieDataset24.equals(pieDataset28) ? pieDataset24.hashCode() == pieDataset28.hashCode() : true);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test400");
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
        double double38 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(pieDataset33);
        org.jfree.data.pie.PieDataset pieDataset42 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset33, (java.lang.Comparable) (short) -1, (double) (byte) 10, (int) ' ');
        org.jfree.data.pie.PieDataset pieDataset46 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(pieDataset33, (java.lang.Comparable) "", 10.0d, 1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieDataset33 and pieDataset42", pieDataset33.equals(pieDataset42) ? pieDataset33.hashCode() == pieDataset42.hashCode() : true);
    }
}

