package org.apache.commons.math3.optimization.fitting;

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
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        harmonicFitter1.addObservedPoint(10.0d, (double) 10.0f, (double) '4');
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint11 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint11);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (short) -1, (double) (short) 0, (double) 10L);
        harmonicFitter1.addObservedPoint(1.0d, 100.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint21 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint21);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray23 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray24 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray25 = harmonicFitter1.getObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray23);
        org.junit.Assert.assertNotNull(weightedObservedPointArray24);
        org.junit.Assert.assertNotNull(weightedObservedPointArray25);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        harmonicFitter1.addObservedPoint((double) 1L, (double) (short) 100);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        harmonicFitter1.addObservedPoint(10.0d, (double) 10.0f, (double) '4');
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint11 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint11);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray14 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) 1, (double) (-1L), (double) (-1.0f));
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint19 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint19);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray21 = harmonicFitter1.getObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray14);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray14, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray21);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (-1), (double) (byte) 100, (double) ' ');
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric12 = null;
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer13 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter14 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer13);
        harmonicFitter14.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        harmonicFitter14.addObservedPoint((double) (byte) 100, (double) 100.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray22 = harmonicFitter14.getObservations();
        harmonicFitter14.addObservedPoint((double) (byte) 10, (double) (byte) 10);
        harmonicFitter14.addObservedPoint((double) '4', (double) 100, (double) 100.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray30 = harmonicFitter14.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser31 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray30);
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser32 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray30);
        double[] doubleArray33 = parameterGuesser32.guess();
        double[] doubleArray34 = parameterGuesser32.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray35 = harmonicFitter1.fit((int) (short) 100, parametric12, doubleArray34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray22);
        org.junit.Assert.assertNotNull(weightedObservedPointArray30);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertArrayEquals(doubleArray33, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (-1), (double) (byte) 100, (double) ' ');
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (byte) -1, (double) (short) -1);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray13 = harmonicFitter1.getObservations();
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric15 = null;
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer16 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter17 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer16);
        harmonicFitter17.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        harmonicFitter17.addObservedPoint((double) (byte) 100, (double) 100.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray25 = harmonicFitter17.getObservations();
        harmonicFitter17.addObservedPoint((double) (byte) 10, (double) (byte) 10);
        harmonicFitter17.addObservedPoint((double) '4', (double) 100, (double) 100.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray33 = harmonicFitter17.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser34 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray33);
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser35 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray33);
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser36 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray33);
        double[] doubleArray37 = parameterGuesser36.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray38 = harmonicFitter1.fit((int) (short) 10, parametric15, doubleArray37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray13);
        org.junit.Assert.assertNotNull(weightedObservedPointArray25);
        org.junit.Assert.assertNotNull(weightedObservedPointArray33);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        harmonicFitter1.addObservedPoint((-1.0d), (double) (-1L), (double) (short) -1);
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray13 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) (short) -1, (double) 10, 10.0d);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray18 = harmonicFitter1.fit();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: sample contains 1 observed points, at least 4 are required");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray13);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray13, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) (short) 10, (double) 1L);
        harmonicFitter1.addObservedPoint((double) 1L, (double) (short) 10);
        harmonicFitter1.addObservedPoint((-1.0d), (double) (short) 10);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (byte) 100, (double) (short) 100);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray18 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) '#', 100.0d, (double) (byte) -1);
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray18);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray18, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (-1L), (double) (byte) 0, (double) 'a');
        harmonicFitter1.addObservedPoint(0.0d, (double) (-1L), (double) (byte) 0);
        harmonicFitter1.addObservedPoint((double) 'a', (double) (short) 1, (double) (short) 10);
        harmonicFitter1.addObservedPoint((double) (short) 10, (double) (-1));
        harmonicFitter1.addObservedPoint((double) (-1L), (double) (-1), 0.0d);
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric22 = null;
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer23 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter24 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer23);
        harmonicFitter24.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        harmonicFitter24.addObservedPoint((double) (byte) 100, (double) 100.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray32 = harmonicFitter24.getObservations();
        harmonicFitter24.addObservedPoint((double) (byte) 10, (double) (byte) 10);
        harmonicFitter24.addObservedPoint((double) '4', (double) 100, (double) 100.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray40 = harmonicFitter24.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser41 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray40);
        double[] doubleArray42 = parameterGuesser41.guess();
        double[] doubleArray43 = parameterGuesser41.guess();
        double[] doubleArray44 = parameterGuesser41.guess();
        double[] doubleArray45 = parameterGuesser41.guess();
        double[] doubleArray46 = parameterGuesser41.guess();
        double[] doubleArray47 = parameterGuesser41.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray48 = harmonicFitter1.fit(parametric22, doubleArray47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray32);
        org.junit.Assert.assertNotNull(weightedObservedPointArray40);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertArrayEquals(doubleArray42, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertArrayEquals(doubleArray44, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertArrayEquals(doubleArray45, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertArrayEquals(doubleArray46, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertArrayEquals(doubleArray47, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint2 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint2);
        harmonicFitter1.addObservedPoint((double) (short) 1, (double) (byte) -1, 100.0d);
        harmonicFitter1.addObservedPoint((double) 10, (double) 100.0f, (double) (short) 1);
        harmonicFitter1.addObservedPoint((double) (-1), (double) (-1.0f));
        harmonicFitter1.addObservedPoint(10.0d, (double) (short) 0, 10.0d);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) (short) 10, (double) 1L);
        harmonicFitter1.addObservedPoint((double) 'a', (double) (byte) 100, (double) '4');
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint11 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint11);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray13 = harmonicFitter1.fit();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: sample contains 3 observed points, at least 4 are required");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (-1L), (double) (byte) 0, (double) 'a');
        harmonicFitter1.addObservedPoint((double) 100, (double) (short) 100, (double) (byte) 100);
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray13 = harmonicFitter1.fit();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: sample contains 0 observed points, at least 4 are required");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        harmonicFitter1.addObservedPoint(10.0d, (double) 10.0f, (double) '4');
        harmonicFitter1.addObservedPoint((-1.0d), 0.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray13 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray14 = harmonicFitter1.getObservations();
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint16 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint16);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint18 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint18);
        org.junit.Assert.assertNotNull(weightedObservedPointArray13);
        org.junit.Assert.assertNotNull(weightedObservedPointArray14);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) 100, (double) 0, (double) 1);
        harmonicFitter1.addObservedPoint((double) 0.0f, 0.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray11 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint12 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint12);
        harmonicFitter1.addObservedPoint((double) 1.0f, (double) (short) 100, (double) (-1));
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray18 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray19 = harmonicFitter1.getObservations();
        double[] doubleArray20 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray21 = harmonicFitter1.fit(doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray11);
        org.junit.Assert.assertNotNull(weightedObservedPointArray18);
        org.junit.Assert.assertNotNull(weightedObservedPointArray19);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint2 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint2);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray4 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) 0.0f, (double) '4');
        harmonicFitter1.addObservedPoint((double) (byte) 1, (double) (byte) -1, 0.0d);
        harmonicFitter1.clearObservations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray13 = harmonicFitter1.fit();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: sample contains 0 observed points, at least 4 are required");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray4);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray4, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] { null });
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint3);
        harmonicFitter1.addObservedPoint((double) (byte) 10, (double) 100, (double) '4');
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint11 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint11);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint13 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint13);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray15 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray16 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray17 = harmonicFitter1.getObservations();
        java.lang.Class<?> wildcardClass18 = harmonicFitter1.getClass();
        org.junit.Assert.assertNotNull(weightedObservedPointArray15);
        org.junit.Assert.assertNotNull(weightedObservedPointArray16);
        org.junit.Assert.assertNotNull(weightedObservedPointArray17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint3);
        harmonicFitter1.addObservedPoint((double) (byte) 10, (double) 100, (double) '4');
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint11 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint11);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint13 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint13);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint15 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint15);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray18 = harmonicFitter1.getObservations();
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) '4', (double) 100.0f);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint24 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint24);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray26 = harmonicFitter1.fit();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: sample contains 1 observed points, at least 4 are required");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray18);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray18, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray6 = harmonicFitter1.getObservations();
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (byte) -1, 100.0d, (-1.0d));
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray12 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) 1.0f, (double) 0.0f, (double) 'a');
        org.junit.Assert.assertNotNull(weightedObservedPointArray6);
        org.junit.Assert.assertNotNull(weightedObservedPointArray12);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        harmonicFitter1.addObservedPoint(10.0d, (double) 10.0f, (double) '4');
        harmonicFitter1.addObservedPoint((-1.0d), 0.0d);
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer16 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter17 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer16);
        harmonicFitter17.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        harmonicFitter17.addObservedPoint((double) (byte) 100, (double) 100.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray25 = harmonicFitter17.getObservations();
        harmonicFitter17.addObservedPoint((double) (byte) 10, (double) (byte) 10);
        harmonicFitter17.addObservedPoint((double) '4', (double) 100, (double) 100.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray33 = harmonicFitter17.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser34 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray33);
        double[] doubleArray35 = parameterGuesser34.guess();
        double[] doubleArray36 = parameterGuesser34.guess();
        double[] doubleArray37 = parameterGuesser34.guess();
        double[] doubleArray38 = parameterGuesser34.guess();
        double[] doubleArray39 = parameterGuesser34.guess();
        double[] doubleArray40 = parameterGuesser34.guess();
        double[] doubleArray41 = parameterGuesser34.guess();
        double[] doubleArray42 = parameterGuesser34.guess();
        double[] doubleArray43 = parameterGuesser34.guess();
        double[] doubleArray44 = parameterGuesser34.guess();
        double[] doubleArray45 = parameterGuesser34.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray46 = harmonicFitter1.fit(doubleArray45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray25);
        org.junit.Assert.assertNotNull(weightedObservedPointArray33);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertArrayEquals(doubleArray36, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertArrayEquals(doubleArray40, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertArrayEquals(doubleArray41, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertArrayEquals(doubleArray42, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertArrayEquals(doubleArray44, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertArrayEquals(doubleArray45, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint2 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint2);
        harmonicFitter1.addObservedPoint((double) (short) 1, (double) (byte) -1, 100.0d);
        harmonicFitter1.addObservedPoint((double) 10, (double) 100.0f, (double) (short) 1);
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray14 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) (short) 0, 0.0d, 1.0d);
        harmonicFitter1.addObservedPoint((double) (byte) 10, (double) 1, (double) (byte) 100);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (short) 0, (double) 0L, (double) (byte) -1);
        harmonicFitter1.addObservedPoint((double) 100, 0.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint31 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint31);
        java.lang.Class<?> wildcardClass33 = harmonicFitter1.getClass();
        org.junit.Assert.assertNotNull(weightedObservedPointArray14);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray14, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint3);
        harmonicFitter1.addObservedPoint((double) 10L, (double) (short) -1);
        harmonicFitter1.addObservedPoint((double) 0L, (double) (short) 10, (double) (byte) 1);
        harmonicFitter1.addObservedPoint((double) 1.0f, (double) 0L, 1.0d);
        harmonicFitter1.addObservedPoint((double) 'a', 10.0d, (double) (byte) 100);
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric20 = null;
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer21 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter22 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer21);
        harmonicFitter22.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        harmonicFitter22.addObservedPoint((double) (byte) 100, (double) 100.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray30 = harmonicFitter22.getObservations();
        harmonicFitter22.addObservedPoint((double) (byte) 10, (double) (byte) 10);
        harmonicFitter22.addObservedPoint((double) '4', (double) 100, (double) 100.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray38 = harmonicFitter22.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser39 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray38);
        double[] doubleArray40 = parameterGuesser39.guess();
        double[] doubleArray41 = parameterGuesser39.guess();
        double[] doubleArray42 = parameterGuesser39.guess();
        double[] doubleArray43 = parameterGuesser39.guess();
        double[] doubleArray44 = parameterGuesser39.guess();
        double[] doubleArray45 = parameterGuesser39.guess();
        double[] doubleArray46 = parameterGuesser39.guess();
        double[] doubleArray47 = parameterGuesser39.guess();
        double[] doubleArray48 = parameterGuesser39.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray49 = harmonicFitter1.fit(parametric20, doubleArray48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray30);
        org.junit.Assert.assertNotNull(weightedObservedPointArray38);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertArrayEquals(doubleArray40, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertArrayEquals(doubleArray41, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertArrayEquals(doubleArray42, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertArrayEquals(doubleArray44, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertArrayEquals(doubleArray45, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertArrayEquals(doubleArray46, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertArrayEquals(doubleArray47, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertArrayEquals(doubleArray48, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint3);
        harmonicFitter1.addObservedPoint((double) 10L, (double) (short) -1);
        harmonicFitter1.addObservedPoint((double) 0L, (double) (short) 10, (double) (byte) 1);
        harmonicFitter1.addObservedPoint((double) 1.0f, (double) 0L, 1.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint16 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint16);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray18 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser19 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray18);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray20 = parameterGuesser19.guess();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray18);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) ' ', 1.0d, (double) (byte) 100);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint8 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint8);
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray12 = harmonicFitter1.getObservations();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser13 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray12);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: sample contains 0 observed points, at least 4 are required");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray12);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray12, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint4 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint4);
        harmonicFitter1.addObservedPoint((double) 'a', (double) (byte) 0);
        harmonicFitter1.addObservedPoint((double) 100.0f, (double) 0, (double) 10);
        harmonicFitter1.clearObservations();
        java.lang.Class<?> wildcardClass14 = harmonicFitter1.getClass();
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint3);
        harmonicFitter1.addObservedPoint((double) (byte) 10, (double) 100, (double) '4');
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint11 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint11);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint13 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint13);
        harmonicFitter1.addObservedPoint((double) 0L, (double) 10.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint18 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint18);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray20 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) 1, (double) 10, (double) 100.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray25 = harmonicFitter1.getObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray20);
        org.junit.Assert.assertNotNull(weightedObservedPointArray25);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) (-1), (double) (short) 100, (double) (byte) 10);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = harmonicFitter1.getObservations();
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray9, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint4 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint4);
        harmonicFitter1.addObservedPoint(10.0d, (double) (short) 1, (double) 1.0f);
        harmonicFitter1.addObservedPoint((double) 100.0f, 1.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray13 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint14 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint14);
        harmonicFitter1.addObservedPoint((double) (short) 1, (double) 100.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint19 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint19);
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray13);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        harmonicFitter1.addObservedPoint(10.0d, (double) 10.0f, (double) '4');
        harmonicFitter1.addObservedPoint((-1.0d), 0.0d);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray14 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) '#', (double) (byte) -1);
        harmonicFitter1.addObservedPoint(0.0d, (double) (short) 10, 0.0d);
        org.junit.Assert.assertNotNull(weightedObservedPointArray14);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray14, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint3);
        harmonicFitter1.addObservedPoint((double) (byte) 10, (double) 100, (double) '4');
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint11 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint11);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray13 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) (short) 10, (double) (byte) 100, (double) 100.0f);
        double[] doubleArray21 = new double[] { (byte) -1, (short) 100, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray22 = harmonicFitter1.fit(doubleArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray13);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { (-1.0d), 100.0d, 97.0d }, 1.0E-15);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray4 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint5 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint5);
        harmonicFitter1.addObservedPoint((double) 1L, (double) (-1.0f));
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint10 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint10);
        harmonicFitter1.addObservedPoint((double) (-1.0f), (double) 10.0f, (double) (short) 100);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint16 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint16);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint19 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint19);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray21 = harmonicFitter1.getObservations();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser22 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray21);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: sample contains 1 observed points, at least 4 are required");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray4);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray4, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray21);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray21, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] { null });
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        harmonicFitter1.addObservedPoint(10.0d, (double) 10.0f, (double) '4');
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint11 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint11);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint(0.0d, (double) 100.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray17 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) (short) 100, (double) 0);
        org.junit.Assert.assertNotNull(weightedObservedPointArray17);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        harmonicFitter1.addObservedPoint(10.0d, (double) 10.0f, (double) '4');
        harmonicFitter1.addObservedPoint((-1.0d), 0.0d);
        harmonicFitter1.addObservedPoint(0.0d, (double) 0.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint16 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint16);
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint20 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint20);
        harmonicFitter1.addObservedPoint((double) (short) 0, (double) (-1L));
        harmonicFitter1.clearObservations();
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray4 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint5 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint5);
        harmonicFitter1.addObservedPoint((double) 1L, (double) (-1.0f));
        harmonicFitter1.addObservedPoint((double) 100.0f, 1.0d);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray13 = harmonicFitter1.fit();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: sample contains 3 observed points, at least 4 are required");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray4);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray4, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (-1), 100.0d);
        harmonicFitter1.addObservedPoint((double) 10L, (double) 1.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        harmonicFitter1.addObservedPoint((double) (-1), (double) '#', (double) (byte) 100);
        harmonicFitter1.addObservedPoint((double) (byte) 10, (double) 10L, (double) (-1));
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray19 = harmonicFitter1.getObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray19);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint3);
        harmonicFitter1.addObservedPoint((double) (byte) 10, (double) 100, (double) '4');
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint(100.0d, (double) '#');
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint3);
        harmonicFitter1.addObservedPoint((double) (byte) 10, (double) 100, (double) '4');
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric11 = null;
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer12 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter13 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer12);
        harmonicFitter13.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        harmonicFitter13.addObservedPoint((double) (byte) 100, (double) 100.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray21 = harmonicFitter13.getObservations();
        harmonicFitter13.addObservedPoint((double) (byte) 10, (double) (byte) 10);
        harmonicFitter13.addObservedPoint((double) '4', (double) 100, (double) 100.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray29 = harmonicFitter13.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser30 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray29);
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser31 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray29);
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser32 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray29);
        double[] doubleArray33 = parameterGuesser32.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray34 = harmonicFitter1.fit(0, parametric11, doubleArray33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray21);
        org.junit.Assert.assertNotNull(weightedObservedPointArray29);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertArrayEquals(doubleArray33, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint2 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint2);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) '4', (double) (byte) -1);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint8 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint8);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) 10.0f, (double) ' ', (double) 0L);
        harmonicFitter1.addObservedPoint((double) 100, 10.0d, (double) 10);
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric20 = null;
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer21 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter22 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer21);
        harmonicFitter22.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        harmonicFitter22.addObservedPoint((double) (byte) 100, (double) 100.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray30 = harmonicFitter22.getObservations();
        harmonicFitter22.addObservedPoint((double) (byte) 10, (double) (byte) 10);
        harmonicFitter22.addObservedPoint((double) '4', (double) 100, (double) 100.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray38 = harmonicFitter22.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser39 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray38);
        double[] doubleArray40 = parameterGuesser39.guess();
        double[] doubleArray41 = parameterGuesser39.guess();
        double[] doubleArray42 = parameterGuesser39.guess();
        double[] doubleArray43 = parameterGuesser39.guess();
        double[] doubleArray44 = parameterGuesser39.guess();
        double[] doubleArray45 = parameterGuesser39.guess();
        double[] doubleArray46 = parameterGuesser39.guess();
        double[] doubleArray47 = parameterGuesser39.guess();
        double[] doubleArray48 = parameterGuesser39.guess();
        double[] doubleArray49 = parameterGuesser39.guess();
        double[] doubleArray50 = parameterGuesser39.guess();
        double[] doubleArray51 = parameterGuesser39.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray52 = harmonicFitter1.fit((int) (byte) 0, parametric20, doubleArray51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray30);
        org.junit.Assert.assertNotNull(weightedObservedPointArray38);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertArrayEquals(doubleArray40, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertArrayEquals(doubleArray41, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertArrayEquals(doubleArray42, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertArrayEquals(doubleArray44, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertArrayEquals(doubleArray45, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertArrayEquals(doubleArray46, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertArrayEquals(doubleArray47, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertArrayEquals(doubleArray48, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertArrayEquals(doubleArray49, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertArrayEquals(doubleArray50, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertArrayEquals(doubleArray51, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        harmonicFitter1.addObservedPoint(10.0d, (double) 10.0f, (double) '4');
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint11 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint11);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (short) -1, (double) (short) 0, (double) 10L);
        harmonicFitter1.addObservedPoint(1.0d, 100.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint21 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint21);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray23 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray24 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) (-1L), (double) (-1L), (double) (short) -1);
        java.lang.Class<?> wildcardClass29 = harmonicFitter1.getClass();
        org.junit.Assert.assertNotNull(weightedObservedPointArray23);
        org.junit.Assert.assertNotNull(weightedObservedPointArray24);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        harmonicFitter1.addObservedPoint((double) (short) 100, (double) (short) 100);
        harmonicFitter1.addObservedPoint((double) 'a', 0.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray12 = harmonicFitter1.getObservations();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser13 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray12);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: sample contains 3 observed points, at least 4 are required");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray12);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray4 = harmonicFitter1.getObservations();
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((-1.0d), 0.0d);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray10 = harmonicFitter1.getObservations();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser11 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: sample contains 0 observed points, at least 4 are required");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray4);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray4, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray10);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray10, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint3);
        harmonicFitter1.addObservedPoint((double) (byte) 10, (double) 100, (double) '4');
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) 10L, 1.0d, (double) '#');
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint14 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint14);
        harmonicFitter1.addObservedPoint((double) (short) 100, (double) 10L);
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric20 = null;
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer21 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter22 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer21);
        harmonicFitter22.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        harmonicFitter22.addObservedPoint((double) (byte) 100, (double) 100.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray30 = harmonicFitter22.getObservations();
        harmonicFitter22.addObservedPoint((double) (byte) 10, (double) (byte) 10);
        harmonicFitter22.addObservedPoint((double) '4', (double) 100, (double) 100.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray38 = harmonicFitter22.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser39 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray38);
        double[] doubleArray40 = parameterGuesser39.guess();
        double[] doubleArray41 = parameterGuesser39.guess();
        double[] doubleArray42 = parameterGuesser39.guess();
        double[] doubleArray43 = parameterGuesser39.guess();
        double[] doubleArray44 = parameterGuesser39.guess();
        double[] doubleArray45 = parameterGuesser39.guess();
        double[] doubleArray46 = parameterGuesser39.guess();
        double[] doubleArray47 = parameterGuesser39.guess();
        double[] doubleArray48 = parameterGuesser39.guess();
        double[] doubleArray49 = parameterGuesser39.guess();
        double[] doubleArray50 = parameterGuesser39.guess();
        double[] doubleArray51 = parameterGuesser39.guess();
        double[] doubleArray52 = parameterGuesser39.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray53 = harmonicFitter1.fit(100, parametric20, doubleArray52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertNotNull(weightedObservedPointArray30);
        org.junit.Assert.assertNotNull(weightedObservedPointArray38);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertArrayEquals(doubleArray40, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertArrayEquals(doubleArray41, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertArrayEquals(doubleArray42, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertArrayEquals(doubleArray44, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertArrayEquals(doubleArray45, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertArrayEquals(doubleArray46, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertArrayEquals(doubleArray47, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertArrayEquals(doubleArray48, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertArrayEquals(doubleArray49, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertArrayEquals(doubleArray50, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertArrayEquals(doubleArray51, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertArrayEquals(doubleArray52, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) (-1), (double) (short) 100, (double) (byte) 10);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) 100, (double) 10L, (-1.0d));
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint13 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint13);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint15 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint15);
        harmonicFitter1.addObservedPoint((double) (byte) 1, (double) ' ');
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint20 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint20);
        harmonicFitter1.addObservedPoint((double) 10, (double) 0L, 0.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint26 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint26);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray28 = harmonicFitter1.getObservations();
        java.lang.Class<?> wildcardClass29 = harmonicFitter1.getClass();
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint3);
        harmonicFitter1.addObservedPoint((double) (byte) 10, (double) 100, (double) '4');
        harmonicFitter1.addObservedPoint((double) '#', 0.0d, (double) 100L);
        harmonicFitter1.addObservedPoint(0.0d, 0.0d);
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric16 = null;
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer17 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter18 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer17);
        harmonicFitter18.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        harmonicFitter18.addObservedPoint((double) (byte) 100, (double) 100.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray26 = harmonicFitter18.getObservations();
        harmonicFitter18.addObservedPoint((double) (byte) 10, (double) (byte) 10);
        harmonicFitter18.addObservedPoint((double) '4', (double) 100, (double) 100.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray34 = harmonicFitter18.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser35 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray34);
        double[] doubleArray36 = parameterGuesser35.guess();
        double[] doubleArray37 = parameterGuesser35.guess();
        double[] doubleArray38 = parameterGuesser35.guess();
        double[] doubleArray39 = parameterGuesser35.guess();
        double[] doubleArray40 = parameterGuesser35.guess();
        double[] doubleArray41 = parameterGuesser35.guess();
        double[] doubleArray42 = parameterGuesser35.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray43 = harmonicFitter1.fit(parametric16, doubleArray42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray26);
        org.junit.Assert.assertNotNull(weightedObservedPointArray34);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertArrayEquals(doubleArray36, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertArrayEquals(doubleArray40, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertArrayEquals(doubleArray41, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertArrayEquals(doubleArray42, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray4 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint5 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint5);
        harmonicFitter1.addObservedPoint((double) 1L, (double) (-1.0f));
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint10 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint10);
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray14 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint(100.0d, (double) 100.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray18 = harmonicFitter1.getObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray4);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray4, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray14);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray14, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray18);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint3);
        harmonicFitter1.addObservedPoint((double) (byte) 10, (double) 100, (double) '4');
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint11 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint11);
        harmonicFitter1.addObservedPoint((double) (-1L), (double) 'a');
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray17 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint18 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint18);
        harmonicFitter1.addObservedPoint((double) 0.0f, (double) (short) 100, (double) (byte) -1);
        harmonicFitter1.addObservedPoint((double) (-1L), (double) 0, (double) ' ');
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray28 = harmonicFitter1.getObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray17);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray17, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray28);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint5 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint5);
        harmonicFitter1.addObservedPoint((double) (-1L), (double) (byte) 100);
        harmonicFitter1.addObservedPoint((double) (short) -1, (-1.0d), (double) (byte) 1);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray14 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) ' ', 0.0d);
        org.junit.Assert.assertNotNull(weightedObservedPointArray14);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) ' ', 1.0d, (double) (byte) 100);
        harmonicFitter1.addObservedPoint((double) 10, (double) (-1.0f), (double) ' ');
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint13 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint13);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 100.0f);
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric18 = null;
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer19 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter20 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer19);
        harmonicFitter20.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        harmonicFitter20.addObservedPoint((double) (byte) 100, (double) 100.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray28 = harmonicFitter20.getObservations();
        harmonicFitter20.addObservedPoint((double) (byte) 10, (double) (byte) 10);
        harmonicFitter20.addObservedPoint((double) '4', (double) 100, (double) 100.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray36 = harmonicFitter20.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser37 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray36);
        double[] doubleArray38 = parameterGuesser37.guess();
        double[] doubleArray39 = parameterGuesser37.guess();
        double[] doubleArray40 = parameterGuesser37.guess();
        double[] doubleArray41 = parameterGuesser37.guess();
        double[] doubleArray42 = parameterGuesser37.guess();
        double[] doubleArray43 = parameterGuesser37.guess();
        double[] doubleArray44 = parameterGuesser37.guess();
        double[] doubleArray45 = parameterGuesser37.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray46 = harmonicFitter1.fit(parametric18, doubleArray45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray28);
        org.junit.Assert.assertNotNull(weightedObservedPointArray36);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertArrayEquals(doubleArray40, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertArrayEquals(doubleArray41, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertArrayEquals(doubleArray42, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertArrayEquals(doubleArray44, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertArrayEquals(doubleArray45, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint2 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint2);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray4 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) 0.0f, (double) '4');
        harmonicFitter1.addObservedPoint((double) (byte) -1, (double) 1, (double) '#');
        harmonicFitter1.addObservedPoint((double) ' ', (double) 1L, (-1.0d));
        org.junit.Assert.assertNotNull(weightedObservedPointArray4);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray4, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] { null });
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        harmonicFitter1.addObservedPoint(10.0d, (double) 10.0f, (double) '4');
        harmonicFitter1.addObservedPoint((-1.0d), 0.0d);
        harmonicFitter1.addObservedPoint((double) ' ', (double) (short) 10);
        harmonicFitter1.addObservedPoint((double) 'a', (double) 100L);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint19 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint19);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray21 = harmonicFitter1.getObservations();
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric23 = null;
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer24 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter25 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer24);
        harmonicFitter25.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        harmonicFitter25.addObservedPoint((double) (byte) 100, (double) 100.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray33 = harmonicFitter25.getObservations();
        harmonicFitter25.addObservedPoint((double) (byte) 10, (double) (byte) 10);
        harmonicFitter25.addObservedPoint((double) '4', (double) 100, (double) 100.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray41 = harmonicFitter25.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser42 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray41);
        double[] doubleArray43 = parameterGuesser42.guess();
        double[] doubleArray44 = parameterGuesser42.guess();
        double[] doubleArray45 = parameterGuesser42.guess();
        double[] doubleArray46 = parameterGuesser42.guess();
        double[] doubleArray47 = parameterGuesser42.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray48 = harmonicFitter1.fit(0, parametric23, doubleArray47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray21);
        org.junit.Assert.assertNotNull(weightedObservedPointArray33);
        org.junit.Assert.assertNotNull(weightedObservedPointArray41);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertArrayEquals(doubleArray44, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertArrayEquals(doubleArray45, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertArrayEquals(doubleArray46, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertArrayEquals(doubleArray47, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        harmonicFitter1.addObservedPoint(10.0d, (double) 10.0f, (double) '4');
        harmonicFitter1.addObservedPoint((-1.0d), 0.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint13 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint13);
        harmonicFitter1.addObservedPoint((double) 10.0f, (double) (short) -1);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray2 = harmonicFitter1.getObservations();
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (-1L), (double) ' ');
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray8 = harmonicFitter1.getObservations();
        harmonicFitter1.clearObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray2);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray2, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray8);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint2 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint2);
        harmonicFitter1.addObservedPoint((double) (short) 1, (double) (byte) -1, 100.0d);
        harmonicFitter1.addObservedPoint((double) 10, (double) 100.0f, (double) (short) 1);
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint14 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint14);
        harmonicFitter1.addObservedPoint((double) (byte) 10, (double) 10L, 10.0d);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray21 = harmonicFitter1.getObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray21);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray21, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        harmonicFitter1.addObservedPoint(10.0d, (double) 10.0f, (double) '4');
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint11 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint11);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray14 = harmonicFitter1.getObservations();
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint16 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint16);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray18 = harmonicFitter1.fit();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: sample contains 1 observed points, at least 4 are required");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray14);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray14, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) (short) 10, (double) 1L);
        harmonicFitter1.addObservedPoint((double) 1L, (double) (short) 10);
        harmonicFitter1.addObservedPoint((-1.0d), (double) (short) 10);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray14 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint15 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint15);
        harmonicFitter1.addObservedPoint((double) (short) 0, (double) 100);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray20 = harmonicFitter1.getObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray14);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray14, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray20);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        harmonicFitter1.addObservedPoint(10.0d, (double) 10.0f, (double) '4');
        harmonicFitter1.addObservedPoint((-1.0d), 0.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray13 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray14 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray15 = harmonicFitter1.getObservations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray16 = harmonicFitter1.fit();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: sample contains 3 observed points, at least 4 are required");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray13);
        org.junit.Assert.assertNotNull(weightedObservedPointArray14);
        org.junit.Assert.assertNotNull(weightedObservedPointArray15);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) (-1), (double) (short) 100, (double) (byte) 10);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) (byte) 100, (double) (byte) 0, (double) 1.0f);
        java.lang.Class<?> wildcardClass14 = harmonicFitter1.getClass();
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray9, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) (short) 10, (double) 1L);
        harmonicFitter1.addObservedPoint((double) 'a', (double) (byte) 100, (double) '4');
        harmonicFitter1.addObservedPoint(100.0d, (double) '#', 0.0d);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (short) 0, (double) (short) 1);
        harmonicFitter1.addObservedPoint(0.0d, (double) 1L);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint22 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint22);
        harmonicFitter1.addObservedPoint((double) (-1.0f), (double) (short) 10, (double) (-1));
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint28 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint28);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint30 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint30);
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint2 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint2);
        harmonicFitter1.addObservedPoint((double) (short) 1, (double) (byte) -1, 100.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint8 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint8);
        harmonicFitter1.addObservedPoint((-1.0d), 0.0d);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray14 = harmonicFitter1.getObservations();
        harmonicFitter1.clearObservations();
        java.lang.Class<?> wildcardClass16 = harmonicFitter1.getClass();
        org.junit.Assert.assertNotNull(weightedObservedPointArray14);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray14, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint2 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint2);
        harmonicFitter1.addObservedPoint((double) (short) 1, (double) (byte) -1, 100.0d);
        harmonicFitter1.addObservedPoint((double) 10, (double) 100.0f, (double) (short) 1);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint13 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint13);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray15 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint16 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint16);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray18 = harmonicFitter1.getObservations();
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray20 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray21 = harmonicFitter1.getObservations();
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric23 = null;
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer24 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter25 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer24);
        harmonicFitter25.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        harmonicFitter25.addObservedPoint((double) (byte) 100, (double) 100.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray33 = harmonicFitter25.getObservations();
        harmonicFitter25.addObservedPoint((double) (byte) 10, (double) (byte) 10);
        harmonicFitter25.addObservedPoint((double) '4', (double) 100, (double) 100.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray41 = harmonicFitter25.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser42 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray41);
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser43 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray41);
        double[] doubleArray44 = parameterGuesser43.guess();
        double[] doubleArray45 = parameterGuesser43.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray46 = harmonicFitter1.fit(10, parametric23, doubleArray45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray15);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray15, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] { null });
        org.junit.Assert.assertNotNull(weightedObservedPointArray18);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray18, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] { null, null });
        org.junit.Assert.assertNotNull(weightedObservedPointArray20);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray20, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray21);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray21, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray33);
        org.junit.Assert.assertNotNull(weightedObservedPointArray41);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertArrayEquals(doubleArray44, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertArrayEquals(doubleArray45, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) (short) 10, (double) 1L);
        harmonicFitter1.addObservedPoint((double) 1L, (double) (short) 10);
        harmonicFitter1.addObservedPoint((-1.0d), (double) (short) 10);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray14 = harmonicFitter1.getObservations();
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) 0, (double) (short) -1);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint20 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint20);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint22 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint22);
        harmonicFitter1.addObservedPoint((double) (byte) 100, (double) 1L);
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray14);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray14, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray4 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint5 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint5);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) 'a', (double) 0.0f);
        harmonicFitter1.addObservedPoint((double) (short) -1, (double) (-1.0f));
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric14 = null;
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer15 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter16 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer15);
        harmonicFitter16.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        harmonicFitter16.addObservedPoint((double) (byte) 100, (double) 100.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray24 = harmonicFitter16.getObservations();
        harmonicFitter16.addObservedPoint((double) (byte) 10, (double) (byte) 10);
        harmonicFitter16.addObservedPoint((double) '4', (double) 100, (double) 100.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray32 = harmonicFitter16.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser33 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray32);
        double[] doubleArray34 = parameterGuesser33.guess();
        double[] doubleArray35 = parameterGuesser33.guess();
        double[] doubleArray36 = parameterGuesser33.guess();
        double[] doubleArray37 = parameterGuesser33.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray38 = harmonicFitter1.fit(parametric14, doubleArray37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray4);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray4, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray24);
        org.junit.Assert.assertNotNull(weightedObservedPointArray32);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertArrayEquals(doubleArray36, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) 100, (double) 0, (double) 1);
        harmonicFitter1.addObservedPoint((double) 0.0f, 0.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray11 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint12 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint12);
        harmonicFitter1.addObservedPoint((double) 1.0f, (double) (short) 100, (double) (-1));
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray18 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser19 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray18);
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser20 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray18);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray21 = parameterGuesser20.guess();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray11);
        org.junit.Assert.assertNotNull(weightedObservedPointArray18);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint2 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint2);
        harmonicFitter1.addObservedPoint((double) (short) 1, (double) (byte) -1, 100.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint8 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint8);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint(0.0d, (double) 1.0f);
        harmonicFitter1.addObservedPoint((double) '#', (double) 100.0f);
        harmonicFitter1.addObservedPoint((double) (short) 0, (double) ' ', (double) 100L);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray4 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint5 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint5);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray7 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray8 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) 100L, (double) 0.0f, (double) 100);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric15 = null;
        double[] doubleArray21 = new double[] { 0.0d, (byte) 10, (-1.0d), (short) 1, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray22 = harmonicFitter1.fit((int) (byte) -1, parametric15, doubleArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray4);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray4, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray7);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray7, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] { null });
        org.junit.Assert.assertNotNull(weightedObservedPointArray8);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray8, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] { null });
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 0.0d, 10.0d, (-1.0d), 1.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint2 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint2);
        harmonicFitter1.addObservedPoint((double) (short) 1, (double) (byte) -1, 100.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint8 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint8);
        harmonicFitter1.addObservedPoint((-1.0d), 0.0d);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray14 = harmonicFitter1.getObservations();
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer16 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter17 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer16);
        harmonicFitter17.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        harmonicFitter17.addObservedPoint((double) (byte) 100, (double) 100.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray25 = harmonicFitter17.getObservations();
        harmonicFitter17.addObservedPoint((double) (byte) 10, (double) (byte) 10);
        harmonicFitter17.addObservedPoint((double) '4', (double) 100, (double) 100.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray33 = harmonicFitter17.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser34 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray33);
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser35 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray33);
        double[] doubleArray36 = parameterGuesser35.guess();
        double[] doubleArray37 = parameterGuesser35.guess();
        double[] doubleArray38 = parameterGuesser35.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray39 = harmonicFitter1.fit(doubleArray38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray14);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray14, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray25);
        org.junit.Assert.assertNotNull(weightedObservedPointArray33);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertArrayEquals(doubleArray36, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        harmonicFitter1.addObservedPoint((double) (byte) 100, (double) 100.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) (byte) 10, (double) (byte) 10);
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric13 = null;
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer14 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter15 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer14);
        harmonicFitter15.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        harmonicFitter15.addObservedPoint((double) (byte) 100, (double) 100.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray23 = harmonicFitter15.getObservations();
        harmonicFitter15.addObservedPoint((double) (byte) 10, (double) (byte) 10);
        harmonicFitter15.addObservedPoint((double) '4', (double) 100, (double) 100.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray31 = harmonicFitter15.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser32 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray31);
        double[] doubleArray33 = parameterGuesser32.guess();
        double[] doubleArray34 = parameterGuesser32.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray35 = harmonicFitter1.fit(parametric13, doubleArray34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertNotNull(weightedObservedPointArray23);
        org.junit.Assert.assertNotNull(weightedObservedPointArray31);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertArrayEquals(doubleArray33, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint3);
        harmonicFitter1.addObservedPoint((double) (byte) 10, (double) 100, (double) '4');
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint11 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint11);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray13 = harmonicFitter1.getObservations();
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray15 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) 100, (double) 10);
        harmonicFitter1.addObservedPoint((double) 'a', (double) (short) -1);
        org.junit.Assert.assertNotNull(weightedObservedPointArray13);
        org.junit.Assert.assertNotNull(weightedObservedPointArray15);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray15, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint2 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint2);
        harmonicFitter1.addObservedPoint((double) (short) 1, (double) (byte) -1, 100.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint8 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint8);
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) 10.0f, (double) 1);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) ' ', 1.0d, (double) (byte) 100);
        harmonicFitter1.addObservedPoint((double) 10, (double) (-1.0f), (double) ' ');
        harmonicFitter1.addObservedPoint((double) '#', (double) 1);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray16 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint17 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint17);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray19 = harmonicFitter1.fit();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: sample contains 1 observed points, at least 4 are required");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray16);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray16, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) (short) 10, (double) 1L);
        harmonicFitter1.addObservedPoint((double) 1L, (double) (short) 10);
        harmonicFitter1.addObservedPoint((-1.0d), (double) (short) 10);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray14 = harmonicFitter1.getObservations();
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) 0, (double) (short) -1);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint19 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint19);
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray14);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray14, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint3);
        harmonicFitter1.addObservedPoint((double) (byte) 10, (double) 100, (double) '4');
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray10 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint11 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint11);
        harmonicFitter1.addObservedPoint((double) 'a', (double) 10L);
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertNotNull(weightedObservedPointArray10);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray4 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint5 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint5);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray7 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray8 = harmonicFitter1.getObservations();
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric9 = null;
        double[] doubleArray14 = new double[] { (-1L), 100.0d, 0.0f, 0 };
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray15 = harmonicFitter1.fit(parametric9, doubleArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray4);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray4, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray7);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray7, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] { null });
        org.junit.Assert.assertNotNull(weightedObservedPointArray8);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray8, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] { null });
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { (-1.0d), 100.0d, 0.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint2 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint2);
        harmonicFitter1.addObservedPoint((double) (short) 1, (double) (byte) -1, 100.0d);
        harmonicFitter1.addObservedPoint((double) 10, (double) 100.0f, (double) (short) 1);
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint14 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint14);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray16 = harmonicFitter1.fit();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: sample contains 1 observed points, at least 4 are required");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) (short) 10, (double) 1L);
        harmonicFitter1.addObservedPoint((double) 1L, (double) (short) 10);
        harmonicFitter1.addObservedPoint((-1.0d), (double) (short) 10);
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (-1L), (double) (byte) 0, (double) 'a');
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray7 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) (byte) 1, 0.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint11 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint11);
        org.junit.Assert.assertNotNull(weightedObservedPointArray7);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) (-1), (double) (short) 100, (double) (byte) 10);
        harmonicFitter1.addObservedPoint((-1.0d), (double) (byte) 0, (double) 10.0f);
        harmonicFitter1.addObservedPoint((double) 100L, (double) (short) 1, (double) (byte) -1);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint16 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint16);
        harmonicFitter1.addObservedPoint(0.0d, (double) 1);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray21 = harmonicFitter1.getObservations();
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer23 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter24 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer23);
        harmonicFitter24.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        harmonicFitter24.addObservedPoint((double) (byte) 100, (double) 100.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray32 = harmonicFitter24.getObservations();
        harmonicFitter24.addObservedPoint((double) (byte) 10, (double) (byte) 10);
        harmonicFitter24.addObservedPoint((double) '4', (double) 100, (double) 100.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray40 = harmonicFitter24.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser41 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray40);
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser42 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray40);
        double[] doubleArray43 = parameterGuesser42.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray44 = harmonicFitter1.fit(doubleArray43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray21);
        org.junit.Assert.assertNotNull(weightedObservedPointArray32);
        org.junit.Assert.assertNotNull(weightedObservedPointArray40);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray4 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint5 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint5);
        harmonicFitter1.addObservedPoint((double) 1L, (double) (-1.0f));
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint10 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint10);
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) 1, (double) 1L, (double) 0L);
        org.junit.Assert.assertNotNull(weightedObservedPointArray4);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray4, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint3);
        harmonicFitter1.addObservedPoint((double) 10L, (double) (short) -1);
        harmonicFitter1.addObservedPoint((double) 0L, (double) (short) 10, (double) (byte) 1);
        harmonicFitter1.addObservedPoint((double) (byte) 100, (double) (short) 1, 0.0d);
        harmonicFitter1.addObservedPoint((double) 100, (double) 0L, (double) (short) 100);
        harmonicFitter1.addObservedPoint((double) 100L, (double) 0.0f, (double) 0);
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer24 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter25 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer24);
        harmonicFitter25.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        harmonicFitter25.addObservedPoint((double) (byte) 100, (double) 100.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray33 = harmonicFitter25.getObservations();
        harmonicFitter25.addObservedPoint((double) (byte) 10, (double) (byte) 10);
        harmonicFitter25.addObservedPoint((double) '4', (double) 100, (double) 100.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray41 = harmonicFitter25.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser42 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray41);
        double[] doubleArray43 = parameterGuesser42.guess();
        double[] doubleArray44 = parameterGuesser42.guess();
        double[] doubleArray45 = parameterGuesser42.guess();
        double[] doubleArray46 = parameterGuesser42.guess();
        double[] doubleArray47 = parameterGuesser42.guess();
        double[] doubleArray48 = parameterGuesser42.guess();
        double[] doubleArray49 = parameterGuesser42.guess();
        double[] doubleArray50 = parameterGuesser42.guess();
        double[] doubleArray51 = parameterGuesser42.guess();
        double[] doubleArray52 = parameterGuesser42.guess();
        double[] doubleArray53 = parameterGuesser42.guess();
        double[] doubleArray54 = parameterGuesser42.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray55 = harmonicFitter1.fit(doubleArray54);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray33);
        org.junit.Assert.assertNotNull(weightedObservedPointArray41);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertArrayEquals(doubleArray44, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertArrayEquals(doubleArray45, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertArrayEquals(doubleArray46, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertArrayEquals(doubleArray47, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertArrayEquals(doubleArray48, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertArrayEquals(doubleArray49, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertArrayEquals(doubleArray50, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertArrayEquals(doubleArray51, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertArrayEquals(doubleArray52, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertArrayEquals(doubleArray53, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertArrayEquals(doubleArray54, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        harmonicFitter1.addObservedPoint(10.0d, (double) 10.0f, (double) '4');
        harmonicFitter1.addObservedPoint((-1.0d), 0.0d);
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) 1.0f, 10.0d, (double) '#');
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint20 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint20);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint3);
        harmonicFitter1.addObservedPoint((double) (byte) 10, (double) 100, (double) '4');
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        harmonicFitter1.addObservedPoint((-1.0d), (double) 100, (double) (byte) 1);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (short) 10, (double) 10L);
        harmonicFitter1.addObservedPoint((double) 10L, (double) '4', (double) 1L);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) 100, (double) 0, (double) 1);
        harmonicFitter1.addObservedPoint((double) 0.0f, 0.0d);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) 1.0f, (double) 10.0f, (double) 0L);
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric16 = null;
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer17 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter18 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer17);
        harmonicFitter18.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        harmonicFitter18.addObservedPoint((double) (byte) 100, (double) 100.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray26 = harmonicFitter18.getObservations();
        harmonicFitter18.addObservedPoint((double) (byte) 10, (double) (byte) 10);
        harmonicFitter18.addObservedPoint((double) '4', (double) 100, (double) 100.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray34 = harmonicFitter18.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser35 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray34);
        double[] doubleArray36 = parameterGuesser35.guess();
        double[] doubleArray37 = parameterGuesser35.guess();
        double[] doubleArray38 = parameterGuesser35.guess();
        double[] doubleArray39 = parameterGuesser35.guess();
        double[] doubleArray40 = parameterGuesser35.guess();
        double[] doubleArray41 = parameterGuesser35.guess();
        double[] doubleArray42 = parameterGuesser35.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray43 = harmonicFitter1.fit(parametric16, doubleArray42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray26);
        org.junit.Assert.assertNotNull(weightedObservedPointArray34);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertArrayEquals(doubleArray36, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertArrayEquals(doubleArray40, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertArrayEquals(doubleArray41, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertArrayEquals(doubleArray42, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        harmonicFitter1.addObservedPoint(10.0d, (double) 10.0f, (double) '4');
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint11 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint11);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (short) -1, (double) (short) 0, (double) 10L);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint18 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint18);
        harmonicFitter1.addObservedPoint((double) (byte) 1, (double) (short) 0, (double) 0L);
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric24 = null;
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer25 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter26 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer25);
        harmonicFitter26.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        harmonicFitter26.addObservedPoint((double) (byte) 100, (double) 100.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray34 = harmonicFitter26.getObservations();
        harmonicFitter26.addObservedPoint((double) (byte) 10, (double) (byte) 10);
        harmonicFitter26.addObservedPoint((double) '4', (double) 100, (double) 100.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray42 = harmonicFitter26.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser43 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray42);
        double[] doubleArray44 = parameterGuesser43.guess();
        double[] doubleArray45 = parameterGuesser43.guess();
        double[] doubleArray46 = parameterGuesser43.guess();
        double[] doubleArray47 = parameterGuesser43.guess();
        double[] doubleArray48 = parameterGuesser43.guess();
        double[] doubleArray49 = parameterGuesser43.guess();
        double[] doubleArray50 = parameterGuesser43.guess();
        double[] doubleArray51 = parameterGuesser43.guess();
        double[] doubleArray52 = parameterGuesser43.guess();
        double[] doubleArray53 = parameterGuesser43.guess();
        double[] doubleArray54 = parameterGuesser43.guess();
        double[] doubleArray55 = parameterGuesser43.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray56 = harmonicFitter1.fit(parametric24, doubleArray55);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray34);
        org.junit.Assert.assertNotNull(weightedObservedPointArray42);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertArrayEquals(doubleArray44, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertArrayEquals(doubleArray45, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertArrayEquals(doubleArray46, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertArrayEquals(doubleArray47, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertArrayEquals(doubleArray48, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertArrayEquals(doubleArray49, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertArrayEquals(doubleArray50, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertArrayEquals(doubleArray51, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertArrayEquals(doubleArray52, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertArrayEquals(doubleArray53, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertArrayEquals(doubleArray54, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertArrayEquals(doubleArray55, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint3);
        harmonicFitter1.addObservedPoint((double) (byte) 10, (double) 100, (double) '4');
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint11 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint11);
        harmonicFitter1.addObservedPoint((double) (-1L), (double) 'a');
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) 10, (double) (byte) 1, 0.0d);
        harmonicFitter1.addObservedPoint((double) (short) 1, 0.0d, (double) 10);
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer25 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter26 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer25);
        harmonicFitter26.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        harmonicFitter26.addObservedPoint((double) (byte) 100, (double) 100.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray34 = harmonicFitter26.getObservations();
        harmonicFitter26.addObservedPoint((double) (byte) 10, (double) (byte) 10);
        harmonicFitter26.addObservedPoint((double) '4', (double) 100, (double) 100.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray42 = harmonicFitter26.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser43 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray42);
        double[] doubleArray44 = parameterGuesser43.guess();
        double[] doubleArray45 = parameterGuesser43.guess();
        double[] doubleArray46 = parameterGuesser43.guess();
        double[] doubleArray47 = parameterGuesser43.guess();
        double[] doubleArray48 = parameterGuesser43.guess();
        double[] doubleArray49 = parameterGuesser43.guess();
        double[] doubleArray50 = parameterGuesser43.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray51 = harmonicFitter1.fit(doubleArray50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray34);
        org.junit.Assert.assertNotNull(weightedObservedPointArray42);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertArrayEquals(doubleArray44, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertArrayEquals(doubleArray45, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertArrayEquals(doubleArray46, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertArrayEquals(doubleArray47, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertArrayEquals(doubleArray48, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertArrayEquals(doubleArray49, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertArrayEquals(doubleArray50, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint3);
        harmonicFitter1.addObservedPoint((double) (byte) 10, (double) 100, (double) '4');
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        harmonicFitter1.addObservedPoint((double) (short) 1, (double) (-1), (double) (short) 10);
        harmonicFitter1.addObservedPoint((double) (-1.0f), (double) (byte) 100);
        harmonicFitter1.addObservedPoint((double) 0L, (double) 10.0f, (double) 0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint23 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint23);
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric26 = null;
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer27 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter28 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer27);
        harmonicFitter28.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        harmonicFitter28.addObservedPoint((double) (byte) 100, (double) 100.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray36 = harmonicFitter28.getObservations();
        harmonicFitter28.addObservedPoint((double) (byte) 10, (double) (byte) 10);
        harmonicFitter28.addObservedPoint((double) '4', (double) 100, (double) 100.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray44 = harmonicFitter28.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser45 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray44);
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser46 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray44);
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser47 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray44);
        double[] doubleArray48 = parameterGuesser47.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray49 = harmonicFitter1.fit(10, parametric26, doubleArray48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray36);
        org.junit.Assert.assertNotNull(weightedObservedPointArray44);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertArrayEquals(doubleArray48, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint2 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint2);
        harmonicFitter1.addObservedPoint((double) (short) 1, (double) (byte) -1, 100.0d);
        harmonicFitter1.addObservedPoint((double) 10, (double) 100.0f, (double) (short) 1);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint13 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint13);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray15 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint16 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint16);
        harmonicFitter1.clearObservations();
        java.lang.Class<?> wildcardClass19 = harmonicFitter1.getClass();
        org.junit.Assert.assertNotNull(weightedObservedPointArray15);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray15, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] { null });
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        harmonicFitter1.addObservedPoint((double) (short) 100, (double) (short) 100);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint11 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint11);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint13 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint13);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray15 = harmonicFitter1.getObservations();
        java.lang.Class<?> wildcardClass16 = weightedObservedPointArray15.getClass();
        org.junit.Assert.assertNotNull(weightedObservedPointArray15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) (-1), (double) (short) 100, (double) (byte) 10);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = harmonicFitter1.getObservations();
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray12 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint(1.0d, (double) 10.0f);
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray9, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray12);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray12, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint2 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint2);
        harmonicFitter1.addObservedPoint((double) (short) 1, (double) (byte) -1, 100.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint8 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint8);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint(0.0d, (double) 1.0f);
        harmonicFitter1.addObservedPoint((double) 1.0f, 10.0d, (double) (short) 10);
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric19 = null;
        double[] doubleArray20 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray21 = harmonicFitter1.fit(0, parametric19, doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) (short) 10, (double) 1L);
        harmonicFitter1.addObservedPoint((double) 'a', (double) (byte) 100, (double) '4');
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint11 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint11);
        java.lang.Class<?> wildcardClass13 = harmonicFitter1.getClass();
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (-1), (double) (byte) 100, (double) ' ');
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) 0, 1.0d, (double) (-1.0f));
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray14 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) (short) 100, (double) 0.0f);
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric19 = null;
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer20 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter21 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer20);
        harmonicFitter21.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        harmonicFitter21.addObservedPoint((double) (byte) 100, (double) 100.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray29 = harmonicFitter21.getObservations();
        harmonicFitter21.addObservedPoint((double) (byte) 10, (double) (byte) 10);
        harmonicFitter21.addObservedPoint((double) '4', (double) 100, (double) 100.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray37 = harmonicFitter21.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser38 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray37);
        double[] doubleArray39 = parameterGuesser38.guess();
        double[] doubleArray40 = parameterGuesser38.guess();
        double[] doubleArray41 = parameterGuesser38.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray42 = harmonicFitter1.fit((int) (short) 100, parametric19, doubleArray41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray14);
        org.junit.Assert.assertNotNull(weightedObservedPointArray29);
        org.junit.Assert.assertNotNull(weightedObservedPointArray37);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertArrayEquals(doubleArray40, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertArrayEquals(doubleArray41, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) (-1), (double) (short) 100, (double) (byte) 10);
        harmonicFitter1.addObservedPoint((-1.0d), (double) (byte) 0, (double) 10.0f);
        harmonicFitter1.addObservedPoint((double) 100L, (double) (short) 1, (double) (byte) -1);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint16 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint16);
        harmonicFitter1.addObservedPoint(0.0d, (double) 1);
        harmonicFitter1.clearObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint2 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint2);
        harmonicFitter1.addObservedPoint((double) (short) 1, (double) (byte) -1, 100.0d);
        harmonicFitter1.addObservedPoint((double) 10, (double) 100.0f, (double) (short) 1);
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint14 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint14);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray16 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer17 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter18 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer17);
        harmonicFitter18.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        harmonicFitter18.addObservedPoint((double) (byte) 100, (double) 100.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray26 = harmonicFitter18.getObservations();
        harmonicFitter18.addObservedPoint((double) (byte) 10, (double) (byte) 10);
        harmonicFitter18.addObservedPoint((double) '4', (double) 100, (double) 100.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray34 = harmonicFitter18.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser35 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray34);
        double[] doubleArray36 = parameterGuesser35.guess();
        double[] doubleArray37 = parameterGuesser35.guess();
        double[] doubleArray38 = parameterGuesser35.guess();
        double[] doubleArray39 = parameterGuesser35.guess();
        double[] doubleArray40 = parameterGuesser35.guess();
        double[] doubleArray41 = parameterGuesser35.guess();
        double[] doubleArray42 = parameterGuesser35.guess();
        double[] doubleArray43 = parameterGuesser35.guess();
        double[] doubleArray44 = parameterGuesser35.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray45 = harmonicFitter1.fit(doubleArray44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray16);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray16, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] { null });
        org.junit.Assert.assertNotNull(weightedObservedPointArray26);
        org.junit.Assert.assertNotNull(weightedObservedPointArray34);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertArrayEquals(doubleArray36, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertArrayEquals(doubleArray40, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertArrayEquals(doubleArray41, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertArrayEquals(doubleArray42, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertArrayEquals(doubleArray44, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) (-1), (double) (short) 100, (double) (byte) 10);
        harmonicFitter1.addObservedPoint((-1.0d), (double) (byte) 0, (double) 10.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint12 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint12);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray14 = harmonicFitter1.fit();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: sample contains 3 observed points, at least 4 are required");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint2 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint2);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) '4', (double) (byte) -1);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint8 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint8);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray11 = harmonicFitter1.getObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray11);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray11, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint2 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint2);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray4 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) 0.0f, (double) '4');
        harmonicFitter1.addObservedPoint((double) (byte) 1, (double) (byte) -1, 0.0d);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) 0.0f, 10.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray17 = harmonicFitter1.getObservations();
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric19 = null;
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer20 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter21 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer20);
        harmonicFitter21.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        harmonicFitter21.addObservedPoint((double) (byte) 100, (double) 100.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray29 = harmonicFitter21.getObservations();
        harmonicFitter21.addObservedPoint((double) (byte) 10, (double) (byte) 10);
        harmonicFitter21.addObservedPoint((double) '4', (double) 100, (double) 100.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray37 = harmonicFitter21.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser38 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray37);
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser39 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray37);
        double[] doubleArray40 = parameterGuesser39.guess();
        double[] doubleArray41 = parameterGuesser39.guess();
        double[] doubleArray42 = parameterGuesser39.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray43 = harmonicFitter1.fit((int) '4', parametric19, doubleArray42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray4);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray4, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] { null });
        org.junit.Assert.assertNotNull(weightedObservedPointArray17);
        org.junit.Assert.assertNotNull(weightedObservedPointArray29);
        org.junit.Assert.assertNotNull(weightedObservedPointArray37);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertArrayEquals(doubleArray40, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertArrayEquals(doubleArray41, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertArrayEquals(doubleArray42, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray4 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint5 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint5);
        harmonicFitter1.addObservedPoint((double) 1L, (double) (-1.0f));
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint10 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint10);
        harmonicFitter1.addObservedPoint((double) (-1.0f), (double) 10.0f, (double) (short) 100);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (short) 1, 100.0d, (double) 1.0f);
        harmonicFitter1.addObservedPoint(0.0d, (double) (byte) 1);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric26 = null;
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer27 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter28 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer27);
        harmonicFitter28.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        harmonicFitter28.addObservedPoint((double) (byte) 100, (double) 100.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray36 = harmonicFitter28.getObservations();
        harmonicFitter28.addObservedPoint((double) (byte) 10, (double) (byte) 10);
        harmonicFitter28.addObservedPoint((double) '4', (double) 100, (double) 100.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray44 = harmonicFitter28.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser45 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray44);
        double[] doubleArray46 = parameterGuesser45.guess();
        double[] doubleArray47 = parameterGuesser45.guess();
        double[] doubleArray48 = parameterGuesser45.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray49 = harmonicFitter1.fit((int) (byte) 100, parametric26, doubleArray48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray4);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray4, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray36);
        org.junit.Assert.assertNotNull(weightedObservedPointArray44);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertArrayEquals(doubleArray46, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertArrayEquals(doubleArray47, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertArrayEquals(doubleArray48, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (-1), (double) (byte) 100, (double) ' ');
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint(10.0d, (double) (byte) 100);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray12 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) (-1), (double) 'a');
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray16 = harmonicFitter1.getObservations();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser17 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray16);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: sample contains 2 observed points, at least 4 are required");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray12);
        org.junit.Assert.assertNotNull(weightedObservedPointArray16);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint2 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint2);
        harmonicFitter1.addObservedPoint((double) (short) 1, (double) (byte) -1, 100.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint8 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint8);
        harmonicFitter1.addObservedPoint((double) 10L, (double) (byte) 10, 1.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint14 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint14);
        harmonicFitter1.addObservedPoint((double) (byte) 10, 0.0d);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint20 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint20);
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer22 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter23 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer22);
        harmonicFitter23.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        harmonicFitter23.addObservedPoint((double) (byte) 100, (double) 100.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray31 = harmonicFitter23.getObservations();
        harmonicFitter23.addObservedPoint((double) (byte) 10, (double) (byte) 10);
        harmonicFitter23.addObservedPoint((double) '4', (double) 100, (double) 100.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray39 = harmonicFitter23.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser40 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray39);
        double[] doubleArray41 = parameterGuesser40.guess();
        double[] doubleArray42 = parameterGuesser40.guess();
        double[] doubleArray43 = parameterGuesser40.guess();
        double[] doubleArray44 = parameterGuesser40.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray45 = harmonicFitter1.fit(doubleArray44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray31);
        org.junit.Assert.assertNotNull(weightedObservedPointArray39);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertArrayEquals(doubleArray41, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertArrayEquals(doubleArray42, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertArrayEquals(doubleArray44, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (-1), (double) (byte) 100, (double) ' ');
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint(10.0d, (double) (byte) 100);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray12 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) (-1), (double) 'a');
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint17 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint17);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray19 = harmonicFitter1.getObservations();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser20 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray19);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: sample contains 1 observed points, at least 4 are required");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray12);
        org.junit.Assert.assertNotNull(weightedObservedPointArray19);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray19, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] { null });
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint2 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint2);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) '4', (double) (byte) -1);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) 1L, (double) '4');
        harmonicFitter1.addObservedPoint(0.0d, (double) (-1L), (double) 1.0f);
        harmonicFitter1.addObservedPoint((double) 100L, (double) (short) 0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint19 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint19);
        harmonicFitter1.addObservedPoint(1.0d, 100.0d, (double) 100.0f);
        harmonicFitter1.addObservedPoint((double) 0L, 0.0d, (double) 1L);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray4 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint5 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint5);
        harmonicFitter1.addObservedPoint((double) 1L, (double) (-1.0f));
        harmonicFitter1.addObservedPoint((double) 100.0f, 1.0d);
        harmonicFitter1.addObservedPoint((double) 1, (double) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray16 = harmonicFitter1.fit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray4);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray4, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        harmonicFitter1.addObservedPoint((-1.0d), (double) (-1L), (double) (short) -1);
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray12 = harmonicFitter1.getObservations();
        java.lang.Class<?> wildcardClass13 = weightedObservedPointArray12.getClass();
        org.junit.Assert.assertNotNull(weightedObservedPointArray12);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray12, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) 10, (double) 0, (double) ' ');
        harmonicFitter1.clearObservations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray9 = harmonicFitter1.fit();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: sample contains 0 observed points, at least 4 are required");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint3);
        harmonicFitter1.addObservedPoint((double) (byte) 10, (double) 100, (double) '4');
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint11 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint11);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint13 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint13);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint15 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint15);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint17 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint17);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint19 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint19);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint3);
        harmonicFitter1.addObservedPoint((double) (byte) 10, (double) 100, (double) '4');
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint11 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint11);
        harmonicFitter1.addObservedPoint((double) (-1L), (double) 'a');
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) 10, (double) (byte) 1, 0.0d);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint22 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint22);
        harmonicFitter1.addObservedPoint((double) 0L, (double) (short) 1, (-1.0d));
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) ' ', 1.0d, (double) (byte) 100);
        harmonicFitter1.addObservedPoint((double) 10, (double) (-1.0f), (double) ' ');
        harmonicFitter1.addObservedPoint((double) '#', (double) 1);
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric17 = null;
        double[] doubleArray18 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray19 = harmonicFitter1.fit(parametric17, doubleArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint3);
        harmonicFitter1.addObservedPoint((double) 10L, (double) (short) -1);
        harmonicFitter1.addObservedPoint((double) 0L, (double) (short) 10, (double) (byte) 1);
        java.lang.Class<?> wildcardClass12 = harmonicFitter1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint2 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint2);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) '4', (double) (byte) -1);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint8 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint8);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) 10.0f, (double) ' ', (double) 0L);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint15 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint15);
        harmonicFitter1.addObservedPoint((double) (short) 1, (double) 0);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) (short) 10, (double) 1L);
        harmonicFitter1.addObservedPoint((double) 'a', (double) (byte) 100, (double) '4');
        harmonicFitter1.addObservedPoint(100.0d, (double) '#', 0.0d);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (short) 0, (double) (short) 1);
        harmonicFitter1.addObservedPoint(0.0d, (double) 1L);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint22 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint22);
        harmonicFitter1.addObservedPoint((-1.0d), (double) 0, (double) (short) 0);
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        harmonicFitter1.addObservedPoint(10.0d, (double) 10.0f, (double) '4');
        harmonicFitter1.addObservedPoint((-1.0d), 0.0d);
        harmonicFitter1.addObservedPoint((double) ' ', (double) (short) 10);
        harmonicFitter1.addObservedPoint((double) 'a', (double) 100L);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint(0.0d, 0.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray23 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) 100.0f, (double) (short) 10, (double) (-1));
        org.junit.Assert.assertNotNull(weightedObservedPointArray23);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) (short) 10, (double) 1L);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) ' ');
        harmonicFitter1.addObservedPoint((double) '#', (double) 1, (double) (short) 10);
        harmonicFitter1.addObservedPoint((double) (short) 100, (double) ' ');
        harmonicFitter1.addObservedPoint((double) '4', (double) (-1L), (double) 'a');
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray22 = harmonicFitter1.getObservations();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser23 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray22);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: sample contains 0 observed points, at least 4 are required");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray22);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray22, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        harmonicFitter1.addObservedPoint(10.0d, (double) 10.0f, (double) '4');
        harmonicFitter1.addObservedPoint((-1.0d), 0.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray13 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray14 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray15 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) (byte) 10, (double) '#', (double) 100L);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint20 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint20);
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer22 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter23 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer22);
        harmonicFitter23.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        harmonicFitter23.addObservedPoint((double) (byte) 100, (double) 100.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray31 = harmonicFitter23.getObservations();
        harmonicFitter23.addObservedPoint((double) (byte) 10, (double) (byte) 10);
        harmonicFitter23.addObservedPoint((double) '4', (double) 100, (double) 100.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray39 = harmonicFitter23.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser40 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray39);
        double[] doubleArray41 = parameterGuesser40.guess();
        double[] doubleArray42 = parameterGuesser40.guess();
        double[] doubleArray43 = parameterGuesser40.guess();
        double[] doubleArray44 = parameterGuesser40.guess();
        double[] doubleArray45 = parameterGuesser40.guess();
        double[] doubleArray46 = parameterGuesser40.guess();
        double[] doubleArray47 = parameterGuesser40.guess();
        double[] doubleArray48 = parameterGuesser40.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray49 = harmonicFitter1.fit(doubleArray48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray13);
        org.junit.Assert.assertNotNull(weightedObservedPointArray14);
        org.junit.Assert.assertNotNull(weightedObservedPointArray15);
        org.junit.Assert.assertNotNull(weightedObservedPointArray31);
        org.junit.Assert.assertNotNull(weightedObservedPointArray39);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertArrayEquals(doubleArray41, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertArrayEquals(doubleArray42, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertArrayEquals(doubleArray44, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertArrayEquals(doubleArray45, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertArrayEquals(doubleArray46, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertArrayEquals(doubleArray47, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertArrayEquals(doubleArray48, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        harmonicFitter1.addObservedPoint((-1.0d), (double) (-1L), (double) (short) -1);
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) ' ', 0.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray15 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint16 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint16);
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer18 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter19 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer18);
        harmonicFitter19.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        harmonicFitter19.addObservedPoint((double) (byte) 100, (double) 100.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray27 = harmonicFitter19.getObservations();
        harmonicFitter19.addObservedPoint((double) (byte) 10, (double) (byte) 10);
        harmonicFitter19.addObservedPoint((double) '4', (double) 100, (double) 100.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray35 = harmonicFitter19.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser36 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray35);
        double[] doubleArray37 = parameterGuesser36.guess();
        double[] doubleArray38 = parameterGuesser36.guess();
        double[] doubleArray39 = parameterGuesser36.guess();
        double[] doubleArray40 = parameterGuesser36.guess();
        double[] doubleArray41 = parameterGuesser36.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray42 = harmonicFitter1.fit(doubleArray41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray15);
        org.junit.Assert.assertNotNull(weightedObservedPointArray27);
        org.junit.Assert.assertNotNull(weightedObservedPointArray35);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertArrayEquals(doubleArray40, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertArrayEquals(doubleArray41, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) (short) 10, (double) 1L);
        harmonicFitter1.addObservedPoint((double) 1L, (double) (short) 10);
        harmonicFitter1.addObservedPoint((-1.0d), (double) (short) 10);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray14 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint15 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint15);
        harmonicFitter1.addObservedPoint((double) (short) 0, (double) 100);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) 100L, (double) (-1L));
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray14);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray14, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        harmonicFitter1.addObservedPoint((double) (byte) 100, (double) 100.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) (byte) 10, (double) (byte) 10);
        harmonicFitter1.addObservedPoint((double) '4', (double) 100, (double) 100.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray17 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser18 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray17);
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser19 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray17);
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser20 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray17);
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser21 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray17);
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertNotNull(weightedObservedPointArray17);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        harmonicFitter1.addObservedPoint(10.0d, (double) 10.0f, (double) '4');
        harmonicFitter1.addObservedPoint((-1.0d), 0.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray13 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray14 = harmonicFitter1.getObservations();
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer16 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter17 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer16);
        harmonicFitter17.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        harmonicFitter17.addObservedPoint((double) (byte) 100, (double) 100.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray25 = harmonicFitter17.getObservations();
        harmonicFitter17.addObservedPoint((double) (byte) 10, (double) (byte) 10);
        harmonicFitter17.addObservedPoint((double) '4', (double) 100, (double) 100.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray33 = harmonicFitter17.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser34 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray33);
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
            double[] doubleArray43 = harmonicFitter1.fit(doubleArray42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray13);
        org.junit.Assert.assertNotNull(weightedObservedPointArray14);
        org.junit.Assert.assertNotNull(weightedObservedPointArray25);
        org.junit.Assert.assertNotNull(weightedObservedPointArray33);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertArrayEquals(doubleArray36, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertArrayEquals(doubleArray40, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertArrayEquals(doubleArray41, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertArrayEquals(doubleArray42, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray4 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint5 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint5);
        harmonicFitter1.addObservedPoint((double) 1L, (double) (-1.0f));
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint10 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint10);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray13 = harmonicFitter1.getObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray4);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray4, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray13);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray13, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint2 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint2);
        harmonicFitter1.addObservedPoint((double) (short) 1, (double) (byte) -1, 100.0d);
        harmonicFitter1.addObservedPoint((double) 10, (double) 100.0f, (double) (short) 1);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint13 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint13);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray15 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint16 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint16);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) 100L, (double) '#');
        org.junit.Assert.assertNotNull(weightedObservedPointArray15);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray15, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] { null });
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        harmonicFitter1.addObservedPoint(10.0d, (double) 10.0f, (double) '4');
        harmonicFitter1.addObservedPoint((-1.0d), 0.0d);
        harmonicFitter1.addObservedPoint((double) ' ', (double) (short) 10);
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric16 = null;
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer17 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter18 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer17);
        harmonicFitter18.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        harmonicFitter18.addObservedPoint((double) (byte) 100, (double) 100.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray26 = harmonicFitter18.getObservations();
        harmonicFitter18.addObservedPoint((double) (byte) 10, (double) (byte) 10);
        harmonicFitter18.addObservedPoint((double) '4', (double) 100, (double) 100.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray34 = harmonicFitter18.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser35 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray34);
        double[] doubleArray36 = parameterGuesser35.guess();
        double[] doubleArray37 = parameterGuesser35.guess();
        double[] doubleArray38 = parameterGuesser35.guess();
        double[] doubleArray39 = parameterGuesser35.guess();
        double[] doubleArray40 = parameterGuesser35.guess();
        double[] doubleArray41 = parameterGuesser35.guess();
        double[] doubleArray42 = parameterGuesser35.guess();
        double[] doubleArray43 = parameterGuesser35.guess();
        double[] doubleArray44 = parameterGuesser35.guess();
        double[] doubleArray45 = parameterGuesser35.guess();
        double[] doubleArray46 = parameterGuesser35.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray47 = harmonicFitter1.fit(parametric16, doubleArray46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray26);
        org.junit.Assert.assertNotNull(weightedObservedPointArray34);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertArrayEquals(doubleArray36, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertArrayEquals(doubleArray40, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertArrayEquals(doubleArray41, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertArrayEquals(doubleArray42, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertArrayEquals(doubleArray44, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertArrayEquals(doubleArray45, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertArrayEquals(doubleArray46, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (-1), (double) (byte) 100, (double) ' ');
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric10 = null;
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer11 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter12 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer11);
        harmonicFitter12.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        harmonicFitter12.addObservedPoint((double) (byte) 100, (double) 100.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray20 = harmonicFitter12.getObservations();
        harmonicFitter12.addObservedPoint((double) (byte) 10, (double) (byte) 10);
        harmonicFitter12.addObservedPoint((double) '4', (double) 100, (double) 100.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray28 = harmonicFitter12.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser29 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray28);
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser30 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray28);
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser31 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray28);
        double[] doubleArray32 = parameterGuesser31.guess();
        double[] doubleArray33 = parameterGuesser31.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray34 = harmonicFitter1.fit((int) (short) 10, parametric10, doubleArray33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray20);
        org.junit.Assert.assertNotNull(weightedObservedPointArray28);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertArrayEquals(doubleArray33, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint3);
        harmonicFitter1.addObservedPoint((double) (byte) 10, (double) 100, (double) '4');
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint11 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint11);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint13 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint13);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint15 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint15);
        harmonicFitter1.addObservedPoint((double) 0.0f, (double) 0.0f);
        harmonicFitter1.addObservedPoint((double) (-1.0f), (double) (short) 0, (double) 10.0f);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint3);
        harmonicFitter1.addObservedPoint((double) (byte) 10, (double) 100, (double) '4');
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint10 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint10);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint13 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint13);
        harmonicFitter1.addObservedPoint((double) 1, (double) (short) 0, (double) 0);
        harmonicFitter1.addObservedPoint(10.0d, 0.0d, (double) (byte) 0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray23 = harmonicFitter1.getObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertNotNull(weightedObservedPointArray23);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint3);
        harmonicFitter1.addObservedPoint((double) (byte) 10, (double) 100, (double) '4');
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint11 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint11);
        harmonicFitter1.addObservedPoint((double) (-1L), (double) 'a');
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint16 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint16);
        harmonicFitter1.addObservedPoint((double) 100L, (double) (byte) -1, (double) 0.0f);
        harmonicFitter1.addObservedPoint((double) (short) 1, (double) 'a');
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer25 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter26 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer25);
        harmonicFitter26.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        harmonicFitter26.addObservedPoint((double) (byte) 100, (double) 100.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray34 = harmonicFitter26.getObservations();
        harmonicFitter26.addObservedPoint((double) (byte) 10, (double) (byte) 10);
        harmonicFitter26.addObservedPoint((double) '4', (double) 100, (double) 100.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray42 = harmonicFitter26.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser43 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray42);
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser44 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray42);
        double[] doubleArray45 = parameterGuesser44.guess();
        double[] doubleArray46 = parameterGuesser44.guess();
        double[] doubleArray47 = parameterGuesser44.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray48 = harmonicFitter1.fit(doubleArray47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray34);
        org.junit.Assert.assertNotNull(weightedObservedPointArray42);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertArrayEquals(doubleArray45, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertArrayEquals(doubleArray46, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertArrayEquals(doubleArray47, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint3);
        harmonicFitter1.addObservedPoint((double) (byte) 10, (double) 100, (double) '4');
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint11 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint11);
        harmonicFitter1.addObservedPoint((double) (-1L), (double) 'a');
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint16 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint16);
        harmonicFitter1.addObservedPoint((double) 100L, (double) (byte) -1, (double) 0.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray22 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint23 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint23);
        org.junit.Assert.assertNotNull(weightedObservedPointArray22);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint3);
        harmonicFitter1.addObservedPoint((double) 10L, (double) (short) -1);
        harmonicFitter1.addObservedPoint((double) 0L, (double) (short) 10, (double) (byte) 1);
        harmonicFitter1.addObservedPoint((double) 1L, (double) (-1.0f), (double) 0.0f);
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) (short) 10, (double) 1L);
        harmonicFitter1.addObservedPoint((double) 'a', (double) (byte) 100, (double) '4');
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint12 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint12);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint14 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint14);
        harmonicFitter1.addObservedPoint((double) 100, (double) 'a', (double) (short) 100);
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint3);
        harmonicFitter1.addObservedPoint((double) (byte) 10, (double) 100, (double) '4');
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint11 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint11);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint13 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint13);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint15 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint15);
        harmonicFitter1.addObservedPoint((double) 0.0f, (double) 0.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray20 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser21 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray20);
        java.lang.Class<?> wildcardClass22 = weightedObservedPointArray20.getClass();
        org.junit.Assert.assertNotNull(weightedObservedPointArray20);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        harmonicFitter1.addObservedPoint(10.0d, (double) 10.0f, (double) '4');
        harmonicFitter1.addObservedPoint((-1.0d), 0.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint13 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint13);
        harmonicFitter1.addObservedPoint((double) 0L, (double) (short) -1, 0.0d);
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer19 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter20 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer19);
        harmonicFitter20.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        harmonicFitter20.addObservedPoint((double) (byte) 100, (double) 100.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray28 = harmonicFitter20.getObservations();
        harmonicFitter20.addObservedPoint((double) (byte) 10, (double) (byte) 10);
        harmonicFitter20.addObservedPoint((double) '4', (double) 100, (double) 100.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray36 = harmonicFitter20.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser37 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray36);
        double[] doubleArray38 = parameterGuesser37.guess();
        double[] doubleArray39 = parameterGuesser37.guess();
        double[] doubleArray40 = parameterGuesser37.guess();
        double[] doubleArray41 = parameterGuesser37.guess();
        double[] doubleArray42 = parameterGuesser37.guess();
        double[] doubleArray43 = parameterGuesser37.guess();
        double[] doubleArray44 = parameterGuesser37.guess();
        double[] doubleArray45 = parameterGuesser37.guess();
        double[] doubleArray46 = parameterGuesser37.guess();
        double[] doubleArray47 = parameterGuesser37.guess();
        double[] doubleArray48 = parameterGuesser37.guess();
        double[] doubleArray49 = parameterGuesser37.guess();
        double[] doubleArray50 = parameterGuesser37.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray51 = harmonicFitter1.fit(doubleArray50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray28);
        org.junit.Assert.assertNotNull(weightedObservedPointArray36);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertArrayEquals(doubleArray40, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertArrayEquals(doubleArray41, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertArrayEquals(doubleArray42, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertArrayEquals(doubleArray44, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertArrayEquals(doubleArray45, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertArrayEquals(doubleArray46, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertArrayEquals(doubleArray47, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertArrayEquals(doubleArray48, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertArrayEquals(doubleArray49, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertArrayEquals(doubleArray50, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        harmonicFitter1.addObservedPoint(10.0d, (double) 10.0f, (double) '4');
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint11 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint11);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint(0.0d, (double) 100.0f);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray17 = harmonicFitter1.fit();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: sample contains 1 observed points, at least 4 are required");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (-1L), (double) (byte) 0, (double) 'a');
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray7 = harmonicFitter1.getObservations();
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray12 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) (short) 1, (double) 10, (double) '4');
        org.junit.Assert.assertNotNull(weightedObservedPointArray7);
        org.junit.Assert.assertNotNull(weightedObservedPointArray12);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray12, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint3);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray5 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray6 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint7 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint7);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) 1L, (double) (byte) 10);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray13 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) 0, (double) 1.0f, (double) (byte) -1);
        harmonicFitter1.clearObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray5);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray5, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] { null });
        org.junit.Assert.assertNotNull(weightedObservedPointArray6);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray6, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] { null });
        org.junit.Assert.assertNotNull(weightedObservedPointArray13);
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (-1), (double) (byte) 100, (double) ' ');
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) 1, (double) (short) 10, (double) (short) 1);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint14 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint14);
        harmonicFitter1.addObservedPoint((double) 0L, (double) (-1.0f));
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint6 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint6);
        harmonicFitter1.addObservedPoint(1.0d, (double) 100L);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray11 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray12 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray13 = harmonicFitter1.getObservations();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser14 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: sample contains 3 observed points, at least 4 are required");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray11);
        org.junit.Assert.assertNotNull(weightedObservedPointArray12);
        org.junit.Assert.assertNotNull(weightedObservedPointArray13);
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray6 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) (short) -1, (double) (byte) 0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray10 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) 1, (double) 10.0f);
        org.junit.Assert.assertNotNull(weightedObservedPointArray6);
        org.junit.Assert.assertNotNull(weightedObservedPointArray10);
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) (-1), (double) (short) 100, (double) (byte) 10);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) 100, (double) 10L, (-1.0d));
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint13 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint13);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint15 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint15);
        harmonicFitter1.addObservedPoint((double) (byte) 1, (double) ' ');
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint20 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint20);
        harmonicFitter1.addObservedPoint((double) 10, (double) 0L, 0.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint26 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint26);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray28 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint29 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint29);
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray28);
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (-1), (double) (byte) 100, (double) ' ');
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray8 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = harmonicFitter1.getObservations();
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric11 = null;
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer12 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter13 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer12);
        harmonicFitter13.clearObservations();
        harmonicFitter13.addObservedPoint((double) 1, 1.0d);
        harmonicFitter13.addObservedPoint((double) 0L, 10.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray21 = harmonicFitter13.getObservations();
        harmonicFitter13.addObservedPoint((double) (short) 1, (double) (short) 100);
        harmonicFitter13.addObservedPoint((double) 1L, (double) (byte) -1, (double) (byte) 1);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray29 = harmonicFitter13.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser30 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray29);
        double[] doubleArray31 = parameterGuesser30.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray32 = harmonicFitter1.fit(parametric11, doubleArray31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray8);
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertNotNull(weightedObservedPointArray21);
        org.junit.Assert.assertNotNull(weightedObservedPointArray29);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertArrayEquals(doubleArray31, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint4 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint4);
        harmonicFitter1.addObservedPoint((double) 'a', (double) (byte) 0);
        harmonicFitter1.addObservedPoint((double) 1L, (double) (short) -1);
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer12 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter13 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer12);
        harmonicFitter13.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        harmonicFitter13.addObservedPoint((double) (byte) 100, (double) 100.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray21 = harmonicFitter13.getObservations();
        harmonicFitter13.addObservedPoint((double) (byte) 10, (double) (byte) 10);
        harmonicFitter13.addObservedPoint((double) '4', (double) 100, (double) 100.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray29 = harmonicFitter13.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser30 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray29);
        double[] doubleArray31 = parameterGuesser30.guess();
        double[] doubleArray32 = parameterGuesser30.guess();
        double[] doubleArray33 = parameterGuesser30.guess();
        double[] doubleArray34 = parameterGuesser30.guess();
        double[] doubleArray35 = parameterGuesser30.guess();
        double[] doubleArray36 = parameterGuesser30.guess();
        double[] doubleArray37 = parameterGuesser30.guess();
        double[] doubleArray38 = parameterGuesser30.guess();
        double[] doubleArray39 = parameterGuesser30.guess();
        double[] doubleArray40 = parameterGuesser30.guess();
        double[] doubleArray41 = parameterGuesser30.guess();
        double[] doubleArray42 = parameterGuesser30.guess();
        double[] doubleArray43 = parameterGuesser30.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray44 = harmonicFitter1.fit(doubleArray43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray21);
        org.junit.Assert.assertNotNull(weightedObservedPointArray29);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertArrayEquals(doubleArray31, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertArrayEquals(doubleArray33, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertArrayEquals(doubleArray36, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertArrayEquals(doubleArray40, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertArrayEquals(doubleArray41, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertArrayEquals(doubleArray42, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        harmonicFitter1.addObservedPoint(10.0d, (double) 10.0f, (double) '4');
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint11 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint11);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray14 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) 1, (double) (-1L), (double) (-1.0f));
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray19 = harmonicFitter1.getObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray14);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray14, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray19);
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) 100, (double) 0, (double) 1);
        harmonicFitter1.addObservedPoint((double) 0.0f, 0.0d);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) 10, (double) (short) 10);
        harmonicFitter1.addObservedPoint((double) 0L, (double) (short) 100, (double) 100);
        java.lang.Class<?> wildcardClass19 = harmonicFitter1.getClass();
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint3);
        harmonicFitter1.addObservedPoint((double) (byte) 10, (double) 100, (double) '4');
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint11 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint11);
        harmonicFitter1.addObservedPoint((double) (-1L), (double) 'a');
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray17 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint18 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint18);
        harmonicFitter1.addObservedPoint(100.0d, (double) 100L);
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric23 = null;
        double[] doubleArray24 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray25 = harmonicFitter1.fit(parametric23, doubleArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray17);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray17, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray6 = harmonicFitter1.getObservations();
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (short) 100, (double) 100);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint(1.0d, (double) 10.0f);
        harmonicFitter1.clearObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray6);
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        harmonicFitter1.addObservedPoint(10.0d, (double) 10.0f, (double) '4');
        harmonicFitter1.addObservedPoint((-1.0d), 0.0d);
        harmonicFitter1.addObservedPoint(0.0d, (double) 0.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint16 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint16);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray19 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray20 = harmonicFitter1.getObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray19);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray19, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray20);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray20, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray2 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) 10L, (double) ' ', (double) 100L);
        harmonicFitter1.addObservedPoint(100.0d, (double) (byte) -1);
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric11 = null;
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer12 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter13 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer12);
        harmonicFitter13.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        harmonicFitter13.addObservedPoint((double) (byte) 100, (double) 100.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray21 = harmonicFitter13.getObservations();
        harmonicFitter13.addObservedPoint((double) (byte) 10, (double) (byte) 10);
        harmonicFitter13.addObservedPoint((double) '4', (double) 100, (double) 100.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray29 = harmonicFitter13.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser30 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray29);
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser31 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray29);
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser32 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray29);
        double[] doubleArray33 = parameterGuesser32.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray34 = harmonicFitter1.fit((int) (short) -1, parametric11, doubleArray33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray2);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray2, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray21);
        org.junit.Assert.assertNotNull(weightedObservedPointArray29);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertArrayEquals(doubleArray33, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) 1, 1.0d);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer7 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter8 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer7);
        harmonicFitter8.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        harmonicFitter8.addObservedPoint((double) (byte) 100, (double) 100.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray16 = harmonicFitter8.getObservations();
        harmonicFitter8.addObservedPoint((double) (byte) 10, (double) (byte) 10);
        harmonicFitter8.addObservedPoint((double) '4', (double) 100, (double) 100.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray24 = harmonicFitter8.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser25 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray24);
        double[] doubleArray26 = parameterGuesser25.guess();
        double[] doubleArray27 = parameterGuesser25.guess();
        double[] doubleArray28 = parameterGuesser25.guess();
        double[] doubleArray29 = parameterGuesser25.guess();
        double[] doubleArray30 = parameterGuesser25.guess();
        double[] doubleArray31 = parameterGuesser25.guess();
        double[] doubleArray32 = parameterGuesser25.guess();
        double[] doubleArray33 = parameterGuesser25.guess();
        double[] doubleArray34 = parameterGuesser25.guess();
        double[] doubleArray35 = parameterGuesser25.guess();
        double[] doubleArray36 = parameterGuesser25.guess();
        double[] doubleArray37 = parameterGuesser25.guess();
        double[] doubleArray38 = parameterGuesser25.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray39 = harmonicFitter1.fit(doubleArray38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray16);
        org.junit.Assert.assertNotNull(weightedObservedPointArray24);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertArrayEquals(doubleArray26, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertArrayEquals(doubleArray27, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertArrayEquals(doubleArray28, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertArrayEquals(doubleArray30, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertArrayEquals(doubleArray31, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertArrayEquals(doubleArray33, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertArrayEquals(doubleArray36, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (-1L), (double) (byte) 0, (double) 'a');
        harmonicFitter1.addObservedPoint((double) 100, (double) (short) 100, (double) (byte) 100);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) 100, (double) 1.0f);
        harmonicFitter1.addObservedPoint((double) (byte) 1, (double) 1.0f, (double) 1);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) (short) 10, (double) 1L);
        harmonicFitter1.addObservedPoint((double) 1L, (double) (short) 10);
        harmonicFitter1.addObservedPoint((-1.0d), (double) (short) 10);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray14 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint15 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint15);
        harmonicFitter1.addObservedPoint((double) 1, (double) (byte) 0, (double) 0.0f);
        harmonicFitter1.addObservedPoint((double) (-1.0f), (double) 10, (double) 'a');
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray25 = harmonicFitter1.getObservations();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser26 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray25);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: sample contains 3 observed points, at least 4 are required");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray14);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray14, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray25);
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) (short) 10, (double) 1L);
        harmonicFitter1.addObservedPoint((double) 'a', (double) (byte) 100, (double) '4');
        harmonicFitter1.addObservedPoint(10.0d, (double) '4');
        harmonicFitter1.addObservedPoint(100.0d, (double) '#');
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric18 = null;
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer19 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter20 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer19);
        harmonicFitter20.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        harmonicFitter20.addObservedPoint((double) (byte) 100, (double) 100.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray28 = harmonicFitter20.getObservations();
        harmonicFitter20.addObservedPoint((double) (byte) 10, (double) (byte) 10);
        harmonicFitter20.addObservedPoint((double) '4', (double) 100, (double) 100.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray36 = harmonicFitter20.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser37 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray36);
        double[] doubleArray38 = parameterGuesser37.guess();
        double[] doubleArray39 = parameterGuesser37.guess();
        double[] doubleArray40 = parameterGuesser37.guess();
        double[] doubleArray41 = parameterGuesser37.guess();
        double[] doubleArray42 = parameterGuesser37.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray43 = harmonicFitter1.fit((-1), parametric18, doubleArray42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray28);
        org.junit.Assert.assertNotNull(weightedObservedPointArray36);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertArrayEquals(doubleArray40, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertArrayEquals(doubleArray41, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertArrayEquals(doubleArray42, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) ' ', 1.0d, (double) (byte) 100);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint8 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint8);
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray12 = harmonicFitter1.getObservations();
        java.lang.Class<?> wildcardClass13 = harmonicFitter1.getClass();
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray12);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray12, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray2 = harmonicFitter1.getObservations();
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray5 = harmonicFitter1.getObservations();
        java.lang.Class<?> wildcardClass6 = harmonicFitter1.getClass();
        org.junit.Assert.assertNotNull(weightedObservedPointArray2);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray2, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray5);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray5, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint3);
        harmonicFitter1.addObservedPoint((double) (byte) 10, (double) 100, (double) '4');
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint11 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint11);
        harmonicFitter1.addObservedPoint((double) (-1L), (double) 'a');
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray16 = harmonicFitter1.getObservations();
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric18 = null;
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer19 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter20 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer19);
        harmonicFitter20.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        harmonicFitter20.addObservedPoint((double) (byte) 100, (double) 100.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray28 = harmonicFitter20.getObservations();
        harmonicFitter20.addObservedPoint((double) (byte) 10, (double) (byte) 10);
        harmonicFitter20.addObservedPoint((double) '4', (double) 100, (double) 100.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray36 = harmonicFitter20.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser37 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray36);
        double[] doubleArray38 = parameterGuesser37.guess();
        double[] doubleArray39 = parameterGuesser37.guess();
        double[] doubleArray40 = parameterGuesser37.guess();
        double[] doubleArray41 = parameterGuesser37.guess();
        double[] doubleArray42 = parameterGuesser37.guess();
        double[] doubleArray43 = parameterGuesser37.guess();
        double[] doubleArray44 = parameterGuesser37.guess();
        double[] doubleArray45 = parameterGuesser37.guess();
        double[] doubleArray46 = parameterGuesser37.guess();
        double[] doubleArray47 = parameterGuesser37.guess();
        double[] doubleArray48 = parameterGuesser37.guess();
        double[] doubleArray49 = parameterGuesser37.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray50 = harmonicFitter1.fit((int) (byte) 1, parametric18, doubleArray49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray16);
        org.junit.Assert.assertNotNull(weightedObservedPointArray28);
        org.junit.Assert.assertNotNull(weightedObservedPointArray36);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertArrayEquals(doubleArray40, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertArrayEquals(doubleArray41, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertArrayEquals(doubleArray42, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertArrayEquals(doubleArray44, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertArrayEquals(doubleArray45, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertArrayEquals(doubleArray46, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertArrayEquals(doubleArray47, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertArrayEquals(doubleArray48, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertArrayEquals(doubleArray49, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint3);
        harmonicFitter1.addObservedPoint((double) (byte) 10, (double) 100, (double) '4');
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint11 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint11);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint13 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint13);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint15 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint15);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint17 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint17);
        double[] doubleArray19 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray20 = harmonicFitter1.fit(doubleArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) (short) 10, (double) 1L);
        harmonicFitter1.addObservedPoint((double) 'a', (double) (byte) 100, (double) '4');
        harmonicFitter1.addObservedPoint(100.0d, (double) '#', 0.0d);
        harmonicFitter1.addObservedPoint((double) '4', (double) (short) 10, (double) 1.0f);
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint3);
        harmonicFitter1.addObservedPoint((double) (byte) 10, (double) 100, (double) '4');
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        harmonicFitter1.addObservedPoint((-1.0d), (double) 100, (double) (byte) 1);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (short) 10, (double) 10L);
        java.lang.Class<?> wildcardClass19 = harmonicFitter1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (-1), (double) (byte) 100, (double) ' ');
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = harmonicFitter1.getObservations();
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric10 = null;
        double[] doubleArray12 = new double[] { (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray13 = harmonicFitter1.fit(parametric10, doubleArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray9, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        harmonicFitter1.addObservedPoint((double) (byte) 100, (double) 100.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) (byte) 10, (double) (byte) 10);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray13 = harmonicFitter1.getObservations();
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint15 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint15);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray17 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray18 = harmonicFitter1.getObservations();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser19 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray18);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: sample contains 1 observed points, at least 4 are required");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertNotNull(weightedObservedPointArray13);
        org.junit.Assert.assertNotNull(weightedObservedPointArray17);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray17, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] { null });
        org.junit.Assert.assertNotNull(weightedObservedPointArray18);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray18, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] { null });
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) ' ', 1.0d, (double) (byte) 100);
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint10 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint10);
        java.lang.Class<?> wildcardClass12 = harmonicFitter1.getClass();
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        harmonicFitter1.addObservedPoint((double) 1L, (double) (short) 100);
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric9 = null;
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer10 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter11 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer10);
        harmonicFitter11.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        harmonicFitter11.addObservedPoint((double) (byte) 100, (double) 100.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray19 = harmonicFitter11.getObservations();
        harmonicFitter11.addObservedPoint((double) (byte) 10, (double) (byte) 10);
        harmonicFitter11.addObservedPoint((double) '4', (double) 100, (double) 100.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray27 = harmonicFitter11.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser28 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray27);
        double[] doubleArray29 = parameterGuesser28.guess();
        double[] doubleArray30 = parameterGuesser28.guess();
        double[] doubleArray31 = parameterGuesser28.guess();
        double[] doubleArray32 = parameterGuesser28.guess();
        double[] doubleArray33 = parameterGuesser28.guess();
        double[] doubleArray34 = parameterGuesser28.guess();
        double[] doubleArray35 = parameterGuesser28.guess();
        double[] doubleArray36 = parameterGuesser28.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray37 = harmonicFitter1.fit(parametric9, doubleArray36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray19);
        org.junit.Assert.assertNotNull(weightedObservedPointArray27);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertArrayEquals(doubleArray30, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertArrayEquals(doubleArray31, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertArrayEquals(doubleArray33, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertArrayEquals(doubleArray36, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray4 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint5 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint5);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray8 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = harmonicFitter1.getObservations();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser10 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray9);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: sample contains 0 observed points, at least 4 are required");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray4);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray4, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray8);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray8, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray9, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint3);
        harmonicFitter1.addObservedPoint((double) (byte) 10, (double) 100, (double) '4');
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint11 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint11);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint13 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint13);
        harmonicFitter1.addObservedPoint((double) 1, (double) 100.0f, (double) 1L);
        harmonicFitter1.addObservedPoint((double) (short) 100, 0.0d);
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint3);
        harmonicFitter1.addObservedPoint((double) 10L, (double) (short) -1);
        harmonicFitter1.addObservedPoint((double) 0L, (double) (short) 10, (double) (byte) 1);
        harmonicFitter1.addObservedPoint((double) (byte) 100, (double) (short) 1, 0.0d);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray17 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray18 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) 10, (double) (byte) 0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) 100, (double) (byte) 1);
        harmonicFitter1.addObservedPoint((double) (short) 1, (double) 100.0f);
        org.junit.Assert.assertNotNull(weightedObservedPointArray17);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray17, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray18);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray18, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) (short) 10, (double) 1L);
        harmonicFitter1.addObservedPoint((double) 'a', (double) (byte) 100, (double) '4');
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray12 = harmonicFitter1.getObservations();
        harmonicFitter1.clearObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray12);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray12, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray4 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint5 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint5);
        harmonicFitter1.addObservedPoint((double) 1L, (double) (-1.0f));
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint10 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint10);
        harmonicFitter1.addObservedPoint((double) (-1.0f), (double) 10.0f, (double) (short) 100);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (short) 1, 100.0d, (double) 1.0f);
        harmonicFitter1.addObservedPoint(0.0d, (double) (byte) 1);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint25 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint25);
        harmonicFitter1.addObservedPoint((double) (short) 100, (double) 1L, (double) (byte) 10);
        harmonicFitter1.addObservedPoint(100.0d, (double) 10, (double) 10);
        org.junit.Assert.assertNotNull(weightedObservedPointArray4);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray4, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint2 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint2);
        harmonicFitter1.addObservedPoint((double) (short) 1, (double) (byte) -1, 100.0d);
        harmonicFitter1.addObservedPoint((double) 10, (double) 100.0f, (double) (short) 1);
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (short) 1, (double) (short) 0, (double) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray18 = harmonicFitter1.fit();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: sample contains 1 observed points, at least 4 are required");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint3);
        harmonicFitter1.addObservedPoint((double) (byte) 10, (double) 100, (double) '4');
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray10 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray11 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint12 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint12);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint14 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint14);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray17 = harmonicFitter1.getObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertNotNull(weightedObservedPointArray10);
        org.junit.Assert.assertNotNull(weightedObservedPointArray11);
        org.junit.Assert.assertNotNull(weightedObservedPointArray17);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray17, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint3);
        harmonicFitter1.addObservedPoint((double) (byte) 10, (double) 100, (double) '4');
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint11 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint11);
        harmonicFitter1.addObservedPoint((double) (-1L), (double) 'a');
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray17 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint18 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint18);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray20 = harmonicFitter1.getObservations();
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric21 = null;
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer22 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter23 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer22);
        harmonicFitter23.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        harmonicFitter23.addObservedPoint((double) (byte) 100, (double) 100.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray31 = harmonicFitter23.getObservations();
        harmonicFitter23.addObservedPoint((double) (byte) 10, (double) (byte) 10);
        harmonicFitter23.addObservedPoint((double) '4', (double) 100, (double) 100.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray39 = harmonicFitter23.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser40 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray39);
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser41 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray39);
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser42 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray39);
        double[] doubleArray43 = parameterGuesser42.guess();
        double[] doubleArray44 = parameterGuesser42.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray45 = harmonicFitter1.fit(parametric21, doubleArray44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray17);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray17, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray20);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray20, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] { null });
        org.junit.Assert.assertNotNull(weightedObservedPointArray31);
        org.junit.Assert.assertNotNull(weightedObservedPointArray39);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertArrayEquals(doubleArray44, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint2 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint2);
        harmonicFitter1.addObservedPoint((double) (short) 1, (double) (byte) -1, 100.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint8 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint8);
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray12 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) (byte) -1, 10.0d);
        org.junit.Assert.assertNotNull(weightedObservedPointArray12);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray12, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        harmonicFitter1.addObservedPoint(10.0d, (double) 10.0f, (double) '4');
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint11 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint11);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray14 = harmonicFitter1.getObservations();
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint17 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint17);
        harmonicFitter1.addObservedPoint((double) (short) 0, (double) (short) 10);
        java.lang.Class<?> wildcardClass22 = harmonicFitter1.getClass();
        org.junit.Assert.assertNotNull(weightedObservedPointArray14);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray14, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint3);
        harmonicFitter1.addObservedPoint((double) (byte) 10, (double) 100, (double) '4');
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint11 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint11);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint13 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint13);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint15 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint15);
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint2 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint2);
        harmonicFitter1.addObservedPoint((double) (short) 1, (double) (byte) -1, 100.0d);
        harmonicFitter1.addObservedPoint((double) 10, (double) 100.0f, (double) (short) 1);
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray14 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) (byte) -1, (double) (short) -1);
        harmonicFitter1.addObservedPoint((double) 10.0f, 10.0d, (double) 100);
        org.junit.Assert.assertNotNull(weightedObservedPointArray14);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray14, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint3);
        harmonicFitter1.addObservedPoint((double) (byte) 10, (double) 100, (double) '4');
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) 10L, 1.0d, (double) '#');
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint14 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint14);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) 1);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint19 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint19);
        harmonicFitter1.addObservedPoint((-1.0d), (double) 100);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray24 = harmonicFitter1.fit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint3);
        harmonicFitter1.addObservedPoint((double) (byte) 10, (double) 100, (double) '4');
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint11 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint11);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray13 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray14 = harmonicFitter1.getObservations();
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) 0, (double) (-1L), (double) (-1.0f));
        org.junit.Assert.assertNotNull(weightedObservedPointArray13);
        org.junit.Assert.assertNotNull(weightedObservedPointArray14);
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) (short) 10, (double) 1L);
        harmonicFitter1.addObservedPoint((double) 1L, (double) (short) 10);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer11 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter12 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer11);
        harmonicFitter12.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        harmonicFitter12.addObservedPoint((double) (byte) 100, (double) 100.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray20 = harmonicFitter12.getObservations();
        harmonicFitter12.addObservedPoint((double) (byte) 10, (double) (byte) 10);
        harmonicFitter12.addObservedPoint((double) '4', (double) 100, (double) 100.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray28 = harmonicFitter12.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser29 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray28);
        double[] doubleArray30 = parameterGuesser29.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray31 = harmonicFitter1.fit(doubleArray30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray20);
        org.junit.Assert.assertNotNull(weightedObservedPointArray28);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertArrayEquals(doubleArray30, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint2 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint2);
        harmonicFitter1.addObservedPoint((double) (short) 1, (double) (byte) -1, 100.0d);
        harmonicFitter1.addObservedPoint((double) 10, (double) 100.0f, (double) (short) 1);
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray14 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) (byte) -1, (double) (short) -1);
        harmonicFitter1.addObservedPoint((double) (short) 100, (double) 10);
        harmonicFitter1.addObservedPoint(0.0d, 1.0d);
        org.junit.Assert.assertNotNull(weightedObservedPointArray14);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray14, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint3);
        harmonicFitter1.addObservedPoint((double) (byte) 10, (double) 100, (double) '4');
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint10 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint10);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint13 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint13);
        harmonicFitter1.addObservedPoint((double) 1, (double) (short) 0, (double) 0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray21 = harmonicFitter1.getObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertNotNull(weightedObservedPointArray21);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray21, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) (short) 10, (double) 1L);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint7 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint7);
        harmonicFitter1.addObservedPoint((double) 100.0f, (double) (short) 0);
        harmonicFitter1.addObservedPoint((double) (-1.0f), (double) 0L);
        harmonicFitter1.addObservedPoint((double) (-1.0f), 1.0d, (double) 100.0f);
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint3);
        harmonicFitter1.addObservedPoint((double) (byte) 10, (double) 100, (double) '4');
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint11 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint11);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray13 = harmonicFitter1.getObservations();
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) 0L, (double) 1L);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint18 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint18);
        harmonicFitter1.addObservedPoint((double) (short) 0, (double) (short) -1);
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer23 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter24 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer23);
        harmonicFitter24.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        harmonicFitter24.addObservedPoint((double) (byte) 100, (double) 100.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray32 = harmonicFitter24.getObservations();
        harmonicFitter24.addObservedPoint((double) (byte) 10, (double) (byte) 10);
        harmonicFitter24.addObservedPoint((double) '4', (double) 100, (double) 100.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray40 = harmonicFitter24.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser41 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray40);
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser42 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray40);
        double[] doubleArray43 = parameterGuesser42.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray44 = harmonicFitter1.fit(doubleArray43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray13);
        org.junit.Assert.assertNotNull(weightedObservedPointArray32);
        org.junit.Assert.assertNotNull(weightedObservedPointArray40);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint2 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint2);
        harmonicFitter1.addObservedPoint((double) (short) 1, (double) (byte) -1, 100.0d);
        harmonicFitter1.addObservedPoint((double) 10, (double) 100.0f, (double) (short) 1);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint13 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint13);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray15 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint16 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint16);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray18 = harmonicFitter1.getObservations();
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray20 = harmonicFitter1.getObservations();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser21 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray20);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: sample contains 0 observed points, at least 4 are required");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray15);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray15, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] { null });
        org.junit.Assert.assertNotNull(weightedObservedPointArray18);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray18, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] { null, null });
        org.junit.Assert.assertNotNull(weightedObservedPointArray20);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray20, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint3);
        harmonicFitter1.addObservedPoint((double) (byte) 10, (double) 100, (double) '4');
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint11 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint11);
        harmonicFitter1.addObservedPoint((double) (-1L), (double) 'a');
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray17 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint18 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint18);
        harmonicFitter1.addObservedPoint(100.0d, (double) 100L);
        harmonicFitter1.addObservedPoint((double) (byte) 1, (double) 'a');
        org.junit.Assert.assertNotNull(weightedObservedPointArray17);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray17, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) (short) 10, (double) 1L);
        harmonicFitter1.addObservedPoint((double) 1L, (double) (short) 10);
        harmonicFitter1.addObservedPoint((-1.0d), (double) (short) 10);
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint16 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint16);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint18 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint18);
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint2 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint2);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) '4', (double) (byte) -1);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint8 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint8);
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric12 = null;
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer13 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter14 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer13);
        harmonicFitter14.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        harmonicFitter14.addObservedPoint((double) (byte) 100, (double) 100.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray22 = harmonicFitter14.getObservations();
        harmonicFitter14.addObservedPoint((double) (byte) 10, (double) (byte) 10);
        harmonicFitter14.addObservedPoint((double) '4', (double) 100, (double) 100.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray30 = harmonicFitter14.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser31 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray30);
        double[] doubleArray32 = parameterGuesser31.guess();
        double[] doubleArray33 = parameterGuesser31.guess();
        double[] doubleArray34 = parameterGuesser31.guess();
        double[] doubleArray35 = parameterGuesser31.guess();
        double[] doubleArray36 = parameterGuesser31.guess();
        double[] doubleArray37 = parameterGuesser31.guess();
        double[] doubleArray38 = parameterGuesser31.guess();
        double[] doubleArray39 = parameterGuesser31.guess();
        double[] doubleArray40 = parameterGuesser31.guess();
        double[] doubleArray41 = parameterGuesser31.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray42 = harmonicFitter1.fit(parametric12, doubleArray41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray22);
        org.junit.Assert.assertNotNull(weightedObservedPointArray30);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertArrayEquals(doubleArray33, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertArrayEquals(doubleArray36, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertArrayEquals(doubleArray40, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertArrayEquals(doubleArray41, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint3);
        harmonicFitter1.addObservedPoint((double) (byte) 10, (double) 100, (double) '4');
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint10 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint10);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint12 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint12);
        harmonicFitter1.addObservedPoint((double) 1.0f, 100.0d, (double) 'a');
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint6 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint6);
        harmonicFitter1.addObservedPoint(1.0d, (double) 100L);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray11 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint12 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint12);
        org.junit.Assert.assertNotNull(weightedObservedPointArray11);
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (-1L), (double) (byte) 0, (double) 'a');
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray7 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint(10.0d, (-1.0d), (double) '#');
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint12 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint12);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint14 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint14);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray16 = harmonicFitter1.getObservations();
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric17 = null;
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer18 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter19 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer18);
        harmonicFitter19.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        harmonicFitter19.addObservedPoint((double) (byte) 100, (double) 100.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray27 = harmonicFitter19.getObservations();
        harmonicFitter19.addObservedPoint((double) (byte) 10, (double) (byte) 10);
        harmonicFitter19.addObservedPoint((double) '4', (double) 100, (double) 100.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray35 = harmonicFitter19.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser36 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray35);
        double[] doubleArray37 = parameterGuesser36.guess();
        double[] doubleArray38 = parameterGuesser36.guess();
        double[] doubleArray39 = parameterGuesser36.guess();
        double[] doubleArray40 = parameterGuesser36.guess();
        double[] doubleArray41 = parameterGuesser36.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray42 = harmonicFitter1.fit(parametric17, doubleArray41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray7);
        org.junit.Assert.assertNotNull(weightedObservedPointArray16);
        org.junit.Assert.assertNotNull(weightedObservedPointArray27);
        org.junit.Assert.assertNotNull(weightedObservedPointArray35);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertArrayEquals(doubleArray40, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertArrayEquals(doubleArray41, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray4 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint5 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint5);
        harmonicFitter1.addObservedPoint((double) 1L, (double) (-1.0f));
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint10 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint10);
        harmonicFitter1.addObservedPoint((double) (-1.0f), (double) 10.0f, (double) (short) 100);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (short) 1, 100.0d, (double) 1.0f);
        harmonicFitter1.addObservedPoint(0.0d, (double) (byte) 1);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint25 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint25);
        harmonicFitter1.addObservedPoint((double) (short) 100, (double) 1L, (double) (byte) 10);
        double[] doubleArray34 = new double[] { ' ', 10, 10.0f };
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray35 = harmonicFitter1.fit(doubleArray34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray4);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray4, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] { 32.0d, 10.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) 100, (double) 0, (double) 1);
        harmonicFitter1.addObservedPoint((double) 0.0f, 0.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray11 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint12 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint12);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint14 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint14);
        java.lang.Class<?> wildcardClass16 = harmonicFitter1.getClass();
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray11);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) (-1), (double) (short) 100, (double) (byte) 10);
        harmonicFitter1.addObservedPoint((double) ' ', 0.0d);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) 1, (double) 10);
        harmonicFitter1.addObservedPoint(1.0d, (double) (byte) 1, (double) (byte) 100);
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        harmonicFitter1.addObservedPoint((double) 1L, (double) (short) 100);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = harmonicFitter1.getObservations();
        java.lang.Class<?> wildcardClass10 = harmonicFitter1.getClass();
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint3);
        harmonicFitter1.addObservedPoint((double) (byte) 10, (double) 100, (double) '4');
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint11 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint11);
        harmonicFitter1.addObservedPoint((double) (-1L), (double) 'a');
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray16 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) (short) -1, 100.0d, (double) (byte) -1);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray21 = harmonicFitter1.getObservations();
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric22 = null;
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer23 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter24 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer23);
        harmonicFitter24.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        harmonicFitter24.addObservedPoint((double) (byte) 100, (double) 100.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray32 = harmonicFitter24.getObservations();
        harmonicFitter24.addObservedPoint((double) (byte) 10, (double) (byte) 10);
        harmonicFitter24.addObservedPoint((double) '4', (double) 100, (double) 100.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray40 = harmonicFitter24.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser41 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray40);
        double[] doubleArray42 = parameterGuesser41.guess();
        double[] doubleArray43 = parameterGuesser41.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray44 = harmonicFitter1.fit(parametric22, doubleArray43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray16);
        org.junit.Assert.assertNotNull(weightedObservedPointArray21);
        org.junit.Assert.assertNotNull(weightedObservedPointArray32);
        org.junit.Assert.assertNotNull(weightedObservedPointArray40);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertArrayEquals(doubleArray42, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) (-1), (double) (short) 100, (double) (byte) 10);
        harmonicFitter1.addObservedPoint((-1.0d), (double) (byte) 0, (double) 10.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint12 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint12);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) 0L, (double) 0.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint18 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint18);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric21 = null;
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer22 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter23 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer22);
        harmonicFitter23.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        harmonicFitter23.addObservedPoint((double) (byte) 100, (double) 100.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray31 = harmonicFitter23.getObservations();
        harmonicFitter23.addObservedPoint((double) (byte) 10, (double) (byte) 10);
        harmonicFitter23.addObservedPoint((double) '4', (double) 100, (double) 100.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray39 = harmonicFitter23.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser40 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray39);
        double[] doubleArray41 = parameterGuesser40.guess();
        double[] doubleArray42 = parameterGuesser40.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray43 = harmonicFitter1.fit(parametric21, doubleArray42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray31);
        org.junit.Assert.assertNotNull(weightedObservedPointArray39);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertArrayEquals(doubleArray41, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertArrayEquals(doubleArray42, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) 100, (double) 0, (double) 1);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint8 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint8);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray10 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) 10L, (double) (-1));
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray14 = harmonicFitter1.getObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray10);
        org.junit.Assert.assertNotNull(weightedObservedPointArray14);
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        harmonicFitter1.addObservedPoint(10.0d, (double) 10.0f, (double) '4');
        harmonicFitter1.addObservedPoint((-1.0d), 0.0d);
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (byte) -1, (double) 1, (double) (short) 10);
        java.lang.Class<?> wildcardClass20 = harmonicFitter1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint3);
        harmonicFitter1.addObservedPoint((double) (byte) 10, (double) 100, (double) '4');
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) 10L, 1.0d, (double) '#');
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint14 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint14);
        harmonicFitter1.addObservedPoint((double) (short) 100, (double) 10L);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray19 = harmonicFitter1.fit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint3);
        harmonicFitter1.addObservedPoint((double) (byte) 10, (double) 100, (double) '4');
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint11 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint11);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint13 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint13);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint15 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint15);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray18 = harmonicFitter1.getObservations();
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) '4', (double) 100.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint23 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint23);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric26 = null;
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer27 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter28 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer27);
        harmonicFitter28.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        harmonicFitter28.addObservedPoint((double) (byte) 100, (double) 100.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray36 = harmonicFitter28.getObservations();
        harmonicFitter28.addObservedPoint((double) (byte) 10, (double) (byte) 10);
        harmonicFitter28.addObservedPoint((double) '4', (double) 100, (double) 100.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray44 = harmonicFitter28.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser45 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray44);
        double[] doubleArray46 = parameterGuesser45.guess();
        double[] doubleArray47 = parameterGuesser45.guess();
        double[] doubleArray48 = parameterGuesser45.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray49 = harmonicFitter1.fit(parametric26, doubleArray48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray18);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray18, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray36);
        org.junit.Assert.assertNotNull(weightedObservedPointArray44);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertArrayEquals(doubleArray46, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertArrayEquals(doubleArray47, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertArrayEquals(doubleArray48, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        harmonicFitter1.addObservedPoint((double) (short) 100, (double) (short) 100);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint11 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint11);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint13 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint13);
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer15 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter16 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer15);
        harmonicFitter16.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        harmonicFitter16.addObservedPoint((double) (byte) 100, (double) 100.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray24 = harmonicFitter16.getObservations();
        harmonicFitter16.addObservedPoint((double) (byte) 10, (double) (byte) 10);
        harmonicFitter16.addObservedPoint((double) '4', (double) 100, (double) 100.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray32 = harmonicFitter16.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser33 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray32);
        double[] doubleArray34 = parameterGuesser33.guess();
        double[] doubleArray35 = parameterGuesser33.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray36 = harmonicFitter1.fit(doubleArray35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray24);
        org.junit.Assert.assertNotNull(weightedObservedPointArray32);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        harmonicFitter1.addObservedPoint(10.0d, (double) 10.0f, (double) '4');
        harmonicFitter1.addObservedPoint((-1.0d), 0.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray13 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray14 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray15 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint(0.0d, (double) 1.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray19 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint20 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint20);
        org.junit.Assert.assertNotNull(weightedObservedPointArray13);
        org.junit.Assert.assertNotNull(weightedObservedPointArray14);
        org.junit.Assert.assertNotNull(weightedObservedPointArray15);
        org.junit.Assert.assertNotNull(weightedObservedPointArray19);
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray2 = harmonicFitter1.getObservations();
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (-1), (double) (short) 10);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric9 = null;
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer10 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter11 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer10);
        harmonicFitter11.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        harmonicFitter11.addObservedPoint((double) (byte) 100, (double) 100.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray19 = harmonicFitter11.getObservations();
        harmonicFitter11.addObservedPoint((double) (byte) 10, (double) (byte) 10);
        harmonicFitter11.addObservedPoint((double) '4', (double) 100, (double) 100.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray27 = harmonicFitter11.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser28 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray27);
        double[] doubleArray29 = parameterGuesser28.guess();
        double[] doubleArray30 = parameterGuesser28.guess();
        double[] doubleArray31 = parameterGuesser28.guess();
        double[] doubleArray32 = parameterGuesser28.guess();
        double[] doubleArray33 = parameterGuesser28.guess();
        double[] doubleArray34 = parameterGuesser28.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray35 = harmonicFitter1.fit(parametric9, doubleArray34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray2);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray2, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray19);
        org.junit.Assert.assertNotNull(weightedObservedPointArray27);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertArrayEquals(doubleArray30, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertArrayEquals(doubleArray31, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertArrayEquals(doubleArray33, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint2 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint2);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) '4', (double) (byte) -1);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint8 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint8);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray13 = harmonicFitter1.fit();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: sample contains 3 observed points, at least 4 are required");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) (-1), (double) (short) 100, (double) (byte) 10);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) 100, (double) 10L, (-1.0d));
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint13 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint13);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint15 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint15);
        harmonicFitter1.addObservedPoint((double) (byte) 1, (double) ' ');
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint20 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint20);
        harmonicFitter1.addObservedPoint((double) 10, (double) 0L, 0.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint26 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint26);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) 0L, 0.0d);
        java.lang.Class<?> wildcardClass32 = harmonicFitter1.getClass();
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) 100, (double) 0, (double) 1);
        harmonicFitter1.addObservedPoint((double) '#', (double) 100L, 100.0d);
        harmonicFitter1.addObservedPoint((double) 100.0f, (double) 100.0f, (double) 0L);
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer16 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter17 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer16);
        harmonicFitter17.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        harmonicFitter17.addObservedPoint((double) (byte) 100, (double) 100.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray25 = harmonicFitter17.getObservations();
        harmonicFitter17.addObservedPoint((double) (byte) 10, (double) (byte) 10);
        harmonicFitter17.addObservedPoint((double) '4', (double) 100, (double) 100.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray33 = harmonicFitter17.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser34 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray33);
        double[] doubleArray35 = parameterGuesser34.guess();
        double[] doubleArray36 = parameterGuesser34.guess();
        double[] doubleArray37 = parameterGuesser34.guess();
        double[] doubleArray38 = parameterGuesser34.guess();
        double[] doubleArray39 = parameterGuesser34.guess();
        double[] doubleArray40 = parameterGuesser34.guess();
        double[] doubleArray41 = parameterGuesser34.guess();
        double[] doubleArray42 = parameterGuesser34.guess();
        double[] doubleArray43 = parameterGuesser34.guess();
        double[] doubleArray44 = parameterGuesser34.guess();
        double[] doubleArray45 = parameterGuesser34.guess();
        double[] doubleArray46 = parameterGuesser34.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray47 = harmonicFitter1.fit(doubleArray46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray25);
        org.junit.Assert.assertNotNull(weightedObservedPointArray33);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertArrayEquals(doubleArray36, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertArrayEquals(doubleArray40, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertArrayEquals(doubleArray41, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertArrayEquals(doubleArray42, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertArrayEquals(doubleArray44, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertArrayEquals(doubleArray45, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertArrayEquals(doubleArray46, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) (short) 10, (double) 1L);
        harmonicFitter1.addObservedPoint((double) 'a', (double) (byte) 100, (double) '4');
        harmonicFitter1.addObservedPoint((double) 10L, (double) (short) 0);
        harmonicFitter1.addObservedPoint((double) (short) 100, 100.0d);
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric17 = null;
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer18 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter19 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer18);
        harmonicFitter19.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        harmonicFitter19.addObservedPoint((double) (byte) 100, (double) 100.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray27 = harmonicFitter19.getObservations();
        harmonicFitter19.addObservedPoint((double) (byte) 10, (double) (byte) 10);
        harmonicFitter19.addObservedPoint((double) '4', (double) 100, (double) 100.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray35 = harmonicFitter19.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser36 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray35);
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser37 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray35);
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser38 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray35);
        double[] doubleArray39 = parameterGuesser38.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray40 = harmonicFitter1.fit(parametric17, doubleArray39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray27);
        org.junit.Assert.assertNotNull(weightedObservedPointArray35);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray4 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint5 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint5);
        harmonicFitter1.addObservedPoint((double) 1L, (double) (-1.0f));
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint10 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint10);
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray14 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray15 = harmonicFitter1.getObservations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray16 = harmonicFitter1.fit();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: sample contains 0 observed points, at least 4 are required");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray4);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray4, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray14);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray14, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray15);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray15, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint3);
        harmonicFitter1.addObservedPoint((double) 10L, (double) (short) -1);
        harmonicFitter1.addObservedPoint((double) 0L, (double) (short) 10, (double) (byte) 1);
        harmonicFitter1.addObservedPoint((double) (byte) 100, (double) (short) 1, 0.0d);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (short) 10, (double) (short) 100);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray20 = harmonicFitter1.getObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray20);
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        harmonicFitter1.addObservedPoint(10.0d, (double) 10.0f, (double) '4');
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (short) -1, (double) (byte) 0);
        harmonicFitter1.addObservedPoint((double) 100L, (double) 0, (double) (byte) 100);
        harmonicFitter1.clearObservations();
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint3);
        harmonicFitter1.addObservedPoint((double) (byte) 10, (double) 100, (double) '4');
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint11 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint11);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint13 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint13);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint15 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint15);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray18 = harmonicFitter1.getObservations();
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) '4', (double) 100.0f);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint24 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint24);
        harmonicFitter1.addObservedPoint((double) 10L, (double) (-1.0f));
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray29 = harmonicFitter1.fit();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: sample contains 2 observed points, at least 4 are required");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray18);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray18, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint3);
        harmonicFitter1.addObservedPoint((double) (byte) 10, (double) 100, (double) '4');
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint11 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint11);
        harmonicFitter1.addObservedPoint((double) (-1L), (double) 'a');
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray16 = harmonicFitter1.getObservations();
        harmonicFitter1.clearObservations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray18 = harmonicFitter1.fit();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: sample contains 0 observed points, at least 4 are required");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray16);
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (-1), (double) (byte) 100, (double) ' ');
        harmonicFitter1.addObservedPoint((double) (byte) 1, 0.0d);
        harmonicFitter1.addObservedPoint((-1.0d), (double) 10L, 0.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray15 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) (byte) -1, (double) (short) -1, (double) 10);
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric20 = null;
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer21 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter22 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer21);
        harmonicFitter22.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        harmonicFitter22.addObservedPoint((double) (byte) 100, (double) 100.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray30 = harmonicFitter22.getObservations();
        harmonicFitter22.addObservedPoint((double) (byte) 10, (double) (byte) 10);
        harmonicFitter22.addObservedPoint((double) '4', (double) 100, (double) 100.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray38 = harmonicFitter22.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser39 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray38);
        double[] doubleArray40 = parameterGuesser39.guess();
        double[] doubleArray41 = parameterGuesser39.guess();
        double[] doubleArray42 = parameterGuesser39.guess();
        double[] doubleArray43 = parameterGuesser39.guess();
        double[] doubleArray44 = parameterGuesser39.guess();
        double[] doubleArray45 = parameterGuesser39.guess();
        double[] doubleArray46 = parameterGuesser39.guess();
        double[] doubleArray47 = parameterGuesser39.guess();
        double[] doubleArray48 = parameterGuesser39.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray49 = harmonicFitter1.fit(parametric20, doubleArray48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray15);
        org.junit.Assert.assertNotNull(weightedObservedPointArray30);
        org.junit.Assert.assertNotNull(weightedObservedPointArray38);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertArrayEquals(doubleArray40, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertArrayEquals(doubleArray41, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertArrayEquals(doubleArray42, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertArrayEquals(doubleArray44, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertArrayEquals(doubleArray45, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertArrayEquals(doubleArray46, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertArrayEquals(doubleArray47, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertArrayEquals(doubleArray48, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (-1), (double) (byte) 100, (double) ' ');
        harmonicFitter1.addObservedPoint((double) (byte) 1, 0.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray11 = harmonicFitter1.getObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray11);
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        harmonicFitter1.addObservedPoint(10.0d, (double) 10.0f, (double) '4');
        harmonicFitter1.addObservedPoint((-1.0d), 0.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray13 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray14 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray15 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint(0.0d, (double) 1.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray19 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray20 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray21 = harmonicFitter1.getObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray13);
        org.junit.Assert.assertNotNull(weightedObservedPointArray14);
        org.junit.Assert.assertNotNull(weightedObservedPointArray15);
        org.junit.Assert.assertNotNull(weightedObservedPointArray19);
        org.junit.Assert.assertNotNull(weightedObservedPointArray20);
        org.junit.Assert.assertNotNull(weightedObservedPointArray21);
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        harmonicFitter1.addObservedPoint(10.0d, (double) 10.0f, (double) '4');
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint11 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint11);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint(0.0d, (double) 100.0f);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric18 = null;
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer19 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter20 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer19);
        harmonicFitter20.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        harmonicFitter20.addObservedPoint((double) (byte) 100, (double) 100.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray28 = harmonicFitter20.getObservations();
        harmonicFitter20.addObservedPoint((double) (byte) 10, (double) (byte) 10);
        harmonicFitter20.addObservedPoint((double) '4', (double) 100, (double) 100.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray36 = harmonicFitter20.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser37 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray36);
        double[] doubleArray38 = parameterGuesser37.guess();
        double[] doubleArray39 = parameterGuesser37.guess();
        double[] doubleArray40 = parameterGuesser37.guess();
        double[] doubleArray41 = parameterGuesser37.guess();
        double[] doubleArray42 = parameterGuesser37.guess();
        double[] doubleArray43 = parameterGuesser37.guess();
        double[] doubleArray44 = parameterGuesser37.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray45 = harmonicFitter1.fit(parametric18, doubleArray44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray28);
        org.junit.Assert.assertNotNull(weightedObservedPointArray36);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertArrayEquals(doubleArray40, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertArrayEquals(doubleArray41, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertArrayEquals(doubleArray42, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertArrayEquals(doubleArray44, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint3);
        harmonicFitter1.addObservedPoint((double) (byte) 10, (double) 100, (double) '4');
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint11 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint11);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint13 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint13);
        harmonicFitter1.addObservedPoint((double) 0L, (double) 10.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint18 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint18);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (byte) 100, (double) (-1.0f));
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) 100, (double) 0, (double) 1);
        harmonicFitter1.addObservedPoint((double) '#', (double) 100L, 100.0d);
        harmonicFitter1.addObservedPoint((double) 100.0f, (double) 100.0f, (double) 0L);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (byte) 10, (double) (byte) 0);
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint5 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint5);
        harmonicFitter1.addObservedPoint((double) (-1L), (double) (byte) 100);
        harmonicFitter1.addObservedPoint((double) (short) -1, (-1.0d), (double) (byte) 1);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray14 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) 0, (double) 0.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint18 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint18);
        org.junit.Assert.assertNotNull(weightedObservedPointArray14);
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint2 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint2);
        harmonicFitter1.addObservedPoint((double) (short) 1, (double) (byte) -1, 100.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint8 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint8);
        harmonicFitter1.addObservedPoint((-1.0d), 0.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray13 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser14 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray13);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray15 = parameterGuesser14.guess();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray13);
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        harmonicFitter1.addObservedPoint(10.0d, (double) 10.0f, (double) '4');
        harmonicFitter1.addObservedPoint((-1.0d), 0.0d);
        harmonicFitter1.addObservedPoint(0.0d, (double) 0.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint16 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint16);
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric19 = null;
        double[] doubleArray20 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray21 = harmonicFitter1.fit(10, parametric19, doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) (-1), (double) (short) 100, (double) (byte) 10);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint10 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint10);
        harmonicFitter1.addObservedPoint((double) 10.0f, 0.0d, (double) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray16 = harmonicFitter1.fit();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: sample contains 2 observed points, at least 4 are required");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray9, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        harmonicFitter1.addObservedPoint((double) (byte) 100, (double) 100.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = harmonicFitter1.getObservations();
        harmonicFitter1.clearObservations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray11 = harmonicFitter1.fit();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: sample contains 0 observed points, at least 4 are required");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint2 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint2);
        harmonicFitter1.addObservedPoint((double) (short) 1, (double) (byte) -1, 100.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint8 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint8);
        harmonicFitter1.addObservedPoint((-1.0d), 0.0d);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray14 = harmonicFitter1.getObservations();
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric15 = null;
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer16 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter17 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer16);
        harmonicFitter17.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        harmonicFitter17.addObservedPoint((double) (byte) 100, (double) 100.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray25 = harmonicFitter17.getObservations();
        harmonicFitter17.addObservedPoint((double) (byte) 10, (double) (byte) 10);
        harmonicFitter17.addObservedPoint((double) '4', (double) 100, (double) 100.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray33 = harmonicFitter17.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser34 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray33);
        double[] doubleArray35 = parameterGuesser34.guess();
        double[] doubleArray36 = parameterGuesser34.guess();
        double[] doubleArray37 = parameterGuesser34.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray38 = harmonicFitter1.fit(parametric15, doubleArray37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray14);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray14, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray25);
        org.junit.Assert.assertNotNull(weightedObservedPointArray33);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertArrayEquals(doubleArray36, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint2 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint2);
        harmonicFitter1.addObservedPoint((double) (short) 1, (double) (byte) -1, 100.0d);
        harmonicFitter1.addObservedPoint((double) 10, (double) 100.0f, (double) (short) 1);
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint14 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint14);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray16 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint17 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint17);
        harmonicFitter1.addObservedPoint(0.0d, (double) 0.0f);
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric22 = null;
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer23 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter24 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer23);
        harmonicFitter24.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        harmonicFitter24.addObservedPoint((double) (byte) 100, (double) 100.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray32 = harmonicFitter24.getObservations();
        harmonicFitter24.addObservedPoint((double) (byte) 10, (double) (byte) 10);
        harmonicFitter24.addObservedPoint((double) '4', (double) 100, (double) 100.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray40 = harmonicFitter24.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser41 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray40);
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser42 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray40);
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser43 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray40);
        double[] doubleArray44 = parameterGuesser43.guess();
        double[] doubleArray45 = parameterGuesser43.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray46 = harmonicFitter1.fit(parametric22, doubleArray45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray16);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray16, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] { null });
        org.junit.Assert.assertNotNull(weightedObservedPointArray32);
        org.junit.Assert.assertNotNull(weightedObservedPointArray40);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertArrayEquals(doubleArray44, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertArrayEquals(doubleArray45, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint4 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint4);
        harmonicFitter1.addObservedPoint((double) 'a', (double) (byte) 0);
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric9 = null;
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer10 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter11 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer10);
        harmonicFitter11.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        harmonicFitter11.addObservedPoint((double) (byte) 100, (double) 100.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray19 = harmonicFitter11.getObservations();
        harmonicFitter11.addObservedPoint((double) (byte) 10, (double) (byte) 10);
        harmonicFitter11.addObservedPoint((double) '4', (double) 100, (double) 100.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray27 = harmonicFitter11.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser28 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray27);
        double[] doubleArray29 = parameterGuesser28.guess();
        double[] doubleArray30 = parameterGuesser28.guess();
        double[] doubleArray31 = parameterGuesser28.guess();
        double[] doubleArray32 = parameterGuesser28.guess();
        double[] doubleArray33 = parameterGuesser28.guess();
        double[] doubleArray34 = parameterGuesser28.guess();
        double[] doubleArray35 = parameterGuesser28.guess();
        double[] doubleArray36 = parameterGuesser28.guess();
        double[] doubleArray37 = parameterGuesser28.guess();
        double[] doubleArray38 = parameterGuesser28.guess();
        double[] doubleArray39 = parameterGuesser28.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray40 = harmonicFitter1.fit(parametric9, doubleArray39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray19);
        org.junit.Assert.assertNotNull(weightedObservedPointArray27);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertArrayEquals(doubleArray30, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertArrayEquals(doubleArray31, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertArrayEquals(doubleArray33, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertArrayEquals(doubleArray36, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint4 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint4);
        harmonicFitter1.addObservedPoint((double) 'a', (double) (byte) 0);
        harmonicFitter1.addObservedPoint((double) 100.0f, (double) 0, (double) 10);
        harmonicFitter1.addObservedPoint((double) 10L, (double) (short) 100);
        java.lang.Class<?> wildcardClass16 = harmonicFitter1.getClass();
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray4 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint5 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint5);
        harmonicFitter1.addObservedPoint((double) 1L, (double) (-1.0f));
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint10 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint10);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray12 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint(100.0d, (double) (byte) 100);
        harmonicFitter1.clearObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray4);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray4, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray12);
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray4 = harmonicFitter1.getObservations();
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((-1.0d), 0.0d);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (byte) -1, 10.0d);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint14 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint14);
        org.junit.Assert.assertNotNull(weightedObservedPointArray4);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray4, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        harmonicFitter1.addObservedPoint(10.0d, (double) 10.0f, (double) '4');
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (short) -1, (double) (byte) 0);
        harmonicFitter1.addObservedPoint((double) 100L, (double) 0, (double) (byte) 100);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint18 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint18);
        java.lang.Class<?> wildcardClass20 = harmonicFitter1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray4 = harmonicFitter1.getObservations();
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((-1.0d), 0.0d);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (byte) -1, 10.0d);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 0L, (double) (short) 100);
        harmonicFitter1.addObservedPoint((double) (short) 0, (double) 10L, (double) (short) 1);
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric21 = null;
        double[] doubleArray24 = new double[] { (byte) 1, 1L };
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray25 = harmonicFitter1.fit(parametric21, doubleArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray4);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray4, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] { 1.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray4 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint5 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint5);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) 'a', (double) 0.0f);
        harmonicFitter1.addObservedPoint((double) (-1), (-1.0d), (double) (byte) 0);
        harmonicFitter1.addObservedPoint((double) 100L, (double) (short) 1, (double) (-1));
        org.junit.Assert.assertNotNull(weightedObservedPointArray4);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray4, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) 1, 1.0d);
        harmonicFitter1.addObservedPoint((double) 0L, 10.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) (short) 1, (double) (short) 100);
        harmonicFitter1.addObservedPoint((double) 1L, (double) (byte) -1, (double) (byte) 1);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray17 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser18 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray17);
        double[] doubleArray19 = parameterGuesser18.guess();
        double[] doubleArray20 = parameterGuesser18.guess();
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertNotNull(weightedObservedPointArray17);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint2 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint2);
        harmonicFitter1.addObservedPoint((double) (short) 1, (double) (byte) -1, 100.0d);
        harmonicFitter1.addObservedPoint((double) 10, (double) 100.0f, (double) (short) 1);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint13 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint13);
        harmonicFitter1.clearObservations();
        java.lang.Class<?> wildcardClass16 = harmonicFitter1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray6 = harmonicFitter1.getObservations();
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (short) 100, (double) 100);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint12 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint12);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) 10L, (double) 'a');
        org.junit.Assert.assertNotNull(weightedObservedPointArray6);
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray4 = harmonicFitter1.getObservations();
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((-1.0d), 0.0d);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray10 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) 1L, (double) (-1), 1.0d);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray15 = harmonicFitter1.fit();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: sample contains 1 observed points, at least 4 are required");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray4);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray4, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray10);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray10, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint2 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint2);
        harmonicFitter1.addObservedPoint((double) (short) 1, (double) (byte) -1, 100.0d);
        harmonicFitter1.addObservedPoint((double) 10, (double) 100.0f, (double) (short) 1);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint12 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint12);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint14 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint14);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint16 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint16);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (short) 10, (double) (short) 100, 0.0d);
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint3);
        harmonicFitter1.addObservedPoint((double) (byte) 10, (double) 100, (double) '4');
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) 10L, 1.0d, (double) '#');
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint14 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint14);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) 1);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint19 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint19);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray21 = harmonicFitter1.fit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        harmonicFitter1.addObservedPoint(10.0d, (double) 10.0f, (double) '4');
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint11 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint11);
        harmonicFitter1.addObservedPoint((double) 1, 1.0d);
        harmonicFitter1.addObservedPoint((-1.0d), (double) 0, (double) 1L);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray21 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) 1, (double) (byte) 0, (double) 0L);
        org.junit.Assert.assertNotNull(weightedObservedPointArray21);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray21, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        harmonicFitter1.addObservedPoint((-1.0d), (double) (-1L), (double) (short) -1);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray10 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint11 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint11);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint13 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint13);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint15 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint15);
        org.junit.Assert.assertNotNull(weightedObservedPointArray10);
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint2 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint2);
        harmonicFitter1.addObservedPoint((double) (short) 1, (double) (byte) -1, 100.0d);
        harmonicFitter1.addObservedPoint((double) 10, (double) 100.0f, (double) (short) 1);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint13 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint13);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray15 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint16 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint16);
        harmonicFitter1.addObservedPoint((-1.0d), (-1.0d), (double) 10L);
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric22 = null;
        double[] doubleArray26 = new double[] { 1.0f, '#', '4' };
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray27 = harmonicFitter1.fit(parametric22, doubleArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray15);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray15, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] { null });
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertArrayEquals(doubleArray26, new double[] { 1.0d, 35.0d, 52.0d }, 1.0E-15);
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray6 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) 100, 0.0d, (double) 10L);
        org.junit.Assert.assertNotNull(weightedObservedPointArray6);
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint3);
        harmonicFitter1.addObservedPoint((double) (byte) 10, (double) 100, (double) '4');
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) 10L, 1.0d, (double) '#');
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint14 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint14);
        harmonicFitter1.addObservedPoint((double) (short) 100, (double) 10L);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray19 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) ' ', (double) 'a');
        harmonicFitter1.clearObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertNotNull(weightedObservedPointArray19);
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint3);
        harmonicFitter1.addObservedPoint((double) (byte) 10, (double) 100, (double) '4');
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        harmonicFitter1.addObservedPoint((double) (short) 1, (double) (-1), (double) (short) 10);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray16 = harmonicFitter1.getObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray16);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray16, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint2 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint2);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray4 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) 0.0f, (double) '4');
        harmonicFitter1.addObservedPoint((double) (byte) -1, (double) 1, (double) '#');
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray13 = harmonicFitter1.getObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray4);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray4, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] { null });
        org.junit.Assert.assertNotNull(weightedObservedPointArray13);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray13, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) ' ', 1.0d, (double) (byte) 100);
        harmonicFitter1.addObservedPoint((double) 10, (double) (-1.0f), (double) ' ');
        harmonicFitter1.addObservedPoint((double) (byte) 1, (double) ' ', (double) (byte) 10);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (byte) -1, (double) (-1L), 1.0d);
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer21 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter22 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer21);
        harmonicFitter22.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        harmonicFitter22.addObservedPoint((double) (byte) 100, (double) 100.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray30 = harmonicFitter22.getObservations();
        harmonicFitter22.addObservedPoint((double) (byte) 10, (double) (byte) 10);
        harmonicFitter22.addObservedPoint((double) '4', (double) 100, (double) 100.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray38 = harmonicFitter22.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser39 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray38);
        double[] doubleArray40 = parameterGuesser39.guess();
        double[] doubleArray41 = parameterGuesser39.guess();
        double[] doubleArray42 = parameterGuesser39.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray43 = harmonicFitter1.fit(doubleArray42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray30);
        org.junit.Assert.assertNotNull(weightedObservedPointArray38);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertArrayEquals(doubleArray40, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertArrayEquals(doubleArray41, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertArrayEquals(doubleArray42, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) ' ', 1.0d, (double) (byte) 100);
        harmonicFitter1.addObservedPoint((double) 10, (double) (-1.0f), (double) ' ');
        harmonicFitter1.addObservedPoint((double) '#', (double) 1);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray16 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint(0.0d, 100.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray20 = harmonicFitter1.getObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray16);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray16, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray20);
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint2 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint2);
        harmonicFitter1.addObservedPoint((double) (short) 1, (double) (byte) -1, 100.0d);
        harmonicFitter1.addObservedPoint((double) 10, (double) 100.0f, (double) (short) 1);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint13 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint13);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray15 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint16 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint16);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray18 = harmonicFitter1.getObservations();
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray20 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint21 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint21);
        org.junit.Assert.assertNotNull(weightedObservedPointArray15);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray15, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] { null });
        org.junit.Assert.assertNotNull(weightedObservedPointArray18);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray18, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] { null, null });
        org.junit.Assert.assertNotNull(weightedObservedPointArray20);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray20, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        harmonicFitter1.addObservedPoint(10.0d, (double) 10.0f, (double) '4');
        harmonicFitter1.addObservedPoint((-1.0d), 0.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray13 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray14 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray15 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) (byte) 10, (double) '#', (double) 100L);
        harmonicFitter1.addObservedPoint((double) (short) -1, (double) (byte) 0);
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer23 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter24 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer23);
        harmonicFitter24.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        harmonicFitter24.addObservedPoint((double) (byte) 100, (double) 100.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray32 = harmonicFitter24.getObservations();
        harmonicFitter24.addObservedPoint((double) (byte) 10, (double) (byte) 10);
        harmonicFitter24.addObservedPoint((double) '4', (double) 100, (double) 100.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray40 = harmonicFitter24.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser41 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray40);
        double[] doubleArray42 = parameterGuesser41.guess();
        double[] doubleArray43 = parameterGuesser41.guess();
        double[] doubleArray44 = parameterGuesser41.guess();
        double[] doubleArray45 = parameterGuesser41.guess();
        double[] doubleArray46 = parameterGuesser41.guess();
        double[] doubleArray47 = parameterGuesser41.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray48 = harmonicFitter1.fit(doubleArray47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray13);
        org.junit.Assert.assertNotNull(weightedObservedPointArray14);
        org.junit.Assert.assertNotNull(weightedObservedPointArray15);
        org.junit.Assert.assertNotNull(weightedObservedPointArray32);
        org.junit.Assert.assertNotNull(weightedObservedPointArray40);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertArrayEquals(doubleArray42, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertArrayEquals(doubleArray44, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertArrayEquals(doubleArray45, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertArrayEquals(doubleArray46, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertArrayEquals(doubleArray47, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) 1, 1.0d);
        harmonicFitter1.addObservedPoint((double) 0L, 10.0d);
        harmonicFitter1.addObservedPoint((double) 10, (double) '4', (double) (byte) 10);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric15 = null;
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer16 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter17 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer16);
        harmonicFitter17.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        harmonicFitter17.addObservedPoint((double) (byte) 100, (double) 100.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray25 = harmonicFitter17.getObservations();
        harmonicFitter17.addObservedPoint((double) (byte) 10, (double) (byte) 10);
        harmonicFitter17.addObservedPoint((double) '4', (double) 100, (double) 100.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray33 = harmonicFitter17.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser34 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray33);
        double[] doubleArray35 = parameterGuesser34.guess();
        double[] doubleArray36 = parameterGuesser34.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray37 = harmonicFitter1.fit((int) '#', parametric15, doubleArray36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray25);
        org.junit.Assert.assertNotNull(weightedObservedPointArray33);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertArrayEquals(doubleArray36, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint3);
        harmonicFitter1.addObservedPoint((double) 10L, (double) (short) -1);
        harmonicFitter1.addObservedPoint((double) 0L, (double) (short) 10, (double) (byte) 1);
        harmonicFitter1.addObservedPoint((double) (byte) 100, (double) (short) 1, 0.0d);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray17 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray18 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) 10, (double) (byte) 0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) 100, (double) (byte) 1);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint26 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint26);
        org.junit.Assert.assertNotNull(weightedObservedPointArray17);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray17, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray18);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray18, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint3);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray5 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint6 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint6);
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray5);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray5, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] { null });
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric6 = null;
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer7 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter8 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer7);
        harmonicFitter8.clearObservations();
        harmonicFitter8.addObservedPoint((double) 1, 1.0d);
        harmonicFitter8.addObservedPoint((double) 0L, 10.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray16 = harmonicFitter8.getObservations();
        harmonicFitter8.addObservedPoint((double) (short) 1, (double) (short) 100);
        harmonicFitter8.addObservedPoint((double) 1L, (double) (byte) -1, (double) (byte) 1);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray24 = harmonicFitter8.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser25 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray24);
        double[] doubleArray26 = parameterGuesser25.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray27 = harmonicFitter1.fit(parametric6, doubleArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray16);
        org.junit.Assert.assertNotNull(weightedObservedPointArray24);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertArrayEquals(doubleArray26, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        harmonicFitter1.addObservedPoint(10.0d, (double) 10.0f, (double) '4');
        harmonicFitter1.addObservedPoint((-1.0d), 0.0d);
        harmonicFitter1.addObservedPoint(0.0d, (double) 0.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint16 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint16);
        harmonicFitter1.addObservedPoint(0.0d, (double) (short) 1, (double) (byte) 10);
        harmonicFitter1.addObservedPoint((double) '4', (double) (byte) 100, (double) (-1L));
        harmonicFitter1.addObservedPoint((double) 0, (double) 10L, (double) 10L);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint30 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint30);
        harmonicFitter1.addObservedPoint((double) (-1), (double) (byte) 1);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray35 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser36 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray35);
        org.junit.Assert.assertNotNull(weightedObservedPointArray35);
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) (-1), (double) (short) 100, (double) (byte) 10);
        harmonicFitter1.addObservedPoint((-1.0d), (double) (byte) 0, (double) 10.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint12 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint12);
        double[] doubleArray19 = new double[] { 0, (short) 0, 'a', '4', (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray20 = harmonicFitter1.fit(doubleArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 0.0d, 0.0d, 97.0d, 52.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray4 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint5 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint5);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray7 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray8 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) (short) 0, (double) (byte) 10, 1.0d);
        harmonicFitter1.clearObservations();
        double[] doubleArray14 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray15 = harmonicFitter1.fit(doubleArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray4);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray4, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray7);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray7, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] { null });
        org.junit.Assert.assertNotNull(weightedObservedPointArray8);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray8, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] { null });
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint3);
        harmonicFitter1.addObservedPoint((double) (byte) 10, (double) 100, (double) '4');
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint11 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint11);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray13 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) 10L, (double) (byte) 1);
        harmonicFitter1.addObservedPoint((double) (short) 10, 0.0d, (double) (short) -1);
        harmonicFitter1.addObservedPoint((double) '4', (double) (-1L), 100.0d);
        harmonicFitter1.addObservedPoint((double) 100L, (double) (byte) 10, (double) 0);
        org.junit.Assert.assertNotNull(weightedObservedPointArray13);
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) (short) 10, (double) 1L);
        harmonicFitter1.addObservedPoint((double) 1L, (double) (short) 10);
        harmonicFitter1.addObservedPoint((-1.0d), (double) (short) 10);
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint15 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint15);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray17 = harmonicFitter1.getObservations();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser18 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray17);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: sample contains 1 observed points, at least 4 are required");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray17);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray17, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] { null });
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (-1), 100.0d);
        harmonicFitter1.addObservedPoint((double) 10L, (double) 1.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray11 = harmonicFitter1.getObservations();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser12 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: sample contains 3 observed points, at least 4 are required");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray11);
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) (short) 10, (double) 1L);
        harmonicFitter1.addObservedPoint((double) 1L, (double) (short) 10);
        harmonicFitter1.addObservedPoint((-1.0d), (double) (short) 10);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray14 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint15 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint15);
        harmonicFitter1.addObservedPoint((double) (short) 0, (double) 100);
        harmonicFitter1.clearObservations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray21 = harmonicFitter1.fit();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: sample contains 0 observed points, at least 4 are required");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray14);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray14, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint2 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint2);
        harmonicFitter1.addObservedPoint((double) (short) 1, (double) (byte) -1, 100.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint8 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint8);
        harmonicFitter1.addObservedPoint((-1.0d), 0.0d);
        harmonicFitter1.addObservedPoint((double) (byte) -1, (double) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray16 = harmonicFitter1.fit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint2 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint2);
        harmonicFitter1.addObservedPoint((double) (short) 1, (double) (byte) -1, 100.0d);
        harmonicFitter1.addObservedPoint((double) 10, (double) 100.0f, (double) (short) 1);
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint14 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint14);
        harmonicFitter1.addObservedPoint((double) (byte) 10, (double) 10L, 10.0d);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint21 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint21);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray23 = harmonicFitter1.getObservations();
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric25 = null;
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer26 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter27 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer26);
        harmonicFitter27.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        harmonicFitter27.addObservedPoint((double) (byte) 100, (double) 100.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray35 = harmonicFitter27.getObservations();
        harmonicFitter27.addObservedPoint((double) (byte) 10, (double) (byte) 10);
        harmonicFitter27.addObservedPoint((double) '4', (double) 100, (double) 100.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray43 = harmonicFitter27.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser44 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray43);
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser45 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray43);
        double[] doubleArray46 = parameterGuesser45.guess();
        double[] doubleArray47 = parameterGuesser45.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray48 = harmonicFitter1.fit(0, parametric25, doubleArray47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray23);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray23, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] { null });
        org.junit.Assert.assertNotNull(weightedObservedPointArray35);
        org.junit.Assert.assertNotNull(weightedObservedPointArray43);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertArrayEquals(doubleArray46, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertArrayEquals(doubleArray47, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint3);
        harmonicFitter1.addObservedPoint((double) (byte) 10, (double) 100, (double) '4');
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint11 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint11);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray13 = harmonicFitter1.getObservations();
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) 0L, (double) 1L);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint18 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint18);
        harmonicFitter1.addObservedPoint((double) (short) -1, (double) (short) 1, (double) 0);
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric25 = null;
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer26 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter27 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer26);
        harmonicFitter27.addObservedPoint((double) (byte) 100, (double) 100, (double) 0.0f);
        harmonicFitter27.addObservedPoint((double) (byte) 100, (double) 100.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray35 = harmonicFitter27.getObservations();
        harmonicFitter27.addObservedPoint((double) (byte) 10, (double) (byte) 10);
        harmonicFitter27.addObservedPoint((double) '4', (double) 100, (double) 100.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray43 = harmonicFitter27.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser44 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray43);
        double[] doubleArray45 = parameterGuesser44.guess();
        double[] doubleArray46 = parameterGuesser44.guess();
        double[] doubleArray47 = parameterGuesser44.guess();
        double[] doubleArray48 = parameterGuesser44.guess();
        double[] doubleArray49 = parameterGuesser44.guess();
        double[] doubleArray50 = parameterGuesser44.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray51 = harmonicFitter1.fit(0, parametric25, doubleArray50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray13);
        org.junit.Assert.assertNotNull(weightedObservedPointArray35);
        org.junit.Assert.assertNotNull(weightedObservedPointArray43);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertArrayEquals(doubleArray45, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertArrayEquals(doubleArray46, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertArrayEquals(doubleArray47, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertArrayEquals(doubleArray48, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertArrayEquals(doubleArray49, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertArrayEquals(doubleArray50, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }
}

