package org.apache.commons.math.optimization.fitting;

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
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint2 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint2);
        gaussianFitter1.addObservedPoint((double) (short) 1, (double) (byte) -1, 100.0d);
        gaussianFitter1.addObservedPoint((double) 10, (double) 100.0f, (double) (short) 1);
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray14 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (short) 0, 0.0d, 1.0d);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint19 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint19);
        gaussianFitter1.addObservedPoint((double) '4', (double) (byte) -1);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint24 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint24);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray26 = gaussianFitter1.getObservations();
        java.lang.Class<?> wildcardClass27 = weightedObservedPointArray26.getClass();
        org.junit.Assert.assertNotNull(weightedObservedPointArray14);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray14, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint2 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint2);
        gaussianFitter1.addObservedPoint((double) (short) 1, (double) (byte) -1, 100.0d);
        gaussianFitter1.addObservedPoint((double) (-1L), (double) (-1L), (double) (byte) 0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint12 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint12);
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint3);
        gaussianFitter1.addObservedPoint((double) (byte) 10, (double) 100, (double) '4');
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint9);
        gaussianFitter1.addObservedPoint((double) (short) 1, (double) (-1), (double) (short) 10);
        gaussianFitter1.addObservedPoint(0.0d, (double) (-1L));
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray18 = gaussianFitter1.getObservations();
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) (-1.0f), 0.0d, (double) (byte) 0);
        org.junit.Assert.assertNotNull(weightedObservedPointArray18);
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint4 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint4);
        gaussianFitter1.addObservedPoint((double) 0, (double) 100);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray10 = gaussianFitter1.getObservations();
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray12 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint13 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint13);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint15 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint15);
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray10);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray10, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray12);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray12, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint3);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint5 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint5);
        gaussianFitter1.addObservedPoint((double) (byte) 1, (double) 10);
        gaussianFitter1.addObservedPoint((double) 10L, 0.0d, (double) 0.0f);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint14 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint14);
        gaussianFitter1.addObservedPoint((double) (short) 0, (double) ' ');
        gaussianFitter1.addObservedPoint((double) (short) 100, 10.0d);
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint3);
        gaussianFitter1.addObservedPoint((double) (byte) 10, (double) 100, (double) '4');
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (short) -1, (double) 0, 0.0d);
        gaussianFitter1.addObservedPoint(0.0d, (double) (byte) 1, (double) 0.0f);
        org.apache.commons.math.analysis.ParametricUnivariateRealFunction parametricUnivariateRealFunction19 = null;
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer20 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter21 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer20);
        gaussianFitter21.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        gaussianFitter21.addObservedPoint((double) (byte) 100, (double) 100.0f);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray29 = gaussianFitter21.getObservations();
        gaussianFitter21.addObservedPoint((double) (byte) 10, (double) (byte) 10);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray33 = gaussianFitter21.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser34 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray33);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser35 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray33);
        double[] doubleArray36 = parameterGuesser35.guess();
        double[] doubleArray37 = parameterGuesser35.guess();
        double[] doubleArray38 = parameterGuesser35.guess();
        double[] doubleArray39 = parameterGuesser35.guess();
        double[] doubleArray40 = parameterGuesser35.guess();
        double[] doubleArray41 = parameterGuesser35.guess();
        double[] doubleArray42 = parameterGuesser35.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray43 = gaussianFitter1.fit((int) '#', parametricUnivariateRealFunction19, doubleArray42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertNotNull(weightedObservedPointArray29);
        org.junit.Assert.assertNotNull(weightedObservedPointArray33);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertArrayEquals(doubleArray36, new double[] { 100.0d, 100.0d, 38.219481012960856d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new double[] { 100.0d, 100.0d, 38.219481012960856d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { 100.0d, 100.0d, 38.219481012960856d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] { 100.0d, 100.0d, 38.219481012960856d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertArrayEquals(doubleArray40, new double[] { 100.0d, 100.0d, 38.219481012960856d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertArrayEquals(doubleArray41, new double[] { 100.0d, 100.0d, 38.219481012960856d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertArrayEquals(doubleArray42, new double[] { 100.0d, 100.0d, 38.219481012960856d }, 1.0E-15);
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint5 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint5);
        gaussianFitter1.addObservedPoint((double) (-1L), (double) (byte) 100);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint10 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint10);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint12 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint12);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray14 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (short) -1, (double) (short) 1, (double) 0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint19 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint19);
        gaussianFitter1.addObservedPoint((double) (-1), (double) 10, (double) (byte) 1);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint25 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint25);
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer27 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter28 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer27);
        gaussianFitter28.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        gaussianFitter28.addObservedPoint((double) (byte) 100, (double) 100.0f);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray36 = gaussianFitter28.getObservations();
        gaussianFitter28.addObservedPoint((double) (byte) 10, (double) (byte) 10);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray40 = gaussianFitter28.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser41 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray40);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser42 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray40);
        double[] doubleArray43 = parameterGuesser42.guess();
        double[] doubleArray44 = parameterGuesser42.guess();
        double[] doubleArray45 = parameterGuesser42.guess();
        double[] doubleArray46 = parameterGuesser42.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray47 = gaussianFitter1.fit(doubleArray46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray14);
        org.junit.Assert.assertNotNull(weightedObservedPointArray36);
        org.junit.Assert.assertNotNull(weightedObservedPointArray40);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new double[] { 100.0d, 100.0d, 38.219481012960856d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertArrayEquals(doubleArray44, new double[] { 100.0d, 100.0d, 38.219481012960856d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertArrayEquals(doubleArray45, new double[] { 100.0d, 100.0d, 38.219481012960856d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertArrayEquals(doubleArray46, new double[] { 100.0d, 100.0d, 38.219481012960856d }, 1.0E-15);
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint3);
        gaussianFitter1.addObservedPoint((double) (byte) 10, (double) 100, (double) '4');
        gaussianFitter1.addObservedPoint((double) '#', 0.0d, (double) 100L);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray13 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) 100L, (double) 100.0f, 1.0d);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint(0.0d, (double) 100L);
        org.junit.Assert.assertNotNull(weightedObservedPointArray13);
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint2 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint2);
        gaussianFitter1.addObservedPoint((double) (short) 1, (double) (byte) -1, 100.0d);
        gaussianFitter1.clearObservations();
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint4 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint4);
        gaussianFitter1.addObservedPoint((double) 0, (double) 100);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray10 = gaussianFitter1.getObservations();
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray12 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer13 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter14 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer13);
        gaussianFitter14.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray16 = gaussianFitter14.getObservations();
        gaussianFitter14.addObservedPoint((double) (short) 10, (double) 1L);
        gaussianFitter14.addObservedPoint((double) 'a', (double) (byte) 100, (double) '4');
        gaussianFitter14.clearObservations();
        gaussianFitter14.addObservedPoint((double) (short) 1, (double) '#', (double) 0);
        gaussianFitter14.addObservedPoint((double) 100, (double) 1, (-1.0d));
        gaussianFitter14.addObservedPoint((double) 0L, (double) (short) 10, (double) (-1L));
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray37 = gaussianFitter14.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser38 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray37);
        double[] doubleArray39 = parameterGuesser38.guess();
        double[] doubleArray40 = parameterGuesser38.guess();
        double[] doubleArray41 = parameterGuesser38.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray42 = gaussianFitter1.fit(doubleArray41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray10);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray10, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray12);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray12, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray16);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray16, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray37);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] { 0.0d, 35.0d, 14.438470604896324d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertArrayEquals(doubleArray40, new double[] { 0.0d, 35.0d, 14.438470604896324d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertArrayEquals(doubleArray41, new double[] { 0.0d, 35.0d, 14.438470604896324d }, 1.0E-15);
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint3);
        gaussianFitter1.addObservedPoint((double) (byte) 10, (double) 100, (double) '4');
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint9);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint11 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint11);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) (-1), (double) '#', (double) (byte) 100);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray18 = gaussianFitter1.getObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray18);
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint5 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint5);
        gaussianFitter1.addObservedPoint((double) (-1L), (double) (byte) 100);
        gaussianFitter1.addObservedPoint((double) 0L, (double) 10.0f);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.analysis.ParametricUnivariateRealFunction parametricUnivariateRealFunction14 = null;
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer15 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter16 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer15);
        gaussianFitter16.clearObservations();
        gaussianFitter16.addObservedPoint((double) 1, 1.0d);
        gaussianFitter16.addObservedPoint((double) (byte) -1, (double) (short) -1);
        gaussianFitter16.addObservedPoint((double) (byte) 0, (double) ' ');
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray27 = gaussianFitter16.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser28 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray27);
        double[] doubleArray29 = parameterGuesser28.guess();
        double[] doubleArray30 = parameterGuesser28.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray31 = gaussianFitter1.fit(parametricUnivariateRealFunction14, doubleArray30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray27);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 32.0d, 0.0d, 0.42507601343838297d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertArrayEquals(doubleArray30, new double[] { 32.0d, 0.0d, 0.42507601343838297d }, 1.0E-15);
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint5 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint5);
        gaussianFitter1.addObservedPoint((double) (-1L), (double) (byte) 100);
        gaussianFitter1.addObservedPoint((double) 0L, (double) 10.0f);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray13 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser14 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray13);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser15 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray13);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser16 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray13);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser17 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray13);
        org.junit.Assert.assertNotNull(weightedObservedPointArray13);
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray4 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint5 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint5);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint7 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint7);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint(100.0d, 0.0d, (double) 1);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray14 = gaussianFitter1.fit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray4);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray4, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray9, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] { null, null });
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint(0.0d, (double) 1.0f);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint5 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint5);
        gaussianFitter1.addObservedPoint((double) (short) 100, (double) 0);
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint2 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint2);
        gaussianFitter1.addObservedPoint((double) (short) 1, (double) (byte) -1, 100.0d);
        gaussianFitter1.addObservedPoint((double) 10, (double) 100.0f, (double) (short) 1);
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray14 = gaussianFitter1.getObservations();
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) 1L, (double) 1.0f, (double) 1.0f);
        org.junit.Assert.assertNotNull(weightedObservedPointArray14);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray14, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint3);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray6 = gaussianFitter1.getObservations();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser7 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray6);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (3)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray6);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray6, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint3);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray5 = gaussianFitter1.getObservations();
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray8 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint9);
        gaussianFitter1.addObservedPoint((double) '4', (double) (-1L), 100.0d);
        gaussianFitter1.addObservedPoint((double) (byte) 100, (double) 10.0f, (double) 100);
        org.junit.Assert.assertNotNull(weightedObservedPointArray5);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray5, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] { null });
        org.junit.Assert.assertNotNull(weightedObservedPointArray8);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray8, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint2 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint2);
        gaussianFitter1.addObservedPoint((double) (short) 1, (double) (byte) -1, 100.0d);
        gaussianFitter1.addObservedPoint((double) 10, (double) 100.0f, (double) (short) 1);
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray14 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (short) 0, 0.0d, 1.0d);
        gaussianFitter1.addObservedPoint((double) (-1.0f), (double) 10.0f, (double) (short) 100);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) 0.0f, (double) 100.0f);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint27 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint27);
        gaussianFitter1.addObservedPoint((double) 0, 0.0d);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint32 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint32);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray34 = gaussianFitter1.getObservations();
        gaussianFitter1.clearObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray14);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray14, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray34);
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint3);
        gaussianFitter1.addObservedPoint((double) (byte) 10, (double) 100, (double) '4');
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray10 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (-1.0f), (double) (short) -1);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint14 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint14);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray16 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser17 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray16);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray18 = parameterGuesser17.guess();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertNotNull(weightedObservedPointArray10);
        org.junit.Assert.assertNotNull(weightedObservedPointArray16);
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) 1, 1.0d);
        gaussianFitter1.addObservedPoint((double) (byte) -1, (double) (short) -1);
        gaussianFitter1.addObservedPoint((double) (byte) 0, (double) ' ');
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray12 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint(0.0d, 0.0d, 0.0d);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint17 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint17);
        org.junit.Assert.assertNotNull(weightedObservedPointArray12);
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (short) 10, (double) 1L);
        gaussianFitter1.addObservedPoint(0.0d, (double) (-1L), (double) (byte) 0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray11 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) 100, (-1.0d), (-1.0d));
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray16 = gaussianFitter1.getObservations();
        gaussianFitter1.clearObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray11);
        org.junit.Assert.assertNotNull(weightedObservedPointArray16);
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint3);
        gaussianFitter1.addObservedPoint((double) (byte) 10, (double) 100, (double) '4');
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint(0.0d, (double) 100.0f);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) (byte) -1, (double) 0L);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray17 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray18 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (byte) -1, (double) '#');
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertNotNull(weightedObservedPointArray17);
        org.junit.Assert.assertNotNull(weightedObservedPointArray18);
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) 1, 1.0d);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) (short) -1, (double) (byte) 0);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) ' ', 0.0d, (double) 100L);
        org.apache.commons.math.analysis.ParametricUnivariateRealFunction parametricUnivariateRealFunction15 = null;
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer16 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter17 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer16);
        gaussianFitter17.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        gaussianFitter17.addObservedPoint((double) (byte) 100, (double) 100.0f);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray25 = gaussianFitter17.getObservations();
        gaussianFitter17.addObservedPoint((double) (byte) 10, (double) (byte) 10);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray29 = gaussianFitter17.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser30 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray29);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser31 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray29);
        double[] doubleArray32 = parameterGuesser31.guess();
        double[] doubleArray33 = parameterGuesser31.guess();
        double[] doubleArray34 = parameterGuesser31.guess();
        double[] doubleArray35 = parameterGuesser31.guess();
        double[] doubleArray36 = parameterGuesser31.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray37 = gaussianFitter1.fit(parametricUnivariateRealFunction15, doubleArray36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray25);
        org.junit.Assert.assertNotNull(weightedObservedPointArray29);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[] { 100.0d, 100.0d, 38.219481012960856d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertArrayEquals(doubleArray33, new double[] { 100.0d, 100.0d, 38.219481012960856d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] { 100.0d, 100.0d, 38.219481012960856d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { 100.0d, 100.0d, 38.219481012960856d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertArrayEquals(doubleArray36, new double[] { 100.0d, 100.0d, 38.219481012960856d }, 1.0E-15);
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (short) 10, (double) 1L);
        gaussianFitter1.addObservedPoint((double) 1L, (double) (short) 10);
        gaussianFitter1.addObservedPoint((-1.0d), (double) (short) 10);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint14 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint14);
        gaussianFitter1.addObservedPoint(100.0d, (double) '#', 0.0d);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint20 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint20);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray22 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (byte) 100, (double) (byte) 10, (double) 0);
        gaussianFitter1.addObservedPoint((double) 100L, (-1.0d));
        gaussianFitter1.addObservedPoint(0.0d, (double) 100.0f);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer34 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter35 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer34);
        gaussianFitter35.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        gaussianFitter35.addObservedPoint((double) (byte) 100, (double) 100.0f);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray43 = gaussianFitter35.getObservations();
        gaussianFitter35.addObservedPoint((double) (byte) 10, (double) (byte) 10);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray47 = gaussianFitter35.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser48 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray47);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser49 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray47);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser50 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray47);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser51 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray47);
        double[] doubleArray52 = parameterGuesser51.guess();
        double[] doubleArray53 = parameterGuesser51.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray54 = gaussianFitter1.fit(doubleArray53);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray22);
        org.junit.Assert.assertNotNull(weightedObservedPointArray43);
        org.junit.Assert.assertNotNull(weightedObservedPointArray47);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertArrayEquals(doubleArray52, new double[] { 100.0d, 100.0d, 38.219481012960856d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertArrayEquals(doubleArray53, new double[] { 100.0d, 100.0d, 38.219481012960856d }, 1.0E-15);
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        gaussianFitter1.addObservedPoint((-1.0d), (double) (-1L), (double) (short) -1);
        gaussianFitter1.addObservedPoint((double) (short) 0, (double) (short) 100);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray13 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser14 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray13);
        double[] doubleArray15 = parameterGuesser14.guess();
        double[] doubleArray16 = parameterGuesser14.guess();
        double[] doubleArray17 = parameterGuesser14.guess();
        double[] doubleArray18 = parameterGuesser14.guess();
        org.junit.Assert.assertNotNull(weightedObservedPointArray13);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 100.0d, 0.0d, 21.4432731755886d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 100.0d, 0.0d, 21.4432731755886d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 100.0d, 0.0d, 21.4432731755886d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 100.0d, 0.0d, 21.4432731755886d }, 1.0E-15);
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (-1), (double) (short) 100, (double) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray8 = gaussianFitter1.fit();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 1 is smaller than the minimum (3)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (short) 10, (double) 1L);
        gaussianFitter1.addObservedPoint((double) 'a', (double) (byte) 100, (double) '4');
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint11 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint11);
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray15 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint(100.0d, (double) 100L);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray19 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray20 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (-1), (double) 'a');
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray25 = gaussianFitter1.getObservations();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser26 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray25);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (3)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray15);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray15, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray19);
        org.junit.Assert.assertNotNull(weightedObservedPointArray20);
        org.junit.Assert.assertNotNull(weightedObservedPointArray25);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray25, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) 1, 1.0d);
        gaussianFitter1.addObservedPoint((double) (byte) 1, (double) 10, (double) '4');
        gaussianFitter1.addObservedPoint((double) (byte) 1, 0.0d);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint13 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint13);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint15 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint15);
        gaussianFitter1.addObservedPoint((double) 10L, (double) (byte) 0, (double) (byte) 10);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray21 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint(100.0d, (double) 0);
        org.junit.Assert.assertNotNull(weightedObservedPointArray21);
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (short) 10, (double) 1L);
        gaussianFitter1.addObservedPoint((double) 1L, (double) (short) 10);
        gaussianFitter1.addObservedPoint((-1.0d), (double) (short) 10);
        gaussianFitter1.addObservedPoint((double) (byte) 1, 100.0d);
        gaussianFitter1.addObservedPoint((double) 10.0f, 0.0d);
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) 1, 1.0d);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) (short) -1, (double) (byte) 0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray10 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray11 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (byte) 0, (double) 1.0f, (double) 1.0f);
        org.junit.Assert.assertNotNull(weightedObservedPointArray10);
        org.junit.Assert.assertNotNull(weightedObservedPointArray11);
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) (-1L), (double) (byte) 0, (double) 'a');
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint7 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint7);
        gaussianFitter1.addObservedPoint((double) ' ', (double) (-1.0f));
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray12 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser13 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray12);
        org.junit.Assert.assertNotNull(weightedObservedPointArray12);
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint2 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint2);
        gaussianFitter1.addObservedPoint((double) (short) 1, (double) (byte) -1, 100.0d);
        gaussianFitter1.addObservedPoint((double) 10, (double) 100.0f, (double) (short) 1);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray13 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray14 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint15 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint15);
        gaussianFitter1.addObservedPoint((double) 'a', (double) 1.0f, 100.0d);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint21 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint21);
        org.junit.Assert.assertNotNull(weightedObservedPointArray13);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray13, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray14);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray14, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (-1), (double) (short) 100, (double) (byte) 10);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = gaussianFitter1.getObservations();
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) 0.0f, (double) (short) -1);
        gaussianFitter1.addObservedPoint(1.0d, (double) 100L);
        gaussianFitter1.addObservedPoint((double) 'a', (double) 'a', 1.0d);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray21 = gaussianFitter1.getObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray9, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray21);
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray4 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint5 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint5);
        gaussianFitter1.addObservedPoint((double) 1L, (double) (-1.0f));
        gaussianFitter1.addObservedPoint((double) 1.0f, (double) 0.0f);
        org.apache.commons.math.analysis.ParametricUnivariateRealFunction parametricUnivariateRealFunction14 = null;
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer15 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter16 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer15);
        gaussianFitter16.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        gaussianFitter16.addObservedPoint((double) (byte) 100, (double) 100.0f);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray24 = gaussianFitter16.getObservations();
        gaussianFitter16.addObservedPoint((double) (byte) 10, (double) (byte) 10);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray28 = gaussianFitter16.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser29 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray28);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser30 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray28);
        double[] doubleArray31 = parameterGuesser30.guess();
        double[] doubleArray32 = parameterGuesser30.guess();
        double[] doubleArray33 = parameterGuesser30.guess();
        double[] doubleArray34 = parameterGuesser30.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray35 = gaussianFitter1.fit((int) (short) -1, parametricUnivariateRealFunction14, doubleArray34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray4);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray4, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray24);
        org.junit.Assert.assertNotNull(weightedObservedPointArray28);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertArrayEquals(doubleArray31, new double[] { 100.0d, 100.0d, 38.219481012960856d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[] { 100.0d, 100.0d, 38.219481012960856d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertArrayEquals(doubleArray33, new double[] { 100.0d, 100.0d, 38.219481012960856d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] { 100.0d, 100.0d, 38.219481012960856d }, 1.0E-15);
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) (-1), (double) (byte) 100, (double) ' ');
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) (short) 100, (double) (short) 100);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) (short) 0, (double) 'a');
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray16 = gaussianFitter1.getObservations();
        org.apache.commons.math.analysis.ParametricUnivariateRealFunction parametricUnivariateRealFunction18 = null;
        double[] doubleArray19 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray20 = gaussianFitter1.fit((int) ' ', parametricUnivariateRealFunction18, doubleArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray16);
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) 1, 1.0d);
        gaussianFitter1.addObservedPoint((double) (byte) -1, (double) (short) -1);
        gaussianFitter1.addObservedPoint((double) (byte) 0, (double) ' ');
        org.apache.commons.math.analysis.ParametricUnivariateRealFunction parametricUnivariateRealFunction13 = null;
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer14 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter15 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer14);
        gaussianFitter15.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        gaussianFitter15.addObservedPoint((double) (byte) 100, (double) 100.0f);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray23 = gaussianFitter15.getObservations();
        gaussianFitter15.addObservedPoint((double) (byte) 10, (double) (byte) 10);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray27 = gaussianFitter15.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray28 = gaussianFitter15.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser29 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray28);
        double[] doubleArray30 = parameterGuesser29.guess();
        double[] doubleArray31 = parameterGuesser29.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray32 = gaussianFitter1.fit((int) (byte) 100, parametricUnivariateRealFunction13, doubleArray31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray23);
        org.junit.Assert.assertNotNull(weightedObservedPointArray27);
        org.junit.Assert.assertNotNull(weightedObservedPointArray28);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertArrayEquals(doubleArray30, new double[] { 100.0d, 100.0d, 38.219481012960856d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertArrayEquals(doubleArray31, new double[] { 100.0d, 100.0d, 38.219481012960856d }, 1.0E-15);
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray4 = gaussianFitter1.getObservations();
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) (short) -1, (double) 100L, (double) 100L);
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray4);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray4, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint3);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray5 = gaussianFitter1.getObservations();
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray8 = gaussianFitter1.getObservations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray9 = gaussianFitter1.fit();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (3)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray5);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray5, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] { null });
        org.junit.Assert.assertNotNull(weightedObservedPointArray8);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray8, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        gaussianFitter1.addObservedPoint(10.0d, (double) 10.0f, (double) '4');
        gaussianFitter1.addObservedPoint((-1.0d), 0.0d);
        gaussianFitter1.addObservedPoint((double) ' ', (double) (short) 10);
        gaussianFitter1.addObservedPoint((double) 0.0f, (double) 10L, (double) 10.0f);
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer20 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter21 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer20);
        gaussianFitter21.clearObservations();
        gaussianFitter21.clearObservations();
        gaussianFitter21.addObservedPoint((double) 10.0f, (double) (short) 10, 0.0d);
        gaussianFitter21.addObservedPoint((double) (byte) 100, (double) (short) 1, 0.0d);
        gaussianFitter21.addObservedPoint((double) 0, (double) 1.0f);
        gaussianFitter21.addObservedPoint(0.0d, (double) 1L);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray38 = gaussianFitter21.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser39 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray38);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser40 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray38);
        double[] doubleArray41 = parameterGuesser40.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray42 = gaussianFitter1.fit(doubleArray41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray38);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertArrayEquals(doubleArray41, new double[] { 1.0d, 0.0d, 4.2466090014400955d }, 1.0E-15);
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint2 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint2);
        gaussianFitter1.addObservedPoint((double) (short) 1, (double) (byte) -1, 100.0d);
        gaussianFitter1.addObservedPoint((double) 10, (double) 100.0f, (double) (short) 1);
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray14 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (short) 0, 0.0d, 1.0d);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint19 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint19);
        gaussianFitter1.addObservedPoint((double) '4', (double) (byte) -1);
        gaussianFitter1.addObservedPoint((double) (byte) 0, (double) (byte) 10);
        gaussianFitter1.addObservedPoint((double) '4', (double) (byte) 1);
        gaussianFitter1.addObservedPoint((double) 1, (double) (short) 100);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint33 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint33);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint35 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint35);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint37 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint37);
        gaussianFitter1.addObservedPoint((double) '#', (double) (byte) 1);
        gaussianFitter1.addObservedPoint((double) (-1L), (double) '4');
        org.junit.Assert.assertNotNull(weightedObservedPointArray14);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray14, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint3);
        gaussianFitter1.addObservedPoint((double) (byte) 10, (double) 100, (double) '4');
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint9);
        gaussianFitter1.addObservedPoint((double) (short) 1, (double) (-1), (double) (short) 10);
        gaussianFitter1.addObservedPoint(0.0d, (double) (-1L));
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray18 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) 10.0f, (double) 1, (double) 100L);
        gaussianFitter1.addObservedPoint((double) (byte) -1, (double) (-1L));
        org.junit.Assert.assertNotNull(weightedObservedPointArray18);
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (-1), (double) (short) 100, (double) (byte) 10);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = gaussianFitter1.getObservations();
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint(100.0d, (double) 100.0f);
        org.apache.commons.math.analysis.ParametricUnivariateRealFunction parametricUnivariateRealFunction14 = null;
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer15 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter16 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer15);
        gaussianFitter16.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        gaussianFitter16.addObservedPoint((double) (byte) 100, (double) 100.0f);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray24 = gaussianFitter16.getObservations();
        gaussianFitter16.addObservedPoint((double) (byte) 10, (double) (byte) 10);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray28 = gaussianFitter16.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser29 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray28);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser30 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray28);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser31 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray28);
        double[] doubleArray32 = parameterGuesser31.guess();
        double[] doubleArray33 = parameterGuesser31.guess();
        double[] doubleArray34 = parameterGuesser31.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray35 = gaussianFitter1.fit(parametricUnivariateRealFunction14, doubleArray34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray9, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray24);
        org.junit.Assert.assertNotNull(weightedObservedPointArray28);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[] { 100.0d, 100.0d, 38.219481012960856d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertArrayEquals(doubleArray33, new double[] { 100.0d, 100.0d, 38.219481012960856d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] { 100.0d, 100.0d, 38.219481012960856d }, 1.0E-15);
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) (-1L), (double) (byte) 0, (double) 'a');
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray7 = gaussianFitter1.getObservations();
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) 'a', 0.0d);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint12 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint12);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint14 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint14);
        java.lang.Class<?> wildcardClass16 = gaussianFitter1.getClass();
        org.junit.Assert.assertNotNull(weightedObservedPointArray7);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint3);
        gaussianFitter1.addObservedPoint((double) (byte) 10, (double) 100, (double) '4');
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint9);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint11 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint11);
        gaussianFitter1.addObservedPoint((double) '#', (double) 1, (double) (short) 10);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint18 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint18);
        org.apache.commons.math.analysis.ParametricUnivariateRealFunction parametricUnivariateRealFunction21 = null;
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer22 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter23 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer22);
        gaussianFitter23.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray25 = gaussianFitter23.getObservations();
        gaussianFitter23.addObservedPoint((double) (short) 10, (double) 1L);
        gaussianFitter23.addObservedPoint((double) (byte) -1, (double) (short) -1);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray32 = gaussianFitter23.getObservations();
        gaussianFitter23.addObservedPoint((double) (short) 0, (double) (-1L), 1.0d);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray37 = gaussianFitter23.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser38 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray37);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser39 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray37);
        double[] doubleArray40 = parameterGuesser39.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray41 = gaussianFitter1.fit((int) (byte) 1, parametricUnivariateRealFunction21, doubleArray40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray25);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray25, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray32);
        org.junit.Assert.assertNotNull(weightedObservedPointArray37);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertArrayEquals(doubleArray40, new double[] { 1.0d, (-1.0d), 4.671269901584105d }, 1.0E-15);
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        gaussianFitter1.addObservedPoint((double) (byte) 100, (double) 100.0f);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (byte) 10, (double) (byte) 10);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray13 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser14 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray13);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser15 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray13);
        double[] doubleArray16 = parameterGuesser15.guess();
        java.lang.Class<?> wildcardClass17 = doubleArray16.getClass();
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertNotNull(weightedObservedPointArray13);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 100.0d, 100.0d, 38.219481012960856d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) (-1), 100.0d);
        gaussianFitter1.addObservedPoint((double) 10L, (double) 1.0f);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint(0.0d, 100.0d);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint14 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint14);
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint3);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray5 = gaussianFitter1.getObservations();
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) '4', 10.0d, (double) 10L);
        gaussianFitter1.addObservedPoint((double) 0L, (double) (-1L));
        gaussianFitter1.addObservedPoint(0.0d, (double) 100L, (double) 1);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint18 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint18);
        gaussianFitter1.addObservedPoint((double) 10.0f, (double) '4');
        org.junit.Assert.assertNotNull(weightedObservedPointArray5);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray5, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] { null });
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        gaussianFitter1.addObservedPoint(10.0d, (double) 10.0f, (double) '4');
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint11 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint11);
        gaussianFitter1.addObservedPoint((double) 1L, (double) (-1.0f), 0.0d);
        gaussianFitter1.addObservedPoint((double) (short) 10, (double) '#', (double) (short) 0);
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint3);
        gaussianFitter1.addObservedPoint((double) (byte) 10, (double) 100, (double) '4');
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint9);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint11 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint11);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint13 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint13);
        gaussianFitter1.addObservedPoint((double) 10, (double) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray18 = gaussianFitter1.fit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray4 = gaussianFitter1.getObservations();
        double[] doubleArray5 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray6 = gaussianFitter1.fit(doubleArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray4);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray4, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (short) 10, (double) 1L);
        gaussianFitter1.addObservedPoint((double) 'a', (double) (byte) 100, (double) '4');
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) 100.0f, (double) 10, 10.0d);
        gaussianFitter1.addObservedPoint((-1.0d), (double) 100.0f);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray19 = gaussianFitter1.fit();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 2 is smaller than the minimum (3)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) (-1), 100.0d);
        gaussianFitter1.addObservedPoint((double) 10L, (double) 1.0f);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint(0.0d, 100.0d);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray13 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint14 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint14);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint16 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint16);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray18 = gaussianFitter1.getObservations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray19 = gaussianFitter1.fit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray13);
        org.junit.Assert.assertNotNull(weightedObservedPointArray18);
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint3);
        gaussianFitter1.addObservedPoint((double) (byte) 10, (double) 100, (double) '4');
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint9);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint11 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint11);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint13 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint13);
        gaussianFitter1.addObservedPoint(0.0d, 10.0d);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.analysis.ParametricUnivariateRealFunction parametricUnivariateRealFunction20 = null;
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer21 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter22 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer21);
        gaussianFitter22.clearObservations();
        gaussianFitter22.addObservedPoint((double) 1, 1.0d);
        gaussianFitter22.addObservedPoint((double) (byte) -1, (double) (short) -1);
        gaussianFitter22.addObservedPoint((double) (byte) 0, (double) ' ');
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray33 = gaussianFitter22.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser34 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray33);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser35 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray33);
        double[] doubleArray36 = parameterGuesser35.guess();
        double[] doubleArray37 = parameterGuesser35.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray38 = gaussianFitter1.fit(10, parametricUnivariateRealFunction20, doubleArray37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray33);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertArrayEquals(doubleArray36, new double[] { 32.0d, 0.0d, 0.42507601343838297d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new double[] { 32.0d, 0.0d, 0.42507601343838297d }, 1.0E-15);
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint3);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint5 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint5);
        gaussianFitter1.addObservedPoint((double) (-1L), (double) (-1.0f), (double) (byte) -1);
        gaussianFitter1.addObservedPoint((double) 1, (double) 100.0f);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray14 = gaussianFitter1.fit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        gaussianFitter1.addObservedPoint((double) 1L, (double) (short) 100);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint9);
        gaussianFitter1.addObservedPoint(0.0d, (double) (byte) 1);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray14 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser15 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray14);
        java.lang.Class<?> wildcardClass16 = weightedObservedPointArray14.getClass();
        org.junit.Assert.assertNotNull(weightedObservedPointArray14);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (-1), (double) (short) 100, (double) (byte) 10);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (short) 0, (double) (short) 10);
        gaussianFitter1.addObservedPoint((double) ' ', (double) (-1.0f));
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint16 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint16);
        org.apache.commons.math.analysis.ParametricUnivariateRealFunction parametricUnivariateRealFunction18 = null;
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer19 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter20 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer19);
        gaussianFitter20.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray22 = gaussianFitter20.getObservations();
        gaussianFitter20.addObservedPoint((double) (short) 10, (double) 1L);
        gaussianFitter20.addObservedPoint(0.0d, (double) (-1L), (double) (byte) 0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray30 = gaussianFitter20.getObservations();
        gaussianFitter20.addObservedPoint((double) 100, (-1.0d), (-1.0d));
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray35 = gaussianFitter20.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser36 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray35);
        double[] doubleArray37 = parameterGuesser36.guess();
        double[] doubleArray38 = parameterGuesser36.guess();
        double[] doubleArray39 = parameterGuesser36.guess();
        double[] doubleArray40 = parameterGuesser36.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray41 = gaussianFitter1.fit(parametricUnivariateRealFunction18, doubleArray40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray9, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray22);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray22, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray30);
        org.junit.Assert.assertNotNull(weightedObservedPointArray35);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new double[] { 1.0d, 10.0d, 4.671269901584105d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { 1.0d, 10.0d, 4.671269901584105d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] { 1.0d, 10.0d, 4.671269901584105d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertArrayEquals(doubleArray40, new double[] { 1.0d, 10.0d, 4.671269901584105d }, 1.0E-15);
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) (-1), (double) (byte) 100, (double) ' ');
        gaussianFitter1.addObservedPoint((-1.0d), (double) 0, (double) 1L);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray12 = gaussianFitter1.getObservations();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser13 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray12);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 2 is smaller than the minimum (3)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray12);
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (-1), (double) (short) 100, (double) (byte) 10);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray8 = gaussianFitter1.getObservations();
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) (-1L), (double) (-1), (double) (-1L));
        gaussianFitter1.addObservedPoint((double) (short) 0, (double) (byte) 1);
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray8);
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (short) 10, (double) 1L);
        gaussianFitter1.addObservedPoint((double) 'a', (double) (byte) 100, (double) '4');
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) '4', (double) '#', (double) '4');
        gaussianFitter1.addObservedPoint((double) (byte) 10, (double) 1, (double) (-1));
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint3);
        gaussianFitter1.addObservedPoint((double) (byte) 10, (double) 100, (double) '4');
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint9);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint11 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint11);
        gaussianFitter1.addObservedPoint(0.0d, (double) 0.0f);
        gaussianFitter1.addObservedPoint((double) (byte) 10, (double) 10L, 10.0d);
        gaussianFitter1.addObservedPoint((double) (-1L), (double) (-1.0f), (double) ' ');
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint24 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint24);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) 100L, (double) 0.0f, (double) 100);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray31 = gaussianFitter1.getObservations();
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) (short) 0, (double) 10L, (double) 100.0f);
        org.junit.Assert.assertNotNull(weightedObservedPointArray31);
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        gaussianFitter1.addObservedPoint(10.0d, (double) 10.0f, (double) '4');
        gaussianFitter1.addObservedPoint((-1.0d), 0.0d);
        gaussianFitter1.addObservedPoint((double) ' ', (double) (short) 10);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint16 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint16);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint18 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint18);
        gaussianFitter1.addObservedPoint((double) (short) 0, (double) 10.0f, 0.0d);
        gaussianFitter1.addObservedPoint((double) (-1), (double) (byte) 1, (double) '4');
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        org.apache.commons.math.analysis.ParametricUnivariateRealFunction parametricUnivariateRealFunction31 = null;
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer32 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter33 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer32);
        gaussianFitter33.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        gaussianFitter33.addObservedPoint((double) (byte) 100, (double) 100.0f);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray41 = gaussianFitter33.getObservations();
        gaussianFitter33.addObservedPoint((double) (byte) 10, (double) (byte) 10);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray45 = gaussianFitter33.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser46 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray45);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser47 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray45);
        double[] doubleArray48 = parameterGuesser47.guess();
        double[] doubleArray49 = parameterGuesser47.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray50 = gaussianFitter1.fit((int) ' ', parametricUnivariateRealFunction31, doubleArray49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray41);
        org.junit.Assert.assertNotNull(weightedObservedPointArray45);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertArrayEquals(doubleArray48, new double[] { 100.0d, 100.0d, 38.219481012960856d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertArrayEquals(doubleArray49, new double[] { 100.0d, 100.0d, 38.219481012960856d }, 1.0E-15);
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) 1, 1.0d);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) (short) -1, (double) (byte) 0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray10 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint11 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint11);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray13 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer14 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter15 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer14);
        gaussianFitter15.clearObservations();
        gaussianFitter15.addObservedPoint((double) 1, 1.0d);
        gaussianFitter15.addObservedPoint((double) (byte) -1, (double) (short) -1);
        gaussianFitter15.addObservedPoint((double) (byte) 0, (double) ' ');
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray26 = gaussianFitter15.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser27 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray26);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser28 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray26);
        double[] doubleArray29 = parameterGuesser28.guess();
        double[] doubleArray30 = parameterGuesser28.guess();
        double[] doubleArray31 = parameterGuesser28.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray32 = gaussianFitter1.fit(doubleArray31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray10);
        org.junit.Assert.assertNotNull(weightedObservedPointArray13);
        org.junit.Assert.assertNotNull(weightedObservedPointArray26);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 32.0d, 0.0d, 0.42507601343838297d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertArrayEquals(doubleArray30, new double[] { 32.0d, 0.0d, 0.42507601343838297d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertArrayEquals(doubleArray31, new double[] { 32.0d, 0.0d, 0.42507601343838297d }, 1.0E-15);
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) 10.0f, (double) (short) 10, 0.0d);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray8 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (-1), (double) 0L, (double) (short) 100);
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer13 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter14 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer13);
        gaussianFitter14.clearObservations();
        gaussianFitter14.clearObservations();
        gaussianFitter14.addObservedPoint((double) 10.0f, (double) (short) 10, 0.0d);
        gaussianFitter14.addObservedPoint((double) (byte) 100, (double) (short) 1, 0.0d);
        gaussianFitter14.addObservedPoint((double) 0, (double) 1.0f);
        gaussianFitter14.addObservedPoint(0.0d, (double) 1L);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray31 = gaussianFitter14.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser32 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray31);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser33 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray31);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser34 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray31);
        double[] doubleArray35 = parameterGuesser34.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray36 = gaussianFitter1.fit(doubleArray35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray8);
        org.junit.Assert.assertNotNull(weightedObservedPointArray31);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { 1.0d, 0.0d, 4.2466090014400955d }, 1.0E-15);
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        gaussianFitter1.addObservedPoint((double) (byte) 100, (double) 100.0f);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint10 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint10);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint12 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint12);
        gaussianFitter1.addObservedPoint((double) 100L, (double) (short) 1, (double) (byte) -1);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray18 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (byte) 100, (double) ' ', 100.0d);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray23 = gaussianFitter1.getObservations();
        java.lang.Class<?> wildcardClass24 = weightedObservedPointArray23.getClass();
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertNotNull(weightedObservedPointArray18);
        org.junit.Assert.assertNotNull(weightedObservedPointArray23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (short) 10, (double) 1L);
        gaussianFitter1.addObservedPoint(0.0d, (double) (-1L), (double) (byte) 0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray11 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) 100, (-1.0d), (-1.0d));
        gaussianFitter1.addObservedPoint((double) (byte) 0, 0.0d, 0.0d);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) (-1L), (double) (short) 1, 0.0d);
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray11);
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (short) 10, (double) 1L);
        gaussianFitter1.addObservedPoint(0.0d, 0.0d, 0.0d);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray11 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) 0.0f, (double) 0.0f);
        gaussianFitter1.addObservedPoint((double) (short) -1, 10.0d);
        org.apache.commons.math.analysis.ParametricUnivariateRealFunction parametricUnivariateRealFunction18 = null;
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer19 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter20 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer19);
        gaussianFitter20.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        gaussianFitter20.addObservedPoint((double) (byte) 100, (double) 100.0f);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray28 = gaussianFitter20.getObservations();
        gaussianFitter20.addObservedPoint((double) (byte) 10, (double) (byte) 10);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray32 = gaussianFitter20.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser33 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray32);
        double[] doubleArray34 = parameterGuesser33.guess();
        double[] doubleArray35 = parameterGuesser33.guess();
        double[] doubleArray36 = parameterGuesser33.guess();
        double[] doubleArray37 = parameterGuesser33.guess();
        double[] doubleArray38 = parameterGuesser33.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray39 = gaussianFitter1.fit(parametricUnivariateRealFunction18, doubleArray38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray11);
        org.junit.Assert.assertNotNull(weightedObservedPointArray28);
        org.junit.Assert.assertNotNull(weightedObservedPointArray32);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] { 100.0d, 100.0d, 38.219481012960856d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { 100.0d, 100.0d, 38.219481012960856d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertArrayEquals(doubleArray36, new double[] { 100.0d, 100.0d, 38.219481012960856d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new double[] { 100.0d, 100.0d, 38.219481012960856d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { 100.0d, 100.0d, 38.219481012960856d }, 1.0E-15);
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3068");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) 1, 1.0d);
        gaussianFitter1.addObservedPoint((double) (byte) -1, (double) (short) -1);
        gaussianFitter1.addObservedPoint((double) (byte) 0, (double) ' ');
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray12 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint13 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint13);
        gaussianFitter1.addObservedPoint((double) (byte) -1, (double) (-1L), (double) (short) -1);
        org.junit.Assert.assertNotNull(weightedObservedPointArray12);
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (short) 10, (double) 1L);
        gaussianFitter1.addObservedPoint(0.0d, 0.0d, 0.0d);
        gaussianFitter1.addObservedPoint((double) 10L, (double) (byte) 10, 1.0d);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray15 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (-1L), (double) 0, (double) (-1));
        org.apache.commons.math.analysis.ParametricUnivariateRealFunction parametricUnivariateRealFunction20 = null;
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer21 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter22 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer21);
        gaussianFitter22.clearObservations();
        gaussianFitter22.addObservedPoint((double) 1, 1.0d);
        gaussianFitter22.addObservedPoint((double) (byte) -1, (double) (short) -1);
        gaussianFitter22.addObservedPoint((double) (byte) 0, (double) ' ');
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray33 = gaussianFitter22.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser34 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray33);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser35 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray33);
        double[] doubleArray36 = parameterGuesser35.guess();
        double[] doubleArray37 = parameterGuesser35.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray38 = gaussianFitter1.fit(parametricUnivariateRealFunction20, doubleArray37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray15);
        org.junit.Assert.assertNotNull(weightedObservedPointArray33);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertArrayEquals(doubleArray36, new double[] { 32.0d, 0.0d, 0.42507601343838297d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new double[] { 32.0d, 0.0d, 0.42507601343838297d }, 1.0E-15);
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3070");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint5 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint5);
        gaussianFitter1.addObservedPoint((double) (-1L), (double) (byte) 100);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint10 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint10);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint12 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint12);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray14 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (short) -1, (double) (short) 1, (double) 0);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) (short) 1, (double) 10, (double) '4');
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray24 = gaussianFitter1.getObservations();
        java.lang.Class<?> wildcardClass25 = weightedObservedPointArray24.getClass();
        org.junit.Assert.assertNotNull(weightedObservedPointArray14);
        org.junit.Assert.assertNotNull(weightedObservedPointArray24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (short) 10, (double) 1L);
        gaussianFitter1.addObservedPoint((double) 1L, (double) (short) 10);
        gaussianFitter1.addObservedPoint((-1.0d), (double) (short) 10);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint14 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint14);
        gaussianFitter1.addObservedPoint(100.0d, (double) '#', 0.0d);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray21 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint22 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint22);
        gaussianFitter1.clearObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray21);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray21, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3072");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (short) 10, (double) 1L);
        gaussianFitter1.addObservedPoint(0.0d, 0.0d, 0.0d);
        gaussianFitter1.addObservedPoint((double) 100.0f, (double) 100.0f, (double) 0L);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray15 = gaussianFitter1.getObservations();
        java.lang.Class<?> wildcardClass16 = gaussianFitter1.getClass();
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) (-1), (double) (byte) 100, (double) ' ');
        gaussianFitter1.addObservedPoint((double) (short) -1, (double) 10L);
        gaussianFitter1.addObservedPoint((-1.0d), (double) (byte) 0, (double) 100L);
        gaussianFitter1.addObservedPoint((double) '4', (double) (short) 0);
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3074");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint3);
        gaussianFitter1.addObservedPoint((double) (byte) 10, (double) 100, (double) '4');
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint9);
        gaussianFitter1.addObservedPoint((double) (short) 1, (double) (-1), (double) (short) 10);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray16 = gaussianFitter1.getObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray16);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray16, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3075");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint2 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint2);
        gaussianFitter1.addObservedPoint((double) (short) 1, (double) (byte) -1, 100.0d);
        gaussianFitter1.addObservedPoint((double) 10, (double) 100.0f, (double) (short) 1);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray12 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray13 = gaussianFitter1.getObservations();
        org.apache.commons.math.analysis.ParametricUnivariateRealFunction parametricUnivariateRealFunction15 = null;
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer16 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter17 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer16);
        gaussianFitter17.clearObservations();
        gaussianFitter17.clearObservations();
        gaussianFitter17.addObservedPoint((double) 10.0f, (double) (short) 10, 0.0d);
        gaussianFitter17.addObservedPoint((double) (byte) 100, (double) (short) 1, 0.0d);
        gaussianFitter17.addObservedPoint((double) 0, (double) 1.0f);
        gaussianFitter17.addObservedPoint(0.0d, (double) 1L);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray34 = gaussianFitter17.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser35 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray34);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser36 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray34);
        double[] doubleArray37 = parameterGuesser36.guess();
        double[] doubleArray38 = parameterGuesser36.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray39 = gaussianFitter1.fit((int) (byte) 10, parametricUnivariateRealFunction15, doubleArray38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray12);
        org.junit.Assert.assertNotNull(weightedObservedPointArray13);
        org.junit.Assert.assertNotNull(weightedObservedPointArray34);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new double[] { 1.0d, 0.0d, 4.2466090014400955d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { 1.0d, 0.0d, 4.2466090014400955d }, 1.0E-15);
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3076");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) 1, 1.0d);
        gaussianFitter1.addObservedPoint((double) (byte) 1, (double) 10, (double) '4');
        gaussianFitter1.addObservedPoint((double) (byte) 1, 0.0d);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint13 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint13);
        gaussianFitter1.addObservedPoint((double) (short) 0, (double) (short) 1);
        gaussianFitter1.addObservedPoint(10.0d, (double) (short) -1, (double) (-1));
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3077");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint2 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint2);
        gaussianFitter1.addObservedPoint((double) (short) 1, (double) (byte) -1, 100.0d);
        gaussianFitter1.addObservedPoint((double) 10, (double) 100.0f, (double) (short) 1);
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray14 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (short) 0, 0.0d, 1.0d);
        gaussianFitter1.addObservedPoint((double) (-1.0f), (double) 10.0f, (double) (short) 100);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) 0.0f, (double) 100.0f);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint27 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint27);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint29 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint29);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint31 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint31);
        org.junit.Assert.assertNotNull(weightedObservedPointArray14);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray14, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3078");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (-1), (double) (short) 100, (double) (byte) 10);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (short) 0, (double) (short) 10);
        gaussianFitter1.addObservedPoint((double) ' ', (double) (-1.0f));
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint16 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint16);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray18 = gaussianFitter1.getObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray9, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray18);
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3079");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (short) 10, (double) 1L);
        gaussianFitter1.addObservedPoint((double) 'a', (double) (byte) 100, (double) '4');
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) (short) 1, (double) '#', (double) 0);
        gaussianFitter1.addObservedPoint((double) 100, (double) 1, (-1.0d));
        gaussianFitter1.addObservedPoint((double) 0L, (double) (short) 10, (double) (-1L));
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer24 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter25 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer24);
        gaussianFitter25.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        gaussianFitter25.addObservedPoint((double) (byte) 100, (double) 100.0f);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray33 = gaussianFitter25.getObservations();
        gaussianFitter25.addObservedPoint((double) (byte) 10, (double) (byte) 10);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray37 = gaussianFitter25.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser38 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray37);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser39 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray37);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser40 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray37);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser41 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray37);
        double[] doubleArray42 = parameterGuesser41.guess();
        double[] doubleArray43 = parameterGuesser41.guess();
        double[] doubleArray44 = parameterGuesser41.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray45 = gaussianFitter1.fit(doubleArray44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray33);
        org.junit.Assert.assertNotNull(weightedObservedPointArray37);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertArrayEquals(doubleArray42, new double[] { 100.0d, 100.0d, 38.219481012960856d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new double[] { 100.0d, 100.0d, 38.219481012960856d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertArrayEquals(doubleArray44, new double[] { 100.0d, 100.0d, 38.219481012960856d }, 1.0E-15);
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3080");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint3);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) (-1.0f), (double) 1);
        gaussianFitter1.addObservedPoint(100.0d, (double) 0, (double) 0);
        gaussianFitter1.addObservedPoint((double) 1.0f, (double) 100, (double) 0.0f);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint17 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint17);
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3081");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (short) 10, (double) 1L);
        gaussianFitter1.addObservedPoint(0.0d, 0.0d, 0.0d);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray11 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) 0, (double) (short) -1);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray15 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint16 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint16);
        java.lang.Class<?> wildcardClass18 = gaussianFitter1.getClass();
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray11);
        org.junit.Assert.assertNotNull(weightedObservedPointArray15);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3082");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (short) 10, (double) 1L);
        gaussianFitter1.addObservedPoint(0.0d, (double) (-1L), (double) (byte) 0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray11 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) 100, (-1.0d), (-1.0d));
        gaussianFitter1.addObservedPoint((double) (byte) 0, 0.0d, 0.0d);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.analysis.ParametricUnivariateRealFunction parametricUnivariateRealFunction22 = null;
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer23 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter24 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer23);
        gaussianFitter24.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        gaussianFitter24.addObservedPoint((double) (byte) 100, (double) 100.0f);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray32 = gaussianFitter24.getObservations();
        gaussianFitter24.addObservedPoint((double) (byte) 10, (double) (byte) 10);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray36 = gaussianFitter24.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser37 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray36);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser38 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray36);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser39 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray36);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser40 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray36);
        double[] doubleArray41 = parameterGuesser40.guess();
        double[] doubleArray42 = parameterGuesser40.guess();
        double[] doubleArray43 = parameterGuesser40.guess();
        double[] doubleArray44 = parameterGuesser40.guess();
        double[] doubleArray45 = parameterGuesser40.guess();
        double[] doubleArray46 = parameterGuesser40.guess();
        double[] doubleArray47 = parameterGuesser40.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray48 = gaussianFitter1.fit(100, parametricUnivariateRealFunction22, doubleArray47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray11);
        org.junit.Assert.assertNotNull(weightedObservedPointArray32);
        org.junit.Assert.assertNotNull(weightedObservedPointArray36);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertArrayEquals(doubleArray41, new double[] { 100.0d, 100.0d, 38.219481012960856d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertArrayEquals(doubleArray42, new double[] { 100.0d, 100.0d, 38.219481012960856d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new double[] { 100.0d, 100.0d, 38.219481012960856d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertArrayEquals(doubleArray44, new double[] { 100.0d, 100.0d, 38.219481012960856d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertArrayEquals(doubleArray45, new double[] { 100.0d, 100.0d, 38.219481012960856d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertArrayEquals(doubleArray46, new double[] { 100.0d, 100.0d, 38.219481012960856d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertArrayEquals(doubleArray47, new double[] { 100.0d, 100.0d, 38.219481012960856d }, 1.0E-15);
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3083");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (short) 10, (double) 1L);
        gaussianFitter1.addObservedPoint((double) 1L, (double) (short) 10);
        gaussianFitter1.addObservedPoint((-1.0d), (double) (short) 10);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint14 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint14);
        gaussianFitter1.addObservedPoint(100.0d, (double) '#', 0.0d);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint20 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint20);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray22 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (byte) 100, (double) (byte) 10, (double) 0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray27 = gaussianFitter1.getObservations();
        gaussianFitter1.clearObservations();
        org.apache.commons.math.analysis.ParametricUnivariateRealFunction parametricUnivariateRealFunction30 = null;
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer31 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter32 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer31);
        gaussianFitter32.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        gaussianFitter32.addObservedPoint((double) (byte) 100, (double) 100.0f);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray40 = gaussianFitter32.getObservations();
        gaussianFitter32.addObservedPoint((double) (byte) 10, (double) (byte) 10);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray44 = gaussianFitter32.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser45 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray44);
        double[] doubleArray46 = parameterGuesser45.guess();
        double[] doubleArray47 = parameterGuesser45.guess();
        double[] doubleArray48 = parameterGuesser45.guess();
        double[] doubleArray49 = parameterGuesser45.guess();
        double[] doubleArray50 = parameterGuesser45.guess();
        double[] doubleArray51 = parameterGuesser45.guess();
        double[] doubleArray52 = parameterGuesser45.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray53 = gaussianFitter1.fit((int) '4', parametricUnivariateRealFunction30, doubleArray52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray22);
        org.junit.Assert.assertNotNull(weightedObservedPointArray27);
        org.junit.Assert.assertNotNull(weightedObservedPointArray40);
        org.junit.Assert.assertNotNull(weightedObservedPointArray44);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertArrayEquals(doubleArray46, new double[] { 100.0d, 100.0d, 38.219481012960856d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertArrayEquals(doubleArray47, new double[] { 100.0d, 100.0d, 38.219481012960856d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertArrayEquals(doubleArray48, new double[] { 100.0d, 100.0d, 38.219481012960856d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertArrayEquals(doubleArray49, new double[] { 100.0d, 100.0d, 38.219481012960856d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertArrayEquals(doubleArray50, new double[] { 100.0d, 100.0d, 38.219481012960856d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertArrayEquals(doubleArray51, new double[] { 100.0d, 100.0d, 38.219481012960856d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertArrayEquals(doubleArray52, new double[] { 100.0d, 100.0d, 38.219481012960856d }, 1.0E-15);
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3084");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (short) 10, (double) 1L);
        gaussianFitter1.addObservedPoint((double) 1L, (double) (short) 10);
        gaussianFitter1.addObservedPoint((-1.0d), (double) (short) 10);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint14 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint14);
        gaussianFitter1.addObservedPoint((double) (byte) 100, (double) (-1.0f), (double) 100L);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray20 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) 10, (double) 0L);
        gaussianFitter1.addObservedPoint((double) 100L, (double) 0);
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray20);
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3085");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) 10.0f, (double) (short) 10, 0.0d);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray8 = gaussianFitter1.getObservations();
        org.apache.commons.math.analysis.ParametricUnivariateRealFunction parametricUnivariateRealFunction9 = null;
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer10 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter11 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer10);
        gaussianFitter11.clearObservations();
        gaussianFitter11.addObservedPoint((double) 1, 1.0d);
        gaussianFitter11.addObservedPoint((double) (byte) -1, (double) (short) -1);
        gaussianFitter11.addObservedPoint((double) (byte) 0, (double) ' ');
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray22 = gaussianFitter11.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser23 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray22);
        double[] doubleArray24 = parameterGuesser23.guess();
        double[] doubleArray25 = parameterGuesser23.guess();
        double[] doubleArray26 = parameterGuesser23.guess();
        double[] doubleArray27 = parameterGuesser23.guess();
        double[] doubleArray28 = parameterGuesser23.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray29 = gaussianFitter1.fit(parametricUnivariateRealFunction9, doubleArray28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray8);
        org.junit.Assert.assertNotNull(weightedObservedPointArray22);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] { 32.0d, 0.0d, 0.42507601343838297d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { 32.0d, 0.0d, 0.42507601343838297d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertArrayEquals(doubleArray26, new double[] { 32.0d, 0.0d, 0.42507601343838297d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertArrayEquals(doubleArray27, new double[] { 32.0d, 0.0d, 0.42507601343838297d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertArrayEquals(doubleArray28, new double[] { 32.0d, 0.0d, 0.42507601343838297d }, 1.0E-15);
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3086");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (short) 10, (double) 1L);
        gaussianFitter1.addObservedPoint((double) 'a', (double) (byte) 100, (double) '4');
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint11 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint11);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint(10.0d, (double) (byte) 0, (double) (byte) 0);
        gaussianFitter1.addObservedPoint((double) 1.0f, 100.0d, (double) 'a');
        gaussianFitter1.clearObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3087");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) 1, 1.0d);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) (short) -1, (double) (byte) 0);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) ' ', 0.0d, (double) 100L);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) 10.0f, (double) 0L);
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3088");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (short) 10, (double) 1L);
        gaussianFitter1.addObservedPoint((double) 'a', (double) (byte) 100, (double) '4');
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint13 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint13);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint16 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint16);
        gaussianFitter1.addObservedPoint((double) 10L, (double) ' ');
        gaussianFitter1.addObservedPoint((double) 1, (double) (short) 10, (double) (short) 1);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray25 = gaussianFitter1.getObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray25);
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3089");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint4 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint4);
        gaussianFitter1.addObservedPoint((double) 0, (double) 100);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray10 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint11 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint11);
        gaussianFitter1.clearObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray10);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray10, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3090");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint3);
        gaussianFitter1.addObservedPoint((double) 10L, (double) (short) -1);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) 10L, 1.0d, (double) '#');
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray13 = gaussianFitter1.fit();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 1 is smaller than the minimum (3)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3091");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (short) 10, (double) 1L);
        gaussianFitter1.addObservedPoint(0.0d, 0.0d, 0.0d);
        gaussianFitter1.addObservedPoint((double) 100.0f, (double) 100.0f, (double) 0L);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray15 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (-1), (double) (byte) -1);
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray15);
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3092");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint3);
        gaussianFitter1.addObservedPoint((double) 10L, (double) (short) -1);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray8 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint9);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint11 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint11);
        gaussianFitter1.addObservedPoint((double) (byte) 100, (double) (byte) 0, (double) 1.0f);
        gaussianFitter1.addObservedPoint((double) (-1L), (double) (short) 100, (double) (short) 1);
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer21 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter22 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer21);
        gaussianFitter22.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        gaussianFitter22.addObservedPoint((-1.0d), (double) (-1L), (double) (short) -1);
        gaussianFitter22.addObservedPoint((double) (byte) 1, 0.0d);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray34 = gaussianFitter22.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser35 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray34);
        double[] doubleArray36 = parameterGuesser35.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray37 = gaussianFitter1.fit(doubleArray36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray8);
        org.junit.Assert.assertNotNull(weightedObservedPointArray34);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertArrayEquals(doubleArray36, new double[] { 0.0d, 1.0d, 42.89075091454496d }, 1.0E-15);
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3093");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray2 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) 0.0f, (double) '4');
        gaussianFitter1.addObservedPoint((double) 0.0f, 1.0d);
        gaussianFitter1.addObservedPoint(0.0d, (double) 10);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint12 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint12);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray14 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint15 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint15);
        org.junit.Assert.assertNotNull(weightedObservedPointArray2);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray2, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray14);
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3094");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint5 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint5);
        gaussianFitter1.addObservedPoint((double) (-1L), (double) (byte) 100);
        gaussianFitter1.addObservedPoint((double) 0L, (double) 10.0f);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray13 = gaussianFitter1.getObservations();
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) (short) 100, (double) 0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray18 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (-1L), 10.0d);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray22 = gaussianFitter1.getObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray13);
        org.junit.Assert.assertNotNull(weightedObservedPointArray18);
        org.junit.Assert.assertNotNull(weightedObservedPointArray22);
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3095");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint3);
        gaussianFitter1.addObservedPoint((double) (short) 0, (double) 100);
        gaussianFitter1.clearObservations();
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3096");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint(0.0d, (double) 1.0f);
        gaussianFitter1.addObservedPoint((double) 100, (double) 0L, (double) (short) 100);
        gaussianFitter1.addObservedPoint((-1.0d), (double) (byte) 0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray12 = gaussianFitter1.getObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray12);
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3097");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (short) 10, (double) 1L);
        gaussianFitter1.addObservedPoint((double) ' ', (double) (byte) 10, (double) (short) 100);
        gaussianFitter1.addObservedPoint((double) 10L, (double) 'a');
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3098");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) 10.0f, (double) (short) 10, 0.0d);
        gaussianFitter1.addObservedPoint((double) 1, (double) 100.0f, (double) 1L);
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3099");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint2 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint2);
        gaussianFitter1.addObservedPoint((double) (short) 1, (double) (byte) -1, 100.0d);
        gaussianFitter1.addObservedPoint((double) 10, (double) 100.0f, (double) (short) 1);
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray14 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (short) 0, 0.0d, 1.0d);
        gaussianFitter1.addObservedPoint((double) (-1.0f), (double) 10.0f, (double) (short) 100);
        gaussianFitter1.addObservedPoint((double) (-1L), 0.0d);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray27 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray28 = gaussianFitter1.getObservations();
        gaussianFitter1.clearObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray14);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray14, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray27);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray27, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray28);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray28, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3100");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        gaussianFitter1.addObservedPoint(10.0d, (double) 10.0f, (double) '4');
        gaussianFitter1.addObservedPoint((-1.0d), 0.0d);
        gaussianFitter1.addObservedPoint((double) ' ', (double) (short) 10);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint16 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint16);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint18 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint18);
        gaussianFitter1.addObservedPoint((double) (short) 0, (double) 10.0f, 0.0d);
        gaussianFitter1.addObservedPoint((double) (-1), (double) (byte) 1, (double) '4');
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint28 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint28);
        gaussianFitter1.clearObservations();
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3101");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint5 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint5);
        gaussianFitter1.addObservedPoint((double) (-1L), (double) (byte) 100);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint10 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint10);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint12 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint12);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray14 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (short) -1, (double) (short) 1, (double) 0);
        gaussianFitter1.addObservedPoint((double) 100L, (double) (byte) 10, (double) (byte) 100);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint23 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint23);
        gaussianFitter1.addObservedPoint((double) (-1L), (double) '4');
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint28 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint28);
        org.junit.Assert.assertNotNull(weightedObservedPointArray14);
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3102");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((-1.0d), (double) 'a', (double) (-1.0f));
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray7 = gaussianFitter1.getObservations();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser8 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray7);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (3)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray7);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray7, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3103");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint3);
        gaussianFitter1.addObservedPoint((double) (byte) 10, (double) 100, (double) '4');
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray10 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (byte) 10, (double) 1, (double) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray15 = gaussianFitter1.fit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertNotNull(weightedObservedPointArray10);
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3104");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint5 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint5);
        gaussianFitter1.addObservedPoint((double) (-1L), (double) (byte) 100);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint10 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint10);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint12 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint12);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray14 = gaussianFitter1.getObservations();
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint(1.0d, (double) '#');
        gaussianFitter1.addObservedPoint((double) 10L, (-1.0d));
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint22 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint22);
        org.junit.Assert.assertNotNull(weightedObservedPointArray14);
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3105");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        gaussianFitter1.addObservedPoint(10.0d, (double) 10.0f, (double) '4');
        gaussianFitter1.addObservedPoint((-1.0d), 0.0d);
        gaussianFitter1.addObservedPoint((double) ' ', (double) (short) 10);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) 100, (double) (byte) 100);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray20 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray21 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint(100.0d, (double) 0.0f);
        org.junit.Assert.assertNotNull(weightedObservedPointArray20);
        org.junit.Assert.assertNotNull(weightedObservedPointArray21);
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3106");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) 1, 1.0d);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) (short) -1, (double) (byte) 0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint11 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint11);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray13 = gaussianFitter1.getObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray13);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray13, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] { null });
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3107");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        gaussianFitter1.addObservedPoint((double) (byte) 100, (double) 100.0f);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (byte) 10, (double) (byte) 10);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray13 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint14 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint14);
        gaussianFitter1.clearObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertNotNull(weightedObservedPointArray13);
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3108");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint3);
        gaussianFitter1.addObservedPoint((double) (byte) 10, (double) 100, (double) '4');
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint9);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint11 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint11);
        gaussianFitter1.addObservedPoint(0.0d, (double) 0.0f);
        gaussianFitter1.addObservedPoint((double) (byte) 10, (double) 10L, 10.0d);
        gaussianFitter1.addObservedPoint((double) (-1L), (double) (-1.0f), (double) ' ');
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray24 = gaussianFitter1.getObservations();
        org.apache.commons.math.analysis.ParametricUnivariateRealFunction parametricUnivariateRealFunction26 = null;
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer27 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter28 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer27);
        gaussianFitter28.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray30 = gaussianFitter28.getObservations();
        gaussianFitter28.addObservedPoint((double) (short) 10, (double) 1L);
        gaussianFitter28.addObservedPoint(0.0d, 0.0d, 0.0d);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray38 = gaussianFitter28.getObservations();
        gaussianFitter28.addObservedPoint((double) 0.0f, (double) 0.0f);
        gaussianFitter28.addObservedPoint((double) (short) -1, 10.0d);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray45 = gaussianFitter28.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser46 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray45);
        double[] doubleArray47 = parameterGuesser46.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray48 = gaussianFitter1.fit(10, parametricUnivariateRealFunction26, doubleArray47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray24);
        org.junit.Assert.assertNotNull(weightedObservedPointArray30);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray30, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray38);
        org.junit.Assert.assertNotNull(weightedObservedPointArray45);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertArrayEquals(doubleArray47, new double[] { 10.0d, (-1.0d), 4.671269901584105d }, 1.0E-15);
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3109");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) (-1L), (double) (byte) 0, (double) 'a');
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray7 = gaussianFitter1.getObservations();
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) 'a', 0.0d);
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray14 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) 1L, (double) 0L, (double) (short) 100);
        gaussianFitter1.addObservedPoint((-1.0d), 100.0d, (double) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray23 = gaussianFitter1.fit();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 2 is smaller than the minimum (3)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray7);
        org.junit.Assert.assertNotNull(weightedObservedPointArray14);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray14, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3110");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) 10.0f, (double) (short) 10, 0.0d);
        gaussianFitter1.addObservedPoint((double) (byte) 100, (double) (short) 1, 0.0d);
        gaussianFitter1.addObservedPoint(0.0d, (double) '#');
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint15 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint15);
        org.apache.commons.math.analysis.ParametricUnivariateRealFunction parametricUnivariateRealFunction18 = null;
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer19 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter20 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer19);
        gaussianFitter20.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        gaussianFitter20.addObservedPoint((double) (byte) 100, (double) 100.0f);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray28 = gaussianFitter20.getObservations();
        gaussianFitter20.addObservedPoint((double) (byte) 10, (double) (byte) 10);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray32 = gaussianFitter20.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser33 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray32);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser34 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray32);
        double[] doubleArray35 = parameterGuesser34.guess();
        double[] doubleArray36 = parameterGuesser34.guess();
        double[] doubleArray37 = parameterGuesser34.guess();
        double[] doubleArray38 = parameterGuesser34.guess();
        double[] doubleArray39 = parameterGuesser34.guess();
        double[] doubleArray40 = parameterGuesser34.guess();
        double[] doubleArray41 = parameterGuesser34.guess();
        double[] doubleArray42 = parameterGuesser34.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray43 = gaussianFitter1.fit((int) 'a', parametricUnivariateRealFunction18, doubleArray42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray28);
        org.junit.Assert.assertNotNull(weightedObservedPointArray32);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { 100.0d, 100.0d, 38.219481012960856d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertArrayEquals(doubleArray36, new double[] { 100.0d, 100.0d, 38.219481012960856d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new double[] { 100.0d, 100.0d, 38.219481012960856d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { 100.0d, 100.0d, 38.219481012960856d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] { 100.0d, 100.0d, 38.219481012960856d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertArrayEquals(doubleArray40, new double[] { 100.0d, 100.0d, 38.219481012960856d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertArrayEquals(doubleArray41, new double[] { 100.0d, 100.0d, 38.219481012960856d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertArrayEquals(doubleArray42, new double[] { 100.0d, 100.0d, 38.219481012960856d }, 1.0E-15);
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3111");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint2 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint2);
        gaussianFitter1.addObservedPoint((double) (short) 1, (double) (byte) -1, 100.0d);
        gaussianFitter1.addObservedPoint((double) 10, (double) 100.0f, (double) (short) 1);
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray14 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (short) 0, 0.0d, 1.0d);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint19 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint19);
        gaussianFitter1.addObservedPoint((double) '4', (double) (byte) -1);
        gaussianFitter1.addObservedPoint((double) (byte) 0, (double) (byte) 10);
        gaussianFitter1.addObservedPoint(0.0d, (double) 1);
        gaussianFitter1.addObservedPoint((double) (-1), 0.0d, 100.0d);
        gaussianFitter1.addObservedPoint((double) (byte) 1, 0.0d, (double) (short) 1);
        org.junit.Assert.assertNotNull(weightedObservedPointArray14);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray14, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3112");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint3);
        gaussianFitter1.addObservedPoint((double) (byte) 10, (double) 100, (double) '4');
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray10 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (-1.0f), (double) (short) -1);
        java.lang.Class<?> wildcardClass14 = gaussianFitter1.getClass();
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertNotNull(weightedObservedPointArray10);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3113");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (short) 10, (double) 1L);
        gaussianFitter1.addObservedPoint((double) 1L, (double) (short) 10);
        gaussianFitter1.addObservedPoint((-1.0d), (double) (short) 10);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint14 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint14);
        gaussianFitter1.addObservedPoint(100.0d, (double) '#', 0.0d);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint20 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint20);
        gaussianFitter1.addObservedPoint((double) (short) 10, (double) 10L);
        org.apache.commons.math.analysis.ParametricUnivariateRealFunction parametricUnivariateRealFunction25 = null;
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer26 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter27 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer26);
        gaussianFitter27.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        gaussianFitter27.addObservedPoint((double) (byte) 100, (double) 100.0f);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray35 = gaussianFitter27.getObservations();
        gaussianFitter27.addObservedPoint((double) (byte) 10, (double) (byte) 10);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray39 = gaussianFitter27.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser40 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray39);
        double[] doubleArray41 = parameterGuesser40.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray42 = gaussianFitter1.fit(parametricUnivariateRealFunction25, doubleArray41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray35);
        org.junit.Assert.assertNotNull(weightedObservedPointArray39);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertArrayEquals(doubleArray41, new double[] { 100.0d, 100.0d, 38.219481012960856d }, 1.0E-15);
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3114");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        gaussianFitter1.addObservedPoint((-1.0d), (double) (-1L), (double) (short) -1);
        gaussianFitter1.addObservedPoint((double) ' ', (double) (byte) 10);
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray15 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((-1.0d), (double) (short) 1);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray19 = gaussianFitter1.getObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray15);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray15, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray19);
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3115");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        gaussianFitter1.addObservedPoint(10.0d, (double) 10.0f, (double) '4');
        gaussianFitter1.addObservedPoint((-1.0d), 0.0d);
        gaussianFitter1.addObservedPoint((double) 'a', (double) (byte) 0);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) (short) -1, 0.0d, (double) 10.0f);
    }

    @Test
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3116");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        gaussianFitter1.addObservedPoint(10.0d, (double) 10.0f, (double) '4');
        gaussianFitter1.addObservedPoint((-1.0d), 0.0d);
        gaussianFitter1.addObservedPoint((double) ' ', (double) (short) 10);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint16 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint16);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint18 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint18);
        gaussianFitter1.addObservedPoint((double) (short) 0, (double) 10.0f, 0.0d);
        gaussianFitter1.addObservedPoint((double) (-1), (double) (byte) 1, (double) '4');
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint28 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint28);
        gaussianFitter1.addObservedPoint((double) 10, (-1.0d));
        org.apache.commons.math.analysis.ParametricUnivariateRealFunction parametricUnivariateRealFunction33 = null;
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer34 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter35 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer34);
        gaussianFitter35.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        gaussianFitter35.addObservedPoint((double) (byte) 100, (double) 100.0f);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray43 = gaussianFitter35.getObservations();
        gaussianFitter35.addObservedPoint((double) (byte) 10, (double) (byte) 10);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray47 = gaussianFitter35.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray48 = gaussianFitter35.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser49 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray48);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser50 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray48);
        double[] doubleArray51 = parameterGuesser50.guess();
        double[] doubleArray52 = parameterGuesser50.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray53 = gaussianFitter1.fit(parametricUnivariateRealFunction33, doubleArray52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray43);
        org.junit.Assert.assertNotNull(weightedObservedPointArray47);
        org.junit.Assert.assertNotNull(weightedObservedPointArray48);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertArrayEquals(doubleArray51, new double[] { 100.0d, 100.0d, 38.219481012960856d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertArrayEquals(doubleArray52, new double[] { 100.0d, 100.0d, 38.219481012960856d }, 1.0E-15);
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3117");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint2 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint2);
        gaussianFitter1.addObservedPoint((double) (short) 1, (double) (byte) -1, 100.0d);
        gaussianFitter1.addObservedPoint((double) 10, (double) 100.0f, (double) (short) 1);
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray14 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (short) 0, 0.0d, 1.0d);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint19 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint19);
        gaussianFitter1.addObservedPoint((double) '4', (double) (byte) -1);
        gaussianFitter1.addObservedPoint((double) (byte) 0, (double) (byte) 10);
        gaussianFitter1.addObservedPoint((double) (short) -1, (double) (byte) 0, 0.0d);
        org.junit.Assert.assertNotNull(weightedObservedPointArray14);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray14, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3118");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (short) 10, (double) 1L);
        gaussianFitter1.addObservedPoint(0.0d, (double) (-1L), (double) (byte) 0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray11 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) 100, (-1.0d), (-1.0d));
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray16 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser17 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray16);
        double[] doubleArray18 = parameterGuesser17.guess();
        double[] doubleArray19 = parameterGuesser17.guess();
        double[] doubleArray20 = parameterGuesser17.guess();
        double[] doubleArray21 = parameterGuesser17.guess();
        double[] doubleArray22 = parameterGuesser17.guess();
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray11);
        org.junit.Assert.assertNotNull(weightedObservedPointArray16);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 1.0d, 10.0d, 4.671269901584105d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 1.0d, 10.0d, 4.671269901584105d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 1.0d, 10.0d, 4.671269901584105d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 1.0d, 10.0d, 4.671269901584105d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 1.0d, 10.0d, 4.671269901584105d }, 1.0E-15);
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3119");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) '#', (double) 100L, 100.0d);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint(0.0d, 0.0d, 0.0d);
        gaussianFitter1.clearObservations();
    }

    @Test
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3120");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint3);
        gaussianFitter1.addObservedPoint((double) (byte) 10, (double) 100, (double) '4');
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray10 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray11 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray12 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) 0L, (double) 1.0f);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint16 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint16);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint19 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint19);
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertNotNull(weightedObservedPointArray10);
        org.junit.Assert.assertNotNull(weightedObservedPointArray11);
        org.junit.Assert.assertNotNull(weightedObservedPointArray12);
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3121");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint3);
        gaussianFitter1.addObservedPoint((double) (byte) 10, (double) 100, (double) '4');
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray10 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray11 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray12 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) 0L, (double) 1.0f);
        gaussianFitter1.addObservedPoint(0.0d, (double) 0.0f, 0.0d);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint20 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint20);
        java.lang.Class<?> wildcardClass22 = gaussianFitter1.getClass();
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertNotNull(weightedObservedPointArray10);
        org.junit.Assert.assertNotNull(weightedObservedPointArray11);
        org.junit.Assert.assertNotNull(weightedObservedPointArray12);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3122");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) 10.0f, (double) (short) 10, 0.0d);
        gaussianFitter1.addObservedPoint((double) (byte) 100, (double) (short) 1, 0.0d);
        gaussianFitter1.addObservedPoint((double) 0, (double) 1.0f);
        gaussianFitter1.addObservedPoint(0.0d, (double) 1L);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray18 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser19 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray18);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser20 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray18);
        double[] doubleArray21 = parameterGuesser20.guess();
        double[] doubleArray22 = parameterGuesser20.guess();
        double[] doubleArray23 = parameterGuesser20.guess();
        double[] doubleArray24 = parameterGuesser20.guess();
        org.junit.Assert.assertNotNull(weightedObservedPointArray18);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 1.0d, 0.0d, 4.2466090014400955d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 1.0d, 0.0d, 4.2466090014400955d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 1.0d, 0.0d, 4.2466090014400955d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] { 1.0d, 0.0d, 4.2466090014400955d }, 1.0E-15);
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3123");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint2 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint2);
        gaussianFitter1.addObservedPoint((double) (short) 1, (double) (byte) -1, 100.0d);
        gaussianFitter1.addObservedPoint((double) 10, (double) 100.0f, (double) (short) 1);
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray14 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (short) 0, 0.0d, 1.0d);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint19 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint19);
        gaussianFitter1.addObservedPoint((double) '4', (double) (byte) -1);
        gaussianFitter1.addObservedPoint((double) (byte) 0, (double) (byte) 10);
        gaussianFitter1.addObservedPoint(0.0d, (double) 1);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint30 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint30);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray32 = gaussianFitter1.getObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray14);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray14, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray32);
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3124");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (short) 10, (double) 1L);
        gaussianFitter1.addObservedPoint((double) 1L, (double) (short) 10);
        gaussianFitter1.addObservedPoint((-1.0d), (double) (short) 10);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint14 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint14);
        gaussianFitter1.addObservedPoint(100.0d, (double) '#', 0.0d);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint20 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint20);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray22 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser23 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray22);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser24 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray22);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser25 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray22);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser26 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray22);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser27 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray22);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser28 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray22);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray29 = parameterGuesser28.guess();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray22);
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3125");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint2 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint2);
        gaussianFitter1.addObservedPoint((double) (short) 1, (double) (byte) -1, 100.0d);
        gaussianFitter1.addObservedPoint((double) 10, (double) 100.0f, (double) (short) 1);
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray14 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (short) 0, 0.0d, 1.0d);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint19 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint19);
        gaussianFitter1.addObservedPoint((double) '4', (double) (byte) -1);
        gaussianFitter1.addObservedPoint((double) (byte) 0, (double) (byte) 10);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint27 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint27);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray29 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser30 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray29);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser31 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray29);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray32 = parameterGuesser31.guess();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray14);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray14, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray29);
    }

    @Test
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3126");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint2 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint2);
        gaussianFitter1.addObservedPoint((double) (short) 1, (double) (byte) -1, 100.0d);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint8 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint8);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) 100, (double) 1L);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint14 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint14);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) (-1L), (double) (byte) -1, (double) (short) 100);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray21 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer22 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter23 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer22);
        gaussianFitter23.clearObservations();
        gaussianFitter23.addObservedPoint((double) (-1), 100.0d);
        gaussianFitter23.addObservedPoint((double) 10L, (double) 1.0f);
        gaussianFitter23.addObservedPoint((double) (short) 0, (double) 'a');
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray34 = gaussianFitter23.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser35 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray34);
        double[] doubleArray36 = parameterGuesser35.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray37 = gaussianFitter1.fit(doubleArray36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray21);
        org.junit.Assert.assertNotNull(weightedObservedPointArray34);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertArrayEquals(doubleArray36, new double[] { 100.0d, (-1.0d), 4.671269901584105d }, 1.0E-15);
    }

    @Test
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3127");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) (-1), (double) (byte) 100, (double) ' ');
        gaussianFitter1.addObservedPoint(10.0d, (double) 0, 0.0d);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint12 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint12);
        gaussianFitter1.addObservedPoint((double) 0L, (double) (short) -1, 0.0d);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint18 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint18);
    }

    @Test
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3128");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray4 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint5 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint5);
        gaussianFitter1.addObservedPoint((double) (short) 1, 100.0d, (double) 1.0f);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint12 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint12);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray15 = gaussianFitter1.getObservations();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser16 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray15);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (3)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray4);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray4, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray15);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray15, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3129");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (short) 10, (double) 1L);
        gaussianFitter1.addObservedPoint((double) 1L, (double) (short) 10);
        gaussianFitter1.addObservedPoint((-1.0d), (double) (short) 10);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint14 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint14);
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        java.lang.Class<?> wildcardClass18 = gaussianFitter1.getClass();
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3130");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (short) 10, (double) 1L);
        gaussianFitter1.addObservedPoint((double) 'a', (double) (byte) 100, (double) '4');
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) (short) 1, (double) '#', (double) 0);
        gaussianFitter1.addObservedPoint((double) 0L, (double) 1L);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray19 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (short) -1, (double) 0, (double) (-1));
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray19);
    }

    @Test
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3131");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (short) 10, (double) 1L);
        gaussianFitter1.addObservedPoint((double) 1L, (double) (short) 10);
        gaussianFitter1.addObservedPoint((-1.0d), (double) (short) 10);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint14 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint14);
        gaussianFitter1.addObservedPoint(100.0d, (double) '#', 0.0d);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint20 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint20);
        gaussianFitter1.addObservedPoint((double) (byte) -1, 100.0d, (-1.0d));
        gaussianFitter1.addObservedPoint(1.0d, (double) (byte) 100);
        gaussianFitter1.addObservedPoint((double) 100, (double) 1L);
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3132");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (-1), (double) (short) 100, (double) (byte) 10);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = gaussianFitter1.getObservations();
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) 0.0f, (double) (short) -1);
        gaussianFitter1.addObservedPoint((double) (short) 1, (double) (short) 100);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint17 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint17);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint19 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint19);
        gaussianFitter1.addObservedPoint((double) (byte) 0, (double) 100L, 100.0d);
        gaussianFitter1.addObservedPoint((double) 10L, (double) (short) 1);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint28 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint28);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray30 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser31 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray30);
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray9, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray30);
    }

    @Test
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3133");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        gaussianFitter1.addObservedPoint(10.0d, (double) 10.0f, (double) '4');
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint11 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint11);
        gaussianFitter1.addObservedPoint((double) 10L, 0.0d);
        gaussianFitter1.addObservedPoint((double) (-1.0f), 10.0d, (double) (short) 1);
        gaussianFitter1.clearObservations();
    }

    @Test
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3134");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) (byte) -1, 100.0d, (double) (byte) 100);
        gaussianFitter1.addObservedPoint((double) (byte) 1, 100.0d);
        gaussianFitter1.addObservedPoint((double) 10.0f, 1.0d);
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer15 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter16 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer15);
        gaussianFitter16.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        gaussianFitter16.addObservedPoint((double) (byte) 100, (double) 100.0f);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray24 = gaussianFitter16.getObservations();
        gaussianFitter16.addObservedPoint((double) (byte) 10, (double) (byte) 10);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray28 = gaussianFitter16.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser29 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray28);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser30 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray28);
        double[] doubleArray31 = parameterGuesser30.guess();
        double[] doubleArray32 = parameterGuesser30.guess();
        double[] doubleArray33 = parameterGuesser30.guess();
        double[] doubleArray34 = parameterGuesser30.guess();
        double[] doubleArray35 = parameterGuesser30.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray36 = gaussianFitter1.fit(doubleArray35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray24);
        org.junit.Assert.assertNotNull(weightedObservedPointArray28);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertArrayEquals(doubleArray31, new double[] { 100.0d, 100.0d, 38.219481012960856d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[] { 100.0d, 100.0d, 38.219481012960856d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertArrayEquals(doubleArray33, new double[] { 100.0d, 100.0d, 38.219481012960856d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] { 100.0d, 100.0d, 38.219481012960856d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { 100.0d, 100.0d, 38.219481012960856d }, 1.0E-15);
    }

    @Test
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3135");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) (-1L), (double) (byte) 0, (double) 'a');
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray7 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) 100, (double) 10L, (-1.0d));
        gaussianFitter1.addObservedPoint((double) 0.0f, (double) (-1.0f), (double) 0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray17 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint18 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint18);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray20 = gaussianFitter1.getObservations();
        gaussianFitter1.clearObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray7);
        org.junit.Assert.assertNotNull(weightedObservedPointArray17);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray17, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray20);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray20, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] { null });
    }

    @Test
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3136");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) (-1), 100.0d);
        gaussianFitter1.addObservedPoint((double) 10L, (double) 1.0f);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint(0.0d, 100.0d);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray13 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint14 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint14);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint16 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint16);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray18 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser19 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray18);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray20 = parameterGuesser19.guess();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray13);
        org.junit.Assert.assertNotNull(weightedObservedPointArray18);
    }

    @Test
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3137");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (-1), (double) (short) 100, (double) (byte) 10);
        gaussianFitter1.addObservedPoint((double) (byte) 0, (double) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray11 = gaussianFitter1.fit();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 2 is smaller than the minimum (3)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3138");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) 1, 1.0d);
        gaussianFitter1.addObservedPoint((double) (byte) -1, (double) (short) -1);
        gaussianFitter1.addObservedPoint((double) (byte) 0, (double) ' ');
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray12 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint13 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint13);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint15 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint15);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray17 = gaussianFitter1.fit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray12);
    }

    @Test
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3139");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint(0.0d, (double) 1.0f);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint5 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint5);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint7 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint7);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint9);
    }

    @Test
    public void test3140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3140");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint2 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint2);
        gaussianFitter1.addObservedPoint((double) (short) 1, (double) (byte) -1, 100.0d);
        gaussianFitter1.addObservedPoint((double) 10, (double) 100.0f, (double) (short) 1);
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray14 = gaussianFitter1.getObservations();
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint17 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint17);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint19 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint19);
        org.junit.Assert.assertNotNull(weightedObservedPointArray14);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray14, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3141");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint2 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint2);
        gaussianFitter1.addObservedPoint((double) (short) 1, (double) (byte) -1, 100.0d);
        gaussianFitter1.addObservedPoint((double) 10, (double) 100.0f, (double) (short) 1);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray13 = gaussianFitter1.getObservations();
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) (short) 100, 100.0d);
        org.apache.commons.math.analysis.ParametricUnivariateRealFunction parametricUnivariateRealFunction19 = null;
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer20 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter21 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer20);
        gaussianFitter21.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray23 = gaussianFitter21.getObservations();
        gaussianFitter21.addObservedPoint((double) (short) 10, (double) 1L);
        gaussianFitter21.addObservedPoint(0.0d, 0.0d, 0.0d);
        gaussianFitter21.addObservedPoint((double) 10L, (double) (byte) 10, 1.0d);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray35 = gaussianFitter21.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser36 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray35);
        double[] doubleArray37 = parameterGuesser36.guess();
        double[] doubleArray38 = parameterGuesser36.guess();
        double[] doubleArray39 = parameterGuesser36.guess();
        double[] doubleArray40 = parameterGuesser36.guess();
        double[] doubleArray41 = parameterGuesser36.guess();
        double[] doubleArray42 = parameterGuesser36.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray43 = gaussianFitter1.fit((int) (byte) -1, parametricUnivariateRealFunction19, doubleArray42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray13);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray13, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray23);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray23, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray35);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new double[] { 1.0d, 10.0d, 4.2466090014400955d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { 1.0d, 10.0d, 4.2466090014400955d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] { 1.0d, 10.0d, 4.2466090014400955d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertArrayEquals(doubleArray40, new double[] { 1.0d, 10.0d, 4.2466090014400955d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertArrayEquals(doubleArray41, new double[] { 1.0d, 10.0d, 4.2466090014400955d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertArrayEquals(doubleArray42, new double[] { 1.0d, 10.0d, 4.2466090014400955d }, 1.0E-15);
    }

    @Test
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3142");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray2 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) 0.0f, (double) '4');
        gaussianFitter1.addObservedPoint((double) 0.0f, 1.0d);
        gaussianFitter1.addObservedPoint(0.0d, (double) 10);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint12 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint12);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray14 = gaussianFitter1.getObservations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray15 = gaussianFitter1.fit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray2);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray2, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray14);
    }

    @Test
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3143");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint2 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint2);
        gaussianFitter1.addObservedPoint((double) (short) 1, (double) (byte) -1, 100.0d);
        gaussianFitter1.addObservedPoint((double) 10, (double) 100.0f, (double) (short) 1);
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray14 = gaussianFitter1.getObservations();
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint17 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint17);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) 100L, (double) 0L);
        org.junit.Assert.assertNotNull(weightedObservedPointArray14);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray14, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3144");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint3);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) (-1.0f), (double) 1);
        gaussianFitter1.clearObservations();
        java.lang.Class<?> wildcardClass10 = gaussianFitter1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3145");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint3);
        gaussianFitter1.addObservedPoint((double) (byte) 10, (double) 100, (double) '4');
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray10 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint11 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint11);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint13 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint13);
        org.apache.commons.math.analysis.ParametricUnivariateRealFunction parametricUnivariateRealFunction16 = null;
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer17 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter18 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer17);
        gaussianFitter18.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        gaussianFitter18.addObservedPoint((double) (byte) 100, (double) 100.0f);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray26 = gaussianFitter18.getObservations();
        gaussianFitter18.addObservedPoint((double) (byte) 10, (double) (byte) 10);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray30 = gaussianFitter18.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser31 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray30);
        double[] doubleArray32 = parameterGuesser31.guess();
        double[] doubleArray33 = parameterGuesser31.guess();
        double[] doubleArray34 = parameterGuesser31.guess();
        double[] doubleArray35 = parameterGuesser31.guess();
        double[] doubleArray36 = parameterGuesser31.guess();
        double[] doubleArray37 = parameterGuesser31.guess();
        double[] doubleArray38 = parameterGuesser31.guess();
        double[] doubleArray39 = parameterGuesser31.guess();
        double[] doubleArray40 = parameterGuesser31.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray41 = gaussianFitter1.fit(0, parametricUnivariateRealFunction16, doubleArray40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertNotNull(weightedObservedPointArray10);
        org.junit.Assert.assertNotNull(weightedObservedPointArray26);
        org.junit.Assert.assertNotNull(weightedObservedPointArray30);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[] { 100.0d, 100.0d, 38.219481012960856d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertArrayEquals(doubleArray33, new double[] { 100.0d, 100.0d, 38.219481012960856d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] { 100.0d, 100.0d, 38.219481012960856d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { 100.0d, 100.0d, 38.219481012960856d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertArrayEquals(doubleArray36, new double[] { 100.0d, 100.0d, 38.219481012960856d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new double[] { 100.0d, 100.0d, 38.219481012960856d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { 100.0d, 100.0d, 38.219481012960856d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] { 100.0d, 100.0d, 38.219481012960856d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertArrayEquals(doubleArray40, new double[] { 100.0d, 100.0d, 38.219481012960856d }, 1.0E-15);
    }

    @Test
    public void test3146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3146");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint5 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint5);
        gaussianFitter1.addObservedPoint((double) (-1L), (double) (byte) 100);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint10 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint10);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint12 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint12);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray14 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (short) -1, (double) (short) 1, (double) 0);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) (short) 1, (double) 10, (double) '4');
        gaussianFitter1.addObservedPoint((double) (short) 100, (double) (short) 1);
        org.junit.Assert.assertNotNull(weightedObservedPointArray14);
    }

    @Test
    public void test3147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3147");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) 1, 1.0d);
        gaussianFitter1.addObservedPoint((double) (byte) 1, (double) 10, (double) '4');
        gaussianFitter1.addObservedPoint((double) 10.0f, (double) (short) 100, (-1.0d));
        gaussianFitter1.addObservedPoint((double) (short) -1, (double) (byte) 10, (double) 1L);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray18 = gaussianFitter1.getObservations();
        java.lang.Class<?> wildcardClass19 = weightedObservedPointArray18.getClass();
        org.junit.Assert.assertNotNull(weightedObservedPointArray18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3148");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint3);
        gaussianFitter1.addObservedPoint((double) 10L, (double) (short) -1);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) 10L, 1.0d, (double) '#');
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray15 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint16 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint16);
        gaussianFitter1.addObservedPoint((double) (byte) 10, 1.0d, (-1.0d));
        org.junit.Assert.assertNotNull(weightedObservedPointArray15);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray15, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test3149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3149");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) 10.0f, (double) (short) 10, 0.0d);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint8 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint8);
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
    }

    @Test
    public void test3150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3150");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (short) 10, (double) 1L);
        gaussianFitter1.addObservedPoint((double) 'a', (double) (byte) 100, (double) '4');
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) (short) 100, (double) 10L);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint17 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint17);
        org.apache.commons.math.analysis.ParametricUnivariateRealFunction parametricUnivariateRealFunction20 = null;
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer21 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter22 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer21);
        gaussianFitter22.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        gaussianFitter22.addObservedPoint((double) (byte) 100, (double) 100.0f);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray30 = gaussianFitter22.getObservations();
        gaussianFitter22.addObservedPoint((double) (byte) 10, (double) (byte) 10);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray34 = gaussianFitter22.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray35 = gaussianFitter22.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser36 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray35);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser37 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray35);
        double[] doubleArray38 = parameterGuesser37.guess();
        double[] doubleArray39 = parameterGuesser37.guess();
        double[] doubleArray40 = parameterGuesser37.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray41 = gaussianFitter1.fit((int) '4', parametricUnivariateRealFunction20, doubleArray40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray30);
        org.junit.Assert.assertNotNull(weightedObservedPointArray34);
        org.junit.Assert.assertNotNull(weightedObservedPointArray35);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { 100.0d, 100.0d, 38.219481012960856d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] { 100.0d, 100.0d, 38.219481012960856d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertArrayEquals(doubleArray40, new double[] { 100.0d, 100.0d, 38.219481012960856d }, 1.0E-15);
    }

    @Test
    public void test3151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3151");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint5 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint5);
        gaussianFitter1.addObservedPoint((double) (-1L), (double) (byte) 100);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint10 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint10);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint12 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint12);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray14 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (short) -1, (double) (short) 1, (double) 0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint19 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint19);
        gaussianFitter1.addObservedPoint((double) (-1), (double) 10, (double) (byte) 1);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint25 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint25);
        gaussianFitter1.addObservedPoint((double) 0.0f, (double) 0L);
        org.junit.Assert.assertNotNull(weightedObservedPointArray14);
    }

    @Test
    public void test3152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3152");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (short) 10, (double) 1L);
        gaussianFitter1.addObservedPoint(0.0d, (double) (-1L), (double) (byte) 0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray11 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) 100, (-1.0d), (-1.0d));
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray16 = gaussianFitter1.getObservations();
        java.lang.Class<?> wildcardClass17 = gaussianFitter1.getClass();
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray11);
        org.junit.Assert.assertNotNull(weightedObservedPointArray16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3153");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) (-1L), (double) (byte) 0, (double) 'a');
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray7 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) 100, (double) 10L, (-1.0d));
        gaussianFitter1.addObservedPoint((double) 0.0f, (double) (-1.0f), (double) 0);
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        org.apache.commons.math.analysis.ParametricUnivariateRealFunction parametricUnivariateRealFunction19 = null;
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer20 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter21 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer20);
        gaussianFitter21.clearObservations();
        gaussianFitter21.clearObservations();
        gaussianFitter21.addObservedPoint((double) 10.0f, (double) (short) 10, 0.0d);
        gaussianFitter21.addObservedPoint((double) (byte) 100, (double) (short) 1, 0.0d);
        gaussianFitter21.addObservedPoint((double) 0, (double) 1.0f);
        gaussianFitter21.addObservedPoint(0.0d, (double) 1L);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray38 = gaussianFitter21.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser39 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray38);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser40 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray38);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser41 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray38);
        double[] doubleArray42 = parameterGuesser41.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray43 = gaussianFitter1.fit((int) (short) 100, parametricUnivariateRealFunction19, doubleArray42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray7);
        org.junit.Assert.assertNotNull(weightedObservedPointArray38);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertArrayEquals(doubleArray42, new double[] { 1.0d, 0.0d, 4.2466090014400955d }, 1.0E-15);
    }

    @Test
    public void test3154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3154");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) 0.0f, (double) (short) -1);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray8 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint9);
        java.lang.Class<?> wildcardClass11 = gaussianFitter1.getClass();
        org.junit.Assert.assertNotNull(weightedObservedPointArray8);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray8, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3155");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (-1), (double) (short) 100, (double) (byte) 10);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = gaussianFitter1.getObservations();
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) 0.0f, (double) (short) -1);
        gaussianFitter1.addObservedPoint((double) (short) 1, (double) (short) 100);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint17 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint17);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint19 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint19);
        gaussianFitter1.addObservedPoint((double) (byte) 0, (double) 100L, 100.0d);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray25 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint26 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint26);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray28 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray29 = gaussianFitter1.getObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray9, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray25);
        org.junit.Assert.assertNotNull(weightedObservedPointArray28);
        org.junit.Assert.assertNotNull(weightedObservedPointArray29);
    }

    @Test
    public void test3156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3156");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray2 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) 0.0f, (double) '4');
        gaussianFitter1.addObservedPoint((double) 0L, (double) 10L, (double) (byte) 100);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray10 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray11 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) '#', (double) (-1L));
        org.junit.Assert.assertNotNull(weightedObservedPointArray2);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray2, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray10);
        org.junit.Assert.assertNotNull(weightedObservedPointArray11);
    }

    @Test
    public void test3157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3157");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (short) 10, (double) 1L);
        gaussianFitter1.addObservedPoint((double) 'a', (double) (byte) 100, (double) '4');
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) (short) 1, (double) '#', (double) 0);
        gaussianFitter1.addObservedPoint((double) 0L, (double) 1L);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray19 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray20 = gaussianFitter1.getObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray19);
        org.junit.Assert.assertNotNull(weightedObservedPointArray20);
    }

    @Test
    public void test3158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3158");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        gaussianFitter1.addObservedPoint(10.0d, (double) 10.0f, (double) '4');
        gaussianFitter1.addObservedPoint((-1.0d), 0.0d);
        gaussianFitter1.addObservedPoint((double) ' ', (double) (short) 10);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint16 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint16);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint18 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint18);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray20 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray21 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray22 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) 'a', (double) (byte) 100, (double) '#');
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray27 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser28 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray27);
        java.lang.Class<?> wildcardClass29 = parameterGuesser28.getClass();
        org.junit.Assert.assertNotNull(weightedObservedPointArray20);
        org.junit.Assert.assertNotNull(weightedObservedPointArray21);
        org.junit.Assert.assertNotNull(weightedObservedPointArray22);
        org.junit.Assert.assertNotNull(weightedObservedPointArray27);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test3159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3159");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) 1, 1.0d);
        gaussianFitter1.addObservedPoint((double) (byte) 1, (double) 10, (double) '4');
        gaussianFitter1.addObservedPoint((double) (byte) 1, 0.0d);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint13 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint13);
        gaussianFitter1.addObservedPoint((double) (short) 0, (double) (short) 1);
        gaussianFitter1.addObservedPoint(0.0d, (double) (-1));
    }

    @Test
    public void test3160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3160");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint3);
        gaussianFitter1.addObservedPoint((double) (byte) 10, (double) 100, (double) '4');
        gaussianFitter1.addObservedPoint((double) '#', 0.0d, (double) 100L);
        gaussianFitter1.addObservedPoint((double) (-1.0f), (double) 1L, (-1.0d));
        gaussianFitter1.addObservedPoint((double) (short) 1, (double) (short) 0, (double) 0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray21 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser22 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray21);
        org.junit.Assert.assertNotNull(weightedObservedPointArray21);
    }

    @Test
    public void test3161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3161");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint2 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint2);
        gaussianFitter1.addObservedPoint((double) (short) 1, (double) (byte) -1, 100.0d);
        gaussianFitter1.addObservedPoint((double) 10, (double) 100.0f, (double) (short) 1);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint12 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint12);
        gaussianFitter1.addObservedPoint((double) (byte) 1, (double) ' ');
        gaussianFitter1.addObservedPoint((double) '#', (double) (short) 0);
        org.apache.commons.math.analysis.ParametricUnivariateRealFunction parametricUnivariateRealFunction21 = null;
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer22 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter23 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer22);
        gaussianFitter23.clearObservations();
        gaussianFitter23.clearObservations();
        gaussianFitter23.addObservedPoint((double) 10.0f, (double) (short) 10, 0.0d);
        gaussianFitter23.addObservedPoint((double) (byte) 100, (double) (short) 1, 0.0d);
        gaussianFitter23.addObservedPoint((double) 0, (double) 1.0f);
        gaussianFitter23.addObservedPoint(0.0d, (double) 1L);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray40 = gaussianFitter23.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser41 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray40);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser42 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray40);
        double[] doubleArray43 = parameterGuesser42.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray44 = gaussianFitter1.fit((int) (short) 10, parametricUnivariateRealFunction21, doubleArray43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray40);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new double[] { 1.0d, 0.0d, 4.2466090014400955d }, 1.0E-15);
    }

    @Test
    public void test3162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3162");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint3);
        gaussianFitter1.addObservedPoint((double) (byte) 10, (double) 100, (double) '4');
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint9);
        gaussianFitter1.addObservedPoint((double) (short) 1, (double) (-1), (double) (short) 10);
        gaussianFitter1.addObservedPoint(0.0d, (double) (-1L));
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray18 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) 1.0f, (double) 10L);
        org.junit.Assert.assertNotNull(weightedObservedPointArray18);
    }

    @Test
    public void test3163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3163");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint2 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint2);
        gaussianFitter1.addObservedPoint((double) (short) 1, (double) (byte) -1, 100.0d);
        gaussianFitter1.addObservedPoint((double) 10, (double) 100.0f, (double) (short) 1);
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray14 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (short) 0, 0.0d, 1.0d);
        gaussianFitter1.addObservedPoint((double) (-1.0f), (double) 10.0f, (double) (short) 100);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) 0.0f, (double) 100.0f);
        gaussianFitter1.addObservedPoint(1.0d, 0.0d);
        gaussianFitter1.addObservedPoint((double) 1.0f, (double) (-1));
        org.apache.commons.math.analysis.ParametricUnivariateRealFunction parametricUnivariateRealFunction34 = null;
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer35 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter36 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer35);
        gaussianFitter36.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray38 = gaussianFitter36.getObservations();
        gaussianFitter36.addObservedPoint((double) (short) 10, (double) 1L);
        gaussianFitter36.addObservedPoint((double) 'a', (double) (byte) 100, (double) '4');
        gaussianFitter36.clearObservations();
        gaussianFitter36.addObservedPoint((double) (short) 1, (double) '#', (double) 0);
        gaussianFitter36.addObservedPoint((double) 100, (double) 1, (-1.0d));
        gaussianFitter36.addObservedPoint((double) 0L, (double) (short) 10, (double) (-1L));
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray59 = gaussianFitter36.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser60 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray59);
        double[] doubleArray61 = parameterGuesser60.guess();
        double[] doubleArray62 = parameterGuesser60.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray63 = gaussianFitter1.fit((int) (short) -1, parametricUnivariateRealFunction34, doubleArray62);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray14);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray14, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray38);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray38, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray59);
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertArrayEquals(doubleArray61, new double[] { 0.0d, 35.0d, 14.438470604896324d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertArrayEquals(doubleArray62, new double[] { 0.0d, 35.0d, 14.438470604896324d }, 1.0E-15);
    }

    @Test
    public void test3164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3164");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray2 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) 0.0f, (double) '4');
        gaussianFitter1.addObservedPoint((double) 0.0f, 1.0d);
        gaussianFitter1.addObservedPoint(0.0d, (double) 10);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint12 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint12);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray14 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (byte) 1, (double) (byte) 10, (double) 10.0f);
        gaussianFitter1.addObservedPoint((double) 100L, (double) (-1));
        org.junit.Assert.assertNotNull(weightedObservedPointArray2);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray2, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray14);
    }

    @Test
    public void test3165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3165");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray4 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint5 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint5);
        gaussianFitter1.addObservedPoint((double) 1L, (double) (-1.0f));
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) 1, (double) 10.0f, (double) 100.0f);
        gaussianFitter1.addObservedPoint((double) (short) 10, (double) (-1.0f));
        org.junit.Assert.assertNotNull(weightedObservedPointArray4);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray4, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test3166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3166");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint3);
        gaussianFitter1.addObservedPoint((double) 10L, (double) (short) -1);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray8 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint9);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint11 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint11);
        gaussianFitter1.addObservedPoint((double) (byte) 100, (double) (byte) 0, (double) 1.0f);
        gaussianFitter1.addObservedPoint((double) ' ', (double) (-1), (double) (short) -1);
        gaussianFitter1.addObservedPoint((double) 100.0f, (double) (short) 0, (double) (short) 100);
        gaussianFitter1.addObservedPoint((double) 10.0f, (double) 10L, (double) 100);
        org.junit.Assert.assertNotNull(weightedObservedPointArray8);
    }

    @Test
    public void test3167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3167");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) (-1L), (double) (byte) 0, (double) 'a');
        gaussianFitter1.addObservedPoint((double) 100, (double) (short) 100, (double) (byte) 100);
        gaussianFitter1.addObservedPoint((double) 'a', (double) 100L);
        gaussianFitter1.addObservedPoint((double) 0L, (double) (short) 100, (double) 100);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.analysis.ParametricUnivariateRealFunction parametricUnivariateRealFunction20 = null;
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer21 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter22 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer21);
        gaussianFitter22.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray24 = gaussianFitter22.getObservations();
        gaussianFitter22.addObservedPoint((double) (short) 10, (double) 1L);
        gaussianFitter22.addObservedPoint(0.0d, 0.0d, 0.0d);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray32 = gaussianFitter22.getObservations();
        gaussianFitter22.addObservedPoint((double) 0.0f, (double) 0.0f);
        gaussianFitter22.addObservedPoint((double) (short) -1, 10.0d);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray39 = gaussianFitter22.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser40 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray39);
        double[] doubleArray41 = parameterGuesser40.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray42 = gaussianFitter1.fit((int) (short) 10, parametricUnivariateRealFunction20, doubleArray41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray24);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray24, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray32);
        org.junit.Assert.assertNotNull(weightedObservedPointArray39);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertArrayEquals(doubleArray41, new double[] { 10.0d, (-1.0d), 4.671269901584105d }, 1.0E-15);
    }

    @Test
    public void test3168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3168");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint4 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint4);
        gaussianFitter1.addObservedPoint((double) 0, (double) 100);
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint11 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint11);
        org.apache.commons.math.analysis.ParametricUnivariateRealFunction parametricUnivariateRealFunction13 = null;
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer14 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter15 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer14);
        gaussianFitter15.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray17 = gaussianFitter15.getObservations();
        gaussianFitter15.addObservedPoint((double) (short) 10, (double) 1L);
        gaussianFitter15.addObservedPoint(0.0d, (double) (-1L), (double) (byte) 0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray25 = gaussianFitter15.getObservations();
        gaussianFitter15.addObservedPoint((double) 100, (-1.0d), (-1.0d));
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray30 = gaussianFitter15.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser31 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray30);
        double[] doubleArray32 = parameterGuesser31.guess();
        double[] doubleArray33 = parameterGuesser31.guess();
        double[] doubleArray34 = parameterGuesser31.guess();
        double[] doubleArray35 = parameterGuesser31.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray36 = gaussianFitter1.fit(parametricUnivariateRealFunction13, doubleArray35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray17);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray17, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray25);
        org.junit.Assert.assertNotNull(weightedObservedPointArray30);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[] { 1.0d, 10.0d, 4.671269901584105d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertArrayEquals(doubleArray33, new double[] { 1.0d, 10.0d, 4.671269901584105d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] { 1.0d, 10.0d, 4.671269901584105d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { 1.0d, 10.0d, 4.671269901584105d }, 1.0E-15);
    }

    @Test
    public void test3169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3169");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint2 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint2);
        gaussianFitter1.addObservedPoint((double) (short) 1, (double) (byte) -1, 100.0d);
        gaussianFitter1.addObservedPoint((double) 10, (double) 100.0f, (double) (short) 1);
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray14 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (short) 0, 0.0d, 1.0d);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint19 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint19);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint21 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint21);
        gaussianFitter1.addObservedPoint((double) (-1L), 100.0d);
        gaussianFitter1.addObservedPoint((double) (byte) 0, (double) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray29 = gaussianFitter1.fit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray14);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray14, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test3170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3170");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint3);
        gaussianFitter1.addObservedPoint((double) (byte) 10, (double) 100, (double) '4');
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray10 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray11 = gaussianFitter1.getObservations();
        org.apache.commons.math.analysis.ParametricUnivariateRealFunction parametricUnivariateRealFunction12 = null;
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer13 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter14 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer13);
        gaussianFitter14.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        gaussianFitter14.addObservedPoint((double) (byte) 100, (double) 100.0f);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray22 = gaussianFitter14.getObservations();
        gaussianFitter14.addObservedPoint((double) (byte) 10, (double) (byte) 10);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray26 = gaussianFitter14.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser27 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray26);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser28 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray26);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser29 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray26);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser30 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray26);
        double[] doubleArray31 = parameterGuesser30.guess();
        double[] doubleArray32 = parameterGuesser30.guess();
        double[] doubleArray33 = parameterGuesser30.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray34 = gaussianFitter1.fit(parametricUnivariateRealFunction12, doubleArray33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertNotNull(weightedObservedPointArray10);
        org.junit.Assert.assertNotNull(weightedObservedPointArray11);
        org.junit.Assert.assertNotNull(weightedObservedPointArray22);
        org.junit.Assert.assertNotNull(weightedObservedPointArray26);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertArrayEquals(doubleArray31, new double[] { 100.0d, 100.0d, 38.219481012960856d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[] { 100.0d, 100.0d, 38.219481012960856d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertArrayEquals(doubleArray33, new double[] { 100.0d, 100.0d, 38.219481012960856d }, 1.0E-15);
    }

    @Test
    public void test3171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3171");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) 10.0f, (double) (short) 10, 0.0d);
        gaussianFitter1.addObservedPoint((double) (byte) 100, (double) (short) 1, 0.0d);
        gaussianFitter1.addObservedPoint(0.0d, (double) '#');
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray15 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint(0.0d, (double) (short) 1);
        org.junit.Assert.assertNotNull(weightedObservedPointArray15);
    }

    @Test
    public void test3172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3172");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint3);
        gaussianFitter1.addObservedPoint((double) (byte) 10, (double) 100, (double) '4');
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray10 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray11 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint12 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint12);
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertNotNull(weightedObservedPointArray10);
        org.junit.Assert.assertNotNull(weightedObservedPointArray11);
    }

    @Test
    public void test3173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3173");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint2 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint2);
        gaussianFitter1.addObservedPoint((double) (short) 1, (double) (byte) -1, 100.0d);
        gaussianFitter1.addObservedPoint((double) 10, (double) 100.0f, (double) (short) 1);
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray14 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (short) 0, 0.0d, 1.0d);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint19 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint19);
        gaussianFitter1.addObservedPoint((double) '4', (double) (byte) -1);
        gaussianFitter1.addObservedPoint((double) (byte) 0, (double) (byte) 10);
        gaussianFitter1.addObservedPoint((double) '4', (double) (byte) 1);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.analysis.ParametricUnivariateRealFunction parametricUnivariateRealFunction32 = null;
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer33 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter34 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer33);
        gaussianFitter34.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray36 = gaussianFitter34.getObservations();
        gaussianFitter34.addObservedPoint((double) (short) 10, (double) 1L);
        gaussianFitter34.addObservedPoint(0.0d, (double) (-1L), (double) (byte) 0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray44 = gaussianFitter34.getObservations();
        gaussianFitter34.addObservedPoint((double) 100, (-1.0d), (-1.0d));
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray49 = gaussianFitter34.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser50 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray49);
        double[] doubleArray51 = parameterGuesser50.guess();
        double[] doubleArray52 = parameterGuesser50.guess();
        double[] doubleArray53 = parameterGuesser50.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray54 = gaussianFitter1.fit((int) '#', parametricUnivariateRealFunction32, doubleArray53);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray14);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray14, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray36);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray36, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray44);
        org.junit.Assert.assertNotNull(weightedObservedPointArray49);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertArrayEquals(doubleArray51, new double[] { 1.0d, 10.0d, 4.671269901584105d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertArrayEquals(doubleArray52, new double[] { 1.0d, 10.0d, 4.671269901584105d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertArrayEquals(doubleArray53, new double[] { 1.0d, 10.0d, 4.671269901584105d }, 1.0E-15);
    }

    @Test
    public void test3174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3174");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint2 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint2);
        gaussianFitter1.addObservedPoint((double) (short) 1, (double) (byte) -1, 100.0d);
        gaussianFitter1.addObservedPoint((double) 1.0f, (double) (byte) -1, (double) 100L);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint12 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint12);
        java.lang.Class<?> wildcardClass14 = gaussianFitter1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3175");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint3);
        gaussianFitter1.addObservedPoint((double) 10L, (double) (short) -1);
        gaussianFitter1.addObservedPoint((double) 0L, (double) (short) 10, (double) (byte) 1);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) 100.0f, (double) (short) 10);
        gaussianFitter1.addObservedPoint(0.0d, (double) '4', (double) 10.0f);
        gaussianFitter1.addObservedPoint((double) 100.0f, (double) 10.0f, (double) (byte) -1);
    }

    @Test
    public void test3176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3176");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        gaussianFitter1.addObservedPoint(10.0d, (double) 10.0f, (double) '4');
        gaussianFitter1.addObservedPoint((-1.0d), 0.0d);
        gaussianFitter1.addObservedPoint((double) ' ', (double) (short) 10);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) 100, (double) (byte) 100);
        gaussianFitter1.addObservedPoint((double) 100L, (double) 100.0f);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray24 = gaussianFitter1.getObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray24);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray24, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test3177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3177");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) 1, 1.0d);
        gaussianFitter1.addObservedPoint((double) 10.0f, 10.0d, (double) 10L);
        gaussianFitter1.addObservedPoint((double) 10.0f, (double) '4', (double) ' ');
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray14 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray15 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (short) 10, (double) 0.0f);
        org.junit.Assert.assertNotNull(weightedObservedPointArray14);
        org.junit.Assert.assertNotNull(weightedObservedPointArray15);
    }

    @Test
    public void test3178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3178");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint2 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint2);
        gaussianFitter1.addObservedPoint((double) (short) 1, (double) (byte) -1, 100.0d);
        gaussianFitter1.addObservedPoint((double) 10, (double) 100.0f, (double) (short) 1);
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray14 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (short) 0, 0.0d, 1.0d);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint19 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint19);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint21 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint21);
        gaussianFitter1.addObservedPoint((double) 100, 10.0d, (double) 10);
        gaussianFitter1.addObservedPoint((double) (byte) 1, (double) (byte) -1);
        org.junit.Assert.assertNotNull(weightedObservedPointArray14);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray14, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test3179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3179");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (short) 10, (double) 1L);
        gaussianFitter1.addObservedPoint(0.0d, 0.0d, 0.0d);
        gaussianFitter1.addObservedPoint(10.0d, (double) (byte) 0, (double) '#');
        gaussianFitter1.clearObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test3180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3180");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint3);
        gaussianFitter1.addObservedPoint((double) 10L, (double) (short) -1);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) 10L, 1.0d, (double) '#');
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer13 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter14 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer13);
        gaussianFitter14.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray16 = gaussianFitter14.getObservations();
        gaussianFitter14.addObservedPoint((double) (short) 10, (double) 1L);
        gaussianFitter14.addObservedPoint(0.0d, 0.0d, 0.0d);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray24 = gaussianFitter14.getObservations();
        gaussianFitter14.addObservedPoint((double) 0.0f, (double) 0.0f);
        gaussianFitter14.addObservedPoint((double) (short) -1, 10.0d);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray31 = gaussianFitter14.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser32 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray31);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser33 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray31);
        double[] doubleArray34 = parameterGuesser33.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray35 = gaussianFitter1.fit(doubleArray34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray16);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray16, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray24);
        org.junit.Assert.assertNotNull(weightedObservedPointArray31);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] { 10.0d, (-1.0d), 4.671269901584105d }, 1.0E-15);
    }

    @Test
    public void test3181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3181");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint3);
        gaussianFitter1.addObservedPoint((double) (byte) 10, (double) 100, (double) '4');
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint9);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint11 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint11);
        gaussianFitter1.addObservedPoint((double) 0L, (double) '4', (double) 1.0f);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint17 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint17);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray19 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray20 = gaussianFitter1.getObservations();
        org.apache.commons.math.analysis.ParametricUnivariateRealFunction parametricUnivariateRealFunction21 = null;
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer22 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter23 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer22);
        gaussianFitter23.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        gaussianFitter23.addObservedPoint((double) (byte) 100, (double) 100.0f);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray31 = gaussianFitter23.getObservations();
        gaussianFitter23.addObservedPoint((double) (byte) 10, (double) (byte) 10);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray35 = gaussianFitter23.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser36 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray35);
        double[] doubleArray37 = parameterGuesser36.guess();
        double[] doubleArray38 = parameterGuesser36.guess();
        double[] doubleArray39 = parameterGuesser36.guess();
        double[] doubleArray40 = parameterGuesser36.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray41 = gaussianFitter1.fit(parametricUnivariateRealFunction21, doubleArray40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray19);
        org.junit.Assert.assertNotNull(weightedObservedPointArray20);
        org.junit.Assert.assertNotNull(weightedObservedPointArray31);
        org.junit.Assert.assertNotNull(weightedObservedPointArray35);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new double[] { 100.0d, 100.0d, 38.219481012960856d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { 100.0d, 100.0d, 38.219481012960856d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] { 100.0d, 100.0d, 38.219481012960856d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertArrayEquals(doubleArray40, new double[] { 100.0d, 100.0d, 38.219481012960856d }, 1.0E-15);
    }

    @Test
    public void test3182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3182");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint3);
        gaussianFitter1.addObservedPoint((double) (short) 0, (double) 100);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint8 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint8);
        org.apache.commons.math.analysis.ParametricUnivariateRealFunction parametricUnivariateRealFunction10 = null;
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer11 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter12 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer11);
        gaussianFitter12.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        gaussianFitter12.addObservedPoint((double) (byte) 100, (double) 100.0f);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray20 = gaussianFitter12.getObservations();
        gaussianFitter12.addObservedPoint((double) (byte) 10, (double) (byte) 10);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray24 = gaussianFitter12.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser25 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray24);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser26 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray24);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser27 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray24);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser28 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray24);
        double[] doubleArray29 = parameterGuesser28.guess();
        double[] doubleArray30 = parameterGuesser28.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray31 = gaussianFitter1.fit(parametricUnivariateRealFunction10, doubleArray30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray20);
        org.junit.Assert.assertNotNull(weightedObservedPointArray24);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 100.0d, 100.0d, 38.219481012960856d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertArrayEquals(doubleArray30, new double[] { 100.0d, 100.0d, 38.219481012960856d }, 1.0E-15);
    }

    @Test
    public void test3183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3183");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint2 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint2);
        gaussianFitter1.addObservedPoint((double) (short) 1, (double) (byte) -1, 100.0d);
        gaussianFitter1.addObservedPoint((double) 10, (double) 100.0f, (double) (short) 1);
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray14 = gaussianFitter1.getObservations();
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray17 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) 100.0f, 0.0d, (double) 10L);
        gaussianFitter1.addObservedPoint((double) 10.0f, 10.0d, (double) (byte) 100);
        org.junit.Assert.assertNotNull(weightedObservedPointArray14);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray14, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray17);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray17, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test3184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3184");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (short) 10, (double) 1L);
        gaussianFitter1.addObservedPoint((double) 1L, (double) (short) 10);
        gaussianFitter1.addObservedPoint((-1.0d), (double) (short) 10);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint14 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint14);
        gaussianFitter1.addObservedPoint(100.0d, (double) '#', 0.0d);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint20 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint20);
        gaussianFitter1.addObservedPoint((double) (byte) -1, 100.0d, (-1.0d));
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray26 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) 0.0f, (double) 1, (double) '#');
        org.apache.commons.math.analysis.ParametricUnivariateRealFunction parametricUnivariateRealFunction31 = null;
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer32 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter33 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer32);
        gaussianFitter33.clearObservations();
        gaussianFitter33.addObservedPoint((double) 1, 1.0d);
        gaussianFitter33.addObservedPoint((double) (byte) -1, (double) (short) -1);
        gaussianFitter33.addObservedPoint((double) (byte) 0, (double) ' ');
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray44 = gaussianFitter33.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser45 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray44);
        double[] doubleArray46 = parameterGuesser45.guess();
        double[] doubleArray47 = parameterGuesser45.guess();
        double[] doubleArray48 = parameterGuesser45.guess();
        double[] doubleArray49 = parameterGuesser45.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray50 = gaussianFitter1.fit(parametricUnivariateRealFunction31, doubleArray49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray26);
        org.junit.Assert.assertNotNull(weightedObservedPointArray44);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertArrayEquals(doubleArray46, new double[] { 32.0d, 0.0d, 0.42507601343838297d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertArrayEquals(doubleArray47, new double[] { 32.0d, 0.0d, 0.42507601343838297d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertArrayEquals(doubleArray48, new double[] { 32.0d, 0.0d, 0.42507601343838297d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertArrayEquals(doubleArray49, new double[] { 32.0d, 0.0d, 0.42507601343838297d }, 1.0E-15);
    }

    @Test
    public void test3185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3185");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (short) 10, (double) 1L);
        gaussianFitter1.addObservedPoint((double) 'a', (double) (byte) 100, (double) '4');
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) 100.0f, (double) 10, 10.0d);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint16 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint16);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray18 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint19 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint19);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray21 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray22 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser23 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray22);
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray18);
        org.junit.Assert.assertNotNull(weightedObservedPointArray21);
        org.junit.Assert.assertNotNull(weightedObservedPointArray22);
    }

    @Test
    public void test3186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3186");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint3);
        gaussianFitter1.addObservedPoint((double) (byte) 10, (double) 100, (double) '4');
        gaussianFitter1.addObservedPoint((double) '#', 0.0d, (double) 100L);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint13 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint13);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint15 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint15);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray17 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray18 = gaussianFitter1.getObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray17);
        org.junit.Assert.assertNotNull(weightedObservedPointArray18);
    }

    @Test
    public void test3187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3187");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint3);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray5 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (byte) 10, (double) '4');
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) (byte) -1, (double) '#', (double) 1);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint14 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint14);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray16 = gaussianFitter1.getObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray5);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray5, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] { null });
        org.junit.Assert.assertNotNull(weightedObservedPointArray16);
    }

    @Test
    public void test3188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3188");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (short) 10, (double) 1L);
        gaussianFitter1.addObservedPoint((double) 'a', (double) (byte) 100, (double) '4');
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint11 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint11);
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray15 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint(100.0d, (double) 100L);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray19 = gaussianFitter1.getObservations();
        gaussianFitter1.clearObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray15);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray15, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray19);
    }

    @Test
    public void test3189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3189");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        gaussianFitter1.addObservedPoint((-1.0d), (double) (-1L), (double) (short) -1);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) 100L, (double) (short) 0);
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer14 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter15 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer14);
        gaussianFitter15.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray17 = gaussianFitter15.getObservations();
        gaussianFitter15.addObservedPoint((double) (short) 10, (double) 1L);
        gaussianFitter15.addObservedPoint((double) 'a', (double) (byte) 100, (double) '4');
        gaussianFitter15.clearObservations();
        gaussianFitter15.addObservedPoint((double) (short) 1, (double) '#', (double) 0);
        gaussianFitter15.addObservedPoint((double) 100, (double) 1, (-1.0d));
        gaussianFitter15.addObservedPoint((double) 0L, (double) (short) 10, (double) (-1L));
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray38 = gaussianFitter15.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser39 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray38);
        double[] doubleArray40 = parameterGuesser39.guess();
        double[] doubleArray41 = parameterGuesser39.guess();
        double[] doubleArray42 = parameterGuesser39.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray43 = gaussianFitter1.fit(doubleArray42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray17);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray17, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray38);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertArrayEquals(doubleArray40, new double[] { 0.0d, 35.0d, 14.438470604896324d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertArrayEquals(doubleArray41, new double[] { 0.0d, 35.0d, 14.438470604896324d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertArrayEquals(doubleArray42, new double[] { 0.0d, 35.0d, 14.438470604896324d }, 1.0E-15);
    }

    @Test
    public void test3190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3190");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint3);
        gaussianFitter1.addObservedPoint((double) (byte) 10, (double) 100, (double) '4');
        gaussianFitter1.addObservedPoint((double) '#', 0.0d, (double) 100L);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray13 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) 100L, (double) 100.0f, 1.0d);
        gaussianFitter1.addObservedPoint((double) (byte) -1, 10.0d);
        gaussianFitter1.addObservedPoint((double) 0, (double) (-1.0f), (double) 1L);
        gaussianFitter1.clearObservations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray26 = gaussianFitter1.fit();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (3)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray13);
    }

    @Test
    public void test3191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3191");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint3);
        gaussianFitter1.addObservedPoint((double) (byte) 10, (double) 100, (double) '4');
        gaussianFitter1.addObservedPoint((double) '#', 0.0d, (double) 100L);
        gaussianFitter1.addObservedPoint((double) (-1.0f), (double) 1L, (-1.0d));
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray17 = gaussianFitter1.getObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray17);
    }

    @Test
    public void test3192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3192");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (short) 10, (double) 1L);
        gaussianFitter1.addObservedPoint((double) 'a', (double) (byte) 100, (double) '4');
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint11 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint11);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) 1, (double) (byte) 0, (double) 0.0f);
        gaussianFitter1.addObservedPoint((double) 10, (double) 0);
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test3193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3193");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint6 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint6);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray8 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint(0.0d, (double) '4', (double) 0L);
        org.apache.commons.math.analysis.ParametricUnivariateRealFunction parametricUnivariateRealFunction14 = null;
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer15 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter16 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer15);
        gaussianFitter16.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray18 = gaussianFitter16.getObservations();
        gaussianFitter16.addObservedPoint((double) (short) 10, (double) 1L);
        gaussianFitter16.addObservedPoint(0.0d, 0.0d, 0.0d);
        gaussianFitter16.addObservedPoint((double) 10L, (double) (byte) 10, 1.0d);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray30 = gaussianFitter16.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser31 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray30);
        double[] doubleArray32 = parameterGuesser31.guess();
        double[] doubleArray33 = parameterGuesser31.guess();
        double[] doubleArray34 = parameterGuesser31.guess();
        double[] doubleArray35 = parameterGuesser31.guess();
        double[] doubleArray36 = parameterGuesser31.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray37 = gaussianFitter1.fit((int) '4', parametricUnivariateRealFunction14, doubleArray36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray8);
        org.junit.Assert.assertNotNull(weightedObservedPointArray18);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray18, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray30);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[] { 1.0d, 10.0d, 4.2466090014400955d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertArrayEquals(doubleArray33, new double[] { 1.0d, 10.0d, 4.2466090014400955d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] { 1.0d, 10.0d, 4.2466090014400955d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { 1.0d, 10.0d, 4.2466090014400955d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertArrayEquals(doubleArray36, new double[] { 1.0d, 10.0d, 4.2466090014400955d }, 1.0E-15);
    }

    @Test
    public void test3194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3194");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) (-1), (double) (byte) 100, (double) ' ');
        gaussianFitter1.addObservedPoint(10.0d, (double) 0, 0.0d);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint12 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint12);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray15 = gaussianFitter1.getObservations();
        gaussianFitter1.clearObservations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray17 = gaussianFitter1.fit();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (3)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray15);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray15, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test3195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3195");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint5 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint5);
        gaussianFitter1.addObservedPoint((double) (-1L), (double) (byte) 100);
        gaussianFitter1.addObservedPoint((double) 0L, (double) 10.0f);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray13 = gaussianFitter1.getObservations();
        org.apache.commons.math.analysis.ParametricUnivariateRealFunction parametricUnivariateRealFunction14 = null;
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer15 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter16 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer15);
        gaussianFitter16.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray18 = gaussianFitter16.getObservations();
        gaussianFitter16.addObservedPoint((double) (short) 10, (double) 1L);
        gaussianFitter16.addObservedPoint(0.0d, (double) (-1L), (double) (byte) 0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray26 = gaussianFitter16.getObservations();
        gaussianFitter16.addObservedPoint((double) 100, (-1.0d), (-1.0d));
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray31 = gaussianFitter16.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser32 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray31);
        double[] doubleArray33 = parameterGuesser32.guess();
        double[] doubleArray34 = parameterGuesser32.guess();
        double[] doubleArray35 = parameterGuesser32.guess();
        double[] doubleArray36 = parameterGuesser32.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray37 = gaussianFitter1.fit(parametricUnivariateRealFunction14, doubleArray36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray13);
        org.junit.Assert.assertNotNull(weightedObservedPointArray18);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray18, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray26);
        org.junit.Assert.assertNotNull(weightedObservedPointArray31);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertArrayEquals(doubleArray33, new double[] { 1.0d, 10.0d, 4.671269901584105d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] { 1.0d, 10.0d, 4.671269901584105d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { 1.0d, 10.0d, 4.671269901584105d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertArrayEquals(doubleArray36, new double[] { 1.0d, 10.0d, 4.671269901584105d }, 1.0E-15);
    }

    @Test
    public void test3196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3196");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint2 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint2);
        gaussianFitter1.addObservedPoint((double) (short) 1, (double) (byte) -1, 100.0d);
        gaussianFitter1.addObservedPoint((double) 10, (double) 100.0f, (double) (short) 1);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray13 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray14 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray15 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (byte) 100, (double) 100.0f, (double) 10.0f);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray20 = gaussianFitter1.fit();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 1 is smaller than the minimum (3)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray13);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray13, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray14);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray14, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray15);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray15, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test3197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3197");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        gaussianFitter1.addObservedPoint((double) 1L, (double) (short) 100);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint9);
        gaussianFitter1.addObservedPoint((double) ' ', 0.0d, (double) (byte) 10);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint15 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint15);
        gaussianFitter1.addObservedPoint((double) (-1.0f), (double) (-1.0f), (double) (byte) 1);
    }

    @Test
    public void test3198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3198");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (short) 10, (double) 1L);
        gaussianFitter1.addObservedPoint((double) 'a', (double) (byte) 100, (double) '4');
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint13 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint13);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint16 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint16);
        gaussianFitter1.addObservedPoint((double) 10L, (double) ' ');
        gaussianFitter1.addObservedPoint((double) (short) -1, 100.0d, (double) (byte) -1);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint25 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint25);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray27 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser28 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray27);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray29 = parameterGuesser28.guess();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray27);
    }

    @Test
    public void test3199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3199");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint2 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint2);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint4 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint4);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((-1.0d), (-1.0d), (double) 10L);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint11 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint11);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) (byte) 100, (double) 'a');
    }

    @Test
    public void test3200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3200");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint3);
        gaussianFitter1.addObservedPoint((double) (byte) 10, (double) 100, (double) '4');
        gaussianFitter1.addObservedPoint((double) '#', 0.0d, (double) 100L);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray13 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray14 = gaussianFitter1.getObservations();
        gaussianFitter1.clearObservations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray16 = gaussianFitter1.fit();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (3)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray13);
        org.junit.Assert.assertNotNull(weightedObservedPointArray14);
    }

    @Test
    public void test3201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3201");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (short) 10, (double) 1L);
        gaussianFitter1.addObservedPoint((double) 1L, (double) (short) 10);
        gaussianFitter1.addObservedPoint((-1.0d), (double) (short) 10);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint14 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint14);
        gaussianFitter1.addObservedPoint(100.0d, (double) '#', 0.0d);
        gaussianFitter1.addObservedPoint((double) (byte) -1, (double) 1, (double) '#');
        gaussianFitter1.addObservedPoint((double) ' ', (double) 10L);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint27 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint27);
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test3202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3202");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) 1, 1.0d);
        gaussianFitter1.addObservedPoint((double) 10.0f, 10.0d, (double) 10L);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint10 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint10);
        gaussianFitter1.addObservedPoint((double) 100L, (double) 1L, (double) (short) 1);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint16 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint16);
        org.apache.commons.math.analysis.ParametricUnivariateRealFunction parametricUnivariateRealFunction18 = null;
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer19 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter20 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer19);
        gaussianFitter20.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray22 = gaussianFitter20.getObservations();
        gaussianFitter20.addObservedPoint((double) (short) 10, (double) 1L);
        gaussianFitter20.addObservedPoint(0.0d, (double) (-1L), (double) (byte) 0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray30 = gaussianFitter20.getObservations();
        gaussianFitter20.addObservedPoint((double) 100, (-1.0d), (-1.0d));
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray35 = gaussianFitter20.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser36 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray35);
        double[] doubleArray37 = parameterGuesser36.guess();
        double[] doubleArray38 = parameterGuesser36.guess();
        double[] doubleArray39 = parameterGuesser36.guess();
        double[] doubleArray40 = parameterGuesser36.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray41 = gaussianFitter1.fit(parametricUnivariateRealFunction18, doubleArray40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray22);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray22, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray30);
        org.junit.Assert.assertNotNull(weightedObservedPointArray35);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new double[] { 1.0d, 10.0d, 4.671269901584105d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { 1.0d, 10.0d, 4.671269901584105d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] { 1.0d, 10.0d, 4.671269901584105d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertArrayEquals(doubleArray40, new double[] { 1.0d, 10.0d, 4.671269901584105d }, 1.0E-15);
    }

    @Test
    public void test3203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3203");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        gaussianFitter1.addObservedPoint(10.0d, (double) 10.0f, (double) '4');
        gaussianFitter1.addObservedPoint((-1.0d), 0.0d);
        gaussianFitter1.addObservedPoint(10.0d, (double) 10);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) (short) 10, (double) (byte) 100, (double) (-1L));
    }

    @Test
    public void test3204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3204");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (short) 10, (double) 1L);
        gaussianFitter1.addObservedPoint((double) 'a', (double) (byte) 100, (double) '4');
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) 100.0f, (double) 10, 10.0d);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint16 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint16);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray18 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint19 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint19);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray21 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) 100L, (double) 0L);
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray18);
        org.junit.Assert.assertNotNull(weightedObservedPointArray21);
    }

    @Test
    public void test3205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3205");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint5 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint5);
        gaussianFitter1.addObservedPoint((double) (-1L), (double) (byte) 100);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint10 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint10);
        gaussianFitter1.addObservedPoint((double) (short) 1, (double) 'a');
        gaussianFitter1.addObservedPoint((double) (byte) 100, (double) 1, (double) (short) 1);
    }

    @Test
    public void test3206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3206");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint3);
        gaussianFitter1.addObservedPoint((double) (byte) 10, (double) 100, (double) '4');
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint9);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint11 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint11);
        gaussianFitter1.addObservedPoint((double) (-1L), (double) 'a');
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint16 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint16);
        gaussianFitter1.addObservedPoint((double) (short) 10, 0.0d, (double) (short) -1);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray22 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser23 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray22);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray24 = parameterGuesser23.guess();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray22);
    }

    @Test
    public void test3207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3207");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint5 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint5);
        gaussianFitter1.addObservedPoint((double) (-1L), (double) (byte) 100);
        gaussianFitter1.addObservedPoint((double) 0L, (double) 10.0f);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray13 = gaussianFitter1.getObservations();
        gaussianFitter1.clearObservations();
        double[] doubleArray15 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray16 = gaussianFitter1.fit(doubleArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray13);
    }

    @Test
    public void test3208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3208");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) (-1L), (double) (byte) 0, (double) 'a');
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray7 = gaussianFitter1.getObservations();
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) 'a', 0.0d);
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray14 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) 1L, (double) 0L, (double) (short) 100);
        gaussianFitter1.addObservedPoint(1.0d, (double) 0L, (double) 10);
        java.lang.Class<?> wildcardClass23 = gaussianFitter1.getClass();
        org.junit.Assert.assertNotNull(weightedObservedPointArray7);
        org.junit.Assert.assertNotNull(weightedObservedPointArray14);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray14, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3209");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint2 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint2);
        gaussianFitter1.addObservedPoint((double) (short) 1, (double) (byte) -1, 100.0d);
        gaussianFitter1.addObservedPoint((double) 10, (double) 100.0f, (double) (short) 1);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray12 = gaussianFitter1.getObservations();
        org.apache.commons.math.analysis.ParametricUnivariateRealFunction parametricUnivariateRealFunction14 = null;
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer15 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter16 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer15);
        gaussianFitter16.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        gaussianFitter16.addObservedPoint((double) (byte) 100, (double) 100.0f);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray24 = gaussianFitter16.getObservations();
        gaussianFitter16.addObservedPoint((double) (byte) 10, (double) (byte) 10);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray28 = gaussianFitter16.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser29 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray28);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser30 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray28);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser31 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray28);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser32 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray28);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser33 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray28);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser34 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray28);
        double[] doubleArray35 = parameterGuesser34.guess();
        double[] doubleArray36 = parameterGuesser34.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray37 = gaussianFitter1.fit((-1), parametricUnivariateRealFunction14, doubleArray36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray12);
        org.junit.Assert.assertNotNull(weightedObservedPointArray24);
        org.junit.Assert.assertNotNull(weightedObservedPointArray28);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { 100.0d, 100.0d, 38.219481012960856d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertArrayEquals(doubleArray36, new double[] { 100.0d, 100.0d, 38.219481012960856d }, 1.0E-15);
    }

    @Test
    public void test3210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3210");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray4 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) 10.0f, (double) 10.0f, (double) (byte) -1);
        org.junit.Assert.assertNotNull(weightedObservedPointArray4);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray4, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test3211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3211");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        gaussianFitter1.addObservedPoint((double) (byte) 100, (double) 100.0f);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint10 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint10);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint12 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint12);
        gaussianFitter1.addObservedPoint((double) (short) 0, (double) 10L, (double) (-1));
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint18 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint18);
        gaussianFitter1.addObservedPoint(0.0d, (double) (byte) 100);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint23 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint23);
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
    }

    @Test
    public void test3212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3212");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint4 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint4);
        gaussianFitter1.addObservedPoint((double) 0, (double) 100);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = gaussianFitter1.getObservations();
        java.lang.Class<?> wildcardClass10 = weightedObservedPointArray9.getClass();
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3213");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint3);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray5 = gaussianFitter1.getObservations();
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) 100, 10.0d);
        org.junit.Assert.assertNotNull(weightedObservedPointArray5);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray5, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] { null });
    }

    @Test
    public void test3214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3214");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) (-1L), (double) (byte) 0, (double) 'a');
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray7 = gaussianFitter1.getObservations();
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) 'a', 0.0d);
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray14 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) 1L, (double) 0L, (double) (short) 100);
        gaussianFitter1.addObservedPoint((double) 0, (double) 0, (double) (short) 0);
        org.junit.Assert.assertNotNull(weightedObservedPointArray7);
        org.junit.Assert.assertNotNull(weightedObservedPointArray14);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray14, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test3215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3215");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (short) 10, (double) 1L);
        gaussianFitter1.addObservedPoint((double) 1L, (double) (short) 10);
        gaussianFitter1.addObservedPoint((-1.0d), (double) (short) 10);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint14 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint14);
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) 100, 1.0d);
        gaussianFitter1.addObservedPoint((double) 100L, (double) '#', (double) (-1));
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray25 = gaussianFitter1.getObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray25);
    }

    @Test
    public void test3216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3216");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (short) 10, (double) 1L);
        gaussianFitter1.addObservedPoint((double) 1L, (double) (short) 10);
        gaussianFitter1.addObservedPoint((-1.0d), (double) (short) 10);
        gaussianFitter1.addObservedPoint((double) 10.0f, 0.0d);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint16 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint16);
        gaussianFitter1.clearObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test3217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3217");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        gaussianFitter1.addObservedPoint((double) (byte) 100, (double) 100.0f);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint10 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint10);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray12 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((-1.0d), (double) 1L, (double) 10.0f);
        java.lang.Class<?> wildcardClass17 = gaussianFitter1.getClass();
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertNotNull(weightedObservedPointArray12);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3218");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint3);
        gaussianFitter1.addObservedPoint((double) (byte) 10, (double) 100, (double) '4');
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint9);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint11 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint11);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint13 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint13);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray15 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) '4', (double) (byte) -1);
        org.junit.Assert.assertNotNull(weightedObservedPointArray15);
    }

    @Test
    public void test3219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3219");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) (-1L), (double) (byte) 0, (double) 'a');
        gaussianFitter1.addObservedPoint((double) 100, (double) (short) 100, (double) (byte) 100);
        gaussianFitter1.addObservedPoint((double) 'a', (double) 100L);
        gaussianFitter1.addObservedPoint((double) 0L, (double) (short) 100, (double) 100);
        gaussianFitter1.addObservedPoint((double) (byte) -1, (double) (byte) 100);
        gaussianFitter1.addObservedPoint((double) 100, (double) (byte) 1, (double) (-1.0f));
    }

    @Test
    public void test3220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3220");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        gaussianFitter1.addObservedPoint((double) (byte) 100, (double) 100.0f);
        gaussianFitter1.addObservedPoint(0.0d, (double) 1L);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray12 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint13 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint13);
        org.apache.commons.math.analysis.ParametricUnivariateRealFunction parametricUnivariateRealFunction16 = null;
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer17 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter18 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer17);
        gaussianFitter18.clearObservations();
        gaussianFitter18.addObservedPoint((double) 1, 1.0d);
        gaussianFitter18.addObservedPoint((double) (byte) -1, (double) (short) -1);
        gaussianFitter18.addObservedPoint((double) (byte) 0, (double) ' ');
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray29 = gaussianFitter18.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser30 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray29);
        double[] doubleArray31 = parameterGuesser30.guess();
        double[] doubleArray32 = parameterGuesser30.guess();
        double[] doubleArray33 = parameterGuesser30.guess();
        double[] doubleArray34 = parameterGuesser30.guess();
        double[] doubleArray35 = parameterGuesser30.guess();
        double[] doubleArray36 = parameterGuesser30.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray37 = gaussianFitter1.fit((int) (short) 1, parametricUnivariateRealFunction16, doubleArray36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray12);
        org.junit.Assert.assertNotNull(weightedObservedPointArray29);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertArrayEquals(doubleArray31, new double[] { 32.0d, 0.0d, 0.42507601343838297d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[] { 32.0d, 0.0d, 0.42507601343838297d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertArrayEquals(doubleArray33, new double[] { 32.0d, 0.0d, 0.42507601343838297d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] { 32.0d, 0.0d, 0.42507601343838297d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { 32.0d, 0.0d, 0.42507601343838297d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertArrayEquals(doubleArray36, new double[] { 32.0d, 0.0d, 0.42507601343838297d }, 1.0E-15);
    }

    @Test
    public void test3221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3221");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) (-1), 100.0d);
        gaussianFitter1.addObservedPoint((double) 10L, (double) 1.0f);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint10 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint10);
        gaussianFitter1.addObservedPoint(10.0d, (double) '4');
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray15 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (-1), 10.0d, (double) 100);
        org.junit.Assert.assertNotNull(weightedObservedPointArray15);
    }

    @Test
    public void test3222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3222");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) (-1L), (double) (byte) 0, (double) 'a');
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray7 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) '4', (double) 100.0f);
        gaussianFitter1.addObservedPoint(10.0d, (double) (short) 0, (double) (byte) 1);
        org.junit.Assert.assertNotNull(weightedObservedPointArray7);
    }

    @Test
    public void test3223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3223");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint2 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint2);
        gaussianFitter1.addObservedPoint((double) (short) 1, (double) (byte) -1, 100.0d);
        gaussianFitter1.addObservedPoint((double) 10, (double) 100.0f, (double) (short) 1);
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray14 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (short) 0, 0.0d, 1.0d);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint19 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint19);
        gaussianFitter1.addObservedPoint((double) '4', (double) (byte) -1);
        gaussianFitter1.addObservedPoint((double) (byte) 0, (double) (byte) 10);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) 100.0f, (double) 0L);
        gaussianFitter1.addObservedPoint((double) 1L, 0.0d);
        org.junit.Assert.assertNotNull(weightedObservedPointArray14);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray14, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test3224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3224");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        gaussianFitter1.addObservedPoint((double) (byte) 100, (double) 100.0f);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = gaussianFitter1.getObservations();
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray11 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint12 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint12);
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertNotNull(weightedObservedPointArray11);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray11, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test3225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3225");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint2 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint2);
        gaussianFitter1.addObservedPoint((double) (short) 1, (double) (byte) -1, 100.0d);
        gaussianFitter1.addObservedPoint((double) 10, (double) 100.0f, (double) (short) 1);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray13 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray14 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) 100, (-1.0d), (double) '4');
        gaussianFitter1.addObservedPoint((double) 'a', (double) (byte) 0, (double) (short) 100);
        gaussianFitter1.addObservedPoint((double) 10L, (double) (-1L));
        org.junit.Assert.assertNotNull(weightedObservedPointArray13);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray13, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray14);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray14, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test3226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3226");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) 10.0f, (double) (short) 10, 0.0d);
        gaussianFitter1.addObservedPoint((double) (byte) 100, (double) (short) 1, 0.0d);
        gaussianFitter1.addObservedPoint((double) 10.0f, (double) (byte) 0, (double) (byte) 1);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray16 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray17 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint18 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint18);
        org.junit.Assert.assertNotNull(weightedObservedPointArray16);
        org.junit.Assert.assertNotNull(weightedObservedPointArray17);
    }

    @Test
    public void test3227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3227");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint2 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint2);
        gaussianFitter1.addObservedPoint((double) (short) 1, (double) (byte) -1, 100.0d);
        gaussianFitter1.addObservedPoint((double) 10, (double) 100.0f, (double) (short) 1);
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray14 = gaussianFitter1.getObservations();
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint17 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint17);
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer19 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter20 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer19);
        gaussianFitter20.clearObservations();
        gaussianFitter20.addObservedPoint((double) (-1), 100.0d);
        gaussianFitter20.addObservedPoint((double) 10L, (double) 1.0f);
        gaussianFitter20.addObservedPoint((double) (short) 0, (double) 'a');
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray31 = gaussianFitter20.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser32 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray31);
        double[] doubleArray33 = parameterGuesser32.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray34 = gaussianFitter1.fit(doubleArray33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray14);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray14, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray31);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertArrayEquals(doubleArray33, new double[] { 100.0d, (-1.0d), 4.671269901584105d }, 1.0E-15);
    }

    @Test
    public void test3228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3228");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint6 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint6);
        gaussianFitter1.addObservedPoint(10.0d, (double) (-1), (double) (short) -1);
        gaussianFitter1.clearObservations();
    }

    @Test
    public void test3229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3229");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (short) 10, (double) 1L);
        gaussianFitter1.addObservedPoint((double) (byte) -1, (double) (short) -1);
        gaussianFitter1.addObservedPoint((double) 1, 0.0d, (double) (short) 10);
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer14 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter15 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer14);
        gaussianFitter15.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        gaussianFitter15.addObservedPoint((double) (byte) 100, (double) 100.0f);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray23 = gaussianFitter15.getObservations();
        gaussianFitter15.addObservedPoint((double) (byte) 10, (double) (byte) 10);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray27 = gaussianFitter15.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray28 = gaussianFitter15.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser29 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray28);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser30 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray28);
        double[] doubleArray31 = parameterGuesser30.guess();
        double[] doubleArray32 = parameterGuesser30.guess();
        double[] doubleArray33 = parameterGuesser30.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray34 = gaussianFitter1.fit(doubleArray33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray23);
        org.junit.Assert.assertNotNull(weightedObservedPointArray27);
        org.junit.Assert.assertNotNull(weightedObservedPointArray28);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertArrayEquals(doubleArray31, new double[] { 100.0d, 100.0d, 38.219481012960856d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[] { 100.0d, 100.0d, 38.219481012960856d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertArrayEquals(doubleArray33, new double[] { 100.0d, 100.0d, 38.219481012960856d }, 1.0E-15);
    }

    @Test
    public void test3230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3230");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (short) 10, (double) 1L);
        gaussianFitter1.addObservedPoint(0.0d, 0.0d, 0.0d);
        gaussianFitter1.addObservedPoint((double) 100.0f, (double) 100.0f, (double) 0L);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray15 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray16 = gaussianFitter1.getObservations();
        java.lang.Class<?> wildcardClass17 = gaussianFitter1.getClass();
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray15);
        org.junit.Assert.assertNotNull(weightedObservedPointArray16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3231");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint2 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint2);
        gaussianFitter1.addObservedPoint((double) (short) 1, (double) (byte) -1, 100.0d);
        gaussianFitter1.addObservedPoint((double) 10, (double) 100.0f, (double) (short) 1);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray13 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) 100, (double) 0, (double) 1);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray18 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) 0, (double) (-1L));
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray22 = gaussianFitter1.fit();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 2 is smaller than the minimum (3)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray13);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray13, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray18);
    }

    @Test
    public void test3232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3232");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (short) 10, (double) 1L);
        gaussianFitter1.addObservedPoint((double) 1L, (double) (short) 10);
        gaussianFitter1.addObservedPoint((-1.0d), (double) (short) 10);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint14 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint14);
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) (short) 10, (double) 100.0f, (double) 10);
        gaussianFitter1.addObservedPoint((double) 1, (double) 0.0f, (double) (byte) 1);
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test3233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3233");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        gaussianFitter1.addObservedPoint((double) (byte) 100, (double) 100.0f);
        gaussianFitter1.addObservedPoint(0.0d, (double) 1L);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray12 = gaussianFitter1.getObservations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray13 = gaussianFitter1.fit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray12);
    }

    @Test
    public void test3234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3234");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        gaussianFitter1.addObservedPoint((-1.0d), (double) (-1L), (double) (short) -1);
        gaussianFitter1.addObservedPoint((double) (byte) 1, 0.0d);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray13 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer14 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter15 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer14);
        gaussianFitter15.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        gaussianFitter15.addObservedPoint((double) (byte) 100, (double) 100.0f);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray23 = gaussianFitter15.getObservations();
        gaussianFitter15.addObservedPoint((double) (byte) 10, (double) (byte) 10);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray27 = gaussianFitter15.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser28 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray27);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser29 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray27);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser30 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray27);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser31 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray27);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser32 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray27);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser33 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray27);
        double[] doubleArray34 = parameterGuesser33.guess();
        double[] doubleArray35 = parameterGuesser33.guess();
        double[] doubleArray36 = parameterGuesser33.guess();
        double[] doubleArray37 = parameterGuesser33.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray38 = gaussianFitter1.fit(doubleArray37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray13);
        org.junit.Assert.assertNotNull(weightedObservedPointArray23);
        org.junit.Assert.assertNotNull(weightedObservedPointArray27);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] { 100.0d, 100.0d, 38.219481012960856d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { 100.0d, 100.0d, 38.219481012960856d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertArrayEquals(doubleArray36, new double[] { 100.0d, 100.0d, 38.219481012960856d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new double[] { 100.0d, 100.0d, 38.219481012960856d }, 1.0E-15);
    }

    @Test
    public void test3235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3235");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint2 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint2);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint4 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint4);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((-1.0d), (-1.0d), (double) 10L);
        gaussianFitter1.addObservedPoint((double) (short) 100, (double) ' ');
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray14 = gaussianFitter1.fit();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 2 is smaller than the minimum (3)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3236");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint3);
        gaussianFitter1.addObservedPoint((double) (byte) 10, (double) 100, (double) '4');
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray10 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (-1.0f), (double) (short) -1);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint14 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint14);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray16 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray17 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray18 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser19 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray18);
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertNotNull(weightedObservedPointArray10);
        org.junit.Assert.assertNotNull(weightedObservedPointArray16);
        org.junit.Assert.assertNotNull(weightedObservedPointArray17);
        org.junit.Assert.assertNotNull(weightedObservedPointArray18);
    }

    @Test
    public void test3237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3237");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        gaussianFitter1.addObservedPoint(10.0d, (double) 10.0f, (double) '4');
        gaussianFitter1.addObservedPoint((-1.0d), 0.0d);
        gaussianFitter1.addObservedPoint((double) ' ', (double) (short) 10);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint16 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint16);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint18 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint18);
        gaussianFitter1.addObservedPoint((double) (short) 0, (double) 10.0f, 0.0d);
        gaussianFitter1.addObservedPoint((double) (-1), (double) (byte) 1, (double) '4');
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint28 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint28);
        gaussianFitter1.addObservedPoint((double) 'a', (double) '4');
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray33 = gaussianFitter1.fit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3238");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint2 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint2);
        gaussianFitter1.addObservedPoint((double) (short) 1, (double) (byte) -1, 100.0d);
        gaussianFitter1.addObservedPoint((double) 10, (double) 100.0f, (double) (short) 1);
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray14 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (short) 0, 0.0d, 1.0d);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint19 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint19);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray21 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray22 = gaussianFitter1.getObservations();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser23 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray22);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 2 is smaller than the minimum (3)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray14);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray14, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray21);
        org.junit.Assert.assertNotNull(weightedObservedPointArray22);
    }

    @Test
    public void test3239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3239");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        gaussianFitter1.addObservedPoint(10.0d, (double) 10.0f, (double) '4');
        gaussianFitter1.addObservedPoint((-1.0d), 0.0d);
        gaussianFitter1.addObservedPoint((double) ' ', (double) (short) 10);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint16 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint16);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint18 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint18);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray20 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray21 = gaussianFitter1.getObservations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray22 = gaussianFitter1.fit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray20);
        org.junit.Assert.assertNotNull(weightedObservedPointArray21);
    }

    @Test
    public void test3240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3240");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) (byte) -1, (double) 1, (double) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray8 = gaussianFitter1.fit();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 1 is smaller than the minimum (3)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3241");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        gaussianFitter1.addObservedPoint(10.0d, (double) 10.0f, (double) '4');
        gaussianFitter1.addObservedPoint((-1.0d), 0.0d);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint13 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint13);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint15 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint15);
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer17 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter18 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer17);
        gaussianFitter18.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray20 = gaussianFitter18.getObservations();
        gaussianFitter18.addObservedPoint((double) (short) 10, (double) 1L);
        gaussianFitter18.addObservedPoint(0.0d, 0.0d, 0.0d);
        gaussianFitter18.addObservedPoint((double) 10L, (double) (byte) 10, 1.0d);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray32 = gaussianFitter18.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser33 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray32);
        double[] doubleArray34 = parameterGuesser33.guess();
        double[] doubleArray35 = parameterGuesser33.guess();
        double[] doubleArray36 = parameterGuesser33.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray37 = gaussianFitter1.fit(doubleArray36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray20);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray20, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray32);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] { 1.0d, 10.0d, 4.2466090014400955d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { 1.0d, 10.0d, 4.2466090014400955d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertArrayEquals(doubleArray36, new double[] { 1.0d, 10.0d, 4.2466090014400955d }, 1.0E-15);
    }

    @Test
    public void test3242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3242");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (short) 10, (double) 1L);
        gaussianFitter1.addObservedPoint((double) (byte) -1, (double) (short) -1);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray10 = gaussianFitter1.getObservations();
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) 1L, (double) (short) 1);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint15 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint15);
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray10);
    }

    @Test
    public void test3243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3243");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint3);
        gaussianFitter1.addObservedPoint((double) (byte) 10, (double) 100, (double) '4');
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint9);
        gaussianFitter1.addObservedPoint((double) (short) 1, (double) (-1), (double) (short) 10);
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((-1.0d), (double) (byte) 0, (double) 10.0f);
        gaussianFitter1.addObservedPoint((double) (short) 0, (double) 0, (double) ' ');
        gaussianFitter1.addObservedPoint((double) 1, (double) (-1.0f), (double) (short) 100);
        gaussianFitter1.addObservedPoint((double) 10.0f, (double) (short) 10, (double) 0.0f);
        java.lang.Class<?> wildcardClass33 = gaussianFitter1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test3244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3244");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) 1, 1.0d);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) (short) -1, (double) (byte) 0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray10 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint(100.0d, (double) 100.0f);
        gaussianFitter1.addObservedPoint((double) 'a', (double) (byte) 1, (double) 1);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray18 = gaussianFitter1.getObservations();
        org.apache.commons.math.analysis.ParametricUnivariateRealFunction parametricUnivariateRealFunction19 = null;
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer20 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter21 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer20);
        gaussianFitter21.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        gaussianFitter21.addObservedPoint((-1.0d), (double) (-1L), (double) (short) -1);
        gaussianFitter21.addObservedPoint((double) (byte) 1, 0.0d);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray33 = gaussianFitter21.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser34 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray33);
        double[] doubleArray35 = parameterGuesser34.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray36 = gaussianFitter1.fit(parametricUnivariateRealFunction19, doubleArray35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray10);
        org.junit.Assert.assertNotNull(weightedObservedPointArray18);
        org.junit.Assert.assertNotNull(weightedObservedPointArray33);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { 0.0d, 1.0d, 42.89075091454496d }, 1.0E-15);
    }

    @Test
    public void test3245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3245");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint4 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint4);
        gaussianFitter1.addObservedPoint((double) 0, (double) 100);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray10 = gaussianFitter1.getObservations();
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) 0L, (double) 'a', (double) (-1.0f));
        java.lang.Class<?> wildcardClass16 = gaussianFitter1.getClass();
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray10);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray10, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3246");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        gaussianFitter1.addObservedPoint(10.0d, (double) 10.0f, (double) '4');
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray11 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint12 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint12);
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer14 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter15 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer14);
        gaussianFitter15.clearObservations();
        gaussianFitter15.addObservedPoint((double) 1, 1.0d);
        gaussianFitter15.addObservedPoint((double) (byte) -1, (double) (short) -1);
        gaussianFitter15.addObservedPoint((double) (byte) 0, (double) ' ');
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray26 = gaussianFitter15.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser27 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray26);
        double[] doubleArray28 = parameterGuesser27.guess();
        double[] doubleArray29 = parameterGuesser27.guess();
        double[] doubleArray30 = parameterGuesser27.guess();
        double[] doubleArray31 = parameterGuesser27.guess();
        double[] doubleArray32 = parameterGuesser27.guess();
        double[] doubleArray33 = parameterGuesser27.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray34 = gaussianFitter1.fit(doubleArray33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray11);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray11, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray26);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertArrayEquals(doubleArray28, new double[] { 32.0d, 0.0d, 0.42507601343838297d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 32.0d, 0.0d, 0.42507601343838297d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertArrayEquals(doubleArray30, new double[] { 32.0d, 0.0d, 0.42507601343838297d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertArrayEquals(doubleArray31, new double[] { 32.0d, 0.0d, 0.42507601343838297d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[] { 32.0d, 0.0d, 0.42507601343838297d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertArrayEquals(doubleArray33, new double[] { 32.0d, 0.0d, 0.42507601343838297d }, 1.0E-15);
    }

    @Test
    public void test3247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3247");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint2 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint2);
        gaussianFitter1.addObservedPoint((double) (short) 1, (double) (byte) -1, 100.0d);
        gaussianFitter1.addObservedPoint((double) 10, (double) 100.0f, (double) (short) 1);
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray14 = gaussianFitter1.getObservations();
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray17 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer18 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter19 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer18);
        gaussianFitter19.clearObservations();
        gaussianFitter19.clearObservations();
        gaussianFitter19.addObservedPoint((double) 10.0f, (double) (short) 10, 0.0d);
        gaussianFitter19.addObservedPoint((double) (byte) 100, (double) (short) 1, 0.0d);
        gaussianFitter19.addObservedPoint((double) 0, (double) 1.0f);
        gaussianFitter19.addObservedPoint(0.0d, (double) 1L);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray36 = gaussianFitter19.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser37 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray36);
        double[] doubleArray38 = parameterGuesser37.guess();
        double[] doubleArray39 = parameterGuesser37.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray40 = gaussianFitter1.fit(doubleArray39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray14);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray14, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray17);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray17, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray36);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { 1.0d, 0.0d, 4.2466090014400955d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] { 1.0d, 0.0d, 4.2466090014400955d }, 1.0E-15);
    }

    @Test
    public void test3248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3248");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint3);
        gaussianFitter1.addObservedPoint((double) (byte) 10, (double) 100, (double) '4');
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint9);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint11 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint11);
        gaussianFitter1.addObservedPoint(0.0d, (double) 0.0f);
        gaussianFitter1.addObservedPoint((double) (byte) 10, (double) 10L, 10.0d);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray20 = gaussianFitter1.getObservations();
        org.apache.commons.math.analysis.ParametricUnivariateRealFunction parametricUnivariateRealFunction22 = null;
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer23 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter24 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer23);
        gaussianFitter24.clearObservations();
        gaussianFitter24.clearObservations();
        gaussianFitter24.addObservedPoint((double) 10.0f, (double) (short) 10, 0.0d);
        gaussianFitter24.addObservedPoint((double) (byte) 100, (double) (short) 1, 0.0d);
        gaussianFitter24.addObservedPoint((double) 0, (double) 1.0f);
        gaussianFitter24.addObservedPoint(0.0d, (double) 1L);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray41 = gaussianFitter24.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser42 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray41);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser43 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray41);
        double[] doubleArray44 = parameterGuesser43.guess();
        double[] doubleArray45 = parameterGuesser43.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray46 = gaussianFitter1.fit((int) 'a', parametricUnivariateRealFunction22, doubleArray45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray20);
        org.junit.Assert.assertNotNull(weightedObservedPointArray41);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertArrayEquals(doubleArray44, new double[] { 1.0d, 0.0d, 4.2466090014400955d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertArrayEquals(doubleArray45, new double[] { 1.0d, 0.0d, 4.2466090014400955d }, 1.0E-15);
    }

    @Test
    public void test3249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3249");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) (-1L), (double) (byte) 0, (double) 'a');
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray7 = gaussianFitter1.getObservations();
        gaussianFitter1.clearObservations();
        org.apache.commons.math.analysis.ParametricUnivariateRealFunction parametricUnivariateRealFunction9 = null;
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer10 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter11 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer10);
        gaussianFitter11.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray13 = gaussianFitter11.getObservations();
        gaussianFitter11.addObservedPoint((double) (short) 10, (double) 1L);
        gaussianFitter11.addObservedPoint((double) 'a', (double) (byte) 100, (double) '4');
        gaussianFitter11.clearObservations();
        gaussianFitter11.addObservedPoint((double) (short) 1, (double) '#', (double) 0);
        gaussianFitter11.addObservedPoint((double) 100, (double) 1, (-1.0d));
        gaussianFitter11.addObservedPoint((double) 0L, (double) (short) 10, (double) (-1L));
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray34 = gaussianFitter11.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser35 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray34);
        double[] doubleArray36 = parameterGuesser35.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray37 = gaussianFitter1.fit(parametricUnivariateRealFunction9, doubleArray36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray7);
        org.junit.Assert.assertNotNull(weightedObservedPointArray13);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray13, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray34);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertArrayEquals(doubleArray36, new double[] { 0.0d, 35.0d, 14.438470604896324d }, 1.0E-15);
    }

    @Test
    public void test3250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3250");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint3);
        gaussianFitter1.addObservedPoint((double) (byte) 10, (double) 100, (double) '4');
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint9);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint11 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint11);
        gaussianFitter1.addObservedPoint((double) (-1L), (double) 'a');
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint16 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint16);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint18 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint18);
        gaussianFitter1.addObservedPoint((double) 'a', 0.0d);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray23 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser24 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray23);
        org.junit.Assert.assertNotNull(weightedObservedPointArray23);
    }

    @Test
    public void test3251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3251");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) (-1), 100.0d);
        gaussianFitter1.addObservedPoint((double) 10L, (double) 1.0f);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint10 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint10);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray12 = gaussianFitter1.fit();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 1 is smaller than the minimum (3)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3252");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint3);
        gaussianFitter1.addObservedPoint((double) (byte) 10, (double) 100, (double) '4');
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint(0.0d, (double) 100.0f);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) (short) 100, 100.0d);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint17 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint17);
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
    }
}

