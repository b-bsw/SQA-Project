package org.apache.commons.math.optimization.general;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest10 {

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
    public void test5001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5001");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker6 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (byte) 10);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1L));
        int int11 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 0L);
        double double14 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setOrthoTolerance((-1.0d));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer17 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer17.setOrthoTolerance(0.0d);
        int int20 = levenbergMarquardtOptimizer17.getMaxEvaluations();
        levenbergMarquardtOptimizer17.setInitialStepBoundFactor((double) (byte) -1);
        levenbergMarquardtOptimizer17.setParRelativeTolerance((double) (short) -1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker25 = levenbergMarquardtOptimizer17.getConvergenceChecker();
        int int26 = levenbergMarquardtOptimizer17.getJacobianEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer27 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer27.setOrthoTolerance(0.0d);
        int int30 = levenbergMarquardtOptimizer27.getMaxEvaluations();
        levenbergMarquardtOptimizer27.setCostRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer27.setOrthoTolerance((-1.0d));
        levenbergMarquardtOptimizer27.setInitialStepBoundFactor((double) 10);
        levenbergMarquardtOptimizer27.setMaxEvaluations(0);
        int int39 = levenbergMarquardtOptimizer27.getIterations();
        int int40 = levenbergMarquardtOptimizer27.getIterations();
        double double41 = levenbergMarquardtOptimizer27.getChiSquare();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer42 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker43 = levenbergMarquardtOptimizer42.getConvergenceChecker();
        levenbergMarquardtOptimizer42.setInitialStepBoundFactor(10.0d);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer46 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker47 = levenbergMarquardtOptimizer46.getConvergenceChecker();
        levenbergMarquardtOptimizer46.setOrthoTolerance((double) '#');
        int int50 = levenbergMarquardtOptimizer46.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker51 = levenbergMarquardtOptimizer46.getConvergenceChecker();
        levenbergMarquardtOptimizer42.setConvergenceChecker(vectorialConvergenceChecker51);
        levenbergMarquardtOptimizer27.setConvergenceChecker(vectorialConvergenceChecker51);
        int int54 = levenbergMarquardtOptimizer27.getMaxIterations();
        levenbergMarquardtOptimizer27.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker57 = levenbergMarquardtOptimizer27.getConvergenceChecker();
        levenbergMarquardtOptimizer17.setConvergenceChecker(vectorialConvergenceChecker57);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker57);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction60 = null;
        double[] doubleArray61 = null;
        double[] doubleArray67 = new double[] { 0, (byte) -1, 'a', 0, (-1) };
        double[] doubleArray71 = new double[] { (-1L), 0, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair72 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction60, doubleArray61, doubleArray67, doubleArray71);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1000 + "'", int11 == 1000);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker43);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker47);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker51);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1000 + "'", int54 == 1000);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker57);
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertArrayEquals(doubleArray67, new double[] { 0.0d, (-1.0d), 97.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertArrayEquals(doubleArray71, new double[] { (-1.0d), 0.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test5002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5002");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        int int4 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) -1);
        double double7 = levenbergMarquardtOptimizer0.getRMS();
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test5003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5003");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        int int4 = levenbergMarquardtOptimizer0.getIterations();
        int int5 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations(100);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 100);
        int int10 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 100L);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((-1.0d));
        double double15 = levenbergMarquardtOptimizer0.getRMS();
        double double16 = levenbergMarquardtOptimizer0.getRMS();
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
    }

    @Test
    public void test5004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5004");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer0.setOrthoTolerance((-1.0d));
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations(0);
        int int12 = levenbergMarquardtOptimizer0.getIterations();
        int int13 = levenbergMarquardtOptimizer0.getIterations();
        double double14 = levenbergMarquardtOptimizer0.getChiSquare();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer15 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker16 = levenbergMarquardtOptimizer15.getConvergenceChecker();
        levenbergMarquardtOptimizer15.setInitialStepBoundFactor(10.0d);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer19 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker20 = levenbergMarquardtOptimizer19.getConvergenceChecker();
        levenbergMarquardtOptimizer19.setOrthoTolerance((double) '#');
        int int23 = levenbergMarquardtOptimizer19.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker24 = levenbergMarquardtOptimizer19.getConvergenceChecker();
        levenbergMarquardtOptimizer15.setConvergenceChecker(vectorialConvergenceChecker24);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker24);
        int int27 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker30 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0L);
        double double33 = levenbergMarquardtOptimizer0.getRMS();
        java.lang.Class<?> wildcardClass34 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker16);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1000 + "'", int27 == 1000);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker30);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test5005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5005");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (byte) -1);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1L));
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 2147483647);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1L);
        int int12 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setOrthoTolerance(1.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test5006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5006");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int4 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance(Double.NaN);
        levenbergMarquardtOptimizer0.setOrthoTolerance((-1.0d));
        int int9 = levenbergMarquardtOptimizer0.getEvaluations();
        double double10 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer11 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer11.setOrthoTolerance(0.0d);
        int int14 = levenbergMarquardtOptimizer11.getMaxEvaluations();
        levenbergMarquardtOptimizer11.setCostRelativeTolerance((double) (short) 1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker17 = levenbergMarquardtOptimizer11.getConvergenceChecker();
        levenbergMarquardtOptimizer11.setParRelativeTolerance((double) (short) 1);
        levenbergMarquardtOptimizer11.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker22 = levenbergMarquardtOptimizer11.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer23 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer23.setOrthoTolerance(0.0d);
        int int26 = levenbergMarquardtOptimizer23.getMaxEvaluations();
        levenbergMarquardtOptimizer23.setCostRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer23.setOrthoTolerance((-1.0d));
        levenbergMarquardtOptimizer23.setInitialStepBoundFactor((double) 10);
        levenbergMarquardtOptimizer23.setMaxEvaluations(0);
        int int35 = levenbergMarquardtOptimizer23.getIterations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer36 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker37 = levenbergMarquardtOptimizer36.getConvergenceChecker();
        levenbergMarquardtOptimizer36.setCostRelativeTolerance((double) 0);
        double double40 = levenbergMarquardtOptimizer36.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer41 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker42 = levenbergMarquardtOptimizer41.getConvergenceChecker();
        levenbergMarquardtOptimizer41.setInitialStepBoundFactor(10.0d);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer45 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker46 = levenbergMarquardtOptimizer45.getConvergenceChecker();
        levenbergMarquardtOptimizer45.setOrthoTolerance((double) '#');
        int int49 = levenbergMarquardtOptimizer45.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker50 = levenbergMarquardtOptimizer45.getConvergenceChecker();
        levenbergMarquardtOptimizer41.setConvergenceChecker(vectorialConvergenceChecker50);
        levenbergMarquardtOptimizer36.setConvergenceChecker(vectorialConvergenceChecker50);
        levenbergMarquardtOptimizer23.setConvergenceChecker(vectorialConvergenceChecker50);
        levenbergMarquardtOptimizer11.setConvergenceChecker(vectorialConvergenceChecker50);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker50);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 10);
        int int58 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker17);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker22);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker37);
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker42);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker46);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker50);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1000 + "'", int58 == 1000);
    }

    @Test
    public void test5007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5007");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        int int4 = levenbergMarquardtOptimizer0.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double double6 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1.0f);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 0.0f);
        int int11 = levenbergMarquardtOptimizer0.getMaxIterations();
        double double12 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setParRelativeTolerance(1.0d);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray17 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1000 + "'", int11 == 1000);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test5008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5008");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker6 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) 0);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) 10);
        int int13 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) 'a');
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 0);
        double double20 = levenbergMarquardtOptimizer0.getChiSquare();
        double double21 = levenbergMarquardtOptimizer0.getChiSquare();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test5009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5009");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker6 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (byte) 10);
        int int9 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int10 = levenbergMarquardtOptimizer0.getIterations();
        int int11 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int12 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        double double13 = levenbergMarquardtOptimizer0.getRMS();
        int int14 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        double double15 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1.0f);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test5010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5010");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) 0);
        int int8 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (byte) 0);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) -1);
        double double13 = levenbergMarquardtOptimizer0.getRMS();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1000 + "'", int8 == 1000);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
    }

    @Test
    public void test5011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5011");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(10.0d);
        int int4 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int5 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 100);
        int int8 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int9 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int10 = levenbergMarquardtOptimizer0.getEvaluations();
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1000 + "'", int4 == 1000);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test5012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5012");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(10.0d);
        int int4 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int5 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer6 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker7 = levenbergMarquardtOptimizer6.getConvergenceChecker();
        levenbergMarquardtOptimizer6.setOrthoTolerance((double) '#');
        int int10 = levenbergMarquardtOptimizer6.getIterations();
        int int11 = levenbergMarquardtOptimizer6.getMaxEvaluations();
        levenbergMarquardtOptimizer6.setMaxEvaluations((int) (byte) 0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker14 = levenbergMarquardtOptimizer6.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker14);
        double double16 = levenbergMarquardtOptimizer0.getRMS();
        double double17 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker18 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int19 = levenbergMarquardtOptimizer0.getIterations();
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1000 + "'", int4 == 1000);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1000 + "'", int5 == 1000);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker14);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test5013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5013");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer0.setOrthoTolerance((-1.0d));
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations(0);
        int int12 = levenbergMarquardtOptimizer0.getIterations();
        double double13 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker16 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker16);
        int int18 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test5014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5014");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        int int6 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0L);
        double double9 = levenbergMarquardtOptimizer0.getChiSquare();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer10 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker11 = levenbergMarquardtOptimizer10.getConvergenceChecker();
        levenbergMarquardtOptimizer10.setOrthoTolerance((double) '#');
        int int14 = levenbergMarquardtOptimizer10.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker15 = levenbergMarquardtOptimizer10.getConvergenceChecker();
        double double16 = levenbergMarquardtOptimizer10.getChiSquare();
        levenbergMarquardtOptimizer10.setCostRelativeTolerance((double) 1.0f);
        levenbergMarquardtOptimizer10.setParRelativeTolerance((double) 1000);
        int int21 = levenbergMarquardtOptimizer10.getJacobianEvaluations();
        levenbergMarquardtOptimizer10.setOrthoTolerance(0.0d);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer24 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer24.setOrthoTolerance(0.0d);
        int int27 = levenbergMarquardtOptimizer24.getMaxEvaluations();
        levenbergMarquardtOptimizer24.setCostRelativeTolerance((double) (short) 1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker30 = levenbergMarquardtOptimizer24.getConvergenceChecker();
        int int31 = levenbergMarquardtOptimizer24.getJacobianEvaluations();
        int int32 = levenbergMarquardtOptimizer24.getJacobianEvaluations();
        int int33 = levenbergMarquardtOptimizer24.getIterations();
        levenbergMarquardtOptimizer24.setMaxIterations(1000);
        int int36 = levenbergMarquardtOptimizer24.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker37 = levenbergMarquardtOptimizer24.getConvergenceChecker();
        levenbergMarquardtOptimizer10.setConvergenceChecker(vectorialConvergenceChecker37);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker37);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) -1);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1000 + "'", int6 == 1000);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker37);
    }

    @Test
    public void test5015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5015");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(10.0d);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer4 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = levenbergMarquardtOptimizer4.getConvergenceChecker();
        levenbergMarquardtOptimizer4.setOrthoTolerance((double) '#');
        int int8 = levenbergMarquardtOptimizer4.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker9 = levenbergMarquardtOptimizer4.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker9);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) '4');
        int int13 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 100L);
        double double16 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 1000);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker1);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test5016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5016");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker6 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int9 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setMaxIterations(1000);
        int int12 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker13 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setMaxEvaluations(32);
        double double16 = levenbergMarquardtOptimizer0.getChiSquare();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray17 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker13);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test5017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5017");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker6 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int7 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations(32);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 10);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5018");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer0.setOrthoTolerance((-1.0d));
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 10);
        levenbergMarquardtOptimizer0.setMaxIterations(2147483647);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer12 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker13 = levenbergMarquardtOptimizer12.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker13);
        levenbergMarquardtOptimizer0.setMaxEvaluations(1000);
        int int17 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker18 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int19 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        double double20 = levenbergMarquardtOptimizer0.getRMS();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
    }

    @Test
    public void test5019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5019");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        int int6 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int7 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setMaxEvaluations(97);
        int int10 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 100);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1000 + "'", int7 == 1000);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1000 + "'", int10 == 1000);
    }

    @Test
    public void test5020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5020");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer0.setOrthoTolerance((-1.0d));
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 10);
        int int10 = levenbergMarquardtOptimizer0.getEvaluations();
        int int11 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
    }

    @Test
    public void test5021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5021");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker6 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) 0);
        levenbergMarquardtOptimizer0.setMaxIterations((-1));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer13 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker14 = levenbergMarquardtOptimizer13.getConvergenceChecker();
        levenbergMarquardtOptimizer13.setOrthoTolerance((double) '#');
        int int17 = levenbergMarquardtOptimizer13.getIterations();
        int int18 = levenbergMarquardtOptimizer13.getMaxEvaluations();
        levenbergMarquardtOptimizer13.setMaxEvaluations(100);
        levenbergMarquardtOptimizer13.setMaxIterations((int) (byte) 100);
        levenbergMarquardtOptimizer13.setParRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer25 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer25.setOrthoTolerance(0.0d);
        int int28 = levenbergMarquardtOptimizer25.getMaxEvaluations();
        levenbergMarquardtOptimizer25.setCostRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer25.setOrthoTolerance((-1.0d));
        levenbergMarquardtOptimizer25.setInitialStepBoundFactor((double) 10);
        levenbergMarquardtOptimizer25.setMaxEvaluations(0);
        int int37 = levenbergMarquardtOptimizer25.getIterations();
        int int38 = levenbergMarquardtOptimizer25.getIterations();
        double double39 = levenbergMarquardtOptimizer25.getChiSquare();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer40 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker41 = levenbergMarquardtOptimizer40.getConvergenceChecker();
        levenbergMarquardtOptimizer40.setInitialStepBoundFactor(10.0d);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer44 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker45 = levenbergMarquardtOptimizer44.getConvergenceChecker();
        levenbergMarquardtOptimizer44.setOrthoTolerance((double) '#');
        int int48 = levenbergMarquardtOptimizer44.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker49 = levenbergMarquardtOptimizer44.getConvergenceChecker();
        levenbergMarquardtOptimizer40.setConvergenceChecker(vectorialConvergenceChecker49);
        levenbergMarquardtOptimizer25.setConvergenceChecker(vectorialConvergenceChecker49);
        levenbergMarquardtOptimizer13.setConvergenceChecker(vectorialConvergenceChecker49);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker49);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '4');
        java.lang.Class<?> wildcardClass56 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker41);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker45);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker49);
        org.junit.Assert.assertNotNull(wildcardClass56);
    }

    @Test
    public void test5022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5022");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        int int6 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) '4');
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) -1);
        int int11 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) -1);
        int int14 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1000 + "'", int6 == 1000);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test5023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5023");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        int int4 = levenbergMarquardtOptimizer0.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double double6 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) -1);
        levenbergMarquardtOptimizer0.setMaxIterations(1);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '4');
        double double13 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 100.0f);
        int int16 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int17 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test5024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5024");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer0.setOrthoTolerance((-1.0d));
        int int8 = levenbergMarquardtOptimizer0.getEvaluations();
        int int9 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (short) 100);
        int int12 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int13 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer14 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer14.setOrthoTolerance(0.0d);
        int int17 = levenbergMarquardtOptimizer14.getMaxEvaluations();
        levenbergMarquardtOptimizer14.setCostRelativeTolerance((double) (short) 1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker20 = levenbergMarquardtOptimizer14.getConvergenceChecker();
        int int21 = levenbergMarquardtOptimizer14.getJacobianEvaluations();
        int int22 = levenbergMarquardtOptimizer14.getJacobianEvaluations();
        int int23 = levenbergMarquardtOptimizer14.getIterations();
        levenbergMarquardtOptimizer14.setMaxIterations(1000);
        int int26 = levenbergMarquardtOptimizer14.getJacobianEvaluations();
        levenbergMarquardtOptimizer14.setMaxEvaluations(2147483647);
        levenbergMarquardtOptimizer14.setMaxEvaluations((int) (byte) 0);
        int int31 = levenbergMarquardtOptimizer14.getJacobianEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer32 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer32.setOrthoTolerance(0.0d);
        int int35 = levenbergMarquardtOptimizer32.getMaxEvaluations();
        levenbergMarquardtOptimizer32.setCostRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer32.setOrthoTolerance((-1.0d));
        levenbergMarquardtOptimizer32.setInitialStepBoundFactor((double) 10);
        levenbergMarquardtOptimizer32.setMaxEvaluations(0);
        int int44 = levenbergMarquardtOptimizer32.getIterations();
        int int45 = levenbergMarquardtOptimizer32.getIterations();
        double double46 = levenbergMarquardtOptimizer32.getChiSquare();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer47 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker48 = levenbergMarquardtOptimizer47.getConvergenceChecker();
        levenbergMarquardtOptimizer47.setInitialStepBoundFactor(10.0d);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer51 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker52 = levenbergMarquardtOptimizer51.getConvergenceChecker();
        levenbergMarquardtOptimizer51.setOrthoTolerance((double) '#');
        int int55 = levenbergMarquardtOptimizer51.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker56 = levenbergMarquardtOptimizer51.getConvergenceChecker();
        levenbergMarquardtOptimizer47.setConvergenceChecker(vectorialConvergenceChecker56);
        levenbergMarquardtOptimizer32.setConvergenceChecker(vectorialConvergenceChecker56);
        levenbergMarquardtOptimizer32.setInitialStepBoundFactor((double) 10);
        levenbergMarquardtOptimizer32.setMaxIterations((int) (byte) 100);
        int int63 = levenbergMarquardtOptimizer32.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker64 = levenbergMarquardtOptimizer32.getConvergenceChecker();
        levenbergMarquardtOptimizer14.setConvergenceChecker(vectorialConvergenceChecker64);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker64);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 2147483647);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2147483647 + "'", int35 == 2147483647);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker48);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker52);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker56);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker64);
    }

    @Test
    public void test5025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5025");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer4 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = levenbergMarquardtOptimizer4.getConvergenceChecker();
        levenbergMarquardtOptimizer4.setOrthoTolerance((double) '#');
        int int8 = levenbergMarquardtOptimizer4.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker9 = levenbergMarquardtOptimizer4.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker9);
        int int11 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) 0);
        int int14 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int15 = levenbergMarquardtOptimizer0.getEvaluations();
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker1);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1000 + "'", int14 == 1000);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test5026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5026");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker6 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) 0);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) 10);
        int int13 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) 'a');
        int int16 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int17 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int18 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int19 = levenbergMarquardtOptimizer0.getEvaluations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test5027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5027");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        int int6 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0L);
        int int9 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        double double10 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(0.0d);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 0);
        int int15 = levenbergMarquardtOptimizer0.getEvaluations();
        int int16 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1000 + "'", int6 == 1000);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1000 + "'", int16 == 1000);
    }

    @Test
    public void test5028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5028");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer0.setOrthoTolerance((-1.0d));
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations(0);
        int int12 = levenbergMarquardtOptimizer0.getIterations();
        int int13 = levenbergMarquardtOptimizer0.getIterations();
        double double14 = levenbergMarquardtOptimizer0.getChiSquare();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer15 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker16 = levenbergMarquardtOptimizer15.getConvergenceChecker();
        levenbergMarquardtOptimizer15.setInitialStepBoundFactor(10.0d);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer19 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker20 = levenbergMarquardtOptimizer19.getConvergenceChecker();
        levenbergMarquardtOptimizer19.setOrthoTolerance((double) '#');
        int int23 = levenbergMarquardtOptimizer19.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker24 = levenbergMarquardtOptimizer19.getConvergenceChecker();
        levenbergMarquardtOptimizer15.setConvergenceChecker(vectorialConvergenceChecker24);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker24);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 10);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 100);
        int int31 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 1.0f);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer34 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer34.setOrthoTolerance(0.0d);
        int int37 = levenbergMarquardtOptimizer34.getMaxEvaluations();
        levenbergMarquardtOptimizer34.setCostRelativeTolerance((double) (short) 1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker40 = levenbergMarquardtOptimizer34.getConvergenceChecker();
        levenbergMarquardtOptimizer34.setInitialStepBoundFactor((double) (byte) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker43 = levenbergMarquardtOptimizer34.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker43);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(Double.NaN);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker16);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker24);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2147483647 + "'", int37 == 2147483647);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker40);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker43);
    }

    @Test
    public void test5029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5029");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker4 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int5 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '4');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 100);
        levenbergMarquardtOptimizer0.setMaxEvaluations(52);
        int int12 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations(52);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker1);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test5030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5030");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) '4');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setMaxEvaluations(35);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker5);
    }

    @Test
    public void test5031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5031");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        int int4 = levenbergMarquardtOptimizer0.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double double6 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1.0f);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 1000);
        int int11 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer12 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker13 = levenbergMarquardtOptimizer12.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker13);
        int int15 = levenbergMarquardtOptimizer0.getEvaluations();
        double double16 = levenbergMarquardtOptimizer0.getChiSquare();
        int int17 = levenbergMarquardtOptimizer0.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker18 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) ' ');
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 97);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker18);
    }

    @Test
    public void test5032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5032");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        int int4 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 10.0f);
        int int7 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int9 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int10 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        double double11 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer14 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker15 = levenbergMarquardtOptimizer14.getConvergenceChecker();
        levenbergMarquardtOptimizer14.setOrthoTolerance((double) '#');
        int int18 = levenbergMarquardtOptimizer14.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker19 = levenbergMarquardtOptimizer14.getConvergenceChecker();
        double double20 = levenbergMarquardtOptimizer14.getChiSquare();
        levenbergMarquardtOptimizer14.setCostRelativeTolerance((double) 1.0f);
        levenbergMarquardtOptimizer14.setParRelativeTolerance((double) 1000);
        int int25 = levenbergMarquardtOptimizer14.getJacobianEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer26 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker27 = levenbergMarquardtOptimizer26.getConvergenceChecker();
        levenbergMarquardtOptimizer14.setConvergenceChecker(vectorialConvergenceChecker27);
        int int29 = levenbergMarquardtOptimizer14.getEvaluations();
        double double30 = levenbergMarquardtOptimizer14.getChiSquare();
        int int31 = levenbergMarquardtOptimizer14.getIterations();
        levenbergMarquardtOptimizer14.setInitialStepBoundFactor(0.0d);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker34 = levenbergMarquardtOptimizer14.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker34);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker34);
    }

    @Test
    public void test5033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5033");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        int int6 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((-1));
        int int12 = levenbergMarquardtOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer13 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer13.setOrthoTolerance(0.0d);
        int int16 = levenbergMarquardtOptimizer13.getMaxEvaluations();
        levenbergMarquardtOptimizer13.setCostRelativeTolerance((double) (byte) 10);
        int int19 = levenbergMarquardtOptimizer13.getJacobianEvaluations();
        levenbergMarquardtOptimizer13.setParRelativeTolerance((double) 100.0f);
        levenbergMarquardtOptimizer13.setCostRelativeTolerance(100.0d);
        int int24 = levenbergMarquardtOptimizer13.getMaxIterations();
        int int25 = levenbergMarquardtOptimizer13.getEvaluations();
        int int26 = levenbergMarquardtOptimizer13.getJacobianEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer27 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer27.setOrthoTolerance(0.0d);
        int int30 = levenbergMarquardtOptimizer27.getMaxEvaluations();
        levenbergMarquardtOptimizer27.setCostRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer27.setOrthoTolerance((-1.0d));
        levenbergMarquardtOptimizer27.setInitialStepBoundFactor((double) 10);
        double double37 = levenbergMarquardtOptimizer27.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer38 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker39 = levenbergMarquardtOptimizer38.getConvergenceChecker();
        levenbergMarquardtOptimizer38.setOrthoTolerance((double) '#');
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer42 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker43 = levenbergMarquardtOptimizer42.getConvergenceChecker();
        levenbergMarquardtOptimizer42.setOrthoTolerance((double) '#');
        int int46 = levenbergMarquardtOptimizer42.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker47 = levenbergMarquardtOptimizer42.getConvergenceChecker();
        levenbergMarquardtOptimizer38.setConvergenceChecker(vectorialConvergenceChecker47);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer49 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer49.setOrthoTolerance(0.0d);
        int int52 = levenbergMarquardtOptimizer49.getMaxEvaluations();
        levenbergMarquardtOptimizer49.setCostRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer49.setOrthoTolerance((-1.0d));
        levenbergMarquardtOptimizer49.setMaxEvaluations((-1));
        levenbergMarquardtOptimizer49.setMaxIterations(1000);
        double double61 = levenbergMarquardtOptimizer49.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer62 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker63 = levenbergMarquardtOptimizer62.getConvergenceChecker();
        levenbergMarquardtOptimizer49.setConvergenceChecker(vectorialConvergenceChecker63);
        levenbergMarquardtOptimizer38.setConvergenceChecker(vectorialConvergenceChecker63);
        levenbergMarquardtOptimizer27.setConvergenceChecker(vectorialConvergenceChecker63);
        levenbergMarquardtOptimizer27.setMaxEvaluations((int) ' ');
        int int69 = levenbergMarquardtOptimizer27.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker70 = levenbergMarquardtOptimizer27.getConvergenceChecker();
        levenbergMarquardtOptimizer13.setConvergenceChecker(vectorialConvergenceChecker70);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker70);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1000 + "'", int6 == 1000);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1000 + "'", int24 == 1000);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker39);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker43);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker47);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 2147483647 + "'", int52 == 2147483647);
        org.junit.Assert.assertTrue(Double.isNaN(double61));
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker63);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker70);
    }

    @Test
    public void test5034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5034");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        int int6 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0L);
        int int9 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int10 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) 'a');
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 0L);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 10);
        double double17 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) -1);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 1L);
        double double22 = levenbergMarquardtOptimizer0.getChiSquare();
        double double23 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setMaxIterations((int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1000 + "'", int6 == 1000);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
    }

    @Test
    public void test5035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5035");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        int int4 = levenbergMarquardtOptimizer0.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double double6 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1.0f);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 1000);
        int int11 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 1);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(100.0d);
        double double18 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxIterations((int) 'a');
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1.0f));
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 1L);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 97);
        levenbergMarquardtOptimizer0.setParRelativeTolerance(10.0d);
        java.lang.Class<?> wildcardClass29 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test5036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5036");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer0.setOrthoTolerance((-1.0d));
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 10);
        double double10 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer11 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker12 = levenbergMarquardtOptimizer11.getConvergenceChecker();
        levenbergMarquardtOptimizer11.setOrthoTolerance((double) '#');
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer15 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker16 = levenbergMarquardtOptimizer15.getConvergenceChecker();
        levenbergMarquardtOptimizer15.setOrthoTolerance((double) '#');
        int int19 = levenbergMarquardtOptimizer15.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker20 = levenbergMarquardtOptimizer15.getConvergenceChecker();
        levenbergMarquardtOptimizer11.setConvergenceChecker(vectorialConvergenceChecker20);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer22 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer22.setOrthoTolerance(0.0d);
        int int25 = levenbergMarquardtOptimizer22.getMaxEvaluations();
        levenbergMarquardtOptimizer22.setCostRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer22.setOrthoTolerance((-1.0d));
        levenbergMarquardtOptimizer22.setMaxEvaluations((-1));
        levenbergMarquardtOptimizer22.setMaxIterations(1000);
        double double34 = levenbergMarquardtOptimizer22.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer35 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker36 = levenbergMarquardtOptimizer35.getConvergenceChecker();
        levenbergMarquardtOptimizer22.setConvergenceChecker(vectorialConvergenceChecker36);
        levenbergMarquardtOptimizer11.setConvergenceChecker(vectorialConvergenceChecker36);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker36);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        int int42 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker43 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double double44 = levenbergMarquardtOptimizer0.getRMS();
        int int45 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) 10);
        double double48 = levenbergMarquardtOptimizer0.getRMS();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker12);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker20);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker36);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker43);
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 32 + "'", int45 == 32);
        org.junit.Assert.assertTrue(Double.isNaN(double48));
    }

    @Test
    public void test5037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5037");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (byte) -1);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) -1);
        int int8 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int9 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int10 = levenbergMarquardtOptimizer0.getIterations();
        int int11 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test5038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5038");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        int int4 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) 10);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test5039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5039");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer0.setOrthoTolerance((-1.0d));
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations(0);
        int int12 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) -1);
        double double15 = levenbergMarquardtOptimizer0.getRMS();
        double double16 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 0);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 52);
        double double21 = levenbergMarquardtOptimizer0.getChiSquare();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker22 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        java.lang.Class<?> wildcardClass23 = vectorialConvergenceChecker22.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test5040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5040");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        int int4 = levenbergMarquardtOptimizer0.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double double6 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1.0f);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 0.0f);
        int int11 = levenbergMarquardtOptimizer0.getMaxIterations();
        double double12 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setParRelativeTolerance(1.0d);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 10);
        int int19 = levenbergMarquardtOptimizer0.getIterations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer20 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer20.setOrthoTolerance(0.0d);
        int int23 = levenbergMarquardtOptimizer20.getMaxEvaluations();
        levenbergMarquardtOptimizer20.setCostRelativeTolerance((double) (byte) 10);
        int int26 = levenbergMarquardtOptimizer20.getMaxIterations();
        levenbergMarquardtOptimizer20.setCostRelativeTolerance((double) 0L);
        int int29 = levenbergMarquardtOptimizer20.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker30 = levenbergMarquardtOptimizer20.getConvergenceChecker();
        levenbergMarquardtOptimizer20.setInitialStepBoundFactor(100.0d);
        levenbergMarquardtOptimizer20.setParRelativeTolerance(100.0d);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer35 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker36 = levenbergMarquardtOptimizer35.getConvergenceChecker();
        levenbergMarquardtOptimizer35.setInitialStepBoundFactor(10.0d);
        int int39 = levenbergMarquardtOptimizer35.getMaxIterations();
        int int40 = levenbergMarquardtOptimizer35.getIterations();
        levenbergMarquardtOptimizer35.setInitialStepBoundFactor((double) 100.0f);
        int int43 = levenbergMarquardtOptimizer35.getMaxEvaluations();
        int int44 = levenbergMarquardtOptimizer35.getIterations();
        int int45 = levenbergMarquardtOptimizer35.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker46 = levenbergMarquardtOptimizer35.getConvergenceChecker();
        double double47 = levenbergMarquardtOptimizer35.getRMS();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker48 = levenbergMarquardtOptimizer35.getConvergenceChecker();
        levenbergMarquardtOptimizer20.setConvergenceChecker(vectorialConvergenceChecker48);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker48);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (byte) 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1000 + "'", int11 == 1000);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1000 + "'", int26 == 1000);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker30);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker36);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1000 + "'", int39 == 1000);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2147483647 + "'", int43 == 2147483647);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker46);
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker48);
    }

    @Test
    public void test5041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5041");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer0.setOrthoTolerance((-1.0d));
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations(0);
        int int12 = levenbergMarquardtOptimizer0.getIterations();
        int int13 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer14 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer14.setOrthoTolerance(0.0d);
        int int17 = levenbergMarquardtOptimizer14.getMaxEvaluations();
        levenbergMarquardtOptimizer14.setCostRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer14.setOrthoTolerance((-1.0d));
        levenbergMarquardtOptimizer14.setInitialStepBoundFactor((double) 10);
        levenbergMarquardtOptimizer14.setMaxIterations(2147483647);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer26 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker27 = levenbergMarquardtOptimizer26.getConvergenceChecker();
        levenbergMarquardtOptimizer14.setConvergenceChecker(vectorialConvergenceChecker27);
        levenbergMarquardtOptimizer14.setMaxEvaluations(1000);
        int int31 = levenbergMarquardtOptimizer14.getMaxIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker32 = levenbergMarquardtOptimizer14.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker32);
        int int34 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 32);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker27);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test5042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5042");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getIterations();
        int int4 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 100.0f);
        int int7 = levenbergMarquardtOptimizer0.getIterations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer8 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker9 = levenbergMarquardtOptimizer8.getConvergenceChecker();
        levenbergMarquardtOptimizer8.setOrthoTolerance((double) '#');
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer12 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker13 = levenbergMarquardtOptimizer12.getConvergenceChecker();
        levenbergMarquardtOptimizer12.setOrthoTolerance((double) '#');
        int int16 = levenbergMarquardtOptimizer12.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker17 = levenbergMarquardtOptimizer12.getConvergenceChecker();
        levenbergMarquardtOptimizer8.setConvergenceChecker(vectorialConvergenceChecker17);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer19 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer19.setOrthoTolerance(0.0d);
        int int22 = levenbergMarquardtOptimizer19.getMaxEvaluations();
        levenbergMarquardtOptimizer19.setCostRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer19.setOrthoTolerance((-1.0d));
        levenbergMarquardtOptimizer19.setMaxEvaluations((-1));
        levenbergMarquardtOptimizer19.setMaxIterations(1000);
        double double31 = levenbergMarquardtOptimizer19.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer32 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker33 = levenbergMarquardtOptimizer32.getConvergenceChecker();
        levenbergMarquardtOptimizer19.setConvergenceChecker(vectorialConvergenceChecker33);
        levenbergMarquardtOptimizer8.setConvergenceChecker(vectorialConvergenceChecker33);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker36 = levenbergMarquardtOptimizer8.getConvergenceChecker();
        int int37 = levenbergMarquardtOptimizer8.getMaxEvaluations();
        int int38 = levenbergMarquardtOptimizer8.getMaxIterations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer39 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer39.setOrthoTolerance(0.0d);
        int int42 = levenbergMarquardtOptimizer39.getMaxEvaluations();
        levenbergMarquardtOptimizer39.setCostRelativeTolerance((double) (short) 1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker45 = levenbergMarquardtOptimizer39.getConvergenceChecker();
        levenbergMarquardtOptimizer39.setInitialStepBoundFactor((double) (byte) 10);
        int int48 = levenbergMarquardtOptimizer39.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker49 = levenbergMarquardtOptimizer39.getConvergenceChecker();
        levenbergMarquardtOptimizer8.setConvergenceChecker(vectorialConvergenceChecker49);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker49);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker52 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker9);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker17);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker33);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2147483647 + "'", int37 == 2147483647);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1000 + "'", int38 == 1000);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 2147483647 + "'", int42 == 2147483647);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker45);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker49);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker52);
    }
}

