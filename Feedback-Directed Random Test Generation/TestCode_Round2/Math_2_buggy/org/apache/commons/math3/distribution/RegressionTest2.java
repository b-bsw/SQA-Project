package org.apache.commons.math3.distribution;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

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
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (-1), (int) (short) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: population size (-1)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        double double7 = hypergeometricDistribution4.upperCumulativeProbability((int) (short) -1);
        boolean boolean8 = hypergeometricDistribution4.isSupportConnected();
        double double9 = hypergeometricDistribution4.getNumericalVariance();
        double double10 = hypergeometricDistribution4.getNumericalVariance();
        boolean boolean11 = hypergeometricDistribution4.isSupportConnected();
        double double13 = hypergeometricDistribution4.probability((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.2275d + "'", double9 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.2275d + "'", double10 == 0.2275d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.6500000000000004d + "'", double13 == 0.6500000000000004d);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
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
        java.lang.Class<?> wildcardClass14 = hypergeometricDistribution4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.35d + "'", double10 == 0.35d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.2275d + "'", double11 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.6500000000000004d + "'", double13 == 0.6500000000000004d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
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
        int int26 = hypergeometricDistribution4.getNumberOfSuccesses();
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
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
        double double20 = hypergeometricDistribution4.getNumericalVariance();
        int int21 = hypergeometricDistribution4.getPopulationSize();
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
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2275d + "'", double13 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.2275d + "'", double20 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (short) 1, (-1), 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: number of successes (-1)");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        double double6 = hypergeometricDistribution4.getNumericalMean();
        double double8 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 10);
        double double11 = hypergeometricDistribution4.cumulativeProbability(0, (int) (short) 0);
        double double12 = hypergeometricDistribution4.getNumericalMean();
        double double13 = hypergeometricDistribution4.calculateNumericalVariance();
        int int14 = hypergeometricDistribution4.getPopulationSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.35d + "'", double6 == 0.35d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.35d + "'", double12 == 0.35d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2275d + "'", double13 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        boolean boolean5 = hypergeometricDistribution4.isSupportConnected();
        int int6 = hypergeometricDistribution4.getSampleSize();
        int int7 = hypergeometricDistribution4.getSampleSize();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray9 = hypergeometricDistribution4.sample(32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        double double7 = hypergeometricDistribution4.upperCumulativeProbability((int) (short) -1);
        boolean boolean8 = hypergeometricDistribution4.isSupportConnected();
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((-1));
        java.lang.Class<?> wildcardClass11 = hypergeometricDistribution4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double9 = hypergeometricDistribution4.cumulativeProbability(0, (int) 'a');
        boolean boolean10 = hypergeometricDistribution4.isSupportConnected();
        double double12 = hypergeometricDistribution4.upperCumulativeProbability(100);
        int int13 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double16 = hypergeometricDistribution4.cumulativeProbability((int) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistribution4.reseedRandomGenerator(0L);
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
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int7 = hypergeometricDistribution4.getSupportLowerBound();
        int int8 = hypergeometricDistribution4.getSampleSize();
        double double9 = hypergeometricDistribution4.getNumericalMean();
        int int10 = hypergeometricDistribution4.getPopulationSize();
        double double12 = hypergeometricDistribution4.probability(35);
        int int13 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double15 = hypergeometricDistribution4.upperCumulativeProbability((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistribution4.reseedRandomGenerator((long) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.35d + "'", double9 == 0.35d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) ' ', (int) ' ', (int) (byte) 1);
        double double5 = hypergeometricDistribution3.probability((int) '4');
        int int6 = hypergeometricDistribution3.getSupportUpperBound();
        boolean boolean7 = hypergeometricDistribution3.isSupportConnected();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
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
        double double19 = hypergeometricDistribution4.upperCumulativeProbability((int) 'a');
        double double20 = hypergeometricDistribution4.getNumericalVariance();
        boolean boolean21 = hypergeometricDistribution4.isSupportConnected();
        double double23 = hypergeometricDistribution4.cumulativeProbability(52);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2275d + "'", double13 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.2275d + "'", double20 == 0.2275d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
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
        // The following exception was thrown during execution in test generation
        try {
            int int18 = hypergeometricDistribution4.inverseCumulativeProbability((double) 4);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: 4 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.2275d + "'", double9 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.6500000000000004d + "'", double13 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        double double7 = hypergeometricDistribution4.upperCumulativeProbability((int) (short) -1);
        boolean boolean8 = hypergeometricDistribution4.isSupportConnected();
        double double11 = hypergeometricDistribution4.cumulativeProbability((int) (byte) -1, (int) (short) 10);
        double double13 = hypergeometricDistribution4.upperCumulativeProbability((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistribution4.reseedRandomGenerator((long) 52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) -1, (-1), (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: population size (-1)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getPopulationSize();
        boolean boolean7 = hypergeometricDistribution4.isSupportConnected();
        int int8 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int9 = hypergeometricDistribution4.getSampleSize();
        double double10 = hypergeometricDistribution4.getNumericalMean();
        double double12 = hypergeometricDistribution4.probability((int) (short) 10);
        boolean boolean13 = hypergeometricDistribution4.isSupportConnected();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.35d + "'", double10 == 0.35d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        int int7 = hypergeometricDistribution4.getNumberOfSuccesses();
        boolean boolean8 = hypergeometricDistribution4.isSupportConnected();
        double double10 = hypergeometricDistribution4.probability(35);
        double double13 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1, 1);
        double double15 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 10);
        double double16 = hypergeometricDistribution4.getNumericalVariance();
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistribution4.reseedRandomGenerator(1L);
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
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.2275d + "'", double16 == 0.2275d);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) ' ', (int) ' ', (int) (byte) 1);
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (short) 0);
        double double6 = hypergeometricDistribution3.getNumericalMean();
        double double7 = hypergeometricDistribution3.calculateNumericalVariance();
        double double8 = hypergeometricDistribution3.calculateNumericalVariance();
        int int9 = hypergeometricDistribution3.getNumberOfSuccesses();
        double double12 = hypergeometricDistribution3.cumulativeProbability(1, 35);
        double double13 = hypergeometricDistribution3.getNumericalVariance();
        double double14 = hypergeometricDistribution3.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        int int7 = hypergeometricDistribution4.getNumberOfSuccesses();
        boolean boolean8 = hypergeometricDistribution4.isSupportConnected();
        int int9 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int10 = hypergeometricDistribution4.getSupportUpperBound();
        int int11 = hypergeometricDistribution4.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) ' ', (int) ' ', (int) (short) 0);
        int int4 = hypergeometricDistribution3.getPopulationSize();
        java.lang.Class<?> wildcardClass5 = hypergeometricDistribution3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        int int7 = hypergeometricDistribution4.getNumberOfSuccesses();
        boolean boolean8 = hypergeometricDistribution4.isSupportConnected();
        int int9 = hypergeometricDistribution4.getPopulationSize();
        double double12 = hypergeometricDistribution4.cumulativeProbability(1, (int) (byte) 10);
        int int13 = hypergeometricDistribution4.getSampleSize();
        int int14 = hypergeometricDistribution4.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 100, 10, (int) '4');
        double double7 = hypergeometricDistribution4.cumulativeProbability((int) (short) 10, 52);
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistribution4.reseedRandomGenerator((long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double7 = hypergeometricDistribution4.calculateNumericalVariance();
        int int9 = hypergeometricDistribution4.inverseCumulativeProbability((double) 0);
        double double12 = hypergeometricDistribution4.cumulativeProbability((int) '#', (int) '#');
        int int13 = hypergeometricDistribution4.getSampleSize();
        double double14 = hypergeometricDistribution4.getNumericalMean();
        int int15 = hypergeometricDistribution4.getPopulationSize();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.35d + "'", double14 == 0.35d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
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
        // The following exception was thrown during execution in test generation
        try {
            int int20 = hypergeometricDistribution4.inverseCumulativeProbability((double) ' ');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: 32 out of [0, 1] range");
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        double double6 = hypergeometricDistribution4.getNumericalMean();
        int int7 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double9 = hypergeometricDistribution4.upperCumulativeProbability(4);
        double double11 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 10);
        boolean boolean12 = hypergeometricDistribution4.isSupportConnected();
        // The following exception was thrown during execution in test generation
        try {
            int int13 = hypergeometricDistribution4.sample();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.35d + "'", double6 == 0.35d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        double double6 = hypergeometricDistribution4.getNumericalMean();
        double double8 = hypergeometricDistribution4.cumulativeProbability(0);
        double double9 = hypergeometricDistribution4.getNumericalVariance();
        int int10 = hypergeometricDistribution4.getSupportLowerBound();
        int int11 = hypergeometricDistribution4.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.35d + "'", double6 == 0.35d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.6500000000000004d + "'", double8 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.2275d + "'", double9 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution4.isSupportConnected();
        double double7 = hypergeometricDistribution4.getNumericalVariance();
        double double9 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 10);
        double double12 = hypergeometricDistribution4.cumulativeProbability(4, 100);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = hypergeometricDistribution4.sample((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (byte) -1, 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: population size (-1)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 0, 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: population size (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 1, 35, (-1));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: number of samples (-1)");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int7 = hypergeometricDistribution4.getSupportLowerBound();
        double double9 = hypergeometricDistribution4.upperCumulativeProbability(0);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = hypergeometricDistribution4.sample();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
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
        double double26 = hypergeometricDistribution4.cumulativeProbability(0, (int) ' ');
        double double27 = hypergeometricDistribution4.calculateNumericalVariance();
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
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.34999999999999964d + "'", double26 == 0.34999999999999964d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.2275d + "'", double27 == 0.2275d);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
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
            hypergeometricDistribution4.reseedRandomGenerator(10L);
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
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(4, 0, (int) (byte) 0);
        hypergeometricDistribution3.reseedRandomGenerator((long) '#');
        int int6 = hypergeometricDistribution3.getSupportLowerBound();
        boolean boolean7 = hypergeometricDistribution3.isSupportConnected();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray9 = hypergeometricDistribution3.sample((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: number of samples (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
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
        int int17 = hypergeometricDistribution4.getPopulationSize();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.2275d + "'", double9 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.6500000000000004d + "'", double13 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double8 = hypergeometricDistribution4.probability((int) 'a');
        int int9 = hypergeometricDistribution4.getPopulationSize();
        boolean boolean10 = hypergeometricDistribution4.isSupportConnected();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = hypergeometricDistribution4.sample();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(32, 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: sample size (100) must be less than or equal to population size (32)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        double double6 = hypergeometricDistribution4.getNumericalMean();
        double double7 = hypergeometricDistribution4.getNumericalMean();
        int int8 = hypergeometricDistribution4.getSupportUpperBound();
        int int9 = hypergeometricDistribution4.getSampleSize();
        int int10 = hypergeometricDistribution4.getPopulationSize();
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistribution4.reseedRandomGenerator((long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.35d + "'", double6 == 0.35d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.35d + "'", double7 == 0.35d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        int int7 = hypergeometricDistribution4.getNumberOfSuccesses();
        boolean boolean8 = hypergeometricDistribution4.isSupportConnected();
        int int9 = hypergeometricDistribution4.getPopulationSize();
        double double11 = hypergeometricDistribution4.probability((int) (byte) -1);
        int int12 = hypergeometricDistribution4.getPopulationSize();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
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
        double double30 = hypergeometricDistribution4.getNumericalMean();
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
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.35d + "'", double30 == 0.35d);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double7 = hypergeometricDistribution4.getNumericalMean();
        double double8 = hypergeometricDistribution4.getNumericalMean();
        boolean boolean9 = hypergeometricDistribution4.isSupportConnected();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.35d + "'", double7 == 0.35d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.35d + "'", double8 == 0.35d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(4, 35, (int) '#');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: number of successes (35) must be less than or equal to population size (4)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 1, 32, 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: number of successes (32) must be less than or equal to population size (1)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 24, 32, 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: number of successes (32) must be less than or equal to population size (24)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (short) 10, (int) (byte) 1, 4);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = hypergeometricDistribution3.inverseCumulativeProbability((double) 10L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: 10 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
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
        int int25 = hypergeometricDistribution4.inverseCumulativeProbability((double) 1);
        double double27 = hypergeometricDistribution4.probability((int) '4');
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
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
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
        boolean boolean17 = hypergeometricDistribution4.isSupportConnected();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
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
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.2275d + "'", double11 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getPopulationSize();
        double double7 = hypergeometricDistribution4.getNumericalMean();
        double double8 = hypergeometricDistribution4.getNumericalMean();
        int int9 = hypergeometricDistribution4.getSupportUpperBound();
        double double10 = hypergeometricDistribution4.calculateNumericalVariance();
        java.lang.Class<?> wildcardClass11 = hypergeometricDistribution4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.35d + "'", double7 == 0.35d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.35d + "'", double8 == 0.35d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.2275d + "'", double10 == 0.2275d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (byte) 0, 97, 52);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: population size (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        int int7 = hypergeometricDistribution4.getNumberOfSuccesses();
        boolean boolean8 = hypergeometricDistribution4.isSupportConnected();
        double double10 = hypergeometricDistribution4.probability(35);
        double double13 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1, 1);
        double double15 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 10);
        int int16 = hypergeometricDistribution4.getSupportUpperBound();
        double double17 = hypergeometricDistribution4.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.35d + "'", double17 == 0.35d);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.cumulativeProbability(0);
        int int7 = hypergeometricDistribution4.getSupportLowerBound();
        double double8 = hypergeometricDistribution4.getNumericalMean();
        double double10 = hypergeometricDistribution4.upperCumulativeProbability(100);
        int int11 = hypergeometricDistribution4.getSampleSize();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.35d + "'", double8 == 0.35d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution4.isSupportConnected();
        double double7 = hypergeometricDistribution4.getNumericalVariance();
        double double9 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) -1);
        int int10 = hypergeometricDistribution4.getSupportUpperBound();
        int int11 = hypergeometricDistribution4.getPopulationSize();
        int int12 = hypergeometricDistribution4.getSampleSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double7 = hypergeometricDistribution4.getNumericalMean();
        double double8 = hypergeometricDistribution4.getNumericalMean();
        int int9 = hypergeometricDistribution4.getSupportLowerBound();
        java.lang.Class<?> wildcardClass10 = hypergeometricDistribution4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.35d + "'", double7 == 0.35d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.35d + "'", double8 == 0.35d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(4, (int) ' ', (int) '4');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: number of successes (32) must be less than or equal to population size (4)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, 35, 0);
        int int4 = hypergeometricDistribution3.getPopulationSize();
        double double5 = hypergeometricDistribution3.getNumericalMean();
        double double6 = hypergeometricDistribution3.getNumericalVariance();
        int int7 = hypergeometricDistribution3.sample();
        int int8 = hypergeometricDistribution3.getPopulationSize();
        int int9 = hypergeometricDistribution3.getPopulationSize();
        double double10 = hypergeometricDistribution3.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        double double7 = hypergeometricDistribution4.upperCumulativeProbability((int) (short) -1);
        int int8 = hypergeometricDistribution4.getSampleSize();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
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
        double double22 = hypergeometricDistribution4.probability(1);
        java.lang.Class<?> wildcardClass23 = hypergeometricDistribution4.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double7 = hypergeometricDistribution4.calculateNumericalVariance();
        int int9 = hypergeometricDistribution4.inverseCumulativeProbability((double) 0);
        int int10 = hypergeometricDistribution4.getSampleSize();
        double double11 = hypergeometricDistribution4.getNumericalVariance();
        double double12 = hypergeometricDistribution4.getNumericalMean();
        int int13 = hypergeometricDistribution4.getPopulationSize();
        int int14 = hypergeometricDistribution4.getSampleSize();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.2275d + "'", double11 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.35d + "'", double12 == 0.35d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        double double12 = hypergeometricDistribution4.cumulativeProbability((int) ' ');
        int int14 = hypergeometricDistribution4.inverseCumulativeProbability((double) 1L);
        double double16 = hypergeometricDistribution4.cumulativeProbability((int) (short) -1);
        double double19 = hypergeometricDistribution4.cumulativeProbability((int) (short) 10, (int) (short) 100);
        boolean boolean20 = hypergeometricDistribution4.isSupportConnected();
        // The following exception was thrown during execution in test generation
        try {
            double double23 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (100) must be less than or equal to upper endpoint (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
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
        double double14 = hypergeometricDistribution4.calculateNumericalVariance();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.2275d + "'", double10 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.2275d + "'", double14 == 0.2275d);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        double double6 = hypergeometricDistribution4.getNumericalMean();
        double double7 = hypergeometricDistribution4.getNumericalMean();
        int int8 = hypergeometricDistribution4.getSupportUpperBound();
        int int9 = hypergeometricDistribution4.getPopulationSize();
        double double10 = hypergeometricDistribution4.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.35d + "'", double6 == 0.35d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.35d + "'", double7 == 0.35d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.2275d + "'", double10 == 0.2275d);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, 35, 0);
        double double6 = hypergeometricDistribution3.cumulativeProbability((-1), (int) (short) -1);
        double double8 = hypergeometricDistribution3.probability(1);
        double double9 = hypergeometricDistribution3.calculateNumericalVariance();
        double double10 = hypergeometricDistribution3.calculateNumericalVariance();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double7 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 0, (int) (short) 0);
        double double8 = hypergeometricDistribution4.calculateNumericalVariance();
        double double9 = hypergeometricDistribution4.getNumericalMean();
        double double11 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray13 = hypergeometricDistribution4.sample((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.2275d + "'", double8 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.35d + "'", double9 == 0.35d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.6500000000000004d + "'", double11 == 0.6500000000000004d);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
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
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.2275d + "'", double21 == 0.2275d);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        double double7 = hypergeometricDistribution4.upperCumulativeProbability((int) (short) -1);
        boolean boolean8 = hypergeometricDistribution4.isSupportConnected();
        double double9 = hypergeometricDistribution4.getNumericalVariance();
        int int10 = hypergeometricDistribution4.getSupportUpperBound();
        int int11 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double13 = hypergeometricDistribution4.probability((int) (short) 1);
        int int14 = hypergeometricDistribution4.getSupportLowerBound();
        int int15 = hypergeometricDistribution4.getPopulationSize();
        int int16 = hypergeometricDistribution4.getNumberOfSuccesses();
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistribution4.reseedRandomGenerator(0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.2275d + "'", double9 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.3500000000000001d + "'", double13 == 0.3500000000000001d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution4.isSupportConnected();
        boolean boolean7 = hypergeometricDistribution4.isSupportConnected();
        int int8 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double9 = hypergeometricDistribution4.getNumericalMean();
        double double10 = hypergeometricDistribution4.getNumericalVariance();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = hypergeometricDistribution4.sample(0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: number of samples (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.35d + "'", double9 == 0.35d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.2275d + "'", double10 == 0.2275d);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
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
        double double26 = hypergeometricDistribution4.probability(10);
        int int27 = hypergeometricDistribution4.getSupportUpperBound();
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
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution4.isSupportConnected();
        double double7 = hypergeometricDistribution4.getNumericalVariance();
        int int8 = hypergeometricDistribution4.getSupportUpperBound();
        int int9 = hypergeometricDistribution4.getSupportLowerBound();
        int int10 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int11 = hypergeometricDistribution4.getPopulationSize();
        int int12 = hypergeometricDistribution4.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getPopulationSize();
        boolean boolean7 = hypergeometricDistribution4.isSupportConnected();
        double double9 = hypergeometricDistribution4.probability((int) 'a');
        int int11 = hypergeometricDistribution4.inverseCumulativeProbability((double) 0);
        int int12 = hypergeometricDistribution4.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(97, (int) (byte) 100, 52);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: number of successes (100) must be less than or equal to population size (97)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        double double7 = hypergeometricDistribution4.upperCumulativeProbability((int) (short) -1);
        boolean boolean8 = hypergeometricDistribution4.isSupportConnected();
        double double11 = hypergeometricDistribution4.cumulativeProbability((int) (byte) -1, (int) (short) 10);
        double double12 = hypergeometricDistribution4.getNumericalMean();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = hypergeometricDistribution4.sample((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.35d + "'", double12 == 0.35d);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int7 = hypergeometricDistribution4.getSupportLowerBound();
        int int8 = hypergeometricDistribution4.getSampleSize();
        double double10 = hypergeometricDistribution4.cumulativeProbability((int) 'a');
        double double12 = hypergeometricDistribution4.cumulativeProbability(1);
        int int13 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int14 = hypergeometricDistribution4.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        double double6 = hypergeometricDistribution4.getNumericalVariance();
        int int7 = hypergeometricDistribution4.getSampleSize();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = hypergeometricDistribution4.sample();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.2275d + "'", double6 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, 35, 0);
        int int4 = hypergeometricDistribution3.getPopulationSize();
        double double5 = hypergeometricDistribution3.calculateNumericalVariance();
        int int6 = hypergeometricDistribution3.getPopulationSize();
        int int7 = hypergeometricDistribution3.getSampleSize();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
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
        int int23 = hypergeometricDistribution4.inverseCumulativeProbability((double) 1);
        java.lang.Class<?> wildcardClass24 = hypergeometricDistribution4.getClass();
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
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
        double double17 = hypergeometricDistribution4.upperCumulativeProbability(100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.2275d + "'", double9 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.6500000000000004d + "'", double13 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.2275d + "'", double15 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.upperCumulativeProbability((-1));
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int10 = hypergeometricDistribution4.inverseCumulativeProbability(2.0681818181818183d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: 2.068 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        int int6 = hypergeometricDistribution4.getSupportLowerBound();
        double double7 = hypergeometricDistribution4.getNumericalMean();
        int int8 = hypergeometricDistribution4.getSampleSize();
        double double11 = hypergeometricDistribution4.cumulativeProbability((int) (short) -1, 1);
        double double12 = hypergeometricDistribution4.calculateNumericalVariance();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.35d + "'", double7 == 0.35d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.2275d + "'", double12 == 0.2275d);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, 35, 0);
        double double4 = hypergeometricDistribution3.getNumericalMean();
        double double6 = hypergeometricDistribution3.upperCumulativeProbability(100);
        double double8 = hypergeometricDistribution3.upperCumulativeProbability((int) '#');
        int int9 = hypergeometricDistribution3.sample();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(0, (-1), (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: population size (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(52, (int) (short) 10, 0);
        double double4 = hypergeometricDistribution3.calculateNumericalVariance();
        int int5 = hypergeometricDistribution3.sample();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getPopulationSize();
        boolean boolean7 = hypergeometricDistribution4.isSupportConnected();
        double double9 = hypergeometricDistribution4.probability((int) 'a');
        int int11 = hypergeometricDistribution4.inverseCumulativeProbability((double) 0);
        int int12 = hypergeometricDistribution4.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double9 = hypergeometricDistribution4.cumulativeProbability(0, (int) 'a');
        double double11 = hypergeometricDistribution4.cumulativeProbability((-1));
        double double13 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = hypergeometricDistribution4.sample();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.34999999999999964d + "'", double9 == 0.34999999999999964d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.3500000000000001d + "'", double13 == 0.3500000000000001d);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution4.isSupportConnected();
        double double7 = hypergeometricDistribution4.getNumericalVariance();
        double double10 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1, (int) 'a');
        int int11 = hypergeometricDistribution4.getNumberOfSuccesses();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = hypergeometricDistribution4.sample();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(4, 0, (int) (byte) 0);
        hypergeometricDistribution3.reseedRandomGenerator((long) '#');
        double double7 = hypergeometricDistribution3.upperCumulativeProbability((int) (byte) 100);
        int[] intArray9 = hypergeometricDistribution3.sample(10);
        boolean boolean10 = hypergeometricDistribution3.isSupportConnected();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (byte) 0, (int) '4', 32);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: population size (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(24, (int) (byte) 1, (int) (short) 10);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
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
        double double19 = hypergeometricDistribution4.getNumericalVariance();
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistribution4.reseedRandomGenerator((long) (byte) 100);
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
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.2275d + "'", double19 == 0.2275d);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        double double6 = hypergeometricDistribution4.getNumericalMean();
        double double8 = hypergeometricDistribution4.cumulativeProbability(0);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = hypergeometricDistribution4.sample();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.35d + "'", double6 == 0.35d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.6500000000000004d + "'", double8 == 0.6500000000000004d);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        int int11 = hypergeometricDistribution4.getSupportUpperBound();
        int int13 = hypergeometricDistribution4.inverseCumulativeProbability((double) 1L);
        int int14 = hypergeometricDistribution4.getSupportLowerBound();
        double double16 = hypergeometricDistribution4.cumulativeProbability(4);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int7 = hypergeometricDistribution4.getSupportLowerBound();
        int int8 = hypergeometricDistribution4.getSampleSize();
        double double9 = hypergeometricDistribution4.getNumericalMean();
        int int10 = hypergeometricDistribution4.getPopulationSize();
        boolean boolean11 = hypergeometricDistribution4.isSupportConnected();
        int int12 = hypergeometricDistribution4.getPopulationSize();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.35d + "'", double9 == 0.35d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        int int10 = hypergeometricDistribution4.inverseCumulativeProbability(0.6500000000000004d);
        int int11 = hypergeometricDistribution4.getSupportLowerBound();
        boolean boolean12 = hypergeometricDistribution4.isSupportConnected();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getPopulationSize();
        boolean boolean7 = hypergeometricDistribution4.isSupportConnected();
        double double10 = hypergeometricDistribution4.cumulativeProbability(1, (int) '#');
        int int11 = hypergeometricDistribution4.getSupportLowerBound();
        double double13 = hypergeometricDistribution4.cumulativeProbability((int) (short) 10);
        double double14 = hypergeometricDistribution4.getNumericalVariance();
        int int15 = hypergeometricDistribution4.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.2275d + "'", double14 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSampleSize();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray7 = hypergeometricDistribution4.sample(0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: number of samples (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        double double11 = hypergeometricDistribution4.getNumericalVariance();
        double double13 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double15 = hypergeometricDistribution4.probability((-1));
        int int16 = hypergeometricDistribution4.getPopulationSize();
        java.lang.Class<?> wildcardClass17 = hypergeometricDistribution4.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.2275d + "'", double11 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, (int) (byte) 100, (int) (byte) 100);
        int int4 = hypergeometricDistribution3.getSampleSize();
        double double6 = hypergeometricDistribution3.cumulativeProbability(0);
        int int7 = hypergeometricDistribution3.getSupportLowerBound();
        int int8 = hypergeometricDistribution3.getNumberOfSuccesses();
        int int9 = hypergeometricDistribution3.getSampleSize();
        int int10 = hypergeometricDistribution3.getPopulationSize();
        java.lang.Class<?> wildcardClass11 = hypergeometricDistribution3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, (int) (byte) 100, (int) (byte) 100);
        int int4 = hypergeometricDistribution3.getSampleSize();
        int int5 = hypergeometricDistribution3.getSampleSize();
        int int6 = hypergeometricDistribution3.getSampleSize();
        int int7 = hypergeometricDistribution3.getSampleSize();
        int int8 = hypergeometricDistribution3.getNumberOfSuccesses();
        double double9 = hypergeometricDistribution3.calculateNumericalVariance();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getPopulationSize();
        boolean boolean6 = hypergeometricDistribution4.isSupportConnected();
        double double7 = hypergeometricDistribution4.calculateNumericalVariance();
        int int8 = hypergeometricDistribution4.getSupportLowerBound();
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistribution4.reseedRandomGenerator((long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 4, 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: number of successes (100) must be less than or equal to population size (4)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
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
        int int29 = hypergeometricDistribution4.inverseCumulativeProbability((double) 1);
        int int30 = hypergeometricDistribution4.getSupportLowerBound();
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
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, (int) (byte) 10, 52);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = hypergeometricDistribution4.sample();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        double double7 = hypergeometricDistribution4.upperCumulativeProbability((int) (short) -1);
        double double8 = hypergeometricDistribution4.getNumericalVariance();
        int int9 = hypergeometricDistribution4.getSampleSize();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = hypergeometricDistribution4.cumulativeProbability(97, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (97) must be less than or equal to upper endpoint (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.2275d + "'", double8 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (-1), (int) (short) 100, 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: population size (-1)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(0, (int) (short) -1, 35);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: population size (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        double double12 = hypergeometricDistribution4.cumulativeProbability((int) ' ');
        int int14 = hypergeometricDistribution4.inverseCumulativeProbability((double) 1L);
        double double16 = hypergeometricDistribution4.cumulativeProbability((int) (short) -1);
        double double18 = hypergeometricDistribution4.upperCumulativeProbability((int) (short) 10);
        int int19 = hypergeometricDistribution4.getSupportLowerBound();
        int int20 = hypergeometricDistribution4.getSupportUpperBound();
        double double22 = hypergeometricDistribution4.probability(100);
        double double24 = hypergeometricDistribution4.probability((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution4.isSupportConnected();
        double double7 = hypergeometricDistribution4.getNumericalVariance();
        double double10 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1, (int) 'a');
        double double11 = hypergeometricDistribution4.getNumericalVariance();
        double double12 = hypergeometricDistribution4.getNumericalVariance();
        int int13 = hypergeometricDistribution4.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.2275d + "'", double11 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.2275d + "'", double12 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double8 = hypergeometricDistribution4.probability((int) 'a');
        int int9 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double10 = hypergeometricDistribution4.getNumericalVariance();
        int int12 = hypergeometricDistribution4.inverseCumulativeProbability(0.34999999999999964d);
        double double13 = hypergeometricDistribution4.getNumericalMean();
        int int14 = hypergeometricDistribution4.getSampleSize();
        double double16 = hypergeometricDistribution4.cumulativeProbability((int) '#');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.2275d + "'", double10 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.35d + "'", double13 == 0.35d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double7 = hypergeometricDistribution4.calculateNumericalVariance();
        int int9 = hypergeometricDistribution4.inverseCumulativeProbability((double) 0);
        double double12 = hypergeometricDistribution4.cumulativeProbability((int) '#', (int) '#');
        int int13 = hypergeometricDistribution4.getSampleSize();
        int int14 = hypergeometricDistribution4.getSupportLowerBound();
        int int15 = hypergeometricDistribution4.getSupportLowerBound();
        double double17 = hypergeometricDistribution4.cumulativeProbability(4);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray19 = hypergeometricDistribution4.sample(1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
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
        int int20 = hypergeometricDistribution4.getPopulationSize();
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistribution4.reseedRandomGenerator((long) 10);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (byte) 10, 32, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: number of successes (32) must be less than or equal to population size (10)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
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
        java.lang.Class<?> wildcardClass17 = hypergeometricDistribution4.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.35d + "'", double13 == 0.35d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.35d + "'", double16 == 0.35d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 0, 97, (int) '#');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: population size (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(100, (int) (short) 10, 35);
        int int4 = hypergeometricDistribution3.getSupportLowerBound();
        double double6 = hypergeometricDistribution3.cumulativeProbability((int) '4');
        int int7 = hypergeometricDistribution3.getNumberOfSuccesses();
        double double9 = hypergeometricDistribution3.probability((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0605205901255682E-5d + "'", double9 == 1.0605205901255682E-5d);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double7 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 0, (int) (short) 0);
        double double8 = hypergeometricDistribution4.calculateNumericalVariance();
        double double9 = hypergeometricDistribution4.getNumericalMean();
        int int10 = hypergeometricDistribution4.getSupportLowerBound();
        java.lang.Class<?> wildcardClass11 = hypergeometricDistribution4.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.2275d + "'", double8 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.35d + "'", double9 == 0.35d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
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
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistribution4.reseedRandomGenerator(100L);
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
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        int int7 = hypergeometricDistribution4.getNumberOfSuccesses();
        boolean boolean8 = hypergeometricDistribution4.isSupportConnected();
        int int9 = hypergeometricDistribution4.getPopulationSize();
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistribution4.reseedRandomGenerator(0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) -1, (int) '4', 32);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: population size (-1)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) ' ', 24, (int) 'a');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: sample size (97) must be less than or equal to population size (32)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getPopulationSize();
        boolean boolean7 = hypergeometricDistribution4.isSupportConnected();
        int int8 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int9 = hypergeometricDistribution4.getSampleSize();
        double double11 = hypergeometricDistribution4.cumulativeProbability(0);
        int int12 = hypergeometricDistribution4.getSupportUpperBound();
        double double13 = hypergeometricDistribution4.calculateNumericalVariance();
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistribution4.reseedRandomGenerator((long) (byte) -1);
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2275d + "'", double13 == 0.2275d);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double9 = hypergeometricDistribution4.cumulativeProbability(0, (int) 'a');
        boolean boolean10 = hypergeometricDistribution4.isSupportConnected();
        boolean boolean11 = hypergeometricDistribution4.isSupportConnected();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray13 = hypergeometricDistribution4.sample((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: number of samples (-1)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.34999999999999964d + "'", double9 == 0.34999999999999964d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        int int7 = hypergeometricDistribution4.getNumberOfSuccesses();
        boolean boolean8 = hypergeometricDistribution4.isSupportConnected();
        double double10 = hypergeometricDistribution4.probability(35);
        double double11 = hypergeometricDistribution4.getNumericalVariance();
        int int12 = hypergeometricDistribution4.getSupportUpperBound();
        double double14 = hypergeometricDistribution4.probability((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.2275d + "'", double11 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
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
        double double16 = hypergeometricDistribution4.calculateNumericalVariance();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.2275d + "'", double10 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.2275d + "'", double16 == 0.2275d);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        double double12 = hypergeometricDistribution4.upperCumulativeProbability(1);
        java.lang.Class<?> wildcardClass13 = hypergeometricDistribution4.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.3500000000000001d + "'", double12 == 0.3500000000000001d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
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
        double double24 = hypergeometricDistribution4.calculateNumericalVariance();
        // The following exception was thrown during execution in test generation
        try {
            int int25 = hypergeometricDistribution4.sample();
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
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        int int11 = hypergeometricDistribution4.getSupportUpperBound();
        int int13 = hypergeometricDistribution4.inverseCumulativeProbability((double) 1L);
        int int14 = hypergeometricDistribution4.getSampleSize();
        int int15 = hypergeometricDistribution4.getSupportUpperBound();
        int int16 = hypergeometricDistribution4.getPopulationSize();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double7 = hypergeometricDistribution4.calculateNumericalVariance();
        int int9 = hypergeometricDistribution4.inverseCumulativeProbability((double) 0);
        int int10 = hypergeometricDistribution4.getSampleSize();
        double double11 = hypergeometricDistribution4.getNumericalVariance();
        double double12 = hypergeometricDistribution4.getNumericalMean();
        int int13 = hypergeometricDistribution4.getPopulationSize();
        java.lang.Class<?> wildcardClass14 = hypergeometricDistribution4.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.2275d + "'", double11 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.35d + "'", double12 == 0.35d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution4.isSupportConnected();
        double double7 = hypergeometricDistribution4.getNumericalVariance();
        double double10 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1, (int) 'a');
        int int11 = hypergeometricDistribution4.getNumberOfSuccesses();
        boolean boolean12 = hypergeometricDistribution4.isSupportConnected();
        int int13 = hypergeometricDistribution4.getSupportLowerBound();
        int int14 = hypergeometricDistribution4.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        double double12 = hypergeometricDistribution4.cumulativeProbability((int) ' ');
        int int14 = hypergeometricDistribution4.inverseCumulativeProbability((double) 1L);
        double double16 = hypergeometricDistribution4.probability((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = hypergeometricDistribution4.sample(32);
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
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double7 = hypergeometricDistribution4.calculateNumericalVariance();
        int int9 = hypergeometricDistribution4.inverseCumulativeProbability((double) 0);
        double double12 = hypergeometricDistribution4.cumulativeProbability((int) '#', (int) '#');
        int int13 = hypergeometricDistribution4.getSampleSize();
        int int14 = hypergeometricDistribution4.getSupportLowerBound();
        int int15 = hypergeometricDistribution4.getSupportLowerBound();
        double double18 = hypergeometricDistribution4.cumulativeProbability(32, (int) (short) 100);
        boolean boolean19 = hypergeometricDistribution4.isSupportConnected();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution4.isSupportConnected();
        double double7 = hypergeometricDistribution4.getNumericalVariance();
        double double10 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1, (int) 'a');
        double double12 = hypergeometricDistribution4.upperCumulativeProbability((-1));
        double double15 = hypergeometricDistribution4.cumulativeProbability(0, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistribution4.reseedRandomGenerator((long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.34999999999999964d + "'", double15 == 0.34999999999999964d);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int7 = hypergeometricDistribution4.getSupportLowerBound();
        double double9 = hypergeometricDistribution4.upperCumulativeProbability(0);
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistribution4.reseedRandomGenerator((long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        boolean boolean5 = hypergeometricDistribution4.isSupportConnected();
        int int6 = hypergeometricDistribution4.getSampleSize();
        int int7 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double9 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 100);
        int int10 = hypergeometricDistribution4.getSampleSize();
        // The following exception was thrown during execution in test generation
        try {
            double double13 = hypergeometricDistribution4.cumulativeProbability((int) ' ', 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (32) must be less than or equal to upper endpoint (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double7 = hypergeometricDistribution4.calculateNumericalVariance();
        double double9 = hypergeometricDistribution4.upperCumulativeProbability((-1));
        double double11 = hypergeometricDistribution4.cumulativeProbability((int) (short) 1);
        int int12 = hypergeometricDistribution4.getNumberOfSuccesses();
        // The following exception was thrown during execution in test generation
        try {
            int int13 = hypergeometricDistribution4.sample();
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
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        double double11 = hypergeometricDistribution4.getNumericalVariance();
        double double13 = hypergeometricDistribution4.probability(100);
        double double14 = hypergeometricDistribution4.getNumericalVariance();
        double double15 = hypergeometricDistribution4.getNumericalVariance();
        double double17 = hypergeometricDistribution4.probability((int) '4');
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.2275d + "'", double11 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.2275d + "'", double14 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.2275d + "'", double15 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        double double6 = hypergeometricDistribution4.getNumericalVariance();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = hypergeometricDistribution4.inverseCumulativeProbability((double) 97);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: 97 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.2275d + "'", double6 == 0.2275d);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 10, (int) (byte) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: sample size (100) must be less than or equal to population size (10)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 97, (int) '#', (int) (byte) 1);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 10, (int) (short) 0, 97);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: sample size (97) must be less than or equal to population size (10)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
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
        java.lang.Class<?> wildcardClass18 = hypergeometricDistribution4.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.35d + "'", double17 == 0.35d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, 35, 0);
        double double4 = hypergeometricDistribution3.getNumericalMean();
        double double6 = hypergeometricDistribution3.upperCumulativeProbability(0);
        int int7 = hypergeometricDistribution3.getSampleSize();
        int int8 = hypergeometricDistribution3.getNumberOfSuccesses();
        int int9 = hypergeometricDistribution3.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
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
        double double15 = hypergeometricDistribution4.cumulativeProbability(97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.35d + "'", double10 == 0.35d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.2275d + "'", double11 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.6500000000000004d + "'", double13 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 10, (int) '#');
        int int4 = hypergeometricDistribution3.getPopulationSize();
        int int5 = hypergeometricDistribution3.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        double double12 = hypergeometricDistribution4.cumulativeProbability((int) ' ');
        int int14 = hypergeometricDistribution4.inverseCumulativeProbability((double) 1L);
        double double16 = hypergeometricDistribution4.probability((int) (byte) 10);
        java.lang.Class<?> wildcardClass17 = hypergeometricDistribution4.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        int int7 = hypergeometricDistribution4.getNumberOfSuccesses();
        boolean boolean8 = hypergeometricDistribution4.isSupportConnected();
        int int9 = hypergeometricDistribution4.getPopulationSize();
        double double12 = hypergeometricDistribution4.cumulativeProbability(1, (int) (byte) 10);
        int int13 = hypergeometricDistribution4.getSupportUpperBound();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = hypergeometricDistribution4.sample();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) ' ', (int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: number of successes (-1)");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, (int) (byte) 100, (int) (byte) 100);
        int int4 = hypergeometricDistribution3.getSampleSize();
        int int5 = hypergeometricDistribution3.sample();
        java.lang.Class<?> wildcardClass6 = hypergeometricDistribution3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        double double12 = hypergeometricDistribution4.cumulativeProbability((int) ' ');
        int int13 = hypergeometricDistribution4.getSampleSize();
        int int14 = hypergeometricDistribution4.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
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
        double double28 = hypergeometricDistribution4.cumulativeProbability((int) '4');
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
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 1.0d + "'", double28 == 1.0d);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, 35, 0);
        double double4 = hypergeometricDistribution3.getNumericalMean();
        double double6 = hypergeometricDistribution3.upperCumulativeProbability(0);
        int int7 = hypergeometricDistribution3.getSampleSize();
        double double8 = hypergeometricDistribution3.getNumericalVariance();
        boolean boolean9 = hypergeometricDistribution3.isSupportConnected();
        int int10 = hypergeometricDistribution3.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
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
        double double20 = hypergeometricDistribution4.probability(35);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.34999999999999964d + "'", double9 == 0.34999999999999964d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.35d + "'", double18 == 0.35d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        int int11 = hypergeometricDistribution4.getSupportUpperBound();
        int int12 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double13 = hypergeometricDistribution4.getNumericalMean();
        double double15 = hypergeometricDistribution4.upperCumulativeProbability((int) '4');
        boolean boolean16 = hypergeometricDistribution4.isSupportConnected();
        int int17 = hypergeometricDistribution4.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.35d + "'", double13 == 0.35d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getPopulationSize();
        boolean boolean7 = hypergeometricDistribution4.isSupportConnected();
        double double10 = hypergeometricDistribution4.cumulativeProbability(1, (int) '#');
        double double13 = hypergeometricDistribution4.cumulativeProbability((int) (short) 100, (int) (byte) 100);
        double double16 = hypergeometricDistribution4.cumulativeProbability(1, (int) (byte) 1);
        double double18 = hypergeometricDistribution4.cumulativeProbability((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = hypergeometricDistribution4.sample((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: number of samples (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getPopulationSize();
        int int8 = hypergeometricDistribution4.inverseCumulativeProbability((double) (byte) 0);
        double double9 = hypergeometricDistribution4.getNumericalVariance();
        int int10 = hypergeometricDistribution4.getNumberOfSuccesses();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = hypergeometricDistribution4.sample((-1));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: number of samples (-1)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.2275d + "'", double9 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) ' ', (int) ' ', (int) (byte) 1);
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (short) 0);
        double double6 = hypergeometricDistribution3.getNumericalMean();
        double double7 = hypergeometricDistribution3.calculateNumericalVariance();
        double double9 = hypergeometricDistribution3.cumulativeProbability(35);
        int int10 = hypergeometricDistribution3.getPopulationSize();
        // The following exception was thrown during execution in test generation
        try {
            double double13 = hypergeometricDistribution3.cumulativeProbability(100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (100) must be less than or equal to upper endpoint (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, 35, 0);
        int int4 = hypergeometricDistribution3.getPopulationSize();
        double double5 = hypergeometricDistribution3.getNumericalMean();
        double double6 = hypergeometricDistribution3.getNumericalVariance();
        boolean boolean7 = hypergeometricDistribution3.isSupportConnected();
        double double8 = hypergeometricDistribution3.getNumericalMean();
        boolean boolean9 = hypergeometricDistribution3.isSupportConnected();
        int int10 = hypergeometricDistribution3.getSupportUpperBound();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = hypergeometricDistribution3.inverseCumulativeProbability(6.062015091933255d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: 6.062 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
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
        boolean boolean19 = hypergeometricDistribution4.isSupportConnected();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.34999999999999964d + "'", double9 == 0.34999999999999964d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.35d + "'", double18 == 0.35d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double9 = hypergeometricDistribution4.cumulativeProbability(0, (int) 'a');
        boolean boolean10 = hypergeometricDistribution4.isSupportConnected();
        double double12 = hypergeometricDistribution4.upperCumulativeProbability(100);
        int int13 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double16 = hypergeometricDistribution4.cumulativeProbability((int) (short) 0, 0);
        int int17 = hypergeometricDistribution4.getPopulationSize();
        // The following exception was thrown during execution in test generation
        try {
            int int18 = hypergeometricDistribution4.sample();
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
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        int int7 = hypergeometricDistribution4.getNumberOfSuccesses();
        boolean boolean8 = hypergeometricDistribution4.isSupportConnected();
        double double10 = hypergeometricDistribution4.probability(35);
        double double13 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1, 1);
        double double14 = hypergeometricDistribution4.calculateNumericalVariance();
        boolean boolean15 = hypergeometricDistribution4.isSupportConnected();
        double double17 = hypergeometricDistribution4.upperCumulativeProbability(24);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.2275d + "'", double14 == 0.2275d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
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
        boolean boolean15 = hypergeometricDistribution4.isSupportConnected();
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.2275d + "'", double12 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, 35, 0);
        int int4 = hypergeometricDistribution3.getSupportLowerBound();
        int int5 = hypergeometricDistribution3.getSupportUpperBound();
        int int6 = hypergeometricDistribution3.sample();
        int[] intArray8 = hypergeometricDistribution3.sample((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            double double11 = hypergeometricDistribution3.cumulativeProbability(10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (10) must be less than or equal to upper endpoint (-1)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, (int) (byte) 100, (int) (byte) 100);
        int int4 = hypergeometricDistribution3.getSampleSize();
        int int5 = hypergeometricDistribution3.getSampleSize();
        int int6 = hypergeometricDistribution3.getNumberOfSuccesses();
        double double7 = hypergeometricDistribution3.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double7 = hypergeometricDistribution4.calculateNumericalVariance();
        double double9 = hypergeometricDistribution4.cumulativeProbability(4);
        boolean boolean10 = hypergeometricDistribution4.isSupportConnected();
        double double11 = hypergeometricDistribution4.getNumericalVariance();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray13 = hypergeometricDistribution4.sample((int) (byte) 100);
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
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getPopulationSize();
        boolean boolean7 = hypergeometricDistribution4.isSupportConnected();
        double double10 = hypergeometricDistribution4.cumulativeProbability(1, (int) '#');
        double double12 = hypergeometricDistribution4.upperCumulativeProbability(1);
        double double13 = hypergeometricDistribution4.calculateNumericalVariance();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.3500000000000001d + "'", double12 == 0.3500000000000001d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2275d + "'", double13 == 0.2275d);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, (int) (byte) 100, (int) (byte) 100);
        int int4 = hypergeometricDistribution3.getSampleSize();
        int int5 = hypergeometricDistribution3.getSampleSize();
        int int6 = hypergeometricDistribution3.getSampleSize();
        double double8 = hypergeometricDistribution3.upperCumulativeProbability((int) (byte) -1);
        int int9 = hypergeometricDistribution3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        double double11 = hypergeometricDistribution4.getNumericalVariance();
        double double13 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double15 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = hypergeometricDistribution4.sample(10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.2275d + "'", double11 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        int int7 = hypergeometricDistribution4.getNumberOfSuccesses();
        boolean boolean8 = hypergeometricDistribution4.isSupportConnected();
        int int9 = hypergeometricDistribution4.getPopulationSize();
        double double12 = hypergeometricDistribution4.cumulativeProbability(1, (int) (byte) 10);
        int int13 = hypergeometricDistribution4.getSupportLowerBound();
        int int14 = hypergeometricDistribution4.getSampleSize();
        double double16 = hypergeometricDistribution4.upperCumulativeProbability((int) (short) 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.3500000000000001d + "'", double16 == 0.3500000000000001d);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        double double7 = hypergeometricDistribution4.probability((int) (byte) 0);
        boolean boolean8 = hypergeometricDistribution4.isSupportConnected();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = hypergeometricDistribution4.inverseCumulativeProbability((double) 100.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: 100 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.6500000000000004d + "'", double7 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getPopulationSize();
        int int8 = hypergeometricDistribution4.inverseCumulativeProbability((double) (byte) 0);
        int int9 = hypergeometricDistribution4.getPopulationSize();
        double double10 = hypergeometricDistribution4.getNumericalVariance();
        // The following exception was thrown during execution in test generation
        try {
            double double13 = hypergeometricDistribution4.cumulativeProbability(100, 24);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (100) must be less than or equal to upper endpoint (24)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.2275d + "'", double10 == 0.2275d);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double7 = hypergeometricDistribution4.calculateNumericalVariance();
        int int8 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int9 = hypergeometricDistribution4.getPopulationSize();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = hypergeometricDistribution4.sample();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getPopulationSize();
        int int8 = hypergeometricDistribution4.inverseCumulativeProbability((double) (byte) 0);
        int int9 = hypergeometricDistribution4.getPopulationSize();
        double double10 = hypergeometricDistribution4.getNumericalVariance();
        double double12 = hypergeometricDistribution4.probability(100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.2275d + "'", double10 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        double double12 = hypergeometricDistribution4.probability((-1));
        double double14 = hypergeometricDistribution4.upperCumulativeProbability((int) ' ');
        double double16 = hypergeometricDistribution4.upperCumulativeProbability((int) 'a');
        double double17 = hypergeometricDistribution4.getNumericalMean();
        int int18 = hypergeometricDistribution4.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.35d + "'", double17 == 0.35d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 35, (int) (short) 1, (int) (byte) 0);
        int int5 = hypergeometricDistribution4.getPopulationSize();
        boolean boolean6 = hypergeometricDistribution4.isSupportConnected();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (short) 100, (int) '#', 1);
        int int4 = hypergeometricDistribution3.getSupportUpperBound();
        boolean boolean5 = hypergeometricDistribution3.isSupportConnected();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(52, (int) (short) 0, 1);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) 'a', (int) 'a', (int) (byte) 10);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        double double7 = hypergeometricDistribution4.upperCumulativeProbability((int) (short) -1);
        boolean boolean8 = hypergeometricDistribution4.isSupportConnected();
        int int9 = hypergeometricDistribution4.getNumberOfSuccesses();
        java.lang.Class<?> wildcardClass10 = hypergeometricDistribution4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        double double7 = hypergeometricDistribution4.upperCumulativeProbability((int) (short) -1);
        boolean boolean8 = hypergeometricDistribution4.isSupportConnected();
        double double9 = hypergeometricDistribution4.getNumericalVariance();
        double double10 = hypergeometricDistribution4.getNumericalMean();
        int int11 = hypergeometricDistribution4.getSampleSize();
        int int13 = hypergeometricDistribution4.inverseCumulativeProbability(0.24984402316337592d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.2275d + "'", double9 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.35d + "'", double10 == 0.35d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) -1, (-1), (int) '4');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: population size (-1)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
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
        boolean boolean17 = hypergeometricDistribution4.isSupportConnected();
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistribution4.reseedRandomGenerator((long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.34999999999999964d + "'", double9 == 0.34999999999999964d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getPopulationSize();
        boolean boolean7 = hypergeometricDistribution4.isSupportConnected();
        int int8 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int9 = hypergeometricDistribution4.getSampleSize();
        double double11 = hypergeometricDistribution4.upperCumulativeProbability(10);
        int int12 = hypergeometricDistribution4.getPopulationSize();
        int int13 = hypergeometricDistribution4.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getPopulationSize();
        double double7 = hypergeometricDistribution4.getNumericalMean();
        double double8 = hypergeometricDistribution4.getNumericalMean();
        int int9 = hypergeometricDistribution4.getSupportUpperBound();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray11 = hypergeometricDistribution4.sample((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: number of samples (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.35d + "'", double7 == 0.35d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.35d + "'", double8 == 0.35d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        double double7 = hypergeometricDistribution4.upperCumulativeProbability((int) (short) -1);
        boolean boolean8 = hypergeometricDistribution4.isSupportConnected();
        double double9 = hypergeometricDistribution4.getNumericalVariance();
        double double10 = hypergeometricDistribution4.getNumericalMean();
        int int11 = hypergeometricDistribution4.getSampleSize();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray13 = hypergeometricDistribution4.sample((int) ' ');
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
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
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
        // The following exception was thrown during execution in test generation
        try {
            int int19 = hypergeometricDistribution4.inverseCumulativeProbability((double) 10L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: 10 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.6500000000000004d + "'", double17 == 0.6500000000000004d);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, (int) (byte) 10, (int) (byte) 0);
        int int5 = hypergeometricDistribution4.getSupportLowerBound();
        boolean boolean6 = hypergeometricDistribution4.isSupportConnected();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getPopulationSize();
        int int8 = hypergeometricDistribution4.inverseCumulativeProbability((double) (byte) 0);
        double double9 = hypergeometricDistribution4.getNumericalVariance();
        double double10 = hypergeometricDistribution4.getNumericalMean();
        int int11 = hypergeometricDistribution4.getSupportLowerBound();
        int int12 = hypergeometricDistribution4.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.2275d + "'", double9 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.35d + "'", double10 == 0.35d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        double double11 = hypergeometricDistribution4.getNumericalVariance();
        double double13 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double16 = hypergeometricDistribution4.cumulativeProbability(10, (int) 'a');
        int int17 = hypergeometricDistribution4.getSupportUpperBound();
        double double19 = hypergeometricDistribution4.probability(52);
        double double20 = hypergeometricDistribution4.calculateNumericalVariance();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.2275d + "'", double11 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.2275d + "'", double20 == 0.2275d);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', 35, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: number of samples (-1)");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        double double6 = hypergeometricDistribution4.getNumericalMean();
        double double8 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 10);
        double double11 = hypergeometricDistribution4.cumulativeProbability(0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = hypergeometricDistribution4.inverseCumulativeProbability((double) 100.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: 100 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.35d + "'", double6 == 0.35d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
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
        double double17 = hypergeometricDistribution4.cumulativeProbability(32, 52);
        int int18 = hypergeometricDistribution4.getSampleSize();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.3500000000000001d + "'", double10 == 0.3500000000000001d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2275d + "'", double13 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.2275d + "'", double14 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, (int) (byte) 100, (int) (byte) 100);
        int int4 = hypergeometricDistribution3.getSampleSize();
        int int5 = hypergeometricDistribution3.getSampleSize();
        int int6 = hypergeometricDistribution3.getSampleSize();
        double double8 = hypergeometricDistribution3.upperCumulativeProbability((int) (byte) -1);
        double double9 = hypergeometricDistribution3.calculateNumericalVariance();
        boolean boolean10 = hypergeometricDistribution3.isSupportConnected();
        int int11 = hypergeometricDistribution3.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
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
        double double28 = hypergeometricDistribution4.getNumericalVariance();
        int int29 = hypergeometricDistribution4.getSupportLowerBound();
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
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.2275d + "'", double28 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double8 = hypergeometricDistribution4.probability((int) 'a');
        int int9 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double10 = hypergeometricDistribution4.getNumericalVariance();
        int int12 = hypergeometricDistribution4.inverseCumulativeProbability(0.34999999999999964d);
        double double13 = hypergeometricDistribution4.getNumericalMean();
        int int14 = hypergeometricDistribution4.getSampleSize();
        int int15 = hypergeometricDistribution4.getSupportLowerBound();
        int int16 = hypergeometricDistribution4.getSampleSize();
        double double17 = hypergeometricDistribution4.getNumericalMean();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.2275d + "'", double10 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.35d + "'", double13 == 0.35d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.35d + "'", double17 == 0.35d);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getPopulationSize();
        int int8 = hypergeometricDistribution4.inverseCumulativeProbability((double) (byte) 0);
        double double9 = hypergeometricDistribution4.getNumericalVariance();
        int int10 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int11 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double14 = hypergeometricDistribution4.cumulativeProbability((int) (short) -1, (int) (byte) 100);
        int int15 = hypergeometricDistribution4.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.2275d + "'", double9 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
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
        boolean boolean24 = hypergeometricDistribution4.isSupportConnected();
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int7 = hypergeometricDistribution4.getSupportLowerBound();
        int int8 = hypergeometricDistribution4.getSampleSize();
        double double10 = hypergeometricDistribution4.cumulativeProbability((int) 'a');
        double double11 = hypergeometricDistribution4.calculateNumericalVariance();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray13 = hypergeometricDistribution4.sample((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.2275d + "'", double11 == 0.2275d);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        double double12 = hypergeometricDistribution4.cumulativeProbability((int) ' ');
        double double13 = hypergeometricDistribution4.calculateNumericalVariance();
        double double14 = hypergeometricDistribution4.calculateNumericalVariance();
        double double16 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double17 = hypergeometricDistribution4.getNumericalVariance();
        double double19 = hypergeometricDistribution4.probability((int) (short) 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2275d + "'", double13 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.2275d + "'", double14 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.6500000000000004d + "'", double16 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.2275d + "'", double17 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.3500000000000001d + "'", double19 == 0.3500000000000001d);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.cumulativeProbability(0);
        int int7 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double8 = hypergeometricDistribution4.calculateNumericalVariance();
        int int9 = hypergeometricDistribution4.getSupportUpperBound();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = hypergeometricDistribution4.sample();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.2275d + "'", double8 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(35, 0, 35);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
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
        // The following exception was thrown during execution in test generation
        try {
            int int18 = hypergeometricDistribution4.sample();
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
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.2275d + "'", double17 == 0.2275d);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getPopulationSize();
        boolean boolean7 = hypergeometricDistribution4.isSupportConnected();
        double double9 = hypergeometricDistribution4.probability((int) 'a');
        int int11 = hypergeometricDistribution4.inverseCumulativeProbability((double) 0);
        // The following exception was thrown during execution in test generation
        try {
            double double14 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 100, (-1));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (100) must be less than or equal to upper endpoint (-1)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution4.isSupportConnected();
        double double7 = hypergeometricDistribution4.getNumericalVariance();
        double double10 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1, (int) 'a');
        double double12 = hypergeometricDistribution4.upperCumulativeProbability((-1));
        double double13 = hypergeometricDistribution4.getNumericalVariance();
        double double14 = hypergeometricDistribution4.getNumericalMean();
        // The following exception was thrown during execution in test generation
        try {
            int int15 = hypergeometricDistribution4.sample();
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
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.35d + "'", double14 == 0.35d);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.probability((int) ' ');
        int int11 = hypergeometricDistribution4.getPopulationSize();
        int int12 = hypergeometricDistribution4.getSampleSize();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
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
        boolean boolean19 = hypergeometricDistribution4.isSupportConnected();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.2275d + "'", double11 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.35d + "'", double18 == 0.35d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (byte) 100, (int) (short) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: number of successes (-1)");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 52, (int) '#', (int) (short) 1);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
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
        double double18 = hypergeometricDistribution4.getNumericalVariance();
        boolean boolean19 = hypergeometricDistribution4.isSupportConnected();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = hypergeometricDistribution4.sample((int) '#');
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
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.6500000000000004d + "'", double16 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.2275d + "'", double18 == 0.2275d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        int int6 = hypergeometricDistribution4.getSupportLowerBound();
        double double8 = hypergeometricDistribution4.probability(1);
        int int9 = hypergeometricDistribution4.getPopulationSize();
        int int10 = hypergeometricDistribution4.getSupportUpperBound();
        double double12 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        double double13 = hypergeometricDistribution4.calculateNumericalVariance();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.3500000000000001d + "'", double8 == 0.3500000000000001d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2275d + "'", double13 == 0.2275d);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(97, (int) (short) -1, 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: number of successes (-1)");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 100, 10, (int) '4');
        double double6 = hypergeometricDistribution4.probability((int) (short) 1);
        int int7 = hypergeometricDistribution4.getSampleSize();
        int int8 = hypergeometricDistribution4.getSampleSize();
        double double10 = hypergeometricDistribution4.cumulativeProbability((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.005038011914198055d + "'", double6 == 0.005038011914198055d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        double double6 = hypergeometricDistribution4.getNumericalMean();
        double double7 = hypergeometricDistribution4.getNumericalMean();
        int int8 = hypergeometricDistribution4.getSupportUpperBound();
        int int9 = hypergeometricDistribution4.getSampleSize();
        int int10 = hypergeometricDistribution4.getPopulationSize();
        boolean boolean11 = hypergeometricDistribution4.isSupportConnected();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.35d + "'", double6 == 0.35d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.35d + "'", double7 == 0.35d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, (int) (byte) 100, (int) (byte) 100);
        int int4 = hypergeometricDistribution3.getSampleSize();
        int int5 = hypergeometricDistribution3.getSupportLowerBound();
        double double6 = hypergeometricDistribution3.calculateNumericalVariance();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
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
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray19 = hypergeometricDistribution4.sample(24);
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
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.2275d + "'", double16 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.35d + "'", double17 == 0.35d);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (short) 10, 10, 1);
        int int4 = hypergeometricDistribution3.getSupportLowerBound();
        int int5 = hypergeometricDistribution3.getPopulationSize();
        int int6 = hypergeometricDistribution3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        double double12 = hypergeometricDistribution4.upperCumulativeProbability(1);
        int int13 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double14 = hypergeometricDistribution4.getNumericalMean();
        double double15 = hypergeometricDistribution4.calculateNumericalVariance();
        double double17 = hypergeometricDistribution4.probability(0);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = hypergeometricDistribution4.inverseCumulativeProbability((double) 52);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: 52 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.3500000000000001d + "'", double12 == 0.3500000000000001d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.35d + "'", double14 == 0.35d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.2275d + "'", double15 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.6500000000000004d + "'", double17 == 0.6500000000000004d);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
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
        int int16 = hypergeometricDistribution4.getSupportUpperBound();
        int int17 = hypergeometricDistribution4.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2275d + "'", double13 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.35d + "'", double14 == 0.35d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.35d + "'", double15 == 0.35d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
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
        boolean boolean20 = hypergeometricDistribution4.isSupportConnected();
        // The following exception was thrown during execution in test generation
        try {
            double double23 = hypergeometricDistribution4.cumulativeProbability(35, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (35) must be less than or equal to upper endpoint (10)");
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
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getPopulationSize();
        boolean boolean7 = hypergeometricDistribution4.isSupportConnected();
        double double9 = hypergeometricDistribution4.upperCumulativeProbability(0);
        double double11 = hypergeometricDistribution4.upperCumulativeProbability(1);
        double double13 = hypergeometricDistribution4.cumulativeProbability(0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.3500000000000001d + "'", double11 == 0.3500000000000001d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.6500000000000004d + "'", double13 == 0.6500000000000004d);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double7 = hypergeometricDistribution4.calculateNumericalVariance();
        int int9 = hypergeometricDistribution4.inverseCumulativeProbability((double) 0);
        double double10 = hypergeometricDistribution4.getNumericalMean();
        double double12 = hypergeometricDistribution4.probability((int) (short) -1);
        boolean boolean13 = hypergeometricDistribution4.isSupportConnected();
        double double15 = hypergeometricDistribution4.probability(0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = hypergeometricDistribution4.sample((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.35d + "'", double10 == 0.35d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.6500000000000004d + "'", double15 == 0.6500000000000004d);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getPopulationSize();
        boolean boolean7 = hypergeometricDistribution4.isSupportConnected();
        double double9 = hypergeometricDistribution4.upperCumulativeProbability(0);
        double double11 = hypergeometricDistribution4.upperCumulativeProbability(1);
        double double14 = hypergeometricDistribution4.cumulativeProbability((int) (short) -1, 0);
        double double16 = hypergeometricDistribution4.cumulativeProbability((int) 'a');
        java.lang.Class<?> wildcardClass17 = hypergeometricDistribution4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.3500000000000001d + "'", double11 == 0.3500000000000001d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.6500000000000004d + "'", double14 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
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
        double double25 = hypergeometricDistribution4.getNumericalMean();
        int int26 = hypergeometricDistribution4.getSupportUpperBound();
        double double27 = hypergeometricDistribution4.calculateNumericalVariance();
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
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.35d + "'", double25 == 0.35d);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.2275d + "'", double27 == 0.2275d);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        int int11 = hypergeometricDistribution4.getSupportUpperBound();
        int int12 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double13 = hypergeometricDistribution4.getNumericalMean();
        int int14 = hypergeometricDistribution4.getSampleSize();
        int int15 = hypergeometricDistribution4.getSampleSize();
        // The following exception was thrown during execution in test generation
        try {
            int int17 = hypergeometricDistribution4.inverseCumulativeProbability(6.062015091933255d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: 6.062 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.35d + "'", double13 == 0.35d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
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
        double double20 = hypergeometricDistribution4.getNumericalVariance();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray22 = hypergeometricDistribution4.sample(4);
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
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
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
        // The following exception was thrown during execution in test generation
        try {
            int int25 = hypergeometricDistribution4.inverseCumulativeProbability((double) 100L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: 100 out of [0, 1] range");
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double7 = hypergeometricDistribution4.getNumericalMean();
        double double8 = hypergeometricDistribution4.calculateNumericalVariance();
        int int9 = hypergeometricDistribution4.getPopulationSize();
        int int11 = hypergeometricDistribution4.inverseCumulativeProbability((double) 1);
        int int12 = hypergeometricDistribution4.getSupportUpperBound();
        int int13 = hypergeometricDistribution4.getSupportLowerBound();
        boolean boolean14 = hypergeometricDistribution4.isSupportConnected();
        // The following exception was thrown during execution in test generation
        try {
            int int15 = hypergeometricDistribution4.sample();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.35d + "'", double7 == 0.35d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.2275d + "'", double8 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getPopulationSize();
        int int8 = hypergeometricDistribution4.inverseCumulativeProbability((double) (byte) 0);
        double double9 = hypergeometricDistribution4.getNumericalVariance();
        double double11 = hypergeometricDistribution4.cumulativeProbability(32);
        double double13 = hypergeometricDistribution4.cumulativeProbability((int) (short) 100);
        int int14 = hypergeometricDistribution4.getSampleSize();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.2275d + "'", double9 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (short) -1, (int) (byte) -1, 4);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: population size (-1)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(0, 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: population size (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, (int) (byte) 100, (int) (byte) 100);
        int int4 = hypergeometricDistribution3.getSampleSize();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = hypergeometricDistribution3.inverseCumulativeProbability((double) 52);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: 52 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(1, 10, 4);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: number of successes (10) must be less than or equal to population size (1)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        double double11 = hypergeometricDistribution4.getNumericalVariance();
        double double13 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double15 = hypergeometricDistribution4.probability((-1));
        int int16 = hypergeometricDistribution4.getPopulationSize();
        int int17 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double19 = hypergeometricDistribution4.upperCumulativeProbability((-1));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.2275d + "'", double11 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double7 = hypergeometricDistribution4.calculateNumericalVariance();
        int int9 = hypergeometricDistribution4.inverseCumulativeProbability((double) 0);
        double double10 = hypergeometricDistribution4.getNumericalMean();
        int int11 = hypergeometricDistribution4.getSupportLowerBound();
        double double13 = hypergeometricDistribution4.cumulativeProbability(10);
        double double14 = hypergeometricDistribution4.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.35d + "'", double10 == 0.35d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.2275d + "'", double14 == 0.2275d);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (short) 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: sample size (100) must be less than or equal to population size (97)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (short) 100, (int) (short) 1, (int) (byte) 100);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, (int) (byte) 100, (int) (byte) 100);
        int int4 = hypergeometricDistribution3.getSampleSize();
        double double6 = hypergeometricDistribution3.cumulativeProbability(0);
        int int7 = hypergeometricDistribution3.getSupportLowerBound();
        int int8 = hypergeometricDistribution3.getNumberOfSuccesses();
        int int9 = hypergeometricDistribution3.sample();
        int int10 = hypergeometricDistribution3.getSampleSize();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getPopulationSize();
        int int8 = hypergeometricDistribution4.inverseCumulativeProbability((double) (byte) 0);
        int int10 = hypergeometricDistribution4.inverseCumulativeProbability(0.35d);
        int int11 = hypergeometricDistribution4.getPopulationSize();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
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
        int int19 = hypergeometricDistribution4.getPopulationSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.2275d + "'", double15 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.34999999999999964d + "'", double18 == 0.34999999999999964d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.cumulativeProbability(0);
        double double7 = hypergeometricDistribution4.calculateNumericalVariance();
        int int8 = hypergeometricDistribution4.getPopulationSize();
        double double10 = hypergeometricDistribution4.probability((int) (byte) -1);
        int int11 = hypergeometricDistribution4.getSupportUpperBound();
        double double13 = hypergeometricDistribution4.probability((int) (byte) 100);
        int int14 = hypergeometricDistribution4.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double7 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 0, (int) (short) 0);
        double double8 = hypergeometricDistribution4.calculateNumericalVariance();
        double double9 = hypergeometricDistribution4.getNumericalMean();
        double double12 = hypergeometricDistribution4.cumulativeProbability(35, (int) (short) 100);
        double double13 = hypergeometricDistribution4.getNumericalMean();
        int int14 = hypergeometricDistribution4.getSupportUpperBound();
        double double16 = hypergeometricDistribution4.upperCumulativeProbability(24);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.2275d + "'", double8 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.35d + "'", double9 == 0.35d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.35d + "'", double13 == 0.35d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 32, 4, (int) (byte) 1);
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = hypergeometricDistribution4.sample();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double9 = hypergeometricDistribution4.cumulativeProbability(0, (int) 'a');
        boolean boolean10 = hypergeometricDistribution4.isSupportConnected();
        double double12 = hypergeometricDistribution4.upperCumulativeProbability(100);
        int int13 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int14 = hypergeometricDistribution4.getSupportUpperBound();
        int int15 = hypergeometricDistribution4.getSampleSize();
        double double16 = hypergeometricDistribution4.getNumericalVariance();
        java.lang.Class<?> wildcardClass17 = hypergeometricDistribution4.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.34999999999999964d + "'", double9 == 0.34999999999999964d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.2275d + "'", double16 == 0.2275d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
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
        double double18 = hypergeometricDistribution4.cumulativeProbability((-1), 97);
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
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        boolean boolean5 = hypergeometricDistribution4.isSupportConnected();
        boolean boolean6 = hypergeometricDistribution4.isSupportConnected();
        int int7 = hypergeometricDistribution4.getSampleSize();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
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
        int int30 = hypergeometricDistribution4.getSupportUpperBound();
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        double double7 = hypergeometricDistribution4.upperCumulativeProbability((int) (short) -1);
        double double8 = hypergeometricDistribution4.getNumericalVariance();
        double double9 = hypergeometricDistribution4.calculateNumericalVariance();
        int int11 = hypergeometricDistribution4.inverseCumulativeProbability(0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.2275d + "'", double8 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.2275d + "'", double9 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        int int7 = hypergeometricDistribution4.getNumberOfSuccesses();
        boolean boolean8 = hypergeometricDistribution4.isSupportConnected();
        int int9 = hypergeometricDistribution4.getPopulationSize();
        double double10 = hypergeometricDistribution4.getNumericalVariance();
        double double11 = hypergeometricDistribution4.calculateNumericalVariance();
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistribution4.reseedRandomGenerator((long) (-1));
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
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (short) 10, 1, 1);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double7 = hypergeometricDistribution4.calculateNumericalVariance();
        int int8 = hypergeometricDistribution4.getSupportUpperBound();
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 10);
        double double12 = hypergeometricDistribution4.probability(24);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) ' ', (int) ' ', (int) (byte) 1);
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (short) 0);
        double double6 = hypergeometricDistribution3.getNumericalMean();
        double double7 = hypergeometricDistribution3.calculateNumericalVariance();
        double double9 = hypergeometricDistribution3.cumulativeProbability(35);
        int int10 = hypergeometricDistribution3.sample();
        int int11 = hypergeometricDistribution3.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getPopulationSize();
        double double7 = hypergeometricDistribution4.getNumericalMean();
        double double8 = hypergeometricDistribution4.getNumericalMean();
        int int9 = hypergeometricDistribution4.getSupportUpperBound();
        int int10 = hypergeometricDistribution4.getPopulationSize();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.35d + "'", double7 == 0.35d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.35d + "'", double8 == 0.35d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (short) 100, (int) '#', 1);
        int int4 = hypergeometricDistribution3.getNumberOfSuccesses();
        double double6 = hypergeometricDistribution3.probability(100);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = hypergeometricDistribution3.inverseCumulativeProbability((double) (-1));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: -1 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double7 = hypergeometricDistribution4.calculateNumericalVariance();
        double double9 = hypergeometricDistribution4.probability((int) (byte) 100);
        boolean boolean10 = hypergeometricDistribution4.isSupportConnected();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
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
        double double17 = hypergeometricDistribution4.cumulativeProbability(4, 100);
        java.lang.Class<?> wildcardClass18 = hypergeometricDistribution4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.2275d + "'", double12 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.cumulativeProbability(0);
        double double7 = hypergeometricDistribution4.calculateNumericalVariance();
        double double9 = hypergeometricDistribution4.upperCumulativeProbability(10);
        double double10 = hypergeometricDistribution4.calculateNumericalVariance();
        double double11 = hypergeometricDistribution4.calculateNumericalVariance();
        double double12 = hypergeometricDistribution4.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.2275d + "'", double10 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.2275d + "'", double11 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.2275d + "'", double12 == 0.2275d);
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 1, (int) (short) 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: number of successes (10) must be less than or equal to population size (1)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double7 = hypergeometricDistribution4.calculateNumericalVariance();
        double double9 = hypergeometricDistribution4.probability((int) (byte) 100);
        int int10 = hypergeometricDistribution4.getSupportLowerBound();
        boolean boolean11 = hypergeometricDistribution4.isSupportConnected();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (short) 100, 35, 1);
        double double6 = hypergeometricDistribution3.cumulativeProbability(0, (int) (short) 1);
        int int7 = hypergeometricDistribution3.getSupportUpperBound();
        double double8 = hypergeometricDistribution3.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.34999999999999987d + "'", double6 == 0.34999999999999987d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.35d + "'", double8 == 0.35d);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        double double12 = hypergeometricDistribution4.cumulativeProbability((int) ' ');
        double double13 = hypergeometricDistribution4.calculateNumericalVariance();
        int int14 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double16 = hypergeometricDistribution4.probability(35);
        java.lang.Class<?> wildcardClass17 = hypergeometricDistribution4.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2275d + "'", double13 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(24, 0, 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: sample size (100) must be less than or equal to population size (24)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getPopulationSize();
        double double7 = hypergeometricDistribution4.getNumericalMean();
        double double8 = hypergeometricDistribution4.getNumericalMean();
        int int9 = hypergeometricDistribution4.getSupportUpperBound();
        double double10 = hypergeometricDistribution4.calculateNumericalVariance();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = hypergeometricDistribution4.sample((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: number of samples (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.35d + "'", double7 == 0.35d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.35d + "'", double8 == 0.35d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.2275d + "'", double10 == 0.2275d);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        boolean boolean5 = hypergeometricDistribution4.isSupportConnected();
        int int6 = hypergeometricDistribution4.getSampleSize();
        double double8 = hypergeometricDistribution4.probability(10);
        int int9 = hypergeometricDistribution4.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int7 = hypergeometricDistribution4.getSupportLowerBound();
        int int8 = hypergeometricDistribution4.getSampleSize();
        double double9 = hypergeometricDistribution4.getNumericalMean();
        int int10 = hypergeometricDistribution4.getSupportUpperBound();
        boolean boolean11 = hypergeometricDistribution4.isSupportConnected();
        int int12 = hypergeometricDistribution4.getPopulationSize();
        // The following exception was thrown during execution in test generation
        try {
            int int13 = hypergeometricDistribution4.sample();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.35d + "'", double9 == 0.35d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.cumulativeProbability(0);
        double double7 = hypergeometricDistribution4.calculateNumericalVariance();
        int int8 = hypergeometricDistribution4.getPopulationSize();
        double double10 = hypergeometricDistribution4.probability((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            double double13 = hypergeometricDistribution4.cumulativeProbability((int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (100) must be less than or equal to upper endpoint (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, (int) (byte) 100, (int) (byte) 100);
        hypergeometricDistribution3.reseedRandomGenerator((long) 52);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        int int11 = hypergeometricDistribution4.getSupportUpperBound();
        int int13 = hypergeometricDistribution4.inverseCumulativeProbability((double) 1L);
        int int14 = hypergeometricDistribution4.getSampleSize();
        int int15 = hypergeometricDistribution4.getSupportUpperBound();
        double double16 = hypergeometricDistribution4.calculateNumericalVariance();
        int int17 = hypergeometricDistribution4.getSampleSize();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.2275d + "'", double16 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
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
        double double16 = hypergeometricDistribution4.calculateNumericalVariance();
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
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.2275d + "'", double16 == 0.2275d);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 1, (int) (short) 1, 52);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: sample size (52) must be less than or equal to population size (1)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) ' ', (int) ' ', (int) (byte) 1);
        double double4 = hypergeometricDistribution3.getNumericalMean();
        boolean boolean5 = hypergeometricDistribution3.isSupportConnected();
        int int6 = hypergeometricDistribution3.getPopulationSize();
        int int7 = hypergeometricDistribution3.getSampleSize();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        int int12 = hypergeometricDistribution4.inverseCumulativeProbability(0.34999999999999964d);
        boolean boolean13 = hypergeometricDistribution4.isSupportConnected();
        double double14 = hypergeometricDistribution4.getNumericalMean();
        int int15 = hypergeometricDistribution4.getPopulationSize();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.35d + "'", double14 == 0.35d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        int int6 = hypergeometricDistribution4.getSupportLowerBound();
        double double7 = hypergeometricDistribution4.getNumericalMean();
        int int8 = hypergeometricDistribution4.getSampleSize();
        double double11 = hypergeometricDistribution4.cumulativeProbability((int) (short) -1, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray13 = hypergeometricDistribution4.sample((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.35d + "'", double7 == 0.35d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
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
        int int22 = hypergeometricDistribution4.getSampleSize();
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 35 + "'", int22 == 35);
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
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
        int int20 = hypergeometricDistribution4.getPopulationSize();
        double double21 = hypergeometricDistribution4.calculateNumericalVariance();
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.2275d + "'", double21 == 0.2275d);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        double double7 = hypergeometricDistribution4.upperCumulativeProbability((int) (short) -1);
        boolean boolean8 = hypergeometricDistribution4.isSupportConnected();
        double double11 = hypergeometricDistribution4.cumulativeProbability((int) (byte) -1, (int) (short) 10);
        int int12 = hypergeometricDistribution4.getPopulationSize();
        int int13 = hypergeometricDistribution4.getPopulationSize();
        java.lang.Class<?> wildcardClass14 = hypergeometricDistribution4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.2275d + "'", double17 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        int int11 = hypergeometricDistribution4.getSupportUpperBound();
        int int12 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int13 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double14 = hypergeometricDistribution4.calculateNumericalVariance();
        double double16 = hypergeometricDistribution4.cumulativeProbability(35);
        // The following exception was thrown during execution in test generation
        try {
            double double19 = hypergeometricDistribution4.cumulativeProbability((int) 'a', (int) ' ');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (97) must be less than or equal to upper endpoint (32)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.2275d + "'", double14 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(4, 0, (int) (byte) 0);
        double double4 = hypergeometricDistribution3.getNumericalMean();
        int int5 = hypergeometricDistribution3.getSupportUpperBound();
        double double6 = hypergeometricDistribution3.getNumericalMean();
        int[] intArray8 = hypergeometricDistribution3.sample(35);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
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
        int int19 = hypergeometricDistribution4.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.2275d + "'", double9 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.6500000000000004d + "'", double13 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.2275d + "'", double18 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 1, (int) (short) 0, (-1));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: number of samples (-1)");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        double double6 = hypergeometricDistribution4.getNumericalMean();
        int int7 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double8 = hypergeometricDistribution4.getNumericalVariance();
        double double11 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 0, 52);
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistribution4.reseedRandomGenerator((long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.35d + "'", double6 == 0.35d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.2275d + "'", double8 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.34999999999999964d + "'", double11 == 0.34999999999999964d);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '4', (int) (byte) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: number of successes (-1)");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (byte) 100, 97, (int) (short) 10);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double8 = hypergeometricDistribution4.probability((int) 'a');
        boolean boolean9 = hypergeometricDistribution4.isSupportConnected();
        int int10 = hypergeometricDistribution4.getSupportUpperBound();
        int int11 = hypergeometricDistribution4.getPopulationSize();
        java.lang.Class<?> wildcardClass12 = hypergeometricDistribution4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
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
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSampleSize();
        double double7 = hypergeometricDistribution4.probability(0);
        double double8 = hypergeometricDistribution4.getNumericalMean();
        int int10 = hypergeometricDistribution4.inverseCumulativeProbability((double) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = hypergeometricDistribution4.sample((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.6500000000000004d + "'", double7 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.35d + "'", double8 == 0.35d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
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
        boolean boolean17 = hypergeometricDistribution4.isSupportConnected();
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getPopulationSize();
        boolean boolean7 = hypergeometricDistribution4.isSupportConnected();
        int int8 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int9 = hypergeometricDistribution4.getSampleSize();
        double double11 = hypergeometricDistribution4.upperCumulativeProbability(10);
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistribution4.reseedRandomGenerator(10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(100, (int) ' ', (int) '#');
        int[] intArray5 = hypergeometricDistribution3.sample((int) (short) 100);
        java.lang.Class<?> wildcardClass6 = hypergeometricDistribution3.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getPopulationSize();
        int int8 = hypergeometricDistribution4.inverseCumulativeProbability((double) (byte) 0);
        double double9 = hypergeometricDistribution4.getNumericalVariance();
        double double11 = hypergeometricDistribution4.cumulativeProbability((int) '#');
        double double13 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        int int14 = hypergeometricDistribution4.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.2275d + "'", double9 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(10, 10, (int) (byte) 0);
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.probability((int) ' ');
        double double11 = hypergeometricDistribution4.getNumericalVariance();
        double double12 = hypergeometricDistribution4.getNumericalVariance();
        int int13 = hypergeometricDistribution4.getPopulationSize();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.2275d + "'", double11 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.2275d + "'", double12 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (short) 100, (int) (short) 1, (int) (short) 10);
        boolean boolean4 = hypergeometricDistribution3.isSupportConnected();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getPopulationSize();
        double double6 = hypergeometricDistribution4.calculateNumericalVariance();
        boolean boolean7 = hypergeometricDistribution4.isSupportConnected();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.2275d + "'", double6 == 0.2275d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.cumulativeProbability(0);
        int int7 = hypergeometricDistribution4.getSupportLowerBound();
        int int8 = hypergeometricDistribution4.getSupportUpperBound();
        int int9 = hypergeometricDistribution4.getPopulationSize();
        int int10 = hypergeometricDistribution4.getPopulationSize();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = hypergeometricDistribution4.sample();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        boolean boolean5 = hypergeometricDistribution4.isSupportConnected();
        int int6 = hypergeometricDistribution4.getSampleSize();
        int int7 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double9 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 100);
        int int10 = hypergeometricDistribution4.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
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
        java.lang.Class<?> wildcardClass14 = hypergeometricDistribution4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.6500000000000004d + "'", double11 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2275d + "'", double13 == 0.2275d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
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
        double double16 = hypergeometricDistribution4.probability(32);
        int int17 = hypergeometricDistribution4.getSampleSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.2275d + "'", double12 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
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
        int int20 = hypergeometricDistribution4.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.2275d + "'", double11 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        double double12 = hypergeometricDistribution4.cumulativeProbability((int) ' ');
        double double13 = hypergeometricDistribution4.calculateNumericalVariance();
        int int14 = hypergeometricDistribution4.getPopulationSize();
        int int15 = hypergeometricDistribution4.getPopulationSize();
        double double16 = hypergeometricDistribution4.calculateNumericalVariance();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2275d + "'", double13 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.2275d + "'", double16 == 0.2275d);
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (short) 100, 35, 1);
        int int4 = hypergeometricDistribution3.getSupportUpperBound();
        int int6 = hypergeometricDistribution3.inverseCumulativeProbability(0.005038011914198055d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        double double7 = hypergeometricDistribution4.upperCumulativeProbability(1);
        double double10 = hypergeometricDistribution4.cumulativeProbability(10, (int) '4');
        int int11 = hypergeometricDistribution4.getPopulationSize();
        // The following exception was thrown during execution in test generation
        try {
            double double14 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 100, 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (100) must be less than or equal to upper endpoint (1)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.3500000000000001d + "'", double7 == 0.3500000000000001d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (short) 100, (int) (byte) 0, (int) (short) 0);
        double double4 = hypergeometricDistribution3.getNumericalVariance();
        int[] intArray6 = hypergeometricDistribution3.sample((int) (byte) 1);
        hypergeometricDistribution3.reseedRandomGenerator((long) 'a');
        double double9 = hypergeometricDistribution3.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 0 });
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getPopulationSize();
        int int8 = hypergeometricDistribution4.inverseCumulativeProbability((double) (byte) 0);
        double double9 = hypergeometricDistribution4.getNumericalVariance();
        double double11 = hypergeometricDistribution4.cumulativeProbability(32);
        double double13 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.2275d + "'", double9 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 1, 0, 0);
        hypergeometricDistribution3.reseedRandomGenerator((long) (byte) 1);
        int int6 = hypergeometricDistribution3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSampleSize();
        double double7 = hypergeometricDistribution4.probability(0);
        double double8 = hypergeometricDistribution4.getNumericalMean();
        int int10 = hypergeometricDistribution4.inverseCumulativeProbability((double) (byte) 1);
        double double11 = hypergeometricDistribution4.calculateNumericalVariance();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.6500000000000004d + "'", double7 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.35d + "'", double8 == 0.35d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.2275d + "'", double11 == 0.2275d);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, (int) (byte) 100, (int) (byte) 100);
        int int4 = hypergeometricDistribution3.getSampleSize();
        double double6 = hypergeometricDistribution3.cumulativeProbability(0);
        int int7 = hypergeometricDistribution3.getSupportLowerBound();
        int int8 = hypergeometricDistribution3.getSupportLowerBound();
        int int9 = hypergeometricDistribution3.sample();
        int int10 = hypergeometricDistribution3.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        double double7 = hypergeometricDistribution4.upperCumulativeProbability((int) (short) -1);
        boolean boolean8 = hypergeometricDistribution4.isSupportConnected();
        double double9 = hypergeometricDistribution4.getNumericalVariance();
        boolean boolean10 = hypergeometricDistribution4.isSupportConnected();
        int int11 = hypergeometricDistribution4.getSupportLowerBound();
        java.lang.Class<?> wildcardClass12 = hypergeometricDistribution4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.2275d + "'", double9 == 0.2275d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        int int11 = hypergeometricDistribution4.getSupportUpperBound();
        int int13 = hypergeometricDistribution4.inverseCumulativeProbability((double) 1L);
        int int14 = hypergeometricDistribution4.getSampleSize();
        double double17 = hypergeometricDistribution4.cumulativeProbability((int) 'a', (int) 'a');
        double double18 = hypergeometricDistribution4.getNumericalMean();
        int int19 = hypergeometricDistribution4.getSampleSize();
        double double20 = hypergeometricDistribution4.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.35d + "'", double18 == 0.35d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 35 + "'", int19 == 35);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.35d + "'", double20 == 0.35d);
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
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
        double double22 = hypergeometricDistribution4.getNumericalMean();
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
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.35d + "'", double22 == 0.35d);
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (short) 1, (int) (short) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: number of samples (-1)");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(10, 52, (-1));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: number of samples (-1)");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(4, 0, (int) (byte) 0);
        double double5 = hypergeometricDistribution3.upperCumulativeProbability((int) (short) 1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution4.isSupportConnected();
        double double7 = hypergeometricDistribution4.getNumericalVariance();
        double double10 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1, (int) 'a');
        int int11 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int12 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double13 = hypergeometricDistribution4.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2275d + "'", double13 == 0.2275d);
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.cumulativeProbability(0);
        double double7 = hypergeometricDistribution4.calculateNumericalVariance();
        int int8 = hypergeometricDistribution4.getPopulationSize();
        double double10 = hypergeometricDistribution4.probability((int) (byte) -1);
        double double12 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 100);
        int int13 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double15 = hypergeometricDistribution4.upperCumulativeProbability((int) 'a');
        double double17 = hypergeometricDistribution4.cumulativeProbability(35);
        int int18 = hypergeometricDistribution4.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) -1, 32, 4);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: population size (-1)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getPopulationSize();
        double double7 = hypergeometricDistribution4.getNumericalMean();
        int int8 = hypergeometricDistribution4.getSampleSize();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.35d + "'", double7 == 0.35d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 0, (int) (short) 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: population size (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(4, 0, (int) (byte) 0);
        double double4 = hypergeometricDistribution3.getNumericalMean();
        double double7 = hypergeometricDistribution3.cumulativeProbability(10, (int) '#');
        int int8 = hypergeometricDistribution3.getSampleSize();
        double double9 = hypergeometricDistribution3.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 10, (int) '4', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: number of successes (52) must be less than or equal to population size (10)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 35, 52, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: number of successes (52) must be less than or equal to population size (35)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        double double7 = hypergeometricDistribution4.upperCumulativeProbability((int) (short) -1);
        boolean boolean8 = hypergeometricDistribution4.isSupportConnected();
        double double9 = hypergeometricDistribution4.getNumericalVariance();
        double double10 = hypergeometricDistribution4.getNumericalVariance();
        int int12 = hypergeometricDistribution4.inverseCumulativeProbability((double) 0.0f);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.2275d + "'", double9 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.2275d + "'", double10 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
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
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray27 = hypergeometricDistribution4.sample(35);
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
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double7 = hypergeometricDistribution4.calculateNumericalVariance();
        int int8 = hypergeometricDistribution4.getSupportUpperBound();
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 10);
        double double11 = hypergeometricDistribution4.getNumericalMean();
        double double13 = hypergeometricDistribution4.upperCumulativeProbability(0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.35d + "'", double11 == 0.35d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
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
        java.lang.Class<?> wildcardClass15 = hypergeometricDistribution4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.6500000000000004d + "'", double11 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.35d + "'", double14 == 0.35d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        int int7 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double9 = hypergeometricDistribution4.cumulativeProbability((int) '#');
        int int10 = hypergeometricDistribution4.getSampleSize();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
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
        double double18 = hypergeometricDistribution4.calculateNumericalVariance();
        // The following exception was thrown during execution in test generation
        try {
            double double21 = hypergeometricDistribution4.cumulativeProbability((int) ' ', 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (32) must be less than or equal to upper endpoint (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
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
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.2275d + "'", double18 == 0.2275d);
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
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
        boolean boolean19 = hypergeometricDistribution4.isSupportConnected();
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.35d + "'", double13 == 0.35d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.2275d + "'", double16 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(0, (int) (short) 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: population size (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) 'a', (int) (byte) 1, (int) '#');
        double double5 = hypergeometricDistribution4.calculateNumericalVariance();
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (short) 0, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.23063024763524284d + "'", double5 == 0.23063024763524284d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        double double12 = hypergeometricDistribution4.cumulativeProbability((int) ' ');
        int int14 = hypergeometricDistribution4.inverseCumulativeProbability((double) 1L);
        double double16 = hypergeometricDistribution4.cumulativeProbability((int) (short) -1);
        double double17 = hypergeometricDistribution4.getNumericalMean();
        double double18 = hypergeometricDistribution4.calculateNumericalVariance();
        // The following exception was thrown during execution in test generation
        try {
            double double21 = hypergeometricDistribution4.cumulativeProbability((int) (short) 1, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (1) must be less than or equal to upper endpoint (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.35d + "'", double17 == 0.35d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.2275d + "'", double18 == 0.2275d);
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
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
        // The following exception was thrown during execution in test generation
        try {
            double double19 = hypergeometricDistribution4.cumulativeProbability(0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (0) must be less than or equal to upper endpoint (-1)");
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.2275d + "'", double16 == 0.2275d);
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', 52, (int) '4');
        boolean boolean4 = hypergeometricDistribution3.isSupportConnected();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
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
        double double21 = hypergeometricDistribution4.calculateNumericalVariance();
        // The following exception was thrown during execution in test generation
        try {
            double double24 = hypergeometricDistribution4.cumulativeProbability((int) (short) 0, (-1));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (0) must be less than or equal to upper endpoint (-1)");
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35 + "'", int20 == 35);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.2275d + "'", double21 == 0.2275d);
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(1, (int) (byte) -1, 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: number of successes (-1)");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 0, 52, 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: population size (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        double double6 = hypergeometricDistribution4.getNumericalMean();
        double double8 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 10);
        int int9 = hypergeometricDistribution4.getSampleSize();
        double double12 = hypergeometricDistribution4.cumulativeProbability(4, (int) '#');
        int int13 = hypergeometricDistribution4.getSampleSize();
        int int14 = hypergeometricDistribution4.getSampleSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.35d + "'", double6 == 0.35d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(4, 0, (int) (byte) 0);
        hypergeometricDistribution3.reseedRandomGenerator((long) '#');
        int int6 = hypergeometricDistribution3.getSampleSize();
        int[] intArray8 = hypergeometricDistribution3.sample(24);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution4.isSupportConnected();
        double double7 = hypergeometricDistribution4.getNumericalVariance();
        int int8 = hypergeometricDistribution4.getSupportUpperBound();
        int int9 = hypergeometricDistribution4.getSupportLowerBound();
        int int10 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double11 = hypergeometricDistribution4.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.35d + "'", double11 == 0.35d);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double7 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 0, (int) (short) 0);
        double double10 = hypergeometricDistribution4.cumulativeProbability((int) (byte) -1, (int) (byte) -1);
        boolean boolean11 = hypergeometricDistribution4.isSupportConnected();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        double double6 = hypergeometricDistribution4.getNumericalMean();
        double double8 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 10);
        double double11 = hypergeometricDistribution4.cumulativeProbability(0, (int) (short) 0);
        double double12 = hypergeometricDistribution4.getNumericalMean();
        double double14 = hypergeometricDistribution4.probability(0);
        boolean boolean15 = hypergeometricDistribution4.isSupportConnected();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.35d + "'", double6 == 0.35d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.35d + "'", double12 == 0.35d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.6500000000000004d + "'", double14 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.2275d + "'", double12 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        double double7 = hypergeometricDistribution4.upperCumulativeProbability((int) (short) -1);
        boolean boolean8 = hypergeometricDistribution4.isSupportConnected();
        double double9 = hypergeometricDistribution4.getNumericalVariance();
        int int10 = hypergeometricDistribution4.getSupportUpperBound();
        int int11 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double13 = hypergeometricDistribution4.probability((int) (short) 1);
        int int14 = hypergeometricDistribution4.getPopulationSize();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.2275d + "'", double9 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.3500000000000001d + "'", double13 == 0.3500000000000001d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
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
        int int20 = hypergeometricDistribution4.getPopulationSize();
        int int21 = hypergeometricDistribution4.getSupportUpperBound();
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getPopulationSize();
        boolean boolean7 = hypergeometricDistribution4.isSupportConnected();
        double double10 = hypergeometricDistribution4.cumulativeProbability(1, (int) '#');
        double double11 = hypergeometricDistribution4.calculateNumericalVariance();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = hypergeometricDistribution4.sample();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.2275d + "'", double11 == 0.2275d);
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
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
        double double26 = hypergeometricDistribution4.upperCumulativeProbability((int) ' ');
        boolean boolean27 = hypergeometricDistribution4.isSupportConnected();
        int int29 = hypergeometricDistribution4.inverseCumulativeProbability((double) 0L);
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
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, (int) ' ', (int) (short) 1);
        int int5 = hypergeometricDistribution4.getPopulationSize();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
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
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = hypergeometricDistribution4.sample(32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.2275d + "'", double14 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
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
        double double16 = hypergeometricDistribution4.probability((int) 'a');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.35d + "'", double7 == 0.35d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.cumulativeProbability(0);
        double double7 = hypergeometricDistribution4.calculateNumericalVariance();
        int int8 = hypergeometricDistribution4.getPopulationSize();
        boolean boolean9 = hypergeometricDistribution4.isSupportConnected();
        int int10 = hypergeometricDistribution4.getSupportUpperBound();
        int int11 = hypergeometricDistribution4.getSupportLowerBound();
        double double13 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
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
        boolean boolean16 = hypergeometricDistribution4.isSupportConnected();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.35d + "'", double8 == 0.35d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.35d + "'", double10 == 0.35d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double7 = hypergeometricDistribution4.calculateNumericalVariance();
        int int8 = hypergeometricDistribution4.getSupportLowerBound();
        double double9 = hypergeometricDistribution4.getNumericalVariance();
        double double10 = hypergeometricDistribution4.getNumericalMean();
        int int11 = hypergeometricDistribution4.getSupportLowerBound();
        int int12 = hypergeometricDistribution4.getSampleSize();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.2275d + "'", double9 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.35d + "'", double10 == 0.35d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (short) 10, 10, 1);
        int int4 = hypergeometricDistribution3.getSupportLowerBound();
        int int5 = hypergeometricDistribution3.getPopulationSize();
        int int6 = hypergeometricDistribution3.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
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
        int int17 = hypergeometricDistribution4.getSampleSize();
        java.lang.Class<?> wildcardClass18 = hypergeometricDistribution4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.3500000000000001d + "'", double10 == 0.3500000000000001d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2275d + "'", double13 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
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
        double double22 = hypergeometricDistribution4.cumulativeProbability(0, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.34999999999999964d + "'", double22 == 0.34999999999999964d);
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        double double6 = hypergeometricDistribution4.getNumericalMean();
        int int7 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int8 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int10 = hypergeometricDistribution4.inverseCumulativeProbability(0.0d);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = hypergeometricDistribution4.sample();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.35d + "'", double6 == 0.35d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 97, (-1), 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: number of successes (-1)");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) ' ', (int) ' ', (int) (byte) 1);
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (short) 0);
        double double7 = hypergeometricDistribution3.cumulativeProbability(52);
        int int9 = hypergeometricDistribution3.inverseCumulativeProbability((double) (byte) 0);
        double double10 = hypergeometricDistribution3.calculateNumericalVariance();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 100, 10, (int) '4');
        double double6 = hypergeometricDistribution4.probability((int) (short) 1);
        int int7 = hypergeometricDistribution4.getSampleSize();
        int int8 = hypergeometricDistribution4.getSampleSize();
        double double11 = hypergeometricDistribution4.cumulativeProbability(35, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.005038011914198055d + "'", double6 == 0.005038011914198055d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
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
        double double14 = hypergeometricDistribution4.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.2275d + "'", double9 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.35d + "'", double13 == 0.35d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.2275d + "'", double14 == 0.2275d);
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution4.isSupportConnected();
        double double7 = hypergeometricDistribution4.getNumericalVariance();
        int int8 = hypergeometricDistribution4.getSupportUpperBound();
        double double11 = hypergeometricDistribution4.cumulativeProbability(0, (int) (short) 100);
        int int12 = hypergeometricDistribution4.getSupportUpperBound();
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistribution4.reseedRandomGenerator((long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.34999999999999964d + "'", double11 == 0.34999999999999964d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        double double6 = hypergeometricDistribution4.getNumericalMean();
        double double7 = hypergeometricDistribution4.getNumericalMean();
        int int8 = hypergeometricDistribution4.getSupportUpperBound();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = hypergeometricDistribution4.sample();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.35d + "'", double6 == 0.35d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.35d + "'", double7 == 0.35d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 24, 97, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: number of samples (-1)");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int7 = hypergeometricDistribution4.getSupportLowerBound();
        int int8 = hypergeometricDistribution4.getSampleSize();
        java.lang.Class<?> wildcardClass9 = hypergeometricDistribution4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double9 = hypergeometricDistribution4.cumulativeProbability(0, (int) 'a');
        boolean boolean10 = hypergeometricDistribution4.isSupportConnected();
        double double12 = hypergeometricDistribution4.upperCumulativeProbability(100);
        double double14 = hypergeometricDistribution4.cumulativeProbability((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            double double17 = hypergeometricDistribution4.cumulativeProbability((int) '4', 24);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (52) must be less than or equal to upper endpoint (24)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.34999999999999964d + "'", double9 == 0.34999999999999964d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.6500000000000004d + "'", double14 == 0.6500000000000004d);
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        double double7 = hypergeometricDistribution4.upperCumulativeProbability((int) (short) -1);
        boolean boolean8 = hypergeometricDistribution4.isSupportConnected();
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((-1));
        int int11 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int12 = hypergeometricDistribution4.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double9 = hypergeometricDistribution4.cumulativeProbability(0, (int) 'a');
        boolean boolean10 = hypergeometricDistribution4.isSupportConnected();
        int int11 = hypergeometricDistribution4.getSampleSize();
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistribution4.reseedRandomGenerator(0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.34999999999999964d + "'", double9 == 0.34999999999999964d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        int int7 = hypergeometricDistribution4.getNumberOfSuccesses();
        boolean boolean8 = hypergeometricDistribution4.isSupportConnected();
        int int9 = hypergeometricDistribution4.getPopulationSize();
        double double12 = hypergeometricDistribution4.cumulativeProbability(1, (int) (byte) 10);
        int int13 = hypergeometricDistribution4.getSampleSize();
        double double16 = hypergeometricDistribution4.cumulativeProbability((-1), (int) (short) 0);
        int int17 = hypergeometricDistribution4.getPopulationSize();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.6500000000000004d + "'", double16 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(4, 0, (int) (byte) 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        hypergeometricDistribution3.reseedRandomGenerator((long) (byte) 1);
        double double8 = hypergeometricDistribution3.cumulativeProbability(0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        double double6 = hypergeometricDistribution4.getNumericalMean();
        int int7 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int8 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int9 = hypergeometricDistribution4.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.35d + "'", double6 == 0.35d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        int int6 = hypergeometricDistribution4.getSupportLowerBound();
        double double7 = hypergeometricDistribution4.getNumericalMean();
        double double8 = hypergeometricDistribution4.getNumericalMean();
        int int9 = hypergeometricDistribution4.getNumberOfSuccesses();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = hypergeometricDistribution4.sample();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.35d + "'", double7 == 0.35d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.35d + "'", double8 == 0.35d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        int int7 = hypergeometricDistribution4.getNumberOfSuccesses();
        boolean boolean8 = hypergeometricDistribution4.isSupportConnected();
        double double10 = hypergeometricDistribution4.probability(35);
        double double13 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1, 1);
        int int14 = hypergeometricDistribution4.getPopulationSize();
        double double16 = hypergeometricDistribution4.upperCumulativeProbability(35);
        int int18 = hypergeometricDistribution4.inverseCumulativeProbability((double) 1.0f);
        double double19 = hypergeometricDistribution4.calculateNumericalVariance();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.2275d + "'", double19 == 0.2275d);
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, 35, 0);
        double double6 = hypergeometricDistribution3.cumulativeProbability((-1), (int) (short) -1);
        double double8 = hypergeometricDistribution3.probability(1);
        int int9 = hypergeometricDistribution3.getSupportUpperBound();
        hypergeometricDistribution3.reseedRandomGenerator((long) 1);
        double double14 = hypergeometricDistribution3.cumulativeProbability(10, 10);
        double double15 = hypergeometricDistribution3.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 0, (int) (short) 0, 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: population size (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        double double6 = hypergeometricDistribution4.getNumericalMean();
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistribution4.reseedRandomGenerator((long) 24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.35d + "'", double6 == 0.35d);
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) ' ', (int) ' ', (int) (byte) 1);
        double double4 = hypergeometricDistribution3.getNumericalMean();
        boolean boolean5 = hypergeometricDistribution3.isSupportConnected();
        int int6 = hypergeometricDistribution3.getPopulationSize();
        double double8 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((-1), (int) ' ', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: population size (-1)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, 32, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: number of samples (-1)");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
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
        double double25 = hypergeometricDistribution4.cumulativeProbability((int) (short) 0);
        double double27 = hypergeometricDistribution4.cumulativeProbability(52);
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
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.6500000000000004d + "'", double25 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 1.0d + "'", double27 == 1.0d);
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) ' ', (int) ' ', (int) (byte) 1);
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (short) 0);
        double double6 = hypergeometricDistribution3.getNumericalMean();
        double double7 = hypergeometricDistribution3.calculateNumericalVariance();
        double double8 = hypergeometricDistribution3.calculateNumericalVariance();
        int int9 = hypergeometricDistribution3.getNumberOfSuccesses();
        hypergeometricDistribution3.reseedRandomGenerator((long) ' ');
        int int12 = hypergeometricDistribution3.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getPopulationSize();
        boolean boolean6 = hypergeometricDistribution4.isSupportConnected();
        double double7 = hypergeometricDistribution4.calculateNumericalVariance();
        int int8 = hypergeometricDistribution4.getSupportLowerBound();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = hypergeometricDistribution4.inverseCumulativeProbability((double) 24);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: 24 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        int int6 = hypergeometricDistribution4.getSupportLowerBound();
        double double8 = hypergeometricDistribution4.probability(1);
        int int9 = hypergeometricDistribution4.getPopulationSize();
        int int10 = hypergeometricDistribution4.getSupportUpperBound();
        double double12 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        int int14 = hypergeometricDistribution4.inverseCumulativeProbability((double) (byte) 1);
        double double16 = hypergeometricDistribution4.probability(24);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.3500000000000001d + "'", double8 == 0.3500000000000001d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        double double6 = hypergeometricDistribution4.getNumericalMean();
        int int7 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int8 = hypergeometricDistribution4.getSupportUpperBound();
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistribution4.reseedRandomGenerator((long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.35d + "'", double6 == 0.35d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        double double12 = hypergeometricDistribution4.cumulativeProbability((int) ' ');
        int int14 = hypergeometricDistribution4.inverseCumulativeProbability((double) 1L);
        double double16 = hypergeometricDistribution4.cumulativeProbability((int) (short) -1);
        double double17 = hypergeometricDistribution4.getNumericalVariance();
        double double18 = hypergeometricDistribution4.getNumericalVariance();
        int int19 = hypergeometricDistribution4.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.2275d + "'", double17 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.2275d + "'", double18 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) ' ', 52, (int) '#');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: number of successes (52) must be less than or equal to population size (32)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (byte) 100, (int) ' ', 100);
        double double7 = hypergeometricDistribution4.cumulativeProbability(10, 97);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        int int6 = hypergeometricDistribution4.getSupportLowerBound();
        double double8 = hypergeometricDistribution4.probability(1);
        double double9 = hypergeometricDistribution4.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.3500000000000001d + "'", double8 == 0.3500000000000001d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.2275d + "'", double9 == 0.2275d);
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.cumulativeProbability(0);
        int int7 = hypergeometricDistribution4.getSupportLowerBound();
        int int8 = hypergeometricDistribution4.getSampleSize();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        int int7 = hypergeometricDistribution4.getNumberOfSuccesses();
        boolean boolean8 = hypergeometricDistribution4.isSupportConnected();
        int int9 = hypergeometricDistribution4.getPopulationSize();
        double double12 = hypergeometricDistribution4.cumulativeProbability(1, (int) (byte) 10);
        int int13 = hypergeometricDistribution4.getSampleSize();
        double double15 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 10);
        double double18 = hypergeometricDistribution4.cumulativeProbability(97, 97);
        double double19 = hypergeometricDistribution4.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.35d + "'", double19 == 0.35d);
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) ' ', 35, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: number of samples (-1)");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
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
        boolean boolean29 = hypergeometricDistribution4.isSupportConnected();
        int int30 = hypergeometricDistribution4.getSupportLowerBound();
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
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        double double6 = hypergeometricDistribution4.getNumericalMean();
        double double8 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 10);
        int int9 = hypergeometricDistribution4.getSampleSize();
        double double11 = hypergeometricDistribution4.upperCumulativeProbability(52);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.35d + "'", double6 == 0.35d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, 35, 0);
        int int4 = hypergeometricDistribution3.getSupportLowerBound();
        hypergeometricDistribution3.reseedRandomGenerator(100L);
        boolean boolean7 = hypergeometricDistribution3.isSupportConnected();
        int int8 = hypergeometricDistribution3.getSupportUpperBound();
        double double10 = hypergeometricDistribution3.cumulativeProbability(4);
        boolean boolean11 = hypergeometricDistribution3.isSupportConnected();
        double double13 = hypergeometricDistribution3.probability(4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(10, (int) (short) 10, (int) (short) 10);
        double double5 = hypergeometricDistribution3.upperCumulativeProbability((int) (byte) 1);
        int int6 = hypergeometricDistribution3.getPopulationSize();
        boolean boolean7 = hypergeometricDistribution3.isSupportConnected();
        int int8 = hypergeometricDistribution3.getSupportUpperBound();
        double double11 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 0, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 0, (-1), (int) '4');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: population size (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 10, (int) (byte) 10, (-1));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: number of samples (-1)");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
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
        // The following exception was thrown during execution in test generation
        try {
            int int15 = hypergeometricDistribution4.sample();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.34999999999999964d + "'", double11 == 0.34999999999999964d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.35d + "'", double12 == 0.35d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.upperCumulativeProbability((-1));
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) ' ');
        double double9 = hypergeometricDistribution4.calculateNumericalVariance();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.2275d + "'", double9 == 0.2275d);
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double8 = hypergeometricDistribution4.probability((int) 'a');
        int int9 = hypergeometricDistribution4.getPopulationSize();
        boolean boolean10 = hypergeometricDistribution4.isSupportConnected();
        int int11 = hypergeometricDistribution4.getPopulationSize();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
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
        // The following exception was thrown during execution in test generation
        try {
            int int22 = hypergeometricDistribution4.inverseCumulativeProbability((double) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: 10 out of [0, 1] range");
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
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.2275d + "'", double19 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) ' ', (int) (byte) 0);
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int7 = hypergeometricDistribution4.getSupportLowerBound();
        int int8 = hypergeometricDistribution4.getSampleSize();
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (short) 1);
        double double12 = hypergeometricDistribution4.cumulativeProbability((int) ' ');
        double double14 = hypergeometricDistribution4.probability((int) 'a');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.3500000000000001d + "'", double10 == 0.3500000000000001d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        double double11 = hypergeometricDistribution4.getNumericalVariance();
        double double13 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double15 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistribution4.reseedRandomGenerator((long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.2275d + "'", double11 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double7 = hypergeometricDistribution4.calculateNumericalVariance();
        int int9 = hypergeometricDistribution4.inverseCumulativeProbability((double) 0);
        double double10 = hypergeometricDistribution4.getNumericalMean();
        int int11 = hypergeometricDistribution4.getSupportLowerBound();
        int int12 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double14 = hypergeometricDistribution4.upperCumulativeProbability(52);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.35d + "'", double10 == 0.35d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        double double12 = hypergeometricDistribution4.cumulativeProbability((int) ' ');
        int int14 = hypergeometricDistribution4.inverseCumulativeProbability((double) 1L);
        double double16 = hypergeometricDistribution4.cumulativeProbability((int) (short) -1);
        double double19 = hypergeometricDistribution4.cumulativeProbability((int) (short) 10, (int) (short) 100);
        double double21 = hypergeometricDistribution4.probability((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.3500000000000001d + "'", double21 == 0.3500000000000001d);
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) ' ', (int) ' ', (int) (byte) 1);
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (short) 0);
        double double6 = hypergeometricDistribution3.getNumericalMean();
        double double7 = hypergeometricDistribution3.calculateNumericalVariance();
        double double8 = hypergeometricDistribution3.calculateNumericalVariance();
        int int9 = hypergeometricDistribution3.getNumberOfSuccesses();
        double double10 = hypergeometricDistribution3.calculateNumericalVariance();
        int int11 = hypergeometricDistribution3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        double double12 = hypergeometricDistribution4.upperCumulativeProbability(1);
        boolean boolean13 = hypergeometricDistribution4.isSupportConnected();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = hypergeometricDistribution4.sample((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.3500000000000001d + "'", double12 == 0.3500000000000001d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 10, 97, 97);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: number of successes (97) must be less than or equal to population size (10)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution4.isSupportConnected();
        double double7 = hypergeometricDistribution4.getNumericalVariance();
        double double8 = hypergeometricDistribution4.getNumericalMean();
        double double9 = hypergeometricDistribution4.getNumericalMean();
        double double10 = hypergeometricDistribution4.getNumericalVariance();
        int int12 = hypergeometricDistribution4.inverseCumulativeProbability(0.0d);
        int int13 = hypergeometricDistribution4.getSampleSize();
        double double15 = hypergeometricDistribution4.upperCumulativeProbability(0);
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
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.35d + "'", double8 == 0.35d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.35d + "'", double9 == 0.35d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.2275d + "'", double10 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double7 = hypergeometricDistribution4.calculateNumericalVariance();
        double double10 = hypergeometricDistribution4.cumulativeProbability((int) (byte) -1, (int) '#');
        double double13 = hypergeometricDistribution4.cumulativeProbability((int) (short) 0, 0);
        double double14 = hypergeometricDistribution4.calculateNumericalVariance();
        double double15 = hypergeometricDistribution4.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.2275d + "'", double14 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.35d + "'", double15 == 0.35d);
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (short) 100, 35, 1);
        double double6 = hypergeometricDistribution3.cumulativeProbability(0, (int) (short) 1);
        int int7 = hypergeometricDistribution3.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.34999999999999987d + "'", double6 == 0.34999999999999987d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
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
        int int15 = hypergeometricDistribution4.getPopulationSize();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, 35, 0);
        double double6 = hypergeometricDistribution3.cumulativeProbability((-1), (int) (short) -1);
        double double8 = hypergeometricDistribution3.probability(1);
        int int9 = hypergeometricDistribution3.getSupportUpperBound();
        boolean boolean10 = hypergeometricDistribution3.isSupportConnected();
        double double12 = hypergeometricDistribution3.cumulativeProbability((int) '#');
        double double15 = hypergeometricDistribution3.cumulativeProbability((int) (short) -1, 1);
        hypergeometricDistribution3.reseedRandomGenerator((long) 0);
        double double18 = hypergeometricDistribution3.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, 35, 0);
        int int4 = hypergeometricDistribution3.getSupportLowerBound();
        int int5 = hypergeometricDistribution3.getSupportUpperBound();
        int int6 = hypergeometricDistribution3.sample();
        int[] intArray8 = hypergeometricDistribution3.sample((int) '#');
        hypergeometricDistribution3.reseedRandomGenerator((long) (byte) 1);
        double double11 = hypergeometricDistribution3.getNumericalMean();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(10, (int) (byte) 0, 97);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: sample size (97) must be less than or equal to population size (10)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (byte) 100, (int) (short) 1, (int) (short) 10);
        java.lang.Class<?> wildcardClass5 = hypergeometricDistribution4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        int int11 = hypergeometricDistribution4.getSupportUpperBound();
        int int13 = hypergeometricDistribution4.inverseCumulativeProbability((double) 1L);
        int int14 = hypergeometricDistribution4.getSampleSize();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = hypergeometricDistribution4.sample(10);
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
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getPopulationSize();
        int int8 = hypergeometricDistribution4.inverseCumulativeProbability((double) (byte) 0);
        double double9 = hypergeometricDistribution4.getNumericalVariance();
        double double11 = hypergeometricDistribution4.upperCumulativeProbability((int) (short) 0);
        java.lang.Class<?> wildcardClass12 = hypergeometricDistribution4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.2275d + "'", double9 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        double double7 = hypergeometricDistribution4.upperCumulativeProbability((int) (short) -1);
        boolean boolean8 = hypergeometricDistribution4.isSupportConnected();
        double double11 = hypergeometricDistribution4.cumulativeProbability((int) (byte) -1, (int) (short) 10);
        double double13 = hypergeometricDistribution4.upperCumulativeProbability((int) ' ');
        boolean boolean14 = hypergeometricDistribution4.isSupportConnected();
        double double17 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 10, 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.cumulativeProbability(0);
        double double7 = hypergeometricDistribution4.getNumericalVariance();
        double double10 = hypergeometricDistribution4.cumulativeProbability((int) (byte) -1, (int) (byte) 10);
        java.lang.Class<?> wildcardClass11 = hypergeometricDistribution4.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) ' ', (int) ' ', (int) (byte) 1);
        int int4 = hypergeometricDistribution3.getSampleSize();
        boolean boolean5 = hypergeometricDistribution3.isSupportConnected();
        double double6 = hypergeometricDistribution3.getNumericalMean();
        double double7 = hypergeometricDistribution3.getNumericalVariance();
        double double8 = hypergeometricDistribution3.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        int int7 = hypergeometricDistribution4.getNumberOfSuccesses();
        boolean boolean8 = hypergeometricDistribution4.isSupportConnected();
        double double10 = hypergeometricDistribution4.probability(35);
        double double13 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1, 1);
        int int14 = hypergeometricDistribution4.getSupportLowerBound();
        int int15 = hypergeometricDistribution4.getSupportLowerBound();
        double double17 = hypergeometricDistribution4.cumulativeProbability(35);
        int int18 = hypergeometricDistribution4.getPopulationSize();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double7 = hypergeometricDistribution4.calculateNumericalVariance();
        double double9 = hypergeometricDistribution4.probability((int) (byte) 100);
        int int10 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double11 = hypergeometricDistribution4.calculateNumericalVariance();
        double double13 = hypergeometricDistribution4.probability((int) (short) 100);
        double double15 = hypergeometricDistribution4.cumulativeProbability((int) (short) 10);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.2275d + "'", double11 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.cumulativeProbability(0);
        int int7 = hypergeometricDistribution4.getSupportLowerBound();
        double double9 = hypergeometricDistribution4.cumulativeProbability(0);
        double double11 = hypergeometricDistribution4.cumulativeProbability((int) 'a');
        int int13 = hypergeometricDistribution4.inverseCumulativeProbability(0.34999999999999987d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.6500000000000004d + "'", double9 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
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
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistribution4.reseedRandomGenerator((long) 24);
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
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.6500000000000004d + "'", double16 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.6500000000000004d + "'", double19 == 0.6500000000000004d);
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        int int6 = hypergeometricDistribution4.getSupportLowerBound();
        double double7 = hypergeometricDistribution4.getNumericalMean();
        double double8 = hypergeometricDistribution4.calculateNumericalVariance();
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistribution4.reseedRandomGenerator((long) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.35d + "'", double7 == 0.35d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.2275d + "'", double8 == 0.2275d);
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', 32, (int) '#');
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double7 = hypergeometricDistribution4.calculateNumericalVariance();
        double double9 = hypergeometricDistribution4.cumulativeProbability(4);
        double double11 = hypergeometricDistribution4.probability((int) (byte) -1);
        double double13 = hypergeometricDistribution4.upperCumulativeProbability((int) '#');
        double double15 = hypergeometricDistribution4.probability((int) (short) -1);
        double double16 = hypergeometricDistribution4.getNumericalVariance();
        int int17 = hypergeometricDistribution4.getPopulationSize();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.2275d + "'", double16 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double9 = hypergeometricDistribution4.cumulativeProbability(0, (int) 'a');
        boolean boolean10 = hypergeometricDistribution4.isSupportConnected();
        double double12 = hypergeometricDistribution4.upperCumulativeProbability(100);
        int int13 = hypergeometricDistribution4.getNumberOfSuccesses();
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistribution4.reseedRandomGenerator((long) 24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.34999999999999964d + "'", double9 == 0.34999999999999964d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double7 = hypergeometricDistribution4.calculateNumericalVariance();
        int int9 = hypergeometricDistribution4.inverseCumulativeProbability((double) 0);
        int int10 = hypergeometricDistribution4.getSampleSize();
        double double11 = hypergeometricDistribution4.getNumericalVariance();
        double double12 = hypergeometricDistribution4.getNumericalMean();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = hypergeometricDistribution4.sample(35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.2275d + "'", double11 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.35d + "'", double12 == 0.35d);
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 4, 32, 32);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: number of successes (32) must be less than or equal to population size (4)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        double double12 = hypergeometricDistribution4.cumulativeProbability((int) ' ');
        double double13 = hypergeometricDistribution4.calculateNumericalVariance();
        int int14 = hypergeometricDistribution4.getNumberOfSuccesses();
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
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, (int) (byte) 100, (int) (byte) 100);
        int int4 = hypergeometricDistribution3.getSampleSize();
        int int5 = hypergeometricDistribution3.getSampleSize();
        int int6 = hypergeometricDistribution3.getSampleSize();
        double double8 = hypergeometricDistribution3.upperCumulativeProbability((int) (byte) -1);
        double double9 = hypergeometricDistribution3.calculateNumericalVariance();
        int int10 = hypergeometricDistribution3.getSupportUpperBound();
        hypergeometricDistribution3.reseedRandomGenerator((long) (byte) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double9 = hypergeometricDistribution4.cumulativeProbability(0, (int) 'a');
        boolean boolean10 = hypergeometricDistribution4.isSupportConnected();
        double double12 = hypergeometricDistribution4.upperCumulativeProbability(100);
        int int13 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double16 = hypergeometricDistribution4.cumulativeProbability((int) (short) 0, 0);
        double double17 = hypergeometricDistribution4.calculateNumericalVariance();
        double double19 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 10);
        int int20 = hypergeometricDistribution4.getSampleSize();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.34999999999999964d + "'", double9 == 0.34999999999999964d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.2275d + "'", double17 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35 + "'", int20 == 35);
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution4.isSupportConnected();
        double double7 = hypergeometricDistribution4.getNumericalVariance();
        double double8 = hypergeometricDistribution4.getNumericalMean();
        double double10 = hypergeometricDistribution4.upperCumulativeProbability(100);
        double double12 = hypergeometricDistribution4.upperCumulativeProbability(0);
        int int13 = hypergeometricDistribution4.getSampleSize();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = hypergeometricDistribution4.sample(35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.35d + "'", double8 == 0.35d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double7 = hypergeometricDistribution4.calculateNumericalVariance();
        double double9 = hypergeometricDistribution4.probability((int) (byte) 100);
        int int10 = hypergeometricDistribution4.getSupportLowerBound();
        double double12 = hypergeometricDistribution4.cumulativeProbability(1);
        double double14 = hypergeometricDistribution4.probability((int) (short) 10);
        double double16 = hypergeometricDistribution4.probability((int) (byte) 100);
        double double17 = hypergeometricDistribution4.calculateNumericalVariance();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.2275d + "'", double17 == 0.2275d);
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
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
        int int19 = hypergeometricDistribution4.getPopulationSize();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (byte) 1, 1, (int) (short) 0);
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double7 = hypergeometricDistribution4.getNumericalMean();
        double double8 = hypergeometricDistribution4.calculateNumericalVariance();
        int int9 = hypergeometricDistribution4.getSampleSize();
        int int10 = hypergeometricDistribution4.getSupportUpperBound();
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistribution4.reseedRandomGenerator((long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.35d + "'", double7 == 0.35d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.2275d + "'", double8 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        int int12 = hypergeometricDistribution4.inverseCumulativeProbability(0.34999999999999964d);
        boolean boolean13 = hypergeometricDistribution4.isSupportConnected();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = hypergeometricDistribution4.sample();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution4.isSupportConnected();
        double double7 = hypergeometricDistribution4.getNumericalVariance();
        int int8 = hypergeometricDistribution4.getSupportUpperBound();
        int int9 = hypergeometricDistribution4.getSupportLowerBound();
        int int10 = hypergeometricDistribution4.getPopulationSize();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = hypergeometricDistribution4.sample();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, 35, 0);
        int int4 = hypergeometricDistribution3.getSupportLowerBound();
        int int5 = hypergeometricDistribution3.getSupportUpperBound();
        int int6 = hypergeometricDistribution3.getPopulationSize();
        int int7 = hypergeometricDistribution3.getPopulationSize();
        java.lang.Class<?> wildcardClass8 = hypergeometricDistribution3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
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
        int int19 = hypergeometricDistribution4.getSupportUpperBound();
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
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(10, 4, (int) (short) 1);
        int int4 = hypergeometricDistribution3.getPopulationSize();
        java.lang.Class<?> wildcardClass5 = hypergeometricDistribution3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
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
        double double24 = hypergeometricDistribution4.probability((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray26 = hypergeometricDistribution4.sample(0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: number of samples (0)");
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        int int6 = hypergeometricDistribution4.getSupportLowerBound();
        double double7 = hypergeometricDistribution4.getNumericalMean();
        double double8 = hypergeometricDistribution4.calculateNumericalVariance();
        // The following exception was thrown during execution in test generation
        try {
            double double11 = hypergeometricDistribution4.cumulativeProbability((int) (short) 10, 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (10) must be less than or equal to upper endpoint (1)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.35d + "'", double7 == 0.35d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.2275d + "'", double8 == 0.2275d);
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        int int11 = hypergeometricDistribution4.getSupportUpperBound();
        int int12 = hypergeometricDistribution4.getPopulationSize();
        double double14 = hypergeometricDistribution4.upperCumulativeProbability((-1));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, (int) (byte) 100, (int) (byte) 100);
        int int4 = hypergeometricDistribution3.getSampleSize();
        int int5 = hypergeometricDistribution3.getSampleSize();
        int int6 = hypergeometricDistribution3.getSampleSize();
        hypergeometricDistribution3.reseedRandomGenerator((long) (short) 10);
        double double10 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(1, 97, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: number of successes (97) must be less than or equal to population size (1)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, 35, 0);
        int int4 = hypergeometricDistribution3.getPopulationSize();
        double double5 = hypergeometricDistribution3.getNumericalMean();
        double double6 = hypergeometricDistribution3.getNumericalVariance();
        double double7 = hypergeometricDistribution3.getNumericalMean();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        double double7 = hypergeometricDistribution4.upperCumulativeProbability((int) (short) -1);
        double double8 = hypergeometricDistribution4.getNumericalMean();
        int int9 = hypergeometricDistribution4.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.35d + "'", double8 == 0.35d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        int int7 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int8 = hypergeometricDistribution4.getNumberOfSuccesses();
        boolean boolean9 = hypergeometricDistribution4.isSupportConnected();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray11 = hypergeometricDistribution4.sample((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: number of samples (-1)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(100, (int) (short) 100, (int) (short) 10);
        double double4 = hypergeometricDistribution3.getNumericalMean();
        int int6 = hypergeometricDistribution3.inverseCumulativeProbability(1.0605205901255682E-5d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        int int7 = hypergeometricDistribution4.getNumberOfSuccesses();
        boolean boolean8 = hypergeometricDistribution4.isSupportConnected();
        int int9 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int10 = hypergeometricDistribution4.getSupportLowerBound();
        java.lang.Class<?> wildcardClass11 = hypergeometricDistribution4.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
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
        int int23 = hypergeometricDistribution4.inverseCumulativeProbability((double) 1);
        double double26 = hypergeometricDistribution4.cumulativeProbability(0, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray28 = hypergeometricDistribution4.sample(1);
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.34999999999999964d + "'", double26 == 0.34999999999999964d);
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getPopulationSize();
        double double7 = hypergeometricDistribution4.getNumericalMean();
        double double10 = hypergeometricDistribution4.cumulativeProbability((int) (byte) -1, 1);
        double double12 = hypergeometricDistribution4.probability(35);
        int int14 = hypergeometricDistribution4.inverseCumulativeProbability(0.34999999999999964d);
        double double15 = hypergeometricDistribution4.getNumericalVariance();
        int int16 = hypergeometricDistribution4.getPopulationSize();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.35d + "'", double7 == 0.35d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.2275d + "'", double15 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double7 = hypergeometricDistribution4.calculateNumericalVariance();
        int int8 = hypergeometricDistribution4.getSupportUpperBound();
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 10);
        int int11 = hypergeometricDistribution4.getSampleSize();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution4.isSupportConnected();
        double double7 = hypergeometricDistribution4.getNumericalVariance();
        double double10 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1, (int) 'a');
        double double12 = hypergeometricDistribution4.upperCumulativeProbability((-1));
        double double13 = hypergeometricDistribution4.getNumericalVariance();
        double double15 = hypergeometricDistribution4.upperCumulativeProbability(10);
        double double16 = hypergeometricDistribution4.getNumericalVariance();
        // The following exception was thrown during execution in test generation
        try {
            int int18 = hypergeometricDistribution4.inverseCumulativeProbability((double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: 10 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2275d + "'", double13 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.2275d + "'", double16 == 0.2275d);
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double9 = hypergeometricDistribution4.cumulativeProbability(0, (int) 'a');
        boolean boolean10 = hypergeometricDistribution4.isSupportConnected();
        double double12 = hypergeometricDistribution4.upperCumulativeProbability(100);
        int int13 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int14 = hypergeometricDistribution4.getSupportUpperBound();
        boolean boolean15 = hypergeometricDistribution4.isSupportConnected();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.34999999999999964d + "'", double9 == 0.34999999999999964d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (-1), (int) (short) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: population size (-1)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) '4', (int) ' ', 97);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: sample size (97) must be less than or equal to population size (52)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getPopulationSize();
        int int8 = hypergeometricDistribution4.inverseCumulativeProbability((double) (byte) 0);
        double double9 = hypergeometricDistribution4.getNumericalVariance();
        double double11 = hypergeometricDistribution4.cumulativeProbability((int) '#');
        int int12 = hypergeometricDistribution4.getSampleSize();
        double double14 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 100);
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
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.cumulativeProbability(0);
        int int7 = hypergeometricDistribution4.getSupportLowerBound();
        double double8 = hypergeometricDistribution4.calculateNumericalVariance();
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistribution4.reseedRandomGenerator((long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.2275d + "'", double8 == 0.2275d);
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution4.isSupportConnected();
        double double7 = hypergeometricDistribution4.getNumericalVariance();
        double double9 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) -1);
        int int10 = hypergeometricDistribution4.getSupportUpperBound();
        boolean boolean11 = hypergeometricDistribution4.isSupportConnected();
        int int13 = hypergeometricDistribution4.inverseCumulativeProbability(0.2275d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
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
        double double20 = hypergeometricDistribution4.upperCumulativeProbability(100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.2275d + "'", double11 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double9 = hypergeometricDistribution4.cumulativeProbability(0, (int) 'a');
        boolean boolean10 = hypergeometricDistribution4.isSupportConnected();
        double double12 = hypergeometricDistribution4.upperCumulativeProbability(100);
        int int13 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int14 = hypergeometricDistribution4.getSupportLowerBound();
        // The following exception was thrown during execution in test generation
        try {
            double double17 = hypergeometricDistribution4.cumulativeProbability((int) '4', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (52) must be less than or equal to upper endpoint (1)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.34999999999999964d + "'", double9 == 0.34999999999999964d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
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
        boolean boolean20 = hypergeometricDistribution4.isSupportConnected();
        int int21 = hypergeometricDistribution4.getPopulationSize();
        double double23 = hypergeometricDistribution4.probability(32);
        double double25 = hypergeometricDistribution4.upperCumulativeProbability(1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.3500000000000001d + "'", double25 == 0.3500000000000001d);
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double7 = hypergeometricDistribution4.calculateNumericalVariance();
        int int9 = hypergeometricDistribution4.inverseCumulativeProbability((double) 0);
        double double10 = hypergeometricDistribution4.getNumericalMean();
        int int11 = hypergeometricDistribution4.getNumberOfSuccesses();
        java.lang.Class<?> wildcardClass12 = hypergeometricDistribution4.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.35d + "'", double10 == 0.35d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        int int7 = hypergeometricDistribution4.getNumberOfSuccesses();
        boolean boolean8 = hypergeometricDistribution4.isSupportConnected();
        double double10 = hypergeometricDistribution4.probability(35);
        double double11 = hypergeometricDistribution4.getNumericalVariance();
        int int12 = hypergeometricDistribution4.getSupportUpperBound();
        double double13 = hypergeometricDistribution4.getNumericalVariance();
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistribution4.reseedRandomGenerator((long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.2275d + "'", double11 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2275d + "'", double13 == 0.2275d);
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) ' ', 52, (int) '4');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: number of successes (52) must be less than or equal to population size (32)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        double double7 = hypergeometricDistribution4.upperCumulativeProbability(1);
        double double8 = hypergeometricDistribution4.getNumericalMean();
        double double9 = hypergeometricDistribution4.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.3500000000000001d + "'", double7 == 0.3500000000000001d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.35d + "'", double8 == 0.35d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.2275d + "'", double9 == 0.2275d);
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getPopulationSize();
        double double7 = hypergeometricDistribution4.getNumericalMean();
        int int8 = hypergeometricDistribution4.getPopulationSize();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.35d + "'", double7 == 0.35d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        double double7 = hypergeometricDistribution4.probability((int) (byte) 0);
        boolean boolean8 = hypergeometricDistribution4.isSupportConnected();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray10 = hypergeometricDistribution4.sample(24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.6500000000000004d + "'", double7 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 10, (int) (short) 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: sample size (32) must be less than or equal to population size (10)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, (int) (byte) 100, (int) (byte) 100);
        int int4 = hypergeometricDistribution3.getSampleSize();
        int int5 = hypergeometricDistribution3.getSampleSize();
        int int6 = hypergeometricDistribution3.getSampleSize();
        double double8 = hypergeometricDistribution3.upperCumulativeProbability((int) (byte) -1);
        double double9 = hypergeometricDistribution3.calculateNumericalVariance();
        double double11 = hypergeometricDistribution3.upperCumulativeProbability((int) (byte) 100);
        double double14 = hypergeometricDistribution3.cumulativeProbability((int) (short) -1, 32);
        double double17 = hypergeometricDistribution3.cumulativeProbability(1, (int) 'a');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        double double12 = hypergeometricDistribution4.cumulativeProbability((int) ' ');
        int int14 = hypergeometricDistribution4.inverseCumulativeProbability((double) 1L);
        double double16 = hypergeometricDistribution4.cumulativeProbability((int) (short) -1);
        double double18 = hypergeometricDistribution4.upperCumulativeProbability((int) (short) 10);
        int int19 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double21 = hypergeometricDistribution4.probability((int) (short) 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(32, (int) (short) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: number of successes (-1)");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
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
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistribution4.reseedRandomGenerator(1L);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
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
        int int25 = hypergeometricDistribution4.inverseCumulativeProbability((double) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = hypergeometricDistribution4.sample();
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
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.cumulativeProbability(0);
        double double7 = hypergeometricDistribution4.calculateNumericalVariance();
        double double8 = hypergeometricDistribution4.getNumericalMean();
        double double9 = hypergeometricDistribution4.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.35d + "'", double8 == 0.35d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.2275d + "'", double9 == 0.2275d);
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(10, (int) (short) 10, (int) (short) 10);
        double double5 = hypergeometricDistribution3.upperCumulativeProbability((int) (byte) 1);
        int int6 = hypergeometricDistribution3.getPopulationSize();
        int int7 = hypergeometricDistribution3.sample();
        double double9 = hypergeometricDistribution3.cumulativeProbability(100);
        java.lang.Class<?> wildcardClass10 = hypergeometricDistribution3.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 24, 97, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: number of successes (97) must be less than or equal to population size (24)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getPopulationSize();
        double double7 = hypergeometricDistribution4.getNumericalMean();
        double double10 = hypergeometricDistribution4.cumulativeProbability((int) (byte) -1, 1);
        int int11 = hypergeometricDistribution4.getPopulationSize();
        int int12 = hypergeometricDistribution4.getPopulationSize();
        double double14 = hypergeometricDistribution4.probability((int) (short) 10);
        double double16 = hypergeometricDistribution4.probability((int) (byte) 100);
        int int17 = hypergeometricDistribution4.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.35d + "'", double7 == 0.35d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        double double7 = hypergeometricDistribution4.upperCumulativeProbability((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = hypergeometricDistribution4.inverseCumulativeProbability((double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: 10 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
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
        hypergeometricDistribution3.reseedRandomGenerator((long) (short) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double7 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 0, (int) (short) 0);
        double double8 = hypergeometricDistribution4.calculateNumericalVariance();
        double double9 = hypergeometricDistribution4.getNumericalMean();
        int int10 = hypergeometricDistribution4.getSupportUpperBound();
        int int11 = hypergeometricDistribution4.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.2275d + "'", double8 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.35d + "'", double9 == 0.35d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution4.isSupportConnected();
        double double7 = hypergeometricDistribution4.getNumericalVariance();
        double double10 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1, (int) 'a');
        double double12 = hypergeometricDistribution4.upperCumulativeProbability((-1));
        double double13 = hypergeometricDistribution4.getNumericalVariance();
        double double15 = hypergeometricDistribution4.upperCumulativeProbability(10);
        double double16 = hypergeometricDistribution4.getNumericalVariance();
        double double17 = hypergeometricDistribution4.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2275d + "'", double13 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.2275d + "'", double16 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.2275d + "'", double17 == 0.2275d);
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double7 = hypergeometricDistribution4.calculateNumericalVariance();
        double double9 = hypergeometricDistribution4.upperCumulativeProbability((-1));
        double double11 = hypergeometricDistribution4.cumulativeProbability((int) (short) 1);
        int int12 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int13 = hypergeometricDistribution4.getSampleSize();
        double double14 = hypergeometricDistribution4.getNumericalMean();
        double double15 = hypergeometricDistribution4.calculateNumericalVariance();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.35d + "'", double14 == 0.35d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.2275d + "'", double15 == 0.2275d);
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        double double12 = hypergeometricDistribution4.cumulativeProbability((int) ' ');
        double double13 = hypergeometricDistribution4.calculateNumericalVariance();
        int int14 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double16 = hypergeometricDistribution4.probability((int) '4');
        double double17 = hypergeometricDistribution4.getNumericalMean();
        int int18 = hypergeometricDistribution4.getSampleSize();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2275d + "'", double13 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.35d + "'", double17 == 0.35d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double7 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 0, (int) (short) 0);
        double double8 = hypergeometricDistribution4.calculateNumericalVariance();
        double double9 = hypergeometricDistribution4.getNumericalMean();
        int int10 = hypergeometricDistribution4.getSupportUpperBound();
        double double12 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.2275d + "'", double8 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.35d + "'", double9 == 0.35d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        int int11 = hypergeometricDistribution4.getSupportUpperBound();
        int int12 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double14 = hypergeometricDistribution4.probability((int) (short) 0);
        double double15 = hypergeometricDistribution4.getNumericalVariance();
        int int17 = hypergeometricDistribution4.inverseCumulativeProbability((double) (short) 1);
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.6500000000000004d + "'", double14 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.2275d + "'", double15 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double9 = hypergeometricDistribution4.cumulativeProbability(0, (int) 'a');
        double double11 = hypergeometricDistribution4.cumulativeProbability((-1));
        int int12 = hypergeometricDistribution4.getSupportUpperBound();
        double double14 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 0);
        int int15 = hypergeometricDistribution4.getSupportLowerBound();
        int int16 = hypergeometricDistribution4.getSupportLowerBound();
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistribution4.reseedRandomGenerator((long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.34999999999999964d + "'", double9 == 0.34999999999999964d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.6500000000000004d + "'", double14 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        double double7 = hypergeometricDistribution4.upperCumulativeProbability((int) (short) -1);
        boolean boolean8 = hypergeometricDistribution4.isSupportConnected();
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((-1));
        // The following exception was thrown during execution in test generation
        try {
            int int11 = hypergeometricDistribution4.sample();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, (int) ' ', (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = hypergeometricDistribution4.sample();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
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
        // The following exception was thrown during execution in test generation
        try {
            int int15 = hypergeometricDistribution4.sample();
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
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.cumulativeProbability(0);
        double double7 = hypergeometricDistribution4.calculateNumericalVariance();
        int int8 = hypergeometricDistribution4.getPopulationSize();
        double double10 = hypergeometricDistribution4.probability((int) (byte) -1);
        int int11 = hypergeometricDistribution4.getSupportUpperBound();
        double double12 = hypergeometricDistribution4.calculateNumericalVariance();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.2275d + "'", double12 == 0.2275d);
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) -1, 100, 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: population size (-1)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
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
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.35d + "'", double8 == 0.35d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2275d + "'", double13 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution4.isSupportConnected();
        double double7 = hypergeometricDistribution4.getNumericalVariance();
        double double10 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1, (int) 'a');
        int int11 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double12 = hypergeometricDistribution4.getNumericalVariance();
        int int13 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int14 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double17 = hypergeometricDistribution4.cumulativeProbability(4, 24);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.2275d + "'", double12 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }
}

