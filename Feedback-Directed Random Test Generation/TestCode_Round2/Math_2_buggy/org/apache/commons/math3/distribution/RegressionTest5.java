package org.apache.commons.math3.distribution;

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
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        double double12 = hypergeometricDistribution4.cumulativeProbability((int) ' ');
        int int14 = hypergeometricDistribution4.inverseCumulativeProbability((double) 1L);
        double double16 = hypergeometricDistribution4.cumulativeProbability((int) (short) -1);
        double double19 = hypergeometricDistribution4.cumulativeProbability((int) (short) 10, (int) (short) 100);
        int int20 = hypergeometricDistribution4.getSampleSize();
        double double22 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        int int23 = hypergeometricDistribution4.getSupportUpperBound();
        double double24 = hypergeometricDistribution4.calculateNumericalVariance();
        double double26 = hypergeometricDistribution4.cumulativeProbability((int) (short) 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35 + "'", int20 == 35);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.2275d + "'", double24 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.0d + "'", double26 == 1.0d);
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) -1, 32, 20);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: population size (-1)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(7, 7, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: sample size (100) must be less than or equal to population size (7)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        double double7 = hypergeometricDistribution4.upperCumulativeProbability((int) (short) -1);
        boolean boolean8 = hypergeometricDistribution4.isSupportConnected();
        double double9 = hypergeometricDistribution4.getNumericalVariance();
        int int10 = hypergeometricDistribution4.getSupportUpperBound();
        int int11 = hypergeometricDistribution4.getNumberOfSuccesses();
        boolean boolean12 = hypergeometricDistribution4.isSupportConnected();
        double double13 = hypergeometricDistribution4.calculateNumericalVariance();
        boolean boolean14 = hypergeometricDistribution4.isSupportConnected();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.2275d + "'", double9 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2275d + "'", double13 == 0.2275d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: number of successes (100) must be less than or equal to population size (97)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, 35, 0);
        double double6 = hypergeometricDistribution3.cumulativeProbability((-1), (int) (short) -1);
        double double8 = hypergeometricDistribution3.probability(1);
        int int9 = hypergeometricDistribution3.getSupportUpperBound();
        hypergeometricDistribution3.reseedRandomGenerator((long) 1);
        int int12 = hypergeometricDistribution3.getSupportUpperBound();
        int int13 = hypergeometricDistribution3.getSupportLowerBound();
        int int14 = hypergeometricDistribution3.getSampleSize();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        int int11 = hypergeometricDistribution4.getSupportUpperBound();
        int int13 = hypergeometricDistribution4.inverseCumulativeProbability((double) 1L);
        int int14 = hypergeometricDistribution4.getSampleSize();
        double double17 = hypergeometricDistribution4.cumulativeProbability((int) 'a', (int) 'a');
        double double20 = hypergeometricDistribution4.cumulativeProbability((int) (short) 0, 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, (int) (byte) 0, 0);
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getPopulationSize();
        double double7 = hypergeometricDistribution4.getNumericalMean();
        double double10 = hypergeometricDistribution4.cumulativeProbability((int) (byte) -1, 1);
        int int11 = hypergeometricDistribution4.getPopulationSize();
        int int12 = hypergeometricDistribution4.getPopulationSize();
        double double13 = hypergeometricDistribution4.getNumericalVariance();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = hypergeometricDistribution4.sample();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.35d + "'", double7 == 0.35d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2275d + "'", double13 == 0.2275d);
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', 1, 35);
        int int4 = hypergeometricDistribution3.getSampleSize();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double7 = hypergeometricDistribution4.calculateNumericalVariance();
        int int9 = hypergeometricDistribution4.inverseCumulativeProbability((double) 0);
        double double12 = hypergeometricDistribution4.cumulativeProbability((int) '#', (int) '#');
        boolean boolean13 = hypergeometricDistribution4.isSupportConnected();
        int int14 = hypergeometricDistribution4.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) 'a', (int) (byte) 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSampleSize();
        double double7 = hypergeometricDistribution4.probability((int) ' ');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        double double12 = hypergeometricDistribution4.cumulativeProbability((int) ' ');
        double double13 = hypergeometricDistribution4.calculateNumericalVariance();
        int int14 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double16 = hypergeometricDistribution4.probability((int) '4');
        double double18 = hypergeometricDistribution4.cumulativeProbability((int) '#');
        int int19 = hypergeometricDistribution4.getPopulationSize();
        int int20 = hypergeometricDistribution4.getSampleSize();
        double double22 = hypergeometricDistribution4.probability((int) (byte) 1);
        int int23 = hypergeometricDistribution4.getSampleSize();
        int int24 = hypergeometricDistribution4.getSupportLowerBound();
        double double26 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 0);
        int int27 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double29 = hypergeometricDistribution4.upperCumulativeProbability((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray31 = hypergeometricDistribution4.sample((-1));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: number of samples (-1)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2275d + "'", double13 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35 + "'", int20 == 35);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.3500000000000001d + "'", double22 == 0.3500000000000001d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 35 + "'", int23 == 35);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.6500000000000004d + "'", double26 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.3500000000000001d + "'", double29 == 0.3500000000000001d);
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getPopulationSize();
        boolean boolean7 = hypergeometricDistribution4.isSupportConnected();
        double double9 = hypergeometricDistribution4.upperCumulativeProbability(0);
        double double11 = hypergeometricDistribution4.upperCumulativeProbability(1);
        int int12 = hypergeometricDistribution4.getSampleSize();
        double double13 = hypergeometricDistribution4.calculateNumericalVariance();
        double double15 = hypergeometricDistribution4.upperCumulativeProbability((-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.3500000000000001d + "'", double11 == 0.3500000000000001d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2275d + "'", double13 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        int int11 = hypergeometricDistribution4.getSupportUpperBound();
        double double13 = hypergeometricDistribution4.cumulativeProbability((int) (short) -1);
        double double14 = hypergeometricDistribution4.calculateNumericalVariance();
        double double16 = hypergeometricDistribution4.probability(24);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.2275d + "'", double14 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getPopulationSize();
        boolean boolean7 = hypergeometricDistribution4.isSupportConnected();
        double double8 = hypergeometricDistribution4.getNumericalMean();
        double double10 = hypergeometricDistribution4.cumulativeProbability(35);
        double double13 = hypergeometricDistribution4.cumulativeProbability(1, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.35d + "'", double8 == 0.35d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double7 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 0, (int) (short) 0);
        double double8 = hypergeometricDistribution4.calculateNumericalVariance();
        double double9 = hypergeometricDistribution4.getNumericalMean();
        int int10 = hypergeometricDistribution4.getSupportLowerBound();
        int int11 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int12 = hypergeometricDistribution4.getSupportUpperBound();
        double double13 = hypergeometricDistribution4.getNumericalVariance();
        int int14 = hypergeometricDistribution4.getSampleSize();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.2275d + "'", double8 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.35d + "'", double9 == 0.35d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2275d + "'", double13 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(10, (int) (short) 10, (int) (short) 10);
        int int4 = hypergeometricDistribution3.sample();
        double double7 = hypergeometricDistribution3.cumulativeProbability(1, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getPopulationSize();
        boolean boolean7 = hypergeometricDistribution4.isSupportConnected();
        double double10 = hypergeometricDistribution4.cumulativeProbability(1, (int) '#');
        double double13 = hypergeometricDistribution4.cumulativeProbability((int) (short) 100, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = hypergeometricDistribution4.sample();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) (short) 10);
        double double4 = hypergeometricDistribution3.getNumericalVariance();
        hypergeometricDistribution3.reseedRandomGenerator((long) 'a');
        boolean boolean7 = hypergeometricDistribution3.isSupportConnected();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution4.isSupportConnected();
        double double7 = hypergeometricDistribution4.getNumericalVariance();
        double double10 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1, (int) 'a');
        int int11 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double12 = hypergeometricDistribution4.getNumericalVariance();
        int int13 = hypergeometricDistribution4.getNumberOfSuccesses();
        boolean boolean14 = hypergeometricDistribution4.isSupportConnected();
        double double16 = hypergeometricDistribution4.upperCumulativeProbability((int) (short) 0);
        int int17 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int18 = hypergeometricDistribution4.getSupportUpperBound();
        int int19 = hypergeometricDistribution4.getPopulationSize();
        int int21 = hypergeometricDistribution4.inverseCumulativeProbability(0.3500000000000001d);
        double double24 = hypergeometricDistribution4.cumulativeProbability((-1), 7);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.2275d + "'", double12 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0d + "'", double24 == 1.0d);
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        double double11 = hypergeometricDistribution4.getNumericalVariance();
        int int12 = hypergeometricDistribution4.getSupportUpperBound();
        boolean boolean13 = hypergeometricDistribution4.isSupportConnected();
        double double14 = hypergeometricDistribution4.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.2275d + "'", double11 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.35d + "'", double14 == 0.35d);
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        double double6 = hypergeometricDistribution4.getNumericalMean();
        double double7 = hypergeometricDistribution4.getNumericalVariance();
        double double9 = hypergeometricDistribution4.upperCumulativeProbability((int) (short) 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.35d + "'", double6 == 0.35d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double7 = hypergeometricDistribution4.calculateNumericalVariance();
        double double9 = hypergeometricDistribution4.cumulativeProbability(4);
        double double11 = hypergeometricDistribution4.probability((int) (byte) -1);
        double double13 = hypergeometricDistribution4.upperCumulativeProbability((int) '#');
        double double15 = hypergeometricDistribution4.probability((int) (short) -1);
        double double16 = hypergeometricDistribution4.getNumericalVariance();
        int int17 = hypergeometricDistribution4.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.2275d + "'", double16 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution4.isSupportConnected();
        double double7 = hypergeometricDistribution4.getNumericalVariance();
        double double8 = hypergeometricDistribution4.getNumericalMean();
        double double10 = hypergeometricDistribution4.upperCumulativeProbability(100);
        double double12 = hypergeometricDistribution4.upperCumulativeProbability(0);
        double double13 = hypergeometricDistribution4.getNumericalVariance();
        int int14 = hypergeometricDistribution4.getSupportLowerBound();
        double double16 = hypergeometricDistribution4.probability(100);
        java.lang.Class<?> wildcardClass17 = hypergeometricDistribution4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.35d + "'", double8 == 0.35d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2275d + "'", double13 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double7 = hypergeometricDistribution4.calculateNumericalVariance();
        double double8 = hypergeometricDistribution4.getNumericalMean();
        int int9 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int10 = hypergeometricDistribution4.getSupportUpperBound();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = hypergeometricDistribution4.sample((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.35d + "'", double8 == 0.35d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.cumulativeProbability(0);
        double double7 = hypergeometricDistribution4.calculateNumericalVariance();
        int int8 = hypergeometricDistribution4.getPopulationSize();
        double double10 = hypergeometricDistribution4.probability((int) (byte) -1);
        double double12 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 100);
        int int13 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double16 = hypergeometricDistribution4.cumulativeProbability(10, 97);
        java.lang.Class<?> wildcardClass17 = hypergeometricDistribution4.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double7 = hypergeometricDistribution4.calculateNumericalVariance();
        double double9 = hypergeometricDistribution4.upperCumulativeProbability((-1));
        double double11 = hypergeometricDistribution4.cumulativeProbability((int) (short) 1);
        double double13 = hypergeometricDistribution4.cumulativeProbability((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.6500000000000004d + "'", double13 == 0.6500000000000004d);
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (byte) -1, 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: population size (-1)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(100, (int) (short) 10, 35);
        double double5 = hypergeometricDistribution3.probability(4);
        int int6 = hypergeometricDistribution3.getPopulationSize();
        double double7 = hypergeometricDistribution3.getNumericalVariance();
        int int8 = hypergeometricDistribution3.getNumberOfSuccesses();
        int int9 = hypergeometricDistribution3.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.24984402316337592d + "'", double5 == 0.24984402316337592d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 2.0681818181818183d + "'", double7 == 2.0681818181818183d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        boolean boolean5 = hypergeometricDistribution4.isSupportConnected();
        int int6 = hypergeometricDistribution4.getSampleSize();
        double double8 = hypergeometricDistribution4.probability(10);
        double double11 = hypergeometricDistribution4.cumulativeProbability((int) (short) 0, 24);
        boolean boolean12 = hypergeometricDistribution4.isSupportConnected();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.34999999999999964d + "'", double11 == 0.34999999999999964d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double9 = hypergeometricDistribution4.cumulativeProbability(0, (int) 'a');
        boolean boolean10 = hypergeometricDistribution4.isSupportConnected();
        double double12 = hypergeometricDistribution4.upperCumulativeProbability(100);
        int int13 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int14 = hypergeometricDistribution4.getSupportUpperBound();
        int int15 = hypergeometricDistribution4.getNumberOfSuccesses();
        boolean boolean16 = hypergeometricDistribution4.isSupportConnected();
        double double18 = hypergeometricDistribution4.upperCumulativeProbability((int) (short) 1);
        double double20 = hypergeometricDistribution4.cumulativeProbability((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.34999999999999964d + "'", double9 == 0.34999999999999964d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.3500000000000001d + "'", double18 == 0.3500000000000001d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution4.isSupportConnected();
        double double7 = hypergeometricDistribution4.getNumericalVariance();
        double double10 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1, (int) 'a');
        int int11 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double12 = hypergeometricDistribution4.getNumericalVariance();
        int int13 = hypergeometricDistribution4.getNumberOfSuccesses();
        boolean boolean14 = hypergeometricDistribution4.isSupportConnected();
        double double16 = hypergeometricDistribution4.upperCumulativeProbability((int) (short) 0);
        double double17 = hypergeometricDistribution4.calculateNumericalVariance();
        double double18 = hypergeometricDistribution4.getNumericalMean();
        int int19 = hypergeometricDistribution4.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.2275d + "'", double12 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.2275d + "'", double17 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.35d + "'", double18 == 0.35d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        double double12 = hypergeometricDistribution4.cumulativeProbability((int) ' ');
        double double13 = hypergeometricDistribution4.calculateNumericalVariance();
        int int14 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double16 = hypergeometricDistribution4.probability((int) '4');
        double double18 = hypergeometricDistribution4.cumulativeProbability((int) '#');
        double double20 = hypergeometricDistribution4.cumulativeProbability((int) '4');
        int int21 = hypergeometricDistribution4.getSupportUpperBound();
        double double23 = hypergeometricDistribution4.probability((int) (byte) 100);
        int int24 = hypergeometricDistribution4.getPopulationSize();
        double double26 = hypergeometricDistribution4.probability((int) (short) 1);
        double double29 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 10, (int) 'a');
        int int30 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int31 = hypergeometricDistribution4.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2275d + "'", double13 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.3500000000000001d + "'", double26 == 0.3500000000000001d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double7 = hypergeometricDistribution4.getNumericalMean();
        double double8 = hypergeometricDistribution4.getNumericalMean();
        int int9 = hypergeometricDistribution4.getSupportLowerBound();
        int int10 = hypergeometricDistribution4.getPopulationSize();
        double double11 = hypergeometricDistribution4.getNumericalVariance();
        java.lang.Class<?> wildcardClass12 = hypergeometricDistribution4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.35d + "'", double7 == 0.35d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.35d + "'", double8 == 0.35d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.2275d + "'", double11 == 0.2275d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        double double12 = hypergeometricDistribution4.cumulativeProbability((int) ' ');
        double double13 = hypergeometricDistribution4.calculateNumericalVariance();
        int int14 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double16 = hypergeometricDistribution4.probability(35);
        boolean boolean17 = hypergeometricDistribution4.isSupportConnected();
        double double19 = hypergeometricDistribution4.upperCumulativeProbability((int) 'a');
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2275d + "'", double13 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 0, (int) (short) 100, 7);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: population size (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        double double7 = hypergeometricDistribution4.upperCumulativeProbability((int) (short) -1);
        boolean boolean8 = hypergeometricDistribution4.isSupportConnected();
        int int9 = hypergeometricDistribution4.getSupportLowerBound();
        double double10 = hypergeometricDistribution4.calculateNumericalVariance();
        double double12 = hypergeometricDistribution4.probability(0);
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistribution4.reseedRandomGenerator((long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.2275d + "'", double10 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.6500000000000004d + "'", double12 == 0.6500000000000004d);
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 0, 32, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: population size (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        double double11 = hypergeometricDistribution4.getNumericalVariance();
        double double13 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double16 = hypergeometricDistribution4.cumulativeProbability(10, (int) 'a');
        int int17 = hypergeometricDistribution4.getSupportLowerBound();
        boolean boolean18 = hypergeometricDistribution4.isSupportConnected();
        boolean boolean19 = hypergeometricDistribution4.isSupportConnected();
        boolean boolean20 = hypergeometricDistribution4.isSupportConnected();
        double double23 = hypergeometricDistribution4.cumulativeProbability((int) (short) 10, 52);
        int int24 = hypergeometricDistribution4.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.2275d + "'", double11 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(0, 0, 7);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: population size (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) '#', 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: sample size (100) must be less than or equal to population size (35)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', 24, (int) (short) 1);
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (short) -1);
        int int6 = hypergeometricDistribution3.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.cumulativeProbability(0);
        int int7 = hypergeometricDistribution4.getSupportLowerBound();
        int int8 = hypergeometricDistribution4.getSupportUpperBound();
        int int9 = hypergeometricDistribution4.getPopulationSize();
        double double11 = hypergeometricDistribution4.probability((int) '4');
        int int13 = hypergeometricDistribution4.inverseCumulativeProbability(0.10000000000000002d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getPopulationSize();
        boolean boolean7 = hypergeometricDistribution4.isSupportConnected();
        int int8 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int9 = hypergeometricDistribution4.getSampleSize();
        double double10 = hypergeometricDistribution4.getNumericalMean();
        double double11 = hypergeometricDistribution4.getNumericalVariance();
        double double13 = hypergeometricDistribution4.probability(0);
        double double16 = hypergeometricDistribution4.cumulativeProbability((int) (short) -1, 20);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.35d + "'", double10 == 0.35d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.2275d + "'", double11 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.6500000000000004d + "'", double13 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) ' ', 32, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = hypergeometricDistribution4.sample();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution4.isSupportConnected();
        double double7 = hypergeometricDistribution4.getNumericalVariance();
        double double8 = hypergeometricDistribution4.getNumericalMean();
        int int9 = hypergeometricDistribution4.getSampleSize();
        double double10 = hypergeometricDistribution4.getNumericalMean();
        int int11 = hypergeometricDistribution4.getPopulationSize();
        int int12 = hypergeometricDistribution4.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.35d + "'", double8 == 0.35d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.35d + "'", double10 == 0.35d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        double double7 = hypergeometricDistribution4.upperCumulativeProbability((int) (short) -1);
        double double8 = hypergeometricDistribution4.getNumericalVariance();
        int int9 = hypergeometricDistribution4.getSupportUpperBound();
        double double10 = hypergeometricDistribution4.getNumericalVariance();
        double double12 = hypergeometricDistribution4.upperCumulativeProbability(0);
        double double13 = hypergeometricDistribution4.getNumericalMean();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.2275d + "'", double8 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.2275d + "'", double10 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.35d + "'", double13 == 0.35d);
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) ' ', (int) ' ', (int) (byte) 1);
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (short) 0);
        double double6 = hypergeometricDistribution3.getNumericalMean();
        double double7 = hypergeometricDistribution3.calculateNumericalVariance();
        int int8 = hypergeometricDistribution3.getNumberOfSuccesses();
        hypergeometricDistribution3.reseedRandomGenerator((long) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = hypergeometricDistribution3.inverseCumulativeProbability((double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: 10 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(100, (int) ' ', (int) '#');
        double double4 = hypergeometricDistribution3.getNumericalVariance();
        double double5 = hypergeometricDistribution3.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 5.000404040404041d + "'", double4 == 5.000404040404041d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 5.000404040404041d + "'", double5 == 5.000404040404041d);
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(24, (int) (byte) 10, 4);
        int int4 = hypergeometricDistribution3.getSampleSize();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getPopulationSize();
        boolean boolean7 = hypergeometricDistribution4.isSupportConnected();
        int int8 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int9 = hypergeometricDistribution4.getSampleSize();
        double double11 = hypergeometricDistribution4.cumulativeProbability(0);
        int int12 = hypergeometricDistribution4.getSupportUpperBound();
        boolean boolean13 = hypergeometricDistribution4.isSupportConnected();
        double double14 = hypergeometricDistribution4.getNumericalMean();
        int int15 = hypergeometricDistribution4.getSupportUpperBound();
        double double17 = hypergeometricDistribution4.probability(97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.6500000000000004d + "'", double11 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.35d + "'", double14 == 0.35d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        double double12 = hypergeometricDistribution4.cumulativeProbability((int) ' ');
        double double13 = hypergeometricDistribution4.calculateNumericalVariance();
        int int14 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double16 = hypergeometricDistribution4.probability((int) '4');
        double double18 = hypergeometricDistribution4.cumulativeProbability((int) '#');
        double double20 = hypergeometricDistribution4.cumulativeProbability((int) '4');
        double double21 = hypergeometricDistribution4.getNumericalMean();
        int int22 = hypergeometricDistribution4.getSampleSize();
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistribution4.reseedRandomGenerator((long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2275d + "'", double13 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.35d + "'", double21 == 0.35d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 35 + "'", int22 == 35);
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int7 = hypergeometricDistribution4.getSupportLowerBound();
        int int8 = hypergeometricDistribution4.getSampleSize();
        boolean boolean9 = hypergeometricDistribution4.isSupportConnected();
        double double10 = hypergeometricDistribution4.getNumericalMean();
        java.lang.Class<?> wildcardClass11 = hypergeometricDistribution4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.35d + "'", double10 == 0.35d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, 35, 0);
        double double6 = hypergeometricDistribution3.cumulativeProbability((-1), (int) (short) -1);
        double double8 = hypergeometricDistribution3.probability(1);
        int int9 = hypergeometricDistribution3.getSupportUpperBound();
        boolean boolean10 = hypergeometricDistribution3.isSupportConnected();
        int int11 = hypergeometricDistribution3.getSupportLowerBound();
        int int12 = hypergeometricDistribution3.getSampleSize();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double7 = hypergeometricDistribution4.calculateNumericalVariance();
        int int9 = hypergeometricDistribution4.inverseCumulativeProbability((double) 0);
        int int10 = hypergeometricDistribution4.getSampleSize();
        double double11 = hypergeometricDistribution4.getNumericalVariance();
        double double12 = hypergeometricDistribution4.getNumericalMean();
        int int13 = hypergeometricDistribution4.getPopulationSize();
        int int14 = hypergeometricDistribution4.getPopulationSize();
        double double15 = hypergeometricDistribution4.getNumericalMean();
        double double16 = hypergeometricDistribution4.calculateNumericalVariance();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.2275d + "'", double11 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.35d + "'", double12 == 0.35d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.35d + "'", double15 == 0.35d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.2275d + "'", double16 == 0.2275d);
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.cumulativeProbability(0);
        double double7 = hypergeometricDistribution4.getNumericalVariance();
        double double8 = hypergeometricDistribution4.getNumericalVariance();
        double double11 = hypergeometricDistribution4.cumulativeProbability((int) (short) 1, 32);
        int int12 = hypergeometricDistribution4.getPopulationSize();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.2275d + "'", double8 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        int int6 = hypergeometricDistribution4.getSupportLowerBound();
        double double8 = hypergeometricDistribution4.probability(1);
        int int9 = hypergeometricDistribution4.getPopulationSize();
        double double11 = hypergeometricDistribution4.probability((int) ' ');
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.3500000000000001d + "'", double8 == 0.3500000000000001d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getPopulationSize();
        double double7 = hypergeometricDistribution4.getNumericalMean();
        double double8 = hypergeometricDistribution4.getNumericalMean();
        int int9 = hypergeometricDistribution4.getSupportUpperBound();
        double double10 = hypergeometricDistribution4.getNumericalMean();
        int int11 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double12 = hypergeometricDistribution4.calculateNumericalVariance();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.35d + "'", double7 == 0.35d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.35d + "'", double8 == 0.35d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.35d + "'", double10 == 0.35d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.2275d + "'", double12 == 0.2275d);
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(4, 0, (int) (byte) 0);
        hypergeometricDistribution3.reseedRandomGenerator((long) '#');
        double double7 = hypergeometricDistribution3.upperCumulativeProbability((int) (byte) 100);
        int[] intArray9 = hypergeometricDistribution3.sample(10);
        int int10 = hypergeometricDistribution3.getSampleSize();
        int int11 = hypergeometricDistribution3.getNumberOfSuccesses();
        int int12 = hypergeometricDistribution3.sample();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getPopulationSize();
        int int8 = hypergeometricDistribution4.inverseCumulativeProbability((double) (byte) 0);
        double double9 = hypergeometricDistribution4.getNumericalVariance();
        double double11 = hypergeometricDistribution4.upperCumulativeProbability((int) (short) 0);
        double double12 = hypergeometricDistribution4.calculateNumericalVariance();
        int int13 = hypergeometricDistribution4.getSupportUpperBound();
        boolean boolean14 = hypergeometricDistribution4.isSupportConnected();
        double double15 = hypergeometricDistribution4.calculateNumericalVariance();
        double double16 = hypergeometricDistribution4.getNumericalMean();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = hypergeometricDistribution4.sample(100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.2275d + "'", double9 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.2275d + "'", double12 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.2275d + "'", double15 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.35d + "'", double16 == 0.35d);
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 0, (int) (short) 0, 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: population size (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(1, (int) (short) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: number of successes (-1)");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(7, 10, 52);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: number of successes (10) must be less than or equal to population size (7)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 0, 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: population size (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        int int11 = hypergeometricDistribution4.getSupportUpperBound();
        int int12 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double14 = hypergeometricDistribution4.probability((int) (short) 0);
        int int15 = hypergeometricDistribution4.getSupportUpperBound();
        int int16 = hypergeometricDistribution4.getSupportUpperBound();
        int int17 = hypergeometricDistribution4.getPopulationSize();
        double double19 = hypergeometricDistribution4.probability(7);
        int int20 = hypergeometricDistribution4.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.6500000000000004d + "'", double14 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double7 = hypergeometricDistribution4.calculateNumericalVariance();
        double double9 = hypergeometricDistribution4.cumulativeProbability(4);
        boolean boolean10 = hypergeometricDistribution4.isSupportConnected();
        double double11 = hypergeometricDistribution4.getNumericalVariance();
        int int13 = hypergeometricDistribution4.inverseCumulativeProbability((double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.2275d + "'", double11 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        int int7 = hypergeometricDistribution4.getNumberOfSuccesses();
        boolean boolean8 = hypergeometricDistribution4.isSupportConnected();
        int int9 = hypergeometricDistribution4.getPopulationSize();
        double double12 = hypergeometricDistribution4.cumulativeProbability(1, (int) (byte) 10);
        double double14 = hypergeometricDistribution4.probability((int) '#');
        double double15 = hypergeometricDistribution4.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.35d + "'", double15 == 0.35d);
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution4.isSupportConnected();
        double double7 = hypergeometricDistribution4.getNumericalVariance();
        double double9 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 10);
        int int10 = hypergeometricDistribution4.getSampleSize();
        double double12 = hypergeometricDistribution4.cumulativeProbability((int) 'a');
        int int13 = hypergeometricDistribution4.getSampleSize();
        double double16 = hypergeometricDistribution4.cumulativeProbability((int) (short) 1, 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getPopulationSize();
        boolean boolean7 = hypergeometricDistribution4.isSupportConnected();
        int int8 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double10 = hypergeometricDistribution4.upperCumulativeProbability(32);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, 35, 0);
        double double6 = hypergeometricDistribution3.cumulativeProbability((-1), (int) (short) -1);
        double double8 = hypergeometricDistribution3.probability(1);
        double double9 = hypergeometricDistribution3.calculateNumericalVariance();
        hypergeometricDistribution3.reseedRandomGenerator(0L);
        double double12 = hypergeometricDistribution3.getNumericalVariance();
        double double14 = hypergeometricDistribution3.probability((int) (byte) 10);
        int int15 = hypergeometricDistribution3.getSampleSize();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution4.isSupportConnected();
        double double7 = hypergeometricDistribution4.getNumericalVariance();
        double double10 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1, (int) 'a');
        double double12 = hypergeometricDistribution4.upperCumulativeProbability((-1));
        int int13 = hypergeometricDistribution4.getSampleSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getPopulationSize();
        double double7 = hypergeometricDistribution4.getNumericalMean();
        double double8 = hypergeometricDistribution4.getNumericalMean();
        int int9 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int10 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int11 = hypergeometricDistribution4.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.35d + "'", double7 == 0.35d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.35d + "'", double8 == 0.35d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (byte) 1, 97, (int) '4');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: number of successes (97) must be less than or equal to population size (1)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(32, (int) (short) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: number of successes (100) must be less than or equal to population size (32)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, 35, 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        double double6 = hypergeometricDistribution3.probability((int) 'a');
        boolean boolean7 = hypergeometricDistribution3.isSupportConnected();
        double double9 = hypergeometricDistribution3.upperCumulativeProbability(97);
        double double11 = hypergeometricDistribution3.probability((int) (byte) 100);
        double double12 = hypergeometricDistribution3.getNumericalMean();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (byte) 100, (int) (short) 1, (int) (short) 10);
        double double6 = hypergeometricDistribution4.upperCumulativeProbability((-1));
        int int7 = hypergeometricDistribution4.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        int int6 = hypergeometricDistribution4.getSupportLowerBound();
        double double8 = hypergeometricDistribution4.probability(1);
        int int9 = hypergeometricDistribution4.getPopulationSize();
        int int10 = hypergeometricDistribution4.getSupportUpperBound();
        java.lang.Class<?> wildcardClass11 = hypergeometricDistribution4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.3500000000000001d + "'", double8 == 0.3500000000000001d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double7 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 0, (int) (short) 0);
        double double8 = hypergeometricDistribution4.calculateNumericalVariance();
        double double9 = hypergeometricDistribution4.getNumericalMean();
        double double12 = hypergeometricDistribution4.cumulativeProbability(35, (int) (short) 100);
        double double13 = hypergeometricDistribution4.getNumericalMean();
        double double14 = hypergeometricDistribution4.calculateNumericalVariance();
        double double16 = hypergeometricDistribution4.cumulativeProbability((int) ' ');
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.2275d + "'", double8 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.35d + "'", double9 == 0.35d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.35d + "'", double13 == 0.35d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.2275d + "'", double14 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) ' ', (int) ' ', (int) (short) 0);
        double double5 = hypergeometricDistribution3.probability(35);
        double double7 = hypergeometricDistribution3.probability((int) (short) 100);
        java.lang.Class<?> wildcardClass8 = hypergeometricDistribution3.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(35, (int) (short) 100, 20);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: number of successes (100) must be less than or equal to population size (35)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        double double7 = hypergeometricDistribution4.upperCumulativeProbability((int) (short) -1);
        boolean boolean8 = hypergeometricDistribution4.isSupportConnected();
        double double9 = hypergeometricDistribution4.getNumericalVariance();
        double double10 = hypergeometricDistribution4.getNumericalMean();
        int int11 = hypergeometricDistribution4.getSampleSize();
        double double12 = hypergeometricDistribution4.getNumericalMean();
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistribution4.reseedRandomGenerator((long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.2275d + "'", double9 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.35d + "'", double10 == 0.35d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.35d + "'", double12 == 0.35d);
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        int int11 = hypergeometricDistribution4.getSupportUpperBound();
        int int12 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double13 = hypergeometricDistribution4.getNumericalMean();
        int int15 = hypergeometricDistribution4.inverseCumulativeProbability(0.3500000000000001d);
        double double16 = hypergeometricDistribution4.calculateNumericalVariance();
        double double17 = hypergeometricDistribution4.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.35d + "'", double13 == 0.35d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.2275d + "'", double16 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.35d + "'", double17 == 0.35d);
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, 35, 0);
        int int4 = hypergeometricDistribution3.getSupportLowerBound();
        hypergeometricDistribution3.reseedRandomGenerator(100L);
        boolean boolean7 = hypergeometricDistribution3.isSupportConnected();
        double double10 = hypergeometricDistribution3.cumulativeProbability((int) (short) 1, 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (byte) 100, (int) (byte) 100, 10);
        double double6 = hypergeometricDistribution4.cumulativeProbability((int) '4');
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(4, (int) '#', 32);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: number of successes (35) must be less than or equal to population size (4)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(4, 0, (int) (byte) 0);
        hypergeometricDistribution3.reseedRandomGenerator((long) '#');
        int int6 = hypergeometricDistribution3.getSupportLowerBound();
        boolean boolean7 = hypergeometricDistribution3.isSupportConnected();
        double double8 = hypergeometricDistribution3.getNumericalVariance();
        double double11 = hypergeometricDistribution3.cumulativeProbability(1, (int) 'a');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (short) 100, (int) (byte) 0, (int) (short) 0);
        double double5 = hypergeometricDistribution3.upperCumulativeProbability((int) (byte) -1);
        double double6 = hypergeometricDistribution3.calculateNumericalVariance();
        boolean boolean7 = hypergeometricDistribution3.isSupportConnected();
        boolean boolean8 = hypergeometricDistribution3.isSupportConnected();
        java.lang.Class<?> wildcardClass9 = hypergeometricDistribution3.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, 35, 0);
        int int4 = hypergeometricDistribution3.getPopulationSize();
        double double5 = hypergeometricDistribution3.getNumericalMean();
        double double6 = hypergeometricDistribution3.getNumericalVariance();
        int int7 = hypergeometricDistribution3.sample();
        int int8 = hypergeometricDistribution3.getSupportUpperBound();
        double double10 = hypergeometricDistribution3.probability((int) (byte) 10);
        int int11 = hypergeometricDistribution3.getSupportUpperBound();
        hypergeometricDistribution3.reseedRandomGenerator((long) 10);
        double double15 = hypergeometricDistribution3.cumulativeProbability(0);
        double double17 = hypergeometricDistribution3.upperCumulativeProbability((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int7 = hypergeometricDistribution4.getSupportLowerBound();
        int int8 = hypergeometricDistribution4.getSampleSize();
        double double9 = hypergeometricDistribution4.getNumericalMean();
        int int10 = hypergeometricDistribution4.getPopulationSize();
        int int11 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double13 = hypergeometricDistribution4.probability((int) '4');
        double double16 = hypergeometricDistribution4.cumulativeProbability(1, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.35d + "'", double9 == 0.35d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getPopulationSize();
        int int8 = hypergeometricDistribution4.inverseCumulativeProbability((double) (byte) 0);
        double double9 = hypergeometricDistribution4.getNumericalVariance();
        double double10 = hypergeometricDistribution4.getNumericalMean();
        java.lang.Class<?> wildcardClass11 = hypergeometricDistribution4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.2275d + "'", double9 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.35d + "'", double10 == 0.35d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(20, (int) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: number of successes (-1)");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSampleSize();
        double double7 = hypergeometricDistribution4.probability(0);
        double double8 = hypergeometricDistribution4.getNumericalMean();
        int int9 = hypergeometricDistribution4.getSampleSize();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.6500000000000004d + "'", double7 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.35d + "'", double8 == 0.35d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getPopulationSize();
        int int8 = hypergeometricDistribution4.inverseCumulativeProbability((double) (byte) 0);
        double double9 = hypergeometricDistribution4.getNumericalVariance();
        double double11 = hypergeometricDistribution4.upperCumulativeProbability((int) '#');
        double double13 = hypergeometricDistribution4.probability(0);
        int int15 = hypergeometricDistribution4.inverseCumulativeProbability(0.0d);
        double double17 = hypergeometricDistribution4.upperCumulativeProbability((int) ' ');
        double double18 = hypergeometricDistribution4.calculateNumericalVariance();
        double double19 = hypergeometricDistribution4.getNumericalVariance();
        int int20 = hypergeometricDistribution4.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.2275d + "'", double9 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.6500000000000004d + "'", double13 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.2275d + "'", double18 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.2275d + "'", double19 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double7 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 0, (int) (short) 0);
        double double8 = hypergeometricDistribution4.getNumericalMean();
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) '4');
        double double13 = hypergeometricDistribution4.cumulativeProbability(100, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.35d + "'", double8 == 0.35d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) ' ', (int) ' ', (int) (byte) 1);
        double double4 = hypergeometricDistribution3.getNumericalMean();
        double double5 = hypergeometricDistribution3.calculateNumericalVariance();
        int int6 = hypergeometricDistribution3.getSampleSize();
        double double9 = hypergeometricDistribution3.cumulativeProbability(32, 97);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        int int7 = hypergeometricDistribution4.getNumberOfSuccesses();
        boolean boolean8 = hypergeometricDistribution4.isSupportConnected();
        double double10 = hypergeometricDistribution4.probability(35);
        double double13 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1, 1);
        double double15 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 10);
        int int16 = hypergeometricDistribution4.getSupportUpperBound();
        int int17 = hypergeometricDistribution4.getSupportUpperBound();
        // The following exception was thrown during execution in test generation
        try {
            int int18 = hypergeometricDistribution4.sample();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.cumulativeProbability(0);
        int int7 = hypergeometricDistribution4.getSupportLowerBound();
        int int8 = hypergeometricDistribution4.getSupportUpperBound();
        int int9 = hypergeometricDistribution4.getPopulationSize();
        int int10 = hypergeometricDistribution4.getSupportUpperBound();
        double double12 = hypergeometricDistribution4.upperCumulativeProbability((int) (short) 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(100, (int) '4', 35);
        int int4 = hypergeometricDistribution3.sample();
        double double5 = hypergeometricDistribution3.calculateNumericalVariance();
// flaky "1) test2599(org.apache.commons.math3.distribution.RegressionTest5)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 16 + "'", int4 == 16);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 5.735757575757575d + "'", double5 == 5.735757575757575d);
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution4.isSupportConnected();
        double double7 = hypergeometricDistribution4.getNumericalVariance();
        double double8 = hypergeometricDistribution4.getNumericalMean();
        double double10 = hypergeometricDistribution4.upperCumulativeProbability(100);
        int int11 = hypergeometricDistribution4.getSupportUpperBound();
        double double12 = hypergeometricDistribution4.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.35d + "'", double8 == 0.35d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.2275d + "'", double12 == 0.2275d);
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(97, 4, 20);
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        boolean boolean5 = hypergeometricDistribution4.isSupportConnected();
        int int6 = hypergeometricDistribution4.getSampleSize();
        int int7 = hypergeometricDistribution4.getNumberOfSuccesses();
        boolean boolean8 = hypergeometricDistribution4.isSupportConnected();
        double double9 = hypergeometricDistribution4.getNumericalMean();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.35d + "'", double9 == 0.35d);
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(100, (int) (short) 10, 35);
        double double5 = hypergeometricDistribution3.probability(4);
        int int6 = hypergeometricDistribution3.getPopulationSize();
        double double7 = hypergeometricDistribution3.getNumericalVariance();
        double double10 = hypergeometricDistribution3.cumulativeProbability(0, 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.24984402316337592d + "'", double5 == 0.24984402316337592d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 2.0681818181818183d + "'", double7 == 2.0681818181818183d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        int int11 = hypergeometricDistribution4.getSupportUpperBound();
        int int12 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double14 = hypergeometricDistribution4.cumulativeProbability((int) (short) 1);
        double double16 = hypergeometricDistribution4.upperCumulativeProbability((int) '4');
        int int18 = hypergeometricDistribution4.inverseCumulativeProbability((double) 1);
        int int19 = hypergeometricDistribution4.getSupportLowerBound();
        boolean boolean20 = hypergeometricDistribution4.isSupportConnected();
        double double21 = hypergeometricDistribution4.getNumericalVariance();
        double double23 = hypergeometricDistribution4.upperCumulativeProbability((int) '4');
        int int24 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double26 = hypergeometricDistribution4.cumulativeProbability((int) 'a');
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.2275d + "'", double21 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.0d + "'", double26 == 1.0d);
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getPopulationSize();
        boolean boolean7 = hypergeometricDistribution4.isSupportConnected();
        double double10 = hypergeometricDistribution4.cumulativeProbability(1, (int) '#');
        int int11 = hypergeometricDistribution4.getSupportLowerBound();
        double double13 = hypergeometricDistribution4.cumulativeProbability((int) (short) 10);
        double double14 = hypergeometricDistribution4.getNumericalVariance();
        int int15 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double17 = hypergeometricDistribution4.upperCumulativeProbability(7);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.2275d + "'", double14 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.cumulativeProbability(0);
        double double7 = hypergeometricDistribution4.getNumericalVariance();
        double double8 = hypergeometricDistribution4.getNumericalVariance();
        double double9 = hypergeometricDistribution4.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.2275d + "'", double8 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.2275d + "'", double9 == 0.2275d);
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution4.isSupportConnected();
        double double7 = hypergeometricDistribution4.getNumericalVariance();
        double double9 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 10);
        int int10 = hypergeometricDistribution4.getSampleSize();
        double double11 = hypergeometricDistribution4.getNumericalMean();
        double double13 = hypergeometricDistribution4.cumulativeProbability((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.35d + "'", double11 == 0.35d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 0, 24, 20);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: population size (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        double double12 = hypergeometricDistribution4.cumulativeProbability((int) ' ');
        double double13 = hypergeometricDistribution4.calculateNumericalVariance();
        int int14 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double16 = hypergeometricDistribution4.probability((int) '4');
        double double18 = hypergeometricDistribution4.cumulativeProbability((int) '#');
        double double20 = hypergeometricDistribution4.cumulativeProbability((int) '4');
        int int21 = hypergeometricDistribution4.getSupportUpperBound();
        double double23 = hypergeometricDistribution4.probability((int) (byte) 100);
        double double24 = hypergeometricDistribution4.getNumericalVariance();
        double double26 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double27 = hypergeometricDistribution4.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2275d + "'", double13 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.2275d + "'", double24 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.0d + "'", double26 == 1.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.35d + "'", double27 == 0.35d);
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 20, (int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: number of successes (-1)");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution4.isSupportConnected();
        double double7 = hypergeometricDistribution4.getNumericalVariance();
        double double8 = hypergeometricDistribution4.getNumericalMean();
        double double10 = hypergeometricDistribution4.upperCumulativeProbability(100);
        double double12 = hypergeometricDistribution4.upperCumulativeProbability(0);
        double double13 = hypergeometricDistribution4.getNumericalVariance();
        double double15 = hypergeometricDistribution4.cumulativeProbability(0);
        boolean boolean16 = hypergeometricDistribution4.isSupportConnected();
        double double18 = hypergeometricDistribution4.probability((-1));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.35d + "'", double8 == 0.35d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2275d + "'", double13 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.6500000000000004d + "'", double15 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double9 = hypergeometricDistribution4.cumulativeProbability(0, (int) 'a');
        double double11 = hypergeometricDistribution4.cumulativeProbability((-1));
        double double13 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 1);
        java.lang.Class<?> wildcardClass14 = hypergeometricDistribution4.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.34999999999999964d + "'", double9 == 0.34999999999999964d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.3500000000000001d + "'", double13 == 0.3500000000000001d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getPopulationSize();
        boolean boolean7 = hypergeometricDistribution4.isSupportConnected();
        double double10 = hypergeometricDistribution4.cumulativeProbability(1, (int) '#');
        java.lang.Class<?> wildcardClass11 = hypergeometricDistribution4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        int int7 = hypergeometricDistribution4.getNumberOfSuccesses();
        boolean boolean8 = hypergeometricDistribution4.isSupportConnected();
        double double10 = hypergeometricDistribution4.probability(35);
        double double13 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1, 1);
        double double14 = hypergeometricDistribution4.calculateNumericalVariance();
        boolean boolean15 = hypergeometricDistribution4.isSupportConnected();
        int int16 = hypergeometricDistribution4.getSampleSize();
        double double18 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.2275d + "'", double14 == 0.2275d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.6500000000000004d + "'", double18 == 0.6500000000000004d);
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, 35, 0);
        int int4 = hypergeometricDistribution3.getSupportLowerBound();
        hypergeometricDistribution3.reseedRandomGenerator(100L);
        boolean boolean7 = hypergeometricDistribution3.isSupportConnected();
        int int8 = hypergeometricDistribution3.getSupportUpperBound();
        double double10 = hypergeometricDistribution3.probability(20);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        double double12 = hypergeometricDistribution4.cumulativeProbability((int) ' ');
        int int14 = hypergeometricDistribution4.inverseCumulativeProbability((double) 1L);
        double double16 = hypergeometricDistribution4.cumulativeProbability((int) (short) -1);
        double double17 = hypergeometricDistribution4.getNumericalMean();
        int int19 = hypergeometricDistribution4.inverseCumulativeProbability((double) 0L);
        int int20 = hypergeometricDistribution4.getPopulationSize();
        double double22 = hypergeometricDistribution4.cumulativeProbability(7);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.35d + "'", double17 == 0.35d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 97, (int) '#', (int) 'a');
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 52, (int) (byte) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: sample size (100) must be less than or equal to population size (52)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) ' ', (int) ' ', (int) (byte) 1);
        int int4 = hypergeometricDistribution3.getSampleSize();
        int int5 = hypergeometricDistribution3.getSampleSize();
        int int6 = hypergeometricDistribution3.sample();
        double double8 = hypergeometricDistribution3.cumulativeProbability((int) '4');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.cumulativeProbability(0);
        int int7 = hypergeometricDistribution4.getSupportLowerBound();
        int int8 = hypergeometricDistribution4.getSupportUpperBound();
        boolean boolean9 = hypergeometricDistribution4.isSupportConnected();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        double double12 = hypergeometricDistribution4.cumulativeProbability((int) ' ');
        double double13 = hypergeometricDistribution4.calculateNumericalVariance();
        double double14 = hypergeometricDistribution4.getNumericalVariance();
        double double16 = hypergeometricDistribution4.probability((int) (short) 10);
        int int17 = hypergeometricDistribution4.getPopulationSize();
        double double18 = hypergeometricDistribution4.calculateNumericalVariance();
        int int19 = hypergeometricDistribution4.getNumberOfSuccesses();
        java.lang.Class<?> wildcardClass20 = hypergeometricDistribution4.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2275d + "'", double13 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.2275d + "'", double14 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.2275d + "'", double18 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getPopulationSize();
        boolean boolean7 = hypergeometricDistribution4.isSupportConnected();
        int int8 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int9 = hypergeometricDistribution4.getSampleSize();
        double double10 = hypergeometricDistribution4.getNumericalMean();
        double double11 = hypergeometricDistribution4.getNumericalVariance();
        double double13 = hypergeometricDistribution4.probability(0);
        double double15 = hypergeometricDistribution4.probability((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = hypergeometricDistribution4.sample(97);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.35d + "'", double10 == 0.35d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.2275d + "'", double11 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.6500000000000004d + "'", double13 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) '#', 4, 4);
        double double5 = hypergeometricDistribution4.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.369171668667467d + "'", double5 == 0.369171668667467d);
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double8 = hypergeometricDistribution4.probability((int) 'a');
        int int9 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double10 = hypergeometricDistribution4.getNumericalVariance();
        int int11 = hypergeometricDistribution4.getSupportLowerBound();
        int int12 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int13 = hypergeometricDistribution4.getSupportUpperBound();
        int int14 = hypergeometricDistribution4.getSupportUpperBound();
        int int15 = hypergeometricDistribution4.getSampleSize();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.2275d + "'", double10 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(100, (int) (byte) 0, (int) (short) 10);
        double double4 = hypergeometricDistribution3.getNumericalVariance();
        double double5 = hypergeometricDistribution3.calculateNumericalVariance();
        double double6 = hypergeometricDistribution3.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        int int7 = hypergeometricDistribution4.getNumberOfSuccesses();
        boolean boolean8 = hypergeometricDistribution4.isSupportConnected();
        int int9 = hypergeometricDistribution4.getPopulationSize();
        double double10 = hypergeometricDistribution4.getNumericalVariance();
        double double12 = hypergeometricDistribution4.upperCumulativeProbability((int) (short) 10);
        double double13 = hypergeometricDistribution4.calculateNumericalVariance();
        double double15 = hypergeometricDistribution4.upperCumulativeProbability(35);
        int int16 = hypergeometricDistribution4.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.2275d + "'", double10 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2275d + "'", double13 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getPopulationSize();
        int int8 = hypergeometricDistribution4.inverseCumulativeProbability((double) (byte) 0);
        boolean boolean9 = hypergeometricDistribution4.isSupportConnected();
        double double10 = hypergeometricDistribution4.calculateNumericalVariance();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.2275d + "'", double10 == 0.2275d);
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (short) 100, (int) (short) 1, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = hypergeometricDistribution3.inverseCumulativeProbability((double) 97);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: 97 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(4, 0, (int) (byte) 0);
        double double4 = hypergeometricDistribution3.getNumericalMean();
        int int5 = hypergeometricDistribution3.getSupportUpperBound();
        int int6 = hypergeometricDistribution3.sample();
        double double8 = hypergeometricDistribution3.upperCumulativeProbability((int) ' ');
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double7 = hypergeometricDistribution4.calculateNumericalVariance();
        double double10 = hypergeometricDistribution4.cumulativeProbability((int) (byte) -1, (int) '#');
        double double12 = hypergeometricDistribution4.probability((int) (byte) 0);
        int int13 = hypergeometricDistribution4.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.6500000000000004d + "'", double12 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        int int11 = hypergeometricDistribution4.getSupportUpperBound();
        int int13 = hypergeometricDistribution4.inverseCumulativeProbability((double) 1L);
        int int14 = hypergeometricDistribution4.getSupportLowerBound();
        int int15 = hypergeometricDistribution4.getPopulationSize();
        java.lang.Class<?> wildcardClass16 = hypergeometricDistribution4.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) ' ', (int) ' ', (int) (byte) 1);
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (short) 0);
        hypergeometricDistribution3.reseedRandomGenerator((long) '#');
        double double9 = hypergeometricDistribution3.cumulativeProbability((int) '#');
        boolean boolean10 = hypergeometricDistribution3.isSupportConnected();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, 35, 0);
        double double6 = hypergeometricDistribution3.cumulativeProbability((-1), (int) (short) -1);
        double double8 = hypergeometricDistribution3.probability(1);
        int int9 = hypergeometricDistribution3.getSupportUpperBound();
        boolean boolean10 = hypergeometricDistribution3.isSupportConnected();
        double double12 = hypergeometricDistribution3.cumulativeProbability((int) '#');
        double double15 = hypergeometricDistribution3.cumulativeProbability((int) (short) -1, 1);
        double double16 = hypergeometricDistribution3.calculateNumericalVariance();
        java.lang.Class<?> wildcardClass17 = hypergeometricDistribution3.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double8 = hypergeometricDistribution4.probability((int) 'a');
        boolean boolean9 = hypergeometricDistribution4.isSupportConnected();
        double double11 = hypergeometricDistribution4.upperCumulativeProbability(32);
        int int12 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int13 = hypergeometricDistribution4.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (byte) 100, (int) ' ', 100);
        int int5 = hypergeometricDistribution4.getPopulationSize();
        double double6 = hypergeometricDistribution4.calculateNumericalVariance();
        int int7 = hypergeometricDistribution4.getPopulationSize();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution4.isSupportConnected();
        double double7 = hypergeometricDistribution4.getNumericalVariance();
        double double10 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1, (int) 'a');
        double double12 = hypergeometricDistribution4.upperCumulativeProbability((-1));
        double double13 = hypergeometricDistribution4.getNumericalVariance();
        double double15 = hypergeometricDistribution4.upperCumulativeProbability(10);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = hypergeometricDistribution4.sample();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2275d + "'", double13 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (short) 100, (int) ' ', 24);
        int int4 = hypergeometricDistribution3.sample();
