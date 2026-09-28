package org.apache.commons.math3.distribution;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

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
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(4, 0, (int) (byte) 0);
        hypergeometricDistribution3.reseedRandomGenerator((long) '#');
        int int6 = hypergeometricDistribution3.getSupportLowerBound();
        int int7 = hypergeometricDistribution3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) ' ', (int) ' ', (int) (byte) 1);
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (short) 0);
        double double6 = hypergeometricDistribution3.getNumericalMean();
        double double7 = hypergeometricDistribution3.calculateNumericalVariance();
        double double9 = hypergeometricDistribution3.cumulativeProbability(35);
        int int10 = hypergeometricDistribution3.getPopulationSize();
        int int11 = hypergeometricDistribution3.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double9 = hypergeometricDistribution4.cumulativeProbability(0, (int) 'a');
        boolean boolean10 = hypergeometricDistribution4.isSupportConnected();
        double double12 = hypergeometricDistribution4.upperCumulativeProbability(100);
        int int13 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int14 = hypergeometricDistribution4.getSupportUpperBound();
        int int15 = hypergeometricDistribution4.getSampleSize();
        boolean boolean16 = hypergeometricDistribution4.isSupportConnected();
        int int17 = hypergeometricDistribution4.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.34999999999999964d + "'", double9 == 0.34999999999999964d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(100, (int) '4', 35);
        int int4 = hypergeometricDistribution3.sample();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = hypergeometricDistribution3.inverseCumulativeProbability((double) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: 100 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
// flaky "1) test1504(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 17 + "'", int4 == 17);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double7 = hypergeometricDistribution4.calculateNumericalVariance();
        int int9 = hypergeometricDistribution4.inverseCumulativeProbability((double) 0);
        double double10 = hypergeometricDistribution4.getNumericalMean();
        int int11 = hypergeometricDistribution4.getSupportLowerBound();
        double double13 = hypergeometricDistribution4.cumulativeProbability(10);
        double double15 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        java.lang.Class<?> wildcardClass16 = hypergeometricDistribution4.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.35d + "'", double10 == 0.35d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(32, 100, 52);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: number of successes (100) must be less than or equal to population size (32)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        int int11 = hypergeometricDistribution4.getSupportUpperBound();
        int int12 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double14 = hypergeometricDistribution4.cumulativeProbability((int) (short) 1);
        double double15 = hypergeometricDistribution4.getNumericalMean();
        double double17 = hypergeometricDistribution4.cumulativeProbability((-1));
        double double18 = hypergeometricDistribution4.getNumericalVariance();
        int int19 = hypergeometricDistribution4.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.35d + "'", double15 == 0.35d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.2275d + "'", double18 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
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
        double double19 = hypergeometricDistribution4.upperCumulativeProbability(32);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (byte) -1, 97, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: population size (-1)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, 35, 0);
        double double4 = hypergeometricDistribution3.getNumericalMean();
        double double6 = hypergeometricDistribution3.upperCumulativeProbability(0);
        double double7 = hypergeometricDistribution3.calculateNumericalVariance();
        hypergeometricDistribution3.reseedRandomGenerator((long) 100);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(97, (int) '4', 97);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 10, (int) 'a', (-1));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: number of samples (-1)");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 10, 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: number of successes (100) must be less than or equal to population size (10)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getPopulationSize();
        int int8 = hypergeometricDistribution4.inverseCumulativeProbability((double) (byte) 0);
        int int9 = hypergeometricDistribution4.getPopulationSize();
        int int10 = hypergeometricDistribution4.getSupportUpperBound();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = hypergeometricDistribution4.sample(4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 0, (int) ' ', 35);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: population size (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double8 = hypergeometricDistribution4.probability((int) 'a');
        int int9 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int10 = hypergeometricDistribution4.getSampleSize();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        boolean boolean5 = hypergeometricDistribution4.isSupportConnected();
        int int6 = hypergeometricDistribution4.getSampleSize();
        int int7 = hypergeometricDistribution4.getSampleSize();
        double double9 = hypergeometricDistribution4.upperCumulativeProbability((int) (short) -1);
        double double11 = hypergeometricDistribution4.probability((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (short) 1, (int) '4', 52);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: number of successes (52) must be less than or equal to population size (1)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, (int) (byte) 100, (int) (byte) 100);
        int int4 = hypergeometricDistribution3.getSupportUpperBound();
        java.lang.Class<?> wildcardClass5 = hypergeometricDistribution3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        int int11 = hypergeometricDistribution4.getSupportUpperBound();
        int int12 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double14 = hypergeometricDistribution4.cumulativeProbability((int) (short) 1);
        double double16 = hypergeometricDistribution4.upperCumulativeProbability((int) '4');
        double double17 = hypergeometricDistribution4.getNumericalMean();
        double double19 = hypergeometricDistribution4.upperCumulativeProbability((int) ' ');
        java.lang.Class<?> wildcardClass20 = hypergeometricDistribution4.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.35d + "'", double17 == 0.35d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 100, 0, 0);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int7 = hypergeometricDistribution4.getSupportLowerBound();
        int int8 = hypergeometricDistribution4.getSampleSize();
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (short) 1);
        double double12 = hypergeometricDistribution4.cumulativeProbability((int) ' ');
        double double13 = hypergeometricDistribution4.calculateNumericalVariance();
        double double16 = hypergeometricDistribution4.cumulativeProbability(1, (int) (short) 100);
        double double18 = hypergeometricDistribution4.cumulativeProbability((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.3500000000000001d + "'", double10 == 0.3500000000000001d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2275d + "'", double13 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.6500000000000004d + "'", double18 == 0.6500000000000004d);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
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
        boolean boolean20 = hypergeometricDistribution4.isSupportConnected();
        int int21 = hypergeometricDistribution4.getSampleSize();
        double double22 = hypergeometricDistribution4.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.2275d + "'", double22 == 0.2275d);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(100, (int) (short) 100, (int) (short) 10);
        double double4 = hypergeometricDistribution3.calculateNumericalVariance();
        java.lang.Class<?> wildcardClass5 = hypergeometricDistribution3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getPopulationSize();
        boolean boolean7 = hypergeometricDistribution4.isSupportConnected();
        double double10 = hypergeometricDistribution4.cumulativeProbability(1, (int) '#');
        double double13 = hypergeometricDistribution4.cumulativeProbability((int) (short) 100, (int) (byte) 100);
        double double16 = hypergeometricDistribution4.cumulativeProbability(1, (int) (byte) 1);
        java.lang.Class<?> wildcardClass17 = hypergeometricDistribution4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution4.isSupportConnected();
        double double7 = hypergeometricDistribution4.getNumericalVariance();
        double double8 = hypergeometricDistribution4.getNumericalMean();
        double double10 = hypergeometricDistribution4.upperCumulativeProbability(100);
        double double12 = hypergeometricDistribution4.upperCumulativeProbability(0);
        int int13 = hypergeometricDistribution4.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.35d + "'", double8 == 0.35d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        boolean boolean5 = hypergeometricDistribution4.isSupportConnected();
        int int6 = hypergeometricDistribution4.getSampleSize();
        double double8 = hypergeometricDistribution4.probability(10);
        int int9 = hypergeometricDistribution4.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(10, (int) (short) 10, (int) (short) 10);
        double double5 = hypergeometricDistribution3.upperCumulativeProbability((int) (byte) 1);
        double double7 = hypergeometricDistribution3.upperCumulativeProbability(97);
        hypergeometricDistribution3.reseedRandomGenerator((long) 'a');
        double double10 = hypergeometricDistribution3.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(1, (int) 'a', 4);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: number of successes (97) must be less than or equal to population size (1)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 97, 4, 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: sample size (100) must be less than or equal to population size (97)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (short) 100, 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: number of samples (-1)");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
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
        double double23 = hypergeometricDistribution4.cumulativeProbability(0);
        int int24 = hypergeometricDistribution4.getPopulationSize();
        boolean boolean25 = hypergeometricDistribution4.isSupportConnected();
        double double26 = hypergeometricDistribution4.getNumericalMean();
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
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.6500000000000004d + "'", double23 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.35d + "'", double26 == 0.35d);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.cumulativeProbability(0);
        double double7 = hypergeometricDistribution4.calculateNumericalVariance();
        double double9 = hypergeometricDistribution4.upperCumulativeProbability(10);
        int int11 = hypergeometricDistribution4.inverseCumulativeProbability(0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double7 = hypergeometricDistribution4.getNumericalMean();
        double double9 = hypergeometricDistribution4.probability((int) (short) 10);
        int int10 = hypergeometricDistribution4.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.35d + "'", double7 == 0.35d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        int int11 = hypergeometricDistribution4.getSupportUpperBound();
        int int12 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int13 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int14 = hypergeometricDistribution4.getSampleSize();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution4.isSupportConnected();
        double double7 = hypergeometricDistribution4.getNumericalVariance();
        int int8 = hypergeometricDistribution4.getSupportUpperBound();
        int int9 = hypergeometricDistribution4.getSupportLowerBound();
        int int10 = hypergeometricDistribution4.getSampleSize();
        int int11 = hypergeometricDistribution4.getSampleSize();
        double double12 = hypergeometricDistribution4.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.35d + "'", double12 == 0.35d);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(100, (int) (short) 10, 35);
        double double5 = hypergeometricDistribution3.probability(4);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = hypergeometricDistribution3.inverseCumulativeProbability((double) 97);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: 97 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.24984402316337592d + "'", double5 == 0.24984402316337592d);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int7 = hypergeometricDistribution4.getSupportLowerBound();
        double double9 = hypergeometricDistribution4.upperCumulativeProbability(0);
        boolean boolean10 = hypergeometricDistribution4.isSupportConnected();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
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
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistribution4.reseedRandomGenerator(0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
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
        int int31 = hypergeometricDistribution4.getSupportUpperBound();
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
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getPopulationSize();
        boolean boolean7 = hypergeometricDistribution4.isSupportConnected();
        int int8 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int9 = hypergeometricDistribution4.getSampleSize();
        double double10 = hypergeometricDistribution4.getNumericalMean();
        int int11 = hypergeometricDistribution4.getPopulationSize();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.35d + "'", double10 == 0.35d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
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
        int int22 = hypergeometricDistribution4.inverseCumulativeProbability(0.34999999999999987d);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) ' ', (int) ' ', (int) (byte) 1);
        double double4 = hypergeometricDistribution3.getNumericalMean();
        double double6 = hypergeometricDistribution3.upperCumulativeProbability((int) (byte) 0);
        double double8 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = hypergeometricDistribution3.cumulativeProbability(32, 24);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (32) must be less than or equal to upper endpoint (24)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, (int) (byte) 100, (int) (byte) 100);
        int int4 = hypergeometricDistribution3.getSampleSize();
        int int5 = hypergeometricDistribution3.getSampleSize();
        int int6 = hypergeometricDistribution3.getSupportUpperBound();
        int int7 = hypergeometricDistribution3.getSupportUpperBound();
        int int8 = hypergeometricDistribution3.sample();
        boolean boolean9 = hypergeometricDistribution3.isSupportConnected();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.cumulativeProbability(0);
        double double7 = hypergeometricDistribution4.getNumericalVariance();
        double double8 = hypergeometricDistribution4.getNumericalVariance();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = hypergeometricDistribution4.inverseCumulativeProbability((double) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: 100 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.2275d + "'", double8 == 0.2275d);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (-1), (int) (short) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: population size (-1)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double7 = hypergeometricDistribution4.calculateNumericalVariance();
        int int9 = hypergeometricDistribution4.inverseCumulativeProbability((double) 0);
        double double10 = hypergeometricDistribution4.getNumericalMean();
        double double12 = hypergeometricDistribution4.probability((int) (short) -1);
        boolean boolean13 = hypergeometricDistribution4.isSupportConnected();
        double double15 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) -1);
        boolean boolean16 = hypergeometricDistribution4.isSupportConnected();
        int int17 = hypergeometricDistribution4.getPopulationSize();
        int int18 = hypergeometricDistribution4.getSampleSize();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.35d + "'", double10 == 0.35d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 0, 0, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: population size (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        double double12 = hypergeometricDistribution4.cumulativeProbability((int) ' ');
        double double13 = hypergeometricDistribution4.calculateNumericalVariance();
        int int14 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double16 = hypergeometricDistribution4.probability(35);
        int int18 = hypergeometricDistribution4.inverseCumulativeProbability(0.34999999999999964d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2275d + "'", double13 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
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
        double double21 = hypergeometricDistribution4.getNumericalMean();
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
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, (int) (byte) 100, (int) (byte) 100);
        int int4 = hypergeometricDistribution3.getSampleSize();
        int int5 = hypergeometricDistribution3.getSampleSize();
        int int6 = hypergeometricDistribution3.getSampleSize();
        int int7 = hypergeometricDistribution3.sample();
        double double9 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(100, (int) '4', 35);
        int int4 = hypergeometricDistribution3.sample();
        double double6 = hypergeometricDistribution3.cumulativeProbability((int) '#');
// flaky "2) test1552(org.apache.commons.math3.distribution.RegressionTest3)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 20 + "'", int4 == 20);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        double double6 = hypergeometricDistribution4.getNumericalVariance();
        int int7 = hypergeometricDistribution4.getSampleSize();
        double double8 = hypergeometricDistribution4.calculateNumericalVariance();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.2275d + "'", double6 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.2275d + "'", double8 == 0.2275d);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        double double6 = hypergeometricDistribution4.getNumericalMean();
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 100);
        double double10 = hypergeometricDistribution4.probability(35);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = hypergeometricDistribution4.inverseCumulativeProbability((double) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: 10 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.35d + "'", double6 == 0.35d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, 35, 0);
        int int4 = hypergeometricDistribution3.getPopulationSize();
        double double5 = hypergeometricDistribution3.getNumericalMean();
        double double6 = hypergeometricDistribution3.getNumericalVariance();
        boolean boolean7 = hypergeometricDistribution3.isSupportConnected();
        int int9 = hypergeometricDistribution3.inverseCumulativeProbability((double) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
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
        int int17 = hypergeometricDistribution4.getSampleSize();
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
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
        double double16 = hypergeometricDistribution4.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2275d + "'", double13 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.2275d + "'", double14 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.35d + "'", double15 == 0.35d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.2275d + "'", double16 == 0.2275d);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        double double11 = hypergeometricDistribution4.getNumericalVariance();
        double double13 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double16 = hypergeometricDistribution4.cumulativeProbability(10, (int) 'a');
        double double18 = hypergeometricDistribution4.upperCumulativeProbability(0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.2275d + "'", double11 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(24, (int) (short) 10, 52);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: sample size (52) must be less than or equal to population size (24)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        int int6 = hypergeometricDistribution4.getSupportLowerBound();
        double double8 = hypergeometricDistribution4.probability(1);
        double double10 = hypergeometricDistribution4.cumulativeProbability((int) (short) 100);
        boolean boolean11 = hypergeometricDistribution4.isSupportConnected();
        int int12 = hypergeometricDistribution4.getSampleSize();
        int int13 = hypergeometricDistribution4.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.3500000000000001d + "'", double8 == 0.3500000000000001d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, (int) (byte) 100, (int) (byte) 100);
        int int4 = hypergeometricDistribution3.getSampleSize();
        double double6 = hypergeometricDistribution3.cumulativeProbability(0);
        int int7 = hypergeometricDistribution3.getSupportLowerBound();
        int int8 = hypergeometricDistribution3.getNumberOfSuccesses();
        int int9 = hypergeometricDistribution3.getSupportUpperBound();
        double double10 = hypergeometricDistribution3.getNumericalMean();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution4.isSupportConnected();
        double double7 = hypergeometricDistribution4.getNumericalVariance();
        double double10 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1, (int) 'a');
        int int11 = hypergeometricDistribution4.getNumberOfSuccesses();
        boolean boolean12 = hypergeometricDistribution4.isSupportConnected();
        double double14 = hypergeometricDistribution4.upperCumulativeProbability((int) 'a');
        double double16 = hypergeometricDistribution4.upperCumulativeProbability(52);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(100, (int) (byte) 0, (int) (short) 10);
        double double4 = hypergeometricDistribution3.getNumericalVariance();
        double double5 = hypergeometricDistribution3.calculateNumericalVariance();
        int int6 = hypergeometricDistribution3.getSupportUpperBound();
        double double7 = hypergeometricDistribution3.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double7 = hypergeometricDistribution4.calculateNumericalVariance();
        double double9 = hypergeometricDistribution4.upperCumulativeProbability((-1));
        double double11 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 10);
        int int12 = hypergeometricDistribution4.getSampleSize();
        boolean boolean13 = hypergeometricDistribution4.isSupportConnected();
        double double15 = hypergeometricDistribution4.upperCumulativeProbability((int) (short) 10);
        double double17 = hypergeometricDistribution4.probability(35);
        int int18 = hypergeometricDistribution4.getPopulationSize();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
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
        int int29 = hypergeometricDistribution4.inverseCumulativeProbability((double) 1L);
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
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 0, (int) ' ', 4);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: population size (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, 35, 0);
        double double4 = hypergeometricDistribution3.getNumericalMean();
        double double6 = hypergeometricDistribution3.upperCumulativeProbability(0);
        double double7 = hypergeometricDistribution3.calculateNumericalVariance();
        int int8 = hypergeometricDistribution3.getSupportUpperBound();
        int int9 = hypergeometricDistribution3.sample();
        double double10 = hypergeometricDistribution3.calculateNumericalVariance();
        double double11 = hypergeometricDistribution3.calculateNumericalVariance();
        java.lang.Class<?> wildcardClass12 = hypergeometricDistribution3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        double double12 = hypergeometricDistribution4.cumulativeProbability((int) ' ');
        double double13 = hypergeometricDistribution4.calculateNumericalVariance();
        int int14 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double16 = hypergeometricDistribution4.probability(35);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = hypergeometricDistribution4.inverseCumulativeProbability((double) (-1));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: -1 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2275d + "'", double13 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) ' ', (int) 'a', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: number of successes (97) must be less than or equal to population size (32)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
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
        boolean boolean14 = hypergeometricDistribution4.isSupportConnected();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.6500000000000004d + "'", double11 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2275d + "'", double13 == 0.2275d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getPopulationSize();
        int int8 = hypergeometricDistribution4.inverseCumulativeProbability((double) (byte) 0);
        double double9 = hypergeometricDistribution4.getNumericalVariance();
        double double11 = hypergeometricDistribution4.upperCumulativeProbability((int) '#');
        double double12 = hypergeometricDistribution4.getNumericalVariance();
        int int13 = hypergeometricDistribution4.getNumberOfSuccesses();
        java.lang.Class<?> wildcardClass14 = hypergeometricDistribution4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.2275d + "'", double9 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.2275d + "'", double12 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
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
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistribution4.reseedRandomGenerator((long) 35);
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) -1, (int) (byte) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: population size (-1)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 1, (int) ' ', 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: number of successes (32) must be less than or equal to population size (1)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        double double6 = hypergeometricDistribution4.getNumericalMean();
        int int7 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int8 = hypergeometricDistribution4.getSupportUpperBound();
        int int9 = hypergeometricDistribution4.getSupportUpperBound();
        double double10 = hypergeometricDistribution4.calculateNumericalVariance();
        boolean boolean11 = hypergeometricDistribution4.isSupportConnected();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.35d + "'", double6 == 0.35d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.2275d + "'", double10 == 0.2275d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution4.isSupportConnected();
        double double7 = hypergeometricDistribution4.getNumericalVariance();
        double double10 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1, (int) 'a');
        int int11 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double13 = hypergeometricDistribution4.upperCumulativeProbability((int) (short) 10);
        int int14 = hypergeometricDistribution4.getSupportLowerBound();
        double double15 = hypergeometricDistribution4.calculateNumericalVariance();
        double double18 = hypergeometricDistribution4.cumulativeProbability(0, 100);
        // The following exception was thrown during execution in test generation
        try {
            double double21 = hypergeometricDistribution4.cumulativeProbability(20, 4);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (20) must be less than or equal to upper endpoint (4)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.2275d + "'", double15 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.34999999999999964d + "'", double18 == 0.34999999999999964d);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
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
        double double21 = hypergeometricDistribution4.cumulativeProbability((-1));
        boolean boolean22 = hypergeometricDistribution4.isSupportConnected();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
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
        java.lang.Class<?> wildcardClass20 = hypergeometricDistribution4.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.2275d + "'", double11 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.35d + "'", double18 == 0.35d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        double double6 = hypergeometricDistribution4.getNumericalMean();
        int int7 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double9 = hypergeometricDistribution4.upperCumulativeProbability(4);
        double double11 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 10);
        double double12 = hypergeometricDistribution4.getNumericalVariance();
        int int13 = hypergeometricDistribution4.getPopulationSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.35d + "'", double6 == 0.35d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.2275d + "'", double12 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double7 = hypergeometricDistribution4.calculateNumericalVariance();
        int int9 = hypergeometricDistribution4.inverseCumulativeProbability((double) 0);
        double double12 = hypergeometricDistribution4.cumulativeProbability((int) '#', (int) '#');
        int int13 = hypergeometricDistribution4.getSampleSize();
        int int14 = hypergeometricDistribution4.getSupportLowerBound();
        int int15 = hypergeometricDistribution4.getSampleSize();
        double double16 = hypergeometricDistribution4.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.2275d + "'", double16 == 0.2275d);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) ' ', (int) ' ', (int) (byte) 1);
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (short) 0);
        double double6 = hypergeometricDistribution3.getNumericalMean();
        java.lang.Class<?> wildcardClass7 = hypergeometricDistribution3.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        double double12 = hypergeometricDistribution4.cumulativeProbability((int) ' ');
        int int14 = hypergeometricDistribution4.inverseCumulativeProbability((double) 1L);
        double double16 = hypergeometricDistribution4.cumulativeProbability((int) (short) -1);
        double double17 = hypergeometricDistribution4.getNumericalVariance();
        boolean boolean18 = hypergeometricDistribution4.isSupportConnected();
        int int19 = hypergeometricDistribution4.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.2275d + "'", double17 == 0.2275d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        int int11 = hypergeometricDistribution4.getSupportUpperBound();
        int int12 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double13 = hypergeometricDistribution4.getNumericalMean();
        int int15 = hypergeometricDistribution4.inverseCumulativeProbability(0.3500000000000001d);
        double double16 = hypergeometricDistribution4.getNumericalMean();
        double double18 = hypergeometricDistribution4.upperCumulativeProbability((-1));
        double double19 = hypergeometricDistribution4.getNumericalVariance();
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistribution4.reseedRandomGenerator(0L);
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
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.35d + "'", double16 == 0.35d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.2275d + "'", double19 == 0.2275d);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int7 = hypergeometricDistribution4.getSupportLowerBound();
        int int8 = hypergeometricDistribution4.getSampleSize();
        boolean boolean9 = hypergeometricDistribution4.isSupportConnected();
        double double12 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = hypergeometricDistribution4.sample((int) (byte) 100);
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
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        double double7 = hypergeometricDistribution4.upperCumulativeProbability((int) (short) -1);
        boolean boolean8 = hypergeometricDistribution4.isSupportConnected();
        int int9 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int10 = hypergeometricDistribution4.getSampleSize();
        double double13 = hypergeometricDistribution4.cumulativeProbability((int) (short) -1, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = hypergeometricDistribution4.sample((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getPopulationSize();
        int int8 = hypergeometricDistribution4.inverseCumulativeProbability((double) (byte) 0);
        int int10 = hypergeometricDistribution4.inverseCumulativeProbability((double) (short) 0);
        double double12 = hypergeometricDistribution4.upperCumulativeProbability((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.3500000000000001d + "'", double12 == 0.3500000000000001d);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        double double12 = hypergeometricDistribution4.cumulativeProbability((int) ' ');
        int int14 = hypergeometricDistribution4.inverseCumulativeProbability((double) 1L);
        double double16 = hypergeometricDistribution4.cumulativeProbability((int) (short) -1);
        double double18 = hypergeometricDistribution4.upperCumulativeProbability((int) (short) 10);
        boolean boolean19 = hypergeometricDistribution4.isSupportConnected();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
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
        int int17 = hypergeometricDistribution4.getSupportLowerBound();
        int int18 = hypergeometricDistribution4.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.2275d + "'", double9 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
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
        int int20 = hypergeometricDistribution4.inverseCumulativeProbability((double) 0);
        int int21 = hypergeometricDistribution4.getSupportLowerBound();
        double double23 = hypergeometricDistribution4.cumulativeProbability((int) (short) 1);
        java.lang.Class<?> wildcardClass24 = hypergeometricDistribution4.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.2275d + "'", double11 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(100, (int) ' ', (int) '#');
        int[] intArray5 = hypergeometricDistribution3.sample((int) (short) 100);
        double double8 = hypergeometricDistribution3.cumulativeProbability((int) (short) 1, (int) (byte) 1);
        double double10 = hypergeometricDistribution3.upperCumulativeProbability(52);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        double double12 = hypergeometricDistribution4.upperCumulativeProbability(1);
        boolean boolean13 = hypergeometricDistribution4.isSupportConnected();
        int int14 = hypergeometricDistribution4.getSupportUpperBound();
        java.lang.Class<?> wildcardClass15 = hypergeometricDistribution4.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.3500000000000001d + "'", double12 == 0.3500000000000001d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, (int) (byte) 100, (int) (byte) 100);
        int int4 = hypergeometricDistribution3.getPopulationSize();
        double double5 = hypergeometricDistribution3.getNumericalMean();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        double double11 = hypergeometricDistribution4.getNumericalVariance();
        double double13 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double16 = hypergeometricDistribution4.cumulativeProbability(10, (int) 'a');
        int int18 = hypergeometricDistribution4.inverseCumulativeProbability(0.0d);
        boolean boolean19 = hypergeometricDistribution4.isSupportConnected();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.2275d + "'", double11 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        double double8 = hypergeometricDistribution4.cumulativeProbability(1, (int) (short) 10);
        int int9 = hypergeometricDistribution4.getPopulationSize();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(4, 0, (int) (byte) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        hypergeometricDistribution3.reseedRandomGenerator((long) (byte) 1);
        double double7 = hypergeometricDistribution3.calculateNumericalVariance();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) ' ', (int) ' ', (int) (byte) 1);
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (short) 0);
        double double6 = hypergeometricDistribution3.getNumericalMean();
        double double7 = hypergeometricDistribution3.calculateNumericalVariance();
        double double8 = hypergeometricDistribution3.calculateNumericalVariance();
        int int9 = hypergeometricDistribution3.getNumberOfSuccesses();
        int int10 = hypergeometricDistribution3.getSupportUpperBound();
        int int11 = hypergeometricDistribution3.getSupportLowerBound();
        double double12 = hypergeometricDistribution3.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double7 = hypergeometricDistribution4.calculateNumericalVariance();
        int int9 = hypergeometricDistribution4.inverseCumulativeProbability((double) 0);
        double double10 = hypergeometricDistribution4.calculateNumericalVariance();
        boolean boolean11 = hypergeometricDistribution4.isSupportConnected();
        int int12 = hypergeometricDistribution4.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.2275d + "'", double10 == 0.2275d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        int int7 = hypergeometricDistribution4.getNumberOfSuccesses();
        boolean boolean8 = hypergeometricDistribution4.isSupportConnected();
        int int9 = hypergeometricDistribution4.getPopulationSize();
        double double10 = hypergeometricDistribution4.getNumericalVariance();
        double double11 = hypergeometricDistribution4.calculateNumericalVariance();
        double double12 = hypergeometricDistribution4.calculateNumericalVariance();
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
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.2275d + "'", double10 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.2275d + "'", double11 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.2275d + "'", double12 == 0.2275d);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getPopulationSize();
        int int8 = hypergeometricDistribution4.inverseCumulativeProbability((double) (byte) 0);
        double double9 = hypergeometricDistribution4.getNumericalVariance();
        double double11 = hypergeometricDistribution4.upperCumulativeProbability((int) '#');
        boolean boolean12 = hypergeometricDistribution4.isSupportConnected();
        int int13 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double15 = hypergeometricDistribution4.probability(100);
        double double16 = hypergeometricDistribution4.calculateNumericalVariance();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.2275d + "'", double9 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.2275d + "'", double16 == 0.2275d);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(4, 0, (int) (byte) 0);
        double double4 = hypergeometricDistribution3.getNumericalMean();
        double double7 = hypergeometricDistribution3.cumulativeProbability(10, (int) '#');
        int int8 = hypergeometricDistribution3.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        double double12 = hypergeometricDistribution4.cumulativeProbability((int) ' ');
        double double13 = hypergeometricDistribution4.calculateNumericalVariance();
        int int14 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double15 = hypergeometricDistribution4.calculateNumericalVariance();
        int int17 = hypergeometricDistribution4.inverseCumulativeProbability(0.2275d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2275d + "'", double13 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.2275d + "'", double15 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, (int) (byte) 100, (int) (byte) 100);
        int int4 = hypergeometricDistribution3.sample();
        double double6 = hypergeometricDistribution3.probability((-1));
        int int7 = hypergeometricDistribution3.getPopulationSize();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = hypergeometricDistribution3.cumulativeProbability((int) '4', 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (52) must be less than or equal to upper endpoint (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) 'a', (int) (byte) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: number of successes (-1)");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 52, (int) (short) 1, (int) (short) 10);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double7 = hypergeometricDistribution4.calculateNumericalVariance();
        int int9 = hypergeometricDistribution4.inverseCumulativeProbability((double) 0);
        double double10 = hypergeometricDistribution4.getNumericalMean();
        int int11 = hypergeometricDistribution4.getSupportLowerBound();
        double double13 = hypergeometricDistribution4.cumulativeProbability((int) ' ');
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.35d + "'", double10 == 0.35d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.probability((int) ' ');
        int int11 = hypergeometricDistribution4.getPopulationSize();
        java.lang.Class<?> wildcardClass12 = hypergeometricDistribution4.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
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
        double double15 = hypergeometricDistribution4.getNumericalMean();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.3500000000000001d + "'", double10 == 0.3500000000000001d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2275d + "'", double13 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.2275d + "'", double14 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.35d + "'", double15 == 0.35d);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
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
        double double18 = hypergeometricDistribution4.calculateNumericalVariance();
        double double20 = hypergeometricDistribution4.upperCumulativeProbability(0);
        int int21 = hypergeometricDistribution4.getSupportUpperBound();
        java.lang.Class<?> wildcardClass22 = hypergeometricDistribution4.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.2275d + "'", double18 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        double double12 = hypergeometricDistribution4.cumulativeProbability((int) ' ');
        double double13 = hypergeometricDistribution4.calculateNumericalVariance();
        double double16 = hypergeometricDistribution4.cumulativeProbability((int) (short) 100, 100);
        int int17 = hypergeometricDistribution4.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2275d + "'", double13 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 100, 4);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) ' ', (int) ' ', (int) (byte) 1);
        double double4 = hypergeometricDistribution3.getNumericalMean();
        boolean boolean5 = hypergeometricDistribution3.isSupportConnected();
        int int7 = hypergeometricDistribution3.inverseCumulativeProbability(0.35d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, 35, 0);
        int int4 = hypergeometricDistribution3.getPopulationSize();
        double double5 = hypergeometricDistribution3.getNumericalMean();
        double double6 = hypergeometricDistribution3.getNumericalVariance();
        int int7 = hypergeometricDistribution3.sample();
        double double9 = hypergeometricDistribution3.upperCumulativeProbability((int) '#');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        int int11 = hypergeometricDistribution4.getSupportUpperBound();
        int int12 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int13 = hypergeometricDistribution4.getPopulationSize();
        double double16 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 10, (int) (byte) 10);
        double double18 = hypergeometricDistribution4.upperCumulativeProbability((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = hypergeometricDistribution4.sample((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.3500000000000001d + "'", double18 == 0.3500000000000001d);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 52, 52, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int5 = hypergeometricDistribution4.sample();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double7 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 0, (int) (short) 0);
        double double8 = hypergeometricDistribution4.calculateNumericalVariance();
        double double9 = hypergeometricDistribution4.getNumericalMean();
        double double12 = hypergeometricDistribution4.cumulativeProbability(35, (int) (short) 100);
        double double13 = hypergeometricDistribution4.getNumericalMean();
        double double14 = hypergeometricDistribution4.calculateNumericalVariance();
        // The following exception was thrown during execution in test generation
        try {
            int int16 = hypergeometricDistribution4.inverseCumulativeProbability((double) 100L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: 100 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.2275d + "'", double8 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.35d + "'", double9 == 0.35d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.35d + "'", double13 == 0.35d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.2275d + "'", double14 == 0.2275d);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        double double6 = hypergeometricDistribution4.getNumericalMean();
        int int7 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double10 = hypergeometricDistribution4.cumulativeProbability(10, (int) '#');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.35d + "'", double6 == 0.35d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
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
        double double23 = hypergeometricDistribution4.cumulativeProbability(0);
        int int24 = hypergeometricDistribution4.getPopulationSize();
        double double26 = hypergeometricDistribution4.probability((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            double double29 = hypergeometricDistribution4.cumulativeProbability((int) ' ', 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (32) must be less than or equal to upper endpoint (1)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
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
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.6500000000000004d + "'", double23 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.3500000000000001d + "'", double26 == 0.3500000000000001d);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getPopulationSize();
        int int8 = hypergeometricDistribution4.inverseCumulativeProbability((double) (byte) 0);
        double double9 = hypergeometricDistribution4.getNumericalVariance();
        double double11 = hypergeometricDistribution4.upperCumulativeProbability((int) '#');
        double double13 = hypergeometricDistribution4.probability(0);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = hypergeometricDistribution4.sample();
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
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 10, 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: sample size (100) must be less than or equal to population size (10)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
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
        int int25 = hypergeometricDistribution4.getSampleSize();
        boolean boolean26 = hypergeometricDistribution4.isSupportConnected();
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
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 35 + "'", int25 == 35);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, 35, 0);
        double double6 = hypergeometricDistribution3.cumulativeProbability((-1), (int) (short) -1);
        double double8 = hypergeometricDistribution3.probability(1);
        int int9 = hypergeometricDistribution3.getSupportUpperBound();
        hypergeometricDistribution3.reseedRandomGenerator((long) 1);
        int int12 = hypergeometricDistribution3.getSupportLowerBound();
        double double13 = hypergeometricDistribution3.calculateNumericalVariance();
        hypergeometricDistribution3.reseedRandomGenerator(0L);
        java.lang.Class<?> wildcardClass16 = hypergeometricDistribution3.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double7 = hypergeometricDistribution4.calculateNumericalVariance();
        java.lang.Class<?> wildcardClass8 = hypergeometricDistribution4.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double9 = hypergeometricDistribution4.cumulativeProbability(0, (int) 'a');
        boolean boolean10 = hypergeometricDistribution4.isSupportConnected();
        boolean boolean11 = hypergeometricDistribution4.isSupportConnected();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray13 = hypergeometricDistribution4.sample(52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.34999999999999964d + "'", double9 == 0.34999999999999964d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
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
        int int20 = hypergeometricDistribution4.inverseCumulativeProbability((double) 0);
        int int21 = hypergeometricDistribution4.getSupportLowerBound();
        double double23 = hypergeometricDistribution4.cumulativeProbability(10);
        int int24 = hypergeometricDistribution4.getPopulationSize();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.2275d + "'", double11 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, (int) (byte) 100, (int) (byte) 100);
        int int4 = hypergeometricDistribution3.getSampleSize();
        int int5 = hypergeometricDistribution3.getSampleSize();
        int int6 = hypergeometricDistribution3.getSampleSize();
        boolean boolean7 = hypergeometricDistribution3.isSupportConnected();
        hypergeometricDistribution3.reseedRandomGenerator((long) 0);
        int int10 = hypergeometricDistribution3.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) '#', (int) '#', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: sample size (100) must be less than or equal to population size (35)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
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
        boolean boolean18 = hypergeometricDistribution4.isSupportConnected();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.6500000000000004d + "'", double14 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        double double12 = hypergeometricDistribution4.probability((-1));
        double double14 = hypergeometricDistribution4.upperCumulativeProbability((int) ' ');
        double double16 = hypergeometricDistribution4.upperCumulativeProbability((int) 'a');
        java.lang.Class<?> wildcardClass17 = hypergeometricDistribution4.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
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
        double double23 = hypergeometricDistribution4.getNumericalMean();
        double double24 = hypergeometricDistribution4.calculateNumericalVariance();
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
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.35d + "'", double23 == 0.35d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.2275d + "'", double24 == 0.2275d);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(10, (int) (short) 1, 24);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: sample size (24) must be less than or equal to population size (10)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
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
        boolean boolean25 = hypergeometricDistribution4.isSupportConnected();
        double double26 = hypergeometricDistribution4.getNumericalMean();
        double double27 = hypergeometricDistribution4.getNumericalMean();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray29 = hypergeometricDistribution4.sample((int) (short) 1);
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
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.2275d + "'", double24 == 0.2275d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.35d + "'", double26 == 0.35d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.35d + "'", double27 == 0.35d);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, 35, 0);
        double double6 = hypergeometricDistribution3.cumulativeProbability((-1), (int) (short) -1);
        double double8 = hypergeometricDistribution3.probability(1);
        int int9 = hypergeometricDistribution3.getSupportUpperBound();
        boolean boolean10 = hypergeometricDistribution3.isSupportConnected();
        int int11 = hypergeometricDistribution3.getSupportLowerBound();
        double double12 = hypergeometricDistribution3.calculateNumericalVariance();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double7 = hypergeometricDistribution4.calculateNumericalVariance();
        int int9 = hypergeometricDistribution4.inverseCumulativeProbability((double) 0);
        double double10 = hypergeometricDistribution4.getNumericalMean();
        int int11 = hypergeometricDistribution4.getSupportLowerBound();
        int int12 = hypergeometricDistribution4.getSampleSize();
        double double14 = hypergeometricDistribution4.cumulativeProbability((int) (byte) -1);
        double double17 = hypergeometricDistribution4.cumulativeProbability((int) (short) 10, 97);
        double double19 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.35d + "'", double10 == 0.35d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.6500000000000004d + "'", double19 == 0.6500000000000004d);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        int int11 = hypergeometricDistribution4.getSupportUpperBound();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = hypergeometricDistribution4.sample();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        double double7 = hypergeometricDistribution4.probability((int) (byte) 0);
        int int8 = hypergeometricDistribution4.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.6500000000000004d + "'", double7 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(7, (int) 'a', 20);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: number of successes (97) must be less than or equal to population size (7)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 10, (int) (byte) 10, 52);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: sample size (52) must be less than or equal to population size (10)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
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
        int int21 = hypergeometricDistribution4.getSupportUpperBound();
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistribution4.reseedRandomGenerator(0L);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 52, (int) ' ', (int) (short) 1);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(7, 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: sample size (100) must be less than or equal to population size (7)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, (int) (byte) 100, (int) (byte) 100);
        int int4 = hypergeometricDistribution3.getSampleSize();
        int int5 = hypergeometricDistribution3.getSampleSize();
        int int6 = hypergeometricDistribution3.getSampleSize();
        int int7 = hypergeometricDistribution3.getSampleSize();
        int int8 = hypergeometricDistribution3.getSampleSize();
        java.lang.Class<?> wildcardClass9 = hypergeometricDistribution3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getPopulationSize();
        int int8 = hypergeometricDistribution4.inverseCumulativeProbability((double) (byte) 0);
        double double9 = hypergeometricDistribution4.getNumericalVariance();
        double double11 = hypergeometricDistribution4.upperCumulativeProbability((int) '#');
        boolean boolean12 = hypergeometricDistribution4.isSupportConnected();
        int int13 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double15 = hypergeometricDistribution4.probability(100);
        double double16 = hypergeometricDistribution4.getNumericalMean();
        double double17 = hypergeometricDistribution4.getNumericalMean();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.2275d + "'", double9 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.35d + "'", double16 == 0.35d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.35d + "'", double17 == 0.35d);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double7 = hypergeometricDistribution4.getNumericalMean();
        double double8 = hypergeometricDistribution4.getNumericalMean();
        int int9 = hypergeometricDistribution4.getSupportLowerBound();
        int int10 = hypergeometricDistribution4.getPopulationSize();
        double double12 = hypergeometricDistribution4.upperCumulativeProbability(0);
        double double13 = hypergeometricDistribution4.calculateNumericalVariance();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.35d + "'", double7 == 0.35d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.35d + "'", double8 == 0.35d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2275d + "'", double13 == 0.2275d);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double7 = hypergeometricDistribution4.calculateNumericalVariance();
        double double9 = hypergeometricDistribution4.upperCumulativeProbability((-1));
        double double11 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 10);
        int int12 = hypergeometricDistribution4.getSampleSize();
        boolean boolean13 = hypergeometricDistribution4.isSupportConnected();
        int int14 = hypergeometricDistribution4.getSupportLowerBound();
        double double17 = hypergeometricDistribution4.cumulativeProbability((int) (short) 1, 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.cumulativeProbability(0);
        double double7 = hypergeometricDistribution4.calculateNumericalVariance();
        int int8 = hypergeometricDistribution4.getPopulationSize();
        double double10 = hypergeometricDistribution4.probability((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistribution4.reseedRandomGenerator((long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 0, (int) (byte) 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: population size (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getPopulationSize();
        int int8 = hypergeometricDistribution4.inverseCumulativeProbability((double) (byte) 0);
        double double9 = hypergeometricDistribution4.getNumericalVariance();
        double double11 = hypergeometricDistribution4.cumulativeProbability(32);
        double double13 = hypergeometricDistribution4.cumulativeProbability((int) (short) 100);
        double double14 = hypergeometricDistribution4.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.2275d + "'", double9 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.2275d + "'", double14 == 0.2275d);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.cumulativeProbability(0);
        double double7 = hypergeometricDistribution4.getNumericalVariance();
        double double8 = hypergeometricDistribution4.getNumericalVariance();
        int int9 = hypergeometricDistribution4.getPopulationSize();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray11 = hypergeometricDistribution4.sample(32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.2275d + "'", double8 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, 35, 0);
        double double4 = hypergeometricDistribution3.getNumericalMean();
        double double6 = hypergeometricDistribution3.upperCumulativeProbability(0);
        double double7 = hypergeometricDistribution3.calculateNumericalVariance();
        int int8 = hypergeometricDistribution3.getSupportUpperBound();
        double double9 = hypergeometricDistribution3.getNumericalVariance();
        int[] intArray11 = hypergeometricDistribution3.sample(4);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 0, 0, 0, 0 });
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
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
            double double19 = hypergeometricDistribution4.cumulativeProbability(24, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (24) must be less than or equal to upper endpoint (1)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
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
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
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
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = hypergeometricDistribution4.sample((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        double double11 = hypergeometricDistribution4.getNumericalVariance();
        double double13 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double16 = hypergeometricDistribution4.cumulativeProbability(10, (int) 'a');
        int int17 = hypergeometricDistribution4.getSupportUpperBound();
        double double19 = hypergeometricDistribution4.upperCumulativeProbability(100);
        java.lang.Class<?> wildcardClass20 = hypergeometricDistribution4.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.2275d + "'", double11 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double7 = hypergeometricDistribution4.calculateNumericalVariance();
        double double9 = hypergeometricDistribution4.cumulativeProbability(4);
        double double11 = hypergeometricDistribution4.probability((int) (byte) -1);
        double double13 = hypergeometricDistribution4.upperCumulativeProbability((int) '#');
        double double15 = hypergeometricDistribution4.probability((int) (short) -1);
        int int16 = hypergeometricDistribution4.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double7 = hypergeometricDistribution4.calculateNumericalVariance();
        int int9 = hypergeometricDistribution4.inverseCumulativeProbability((double) 0);
        double double10 = hypergeometricDistribution4.getNumericalMean();
        int int11 = hypergeometricDistribution4.getSupportLowerBound();
        int int12 = hypergeometricDistribution4.getSampleSize();
        double double14 = hypergeometricDistribution4.cumulativeProbability((int) (byte) -1);
        double double16 = hypergeometricDistribution4.probability((int) (short) 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.35d + "'", double10 == 0.35d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.3500000000000001d + "'", double16 == 0.3500000000000001d);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, 35, 0);
        double double6 = hypergeometricDistribution3.cumulativeProbability((-1), (int) (short) -1);
        double double8 = hypergeometricDistribution3.probability(1);
        boolean boolean9 = hypergeometricDistribution3.isSupportConnected();
        double double11 = hypergeometricDistribution3.cumulativeProbability(4);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = hypergeometricDistribution3.inverseCumulativeProbability((double) 20);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: 20 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        int int6 = hypergeometricDistribution4.getSupportLowerBound();
        double double8 = hypergeometricDistribution4.probability(1);
        int int9 = hypergeometricDistribution4.getPopulationSize();
        int int10 = hypergeometricDistribution4.getSupportUpperBound();
        double double12 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        double double14 = hypergeometricDistribution4.probability((int) ' ');
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.3500000000000001d + "'", double8 == 0.3500000000000001d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (short) 100, 35, 1);
        double double6 = hypergeometricDistribution3.cumulativeProbability(0, (int) (short) 1);
        int int8 = hypergeometricDistribution3.inverseCumulativeProbability(0.0d);
        int int9 = hypergeometricDistribution3.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.34999999999999987d + "'", double6 == 0.34999999999999987d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double8 = hypergeometricDistribution4.probability((int) 'a');
        boolean boolean9 = hypergeometricDistribution4.isSupportConnected();
        int int10 = hypergeometricDistribution4.getSupportUpperBound();
        int int11 = hypergeometricDistribution4.getPopulationSize();
        boolean boolean12 = hypergeometricDistribution4.isSupportConnected();
        double double14 = hypergeometricDistribution4.upperCumulativeProbability(7);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        int int7 = hypergeometricDistribution4.getNumberOfSuccesses();
        boolean boolean8 = hypergeometricDistribution4.isSupportConnected();
        double double10 = hypergeometricDistribution4.probability(35);
        double double11 = hypergeometricDistribution4.getNumericalMean();
        double double12 = hypergeometricDistribution4.calculateNumericalVariance();
        int int13 = hypergeometricDistribution4.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.35d + "'", double11 == 0.35d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.2275d + "'", double12 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
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
        boolean boolean16 = hypergeometricDistribution4.isSupportConnected();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.35d + "'", double13 == 0.35d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double7 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 0, (int) (short) 0);
        double double8 = hypergeometricDistribution4.calculateNumericalVariance();
        double double9 = hypergeometricDistribution4.getNumericalMean();
        int int10 = hypergeometricDistribution4.getSupportLowerBound();
        int int11 = hypergeometricDistribution4.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.2275d + "'", double8 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.35d + "'", double9 == 0.35d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution4.isSupportConnected();
        int int7 = hypergeometricDistribution4.getPopulationSize();
        double double9 = hypergeometricDistribution4.upperCumulativeProbability((int) 'a');
        int int10 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double13 = hypergeometricDistribution4.cumulativeProbability((int) (short) 0, 4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.34999999999999964d + "'", double13 == 0.34999999999999964d);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double7 = hypergeometricDistribution4.calculateNumericalVariance();
        int int8 = hypergeometricDistribution4.getSupportUpperBound();
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 10);
        int int11 = hypergeometricDistribution4.getPopulationSize();
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistribution4.reseedRandomGenerator((long) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.cumulativeProbability(0);
        double double7 = hypergeometricDistribution4.getNumericalVariance();
        double double8 = hypergeometricDistribution4.calculateNumericalVariance();
        int int9 = hypergeometricDistribution4.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.2275d + "'", double8 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        int int6 = hypergeometricDistribution4.getSupportLowerBound();
        double double7 = hypergeometricDistribution4.getNumericalMean();
        int int8 = hypergeometricDistribution4.getSampleSize();
        double double11 = hypergeometricDistribution4.cumulativeProbability((int) (short) -1, 1);
        int int12 = hypergeometricDistribution4.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.35d + "'", double7 == 0.35d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 20, (int) (byte) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: sample size (100) must be less than or equal to population size (20)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
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
        double double15 = hypergeometricDistribution4.getNumericalVariance();
        int int16 = hypergeometricDistribution4.getSupportUpperBound();
        java.lang.Class<?> wildcardClass17 = hypergeometricDistribution4.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
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
        double double30 = hypergeometricDistribution4.cumulativeProbability((int) (byte) -1, (int) (short) 0);
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
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.6500000000000004d + "'", double30 == 0.6500000000000004d);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) '#', 20, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: sample size (100) must be less than or equal to population size (35)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (short) 0, (int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: population size (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
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
        int int15 = hypergeometricDistribution4.getSupportUpperBound();
        // The following exception was thrown during execution in test generation
        try {
            int int16 = hypergeometricDistribution4.sample();
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution4.isSupportConnected();
        double double7 = hypergeometricDistribution4.getNumericalVariance();
        double double8 = hypergeometricDistribution4.getNumericalMean();
        double double10 = hypergeometricDistribution4.upperCumulativeProbability(100);
        int int11 = hypergeometricDistribution4.getSupportLowerBound();
        double double12 = hypergeometricDistribution4.getNumericalVariance();
        double double13 = hypergeometricDistribution4.calculateNumericalVariance();
        double double15 = hypergeometricDistribution4.cumulativeProbability((int) (short) 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.35d + "'", double8 == 0.35d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.2275d + "'", double12 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2275d + "'", double13 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.6500000000000004d + "'", double15 == 0.6500000000000004d);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        double double7 = hypergeometricDistribution4.upperCumulativeProbability((int) (short) -1);
        boolean boolean8 = hypergeometricDistribution4.isSupportConnected();
        double double9 = hypergeometricDistribution4.getNumericalVariance();
        double double10 = hypergeometricDistribution4.getNumericalVariance();
        int int11 = hypergeometricDistribution4.getSampleSize();
        double double13 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 10);
        double double16 = hypergeometricDistribution4.cumulativeProbability(10, 32);
        java.lang.Class<?> wildcardClass17 = hypergeometricDistribution4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.2275d + "'", double9 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.2275d + "'", double10 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(4, (int) (short) 1, 4);
        boolean boolean4 = hypergeometricDistribution3.isSupportConnected();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        double double6 = hypergeometricDistribution4.getNumericalMean();
        int int7 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int8 = hypergeometricDistribution4.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.35d + "'", double6 == 0.35d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double7 = hypergeometricDistribution4.calculateNumericalVariance();
        int int9 = hypergeometricDistribution4.inverseCumulativeProbability((double) 0);
        int int10 = hypergeometricDistribution4.getSampleSize();
        double double11 = hypergeometricDistribution4.getNumericalVariance();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = hypergeometricDistribution4.sample();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.2275d + "'", double11 == 0.2275d);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, 35, 0);
        int int4 = hypergeometricDistribution3.getPopulationSize();
        int int5 = hypergeometricDistribution3.getPopulationSize();
        double double7 = hypergeometricDistribution3.cumulativeProbability((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        double double11 = hypergeometricDistribution4.getNumericalVariance();
        double double13 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double16 = hypergeometricDistribution4.cumulativeProbability(10, (int) 'a');
        int int17 = hypergeometricDistribution4.getSupportLowerBound();
        int int18 = hypergeometricDistribution4.getSupportLowerBound();
        double double19 = hypergeometricDistribution4.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.2275d + "'", double11 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.35d + "'", double19 == 0.35d);
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        double double6 = hypergeometricDistribution4.getNumericalVariance();
        int int7 = hypergeometricDistribution4.getSupportUpperBound();
        int int9 = hypergeometricDistribution4.inverseCumulativeProbability(0.24984402316337592d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.2275d + "'", double6 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double7 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 0, (int) (short) 0);
        double double8 = hypergeometricDistribution4.getNumericalMean();
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) '4');
        boolean boolean11 = hypergeometricDistribution4.isSupportConnected();
        int int12 = hypergeometricDistribution4.getSampleSize();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.35d + "'", double8 == 0.35d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double7 = hypergeometricDistribution4.calculateNumericalVariance();
        int int9 = hypergeometricDistribution4.inverseCumulativeProbability((double) 0);
        double double10 = hypergeometricDistribution4.getNumericalMean();
        double double12 = hypergeometricDistribution4.probability((int) (short) -1);
        boolean boolean13 = hypergeometricDistribution4.isSupportConnected();
        double double16 = hypergeometricDistribution4.cumulativeProbability(0, (int) (short) 0);
        boolean boolean17 = hypergeometricDistribution4.isSupportConnected();
        double double19 = hypergeometricDistribution4.cumulativeProbability((int) (short) 10);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.35d + "'", double10 == 0.35d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
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
        int int21 = hypergeometricDistribution4.getSupportUpperBound();
        double double23 = hypergeometricDistribution4.upperCumulativeProbability(10);
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
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
        double double24 = hypergeometricDistribution4.cumulativeProbability(24);
        int int25 = hypergeometricDistribution4.getSampleSize();
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
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0d + "'", double24 == 1.0d);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 35 + "'", int25 == 35);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        double double12 = hypergeometricDistribution4.cumulativeProbability((int) ' ');
        double double13 = hypergeometricDistribution4.calculateNumericalVariance();
        int int14 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double16 = hypergeometricDistribution4.probability((int) '4');
        double double18 = hypergeometricDistribution4.upperCumulativeProbability(100);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = hypergeometricDistribution4.sample();
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
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
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
        int int18 = hypergeometricDistribution4.getSupportLowerBound();
        int int19 = hypergeometricDistribution4.getNumberOfSuccesses();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = hypergeometricDistribution4.sample((int) ' ');
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        double double6 = hypergeometricDistribution4.getNumericalMean();
        int int7 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int8 = hypergeometricDistribution4.getSupportUpperBound();
        int int9 = hypergeometricDistribution4.getSupportUpperBound();
        double double10 = hypergeometricDistribution4.calculateNumericalVariance();
        int int11 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int12 = hypergeometricDistribution4.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.35d + "'", double6 == 0.35d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.2275d + "'", double10 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
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
        double double16 = hypergeometricDistribution4.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.2275d + "'", double10 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2275d + "'", double13 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.2275d + "'", double16 == 0.2275d);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
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
        boolean boolean20 = hypergeometricDistribution4.isSupportConnected();
        int int21 = hypergeometricDistribution4.getSupportUpperBound();
        double double22 = hypergeometricDistribution4.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.35d + "'", double22 == 0.35d);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double8 = hypergeometricDistribution4.probability((int) 'a');
        boolean boolean9 = hypergeometricDistribution4.isSupportConnected();
        double double10 = hypergeometricDistribution4.getNumericalVariance();
        java.lang.Class<?> wildcardClass11 = hypergeometricDistribution4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.2275d + "'", double10 == 0.2275d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double7 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 0, (int) (short) 0);
        double double8 = hypergeometricDistribution4.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.2275d + "'", double8 == 0.2275d);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
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
        double double28 = hypergeometricDistribution4.upperCumulativeProbability((int) '4');
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
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
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
        int int20 = hypergeometricDistribution4.getSupportUpperBound();
        double double22 = hypergeometricDistribution4.cumulativeProbability(10);
        int int23 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int24 = hypergeometricDistribution4.getSupportUpperBound();
        int int25 = hypergeometricDistribution4.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2275d + "'", double13 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution4.isSupportConnected();
        double double7 = hypergeometricDistribution4.getNumericalVariance();
        int int8 = hypergeometricDistribution4.getSupportUpperBound();
        double double10 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double12 = hypergeometricDistribution4.probability((int) (byte) 100);
        int int13 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int14 = hypergeometricDistribution4.getSupportLowerBound();
        int int15 = hypergeometricDistribution4.getSampleSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.6500000000000004d + "'", double10 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
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
        int int27 = hypergeometricDistribution4.getSampleSize();
        int int28 = hypergeometricDistribution4.getSampleSize();
        double double30 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 35 + "'", int27 == 35);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 35 + "'", int28 == 35);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 1.0d + "'", double30 == 1.0d);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double7 = hypergeometricDistribution4.calculateNumericalVariance();
        int int8 = hypergeometricDistribution4.getSupportLowerBound();
        double double9 = hypergeometricDistribution4.getNumericalVariance();
        double double10 = hypergeometricDistribution4.getNumericalMean();
        int int11 = hypergeometricDistribution4.getSupportLowerBound();
        int int13 = hypergeometricDistribution4.inverseCumulativeProbability((double) 1.0f);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.2275d + "'", double9 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.35d + "'", double10 == 0.35d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        int int11 = hypergeometricDistribution4.getSupportUpperBound();
        int int13 = hypergeometricDistribution4.inverseCumulativeProbability((double) 1L);
        int int14 = hypergeometricDistribution4.getSupportLowerBound();
        int int15 = hypergeometricDistribution4.getPopulationSize();
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        double double7 = hypergeometricDistribution4.upperCumulativeProbability((int) (short) -1);
        boolean boolean8 = hypergeometricDistribution4.isSupportConnected();
        double double9 = hypergeometricDistribution4.getNumericalVariance();
        int int10 = hypergeometricDistribution4.getSupportUpperBound();
        int int11 = hypergeometricDistribution4.getSupportLowerBound();
        double double13 = hypergeometricDistribution4.upperCumulativeProbability((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.2275d + "'", double9 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) ' ', (int) ' ', (int) (byte) 1);
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (short) 0);
        double double6 = hypergeometricDistribution3.getNumericalMean();
        double double7 = hypergeometricDistribution3.calculateNumericalVariance();
        double double8 = hypergeometricDistribution3.calculateNumericalVariance();
        int int9 = hypergeometricDistribution3.getNumberOfSuccesses();
        double double12 = hypergeometricDistribution3.cumulativeProbability(1, 35);
        double double13 = hypergeometricDistribution3.getNumericalVariance();
        double double14 = hypergeometricDistribution3.getNumericalMean();
        double double15 = hypergeometricDistribution3.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
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
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistribution4.reseedRandomGenerator((long) '4');
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
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        double double7 = hypergeometricDistribution4.upperCumulativeProbability((int) (short) -1);
        boolean boolean8 = hypergeometricDistribution4.isSupportConnected();
        double double11 = hypergeometricDistribution4.cumulativeProbability((int) (byte) -1, (int) (short) 10);
        double double13 = hypergeometricDistribution4.upperCumulativeProbability((int) ' ');
        int int14 = hypergeometricDistribution4.getNumberOfSuccesses();
        // The following exception was thrown during execution in test generation
        try {
            double double17 = hypergeometricDistribution4.cumulativeProbability((int) (short) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (100) must be less than or equal to upper endpoint (35)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
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
        double double19 = hypergeometricDistribution4.getNumericalMean();
        double double21 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.35d + "'", double19 == 0.35d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(10, (int) (short) 10, (int) (short) 10);
        int int4 = hypergeometricDistribution3.getSupportLowerBound();
        int int5 = hypergeometricDistribution3.getPopulationSize();
        int[] intArray7 = hypergeometricDistribution3.sample(4);
        int int8 = hypergeometricDistribution3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 10, 10, 10, 10 });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double7 = hypergeometricDistribution4.calculateNumericalVariance();
        int int8 = hypergeometricDistribution4.getSupportUpperBound();
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 10);
        double double11 = hypergeometricDistribution4.calculateNumericalVariance();
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistribution4.reseedRandomGenerator((long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.2275d + "'", double11 == 0.2275d);
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        int int7 = hypergeometricDistribution4.getNumberOfSuccesses();
        boolean boolean8 = hypergeometricDistribution4.isSupportConnected();
        double double10 = hypergeometricDistribution4.probability(35);
        double double13 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1, 1);
        double double15 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 10);
        double double17 = hypergeometricDistribution4.upperCumulativeProbability((int) (short) -1);
        double double18 = hypergeometricDistribution4.getNumericalMean();
        double double19 = hypergeometricDistribution4.calculateNumericalVariance();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.35d + "'", double18 == 0.35d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.2275d + "'", double19 == 0.2275d);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        double double7 = hypergeometricDistribution4.upperCumulativeProbability((int) (short) -1);
        double double8 = hypergeometricDistribution4.getNumericalVariance();
        double double9 = hypergeometricDistribution4.calculateNumericalVariance();
        boolean boolean10 = hypergeometricDistribution4.isSupportConnected();
        int int11 = hypergeometricDistribution4.getPopulationSize();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.2275d + "'", double8 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.2275d + "'", double9 == 0.2275d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getPopulationSize();
        int int8 = hypergeometricDistribution4.inverseCumulativeProbability((double) (byte) 0);
        double double9 = hypergeometricDistribution4.getNumericalVariance();
        double double11 = hypergeometricDistribution4.upperCumulativeProbability((int) '#');
        double double13 = hypergeometricDistribution4.probability(0);
        boolean boolean14 = hypergeometricDistribution4.isSupportConnected();
        // The following exception was thrown during execution in test generation
        try {
            int int16 = hypergeometricDistribution4.inverseCumulativeProbability((double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: -1 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.2275d + "'", double9 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.6500000000000004d + "'", double13 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
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
        double double26 = hypergeometricDistribution4.cumulativeProbability(10);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = hypergeometricDistribution4.sample();
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
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.0d + "'", double26 == 1.0d);
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) ' ', (int) ' ', (int) (byte) 1);
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (short) 0);
        double double6 = hypergeometricDistribution3.getNumericalMean();
        double double7 = hypergeometricDistribution3.calculateNumericalVariance();
        double double9 = hypergeometricDistribution3.cumulativeProbability(35);
        int int10 = hypergeometricDistribution3.sample();
        double double12 = hypergeometricDistribution3.cumulativeProbability(24);
        double double14 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            double double17 = hypergeometricDistribution3.cumulativeProbability(10, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (10) must be less than or equal to upper endpoint (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, 35, 0);
        double double6 = hypergeometricDistribution3.cumulativeProbability((-1), (int) (short) -1);
        double double8 = hypergeometricDistribution3.probability(1);
        int int9 = hypergeometricDistribution3.getPopulationSize();
        boolean boolean10 = hypergeometricDistribution3.isSupportConnected();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(20, (int) 'a', 24);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: number of successes (97) must be less than or equal to population size (20)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
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
        double double19 = hypergeometricDistribution4.getNumericalMean();
        double double20 = hypergeometricDistribution4.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.35d + "'", double19 == 0.35d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.2275d + "'", double20 == 0.2275d);
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double7 = hypergeometricDistribution4.calculateNumericalVariance();
        int int9 = hypergeometricDistribution4.inverseCumulativeProbability((double) 0);
        double double12 = hypergeometricDistribution4.cumulativeProbability((int) '#', (int) '#');
        int int13 = hypergeometricDistribution4.getSampleSize();
        int int14 = hypergeometricDistribution4.getSupportLowerBound();
        int int15 = hypergeometricDistribution4.getSampleSize();
        double double17 = hypergeometricDistribution4.cumulativeProbability(0);
        int int18 = hypergeometricDistribution4.getSampleSize();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.6500000000000004d + "'", double17 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, 35, 0);
        double double6 = hypergeometricDistribution3.cumulativeProbability((-1), (int) (short) -1);
        double double8 = hypergeometricDistribution3.probability(1);
        double double9 = hypergeometricDistribution3.calculateNumericalVariance();
        double double11 = hypergeometricDistribution3.cumulativeProbability((int) '#');
        hypergeometricDistribution3.reseedRandomGenerator((long) 4);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(100, (int) ' ', (int) '#');
        int int4 = hypergeometricDistribution3.getSupportLowerBound();
        int int5 = hypergeometricDistribution3.getNumberOfSuccesses();
        double double7 = hypergeometricDistribution3.upperCumulativeProbability((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.7763396693324591d + "'", double7 == 0.7763396693324591d);
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '4', 10, (int) (byte) 10);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getPopulationSize();
        double double7 = hypergeometricDistribution4.getNumericalMean();
        int int8 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int9 = hypergeometricDistribution4.getSampleSize();
        int int10 = hypergeometricDistribution4.getSampleSize();
        double double12 = hypergeometricDistribution4.probability(0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.35d + "'", double7 == 0.35d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.6500000000000004d + "'", double12 == 0.6500000000000004d);
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        double double11 = hypergeometricDistribution4.getNumericalVariance();
        double double13 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        boolean boolean14 = hypergeometricDistribution4.isSupportConnected();
        double double15 = hypergeometricDistribution4.calculateNumericalVariance();
        double double16 = hypergeometricDistribution4.calculateNumericalVariance();
        double double17 = hypergeometricDistribution4.getNumericalVariance();
        double double19 = hypergeometricDistribution4.cumulativeProbability(0);
        int int20 = hypergeometricDistribution4.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.2275d + "'", double11 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.2275d + "'", double15 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.2275d + "'", double16 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.2275d + "'", double17 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.6500000000000004d + "'", double19 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double7 = hypergeometricDistribution4.getNumericalMean();
        double double8 = hypergeometricDistribution4.getNumericalMean();
        int int9 = hypergeometricDistribution4.getSupportLowerBound();
        int int10 = hypergeometricDistribution4.getPopulationSize();
        double double11 = hypergeometricDistribution4.getNumericalMean();
        int int12 = hypergeometricDistribution4.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.35d + "'", double7 == 0.35d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.35d + "'", double8 == 0.35d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.35d + "'", double11 == 0.35d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, (int) (byte) 100, (int) (byte) 100);
        int int4 = hypergeometricDistribution3.getSampleSize();
        int int5 = hypergeometricDistribution3.getSampleSize();
        int int6 = hypergeometricDistribution3.getSampleSize();
        boolean boolean7 = hypergeometricDistribution3.isSupportConnected();
        int int9 = hypergeometricDistribution3.inverseCumulativeProbability(0.005038011914198055d);
        int int11 = hypergeometricDistribution3.inverseCumulativeProbability((double) (byte) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        int int10 = hypergeometricDistribution4.inverseCumulativeProbability(0.6500000000000004d);
        int int11 = hypergeometricDistribution4.getSupportLowerBound();
        int int12 = hypergeometricDistribution4.getPopulationSize();
        double double14 = hypergeometricDistribution4.upperCumulativeProbability(0);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = hypergeometricDistribution4.sample();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
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
        double double18 = hypergeometricDistribution4.upperCumulativeProbability((int) '4');
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
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        int int7 = hypergeometricDistribution4.getNumberOfSuccesses();
        boolean boolean8 = hypergeometricDistribution4.isSupportConnected();
        int int9 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int10 = hypergeometricDistribution4.getPopulationSize();
        int int11 = hypergeometricDistribution4.getSupportLowerBound();
        int int12 = hypergeometricDistribution4.getSupportUpperBound();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = hypergeometricDistribution4.inverseCumulativeProbability((double) 35);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: 35 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
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
        double double18 = hypergeometricDistribution4.calculateNumericalVariance();
        double double20 = hypergeometricDistribution4.upperCumulativeProbability(0);
        int int21 = hypergeometricDistribution4.getSupportUpperBound();
        double double23 = hypergeometricDistribution4.probability((int) (short) 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.2275d + "'", double18 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.3500000000000001d + "'", double23 == 0.3500000000000001d);
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(4, 0, (int) (byte) 0);
        hypergeometricDistribution3.reseedRandomGenerator((long) '#');
        double double7 = hypergeometricDistribution3.upperCumulativeProbability((int) (byte) 100);
        int[] intArray9 = hypergeometricDistribution3.sample(10);
        int int10 = hypergeometricDistribution3.getSampleSize();
        int int11 = hypergeometricDistribution3.getSampleSize();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) '#', 4, 4);
        int int5 = hypergeometricDistribution4.getPopulationSize();
        int int6 = hypergeometricDistribution4.getSampleSize();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) ' ', (int) ' ', (int) (byte) 1);
        double double5 = hypergeometricDistribution3.probability((int) '4');
        int int6 = hypergeometricDistribution3.getSupportUpperBound();
        int int7 = hypergeometricDistribution3.getSupportLowerBound();
        double double9 = hypergeometricDistribution3.cumulativeProbability(0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (byte) -1, (int) (byte) 1, 97);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: population size (-1)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
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
        double double21 = hypergeometricDistribution4.upperCumulativeProbability(1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.3500000000000001d + "'", double21 == 0.3500000000000001d);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (short) 10, 10, 1);
        int int4 = hypergeometricDistribution3.getSupportLowerBound();
        int int5 = hypergeometricDistribution3.getNumberOfSuccesses();
        double double7 = hypergeometricDistribution3.upperCumulativeProbability((int) 'a');
        int int8 = hypergeometricDistribution3.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (short) 100, (int) '#', 1);
        double double4 = hypergeometricDistribution3.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.35d + "'", double4 == 0.35d);
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        int int6 = hypergeometricDistribution4.getSupportLowerBound();
        double double7 = hypergeometricDistribution4.getNumericalMean();
        int int8 = hypergeometricDistribution4.getSampleSize();
        int int9 = hypergeometricDistribution4.getPopulationSize();
        double double10 = hypergeometricDistribution4.getNumericalVariance();
        int int11 = hypergeometricDistribution4.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.35d + "'", double7 == 0.35d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.2275d + "'", double10 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
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
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistribution4.reseedRandomGenerator((long) (byte) 1);
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
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        double double6 = hypergeometricDistribution4.getNumericalMean();
        double double7 = hypergeometricDistribution4.getNumericalVariance();
        double double9 = hypergeometricDistribution4.upperCumulativeProbability(52);
        double double11 = hypergeometricDistribution4.cumulativeProbability((-1));
        int int12 = hypergeometricDistribution4.getSampleSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.35d + "'", double6 == 0.35d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, 35, 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        double double6 = hypergeometricDistribution3.probability((int) 'a');
        boolean boolean7 = hypergeometricDistribution3.isSupportConnected();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = hypergeometricDistribution3.inverseCumulativeProbability(2.0681818181818183d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: 2.068 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) 'a', (int) (byte) 0, 0);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        int int7 = hypergeometricDistribution4.getNumberOfSuccesses();
        boolean boolean8 = hypergeometricDistribution4.isSupportConnected();
        double double10 = hypergeometricDistribution4.probability(35);
        double double11 = hypergeometricDistribution4.getNumericalMean();
        double double13 = hypergeometricDistribution4.probability(4);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.35d + "'", double11 == 0.35d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 10, (int) (byte) 1, 52);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: sample size (52) must be less than or equal to population size (10)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        double double7 = hypergeometricDistribution4.upperCumulativeProbability((int) (short) -1);
        boolean boolean8 = hypergeometricDistribution4.isSupportConnected();
        int int9 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int10 = hypergeometricDistribution4.getSampleSize();
        boolean boolean11 = hypergeometricDistribution4.isSupportConnected();
        double double12 = hypergeometricDistribution4.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.2275d + "'", double12 == 0.2275d);
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getPopulationSize();
        int int8 = hypergeometricDistribution4.inverseCumulativeProbability((double) (byte) 0);
        double double9 = hypergeometricDistribution4.getNumericalVariance();
        double double11 = hypergeometricDistribution4.cumulativeProbability((int) '#');
        double double12 = hypergeometricDistribution4.calculateNumericalVariance();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.2275d + "'", double9 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.2275d + "'", double12 == 0.2275d);
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
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
        double double21 = hypergeometricDistribution4.cumulativeProbability(0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.6500000000000004d + "'", double21 == 0.6500000000000004d);
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(0, 7, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: population size (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getPopulationSize();
        double double7 = hypergeometricDistribution4.getNumericalMean();
        double double10 = hypergeometricDistribution4.cumulativeProbability((int) (byte) -1, 1);
        int int11 = hypergeometricDistribution4.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.35d + "'", double7 == 0.35d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) ' ', (int) ' ', (int) (byte) 1);
        double double4 = hypergeometricDistribution3.getNumericalMean();
        int int5 = hypergeometricDistribution3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, 35, 0);
        int int4 = hypergeometricDistribution3.getPopulationSize();
        double double5 = hypergeometricDistribution3.getNumericalMean();
        double double6 = hypergeometricDistribution3.getNumericalVariance();
        int int7 = hypergeometricDistribution3.sample();
        int int8 = hypergeometricDistribution3.getSupportUpperBound();
        double double10 = hypergeometricDistribution3.probability((int) (byte) 10);
        int int11 = hypergeometricDistribution3.getSupportUpperBound();
        hypergeometricDistribution3.reseedRandomGenerator((long) 10);
        int int14 = hypergeometricDistribution3.getPopulationSize();
        double double15 = hypergeometricDistribution3.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(100, (int) (byte) 0, (int) (short) 10);
        double double4 = hypergeometricDistribution3.getNumericalVariance();
        double double6 = hypergeometricDistribution3.upperCumulativeProbability((int) '#');
        double double8 = hypergeometricDistribution3.upperCumulativeProbability(97);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(100, (int) ' ', (int) '#');
        int int4 = hypergeometricDistribution3.getPopulationSize();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = hypergeometricDistribution3.inverseCumulativeProbability((double) 10L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: 10 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
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
        int int23 = hypergeometricDistribution4.getPopulationSize();
        java.lang.Class<?> wildcardClass24 = hypergeometricDistribution4.getClass();
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) ' ', (int) ' ', (int) (byte) 1);
        int int4 = hypergeometricDistribution3.getSampleSize();
        boolean boolean5 = hypergeometricDistribution3.isSupportConnected();
        double double6 = hypergeometricDistribution3.getNumericalMean();
        double double7 = hypergeometricDistribution3.getNumericalVariance();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = hypergeometricDistribution3.cumulativeProbability((int) (short) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (100) must be less than or equal to upper endpoint (-1)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, (int) (byte) 10, (int) (byte) 0);
        int int5 = hypergeometricDistribution4.getSupportLowerBound();
        double double7 = hypergeometricDistribution4.cumulativeProbability((int) '#');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 10, 100, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: number of successes (100) must be less than or equal to population size (10)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, 35, 0);
        int int4 = hypergeometricDistribution3.getPopulationSize();
        int int5 = hypergeometricDistribution3.getPopulationSize();
        double double6 = hypergeometricDistribution3.getNumericalVariance();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = hypergeometricDistribution3.cumulativeProbability((int) 'a', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (97) must be less than or equal to upper endpoint (10)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        int int11 = hypergeometricDistribution4.getSupportUpperBound();
        int int12 = hypergeometricDistribution4.getPopulationSize();
        double double13 = hypergeometricDistribution4.getNumericalVariance();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = hypergeometricDistribution4.sample(24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2275d + "'", double13 == 0.2275d);
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (short) 100, (int) (byte) 0, (int) (short) 0);
        int int5 = hypergeometricDistribution3.inverseCumulativeProbability(0.2275d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        double double6 = hypergeometricDistribution4.getNumericalMean();
        double double8 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 10);
        int int9 = hypergeometricDistribution4.getSampleSize();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = hypergeometricDistribution4.sample();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.35d + "'", double6 == 0.35d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getPopulationSize();
        boolean boolean7 = hypergeometricDistribution4.isSupportConnected();
        double double9 = hypergeometricDistribution4.probability((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int11 = hypergeometricDistribution4.inverseCumulativeProbability((double) 52);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: 52 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(10, (int) (short) 10, (int) (short) 10);
        double double5 = hypergeometricDistribution3.upperCumulativeProbability((int) (byte) 1);
        int int6 = hypergeometricDistribution3.getPopulationSize();
        boolean boolean7 = hypergeometricDistribution3.isSupportConnected();
        int[] intArray9 = hypergeometricDistribution3.sample((int) (short) 10);
        int int10 = hypergeometricDistribution3.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
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
        int int16 = hypergeometricDistribution4.inverseCumulativeProbability(0.35d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.2275d + "'", double11 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.35d + "'", double12 == 0.35d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        int int7 = hypergeometricDistribution4.getNumberOfSuccesses();
        boolean boolean8 = hypergeometricDistribution4.isSupportConnected();
        double double10 = hypergeometricDistribution4.probability(35);
        double double11 = hypergeometricDistribution4.getNumericalVariance();
        int int12 = hypergeometricDistribution4.getSupportUpperBound();
        double double13 = hypergeometricDistribution4.getNumericalVariance();
        int int14 = hypergeometricDistribution4.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.2275d + "'", double11 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2275d + "'", double13 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        int int11 = hypergeometricDistribution4.getSupportUpperBound();
        int int12 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int13 = hypergeometricDistribution4.getPopulationSize();
        // The following exception was thrown during execution in test generation
        try {
            double double16 = hypergeometricDistribution4.cumulativeProbability((int) '4', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (52) must be less than or equal to upper endpoint (1)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(10, (int) (short) 10, (int) (short) 10);
        double double5 = hypergeometricDistribution3.upperCumulativeProbability((int) (byte) 1);
        int int6 = hypergeometricDistribution3.getPopulationSize();
        boolean boolean7 = hypergeometricDistribution3.isSupportConnected();
        int[] intArray9 = hypergeometricDistribution3.sample((int) (short) 10);
        double double10 = hypergeometricDistribution3.getNumericalVariance();
        double double12 = hypergeometricDistribution3.probability(0);
        double double13 = hypergeometricDistribution3.getNumericalVariance();
        double double16 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 0, 4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 });
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution4.isSupportConnected();
        double double7 = hypergeometricDistribution4.getNumericalVariance();
        double double10 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1, (int) 'a');
        int int11 = hypergeometricDistribution4.getNumberOfSuccesses();
        boolean boolean12 = hypergeometricDistribution4.isSupportConnected();
        double double14 = hypergeometricDistribution4.upperCumulativeProbability((int) 'a');
        double double16 = hypergeometricDistribution4.upperCumulativeProbability(97);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = hypergeometricDistribution4.inverseCumulativeProbability((double) 'a');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: 97 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution4.isSupportConnected();
        double double7 = hypergeometricDistribution4.getNumericalVariance();
        int int8 = hypergeometricDistribution4.getSupportUpperBound();
        double double11 = hypergeometricDistribution4.cumulativeProbability(0, (int) (short) 100);
        double double12 = hypergeometricDistribution4.getNumericalMean();
        int int13 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int14 = hypergeometricDistribution4.getSupportUpperBound();
        double double16 = hypergeometricDistribution4.upperCumulativeProbability(0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.34999999999999964d + "'", double11 == 0.34999999999999964d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.35d + "'", double12 == 0.35d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) -1, (int) (short) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: population size (-1)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        double double6 = hypergeometricDistribution4.getNumericalMean();
        double double7 = hypergeometricDistribution4.getNumericalVariance();
        int int8 = hypergeometricDistribution4.getSupportLowerBound();
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistribution4.reseedRandomGenerator((long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.35d + "'", double6 == 0.35d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getPopulationSize();
        double double7 = hypergeometricDistribution4.getNumericalMean();
        double double10 = hypergeometricDistribution4.cumulativeProbability((int) (byte) -1, 1);
        int int11 = hypergeometricDistribution4.getSampleSize();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.35d + "'", double7 == 0.35d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        double double12 = hypergeometricDistribution4.cumulativeProbability((int) ' ');
        double double13 = hypergeometricDistribution4.calculateNumericalVariance();
        int int14 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double15 = hypergeometricDistribution4.calculateNumericalVariance();
        double double16 = hypergeometricDistribution4.calculateNumericalVariance();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2275d + "'", double13 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.2275d + "'", double15 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.2275d + "'", double16 == 0.2275d);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, 35, 0);
        double double4 = hypergeometricDistribution3.getNumericalMean();
        double double6 = hypergeometricDistribution3.upperCumulativeProbability(100);
        double double8 = hypergeometricDistribution3.upperCumulativeProbability((int) '#');
        double double10 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        int int7 = hypergeometricDistribution4.getNumberOfSuccesses();
        boolean boolean8 = hypergeometricDistribution4.isSupportConnected();
        int int9 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int10 = hypergeometricDistribution4.getSupportLowerBound();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = hypergeometricDistribution4.sample(35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, 35, 0);
        double double4 = hypergeometricDistribution3.getNumericalMean();
        double double6 = hypergeometricDistribution3.upperCumulativeProbability(0);
        int int7 = hypergeometricDistribution3.getSampleSize();
        double double8 = hypergeometricDistribution3.getNumericalVariance();
        boolean boolean9 = hypergeometricDistribution3.isSupportConnected();
        int int10 = hypergeometricDistribution3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (short) 10, 10, 1);
        int int4 = hypergeometricDistribution3.getSupportLowerBound();
        int int5 = hypergeometricDistribution3.getNumberOfSuccesses();
        int int6 = hypergeometricDistribution3.sample();
        int int7 = hypergeometricDistribution3.getNumberOfSuccesses();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray9 = hypergeometricDistribution3.sample((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: number of samples (-1)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
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
        double double20 = hypergeometricDistribution4.probability((int) '#');
        double double22 = hypergeometricDistribution4.cumulativeProbability(24);
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
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        int int7 = hypergeometricDistribution4.getNumberOfSuccesses();
        boolean boolean8 = hypergeometricDistribution4.isSupportConnected();
        double double10 = hypergeometricDistribution4.probability(35);
        double double11 = hypergeometricDistribution4.getNumericalMean();
        int int12 = hypergeometricDistribution4.getSupportLowerBound();
        double double13 = hypergeometricDistribution4.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.35d + "'", double11 == 0.35d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.35d + "'", double13 == 0.35d);
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double7 = hypergeometricDistribution4.calculateNumericalVariance();
        double double9 = hypergeometricDistribution4.upperCumulativeProbability((-1));
        double double11 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 0);
        java.lang.Class<?> wildcardClass12 = hypergeometricDistribution4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.6500000000000004d + "'", double11 == 0.6500000000000004d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        double double7 = hypergeometricDistribution4.upperCumulativeProbability((int) (short) -1);
        boolean boolean8 = hypergeometricDistribution4.isSupportConnected();
        double double9 = hypergeometricDistribution4.getNumericalVariance();
        int int10 = hypergeometricDistribution4.getSupportUpperBound();
        boolean boolean11 = hypergeometricDistribution4.isSupportConnected();
        int int12 = hypergeometricDistribution4.getSupportLowerBound();
        double double13 = hypergeometricDistribution4.getNumericalMean();
        int int14 = hypergeometricDistribution4.getSupportUpperBound();
        double double15 = hypergeometricDistribution4.calculateNumericalVariance();
        double double17 = hypergeometricDistribution4.cumulativeProbability(4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.2275d + "'", double9 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.35d + "'", double13 == 0.35d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.2275d + "'", double15 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double7 = hypergeometricDistribution4.calculateNumericalVariance();
        double double9 = hypergeometricDistribution4.cumulativeProbability(4);
        int int10 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double12 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        boolean boolean5 = hypergeometricDistribution4.isSupportConnected();
        int int6 = hypergeometricDistribution4.getSampleSize();
        double double8 = hypergeometricDistribution4.probability(10);
        java.lang.Class<?> wildcardClass9 = hypergeometricDistribution4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        double double12 = hypergeometricDistribution4.cumulativeProbability((int) ' ');
        double double13 = hypergeometricDistribution4.calculateNumericalVariance();
        int int14 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double16 = hypergeometricDistribution4.probability((int) '4');
        double double18 = hypergeometricDistribution4.upperCumulativeProbability(100);
        boolean boolean19 = hypergeometricDistribution4.isSupportConnected();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2275d + "'", double13 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution4.isSupportConnected();
        double double7 = hypergeometricDistribution4.getNumericalVariance();
        int int8 = hypergeometricDistribution4.getSupportUpperBound();
        int int9 = hypergeometricDistribution4.getSupportLowerBound();
        int int10 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int11 = hypergeometricDistribution4.getPopulationSize();
        // The following exception was thrown during execution in test generation
        try {
            int int13 = hypergeometricDistribution4.inverseCumulativeProbability((double) 100L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: 100 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
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
            int int18 = hypergeometricDistribution4.inverseCumulativeProbability((double) 10L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: 10 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
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
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.cumulativeProbability(0);
        int int7 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double9 = hypergeometricDistribution4.probability((-1));
        int int10 = hypergeometricDistribution4.getSupportUpperBound();
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistribution4.reseedRandomGenerator((long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (byte) 100, (int) (short) 1, (int) (short) 10);
        double double6 = hypergeometricDistribution4.upperCumulativeProbability((-1));
        int int7 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double10 = hypergeometricDistribution4.cumulativeProbability((int) (short) 1, (int) (short) 1);
        double double12 = hypergeometricDistribution4.probability(24);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
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
        int int17 = hypergeometricDistribution4.getPopulationSize();
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(100, (int) (byte) 1, 52);
        double double5 = hypergeometricDistribution3.probability(24);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getPopulationSize();
        int int8 = hypergeometricDistribution4.inverseCumulativeProbability((double) (byte) 0);
        int int9 = hypergeometricDistribution4.getPopulationSize();
        int int11 = hypergeometricDistribution4.inverseCumulativeProbability((double) 1);
        double double13 = hypergeometricDistribution4.probability((int) (byte) 100);
        boolean boolean14 = hypergeometricDistribution4.isSupportConnected();
        double double15 = hypergeometricDistribution4.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.2275d + "'", double15 == 0.2275d);
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double7 = hypergeometricDistribution4.calculateNumericalVariance();
        double double10 = hypergeometricDistribution4.cumulativeProbability((int) (byte) -1, (int) '#');
        double double12 = hypergeometricDistribution4.probability((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistribution4.reseedRandomGenerator((long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.6500000000000004d + "'", double12 == 0.6500000000000004d);
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double7 = hypergeometricDistribution4.calculateNumericalVariance();
        int int8 = hypergeometricDistribution4.getSupportUpperBound();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray10 = hypergeometricDistribution4.sample(52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, 35, 0);
        double double6 = hypergeometricDistribution3.cumulativeProbability((-1), (int) (short) -1);
        int int7 = hypergeometricDistribution3.getSupportLowerBound();
        int int8 = hypergeometricDistribution3.getSupportLowerBound();
        int int10 = hypergeometricDistribution3.inverseCumulativeProbability((double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getPopulationSize();
        double double7 = hypergeometricDistribution4.getNumericalMean();
        double double10 = hypergeometricDistribution4.cumulativeProbability((int) (byte) -1, 1);
        double double12 = hypergeometricDistribution4.probability(35);
        int int14 = hypergeometricDistribution4.inverseCumulativeProbability(0.34999999999999964d);
        int int15 = hypergeometricDistribution4.getPopulationSize();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = hypergeometricDistribution4.sample(0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: number of samples (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.35d + "'", double7 == 0.35d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        double double8 = hypergeometricDistribution4.cumulativeProbability(1, (int) (short) 10);
        int int9 = hypergeometricDistribution4.getSupportUpperBound();
        double double10 = hypergeometricDistribution4.calculateNumericalVariance();
        double double12 = hypergeometricDistribution4.probability((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.2275d + "'", double10 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) 'a', 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: sample size (100) must be less than or equal to population size (97)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 35, (int) (short) 1, (int) (byte) 0);
        int int5 = hypergeometricDistribution4.getPopulationSize();
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistribution4.reseedRandomGenerator(10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
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
        int int18 = hypergeometricDistribution4.getSupportLowerBound();
        int int19 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int20 = hypergeometricDistribution4.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution4.isSupportConnected();
        double double7 = hypergeometricDistribution4.getNumericalVariance();
        double double9 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 10);
        int int10 = hypergeometricDistribution4.getSampleSize();
        double double11 = hypergeometricDistribution4.getNumericalMean();
        double double13 = hypergeometricDistribution4.probability(100);
        int int14 = hypergeometricDistribution4.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.35d + "'", double11 == 0.35d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
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
        double double29 = hypergeometricDistribution4.probability((int) (short) 1);
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
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.3500000000000001d + "'", double29 == 0.3500000000000001d);
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (short) 100, (int) (byte) 0, (int) (short) 0);
        double double4 = hypergeometricDistribution3.getNumericalVariance();
        int int5 = hypergeometricDistribution3.getNumberOfSuccesses();
        int int6 = hypergeometricDistribution3.getSampleSize();
        int int7 = hypergeometricDistribution3.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(35, (int) (short) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: number of successes (-1)");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
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
        double double27 = hypergeometricDistribution4.calculateNumericalVariance();
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
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.2275d + "'", double27 == 0.2275d);
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
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
        double double15 = hypergeometricDistribution4.probability((int) (byte) -1);
        int int16 = hypergeometricDistribution4.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.2275d + "'", double10 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, 35, 0);
        int int4 = hypergeometricDistribution3.getPopulationSize();
        double double5 = hypergeometricDistribution3.getNumericalMean();
        double double6 = hypergeometricDistribution3.getNumericalVariance();
        int int7 = hypergeometricDistribution3.sample();
        int int8 = hypergeometricDistribution3.getSampleSize();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.cumulativeProbability(0);
        double double7 = hypergeometricDistribution4.calculateNumericalVariance();
        boolean boolean8 = hypergeometricDistribution4.isSupportConnected();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double8 = hypergeometricDistribution4.probability((int) 'a');
        boolean boolean9 = hypergeometricDistribution4.isSupportConnected();
        int int10 = hypergeometricDistribution4.getSupportUpperBound();
        int int11 = hypergeometricDistribution4.getPopulationSize();
        double double13 = hypergeometricDistribution4.upperCumulativeProbability((int) '#');
        int int14 = hypergeometricDistribution4.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, (int) (byte) 100, (int) (byte) 100);
        int int4 = hypergeometricDistribution3.getSampleSize();
        int int5 = hypergeometricDistribution3.getSampleSize();
        int int6 = hypergeometricDistribution3.getSampleSize();
        double double8 = hypergeometricDistribution3.upperCumulativeProbability((int) (byte) -1);
        int int9 = hypergeometricDistribution3.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) ' ', (int) ' ', (int) (byte) 1);
        double double4 = hypergeometricDistribution3.getNumericalMean();
        double double6 = hypergeometricDistribution3.upperCumulativeProbability((int) (byte) 0);
        int int7 = hypergeometricDistribution3.getPopulationSize();
        double double8 = hypergeometricDistribution3.getNumericalMean();
        java.lang.Class<?> wildcardClass9 = hypergeometricDistribution3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        double double7 = hypergeometricDistribution4.upperCumulativeProbability((int) (short) -1);
        boolean boolean8 = hypergeometricDistribution4.isSupportConnected();
        double double9 = hypergeometricDistribution4.getNumericalVariance();
        double double10 = hypergeometricDistribution4.getNumericalVariance();
        boolean boolean11 = hypergeometricDistribution4.isSupportConnected();
        int int12 = hypergeometricDistribution4.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.2275d + "'", double9 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.2275d + "'", double10 == 0.2275d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(100, (int) (short) 10, 35);
        int int4 = hypergeometricDistribution3.getSupportLowerBound();
        int int5 = hypergeometricDistribution3.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
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
        // The following exception was thrown during execution in test generation
        try {
            double double24 = hypergeometricDistribution4.cumulativeProbability(32, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (32) must be less than or equal to upper endpoint (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
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
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(32, 4, (-1));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: number of samples (-1)");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        double double12 = hypergeometricDistribution4.cumulativeProbability((int) ' ');
        double double13 = hypergeometricDistribution4.calculateNumericalVariance();
        int int14 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double16 = hypergeometricDistribution4.probability((int) '4');
        int int17 = hypergeometricDistribution4.getPopulationSize();
        java.lang.Class<?> wildcardClass18 = hypergeometricDistribution4.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2275d + "'", double13 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        double double6 = hypergeometricDistribution4.getNumericalMean();
        double double8 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 10);
        double double11 = hypergeometricDistribution4.cumulativeProbability(0, (int) (short) 0);
        double double12 = hypergeometricDistribution4.getNumericalMean();
        double double13 = hypergeometricDistribution4.calculateNumericalVariance();
        double double15 = hypergeometricDistribution4.upperCumulativeProbability((int) (short) 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.35d + "'", double6 == 0.35d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.35d + "'", double12 == 0.35d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2275d + "'", double13 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        int int6 = hypergeometricDistribution4.getSupportLowerBound();
        boolean boolean7 = hypergeometricDistribution4.isSupportConnected();
        int int8 = hypergeometricDistribution4.getSupportLowerBound();
        double double10 = hypergeometricDistribution4.probability((int) (byte) 0);
        java.lang.Class<?> wildcardClass11 = hypergeometricDistribution4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.6500000000000004d + "'", double10 == 0.6500000000000004d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        double double11 = hypergeometricDistribution4.getNumericalVariance();
        int int12 = hypergeometricDistribution4.getSupportUpperBound();
        double double13 = hypergeometricDistribution4.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.2275d + "'", double11 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.35d + "'", double13 == 0.35d);
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double7 = hypergeometricDistribution4.getNumericalMean();
        double double9 = hypergeometricDistribution4.probability((int) (short) 10);
        int int10 = hypergeometricDistribution4.getSupportLowerBound();
        double double11 = hypergeometricDistribution4.getNumericalVariance();
        java.lang.Class<?> wildcardClass12 = hypergeometricDistribution4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.35d + "'", double7 == 0.35d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.2275d + "'", double11 == 0.2275d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, 35, 0);
        int int4 = hypergeometricDistribution3.getSupportLowerBound();
        int int5 = hypergeometricDistribution3.getSupportUpperBound();
        int int6 = hypergeometricDistribution3.getPopulationSize();
        double double8 = hypergeometricDistribution3.upperCumulativeProbability((int) (byte) -1);
        int int9 = hypergeometricDistribution3.getSupportUpperBound();
        int int10 = hypergeometricDistribution3.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        double double7 = hypergeometricDistribution4.upperCumulativeProbability((int) (short) -1);
        boolean boolean8 = hypergeometricDistribution4.isSupportConnected();
        int int9 = hypergeometricDistribution4.getSupportLowerBound();
        double double10 = hypergeometricDistribution4.calculateNumericalVariance();
        double double12 = hypergeometricDistribution4.probability(0);
        boolean boolean13 = hypergeometricDistribution4.isSupportConnected();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.2275d + "'", double10 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.6500000000000004d + "'", double12 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
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
        int int20 = hypergeometricDistribution4.getSupportUpperBound();
        int int21 = hypergeometricDistribution4.getSupportLowerBound();
        int int23 = hypergeometricDistribution4.inverseCumulativeProbability(0.23063024763524284d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.35d + "'", double17 == 0.35d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, 35, 0);
        int int4 = hypergeometricDistribution3.getPopulationSize();
        double double5 = hypergeometricDistribution3.getNumericalMean();
        double double6 = hypergeometricDistribution3.getNumericalVariance();
        int int8 = hypergeometricDistribution3.inverseCumulativeProbability((double) 0.0f);
        int int9 = hypergeometricDistribution3.getNumberOfSuccesses();
        double double11 = hypergeometricDistribution3.cumulativeProbability(32);
        java.lang.Class<?> wildcardClass12 = hypergeometricDistribution3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double7 = hypergeometricDistribution4.calculateNumericalVariance();
        double double9 = hypergeometricDistribution4.cumulativeProbability(4);
        boolean boolean10 = hypergeometricDistribution4.isSupportConnected();
        int int11 = hypergeometricDistribution4.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getPopulationSize();
        int int8 = hypergeometricDistribution4.inverseCumulativeProbability((double) (byte) 0);
        double double9 = hypergeometricDistribution4.getNumericalVariance();
        double double11 = hypergeometricDistribution4.upperCumulativeProbability((int) '#');
        double double13 = hypergeometricDistribution4.probability(0);
        int int15 = hypergeometricDistribution4.inverseCumulativeProbability(0.0d);
        boolean boolean16 = hypergeometricDistribution4.isSupportConnected();
        int int17 = hypergeometricDistribution4.getSampleSize();
        double double19 = hypergeometricDistribution4.probability(35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.2275d + "'", double9 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.6500000000000004d + "'", double13 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) ' ', (int) ' ', (int) (byte) 1);
        double double5 = hypergeometricDistribution3.probability((int) (short) 100);
        int int6 = hypergeometricDistribution3.getSupportUpperBound();
        double double7 = hypergeometricDistribution3.calculateNumericalVariance();
        int int8 = hypergeometricDistribution3.getNumberOfSuccesses();
        boolean boolean9 = hypergeometricDistribution3.isSupportConnected();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(4, 0, (int) (byte) 0);
        hypergeometricDistribution3.reseedRandomGenerator((long) '#');
        int int6 = hypergeometricDistribution3.getSupportLowerBound();
        boolean boolean7 = hypergeometricDistribution3.isSupportConnected();
        double double9 = hypergeometricDistribution3.probability(4);
        int int10 = hypergeometricDistribution3.getNumberOfSuccesses();
        double double11 = hypergeometricDistribution3.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
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
        int int23 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double25 = hypergeometricDistribution4.cumulativeProbability((int) (short) 0);
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.6500000000000004d + "'", double25 == 0.6500000000000004d);
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
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
        double double23 = hypergeometricDistribution4.cumulativeProbability(0);
        int int24 = hypergeometricDistribution4.getPopulationSize();
        boolean boolean25 = hypergeometricDistribution4.isSupportConnected();
        double double27 = hypergeometricDistribution4.probability(35);
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
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.6500000000000004d + "'", double23 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double7 = hypergeometricDistribution4.calculateNumericalVariance();
        double double9 = hypergeometricDistribution4.cumulativeProbability(4);
        boolean boolean10 = hypergeometricDistribution4.isSupportConnected();
        double double11 = hypergeometricDistribution4.getNumericalVariance();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = hypergeometricDistribution4.sample();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.2275d + "'", double11 == 0.2275d);
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, 35, 0);
        double double6 = hypergeometricDistribution3.cumulativeProbability((-1), (int) (short) -1);
        double double8 = hypergeometricDistribution3.probability(1);
        int int9 = hypergeometricDistribution3.getSupportUpperBound();
        hypergeometricDistribution3.reseedRandomGenerator((long) 1);
        double double14 = hypergeometricDistribution3.cumulativeProbability(10, 10);
        int int15 = hypergeometricDistribution3.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double7 = hypergeometricDistribution4.calculateNumericalVariance();
        int int9 = hypergeometricDistribution4.inverseCumulativeProbability((double) 0);
        double double12 = hypergeometricDistribution4.cumulativeProbability((int) '#', (int) '#');
        int int13 = hypergeometricDistribution4.getSampleSize();
        int int14 = hypergeometricDistribution4.getSupportLowerBound();
        int int15 = hypergeometricDistribution4.getSampleSize();
        double double17 = hypergeometricDistribution4.cumulativeProbability(0);
        double double18 = hypergeometricDistribution4.getNumericalVariance();
        double double19 = hypergeometricDistribution4.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.6500000000000004d + "'", double17 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.2275d + "'", double18 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.2275d + "'", double19 == 0.2275d);
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getPopulationSize();
        boolean boolean7 = hypergeometricDistribution4.isSupportConnected();
        double double9 = hypergeometricDistribution4.upperCumulativeProbability(0);
        int int10 = hypergeometricDistribution4.getPopulationSize();
        double double12 = hypergeometricDistribution4.upperCumulativeProbability(35);
        int int13 = hypergeometricDistribution4.getSupportUpperBound();
        boolean boolean14 = hypergeometricDistribution4.isSupportConnected();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 100, 10, (int) '4');
        double double6 = hypergeometricDistribution4.probability((int) (short) 1);
        int int7 = hypergeometricDistribution4.getPopulationSize();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = hypergeometricDistribution4.sample();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.005038011914198055d + "'", double6 == 0.005038011914198055d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 1, (int) '#');
        hypergeometricDistribution3.reseedRandomGenerator((-1L));
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        double double7 = hypergeometricDistribution4.upperCumulativeProbability((int) (short) -1);
        boolean boolean8 = hypergeometricDistribution4.isSupportConnected();
        double double9 = hypergeometricDistribution4.getNumericalVariance();
        int int10 = hypergeometricDistribution4.getSupportUpperBound();
        double double12 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double14 = hypergeometricDistribution4.upperCumulativeProbability(52);
        double double16 = hypergeometricDistribution4.probability((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistribution4.reseedRandomGenerator((long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.2275d + "'", double9 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.6500000000000004d + "'", double12 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 100, 7, 4);
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 0, (int) (byte) -1, 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: population size (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) ' ', (int) ' ', (int) (byte) 1);
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (short) 0);
        double double6 = hypergeometricDistribution3.getNumericalMean();
        double double7 = hypergeometricDistribution3.calculateNumericalVariance();
        double double8 = hypergeometricDistribution3.calculateNumericalVariance();
        int int9 = hypergeometricDistribution3.getNumberOfSuccesses();
        int int10 = hypergeometricDistribution3.getSupportUpperBound();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = hypergeometricDistribution3.sample(0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: number of samples (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
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
        boolean boolean15 = hypergeometricDistribution4.isSupportConnected();
        boolean boolean16 = hypergeometricDistribution4.isSupportConnected();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.35d + "'", double13 == 0.35d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.35d + "'", double14 == 0.35d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        int int7 = hypergeometricDistribution4.getNumberOfSuccesses();
        boolean boolean8 = hypergeometricDistribution4.isSupportConnected();
        int int9 = hypergeometricDistribution4.getPopulationSize();
        int int10 = hypergeometricDistribution4.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) -1, 7, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: population size (-1)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(100, (int) ' ', (int) '#');
        int int4 = hypergeometricDistribution3.getSupportLowerBound();
        double double6 = hypergeometricDistribution3.cumulativeProbability(35);
        int int7 = hypergeometricDistribution3.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
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
        double double24 = hypergeometricDistribution4.cumulativeProbability(24);
        int int25 = hypergeometricDistribution4.getSupportUpperBound();
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
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0d + "'", double24 == 1.0d);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 24, (int) (byte) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: sample size (52) must be less than or equal to population size (24)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(10, (int) (short) 10, (int) (short) 10);
        double double5 = hypergeometricDistribution3.upperCumulativeProbability((int) (byte) 1);
        double double7 = hypergeometricDistribution3.upperCumulativeProbability(97);
        hypergeometricDistribution3.reseedRandomGenerator((long) 'a');
        int int11 = hypergeometricDistribution3.inverseCumulativeProbability(0.6500000000000004d);
        int int12 = hypergeometricDistribution3.getSupportUpperBound();
        double double13 = hypergeometricDistribution3.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, 35, 0);
        int int4 = hypergeometricDistribution3.getPopulationSize();
        double double5 = hypergeometricDistribution3.getNumericalMean();
        double double6 = hypergeometricDistribution3.calculateNumericalVariance();
        int[] intArray8 = hypergeometricDistribution3.sample((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 0 });
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double9 = hypergeometricDistribution4.cumulativeProbability(0, (int) 'a');
        boolean boolean10 = hypergeometricDistribution4.isSupportConnected();
        double double12 = hypergeometricDistribution4.upperCumulativeProbability(100);
        int int13 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double14 = hypergeometricDistribution4.calculateNumericalVariance();
        double double16 = hypergeometricDistribution4.cumulativeProbability(52);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.34999999999999964d + "'", double9 == 0.34999999999999964d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.2275d + "'", double14 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, 35, 0);
        int int4 = hypergeometricDistribution3.getSupportLowerBound();
        int int5 = hypergeometricDistribution3.getSupportUpperBound();
        int int6 = hypergeometricDistribution3.getPopulationSize();
        double double8 = hypergeometricDistribution3.upperCumulativeProbability((int) (byte) -1);
        int int9 = hypergeometricDistribution3.getSupportUpperBound();
        int int10 = hypergeometricDistribution3.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
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
        double double28 = hypergeometricDistribution4.calculateNumericalVariance();
        int int29 = hypergeometricDistribution4.getSupportUpperBound();
        int int30 = hypergeometricDistribution4.getSupportUpperBound();
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.2275d + "'", double28 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double8 = hypergeometricDistribution4.probability((int) 'a');
        int int9 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double10 = hypergeometricDistribution4.getNumericalVariance();
        int int11 = hypergeometricDistribution4.getSupportLowerBound();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray13 = hypergeometricDistribution4.sample((int) (byte) 1);
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
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getPopulationSize();
        int int8 = hypergeometricDistribution4.inverseCumulativeProbability((double) (byte) 0);
        double double9 = hypergeometricDistribution4.getNumericalVariance();
        double double11 = hypergeometricDistribution4.upperCumulativeProbability((int) '#');
        double double13 = hypergeometricDistribution4.probability(0);
        boolean boolean14 = hypergeometricDistribution4.isSupportConnected();
        // The following exception was thrown during execution in test generation
        try {
            int int16 = hypergeometricDistribution4.inverseCumulativeProbability((double) 10.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: 10 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.2275d + "'", double9 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.6500000000000004d + "'", double13 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 24, 10);
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) ' ', (int) ' ', (int) (byte) 1);
        double double5 = hypergeometricDistribution3.probability((int) (short) 100);
        int int6 = hypergeometricDistribution3.getSupportUpperBound();
        double double8 = hypergeometricDistribution3.upperCumulativeProbability(35);
        double double10 = hypergeometricDistribution3.cumulativeProbability(100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
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
        double double21 = hypergeometricDistribution4.probability((int) (short) 1);
        boolean boolean22 = hypergeometricDistribution4.isSupportConnected();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.3500000000000001d + "'", double21 == 0.3500000000000001d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int7 = hypergeometricDistribution4.getSupportLowerBound();
        int int8 = hypergeometricDistribution4.getSampleSize();
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (short) 1);
        double double12 = hypergeometricDistribution4.cumulativeProbability((int) ' ');
        double double13 = hypergeometricDistribution4.calculateNumericalVariance();
        double double16 = hypergeometricDistribution4.cumulativeProbability(1, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistribution4.reseedRandomGenerator((long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.3500000000000001d + "'", double10 == 0.3500000000000001d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2275d + "'", double13 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, 35, 0);
        int int4 = hypergeometricDistribution3.getSupportLowerBound();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray6 = hypergeometricDistribution3.sample((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: number of samples (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, 35, 0);
        double double4 = hypergeometricDistribution3.getNumericalVariance();
        int[] intArray6 = hypergeometricDistribution3.sample(52);
        boolean boolean7 = hypergeometricDistribution3.isSupportConnected();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1852");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 35, (int) (short) 1, (int) (byte) 0);
        int int5 = hypergeometricDistribution4.getPopulationSize();
        double double6 = hypergeometricDistribution4.getNumericalVariance();
        double double7 = hypergeometricDistribution4.calculateNumericalVariance();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1853");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(4, (int) (short) 10, 97);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: number of successes (10) must be less than or equal to population size (4)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.probability((int) ' ');
        int int12 = hypergeometricDistribution4.inverseCumulativeProbability(0.34999999999999964d);
        double double15 = hypergeometricDistribution4.cumulativeProbability((int) (short) 10, 10);
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistribution4.reseedRandomGenerator((long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1855");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution4.isSupportConnected();
        double double7 = hypergeometricDistribution4.getNumericalVariance();
        double double9 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 10);
        int int10 = hypergeometricDistribution4.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1856");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution4.isSupportConnected();
        double double7 = hypergeometricDistribution4.getNumericalVariance();
        double double8 = hypergeometricDistribution4.getNumericalMean();
        double double10 = hypergeometricDistribution4.upperCumulativeProbability(100);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = hypergeometricDistribution4.inverseCumulativeProbability((double) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: 10 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.35d + "'", double8 == 0.35d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1857");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (short) 10, (int) (byte) 1, (int) (short) 1);
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, 35, 0);
        double double6 = hypergeometricDistribution3.cumulativeProbability((-1), (int) (short) -1);
        double double8 = hypergeometricDistribution3.probability(1);
        double double9 = hypergeometricDistribution3.calculateNumericalVariance();
        int int10 = hypergeometricDistribution3.getSupportLowerBound();
        int int11 = hypergeometricDistribution3.getSampleSize();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1859");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, 35, 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        int int5 = hypergeometricDistribution3.sample();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = hypergeometricDistribution3.cumulativeProbability(52, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (52) must be less than or equal to upper endpoint (10)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        boolean boolean5 = hypergeometricDistribution4.isSupportConnected();
        int int6 = hypergeometricDistribution4.getSampleSize();
        double double7 = hypergeometricDistribution4.getNumericalVariance();
        double double9 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1861");
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
        double double21 = hypergeometricDistribution4.cumulativeProbability((-1));
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1862");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (short) 10, (int) (byte) 1, 4);
        int int4 = hypergeometricDistribution3.getSupportUpperBound();
        int[] intArray6 = hypergeometricDistribution3.sample((int) 'a');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1863");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.cumulativeProbability(0);
        double double7 = hypergeometricDistribution4.calculateNumericalVariance();
        int int8 = hypergeometricDistribution4.getPopulationSize();
        double double10 = hypergeometricDistribution4.probability((int) (byte) -1);
        int int11 = hypergeometricDistribution4.getSupportUpperBound();
        double double13 = hypergeometricDistribution4.probability((int) (byte) 100);
        double double16 = hypergeometricDistribution4.cumulativeProbability(100, 100);
        int int17 = hypergeometricDistribution4.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1864");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.cumulativeProbability(0);
        double double7 = hypergeometricDistribution4.calculateNumericalVariance();
        int int8 = hypergeometricDistribution4.getPopulationSize();
        double double10 = hypergeometricDistribution4.probability((int) (byte) -1);
        double double12 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 100);
        int int13 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double15 = hypergeometricDistribution4.upperCumulativeProbability((int) 'a');
        int int16 = hypergeometricDistribution4.getSupportLowerBound();
        double double17 = hypergeometricDistribution4.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.35d + "'", double17 == 0.35d);
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1865");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) ' ', (int) ' ', (int) (byte) 1);
        double double5 = hypergeometricDistribution3.probability((int) (short) 100);
        int int6 = hypergeometricDistribution3.getSupportUpperBound();
        double double8 = hypergeometricDistribution3.upperCumulativeProbability(35);
        int int9 = hypergeometricDistribution3.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1866");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double9 = hypergeometricDistribution4.cumulativeProbability(0, (int) 'a');
        boolean boolean10 = hypergeometricDistribution4.isSupportConnected();
        double double12 = hypergeometricDistribution4.upperCumulativeProbability(100);
        int int13 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int14 = hypergeometricDistribution4.getSupportUpperBound();
        int int15 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int16 = hypergeometricDistribution4.getPopulationSize();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.34999999999999964d + "'", double9 == 0.34999999999999964d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1867");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, 35, 0);
        double double6 = hypergeometricDistribution3.cumulativeProbability((-1), (int) (short) -1);
        double double8 = hypergeometricDistribution3.probability(1);
        double double9 = hypergeometricDistribution3.calculateNumericalVariance();
        hypergeometricDistribution3.reseedRandomGenerator((long) '4');
        int int12 = hypergeometricDistribution3.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1868");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double7 = hypergeometricDistribution4.getNumericalMean();
        double double8 = hypergeometricDistribution4.getNumericalMean();
        int int9 = hypergeometricDistribution4.getSupportLowerBound();
        int int10 = hypergeometricDistribution4.getPopulationSize();
        double double11 = hypergeometricDistribution4.getNumericalMean();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray13 = hypergeometricDistribution4.sample(32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.35d + "'", double7 == 0.35d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.35d + "'", double8 == 0.35d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.35d + "'", double11 == 0.35d);
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
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
        double double21 = hypergeometricDistribution4.cumulativeProbability((-1));
        double double23 = hypergeometricDistribution4.cumulativeProbability((-1));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1870");
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
        int int17 = hypergeometricDistribution4.getPopulationSize();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.2275d + "'", double9 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1871");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 0, (int) (short) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: population size (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1872");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 0, 97, 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: population size (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1873");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) ' ', (int) (byte) 10, (int) ' ');
        boolean boolean4 = hypergeometricDistribution3.isSupportConnected();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1874");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = hypergeometricDistribution4.inverseCumulativeProbability((double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: 100 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1875");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(4, (-1), 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: number of successes (-1)");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1876");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (byte) 0, 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: population size (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1877");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double7 = hypergeometricDistribution4.calculateNumericalVariance();
        double double9 = hypergeometricDistribution4.probability((int) (byte) 100);
        int int10 = hypergeometricDistribution4.getSupportLowerBound();
        double double12 = hypergeometricDistribution4.cumulativeProbability(1);
        double double14 = hypergeometricDistribution4.probability((int) (short) 10);
        double double16 = hypergeometricDistribution4.cumulativeProbability((int) (short) 10);
        double double17 = hypergeometricDistribution4.calculateNumericalVariance();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.2275d + "'", double17 == 0.2275d);
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) -1, (int) (byte) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: population size (-1)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1879");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) ' ', (int) ' ', (int) (byte) 1);
        double double4 = hypergeometricDistribution3.getNumericalMean();
        int int5 = hypergeometricDistribution3.sample();
        int int6 = hypergeometricDistribution3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1880");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        boolean boolean5 = hypergeometricDistribution4.isSupportConnected();
        int int6 = hypergeometricDistribution4.getSampleSize();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = hypergeometricDistribution4.sample();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1881");
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
        int int25 = hypergeometricDistribution4.getSampleSize();
        double double26 = hypergeometricDistribution4.calculateNumericalVariance();
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
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 35 + "'", int25 == 35);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.2275d + "'", double26 == 0.2275d);
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1882");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        double double7 = hypergeometricDistribution4.upperCumulativeProbability((int) (short) -1);
        boolean boolean8 = hypergeometricDistribution4.isSupportConnected();
        double double9 = hypergeometricDistribution4.getNumericalVariance();
        double double10 = hypergeometricDistribution4.getNumericalMean();
        int int11 = hypergeometricDistribution4.getSampleSize();
        double double13 = hypergeometricDistribution4.cumulativeProbability(1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.2275d + "'", double9 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.35d + "'", double10 == 0.35d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1883");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getPopulationSize();
        boolean boolean7 = hypergeometricDistribution4.isSupportConnected();
        double double8 = hypergeometricDistribution4.getNumericalMean();
        double double10 = hypergeometricDistribution4.upperCumulativeProbability(20);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.35d + "'", double8 == 0.35d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1884");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) '4', 0, (int) '4');
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1885");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, (int) (byte) 100, (int) (byte) 100);
        int int4 = hypergeometricDistribution3.getSampleSize();
        int int5 = hypergeometricDistribution3.getSampleSize();
        int int6 = hypergeometricDistribution3.getSampleSize();
        int int7 = hypergeometricDistribution3.sample();
        boolean boolean8 = hypergeometricDistribution3.isSupportConnected();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1886");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 1, 0, 0);
        double double4 = hypergeometricDistribution3.getNumericalVariance();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = hypergeometricDistribution3.cumulativeProbability(4, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (4) must be less than or equal to upper endpoint (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1887");
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
        double double21 = hypergeometricDistribution4.upperCumulativeProbability(7);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1888");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) ' ', (int) ' ', (int) (byte) 1);
        double double4 = hypergeometricDistribution3.getNumericalMean();
        double double6 = hypergeometricDistribution3.upperCumulativeProbability((int) (byte) 0);
        int int7 = hypergeometricDistribution3.getPopulationSize();
        double double8 = hypergeometricDistribution3.getNumericalMean();
        int int9 = hypergeometricDistribution3.getNumberOfSuccesses();
        int[] intArray11 = hypergeometricDistribution3.sample(10);
        double double12 = hypergeometricDistribution3.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 });
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1889");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getPopulationSize();
        boolean boolean7 = hypergeometricDistribution4.isSupportConnected();
        double double9 = hypergeometricDistribution4.upperCumulativeProbability(0);
        int int10 = hypergeometricDistribution4.getPopulationSize();
        double double12 = hypergeometricDistribution4.upperCumulativeProbability(35);
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistribution4.reseedRandomGenerator((long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1890");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, (int) (byte) 100, (int) (byte) 100);
        int int4 = hypergeometricDistribution3.getSampleSize();
        double double6 = hypergeometricDistribution3.cumulativeProbability(0);
        int int7 = hypergeometricDistribution3.getSupportLowerBound();
        int int8 = hypergeometricDistribution3.getNumberOfSuccesses();
        double double10 = hypergeometricDistribution3.cumulativeProbability((int) (short) 1);
        double double12 = hypergeometricDistribution3.probability((int) '4');
        int int13 = hypergeometricDistribution3.getSampleSize();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1891");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        double double7 = hypergeometricDistribution4.upperCumulativeProbability((int) (short) -1);
        double double8 = hypergeometricDistribution4.getNumericalVariance();
        int int9 = hypergeometricDistribution4.getSupportUpperBound();
        boolean boolean10 = hypergeometricDistribution4.isSupportConnected();
        double double11 = hypergeometricDistribution4.getNumericalMean();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.2275d + "'", double8 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.35d + "'", double11 == 0.35d);
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1892");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        double double7 = hypergeometricDistribution4.upperCumulativeProbability((int) (short) -1);
        boolean boolean8 = hypergeometricDistribution4.isSupportConnected();
        int int9 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int10 = hypergeometricDistribution4.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1893");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 0, 7, (int) '4');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: population size (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1894");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getPopulationSize();
        int int8 = hypergeometricDistribution4.inverseCumulativeProbability((double) (byte) 0);
        double double9 = hypergeometricDistribution4.getNumericalVariance();
        double double11 = hypergeometricDistribution4.upperCumulativeProbability((int) '#');
        double double12 = hypergeometricDistribution4.getNumericalVariance();
        int int13 = hypergeometricDistribution4.getSupportLowerBound();
        double double15 = hypergeometricDistribution4.probability(97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.2275d + "'", double9 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.2275d + "'", double12 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1895");
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
        double double17 = hypergeometricDistribution4.calculateNumericalVariance();
        double double19 = hypergeometricDistribution4.probability((int) 'a');
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.2275d + "'", double14 == 0.2275d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.2275d + "'", double17 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1896");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 0, 4, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: population size (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1897");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double7 = hypergeometricDistribution4.calculateNumericalVariance();
        int int9 = hypergeometricDistribution4.inverseCumulativeProbability((double) 0);
        double double12 = hypergeometricDistribution4.cumulativeProbability((int) '#', (int) '#');
        int int13 = hypergeometricDistribution4.getSupportLowerBound();
        double double15 = hypergeometricDistribution4.upperCumulativeProbability(4);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1898");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        int int9 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int11 = hypergeometricDistribution4.inverseCumulativeProbability(0.0d);
        boolean boolean12 = hypergeometricDistribution4.isSupportConnected();
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistribution4.reseedRandomGenerator(0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1899");
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
        double double24 = hypergeometricDistribution4.getNumericalMean();
        double double26 = hypergeometricDistribution4.upperCumulativeProbability(52);
        boolean boolean27 = hypergeometricDistribution4.isSupportConnected();
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
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.35d + "'", double24 == 0.35d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1900");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double7 = hypergeometricDistribution4.getNumericalMean();
        double double8 = hypergeometricDistribution4.calculateNumericalVariance();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = hypergeometricDistribution4.sample();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.35d + "'", double7 == 0.35d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.2275d + "'", double8 == 0.2275d);
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1901");
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
        // The following exception was thrown during execution in test generation
        try {
            int int28 = hypergeometricDistribution4.sample();
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
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1902");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        int int11 = hypergeometricDistribution4.getSupportUpperBound();
        int int12 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int13 = hypergeometricDistribution4.getPopulationSize();
        double double16 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 10, (int) (byte) 10);
        double double17 = hypergeometricDistribution4.getNumericalMean();
        double double19 = hypergeometricDistribution4.probability((int) '4');
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.35d + "'", double17 == 0.35d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1903");
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
        // The following exception was thrown during execution in test generation
        try {
            int int28 = hypergeometricDistribution4.inverseCumulativeProbability((double) 'a');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: 97 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
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
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.2275d + "'", double22 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1904");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 10, (int) '#');
        double double4 = hypergeometricDistribution3.getNumericalVariance();
        int int5 = hypergeometricDistribution3.sample();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1905");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 35, 10, (int) '#');
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1906");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double7 = hypergeometricDistribution4.calculateNumericalVariance();
        double double9 = hypergeometricDistribution4.upperCumulativeProbability((-1));
        double double11 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 10);
        int int12 = hypergeometricDistribution4.getSampleSize();
        double double13 = hypergeometricDistribution4.getNumericalVariance();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = hypergeometricDistribution4.sample((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2275d + "'", double13 == 0.2275d);
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1907");
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
        // The following exception was thrown during execution in test generation
        try {
            int int24 = hypergeometricDistribution4.sample();
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1908");
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
        int int20 = hypergeometricDistribution4.getSampleSize();
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35 + "'", int20 == 35);
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1909");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        int int7 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double9 = hypergeometricDistribution4.cumulativeProbability((int) '#');
        int int10 = hypergeometricDistribution4.getSupportLowerBound();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = hypergeometricDistribution4.sample((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1910");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(100, (int) (short) 10, 35);
        double double5 = hypergeometricDistribution3.probability(4);
        int int6 = hypergeometricDistribution3.getPopulationSize();
        double double7 = hypergeometricDistribution3.getNumericalVariance();
        java.lang.Class<?> wildcardClass8 = hypergeometricDistribution3.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.24984402316337592d + "'", double5 == 0.24984402316337592d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 2.0681818181818183d + "'", double7 == 2.0681818181818183d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1911");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        int int11 = hypergeometricDistribution4.getSupportUpperBound();
        int int12 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int13 = hypergeometricDistribution4.getPopulationSize();
        double double14 = hypergeometricDistribution4.getNumericalMean();
        int int15 = hypergeometricDistribution4.getSampleSize();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.35d + "'", double14 == 0.35d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1912");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) -1, (int) (short) 10, 52);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: population size (-1)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1913");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        double double12 = hypergeometricDistribution4.upperCumulativeProbability(1);
        int int13 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double14 = hypergeometricDistribution4.getNumericalMean();
        int int15 = hypergeometricDistribution4.getSupportUpperBound();
        int int16 = hypergeometricDistribution4.getSampleSize();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.3500000000000001d + "'", double12 == 0.3500000000000001d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.35d + "'", double14 == 0.35d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1914");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution4.isSupportConnected();
        double double7 = hypergeometricDistribution4.getNumericalVariance();
        double double8 = hypergeometricDistribution4.getNumericalMean();
        double double9 = hypergeometricDistribution4.getNumericalMean();
        java.lang.Class<?> wildcardClass10 = hypergeometricDistribution4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.35d + "'", double8 == 0.35d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.35d + "'", double9 == 0.35d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1915");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        double double7 = hypergeometricDistribution4.upperCumulativeProbability((int) (short) -1);
        boolean boolean8 = hypergeometricDistribution4.isSupportConnected();
        double double9 = hypergeometricDistribution4.getNumericalVariance();
        double double10 = hypergeometricDistribution4.getNumericalVariance();
        int int11 = hypergeometricDistribution4.getSampleSize();
        double double13 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = hypergeometricDistribution4.sample((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.2275d + "'", double9 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.2275d + "'", double10 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1916");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        double double12 = hypergeometricDistribution4.cumulativeProbability((int) ' ');
        double double13 = hypergeometricDistribution4.calculateNumericalVariance();
        int int14 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double15 = hypergeometricDistribution4.calculateNumericalVariance();
        double double16 = hypergeometricDistribution4.getNumericalVariance();
        double double18 = hypergeometricDistribution4.probability((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2275d + "'", double13 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.2275d + "'", double15 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.2275d + "'", double16 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1917");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double7 = hypergeometricDistribution4.calculateNumericalVariance();
        int int8 = hypergeometricDistribution4.getSupportUpperBound();
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 10);
        double double12 = hypergeometricDistribution4.probability(4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1918");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        double double6 = hypergeometricDistribution4.getNumericalMean();
        double double8 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 10);
        double double11 = hypergeometricDistribution4.cumulativeProbability(0, (int) (short) 0);
        double double12 = hypergeometricDistribution4.getNumericalMean();
        double double13 = hypergeometricDistribution4.calculateNumericalVariance();
        double double15 = hypergeometricDistribution4.probability((int) (byte) 100);
        double double16 = hypergeometricDistribution4.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.35d + "'", double6 == 0.35d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.35d + "'", double12 == 0.35d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2275d + "'", double13 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.35d + "'", double16 == 0.35d);
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1919");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 24, (int) (byte) 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: sample size (32) must be less than or equal to population size (24)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1920");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution4.isSupportConnected();
        double double7 = hypergeometricDistribution4.getNumericalVariance();
        double double10 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1, (int) 'a');
        double double12 = hypergeometricDistribution4.upperCumulativeProbability((-1));
        double double13 = hypergeometricDistribution4.getNumericalVariance();
        double double14 = hypergeometricDistribution4.getNumericalMean();
        double double15 = hypergeometricDistribution4.getNumericalMean();
        double double16 = hypergeometricDistribution4.calculateNumericalVariance();
        int int17 = hypergeometricDistribution4.getSampleSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2275d + "'", double13 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.35d + "'", double14 == 0.35d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.35d + "'", double15 == 0.35d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.2275d + "'", double16 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1921");
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
        int int18 = hypergeometricDistribution4.getSupportUpperBound();
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1922");
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
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = hypergeometricDistribution4.sample((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: number of samples (-1)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
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
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1923");
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
        int int26 = hypergeometricDistribution4.getSampleSize();
        java.lang.Class<?> wildcardClass27 = hypergeometricDistribution4.getClass();
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 35 + "'", int26 == 35);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1924");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        int int11 = hypergeometricDistribution4.getSupportUpperBound();
        int int12 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int13 = hypergeometricDistribution4.getPopulationSize();
        double double16 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 10, (int) (byte) 10);
        double double17 = hypergeometricDistribution4.getNumericalMean();
        double double20 = hypergeometricDistribution4.cumulativeProbability(0, 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.35d + "'", double17 == 0.35d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1925");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getPopulationSize();
        int int8 = hypergeometricDistribution4.inverseCumulativeProbability((double) (byte) 0);
        double double9 = hypergeometricDistribution4.getNumericalVariance();
        double double11 = hypergeometricDistribution4.cumulativeProbability((int) '#');
        int int12 = hypergeometricDistribution4.getSupportUpperBound();
        double double13 = hypergeometricDistribution4.getNumericalMean();
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistribution4.reseedRandomGenerator((long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.2275d + "'", double9 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.35d + "'", double13 == 0.35d);
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1926");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        double double12 = hypergeometricDistribution4.cumulativeProbability((int) ' ');
        int int14 = hypergeometricDistribution4.inverseCumulativeProbability((double) 1L);
        double double16 = hypergeometricDistribution4.cumulativeProbability((int) (short) -1);
        double double17 = hypergeometricDistribution4.getNumericalVariance();
        boolean boolean18 = hypergeometricDistribution4.isSupportConnected();
        boolean boolean19 = hypergeometricDistribution4.isSupportConnected();
        double double21 = hypergeometricDistribution4.probability(7);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.2275d + "'", double17 == 0.2275d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1927");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int7 = hypergeometricDistribution4.getSupportLowerBound();
        int int8 = hypergeometricDistribution4.getSampleSize();
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (short) 1);
        double double11 = hypergeometricDistribution4.getNumericalVariance();
        double double12 = hypergeometricDistribution4.getNumericalVariance();
        double double15 = hypergeometricDistribution4.cumulativeProbability(0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = hypergeometricDistribution4.sample();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.3500000000000001d + "'", double10 == 0.3500000000000001d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.2275d + "'", double11 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.2275d + "'", double12 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.34999999999999964d + "'", double15 == 0.34999999999999964d);
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1928");
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
            double double15 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (100) must be less than or equal to upper endpoint (1)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
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
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1929");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        int int6 = hypergeometricDistribution4.getSupportLowerBound();
        double double7 = hypergeometricDistribution4.getNumericalMean();
        double double9 = hypergeometricDistribution4.upperCumulativeProbability((int) (short) 1);
        int int10 = hypergeometricDistribution4.getPopulationSize();
        int int11 = hypergeometricDistribution4.getSampleSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.35d + "'", double7 == 0.35d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.3500000000000001d + "'", double9 == 0.3500000000000001d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1930");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double7 = hypergeometricDistribution4.calculateNumericalVariance();
        double double10 = hypergeometricDistribution4.cumulativeProbability((int) (byte) -1, (int) '#');
        double double12 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double14 = hypergeometricDistribution4.probability((int) 'a');
        int int15 = hypergeometricDistribution4.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.6500000000000004d + "'", double12 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1931");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        int int11 = hypergeometricDistribution4.getSupportUpperBound();
        int int12 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double14 = hypergeometricDistribution4.cumulativeProbability((int) (short) 1);
        double double16 = hypergeometricDistribution4.cumulativeProbability((int) (short) -1);
        double double19 = hypergeometricDistribution4.cumulativeProbability(10, 35);
        int int20 = hypergeometricDistribution4.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1932");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (short) 1, 35);
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1933");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(10, 4, (int) (short) 1);
        int int4 = hypergeometricDistribution3.getPopulationSize();
        double double6 = hypergeometricDistribution3.cumulativeProbability((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1934");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(10, (int) (short) 10, (int) (short) 10);
        int int4 = hypergeometricDistribution3.getSupportLowerBound();
        double double6 = hypergeometricDistribution3.upperCumulativeProbability((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1935");
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
        int int25 = hypergeometricDistribution4.getSupportUpperBound();
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
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1936");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, 35, 0);
        double double6 = hypergeometricDistribution3.cumulativeProbability((-1), (int) (short) -1);
        double double8 = hypergeometricDistribution3.probability(1);
        boolean boolean9 = hypergeometricDistribution3.isSupportConnected();
        double double10 = hypergeometricDistribution3.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1937");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, (int) (byte) 100, (int) (byte) 100);
        int int4 = hypergeometricDistribution3.getSampleSize();
        int int5 = hypergeometricDistribution3.getSampleSize();
        int int6 = hypergeometricDistribution3.getSupportUpperBound();
        int int7 = hypergeometricDistribution3.getSupportUpperBound();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = hypergeometricDistribution3.cumulativeProbability((int) '#', 24);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (35) must be less than or equal to upper endpoint (24)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1938");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution4.isSupportConnected();
        double double7 = hypergeometricDistribution4.getNumericalVariance();
        double double10 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1, (int) 'a');
        double double12 = hypergeometricDistribution4.upperCumulativeProbability((-1));
        double double13 = hypergeometricDistribution4.getNumericalVariance();
        double double14 = hypergeometricDistribution4.getNumericalMean();
        double double15 = hypergeometricDistribution4.getNumericalMean();
        double double16 = hypergeometricDistribution4.calculateNumericalVariance();
        // The following exception was thrown during execution in test generation
        try {
            double double19 = hypergeometricDistribution4.cumulativeProbability((int) (short) 1, (-1));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (1) must be less than or equal to upper endpoint (-1)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2275d + "'", double13 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.35d + "'", double14 == 0.35d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.35d + "'", double15 == 0.35d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.2275d + "'", double16 == 0.2275d);
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1939");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        int int11 = hypergeometricDistribution4.getSupportUpperBound();
        int int13 = hypergeometricDistribution4.inverseCumulativeProbability((double) 1L);
        int int14 = hypergeometricDistribution4.getSampleSize();
        double double16 = hypergeometricDistribution4.cumulativeProbability(0);
        double double18 = hypergeometricDistribution4.upperCumulativeProbability((int) (short) -1);
        double double19 = hypergeometricDistribution4.getNumericalVariance();
        int int20 = hypergeometricDistribution4.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.6500000000000004d + "'", double16 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.2275d + "'", double19 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1940");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        int int7 = hypergeometricDistribution4.getNumberOfSuccesses();
        boolean boolean8 = hypergeometricDistribution4.isSupportConnected();
        int int9 = hypergeometricDistribution4.getPopulationSize();
        double double11 = hypergeometricDistribution4.probability((int) (byte) -1);
        boolean boolean12 = hypergeometricDistribution4.isSupportConnected();
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1941");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.cumulativeProbability(0);
        double double7 = hypergeometricDistribution4.calculateNumericalVariance();
        int int8 = hypergeometricDistribution4.getPopulationSize();
        double double10 = hypergeometricDistribution4.probability((int) (byte) -1);
        double double12 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 100);
        boolean boolean13 = hypergeometricDistribution4.isSupportConnected();
        // The following exception was thrown during execution in test generation
        try {
            int int15 = hypergeometricDistribution4.inverseCumulativeProbability((double) 52);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: 52 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1942");
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
        double double19 = hypergeometricDistribution4.getNumericalVariance();
        int int20 = hypergeometricDistribution4.getSupportUpperBound();
        double double21 = hypergeometricDistribution4.calculateNumericalVariance();
        int int22 = hypergeometricDistribution4.getSampleSize();
        // The following exception was thrown during execution in test generation
        try {
            int int23 = hypergeometricDistribution4.sample();
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
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.2275d + "'", double19 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.2275d + "'", double21 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 35 + "'", int22 == 35);
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1943");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (short) 100, (int) (byte) 0, (int) (short) 0);
        double double4 = hypergeometricDistribution3.getNumericalVariance();
        double double5 = hypergeometricDistribution3.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution3.isSupportConnected();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1944");
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
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistribution4.reseedRandomGenerator((long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2275d + "'", double13 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.2275d + "'", double14 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.35d + "'", double15 == 0.35d);
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1945");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double8 = hypergeometricDistribution4.probability((int) 'a');
        boolean boolean9 = hypergeometricDistribution4.isSupportConnected();
        int int10 = hypergeometricDistribution4.getSupportUpperBound();
        int int11 = hypergeometricDistribution4.getPopulationSize();
        double double12 = hypergeometricDistribution4.calculateNumericalVariance();
        int int13 = hypergeometricDistribution4.getSampleSize();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.2275d + "'", double12 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1946");
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
        double double17 = hypergeometricDistribution4.cumulativeProbability(1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.2275d + "'", double14 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1947");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double9 = hypergeometricDistribution4.cumulativeProbability(0, (int) 'a');
        int int10 = hypergeometricDistribution4.getSampleSize();
        java.lang.Class<?> wildcardClass11 = hypergeometricDistribution4.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.34999999999999964d + "'", double9 == 0.34999999999999964d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1948");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, 35, 0);
        int int4 = hypergeometricDistribution3.getPopulationSize();
        int int5 = hypergeometricDistribution3.getPopulationSize();
        double double6 = hypergeometricDistribution3.getNumericalVariance();
        int int7 = hypergeometricDistribution3.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1949");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getPopulationSize();
        int int8 = hypergeometricDistribution4.inverseCumulativeProbability((double) (byte) 0);
        double double10 = hypergeometricDistribution4.cumulativeProbability((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistribution4.reseedRandomGenerator((long) 97);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.6500000000000004d + "'", double10 == 0.6500000000000004d);
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1950");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        int int6 = hypergeometricDistribution4.getSupportLowerBound();
        double double8 = hypergeometricDistribution4.probability(1);
        double double10 = hypergeometricDistribution4.cumulativeProbability((int) (short) 100);
        boolean boolean11 = hypergeometricDistribution4.isSupportConnected();
        double double13 = hypergeometricDistribution4.cumulativeProbability((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = hypergeometricDistribution4.sample(100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.3500000000000001d + "'", double8 == 0.3500000000000001d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1951");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        int int7 = hypergeometricDistribution4.getNumberOfSuccesses();
        boolean boolean8 = hypergeometricDistribution4.isSupportConnected();
        int int9 = hypergeometricDistribution4.getPopulationSize();
        double double12 = hypergeometricDistribution4.cumulativeProbability(1, (int) (byte) 10);
        double double14 = hypergeometricDistribution4.probability((int) '#');
        int int15 = hypergeometricDistribution4.getSampleSize();
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistribution4.reseedRandomGenerator((long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1952");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, (int) (byte) 100, (int) (byte) 100);
        int int4 = hypergeometricDistribution3.getSampleSize();
        int int5 = hypergeometricDistribution3.getSampleSize();
        int int6 = hypergeometricDistribution3.getSampleSize();
        int int7 = hypergeometricDistribution3.sample();
        int int8 = hypergeometricDistribution3.getSupportLowerBound();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = hypergeometricDistribution3.inverseCumulativeProbability(5.000404040404041d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: 5 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1953");
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
        double double19 = hypergeometricDistribution4.getNumericalVariance();
        int int20 = hypergeometricDistribution4.getSupportUpperBound();
        double double21 = hypergeometricDistribution4.calculateNumericalVariance();
        double double23 = hypergeometricDistribution4.probability(1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2275d + "'", double13 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.2275d + "'", double19 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.2275d + "'", double21 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.3500000000000001d + "'", double23 == 0.3500000000000001d);
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1954");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        int int7 = hypergeometricDistribution4.getNumberOfSuccesses();
        boolean boolean8 = hypergeometricDistribution4.isSupportConnected();
        double double10 = hypergeometricDistribution4.probability(35);
        double double11 = hypergeometricDistribution4.getNumericalMean();
        int int12 = hypergeometricDistribution4.getSupportLowerBound();
        double double14 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.35d + "'", double11 == 0.35d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1955");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double7 = hypergeometricDistribution4.calculateNumericalVariance();
        int int9 = hypergeometricDistribution4.inverseCumulativeProbability((double) 0);
        double double11 = hypergeometricDistribution4.cumulativeProbability((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray13 = hypergeometricDistribution4.sample(4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1956");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(100, (int) (byte) 0, (int) (short) 10);
        double double4 = hypergeometricDistribution3.getNumericalVariance();
        double double6 = hypergeometricDistribution3.probability((int) '#');
        int int7 = hypergeometricDistribution3.getSampleSize();
        boolean boolean8 = hypergeometricDistribution3.isSupportConnected();
        java.lang.Class<?> wildcardClass9 = hypergeometricDistribution3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1957");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getPopulationSize();
        int int8 = hypergeometricDistribution4.inverseCumulativeProbability((double) (byte) 0);
        double double9 = hypergeometricDistribution4.getNumericalVariance();
        double double11 = hypergeometricDistribution4.probability((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistribution4.reseedRandomGenerator((long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.2275d + "'", double9 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.3500000000000001d + "'", double11 == 0.3500000000000001d);
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1958");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        double double6 = hypergeometricDistribution4.getNumericalMean();
        int int7 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int8 = hypergeometricDistribution4.getSupportUpperBound();
        int int9 = hypergeometricDistribution4.getSupportUpperBound();
        double double10 = hypergeometricDistribution4.calculateNumericalVariance();
        int int11 = hypergeometricDistribution4.getSupportLowerBound();
        int int12 = hypergeometricDistribution4.getSupportLowerBound();
        double double14 = hypergeometricDistribution4.upperCumulativeProbability((int) '4');
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.35d + "'", double6 == 0.35d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.2275d + "'", double10 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1959");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(10, (int) (short) 10, (int) (short) 10);
        double double5 = hypergeometricDistribution3.upperCumulativeProbability((int) (byte) 1);
        double double7 = hypergeometricDistribution3.upperCumulativeProbability(97);
        hypergeometricDistribution3.reseedRandomGenerator((long) 'a');
        int int11 = hypergeometricDistribution3.inverseCumulativeProbability(0.6500000000000004d);
        java.lang.Class<?> wildcardClass12 = hypergeometricDistribution3.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1960");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) -1, (int) (byte) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: population size (-1)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1961");
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
        double double27 = hypergeometricDistribution4.probability(35);
        int int28 = hypergeometricDistribution4.getSampleSize();
        int int29 = hypergeometricDistribution4.getSupportLowerBound();
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
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 35 + "'", int28 == 35);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1962");
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
        int int25 = hypergeometricDistribution4.getPopulationSize();
        double double26 = hypergeometricDistribution4.getNumericalVariance();
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistribution4.reseedRandomGenerator((long) '4');
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
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.2275d + "'", double22 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.2275d + "'", double26 == 0.2275d);
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1963");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 0, (int) (byte) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: population size (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1964");
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
        boolean boolean14 = hypergeometricDistribution4.isSupportConnected();
        int int15 = hypergeometricDistribution4.getPopulationSize();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.35d + "'", double9 == 0.35d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1965");
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
        double double23 = hypergeometricDistribution4.getNumericalVariance();
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
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.2275d + "'", double23 == 0.2275d);
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1966");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int7 = hypergeometricDistribution4.getSupportLowerBound();
        int int8 = hypergeometricDistribution4.getSampleSize();
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (short) 1);
        double double11 = hypergeometricDistribution4.getNumericalVariance();
        double double12 = hypergeometricDistribution4.getNumericalVariance();
        double double14 = hypergeometricDistribution4.probability(32);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.3500000000000001d + "'", double10 == 0.3500000000000001d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.2275d + "'", double11 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.2275d + "'", double12 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1967");
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
        double double18 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1968");
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
        boolean boolean25 = hypergeometricDistribution4.isSupportConnected();
        double double26 = hypergeometricDistribution4.calculateNumericalVariance();
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
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.2275d + "'", double26 == 0.2275d);
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1969");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int7 = hypergeometricDistribution4.getSupportLowerBound();
        int int8 = hypergeometricDistribution4.getSampleSize();
        double double9 = hypergeometricDistribution4.getNumericalMean();
        boolean boolean10 = hypergeometricDistribution4.isSupportConnected();
        double double12 = hypergeometricDistribution4.probability((int) (short) 1);
        double double15 = hypergeometricDistribution4.cumulativeProbability(4, 24);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.35d + "'", double9 == 0.35d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.3500000000000001d + "'", double12 == 0.3500000000000001d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1970");
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
            int int12 = hypergeometricDistribution4.sample();
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
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1971");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (-1), 0, 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: population size (-1)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1972");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (short) 1, (int) ' ', 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: number of successes (32) must be less than or equal to population size (1)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1973");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (byte) 0, (int) (short) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: population size (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1974");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        int int7 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int8 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int10 = hypergeometricDistribution4.inverseCumulativeProbability(0.35d);
        double double11 = hypergeometricDistribution4.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.2275d + "'", double11 == 0.2275d);
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1975");
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
        double double19 = hypergeometricDistribution4.getNumericalMean();
        double double21 = hypergeometricDistribution4.cumulativeProbability((int) '#');
        int int22 = hypergeometricDistribution4.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.35d + "'", double19 == 0.35d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1976");
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
        double double26 = hypergeometricDistribution4.probability((int) (short) 1);
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
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.3500000000000001d + "'", double26 == 0.3500000000000001d);
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1977");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        int int7 = hypergeometricDistribution4.getNumberOfSuccesses();
        boolean boolean8 = hypergeometricDistribution4.isSupportConnected();
        int int9 = hypergeometricDistribution4.getPopulationSize();
        double double11 = hypergeometricDistribution4.probability((int) (byte) -1);
        boolean boolean12 = hypergeometricDistribution4.isSupportConnected();
        double double14 = hypergeometricDistribution4.upperCumulativeProbability((int) ' ');
        int int15 = hypergeometricDistribution4.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1978");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        double double6 = hypergeometricDistribution4.getNumericalMean();
        int int7 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double9 = hypergeometricDistribution4.upperCumulativeProbability(4);
        double double11 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 10);
        double double12 = hypergeometricDistribution4.getNumericalVariance();
        double double14 = hypergeometricDistribution4.upperCumulativeProbability((int) (short) 1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.35d + "'", double6 == 0.35d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.2275d + "'", double12 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.3500000000000001d + "'", double14 == 0.3500000000000001d);
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1979");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double7 = hypergeometricDistribution4.calculateNumericalVariance();
        int int9 = hypergeometricDistribution4.inverseCumulativeProbability((double) 0);
        int int10 = hypergeometricDistribution4.getSupportUpperBound();
        int int11 = hypergeometricDistribution4.getPopulationSize();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1980");
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
        int int24 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int25 = hypergeometricDistribution4.getPopulationSize();
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistribution4.reseedRandomGenerator((long) (short) 1);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1981");
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
        double double18 = hypergeometricDistribution4.cumulativeProbability((int) (short) -1, 10);
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
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1982");
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
        double double17 = hypergeometricDistribution4.getNumericalMean();
        java.lang.Class<?> wildcardClass18 = hypergeometricDistribution4.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.2275d + "'", double14 == 0.2275d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.35d + "'", double17 == 0.35d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1983");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double7 = hypergeometricDistribution4.calculateNumericalVariance();
        double double9 = hypergeometricDistribution4.upperCumulativeProbability((-1));
        double double11 = hypergeometricDistribution4.cumulativeProbability((int) (short) 1);
        int int12 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int13 = hypergeometricDistribution4.getPopulationSize();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = hypergeometricDistribution4.sample((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1984");
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
        double double28 = hypergeometricDistribution4.probability((int) (byte) 0);
        int int29 = hypergeometricDistribution4.getNumberOfSuccesses();
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
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.6500000000000004d + "'", double28 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1985");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution4.isSupportConnected();
        double double7 = hypergeometricDistribution4.getNumericalVariance();
        double double9 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 10);
        int int10 = hypergeometricDistribution4.getSampleSize();
        double double12 = hypergeometricDistribution4.cumulativeProbability((int) 'a');
        int int13 = hypergeometricDistribution4.getSampleSize();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = hypergeometricDistribution4.sample((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1986");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, 35, 0);
        int int4 = hypergeometricDistribution3.getSupportLowerBound();
        int int5 = hypergeometricDistribution3.getSupportUpperBound();
        int int6 = hypergeometricDistribution3.sample();
        int int7 = hypergeometricDistribution3.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1987");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(10, 4, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: sample size (100) must be less than or equal to population size (10)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1988");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        double double12 = hypergeometricDistribution4.probability((-1));
        int int13 = hypergeometricDistribution4.getSampleSize();
        double double14 = hypergeometricDistribution4.getNumericalVariance();
        int int15 = hypergeometricDistribution4.getSupportUpperBound();
        double double16 = hypergeometricDistribution4.calculateNumericalVariance();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.2275d + "'", double14 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.2275d + "'", double16 == 0.2275d);
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1989");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(4, (int) (byte) 0, 52);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: sample size (52) must be less than or equal to population size (4)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1990");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 97, 1, 4);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = hypergeometricDistribution4.inverseCumulativeProbability((double) 10L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: 10 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1991");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution4.isSupportConnected();
        int int7 = hypergeometricDistribution4.getPopulationSize();
        double double9 = hypergeometricDistribution4.upperCumulativeProbability((int) 'a');
        int int10 = hypergeometricDistribution4.getPopulationSize();
        int int11 = hypergeometricDistribution4.getSupportUpperBound();
        double double12 = hypergeometricDistribution4.calculateNumericalVariance();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.2275d + "'", double12 == 0.2275d);
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1992");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int7 = hypergeometricDistribution4.getSupportLowerBound();
        int int8 = hypergeometricDistribution4.getSampleSize();
        boolean boolean9 = hypergeometricDistribution4.isSupportConnected();
        double double12 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1, (int) ' ');
        double double14 = hypergeometricDistribution4.cumulativeProbability(35);
        double double15 = hypergeometricDistribution4.getNumericalMean();
        double double16 = hypergeometricDistribution4.getNumericalMean();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.35d + "'", double15 == 0.35d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.35d + "'", double16 == 0.35d);
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1993");
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
        double double17 = hypergeometricDistribution4.cumulativeProbability(4);
        int int18 = hypergeometricDistribution4.getPopulationSize();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2275d + "'", double13 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.2275d + "'", double14 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.35d + "'", double15 == 0.35d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1994");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        double double6 = hypergeometricDistribution4.getNumericalMean();
        double double7 = hypergeometricDistribution4.getNumericalVariance();
        double double9 = hypergeometricDistribution4.upperCumulativeProbability(52);
        boolean boolean10 = hypergeometricDistribution4.isSupportConnected();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.35d + "'", double6 == 0.35d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1995");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 32, (int) (short) 1, 7);
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1996");
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
        boolean boolean20 = hypergeometricDistribution4.isSupportConnected();
        int int21 = hypergeometricDistribution4.getSupportUpperBound();
        double double23 = hypergeometricDistribution4.upperCumulativeProbability(10);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1997");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, (int) (byte) 10, (int) (byte) 0);
        int int5 = hypergeometricDistribution4.getSupportLowerBound();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray7 = hypergeometricDistribution4.sample((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1998");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getPopulationSize();
        boolean boolean7 = hypergeometricDistribution4.isSupportConnected();
        int int8 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int9 = hypergeometricDistribution4.getSampleSize();
        double double11 = hypergeometricDistribution4.upperCumulativeProbability(10);
        int int12 = hypergeometricDistribution4.getNumberOfSuccesses();
        java.lang.Class<?> wildcardClass13 = hypergeometricDistribution4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1999");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', 52, (int) '4');
        int int4 = hypergeometricDistribution3.getSupportLowerBound();
        double double5 = hypergeometricDistribution3.calculateNumericalVariance();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 7 + "'", int4 == 7);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 6.062015091933255d + "'", double5 == 6.062015091933255d);
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test2000");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int7 = hypergeometricDistribution4.getSupportLowerBound();
        int int8 = hypergeometricDistribution4.getSampleSize();
        double double9 = hypergeometricDistribution4.getNumericalMean();
        int int10 = hypergeometricDistribution4.getPopulationSize();
        int int11 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double12 = hypergeometricDistribution4.getNumericalMean();
        double double15 = hypergeometricDistribution4.cumulativeProbability(4, (int) ' ');
        int int16 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int17 = hypergeometricDistribution4.getPopulationSize();
        int int18 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int19 = hypergeometricDistribution4.getPopulationSize();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.35d + "'", double9 == 0.35d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.35d + "'", double12 == 0.35d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
    }
}
