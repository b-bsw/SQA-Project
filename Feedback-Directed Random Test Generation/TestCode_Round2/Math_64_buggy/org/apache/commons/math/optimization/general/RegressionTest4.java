package org.apache.commons.math.optimization.general;

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
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        int int9 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair12 = levenbergMarquardtOptimizer0.doOptimize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) '#');
        levenbergMarquardtOptimizer0.setQRRankingThreshold(Double.NaN);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 52);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker10 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker12 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker12);
        java.lang.Class<?> wildcardClass14 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) 10);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (-1L));
        int int13 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (byte) 100);
        double double16 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxEvaluations((-1));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker19 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setQRRankingThreshold(0.0d);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray22 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNull(vectorialConvergenceChecker19);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        int int1 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) '4');
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 1L);
        int int6 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) 10);
        int int10 = levenbergMarquardtOptimizer0.getEvaluations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1000 + "'", int1 == 1000);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        levenbergMarquardtOptimizer0.setParRelativeTolerance(0.0d);
        int int9 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 1000);
        int int12 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setMaxEvaluations(35);
        double double15 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) 1);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction18 = null;
        double[] doubleArray20 = new double[] { 1000 };
        double[] doubleArray25 = new double[] { 1000, 10.0d, 52, 0.0f };
        double[] doubleArray27 = new double[] { (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair28 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction18, doubleArray20, doubleArray25, doubleArray27);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimensions mismatch 1 != 4");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1000 + "'", int12 == 1000);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 1000.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { 1000.0d, 10.0d, 52.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertArrayEquals(doubleArray27, new double[] { 100.0d }, 1.0E-15);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        levenbergMarquardtOptimizer0.setParRelativeTolerance(0.0d);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0);
        int int11 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int12 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray13 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(0.0d);
        int int6 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 2147483647);
        int int9 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1000 + "'", int9 == 1000);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        int int1 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) '4');
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 1L);
        int int6 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance(1.0d);
        int int9 = levenbergMarquardtOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker10 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1000 + "'", int1 == 1000);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker10);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        double double9 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker10 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) -1);
        double double13 = levenbergMarquardtOptimizer0.getChiSquare();
        int int14 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNull(vectorialConvergenceChecker10);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker1);
        levenbergMarquardtOptimizer0.setParRelativeTolerance(Double.NaN);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1L);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(1.0d);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1L));
        int int11 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 100.0f);
        int int14 = levenbergMarquardtOptimizer0.getIterations();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair15 = levenbergMarquardtOptimizer0.doOptimize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1000 + "'", int11 == 1000);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        int int1 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) '4');
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 1L);
        int int6 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker8 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double double9 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (-1));
        int int12 = levenbergMarquardtOptimizer0.getEvaluations();
        double double13 = levenbergMarquardtOptimizer0.getChiSquare();
        int int14 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1000 + "'", int1 == 1000);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        int int1 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) '4');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker4 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '#');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 10.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1000 + "'", int1 == 1000);
        org.junit.Assert.assertNull(vectorialConvergenceChecker4);
        org.junit.Assert.assertNull(vectorialConvergenceChecker5);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) 10);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (-1L));
        int int13 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (byte) 100);
        double double16 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxEvaluations((-1));
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) '4');
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray21 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) 10);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0L);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker13 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker13);
        double double15 = levenbergMarquardtOptimizer0.getRMS();
        double double16 = levenbergMarquardtOptimizer0.getRMS();
        int int17 = levenbergMarquardtOptimizer0.getEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray18 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 1.0f);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(1.0d);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker14 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setMaxEvaluations((-1));
        int int17 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1000 + "'", int17 == 1000);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        int int9 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 0.0f);
        double double12 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker13 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker13);
        double double15 = levenbergMarquardtOptimizer0.getRMS();
        java.lang.Class<?> wildcardClass16 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        int int1 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 10.0f);
        levenbergMarquardtOptimizer0.setMaxIterations(10);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker8 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction9 = null;
        double[] doubleArray10 = null;
        double[] doubleArray12 = new double[] { (short) 1 };
        double[] doubleArray18 = new double[] { 1000, 2147483647, (byte) 100, 0, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair19 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction9, doubleArray10, doubleArray12, doubleArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1000 + "'", int1 == 1000);
        org.junit.Assert.assertNull(vectorialConvergenceChecker8);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 1000.0d, 2.147483647E9d, 100.0d, 0.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) 10);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (-1L));
        int int13 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (byte) 100);
        levenbergMarquardtOptimizer0.setMaxIterations(2147483647);
        int int18 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int19 = levenbergMarquardtOptimizer0.getEvaluations();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        levenbergMarquardtOptimizer0.setParRelativeTolerance(0.0d);
        int int9 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 1000);
        int int12 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setMaxEvaluations(35);
        java.lang.Class<?> wildcardClass15 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1000 + "'", int12 == 1000);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        int int1 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 10.0f);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 1);
        int int6 = levenbergMarquardtOptimizer0.getIterations();
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker9 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker9);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1000 + "'", int1 == 1000);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) 10);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0L);
        int int13 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker14 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (short) 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertNull(vectorialConvergenceChecker14);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(0.0d);
        int int6 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 2147483647);
        int int9 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        int int1 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int2 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setQRRankingThreshold(100.0d);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) -1);
        levenbergMarquardtOptimizer0.setMaxEvaluations(100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1000 + "'", int1 == 1000);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) -1);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker9 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker9);
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(0.0d);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 10L);
        int int16 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int17 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 0.0f);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 1);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 100L);
        double double5 = levenbergMarquardtOptimizer0.getChiSquare();
        double double6 = levenbergMarquardtOptimizer0.getChiSquare();
        double double7 = levenbergMarquardtOptimizer0.getRMS();
        double double8 = levenbergMarquardtOptimizer0.getRMS();
        int int9 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int10 = levenbergMarquardtOptimizer0.getMaxIterations();
        double double11 = levenbergMarquardtOptimizer0.getRMS();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1000 + "'", int9 == 1000);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1000 + "'", int10 == 1000);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker1);
        levenbergMarquardtOptimizer0.setParRelativeTolerance(Double.NaN);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(10.0d);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getEvaluations();
        double double9 = levenbergMarquardtOptimizer0.getChiSquare();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction10 = null;
        double[] doubleArray12 = new double[] { (-1L) };
        double[] doubleArray19 = new double[] { 97, 10, 1000, 97, 1, (short) 0 };
        double[] doubleArray25 = new double[] { 1, (short) 100, 'a', 97, 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair26 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction10, doubleArray12, doubleArray19, doubleArray25);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimensions mismatch 1 != 6");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 97.0d, 10.0d, 1000.0d, 97.0d, 1.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { 1.0d, 100.0d, 97.0d, 97.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double1 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (short) 1);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(0.0d);
        int int6 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        int int3 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(2147483647);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker8 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (short) 0);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1.0f));
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) -1);
        int int15 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        double double16 = levenbergMarquardtOptimizer0.getRMS();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1000 + "'", int3 == 1000);
        org.junit.Assert.assertNull(vectorialConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        int int3 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double6 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        double double9 = levenbergMarquardtOptimizer0.getChiSquare();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1000 + "'", int3 == 1000);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 1);
        int int9 = levenbergMarquardtOptimizer0.getEvaluations();
        int int10 = levenbergMarquardtOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker11 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) -1);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 100.0f);
        int int18 = levenbergMarquardtOptimizer0.getEvaluations();
        int int19 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair20 = levenbergMarquardtOptimizer0.doOptimize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        int int1 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 10.0f);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 10);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 'a');
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) 'a');
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 100.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1000 + "'", int1 == 1000);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 1);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 100L);
        double double5 = levenbergMarquardtOptimizer0.getChiSquare();
        int int6 = levenbergMarquardtOptimizer0.getIterations();
        int int7 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 100);
        double double10 = levenbergMarquardtOptimizer0.getRMS();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray11 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) '#');
        levenbergMarquardtOptimizer0.setQRRankingThreshold(Double.NaN);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker8 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker8);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 0);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction12 = null;
        double[] doubleArray18 = new double[] { 100, 1L, (short) -1, 97, 'a' };
        double[] doubleArray20 = new double[] { 32 };
        double[] doubleArray27 = new double[] { Double.NaN, (short) 100, 97, (-1L), 1.0d, 97 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair28 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction12, doubleArray18, doubleArray20, doubleArray27);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimensions mismatch 5 != 1");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 100.0d, 1.0d, (-1.0d), 97.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertArrayEquals(doubleArray27, new double[] { Double.NaN, 100.0d, 97.0d, (-1.0d), 1.0d, 97.0d }, 1.0E-15);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) 10);
        int int11 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker12 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker12);
        int int14 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        double double15 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        int int1 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) '4');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker4 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) '#');
        int int7 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(1.0d);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray10 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1000 + "'", int1 == 1000);
        org.junit.Assert.assertNull(vectorialConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double1 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker4 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance(100.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(vectorialConvergenceChecker4);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        int int3 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(2147483647);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 100L);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (-1L));
        int int12 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1000 + "'", int3 == 1000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 1);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 10);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) (-1));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker7 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker7);
        int int9 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) -1);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 0.0f);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        int int1 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) '4');
        int int4 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (-1.0f));
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1000 + "'", int1 == 1000);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((-1.0d));
        double double11 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) 'a');
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) 10);
        int int16 = levenbergMarquardtOptimizer0.getIterations();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 1);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 100L);
        double double5 = levenbergMarquardtOptimizer0.getChiSquare();
        double double6 = levenbergMarquardtOptimizer0.getChiSquare();
        double double7 = levenbergMarquardtOptimizer0.getRMS();
        double double8 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 1000);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray13 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 1);
        int int3 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int4 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int5 = levenbergMarquardtOptimizer0.getIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1000 + "'", int3 == 1000);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1000 + "'", int4 == 1000);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 1);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 100L);
        double double5 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 52);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker8 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker8);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 2147483647);
        int int12 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int13 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker16 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker16);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker18 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker18);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) 10);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (-1L));
        int int13 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (byte) 100);
        double double16 = levenbergMarquardtOptimizer0.getChiSquare();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker17 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker17);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 100L);
        double double21 = levenbergMarquardtOptimizer0.getRMS();
        double double22 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (short) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker25 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker25);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 1.0f);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker10 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker10);
        levenbergMarquardtOptimizer0.setQRRankingThreshold(1.0d);
        double double14 = levenbergMarquardtOptimizer0.getRMS();
        int int15 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 100);
        int int18 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker1);
        levenbergMarquardtOptimizer0.setParRelativeTolerance(Double.NaN);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 1);
        int int7 = levenbergMarquardtOptimizer0.getEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int9 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int10 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) '4');
        int int13 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) -1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1000 + "'", int8 == 1000);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1000 + "'", int10 == 1000);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        int int5 = levenbergMarquardtOptimizer0.getMaxIterations();
        double double6 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 1000);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 1);
        int int11 = levenbergMarquardtOptimizer0.getEvaluations();
        int int12 = levenbergMarquardtOptimizer0.getIterations();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction13 = null;
        double[] doubleArray14 = new double[] {};
        double[] doubleArray16 = new double[] { (byte) -1 };
        double[] doubleArray17 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair18 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction13, doubleArray14, doubleArray16, doubleArray17);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimensions mismatch 0 != 1");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1000 + "'", int5 == 1000);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] {}, 1.0E-15);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 1);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 10);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(0.0d);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) 1);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 0);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 100);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) (short) 100);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (byte) -1);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 1.0f);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker10 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker10);
        levenbergMarquardtOptimizer0.setMaxIterations((int) 'a');
        double double14 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) ' ');
        int int17 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double9 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (short) 1);
        double double12 = levenbergMarquardtOptimizer0.getChiSquare();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair13 = levenbergMarquardtOptimizer0.doOptimize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double9 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 0);
        int int12 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) 100);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) (short) 0);
        int int17 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 1);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 100L);
        double double5 = levenbergMarquardtOptimizer0.getChiSquare();
        int int6 = levenbergMarquardtOptimizer0.getIterations();
        int int7 = levenbergMarquardtOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker8 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker8);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) (-1L));
        int int12 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int13 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '#');
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 100);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1000 + "'", int13 == 1000);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 1.0f);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker10 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker10);
        int int12 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance(1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        levenbergMarquardtOptimizer0.setParRelativeTolerance(0.0d);
        int int9 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (short) 100);
        double double12 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1000);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker1);
        levenbergMarquardtOptimizer0.setParRelativeTolerance(Double.NaN);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 1);
        int int7 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        int int10 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int11 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1000 + "'", int10 == 1000);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        double double4 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int6 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker9 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker9);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) (-1L));
        int int13 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNull(vectorialConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        double double9 = levenbergMarquardtOptimizer0.getChiSquare();
        int int10 = levenbergMarquardtOptimizer0.getEvaluations();
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker14 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker14);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            double[][] doubleArray18 = levenbergMarquardtOptimizer0.getCovariances();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 1.0f);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(1.0d);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker14 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker14);
        int int16 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int17 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1000 + "'", int16 == 1000);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 1);
        int int9 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (-1L));
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1.0f);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 1);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 100L);
        double double5 = levenbergMarquardtOptimizer0.getChiSquare();
        double double6 = levenbergMarquardtOptimizer0.getChiSquare();
        int int7 = levenbergMarquardtOptimizer0.getEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker9 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int10 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) -1);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker9 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker9);
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setMaxEvaluations(10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 100);
        int int16 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (byte) 100);
        double double19 = levenbergMarquardtOptimizer0.getChiSquare();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        double double9 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 2147483647);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        double double14 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker15 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int16 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertNull(vectorialConvergenceChecker15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 1.0f);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(1.0d);
        levenbergMarquardtOptimizer0.setQRRankingThreshold(0.0d);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(Double.NaN);
        double double16 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 1);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 100L);
        double double5 = levenbergMarquardtOptimizer0.getChiSquare();
        int int6 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 0);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(1.0d);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (-1L));
        levenbergMarquardtOptimizer0.setMaxIterations((-1));
        int int15 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setQRRankingThreshold(0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double double4 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 52);
        double double7 = levenbergMarquardtOptimizer0.getChiSquare();
        double double8 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 10.0f);
        org.junit.Assert.assertNull(vectorialConvergenceChecker3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double9 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 0);
        int int12 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int13 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (-1.0f));
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction18 = null;
        double[] doubleArray20 = new double[] { 1000 };
        double[] doubleArray25 = new double[] { 0.0d, 0L, (byte) 100, 100 };
        double[] doubleArray26 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair27 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction18, doubleArray20, doubleArray25, doubleArray26);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimensions mismatch 1 != 4");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 1000.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { 0.0d, 0.0d, 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertArrayEquals(doubleArray26, new double[] {}, 1.0E-15);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) 10);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0L);
        int int13 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        double double14 = levenbergMarquardtOptimizer0.getRMS();
        int int15 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 1);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(100.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        double double9 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 2147483647);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1.0f);
        int int16 = levenbergMarquardtOptimizer0.getIterations();
        // The following exception was thrown during execution in test generation
        try {
            double[][] doubleArray17 = levenbergMarquardtOptimizer0.getCovariances();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        int int1 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 10.0f);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 10);
        int int6 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 10.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1000 + "'", int1 == 1000);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 1);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) ' ');
        int int5 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 1000);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 0);
        double double10 = levenbergMarquardtOptimizer0.getRMS();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) 10);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (-1L));
        int int13 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        double double14 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (short) -1);
        double double17 = levenbergMarquardtOptimizer0.getRMS();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray18 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 1);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 100L);
        double double5 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 52);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker8 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker8);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 2147483647);
        int int12 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) ' ');
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) 100);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) ' ');
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray19 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        int int1 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) '4');
        double double4 = levenbergMarquardtOptimizer0.getRMS();
        double double5 = levenbergMarquardtOptimizer0.getChiSquare();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker6 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker6);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 'a');
        int int10 = levenbergMarquardtOptimizer0.getIterations();
        java.lang.Class<?> wildcardClass11 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1000 + "'", int1 == 1000);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        int int1 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 10.0f);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 1);
        int int6 = levenbergMarquardtOptimizer0.getIterations();
        int int7 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1000 + "'", int1 == 1000);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1000 + "'", int8 == 1000);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) 10);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (-1L));
        int int13 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (byte) 100);
        double double16 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxEvaluations((-1));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker19 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int20 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 1000);
        int int23 = levenbergMarquardtOptimizer0.getIterations();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNull(vectorialConvergenceChecker19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double9 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 0);
        int int12 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int13 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int14 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        int int9 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int10 = levenbergMarquardtOptimizer0.getIterations();
        int int11 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        levenbergMarquardtOptimizer0.setParRelativeTolerance(0.0d);
        int int9 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker10 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int11 = levenbergMarquardtOptimizer0.getMaxIterations();
        double double12 = levenbergMarquardtOptimizer0.getChiSquare();
        int int13 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        double double14 = levenbergMarquardtOptimizer0.getChiSquare();
        int int15 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 1.0f);
        levenbergMarquardtOptimizer0.setOrthoTolerance((-1.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1000 + "'", int11 == 1000);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 1);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 100L);
        double double5 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 52);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker8 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker8);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 2147483647);
        int int12 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        double double13 = levenbergMarquardtOptimizer0.getRMS();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker1);
        levenbergMarquardtOptimizer0.setParRelativeTolerance(Double.NaN);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 1);
        int int7 = levenbergMarquardtOptimizer0.getEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int9 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int10 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) '4');
        levenbergMarquardtOptimizer0.setQRRankingThreshold(10.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1000 + "'", int8 == 1000);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1000 + "'", int10 == 1000);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '#');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setMaxEvaluations(1000);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((-1.0d));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker10 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double9 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 0);
        int int12 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int13 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (-1.0f));
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair20 = levenbergMarquardtOptimizer0.doOptimize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        int int5 = levenbergMarquardtOptimizer0.getMaxIterations();
        double double6 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 1000);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker9 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray10 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1000 + "'", int5 == 1000);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(vectorialConvergenceChecker9);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 1);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) ' ');
        int int5 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setQRRankingThreshold(1.0d);
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setQRRankingThreshold(0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) 10);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (-1L));
        int int13 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (byte) 100);
        double double16 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxEvaluations((-1));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker19 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setQRRankingThreshold(0.0d);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair22 = levenbergMarquardtOptimizer0.doOptimize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNull(vectorialConvergenceChecker19);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        int int3 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double6 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) '4');
        double double11 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setQRRankingThreshold(0.0d);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 1L);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker16 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1000 + "'", int3 == 1000);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNull(vectorialConvergenceChecker16);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        levenbergMarquardtOptimizer0.setParRelativeTolerance(0.0d);
        int int9 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (short) 100);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) -1);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction14 = null;
        double[] doubleArray17 = new double[] { 32, 2147483647 };
        double[] doubleArray20 = new double[] { 100.0d, (short) 0 };
        double[] doubleArray26 = new double[] { 1.0d, (byte) 10, (-1), 100.0d, 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair27 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction14, doubleArray17, doubleArray20, doubleArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 32.0d, 2.147483647E9d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertArrayEquals(doubleArray26, new double[] { 1.0d, 10.0d, (-1.0d), 100.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        int int1 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) '4');
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 1L);
        int int6 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int7 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setQRRankingThreshold(0.0d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1000 + "'", int1 == 1000);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) -1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker7 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int8 = levenbergMarquardtOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker9 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker10 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair12 = levenbergMarquardtOptimizer0.doOptimize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(vectorialConvergenceChecker7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker9);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        int int5 = levenbergMarquardtOptimizer0.getMaxIterations();
        double double6 = levenbergMarquardtOptimizer0.getChiSquare();
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        double double9 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction10 = null;
        double[] doubleArray17 = new double[] { ' ', 100L, '#', (byte) -1, 35, (short) 1 };
        double[] doubleArray24 = new double[] { (byte) 10, (short) 10, 1L, '4', 2147483647, 'a' };
        double[] doubleArray26 = new double[] { 10.0f };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair27 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction10, doubleArray17, doubleArray24, doubleArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1000 + "'", int5 == 1000);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 32.0d, 100.0d, 35.0d, (-1.0d), 35.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] { 10.0d, 10.0d, 1.0d, 52.0d, 2.147483647E9d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertArrayEquals(doubleArray26, new double[] { 10.0d }, 1.0E-15);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        double double4 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int6 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 0);
        int int9 = levenbergMarquardtOptimizer0.getIterations();
        int int10 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNull(vectorialConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 1);
        int int9 = levenbergMarquardtOptimizer0.getEvaluations();
        int int10 = levenbergMarquardtOptimizer0.getEvaluations();
        double double11 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setOrthoTolerance(Double.NaN);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 0);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 0);
        levenbergMarquardtOptimizer0.setMaxEvaluations(0);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 1);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 100);
        int int24 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) 10);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (-1L));
        int int13 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 'a');
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 1);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 100L);
        double double5 = levenbergMarquardtOptimizer0.getChiSquare();
        int int6 = levenbergMarquardtOptimizer0.getIterations();
        int int7 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) ' ');
        int int10 = levenbergMarquardtOptimizer0.getEvaluations();
        double double11 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxIterations((-1));
        int int14 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 0L);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 1);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 100L);
        int int5 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int6 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 100L);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 0.0f);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker11 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker11);
        int int13 = levenbergMarquardtOptimizer0.getIterations();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1000 + "'", int5 == 1000);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 1);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 100L);
        int int5 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int6 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        double double9 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) -1);
        int int12 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1000 + "'", int5 == 1000);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1000 + "'", int12 == 1000);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double1 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (short) 1);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) '#');
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 0L);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker8 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker8);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker10 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction11 = null;
        double[] doubleArray12 = new double[] {};
        double[] doubleArray14 = new double[] { (-1.0f) };
        double[] doubleArray19 = new double[] { 10.0f, 100, 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair20 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction11, doubleArray12, doubleArray14, doubleArray19);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimensions mismatch 0 != 1");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(vectorialConvergenceChecker10);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 10.0d, 100.0d, 1.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 1);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 100L);
        double double5 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) -1);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 10L);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) 10);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0L);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker13 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker13);
        double double15 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setParRelativeTolerance(100.0d);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(100.0d);
        double double20 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setOrthoTolerance(1.0d);
        levenbergMarquardtOptimizer0.setMaxIterations(97);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction25 = null;
        double[] doubleArray29 = new double[] { (byte) 100, (byte) 10, 100L };
        double[] doubleArray35 = new double[] { 10, 100.0d, 100.0f, 0L, (-1L) };
        double[] doubleArray42 = new double[] { (byte) -1, 0.0f, (-1), (byte) 1, 0.0f, 10.0d };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair43 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction25, doubleArray29, doubleArray35, doubleArray42);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimensions mismatch 3 != 5");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 100.0d, 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { 10.0d, 100.0d, 100.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertArrayEquals(doubleArray42, new double[] { (-1.0d), 0.0d, (-1.0d), 1.0d, 0.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) -1);
        double double7 = levenbergMarquardtOptimizer0.getChiSquare();
        double double8 = levenbergMarquardtOptimizer0.getRMS();
        double double9 = levenbergMarquardtOptimizer0.getRMS();
        int int10 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1L);
        double double13 = levenbergMarquardtOptimizer0.getRMS();
        double double14 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 1);
        int int17 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair18 = levenbergMarquardtOptimizer0.doOptimize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 1.0f);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker10 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker10);
        int int12 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 52);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 0L);
        int int17 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1000 + "'", int12 == 1000);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        levenbergMarquardtOptimizer0.setParRelativeTolerance(0.0d);
        int int9 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker10 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int11 = levenbergMarquardtOptimizer0.getMaxIterations();
        double double12 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setQRRankingThreshold(0.0d);
        int int15 = levenbergMarquardtOptimizer0.getEvaluations();
        java.lang.Class<?> wildcardClass16 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1000 + "'", int11 == 1000);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 1.0f);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker10 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker10);
        levenbergMarquardtOptimizer0.setQRRankingThreshold(1.0d);
        double double14 = levenbergMarquardtOptimizer0.getRMS();
        int int15 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker18 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker18);
        int int20 = levenbergMarquardtOptimizer0.getIterations();
        // The following exception was thrown during execution in test generation
        try {
            double[][] doubleArray21 = levenbergMarquardtOptimizer0.getCovariances();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 1);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 10);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(0.0d);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        int int9 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) -1);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 100);
        double double9 = levenbergMarquardtOptimizer0.getRMS();
        int int10 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int11 = levenbergMarquardtOptimizer0.getEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double[][] doubleArray12 = levenbergMarquardtOptimizer0.getCovariances();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        int int1 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) '4');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker4 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) '#');
        int int7 = levenbergMarquardtOptimizer0.getIterations();
        double double8 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 32);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(0.0d);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker13 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker13);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 1L);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 1000);
        java.lang.Class<?> wildcardClass19 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1000 + "'", int1 == 1000);
        org.junit.Assert.assertNull(vectorialConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 1.0f);
        int int10 = levenbergMarquardtOptimizer0.getIterations();
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) 'a');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker14 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) (byte) 10);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 1L);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) (short) 10);
        levenbergMarquardtOptimizer0.setMaxIterations((int) '#');
        int int23 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) (byte) -1);
        int int26 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker14);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        int int3 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1000 + "'", int3 == 1000);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 1.0f);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker10 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker10);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) (byte) 10);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (short) 10);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 52);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(0.0d);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker20 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) '4');
        java.lang.Class<?> wildcardClass23 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker20);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 1);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 10);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(0.0d);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 10.0f);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker10 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setMaxIterations(97);
        double double13 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxIterations(35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker10);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        int int1 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) '4');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker4 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) '#');
        double double7 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1));
        int int10 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 10);
        levenbergMarquardtOptimizer0.setMaxIterations(52);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(100.0d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1000 + "'", int1 == 1000);
        org.junit.Assert.assertNull(vectorialConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double9 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 0);
        int int12 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1000);
        double double15 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 10.0f);
        double double18 = levenbergMarquardtOptimizer0.getChiSquare();
        int int19 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 0);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 1);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction24 = null;
        double[] doubleArray29 = new double[] { 10.0f, 1L, 32, 10L };
        double[] doubleArray36 = new double[] { 10.0d, 32, 35, 1.0f, 0.0d, 1 };
        double[] doubleArray37 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair38 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction24, doubleArray29, doubleArray36, doubleArray37);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimensions mismatch 4 != 6");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 10.0d, 1.0d, 32.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertArrayEquals(doubleArray36, new double[] { 10.0d, 32.0d, 35.0d, 1.0d, 0.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        int int1 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 10.0f);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 10);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 'a');
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) 'a');
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxEvaluations(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1000 + "'", int1 == 1000);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        int int1 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker2 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 1);
        int int5 = levenbergMarquardtOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker6 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker6);
        int int8 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(1.0d);
        int int11 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        double double12 = levenbergMarquardtOptimizer0.getChiSquare();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1000 + "'", int1 == 1000);
        org.junit.Assert.assertNull(vectorialConvergenceChecker2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(0.0d);
        levenbergMarquardtOptimizer0.setMaxIterations(1000);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 97);
        int int10 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int11 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 1);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 10);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(0.0d);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) -1);
        double double10 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) (-1L));
        java.lang.Class<?> wildcardClass13 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        int int1 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) '4');
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker6 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1000 + "'", int1 == 1000);
        org.junit.Assert.assertNull(vectorialConvergenceChecker6);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) -1);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker9 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker9);
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(0.0d);
        levenbergMarquardtOptimizer0.setQRRankingThreshold(0.0d);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) 10);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (-1L));
        int int13 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (byte) 100);
        double double16 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxEvaluations((-1));
        int int19 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 10.0f);
        levenbergMarquardtOptimizer0.setMaxIterations(52);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) -1);
        double double26 = levenbergMarquardtOptimizer0.getChiSquare();
        int int27 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 1);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 100L);
        int int5 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int6 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 100L);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 0);
        levenbergMarquardtOptimizer0.setMaxEvaluations(0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1000 + "'", int5 == 1000);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double9 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 0);
        int int12 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int13 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setMaxEvaluations(2147483647);
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) (byte) 10);
        int int20 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 1);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 10);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(0.0d);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 52);
        double double11 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker12 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 97);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNull(vectorialConvergenceChecker12);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 1.0f);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(1.0d);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker14 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker14);
        levenbergMarquardtOptimizer0.setMaxIterations((int) ' ');
        int int18 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1L));
        int int21 = levenbergMarquardtOptimizer0.getMaxIterations();
        // The following exception was thrown during execution in test generation
        try {
            double[][] doubleArray22 = levenbergMarquardtOptimizer0.getCovariances();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 1);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker5);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker7 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker8 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker8);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) 0);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 32);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction14 = null;
        double[] doubleArray19 = new double[] { '#', 1000, 'a', (-1.0d) };
        double[] doubleArray25 = new double[] { 1.0f, 2147483647, 100.0f, (-1L), (byte) 100 };
        double[] doubleArray29 = new double[] { 10.0f, (byte) 10, 10L };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair30 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction14, doubleArray19, doubleArray25, doubleArray29);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimensions mismatch 4 != 5");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(vectorialConvergenceChecker7);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 35.0d, 1000.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { 1.0d, 2.147483647E9d, 100.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 10.0d, 10.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double9 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 0);
        int int12 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int13 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 100.0f);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        int int3 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations(2147483647);
        double double8 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 52);
        java.lang.Class<?> wildcardClass11 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1000 + "'", int3 == 1000);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 1);
        int int9 = levenbergMarquardtOptimizer0.getEvaluations();
        int int10 = levenbergMarquardtOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker11 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) -1);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction16 = null;
        double[] doubleArray20 = new double[] { 10, 1.0f, 0.0d };
        double[] doubleArray21 = new double[] {};
        double[] doubleArray26 = new double[] { (short) 100, 0L, (byte) -1, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair27 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction16, doubleArray20, doubleArray21, doubleArray26);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimensions mismatch 3 != 0");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker11);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 10.0d, 1.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertArrayEquals(doubleArray26, new double[] { 100.0d, 0.0d, (-1.0d), 97.0d }, 1.0E-15);
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        int int1 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 10.0f);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 10);
        int int6 = levenbergMarquardtOptimizer0.getMaxIterations();
        double double7 = levenbergMarquardtOptimizer0.getChiSquare();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray8 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1000 + "'", int1 == 1000);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1000 + "'", int6 == 1000);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        int int5 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1000 + "'", int5 == 1000);
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 1);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 100L);
        double double5 = levenbergMarquardtOptimizer0.getChiSquare();
        int int6 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 0);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) (short) 0);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 52);
        int int13 = levenbergMarquardtOptimizer0.getIterations();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) 10);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (-1L));
        int int13 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int14 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int15 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 10L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 1.0f);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker10 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker10);
        int int12 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int13 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 52);
        int int16 = levenbergMarquardtOptimizer0.getIterations();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair17 = levenbergMarquardtOptimizer0.doOptimize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1000 + "'", int12 == 1000);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double9 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 0);
        int int12 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1000);
        int int15 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker16 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker16);
        java.lang.Class<?> wildcardClass18 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        int int1 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) '4');
        double double4 = levenbergMarquardtOptimizer0.getRMS();
        double double5 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 10L);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) '4');
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) '4');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1000 + "'", int1 == 1000);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        levenbergMarquardtOptimizer0.setParRelativeTolerance(0.0d);
        int int9 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) 10);
        int int12 = levenbergMarquardtOptimizer0.getIterations();
        int int13 = levenbergMarquardtOptimizer0.getIterations();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1000 + "'", int9 == 1000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        int int1 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 10.0f);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 10);
        int int6 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 0.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1000 + "'", int1 == 1000);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1000 + "'", int6 == 1000);
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        double double4 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int6 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) '#');
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) (short) -1);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNull(vectorialConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1000 + "'", int6 == 1000);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        double double4 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int6 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) '#');
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) (short) -1);
        double double11 = levenbergMarquardtOptimizer0.getChiSquare();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray12 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNull(vectorialConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1000 + "'", int6 == 1000);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int9 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) -1);
        int int12 = levenbergMarquardtOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker13 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker13);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair15 = levenbergMarquardtOptimizer0.doOptimize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        levenbergMarquardtOptimizer0.setParRelativeTolerance(0.0d);
        int int9 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int10 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        levenbergMarquardtOptimizer0.setParRelativeTolerance(0.0d);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0);
        int int11 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        double double12 = levenbergMarquardtOptimizer0.getChiSquare();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair13 = levenbergMarquardtOptimizer0.doOptimize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        double double4 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int6 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) '#');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker9 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker9);
        double double11 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setQRRankingThreshold(100.0d);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker14 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker14);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNull(vectorialConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1000 + "'", int6 == 1000);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 1.0f);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(1.0d);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker14 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker14);
        levenbergMarquardtOptimizer0.setMaxIterations((int) ' ');
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 2147483647);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 32);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 100L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(0.0d);
        levenbergMarquardtOptimizer0.setMaxIterations(1000);
        int int8 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        double double9 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker10 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker10);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 2147483647);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        int int1 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) '4');
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 0);
        java.lang.Class<?> wildcardClass6 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1000 + "'", int1 == 1000);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        int int1 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) '4');
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 1L);
        int int6 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker8 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double double9 = levenbergMarquardtOptimizer0.getChiSquare();
        double double10 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((-1.0d));
        levenbergMarquardtOptimizer0.setParRelativeTolerance(1.0d);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction15 = null;
        double[] doubleArray17 = new double[] { 1.0f };
        double[] doubleArray22 = new double[] { 1.0d, 'a', 35, 0L };
        double[] doubleArray27 = new double[] { (-1L), (-1), 35, 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair28 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction15, doubleArray17, doubleArray22, doubleArray27);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimensions mismatch 1 != 4");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1000 + "'", int1 == 1000);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 1.0d, 97.0d, 35.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertArrayEquals(doubleArray27, new double[] { (-1.0d), (-1.0d), 35.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 1.0f);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(1.0d);
        levenbergMarquardtOptimizer0.setQRRankingThreshold(0.0d);
        int int14 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker17 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker17);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) (-1.0f));
        int int21 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 10L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 1.0f);
        int int10 = levenbergMarquardtOptimizer0.getIterations();
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) 'a');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker14 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) (byte) 10);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 1L);
        int int19 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setQRRankingThreshold(1.0d);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker22 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 10);
        int int25 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int26 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 97 + "'", int25 == 97);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        levenbergMarquardtOptimizer0.setParRelativeTolerance(0.0d);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) -1);
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        java.lang.Class<?> wildcardClass15 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        int int1 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) '4');
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 1L);
        int int6 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker8 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double double9 = levenbergMarquardtOptimizer0.getChiSquare();
        double double10 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) '4');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1000 + "'", int1 == 1000);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        double double9 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setOrthoTolerance(Double.NaN);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 100L);
        int int14 = levenbergMarquardtOptimizer0.getIterations();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 'a');
        levenbergMarquardtOptimizer0.setQRRankingThreshold((-1.0d));
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray11 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double9 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 0);
        int int12 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int13 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (-1.0f));
        double double18 = levenbergMarquardtOptimizer0.getChiSquare();
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 1);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 100L);
        double double5 = levenbergMarquardtOptimizer0.getChiSquare();
        double double6 = levenbergMarquardtOptimizer0.getChiSquare();
        double double7 = levenbergMarquardtOptimizer0.getRMS();
        double double8 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setMaxEvaluations(10);
        int int11 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction12 = null;
        double[] doubleArray14 = new double[] { (short) -1 };
        double[] doubleArray15 = null;
        double[] doubleArray20 = new double[] { (byte) 0, '#', 100, 1.0f };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair21 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction12, doubleArray14, doubleArray15, doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 0.0d, 35.0d, 100.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) 10);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0L);
        levenbergMarquardtOptimizer0.setQRRankingThreshold(0.0d);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker15 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker15);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 1);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 100L);
        double double5 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 52);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker8 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker8);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 2147483647);
        int int12 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) ' ');
        double double15 = levenbergMarquardtOptimizer0.getRMS();
        int int16 = levenbergMarquardtOptimizer0.getEvaluations();
        int int17 = levenbergMarquardtOptimizer0.getIterations();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction18 = null;
        double[] doubleArray20 = new double[] { 0.0f };
        double[] doubleArray23 = new double[] { 35, 10.0d };
        double[] doubleArray29 = new double[] { (-1L), 97, 100.0f, (-1), 100.0d };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair30 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction18, doubleArray20, doubleArray23, doubleArray29);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimensions mismatch 1 != 2");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 35.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { (-1.0d), 97.0d, 100.0d, (-1.0d), 100.0d }, 1.0E-15);
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) '#');
        levenbergMarquardtOptimizer0.setQRRankingThreshold(Double.NaN);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker8 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker8);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(0.0d);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 52);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) -1);
        double double7 = levenbergMarquardtOptimizer0.getChiSquare();
        double double8 = levenbergMarquardtOptimizer0.getRMS();
        double double9 = levenbergMarquardtOptimizer0.getRMS();
        int int10 = levenbergMarquardtOptimizer0.getIterations();
        int int11 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        int int3 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker4 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double double5 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setMaxIterations(1);
        int int8 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((-1.0d));
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1000 + "'", int3 == 1000);
        org.junit.Assert.assertNull(vectorialConvergenceChecker4);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) 10);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (-1L));
        int int13 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 'a');
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 10);
        int int20 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (byte) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 1);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 100L);
        double double5 = levenbergMarquardtOptimizer0.getChiSquare();
        int int6 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) (byte) 100);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(0.0d);
        int int11 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        java.lang.Class<?> wildcardClass12 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) -1);
        double double7 = levenbergMarquardtOptimizer0.getChiSquare();
        double double8 = levenbergMarquardtOptimizer0.getRMS();
        double double9 = levenbergMarquardtOptimizer0.getRMS();
        int int10 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1L);
        double double13 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        int int1 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 10.0f);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '#');
        java.lang.Class<?> wildcardClass6 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1000 + "'", int1 == 1000);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 1);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 10);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(0.0d);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 10.0f);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker10 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setMaxIterations(97);
        double double13 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) (byte) 10);
        java.lang.Class<?> wildcardClass16 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker10);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        int int1 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) '4');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker4 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) '#');
        int int7 = levenbergMarquardtOptimizer0.getIterations();
        double double8 = levenbergMarquardtOptimizer0.getChiSquare();
        java.lang.Class<?> wildcardClass9 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1000 + "'", int1 == 1000);
        org.junit.Assert.assertNull(vectorialConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker11 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker11);
        int int13 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int14 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) 0);
        int int17 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction18 = null;
        double[] doubleArray23 = new double[] { 35, (short) -1, 10.0d, 0.0f };
        double[] doubleArray26 = new double[] { 10.0d, (short) 0 };
        double[] doubleArray31 = new double[] { (short) 10, 97, 0.0d, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair32 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction18, doubleArray23, doubleArray26, doubleArray31);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimensions mismatch 4 != 2");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1000 + "'", int13 == 1000);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 35.0d, (-1.0d), 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertArrayEquals(doubleArray26, new double[] { 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertArrayEquals(doubleArray31, new double[] { 10.0d, 97.0d, 0.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        int int1 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int2 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setQRRankingThreshold(100.0d);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1000 + "'", int1 == 1000);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        int int10 = levenbergMarquardtOptimizer0.getEvaluations();
        int int11 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int12 = levenbergMarquardtOptimizer0.getEvaluations();
        double double13 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 1);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1000 + "'", int11 == 1000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 'a');
        levenbergMarquardtOptimizer0.setQRRankingThreshold((-1.0d));
        levenbergMarquardtOptimizer0.setMaxIterations(97);
        double double13 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker14 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (byte) 100);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) -1);
        int int19 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int20 = levenbergMarquardtOptimizer0.getIterations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray21 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNull(vectorialConvergenceChecker14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        double double9 = levenbergMarquardtOptimizer0.getChiSquare();
        int int10 = levenbergMarquardtOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker11 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker11);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair13 = levenbergMarquardtOptimizer0.doOptimize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) 10);
        int int11 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int12 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setMaxEvaluations(2147483647);
        double double15 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (-1L));
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair20 = levenbergMarquardtOptimizer0.doOptimize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1000 + "'", int12 == 1000);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 'a');
        int int11 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setQRRankingThreshold(0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) 10);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (-1L));
        int int13 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (byte) 100);
        double double16 = levenbergMarquardtOptimizer0.getChiSquare();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker17 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker17);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 100L);
        double double21 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 'a');
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 1);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 100L);
        double double5 = levenbergMarquardtOptimizer0.getChiSquare();
        int int6 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 0);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(1.0d);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (-1L));
        levenbergMarquardtOptimizer0.setMaxIterations((-1));
        int int15 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int16 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int17 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 1);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 100L);
        double double5 = levenbergMarquardtOptimizer0.getChiSquare();
        double double6 = levenbergMarquardtOptimizer0.getChiSquare();
        double double7 = levenbergMarquardtOptimizer0.getRMS();
        double double8 = levenbergMarquardtOptimizer0.getRMS();
        int int9 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int10 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1000 + "'", int9 == 1000);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1000 + "'", int10 == 1000);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 1.0f);
        int int10 = levenbergMarquardtOptimizer0.getIterations();
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        int int12 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1000 + "'", int12 == 1000);
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        int int3 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double6 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) '4');
        double double11 = levenbergMarquardtOptimizer0.getChiSquare();
        int int12 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1000 + "'", int3 == 1000);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        double double9 = levenbergMarquardtOptimizer0.getRMS();
        int int10 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 1.0f);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1000 + "'", int10 == 1000);
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        int int3 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance(10.0d);
        levenbergMarquardtOptimizer0.setMaxEvaluations(97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) 10);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (-1L));
        int int13 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (byte) 100);
        double double16 = levenbergMarquardtOptimizer0.getChiSquare();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker17 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker17);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 100L);
        double double21 = levenbergMarquardtOptimizer0.getRMS();
        double double22 = levenbergMarquardtOptimizer0.getChiSquare();
        int int23 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        double double24 = levenbergMarquardtOptimizer0.getChiSquare();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        int int3 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int4 = levenbergMarquardtOptimizer0.getEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1000 + "'", int3 == 1000);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double9 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 0);
        int int12 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) 100);
        int int15 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 0);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair20 = levenbergMarquardtOptimizer0.doOptimize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 1.0f);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(1.0d);
        levenbergMarquardtOptimizer0.setQRRankingThreshold(0.0d);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker14 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair15 = levenbergMarquardtOptimizer0.doOptimize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker14);
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        int int3 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double6 = levenbergMarquardtOptimizer0.getRMS();
        int int7 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 100);
        int int10 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int11 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1000 + "'", int3 == 1000);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) 10);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0L);
        int int13 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        double double14 = levenbergMarquardtOptimizer0.getRMS();
        int int15 = levenbergMarquardtOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker16 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker16);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 1);
        int int3 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 100);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(1.0d);
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) '4');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker12 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker12);
        int int14 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1000 + "'", int3 == 1000);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 1);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 10);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) (-1));
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(0.0d);
        double double9 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 2147483647);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        double double9 = levenbergMarquardtOptimizer0.getRMS();
        int int10 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 0L);
        double double13 = levenbergMarquardtOptimizer0.getRMS();
        double double14 = levenbergMarquardtOptimizer0.getRMS();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1000 + "'", int10 == 1000);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        double double9 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker10 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker10);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 'a');
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker1);
        levenbergMarquardtOptimizer0.setParRelativeTolerance(Double.NaN);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1L);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(1.0d);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1L));
        double double11 = levenbergMarquardtOptimizer0.getRMS();
        java.lang.Class<?> wildcardClass12 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double9 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setMaxEvaluations(100);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 10);
        int int14 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 1);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 100L);
        double double5 = levenbergMarquardtOptimizer0.getChiSquare();
        int int6 = levenbergMarquardtOptimizer0.getIterations();
        int int7 = levenbergMarquardtOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker8 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker8);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) (-1L));
        int int12 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (-1));
        levenbergMarquardtOptimizer0.setMaxEvaluations(100);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 0L);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(Double.NaN);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair21 = levenbergMarquardtOptimizer0.doOptimize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker1);
        levenbergMarquardtOptimizer0.setParRelativeTolerance(Double.NaN);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1L);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(1.0d);
        int int9 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int10 = levenbergMarquardtOptimizer0.getIterations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray11 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 1);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 100L);
        double double5 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 52);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker8 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker8);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 2147483647);
        int int12 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) 10);
        double double15 = levenbergMarquardtOptimizer0.getChiSquare();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 1);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 10);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(0.0d);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        int int9 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int10 = levenbergMarquardtOptimizer0.getEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray11 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        double double4 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int6 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) '#');
        levenbergMarquardtOptimizer0.setMaxIterations((int) '#');
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(100.0d);
        levenbergMarquardtOptimizer0.setMaxEvaluations(100);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction15 = null;
        double[] doubleArray22 = new double[] { (byte) -1, (byte) -1, 100L, 10.0f, 1000, 1000 };
        double[] doubleArray25 = new double[] { 10, 35 };
        double[] doubleArray32 = new double[] { 1.0f, (short) 100, ' ', 0.0f, 52, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair33 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction15, doubleArray22, doubleArray25, doubleArray32);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimensions mismatch 6 != 2");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNull(vectorialConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1000 + "'", int6 == 1000);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { (-1.0d), (-1.0d), 100.0d, 10.0d, 1000.0d, 1000.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { 10.0d, 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[] { 1.0d, 100.0d, 32.0d, 0.0d, 52.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) -1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker7 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int8 = levenbergMarquardtOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker9 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double double10 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (byte) 0);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (short) 1);
        int int15 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (-1.0f));
        org.junit.Assert.assertNull(vectorialConvergenceChecker7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker10 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker10);
        int int12 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker13 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker13);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker15 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int16 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int17 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations(2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1000 + "'", int16 == 1000);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 1);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 100L);
        double double5 = levenbergMarquardtOptimizer0.getChiSquare();
        int int6 = levenbergMarquardtOptimizer0.getIterations();
        int int7 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations(32);
        int int10 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double9 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 0);
        int int12 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int13 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        double double16 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker17 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker17);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) 10);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (-1L));
        int int13 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (byte) 100);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) (-1L));
        double double18 = levenbergMarquardtOptimizer0.getChiSquare();
        int int19 = levenbergMarquardtOptimizer0.getIterations();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair20 = levenbergMarquardtOptimizer0.doOptimize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 1);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 10);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(0.0d);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        int int9 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int10 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction11 = null;
        double[] doubleArray18 = new double[] { (-1L), (short) 0, (short) 100, 100.0f, 2147483647, 100.0d };
        double[] doubleArray20 = new double[] { 10 };
        double[] doubleArray25 = new double[] { 100L, (short) 1, 100, (-1L) };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair26 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction11, doubleArray18, doubleArray20, doubleArray25);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimensions mismatch 6 != 1");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { (-1.0d), 0.0d, 100.0d, 100.0d, 2.147483647E9d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { 100.0d, 1.0d, 100.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 1);
        int int9 = levenbergMarquardtOptimizer0.getEvaluations();
        int int10 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance(Double.NaN);
        levenbergMarquardtOptimizer0.setMaxEvaluations(97);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker15 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker15);
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 1);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 10);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(0.0d);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 1);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(0.0d);
        double double13 = levenbergMarquardtOptimizer0.getChiSquare();
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) -1);
        int int7 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 0L);
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) -1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker7 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int8 = levenbergMarquardtOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker9 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker10 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setMaxIterations((int) '4');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker13 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.junit.Assert.assertNull(vectorialConvergenceChecker7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker9);
        org.junit.Assert.assertNull(vectorialConvergenceChecker10);
        org.junit.Assert.assertNull(vectorialConvergenceChecker13);
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        double double9 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker10 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) -1);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 10);
        double double15 = levenbergMarquardtOptimizer0.getChiSquare();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNull(vectorialConvergenceChecker10);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double9 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 0);
        int int12 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1000);
        double double15 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 100L);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair18 = levenbergMarquardtOptimizer0.doOptimize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) '#');
        levenbergMarquardtOptimizer0.setQRRankingThreshold(Double.NaN);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(100.0d);
        double double10 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 10.0f);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker13 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNull(vectorialConvergenceChecker13);
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 1);
        int int3 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 100);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(1.0d);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 'a');
        int int10 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 10);
        double double13 = levenbergMarquardtOptimizer0.getRMS();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1000 + "'", int3 == 1000);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        int int1 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker2 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double7 = levenbergMarquardtOptimizer0.getRMS();
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1000 + "'", int1 == 1000);
        org.junit.Assert.assertNull(vectorialConvergenceChecker2);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 1);
        int int3 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int4 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1000 + "'", int3 == 1000);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) -1);
        int int7 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 0L);
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        int int12 = levenbergMarquardtOptimizer0.getIterations();
        double double13 = levenbergMarquardtOptimizer0.getRMS();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double9 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker10 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair13 = levenbergMarquardtOptimizer0.doOptimize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNull(vectorialConvergenceChecker10);
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker1);
        levenbergMarquardtOptimizer0.setParRelativeTolerance(Double.NaN);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(10.0d);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair8 = levenbergMarquardtOptimizer0.doOptimize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 1.0f);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(1.0d);
        levenbergMarquardtOptimizer0.setQRRankingThreshold(0.0d);
        int int14 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int15 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        double double18 = levenbergMarquardtOptimizer0.getChiSquare();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 1);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker5);
        int int7 = levenbergMarquardtOptimizer0.getEvaluations();
        double double8 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) '4');
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 1);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) ' ');
        int int5 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setQRRankingThreshold(1.0d);
        double double8 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker1);
        int int3 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int4 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 32);
        double double7 = levenbergMarquardtOptimizer0.getRMS();
        java.lang.Class<?> wildcardClass8 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        int int1 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) '4');
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 1L);
        int int6 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker8 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int9 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1000 + "'", int1 == 1000);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 1);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 10);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(0.0d);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 1);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(0.0d);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) '#');
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(0.0d);
        java.lang.Class<?> wildcardClass17 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        int int1 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 10.0f);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (-1));
        levenbergMarquardtOptimizer0.setMaxIterations((int) ' ');
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) (-1.0f));
        levenbergMarquardtOptimizer0.setMaxEvaluations(2147483647);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1000 + "'", int1 == 1000);
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        double double4 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int6 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) '#');
        levenbergMarquardtOptimizer0.setMaxIterations((int) '#');
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(100.0d);
        levenbergMarquardtOptimizer0.setMaxIterations((int) '#');
        levenbergMarquardtOptimizer0.setMaxIterations((int) ' ');
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNull(vectorialConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1000 + "'", int6 == 1000);
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double9 = levenbergMarquardtOptimizer0.getRMS();
        double double10 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray13 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        int int5 = levenbergMarquardtOptimizer0.getMaxIterations();
        double double6 = levenbergMarquardtOptimizer0.getChiSquare();
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker9 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1000 + "'", int5 == 1000);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker9);
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 1.0f);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(1.0d);
        levenbergMarquardtOptimizer0.setQRRankingThreshold(0.0d);
        int int14 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 1000);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair19 = levenbergMarquardtOptimizer0.doOptimize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) 10);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0L);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker13 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker13);
        double double15 = levenbergMarquardtOptimizer0.getRMS();
        double double16 = levenbergMarquardtOptimizer0.getRMS();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair17 = levenbergMarquardtOptimizer0.doOptimize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        int int10 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((-1));
        int int13 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        int int16 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 0);
        double double19 = levenbergMarquardtOptimizer0.getRMS();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray20 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 1);
        double double9 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setQRRankingThreshold((-1.0d));
        double double12 = levenbergMarquardtOptimizer0.getRMS();
        java.lang.Class<?> wildcardClass13 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        double double9 = levenbergMarquardtOptimizer0.getRMS();
        int int10 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) ' ');
        int int13 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1000 + "'", int10 == 1000);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1000 + "'", int13 == 1000);
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double9 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1));
        int int12 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) '#');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker15 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 97);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 10L);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) '4');
        int int22 = levenbergMarquardtOptimizer0.getEvaluations();
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker15);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(0.0d);
        levenbergMarquardtOptimizer0.setMaxIterations(1000);
        int int8 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker9 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker9);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 0);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (short) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 1);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 10);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(0.0d);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker8 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int9 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        double double10 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker11 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker11);
        double double13 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setQRRankingThreshold(0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double9 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 0);
        int int12 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int13 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations((-1));
        int int16 = levenbergMarquardtOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker17 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker17);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (short) 100);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 100);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 1000);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker25 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker25);
        int int27 = levenbergMarquardtOptimizer0.getIterations();
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        int int1 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) '4');
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 1L);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) '#');
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((-1.0d));
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 1);
        int int12 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1000 + "'", int1 == 1000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) -1);
        int int7 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        int int12 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int13 = levenbergMarquardtOptimizer0.getEvaluations();
        double double14 = levenbergMarquardtOptimizer0.getRMS();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double9 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 0);
        int int12 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int13 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations((-1));
        int int16 = levenbergMarquardtOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker17 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker17);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (short) 100);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 100);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(10.0d);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        int int5 = levenbergMarquardtOptimizer0.getMaxIterations();
        double double6 = levenbergMarquardtOptimizer0.getChiSquare();
        int int7 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1000 + "'", int5 == 1000);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 1.0f);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(1.0d);
        levenbergMarquardtOptimizer0.setQRRankingThreshold(0.0d);
        int int14 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int15 = levenbergMarquardtOptimizer0.getEvaluations();
        int int16 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int17 = levenbergMarquardtOptimizer0.getMaxIterations();
        java.lang.Class<?> wildcardClass18 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1000 + "'", int17 == 1000);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) '#');
        levenbergMarquardtOptimizer0.setQRRankingThreshold(Double.NaN);
        int int8 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int9 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int10 = levenbergMarquardtOptimizer0.getIterations();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1000 + "'", int8 == 1000);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        int int1 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker2 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 1);
        int int5 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 10);
        int int8 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(10.0d);
        int int11 = levenbergMarquardtOptimizer0.getEvaluations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1000 + "'", int1 == 1000);
        org.junit.Assert.assertNull(vectorialConvergenceChecker2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        int int3 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double6 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) '4');
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray13 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1000 + "'", int3 == 1000);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) 10);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (-1L));
        int int13 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (byte) 100);
        double double16 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxEvaluations((-1));
        int int19 = levenbergMarquardtOptimizer0.getIterations();
        double double20 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) 100);
        levenbergMarquardtOptimizer0.setMaxEvaluations(0);
        int int25 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1000 + "'", int25 == 1000);
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        levenbergMarquardtOptimizer0.setParRelativeTolerance(0.0d);
        int int9 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker10 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int11 = levenbergMarquardtOptimizer0.getMaxIterations();
        double double12 = levenbergMarquardtOptimizer0.getChiSquare();
        int int13 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        double double14 = levenbergMarquardtOptimizer0.getChiSquare();
        int int15 = levenbergMarquardtOptimizer0.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker16 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1000 + "'", int11 == 1000);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker16);
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        int int1 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) '4');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker4 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 2147483647);
        int int7 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(10.0d);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 1.0f);
        int int12 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1000 + "'", int1 == 1000);
        org.junit.Assert.assertNull(vectorialConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        double double4 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int6 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int7 = levenbergMarquardtOptimizer0.getEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNull(vectorialConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1000 + "'", int6 == 1000);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double9 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 0);
        int int12 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int13 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (-1.0f));
        levenbergMarquardtOptimizer0.setMaxIterations(35);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray20 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker1);
        levenbergMarquardtOptimizer0.setParRelativeTolerance(Double.NaN);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1L);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(1.0d);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker9 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker9);
        java.lang.Class<?> wildcardClass11 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double9 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 0);
        int int12 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int13 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        double double16 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0);
        double double19 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setMaxIterations(97);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) '#');
        levenbergMarquardtOptimizer0.setQRRankingThreshold(Double.NaN);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(100.0d);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 1);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 100L);
        double double5 = levenbergMarquardtOptimizer0.getChiSquare();
        int int6 = levenbergMarquardtOptimizer0.getIterations();
        int int7 = levenbergMarquardtOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker8 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker8);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) (-1L));
        int int12 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (-1));
        levenbergMarquardtOptimizer0.setMaxEvaluations(100);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 0L);
        int int19 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int20 = levenbergMarquardtOptimizer0.getEvaluations();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double9 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 0);
        int int12 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int13 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations((-1));
        int int16 = levenbergMarquardtOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker17 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker17);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (short) 100);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 97);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double9 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 0);
        int int12 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1000);
        double double15 = levenbergMarquardtOptimizer0.getChiSquare();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction16 = null;
        double[] doubleArray18 = new double[] { 97 };
        double[] doubleArray25 = new double[] { 52, 10, (byte) 0, (byte) 0, '#', 1L };
        double[] doubleArray30 = new double[] { (short) 1, 10.0d, (-1.0f), 52 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair31 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction16, doubleArray18, doubleArray25, doubleArray30);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimensions mismatch 1 != 6");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { 52.0d, 10.0d, 0.0d, 0.0d, 35.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertArrayEquals(doubleArray30, new double[] { 1.0d, 10.0d, (-1.0d), 52.0d }, 1.0E-15);
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int7 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1));
        // The following exception was thrown during execution in test generation
        try {
            double[][] doubleArray10 = levenbergMarquardtOptimizer0.getCovariances();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1000 + "'", int7 == 1000);
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2256");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) -1);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 100);
        double double9 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 0);
        int int12 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int13 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        java.lang.Class<?> wildcardClass14 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2257");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        int int1 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) '4');
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 1L);
        int int6 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 1000);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1000 + "'", int1 == 1000);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2258");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) 10);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (-1L));
        int int13 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) ' ');
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 1L);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 0);
        levenbergMarquardtOptimizer0.setMaxEvaluations(100);
        int int24 = levenbergMarquardtOptimizer0.getEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double[][] doubleArray25 = levenbergMarquardtOptimizer0.getCovariances();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2259");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        int int1 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker2 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 1);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(0.0d);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray7 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1000 + "'", int1 == 1000);
        org.junit.Assert.assertNull(vectorialConvergenceChecker2);
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2260");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        int int1 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) '4');
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 1L);
        int int6 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker8 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double double9 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker12 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker12);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 'a');
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 100L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1000 + "'", int1 == 1000);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2261");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        levenbergMarquardtOptimizer0.setParRelativeTolerance(0.0d);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) -1);
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        int int15 = levenbergMarquardtOptimizer0.getIterations();
        int int16 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2262");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) 10);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (-1L));
        int int13 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (byte) 100);
        double double16 = levenbergMarquardtOptimizer0.getChiSquare();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker17 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker17);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 100L);
        int int21 = levenbergMarquardtOptimizer0.getIterations();
        java.lang.Class<?> wildcardClass22 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2263");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        double double4 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int6 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) '#');
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) (short) -1);
        double double11 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '4');
        double double14 = levenbergMarquardtOptimizer0.getRMS();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNull(vectorialConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1000 + "'", int6 == 1000);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2264");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double9 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (byte) 100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker12 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker12);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2265");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker1);
        levenbergMarquardtOptimizer0.setParRelativeTolerance(Double.NaN);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1L);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(1.0d);
        int int9 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int10 = levenbergMarquardtOptimizer0.getIterations();
        int int11 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(100.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2266");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) 10);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (-1L));
        int int13 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (byte) 100);
        double double16 = levenbergMarquardtOptimizer0.getChiSquare();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker17 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker17);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2267");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 1.0f);
        int int10 = levenbergMarquardtOptimizer0.getIterations();
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) 'a');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker14 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) (byte) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker17 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker17);
        int int19 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int20 = levenbergMarquardtOptimizer0.getEvaluations();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1000 + "'", int19 == 1000);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2268");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 1);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 100L);
        double double5 = levenbergMarquardtOptimizer0.getChiSquare();
        int int6 = levenbergMarquardtOptimizer0.getIterations();
        int int7 = levenbergMarquardtOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker8 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker8);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) (-1L));
        int int12 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (-1));
        levenbergMarquardtOptimizer0.setMaxEvaluations(100);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 0L);
        int int19 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker20 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker20);
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2269");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 1);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 100L);
        double double5 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 52);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker8 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker8);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 2147483647);
        int int12 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int13 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        double double14 = levenbergMarquardtOptimizer0.getChiSquare();
        int int15 = levenbergMarquardtOptimizer0.getEvaluations();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction16 = null;
        double[] doubleArray22 = new double[] { '#', 100, (-1L), 1, '#' };
        double[] doubleArray23 = new double[] {};
        double[] doubleArray25 = new double[] { 100L };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair26 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction16, doubleArray22, doubleArray23, doubleArray25);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimensions mismatch 5 != 0");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 35.0d, 100.0d, (-1.0d), 1.0d, 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { 100.0d }, 1.0E-15);
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2270");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) 10);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (-1L));
        int int13 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int14 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) '#');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker17 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 100L);
        double double20 = levenbergMarquardtOptimizer0.getChiSquare();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker21 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker21);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1000 + "'", int14 == 1000);
        org.junit.Assert.assertNull(vectorialConvergenceChecker17);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2271");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 1);
        int int9 = levenbergMarquardtOptimizer0.getEvaluations();
        int int10 = levenbergMarquardtOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker11 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) -1);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 100.0f);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 0);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 100);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 1L);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker24 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker24);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction26 = null;
        double[] doubleArray27 = null;
        double[] doubleArray29 = new double[] { ' ' };
        double[] doubleArray31 = new double[] { (-1.0f) };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair32 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction26, doubleArray27, doubleArray29, doubleArray31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker11);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertArrayEquals(doubleArray31, new double[] { (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2272");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        double double9 = levenbergMarquardtOptimizer0.getChiSquare();
        int int10 = levenbergMarquardtOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker11 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker11);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray13 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2273");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) 10);
        int int11 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int12 = levenbergMarquardtOptimizer0.getEvaluations();
        int int13 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2274");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) 10);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (-1L));
        int int13 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (byte) 100);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(10.0d);
        double double18 = levenbergMarquardtOptimizer0.getChiSquare();
        double double19 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray22 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2275");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) 10);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0L);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker13 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker13);
        double double15 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setParRelativeTolerance(100.0d);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(100.0d);
        int int20 = levenbergMarquardtOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker21 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker21);
        levenbergMarquardtOptimizer0.setOrthoTolerance((-1.0d));
        int int25 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1000 + "'", int25 == 1000);
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2276");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        int int3 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setOrthoTolerance(Double.NaN);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 1.0f);
        double double10 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) (-1.0f));
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction13 = null;
        double[] doubleArray20 = new double[] { (byte) 1, (-1.0f), ' ', '4', (-1.0f), (short) -1 };
        double[] doubleArray23 = new double[] { (byte) 0, Double.NaN };
        double[] doubleArray24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair25 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction13, doubleArray20, doubleArray23, doubleArray24);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimensions mismatch 6 != 2");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1000 + "'", int3 == 1000);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 1.0d, (-1.0d), 32.0d, 52.0d, (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 0.0d, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2277");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) -1);
        int int7 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 0);
        double double10 = levenbergMarquardtOptimizer0.getChiSquare();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker11 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker11);
        double double13 = levenbergMarquardtOptimizer0.getChiSquare();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2278");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        int int1 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) '4');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker4 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 2147483647);
        int int7 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(10.0d);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 2147483647);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 100L);
        double double14 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker15 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker15);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1000 + "'", int1 == 1000);
        org.junit.Assert.assertNull(vectorialConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2279");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 1);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) ' ');
        int int5 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 1000);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 0);
        int int10 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 10L);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (-1.0f));
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction15 = null;
        double[] doubleArray19 = new double[] { 0L, 32, 0 };
        double[] doubleArray22 = new double[] { (byte) 0, 97 };
        double[] doubleArray29 = new double[] { 52, 2147483647, (-1.0d), 2147483647, ' ', 97 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair30 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction15, doubleArray19, doubleArray22, doubleArray29);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimensions mismatch 3 != 2");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 0.0d, 32.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 0.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 52.0d, 2.147483647E9d, (-1.0d), 2.147483647E9d, 32.0d, 97.0d }, 1.0E-15);
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2280");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 'a');
        levenbergMarquardtOptimizer0.setMaxEvaluations(1000);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((-1.0d));
        int int15 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) -1);
        int int18 = levenbergMarquardtOptimizer0.getEvaluations();
        double double19 = levenbergMarquardtOptimizer0.getRMS();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1000 + "'", int15 == 1000);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2281");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) 10);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 0.0f);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(0.0d);
        double double15 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 2147483647);
        int int18 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2282");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        int int1 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) '4');
        int int4 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int6 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker9 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction10 = null;
        double[] doubleArray12 = new double[] { 1 };
        double[] doubleArray14 = new double[] { '#' };
        double[] doubleArray15 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair16 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction10, doubleArray12, doubleArray14, doubleArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1000 + "'", int1 == 1000);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertNull(vectorialConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker9);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] {}, 1.0E-15);
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2283");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 'a');
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            double[][] doubleArray13 = levenbergMarquardtOptimizer0.getCovariances();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2284");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double9 = levenbergMarquardtOptimizer0.getRMS();
        double double10 = levenbergMarquardtOptimizer0.getChiSquare();
        int int11 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int12 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1));
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) (short) 10);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2285");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) -1);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker9 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker9);
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setMaxEvaluations(10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 100);
        double double16 = levenbergMarquardtOptimizer0.getChiSquare();
        int int17 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int18 = levenbergMarquardtOptimizer0.getIterations();
        int int19 = levenbergMarquardtOptimizer0.getEvaluations();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1000 + "'", int17 == 1000);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2286");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        levenbergMarquardtOptimizer0.setParRelativeTolerance(0.0d);
        int int9 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker10 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int11 = levenbergMarquardtOptimizer0.getMaxIterations();
        double double12 = levenbergMarquardtOptimizer0.getChiSquare();
        int int13 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 100);
        double double16 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker19 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker19);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1000 + "'", int11 == 1000);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2287");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker1);
        int int3 = levenbergMarquardtOptimizer0.getEvaluations();
        int int4 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(10.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2288");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) '#');
        levenbergMarquardtOptimizer0.setQRRankingThreshold(Double.NaN);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker8 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker8);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(0.0d);
        int int12 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2289");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker1);
        int int3 = levenbergMarquardtOptimizer0.getEvaluations();
        double double4 = levenbergMarquardtOptimizer0.getRMS();
        double double5 = levenbergMarquardtOptimizer0.getRMS();
        int int6 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            double[][] doubleArray9 = levenbergMarquardtOptimizer0.getCovariances();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2290");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double9 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 0);
        int int12 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) 100);
        int int15 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int16 = levenbergMarquardtOptimizer0.getIterations();
        int int17 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((-1.0d));
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 100);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction22 = null;
        double[] doubleArray24 = new double[] { 35 };
        double[] doubleArray31 = new double[] { 52, (byte) 0, 1.0f, 0L, Double.NaN, (short) 0 };
        double[] doubleArray38 = new double[] { 1L, (short) -1, (-1.0f), (byte) 1, (-1), '#' };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair39 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction22, doubleArray24, doubleArray31, doubleArray38);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimensions mismatch 1 != 6");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] { 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertArrayEquals(doubleArray31, new double[] { 52.0d, 0.0d, 1.0d, 0.0d, Double.NaN, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { 1.0d, (-1.0d), (-1.0d), 1.0d, (-1.0d), 35.0d }, 1.0E-15);
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2291");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) 10);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0L);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker13 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker13);
        double double15 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setParRelativeTolerance(100.0d);
        int int18 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2292");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker1);
        int int3 = levenbergMarquardtOptimizer0.getEvaluations();
        double double4 = levenbergMarquardtOptimizer0.getRMS();
        double double5 = levenbergMarquardtOptimizer0.getRMS();
        double double6 = levenbergMarquardtOptimizer0.getRMS();
        int int7 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker8 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
    }

    @Test
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2293");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        int int1 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) '4');
        levenbergMarquardtOptimizer0.setParRelativeTolerance(0.0d);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(0.0d);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1000 + "'", int1 == 1000);
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2294");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 1);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 100L);
        double double5 = levenbergMarquardtOptimizer0.getChiSquare();
        int int6 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 0);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(1.0d);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (-1L));
        levenbergMarquardtOptimizer0.setMaxIterations((-1));
        int int15 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int16 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2295");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 1);
        int int9 = levenbergMarquardtOptimizer0.getEvaluations();
        int int10 = levenbergMarquardtOptimizer0.getEvaluations();
        double double11 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setOrthoTolerance(Double.NaN);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 0);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(1.0d);
        int int18 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
    }

    @Test
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2296");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        levenbergMarquardtOptimizer0.setParRelativeTolerance(0.0d);
        int int9 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker10 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int11 = levenbergMarquardtOptimizer0.getMaxIterations();
        double double12 = levenbergMarquardtOptimizer0.getChiSquare();
        int int13 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        double double14 = levenbergMarquardtOptimizer0.getChiSquare();
        int int15 = levenbergMarquardtOptimizer0.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker16 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double double17 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) -1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1000 + "'", int11 == 1000);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2297");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) -1);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker9 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker9);
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        int int12 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int13 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray16 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2298");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        int int1 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) '4');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker4 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) '#');
        double double7 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1));
        int int10 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker11 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction12 = null;
        double[] doubleArray16 = new double[] { (short) 10, (byte) 1, 10.0d };
        double[] doubleArray22 = new double[] { 100.0f, '4', (byte) 0, (byte) 10, 1.0f };
        double[] doubleArray29 = new double[] { 1L, 1000, Double.NaN, (byte) 10, 'a', 32 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair30 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction12, doubleArray16, doubleArray22, doubleArray29);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimensions mismatch 3 != 5");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1000 + "'", int1 == 1000);
        org.junit.Assert.assertNull(vectorialConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker11);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 10.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 100.0d, 52.0d, 0.0d, 10.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 1.0d, 1000.0d, Double.NaN, 10.0d, 97.0d, 32.0d }, 1.0E-15);
    }

    @Test
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2299");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 1);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 10);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(0.0d);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        int int9 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int10 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int11 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2300");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker1);
        levenbergMarquardtOptimizer0.setParRelativeTolerance(Double.NaN);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1L);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 100.0f);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 52);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 1L);
        int int13 = levenbergMarquardtOptimizer0.getIterations();
        double double14 = levenbergMarquardtOptimizer0.getRMS();
        double double15 = levenbergMarquardtOptimizer0.getChiSquare();
        int int16 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
    }

    @Test
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2301");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) 10);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0L);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker13 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker13);
        double double15 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setParRelativeTolerance(100.0d);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(100.0d);
        int int20 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 100);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray25 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2302");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 1);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 100L);
        double double5 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 52);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker8 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker8);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 2147483647);
        int int12 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) ' ');
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) 100);
        int int17 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2303");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 1);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 10);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(0.0d);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 10.0f);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker10 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setMaxIterations(97);
        double double13 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker10);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2304");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setMaxEvaluations(100);
        int int6 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int7 = levenbergMarquardtOptimizer0.getEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double[][] doubleArray8 = levenbergMarquardtOptimizer0.getCovariances();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2305");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 1);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 100L);
        double double5 = levenbergMarquardtOptimizer0.getChiSquare();
        double double6 = levenbergMarquardtOptimizer0.getChiSquare();
        int int7 = levenbergMarquardtOptimizer0.getEvaluations();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction8 = null;
        double[] doubleArray12 = new double[] { 35, 97, 0L };
        double[] doubleArray17 = new double[] { 1L, 1000, (byte) -1, Double.NaN };
        double[] doubleArray23 = new double[] { (byte) 10, 100.0d, (-1.0d), 2147483647, '#' };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair24 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction8, doubleArray12, doubleArray17, doubleArray23);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimensions mismatch 3 != 4");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 35.0d, 97.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 1.0d, 1000.0d, (-1.0d), Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 10.0d, 100.0d, (-1.0d), 2.147483647E9d, 35.0d }, 1.0E-15);
    }

    @Test
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2306");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        int int1 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) '4');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker4 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) '#');
        int int7 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(1.0d);
        int int10 = levenbergMarquardtOptimizer0.getEvaluations();
        java.lang.Class<?> wildcardClass11 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1000 + "'", int1 == 1000);
        org.junit.Assert.assertNull(vectorialConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2307");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 1);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 10);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(0.0d);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker9 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int10 = levenbergMarquardtOptimizer0.getEvaluations();
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        org.junit.Assert.assertNull(vectorialConvergenceChecker9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2308");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        double double4 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int6 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker9 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker9);
        int int11 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 100.0f);
        // The following exception was thrown during execution in test generation
        try {
            double[][] doubleArray14 = levenbergMarquardtOptimizer0.getCovariances();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNull(vectorialConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2309");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        int int3 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) (byte) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker8 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker8);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 100);
        int int12 = levenbergMarquardtOptimizer0.getMaxIterations();
        java.lang.Class<?> wildcardClass13 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1000 + "'", int3 == 1000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2310");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 1);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 100L);
        double double5 = levenbergMarquardtOptimizer0.getChiSquare();
        int int6 = levenbergMarquardtOptimizer0.getIterations();
        int int7 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 100);
        int int10 = levenbergMarquardtOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker11 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker11);
        double double13 = levenbergMarquardtOptimizer0.getChiSquare();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray14 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2311");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 1);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) ' ');
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction5 = null;
        double[] doubleArray9 = new double[] { '4', 2147483647, (byte) -1 };
        double[] doubleArray14 = new double[] { 100L, Double.NaN, 'a', (byte) 100 };
        double[] doubleArray21 = new double[] { 1.0d, 100, 100L, 10L, '4', 97 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair22 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction5, doubleArray9, doubleArray14, doubleArray21);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimensions mismatch 3 != 4");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 52.0d, 2.147483647E9d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 100.0d, Double.NaN, 97.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 1.0d, 100.0d, 100.0d, 10.0d, 52.0d, 97.0d }, 1.0E-15);
    }

    @Test
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2312");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 1.0f);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(1.0d);
        levenbergMarquardtOptimizer0.setQRRankingThreshold(0.0d);
        int int14 = levenbergMarquardtOptimizer0.getIterations();
        int int15 = levenbergMarquardtOptimizer0.getIterations();
        int int16 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) ' ');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker19 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker19);
    }

    @Test
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2313");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 1);
        int int9 = levenbergMarquardtOptimizer0.getEvaluations();
        int int10 = levenbergMarquardtOptimizer0.getEvaluations();
        double double11 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setOrthoTolerance(Double.NaN);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) -1);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '4');
        double double20 = levenbergMarquardtOptimizer0.getChiSquare();
        java.lang.Class<?> wildcardClass21 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2314");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 1);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 10);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(0.0d);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker8 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int9 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) -1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
    }

    @Test
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2315");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker5);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getMaxIterations();
        double double9 = levenbergMarquardtOptimizer0.getChiSquare();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1000 + "'", int8 == 1000);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2316");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        int int9 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) -1);
        int int12 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2317");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        int int1 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) '4');
        int int4 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int6 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 0);
        double double9 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0L);
        java.lang.Class<?> wildcardClass12 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1000 + "'", int1 == 1000);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertNull(vectorialConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2318");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 1.0f);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(1.0d);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker14 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker14);
        levenbergMarquardtOptimizer0.setMaxIterations((int) ' ');
        int int18 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1L));
        int int21 = levenbergMarquardtOptimizer0.getMaxIterations();
        double double22 = levenbergMarquardtOptimizer0.getChiSquare();
        java.lang.Class<?> wildcardClass23 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2319");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker1);
        levenbergMarquardtOptimizer0.setParRelativeTolerance(Double.NaN);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 1);
        int int7 = levenbergMarquardtOptimizer0.getEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int9 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 1.0f);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker12 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1000 + "'", int8 == 1000);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker12);
    }

    @Test
    public void test2320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2320");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        int int1 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) '4');
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 1L);
        int int6 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker8 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 0.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1000 + "'", int1 == 1000);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2321");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 1);
        int int3 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 100);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(1.0d);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker8 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker8);
        int int10 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        double double12 = levenbergMarquardtOptimizer0.getChiSquare();
        double double13 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker14 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1000 + "'", int3 == 1000);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1000 + "'", int10 == 1000);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNull(vectorialConvergenceChecker14);
    }

    @Test
    public void test2322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2322");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 1);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 100L);
        double double5 = levenbergMarquardtOptimizer0.getChiSquare();
        int int6 = levenbergMarquardtOptimizer0.getIterations();
        int int7 = levenbergMarquardtOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker8 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker8);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) (-1L));
        int int12 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (-1));
        levenbergMarquardtOptimizer0.setMaxEvaluations(100);
        int int17 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction18 = null;
        double[] doubleArray19 = new double[] {};
        double[] doubleArray26 = new double[] { 'a', (short) -1, (byte) 1, 1.0f, 0.0d, 1.0f };
        double[] doubleArray31 = new double[] { 10.0f, (short) 100, (short) -1, 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair32 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction18, doubleArray19, doubleArray26, doubleArray31);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimensions mismatch 0 != 6");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertArrayEquals(doubleArray26, new double[] { 97.0d, (-1.0d), 1.0d, 1.0d, 0.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertArrayEquals(doubleArray31, new double[] { 10.0d, 100.0d, (-1.0d), 100.0d }, 1.0E-15);
    }

    @Test
    public void test2323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2323");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 1);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 100L);
        double double5 = levenbergMarquardtOptimizer0.getChiSquare();
        int int6 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int7 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1000 + "'", int6 == 1000);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2324");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 1);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 100L);
        double double5 = levenbergMarquardtOptimizer0.getChiSquare();
        int int6 = levenbergMarquardtOptimizer0.getIterations();
        int int7 = levenbergMarquardtOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker8 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker8);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) (-1L));
        int int12 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (-1));
        levenbergMarquardtOptimizer0.setMaxEvaluations(100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker17 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker17);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker19 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker19);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2325");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) 10);
        int int11 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker12 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray13 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertNull(vectorialConvergenceChecker12);
    }

    @Test
    public void test2326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2326");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int7 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 1000);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (short) 0);
        java.lang.Class<?> wildcardClass14 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2327");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) '#');
        levenbergMarquardtOptimizer0.setQRRankingThreshold(Double.NaN);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker8 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker8);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(0.0d);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) '4');
        // The following exception was thrown during execution in test generation
        try {
            double[][] doubleArray14 = levenbergMarquardtOptimizer0.getCovariances();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2328");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) 10);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0L);
        int int13 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int14 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) 1);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 1000);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2329");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 1.0f);
        int int10 = levenbergMarquardtOptimizer0.getIterations();
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) 'a');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker14 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) (byte) 10);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 1L);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) (short) 10);
        levenbergMarquardtOptimizer0.setMaxIterations((int) '#');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker23 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setQRRankingThreshold(10.0d);
        levenbergMarquardtOptimizer0.setMaxIterations(52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker14);
        org.junit.Assert.assertNull(vectorialConvergenceChecker23);
    }

    @Test
    public void test2330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2330");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) -1);
        int int7 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker8 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setMaxIterations(1);
        double double11 = levenbergMarquardtOptimizer0.getRMS();
        int int12 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        double double13 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker14 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker14);
        int int16 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        java.lang.Class<?> wildcardClass17 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(vectorialConvergenceChecker8);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2331");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        int int1 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker2 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double7 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker8 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) ' ');
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1000 + "'", int1 == 1000);
        org.junit.Assert.assertNull(vectorialConvergenceChecker2);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNull(vectorialConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2332");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        int int1 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) '4');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker4 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '#');
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) 'a');
        int int11 = levenbergMarquardtOptimizer0.getMaxIterations();
        double double12 = levenbergMarquardtOptimizer0.getChiSquare();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1000 + "'", int1 == 1000);
        org.junit.Assert.assertNull(vectorialConvergenceChecker4);
        org.junit.Assert.assertNull(vectorialConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test2333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2333");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 1);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 100L);
        double double5 = levenbergMarquardtOptimizer0.getChiSquare();
        double double6 = levenbergMarquardtOptimizer0.getChiSquare();
        double double7 = levenbergMarquardtOptimizer0.getRMS();
        double double8 = levenbergMarquardtOptimizer0.getRMS();
        int int9 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int10 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker11 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker11);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1000 + "'", int9 == 1000);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1000 + "'", int10 == 1000);
    }

    @Test
    public void test2334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2334");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double9 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 0);
        int int12 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance(0.0d);
        levenbergMarquardtOptimizer0.setParRelativeTolerance(Double.NaN);
        double double17 = levenbergMarquardtOptimizer0.getRMS();
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
    }

    @Test
    public void test2335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2335");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        int int1 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) '4');
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 1L);
        int int6 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int7 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int9 = levenbergMarquardtOptimizer0.getMaxIterations();
        java.lang.Class<?> wildcardClass10 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1000 + "'", int1 == 1000);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2336");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        double double9 = levenbergMarquardtOptimizer0.getChiSquare();
        int int10 = levenbergMarquardtOptimizer0.getEvaluations();
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray14 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2337");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        int int1 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) '4');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker4 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 2147483647);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) (-1L));
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 1);
        double double12 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 100L);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker15 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1000 + "'", int1 == 1000);
        org.junit.Assert.assertNull(vectorialConvergenceChecker4);
        org.junit.Assert.assertNull(vectorialConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNull(vectorialConvergenceChecker15);
    }

    @Test
    public void test2338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2338");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 1);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 100L);
        double double5 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) -1);
        levenbergMarquardtOptimizer0.setMaxEvaluations(97);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test2339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2339");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double9 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 0);
        int int12 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1000);
        double double15 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 10.0f);
        java.lang.Class<?> wildcardClass18 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2340");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        int int1 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) '4');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker4 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) '#');
        double double7 = levenbergMarquardtOptimizer0.getChiSquare();
        int int8 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1L));
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) 100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker14 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = vectorialConvergenceChecker14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1000 + "'", int1 == 1000);
        org.junit.Assert.assertNull(vectorialConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker14);
    }

    @Test
    public void test2341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2341");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double9 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 0);
        int int12 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker13 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker13);
        int int15 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
    }

    @Test
    public void test2342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2342");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 1.0f);
        int int10 = levenbergMarquardtOptimizer0.getIterations();
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) 'a');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker14 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) (byte) 10);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 1L);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) (short) 10);
        levenbergMarquardtOptimizer0.setMaxIterations((int) '#');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker23 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int24 = levenbergMarquardtOptimizer0.getEvaluations();
        int int25 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker14);
        org.junit.Assert.assertNull(vectorialConvergenceChecker23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test2343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2343");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 1);
        levenbergMarquardtOptimizer0.setMaxEvaluations(52);
        double double5 = levenbergMarquardtOptimizer0.getChiSquare();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test2344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2344");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double9 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 0);
        int int12 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int13 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setMaxEvaluations(2147483647);
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        int int18 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int19 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test2345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2345");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 1);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker5);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 1L);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) 0);
        int int11 = levenbergMarquardtOptimizer0.getEvaluations();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2346");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int9 = levenbergMarquardtOptimizer0.getEvaluations();
        int int10 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 35);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker13 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker13);
        int int15 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1000 + "'", int10 == 1000);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1000 + "'", int15 == 1000);
    }

    @Test
    public void test2347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2347");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 1);
        int int9 = levenbergMarquardtOptimizer0.getEvaluations();
        int int10 = levenbergMarquardtOptimizer0.getEvaluations();
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        int int12 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int13 = levenbergMarquardtOptimizer0.getIterations();
        // The following exception was thrown during execution in test generation
        try {
            double[][] doubleArray14 = levenbergMarquardtOptimizer0.getCovariances();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2348");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        int int5 = levenbergMarquardtOptimizer0.getMaxIterations();
        double double6 = levenbergMarquardtOptimizer0.getChiSquare();
        double double7 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) (short) 0);
        int int10 = levenbergMarquardtOptimizer0.getIterations();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1000 + "'", int5 == 1000);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2349");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 1);
        int int9 = levenbergMarquardtOptimizer0.getEvaluations();
        int int10 = levenbergMarquardtOptimizer0.getEvaluations();
        double double11 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setOrthoTolerance(Double.NaN);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 0);
        int int16 = levenbergMarquardtOptimizer0.getEvaluations();
        int int17 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) 10);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 52);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 35);
        double double24 = levenbergMarquardtOptimizer0.getRMS();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
    }

    @Test
    public void test2350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2350");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 1.0f);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(1.0d);
        levenbergMarquardtOptimizer0.setQRRankingThreshold(0.0d);
        int int14 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int15 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 10.0f);
        int int18 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setQRRankingThreshold(0.0d);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) (byte) -1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1000 + "'", int18 == 1000);
    }

    @Test
    public void test2351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2351");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 1);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 100L);
        double double5 = levenbergMarquardtOptimizer0.getChiSquare();
        int int6 = levenbergMarquardtOptimizer0.getIterations();
        int int7 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 100);
        double double10 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker11 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker12 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker12);
        double double14 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 0);
        int int17 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 1);
        java.lang.Class<?> wildcardClass20 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNull(vectorialConvergenceChecker11);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1000 + "'", int17 == 1000);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2352");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double9 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 0);
        int int12 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker13 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker13);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker15 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 10L);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) (byte) 100);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 100);
        java.lang.Class<?> wildcardClass22 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNull(vectorialConvergenceChecker15);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2353");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        int int10 = levenbergMarquardtOptimizer0.getEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray11 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2354");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 1);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 10);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(0.0d);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        int int9 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2355");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) 10);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 0.0f);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(0.0d);
        int int15 = levenbergMarquardtOptimizer0.getIterations();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2356");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double9 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 0);
        int int12 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1000);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 100);
        int int17 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int18 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int19 = levenbergMarquardtOptimizer0.getIterations();
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test2357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2357");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        int int3 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) (byte) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker8 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker8);
        // The following exception was thrown during execution in test generation
        try {
            double[][] doubleArray10 = levenbergMarquardtOptimizer0.getCovariances();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1000 + "'", int3 == 1000);
    }

    @Test
    public void test2358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2358");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        double double5 = levenbergMarquardtOptimizer0.getChiSquare();
        int int6 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1000 + "'", int6 == 1000);
    }

    @Test
    public void test2359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2359");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) -1);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker9 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker9);
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setMaxEvaluations(10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 100);
        double double16 = levenbergMarquardtOptimizer0.getChiSquare();
        int int17 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int18 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1000 + "'", int17 == 1000);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2360");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        int int1 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 10.0f);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 1);
        int int6 = levenbergMarquardtOptimizer0.getIterations();
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 35);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1000 + "'", int1 == 1000);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2361");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 1);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 10);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(0.0d);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) 1);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 100.0f);
        levenbergMarquardtOptimizer0.setMaxEvaluations(52);
        double double13 = levenbergMarquardtOptimizer0.getChiSquare();
        int int14 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
    }

    @Test
    public void test2362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2362");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) -1);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker9 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker9);
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setMaxEvaluations(10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker14 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker14);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 'a');
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 0);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2363");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        int int1 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) '4');
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 1L);
        int int6 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance(1.0d);
        int int9 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) (byte) -1);
        int int14 = levenbergMarquardtOptimizer0.getEvaluations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1000 + "'", int1 == 1000);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2364");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 1.0f);
        int int10 = levenbergMarquardtOptimizer0.getIterations();
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) 'a');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker14 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) (byte) 10);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 1L);
        int int19 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int20 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1000 + "'", int19 == 1000);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
    }

    @Test
    public void test2365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2365");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) -1);
        int int7 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker8 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setMaxIterations(1);
        double double11 = levenbergMarquardtOptimizer0.getRMS();
        int int12 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) -1);
        levenbergMarquardtOptimizer0.setOrthoTolerance(1.0d);
        double double17 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(vectorialConvergenceChecker8);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test2366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2366");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) '#');
        levenbergMarquardtOptimizer0.setQRRankingThreshold(Double.NaN);
        levenbergMarquardtOptimizer0.setMaxIterations(2147483647);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1);
        double double12 = levenbergMarquardtOptimizer0.getRMS();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test2367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2367");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 1);
        int int9 = levenbergMarquardtOptimizer0.getEvaluations();
        int int10 = levenbergMarquardtOptimizer0.getEvaluations();
        double double11 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setOrthoTolerance(Double.NaN);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 0);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 1);
        java.lang.Class<?> wildcardClass18 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2368");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) -1);
        int int7 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        int int12 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        double double13 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setMaxEvaluations(0);
        double double16 = levenbergMarquardtOptimizer0.getChiSquare();
        java.lang.Class<?> wildcardClass17 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2369");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 1);
        int int3 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int4 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(10.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1000 + "'", int3 == 1000);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2370");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double9 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 0);
        int int12 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance(0.0d);
        int int15 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        double double16 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
    }

    @Test
    public void test2371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2371");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) 10);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (-1L));
        int int13 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (byte) 100);
        double double16 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxEvaluations((-1));
        int int19 = levenbergMarquardtOptimizer0.getIterations();
        double double20 = levenbergMarquardtOptimizer0.getChiSquare();
        int int21 = levenbergMarquardtOptimizer0.getMaxIterations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray22 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1000 + "'", int21 == 1000);
    }

    @Test
    public void test2372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2372");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) 10);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (-1L));
        int int13 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (byte) 100);
        double double16 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxEvaluations((-1));
        int int19 = levenbergMarquardtOptimizer0.getIterations();
        double double20 = levenbergMarquardtOptimizer0.getChiSquare();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray21 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test2373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2373");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        levenbergMarquardtOptimizer0.setParRelativeTolerance(0.0d);
        int int9 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker10 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int11 = levenbergMarquardtOptimizer0.getMaxIterations();
        double double12 = levenbergMarquardtOptimizer0.getChiSquare();
        int int13 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        java.lang.Class<?> wildcardClass14 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1000 + "'", int11 == 1000);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2374");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        double double5 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (byte) 100);
        double double8 = levenbergMarquardtOptimizer0.getRMS();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test2375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2375");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) 10);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (-1L));
        int int13 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int14 = levenbergMarquardtOptimizer0.getEvaluations();
        double double15 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setMaxEvaluations(97);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair18 = levenbergMarquardtOptimizer0.doOptimize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
    }

    @Test
    public void test2376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2376");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double9 = levenbergMarquardtOptimizer0.getRMS();
        double double10 = levenbergMarquardtOptimizer0.getChiSquare();
        int int11 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int12 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1));
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction15 = null;
        double[] doubleArray17 = new double[] { 100.0d };
        double[] doubleArray23 = new double[] { 100.0d, 100.0d, 10.0f, 35, (byte) 1 };
        double[] doubleArray29 = new double[] { 1.0d, 2147483647, 1.0f, 1.0f, 35 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair30 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction15, doubleArray17, doubleArray23, doubleArray29);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimensions mismatch 1 != 5");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 100.0d, 100.0d, 10.0d, 35.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 1.0d, 2.147483647E9d, 1.0d, 1.0d, 35.0d }, 1.0E-15);
    }

    @Test
    public void test2377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2377");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 1);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 100L);
        int int5 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int6 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 100L);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 0);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1000 + "'", int5 == 1000);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2378");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker10 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker10);
        int int12 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker13 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker13);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 1);
        double double17 = levenbergMarquardtOptimizer0.getRMS();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
    }

    @Test
    public void test2379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2379");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        int int3 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double6 = levenbergMarquardtOptimizer0.getRMS();
        int int7 = levenbergMarquardtOptimizer0.getMaxIterations();
        double double8 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 0);
        java.lang.Class<?> wildcardClass11 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1000 + "'", int3 == 1000);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2380");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        int int1 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) '4');
        double double4 = levenbergMarquardtOptimizer0.getRMS();
        double double5 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(100.0d);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) 100);
        int int10 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 32);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 0);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) 100);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction17 = null;
        double[] doubleArray20 = new double[] { '4', (-1.0f) };
        double[] doubleArray22 = new double[] { 0L };
        double[] doubleArray28 = new double[] { (short) 1, 10L, 2147483647, 1.0f, Double.NaN };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair29 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction17, doubleArray20, doubleArray22, doubleArray28);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimensions mismatch 2 != 1");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1000 + "'", int1 == 1000);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 52.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertArrayEquals(doubleArray28, new double[] { 1.0d, 10.0d, 2.147483647E9d, 1.0d, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test2381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2381");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 1);
        int int9 = levenbergMarquardtOptimizer0.getEvaluations();
        int int10 = levenbergMarquardtOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker11 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) -1);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 100.0f);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 0);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 100);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 1);
        double double24 = levenbergMarquardtOptimizer0.getRMS();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker11);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
    }

    @Test
    public void test2382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2382");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double9 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 0);
        int int12 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1000);
        int int15 = levenbergMarquardtOptimizer0.getEvaluations();
        double double16 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test2383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2383");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        int int1 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 10.0f);
        levenbergMarquardtOptimizer0.setMaxIterations(10);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 0);
        int int8 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int9 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1000 + "'", int1 == 1000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2384");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 1);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 100L);
        double double5 = levenbergMarquardtOptimizer0.getChiSquare();
        double double6 = levenbergMarquardtOptimizer0.getChiSquare();
        int int7 = levenbergMarquardtOptimizer0.getEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker9 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int10 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker11 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int12 = levenbergMarquardtOptimizer0.getEvaluations();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertNull(vectorialConvergenceChecker11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2385");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) -1);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker9 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker9);
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        int int12 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker13 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double double14 = levenbergMarquardtOptimizer0.getChiSquare();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test2386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2386");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) -1);
        int int7 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker8 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setMaxIterations(1);
        double double11 = levenbergMarquardtOptimizer0.getRMS();
        int int12 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) -1);
        int int15 = levenbergMarquardtOptimizer0.getIterations();
        int int16 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction17 = null;
        double[] doubleArray23 = new double[] { 100, 2147483647, (short) -1, (-1), 0L };
        double[] doubleArray29 = new double[] { 52, '4', '4', 0.0f, 1.0f };
        double[] doubleArray32 = new double[] { (byte) 10, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair33 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction17, doubleArray23, doubleArray29, doubleArray32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(vectorialConvergenceChecker8);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 100.0d, 2.147483647E9d, (-1.0d), (-1.0d), 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 52.0d, 52.0d, 52.0d, 0.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[] { 10.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test2387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2387");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 1.0f);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(1.0d);
        levenbergMarquardtOptimizer0.setQRRankingThreshold(0.0d);
        int int14 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 0L);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 10);
        int int19 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 1);
        double double22 = levenbergMarquardtOptimizer0.getChiSquare();
        double double23 = levenbergMarquardtOptimizer0.getChiSquare();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
    }

    @Test
    public void test2388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2388");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        double double9 = levenbergMarquardtOptimizer0.getChiSquare();
        int int10 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (byte) 0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 100);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 100L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2389");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        int int5 = levenbergMarquardtOptimizer0.getMaxIterations();
        double double6 = levenbergMarquardtOptimizer0.getChiSquare();
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        double double9 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) '#');
        int int12 = levenbergMarquardtOptimizer0.getEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double[][] doubleArray13 = levenbergMarquardtOptimizer0.getCovariances();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1000 + "'", int5 == 1000);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2390");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        int int1 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 10.0f);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker4 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1000 + "'", int1 == 1000);
        org.junit.Assert.assertNull(vectorialConvergenceChecker4);
    }

    @Test
    public void test2391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2391");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) 10);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (-1L));
        int int13 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (byte) 100);
        int int16 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker17 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray18 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker17);
    }

    @Test
    public void test2392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2392");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double1 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 0);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 1);
        double double6 = levenbergMarquardtOptimizer0.getChiSquare();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker7 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(vectorialConvergenceChecker7);
    }

    @Test
    public void test2393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2393");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double9 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 0);
        int int12 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) 100);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) (short) 0);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) ' ');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker19 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker19);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 10L);
        int int23 = levenbergMarquardtOptimizer0.getEvaluations();
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test2394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2394");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        int int1 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) '4');
        double double4 = levenbergMarquardtOptimizer0.getRMS();
        double double5 = levenbergMarquardtOptimizer0.getChiSquare();
        int int6 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int7 = levenbergMarquardtOptimizer0.getEvaluations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1000 + "'", int1 == 1000);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2395");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) 10);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0L);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker13 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker13);
        double double15 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setParRelativeTolerance(100.0d);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(100.0d);
        int int20 = levenbergMarquardtOptimizer0.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker21 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker21);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test2396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2396");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 1);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 100L);
        double double5 = levenbergMarquardtOptimizer0.getChiSquare();
        double double6 = levenbergMarquardtOptimizer0.getChiSquare();
        int int7 = levenbergMarquardtOptimizer0.getEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker9 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (short) 0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 100);
        int int14 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 1000);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 'a');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker19 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker19);
        int int21 = levenbergMarquardtOptimizer0.getEvaluations();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1000 + "'", int14 == 1000);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2397");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        double double9 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        int int12 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 1000);
        int int15 = levenbergMarquardtOptimizer0.getEvaluations();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2398");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 1);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 10);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(0.0d);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) 1);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 0);
        int int11 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) -1);
        int int14 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 1L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2399");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 1.0f);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker10 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker10);
        int int12 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int13 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (-1.0f));
        int int16 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray17 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1000 + "'", int12 == 1000);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2400");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        double double9 = levenbergMarquardtOptimizer0.getChiSquare();
        int int10 = levenbergMarquardtOptimizer0.getEvaluations();
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker14 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker14);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 0);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 10L);
        levenbergMarquardtOptimizer0.setMaxEvaluations((-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2401");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) -1);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 100);
        int int9 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setMaxIterations((-1));
        int int12 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            double[][] doubleArray15 = levenbergMarquardtOptimizer0.getCovariances();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test2402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2402");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        double double9 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 2147483647);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) ' ');
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test2403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2403");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) 10);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (-1L));
        int int13 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        int int16 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2404");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 1);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 100L);
        double double5 = levenbergMarquardtOptimizer0.getChiSquare();
        double double6 = levenbergMarquardtOptimizer0.getChiSquare();
        double double7 = levenbergMarquardtOptimizer0.getRMS();
        double double8 = levenbergMarquardtOptimizer0.getChiSquare();
        double double9 = levenbergMarquardtOptimizer0.getChiSquare();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test2405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2405");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        int int1 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 10.0f);
        levenbergMarquardtOptimizer0.setMaxIterations(10);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 0);
        int int8 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int9 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int10 = levenbergMarquardtOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker11 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setQRRankingThreshold(10.0d);
        int int14 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1000 + "'", int1 == 1000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2406");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 1);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 10);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(0.0d);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) 1);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 0);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 100);
        levenbergMarquardtOptimizer0.setMaxEvaluations((-1));
    }

    @Test
    public void test2407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2407");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double9 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 0);
        int int12 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int13 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setMaxEvaluations(2147483647);
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        int int18 = levenbergMarquardtOptimizer0.getEvaluations();
        double double19 = levenbergMarquardtOptimizer0.getChiSquare();
        int int20 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 100.0f);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
    }

    @Test
    public void test2408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2408");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        int int9 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int10 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int11 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 10);
        double double14 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setMaxIterations(2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
    }

    @Test
    public void test2409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2409");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 1);
        int int9 = levenbergMarquardtOptimizer0.getEvaluations();
        int int10 = levenbergMarquardtOptimizer0.getEvaluations();
        double double11 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setOrthoTolerance(Double.NaN);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 0);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 0);
        levenbergMarquardtOptimizer0.setMaxEvaluations(0);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 1);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 100);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1.0f));
        java.lang.Class<?> wildcardClass26 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2410");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        double double4 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((-1.0d));
        int int7 = levenbergMarquardtOptimizer0.getIterations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray8 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2411");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        int int1 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 10.0f);
        double double4 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) '#');
        levenbergMarquardtOptimizer0.setParRelativeTolerance(1.0d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1000 + "'", int1 == 1000);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test2412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2412");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 1);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 10);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(0.0d);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) -1);
        levenbergMarquardtOptimizer0.setParRelativeTolerance(1.0d);
        int int12 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2413");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) 10);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (-1L));
        int int13 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int14 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int15 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2414");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double9 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker10 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker12 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker12);
        int int14 = levenbergMarquardtOptimizer0.getEvaluations();
        double double15 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) (byte) 0);
        int int18 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        double double19 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
    }

    @Test
    public void test2415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2415");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        int int10 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((-1));
        int int13 = levenbergMarquardtOptimizer0.getIterations();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction14 = null;
        double[] doubleArray15 = null;
        double[] doubleArray22 = new double[] { (-1.0d), 2147483647, 'a', 0.0d, (short) 10, 10L };
        double[] doubleArray29 = new double[] { 2147483647, (-1.0f), (short) 1, 10.0d, (-1.0f), (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair30 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction14, doubleArray15, doubleArray22, doubleArray29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { (-1.0d), 2.147483647E9d, 97.0d, 0.0d, 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 2.147483647E9d, (-1.0d), 1.0d, 10.0d, (-1.0d), 10.0d }, 1.0E-15);
    }

    @Test
    public void test2416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2416");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        int int10 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((-1));
        double double13 = levenbergMarquardtOptimizer0.getRMS();
        int int14 = levenbergMarquardtOptimizer0.getIterations();
        int int15 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2417");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 1);
        int int3 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 100);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (-1L));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1000 + "'", int3 == 1000);
    }

    @Test
    public void test2418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2418");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) -1);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 100);
        int int9 = levenbergMarquardtOptimizer0.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker10 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2419");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker1);
        levenbergMarquardtOptimizer0.setParRelativeTolerance(Double.NaN);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1L);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(1.0d);
        int int9 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int10 = levenbergMarquardtOptimizer0.getIterations();
        // The following exception was thrown during execution in test generation
        try {
            double[][] doubleArray11 = levenbergMarquardtOptimizer0.getCovariances();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2420");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 1);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 100L);
        double double5 = levenbergMarquardtOptimizer0.getChiSquare();
        double double6 = levenbergMarquardtOptimizer0.getChiSquare();
        double double7 = levenbergMarquardtOptimizer0.getRMS();
        double double8 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 1000);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test2421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2421");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) 10);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (-1L));
        int int13 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (byte) 100);
        double double16 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 1000);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test2422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2422");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 1);
        int int3 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 100);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(1.0d);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 10);
        int int10 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 10L);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker13 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(0.0d);
        int int16 = levenbergMarquardtOptimizer0.getMaxIterations();
        java.lang.Class<?> wildcardClass17 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1000 + "'", int3 == 1000);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertNull(vectorialConvergenceChecker13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1000 + "'", int16 == 1000);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2423");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 1);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker5);
        int int7 = levenbergMarquardtOptimizer0.getEvaluations();
        double double8 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker9 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker9);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker11 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker11);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker13 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker13);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test2424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2424");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) 10);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (-1L));
        int int13 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        int int16 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) '#');
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2425");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 1);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 100L);
        double double5 = levenbergMarquardtOptimizer0.getChiSquare();
        double double6 = levenbergMarquardtOptimizer0.getChiSquare();
        int int7 = levenbergMarquardtOptimizer0.getEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker9 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (short) 0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 100);
        int int14 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker15 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray16 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1000 + "'", int14 == 1000);
        org.junit.Assert.assertNull(vectorialConvergenceChecker15);
    }

    @Test
    public void test2426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2426");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        double double4 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int6 = levenbergMarquardtOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker7 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double double8 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNull(vectorialConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test2427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2427");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) -1);
        double double7 = levenbergMarquardtOptimizer0.getChiSquare();
        double double8 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setQRRankingThreshold(0.0d);
        int int11 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int12 = levenbergMarquardtOptimizer0.getMaxIterations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray13 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1000 + "'", int11 == 1000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1000 + "'", int12 == 1000);
    }

    @Test
    public void test2428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2428");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) -1);
        int int7 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker8 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setMaxIterations(1);
        double double11 = levenbergMarquardtOptimizer0.getRMS();
        int int12 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance(10.0d);
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int17 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        double double18 = levenbergMarquardtOptimizer0.getChiSquare();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(vectorialConvergenceChecker8);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test2429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2429");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 1);
        int int9 = levenbergMarquardtOptimizer0.getEvaluations();
        int int10 = levenbergMarquardtOptimizer0.getEvaluations();
        double double11 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setOrthoTolerance(Double.NaN);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 0);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(1.0d);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker18 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker18);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            double[][] doubleArray22 = levenbergMarquardtOptimizer0.getCovariances();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test2430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2430");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 1.0f);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(1.0d);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 100);
        int int14 = levenbergMarquardtOptimizer0.getEvaluations();
        int int15 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction16 = null;
        double[] doubleArray17 = new double[] {};
        double[] doubleArray20 = new double[] { 10, (-1.0f) };
        double[] doubleArray21 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair22 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction16, doubleArray17, doubleArray20, doubleArray21);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimensions mismatch 0 != 2");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] {}, 1.0E-15);
    }

    @Test
    public void test2431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2431");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double9 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        int int14 = levenbergMarquardtOptimizer0.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker15 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker15);
    }

    @Test
    public void test2432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2432");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) '#');
        levenbergMarquardtOptimizer0.setQRRankingThreshold(Double.NaN);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 52);
        levenbergMarquardtOptimizer0.setQRRankingThreshold(0.0d);
        int int12 = levenbergMarquardtOptimizer0.getEvaluations();
        java.lang.Class<?> wildcardClass13 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2433");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double9 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 0);
        int int12 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int13 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 2147483647);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(100.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test2434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2434");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 1);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 10);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(0.0d);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 10.0f);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker10 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int11 = levenbergMarquardtOptimizer0.getEvaluations();
        int int12 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker15 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int16 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 0.0f);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) 10);
        int int21 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker22 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertNull(vectorialConvergenceChecker22);
    }

    @Test
    public void test2435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2435");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        int int3 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) (byte) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker8 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker8);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 100);
        levenbergMarquardtOptimizer0.setQRRankingThreshold(Double.NaN);
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int16 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker17 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker17);
        int int19 = levenbergMarquardtOptimizer0.getIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1000 + "'", int3 == 1000);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test2436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2436");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double9 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 0);
        int int12 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int13 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (-1.0f));
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) -1);
        int int20 = levenbergMarquardtOptimizer0.getEvaluations();
        int int21 = levenbergMarquardtOptimizer0.getIterations();
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2437");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) -1);
        int int7 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker8 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setMaxIterations(1);
        double double11 = levenbergMarquardtOptimizer0.getRMS();
        int int12 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance(10.0d);
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int17 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 10L);
        int int20 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(vectorialConvergenceChecker8);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test2438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2438");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        int int5 = levenbergMarquardtOptimizer0.getMaxIterations();
        double double6 = levenbergMarquardtOptimizer0.getChiSquare();
        int int7 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 10.0f);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker10 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker10);
        // The following exception was thrown during execution in test generation
        try {
            double[][] doubleArray12 = levenbergMarquardtOptimizer0.getCovariances();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1000 + "'", int5 == 1000);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2439");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setMaxEvaluations(32);
    }

    @Test
    public void test2440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2440");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(0.0d);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 100.0f);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker8 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker8);
        double double10 = levenbergMarquardtOptimizer0.getRMS();
        int int11 = levenbergMarquardtOptimizer0.getMaxIterations();
        // The following exception was thrown during execution in test generation
        try {
            double[][] doubleArray12 = levenbergMarquardtOptimizer0.getCovariances();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1000 + "'", int11 == 1000);
    }

    @Test
    public void test2441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2441");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        double double9 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 2147483647);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker14 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int15 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNull(vectorialConvergenceChecker14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1000 + "'", int15 == 1000);
    }

    @Test
    public void test2442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2442");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker10 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker10);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2443");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) '#');
        levenbergMarquardtOptimizer0.setMaxIterations(2147483647);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(10.0d);
        double double10 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test2444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2444");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        int int1 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) '4');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker4 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) '#');
        int int7 = levenbergMarquardtOptimizer0.getIterations();
        double double8 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 32);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(0.0d);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker13 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker13);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker15 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker15);
        int int17 = levenbergMarquardtOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker18 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1000 + "'", int1 == 1000);
        org.junit.Assert.assertNull(vectorialConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker18);
    }

    @Test
    public void test2445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2445");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) 10);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (-1L));
        int int13 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int14 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) '#');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker17 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 100L);
        int int20 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int21 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1000 + "'", int14 == 1000);
        org.junit.Assert.assertNull(vectorialConvergenceChecker17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2446");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 1);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 100L);
        double double5 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 52);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker8 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker8);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 2147483647);
        int int12 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int13 = levenbergMarquardtOptimizer0.getEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double[][] doubleArray14 = levenbergMarquardtOptimizer0.getCovariances();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2447");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        int int1 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) '4');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker4 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) '#');
        int int7 = levenbergMarquardtOptimizer0.getIterations();
        double double8 = levenbergMarquardtOptimizer0.getChiSquare();
        int int9 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction10 = null;
        double[] doubleArray13 = new double[] { 2147483647, 1 };
        double[] doubleArray19 = new double[] { 97, 100, 0.0f, (-1), ' ' };
        double[] doubleArray20 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair21 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction10, doubleArray13, doubleArray19, doubleArray20);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimensions mismatch 2 != 5");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1000 + "'", int1 == 1000);
        org.junit.Assert.assertNull(vectorialConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 2.147483647E9d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 97.0d, 100.0d, 0.0d, (-1.0d), 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] {}, 1.0E-15);
    }

    @Test
    public void test2448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2448");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker1);
        levenbergMarquardtOptimizer0.setParRelativeTolerance(Double.NaN);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 1);
        int int7 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1000);
        int int10 = levenbergMarquardtOptimizer0.getIterations();
        int int11 = levenbergMarquardtOptimizer0.getEvaluations();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2449");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker1);
        int int3 = levenbergMarquardtOptimizer0.getEvaluations();
        double double4 = levenbergMarquardtOptimizer0.getRMS();
        double double5 = levenbergMarquardtOptimizer0.getRMS();
        int int6 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (-1L));
        int int9 = levenbergMarquardtOptimizer0.getMaxIterations();
        // The following exception was thrown during execution in test generation
        try {
            double[][] doubleArray10 = levenbergMarquardtOptimizer0.getCovariances();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1000 + "'", int6 == 1000);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1000 + "'", int9 == 1000);
    }

    @Test
    public void test2450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2450");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double9 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (byte) 100);
        levenbergMarquardtOptimizer0.setMaxEvaluations(100);
        // The following exception was thrown during execution in test generation
        try {
            double[][] doubleArray14 = levenbergMarquardtOptimizer0.getCovariances();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test2451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2451");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 1);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) ' ');
        int int5 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 1000);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 0);
        int int10 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2452");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        int int1 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) '4');
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 1L);
        int int6 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker8 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double double9 = levenbergMarquardtOptimizer0.getChiSquare();
        int int10 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int11 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1000 + "'", int1 == 1000);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2453");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 1);
        double double9 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setQRRankingThreshold((-1.0d));
        levenbergMarquardtOptimizer0.setParRelativeTolerance(0.0d);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) 0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) 'a');
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            double[][] doubleArray20 = levenbergMarquardtOptimizer0.getCovariances();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test2454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2454");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double9 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 0);
        int int12 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1000);
        double double15 = levenbergMarquardtOptimizer0.getChiSquare();
        double double16 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 0.0f);
        levenbergMarquardtOptimizer0.setParRelativeTolerance(0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test2455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2455");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        int int3 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double6 = levenbergMarquardtOptimizer0.getRMS();
        int int7 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) '#');
        levenbergMarquardtOptimizer0.setParRelativeTolerance(Double.NaN);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1000 + "'", int3 == 1000);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
    }

    @Test
    public void test2456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2456");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 1);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 100L);
        double double5 = levenbergMarquardtOptimizer0.getChiSquare();
        double double6 = levenbergMarquardtOptimizer0.getChiSquare();
        int int7 = levenbergMarquardtOptimizer0.getEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker9 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (short) 0);
        int int12 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int13 = levenbergMarquardtOptimizer0.getEvaluations();
        int int14 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1000 + "'", int12 == 1000);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1000 + "'", int14 == 1000);
    }

    @Test
    public void test2457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2457");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) 10);
        int int11 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int12 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setMaxEvaluations(2147483647);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '4');
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) (short) 1);
        java.lang.Class<?> wildcardClass19 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1000 + "'", int12 == 1000);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2458");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) -1);
        double double7 = levenbergMarquardtOptimizer0.getChiSquare();
        double double8 = levenbergMarquardtOptimizer0.getRMS();
        double double9 = levenbergMarquardtOptimizer0.getRMS();
        int int10 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1L);
        levenbergMarquardtOptimizer0.setMaxEvaluations(10);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0.0f);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker17 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker17);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) (byte) -1);
        int int21 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2459");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        double double9 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker10 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker10);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 'a');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker14 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int15 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int16 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1000);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 1);
        int int21 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNull(vectorialConvergenceChecker14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1000 + "'", int15 == 1000);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1000 + "'", int21 == 1000);
    }

    @Test
    public void test2460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2460");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) -1);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker9 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker9);
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        int int12 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int13 = levenbergMarquardtOptimizer0.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker14 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double double15 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker16 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 32);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker14);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertNull(vectorialConvergenceChecker16);
    }

    @Test
    public void test2461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2461");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) '#');
        levenbergMarquardtOptimizer0.setMaxIterations(2147483647);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 1000);
        int int10 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2462");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        int int9 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        double double10 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (-1));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker13 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker13);
        int int15 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int16 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test2463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2463");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        int int1 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) '4');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker4 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setMaxIterations((-1));
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1000 + "'", int1 == 1000);
        org.junit.Assert.assertNull(vectorialConvergenceChecker4);
    }

    @Test
    public void test2464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2464");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double9 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker10 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker11 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNull(vectorialConvergenceChecker10);
        org.junit.Assert.assertNull(vectorialConvergenceChecker11);
    }

    @Test
    public void test2465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2465");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        levenbergMarquardtOptimizer0.setParRelativeTolerance(0.0d);
        int int9 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker10 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((-1.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker10);
    }

    @Test
    public void test2466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2466");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        int int9 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int10 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int11 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance(10.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test2467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2467");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 1.0f);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker10 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker10);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) (byte) 10);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (short) 10);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 52);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(0.0d);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 1L);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 0L);
        levenbergMarquardtOptimizer0.setMaxIterations(10);
        levenbergMarquardtOptimizer0.setQRRankingThreshold(100.0d);
        int int28 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
    }

    @Test
    public void test2468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2468");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        levenbergMarquardtOptimizer0.setParRelativeTolerance(0.0d);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker11 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int12 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        double double13 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setQRRankingThreshold(0.0d);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.junit.Assert.assertNull(vectorialConvergenceChecker11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
    }

    @Test
    public void test2469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2469");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double9 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker10 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker12 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker12);
        int int14 = levenbergMarquardtOptimizer0.getEvaluations();
        double double15 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) (byte) 0);
        int int18 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setMaxEvaluations(32);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2470");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int9 = levenbergMarquardtOptimizer0.getEvaluations();
        int int10 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        double double12 = levenbergMarquardtOptimizer0.getRMS();
        double double13 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxIterations(52);
        java.lang.Class<?> wildcardClass16 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1000 + "'", int10 == 1000);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2471");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setMaxEvaluations(100);
        int int6 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int7 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 10.0f);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray10 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2472");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker1);
        levenbergMarquardtOptimizer0.setParRelativeTolerance(Double.NaN);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1L);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(1.0d);
        int int9 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        double double10 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 0.0f);
        int int13 = levenbergMarquardtOptimizer0.getEvaluations();
        int int14 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1000 + "'", int14 == 1000);
    }

    @Test
    public void test2473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2473");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 'a');
        levenbergMarquardtOptimizer0.setMaxEvaluations(1000);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((-1.0d));
        int int15 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        double double16 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 0.0f);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction19 = null;
        double[] doubleArray20 = new double[] {};
        double[] doubleArray21 = new double[] {};
        double[] doubleArray25 = new double[] { 97, 1L, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair26 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction19, doubleArray20, doubleArray21, doubleArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { 97.0d, 1.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test2474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2474");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) -1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker7 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int8 = levenbergMarquardtOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker9 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double double10 = levenbergMarquardtOptimizer0.getChiSquare();
        // The following exception was thrown during execution in test generation
        try {
            double[][] doubleArray11 = levenbergMarquardtOptimizer0.getCovariances();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(vectorialConvergenceChecker7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test2475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2475");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setMaxEvaluations(100);
        int int6 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker7 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker7);
        int int9 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) (-1));
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 100.0f);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2476");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) 10);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (-1L));
        int int13 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int16 = levenbergMarquardtOptimizer0.getEvaluations();
        int int17 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) ' ');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker20 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertNull(vectorialConvergenceChecker20);
    }

    @Test
    public void test2477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2477");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 1);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 100L);
        double double5 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 52);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker8 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker8);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 2147483647);
        int int12 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) 10);
        int int15 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2478");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 1.0f);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(1.0d);
        levenbergMarquardtOptimizer0.setQRRankingThreshold(0.0d);
        int int14 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 0L);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 10);
        int int19 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 1);
        double double22 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) -1);
        int int25 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        double double26 = levenbergMarquardtOptimizer0.getRMS();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
    }

    @Test
    public void test2479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2479");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 1.0f);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(1.0d);
        levenbergMarquardtOptimizer0.setQRRankingThreshold(0.0d);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(Double.NaN);
        double double16 = levenbergMarquardtOptimizer0.getChiSquare();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray17 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test2480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2480");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) 10);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (-1L));
        int int13 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int16 = levenbergMarquardtOptimizer0.getEvaluations();
        int int17 = levenbergMarquardtOptimizer0.getEvaluations();
        int int18 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        double double19 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '#');
        double double22 = levenbergMarquardtOptimizer0.getChiSquare();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test2481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2481");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 1.0f);
        int int10 = levenbergMarquardtOptimizer0.getIterations();
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) 'a');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker14 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) (byte) 10);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 1L);
        int int19 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        double double20 = levenbergMarquardtOptimizer0.getRMS();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
    }

    @Test
    public void test2482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2482");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) 10);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0L);
        int int13 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int14 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) 1);
        double double17 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setMaxEvaluations(2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
    }

    @Test
    public void test2483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2483");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        int int10 = levenbergMarquardtOptimizer0.getEvaluations();
        int int11 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int12 = levenbergMarquardtOptimizer0.getEvaluations();
        double double13 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            double[][] doubleArray16 = levenbergMarquardtOptimizer0.getCovariances();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1000 + "'", int11 == 1000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test2484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2484");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 1);
        double double9 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setQRRankingThreshold((-1.0d));
        double double12 = levenbergMarquardtOptimizer0.getRMS();
        double double13 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
    }

    @Test
    public void test2485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2485");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        int int3 = levenbergMarquardtOptimizer0.getIterations();
        int int4 = levenbergMarquardtOptimizer0.getEvaluations();
        int int5 = levenbergMarquardtOptimizer0.getEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray6 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2486");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) -1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker7 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int8 = levenbergMarquardtOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker9 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker10 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 0);
        double double13 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 100);
        org.junit.Assert.assertNull(vectorialConvergenceChecker7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker9);
        org.junit.Assert.assertNull(vectorialConvergenceChecker10);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
    }

    @Test
    public void test2487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2487");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 1);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 100L);
        double double5 = levenbergMarquardtOptimizer0.getChiSquare();
        double double6 = levenbergMarquardtOptimizer0.getChiSquare();
        double double7 = levenbergMarquardtOptimizer0.getRMS();
        double double8 = levenbergMarquardtOptimizer0.getRMS();
        double double9 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setMaxIterations((-1));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test2488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2488");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) -1);
        int int7 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 0);
        double double10 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker13 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker13);
        double double15 = levenbergMarquardtOptimizer0.getRMS();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
    }

    @Test
    public void test2489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2489");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) 10);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0L);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker13 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker13);
        int int15 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2490");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        double double4 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int6 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 100);
        levenbergMarquardtOptimizer0.setMaxIterations(32);
        levenbergMarquardtOptimizer0.setMaxIterations(1000);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNull(vectorialConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2491");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        int int3 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) (byte) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker8 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker8);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 100);
        int int12 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1000 + "'", int3 == 1000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2492");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 1);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 100L);
        double double5 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 52);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker8 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker8);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 2147483647);
        int int12 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) ' ');
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) 100);
        int int17 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair18 = levenbergMarquardtOptimizer0.doOptimize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2493");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        int int3 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance(10.0d);
        int int6 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction7 = null;
        double[] doubleArray10 = new double[] { (byte) 100, (-1.0d) };
        double[] doubleArray11 = new double[] {};
        double[] doubleArray12 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair13 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction7, doubleArray10, doubleArray11, doubleArray12);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimensions mismatch 2 != 0");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1000 + "'", int6 == 1000);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 100.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] {}, 1.0E-15);
    }

    @Test
    public void test2494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2494");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '#');
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) -1);
        int int5 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker6 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker6);
    }

    @Test
    public void test2495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2495");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 1);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 100L);
        double double5 = levenbergMarquardtOptimizer0.getChiSquare();
        double double6 = levenbergMarquardtOptimizer0.getChiSquare();
        int int7 = levenbergMarquardtOptimizer0.getEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int9 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 52);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2496");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) -1);
        int int7 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker10 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker10);
        levenbergMarquardtOptimizer0.setMaxEvaluations(10);
        int int14 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2497");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double9 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 0);
        int int12 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int13 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setMaxEvaluations(2147483647);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 100);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1.0f);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test2498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2498");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) 10);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (-1L));
        int int13 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 100);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 0.0f);
        levenbergMarquardtOptimizer0.setQRRankingThreshold((double) 0L);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) ' ');
        java.lang.Class<?> wildcardClass22 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2499");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        double double9 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker10 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker10);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 'a');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker14 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int15 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int16 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((-1));
        int int19 = levenbergMarquardtOptimizer0.getEvaluations();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNull(vectorialConvergenceChecker14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1000 + "'", int15 == 1000);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test2500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2500");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) 10);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0L);
        int int13 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int14 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
    }
}