// flaky "1) test2637(org.apache.commons.math3.distribution.RegressionTest5)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 32, (int) (short) 0, (int) (byte) 0);
        double double5 = hypergeometricDistribution4.calculateNumericalVariance();
        double double7 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.calculateNumericalVariance();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getPopulationSize();
        boolean boolean7 = hypergeometricDistribution4.isSupportConnected();
        int int8 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int9 = hypergeometricDistribution4.getSampleSize();
        double double10 = hypergeometricDistribution4.getNumericalMean();
        double double11 = hypergeometricDistribution4.getNumericalVariance();
        double double13 = hypergeometricDistribution4.probability(0);
        int int14 = hypergeometricDistribution4.getSampleSize();
        int int15 = hypergeometricDistribution4.getSampleSize();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.35d + "'", double10 == 0.35d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.2275d + "'", double11 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.6500000000000004d + "'", double13 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getPopulationSize();
        int int8 = hypergeometricDistribution4.inverseCumulativeProbability((double) (byte) 0);
        double double9 = hypergeometricDistribution4.getNumericalVariance();
        double double10 = hypergeometricDistribution4.getNumericalMean();
        int int11 = hypergeometricDistribution4.getSupportLowerBound();
        int int12 = hypergeometricDistribution4.getSupportLowerBound();
        int int13 = hypergeometricDistribution4.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.2275d + "'", double9 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.35d + "'", double10 == 0.35d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double8 = hypergeometricDistribution4.probability((int) 'a');
        boolean boolean9 = hypergeometricDistribution4.isSupportConnected();
        double double10 = hypergeometricDistribution4.getNumericalMean();
        double double12 = hypergeometricDistribution4.upperCumulativeProbability(0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.35d + "'", double10 == 0.35d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        boolean boolean5 = hypergeometricDistribution4.isSupportConnected();
        int int6 = hypergeometricDistribution4.getSampleSize();
        double double7 = hypergeometricDistribution4.getNumericalVariance();
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistribution4.reseedRandomGenerator((-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        int int6 = hypergeometricDistribution4.getSupportLowerBound();
        double double7 = hypergeometricDistribution4.getNumericalMean();
        double double8 = hypergeometricDistribution4.getNumericalMean();
        int int9 = hypergeometricDistribution4.getNumberOfSuccesses();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = hypergeometricDistribution4.inverseCumulativeProbability((double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: -1 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.35d + "'", double7 == 0.35d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.35d + "'", double8 == 0.35d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2644");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.probability((int) ' ');
        int int12 = hypergeometricDistribution4.inverseCumulativeProbability(0.34999999999999964d);
        double double15 = hypergeometricDistribution4.cumulativeProbability((int) (short) 10, 10);
        boolean boolean16 = hypergeometricDistribution4.isSupportConnected();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 10, (int) (short) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: number of successes (-1)");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2646");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (short) 10, (int) '#', 4);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: number of successes (35) must be less than or equal to population size (10)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2647");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) ' ', (int) (byte) 0, (int) ' ');
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getPopulationSize();
        double double7 = hypergeometricDistribution4.getNumericalMean();
        double double10 = hypergeometricDistribution4.cumulativeProbability((int) (byte) -1, 1);
        int int11 = hypergeometricDistribution4.getPopulationSize();
        int int12 = hypergeometricDistribution4.getPopulationSize();
        boolean boolean13 = hypergeometricDistribution4.isSupportConnected();
        double double14 = hypergeometricDistribution4.getNumericalMean();
        double double15 = hypergeometricDistribution4.getNumericalMean();
        // The following exception was thrown during execution in test generation
        try {
            int int16 = hypergeometricDistribution4.sample();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.35d + "'", double7 == 0.35d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.35d + "'", double14 == 0.35d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.35d + "'", double15 == 0.35d);
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2649");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getPopulationSize();
        int int8 = hypergeometricDistribution4.inverseCumulativeProbability((double) (byte) 0);
        double double9 = hypergeometricDistribution4.getNumericalVariance();
        double double11 = hypergeometricDistribution4.cumulativeProbability(32);
        int int12 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int13 = hypergeometricDistribution4.getSupportUpperBound();
        double double15 = hypergeometricDistribution4.probability((-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.2275d + "'", double9 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, 35, 0);
        int int4 = hypergeometricDistribution3.getPopulationSize();
        double double5 = hypergeometricDistribution3.getNumericalMean();
        double double6 = hypergeometricDistribution3.getNumericalVariance();
        int int7 = hypergeometricDistribution3.sample();
        int int8 = hypergeometricDistribution3.getSupportUpperBound();
        double double10 = hypergeometricDistribution3.probability((int) (byte) 10);
        hypergeometricDistribution3.reseedRandomGenerator((long) (short) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2651");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int7 = hypergeometricDistribution4.getSupportLowerBound();
        int int8 = hypergeometricDistribution4.getSampleSize();
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (short) 1);
        double double11 = hypergeometricDistribution4.getNumericalVariance();
        double double12 = hypergeometricDistribution4.getNumericalVariance();
        double double13 = hypergeometricDistribution4.getNumericalMean();
        double double14 = hypergeometricDistribution4.getNumericalVariance();
        double double15 = hypergeometricDistribution4.getNumericalMean();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.3500000000000001d + "'", double10 == 0.3500000000000001d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.2275d + "'", double11 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.2275d + "'", double12 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.35d + "'", double13 == 0.35d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.2275d + "'", double14 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.35d + "'", double15 == 0.35d);
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getPopulationSize();
        int int8 = hypergeometricDistribution4.inverseCumulativeProbability((double) (byte) 0);
        double double9 = hypergeometricDistribution4.getNumericalVariance();
        double double11 = hypergeometricDistribution4.upperCumulativeProbability((int) '#');
        double double13 = hypergeometricDistribution4.probability(0);
        boolean boolean14 = hypergeometricDistribution4.isSupportConnected();
        double double16 = hypergeometricDistribution4.upperCumulativeProbability((int) 'a');
        double double17 = hypergeometricDistribution4.calculateNumericalVariance();
        double double19 = hypergeometricDistribution4.upperCumulativeProbability(0);
        // The following exception was thrown during execution in test generation
        try {
            double double22 = hypergeometricDistribution4.cumulativeProbability(32, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (32) must be less than or equal to upper endpoint (10)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.2275d + "'", double9 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.6500000000000004d + "'", double13 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.2275d + "'", double17 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2653");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double7 = hypergeometricDistribution4.calculateNumericalVariance();
        int int9 = hypergeometricDistribution4.inverseCumulativeProbability((double) 0);
        double double10 = hypergeometricDistribution4.calculateNumericalVariance();
        boolean boolean11 = hypergeometricDistribution4.isSupportConnected();
        double double12 = hypergeometricDistribution4.getNumericalVariance();
        double double13 = hypergeometricDistribution4.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.2275d + "'", double10 == 0.2275d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.2275d + "'", double12 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2275d + "'", double13 == 0.2275d);
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2654");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double8 = hypergeometricDistribution4.probability((int) 'a');
        int int9 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double10 = hypergeometricDistribution4.getNumericalVariance();
        int int11 = hypergeometricDistribution4.getSupportLowerBound();
        int int12 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int13 = hypergeometricDistribution4.getSupportUpperBound();
        int int14 = hypergeometricDistribution4.getPopulationSize();
        double double15 = hypergeometricDistribution4.calculateNumericalVariance();
        int int16 = hypergeometricDistribution4.getSupportUpperBound();
        // The following exception was thrown during execution in test generation
        try {
            int int17 = hypergeometricDistribution4.sample();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.2275d + "'", double10 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.2275d + "'", double15 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        double double7 = hypergeometricDistribution4.upperCumulativeProbability((int) (short) -1);
        double double8 = hypergeometricDistribution4.getNumericalVariance();
        int int9 = hypergeometricDistribution4.getSupportUpperBound();
        java.lang.Class<?> wildcardClass10 = hypergeometricDistribution4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.2275d + "'", double8 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2656");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 10, 10, 0);
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2657");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        double double6 = hypergeometricDistribution4.getNumericalMean();
        int int7 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int8 = hypergeometricDistribution4.getSupportUpperBound();
        double double10 = hypergeometricDistribution4.upperCumulativeProbability(35);
        double double11 = hypergeometricDistribution4.calculateNumericalVariance();
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistribution4.reseedRandomGenerator((long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.35d + "'", double6 == 0.35d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.2275d + "'", double11 == 0.2275d);
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2658");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        int int11 = hypergeometricDistribution4.getSupportUpperBound();
        int int12 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double14 = hypergeometricDistribution4.probability((int) (short) 0);
        double double15 = hypergeometricDistribution4.getNumericalVariance();
        double double17 = hypergeometricDistribution4.probability((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistribution4.reseedRandomGenerator((long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.6500000000000004d + "'", double14 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.2275d + "'", double15 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.6500000000000004d + "'", double17 == 0.6500000000000004d);
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2659");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int7 = hypergeometricDistribution4.getSupportLowerBound();
        int int8 = hypergeometricDistribution4.getSampleSize();
        double double9 = hypergeometricDistribution4.getNumericalMean();
        double double10 = hypergeometricDistribution4.getNumericalMean();
        int int11 = hypergeometricDistribution4.getSupportLowerBound();
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistribution4.reseedRandomGenerator((long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.35d + "'", double9 == 0.35d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.35d + "'", double10 == 0.35d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2660");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getPopulationSize();
        int int8 = hypergeometricDistribution4.inverseCumulativeProbability((double) (byte) 0);
        double double9 = hypergeometricDistribution4.getNumericalVariance();
        double double11 = hypergeometricDistribution4.cumulativeProbability(32);
        int int12 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double13 = hypergeometricDistribution4.getNumericalMean();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.2275d + "'", double9 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.35d + "'", double13 == 0.35d);
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2661");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, 35, 0);
        int int4 = hypergeometricDistribution3.getSupportLowerBound();
        hypergeometricDistribution3.reseedRandomGenerator(100L);
        boolean boolean7 = hypergeometricDistribution3.isSupportConnected();
        int int8 = hypergeometricDistribution3.getSupportUpperBound();
        int int10 = hypergeometricDistribution3.inverseCumulativeProbability(0.005038011914198055d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2662");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, 35, 0);
        double double4 = hypergeometricDistribution3.getNumericalMean();
        double double6 = hypergeometricDistribution3.upperCumulativeProbability(0);
        double double7 = hypergeometricDistribution3.calculateNumericalVariance();
        double double8 = hypergeometricDistribution3.getNumericalMean();
        double double9 = hypergeometricDistribution3.calculateNumericalVariance();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2663");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        double double12 = hypergeometricDistribution4.upperCumulativeProbability(1);
        int int13 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double14 = hypergeometricDistribution4.getNumericalMean();
        int int15 = hypergeometricDistribution4.getSupportUpperBound();
        double double16 = hypergeometricDistribution4.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.3500000000000001d + "'", double12 == 0.3500000000000001d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.35d + "'", double14 == 0.35d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.2275d + "'", double16 == 0.2275d);
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2664");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        int int11 = hypergeometricDistribution4.getSupportUpperBound();
        int int13 = hypergeometricDistribution4.inverseCumulativeProbability((double) 1L);
        int int14 = hypergeometricDistribution4.getSampleSize();
        int int15 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int16 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double18 = hypergeometricDistribution4.probability((int) (byte) -1);
        double double20 = hypergeometricDistribution4.upperCumulativeProbability(1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.3500000000000001d + "'", double20 == 0.3500000000000001d);
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2665");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        double double12 = hypergeometricDistribution4.cumulativeProbability((int) ' ');
        double double13 = hypergeometricDistribution4.calculateNumericalVariance();
        int int14 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double16 = hypergeometricDistribution4.probability((int) '4');
        double double18 = hypergeometricDistribution4.cumulativeProbability((int) '#');
        double double20 = hypergeometricDistribution4.cumulativeProbability((int) '4');
        int int21 = hypergeometricDistribution4.getSupportUpperBound();
        double double23 = hypergeometricDistribution4.probability((int) (byte) 100);
        int int24 = hypergeometricDistribution4.getPopulationSize();
        double double26 = hypergeometricDistribution4.probability((int) (short) 1);
        boolean boolean27 = hypergeometricDistribution4.isSupportConnected();
        double double29 = hypergeometricDistribution4.upperCumulativeProbability(32);
        int int30 = hypergeometricDistribution4.getSampleSize();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2275d + "'", double13 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.3500000000000001d + "'", double26 == 0.3500000000000001d);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 35 + "'", int30 == 35);
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2666");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getPopulationSize();
        double double7 = hypergeometricDistribution4.getNumericalMean();
        double double10 = hypergeometricDistribution4.cumulativeProbability((int) (byte) -1, 1);
        double double11 = hypergeometricDistribution4.getNumericalVariance();
        double double12 = hypergeometricDistribution4.calculateNumericalVariance();
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistribution4.reseedRandomGenerator((long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.35d + "'", double7 == 0.35d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.2275d + "'", double11 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.2275d + "'", double12 == 0.2275d);
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2667");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        double double12 = hypergeometricDistribution4.cumulativeProbability((int) ' ');
        int int14 = hypergeometricDistribution4.inverseCumulativeProbability((double) 1L);
        double double16 = hypergeometricDistribution4.cumulativeProbability((int) (short) -1);
        double double19 = hypergeometricDistribution4.cumulativeProbability((int) (short) 10, (int) (short) 100);
        int int20 = hypergeometricDistribution4.getSampleSize();
        double double21 = hypergeometricDistribution4.getNumericalVariance();
        int int22 = hypergeometricDistribution4.getPopulationSize();
        boolean boolean23 = hypergeometricDistribution4.isSupportConnected();
        double double25 = hypergeometricDistribution4.cumulativeProbability(10);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35 + "'", int20 == 35);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.2275d + "'", double21 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2668");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        double double6 = hypergeometricDistribution4.getNumericalMean();
        double double8 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 10);
        int int9 = hypergeometricDistribution4.getSampleSize();
        double double12 = hypergeometricDistribution4.cumulativeProbability(4, (int) '#');
        double double14 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 100);
        int int15 = hypergeometricDistribution4.getSupportLowerBound();
        java.lang.Class<?> wildcardClass16 = hypergeometricDistribution4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.35d + "'", double6 == 0.35d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2669");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        double double12 = hypergeometricDistribution4.cumulativeProbability((int) ' ');
        double double13 = hypergeometricDistribution4.calculateNumericalVariance();
        int int14 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double16 = hypergeometricDistribution4.probability((int) '4');
        double double18 = hypergeometricDistribution4.cumulativeProbability((int) '#');
        int int19 = hypergeometricDistribution4.getPopulationSize();
        double double20 = hypergeometricDistribution4.calculateNumericalVariance();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray22 = hypergeometricDistribution4.sample(52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2275d + "'", double13 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.2275d + "'", double20 == 0.2275d);
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2670");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        int int12 = hypergeometricDistribution4.inverseCumulativeProbability(0.34999999999999964d);
        boolean boolean13 = hypergeometricDistribution4.isSupportConnected();
        double double14 = hypergeometricDistribution4.getNumericalMean();
        double double15 = hypergeometricDistribution4.calculateNumericalVariance();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.35d + "'", double14 == 0.35d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.2275d + "'", double15 == 0.2275d);
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2671");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        double double7 = hypergeometricDistribution4.upperCumulativeProbability((int) (short) -1);
        boolean boolean8 = hypergeometricDistribution4.isSupportConnected();
        double double11 = hypergeometricDistribution4.cumulativeProbability((int) (byte) -1, (int) (short) 10);
        double double13 = hypergeometricDistribution4.upperCumulativeProbability((int) ' ');
        double double15 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = hypergeometricDistribution4.inverseCumulativeProbability((double) '4');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: 52 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2672");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(100, (int) (short) 100, (int) (byte) 0);
        double double4 = hypergeometricDistribution3.calculateNumericalVariance();
        double double7 = hypergeometricDistribution3.cumulativeProbability(0, 100);
        boolean boolean8 = hypergeometricDistribution3.isSupportConnected();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2673");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) 'a', (int) '#', 0);
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2674");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 0, (int) (short) 100, 32);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: population size (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2675");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        double double11 = hypergeometricDistribution4.getNumericalVariance();
        double double13 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double16 = hypergeometricDistribution4.cumulativeProbability(10, (int) 'a');
        int int17 = hypergeometricDistribution4.getSupportUpperBound();
        double double18 = hypergeometricDistribution4.getNumericalMean();
        double double20 = hypergeometricDistribution4.probability((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray22 = hypergeometricDistribution4.sample((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.2275d + "'", double11 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.35d + "'", double18 == 0.35d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.3500000000000001d + "'", double20 == 0.3500000000000001d);
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2676");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 10, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray5 = hypergeometricDistribution3.sample(0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: number of samples (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2677");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int7 = hypergeometricDistribution4.getSupportLowerBound();
        int int8 = hypergeometricDistribution4.getSampleSize();
        double double10 = hypergeometricDistribution4.cumulativeProbability((int) 'a');
        double double12 = hypergeometricDistribution4.cumulativeProbability(1);
        int int13 = hypergeometricDistribution4.getNumberOfSuccesses();
        boolean boolean14 = hypergeometricDistribution4.isSupportConnected();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2678");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(10, (int) (short) 10, (int) (short) 10);
        double double5 = hypergeometricDistribution3.upperCumulativeProbability((int) (byte) 1);
        double double7 = hypergeometricDistribution3.upperCumulativeProbability(97);
        hypergeometricDistribution3.reseedRandomGenerator((long) 'a');
        int int11 = hypergeometricDistribution3.inverseCumulativeProbability(0.6500000000000004d);
        hypergeometricDistribution3.reseedRandomGenerator((long) 24);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2679");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        int int7 = hypergeometricDistribution4.getNumberOfSuccesses();
        boolean boolean8 = hypergeometricDistribution4.isSupportConnected();
        double double10 = hypergeometricDistribution4.probability(35);
        double double11 = hypergeometricDistribution4.getNumericalVariance();
        double double13 = hypergeometricDistribution4.upperCumulativeProbability((int) (short) 10);
        int int14 = hypergeometricDistribution4.getSupportLowerBound();
        int int15 = hypergeometricDistribution4.getSampleSize();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.2275d + "'", double11 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
    }

    @Test
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2680");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int7 = hypergeometricDistribution4.getSupportLowerBound();
        int int8 = hypergeometricDistribution4.getSampleSize();
        double double9 = hypergeometricDistribution4.getNumericalMean();
        int int10 = hypergeometricDistribution4.getPopulationSize();
        double double12 = hypergeometricDistribution4.probability(35);
        double double14 = hypergeometricDistribution4.probability(20);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.35d + "'", double9 == 0.35d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2681");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        int int11 = hypergeometricDistribution4.getSupportUpperBound();
        int int12 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double13 = hypergeometricDistribution4.getNumericalMean();
        int int15 = hypergeometricDistribution4.inverseCumulativeProbability(0.3500000000000001d);
        double double16 = hypergeometricDistribution4.calculateNumericalVariance();
        double double17 = hypergeometricDistribution4.calculateNumericalVariance();
        double double19 = hypergeometricDistribution4.probability((int) (short) 1);
        double double20 = hypergeometricDistribution4.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.35d + "'", double13 == 0.35d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.2275d + "'", double16 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.2275d + "'", double17 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.3500000000000001d + "'", double19 == 0.3500000000000001d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.35d + "'", double20 == 0.35d);
    }

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2682");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 10, 4, 7);
    }

    @Test
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2683");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(10, (int) (short) 10, (int) (short) 10);
        int int4 = hypergeometricDistribution3.getSupportUpperBound();
        int int6 = hypergeometricDistribution3.inverseCumulativeProbability((double) 1);
        double double7 = hypergeometricDistribution3.getNumericalMean();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2684");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        double double11 = hypergeometricDistribution4.getNumericalVariance();
        double double13 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        boolean boolean14 = hypergeometricDistribution4.isSupportConnected();
        double double15 = hypergeometricDistribution4.calculateNumericalVariance();
        int int16 = hypergeometricDistribution4.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.2275d + "'", double11 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.2275d + "'", double15 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2685");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        int int11 = hypergeometricDistribution4.getSupportUpperBound();
        int int12 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double14 = hypergeometricDistribution4.probability((int) (short) 0);
        int int15 = hypergeometricDistribution4.getSupportUpperBound();
        int int17 = hypergeometricDistribution4.inverseCumulativeProbability(0.24984402316337592d);
        double double18 = hypergeometricDistribution4.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.6500000000000004d + "'", double14 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.2275d + "'", double18 == 0.2275d);
    }

    @Test
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2686");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        double double11 = hypergeometricDistribution4.getNumericalVariance();
        double double13 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double16 = hypergeometricDistribution4.cumulativeProbability(10, (int) 'a');
        int int17 = hypergeometricDistribution4.getSupportUpperBound();
        double double18 = hypergeometricDistribution4.getNumericalMean();
        int int19 = hypergeometricDistribution4.getSupportUpperBound();
        // The following exception was thrown during execution in test generation
        try {
            int int20 = hypergeometricDistribution4.sample();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.2275d + "'", double11 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.35d + "'", double18 == 0.35d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2687");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (short) 100, (int) '#', 1);
        int int4 = hypergeometricDistribution3.getNumberOfSuccesses();
        double double6 = hypergeometricDistribution3.probability(100);
        double double8 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 0);
        double double9 = hypergeometricDistribution3.calculateNumericalVariance();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.6500000000000001d + "'", double8 == 0.6500000000000001d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.2275d + "'", double9 == 0.2275d);
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2688");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double8 = hypergeometricDistribution4.probability((int) 'a');
        int int9 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double10 = hypergeometricDistribution4.getNumericalVariance();
        int int12 = hypergeometricDistribution4.inverseCumulativeProbability(0.34999999999999964d);
        int int13 = hypergeometricDistribution4.getSupportLowerBound();
        double double15 = hypergeometricDistribution4.probability((int) '4');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.2275d + "'", double10 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2689");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) ' ', (int) ' ', (int) (byte) 1);
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (short) 0);
        int int6 = hypergeometricDistribution3.getSupportUpperBound();
        double double7 = hypergeometricDistribution3.getNumericalVariance();
        int int8 = hypergeometricDistribution3.getSupportUpperBound();
        // The following exception was thrown during execution in test generation
        try {
            double double11 = hypergeometricDistribution3.cumulativeProbability((int) '#', 6);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (35) must be less than or equal to upper endpoint (6)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2690");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, (int) (byte) 10, (int) (byte) 0);
        int int5 = hypergeometricDistribution4.getSupportLowerBound();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = hypergeometricDistribution4.sample();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2691");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double7 = hypergeometricDistribution4.calculateNumericalVariance();
        int int9 = hypergeometricDistribution4.inverseCumulativeProbability((double) 0);
        int int10 = hypergeometricDistribution4.getSampleSize();
        double double11 = hypergeometricDistribution4.getNumericalVariance();
        double double12 = hypergeometricDistribution4.getNumericalMean();
        int int13 = hypergeometricDistribution4.getPopulationSize();
        int int14 = hypergeometricDistribution4.getSupportUpperBound();
        boolean boolean15 = hypergeometricDistribution4.isSupportConnected();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.2275d + "'", double11 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.35d + "'", double12 == 0.35d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2692");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.cumulativeProbability(0);
        double double7 = hypergeometricDistribution4.calculateNumericalVariance();
        int int8 = hypergeometricDistribution4.getPopulationSize();
        double double10 = hypergeometricDistribution4.probability((int) (byte) -1);
        double double12 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 100);
        double double14 = hypergeometricDistribution4.upperCumulativeProbability((int) 'a');
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2693");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 1, 6, 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: number of successes (6) must be less than or equal to population size (1)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2694");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(16, 0, 7);
    }

    @Test
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2695");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(100, (int) (short) 10, 35);
        int int4 = hypergeometricDistribution3.getSupportLowerBound();
        double double6 = hypergeometricDistribution3.upperCumulativeProbability((int) (short) 100);
        int int7 = hypergeometricDistribution3.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2696");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', 7, (int) '#');
    }

    @Test
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2697");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution4.isSupportConnected();
        double double7 = hypergeometricDistribution4.getNumericalVariance();
        double double10 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1, (int) 'a');
        int int11 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double12 = hypergeometricDistribution4.getNumericalVariance();
        int int13 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int14 = hypergeometricDistribution4.getSupportUpperBound();
        int int15 = hypergeometricDistribution4.getSupportUpperBound();
        double double16 = hypergeometricDistribution4.calculateNumericalVariance();
        double double18 = hypergeometricDistribution4.upperCumulativeProbability(97);
        java.lang.Class<?> wildcardClass19 = hypergeometricDistribution4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.2275d + "'", double12 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.2275d + "'", double16 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2698");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double7 = hypergeometricDistribution4.calculateNumericalVariance();
        double double9 = hypergeometricDistribution4.probability((int) (byte) 100);
        double double11 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test2699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2699");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        double double12 = hypergeometricDistribution4.cumulativeProbability((int) ' ');
        double double13 = hypergeometricDistribution4.calculateNumericalVariance();
        int int14 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double16 = hypergeometricDistribution4.probability((int) '4');
        double double18 = hypergeometricDistribution4.cumulativeProbability((int) '#');
        int int19 = hypergeometricDistribution4.getPopulationSize();
        int int20 = hypergeometricDistribution4.getSampleSize();
        double double22 = hypergeometricDistribution4.probability((int) (byte) 1);
        int int23 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double25 = hypergeometricDistribution4.probability((int) (short) 1);
        double double26 = hypergeometricDistribution4.calculateNumericalVariance();
        int int27 = hypergeometricDistribution4.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2275d + "'", double13 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35 + "'", int20 == 35);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.3500000000000001d + "'", double22 == 0.3500000000000001d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.3500000000000001d + "'", double25 == 0.3500000000000001d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.2275d + "'", double26 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2700");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        double double12 = hypergeometricDistribution4.cumulativeProbability((int) ' ');
        double double13 = hypergeometricDistribution4.calculateNumericalVariance();
        int int14 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double16 = hypergeometricDistribution4.probability((int) '4');
        double double18 = hypergeometricDistribution4.cumulativeProbability((int) '#');
        int int19 = hypergeometricDistribution4.getPopulationSize();
        int int20 = hypergeometricDistribution4.getSampleSize();
        double double22 = hypergeometricDistribution4.probability((int) (byte) 1);
        int int23 = hypergeometricDistribution4.getSampleSize();
        int int24 = hypergeometricDistribution4.getSupportLowerBound();
        double double26 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 0);
        double double27 = hypergeometricDistribution4.calculateNumericalVariance();
        double double29 = hypergeometricDistribution4.cumulativeProbability((int) '#');
        double double30 = hypergeometricDistribution4.calculateNumericalVariance();
        // The following exception was thrown during execution in test generation
        try {
            int int31 = hypergeometricDistribution4.sample();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2275d + "'", double13 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35 + "'", int20 == 35);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.3500000000000001d + "'", double22 == 0.3500000000000001d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 35 + "'", int23 == 35);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.6500000000000004d + "'", double26 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.2275d + "'", double27 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 1.0d + "'", double29 == 1.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.2275d + "'", double30 == 0.2275d);
    }

    @Test
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2701");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, 35, 0);
        double double4 = hypergeometricDistribution3.getNumericalMean();
        double double6 = hypergeometricDistribution3.upperCumulativeProbability((int) (short) 100);
        double double8 = hypergeometricDistribution3.cumulativeProbability(0);
        int int9 = hypergeometricDistribution3.getSupportLowerBound();
        boolean boolean10 = hypergeometricDistribution3.isSupportConnected();
        double double12 = hypergeometricDistribution3.cumulativeProbability(100);
        int int13 = hypergeometricDistribution3.getNumberOfSuccesses();
        int int14 = hypergeometricDistribution3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test2702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2702");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double7 = hypergeometricDistribution4.calculateNumericalVariance();
        double double9 = hypergeometricDistribution4.cumulativeProbability(4);
        double double11 = hypergeometricDistribution4.probability((int) (byte) -1);
        double double13 = hypergeometricDistribution4.upperCumulativeProbability((int) '#');
        double double15 = hypergeometricDistribution4.probability((int) (short) -1);
        double double17 = hypergeometricDistribution4.cumulativeProbability(24);
        double double19 = hypergeometricDistribution4.cumulativeProbability((int) ' ');
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
    }

    @Test
    public void test2703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2703");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 1, (int) '#');
        int int4 = hypergeometricDistribution3.getPopulationSize();
        int int5 = hypergeometricDistribution3.getSampleSize();
        int int6 = hypergeometricDistribution3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test2704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2704");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getPopulationSize();
        boolean boolean7 = hypergeometricDistribution4.isSupportConnected();
        int int8 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int9 = hypergeometricDistribution4.getSampleSize();
        double double11 = hypergeometricDistribution4.cumulativeProbability(0);
        boolean boolean12 = hypergeometricDistribution4.isSupportConnected();
        double double13 = hypergeometricDistribution4.calculateNumericalVariance();
        int int14 = hypergeometricDistribution4.getSampleSize();
        int int15 = hypergeometricDistribution4.getSupportLowerBound();
        double double16 = hypergeometricDistribution4.calculateNumericalVariance();
        double double18 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double20 = hypergeometricDistribution4.probability(100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.6500000000000004d + "'", double11 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2275d + "'", double13 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.2275d + "'", double16 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test2705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2705");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) ' ', (int) ' ', (int) (byte) 1);
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (short) 0);
        double double6 = hypergeometricDistribution3.getNumericalMean();
        double double7 = hypergeometricDistribution3.calculateNumericalVariance();
        double double8 = hypergeometricDistribution3.calculateNumericalVariance();
        int int9 = hypergeometricDistribution3.getNumberOfSuccesses();
        hypergeometricDistribution3.reseedRandomGenerator((long) ' ');
        double double14 = hypergeometricDistribution3.cumulativeProbability((-1), 97);
        int int15 = hypergeometricDistribution3.getSampleSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test2706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2706");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getPopulationSize();
        double double7 = hypergeometricDistribution4.getNumericalMean();
        double double10 = hypergeometricDistribution4.cumulativeProbability((int) (byte) -1, 1);
        double double12 = hypergeometricDistribution4.upperCumulativeProbability((int) '#');
        int int14 = hypergeometricDistribution4.inverseCumulativeProbability(0.15590747020453266d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.35d + "'", double7 == 0.35d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2707");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 16, 6, (int) (byte) 10);
    }

    @Test
    public void test2708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2708");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        int int7 = hypergeometricDistribution4.getNumberOfSuccesses();
        boolean boolean8 = hypergeometricDistribution4.isSupportConnected();
        double double10 = hypergeometricDistribution4.probability(35);
        double double13 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1, 1);
        int int14 = hypergeometricDistribution4.getSupportLowerBound();
        int int15 = hypergeometricDistribution4.getSupportLowerBound();
        int int16 = hypergeometricDistribution4.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2709");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getPopulationSize();
        double double7 = hypergeometricDistribution4.getNumericalMean();
        double double8 = hypergeometricDistribution4.getNumericalMean();
        int int9 = hypergeometricDistribution4.getSupportUpperBound();
        double double10 = hypergeometricDistribution4.getNumericalMean();
        int int11 = hypergeometricDistribution4.getSampleSize();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.35d + "'", double7 == 0.35d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.35d + "'", double8 == 0.35d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.35d + "'", double10 == 0.35d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
    }

    @Test
    public void test2710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2710");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        boolean boolean5 = hypergeometricDistribution4.isSupportConnected();
        int int6 = hypergeometricDistribution4.getSampleSize();
        double double8 = hypergeometricDistribution4.probability((int) (byte) 100);
        double double9 = hypergeometricDistribution4.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.2275d + "'", double9 == 0.2275d);
    }

    @Test
    public void test2711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2711");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        int int7 = hypergeometricDistribution4.getNumberOfSuccesses();
        boolean boolean8 = hypergeometricDistribution4.isSupportConnected();
        int int9 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int10 = hypergeometricDistribution4.getSupportLowerBound();
        int int11 = hypergeometricDistribution4.getPopulationSize();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test2712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2712");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double9 = hypergeometricDistribution4.cumulativeProbability(0, (int) 'a');
        boolean boolean10 = hypergeometricDistribution4.isSupportConnected();
        double double12 = hypergeometricDistribution4.upperCumulativeProbability(100);
        int int13 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double16 = hypergeometricDistribution4.cumulativeProbability((int) (short) 0, 0);
        double double17 = hypergeometricDistribution4.calculateNumericalVariance();
        int int18 = hypergeometricDistribution4.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.34999999999999964d + "'", double9 == 0.34999999999999964d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.2275d + "'", double17 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test2713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2713");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        double double12 = hypergeometricDistribution4.cumulativeProbability((int) ' ');
        double double13 = hypergeometricDistribution4.calculateNumericalVariance();
        int int14 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double16 = hypergeometricDistribution4.probability((int) '4');
        double double18 = hypergeometricDistribution4.cumulativeProbability((int) '#');
        int int19 = hypergeometricDistribution4.getPopulationSize();
        int int20 = hypergeometricDistribution4.getSampleSize();
        double double22 = hypergeometricDistribution4.probability((int) (byte) 1);
        int int23 = hypergeometricDistribution4.getSampleSize();
        int int24 = hypergeometricDistribution4.getSupportLowerBound();
        int int25 = hypergeometricDistribution4.getSupportUpperBound();
        double double26 = hypergeometricDistribution4.getNumericalVariance();
        double double27 = hypergeometricDistribution4.getNumericalVariance();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray29 = hypergeometricDistribution4.sample((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2275d + "'", double13 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35 + "'", int20 == 35);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.3500000000000001d + "'", double22 == 0.3500000000000001d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 35 + "'", int23 == 35);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.2275d + "'", double26 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.2275d + "'", double27 == 0.2275d);
    }

    @Test
    public void test2714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2714");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (byte) 0, (int) (byte) 1, 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: population size (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2715");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        double double12 = hypergeometricDistribution4.cumulativeProbability((int) ' ');
        double double13 = hypergeometricDistribution4.calculateNumericalVariance();
        int int14 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double16 = hypergeometricDistribution4.probability((int) '4');
        double double18 = hypergeometricDistribution4.cumulativeProbability((int) '#');
        int int19 = hypergeometricDistribution4.getPopulationSize();
        int int20 = hypergeometricDistribution4.getSampleSize();
        double double22 = hypergeometricDistribution4.probability((int) (byte) 1);
        int int23 = hypergeometricDistribution4.getSampleSize();
        int int24 = hypergeometricDistribution4.getSupportLowerBound();
        int int25 = hypergeometricDistribution4.getSupportUpperBound();
        double double26 = hypergeometricDistribution4.getNumericalVariance();
        double double27 = hypergeometricDistribution4.getNumericalVariance();
        double double29 = hypergeometricDistribution4.probability((int) (byte) -1);
        double double32 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 0, 24);
        double double34 = hypergeometricDistribution4.probability((int) (short) 10);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2275d + "'", double13 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35 + "'", int20 == 35);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.3500000000000001d + "'", double22 == 0.3500000000000001d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 35 + "'", int23 == 35);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.2275d + "'", double26 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.2275d + "'", double27 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.34999999999999964d + "'", double32 == 0.34999999999999964d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
    }

    @Test
    public void test2716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2716");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        double double11 = hypergeometricDistribution4.getNumericalVariance();
        double double13 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double16 = hypergeometricDistribution4.cumulativeProbability(10, (int) 'a');
        int int17 = hypergeometricDistribution4.getSupportLowerBound();
        boolean boolean18 = hypergeometricDistribution4.isSupportConnected();
        int int19 = hypergeometricDistribution4.getSampleSize();
        int int20 = hypergeometricDistribution4.getSampleSize();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.2275d + "'", double11 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 35 + "'", int19 == 35);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35 + "'", int20 == 35);
    }

    @Test
    public void test2717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2717");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        int int6 = hypergeometricDistribution4.getSupportLowerBound();
        boolean boolean7 = hypergeometricDistribution4.isSupportConnected();
        int int8 = hypergeometricDistribution4.getSupportLowerBound();
        double double10 = hypergeometricDistribution4.probability((int) (byte) 0);
        boolean boolean11 = hypergeometricDistribution4.isSupportConnected();
        double double13 = hypergeometricDistribution4.probability((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = hypergeometricDistribution4.sample();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.6500000000000004d + "'", double10 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.3500000000000001d + "'", double13 == 0.3500000000000001d);
    }

    @Test
    public void test2718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2718");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 10, (int) (byte) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: number of samples (-1)");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2719");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) -1, 4, 20);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: population size (-1)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2720");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double7 = hypergeometricDistribution4.calculateNumericalVariance();
        int int9 = hypergeometricDistribution4.inverseCumulativeProbability((double) 0);
        int int10 = hypergeometricDistribution4.getSampleSize();
        double double11 = hypergeometricDistribution4.getNumericalVariance();
        double double12 = hypergeometricDistribution4.getNumericalMean();
        int int13 = hypergeometricDistribution4.getPopulationSize();
        int int14 = hypergeometricDistribution4.getPopulationSize();
        int int15 = hypergeometricDistribution4.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.2275d + "'", double11 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.35d + "'", double12 == 0.35d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test2721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2721");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double7 = hypergeometricDistribution4.getNumericalMean();
        double double8 = hypergeometricDistribution4.calculateNumericalVariance();
        int int9 = hypergeometricDistribution4.getSampleSize();
        double double10 = hypergeometricDistribution4.calculateNumericalVariance();
        double double12 = hypergeometricDistribution4.probability(0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.35d + "'", double7 == 0.35d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.2275d + "'", double8 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.2275d + "'", double10 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.6500000000000004d + "'", double12 == 0.6500000000000004d);
    }

    @Test
    public void test2722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2722");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        double double12 = hypergeometricDistribution4.cumulativeProbability((int) ' ');
        double double13 = hypergeometricDistribution4.calculateNumericalVariance();
        int int14 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double16 = hypergeometricDistribution4.probability((int) '4');
        double double18 = hypergeometricDistribution4.cumulativeProbability((int) '#');
        double double20 = hypergeometricDistribution4.cumulativeProbability((int) '4');
        int int21 = hypergeometricDistribution4.getSupportUpperBound();
        double double23 = hypergeometricDistribution4.probability((int) (byte) 100);
        int int24 = hypergeometricDistribution4.getPopulationSize();
        int int25 = hypergeometricDistribution4.getPopulationSize();
        int int26 = hypergeometricDistribution4.getSampleSize();
        boolean boolean27 = hypergeometricDistribution4.isSupportConnected();
        double double29 = hypergeometricDistribution4.probability(4);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2275d + "'", double13 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 35 + "'", int26 == 35);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
    }

    @Test
    public void test2723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2723");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution4.isSupportConnected();
        double double7 = hypergeometricDistribution4.getNumericalVariance();
        double double8 = hypergeometricDistribution4.getNumericalMean();
        double double10 = hypergeometricDistribution4.upperCumulativeProbability(100);
        double double12 = hypergeometricDistribution4.upperCumulativeProbability(0);
        java.lang.Class<?> wildcardClass13 = hypergeometricDistribution4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.35d + "'", double8 == 0.35d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2724");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        double double12 = hypergeometricDistribution4.cumulativeProbability((int) ' ');
        int int14 = hypergeometricDistribution4.inverseCumulativeProbability((double) 1L);
        double double16 = hypergeometricDistribution4.cumulativeProbability((int) (short) -1);
        double double19 = hypergeometricDistribution4.cumulativeProbability((int) (short) 10, (int) (short) 100);
        int int20 = hypergeometricDistribution4.getSampleSize();
        double double21 = hypergeometricDistribution4.getNumericalVariance();
        int int22 = hypergeometricDistribution4.getPopulationSize();
        double double23 = hypergeometricDistribution4.calculateNumericalVariance();
        int int24 = hypergeometricDistribution4.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35 + "'", int20 == 35);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.2275d + "'", double21 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.2275d + "'", double23 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test2725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2725");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 100, (int) '#', (int) (byte) 1);
        java.lang.Class<?> wildcardClass5 = hypergeometricDistribution4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2726");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution4.isSupportConnected();
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (short) 10);
        double double9 = hypergeometricDistribution4.getNumericalVariance();
        int int11 = hypergeometricDistribution4.inverseCumulativeProbability(0.35d);
        double double13 = hypergeometricDistribution4.upperCumulativeProbability(10);
        int int14 = hypergeometricDistribution4.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.2275d + "'", double9 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test2727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2727");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        int int7 = hypergeometricDistribution4.getNumberOfSuccesses();
        boolean boolean8 = hypergeometricDistribution4.isSupportConnected();
        int int9 = hypergeometricDistribution4.getPopulationSize();
        double double12 = hypergeometricDistribution4.cumulativeProbability(1, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = hypergeometricDistribution4.inverseCumulativeProbability((double) 6);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: 6 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test2728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2728");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        int int11 = hypergeometricDistribution4.getSupportUpperBound();
        int int13 = hypergeometricDistribution4.inverseCumulativeProbability((double) 1L);
        int int14 = hypergeometricDistribution4.getSupportLowerBound();
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistribution4.reseedRandomGenerator((long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2729");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        int int11 = hypergeometricDistribution4.getSupportUpperBound();
        int int13 = hypergeometricDistribution4.inverseCumulativeProbability((double) 1L);
        int int14 = hypergeometricDistribution4.getSampleSize();
        double double16 = hypergeometricDistribution4.cumulativeProbability(0);
        int int17 = hypergeometricDistribution4.getSupportUpperBound();
        int int18 = hypergeometricDistribution4.getPopulationSize();
        double double19 = hypergeometricDistribution4.calculateNumericalVariance();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.6500000000000004d + "'", double16 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.2275d + "'", double19 == 0.2275d);
    }

    @Test
    public void test2730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2730");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        double double12 = hypergeometricDistribution4.cumulativeProbability((int) ' ');
        double double13 = hypergeometricDistribution4.calculateNumericalVariance();
        int int14 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double16 = hypergeometricDistribution4.probability((int) '4');
        double double18 = hypergeometricDistribution4.cumulativeProbability((int) '#');
        int int19 = hypergeometricDistribution4.getPopulationSize();
        int int20 = hypergeometricDistribution4.getSampleSize();
        double double22 = hypergeometricDistribution4.probability((int) (byte) 1);
        int int23 = hypergeometricDistribution4.getSampleSize();
        int int24 = hypergeometricDistribution4.getSupportLowerBound();
        double double26 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 0);
        int int27 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int28 = hypergeometricDistribution4.getPopulationSize();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2275d + "'", double13 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35 + "'", int20 == 35);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.3500000000000001d + "'", double22 == 0.3500000000000001d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 35 + "'", int23 == 35);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.6500000000000004d + "'", double26 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
    }

    @Test
    public void test2731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2731");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        double double12 = hypergeometricDistribution4.cumulativeProbability((int) ' ');
        double double13 = hypergeometricDistribution4.calculateNumericalVariance();
        int int14 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double16 = hypergeometricDistribution4.probability((int) '4');
        double double18 = hypergeometricDistribution4.cumulativeProbability((int) '#');
        double double20 = hypergeometricDistribution4.cumulativeProbability((int) '4');
        int int21 = hypergeometricDistribution4.getSupportUpperBound();
        double double23 = hypergeometricDistribution4.probability((int) (byte) 100);
        int int24 = hypergeometricDistribution4.getPopulationSize();
        double double26 = hypergeometricDistribution4.probability((int) (short) 1);
        int int27 = hypergeometricDistribution4.getSampleSize();
        double double29 = hypergeometricDistribution4.probability(100);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray31 = hypergeometricDistribution4.sample(52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2275d + "'", double13 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.3500000000000001d + "'", double26 == 0.3500000000000001d);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 35 + "'", int27 == 35);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
    }

    @Test
    public void test2732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2732");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        int int11 = hypergeometricDistribution4.getSupportUpperBound();
        int int12 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double14 = hypergeometricDistribution4.probability(0);
        double double16 = hypergeometricDistribution4.upperCumulativeProbability((int) (short) -1);
        int int17 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double18 = hypergeometricDistribution4.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.6500000000000004d + "'", double14 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.35d + "'", double18 == 0.35d);
    }

    @Test
    public void test2733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2733");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getPopulationSize();
        int int8 = hypergeometricDistribution4.inverseCumulativeProbability((double) (byte) 0);
        double double9 = hypergeometricDistribution4.getNumericalVariance();
        double double11 = hypergeometricDistribution4.upperCumulativeProbability((int) '#');
        double double13 = hypergeometricDistribution4.probability(0);
        boolean boolean14 = hypergeometricDistribution4.isSupportConnected();
        double double15 = hypergeometricDistribution4.calculateNumericalVariance();
        int int16 = hypergeometricDistribution4.getSampleSize();
        int int17 = hypergeometricDistribution4.getSupportLowerBound();
        // The following exception was thrown during execution in test generation
        try {
            int int18 = hypergeometricDistribution4.sample();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.2275d + "'", double9 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.6500000000000004d + "'", double13 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.2275d + "'", double15 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2734");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, 35, 0);
        double double4 = hypergeometricDistribution3.getNumericalMean();
        double double6 = hypergeometricDistribution3.upperCumulativeProbability(0);
        int int7 = hypergeometricDistribution3.getSampleSize();
        double double8 = hypergeometricDistribution3.getNumericalVariance();
        int int10 = hypergeometricDistribution3.inverseCumulativeProbability((double) 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2735");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double7 = hypergeometricDistribution4.calculateNumericalVariance();
        int int8 = hypergeometricDistribution4.getSupportLowerBound();
        double double9 = hypergeometricDistribution4.getNumericalVariance();
        double double10 = hypergeometricDistribution4.getNumericalMean();
        double double12 = hypergeometricDistribution4.upperCumulativeProbability(100);
        double double13 = hypergeometricDistribution4.getNumericalMean();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.2275d + "'", double9 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.35d + "'", double10 == 0.35d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.35d + "'", double13 == 0.35d);
    }

    @Test
    public void test2736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2736");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 0, (int) ' ', 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: population size (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2737");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        int int11 = hypergeometricDistribution4.getSupportUpperBound();
        int int12 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double14 = hypergeometricDistribution4.cumulativeProbability((int) (short) 1);
        double double15 = hypergeometricDistribution4.getNumericalMean();
        double double16 = hypergeometricDistribution4.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.35d + "'", double15 == 0.35d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.2275d + "'", double16 == 0.2275d);
    }

    @Test
    public void test2738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2738");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (short) 10, 10, 1);
        int int4 = hypergeometricDistribution3.getSupportLowerBound();
        int int5 = hypergeometricDistribution3.getNumberOfSuccesses();
        int int6 = hypergeometricDistribution3.getNumberOfSuccesses();
        double double7 = hypergeometricDistribution3.calculateNumericalVariance();
        double double9 = hypergeometricDistribution3.upperCumulativeProbability(35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test2739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2739");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (short) 100, (int) (byte) 0, (int) (short) 0);
        double double4 = hypergeometricDistribution3.getNumericalVariance();
        hypergeometricDistribution3.reseedRandomGenerator((long) 97);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test2740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2740");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((-1), (int) ' ', 7);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: population size (-1)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2741");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (byte) 0, (int) (byte) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: population size (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2742");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getPopulationSize();
        int int8 = hypergeometricDistribution4.inverseCumulativeProbability((double) (byte) 0);
        double double9 = hypergeometricDistribution4.getNumericalVariance();
        double double11 = hypergeometricDistribution4.cumulativeProbability(32);
        int int12 = hypergeometricDistribution4.getSampleSize();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.2275d + "'", double9 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
    }

    @Test
    public void test2743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2743");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        int int7 = hypergeometricDistribution4.getNumberOfSuccesses();
        boolean boolean8 = hypergeometricDistribution4.isSupportConnected();
        int int9 = hypergeometricDistribution4.getPopulationSize();
        double double12 = hypergeometricDistribution4.cumulativeProbability(1, (int) (byte) 10);
        int int13 = hypergeometricDistribution4.getSampleSize();
        double double14 = hypergeometricDistribution4.getNumericalVariance();
        int int15 = hypergeometricDistribution4.getSupportLowerBound();
        int int16 = hypergeometricDistribution4.getSupportUpperBound();
        int int18 = hypergeometricDistribution4.inverseCumulativeProbability(0.34999999999999964d);
        double double19 = hypergeometricDistribution4.getNumericalVariance();
        int int20 = hypergeometricDistribution4.getPopulationSize();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.2275d + "'", double14 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.2275d + "'", double19 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
    }

    @Test
    public void test2744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2744");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getPopulationSize();
        double double7 = hypergeometricDistribution4.getNumericalMean();
        double double10 = hypergeometricDistribution4.cumulativeProbability((int) (byte) -1, 1);
        double double12 = hypergeometricDistribution4.upperCumulativeProbability((int) '#');
        double double14 = hypergeometricDistribution4.cumulativeProbability(24);
        boolean boolean15 = hypergeometricDistribution4.isSupportConnected();
        // The following exception was thrown during execution in test generation
        try {
            int int16 = hypergeometricDistribution4.sample();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.35d + "'", double7 == 0.35d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test2745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2745");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) 'a', (int) (short) 1, 24);
        double double5 = hypergeometricDistribution4.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.24742268041237114d + "'", double5 == 0.24742268041237114d);
    }

    @Test
    public void test2746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2746");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        boolean boolean5 = hypergeometricDistribution4.isSupportConnected();
        int int6 = hypergeometricDistribution4.getSampleSize();
        int int7 = hypergeometricDistribution4.getSampleSize();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = hypergeometricDistribution4.inverseCumulativeProbability((double) 100L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: 100 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
    }

    @Test
    public void test2747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2747");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, 35, 0);
        double double4 = hypergeometricDistribution3.getNumericalMean();
        double double6 = hypergeometricDistribution3.upperCumulativeProbability((int) (short) 100);
        double double8 = hypergeometricDistribution3.cumulativeProbability(0);
        int int9 = hypergeometricDistribution3.getSupportLowerBound();
        boolean boolean10 = hypergeometricDistribution3.isSupportConnected();
        double double12 = hypergeometricDistribution3.cumulativeProbability(100);
        double double14 = hypergeometricDistribution3.cumulativeProbability(0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
    }

    @Test
    public void test2748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2748");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(100, (int) ' ', (int) '#');
        int int4 = hypergeometricDistribution3.getSupportLowerBound();
        double double6 = hypergeometricDistribution3.probability((int) (short) 10);
        double double8 = hypergeometricDistribution3.probability((int) '#');
        int[] intArray10 = hypergeometricDistribution3.sample(20);
        double double11 = hypergeometricDistribution3.getNumericalMean();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.15590747020453266d + "'", double6 == 0.15590747020453266d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(intArray10);
// flaky "2) test2748(org.apache.commons.math3.distribution.RegressionTest5)":         org.junit.Assert.assertArrayEquals(intArray10, new int[] { 10, 13, 15, 10, 10, 12, 13, 9, 13, 11, 10, 11, 11, 3, 11, 8, 10, 11, 11, 12 });
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 11.2d + "'", double11 == 11.2d);
    }

    @Test
    public void test2749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2749");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getPopulationSize();
        int int8 = hypergeometricDistribution4.inverseCumulativeProbability((double) (byte) 0);
        double double9 = hypergeometricDistribution4.getNumericalVariance();
        double double11 = hypergeometricDistribution4.upperCumulativeProbability((int) '#');
        boolean boolean12 = hypergeometricDistribution4.isSupportConnected();
        double double13 = hypergeometricDistribution4.getNumericalVariance();
        int int14 = hypergeometricDistribution4.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.2275d + "'", double9 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2275d + "'", double13 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2750");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        double double12 = hypergeometricDistribution4.cumulativeProbability((int) ' ');
        double double13 = hypergeometricDistribution4.calculateNumericalVariance();
        int int14 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double16 = hypergeometricDistribution4.probability((int) '4');
        double double18 = hypergeometricDistribution4.cumulativeProbability((int) '#');
        double double20 = hypergeometricDistribution4.cumulativeProbability((int) '4');
        int int21 = hypergeometricDistribution4.getSupportUpperBound();
        double double22 = hypergeometricDistribution4.getNumericalMean();
        double double24 = hypergeometricDistribution4.cumulativeProbability((int) '#');
        double double26 = hypergeometricDistribution4.upperCumulativeProbability(20);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2275d + "'", double13 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.35d + "'", double22 == 0.35d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0d + "'", double24 == 1.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
    }

    @Test
    public void test2751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2751");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 100, (int) (byte) 10, (int) ' ');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2752");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        double double12 = hypergeometricDistribution4.cumulativeProbability((int) ' ');
        int int14 = hypergeometricDistribution4.inverseCumulativeProbability((double) 1L);
        double double16 = hypergeometricDistribution4.cumulativeProbability((int) (short) -1);
        double double17 = hypergeometricDistribution4.getNumericalVariance();
        int int18 = hypergeometricDistribution4.getSupportLowerBound();
        double double20 = hypergeometricDistribution4.probability((int) (short) 10);
        int int21 = hypergeometricDistribution4.getSupportLowerBound();
        // The following exception was thrown during execution in test generation
        try {
            int int22 = hypergeometricDistribution4.sample();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.2275d + "'", double17 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2753");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 0, (int) (byte) 100, 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: population size (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2754");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 0, 1, 52);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: population size (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2755");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getPopulationSize();
        boolean boolean7 = hypergeometricDistribution4.isSupportConnected();
        int int8 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int9 = hypergeometricDistribution4.getSampleSize();
        double double11 = hypergeometricDistribution4.upperCumulativeProbability(10);
        java.lang.Class<?> wildcardClass12 = hypergeometricDistribution4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2756");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        double double12 = hypergeometricDistribution4.cumulativeProbability((int) ' ');
        double double13 = hypergeometricDistribution4.calculateNumericalVariance();
        int int14 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int15 = hypergeometricDistribution4.getSampleSize();
        // The following exception was thrown during execution in test generation
        try {
            int int16 = hypergeometricDistribution4.sample();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2275d + "'", double13 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
    }

    @Test
    public void test2757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2757");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(7, 7, 20);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: sample size (20) must be less than or equal to population size (7)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2758");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        int int11 = hypergeometricDistribution4.getSupportUpperBound();
        int int13 = hypergeometricDistribution4.inverseCumulativeProbability((double) 1L);
        int int14 = hypergeometricDistribution4.getSampleSize();
        int int15 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int16 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double18 = hypergeometricDistribution4.probability((int) (byte) -1);
        double double19 = hypergeometricDistribution4.getNumericalMean();
        boolean boolean20 = hypergeometricDistribution4.isSupportConnected();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.35d + "'", double19 == 0.35d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test2759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2759");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution4.isSupportConnected();
        double double7 = hypergeometricDistribution4.getNumericalVariance();
        int int8 = hypergeometricDistribution4.getSupportUpperBound();
        int int9 = hypergeometricDistribution4.getSupportLowerBound();
        int int10 = hypergeometricDistribution4.getSampleSize();
        int int11 = hypergeometricDistribution4.getSampleSize();
        // The following exception was thrown during execution in test generation
        try {
            double double14 = hypergeometricDistribution4.cumulativeProbability((int) '#', 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (35) must be less than or equal to upper endpoint (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
    }

    @Test
    public void test2760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2760");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        int int11 = hypergeometricDistribution4.getSupportUpperBound();
        int int12 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double13 = hypergeometricDistribution4.getNumericalMean();
        int int15 = hypergeometricDistribution4.inverseCumulativeProbability(0.3500000000000001d);
        double double16 = hypergeometricDistribution4.calculateNumericalVariance();
        double double18 = hypergeometricDistribution4.upperCumulativeProbability((int) '4');
        int int19 = hypergeometricDistribution4.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.35d + "'", double13 == 0.35d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.2275d + "'", double16 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test2761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2761");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        int int6 = hypergeometricDistribution4.getSupportLowerBound();
        boolean boolean7 = hypergeometricDistribution4.isSupportConnected();
        int int8 = hypergeometricDistribution4.getSupportLowerBound();
        double double10 = hypergeometricDistribution4.probability((int) (byte) 0);
        int int11 = hypergeometricDistribution4.getPopulationSize();
        int int12 = hypergeometricDistribution4.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.6500000000000004d + "'", double10 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2762");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int7 = hypergeometricDistribution4.getSupportLowerBound();
        int int8 = hypergeometricDistribution4.getSampleSize();
        double double9 = hypergeometricDistribution4.getNumericalMean();
        double double10 = hypergeometricDistribution4.getNumericalMean();
        int int11 = hypergeometricDistribution4.getSupportLowerBound();
        double double13 = hypergeometricDistribution4.upperCumulativeProbability(52);
        double double14 = hypergeometricDistribution4.calculateNumericalVariance();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.35d + "'", double9 == 0.35d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.35d + "'", double10 == 0.35d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.2275d + "'", double14 == 0.2275d);
    }

    @Test
    public void test2763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2763");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) ' ', (int) ' ', (int) (byte) 1);
        double double4 = hypergeometricDistribution3.getNumericalMean();
        double double6 = hypergeometricDistribution3.upperCumulativeProbability((int) (byte) 0);
        int int7 = hypergeometricDistribution3.getPopulationSize();
        double double8 = hypergeometricDistribution3.getNumericalMean();
        int int9 = hypergeometricDistribution3.getNumberOfSuccesses();
        double double11 = hypergeometricDistribution3.upperCumulativeProbability((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray13 = hypergeometricDistribution3.sample(0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: number of samples (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test2764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2764");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution4.isSupportConnected();
        double double7 = hypergeometricDistribution4.getNumericalVariance();
        int int8 = hypergeometricDistribution4.getSupportUpperBound();
        int int9 = hypergeometricDistribution4.getSupportLowerBound();
        int int10 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int12 = hypergeometricDistribution4.inverseCumulativeProbability(0.23063024763524284d);
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistribution4.reseedRandomGenerator((long) 35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2765");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        double double11 = hypergeometricDistribution4.getNumericalVariance();
        double double13 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        int int14 = hypergeometricDistribution4.getNumberOfSuccesses();
        // The following exception was thrown during execution in test generation
        try {
            int int15 = hypergeometricDistribution4.sample();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.2275d + "'", double11 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test2766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2766");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        int int7 = hypergeometricDistribution4.getNumberOfSuccesses();
        boolean boolean8 = hypergeometricDistribution4.isSupportConnected();
        int int9 = hypergeometricDistribution4.getPopulationSize();
        boolean boolean10 = hypergeometricDistribution4.isSupportConnected();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2767");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (short) 0, 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: population size (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2768");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        double double7 = hypergeometricDistribution4.upperCumulativeProbability(1);
        double double9 = hypergeometricDistribution4.upperCumulativeProbability((int) (short) -1);
        double double10 = hypergeometricDistribution4.getNumericalVariance();
        int int11 = hypergeometricDistribution4.getPopulationSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.3500000000000001d + "'", double7 == 0.3500000000000001d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.2275d + "'", double10 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test2769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2769");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(100, (int) (byte) 1, 52);
        hypergeometricDistribution3.reseedRandomGenerator(10L);
        boolean boolean6 = hypergeometricDistribution3.isSupportConnected();
        int int7 = hypergeometricDistribution3.getSampleSize();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
    }

    @Test
    public void test2770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2770");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) 'a', (int) (short) 1, 24);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = hypergeometricDistribution4.sample();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2771");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        double double12 = hypergeometricDistribution4.cumulativeProbability((int) ' ');
        double double13 = hypergeometricDistribution4.calculateNumericalVariance();
        int int14 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double16 = hypergeometricDistribution4.probability((int) '4');
        double double18 = hypergeometricDistribution4.cumulativeProbability((int) '#');
        double double20 = hypergeometricDistribution4.cumulativeProbability((int) '4');
        double double21 = hypergeometricDistribution4.getNumericalMean();
        double double22 = hypergeometricDistribution4.calculateNumericalVariance();
        double double24 = hypergeometricDistribution4.probability((int) (short) 10);
        boolean boolean25 = hypergeometricDistribution4.isSupportConnected();
        int int26 = hypergeometricDistribution4.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2275d + "'", double13 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.35d + "'", double21 == 0.35d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.2275d + "'", double22 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test2772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2772");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int7 = hypergeometricDistribution4.getSupportLowerBound();
        int int8 = hypergeometricDistribution4.getSampleSize();
        boolean boolean9 = hypergeometricDistribution4.isSupportConnected();
        double double12 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1, (int) ' ');
        double double14 = hypergeometricDistribution4.probability((int) '4');
        double double17 = hypergeometricDistribution4.cumulativeProbability((int) (short) 1, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test2773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2773");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(1, (int) ' ', 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: number of successes (32) must be less than or equal to population size (1)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2774");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(100, (int) (short) 10, 35);
        double double5 = hypergeometricDistribution3.probability(4);
        int int6 = hypergeometricDistribution3.getPopulationSize();
        double double8 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution3.probability((-1));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.24984402316337592d + "'", double5 == 0.24984402316337592d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.07497555421489926d + "'", double8 == 0.07497555421489926d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test2775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2775");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, 35, 0);
        double double4 = hypergeometricDistribution3.getNumericalMean();
        double double6 = hypergeometricDistribution3.probability((int) (short) 1);
        boolean boolean7 = hypergeometricDistribution3.isSupportConnected();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test2776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2776");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getPopulationSize();
        int int8 = hypergeometricDistribution4.inverseCumulativeProbability((double) (byte) 0);
        double double9 = hypergeometricDistribution4.getNumericalVariance();
        double double11 = hypergeometricDistribution4.upperCumulativeProbability((int) '#');
        double double13 = hypergeometricDistribution4.probability(0);
        int int15 = hypergeometricDistribution4.inverseCumulativeProbability(0.0d);
        double double17 = hypergeometricDistribution4.upperCumulativeProbability((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistribution4.reseedRandomGenerator((long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.2275d + "'", double9 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.6500000000000004d + "'", double13 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test2777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2777");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int7 = hypergeometricDistribution4.getSupportLowerBound();
        int int8 = hypergeometricDistribution4.getSampleSize();
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (short) 1);
        double double12 = hypergeometricDistribution4.cumulativeProbability((int) ' ');
        double double13 = hypergeometricDistribution4.calculateNumericalVariance();
        int int14 = hypergeometricDistribution4.getPopulationSize();
        double double15 = hypergeometricDistribution4.calculateNumericalVariance();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.3500000000000001d + "'", double10 == 0.3500000000000001d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2275d + "'", double13 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.2275d + "'", double15 == 0.2275d);
    }

    @Test
    public void test2778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2778");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution4.isSupportConnected();
        double double7 = hypergeometricDistribution4.getNumericalVariance();
        double double10 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1, (int) 'a');
        int int11 = hypergeometricDistribution4.getNumberOfSuccesses();
        boolean boolean12 = hypergeometricDistribution4.isSupportConnected();
        double double13 = hypergeometricDistribution4.getNumericalMean();
        double double14 = hypergeometricDistribution4.getNumericalMean();
        double double16 = hypergeometricDistribution4.cumulativeProbability((int) (short) 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.35d + "'", double13 == 0.35d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.35d + "'", double14 == 0.35d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test2779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2779");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 35, 35, (int) (byte) 10);
    }

    @Test
    public void test2780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2780");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        double double12 = hypergeometricDistribution4.cumulativeProbability((int) ' ');
        int int14 = hypergeometricDistribution4.inverseCumulativeProbability((double) 1L);
        double double16 = hypergeometricDistribution4.cumulativeProbability((int) (short) -1);
        double double19 = hypergeometricDistribution4.cumulativeProbability((int) (short) 10, (int) (short) 100);
        int int20 = hypergeometricDistribution4.getSampleSize();
        double double21 = hypergeometricDistribution4.getNumericalVariance();
        double double22 = hypergeometricDistribution4.getNumericalMean();
        int int23 = hypergeometricDistribution4.getSampleSize();
        boolean boolean24 = hypergeometricDistribution4.isSupportConnected();
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistribution4.reseedRandomGenerator((long) 7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35 + "'", int20 == 35);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.2275d + "'", double21 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.35d + "'", double22 == 0.35d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 35 + "'", int23 == 35);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test2781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2781");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getPopulationSize();
        boolean boolean7 = hypergeometricDistribution4.isSupportConnected();
        double double9 = hypergeometricDistribution4.probability((int) 'a');
        int int11 = hypergeometricDistribution4.inverseCumulativeProbability((double) 0);
        int int13 = hypergeometricDistribution4.inverseCumulativeProbability(0.369171668667467d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2782");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.cumulativeProbability(0);
        int int7 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int8 = hypergeometricDistribution4.getSampleSize();
        int int9 = hypergeometricDistribution4.getSupportUpperBound();
        boolean boolean10 = hypergeometricDistribution4.isSupportConnected();
        int int11 = hypergeometricDistribution4.getPopulationSize();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test2783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2783");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        double double12 = hypergeometricDistribution4.cumulativeProbability((int) ' ');
        int int14 = hypergeometricDistribution4.inverseCumulativeProbability((double) 1L);
        double double16 = hypergeometricDistribution4.cumulativeProbability((int) (short) -1);
        double double19 = hypergeometricDistribution4.cumulativeProbability((int) (short) 10, (int) (short) 100);
        int int20 = hypergeometricDistribution4.getSampleSize();
        double double21 = hypergeometricDistribution4.getNumericalVariance();
        double double22 = hypergeometricDistribution4.getNumericalMean();
        int int23 = hypergeometricDistribution4.getSampleSize();
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistribution4.reseedRandomGenerator((long) 97);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35 + "'", int20 == 35);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.2275d + "'", double21 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.35d + "'", double22 == 0.35d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 35 + "'", int23 == 35);
    }

    @Test
    public void test2784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2784");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution4.isSupportConnected();
        double double7 = hypergeometricDistribution4.getNumericalVariance();
        double double8 = hypergeometricDistribution4.getNumericalMean();
        double double9 = hypergeometricDistribution4.getNumericalMean();
        double double10 = hypergeometricDistribution4.calculateNumericalVariance();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.35d + "'", double8 == 0.35d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.35d + "'", double9 == 0.35d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.2275d + "'", double10 == 0.2275d);
    }

    @Test
    public void test2785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2785");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        int int7 = hypergeometricDistribution4.getNumberOfSuccesses();
        boolean boolean8 = hypergeometricDistribution4.isSupportConnected();
        int int9 = hypergeometricDistribution4.getPopulationSize();
        double double12 = hypergeometricDistribution4.cumulativeProbability(1, (int) (byte) 10);
        double double13 = hypergeometricDistribution4.getNumericalMean();
        double double14 = hypergeometricDistribution4.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.35d + "'", double13 == 0.35d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.35d + "'", double14 == 0.35d);
    }

    @Test
    public void test2786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2786");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 35, (int) (short) 1, (int) (byte) 0);
        double double5 = hypergeometricDistribution4.calculateNumericalVariance();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test2787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2787");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 35, 52, 7);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: number of successes (52) must be less than or equal to population size (35)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2788");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(4, 0, (int) (byte) 0);
        hypergeometricDistribution3.reseedRandomGenerator((long) '#');
        int int6 = hypergeometricDistribution3.getSupportLowerBound();
        double double9 = hypergeometricDistribution3.cumulativeProbability(32, (int) '#');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test2789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2789");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getPopulationSize();
        boolean boolean7 = hypergeometricDistribution4.isSupportConnected();
        double double8 = hypergeometricDistribution4.getNumericalMean();
        double double10 = hypergeometricDistribution4.cumulativeProbability(35);
        int int11 = hypergeometricDistribution4.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.35d + "'", double8 == 0.35d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test2790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2790");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 20, (int) '#', 6);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: number of successes (35) must be less than or equal to population size (20)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2791");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double7 = hypergeometricDistribution4.calculateNumericalVariance();
        double double9 = hypergeometricDistribution4.cumulativeProbability(4);
        boolean boolean10 = hypergeometricDistribution4.isSupportConnected();
        double double11 = hypergeometricDistribution4.getNumericalVariance();
        int int12 = hypergeometricDistribution4.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.2275d + "'", double11 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2792");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, (int) (byte) 100, (int) (byte) 100);
        int int4 = hypergeometricDistribution3.getSampleSize();
        int int5 = hypergeometricDistribution3.getSampleSize();
        int int6 = hypergeometricDistribution3.getSampleSize();
        int int7 = hypergeometricDistribution3.getSampleSize();
        int int8 = hypergeometricDistribution3.getSampleSize();
        double double9 = hypergeometricDistribution3.calculateNumericalVariance();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test2793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2793");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution4.isSupportConnected();
        double double7 = hypergeometricDistribution4.getNumericalVariance();
        int int8 = hypergeometricDistribution4.getSupportUpperBound();
        double double11 = hypergeometricDistribution4.cumulativeProbability(0, (int) (short) 100);
        double double12 = hypergeometricDistribution4.getNumericalMean();
        int int13 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double15 = hypergeometricDistribution4.probability(4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.34999999999999964d + "'", double11 == 0.34999999999999964d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.35d + "'", double12 == 0.35d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test2794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2794");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        double double12 = hypergeometricDistribution4.cumulativeProbability((int) ' ');
        int int14 = hypergeometricDistribution4.inverseCumulativeProbability((double) 1L);
        double double16 = hypergeometricDistribution4.probability((int) (byte) 10);
        double double18 = hypergeometricDistribution4.cumulativeProbability(100);
        double double20 = hypergeometricDistribution4.probability((int) (short) 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.6500000000000004d + "'", double20 == 0.6500000000000004d);
    }

    @Test
    public void test2795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2795");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(100, (int) (short) 100, (int) (short) 10);
        double double4 = hypergeometricDistribution3.getNumericalMean();
        int int6 = hypergeometricDistribution3.inverseCumulativeProbability(0.24984402316337592d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test2796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2796");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, (int) (byte) 100, (int) (byte) 100);
        int int4 = hypergeometricDistribution3.getSampleSize();
        double double6 = hypergeometricDistribution3.cumulativeProbability(0);
        int int7 = hypergeometricDistribution3.getSupportLowerBound();
        int int8 = hypergeometricDistribution3.getNumberOfSuccesses();
        int int9 = hypergeometricDistribution3.getPopulationSize();
        hypergeometricDistribution3.reseedRandomGenerator((long) 24);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test2797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2797");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 10, 6, 0);
    }

    @Test
    public void test2798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2798");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution4.isSupportConnected();
        double double7 = hypergeometricDistribution4.getNumericalVariance();
        double double10 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1, (int) 'a');
        double double12 = hypergeometricDistribution4.upperCumulativeProbability((-1));
        double double13 = hypergeometricDistribution4.getNumericalVariance();
        double double14 = hypergeometricDistribution4.getNumericalMean();
        boolean boolean15 = hypergeometricDistribution4.isSupportConnected();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2275d + "'", double13 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.35d + "'", double14 == 0.35d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test2799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2799");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        int int6 = hypergeometricDistribution4.getSupportLowerBound();
        double double7 = hypergeometricDistribution4.getNumericalMean();
        int int8 = hypergeometricDistribution4.getSampleSize();
        double double9 = hypergeometricDistribution4.calculateNumericalVariance();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.35d + "'", double7 == 0.35d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.2275d + "'", double9 == 0.2275d);
    }

    @Test
    public void test2800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2800");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, (int) (byte) 100, (int) (byte) 100);
        int int4 = hypergeometricDistribution3.getSampleSize();
        double double6 = hypergeometricDistribution3.cumulativeProbability(0);
        int int7 = hypergeometricDistribution3.getSupportLowerBound();
        int int8 = hypergeometricDistribution3.getNumberOfSuccesses();
        double double10 = hypergeometricDistribution3.cumulativeProbability((int) (short) 1);
        double double12 = hypergeometricDistribution3.probability((int) '4');
        double double13 = hypergeometricDistribution3.calculateNumericalVariance();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test2801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2801");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double7 = hypergeometricDistribution4.calculateNumericalVariance();
        int int9 = hypergeometricDistribution4.inverseCumulativeProbability((double) 0);
        double double10 = hypergeometricDistribution4.getNumericalMean();
        double double12 = hypergeometricDistribution4.probability((int) (short) -1);
        boolean boolean13 = hypergeometricDistribution4.isSupportConnected();
        int int14 = hypergeometricDistribution4.getSupportUpperBound();
        int int15 = hypergeometricDistribution4.getSupportUpperBound();
        double double17 = hypergeometricDistribution4.upperCumulativeProbability(20);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.35d + "'", double10 == 0.35d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test2802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2802");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        double double12 = hypergeometricDistribution4.cumulativeProbability((int) ' ');
        double double13 = hypergeometricDistribution4.calculateNumericalVariance();
        int int14 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double16 = hypergeometricDistribution4.probability((int) '4');
        double double18 = hypergeometricDistribution4.cumulativeProbability((int) '#');
        double double20 = hypergeometricDistribution4.cumulativeProbability((int) '4');
        double double21 = hypergeometricDistribution4.getNumericalMean();
        double double22 = hypergeometricDistribution4.calculateNumericalVariance();
        double double24 = hypergeometricDistribution4.probability((int) (short) 10);
        boolean boolean25 = hypergeometricDistribution4.isSupportConnected();
        int int26 = hypergeometricDistribution4.getNumberOfSuccesses();
        java.lang.Class<?> wildcardClass27 = hypergeometricDistribution4.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2275d + "'", double13 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.35d + "'", double21 == 0.35d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.2275d + "'", double22 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2803");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double7 = hypergeometricDistribution4.calculateNumericalVariance();
        int int9 = hypergeometricDistribution4.inverseCumulativeProbability((double) 0);
        double double12 = hypergeometricDistribution4.cumulativeProbability((int) '#', (int) '#');
        boolean boolean13 = hypergeometricDistribution4.isSupportConnected();
        double double15 = hypergeometricDistribution4.probability((int) ' ');
        double double16 = hypergeometricDistribution4.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.35d + "'", double16 == 0.35d);
    }

    @Test
    public void test2804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2804");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) ' ', (int) ' ', (int) (byte) 1);
        double double4 = hypergeometricDistribution3.getNumericalMean();
        double double5 = hypergeometricDistribution3.calculateNumericalVariance();
        int int6 = hypergeometricDistribution3.getSampleSize();
        double double8 = hypergeometricDistribution3.cumulativeProbability(97);
        double double9 = hypergeometricDistribution3.calculateNumericalVariance();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test2805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2805");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        int int11 = hypergeometricDistribution4.getSupportUpperBound();
        int int12 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double14 = hypergeometricDistribution4.cumulativeProbability((int) (short) 1);
        double double16 = hypergeometricDistribution4.upperCumulativeProbability((int) '4');
        int int17 = hypergeometricDistribution4.getSampleSize();
        int int19 = hypergeometricDistribution4.inverseCumulativeProbability((double) (short) 0);
        double double22 = hypergeometricDistribution4.cumulativeProbability((int) '4', 100);
        boolean boolean23 = hypergeometricDistribution4.isSupportConnected();
        int int24 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double25 = hypergeometricDistribution4.calculateNumericalVariance();
        int int26 = hypergeometricDistribution4.getSupportLowerBound();
        double double28 = hypergeometricDistribution4.cumulativeProbability(0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.2275d + "'", double25 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.6500000000000004d + "'", double28 == 0.6500000000000004d);
    }

    @Test
    public void test2806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2806");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution4.isSupportConnected();
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (short) 10);
        double double9 = hypergeometricDistribution4.getNumericalVariance();
        int int11 = hypergeometricDistribution4.inverseCumulativeProbability(0.35d);
        double double12 = hypergeometricDistribution4.calculateNumericalVariance();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.2275d + "'", double9 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.2275d + "'", double12 == 0.2275d);
    }

    @Test
    public void test2807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2807");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.cumulativeProbability(0);
        double double7 = hypergeometricDistribution4.getNumericalVariance();
        double double8 = hypergeometricDistribution4.calculateNumericalVariance();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = hypergeometricDistribution4.sample();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.2275d + "'", double8 == 0.2275d);
    }

    @Test
    public void test2808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2808");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 100, (int) (byte) 10, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistribution4.reseedRandomGenerator((long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2809");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        int int11 = hypergeometricDistribution4.getSupportUpperBound();
        int int12 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double14 = hypergeometricDistribution4.probability((int) (short) 0);
        int int15 = hypergeometricDistribution4.getSupportUpperBound();
        int int16 = hypergeometricDistribution4.getSupportUpperBound();
        int int17 = hypergeometricDistribution4.getPopulationSize();
        double double19 = hypergeometricDistribution4.probability(7);
        int int20 = hypergeometricDistribution4.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.6500000000000004d + "'", double14 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test2810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2810");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, 35, 0);
        int int4 = hypergeometricDistribution3.getSupportLowerBound();
        double double5 = hypergeometricDistribution3.getNumericalMean();
        int int6 = hypergeometricDistribution3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test2811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2811");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, 35, 0);
        double double6 = hypergeometricDistribution3.cumulativeProbability((-1), (int) (short) -1);
        double double8 = hypergeometricDistribution3.probability(1);
        int int9 = hypergeometricDistribution3.getSupportUpperBound();
        double double11 = hypergeometricDistribution3.cumulativeProbability((int) (short) 100);
        int int12 = hypergeometricDistribution3.getSupportLowerBound();
        int int13 = hypergeometricDistribution3.getSampleSize();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2812");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (-1), 7, (int) ' ');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: population size (-1)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2813");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double7 = hypergeometricDistribution4.getNumericalMean();
        double double9 = hypergeometricDistribution4.probability(100);
        double double11 = hypergeometricDistribution4.cumulativeProbability(1);
        double double13 = hypergeometricDistribution4.cumulativeProbability((int) 'a');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.35d + "'", double7 == 0.35d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test2814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2814");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(4, 0, (int) (byte) 0);
        hypergeometricDistribution3.reseedRandomGenerator((long) '#');
        int int6 = hypergeometricDistribution3.getSupportLowerBound();
        double double8 = hypergeometricDistribution3.probability((int) '4');
        double double9 = hypergeometricDistribution3.calculateNumericalVariance();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test2815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2815");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getPopulationSize();
        int int8 = hypergeometricDistribution4.inverseCumulativeProbability((double) (byte) 0);
        double double9 = hypergeometricDistribution4.getNumericalVariance();
        double double11 = hypergeometricDistribution4.upperCumulativeProbability((int) '#');
        boolean boolean12 = hypergeometricDistribution4.isSupportConnected();
        double double13 = hypergeometricDistribution4.getNumericalVariance();
        double double14 = hypergeometricDistribution4.getNumericalMean();
        int int15 = hypergeometricDistribution4.getSampleSize();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.2275d + "'", double9 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2275d + "'", double13 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.35d + "'", double14 == 0.35d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
    }

    @Test
    public void test2816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2816");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int7 = hypergeometricDistribution4.getSupportLowerBound();
        int int8 = hypergeometricDistribution4.getSampleSize();
        double double9 = hypergeometricDistribution4.getNumericalMean();
        int int10 = hypergeometricDistribution4.getPopulationSize();
        double double12 = hypergeometricDistribution4.probability(35);
        double double14 = hypergeometricDistribution4.probability((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.35d + "'", double9 == 0.35d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test2817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2817");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int7 = hypergeometricDistribution4.getSupportLowerBound();
        int int8 = hypergeometricDistribution4.getSampleSize();
        boolean boolean9 = hypergeometricDistribution4.isSupportConnected();
        double double12 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1, (int) ' ');
        double double14 = hypergeometricDistribution4.probability((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistribution4.reseedRandomGenerator(0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test2818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2818");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        double double7 = hypergeometricDistribution4.upperCumulativeProbability((int) (short) -1);
        boolean boolean8 = hypergeometricDistribution4.isSupportConnected();
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((-1));
        double double11 = hypergeometricDistribution4.getNumericalVariance();
        boolean boolean12 = hypergeometricDistribution4.isSupportConnected();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.2275d + "'", double11 == 0.2275d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2819");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) ' ', (int) ' ', (int) (byte) 1);
        int int4 = hypergeometricDistribution3.getSampleSize();
        boolean boolean5 = hypergeometricDistribution3.isSupportConnected();
        int int6 = hypergeometricDistribution3.sample();
        double double8 = hypergeometricDistribution3.upperCumulativeProbability(20);
        double double11 = hypergeometricDistribution3.cumulativeProbability(10, (int) '#');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test2820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2820");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        boolean boolean5 = hypergeometricDistribution4.isSupportConnected();
        int int6 = hypergeometricDistribution4.getSampleSize();
        int int7 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double9 = hypergeometricDistribution4.probability((int) ' ');
        double double11 = hypergeometricDistribution4.cumulativeProbability((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test2821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2821");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double7 = hypergeometricDistribution4.calculateNumericalVariance();
        double double9 = hypergeometricDistribution4.probability((int) (byte) 100);
        int int10 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double11 = hypergeometricDistribution4.calculateNumericalVariance();
        double double13 = hypergeometricDistribution4.probability((int) (short) 100);
        double double15 = hypergeometricDistribution4.cumulativeProbability((int) ' ');
        double double18 = hypergeometricDistribution4.cumulativeProbability(4, 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.2275d + "'", double11 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test2822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2822");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution4.isSupportConnected();
        double double7 = hypergeometricDistribution4.getNumericalVariance();
        double double8 = hypergeometricDistribution4.getNumericalMean();
        int int9 = hypergeometricDistribution4.getSampleSize();
        double double11 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 100);
        int int12 = hypergeometricDistribution4.getPopulationSize();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = hypergeometricDistribution4.sample(6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.35d + "'", double8 == 0.35d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test2823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2823");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 100, 35, 10);
        double double5 = hypergeometricDistribution4.calculateNumericalVariance();
        double double7 = hypergeometricDistribution4.probability((int) (short) 10);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.0681818181818183d + "'", double5 == 2.0681818181818183d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0605205901255738E-5d + "'", double7 == 1.0605205901255738E-5d);
    }

    @Test
    public void test2824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2824");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution4.isSupportConnected();
        double double7 = hypergeometricDistribution4.getNumericalVariance();
        int int8 = hypergeometricDistribution4.getSupportUpperBound();
        double double10 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double12 = hypergeometricDistribution4.probability((int) (byte) 100);
        double double14 = hypergeometricDistribution4.cumulativeProbability(32);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.6500000000000004d + "'", double10 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
    }

    @Test
    public void test2825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2825");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        int int7 = hypergeometricDistribution4.getNumberOfSuccesses();
        boolean boolean8 = hypergeometricDistribution4.isSupportConnected();
        int int9 = hypergeometricDistribution4.getPopulationSize();
        double double10 = hypergeometricDistribution4.getNumericalVariance();
        double double12 = hypergeometricDistribution4.upperCumulativeProbability((int) (short) 10);
        double double14 = hypergeometricDistribution4.cumulativeProbability(0);
        double double15 = hypergeometricDistribution4.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.2275d + "'", double10 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.6500000000000004d + "'", double14 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.2275d + "'", double15 == 0.2275d);
    }

    @Test
    public void test2826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2826");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double8 = hypergeometricDistribution4.probability((int) 'a');
        boolean boolean9 = hypergeometricDistribution4.isSupportConnected();
        int int10 = hypergeometricDistribution4.getSupportUpperBound();
        double double13 = hypergeometricDistribution4.cumulativeProbability(1, 100);
        double double14 = hypergeometricDistribution4.getNumericalMean();
        int int15 = hypergeometricDistribution4.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.35d + "'", double14 == 0.35d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2827");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double8 = hypergeometricDistribution4.probability((int) 'a');
        boolean boolean9 = hypergeometricDistribution4.isSupportConnected();
        int int10 = hypergeometricDistribution4.getSupportUpperBound();
        int int11 = hypergeometricDistribution4.getPopulationSize();
        boolean boolean12 = hypergeometricDistribution4.isSupportConnected();
        double double14 = hypergeometricDistribution4.cumulativeProbability((int) ' ');
        int int15 = hypergeometricDistribution4.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test2828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2828");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, (int) (byte) 100, (int) (byte) 100);
        int int4 = hypergeometricDistribution3.getSampleSize();
        int int5 = hypergeometricDistribution3.getSampleSize();
        int int6 = hypergeometricDistribution3.getSampleSize();
        double double8 = hypergeometricDistribution3.upperCumulativeProbability((int) (byte) -1);
        double double9 = hypergeometricDistribution3.calculateNumericalVariance();
        double double11 = hypergeometricDistribution3.upperCumulativeProbability((int) (byte) 100);
        int int12 = hypergeometricDistribution3.getNumberOfSuccesses();
        double double14 = hypergeometricDistribution3.upperCumulativeProbability((int) (byte) 10);
        int[] intArray16 = hypergeometricDistribution3.sample(97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertNotNull(intArray16);
    }

    @Test
    public void test2829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2829");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (short) 100, 35, 1);
        double double6 = hypergeometricDistribution3.cumulativeProbability(0, (int) (short) 1);
        int int8 = hypergeometricDistribution3.inverseCumulativeProbability(0.0d);
        double double11 = hypergeometricDistribution3.cumulativeProbability(0, (int) (short) 10);
        int int12 = hypergeometricDistribution3.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.34999999999999987d + "'", double6 == 0.34999999999999987d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.34999999999999987d + "'", double11 == 0.34999999999999987d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test2830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2830");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double7 = hypergeometricDistribution4.calculateNumericalVariance();
        int int9 = hypergeometricDistribution4.inverseCumulativeProbability((double) 0);
        double double10 = hypergeometricDistribution4.getNumericalMean();
        double double12 = hypergeometricDistribution4.probability((int) (short) -1);
        boolean boolean13 = hypergeometricDistribution4.isSupportConnected();
        double double15 = hypergeometricDistribution4.probability(0);
        int int16 = hypergeometricDistribution4.getSupportLowerBound();
        int int17 = hypergeometricDistribution4.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.35d + "'", double10 == 0.35d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.6500000000000004d + "'", double15 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test2831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2831");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        int int11 = hypergeometricDistribution4.getSupportUpperBound();
        int int12 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double14 = hypergeometricDistribution4.cumulativeProbability((int) (short) 1);
        double double16 = hypergeometricDistribution4.upperCumulativeProbability((int) '4');
        int int17 = hypergeometricDistribution4.getSampleSize();
        int int19 = hypergeometricDistribution4.inverseCumulativeProbability((double) (short) 0);
        double double22 = hypergeometricDistribution4.cumulativeProbability((int) '4', 100);
        int int23 = hypergeometricDistribution4.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test2832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2832");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 32, 0, 4);
        double double5 = hypergeometricDistribution4.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test2833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2833");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double9 = hypergeometricDistribution4.cumulativeProbability(0, (int) 'a');
        boolean boolean10 = hypergeometricDistribution4.isSupportConnected();
        double double12 = hypergeometricDistribution4.upperCumulativeProbability(100);
        int int13 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int14 = hypergeometricDistribution4.getSupportUpperBound();
        int int15 = hypergeometricDistribution4.getNumberOfSuccesses();
        boolean boolean16 = hypergeometricDistribution4.isSupportConnected();
        int int17 = hypergeometricDistribution4.getSupportLowerBound();
        int int18 = hypergeometricDistribution4.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.34999999999999964d + "'", double9 == 0.34999999999999964d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2834");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 6, 35, 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: number of successes (35) must be less than or equal to population size (6)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2835");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        double double11 = hypergeometricDistribution4.getNumericalVariance();
        double double13 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double16 = hypergeometricDistribution4.cumulativeProbability(10, (int) 'a');
        int int18 = hypergeometricDistribution4.inverseCumulativeProbability(0.0d);
        double double19 = hypergeometricDistribution4.getNumericalVariance();
        double double20 = hypergeometricDistribution4.calculateNumericalVariance();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.2275d + "'", double11 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.2275d + "'", double19 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.2275d + "'", double20 == 0.2275d);
    }

    @Test
    public void test2836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2836");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, 35, 0);
        int int4 = hypergeometricDistribution3.getSupportLowerBound();
        int int5 = hypergeometricDistribution3.getSupportUpperBound();
        int int6 = hypergeometricDistribution3.getPopulationSize();
        double double8 = hypergeometricDistribution3.cumulativeProbability((int) (byte) -1);
        java.lang.Class<?> wildcardClass9 = hypergeometricDistribution3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2837");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        int int11 = hypergeometricDistribution4.getSupportUpperBound();
        double double13 = hypergeometricDistribution4.cumulativeProbability((int) (short) -1);
        java.lang.Class<?> wildcardClass14 = hypergeometricDistribution4.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2838");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (short) 100, 35, 1);
        double double6 = hypergeometricDistribution3.cumulativeProbability(0, (int) (short) 1);
        int int7 = hypergeometricDistribution3.getSupportUpperBound();
        double double9 = hypergeometricDistribution3.upperCumulativeProbability((int) '#');
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.34999999999999987d + "'", double6 == 0.34999999999999987d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test2839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2839");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        int int11 = hypergeometricDistribution4.getSupportUpperBound();
        int int13 = hypergeometricDistribution4.inverseCumulativeProbability((double) 1L);
        int int14 = hypergeometricDistribution4.getSampleSize();
        int int15 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double16 = hypergeometricDistribution4.calculateNumericalVariance();
        boolean boolean17 = hypergeometricDistribution4.isSupportConnected();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.2275d + "'", double16 == 0.2275d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test2840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2840");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getPopulationSize();
        int int8 = hypergeometricDistribution4.inverseCumulativeProbability((double) (byte) 0);
        double double10 = hypergeometricDistribution4.cumulativeProbability((int) (short) 0);
        double double11 = hypergeometricDistribution4.calculateNumericalVariance();
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistribution4.reseedRandomGenerator((long) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.6500000000000004d + "'", double10 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.2275d + "'", double11 == 0.2275d);
    }

    @Test
    public void test2841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2841");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution4.isSupportConnected();
        double double7 = hypergeometricDistribution4.getNumericalVariance();
        double double10 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1, (int) 'a');
        int int11 = hypergeometricDistribution4.getNumberOfSuccesses();
        boolean boolean12 = hypergeometricDistribution4.isSupportConnected();
        double double13 = hypergeometricDistribution4.getNumericalMean();
        double double15 = hypergeometricDistribution4.upperCumulativeProbability(4);
        int int16 = hypergeometricDistribution4.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.35d + "'", double13 == 0.35d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test2842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2842");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(4, 0, (int) (byte) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        hypergeometricDistribution3.reseedRandomGenerator((long) (byte) 1);
        int int7 = hypergeometricDistribution3.getNumberOfSuccesses();
        int int8 = hypergeometricDistribution3.sample();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2843");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        int int11 = hypergeometricDistribution4.getSupportUpperBound();
        int int13 = hypergeometricDistribution4.inverseCumulativeProbability((double) 1L);
        int int14 = hypergeometricDistribution4.getSampleSize();
        int int15 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double16 = hypergeometricDistribution4.getNumericalMean();
        // The following exception was thrown during execution in test generation
        try {
            int int17 = hypergeometricDistribution4.sample();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.35d + "'", double16 == 0.35d);
    }

    @Test
    public void test2844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2844");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        double double7 = hypergeometricDistribution4.upperCumulativeProbability(1);
        double double10 = hypergeometricDistribution4.cumulativeProbability(10, (int) '4');
        double double11 = hypergeometricDistribution4.getNumericalVariance();
        // The following exception was thrown during execution in test generation
        try {
            double double14 = hypergeometricDistribution4.cumulativeProbability(97, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (97) must be less than or equal to upper endpoint (-1)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.3500000000000001d + "'", double7 == 0.3500000000000001d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.2275d + "'", double11 == 0.2275d);
    }

    @Test
    public void test2845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2845");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution4.isSupportConnected();
        double double7 = hypergeometricDistribution4.getNumericalVariance();
        double double8 = hypergeometricDistribution4.getNumericalMean();
        double double10 = hypergeometricDistribution4.upperCumulativeProbability(100);
        double double12 = hypergeometricDistribution4.upperCumulativeProbability(0);
        double double13 = hypergeometricDistribution4.getNumericalVariance();
        int int14 = hypergeometricDistribution4.getSupportLowerBound();
        int int15 = hypergeometricDistribution4.getSupportLowerBound();
        int int16 = hypergeometricDistribution4.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.35d + "'", double8 == 0.35d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2275d + "'", double13 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test2846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2846");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getPopulationSize();
        int int8 = hypergeometricDistribution4.inverseCumulativeProbability((double) (byte) 0);
        int int9 = hypergeometricDistribution4.getPopulationSize();
        int int11 = hypergeometricDistribution4.inverseCumulativeProbability((double) 1);
        double double13 = hypergeometricDistribution4.probability((int) (byte) 100);
        boolean boolean14 = hypergeometricDistribution4.isSupportConnected();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = hypergeometricDistribution4.sample((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2847");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(4, 0, (int) (byte) 0);
        hypergeometricDistribution3.reseedRandomGenerator((long) '#');
        double double7 = hypergeometricDistribution3.upperCumulativeProbability((int) (byte) 100);
        int[] intArray9 = hypergeometricDistribution3.sample(10);
        int int10 = hypergeometricDistribution3.getPopulationSize();
        // The following exception was thrown during execution in test generation
        try {
            double double13 = hypergeometricDistribution3.cumulativeProbability(16, 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (16) must be less than or equal to upper endpoint (10)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
    }

    @Test
    public void test2848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2848");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        double double12 = hypergeometricDistribution4.cumulativeProbability((int) ' ');
        double double13 = hypergeometricDistribution4.calculateNumericalVariance();
        int int14 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double16 = hypergeometricDistribution4.probability((int) '4');
        double double18 = hypergeometricDistribution4.cumulativeProbability((int) '#');
        double double20 = hypergeometricDistribution4.cumulativeProbability((int) '4');
        int int21 = hypergeometricDistribution4.getSupportUpperBound();
        double double23 = hypergeometricDistribution4.probability((int) (byte) 100);
        int int24 = hypergeometricDistribution4.getPopulationSize();
        int int25 = hypergeometricDistribution4.getPopulationSize();
        int int26 = hypergeometricDistribution4.getSampleSize();
        boolean boolean27 = hypergeometricDistribution4.isSupportConnected();
        java.lang.Class<?> wildcardClass28 = hypergeometricDistribution4.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2275d + "'", double13 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 35 + "'", int26 == 35);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2849");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double7 = hypergeometricDistribution4.calculateNumericalVariance();
        int int9 = hypergeometricDistribution4.inverseCumulativeProbability((double) 0);
        double double10 = hypergeometricDistribution4.getNumericalMean();
        double double12 = hypergeometricDistribution4.probability((int) (short) -1);
        boolean boolean13 = hypergeometricDistribution4.isSupportConnected();
        int int14 = hypergeometricDistribution4.getSupportUpperBound();
        boolean boolean15 = hypergeometricDistribution4.isSupportConnected();
        int int16 = hypergeometricDistribution4.getPopulationSize();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.35d + "'", double10 == 0.35d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test2850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2850");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        int int7 = hypergeometricDistribution4.getNumberOfSuccesses();
        boolean boolean8 = hypergeometricDistribution4.isSupportConnected();
        double double10 = hypergeometricDistribution4.probability(35);
        double double11 = hypergeometricDistribution4.getNumericalVariance();
        int int12 = hypergeometricDistribution4.getSupportUpperBound();
        double double13 = hypergeometricDistribution4.getNumericalVariance();
        java.lang.Class<?> wildcardClass14 = hypergeometricDistribution4.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.2275d + "'", double11 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2275d + "'", double13 == 0.2275d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2851");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, 35, 0);
        double double6 = hypergeometricDistribution3.cumulativeProbability((-1), (int) (short) -1);
        hypergeometricDistribution3.reseedRandomGenerator((long) (byte) -1);
        int int9 = hypergeometricDistribution3.getSampleSize();
        double double12 = hypergeometricDistribution3.cumulativeProbability((int) (short) 0, (int) '4');
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test2852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2852");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        int int11 = hypergeometricDistribution4.getSupportUpperBound();
        int int13 = hypergeometricDistribution4.inverseCumulativeProbability((double) 1L);
        int int14 = hypergeometricDistribution4.getSampleSize();
        int int15 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double17 = hypergeometricDistribution4.probability((int) '4');
        int int18 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double20 = hypergeometricDistribution4.probability(4);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test2853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2853");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        int int11 = hypergeometricDistribution4.getSupportUpperBound();
        int int13 = hypergeometricDistribution4.inverseCumulativeProbability((double) 1L);
        int int14 = hypergeometricDistribution4.getSampleSize();
        int int15 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double16 = hypergeometricDistribution4.getNumericalMean();
        int int17 = hypergeometricDistribution4.getSampleSize();
        double double18 = hypergeometricDistribution4.calculateNumericalVariance();
        boolean boolean19 = hypergeometricDistribution4.isSupportConnected();
        double double21 = hypergeometricDistribution4.cumulativeProbability(0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.35d + "'", double16 == 0.35d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.2275d + "'", double18 == 0.2275d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.6500000000000004d + "'", double21 == 0.6500000000000004d);
    }

    @Test
    public void test2854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2854");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (byte) 10, (int) ' ', 24);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: number of successes (32) must be less than or equal to population size (10)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2855");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        double double6 = hypergeometricDistribution4.getNumericalMean();
        double double8 = hypergeometricDistribution4.cumulativeProbability(0);
        double double9 = hypergeometricDistribution4.getNumericalVariance();
        double double10 = hypergeometricDistribution4.calculateNumericalVariance();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.35d + "'", double6 == 0.35d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.6500000000000004d + "'", double8 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.2275d + "'", double9 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.2275d + "'", double10 == 0.2275d);
    }

    @Test
    public void test2856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2856");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getPopulationSize();
        int int8 = hypergeometricDistribution4.inverseCumulativeProbability((double) (byte) 0);
        double double9 = hypergeometricDistribution4.getNumericalVariance();
        double double11 = hypergeometricDistribution4.cumulativeProbability((int) '#');
        int int12 = hypergeometricDistribution4.getSampleSize();
        double double14 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 100);
        int int15 = hypergeometricDistribution4.getSupportLowerBound();
        java.lang.Class<?> wildcardClass16 = hypergeometricDistribution4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.2275d + "'", double9 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2857");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution4.isSupportConnected();
        double double7 = hypergeometricDistribution4.getNumericalVariance();
        double double9 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 10);
        double double12 = hypergeometricDistribution4.cumulativeProbability(4, 100);
        double double15 = hypergeometricDistribution4.cumulativeProbability(1, (int) (byte) 1);
        double double17 = hypergeometricDistribution4.upperCumulativeProbability((int) '4');
        int int18 = hypergeometricDistribution4.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test2858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2858");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double7 = hypergeometricDistribution4.calculateNumericalVariance();
        int int8 = hypergeometricDistribution4.getSupportLowerBound();
        double double9 = hypergeometricDistribution4.getNumericalVariance();
        double double10 = hypergeometricDistribution4.getNumericalMean();
        int int11 = hypergeometricDistribution4.getSupportLowerBound();
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistribution4.reseedRandomGenerator((long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.2275d + "'", double9 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.35d + "'", double10 == 0.35d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2859");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (short) -1, 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: population size (-1)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2860");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) '4', 52, (int) ' ');
    }

    @Test
    public void test2861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2861");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        int int7 = hypergeometricDistribution4.getNumberOfSuccesses();
        boolean boolean8 = hypergeometricDistribution4.isSupportConnected();
        int int9 = hypergeometricDistribution4.getPopulationSize();
        double double12 = hypergeometricDistribution4.cumulativeProbability(1, (int) (byte) 10);
        int int13 = hypergeometricDistribution4.getSupportLowerBound();
        int int14 = hypergeometricDistribution4.getSampleSize();
        int int15 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double16 = hypergeometricDistribution4.calculateNumericalVariance();
        double double19 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 0, 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.2275d + "'", double16 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.34999999999999964d + "'", double19 == 0.34999999999999964d);
    }

    @Test
    public void test2862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2862");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, (int) (byte) 100, (int) (byte) 100);
        int int4 = hypergeometricDistribution3.getSampleSize();
        double double6 = hypergeometricDistribution3.cumulativeProbability(0);
        int int7 = hypergeometricDistribution3.getSupportLowerBound();
        double double10 = hypergeometricDistribution3.cumulativeProbability(0, (int) '4');
        double double12 = hypergeometricDistribution3.probability(0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test2863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2863");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(52, 4, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: number of samples (-1)");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2864");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        double double12 = hypergeometricDistribution4.cumulativeProbability((int) ' ');
        int int14 = hypergeometricDistribution4.inverseCumulativeProbability((double) 1L);
        double double16 = hypergeometricDistribution4.cumulativeProbability((int) (short) -1);
        double double19 = hypergeometricDistribution4.cumulativeProbability((int) (short) 10, (int) (short) 100);
        int int20 = hypergeometricDistribution4.getSampleSize();
        double double21 = hypergeometricDistribution4.getNumericalVariance();
        int int22 = hypergeometricDistribution4.getPopulationSize();
        double double23 = hypergeometricDistribution4.calculateNumericalVariance();
        int int24 = hypergeometricDistribution4.getSupportLowerBound();
        double double26 = hypergeometricDistribution4.probability((int) '#');
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35 + "'", int20 == 35);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.2275d + "'", double21 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.2275d + "'", double23 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
    }

    @Test
    public void test2865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2865");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        int int11 = hypergeometricDistribution4.getSupportUpperBound();
        int int13 = hypergeometricDistribution4.inverseCumulativeProbability((double) 1L);
        int int14 = hypergeometricDistribution4.getSampleSize();
        int int15 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double16 = hypergeometricDistribution4.calculateNumericalVariance();
        double double17 = hypergeometricDistribution4.getNumericalMean();
        double double20 = hypergeometricDistribution4.cumulativeProbability((int) (short) 1, (int) ' ');
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.2275d + "'", double16 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.35d + "'", double17 == 0.35d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test2866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2866");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution4.isSupportConnected();
        double double7 = hypergeometricDistribution4.getNumericalVariance();
        double double10 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1, (int) 'a');
        int int11 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double12 = hypergeometricDistribution4.getNumericalVariance();
        int int13 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int14 = hypergeometricDistribution4.getSupportUpperBound();
        int int15 = hypergeometricDistribution4.getPopulationSize();
        int int16 = hypergeometricDistribution4.getSampleSize();
        // The following exception was thrown during execution in test generation
        try {
            int int18 = hypergeometricDistribution4.inverseCumulativeProbability((double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: -1 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.2275d + "'", double12 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
    }

    @Test
    public void test2867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2867");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        boolean boolean5 = hypergeometricDistribution4.isSupportConnected();
        int int6 = hypergeometricDistribution4.getSampleSize();
        int int7 = hypergeometricDistribution4.getSupportLowerBound();
        double double9 = hypergeometricDistribution4.upperCumulativeProbability((int) (short) 10);
        double double11 = hypergeometricDistribution4.probability((int) (short) 10);
        double double13 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test2868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2868");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double7 = hypergeometricDistribution4.getNumericalMean();
        double double8 = hypergeometricDistribution4.getNumericalMean();
        double double10 = hypergeometricDistribution4.cumulativeProbability((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.35d + "'", double7 == 0.35d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.35d + "'", double8 == 0.35d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test2869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2869");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        int int11 = hypergeometricDistribution4.getSupportUpperBound();
        int int12 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double14 = hypergeometricDistribution4.cumulativeProbability((int) (short) 1);
        double double16 = hypergeometricDistribution4.upperCumulativeProbability((int) '4');
        int int17 = hypergeometricDistribution4.getSampleSize();
        int int19 = hypergeometricDistribution4.inverseCumulativeProbability((double) (short) 0);
        double double22 = hypergeometricDistribution4.cumulativeProbability((int) '4', 100);
        boolean boolean23 = hypergeometricDistribution4.isSupportConnected();
        int int24 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double25 = hypergeometricDistribution4.calculateNumericalVariance();
        int int26 = hypergeometricDistribution4.getSupportLowerBound();
        int int27 = hypergeometricDistribution4.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.2275d + "'", double25 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test2870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2870");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution4.isSupportConnected();
        double double7 = hypergeometricDistribution4.getNumericalVariance();
        double double8 = hypergeometricDistribution4.getNumericalMean();
        int int9 = hypergeometricDistribution4.getSampleSize();
        double double10 = hypergeometricDistribution4.getNumericalMean();
        int int11 = hypergeometricDistribution4.getPopulationSize();
        double double13 = hypergeometricDistribution4.probability(35);
        double double15 = hypergeometricDistribution4.upperCumulativeProbability(0);
        double double16 = hypergeometricDistribution4.calculateNumericalVariance();
        int int17 = hypergeometricDistribution4.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.35d + "'", double8 == 0.35d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.35d + "'", double10 == 0.35d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.2275d + "'", double16 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2871");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        double double12 = hypergeometricDistribution4.cumulativeProbability((int) ' ');
        double double13 = hypergeometricDistribution4.calculateNumericalVariance();
        int int14 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double16 = hypergeometricDistribution4.probability((int) '4');
        double double18 = hypergeometricDistribution4.cumulativeProbability((int) '#');
        int int19 = hypergeometricDistribution4.getPopulationSize();
        int int20 = hypergeometricDistribution4.getSampleSize();
        double double22 = hypergeometricDistribution4.probability((int) (byte) 1);
        int int23 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double25 = hypergeometricDistribution4.probability((int) (short) 1);
        double double26 = hypergeometricDistribution4.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2275d + "'", double13 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35 + "'", int20 == 35);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.3500000000000001d + "'", double22 == 0.3500000000000001d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.3500000000000001d + "'", double25 == 0.3500000000000001d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.35d + "'", double26 == 0.35d);
    }

    @Test
    public void test2872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2872");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        double double12 = hypergeometricDistribution4.upperCumulativeProbability(1);
        int int13 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double14 = hypergeometricDistribution4.getNumericalMean();
        int int15 = hypergeometricDistribution4.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.3500000000000001d + "'", double12 == 0.3500000000000001d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.35d + "'", double14 == 0.35d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test2873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2873");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, (int) (byte) 10, 52);
        double double5 = hypergeometricDistribution4.getNumericalVariance();
        double double6 = hypergeometricDistribution4.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.269090909090909d + "'", double5 == 2.269090909090909d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5.2d + "'", double6 == 5.2d);
    }

    @Test
    public void test2874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2874");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        double double7 = hypergeometricDistribution4.upperCumulativeProbability((int) (short) -1);
        boolean boolean8 = hypergeometricDistribution4.isSupportConnected();
        double double11 = hypergeometricDistribution4.cumulativeProbability((int) (byte) -1, (int) (short) 10);
        double double13 = hypergeometricDistribution4.upperCumulativeProbability((int) ' ');
        boolean boolean14 = hypergeometricDistribution4.isSupportConnected();
        double double16 = hypergeometricDistribution4.probability((int) '4');
        double double18 = hypergeometricDistribution4.probability(6);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test2875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2875");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double8 = hypergeometricDistribution4.probability((int) 'a');
        boolean boolean9 = hypergeometricDistribution4.isSupportConnected();
        int int10 = hypergeometricDistribution4.getSupportUpperBound();
        int int11 = hypergeometricDistribution4.getPopulationSize();
        double double13 = hypergeometricDistribution4.upperCumulativeProbability((int) '#');
        double double14 = hypergeometricDistribution4.getNumericalMean();
        int int15 = hypergeometricDistribution4.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.35d + "'", double14 == 0.35d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test2876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2876");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        int int7 = hypergeometricDistribution4.getNumberOfSuccesses();
        boolean boolean8 = hypergeometricDistribution4.isSupportConnected();
        int int9 = hypergeometricDistribution4.getPopulationSize();
        double double12 = hypergeometricDistribution4.cumulativeProbability(1, (int) (byte) 10);
        int int13 = hypergeometricDistribution4.getSampleSize();
        double double14 = hypergeometricDistribution4.getNumericalVariance();
        int int15 = hypergeometricDistribution4.getSupportLowerBound();
        int int16 = hypergeometricDistribution4.getSupportUpperBound();
        int int17 = hypergeometricDistribution4.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.2275d + "'", double14 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test2877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2877");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        int int11 = hypergeometricDistribution4.getSupportUpperBound();
        int int12 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double13 = hypergeometricDistribution4.getNumericalMean();
        int int15 = hypergeometricDistribution4.inverseCumulativeProbability(0.3500000000000001d);
        double double16 = hypergeometricDistribution4.calculateNumericalVariance();
        double double19 = hypergeometricDistribution4.cumulativeProbability((int) (short) 0, (int) '#');
        int int20 = hypergeometricDistribution4.getNumberOfSuccesses();
        // The following exception was thrown during execution in test generation
        try {
            int int21 = hypergeometricDistribution4.sample();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.35d + "'", double13 == 0.35d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.2275d + "'", double16 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.34999999999999964d + "'", double19 == 0.34999999999999964d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test2878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2878");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution4.isSupportConnected();
        double double7 = hypergeometricDistribution4.getNumericalVariance();
        double double8 = hypergeometricDistribution4.getNumericalMean();
        double double10 = hypergeometricDistribution4.upperCumulativeProbability(100);
        double double12 = hypergeometricDistribution4.upperCumulativeProbability(0);
        double double13 = hypergeometricDistribution4.getNumericalVariance();
        int int14 = hypergeometricDistribution4.getSupportLowerBound();
        double double16 = hypergeometricDistribution4.probability(100);
        double double19 = hypergeometricDistribution4.cumulativeProbability(35, (int) '4');
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.35d + "'", double8 == 0.35d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2275d + "'", double13 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test2879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2879");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 100, 10, (int) '4');
        double double6 = hypergeometricDistribution4.probability((int) (short) 1);
        int int7 = hypergeometricDistribution4.getSupportLowerBound();
        int int9 = hypergeometricDistribution4.inverseCumulativeProbability(0.35d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.005038011914198055d + "'", double6 == 0.005038011914198055d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
    }

    @Test
    public void test2880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2880");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        double double11 = hypergeometricDistribution4.getNumericalVariance();
        double double13 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double15 = hypergeometricDistribution4.probability((int) (short) 1);
        int int16 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double18 = hypergeometricDistribution4.upperCumulativeProbability((int) (short) -1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.2275d + "'", double11 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.3500000000000001d + "'", double15 == 0.3500000000000001d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
    }

    @Test
    public void test2881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2881");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 35, 32, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: number of samples (-1)");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2882");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(20, (-1), 6);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: number of successes (-1)");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2883");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double9 = hypergeometricDistribution4.cumulativeProbability(0, (int) 'a');
        double double11 = hypergeometricDistribution4.cumulativeProbability((-1));
        int int12 = hypergeometricDistribution4.getSupportUpperBound();
        double double14 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = hypergeometricDistribution4.sample();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.34999999999999964d + "'", double9 == 0.34999999999999964d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.6500000000000004d + "'", double14 == 0.6500000000000004d);
    }

    @Test
    public void test2884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2884");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 0, (-1), (-1));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: population size (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2885");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, 35, 0);
        int int4 = hypergeometricDistribution3.getSupportLowerBound();
        double double5 = hypergeometricDistribution3.getNumericalMean();
        double double6 = hypergeometricDistribution3.getNumericalVariance();
        double double7 = hypergeometricDistribution3.calculateNumericalVariance();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test2886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2886");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        double double7 = hypergeometricDistribution4.upperCumulativeProbability((int) (short) -1);
        boolean boolean8 = hypergeometricDistribution4.isSupportConnected();
        double double9 = hypergeometricDistribution4.getNumericalVariance();
        double double10 = hypergeometricDistribution4.getNumericalVariance();
        double double11 = hypergeometricDistribution4.calculateNumericalVariance();
        double double13 = hypergeometricDistribution4.cumulativeProbability(6);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.2275d + "'", double9 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.2275d + "'", double10 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.2275d + "'", double11 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test2887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2887");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, (int) (byte) 100, (int) (byte) 100);
        int int4 = hypergeometricDistribution3.getSampleSize();
        int int5 = hypergeometricDistribution3.getSampleSize();
        int int6 = hypergeometricDistribution3.getSampleSize();
        boolean boolean7 = hypergeometricDistribution3.isSupportConnected();
        int[] intArray9 = hypergeometricDistribution3.sample(10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 100, 100, 100, 100, 100, 100, 100, 100, 100, 100 });
    }

    @Test
    public void test2888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2888");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(100, (int) (short) 10, 35);
        int int4 = hypergeometricDistribution3.getSupportLowerBound();
        double double6 = hypergeometricDistribution3.cumulativeProbability((int) '4');
        hypergeometricDistribution3.reseedRandomGenerator(10L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test2889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2889");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        int int7 = hypergeometricDistribution4.getNumberOfSuccesses();
        boolean boolean8 = hypergeometricDistribution4.isSupportConnected();
        int int9 = hypergeometricDistribution4.getPopulationSize();
        double double12 = hypergeometricDistribution4.cumulativeProbability(1, (int) (byte) 10);
        int int13 = hypergeometricDistribution4.getSampleSize();
        double double14 = hypergeometricDistribution4.getNumericalVariance();
        double double16 = hypergeometricDistribution4.upperCumulativeProbability((-1));
        boolean boolean17 = hypergeometricDistribution4.isSupportConnected();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.2275d + "'", double14 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test2890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2890");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        int int7 = hypergeometricDistribution4.getNumberOfSuccesses();
        boolean boolean8 = hypergeometricDistribution4.isSupportConnected();
        int int9 = hypergeometricDistribution4.getPopulationSize();
        double double11 = hypergeometricDistribution4.probability((int) (byte) -1);
        int int12 = hypergeometricDistribution4.getSupportUpperBound();
        // The following exception was thrown during execution in test generation
        try {
            int int13 = hypergeometricDistribution4.sample();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test2891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2891");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        int int12 = hypergeometricDistribution4.inverseCumulativeProbability(0.34999999999999964d);
        int int13 = hypergeometricDistribution4.getPopulationSize();
        double double14 = hypergeometricDistribution4.getNumericalVariance();
        int int15 = hypergeometricDistribution4.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.2275d + "'", double14 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2892");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        int int12 = hypergeometricDistribution4.inverseCumulativeProbability(0.34999999999999964d);
        int int13 = hypergeometricDistribution4.getPopulationSize();
        int int14 = hypergeometricDistribution4.getSampleSize();
        java.lang.Class<?> wildcardClass15 = hypergeometricDistribution4.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2893");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        int int11 = hypergeometricDistribution4.getSupportUpperBound();
        int int12 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double13 = hypergeometricDistribution4.getNumericalMean();
        int int15 = hypergeometricDistribution4.inverseCumulativeProbability(0.3500000000000001d);
        double double16 = hypergeometricDistribution4.calculateNumericalVariance();
        int int17 = hypergeometricDistribution4.getSupportLowerBound();
        int int18 = hypergeometricDistribution4.getPopulationSize();
        double double19 = hypergeometricDistribution4.getNumericalMean();
        double double21 = hypergeometricDistribution4.cumulativeProbability(1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.35d + "'", double13 == 0.35d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.2275d + "'", double16 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.35d + "'", double19 == 0.35d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
    }

    @Test
    public void test2894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2894");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double8 = hypergeometricDistribution4.probability((int) 'a');
        boolean boolean9 = hypergeometricDistribution4.isSupportConnected();
        double double10 = hypergeometricDistribution4.getNumericalMean();
        double double12 = hypergeometricDistribution4.probability((int) '4');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.35d + "'", double10 == 0.35d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test2895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2895");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 20, 1);
    }

    @Test
    public void test2896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2896");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        double double7 = hypergeometricDistribution4.upperCumulativeProbability((int) (short) -1);
        boolean boolean8 = hypergeometricDistribution4.isSupportConnected();
        double double9 = hypergeometricDistribution4.getNumericalVariance();
        int int10 = hypergeometricDistribution4.getSupportUpperBound();
        int int11 = hypergeometricDistribution4.getNumberOfSuccesses();
        boolean boolean12 = hypergeometricDistribution4.isSupportConnected();
        double double14 = hypergeometricDistribution4.cumulativeProbability(1);
        double double16 = hypergeometricDistribution4.probability((int) '#');
        int int17 = hypergeometricDistribution4.getSupportUpperBound();
        double double18 = hypergeometricDistribution4.calculateNumericalVariance();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.2275d + "'", double9 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.2275d + "'", double18 == 0.2275d);
    }

    @Test
    public void test2897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2897");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(16, (-1), (int) 'a');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: number of successes (-1)");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2898");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        int int11 = hypergeometricDistribution4.getSupportUpperBound();
        int int12 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double14 = hypergeometricDistribution4.cumulativeProbability((int) (short) 1);
        double double16 = hypergeometricDistribution4.upperCumulativeProbability((int) '4');
        int int17 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double19 = hypergeometricDistribution4.probability((int) 'a');
        int int21 = hypergeometricDistribution4.inverseCumulativeProbability(0.7763396693324591d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test2899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2899");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (short) 100, (int) (byte) 0, (int) (short) 0);
        double double4 = hypergeometricDistribution3.getNumericalVariance();
        int[] intArray6 = hypergeometricDistribution3.sample((int) (byte) 1);
        hypergeometricDistribution3.reseedRandomGenerator((long) 'a');
        boolean boolean9 = hypergeometricDistribution3.isSupportConnected();
        double double11 = hypergeometricDistribution3.probability(0);
        int int12 = hypergeometricDistribution3.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 0 });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2900");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getPopulationSize();
        int int8 = hypergeometricDistribution4.inverseCumulativeProbability((double) (byte) 0);
        double double9 = hypergeometricDistribution4.getNumericalVariance();
        double double11 = hypergeometricDistribution4.upperCumulativeProbability((int) '#');
        double double13 = hypergeometricDistribution4.probability(0);
        int int15 = hypergeometricDistribution4.inverseCumulativeProbability(0.0d);
        int int16 = hypergeometricDistribution4.getSampleSize();
        double double17 = hypergeometricDistribution4.getNumericalMean();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.2275d + "'", double9 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.6500000000000004d + "'", double13 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.35d + "'", double17 == 0.35d);
    }

    @Test
    public void test2901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2901");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        double double12 = hypergeometricDistribution4.cumulativeProbability((int) ' ');
        int int14 = hypergeometricDistribution4.inverseCumulativeProbability((double) 1L);
        double double16 = hypergeometricDistribution4.cumulativeProbability((int) (short) -1);
        double double19 = hypergeometricDistribution4.cumulativeProbability((int) (short) 10, (int) (short) 100);
        int int20 = hypergeometricDistribution4.getSampleSize();
        double double21 = hypergeometricDistribution4.getNumericalVariance();
        int int22 = hypergeometricDistribution4.getPopulationSize();
        double double23 = hypergeometricDistribution4.calculateNumericalVariance();
        double double24 = hypergeometricDistribution4.getNumericalMean();
        double double25 = hypergeometricDistribution4.getNumericalVariance();
        java.lang.Class<?> wildcardClass26 = hypergeometricDistribution4.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35 + "'", int20 == 35);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.2275d + "'", double21 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.2275d + "'", double23 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.35d + "'", double24 == 0.35d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.2275d + "'", double25 == 0.2275d);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2902");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double7 = hypergeometricDistribution4.getNumericalMean();
        double double9 = hypergeometricDistribution4.probability((int) (short) 10);
        double double10 = hypergeometricDistribution4.calculateNumericalVariance();
        double double11 = hypergeometricDistribution4.getNumericalMean();
        double double12 = hypergeometricDistribution4.calculateNumericalVariance();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.35d + "'", double7 == 0.35d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.2275d + "'", double10 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.35d + "'", double11 == 0.35d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.2275d + "'", double12 == 0.2275d);
    }

    @Test
    public void test2903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2903");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) ' ', (int) (short) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: sample size (100) must be less than or equal to population size (32)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2904");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        int int7 = hypergeometricDistribution4.getNumberOfSuccesses();
        boolean boolean8 = hypergeometricDistribution4.isSupportConnected();
        double double10 = hypergeometricDistribution4.probability(35);
        double double13 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1, 1);
        int int14 = hypergeometricDistribution4.getSupportLowerBound();
        int int15 = hypergeometricDistribution4.getSupportLowerBound();
        double double17 = hypergeometricDistribution4.cumulativeProbability((-1));
        double double19 = hypergeometricDistribution4.probability(4);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test2905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2905");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(10, (int) 'a', 5);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: number of successes (97) must be less than or equal to population size (10)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2906");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) ' ', (int) ' ', (int) (byte) 1);
        double double4 = hypergeometricDistribution3.getNumericalMean();
        hypergeometricDistribution3.reseedRandomGenerator((-1L));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test2907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2907");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        int int11 = hypergeometricDistribution4.getSupportUpperBound();
        int int12 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double14 = hypergeometricDistribution4.cumulativeProbability((int) (short) 1);
        double double16 = hypergeometricDistribution4.upperCumulativeProbability((int) '4');
        int int18 = hypergeometricDistribution4.inverseCumulativeProbability((double) 1);
        int int19 = hypergeometricDistribution4.getSupportLowerBound();
        boolean boolean20 = hypergeometricDistribution4.isSupportConnected();
        double double21 = hypergeometricDistribution4.getNumericalMean();
        int int22 = hypergeometricDistribution4.getPopulationSize();
        // The following exception was thrown during execution in test generation
        try {
            int int24 = hypergeometricDistribution4.inverseCumulativeProbability((double) 6);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: 6 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.35d + "'", double21 == 0.35d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
    }

    @Test
    public void test2908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2908");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        double double12 = hypergeometricDistribution4.cumulativeProbability((int) ' ');
        double double13 = hypergeometricDistribution4.calculateNumericalVariance();
        int int14 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double16 = hypergeometricDistribution4.probability((int) '4');
        double double18 = hypergeometricDistribution4.cumulativeProbability((int) '#');
        int int19 = hypergeometricDistribution4.getPopulationSize();
        int int20 = hypergeometricDistribution4.getSampleSize();
        double double22 = hypergeometricDistribution4.probability((int) (byte) 1);
        int int23 = hypergeometricDistribution4.getSampleSize();
        int int24 = hypergeometricDistribution4.getSupportLowerBound();
        double double26 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 0);
        int int27 = hypergeometricDistribution4.getPopulationSize();
        double double29 = hypergeometricDistribution4.cumulativeProbability((int) (short) -1);
        double double30 = hypergeometricDistribution4.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2275d + "'", double13 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35 + "'", int20 == 35);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.3500000000000001d + "'", double22 == 0.3500000000000001d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 35 + "'", int23 == 35);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.6500000000000004d + "'", double26 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.2275d + "'", double30 == 0.2275d);
    }

    @Test
    public void test2909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2909");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution4.isSupportConnected();
        double double7 = hypergeometricDistribution4.getNumericalVariance();
        double double8 = hypergeometricDistribution4.getNumericalMean();
        double double10 = hypergeometricDistribution4.upperCumulativeProbability(100);
        int int11 = hypergeometricDistribution4.getSupportLowerBound();
        double double12 = hypergeometricDistribution4.getNumericalVariance();
        double double14 = hypergeometricDistribution4.probability(0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = hypergeometricDistribution4.sample(52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.35d + "'", double8 == 0.35d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.2275d + "'", double12 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.6500000000000004d + "'", double14 == 0.6500000000000004d);
    }

    @Test
    public void test2910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2910");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (byte) 0, 4, (int) ' ');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: population size (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2911");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, 35, 0);
        double double6 = hypergeometricDistribution3.cumulativeProbability((-1), (int) (short) -1);
        double double8 = hypergeometricDistribution3.probability(1);
        int int9 = hypergeometricDistribution3.getSupportUpperBound();
        hypergeometricDistribution3.reseedRandomGenerator((long) 1);
        int int12 = hypergeometricDistribution3.sample();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2912");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getPopulationSize();
        boolean boolean7 = hypergeometricDistribution4.isSupportConnected();
        double double9 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 10);
        boolean boolean10 = hypergeometricDistribution4.isSupportConnected();
        double double12 = hypergeometricDistribution4.probability((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test2913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2913");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double7 = hypergeometricDistribution4.calculateNumericalVariance();
        double double9 = hypergeometricDistribution4.upperCumulativeProbability((-1));
        double double11 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 10);
        int int12 = hypergeometricDistribution4.getSampleSize();
        double double13 = hypergeometricDistribution4.getNumericalVariance();
        double double14 = hypergeometricDistribution4.getNumericalVariance();
        double double15 = hypergeometricDistribution4.getNumericalMean();
        int int16 = hypergeometricDistribution4.getSupportLowerBound();
        java.lang.Class<?> wildcardClass17 = hypergeometricDistribution4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2275d + "'", double13 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.2275d + "'", double14 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.35d + "'", double15 == 0.35d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2914");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(0, 32, (int) ' ');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: population size (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2915");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.cumulativeProbability(0);
        double double7 = hypergeometricDistribution4.calculateNumericalVariance();
        int int8 = hypergeometricDistribution4.getPopulationSize();
        double double10 = hypergeometricDistribution4.probability((int) (byte) -1);
        double double11 = hypergeometricDistribution4.calculateNumericalVariance();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.2275d + "'", double11 == 0.2275d);
    }

    @Test
    public void test2916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2916");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 100, (int) '#', (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistribution4.reseedRandomGenerator((long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2917");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        int int6 = hypergeometricDistribution4.getSupportLowerBound();
        double double8 = hypergeometricDistribution4.probability(1);
        double double10 = hypergeometricDistribution4.cumulativeProbability((int) (short) 100);
        boolean boolean11 = hypergeometricDistribution4.isSupportConnected();
        double double13 = hypergeometricDistribution4.cumulativeProbability((int) 'a');
        double double14 = hypergeometricDistribution4.calculateNumericalVariance();
        double double16 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 10);
        int int17 = hypergeometricDistribution4.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.3500000000000001d + "'", double8 == 0.3500000000000001d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.2275d + "'", double14 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test2918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2918");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int7 = hypergeometricDistribution4.getSupportLowerBound();
        int int8 = hypergeometricDistribution4.getSampleSize();
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (short) 1);
        int int11 = hypergeometricDistribution4.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.3500000000000001d + "'", double10 == 0.3500000000000001d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test2919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2919");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double9 = hypergeometricDistribution4.cumulativeProbability(0, (int) 'a');
        boolean boolean10 = hypergeometricDistribution4.isSupportConnected();
        int int11 = hypergeometricDistribution4.getSampleSize();
        // The following exception was thrown during execution in test generation
        try {
            int int13 = hypergeometricDistribution4.inverseCumulativeProbability((double) 16);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: 16 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.34999999999999964d + "'", double9 == 0.34999999999999964d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
    }

    @Test
    public void test2920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2920");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        double double12 = hypergeometricDistribution4.cumulativeProbability((int) ' ');
        double double13 = hypergeometricDistribution4.calculateNumericalVariance();
        double double14 = hypergeometricDistribution4.getNumericalVariance();
        double double16 = hypergeometricDistribution4.upperCumulativeProbability(1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2275d + "'", double13 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.2275d + "'", double14 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.3500000000000001d + "'", double16 == 0.3500000000000001d);
    }

    @Test
    public void test2921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2921");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, (int) (byte) 100, (int) (byte) 100);
        int int4 = hypergeometricDistribution3.getSampleSize();
        int int5 = hypergeometricDistribution3.getSampleSize();
        int int6 = hypergeometricDistribution3.getSupportUpperBound();
        int int7 = hypergeometricDistribution3.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test2922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2922");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double9 = hypergeometricDistribution4.cumulativeProbability(0, (int) 'a');
        boolean boolean10 = hypergeometricDistribution4.isSupportConnected();
        double double12 = hypergeometricDistribution4.upperCumulativeProbability(100);
        int int13 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double16 = hypergeometricDistribution4.cumulativeProbability((int) (short) 0, 0);
        int int17 = hypergeometricDistribution4.getPopulationSize();
        double double18 = hypergeometricDistribution4.getNumericalMean();
        int int19 = hypergeometricDistribution4.getPopulationSize();
        int int21 = hypergeometricDistribution4.inverseCumulativeProbability(0.369171668667467d);
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistribution4.reseedRandomGenerator((long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.34999999999999964d + "'", double9 == 0.34999999999999964d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.35d + "'", double18 == 0.35d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2923");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        double double7 = hypergeometricDistribution4.upperCumulativeProbability((int) (short) -1);
        boolean boolean8 = hypergeometricDistribution4.isSupportConnected();
        double double9 = hypergeometricDistribution4.getNumericalVariance();
        boolean boolean10 = hypergeometricDistribution4.isSupportConnected();
        int int11 = hypergeometricDistribution4.getSupportUpperBound();
        boolean boolean12 = hypergeometricDistribution4.isSupportConnected();
        int int13 = hypergeometricDistribution4.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.2275d + "'", double9 == 0.2275d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test2924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2924");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(10, (int) (short) 10, (int) (short) 10);
        double double5 = hypergeometricDistribution3.upperCumulativeProbability((int) (byte) 1);
        int int6 = hypergeometricDistribution3.getPopulationSize();
        double double7 = hypergeometricDistribution3.calculateNumericalVariance();
        double double9 = hypergeometricDistribution3.probability((int) '4');
        double double10 = hypergeometricDistribution3.calculateNumericalVariance();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test2925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2925");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) ' ', (int) ' ', (int) (byte) 1);
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (short) 0);
        int int6 = hypergeometricDistribution3.getSampleSize();
        int int7 = hypergeometricDistribution3.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test2926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2926");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, (int) (byte) 100, (int) (byte) 100);
        int int4 = hypergeometricDistribution3.getSampleSize();
        int int5 = hypergeometricDistribution3.getSampleSize();
        int int6 = hypergeometricDistribution3.getSampleSize();
        double double8 = hypergeometricDistribution3.upperCumulativeProbability((int) (byte) -1);
        double double9 = hypergeometricDistribution3.calculateNumericalVariance();
        double double11 = hypergeometricDistribution3.upperCumulativeProbability((int) (byte) 100);
        double double14 = hypergeometricDistribution3.cumulativeProbability((int) (short) -1, 32);
        double double16 = hypergeometricDistribution3.cumulativeProbability(97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test2927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2927");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        int int7 = hypergeometricDistribution4.getNumberOfSuccesses();
        boolean boolean8 = hypergeometricDistribution4.isSupportConnected();
        int int9 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int10 = hypergeometricDistribution4.getPopulationSize();
        int int11 = hypergeometricDistribution4.getSupportLowerBound();
        boolean boolean12 = hypergeometricDistribution4.isSupportConnected();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2928");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        double double12 = hypergeometricDistribution4.cumulativeProbability((int) ' ');
        double double13 = hypergeometricDistribution4.calculateNumericalVariance();
        int int14 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double16 = hypergeometricDistribution4.probability((int) '4');
        double double18 = hypergeometricDistribution4.cumulativeProbability((int) '#');
        int int20 = hypergeometricDistribution4.inverseCumulativeProbability(0.34999999999999964d);
        double double22 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 100);
        double double25 = hypergeometricDistribution4.cumulativeProbability(4, 35);
        boolean boolean26 = hypergeometricDistribution4.isSupportConnected();
        boolean boolean27 = hypergeometricDistribution4.isSupportConnected();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2275d + "'", double13 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test2929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2929");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution4.isSupportConnected();
        double double7 = hypergeometricDistribution4.getNumericalVariance();
        double double10 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1, (int) 'a');
        int int11 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double12 = hypergeometricDistribution4.getNumericalVariance();
        int int13 = hypergeometricDistribution4.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.2275d + "'", double12 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2930");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        double double12 = hypergeometricDistribution4.cumulativeProbability((int) ' ');
        double double13 = hypergeometricDistribution4.calculateNumericalVariance();
        int int14 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double16 = hypergeometricDistribution4.probability((int) '4');
        double double18 = hypergeometricDistribution4.cumulativeProbability((int) '#');
        double double20 = hypergeometricDistribution4.cumulativeProbability((int) '4');
        double double21 = hypergeometricDistribution4.getNumericalMean();
        double double22 = hypergeometricDistribution4.calculateNumericalVariance();
        double double24 = hypergeometricDistribution4.probability((int) (short) 10);
        double double26 = hypergeometricDistribution4.probability((int) (short) 100);
        int int27 = hypergeometricDistribution4.getPopulationSize();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2275d + "'", double13 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.35d + "'", double21 == 0.35d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.2275d + "'", double22 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
    }

    @Test
    public void test2931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2931");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        double double12 = hypergeometricDistribution4.cumulativeProbability((int) ' ');
        double double13 = hypergeometricDistribution4.calculateNumericalVariance();
        double double14 = hypergeometricDistribution4.calculateNumericalVariance();
        double double15 = hypergeometricDistribution4.calculateNumericalVariance();
        int int17 = hypergeometricDistribution4.inverseCumulativeProbability(0.23063024763524284d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2275d + "'", double13 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.2275d + "'", double14 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.2275d + "'", double15 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2932");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 6, (int) '4', 20);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: number of successes (52) must be less than or equal to population size (6)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2933");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(100, (int) (byte) 0, (int) (short) 10);
        double double4 = hypergeometricDistribution3.getNumericalVariance();
        double double5 = hypergeometricDistribution3.calculateNumericalVariance();
        double double8 = hypergeometricDistribution3.cumulativeProbability((int) (short) -1, (int) '4');
        double double9 = hypergeometricDistribution3.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test2934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2934");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution4.isSupportConnected();
        double double7 = hypergeometricDistribution4.getNumericalVariance();
        double double9 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 10);
        double double11 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test2935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2935");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        double double12 = hypergeometricDistribution4.cumulativeProbability((int) ' ');
        int int14 = hypergeometricDistribution4.inverseCumulativeProbability((double) 1L);
        double double16 = hypergeometricDistribution4.cumulativeProbability((int) (short) -1);
        double double18 = hypergeometricDistribution4.upperCumulativeProbability((int) (short) 10);
        double double19 = hypergeometricDistribution4.getNumericalMean();
        double double21 = hypergeometricDistribution4.upperCumulativeProbability(0);
        double double22 = hypergeometricDistribution4.getNumericalVariance();
        double double23 = hypergeometricDistribution4.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.35d + "'", double19 == 0.35d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.2275d + "'", double22 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.2275d + "'", double23 == 0.2275d);
    }

    @Test
    public void test2936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2936");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution4.isSupportConnected();
        double double7 = hypergeometricDistribution4.getNumericalVariance();
        double double8 = hypergeometricDistribution4.getNumericalMean();
        double double10 = hypergeometricDistribution4.upperCumulativeProbability(100);
        double double12 = hypergeometricDistribution4.upperCumulativeProbability(0);
        int int13 = hypergeometricDistribution4.getSampleSize();
        double double15 = hypergeometricDistribution4.cumulativeProbability((int) '4');
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.35d + "'", double8 == 0.35d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test2937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2937");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double9 = hypergeometricDistribution4.cumulativeProbability(0, (int) 'a');
        boolean boolean10 = hypergeometricDistribution4.isSupportConnected();
        double double12 = hypergeometricDistribution4.upperCumulativeProbability(100);
        int int13 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double14 = hypergeometricDistribution4.calculateNumericalVariance();
        java.lang.Class<?> wildcardClass15 = hypergeometricDistribution4.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.34999999999999964d + "'", double9 == 0.34999999999999964d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.2275d + "'", double14 == 0.2275d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2938");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int7 = hypergeometricDistribution4.getSupportLowerBound();
        int int8 = hypergeometricDistribution4.getSampleSize();
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (short) 1);
        double double12 = hypergeometricDistribution4.cumulativeProbability((int) ' ');
        double double13 = hypergeometricDistribution4.calculateNumericalVariance();
        double double14 = hypergeometricDistribution4.calculateNumericalVariance();
        int int15 = hypergeometricDistribution4.getSupportLowerBound();
        double double18 = hypergeometricDistribution4.cumulativeProbability(0, 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.3500000000000001d + "'", double10 == 0.3500000000000001d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2275d + "'", double13 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.2275d + "'", double14 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.34999999999999964d + "'", double18 == 0.34999999999999964d);
    }

    @Test
    public void test2939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2939");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(4, 0, (int) (byte) 0);
        hypergeometricDistribution3.reseedRandomGenerator((long) '#');
        double double7 = hypergeometricDistribution3.upperCumulativeProbability((int) (byte) 100);
        int[] intArray9 = hypergeometricDistribution3.sample(10);
        int int10 = hypergeometricDistribution3.getSampleSize();
        double double11 = hypergeometricDistribution3.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test2940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2940");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int7 = hypergeometricDistribution4.getSupportLowerBound();
        int int8 = hypergeometricDistribution4.getSampleSize();
        double double10 = hypergeometricDistribution4.cumulativeProbability((int) 'a');
        double double11 = hypergeometricDistribution4.getNumericalVariance();
        int int12 = hypergeometricDistribution4.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.2275d + "'", double11 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test2941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2941");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(100, (int) (byte) 0, (int) (short) 10);
        double double4 = hypergeometricDistribution3.getNumericalVariance();
        double double5 = hypergeometricDistribution3.calculateNumericalVariance();
        double double8 = hypergeometricDistribution3.cumulativeProbability((int) (short) -1, (int) '4');
        int int9 = hypergeometricDistribution3.getSampleSize();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test2942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2942");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        double double11 = hypergeometricDistribution4.getNumericalVariance();
        double double13 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double16 = hypergeometricDistribution4.cumulativeProbability(10, (int) 'a');
        int int17 = hypergeometricDistribution4.getSupportUpperBound();
        double double18 = hypergeometricDistribution4.getNumericalMean();
        int int19 = hypergeometricDistribution4.getSupportUpperBound();
        double double20 = hypergeometricDistribution4.calculateNumericalVariance();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.2275d + "'", double11 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.35d + "'", double18 == 0.35d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.2275d + "'", double20 == 0.2275d);
    }

    @Test
    public void test2943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2943");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (short) 100, 4, (int) ' ');
    }

    @Test
    public void test2944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2944");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(0, 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: population size (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2945");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) ' ', (int) ' ', (int) (byte) 1);
        int int4 = hypergeometricDistribution3.getSampleSize();
        boolean boolean5 = hypergeometricDistribution3.isSupportConnected();
        int int6 = hypergeometricDistribution3.sample();
        double double7 = hypergeometricDistribution3.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test2946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2946");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        int int11 = hypergeometricDistribution4.getSupportUpperBound();
        int int13 = hypergeometricDistribution4.inverseCumulativeProbability((double) 1L);
        int int14 = hypergeometricDistribution4.getSampleSize();
        int int15 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int16 = hypergeometricDistribution4.getSupportLowerBound();
        int int17 = hypergeometricDistribution4.getPopulationSize();
        double double18 = hypergeometricDistribution4.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.35d + "'", double18 == 0.35d);
    }

    @Test
    public void test2947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2947");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        int int6 = hypergeometricDistribution4.getSupportLowerBound();
        double double7 = hypergeometricDistribution4.getNumericalMean();
        double double9 = hypergeometricDistribution4.upperCumulativeProbability((int) (short) 1);
        int int10 = hypergeometricDistribution4.getPopulationSize();
        double double11 = hypergeometricDistribution4.calculateNumericalVariance();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.35d + "'", double7 == 0.35d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.3500000000000001d + "'", double9 == 0.3500000000000001d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.2275d + "'", double11 == 0.2275d);
    }

    @Test
    public void test2948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2948");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double9 = hypergeometricDistribution4.cumulativeProbability(0, (int) 'a');
        int int10 = hypergeometricDistribution4.getSampleSize();
        double double12 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 10);
        double double15 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 0, 35);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.34999999999999964d + "'", double9 == 0.34999999999999964d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.34999999999999964d + "'", double15 == 0.34999999999999964d);
    }

    @Test
    public void test2949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2949");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) ' ', (int) ' ', (int) (byte) 1);
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (short) 0);
        double double6 = hypergeometricDistribution3.getNumericalMean();
        double double7 = hypergeometricDistribution3.calculateNumericalVariance();
        double double8 = hypergeometricDistribution3.calculateNumericalVariance();
        int int9 = hypergeometricDistribution3.getNumberOfSuccesses();
        double double12 = hypergeometricDistribution3.cumulativeProbability(1, 35);
        int int13 = hypergeometricDistribution3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
    }

    @Test
    public void test2950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2950");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        double double6 = hypergeometricDistribution4.getNumericalMean();
        int int7 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int8 = hypergeometricDistribution4.getSupportUpperBound();
        double double10 = hypergeometricDistribution4.upperCumulativeProbability(35);
        double double11 = hypergeometricDistribution4.calculateNumericalVariance();
        int int12 = hypergeometricDistribution4.getSupportUpperBound();
        double double14 = hypergeometricDistribution4.cumulativeProbability(7);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.35d + "'", double6 == 0.35d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.2275d + "'", double11 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
    }

    @Test
    public void test2951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2951");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (byte) 100, (int) ' ', 100);
        int int5 = hypergeometricDistribution4.getPopulationSize();
        int int6 = hypergeometricDistribution4.getSampleSize();
        int int7 = hypergeometricDistribution4.getPopulationSize();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test2952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2952");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        double double7 = hypergeometricDistribution4.upperCumulativeProbability((int) (short) -1);
        boolean boolean8 = hypergeometricDistribution4.isSupportConnected();
        double double9 = hypergeometricDistribution4.getNumericalVariance();
        int int10 = hypergeometricDistribution4.getSupportUpperBound();
        int int11 = hypergeometricDistribution4.getSupportLowerBound();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = hypergeometricDistribution4.sample();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.2275d + "'", double9 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2953");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(100, (int) ' ', (int) '#');
        int int4 = hypergeometricDistribution3.getSupportLowerBound();
        double double6 = hypergeometricDistribution3.probability((int) (short) 10);
        double double8 = hypergeometricDistribution3.probability((int) '#');
        int[] intArray10 = hypergeometricDistribution3.sample(52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.15590747020453266d + "'", double6 == 0.15590747020453266d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test2954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2954");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, (int) (byte) 100, (int) (byte) 100);
        int int4 = hypergeometricDistribution3.getSampleSize();
        int int5 = hypergeometricDistribution3.getSampleSize();
        int int6 = hypergeometricDistribution3.getSampleSize();
        double double8 = hypergeometricDistribution3.upperCumulativeProbability(4);
        int int9 = hypergeometricDistribution3.sample();
        hypergeometricDistribution3.reseedRandomGenerator((long) (short) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test2955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2955");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution4.isSupportConnected();
        double double7 = hypergeometricDistribution4.getNumericalVariance();
        double double10 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1, (int) 'a');
        int int11 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int12 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double14 = hypergeometricDistribution4.probability(1);
        double double16 = hypergeometricDistribution4.cumulativeProbability((int) (short) -1);
        double double18 = hypergeometricDistribution4.upperCumulativeProbability(6);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.3500000000000001d + "'", double14 == 0.3500000000000001d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test2956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2956");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 0, (int) (byte) 1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: population size (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2957");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, 35, 0);
        double double6 = hypergeometricDistribution3.cumulativeProbability((-1), (int) (short) -1);
        double double8 = hypergeometricDistribution3.probability(1);
        double double9 = hypergeometricDistribution3.calculateNumericalVariance();
        double double11 = hypergeometricDistribution3.cumulativeProbability((int) '#');
        int int12 = hypergeometricDistribution3.getSampleSize();
        int int13 = hypergeometricDistribution3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test2958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2958");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, 35, 0);
        int int4 = hypergeometricDistribution3.getPopulationSize();
        double double5 = hypergeometricDistribution3.calculateNumericalVariance();
        int int6 = hypergeometricDistribution3.sample();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2959");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double8 = hypergeometricDistribution4.probability((int) 'a');
        boolean boolean9 = hypergeometricDistribution4.isSupportConnected();
        int int10 = hypergeometricDistribution4.getSupportUpperBound();
        int int11 = hypergeometricDistribution4.getPopulationSize();
        boolean boolean12 = hypergeometricDistribution4.isSupportConnected();
        double double14 = hypergeometricDistribution4.cumulativeProbability((int) ' ');
        boolean boolean15 = hypergeometricDistribution4.isSupportConnected();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test2960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2960");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        int int7 = hypergeometricDistribution4.getNumberOfSuccesses();
        boolean boolean8 = hypergeometricDistribution4.isSupportConnected();
        double double10 = hypergeometricDistribution4.probability(35);
        double double11 = hypergeometricDistribution4.getNumericalVariance();
        double double13 = hypergeometricDistribution4.upperCumulativeProbability((int) (short) 10);
        double double14 = hypergeometricDistribution4.calculateNumericalVariance();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.2275d + "'", double11 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.2275d + "'", double14 == 0.2275d);
    }

    @Test
    public void test2961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2961");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) '4', 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: sample size (100) must be less than or equal to population size (52)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2962");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 100, (int) (byte) -1, 4);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: number of successes (-1)");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2963");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, 35, 0);
        double double4 = hypergeometricDistribution3.getNumericalMean();
        double double6 = hypergeometricDistribution3.upperCumulativeProbability(100);
        double double8 = hypergeometricDistribution3.upperCumulativeProbability((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            double double11 = hypergeometricDistribution3.cumulativeProbability(20, 4);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (20) must be less than or equal to upper endpoint (4)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test2964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2964");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        boolean boolean5 = hypergeometricDistribution4.isSupportConnected();
        int int6 = hypergeometricDistribution4.getSampleSize();
        int int7 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int8 = hypergeometricDistribution4.getSupportLowerBound();
        double double10 = hypergeometricDistribution4.cumulativeProbability(52);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test2965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2965");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        double double12 = hypergeometricDistribution4.upperCumulativeProbability(1);
        double double14 = hypergeometricDistribution4.probability((int) (short) 0);
        int int15 = hypergeometricDistribution4.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.3500000000000001d + "'", double12 == 0.3500000000000001d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.6500000000000004d + "'", double14 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test2966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2966");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        int int11 = hypergeometricDistribution4.getSupportUpperBound();
        int int12 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double14 = hypergeometricDistribution4.cumulativeProbability((int) (short) 1);
        double double16 = hypergeometricDistribution4.upperCumulativeProbability((int) '4');
        int int18 = hypergeometricDistribution4.inverseCumulativeProbability((double) 1);
        int int19 = hypergeometricDistribution4.getSupportLowerBound();
        boolean boolean20 = hypergeometricDistribution4.isSupportConnected();
        double double22 = hypergeometricDistribution4.probability((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistribution4.reseedRandomGenerator((long) 5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.3500000000000001d + "'", double22 == 0.3500000000000001d);
    }

    @Test
    public void test2967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2967");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getPopulationSize();
        double double7 = hypergeometricDistribution4.getNumericalMean();
        double double10 = hypergeometricDistribution4.cumulativeProbability((int) (byte) -1, 1);
        double double12 = hypergeometricDistribution4.upperCumulativeProbability((int) '#');
        double double13 = hypergeometricDistribution4.calculateNumericalVariance();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.35d + "'", double7 == 0.35d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2275d + "'", double13 == 0.2275d);
    }

    @Test
    public void test2968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2968");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.cumulativeProbability(0);
        double double7 = hypergeometricDistribution4.getNumericalVariance();
        double double10 = hypergeometricDistribution4.cumulativeProbability((int) (byte) -1, (int) (byte) 10);
        double double12 = hypergeometricDistribution4.cumulativeProbability(20);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test2969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2969");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        double double12 = hypergeometricDistribution4.probability((-1));
        int int13 = hypergeometricDistribution4.getSampleSize();
        double double15 = hypergeometricDistribution4.cumulativeProbability(97);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = hypergeometricDistribution4.inverseCumulativeProbability((double) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: 100 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test2970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2970");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (byte) 1, (int) (byte) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: number of successes (-1)");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2971");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        int int11 = hypergeometricDistribution4.getSupportUpperBound();
        int int12 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double14 = hypergeometricDistribution4.cumulativeProbability((int) (short) 1);
        double double16 = hypergeometricDistribution4.upperCumulativeProbability((int) '4');
        int int17 = hypergeometricDistribution4.getSampleSize();
        int int19 = hypergeometricDistribution4.inverseCumulativeProbability((double) (short) 0);
        double double22 = hypergeometricDistribution4.cumulativeProbability((int) '4', 100);
        boolean boolean23 = hypergeometricDistribution4.isSupportConnected();
        int int24 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int25 = hypergeometricDistribution4.getPopulationSize();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
    }

    @Test
    public void test2972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2972");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        double double12 = hypergeometricDistribution4.cumulativeProbability((int) ' ');
        double double13 = hypergeometricDistribution4.calculateNumericalVariance();
        int int14 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double16 = hypergeometricDistribution4.probability((int) '4');
        double double18 = hypergeometricDistribution4.cumulativeProbability((int) '#');
        double double20 = hypergeometricDistribution4.cumulativeProbability((int) (short) 100);
        double double21 = hypergeometricDistribution4.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2275d + "'", double13 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.2275d + "'", double21 == 0.2275d);
    }

    @Test
    public void test2973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2973");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution4.isSupportConnected();
        int int7 = hypergeometricDistribution4.getPopulationSize();
        double double9 = hypergeometricDistribution4.upperCumulativeProbability((int) 'a');
        int int10 = hypergeometricDistribution4.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test2974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2974");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(4, 0, (int) (byte) 0);
        hypergeometricDistribution3.reseedRandomGenerator((long) '#');
        int int6 = hypergeometricDistribution3.getSupportLowerBound();
        boolean boolean7 = hypergeometricDistribution3.isSupportConnected();
        double double9 = hypergeometricDistribution3.probability(4);
        int int10 = hypergeometricDistribution3.getNumberOfSuccesses();
        double double11 = hypergeometricDistribution3.getNumericalMean();
        java.lang.Class<?> wildcardClass12 = hypergeometricDistribution3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2975");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        int int7 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double9 = hypergeometricDistribution4.cumulativeProbability((int) '#');
        int int10 = hypergeometricDistribution4.getSupportLowerBound();
        int int11 = hypergeometricDistribution4.getPopulationSize();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test2976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2976");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(4, 0, (int) (byte) 0);
        double double4 = hypergeometricDistribution3.getNumericalMean();
        boolean boolean5 = hypergeometricDistribution3.isSupportConnected();
        double double6 = hypergeometricDistribution3.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test2977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2977");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, 35, 0);
        double double6 = hypergeometricDistribution3.cumulativeProbability((-1), (int) (short) -1);
        hypergeometricDistribution3.reseedRandomGenerator((long) (byte) -1);
        int int9 = hypergeometricDistribution3.getSampleSize();
        java.lang.Class<?> wildcardClass10 = hypergeometricDistribution3.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2978");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getPopulationSize();
        boolean boolean7 = hypergeometricDistribution4.isSupportConnected();
        int int8 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int9 = hypergeometricDistribution4.getSampleSize();
        double double11 = hypergeometricDistribution4.cumulativeProbability(0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray13 = hypergeometricDistribution4.sample((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.6500000000000004d + "'", double11 == 0.6500000000000004d);
    }

    @Test
    public void test2979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2979");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, 35, 0);
        int int4 = hypergeometricDistribution3.getPopulationSize();
        double double5 = hypergeometricDistribution3.getNumericalMean();
        double double6 = hypergeometricDistribution3.getNumericalVariance();
        int int8 = hypergeometricDistribution3.inverseCumulativeProbability((double) 0.0f);
        int int9 = hypergeometricDistribution3.getNumberOfSuccesses();
        double double11 = hypergeometricDistribution3.cumulativeProbability(32);
        hypergeometricDistribution3.reseedRandomGenerator((long) 'a');
        double double15 = hypergeometricDistribution3.probability((int) (short) 1);
        int int16 = hypergeometricDistribution3.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
    }

    @Test
    public void test2980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2980");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, 35, 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        int int5 = hypergeometricDistribution3.sample();
        double double8 = hypergeometricDistribution3.cumulativeProbability(0, 20);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test2981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2981");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        double double6 = hypergeometricDistribution4.getNumericalMean();
        int int7 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double9 = hypergeometricDistribution4.upperCumulativeProbability(4);
        double double11 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 10);
        boolean boolean12 = hypergeometricDistribution4.isSupportConnected();
        double double15 = hypergeometricDistribution4.cumulativeProbability((int) (short) 0, 100);
        double double17 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        int int18 = hypergeometricDistribution4.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.35d + "'", double6 == 0.35d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.34999999999999964d + "'", double15 == 0.34999999999999964d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test2982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2982");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        double double12 = hypergeometricDistribution4.cumulativeProbability((int) ' ');
        double double13 = hypergeometricDistribution4.calculateNumericalVariance();
        int int14 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double16 = hypergeometricDistribution4.probability((int) '4');
        double double18 = hypergeometricDistribution4.cumulativeProbability((int) '#');
        int int19 = hypergeometricDistribution4.getPopulationSize();
        int int20 = hypergeometricDistribution4.getSupportLowerBound();
        double double22 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2275d + "'", double13 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test2983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2983");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) '#', 4, 4);
        int int5 = hypergeometricDistribution4.getPopulationSize();
        java.lang.Class<?> wildcardClass6 = hypergeometricDistribution4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2984");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getPopulationSize();
        int int8 = hypergeometricDistribution4.inverseCumulativeProbability((double) (byte) 0);
        double double9 = hypergeometricDistribution4.getNumericalVariance();
        double double11 = hypergeometricDistribution4.upperCumulativeProbability((int) '#');
        double double13 = hypergeometricDistribution4.probability(0);
        int int15 = hypergeometricDistribution4.inverseCumulativeProbability(0.0d);
        java.lang.Class<?> wildcardClass16 = hypergeometricDistribution4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.2275d + "'", double9 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.6500000000000004d + "'", double13 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2985");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 24, (int) 'a', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: number of successes (97) must be less than or equal to population size (24)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2986");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        int int11 = hypergeometricDistribution4.getSupportUpperBound();
        int int13 = hypergeometricDistribution4.inverseCumulativeProbability((double) 1L);
        int int14 = hypergeometricDistribution4.getSampleSize();
        double double16 = hypergeometricDistribution4.cumulativeProbability(0);
        int int17 = hypergeometricDistribution4.getSupportLowerBound();
        double double19 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double20 = hypergeometricDistribution4.calculateNumericalVariance();
        int int21 = hypergeometricDistribution4.getSampleSize();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.6500000000000004d + "'", double16 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.6500000000000004d + "'", double19 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.2275d + "'", double20 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
    }

    @Test
    public void test2987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2987");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) ' ', 20, (int) (short) 1);
        boolean boolean5 = hypergeometricDistribution4.isSupportConnected();
        double double6 = hypergeometricDistribution4.calculateNumericalVariance();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.234375d + "'", double6 == 0.234375d);
    }

    @Test
    public void test2988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2988");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution4.isSupportConnected();
        double double7 = hypergeometricDistribution4.getNumericalVariance();
        double double8 = hypergeometricDistribution4.getNumericalMean();
        int int9 = hypergeometricDistribution4.getSupportUpperBound();
        int int10 = hypergeometricDistribution4.getSampleSize();
        double double11 = hypergeometricDistribution4.getNumericalVariance();
        double double13 = hypergeometricDistribution4.upperCumulativeProbability(97);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.35d + "'", double8 == 0.35d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.2275d + "'", double11 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test2989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2989");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        double double6 = hypergeometricDistribution4.getNumericalMean();
        int int7 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int8 = hypergeometricDistribution4.getSupportUpperBound();
        int int9 = hypergeometricDistribution4.getSupportUpperBound();
        int int10 = hypergeometricDistribution4.getPopulationSize();
        int int11 = hypergeometricDistribution4.getSampleSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.35d + "'", double6 == 0.35d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
    }

    @Test
    public void test2990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2990");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double8 = hypergeometricDistribution4.probability((int) 'a');
        boolean boolean9 = hypergeometricDistribution4.isSupportConnected();
        int int10 = hypergeometricDistribution4.getSupportUpperBound();
        int int11 = hypergeometricDistribution4.getPopulationSize();
        boolean boolean12 = hypergeometricDistribution4.isSupportConnected();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = hypergeometricDistribution4.inverseCumulativeProbability((double) 4);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: 4 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2991");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double8 = hypergeometricDistribution4.probability((int) 'a');
        int int9 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double10 = hypergeometricDistribution4.getNumericalVariance();
        int int11 = hypergeometricDistribution4.getSupportLowerBound();
        int int12 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int13 = hypergeometricDistribution4.getSupportUpperBound();
        int int14 = hypergeometricDistribution4.getPopulationSize();
        double double15 = hypergeometricDistribution4.calculateNumericalVariance();
        double double17 = hypergeometricDistribution4.probability(35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.2275d + "'", double10 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.2275d + "'", double15 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test2992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2992");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        int int11 = hypergeometricDistribution4.getSupportUpperBound();
        int int13 = hypergeometricDistribution4.inverseCumulativeProbability((double) 1L);
        int int14 = hypergeometricDistribution4.getSampleSize();
        int int15 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double16 = hypergeometricDistribution4.getNumericalMean();
        int int17 = hypergeometricDistribution4.getSampleSize();
        double double19 = hypergeometricDistribution4.probability(0);
        double double20 = hypergeometricDistribution4.getNumericalMean();
        int int21 = hypergeometricDistribution4.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.35d + "'", double16 == 0.35d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.6500000000000004d + "'", double19 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.35d + "'", double20 == 0.35d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test2993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2993");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(20, 52, 35);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: number of successes (52) must be less than or equal to population size (20)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2994");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getPopulationSize();
        int int8 = hypergeometricDistribution4.inverseCumulativeProbability((double) (byte) 0);
        double double9 = hypergeometricDistribution4.getNumericalVariance();
        double double11 = hypergeometricDistribution4.upperCumulativeProbability((int) '#');
        double double13 = hypergeometricDistribution4.probability(0);
        boolean boolean14 = hypergeometricDistribution4.isSupportConnected();
        int int15 = hypergeometricDistribution4.getSampleSize();
        double double16 = hypergeometricDistribution4.calculateNumericalVariance();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.2275d + "'", double9 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.6500000000000004d + "'", double13 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.2275d + "'", double16 == 0.2275d);
    }

    @Test
    public void test2995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2995");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '4', 0, 0);
    }

    @Test
    public void test2996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2996");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution4.isSupportConnected();
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (short) 10);
        double double9 = hypergeometricDistribution4.getNumericalVariance();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = hypergeometricDistribution4.sample();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.2275d + "'", double9 == 0.2275d);
    }

    @Test
    public void test2997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2997");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getPopulationSize();
        double double7 = hypergeometricDistribution4.getNumericalMean();
        double double10 = hypergeometricDistribution4.cumulativeProbability((int) (byte) -1, 1);
        int int11 = hypergeometricDistribution4.getPopulationSize();
        int int12 = hypergeometricDistribution4.getPopulationSize();
        boolean boolean13 = hypergeometricDistribution4.isSupportConnected();
        int int14 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double15 = hypergeometricDistribution4.calculateNumericalVariance();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.35d + "'", double7 == 0.35d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.2275d + "'", double15 == 0.2275d);
    }

    @Test
    public void test2998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2998");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double7 = hypergeometricDistribution4.calculateNumericalVariance();
        int int8 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int9 = hypergeometricDistribution4.getPopulationSize();
        double double12 = hypergeometricDistribution4.cumulativeProbability(0, 100);
        boolean boolean13 = hypergeometricDistribution4.isSupportConnected();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.34999999999999964d + "'", double12 == 0.34999999999999964d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2999");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) ' ', (int) ' ', (int) (byte) 1);
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (short) 0);
        double double6 = hypergeometricDistribution3.getNumericalMean();
        double double7 = hypergeometricDistribution3.calculateNumericalVariance();
        double double9 = hypergeometricDistribution3.cumulativeProbability(35);
        int int10 = hypergeometricDistribution3.getPopulationSize();
        boolean boolean11 = hypergeometricDistribution3.isSupportConnected();
        double double12 = hypergeometricDistribution3.calculateNumericalVariance();
        int[] intArray14 = hypergeometricDistribution3.sample(16);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 });
    }

    @Test
    public void test3000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test3000");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        double double6 = hypergeometricDistribution4.getNumericalMean();
        double double7 = hypergeometricDistribution4.getNumericalMean();
        int int8 = hypergeometricDistribution4.getSupportUpperBound();
        int int9 = hypergeometricDistribution4.getPopulationSize();
        double double11 = hypergeometricDistribution4.cumulativeProbability((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistribution4.reseedRandomGenerator((long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.35d + "'", double6 == 0.35d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.35d + "'", double7 == 0.35d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }
}
