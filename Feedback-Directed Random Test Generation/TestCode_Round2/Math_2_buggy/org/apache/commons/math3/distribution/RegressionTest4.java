package org.apache.commons.math3.distribution;

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
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        double double12 = hypergeometricDistribution4.probability((-1));
        int int13 = hypergeometricDistribution4.getSampleSize();
        double double15 = hypergeometricDistribution4.cumulativeProbability(97);
        double double17 = hypergeometricDistribution4.upperCumulativeProbability(97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        int int6 = hypergeometricDistribution4.getSupportLowerBound();
        double double8 = hypergeometricDistribution4.probability(1);
        double double10 = hypergeometricDistribution4.cumulativeProbability((int) (short) 100);
        boolean boolean11 = hypergeometricDistribution4.isSupportConnected();
        double double13 = hypergeometricDistribution4.cumulativeProbability((int) 'a');
        double double14 = hypergeometricDistribution4.calculateNumericalVariance();
        double double16 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = hypergeometricDistribution4.sample();
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
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.2275d + "'", double14 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        double double6 = hypergeometricDistribution4.getNumericalMean();
        double double7 = hypergeometricDistribution4.getNumericalMean();
        int int8 = hypergeometricDistribution4.getSupportUpperBound();
        int int9 = hypergeometricDistribution4.getPopulationSize();
        double double11 = hypergeometricDistribution4.probability((int) (short) 10);
        boolean boolean12 = hypergeometricDistribution4.isSupportConnected();
        double double15 = hypergeometricDistribution4.cumulativeProbability(0, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.35d + "'", double6 == 0.35d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.35d + "'", double7 == 0.35d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.34999999999999964d + "'", double15 == 0.34999999999999964d);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        int int6 = hypergeometricDistribution4.getSupportLowerBound();
        boolean boolean7 = hypergeometricDistribution4.isSupportConnected();
        int int8 = hypergeometricDistribution4.getSupportLowerBound();
        double double10 = hypergeometricDistribution4.probability((int) (byte) 0);
        boolean boolean11 = hypergeometricDistribution4.isSupportConnected();
        double double13 = hypergeometricDistribution4.probability((int) (byte) 1);
        int int14 = hypergeometricDistribution4.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.6500000000000004d + "'", double10 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.3500000000000001d + "'", double13 == 0.3500000000000001d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double7 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 0, (int) (short) 0);
        double double8 = hypergeometricDistribution4.calculateNumericalVariance();
        double double9 = hypergeometricDistribution4.getNumericalMean();
        int int10 = hypergeometricDistribution4.getSupportUpperBound();
        double double12 = hypergeometricDistribution4.upperCumulativeProbability(52);
        int int13 = hypergeometricDistribution4.getNumberOfSuccesses();
        // The following exception was thrown during execution in test generation
        try {
            int int15 = hypergeometricDistribution4.inverseCumulativeProbability((double) 32);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: 32 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.2275d + "'", double8 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.35d + "'", double9 == 0.35d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        int int6 = hypergeometricDistribution4.getSupportLowerBound();
        double double7 = hypergeometricDistribution4.getNumericalMean();
        int int8 = hypergeometricDistribution4.getPopulationSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.35d + "'", double7 == 0.35d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getPopulationSize();
        double double7 = hypergeometricDistribution4.getNumericalMean();
        double double10 = hypergeometricDistribution4.cumulativeProbability((int) (byte) -1, 1);
        double double12 = hypergeometricDistribution4.probability(35);
        int int14 = hypergeometricDistribution4.inverseCumulativeProbability(0.34999999999999964d);
        double double15 = hypergeometricDistribution4.getNumericalMean();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.35d + "'", double7 == 0.35d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.35d + "'", double15 == 0.35d);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, 35, 0);
        double double6 = hypergeometricDistribution3.cumulativeProbability((-1), (int) (short) -1);
        double double8 = hypergeometricDistribution3.probability(1);
        int int9 = hypergeometricDistribution3.getSupportUpperBound();
        int[] intArray11 = hypergeometricDistribution3.sample(100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(intArray11);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '4', (int) (short) 1, 32);
        int int4 = hypergeometricDistribution3.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution4.isSupportConnected();
        double double7 = hypergeometricDistribution4.getNumericalVariance();
        double double8 = hypergeometricDistribution4.getNumericalMean();
        double double9 = hypergeometricDistribution4.getNumericalMean();
        double double10 = hypergeometricDistribution4.getNumericalVariance();
        double double11 = hypergeometricDistribution4.getNumericalMean();
        double double12 = hypergeometricDistribution4.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.35d + "'", double8 == 0.35d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.35d + "'", double9 == 0.35d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.2275d + "'", double10 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.35d + "'", double11 == 0.35d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.35d + "'", double12 == 0.35d);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        double double7 = hypergeometricDistribution4.upperCumulativeProbability((int) (short) -1);
        boolean boolean8 = hypergeometricDistribution4.isSupportConnected();
        double double11 = hypergeometricDistribution4.cumulativeProbability((int) (byte) -1, (int) (short) 10);
        double double13 = hypergeometricDistribution4.upperCumulativeProbability((int) ' ');
        boolean boolean14 = hypergeometricDistribution4.isSupportConnected();
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistribution4.reseedRandomGenerator((long) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, 35, 0);
        int int4 = hypergeometricDistribution3.getPopulationSize();
        double double5 = hypergeometricDistribution3.calculateNumericalVariance();
        int[] intArray7 = hypergeometricDistribution3.sample(100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(intArray7);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(100, (int) (short) 100, (int) (short) 10);
        double double4 = hypergeometricDistribution3.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
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
        int int14 = hypergeometricDistribution4.getPopulationSize();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.6500000000000004d + "'", double11 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2275d + "'", double13 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution4.isSupportConnected();
        double double7 = hypergeometricDistribution4.getNumericalVariance();
        double double10 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1, (int) 'a');
        int int11 = hypergeometricDistribution4.getNumberOfSuccesses();
        boolean boolean12 = hypergeometricDistribution4.isSupportConnected();
        double double13 = hypergeometricDistribution4.getNumericalMean();
        double double15 = hypergeometricDistribution4.cumulativeProbability((int) ' ');
        int int16 = hypergeometricDistribution4.getPopulationSize();
        java.lang.Class<?> wildcardClass17 = hypergeometricDistribution4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.35d + "'", double13 == 0.35d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double7 = hypergeometricDistribution4.getNumericalMean();
        double double8 = hypergeometricDistribution4.getNumericalMean();
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistribution4.reseedRandomGenerator((long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.35d + "'", double7 == 0.35d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.35d + "'", double8 == 0.35d);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(1, (int) '#', (-1));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: number of samples (-1)");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        double double12 = hypergeometricDistribution4.cumulativeProbability((int) ' ');
        double double13 = hypergeometricDistribution4.calculateNumericalVariance();
        double double16 = hypergeometricDistribution4.cumulativeProbability((int) (short) 100, 100);
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistribution4.reseedRandomGenerator((long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2275d + "'", double13 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
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
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray27 = hypergeometricDistribution4.sample(7);
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.3500000000000001d + "'", double25 == 0.3500000000000001d);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, 35, 0);
        int int4 = hypergeometricDistribution3.getSupportLowerBound();
        int int5 = hypergeometricDistribution3.getSupportUpperBound();
        int int6 = hypergeometricDistribution3.getPopulationSize();
        double double7 = hypergeometricDistribution3.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        int int6 = hypergeometricDistribution4.getSupportLowerBound();
        double double8 = hypergeometricDistribution4.probability(1);
        int int9 = hypergeometricDistribution4.getPopulationSize();
        int int10 = hypergeometricDistribution4.getSupportUpperBound();
        double double12 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        double double13 = hypergeometricDistribution4.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.3500000000000001d + "'", double8 == 0.3500000000000001d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2275d + "'", double13 == 0.2275d);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(100, (int) (byte) 0, (int) (short) 10);
        boolean boolean4 = hypergeometricDistribution3.isSupportConnected();
        int int5 = hypergeometricDistribution3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution4.isSupportConnected();
        double double7 = hypergeometricDistribution4.getNumericalVariance();
        int int8 = hypergeometricDistribution4.getSupportUpperBound();
        double double10 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double11 = hypergeometricDistribution4.calculateNumericalVariance();
        double double13 = hypergeometricDistribution4.upperCumulativeProbability((-1));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.6500000000000004d + "'", double10 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.2275d + "'", double11 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double7 = hypergeometricDistribution4.getNumericalMean();
        double double8 = hypergeometricDistribution4.getNumericalMean();
        int int9 = hypergeometricDistribution4.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.35d + "'", double7 == 0.35d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.35d + "'", double8 == 0.35d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(52, (int) (short) 10, 0);
        int int4 = hypergeometricDistribution3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (short) 0, 4, 20);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: population size (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getPopulationSize();
        boolean boolean7 = hypergeometricDistribution4.isSupportConnected();
        double double10 = hypergeometricDistribution4.cumulativeProbability(1, (int) '#');
        int int11 = hypergeometricDistribution4.getSupportLowerBound();
        double double13 = hypergeometricDistribution4.cumulativeProbability((int) (short) 10);
        double double14 = hypergeometricDistribution4.getNumericalVariance();
        double double15 = hypergeometricDistribution4.getNumericalVariance();
        int int16 = hypergeometricDistribution4.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.2275d + "'", double14 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.2275d + "'", double15 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution4.isSupportConnected();
        double double7 = hypergeometricDistribution4.getNumericalVariance();
        double double10 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1, (int) 'a');
        int int11 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double12 = hypergeometricDistribution4.getNumericalVariance();
        int int13 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double16 = hypergeometricDistribution4.cumulativeProbability(0, (int) (byte) 1);
        int int17 = hypergeometricDistribution4.getSampleSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.2275d + "'", double12 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.34999999999999964d + "'", double16 == 0.34999999999999964d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(52, (int) (short) 10, 0);
        double double5 = hypergeometricDistribution3.probability(1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double7 = hypergeometricDistribution4.calculateNumericalVariance();
        int int9 = hypergeometricDistribution4.inverseCumulativeProbability((double) 0);
        double double12 = hypergeometricDistribution4.cumulativeProbability((int) '#', (int) '#');
        int int13 = hypergeometricDistribution4.getSampleSize();
        double double15 = hypergeometricDistribution4.upperCumulativeProbability((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int17 = hypergeometricDistribution4.inverseCumulativeProbability(5.000404040404041d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: 5 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        double double12 = hypergeometricDistribution4.cumulativeProbability((int) ' ');
        double double13 = hypergeometricDistribution4.calculateNumericalVariance();
        int int14 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double15 = hypergeometricDistribution4.calculateNumericalVariance();
        int int16 = hypergeometricDistribution4.getSupportUpperBound();
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistribution4.reseedRandomGenerator((long) 20);
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
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.2275d + "'", double15 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.probability((int) ' ');
        double double12 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistribution4.reseedRandomGenerator((long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.3500000000000001d + "'", double12 == 0.3500000000000001d);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, 35, 0);
        int int4 = hypergeometricDistribution3.getPopulationSize();
        double double5 = hypergeometricDistribution3.getNumericalMean();
        int int6 = hypergeometricDistribution3.getSampleSize();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistribution4.reseedRandomGenerator((-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 10, (int) (byte) 1, 97);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: sample size (97) must be less than or equal to population size (10)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
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
        double double29 = hypergeometricDistribution4.getNumericalVariance();
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
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.2275d + "'", double29 == 0.2275d);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        double double12 = hypergeometricDistribution4.cumulativeProbability((int) ' ');
        double double13 = hypergeometricDistribution4.calculateNumericalVariance();
        int int14 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double15 = hypergeometricDistribution4.calculateNumericalVariance();
        int int16 = hypergeometricDistribution4.getSupportUpperBound();
        int int17 = hypergeometricDistribution4.getPopulationSize();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2275d + "'", double13 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.2275d + "'", double15 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution4.isSupportConnected();
        double double7 = hypergeometricDistribution4.getNumericalVariance();
        double double9 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 10);
        int int10 = hypergeometricDistribution4.getSampleSize();
        double double12 = hypergeometricDistribution4.upperCumulativeProbability(0);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = hypergeometricDistribution4.sample();
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
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
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
        boolean boolean14 = hypergeometricDistribution4.isSupportConnected();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.2275d + "'", double9 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.35d + "'", double13 == 0.35d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (byte) 10, (int) (short) 0, 97);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: sample size (97) must be less than or equal to population size (10)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double7 = hypergeometricDistribution4.calculateNumericalVariance();
        int int9 = hypergeometricDistribution4.inverseCumulativeProbability((double) 0);
        double double10 = hypergeometricDistribution4.getNumericalMean();
        int int11 = hypergeometricDistribution4.getSupportLowerBound();
        int int12 = hypergeometricDistribution4.getPopulationSize();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.35d + "'", double10 == 0.35d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (short) -1, (int) (byte) 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: population size (-1)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(1, 1, (int) (short) 1);
        double double4 = hypergeometricDistribution3.calculateNumericalVariance();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
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
        int int14 = hypergeometricDistribution4.getSampleSize();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.35d + "'", double9 == 0.35d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) ' ', (int) ' ', (int) (byte) 1);
        double double5 = hypergeometricDistribution3.probability((int) (short) 100);
        int int6 = hypergeometricDistribution3.getSupportUpperBound();
        double double8 = hypergeometricDistribution3.upperCumulativeProbability(35);
        double double9 = hypergeometricDistribution3.calculateNumericalVariance();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getPopulationSize();
        int int8 = hypergeometricDistribution4.inverseCumulativeProbability((double) (byte) 0);
        double double9 = hypergeometricDistribution4.getNumericalVariance();
        double double11 = hypergeometricDistribution4.upperCumulativeProbability((int) '#');
        double double13 = hypergeometricDistribution4.probability(0);
        boolean boolean14 = hypergeometricDistribution4.isSupportConnected();
        double double15 = hypergeometricDistribution4.getNumericalMean();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = hypergeometricDistribution4.sample((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: number of samples (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.2275d + "'", double9 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.6500000000000004d + "'", double13 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.35d + "'", double15 == 0.35d);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        double double7 = hypergeometricDistribution4.upperCumulativeProbability((int) (short) -1);
        double double8 = hypergeometricDistribution4.getNumericalVariance();
        int int9 = hypergeometricDistribution4.getSupportUpperBound();
        double double10 = hypergeometricDistribution4.getNumericalVariance();
        double double12 = hypergeometricDistribution4.upperCumulativeProbability(0);
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistribution4.reseedRandomGenerator(100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.2275d + "'", double8 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.2275d + "'", double10 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, 35, 0);
        int int4 = hypergeometricDistribution3.getSupportLowerBound();
        double double6 = hypergeometricDistribution3.cumulativeProbability((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 4, (int) (byte) 10, 52);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: number of successes (10) must be less than or equal to population size (4)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double7 = hypergeometricDistribution4.calculateNumericalVariance();
        int int8 = hypergeometricDistribution4.getSampleSize();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = hypergeometricDistribution4.sample();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        boolean boolean5 = hypergeometricDistribution4.isSupportConnected();
        int int6 = hypergeometricDistribution4.getSampleSize();
        int int7 = hypergeometricDistribution4.getSupportLowerBound();
        boolean boolean8 = hypergeometricDistribution4.isSupportConnected();
        int int9 = hypergeometricDistribution4.getSampleSize();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getPopulationSize();
        int int8 = hypergeometricDistribution4.inverseCumulativeProbability((double) (byte) 0);
        boolean boolean9 = hypergeometricDistribution4.isSupportConnected();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray11 = hypergeometricDistribution4.sample((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
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
        // The following exception was thrown during execution in test generation
        try {
            int int14 = hypergeometricDistribution4.sample();
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
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double7 = hypergeometricDistribution4.calculateNumericalVariance();
        int int9 = hypergeometricDistribution4.inverseCumulativeProbability((double) 0);
        double double11 = hypergeometricDistribution4.cumulativeProbability((int) (short) 1);
        int int12 = hypergeometricDistribution4.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
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
        double double19 = hypergeometricDistribution4.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.2275d + "'", double19 == 0.2275d);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(100, (int) (byte) 0, (int) (short) 10);
        double double4 = hypergeometricDistribution3.getNumericalVariance();
        boolean boolean5 = hypergeometricDistribution3.isSupportConnected();
        int int7 = hypergeometricDistribution3.inverseCumulativeProbability(0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(10, (int) (short) 10, (int) (short) 10);
        double double5 = hypergeometricDistribution3.upperCumulativeProbability((int) (byte) 1);
        int int6 = hypergeometricDistribution3.getPopulationSize();
        boolean boolean7 = hypergeometricDistribution3.isSupportConnected();
        int[] intArray9 = hypergeometricDistribution3.sample((int) (short) 10);
        double double10 = hypergeometricDistribution3.getNumericalVariance();
        double double11 = hypergeometricDistribution3.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 });
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        boolean boolean5 = hypergeometricDistribution4.isSupportConnected();
        int int6 = hypergeometricDistribution4.getSampleSize();
        int int7 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double9 = hypergeometricDistribution4.probability((int) ' ');
        double double11 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
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
        double double18 = hypergeometricDistribution4.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.35d + "'", double18 == 0.35d);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, 35, 0);
        int int4 = hypergeometricDistribution3.getPopulationSize();
        int int5 = hypergeometricDistribution3.getSupportUpperBound();
        int[] intArray7 = hypergeometricDistribution3.sample(100);
        int int9 = hypergeometricDistribution3.inverseCumulativeProbability((double) (byte) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(10, 52, (int) '#');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: number of successes (52) must be less than or equal to population size (10)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double9 = hypergeometricDistribution4.cumulativeProbability(0, (int) 'a');
        double double11 = hypergeometricDistribution4.cumulativeProbability((-1));
        double double13 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistribution4.reseedRandomGenerator(10L);
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
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int7 = hypergeometricDistribution4.getSupportLowerBound();
        double double9 = hypergeometricDistribution4.cumulativeProbability(4);
        double double10 = hypergeometricDistribution4.calculateNumericalVariance();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.2275d + "'", double10 == 0.2275d);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.cumulativeProbability(0);
        int int7 = hypergeometricDistribution4.getSupportLowerBound();
        int int8 = hypergeometricDistribution4.getSupportUpperBound();
        int int9 = hypergeometricDistribution4.getPopulationSize();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray11 = hypergeometricDistribution4.sample((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: number of samples (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        boolean boolean5 = hypergeometricDistribution4.isSupportConnected();
        int int6 = hypergeometricDistribution4.getSampleSize();
        int int7 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double9 = hypergeometricDistribution4.probability((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int10 = hypergeometricDistribution4.sample();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, 35, 0);
        double double4 = hypergeometricDistribution3.getNumericalMean();
        double double6 = hypergeometricDistribution3.upperCumulativeProbability(0);
        double double7 = hypergeometricDistribution3.calculateNumericalVariance();
        int int8 = hypergeometricDistribution3.getSupportUpperBound();
        int int9 = hypergeometricDistribution3.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.cumulativeProbability(0);
        double double7 = hypergeometricDistribution4.calculateNumericalVariance();
        int int9 = hypergeometricDistribution4.inverseCumulativeProbability((double) 1.0f);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double7 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 0, (int) (short) 0);
        double double9 = hypergeometricDistribution4.upperCumulativeProbability(0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
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
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.35d + "'", double22 == 0.35d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 35 + "'", int23 == 35);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double7 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 0, (int) (short) 0);
        double double8 = hypergeometricDistribution4.calculateNumericalVariance();
        double double9 = hypergeometricDistribution4.calculateNumericalVariance();
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistribution4.reseedRandomGenerator((-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.2275d + "'", double8 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.2275d + "'", double9 == 0.2275d);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double9 = hypergeometricDistribution4.cumulativeProbability(0, (int) 'a');
        int int10 = hypergeometricDistribution4.getSampleSize();
        double double12 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 10);
        int int14 = hypergeometricDistribution4.inverseCumulativeProbability((double) 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.34999999999999964d + "'", double9 == 0.34999999999999964d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        double double7 = hypergeometricDistribution4.upperCumulativeProbability((int) (short) -1);
        boolean boolean8 = hypergeometricDistribution4.isSupportConnected();
        int int9 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int10 = hypergeometricDistribution4.getSampleSize();
        boolean boolean11 = hypergeometricDistribution4.isSupportConnected();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray13 = hypergeometricDistribution4.sample(0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: number of samples (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        double double12 = hypergeometricDistribution4.cumulativeProbability((int) ' ');
        int int14 = hypergeometricDistribution4.inverseCumulativeProbability((double) 1L);
        double double16 = hypergeometricDistribution4.cumulativeProbability((int) (short) -1);
        double double17 = hypergeometricDistribution4.getNumericalVariance();
        double double18 = hypergeometricDistribution4.calculateNumericalVariance();
        int int19 = hypergeometricDistribution4.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.2275d + "'", double17 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.2275d + "'", double18 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
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
        double double28 = hypergeometricDistribution4.upperCumulativeProbability((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            double double31 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 100, 4);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (100) must be less than or equal to upper endpoint (4)");
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
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.35d + "'", double21 == 0.35d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.2275d + "'", double22 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(4, 0, (int) (byte) 0);
        double double4 = hypergeometricDistribution3.getNumericalMean();
        int int5 = hypergeometricDistribution3.getSupportUpperBound();
        int int6 = hypergeometricDistribution3.getSupportUpperBound();
        double double8 = hypergeometricDistribution3.probability((int) (byte) -1);
        double double10 = hypergeometricDistribution3.cumulativeProbability(20);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, 35, 0);
        double double4 = hypergeometricDistribution3.getNumericalVariance();
        int[] intArray6 = hypergeometricDistribution3.sample(52);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = hypergeometricDistribution3.cumulativeProbability(35, 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (35) must be less than or equal to upper endpoint (10)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(32, 10, 1);
        boolean boolean4 = hypergeometricDistribution3.isSupportConnected();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(100, (int) (short) 10, 35);
        double double4 = hypergeometricDistribution3.calculateNumericalVariance();
        int int5 = hypergeometricDistribution3.sample();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.0681818181818183d + "'", double4 == 2.0681818181818183d);
// flaky "1) test2078(org.apache.commons.math3.distribution.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        double double6 = hypergeometricDistribution4.getNumericalMean();
        int int7 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int8 = hypergeometricDistribution4.getSupportUpperBound();
        int int9 = hypergeometricDistribution4.getSupportUpperBound();
        double double12 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 10, 35);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.35d + "'", double6 == 0.35d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, 35, 0);
        int int4 = hypergeometricDistribution3.getSupportLowerBound();
        int int5 = hypergeometricDistribution3.getSupportUpperBound();
        int int6 = hypergeometricDistribution3.getSampleSize();
        int[] intArray8 = hypergeometricDistribution3.sample(7);
        double double9 = hypergeometricDistribution3.calculateNumericalVariance();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) ' ', (int) ' ', (int) (byte) 1);
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (short) 0);
        hypergeometricDistribution3.reseedRandomGenerator((long) '#');
        double double9 = hypergeometricDistribution3.upperCumulativeProbability(97);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(1, 0, 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: sample size (100) must be less than or equal to population size (1)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
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
        int int17 = hypergeometricDistribution4.getNumberOfSuccesses();
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
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.6500000000000004d + "'", double14 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution4.isSupportConnected();
        double double7 = hypergeometricDistribution4.getNumericalVariance();
        double double8 = hypergeometricDistribution4.getNumericalMean();
        int int9 = hypergeometricDistribution4.getSampleSize();
        double double10 = hypergeometricDistribution4.getNumericalMean();
        int int11 = hypergeometricDistribution4.getPopulationSize();
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
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.35d + "'", double8 == 0.35d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.35d + "'", double10 == 0.35d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        int int11 = hypergeometricDistribution4.getSupportUpperBound();
        int int13 = hypergeometricDistribution4.inverseCumulativeProbability((double) 1L);
        int int14 = hypergeometricDistribution4.getSampleSize();
        int int15 = hypergeometricDistribution4.getNumberOfSuccesses();
        boolean boolean16 = hypergeometricDistribution4.isSupportConnected();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
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
        // The following exception was thrown during execution in test generation
        try {
            double double30 = hypergeometricDistribution4.cumulativeProbability(32, 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (32) must be less than or equal to upper endpoint (10)");
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
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.3500000000000001d + "'", double22 == 0.3500000000000001d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 35 + "'", int23 == 35);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.6500000000000004d + "'", double26 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 35 + "'", int27 == 35);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        double double12 = hypergeometricDistribution4.cumulativeProbability((int) ' ');
        double double13 = hypergeometricDistribution4.calculateNumericalVariance();
        int int14 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double16 = hypergeometricDistribution4.probability(35);
        int int17 = hypergeometricDistribution4.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2275d + "'", double13 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
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
            hypergeometricDistribution4.reseedRandomGenerator((long) (byte) 10);
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
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution4.isSupportConnected();
        double double7 = hypergeometricDistribution4.getNumericalVariance();
        double double10 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1, (int) 'a');
        int int11 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double13 = hypergeometricDistribution4.upperCumulativeProbability((int) (short) 10);
        double double14 = hypergeometricDistribution4.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.35d + "'", double14 == 0.35d);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '4', (int) (short) 1, (int) '4');
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
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
        // The following exception was thrown during execution in test generation
        try {
            int int17 = hypergeometricDistribution4.sample();
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution4.isSupportConnected();
        double double7 = hypergeometricDistribution4.getNumericalVariance();
        double double9 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 10);
        double double12 = hypergeometricDistribution4.cumulativeProbability(4, 100);
        double double15 = hypergeometricDistribution4.cumulativeProbability(1, (int) (byte) 1);
        int int16 = hypergeometricDistribution4.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int7 = hypergeometricDistribution4.getSupportLowerBound();
        int int8 = hypergeometricDistribution4.getSampleSize();
        double double10 = hypergeometricDistribution4.cumulativeProbability((int) 'a');
        double double12 = hypergeometricDistribution4.cumulativeProbability(1);
        double double14 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 100, 10, (int) '4');
        double double6 = hypergeometricDistribution4.probability((int) (short) 1);
        int int7 = hypergeometricDistribution4.getSampleSize();
        boolean boolean8 = hypergeometricDistribution4.isSupportConnected();
        boolean boolean9 = hypergeometricDistribution4.isSupportConnected();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.005038011914198055d + "'", double6 == 0.005038011914198055d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        int int7 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double9 = hypergeometricDistribution4.cumulativeProbability((int) '#');
        int int10 = hypergeometricDistribution4.getSupportLowerBound();
        double double11 = hypergeometricDistribution4.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.35d + "'", double11 == 0.35d);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        int int6 = hypergeometricDistribution4.getSupportLowerBound();
        double double8 = hypergeometricDistribution4.probability(1);
        int int9 = hypergeometricDistribution4.getPopulationSize();
        int int10 = hypergeometricDistribution4.getSupportUpperBound();
        double double12 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        int int14 = hypergeometricDistribution4.inverseCumulativeProbability((double) (byte) 1);
        double double15 = hypergeometricDistribution4.getNumericalMean();
        int int16 = hypergeometricDistribution4.getSampleSize();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = hypergeometricDistribution4.sample((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.3500000000000001d + "'", double8 == 0.3500000000000001d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.35d + "'", double15 == 0.35d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        double double7 = hypergeometricDistribution4.upperCumulativeProbability((int) (short) -1);
        boolean boolean8 = hypergeometricDistribution4.isSupportConnected();
        double double11 = hypergeometricDistribution4.cumulativeProbability((int) (byte) -1, (int) (short) 10);
        double double13 = hypergeometricDistribution4.upperCumulativeProbability(32);
        int int14 = hypergeometricDistribution4.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int7 = hypergeometricDistribution4.getSupportLowerBound();
        int int8 = hypergeometricDistribution4.getSampleSize();
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (short) 1);
        double double11 = hypergeometricDistribution4.getNumericalVariance();
        double double12 = hypergeometricDistribution4.getNumericalVariance();
        java.lang.Class<?> wildcardClass13 = hypergeometricDistribution4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.3500000000000001d + "'", double10 == 0.3500000000000001d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.2275d + "'", double11 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.2275d + "'", double12 == 0.2275d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        double double11 = hypergeometricDistribution4.getNumericalVariance();
        double double13 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        int int14 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double16 = hypergeometricDistribution4.cumulativeProbability(1);
        double double18 = hypergeometricDistribution4.upperCumulativeProbability(35);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.2275d + "'", double11 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
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
        int int20 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int21 = hypergeometricDistribution4.getSampleSize();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.2275d + "'", double11 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
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
        int int16 = hypergeometricDistribution4.getNumberOfSuccesses();
        // The following exception was thrown during execution in test generation
        try {
            int int18 = hypergeometricDistribution4.inverseCumulativeProbability((double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: 10 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
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
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getPopulationSize();
        boolean boolean7 = hypergeometricDistribution4.isSupportConnected();
        int int8 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int9 = hypergeometricDistribution4.getSampleSize();
        double double11 = hypergeometricDistribution4.cumulativeProbability(0);
        double double13 = hypergeometricDistribution4.probability((int) (short) -1);
        int int14 = hypergeometricDistribution4.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.6500000000000004d + "'", double11 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        int int10 = hypergeometricDistribution4.inverseCumulativeProbability(0.6500000000000004d);
        int int11 = hypergeometricDistribution4.getSupportLowerBound();
        int int12 = hypergeometricDistribution4.getPopulationSize();
        java.lang.Class<?> wildcardClass13 = hypergeometricDistribution4.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) '4', 10, (-1));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: number of samples (-1)");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(0, (int) (short) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: population size (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(4, 0, (int) (byte) 0);
        double double4 = hypergeometricDistribution3.getNumericalMean();
        int int5 = hypergeometricDistribution3.getSupportUpperBound();
        int int6 = hypergeometricDistribution3.getSupportUpperBound();
        double double8 = hypergeometricDistribution3.probability((int) (byte) -1);
        hypergeometricDistribution3.reseedRandomGenerator((long) (byte) 10);
        double double12 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
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
        int int15 = hypergeometricDistribution4.getSupportUpperBound();
        double double16 = hypergeometricDistribution4.calculateNumericalVariance();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2275d + "'", double13 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.2275d + "'", double14 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.2275d + "'", double16 == 0.2275d);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, 35, 0);
        double double6 = hypergeometricDistribution3.cumulativeProbability((-1), (int) (short) -1);
        double double8 = hypergeometricDistribution3.probability(1);
        int int9 = hypergeometricDistribution3.getSupportUpperBound();
        hypergeometricDistribution3.reseedRandomGenerator((long) 1);
        int int12 = hypergeometricDistribution3.getSupportLowerBound();
        double double13 = hypergeometricDistribution3.calculateNumericalVariance();
        hypergeometricDistribution3.reseedRandomGenerator(0L);
        double double17 = hypergeometricDistribution3.cumulativeProbability(7);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 100, 10, (int) '4');
        double double6 = hypergeometricDistribution4.probability((int) (short) 1);
        int int7 = hypergeometricDistribution4.getSampleSize();
        int int8 = hypergeometricDistribution4.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.005038011914198055d + "'", double6 == 0.005038011914198055d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSampleSize();
        int int6 = hypergeometricDistribution4.getSampleSize();
        int int7 = hypergeometricDistribution4.getPopulationSize();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, 35, 0);
        int int4 = hypergeometricDistribution3.getPopulationSize();
        int[] intArray6 = hypergeometricDistribution3.sample((int) (short) 10);
        int int7 = hypergeometricDistribution3.getSampleSize();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution4.isSupportConnected();
        double double7 = hypergeometricDistribution4.getNumericalVariance();
        int int8 = hypergeometricDistribution4.getSupportUpperBound();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray10 = hypergeometricDistribution4.sample((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double7 = hypergeometricDistribution4.calculateNumericalVariance();
        int int8 = hypergeometricDistribution4.getSupportLowerBound();
        double double9 = hypergeometricDistribution4.getNumericalVariance();
        double double10 = hypergeometricDistribution4.getNumericalMean();
        double double12 = hypergeometricDistribution4.upperCumulativeProbability(100);
        boolean boolean13 = hypergeometricDistribution4.isSupportConnected();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.2275d + "'", double9 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.35d + "'", double10 == 0.35d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        double double6 = hypergeometricDistribution4.getNumericalMean();
        boolean boolean7 = hypergeometricDistribution4.isSupportConnected();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.35d + "'", double6 == 0.35d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
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
        int int27 = hypergeometricDistribution4.getSampleSize();
        int int28 = hypergeometricDistribution4.getSupportLowerBound();
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 35 + "'", int27 == 35);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(20, 52, 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: number of successes (52) must be less than or equal to population size (20)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 97, (int) (byte) 1, (int) (byte) 0);
        int int5 = hypergeometricDistribution4.getSupportLowerBound();
        int int6 = hypergeometricDistribution4.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, 35, 0);
        double double4 = hypergeometricDistribution3.getNumericalMean();
        double double6 = hypergeometricDistribution3.upperCumulativeProbability((int) (short) 100);
        double double8 = hypergeometricDistribution3.cumulativeProbability(0);
        int int9 = hypergeometricDistribution3.getSupportLowerBound();
        boolean boolean10 = hypergeometricDistribution3.isSupportConnected();
        hypergeometricDistribution3.reseedRandomGenerator((long) 35);
        int int14 = hypergeometricDistribution3.inverseCumulativeProbability(0.35d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(10, (int) (short) 10, (int) (short) 10);
        int int4 = hypergeometricDistribution3.getSupportUpperBound();
        double double5 = hypergeometricDistribution3.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution4.isSupportConnected();
        double double7 = hypergeometricDistribution4.getNumericalVariance();
        double double10 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1, (int) 'a');
        int int11 = hypergeometricDistribution4.getNumberOfSuccesses();
        boolean boolean12 = hypergeometricDistribution4.isSupportConnected();
        int int13 = hypergeometricDistribution4.getSupportLowerBound();
        int int14 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int15 = hypergeometricDistribution4.getSupportLowerBound();
        int int16 = hypergeometricDistribution4.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution4.isSupportConnected();
        double double7 = hypergeometricDistribution4.getNumericalVariance();
        double double9 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 10);
        int int10 = hypergeometricDistribution4.getSampleSize();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = hypergeometricDistribution4.inverseCumulativeProbability(2.269090909090909d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: 2.269 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double7 = hypergeometricDistribution4.calculateNumericalVariance();
        int int8 = hypergeometricDistribution4.getSampleSize();
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistribution4.reseedRandomGenerator((long) 35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 1, 7, 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: number of successes (7) must be less than or equal to population size (1)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double7 = hypergeometricDistribution4.calculateNumericalVariance();
        double double10 = hypergeometricDistribution4.cumulativeProbability((int) (byte) -1, (int) '#');
        double double12 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double14 = hypergeometricDistribution4.probability((int) 'a');
        double double16 = hypergeometricDistribution4.probability(20);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.6500000000000004d + "'", double12 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution4.isSupportConnected();
        double double7 = hypergeometricDistribution4.getNumericalVariance();
        int int8 = hypergeometricDistribution4.getSupportUpperBound();
        double double10 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double11 = hypergeometricDistribution4.calculateNumericalVariance();
        double double12 = hypergeometricDistribution4.calculateNumericalVariance();
        double double14 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.6500000000000004d + "'", double10 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.2275d + "'", double11 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.2275d + "'", double12 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) ' ', (int) ' ', (int) (byte) 1);
        double double4 = hypergeometricDistribution3.getNumericalMean();
        int int5 = hypergeometricDistribution3.sample();
        double double7 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        double double8 = hypergeometricDistribution3.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
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
        double double17 = hypergeometricDistribution4.upperCumulativeProbability(97);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.2275d + "'", double12 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(20, (-1), (int) ' ');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: number of successes (-1)");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double7 = hypergeometricDistribution4.calculateNumericalVariance();
        double double9 = hypergeometricDistribution4.upperCumulativeProbability((-1));
        double double11 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 10);
        int int12 = hypergeometricDistribution4.getSampleSize();
        boolean boolean13 = hypergeometricDistribution4.isSupportConnected();
        double double14 = hypergeometricDistribution4.getNumericalVariance();
        double double17 = hypergeometricDistribution4.cumulativeProbability(0, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int18 = hypergeometricDistribution4.sample();
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.2275d + "'", double14 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.34999999999999964d + "'", double17 == 0.34999999999999964d);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) ' ', (int) ' ', (int) (byte) 1);
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (short) 0);
        double double6 = hypergeometricDistribution3.getNumericalMean();
        double double7 = hypergeometricDistribution3.calculateNumericalVariance();
        double double9 = hypergeometricDistribution3.cumulativeProbability(35);
        int int10 = hypergeometricDistribution3.sample();
        double double12 = hypergeometricDistribution3.cumulativeProbability(24);
        double double13 = hypergeometricDistribution3.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
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
        int int16 = hypergeometricDistribution4.getSupportUpperBound();
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        int int11 = hypergeometricDistribution4.getSupportUpperBound();
        int int12 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double14 = hypergeometricDistribution4.probability((int) (short) 0);
        double double15 = hypergeometricDistribution4.getNumericalVariance();
        double double16 = hypergeometricDistribution4.calculateNumericalVariance();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.6500000000000004d + "'", double14 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.2275d + "'", double15 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.2275d + "'", double16 == 0.2275d);
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 10, 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: sample size (32) must be less than or equal to population size (10)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        int int11 = hypergeometricDistribution4.getSupportUpperBound();
        int int13 = hypergeometricDistribution4.inverseCumulativeProbability((double) 1L);
        int int14 = hypergeometricDistribution4.getSampleSize();
        int int15 = hypergeometricDistribution4.getSupportUpperBound();
        double double16 = hypergeometricDistribution4.getNumericalVariance();
        int int17 = hypergeometricDistribution4.getPopulationSize();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.2275d + "'", double16 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getPopulationSize();
        int int8 = hypergeometricDistribution4.inverseCumulativeProbability((double) (byte) 0);
        int int10 = hypergeometricDistribution4.inverseCumulativeProbability((double) (short) 0);
        int int12 = hypergeometricDistribution4.inverseCumulativeProbability((double) 1L);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = hypergeometricDistribution4.cumulativeProbability(100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (100) must be less than or equal to upper endpoint (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
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
        double double22 = hypergeometricDistribution4.probability((int) (short) 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.2275d + "'", double11 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.3500000000000001d + "'", double22 == 0.3500000000000001d);
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        double double6 = hypergeometricDistribution4.getNumericalMean();
        double double8 = hypergeometricDistribution4.cumulativeProbability(0);
        int int9 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double10 = hypergeometricDistribution4.calculateNumericalVariance();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.35d + "'", double6 == 0.35d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.6500000000000004d + "'", double8 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.2275d + "'", double10 == 0.2275d);
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
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
        int int20 = hypergeometricDistribution4.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
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
        double double25 = hypergeometricDistribution4.getNumericalVariance();
        double double26 = hypergeometricDistribution4.calculateNumericalVariance();
        int int27 = hypergeometricDistribution4.getSampleSize();
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
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.2275d + "'", double25 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.2275d + "'", double26 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 35 + "'", int27 == 35);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        int int11 = hypergeometricDistribution4.getSupportUpperBound();
        int int12 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double14 = hypergeometricDistribution4.probability(0);
        double double17 = hypergeometricDistribution4.cumulativeProbability((-1), 52);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.6500000000000004d + "'", double14 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution4.isSupportConnected();
        double double7 = hypergeometricDistribution4.getNumericalVariance();
        double double9 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 10);
        double double12 = hypergeometricDistribution4.cumulativeProbability(4, 100);
        double double15 = hypergeometricDistribution4.cumulativeProbability(1, (int) (byte) 1);
        double double17 = hypergeometricDistribution4.upperCumulativeProbability((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray19 = hypergeometricDistribution4.sample(20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
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
        double double19 = hypergeometricDistribution4.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.6500000000000004d + "'", double16 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.35d + "'", double19 == 0.35d);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double9 = hypergeometricDistribution4.cumulativeProbability(0, (int) 'a');
        double double11 = hypergeometricDistribution4.cumulativeProbability((-1));
        int int12 = hypergeometricDistribution4.getSupportUpperBound();
        double double14 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 0);
        int int15 = hypergeometricDistribution4.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.34999999999999964d + "'", double9 == 0.34999999999999964d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.6500000000000004d + "'", double14 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(100, (int) (short) 100, (int) (short) 10);
        double double4 = hypergeometricDistribution3.calculateNumericalVariance();
        int int5 = hypergeometricDistribution3.getPopulationSize();
        int int6 = hypergeometricDistribution3.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        int int11 = hypergeometricDistribution4.getSupportUpperBound();
        int int12 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int13 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double14 = hypergeometricDistribution4.getNumericalVariance();
        double double15 = hypergeometricDistribution4.calculateNumericalVariance();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.2275d + "'", double14 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.2275d + "'", double15 == 0.2275d);
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(100, (int) (byte) 100, 20);
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        int int6 = hypergeometricDistribution4.getSupportLowerBound();
        double double8 = hypergeometricDistribution4.probability(1);
        double double10 = hypergeometricDistribution4.cumulativeProbability((int) (short) 100);
        boolean boolean11 = hypergeometricDistribution4.isSupportConnected();
        double double13 = hypergeometricDistribution4.cumulativeProbability((int) 'a');
        double double14 = hypergeometricDistribution4.calculateNumericalVariance();
        // The following exception was thrown during execution in test generation
        try {
            int int16 = hypergeometricDistribution4.inverseCumulativeProbability((double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: 100 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.3500000000000001d + "'", double8 == 0.3500000000000001d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.2275d + "'", double14 == 0.2275d);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (short) 0, 35, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: population size (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.cumulativeProbability(0);
        double double7 = hypergeometricDistribution4.calculateNumericalVariance();
        int int8 = hypergeometricDistribution4.getPopulationSize();
        double double10 = hypergeometricDistribution4.probability((int) (byte) -1);
        double double12 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 100);
        int int13 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double15 = hypergeometricDistribution4.upperCumulativeProbability((int) 'a');
        double double16 = hypergeometricDistribution4.calculateNumericalVariance();
        double double17 = hypergeometricDistribution4.getNumericalVariance();
        double double19 = hypergeometricDistribution4.probability(10);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.2275d + "'", double16 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.2275d + "'", double17 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, 35, 0);
        double double6 = hypergeometricDistribution3.cumulativeProbability((-1), (int) (short) -1);
        double double8 = hypergeometricDistribution3.probability(1);
        int int9 = hypergeometricDistribution3.getSupportUpperBound();
        int int11 = hypergeometricDistribution3.inverseCumulativeProbability((double) 1);
        int int12 = hypergeometricDistribution3.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) ' ', (int) ' ', (int) (byte) 1);
        double double4 = hypergeometricDistribution3.getNumericalMean();
        boolean boolean5 = hypergeometricDistribution3.isSupportConnected();
        int int6 = hypergeometricDistribution3.getPopulationSize();
        int int7 = hypergeometricDistribution3.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double7 = hypergeometricDistribution4.calculateNumericalVariance();
        int int9 = hypergeometricDistribution4.inverseCumulativeProbability((double) 0);
        double double12 = hypergeometricDistribution4.cumulativeProbability((int) '#', (int) '#');
        int int13 = hypergeometricDistribution4.getSampleSize();
        int int14 = hypergeometricDistribution4.getSupportLowerBound();
        int int15 = hypergeometricDistribution4.getSupportLowerBound();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = hypergeometricDistribution4.sample(35);
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
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getPopulationSize();
        int int8 = hypergeometricDistribution4.inverseCumulativeProbability((double) (byte) 0);
        double double9 = hypergeometricDistribution4.getNumericalVariance();
        double double11 = hypergeometricDistribution4.upperCumulativeProbability((int) '#');
        double double13 = hypergeometricDistribution4.probability(0);
        int int15 = hypergeometricDistribution4.inverseCumulativeProbability(0.0d);
        double double17 = hypergeometricDistribution4.upperCumulativeProbability((int) 'a');
        java.lang.Class<?> wildcardClass18 = hypergeometricDistribution4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.2275d + "'", double9 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.6500000000000004d + "'", double13 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, 35, 0);
        double double4 = hypergeometricDistribution3.getNumericalMean();
        double double6 = hypergeometricDistribution3.upperCumulativeProbability(0);
        double double7 = hypergeometricDistribution3.calculateNumericalVariance();
        double double8 = hypergeometricDistribution3.getNumericalMean();
        int int9 = hypergeometricDistribution3.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, (int) (byte) 100, (int) (byte) 100);
        int int4 = hypergeometricDistribution3.getSampleSize();
        int int5 = hypergeometricDistribution3.getSampleSize();
        int int6 = hypergeometricDistribution3.getSampleSize();
        double double8 = hypergeometricDistribution3.upperCumulativeProbability((int) (byte) -1);
        double double9 = hypergeometricDistribution3.calculateNumericalVariance();
        double double11 = hypergeometricDistribution3.upperCumulativeProbability((int) (byte) 100);
        int int12 = hypergeometricDistribution3.getNumberOfSuccesses();
        double double14 = hypergeometricDistribution3.upperCumulativeProbability((int) (byte) 10);
        double double15 = hypergeometricDistribution3.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 4, (int) (short) 0, 1);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.cumulativeProbability(0);
        double double7 = hypergeometricDistribution4.getNumericalVariance();
        double double8 = hypergeometricDistribution4.calculateNumericalVariance();
        int int9 = hypergeometricDistribution4.getPopulationSize();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.2275d + "'", double8 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, 35, 0);
        double double6 = hypergeometricDistribution3.cumulativeProbability((-1), (int) (short) -1);
        double double8 = hypergeometricDistribution3.probability(1);
        int int9 = hypergeometricDistribution3.getSupportUpperBound();
        double double10 = hypergeometricDistribution3.getNumericalMean();
        boolean boolean11 = hypergeometricDistribution3.isSupportConnected();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
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
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.2275d + "'", double18 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getPopulationSize();
        boolean boolean7 = hypergeometricDistribution4.isSupportConnected();
        int int8 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int9 = hypergeometricDistribution4.getSampleSize();
        double double11 = hypergeometricDistribution4.cumulativeProbability((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution4.isSupportConnected();
        double double7 = hypergeometricDistribution4.getNumericalVariance();
        double double9 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) -1);
        int int10 = hypergeometricDistribution4.getSupportUpperBound();
        double double12 = hypergeometricDistribution4.upperCumulativeProbability((int) '4');
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
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
        java.lang.Class<?> wildcardClass15 = hypergeometricDistribution4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        int int11 = hypergeometricDistribution4.getSupportUpperBound();
        int int12 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double13 = hypergeometricDistribution4.getNumericalMean();
        int int14 = hypergeometricDistribution4.getSampleSize();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = hypergeometricDistribution4.sample((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: number of samples (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.35d + "'", double13 == 0.35d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double7 = hypergeometricDistribution4.getNumericalMean();
        double double8 = hypergeometricDistribution4.calculateNumericalVariance();
        int int9 = hypergeometricDistribution4.getSampleSize();
        double double11 = hypergeometricDistribution4.probability(35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.35d + "'", double7 == 0.35d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.2275d + "'", double8 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getPopulationSize();
        boolean boolean7 = hypergeometricDistribution4.isSupportConnected();
        double double9 = hypergeometricDistribution4.upperCumulativeProbability(0);
        int int10 = hypergeometricDistribution4.getPopulationSize();
        double double12 = hypergeometricDistribution4.upperCumulativeProbability(35);
        int int13 = hypergeometricDistribution4.getSupportUpperBound();
        double double14 = hypergeometricDistribution4.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.2275d + "'", double14 == 0.2275d);
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, (int) (byte) 10, 52);
        double double5 = hypergeometricDistribution4.getNumericalVariance();
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistribution4.reseedRandomGenerator(100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.269090909090909d + "'", double5 == 2.269090909090909d);
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
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
        int int30 = hypergeometricDistribution4.getNumberOfSuccesses();
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(52, 7, 7);
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double7 = hypergeometricDistribution4.calculateNumericalVariance();
        double double9 = hypergeometricDistribution4.upperCumulativeProbability((-1));
        double double11 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 10);
        double double13 = hypergeometricDistribution4.cumulativeProbability((int) '4');
        double double14 = hypergeometricDistribution4.calculateNumericalVariance();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.2275d + "'", double14 == 0.2275d);
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, (int) (byte) 100, (int) (byte) 100);
        int int4 = hypergeometricDistribution3.getSampleSize();
        int int5 = hypergeometricDistribution3.getSampleSize();
        int int6 = hypergeometricDistribution3.getSampleSize();
        int int7 = hypergeometricDistribution3.sample();
        double double9 = hypergeometricDistribution3.probability((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
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
        int int24 = hypergeometricDistribution4.getPopulationSize();
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
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
        double double20 = hypergeometricDistribution4.probability((int) (short) 10);
        double double21 = hypergeometricDistribution4.getNumericalMean();
        int int22 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int23 = hypergeometricDistribution4.getSupportUpperBound();
        int int25 = hypergeometricDistribution4.inverseCumulativeProbability((double) (short) 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.6500000000000004d + "'", double16 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.35d + "'", double21 == 0.35d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution4.isSupportConnected();
        double double7 = hypergeometricDistribution4.getNumericalVariance();
        double double8 = hypergeometricDistribution4.getNumericalMean();
        int int9 = hypergeometricDistribution4.getSampleSize();
        double double11 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray13 = hypergeometricDistribution4.sample(24);
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
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 100, 10, (int) '4');
        double double6 = hypergeometricDistribution4.probability((int) (short) 1);
        int int7 = hypergeometricDistribution4.getSampleSize();
        int int8 = hypergeometricDistribution4.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.005038011914198055d + "'", double6 == 0.005038011914198055d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, 35, 0);
        int int4 = hypergeometricDistribution3.getPopulationSize();
        double double5 = hypergeometricDistribution3.getNumericalMean();
        double double6 = hypergeometricDistribution3.getNumericalVariance();
        boolean boolean7 = hypergeometricDistribution3.isSupportConnected();
        double double8 = hypergeometricDistribution3.getNumericalMean();
        double double10 = hypergeometricDistribution3.probability(1);
        int int12 = hypergeometricDistribution3.inverseCumulativeProbability(0.3500000000000001d);
        double double15 = hypergeometricDistribution3.cumulativeProbability(97, 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, 35, 0);
        double double6 = hypergeometricDistribution3.cumulativeProbability((-1), (int) (short) -1);
        double double8 = hypergeometricDistribution3.probability(1);
        int int9 = hypergeometricDistribution3.getSupportUpperBound();
        boolean boolean10 = hypergeometricDistribution3.isSupportConnected();
        double double12 = hypergeometricDistribution3.cumulativeProbability((int) '#');
        double double15 = hypergeometricDistribution3.cumulativeProbability((int) (short) -1, 1);
        int int16 = hypergeometricDistribution3.getSampleSize();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        double double7 = hypergeometricDistribution4.upperCumulativeProbability((int) (short) -1);
        boolean boolean8 = hypergeometricDistribution4.isSupportConnected();
        double double11 = hypergeometricDistribution4.cumulativeProbability((int) (byte) -1, (int) (short) 10);
        int int12 = hypergeometricDistribution4.getSupportLowerBound();
        boolean boolean13 = hypergeometricDistribution4.isSupportConnected();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) ' ', (int) ' ', (int) (byte) 1);
        double double5 = hypergeometricDistribution3.probability((int) (short) 100);
        int int6 = hypergeometricDistribution3.getSupportUpperBound();
        double double7 = hypergeometricDistribution3.calculateNumericalVariance();
        int int8 = hypergeometricDistribution3.getNumberOfSuccesses();
        double double10 = hypergeometricDistribution3.probability(4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getPopulationSize();
        double double7 = hypergeometricDistribution4.getNumericalMean();
        int int8 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int9 = hypergeometricDistribution4.getSampleSize();
        double double10 = hypergeometricDistribution4.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.35d + "'", double7 == 0.35d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.2275d + "'", double10 == 0.2275d);
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) '4', 24, 35);
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) -1, (int) (byte) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: population size (-1)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        double double11 = hypergeometricDistribution4.getNumericalVariance();
        double double13 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double16 = hypergeometricDistribution4.cumulativeProbability(10, (int) 'a');
        int int17 = hypergeometricDistribution4.getSupportLowerBound();
        double double18 = hypergeometricDistribution4.calculateNumericalVariance();
        // The following exception was thrown during execution in test generation
        try {
            double double21 = hypergeometricDistribution4.cumulativeProbability(0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (0) must be less than or equal to upper endpoint (-1)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.2275d + "'", double11 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.2275d + "'", double18 == 0.2275d);
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        double double11 = hypergeometricDistribution4.getNumericalVariance();
        double double13 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        int int14 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double16 = hypergeometricDistribution4.cumulativeProbability(1);
        int int17 = hypergeometricDistribution4.getSampleSize();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.2275d + "'", double11 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) ' ', (int) ' ', (int) (short) 0);
        double double5 = hypergeometricDistribution3.probability(35);
        int[] intArray7 = hypergeometricDistribution3.sample(7);
        java.lang.Class<?> wildcardClass8 = intArray7.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
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
        double double19 = hypergeometricDistribution4.probability((int) (short) 0);
        double double21 = hypergeometricDistribution4.probability((int) (short) -1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.6500000000000004d + "'", double17 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.6500000000000004d + "'", double19 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, 35, 0);
        double double4 = hypergeometricDistribution3.getNumericalMean();
        double double6 = hypergeometricDistribution3.upperCumulativeProbability(0);
        double double7 = hypergeometricDistribution3.calculateNumericalVariance();
        int int8 = hypergeometricDistribution3.getSupportUpperBound();
        int int9 = hypergeometricDistribution3.sample();
        int int10 = hypergeometricDistribution3.getPopulationSize();
        int int11 = hypergeometricDistribution3.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, 35, 0);
        double double6 = hypergeometricDistribution3.cumulativeProbability((-1), (int) (short) -1);
        double double8 = hypergeometricDistribution3.probability(1);
        int int9 = hypergeometricDistribution3.getSupportUpperBound();
        boolean boolean10 = hypergeometricDistribution3.isSupportConnected();
        double double12 = hypergeometricDistribution3.cumulativeProbability((int) '#');
        double double15 = hypergeometricDistribution3.cumulativeProbability((int) (short) -1, 1);
        java.lang.Class<?> wildcardClass16 = hypergeometricDistribution3.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution4.isSupportConnected();
        double double7 = hypergeometricDistribution4.getNumericalVariance();
        double double10 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1, (int) 'a');
        double double12 = hypergeometricDistribution4.upperCumulativeProbability((-1));
        double double13 = hypergeometricDistribution4.getNumericalVariance();
        double double15 = hypergeometricDistribution4.upperCumulativeProbability(10);
        int int16 = hypergeometricDistribution4.getPopulationSize();
        double double17 = hypergeometricDistribution4.calculateNumericalVariance();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2275d + "'", double13 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.2275d + "'", double17 == 0.2275d);
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getPopulationSize();
        double double7 = hypergeometricDistribution4.getNumericalMean();
        double double10 = hypergeometricDistribution4.cumulativeProbability((int) (byte) -1, 1);
        int int11 = hypergeometricDistribution4.getPopulationSize();
        int int12 = hypergeometricDistribution4.getPopulationSize();
        double double13 = hypergeometricDistribution4.getNumericalVariance();
        int int14 = hypergeometricDistribution4.getSampleSize();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.35d + "'", double7 == 0.35d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2275d + "'", double13 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
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
        boolean boolean20 = hypergeometricDistribution4.isSupportConnected();
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistribution4.reseedRandomGenerator((long) 97);
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
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
        int int21 = hypergeometricDistribution4.getSampleSize();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
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
        double double20 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.6500000000000004d + "'", double14 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.2275d + "'", double15 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.6500000000000004d + "'", double17 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.2275d + "'", double18 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
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
            int[] intArray15 = hypergeometricDistribution4.sample((int) (short) 1);
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
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, 35, 0);
        int int4 = hypergeometricDistribution3.getSupportLowerBound();
        double double7 = hypergeometricDistribution3.cumulativeProbability((int) (short) 10, 52);
        int int8 = hypergeometricDistribution3.getNumberOfSuccesses();
        int int10 = hypergeometricDistribution3.inverseCumulativeProbability((double) (byte) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution4.isSupportConnected();
        double double7 = hypergeometricDistribution4.getNumericalVariance();
        int int8 = hypergeometricDistribution4.getSupportUpperBound();
        int int9 = hypergeometricDistribution4.getSupportLowerBound();
        int int10 = hypergeometricDistribution4.getPopulationSize();
        double double11 = hypergeometricDistribution4.getNumericalVariance();
        int int13 = hypergeometricDistribution4.inverseCumulativeProbability((double) 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.2275d + "'", double11 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
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
        int int15 = hypergeometricDistribution4.inverseCumulativeProbability(0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.35d + "'", double8 == 0.35d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.35d + "'", double9 == 0.35d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.2275d + "'", double10 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(4, 0, (int) (byte) 0);
        int int4 = hypergeometricDistribution3.getPopulationSize();
        java.lang.Class<?> wildcardClass5 = hypergeometricDistribution3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
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
        double double24 = hypergeometricDistribution4.calculateNumericalVariance();
        java.lang.Class<?> wildcardClass25 = hypergeometricDistribution4.getClass();
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
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.2275d + "'", double24 == 0.2275d);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        double double12 = hypergeometricDistribution4.upperCumulativeProbability(1);
        int int13 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int14 = hypergeometricDistribution4.getPopulationSize();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.3500000000000001d + "'", double12 == 0.3500000000000001d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
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
            hypergeometricDistribution4.reseedRandomGenerator((long) 24);
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
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        int int6 = hypergeometricDistribution4.getSupportLowerBound();
        double double7 = hypergeometricDistribution4.getNumericalMean();
        double double8 = hypergeometricDistribution4.getNumericalMean();
        int int9 = hypergeometricDistribution4.getSampleSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.35d + "'", double7 == 0.35d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.35d + "'", double8 == 0.35d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((-1), (-1), 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: population size (-1)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
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
        java.lang.Class<?> wildcardClass17 = hypergeometricDistribution4.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.2275d + "'", double14 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
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
        int int19 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int20 = hypergeometricDistribution4.getPopulationSize();
        java.lang.Class<?> wildcardClass21 = hypergeometricDistribution4.getClass();
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
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
        double double18 = hypergeometricDistribution4.cumulativeProbability((int) (short) -1, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = hypergeometricDistribution4.sample(20);
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
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 0, (int) 'a', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: population size (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution4.isSupportConnected();
        double double7 = hypergeometricDistribution4.getNumericalVariance();
        double double8 = hypergeometricDistribution4.getNumericalMean();
        double double10 = hypergeometricDistribution4.upperCumulativeProbability(100);
        double double12 = hypergeometricDistribution4.upperCumulativeProbability(0);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (100) must be less than or equal to upper endpoint (97)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.35d + "'", double8 == 0.35d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, (int) (byte) -1, 32);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: number of successes (-1)");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
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
        boolean boolean16 = hypergeometricDistribution4.isSupportConnected();
        java.lang.Class<?> wildcardClass17 = hypergeometricDistribution4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.3500000000000001d + "'", double10 == 0.3500000000000001d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.2275d + "'", double11 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.2275d + "'", double12 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.34999999999999964d + "'", double15 == 0.34999999999999964d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (short) 100, (int) '#', 1);
        int int4 = hypergeometricDistribution3.getNumberOfSuccesses();
        int int5 = hypergeometricDistribution3.getSampleSize();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', 1, (int) '#');
        int int4 = hypergeometricDistribution3.getPopulationSize();
        double double6 = hypergeometricDistribution3.cumulativeProbability(20);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 0, (int) (byte) 1, 4);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: population size (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int7 = hypergeometricDistribution4.getSupportLowerBound();
        int int8 = hypergeometricDistribution4.getSampleSize();
        double double10 = hypergeometricDistribution4.cumulativeProbability((int) 'a');
        int int11 = hypergeometricDistribution4.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        int int7 = hypergeometricDistribution4.getNumberOfSuccesses();
        boolean boolean8 = hypergeometricDistribution4.isSupportConnected();
        int int9 = hypergeometricDistribution4.getPopulationSize();
        double double10 = hypergeometricDistribution4.getNumericalVariance();
        double double11 = hypergeometricDistribution4.calculateNumericalVariance();
        double double12 = hypergeometricDistribution4.calculateNumericalVariance();
        int int13 = hypergeometricDistribution4.getSupportLowerBound();
        int int14 = hypergeometricDistribution4.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.2275d + "'", double10 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.2275d + "'", double11 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.2275d + "'", double12 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getPopulationSize();
        boolean boolean7 = hypergeometricDistribution4.isSupportConnected();
        double double9 = hypergeometricDistribution4.probability((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int11 = hypergeometricDistribution4.inverseCumulativeProbability((double) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: 100 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        double double6 = hypergeometricDistribution4.getNumericalVariance();
        double double8 = hypergeometricDistribution4.probability((int) (short) 100);
        java.lang.Class<?> wildcardClass9 = hypergeometricDistribution4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.2275d + "'", double6 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
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
        int int20 = hypergeometricDistribution4.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2275d + "'", double13 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double7 = hypergeometricDistribution4.calculateNumericalVariance();
        int int9 = hypergeometricDistribution4.inverseCumulativeProbability((double) 0);
        double double10 = hypergeometricDistribution4.getNumericalMean();
        double double11 = hypergeometricDistribution4.getNumericalMean();
        int int12 = hypergeometricDistribution4.getSampleSize();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.35d + "'", double10 == 0.35d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.35d + "'", double11 == 0.35d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double9 = hypergeometricDistribution4.cumulativeProbability(0, (int) 'a');
        boolean boolean10 = hypergeometricDistribution4.isSupportConnected();
        double double12 = hypergeometricDistribution4.upperCumulativeProbability(100);
        int int13 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double16 = hypergeometricDistribution4.cumulativeProbability((int) (short) 0, 0);
        double double17 = hypergeometricDistribution4.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.34999999999999964d + "'", double9 == 0.34999999999999964d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.2275d + "'", double17 == 0.2275d);
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        double double12 = hypergeometricDistribution4.cumulativeProbability((int) ' ');
        int int14 = hypergeometricDistribution4.inverseCumulativeProbability((double) 1L);
        double double16 = hypergeometricDistribution4.probability((int) (byte) 10);
        double double18 = hypergeometricDistribution4.cumulativeProbability(100);
        int int19 = hypergeometricDistribution4.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(100, (int) (short) 100, (int) (byte) 0);
        hypergeometricDistribution3.reseedRandomGenerator((long) 20);
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double7 = hypergeometricDistribution4.calculateNumericalVariance();
        int int9 = hypergeometricDistribution4.inverseCumulativeProbability((double) 0);
        double double10 = hypergeometricDistribution4.getNumericalMean();
        boolean boolean11 = hypergeometricDistribution4.isSupportConnected();
        int int12 = hypergeometricDistribution4.getSampleSize();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.35d + "'", double10 == 0.35d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (short) 10, 10, 1);
        int int4 = hypergeometricDistribution3.getSupportLowerBound();
        int int5 = hypergeometricDistribution3.getNumberOfSuccesses();
        int int6 = hypergeometricDistribution3.getNumberOfSuccesses();
        double double7 = hypergeometricDistribution3.calculateNumericalVariance();
        int int9 = hypergeometricDistribution3.inverseCumulativeProbability(0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getPopulationSize();
        int int8 = hypergeometricDistribution4.inverseCumulativeProbability((double) (byte) 0);
        double double9 = hypergeometricDistribution4.getNumericalVariance();
        double double11 = hypergeometricDistribution4.upperCumulativeProbability((int) '#');
        double double13 = hypergeometricDistribution4.probability(0);
        boolean boolean14 = hypergeometricDistribution4.isSupportConnected();
        double double15 = hypergeometricDistribution4.getNumericalMean();
        double double18 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1, 20);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.2275d + "'", double9 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.6500000000000004d + "'", double13 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.35d + "'", double15 == 0.35d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        double double12 = hypergeometricDistribution4.probability((-1));
        int int13 = hypergeometricDistribution4.getSampleSize();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = hypergeometricDistribution4.sample((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
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
        double double19 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 100);
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
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
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
        int int19 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int20 = hypergeometricDistribution4.getPopulationSize();
        double double21 = hypergeometricDistribution4.getNumericalVariance();
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.2275d + "'", double21 == 0.2275d);
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
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
        double double15 = hypergeometricDistribution4.upperCumulativeProbability(10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.6500000000000004d + "'", double11 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2275d + "'", double13 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, 35, 0);
        int int4 = hypergeometricDistribution3.getPopulationSize();
        double double5 = hypergeometricDistribution3.calculateNumericalVariance();
        double double7 = hypergeometricDistribution3.probability((int) '4');
        double double8 = hypergeometricDistribution3.calculateNumericalVariance();
        double double10 = hypergeometricDistribution3.cumulativeProbability(97);
        double double11 = hypergeometricDistribution3.getNumericalVariance();
        double double14 = hypergeometricDistribution3.cumulativeProbability((int) (short) 0, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.cumulativeProbability(0);
        int int7 = hypergeometricDistribution4.getSupportLowerBound();
        double double8 = hypergeometricDistribution4.getNumericalMean();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = hypergeometricDistribution4.sample();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.35d + "'", double8 == 0.35d);
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
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
        double double19 = hypergeometricDistribution4.getNumericalMean();
        boolean boolean20 = hypergeometricDistribution4.isSupportConnected();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.35d + "'", double19 == 0.35d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.cumulativeProbability(0);
        double double7 = hypergeometricDistribution4.calculateNumericalVariance();
        int int8 = hypergeometricDistribution4.getPopulationSize();
        double double10 = hypergeometricDistribution4.probability((int) (byte) -1);
        double double12 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 100);
        double double14 = hypergeometricDistribution4.probability((int) (short) -1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (byte) 1, 35, (-1));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: number of samples (-1)");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getPopulationSize();
        double double7 = hypergeometricDistribution4.getNumericalMean();
        double double8 = hypergeometricDistribution4.getNumericalMean();
        int int9 = hypergeometricDistribution4.getSupportUpperBound();
        double double10 = hypergeometricDistribution4.getNumericalMean();
        int int11 = hypergeometricDistribution4.getNumberOfSuccesses();
        // The following exception was thrown during execution in test generation
        try {
            double double14 = hypergeometricDistribution4.cumulativeProbability((int) (short) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (10) must be less than or equal to upper endpoint (-1)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.35d + "'", double7 == 0.35d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.35d + "'", double8 == 0.35d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.35d + "'", double10 == 0.35d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        double double12 = hypergeometricDistribution4.cumulativeProbability((int) ' ');
        int int14 = hypergeometricDistribution4.inverseCumulativeProbability((double) 1L);
        double double16 = hypergeometricDistribution4.cumulativeProbability((int) (short) -1);
        double double18 = hypergeometricDistribution4.upperCumulativeProbability((int) (short) 10);
        double double19 = hypergeometricDistribution4.calculateNumericalVariance();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.2275d + "'", double19 == 0.2275d);
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, 35, 0);
        double double4 = hypergeometricDistribution3.getNumericalMean();
        double double6 = hypergeometricDistribution3.upperCumulativeProbability(0);
        int int7 = hypergeometricDistribution3.getSampleSize();
        int int8 = hypergeometricDistribution3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, (int) (byte) 10, 52);
        double double5 = hypergeometricDistribution4.calculateNumericalVariance();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = hypergeometricDistribution4.sample();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.269090909090909d + "'", double5 == 2.269090909090909d);
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        boolean boolean5 = hypergeometricDistribution4.isSupportConnected();
        int int6 = hypergeometricDistribution4.getSampleSize();
        double double8 = hypergeometricDistribution4.probability((int) (byte) 100);
        double double9 = hypergeometricDistribution4.calculateNumericalVariance();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.2275d + "'", double9 == 0.2275d);
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        int int7 = hypergeometricDistribution4.getNumberOfSuccesses();
        boolean boolean8 = hypergeometricDistribution4.isSupportConnected();
        int int9 = hypergeometricDistribution4.getPopulationSize();
        double double10 = hypergeometricDistribution4.getNumericalVariance();
        double double12 = hypergeometricDistribution4.upperCumulativeProbability((int) (short) 10);
        double double13 = hypergeometricDistribution4.calculateNumericalVariance();
        double double15 = hypergeometricDistribution4.probability(32);
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
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(32, (int) (byte) 0, 35);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: sample size (35) must be less than or equal to population size (32)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, 35, 0);
        double double4 = hypergeometricDistribution3.getNumericalMean();
        double double6 = hypergeometricDistribution3.upperCumulativeProbability(100);
        double double8 = hypergeometricDistribution3.upperCumulativeProbability((int) '#');
        double double10 = hypergeometricDistribution3.cumulativeProbability(1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
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
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray26 = hypergeometricDistribution4.sample((int) (byte) 1);
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
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0d + "'", double24 == 1.0d);
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double7 = hypergeometricDistribution4.calculateNumericalVariance();
        int int9 = hypergeometricDistribution4.inverseCumulativeProbability((double) 0);
        int int10 = hypergeometricDistribution4.getSampleSize();
        int int11 = hypergeometricDistribution4.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.35d + "'", double17 == 0.35d);
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
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
        double double19 = hypergeometricDistribution4.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.3500000000000001d + "'", double18 == 0.3500000000000001d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.35d + "'", double19 == 0.35d);
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (short) 100, (int) (byte) 0, (int) (short) 0);
        double double4 = hypergeometricDistribution3.getNumericalVariance();
        int[] intArray6 = hypergeometricDistribution3.sample((int) (byte) 1);
        hypergeometricDistribution3.reseedRandomGenerator((long) 'a');
        boolean boolean9 = hypergeometricDistribution3.isSupportConnected();
        int int10 = hypergeometricDistribution3.getPopulationSize();
        double double11 = hypergeometricDistribution3.getNumericalVariance();
        java.lang.Class<?> wildcardClass12 = hypergeometricDistribution3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 0 });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        double double7 = hypergeometricDistribution4.upperCumulativeProbability((int) (short) -1);
        boolean boolean8 = hypergeometricDistribution4.isSupportConnected();
        double double9 = hypergeometricDistribution4.getNumericalVariance();
        boolean boolean10 = hypergeometricDistribution4.isSupportConnected();
        double double12 = hypergeometricDistribution4.cumulativeProbability((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.2275d + "'", double9 == 0.2275d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
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
        double double18 = hypergeometricDistribution4.upperCumulativeProbability((int) (short) 1);
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
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.3500000000000001d + "'", double18 == 0.3500000000000001d);
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) '#', 1, 35);
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
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
        double double23 = hypergeometricDistribution4.calculateNumericalVariance();
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
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.2275d + "'", double23 == 0.2275d);
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getPopulationSize();
        int int8 = hypergeometricDistribution4.inverseCumulativeProbability((double) (byte) 0);
        double double9 = hypergeometricDistribution4.getNumericalVariance();
        double double11 = hypergeometricDistribution4.cumulativeProbability((int) '#');
        int int12 = hypergeometricDistribution4.getSampleSize();
        double double14 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 100);
        double double16 = hypergeometricDistribution4.probability(97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.2275d + "'", double9 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) ' ', (int) ' ', (int) (byte) 1);
        double double4 = hypergeometricDistribution3.getNumericalMean();
        double double6 = hypergeometricDistribution3.upperCumulativeProbability((int) (byte) 0);
        double double8 = hypergeometricDistribution3.cumulativeProbability((int) (short) 10);
        boolean boolean9 = hypergeometricDistribution3.isSupportConnected();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = hypergeometricDistribution3.cumulativeProbability((int) ' ', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (32) must be less than or equal to upper endpoint (10)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        double double12 = hypergeometricDistribution4.cumulativeProbability((int) ' ');
        int int14 = hypergeometricDistribution4.inverseCumulativeProbability((double) 1L);
        boolean boolean15 = hypergeometricDistribution4.isSupportConnected();
        double double17 = hypergeometricDistribution4.cumulativeProbability((int) ' ');
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
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
        int int29 = hypergeometricDistribution4.getSupportUpperBound();
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
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, 35, 0);
        int int4 = hypergeometricDistribution3.getPopulationSize();
        double double5 = hypergeometricDistribution3.getNumericalMean();
        double double6 = hypergeometricDistribution3.getNumericalVariance();
        boolean boolean7 = hypergeometricDistribution3.isSupportConnected();
        hypergeometricDistribution3.reseedRandomGenerator((long) '#');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2256");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        double double7 = hypergeometricDistribution4.upperCumulativeProbability((int) (short) -1);
        boolean boolean8 = hypergeometricDistribution4.isSupportConnected();
        double double9 = hypergeometricDistribution4.getNumericalVariance();
        int int10 = hypergeometricDistribution4.getSupportUpperBound();
        double double12 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double14 = hypergeometricDistribution4.upperCumulativeProbability(52);
        java.lang.Class<?> wildcardClass15 = hypergeometricDistribution4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.2275d + "'", double9 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.6500000000000004d + "'", double12 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2257");
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
        double double16 = hypergeometricDistribution4.probability((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.6500000000000004d + "'", double11 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.35d + "'", double14 == 0.35d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2258");
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
        double double17 = hypergeometricDistribution4.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2275d + "'", double13 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.35d + "'", double14 == 0.35d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.35d + "'", double15 == 0.35d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.2275d + "'", double17 == 0.2275d);
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2259");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 100, 52, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = hypergeometricDistribution4.inverseCumulativeProbability((double) '4');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: 52 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2260");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        int int9 = hypergeometricDistribution4.getSampleSize();
        int int10 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int11 = hypergeometricDistribution4.getSampleSize();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = hypergeometricDistribution4.sample();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2261");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double7 = hypergeometricDistribution4.calculateNumericalVariance();
        int int9 = hypergeometricDistribution4.inverseCumulativeProbability((double) 0);
        double double12 = hypergeometricDistribution4.cumulativeProbability((int) '#', (int) '#');
        double double14 = hypergeometricDistribution4.upperCumulativeProbability(1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.3500000000000001d + "'", double14 == 0.3500000000000001d);
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2262");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        double double6 = hypergeometricDistribution4.getNumericalMean();
        int int7 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double9 = hypergeometricDistribution4.upperCumulativeProbability(4);
        double double10 = hypergeometricDistribution4.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.35d + "'", double6 == 0.35d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.2275d + "'", double10 == 0.2275d);
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2263");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        int int7 = hypergeometricDistribution4.getNumberOfSuccesses();
        boolean boolean8 = hypergeometricDistribution4.isSupportConnected();
        int int9 = hypergeometricDistribution4.getPopulationSize();
        double double12 = hypergeometricDistribution4.cumulativeProbability(1, (int) (byte) 10);
        double double14 = hypergeometricDistribution4.probability((int) '#');
        int int15 = hypergeometricDistribution4.getSampleSize();
        int int16 = hypergeometricDistribution4.getPopulationSize();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2264");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        double double6 = hypergeometricDistribution4.getNumericalMean();
        double double7 = hypergeometricDistribution4.getNumericalMean();
        int int8 = hypergeometricDistribution4.getSupportUpperBound();
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
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.35d + "'", double7 == 0.35d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2265");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getPopulationSize();
        int int8 = hypergeometricDistribution4.inverseCumulativeProbability((double) (byte) 0);
        double double9 = hypergeometricDistribution4.getNumericalVariance();
        double double11 = hypergeometricDistribution4.cumulativeProbability((int) '#');
        int int12 = hypergeometricDistribution4.getSupportUpperBound();
        double double13 = hypergeometricDistribution4.getNumericalMean();
        int int14 = hypergeometricDistribution4.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.2275d + "'", double9 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.35d + "'", double13 == 0.35d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2266");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.cumulativeProbability(0);
        double double7 = hypergeometricDistribution4.calculateNumericalVariance();
        int int8 = hypergeometricDistribution4.getPopulationSize();
        double double10 = hypergeometricDistribution4.probability((int) (byte) -1);
        int int11 = hypergeometricDistribution4.getSupportUpperBound();
        double double13 = hypergeometricDistribution4.probability((int) (byte) 100);
        double double16 = hypergeometricDistribution4.cumulativeProbability(100, 100);
        java.lang.Class<?> wildcardClass17 = hypergeometricDistribution4.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2267");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        int int12 = hypergeometricDistribution4.inverseCumulativeProbability(0.34999999999999964d);
        boolean boolean13 = hypergeometricDistribution4.isSupportConnected();
        double double14 = hypergeometricDistribution4.getNumericalMean();
        boolean boolean15 = hypergeometricDistribution4.isSupportConnected();
        double double16 = hypergeometricDistribution4.calculateNumericalVariance();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.35d + "'", double14 == 0.35d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.2275d + "'", double16 == 0.2275d);
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2268");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.probability((int) ' ');
        double double12 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 1);
        double double14 = hypergeometricDistribution4.upperCumulativeProbability(0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.3500000000000001d + "'", double12 == 0.3500000000000001d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2269");
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
        double double25 = hypergeometricDistribution4.cumulativeProbability((int) (byte) -1);
        boolean boolean26 = hypergeometricDistribution4.isSupportConnected();
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
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2270");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        double double7 = hypergeometricDistribution4.upperCumulativeProbability((int) (short) -1);
        boolean boolean8 = hypergeometricDistribution4.isSupportConnected();
        double double9 = hypergeometricDistribution4.getNumericalVariance();
        int int10 = hypergeometricDistribution4.getSupportUpperBound();
        int int11 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double13 = hypergeometricDistribution4.probability((int) (short) 1);
        int int14 = hypergeometricDistribution4.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.2275d + "'", double9 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.3500000000000001d + "'", double13 == 0.3500000000000001d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2271");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((-1), 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: population size (-1)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2272");
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
        double double21 = hypergeometricDistribution4.probability((-1));
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
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2273");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getPopulationSize();
        int int8 = hypergeometricDistribution4.inverseCumulativeProbability((double) (byte) 0);
        double double10 = hypergeometricDistribution4.cumulativeProbability((int) (byte) -1);
        double double11 = hypergeometricDistribution4.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.2275d + "'", double11 == 0.2275d);
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2274");
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
        int int18 = hypergeometricDistribution4.getSampleSize();
        double double19 = hypergeometricDistribution4.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.6500000000000004d + "'", double16 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.2275d + "'", double19 == 0.2275d);
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2275");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double7 = hypergeometricDistribution4.calculateNumericalVariance();
        int int9 = hypergeometricDistribution4.inverseCumulativeProbability((double) 0);
        double double10 = hypergeometricDistribution4.getNumericalMean();
        int int11 = hypergeometricDistribution4.getSupportLowerBound();
        double double13 = hypergeometricDistribution4.cumulativeProbability(10);
        int int14 = hypergeometricDistribution4.getPopulationSize();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.35d + "'", double10 == 0.35d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2276");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        double double12 = hypergeometricDistribution4.upperCumulativeProbability(1);
        int int13 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double14 = hypergeometricDistribution4.getNumericalMean();
        int int15 = hypergeometricDistribution4.getSupportUpperBound();
        double double17 = hypergeometricDistribution4.cumulativeProbability(32);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.3500000000000001d + "'", double12 == 0.3500000000000001d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.35d + "'", double14 == 0.35d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2277");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (byte) 100, (int) (short) 1, (int) (short) 10);
        double double6 = hypergeometricDistribution4.upperCumulativeProbability((-1));
        int int7 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double10 = hypergeometricDistribution4.cumulativeProbability((int) (short) 1, (int) (short) 1);
        double double12 = hypergeometricDistribution4.probability((int) (short) 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.10000000000000002d + "'", double12 == 0.10000000000000002d);
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2278");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        boolean boolean5 = hypergeometricDistribution4.isSupportConnected();
        int int6 = hypergeometricDistribution4.getSampleSize();
        int int7 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double9 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 100);
        int int10 = hypergeometricDistribution4.getPopulationSize();
        int int11 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double12 = hypergeometricDistribution4.calculateNumericalVariance();
        int int13 = hypergeometricDistribution4.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.2275d + "'", double12 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2279");
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
        int int15 = hypergeometricDistribution4.getPopulationSize();
        int int16 = hypergeometricDistribution4.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.2275d + "'", double11 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.35d + "'", double12 == 0.35d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2280");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double7 = hypergeometricDistribution4.getNumericalMean();
        double double9 = hypergeometricDistribution4.probability(100);
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistribution4.reseedRandomGenerator((long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.35d + "'", double7 == 0.35d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2281");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        int int7 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int8 = hypergeometricDistribution4.getNumberOfSuccesses();
        boolean boolean9 = hypergeometricDistribution4.isSupportConnected();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = hypergeometricDistribution4.sample();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2282");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution4.isSupportConnected();
        double double7 = hypergeometricDistribution4.getNumericalVariance();
        double double10 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1, (int) 'a');
        double double12 = hypergeometricDistribution4.upperCumulativeProbability((int) 'a');
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2283");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        double double6 = hypergeometricDistribution4.getNumericalMean();
        double double7 = hypergeometricDistribution4.getNumericalMean();
        int int8 = hypergeometricDistribution4.getSupportUpperBound();
        int int9 = hypergeometricDistribution4.getPopulationSize();
        double double11 = hypergeometricDistribution4.probability((int) (short) 10);
        boolean boolean12 = hypergeometricDistribution4.isSupportConnected();
        // The following exception was thrown during execution in test generation
        try {
            double double15 = hypergeometricDistribution4.cumulativeProbability(7, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (7) must be less than or equal to upper endpoint (-1)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.35d + "'", double6 == 0.35d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.35d + "'", double7 == 0.35d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2284");
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
        boolean boolean16 = hypergeometricDistribution4.isSupportConnected();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.35d + "'", double8 == 0.35d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.35d + "'", double9 == 0.35d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.2275d + "'", double10 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2285");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution4.isSupportConnected();
        double double7 = hypergeometricDistribution4.getNumericalVariance();
        int int8 = hypergeometricDistribution4.getSupportUpperBound();
        double double10 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double11 = hypergeometricDistribution4.calculateNumericalVariance();
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.6500000000000004d + "'", double10 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.2275d + "'", double11 == 0.2275d);
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2286");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        int int7 = hypergeometricDistribution4.getNumberOfSuccesses();
        boolean boolean8 = hypergeometricDistribution4.isSupportConnected();
        int int9 = hypergeometricDistribution4.getPopulationSize();
        double double10 = hypergeometricDistribution4.getNumericalVariance();
        double double12 = hypergeometricDistribution4.upperCumulativeProbability((int) (short) 10);
        double double14 = hypergeometricDistribution4.cumulativeProbability(0);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = hypergeometricDistribution4.sample();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.2275d + "'", double10 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.6500000000000004d + "'", double14 == 0.6500000000000004d);
    }

    @Test
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2287");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution4.isSupportConnected();
        double double7 = hypergeometricDistribution4.getNumericalVariance();
        int int8 = hypergeometricDistribution4.getSupportUpperBound();
        int int9 = hypergeometricDistribution4.getSupportLowerBound();
        int int10 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int12 = hypergeometricDistribution4.inverseCumulativeProbability(0.23063024763524284d);
        int int14 = hypergeometricDistribution4.inverseCumulativeProbability((double) (byte) 1);
        boolean boolean15 = hypergeometricDistribution4.isSupportConnected();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2288");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, 35, 0);
        int int4 = hypergeometricDistribution3.getSupportLowerBound();
        int int5 = hypergeometricDistribution3.getSupportUpperBound();
        int int6 = hypergeometricDistribution3.getPopulationSize();
        double double8 = hypergeometricDistribution3.upperCumulativeProbability((int) (byte) -1);
        int int9 = hypergeometricDistribution3.getNumberOfSuccesses();
        java.lang.Class<?> wildcardClass10 = hypergeometricDistribution3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2289");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getPopulationSize();
        double double7 = hypergeometricDistribution4.getNumericalMean();
        double double10 = hypergeometricDistribution4.cumulativeProbability((int) (byte) -1, 1);
        double double12 = hypergeometricDistribution4.probability(35);
        int int13 = hypergeometricDistribution4.getPopulationSize();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.35d + "'", double7 == 0.35d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2290");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        double double12 = hypergeometricDistribution4.cumulativeProbability((int) ' ');
        int int14 = hypergeometricDistribution4.inverseCumulativeProbability((double) 1L);
        double double16 = hypergeometricDistribution4.cumulativeProbability((int) (short) -1);
        double double17 = hypergeometricDistribution4.getNumericalMean();
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
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.35d + "'", double17 == 0.35d);
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2291");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution4.isSupportConnected();
        double double7 = hypergeometricDistribution4.getNumericalVariance();
        double double10 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1, (int) 'a');
        int int11 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double13 = hypergeometricDistribution4.upperCumulativeProbability((int) (short) 10);
        double double15 = hypergeometricDistribution4.probability((int) '4');
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2292");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(10, 7, 20);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: sample size (20) must be less than or equal to population size (10)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2293");
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
        int int23 = hypergeometricDistribution4.getSupportLowerBound();
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2294");
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
        double double27 = hypergeometricDistribution4.cumulativeProbability((int) (short) -1, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray29 = hypergeometricDistribution4.sample(52);
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
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.2275d + "'", double23 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2295");
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
        double double19 = hypergeometricDistribution4.getNumericalMean();
        double double21 = hypergeometricDistribution4.cumulativeProbability((int) (short) -1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.6500000000000004d + "'", double17 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.2275d + "'", double18 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.35d + "'", double19 == 0.35d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2296");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, 35, 0);
        double double6 = hypergeometricDistribution3.cumulativeProbability((-1), (int) (short) -1);
        double double8 = hypergeometricDistribution3.probability(1);
        boolean boolean9 = hypergeometricDistribution3.isSupportConnected();
        int int10 = hypergeometricDistribution3.getSupportLowerBound();
        double double12 = hypergeometricDistribution3.cumulativeProbability(52);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2297");
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
        // The following exception was thrown during execution in test generation
        try {
            int int28 = hypergeometricDistribution4.inverseCumulativeProbability((double) 52);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: 52 out of [0, 1] range");
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
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2298");
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
        double double17 = hypergeometricDistribution4.cumulativeProbability((int) (short) 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.35d + "'", double13 == 0.35d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.35d + "'", double14 == 0.35d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
    }

    @Test
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2299");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) ' ', (int) (byte) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: sample size (100) must be less than or equal to population size (32)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2300");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getPopulationSize();
        boolean boolean7 = hypergeometricDistribution4.isSupportConnected();
        double double10 = hypergeometricDistribution4.cumulativeProbability(1, (int) '#');
        double double13 = hypergeometricDistribution4.cumulativeProbability((int) (short) 100, (int) (byte) 100);
        int int14 = hypergeometricDistribution4.getPopulationSize();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2301");
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
        int int23 = hypergeometricDistribution4.getNumberOfSuccesses();
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2302");
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
        double double28 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 10);
        double double30 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) -1);
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
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 1.0d + "'", double28 == 1.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 1.0d + "'", double30 == 1.0d);
    }

    @Test
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2303");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        double double6 = hypergeometricDistribution4.getNumericalMean();
        double double8 = hypergeometricDistribution4.cumulativeProbability(0);
        int int9 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double11 = hypergeometricDistribution4.cumulativeProbability(0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.35d + "'", double6 == 0.35d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.6500000000000004d + "'", double8 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.6500000000000004d + "'", double11 == 0.6500000000000004d);
    }

    @Test
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2304");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        int int11 = hypergeometricDistribution4.getSupportUpperBound();
        int int12 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double13 = hypergeometricDistribution4.getNumericalMean();
        double double15 = hypergeometricDistribution4.upperCumulativeProbability((int) '4');
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.35d + "'", double13 == 0.35d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2305");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double7 = hypergeometricDistribution4.calculateNumericalVariance();
        double double9 = hypergeometricDistribution4.upperCumulativeProbability((-1));
        double double11 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 10);
        int int12 = hypergeometricDistribution4.getSampleSize();
        double double13 = hypergeometricDistribution4.getNumericalVariance();
        double double15 = hypergeometricDistribution4.probability(52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2275d + "'", double13 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2306");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, 35, 0);
        double double6 = hypergeometricDistribution3.cumulativeProbability((-1), (int) (short) -1);
        double double8 = hypergeometricDistribution3.probability(1);
        int int9 = hypergeometricDistribution3.getSupportUpperBound();
        hypergeometricDistribution3.reseedRandomGenerator((long) 1);
        int int12 = hypergeometricDistribution3.getSampleSize();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2307");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        double double7 = hypergeometricDistribution4.upperCumulativeProbability((int) (short) -1);
        double double8 = hypergeometricDistribution4.getNumericalVariance();
        int int9 = hypergeometricDistribution4.getSampleSize();
        int int10 = hypergeometricDistribution4.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.2275d + "'", double8 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2308");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getPopulationSize();
        boolean boolean7 = hypergeometricDistribution4.isSupportConnected();
        double double10 = hypergeometricDistribution4.cumulativeProbability(1, (int) '#');
        int int12 = hypergeometricDistribution4.inverseCumulativeProbability(0.24984402316337592d);
        double double13 = hypergeometricDistribution4.calculateNumericalVariance();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2275d + "'", double13 == 0.2275d);
    }

    @Test
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2309");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, 35, 0);
        double double6 = hypergeometricDistribution3.cumulativeProbability((-1), (int) (short) -1);
        double double8 = hypergeometricDistribution3.probability(1);
        int int9 = hypergeometricDistribution3.getSupportUpperBound();
        double double11 = hypergeometricDistribution3.cumulativeProbability((int) (short) 100);
        int int12 = hypergeometricDistribution3.getSupportLowerBound();
        int int13 = hypergeometricDistribution3.sample();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2310");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.cumulativeProbability(0);
        double double7 = hypergeometricDistribution4.calculateNumericalVariance();
        int int8 = hypergeometricDistribution4.getPopulationSize();
        boolean boolean9 = hypergeometricDistribution4.isSupportConnected();
        int int10 = hypergeometricDistribution4.getSupportUpperBound();
        int int11 = hypergeometricDistribution4.getSupportLowerBound();
        int int12 = hypergeometricDistribution4.getSampleSize();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
    }

    @Test
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2311");
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
        double double26 = hypergeometricDistribution4.cumulativeProbability(0, (int) ' ');
        double double27 = hypergeometricDistribution4.getNumericalVariance();
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistribution4.reseedRandomGenerator((-1L));
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
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.34999999999999964d + "'", double26 == 0.34999999999999964d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.2275d + "'", double27 == 0.2275d);
    }

    @Test
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2312");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(100, (int) (short) 10, 35);
        int int4 = hypergeometricDistribution3.getSupportLowerBound();
        double double6 = hypergeometricDistribution3.cumulativeProbability((int) '4');
        double double9 = hypergeometricDistribution3.cumulativeProbability((int) '#', 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2313");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getPopulationSize();
        boolean boolean7 = hypergeometricDistribution4.isSupportConnected();
        double double9 = hypergeometricDistribution4.upperCumulativeProbability(0);
        double double11 = hypergeometricDistribution4.upperCumulativeProbability(1);
        int int12 = hypergeometricDistribution4.getSupportUpperBound();
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistribution4.reseedRandomGenerator((long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.3500000000000001d + "'", double11 == 0.3500000000000001d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2314");
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
        int int30 = hypergeometricDistribution4.getNumberOfSuccesses();
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2315");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.cumulativeProbability(0);
        double double7 = hypergeometricDistribution4.calculateNumericalVariance();
        double double8 = hypergeometricDistribution4.getNumericalMean();
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistribution4.reseedRandomGenerator((-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.35d + "'", double8 == 0.35d);
    }

    @Test
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2316");
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
        int int16 = hypergeometricDistribution4.getSampleSize();
        int int17 = hypergeometricDistribution4.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.35d + "'", double13 == 0.35d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2317");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, (int) (byte) 100, (int) (byte) 100);
        int int4 = hypergeometricDistribution3.getSampleSize();
        int int5 = hypergeometricDistribution3.getSampleSize();
        int int6 = hypergeometricDistribution3.getNumberOfSuccesses();
        java.lang.Class<?> wildcardClass7 = hypergeometricDistribution3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2318");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(100, (int) (byte) 0, (int) (short) 10);
        double double4 = hypergeometricDistribution3.getNumericalVariance();
        int int5 = hypergeometricDistribution3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test2319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2319");
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
        // The following exception was thrown during execution in test generation
        try {
            double double22 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (1) must be less than or equal to upper endpoint (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.35d + "'", double18 == 0.35d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 35 + "'", int19 == 35);
    }

    @Test
    public void test2320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2320");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(10, (int) (short) 10, (int) (short) 10);
        double double5 = hypergeometricDistribution3.upperCumulativeProbability((int) (byte) 1);
        int int6 = hypergeometricDistribution3.getPopulationSize();
        int int7 = hypergeometricDistribution3.sample();
        int int8 = hypergeometricDistribution3.getSupportLowerBound();
        double double10 = hypergeometricDistribution3.cumulativeProbability(32);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test2321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2321");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        double double6 = hypergeometricDistribution4.getNumericalMean();
        int int7 = hypergeometricDistribution4.getSupportLowerBound();
        double double9 = hypergeometricDistribution4.upperCumulativeProbability(100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.35d + "'", double6 == 0.35d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test2322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2322");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.cumulativeProbability(0);
        double double7 = hypergeometricDistribution4.calculateNumericalVariance();
        double double9 = hypergeometricDistribution4.upperCumulativeProbability(10);
        double double10 = hypergeometricDistribution4.calculateNumericalVariance();
        double double11 = hypergeometricDistribution4.calculateNumericalVariance();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = hypergeometricDistribution4.sample();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.2275d + "'", double10 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.2275d + "'", double11 == 0.2275d);
    }

    @Test
    public void test2323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2323");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double7 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 0, (int) (short) 0);
        double double8 = hypergeometricDistribution4.calculateNumericalVariance();
        double double9 = hypergeometricDistribution4.calculateNumericalVariance();
        double double10 = hypergeometricDistribution4.getNumericalVariance();
        double double11 = hypergeometricDistribution4.calculateNumericalVariance();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.2275d + "'", double8 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.2275d + "'", double9 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.2275d + "'", double10 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.2275d + "'", double11 == 0.2275d);
    }

    @Test
    public void test2324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2324");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double7 = hypergeometricDistribution4.calculateNumericalVariance();
        int int8 = hypergeometricDistribution4.getSupportLowerBound();
        double double10 = hypergeometricDistribution4.upperCumulativeProbability(32);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test2325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2325");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        double double12 = hypergeometricDistribution4.probability((-1));
        double double14 = hypergeometricDistribution4.upperCumulativeProbability((int) ' ');
        double double15 = hypergeometricDistribution4.calculateNumericalVariance();
        int int17 = hypergeometricDistribution4.inverseCumulativeProbability(0.3500000000000001d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.2275d + "'", double15 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2326");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, (int) (byte) 100, (int) (byte) 100);
        int int4 = hypergeometricDistribution3.sample();
        int int5 = hypergeometricDistribution3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test2327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2327");
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
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistribution4.reseedRandomGenerator(10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test2328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2328");
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
        int int18 = hypergeometricDistribution4.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.2275d + "'", double9 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.6500000000000004d + "'", double13 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.2275d + "'", double17 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test2329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2329");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, 35, 0);
        int int4 = hypergeometricDistribution3.getPopulationSize();
        double double5 = hypergeometricDistribution3.getNumericalMean();
        double double6 = hypergeometricDistribution3.getNumericalVariance();
        int int8 = hypergeometricDistribution3.inverseCumulativeProbability((double) 0.0f);
        int int9 = hypergeometricDistribution3.getNumberOfSuccesses();
        double double11 = hypergeometricDistribution3.cumulativeProbability(32);
        hypergeometricDistribution3.reseedRandomGenerator((long) 'a');
        double double15 = hypergeometricDistribution3.cumulativeProbability((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test2330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2330");
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
        int int21 = hypergeometricDistribution4.getSupportUpperBound();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray23 = hypergeometricDistribution4.sample(7);
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test2331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2331");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) '4', 97, 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: number of successes (97) must be less than or equal to population size (52)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2332");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) ' ', (int) ' ', (int) (short) 0);
        double double5 = hypergeometricDistribution3.probability(35);
        int int6 = hypergeometricDistribution3.getSupportUpperBound();
        int int7 = hypergeometricDistribution3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
    }

    @Test
    public void test2333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2333");
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
            double double22 = hypergeometricDistribution4.cumulativeProbability((int) 'a', (int) ' ');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (97) must be less than or equal to upper endpoint (32)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
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
    public void test2334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2334");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) ' ', (int) ' ', (int) (byte) 1);
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (short) 0);
        double double6 = hypergeometricDistribution3.getNumericalMean();
        double double7 = hypergeometricDistribution3.calculateNumericalVariance();
        int int8 = hypergeometricDistribution3.getNumberOfSuccesses();
        int int9 = hypergeometricDistribution3.getNumberOfSuccesses();
        int int10 = hypergeometricDistribution3.getPopulationSize();
        int int11 = hypergeometricDistribution3.getSupportLowerBound();
        double double12 = hypergeometricDistribution3.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test2335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2335");
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
        int int19 = hypergeometricDistribution4.getSupportLowerBound();
        // The following exception was thrown during execution in test generation
        try {
            double double22 = hypergeometricDistribution4.cumulativeProbability(4, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (4) must be less than or equal to upper endpoint (0)");
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test2336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2336");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) 'a', (int) (short) 1, 24);
        boolean boolean5 = hypergeometricDistribution4.isSupportConnected();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test2337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2337");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        double double6 = hypergeometricDistribution4.getNumericalVariance();
        double double7 = hypergeometricDistribution4.getNumericalVariance();
        int int9 = hypergeometricDistribution4.inverseCumulativeProbability(0.9896585442462209d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.2275d + "'", double6 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test2338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2338");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution4.isSupportConnected();
        double double7 = hypergeometricDistribution4.getNumericalVariance();
        double double8 = hypergeometricDistribution4.getNumericalMean();
        int int9 = hypergeometricDistribution4.getSampleSize();
        double double11 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 100);
        int int12 = hypergeometricDistribution4.getPopulationSize();
        double double13 = hypergeometricDistribution4.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.35d + "'", double8 == 0.35d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.35d + "'", double13 == 0.35d);
    }

    @Test
    public void test2339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2339");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 97, (int) (byte) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: number of successes (100) must be less than or equal to population size (97)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2340");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, 35, 0);
        int int4 = hypergeometricDistribution3.getPopulationSize();
        double double5 = hypergeometricDistribution3.getNumericalMean();
        double double6 = hypergeometricDistribution3.getNumericalVariance();
        int int7 = hypergeometricDistribution3.getPopulationSize();
        double double8 = hypergeometricDistribution3.getNumericalMean();
        double double9 = hypergeometricDistribution3.getNumericalVariance();
        int int10 = hypergeometricDistribution3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test2341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2341");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        int int7 = hypergeometricDistribution4.getNumberOfSuccesses();
        boolean boolean8 = hypergeometricDistribution4.isSupportConnected();
        int int9 = hypergeometricDistribution4.getPopulationSize();
        double double10 = hypergeometricDistribution4.getNumericalVariance();
        double double12 = hypergeometricDistribution4.upperCumulativeProbability((int) (short) 10);
        int int13 = hypergeometricDistribution4.getSupportLowerBound();
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistribution4.reseedRandomGenerator((long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.2275d + "'", double10 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2342");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        double double11 = hypergeometricDistribution4.getNumericalVariance();
        double double13 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double15 = hypergeometricDistribution4.probability((-1));
        int int16 = hypergeometricDistribution4.getPopulationSize();
        double double18 = hypergeometricDistribution4.probability((int) (short) 10);
        int int19 = hypergeometricDistribution4.getPopulationSize();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.2275d + "'", double11 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
    }

    @Test
    public void test2343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2343");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, 35, 0);
        int int4 = hypergeometricDistribution3.getPopulationSize();
        double double5 = hypergeometricDistribution3.getNumericalMean();
        double double6 = hypergeometricDistribution3.getNumericalVariance();
        int int8 = hypergeometricDistribution3.inverseCumulativeProbability((double) 0.0f);
        int int9 = hypergeometricDistribution3.getNumberOfSuccesses();
        double double11 = hypergeometricDistribution3.cumulativeProbability(32);
        hypergeometricDistribution3.reseedRandomGenerator((long) 'a');
        double double15 = hypergeometricDistribution3.probability((int) (short) 1);
        double double16 = hypergeometricDistribution3.getNumericalMean();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test2344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2344");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getPopulationSize();
        int int8 = hypergeometricDistribution4.inverseCumulativeProbability((double) (byte) 0);
        double double9 = hypergeometricDistribution4.getNumericalVariance();
        double double10 = hypergeometricDistribution4.getNumericalMean();
        int int11 = hypergeometricDistribution4.getSupportUpperBound();
        double double13 = hypergeometricDistribution4.cumulativeProbability(10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.2275d + "'", double9 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.35d + "'", double10 == 0.35d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test2345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2345");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, 35, 0);
        double double4 = hypergeometricDistribution3.getNumericalMean();
        double double6 = hypergeometricDistribution3.upperCumulativeProbability(100);
        hypergeometricDistribution3.reseedRandomGenerator((long) 'a');
        boolean boolean9 = hypergeometricDistribution3.isSupportConnected();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2346");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        boolean boolean5 = hypergeometricDistribution4.isSupportConnected();
        int int6 = hypergeometricDistribution4.getSampleSize();
        int int7 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double9 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 100);
        double double10 = hypergeometricDistribution4.getNumericalVariance();
        double double12 = hypergeometricDistribution4.probability((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.2275d + "'", double10 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.6500000000000004d + "'", double12 == 0.6500000000000004d);
    }

    @Test
    public void test2347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2347");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 32, 1, (int) (short) 10);
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test2348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2348");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(10, (int) (short) 10, (int) (short) 10);
        double double5 = hypergeometricDistribution3.upperCumulativeProbability((int) (byte) 1);
        double double7 = hypergeometricDistribution3.upperCumulativeProbability(97);
        hypergeometricDistribution3.reseedRandomGenerator((long) 'a');
        int int11 = hypergeometricDistribution3.inverseCumulativeProbability(0.6500000000000004d);
        int int12 = hypergeometricDistribution3.getSupportUpperBound();
        java.lang.Class<?> wildcardClass13 = hypergeometricDistribution3.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2349");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.cumulativeProbability(0);
        double double7 = hypergeometricDistribution4.calculateNumericalVariance();
        int int8 = hypergeometricDistribution4.getPopulationSize();
        double double10 = hypergeometricDistribution4.probability((int) (byte) -1);
        double double12 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 100);
        int int13 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double15 = hypergeometricDistribution4.upperCumulativeProbability((int) 'a');
        double double16 = hypergeometricDistribution4.calculateNumericalVariance();
        int int18 = hypergeometricDistribution4.inverseCumulativeProbability(0.2275d);
        double double19 = hypergeometricDistribution4.getNumericalMean();
        int int20 = hypergeometricDistribution4.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.2275d + "'", double16 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.35d + "'", double19 == 0.35d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test2350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2350");
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
        int int16 = hypergeometricDistribution4.getSampleSize();
        int int18 = hypergeometricDistribution4.inverseCumulativeProbability((double) (byte) 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.2275d + "'", double9 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test2351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2351");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int7 = hypergeometricDistribution4.getSupportLowerBound();
        int int9 = hypergeometricDistribution4.inverseCumulativeProbability(0.07497555421489926d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2352");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 10, (int) (short) 1, 32);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: sample size (32) must be less than or equal to population size (10)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2353");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) ' ', (int) ' ', (int) (byte) 1);
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (short) 0);
        double double7 = hypergeometricDistribution3.cumulativeProbability(52);
        int int8 = hypergeometricDistribution3.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test2354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2354");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (byte) 0, 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: population size (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2355");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) ' ', (int) ' ', (int) (short) 0);
        double double5 = hypergeometricDistribution3.probability(35);
        double double6 = hypergeometricDistribution3.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test2356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2356");
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
        int int22 = hypergeometricDistribution4.inverseCumulativeProbability((double) 1.0f);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test2357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2357");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getPopulationSize();
        boolean boolean7 = hypergeometricDistribution4.isSupportConnected();
        double double10 = hypergeometricDistribution4.cumulativeProbability(1, (int) '#');
        double double13 = hypergeometricDistribution4.cumulativeProbability((int) (short) 100, (int) (byte) 100);
        double double15 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.6500000000000004d + "'", double15 == 0.6500000000000004d);
    }

    @Test
    public void test2358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2358");
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
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray22 = hypergeometricDistribution4.sample(10);
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
    }

    @Test
    public void test2359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2359");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(100, (int) (short) 100, (int) (short) 10);
        int int5 = hypergeometricDistribution3.inverseCumulativeProbability(0.2275d);
        int int6 = hypergeometricDistribution3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test2360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2360");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 0, 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: population size (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2361");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(10, (int) (short) 10, (int) (short) 10);
        double double5 = hypergeometricDistribution3.upperCumulativeProbability((int) (byte) 1);
        int int6 = hypergeometricDistribution3.getPopulationSize();
        double double7 = hypergeometricDistribution3.calculateNumericalVariance();
        java.lang.Class<?> wildcardClass8 = hypergeometricDistribution3.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2362");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double9 = hypergeometricDistribution4.cumulativeProbability(0, (int) 'a');
        boolean boolean10 = hypergeometricDistribution4.isSupportConnected();
        double double12 = hypergeometricDistribution4.upperCumulativeProbability(100);
        int int13 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int14 = hypergeometricDistribution4.getSupportLowerBound();
        double double16 = hypergeometricDistribution4.cumulativeProbability((int) (short) 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.34999999999999964d + "'", double9 == 0.34999999999999964d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.6500000000000004d + "'", double16 == 0.6500000000000004d);
    }

    @Test
    public void test2363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2363");
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
        java.lang.Class<?> wildcardClass17 = hypergeometricDistribution4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.2275d + "'", double9 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.6500000000000004d + "'", double13 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2364");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        int int11 = hypergeometricDistribution4.getSupportUpperBound();
        int int12 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double14 = hypergeometricDistribution4.cumulativeProbability((int) (short) 1);
        double double16 = hypergeometricDistribution4.upperCumulativeProbability((int) 'a');
        double double17 = hypergeometricDistribution4.getNumericalMean();
        // The following exception was thrown during execution in test generation
        try {
            double double20 = hypergeometricDistribution4.cumulativeProbability(10, 7);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (10) must be less than or equal to upper endpoint (7)");
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
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.35d + "'", double17 == 0.35d);
    }

    @Test
    public void test2365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2365");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.cumulativeProbability(0);
        int int7 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double9 = hypergeometricDistribution4.probability((-1));
        boolean boolean10 = hypergeometricDistribution4.isSupportConnected();
        double double11 = hypergeometricDistribution4.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.2275d + "'", double11 == 0.2275d);
    }

    @Test
    public void test2366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2366");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(100, (int) (byte) 0, (int) (short) 10);
        double double4 = hypergeometricDistribution3.getNumericalVariance();
        double double5 = hypergeometricDistribution3.calculateNumericalVariance();
        int int6 = hypergeometricDistribution3.getSupportUpperBound();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray8 = hypergeometricDistribution3.sample((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: number of samples (-1)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2367");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        double double7 = hypergeometricDistribution4.upperCumulativeProbability((int) (short) -1);
        double double8 = hypergeometricDistribution4.getNumericalVariance();
        int int9 = hypergeometricDistribution4.getSampleSize();
        double double10 = hypergeometricDistribution4.getNumericalMean();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.2275d + "'", double8 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.35d + "'", double10 == 0.35d);
    }

    @Test
    public void test2368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2368");
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
        double double15 = hypergeometricDistribution4.calculateNumericalVariance();
        double double18 = hypergeometricDistribution4.cumulativeProbability((int) ' ', 100);
        double double20 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.2275d + "'", double11 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.35d + "'", double12 == 0.35d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.2275d + "'", double15 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
    }

    @Test
    public void test2369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2369");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        double double12 = hypergeometricDistribution4.cumulativeProbability((int) ' ');
        int int14 = hypergeometricDistribution4.inverseCumulativeProbability((double) 1L);
        double double16 = hypergeometricDistribution4.cumulativeProbability((int) (short) -1);
        double double18 = hypergeometricDistribution4.upperCumulativeProbability((int) (short) 10);
        double double20 = hypergeometricDistribution4.upperCumulativeProbability((int) '#');
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test2370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2370");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, 35, 0);
        double double4 = hypergeometricDistribution3.getNumericalMean();
        double double6 = hypergeometricDistribution3.upperCumulativeProbability(0);
        double double7 = hypergeometricDistribution3.calculateNumericalVariance();
        int int8 = hypergeometricDistribution3.getSupportUpperBound();
        double double9 = hypergeometricDistribution3.getNumericalVariance();
        double double11 = hypergeometricDistribution3.cumulativeProbability(32);
        double double12 = hypergeometricDistribution3.calculateNumericalVariance();
        double double14 = hypergeometricDistribution3.upperCumulativeProbability((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
    }

    @Test
    public void test2371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2371");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        int int7 = hypergeometricDistribution4.getNumberOfSuccesses();
        boolean boolean8 = hypergeometricDistribution4.isSupportConnected();
        double double10 = hypergeometricDistribution4.probability(35);
        double double13 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1, 1);
        int int14 = hypergeometricDistribution4.getPopulationSize();
        double double16 = hypergeometricDistribution4.upperCumulativeProbability(35);
        double double18 = hypergeometricDistribution4.probability((int) ' ');
        double double21 = hypergeometricDistribution4.cumulativeProbability((int) (byte) -1, (int) 'a');
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
    }

    @Test
    public void test2372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2372");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        int int7 = hypergeometricDistribution4.getNumberOfSuccesses();
        boolean boolean8 = hypergeometricDistribution4.isSupportConnected();
        double double10 = hypergeometricDistribution4.probability(35);
        double double11 = hypergeometricDistribution4.getNumericalVariance();
        double double13 = hypergeometricDistribution4.upperCumulativeProbability((int) (short) 10);
        int int14 = hypergeometricDistribution4.getSupportLowerBound();
        double double16 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 1);
        double double17 = hypergeometricDistribution4.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.2275d + "'", double11 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.3500000000000001d + "'", double16 == 0.3500000000000001d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.35d + "'", double17 == 0.35d);
    }

    @Test
    public void test2373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2373");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (short) 100, (int) (byte) 0, (int) (short) 0);
        double double4 = hypergeometricDistribution3.getNumericalVariance();
        int int5 = hypergeometricDistribution3.getNumberOfSuccesses();
        int int6 = hypergeometricDistribution3.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2374");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        double double7 = hypergeometricDistribution4.upperCumulativeProbability((int) (short) -1);
        int int8 = hypergeometricDistribution4.getPopulationSize();
        double double9 = hypergeometricDistribution4.calculateNumericalVariance();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.2275d + "'", double9 == 0.2275d);
    }

    @Test
    public void test2375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2375");
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
        java.lang.Class<?> wildcardClass20 = hypergeometricDistribution4.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2376");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(10, 10, 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: sample size (100) must be less than or equal to population size (10)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2377");
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
        int int22 = hypergeometricDistribution4.getSupportLowerBound();
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test2378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2378");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(4, (int) (byte) 100, 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: number of successes (100) must be less than or equal to population size (4)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2379");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, 35, 0);
        int int4 = hypergeometricDistribution3.getSupportLowerBound();
        double double7 = hypergeometricDistribution3.cumulativeProbability((int) (short) 10, 52);
        hypergeometricDistribution3.reseedRandomGenerator((long) 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test2380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2380");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(10, (int) (short) 10, (int) (short) 10);
        double double5 = hypergeometricDistribution3.upperCumulativeProbability((int) (byte) 1);
        int int6 = hypergeometricDistribution3.getPopulationSize();
        boolean boolean7 = hypergeometricDistribution3.isSupportConnected();
        int[] intArray9 = hypergeometricDistribution3.sample((int) (short) 10);
        double double10 = hypergeometricDistribution3.getNumericalVariance();
        double double12 = hypergeometricDistribution3.probability(0);
        double double13 = hypergeometricDistribution3.getNumericalVariance();
        int int14 = hypergeometricDistribution3.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 });
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test2381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2381");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) ' ', (int) (short) 10, (int) (short) 10);
        int int4 = hypergeometricDistribution3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void test2382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2382");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getPopulationSize();
        double double7 = hypergeometricDistribution4.getNumericalMean();
        double double10 = hypergeometricDistribution4.cumulativeProbability((int) (byte) -1, 1);
        double double11 = hypergeometricDistribution4.getNumericalVariance();
        double double12 = hypergeometricDistribution4.calculateNumericalVariance();
        double double14 = hypergeometricDistribution4.upperCumulativeProbability(10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.35d + "'", double7 == 0.35d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.2275d + "'", double11 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.2275d + "'", double12 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test2383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2383");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) ' ', (int) ' ', (int) (byte) 1);
        double double5 = hypergeometricDistribution3.probability((int) (short) 100);
        int int6 = hypergeometricDistribution3.getSampleSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test2384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2384");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(4, (int) (short) 100, 4);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: number of successes (100) must be less than or equal to population size (4)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2385");
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
        int int17 = hypergeometricDistribution4.getSampleSize();
        double double18 = hypergeometricDistribution4.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.34999999999999964d + "'", double9 == 0.34999999999999964d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.2275d + "'", double18 == 0.2275d);
    }

    @Test
    public void test2386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2386");
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
        int int18 = hypergeometricDistribution4.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.35d + "'", double10 == 0.35d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test2387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2387");
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
            hypergeometricDistribution4.reseedRandomGenerator((long) 100);
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
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
    }

    @Test
    public void test2388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2388");
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
        double double24 = hypergeometricDistribution4.probability((int) (short) -1);
        double double26 = hypergeometricDistribution4.upperCumulativeProbability((int) (short) 1);
        int int27 = hypergeometricDistribution4.getNumberOfSuccesses();
        // The following exception was thrown during execution in test generation
        try {
            int int29 = hypergeometricDistribution4.inverseCumulativeProbability(10.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: 10 out of [0, 1] range");
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
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.3500000000000001d + "'", double22 == 0.3500000000000001d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.3500000000000001d + "'", double26 == 0.3500000000000001d);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test2389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2389");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        int int7 = hypergeometricDistribution4.getNumberOfSuccesses();
        boolean boolean8 = hypergeometricDistribution4.isSupportConnected();
        int int9 = hypergeometricDistribution4.getPopulationSize();
        double double12 = hypergeometricDistribution4.cumulativeProbability(1, (int) (byte) 10);
        int int13 = hypergeometricDistribution4.getSampleSize();
        double double14 = hypergeometricDistribution4.getNumericalVariance();
        double double16 = hypergeometricDistribution4.upperCumulativeProbability(4);
        java.lang.Class<?> wildcardClass17 = hypergeometricDistribution4.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.2275d + "'", double14 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2390");
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
        double double18 = hypergeometricDistribution4.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.2275d + "'", double16 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.35d + "'", double17 == 0.35d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.35d + "'", double18 == 0.35d);
    }

    @Test
    public void test2391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2391");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double7 = hypergeometricDistribution4.calculateNumericalVariance();
        int int9 = hypergeometricDistribution4.inverseCumulativeProbability((double) 0);
        double double12 = hypergeometricDistribution4.cumulativeProbability((int) '#', (int) '#');
        int int13 = hypergeometricDistribution4.getSampleSize();
        int int14 = hypergeometricDistribution4.getSupportLowerBound();
        double double15 = hypergeometricDistribution4.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.2275d + "'", double15 == 0.2275d);
    }

    @Test
    public void test2392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2392");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        double double12 = hypergeometricDistribution4.cumulativeProbability((int) ' ');
        double double13 = hypergeometricDistribution4.calculateNumericalVariance();
        int int14 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double16 = hypergeometricDistribution4.probability((int) '4');
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
    }

    @Test
    public void test2393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2393");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(100, (int) (byte) 1, 52);
        int[] intArray5 = hypergeometricDistribution3.sample((int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray5);
// flaky "1) test2393(org.apache.commons.math3.distribution.RegressionTest4)":         org.junit.Assert.assertArrayEquals(intArray5, new int[] { 0 });
    }

    @Test
    public void test2394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2394");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution4.isSupportConnected();
        double double7 = hypergeometricDistribution4.getNumericalVariance();
        double double8 = hypergeometricDistribution4.getNumericalMean();
        double double10 = hypergeometricDistribution4.upperCumulativeProbability(100);
        int int11 = hypergeometricDistribution4.getSupportUpperBound();
        int int12 = hypergeometricDistribution4.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.35d + "'", double8 == 0.35d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test2395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2395");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, (int) (byte) 100, (int) (byte) 100);
        int int4 = hypergeometricDistribution3.getSampleSize();
        int int5 = hypergeometricDistribution3.getSampleSize();
        int int6 = hypergeometricDistribution3.getNumberOfSuccesses();
        double double7 = hypergeometricDistribution3.calculateNumericalVariance();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test2396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2396");
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
        double double24 = hypergeometricDistribution4.probability((int) (short) -1);
        double double26 = hypergeometricDistribution4.upperCumulativeProbability((int) (short) 1);
        int int27 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int28 = hypergeometricDistribution4.getNumberOfSuccesses();
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
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.3500000000000001d + "'", double26 == 0.3500000000000001d);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
    }

    @Test
    public void test2397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2397");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int7 = hypergeometricDistribution4.getSupportLowerBound();
        int int9 = hypergeometricDistribution4.inverseCumulativeProbability(1.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test2398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2398");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getPopulationSize();
        double double7 = hypergeometricDistribution4.getNumericalMean();
        int int8 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int9 = hypergeometricDistribution4.getSampleSize();
        int int10 = hypergeometricDistribution4.getSampleSize();
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistribution4.reseedRandomGenerator((long) 20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.35d + "'", double7 == 0.35d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
    }

    @Test
    public void test2399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2399");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 7, 97, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: number of samples (-1)");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2400");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 32, (int) (short) 0, (int) (byte) 0);
        double double5 = hypergeometricDistribution4.calculateNumericalVariance();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = hypergeometricDistribution4.inverseCumulativeProbability((double) 20);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: 20 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test2401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2401");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double7 = hypergeometricDistribution4.calculateNumericalVariance();
        int int9 = hypergeometricDistribution4.inverseCumulativeProbability((double) 0);
        int int10 = hypergeometricDistribution4.getSampleSize();
        double double12 = hypergeometricDistribution4.upperCumulativeProbability((int) (short) 10);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test2402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2402");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(100, (int) (short) 10, 35);
        int int4 = hypergeometricDistribution3.getSupportLowerBound();
        double double6 = hypergeometricDistribution3.cumulativeProbability((int) '4');
        int int7 = hypergeometricDistribution3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test2403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2403");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 0, (int) (short) 1, 52);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: population size (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2404");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 35, (-1), (-1));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: number of successes (-1)");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2405");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getPopulationSize();
        int int8 = hypergeometricDistribution4.inverseCumulativeProbability((double) (byte) 0);
        double double9 = hypergeometricDistribution4.getNumericalVariance();
        double double11 = hypergeometricDistribution4.upperCumulativeProbability((int) '#');
        boolean boolean12 = hypergeometricDistribution4.isSupportConnected();
        int int13 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int14 = hypergeometricDistribution4.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.2275d + "'", double9 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2406");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        int int7 = hypergeometricDistribution4.getNumberOfSuccesses();
        boolean boolean8 = hypergeometricDistribution4.isSupportConnected();
        int int9 = hypergeometricDistribution4.getPopulationSize();
        double double12 = hypergeometricDistribution4.cumulativeProbability(1, (int) (byte) 10);
        int int13 = hypergeometricDistribution4.getSampleSize();
        double double14 = hypergeometricDistribution4.getNumericalVariance();
        int int15 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int16 = hypergeometricDistribution4.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.2275d + "'", double14 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test2407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2407");
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
        double double28 = hypergeometricDistribution4.upperCumulativeProbability((int) 'a');
        int int29 = hypergeometricDistribution4.getSampleSize();
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
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 35 + "'", int29 == 35);
    }

    @Test
    public void test2408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2408");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double7 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 0, (int) (short) 0);
        double double8 = hypergeometricDistribution4.calculateNumericalVariance();
        double double9 = hypergeometricDistribution4.getNumericalMean();
        int int10 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int11 = hypergeometricDistribution4.getSampleSize();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.2275d + "'", double8 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.35d + "'", double9 == 0.35d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
    }

    @Test
    public void test2409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2409");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        double double12 = hypergeometricDistribution4.cumulativeProbability((int) ' ');
        double double13 = hypergeometricDistribution4.calculateNumericalVariance();
        double double14 = hypergeometricDistribution4.getNumericalVariance();
        int int15 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double16 = hypergeometricDistribution4.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2275d + "'", double13 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.2275d + "'", double14 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.2275d + "'", double16 == 0.2275d);
    }

    @Test
    public void test2410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2410");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', (int) (short) 10, 35);
        boolean boolean4 = hypergeometricDistribution3.isSupportConnected();
        int int5 = hypergeometricDistribution3.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test2411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2411");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, 35, 0);
        double double6 = hypergeometricDistribution3.cumulativeProbability((-1), (int) (short) -1);
        double double8 = hypergeometricDistribution3.probability(1);
        int int9 = hypergeometricDistribution3.getSupportUpperBound();
        hypergeometricDistribution3.reseedRandomGenerator((long) 1);
        double double14 = hypergeometricDistribution3.cumulativeProbability(10, 10);
        double double15 = hypergeometricDistribution3.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test2412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2412");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int7 = hypergeometricDistribution4.getSupportLowerBound();
        int int8 = hypergeometricDistribution4.getSampleSize();
        boolean boolean9 = hypergeometricDistribution4.isSupportConnected();
        double double12 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1, (int) ' ');
        double double14 = hypergeometricDistribution4.probability((int) '4');
        double double16 = hypergeometricDistribution4.upperCumulativeProbability(1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = hypergeometricDistribution4.sample((int) (byte) 100);
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
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.3500000000000001d + "'", double16 == 0.3500000000000001d);
    }

    @Test
    public void test2413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2413");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) ' ', (int) ' ', (int) (byte) 1);
        double double4 = hypergeometricDistribution3.getNumericalMean();
        double double5 = hypergeometricDistribution3.calculateNumericalVariance();
        int int6 = hypergeometricDistribution3.getSampleSize();
        int int7 = hypergeometricDistribution3.sample();
        double double8 = hypergeometricDistribution3.calculateNumericalVariance();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test2414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2414");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, (int) (byte) 100, (int) (byte) 100);
        int int4 = hypergeometricDistribution3.getSampleSize();
        double double6 = hypergeometricDistribution3.cumulativeProbability(0);
        int int7 = hypergeometricDistribution3.getSupportLowerBound();
        double double10 = hypergeometricDistribution3.cumulativeProbability(0, (int) '4');
        int int11 = hypergeometricDistribution3.getNumberOfSuccesses();
        double double13 = hypergeometricDistribution3.probability((int) '4');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test2415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2415");
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
        double double23 = hypergeometricDistribution4.upperCumulativeProbability(0);
        double double25 = hypergeometricDistribution4.probability(1);
        int int26 = hypergeometricDistribution4.getSupportLowerBound();
        double double27 = hypergeometricDistribution4.calculateNumericalVariance();
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
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.3500000000000001d + "'", double25 == 0.3500000000000001d);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.2275d + "'", double27 == 0.2275d);
    }

    @Test
    public void test2416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2416");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        double double12 = hypergeometricDistribution4.cumulativeProbability((int) ' ');
        double double13 = hypergeometricDistribution4.calculateNumericalVariance();
        double double14 = hypergeometricDistribution4.getNumericalVariance();
        int int15 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double16 = hypergeometricDistribution4.calculateNumericalVariance();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2275d + "'", double13 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.2275d + "'", double14 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.2275d + "'", double16 == 0.2275d);
    }

    @Test
    public void test2417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2417");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution4.isSupportConnected();
        double double7 = hypergeometricDistribution4.getNumericalVariance();
        double double10 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1, (int) 'a');
        int int11 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int12 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double14 = hypergeometricDistribution4.upperCumulativeProbability(4);
        boolean boolean15 = hypergeometricDistribution4.isSupportConnected();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test2418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2418");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double7 = hypergeometricDistribution4.getNumericalMean();
        double double8 = hypergeometricDistribution4.calculateNumericalVariance();
        int int9 = hypergeometricDistribution4.getSampleSize();
        double double10 = hypergeometricDistribution4.getNumericalMean();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.35d + "'", double7 == 0.35d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.2275d + "'", double8 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.35d + "'", double10 == 0.35d);
    }

    @Test
    public void test2419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2419");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution4.isSupportConnected();
        double double7 = hypergeometricDistribution4.getNumericalVariance();
        int int8 = hypergeometricDistribution4.getSupportUpperBound();
        int int9 = hypergeometricDistribution4.getSupportLowerBound();
        int int10 = hypergeometricDistribution4.getSampleSize();
        double double12 = hypergeometricDistribution4.upperCumulativeProbability(52);
        double double13 = hypergeometricDistribution4.calculateNumericalVariance();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2275d + "'", double13 == 0.2275d);
    }

    @Test
    public void test2420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2420");
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
        double double23 = hypergeometricDistribution4.cumulativeProbability((int) 'a');
        int int24 = hypergeometricDistribution4.getNumberOfSuccesses();
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test2421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2421");
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
        java.lang.Class<?> wildcardClass15 = hypergeometricDistribution4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.2275d + "'", double10 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2422");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double7 = hypergeometricDistribution4.calculateNumericalVariance();
        int int9 = hypergeometricDistribution4.inverseCumulativeProbability((double) 0);
        double double10 = hypergeometricDistribution4.getNumericalMean();
        double double11 = hypergeometricDistribution4.calculateNumericalVariance();
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistribution4.reseedRandomGenerator((long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.35d + "'", double10 == 0.35d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.2275d + "'", double11 == 0.2275d);
    }

    @Test
    public void test2423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2423");
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
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.35d + "'", double13 == 0.35d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.2275d + "'", double16 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.2275d + "'", double17 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.3500000000000001d + "'", double19 == 0.3500000000000001d);
    }

    @Test
    public void test2424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2424");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        int int7 = hypergeometricDistribution4.getNumberOfSuccesses();
        boolean boolean8 = hypergeometricDistribution4.isSupportConnected();
        double double10 = hypergeometricDistribution4.probability(35);
        double double13 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1, 1);
        double double15 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 10);
        int int16 = hypergeometricDistribution4.getPopulationSize();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test2425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2425");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getPopulationSize();
        double double9 = hypergeometricDistribution4.cumulativeProbability(0, (int) (byte) 10);
        double double11 = hypergeometricDistribution4.probability(35);
        int int12 = hypergeometricDistribution4.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.34999999999999964d + "'", double9 == 0.34999999999999964d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test2426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2426");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getPopulationSize();
        boolean boolean7 = hypergeometricDistribution4.isSupportConnected();
        int int8 = hypergeometricDistribution4.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test2427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2427");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(100, (int) (byte) 0, (int) (short) 10);
        double double4 = hypergeometricDistribution3.getNumericalVariance();
        double double6 = hypergeometricDistribution3.probability((int) '#');
        double double8 = hypergeometricDistribution3.upperCumulativeProbability((int) ' ');
        double double11 = hypergeometricDistribution3.cumulativeProbability((int) (short) 10, (int) 'a');
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test2428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2428");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(4, (int) (short) 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: sample size (100) must be less than or equal to population size (4)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2429");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getPopulationSize();
        double double7 = hypergeometricDistribution4.getNumericalMean();
        double double10 = hypergeometricDistribution4.cumulativeProbability((int) (byte) -1, 1);
        double double12 = hypergeometricDistribution4.probability(35);
        double double13 = hypergeometricDistribution4.getNumericalMean();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.35d + "'", double7 == 0.35d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.35d + "'", double13 == 0.35d);
    }

    @Test
    public void test2430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2430");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, 35, 0);
        int int4 = hypergeometricDistribution3.getSupportLowerBound();
        int int5 = hypergeometricDistribution3.getSupportUpperBound();
        int int6 = hypergeometricDistribution3.sample();
        int[] intArray8 = hypergeometricDistribution3.sample((int) '#');
        double double11 = hypergeometricDistribution3.cumulativeProbability((int) (short) -1, (int) (short) -1);
        double double13 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test2431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2431");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double8 = hypergeometricDistribution4.probability((int) 'a');
        boolean boolean9 = hypergeometricDistribution4.isSupportConnected();
        int int10 = hypergeometricDistribution4.getSupportUpperBound();
        int int11 = hypergeometricDistribution4.getPopulationSize();
        double double12 = hypergeometricDistribution4.calculateNumericalVariance();
        boolean boolean13 = hypergeometricDistribution4.isSupportConnected();
        double double15 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 100);
        int int16 = hypergeometricDistribution4.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.2275d + "'", double12 == 0.2275d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2432");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        int int6 = hypergeometricDistribution4.getSupportLowerBound();
        double double8 = hypergeometricDistribution4.probability(1);
        int int9 = hypergeometricDistribution4.getPopulationSize();
        int int10 = hypergeometricDistribution4.getSupportUpperBound();
        double double12 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        int int14 = hypergeometricDistribution4.inverseCumulativeProbability((double) (byte) 1);
        double double15 = hypergeometricDistribution4.getNumericalMean();
        double double16 = hypergeometricDistribution4.calculateNumericalVariance();
        int int17 = hypergeometricDistribution4.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.3500000000000001d + "'", double8 == 0.3500000000000001d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.35d + "'", double15 == 0.35d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.2275d + "'", double16 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2433");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        int int6 = hypergeometricDistribution4.getSupportLowerBound();
        double double8 = hypergeometricDistribution4.probability(1);
        int int9 = hypergeometricDistribution4.getPopulationSize();
        double double11 = hypergeometricDistribution4.cumulativeProbability(52);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.3500000000000001d + "'", double8 == 0.3500000000000001d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test2434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2434");
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
        boolean boolean18 = hypergeometricDistribution4.isSupportConnected();
        double double19 = hypergeometricDistribution4.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.2275d + "'", double19 == 0.2275d);
    }

    @Test
    public void test2435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2435");
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
        int int17 = hypergeometricDistribution4.inverseCumulativeProbability(0.2275d);
        double double19 = hypergeometricDistribution4.probability(0);
        int int20 = hypergeometricDistribution4.getSupportLowerBound();
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.6500000000000004d + "'", double19 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test2436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2436");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, (int) (byte) 100, (int) (byte) 100);
        int int4 = hypergeometricDistribution3.getSampleSize();
        double double6 = hypergeometricDistribution3.cumulativeProbability(0);
        int int7 = hypergeometricDistribution3.getSupportLowerBound();
        int int8 = hypergeometricDistribution3.getNumberOfSuccesses();
        int int9 = hypergeometricDistribution3.getSupportUpperBound();
        double double11 = hypergeometricDistribution3.probability(0);
        double double13 = hypergeometricDistribution3.upperCumulativeProbability((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test2437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2437");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.cumulativeProbability(0);
        double double7 = hypergeometricDistribution4.calculateNumericalVariance();
        int int8 = hypergeometricDistribution4.getPopulationSize();
        double double10 = hypergeometricDistribution4.probability((int) (byte) -1);
        int int11 = hypergeometricDistribution4.getSupportUpperBound();
        double double13 = hypergeometricDistribution4.probability((int) (byte) 100);
        double double15 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test2438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2438");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution4.isSupportConnected();
        double double7 = hypergeometricDistribution4.getNumericalVariance();
        int int8 = hypergeometricDistribution4.getSupportUpperBound();
        int int9 = hypergeometricDistribution4.getSupportLowerBound();
        int int10 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int12 = hypergeometricDistribution4.inverseCumulativeProbability(0.23063024763524284d);
        int int13 = hypergeometricDistribution4.getPopulationSize();
        int int14 = hypergeometricDistribution4.getSampleSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
    }

    @Test
    public void test2439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2439");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(100, (int) (short) 100, (int) (short) 10);
        double double4 = hypergeometricDistribution3.getNumericalMean();
        double double6 = hypergeometricDistribution3.cumulativeProbability((int) (short) 1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test2440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2440");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        double double11 = hypergeometricDistribution4.getNumericalVariance();
        double double13 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double15 = hypergeometricDistribution4.probability((-1));
        int int16 = hypergeometricDistribution4.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.2275d + "'", double11 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2441");
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
        int int16 = hypergeometricDistribution4.getPopulationSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.35d + "'", double8 == 0.35d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2275d + "'", double13 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.6500000000000004d + "'", double15 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test2442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2442");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, 35, 0);
        int int4 = hypergeometricDistribution3.getSupportLowerBound();
        int int5 = hypergeometricDistribution3.getSupportUpperBound();
        int int6 = hypergeometricDistribution3.getPopulationSize();
        double double8 = hypergeometricDistribution3.upperCumulativeProbability((int) (byte) -1);
        int int9 = hypergeometricDistribution3.getSupportUpperBound();
        hypergeometricDistribution3.reseedRandomGenerator((long) (byte) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2443");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        int int7 = hypergeometricDistribution4.getNumberOfSuccesses();
        boolean boolean8 = hypergeometricDistribution4.isSupportConnected();
        int int9 = hypergeometricDistribution4.getPopulationSize();
        double double10 = hypergeometricDistribution4.getNumericalVariance();
        double double12 = hypergeometricDistribution4.upperCumulativeProbability((int) (short) 10);
        double double13 = hypergeometricDistribution4.calculateNumericalVariance();
        int int14 = hypergeometricDistribution4.getPopulationSize();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.2275d + "'", double10 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2275d + "'", double13 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test2444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2444");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        double double6 = hypergeometricDistribution4.getNumericalMean();
        double double7 = hypergeometricDistribution4.getNumericalMean();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray9 = hypergeometricDistribution4.sample((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: number of samples (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.35d + "'", double6 == 0.35d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.35d + "'", double7 == 0.35d);
    }

    @Test
    public void test2445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2445");
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 35 + "'", int26 == 35);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2446");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        double double6 = hypergeometricDistribution4.getNumericalMean();
        double double8 = hypergeometricDistribution4.cumulativeProbability(0);
        int int9 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int11 = hypergeometricDistribution4.inverseCumulativeProbability((double) (short) 1);
        double double14 = hypergeometricDistribution4.cumulativeProbability(100, 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.35d + "'", double6 == 0.35d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.6500000000000004d + "'", double8 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test2447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2447");
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
        int int19 = hypergeometricDistribution4.getSampleSize();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.2275d + "'", double11 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 35 + "'", int19 == 35);
    }

    @Test
    public void test2448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2448");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        int int6 = hypergeometricDistribution4.getSupportLowerBound();
        double double7 = hypergeometricDistribution4.getNumericalMean();
        int int8 = hypergeometricDistribution4.getSampleSize();
        int int9 = hypergeometricDistribution4.getPopulationSize();
        double double10 = hypergeometricDistribution4.getNumericalVariance();
        java.lang.Class<?> wildcardClass11 = hypergeometricDistribution4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.35d + "'", double7 == 0.35d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.2275d + "'", double10 == 0.2275d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2449");
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
        int int21 = hypergeometricDistribution4.getSupportUpperBound();
        boolean boolean22 = hypergeometricDistribution4.isSupportConnected();
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test2450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2450");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution4.isSupportConnected();
        double double7 = hypergeometricDistribution4.getNumericalVariance();
        double double9 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 10);
        double double12 = hypergeometricDistribution4.cumulativeProbability(4, 100);
        double double15 = hypergeometricDistribution4.cumulativeProbability(1, (int) (byte) 1);
        boolean boolean16 = hypergeometricDistribution4.isSupportConnected();
        int int17 = hypergeometricDistribution4.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test2451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2451");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double7 = hypergeometricDistribution4.getNumericalMean();
        double double8 = hypergeometricDistribution4.getNumericalMean();
        int int9 = hypergeometricDistribution4.getSupportLowerBound();
        int int10 = hypergeometricDistribution4.getPopulationSize();
        double double11 = hypergeometricDistribution4.getNumericalVariance();
        int int12 = hypergeometricDistribution4.getSampleSize();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.35d + "'", double7 == 0.35d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.35d + "'", double8 == 0.35d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.2275d + "'", double11 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
    }

    @Test
    public void test2452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2452");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(10, (int) (short) 10, (int) (short) 10);
        double double5 = hypergeometricDistribution3.upperCumulativeProbability((int) (byte) 1);
        int int6 = hypergeometricDistribution3.getPopulationSize();
        boolean boolean7 = hypergeometricDistribution3.isSupportConnected();
        int int8 = hypergeometricDistribution3.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test2453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2453");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution4.isSupportConnected();
        double double7 = hypergeometricDistribution4.getNumericalVariance();
        int int8 = hypergeometricDistribution4.getSupportUpperBound();
        int int9 = hypergeometricDistribution4.getSupportLowerBound();
        double double12 = hypergeometricDistribution4.cumulativeProbability((int) (short) 10, 32);
        int int13 = hypergeometricDistribution4.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test2454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2454");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 32, 97, (int) 'a');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: number of successes (97) must be less than or equal to population size (32)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2455");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getPopulationSize();
        int int8 = hypergeometricDistribution4.inverseCumulativeProbability((double) (byte) 0);
        int int9 = hypergeometricDistribution4.getPopulationSize();
        double double11 = hypergeometricDistribution4.cumulativeProbability((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test2456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2456");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution4.isSupportConnected();
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (short) 10);
        boolean boolean9 = hypergeometricDistribution4.isSupportConnected();
        double double10 = hypergeometricDistribution4.getNumericalMean();
        int int11 = hypergeometricDistribution4.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.35d + "'", double10 == 0.35d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test2457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2457");
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
        int int26 = hypergeometricDistribution4.getPopulationSize();
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
    }

    @Test
    public void test2458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2458");
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.6500000000000004d + "'", double16 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test2459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2459");
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
        int int30 = hypergeometricDistribution4.getSupportUpperBound();
        // The following exception was thrown during execution in test generation
        try {
            hypergeometricDistribution4.reseedRandomGenerator((long) 20);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test2460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2460");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (short) 100, (int) (byte) 0, (int) (short) 0);
        double double4 = hypergeometricDistribution3.getNumericalVariance();
        int[] intArray6 = hypergeometricDistribution3.sample((int) (byte) 1);
        hypergeometricDistribution3.reseedRandomGenerator((long) 'a');
        boolean boolean9 = hypergeometricDistribution3.isSupportConnected();
        double double11 = hypergeometricDistribution3.probability(0);
        int int13 = hypergeometricDistribution3.inverseCumulativeProbability((double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 0 });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2461");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        double double6 = hypergeometricDistribution4.getNumericalMean();
        double double8 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 10);
        double double11 = hypergeometricDistribution4.cumulativeProbability(0, (int) (short) 0);
        double double12 = hypergeometricDistribution4.getNumericalMean();
        boolean boolean13 = hypergeometricDistribution4.isSupportConnected();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.35d + "'", double6 == 0.35d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.35d + "'", double12 == 0.35d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2462");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double7 = hypergeometricDistribution4.calculateNumericalVariance();
        double double9 = hypergeometricDistribution4.probability((int) (byte) 100);
        int int10 = hypergeometricDistribution4.getSupportLowerBound();
        double double12 = hypergeometricDistribution4.cumulativeProbability(1);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = hypergeometricDistribution4.sample();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test2463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2463");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        double double6 = hypergeometricDistribution4.getNumericalVariance();
        int int7 = hypergeometricDistribution4.getSupportUpperBound();
        int int8 = hypergeometricDistribution4.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.2275d + "'", double6 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test2464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2464");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 0, 32, (int) '4');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: population size (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2465");
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
        double double24 = hypergeometricDistribution4.upperCumulativeProbability((int) (short) -1);
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
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0d + "'", double24 == 1.0d);
    }

    @Test
    public void test2466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2466");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        double double12 = hypergeometricDistribution4.cumulativeProbability((int) ' ');
        int int14 = hypergeometricDistribution4.inverseCumulativeProbability((double) 1L);
        double double16 = hypergeometricDistribution4.cumulativeProbability((int) (short) -1);
        double double19 = hypergeometricDistribution4.cumulativeProbability((int) (short) 10, (int) (short) 100);
        double double20 = hypergeometricDistribution4.calculateNumericalVariance();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray22 = hypergeometricDistribution4.sample(7);
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
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.2275d + "'", double20 == 0.2275d);
    }

    @Test
    public void test2467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2467");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        int int11 = hypergeometricDistribution4.getSupportUpperBound();
        double double13 = hypergeometricDistribution4.cumulativeProbability((int) (short) -1);
        int int15 = hypergeometricDistribution4.inverseCumulativeProbability((double) (byte) 1);
        int int16 = hypergeometricDistribution4.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2468");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        int int7 = hypergeometricDistribution4.getNumberOfSuccesses();
        boolean boolean8 = hypergeometricDistribution4.isSupportConnected();
        int int9 = hypergeometricDistribution4.getPopulationSize();
        double double10 = hypergeometricDistribution4.getNumericalVariance();
        double double12 = hypergeometricDistribution4.upperCumulativeProbability((int) (short) 10);
        int int13 = hypergeometricDistribution4.getSupportLowerBound();
        int int14 = hypergeometricDistribution4.getSampleSize();
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.2275d + "'", double10 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
    }

    @Test
    public void test2469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2469");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, 35, 0);
        double double6 = hypergeometricDistribution3.cumulativeProbability((-1), (int) (short) -1);
        double double8 = hypergeometricDistribution3.probability(1);
        double double9 = hypergeometricDistribution3.calculateNumericalVariance();
        double double11 = hypergeometricDistribution3.probability((int) (short) 1);
        int int12 = hypergeometricDistribution3.getSampleSize();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2470");
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
        int int18 = hypergeometricDistribution4.inverseCumulativeProbability(0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2275d + "'", double13 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.35d + "'", double14 == 0.35d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.35d + "'", double15 == 0.35d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2471");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (byte) -1, (int) (short) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: population size (-1)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2472");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (byte) 100, (int) (short) 1, (int) (short) 10);
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        double double7 = hypergeometricDistribution4.cumulativeProbability(4);
        double double8 = hypergeometricDistribution4.calculateNumericalVariance();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.09d + "'", double8 == 0.09d);
    }

    @Test
    public void test2473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2473");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int7 = hypergeometricDistribution4.getSupportLowerBound();
        int int8 = hypergeometricDistribution4.getSampleSize();
        double double9 = hypergeometricDistribution4.getNumericalMean();
        double double10 = hypergeometricDistribution4.getNumericalMean();
        int int11 = hypergeometricDistribution4.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.35d + "'", double9 == 0.35d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.35d + "'", double10 == 0.35d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test2474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2474");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution4.isSupportConnected();
        double double7 = hypergeometricDistribution4.getNumericalVariance();
        double double9 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 10);
        int int10 = hypergeometricDistribution4.getSampleSize();
        double double11 = hypergeometricDistribution4.getNumericalMean();
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
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.35d + "'", double11 == 0.35d);
    }

    @Test
    public void test2475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2475");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        int int11 = hypergeometricDistribution4.getSupportUpperBound();
        int int12 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int13 = hypergeometricDistribution4.getPopulationSize();
        double double16 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 10, (int) (byte) 10);
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test2476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2476");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getPopulationSize();
        boolean boolean7 = hypergeometricDistribution4.isSupportConnected();
        double double10 = hypergeometricDistribution4.cumulativeProbability(1, (int) '#');
        int int11 = hypergeometricDistribution4.getSupportLowerBound();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray13 = hypergeometricDistribution4.sample(20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2477");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, 35, 0);
        double double6 = hypergeometricDistribution3.cumulativeProbability((-1), (int) (short) -1);
        double double8 = hypergeometricDistribution3.probability(1);
        int int9 = hypergeometricDistribution3.getSupportUpperBound();
        hypergeometricDistribution3.reseedRandomGenerator((long) 1);
        int int12 = hypergeometricDistribution3.getSupportUpperBound();
        int int13 = hypergeometricDistribution3.getSupportLowerBound();
        double double14 = hypergeometricDistribution3.calculateNumericalVariance();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test2478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2478");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(52, 97, 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: number of successes (97) must be less than or equal to population size (52)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2479");
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
        int int28 = hypergeometricDistribution4.getSampleSize();
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 35 + "'", int28 == 35);
    }

    @Test
    public void test2480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2480");
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
        double double23 = hypergeometricDistribution4.cumulativeProbability(1);
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
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
    }

    @Test
    public void test2481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2481");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, 35, 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        double double6 = hypergeometricDistribution3.probability((int) 'a');
        double double9 = hypergeometricDistribution3.cumulativeProbability(52, 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test2482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2482");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double9 = hypergeometricDistribution4.cumulativeProbability(0, (int) 'a');
        int int10 = hypergeometricDistribution4.getSampleSize();
        int int11 = hypergeometricDistribution4.getSupportLowerBound();
        int int12 = hypergeometricDistribution4.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.34999999999999964d + "'", double9 == 0.34999999999999964d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test2483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2483");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double7 = hypergeometricDistribution4.calculateNumericalVariance();
        double double9 = hypergeometricDistribution4.upperCumulativeProbability((-1));
        double double11 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray13 = hypergeometricDistribution4.sample(7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.6500000000000004d + "'", double11 == 0.6500000000000004d);
    }

    @Test
    public void test2484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2484");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double5 = hypergeometricDistribution4.getNumericalMean();
        boolean boolean6 = hypergeometricDistribution4.isSupportConnected();
        double double7 = hypergeometricDistribution4.getNumericalVariance();
        double double8 = hypergeometricDistribution4.getNumericalMean();
        double double10 = hypergeometricDistribution4.upperCumulativeProbability(100);
        int int11 = hypergeometricDistribution4.getSupportLowerBound();
        double double12 = hypergeometricDistribution4.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.35d + "'", double5 == 0.35d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.35d + "'", double8 == 0.35d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.35d + "'", double12 == 0.35d);
    }

    @Test
    public void test2485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2485");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.probability((int) (byte) 0);
        double double8 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.upperCumulativeProbability((int) (byte) 0);
        int int11 = hypergeometricDistribution4.getSupportUpperBound();
        int int12 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double14 = hypergeometricDistribution4.cumulativeProbability((int) (short) 1);
        double double16 = hypergeometricDistribution4.upperCumulativeProbability((int) 'a');
        double double17 = hypergeometricDistribution4.getNumericalMean();
        double double19 = hypergeometricDistribution4.upperCumulativeProbability((int) (short) 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.35d + "'", double17 == 0.35d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test2486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2486");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(10, (int) (short) 10, (int) (short) 10);
        double double5 = hypergeometricDistribution3.upperCumulativeProbability((int) (byte) 1);
        double double7 = hypergeometricDistribution3.upperCumulativeProbability(97);
        hypergeometricDistribution3.reseedRandomGenerator((long) 'a');
        int int11 = hypergeometricDistribution3.inverseCumulativeProbability(0.6500000000000004d);
        // The following exception was thrown during execution in test generation
        try {
            double double14 = hypergeometricDistribution3.cumulativeProbability((int) '4', 24);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (52) must be less than or equal to upper endpoint (24)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test2487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2487");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, 35, 0);
        int int4 = hypergeometricDistribution3.getSampleSize();
        boolean boolean5 = hypergeometricDistribution3.isSupportConnected();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test2488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2488");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getPopulationSize();
        double double7 = hypergeometricDistribution4.getNumericalMean();
        double double9 = hypergeometricDistribution4.probability((int) 'a');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.35d + "'", double7 == 0.35d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test2489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2489");
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
            hypergeometricDistribution4.reseedRandomGenerator(100L);
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
    public void test2490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2490");
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
        boolean boolean21 = hypergeometricDistribution4.isSupportConnected();
        int int22 = hypergeometricDistribution4.getPopulationSize();
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
    }

    @Test
    public void test2491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2491");
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
        int int16 = hypergeometricDistribution4.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2275d + "'", double13 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.2275d + "'", double14 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.35d + "'", double15 == 0.35d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test2492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2492");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, (int) (byte) 100, (int) (byte) 100);
        int int4 = hypergeometricDistribution3.getSampleSize();
        int int5 = hypergeometricDistribution3.getSampleSize();
        int int6 = hypergeometricDistribution3.getSampleSize();
        double double8 = hypergeometricDistribution3.upperCumulativeProbability((int) (byte) -1);
        double double9 = hypergeometricDistribution3.calculateNumericalVariance();
        double double11 = hypergeometricDistribution3.upperCumulativeProbability((int) (byte) 100);
        double double14 = hypergeometricDistribution3.cumulativeProbability((int) (short) -1, 32);
        int int15 = hypergeometricDistribution3.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test2493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2493");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, 35, 0);
        int int4 = hypergeometricDistribution3.getPopulationSize();
        double double5 = hypergeometricDistribution3.getNumericalMean();
        double double6 = hypergeometricDistribution3.getNumericalVariance();
        int int7 = hypergeometricDistribution3.sample();
        int int8 = hypergeometricDistribution3.getSupportUpperBound();
        double double10 = hypergeometricDistribution3.probability((int) (byte) 10);
        int int11 = hypergeometricDistribution3.getSupportUpperBound();
        hypergeometricDistribution3.reseedRandomGenerator((long) 10);
        int[] intArray15 = hypergeometricDistribution3.sample(32);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(intArray15);
    }

    @Test
    public void test2494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2494");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        double double7 = hypergeometricDistribution4.upperCumulativeProbability((int) (short) -1);
        boolean boolean8 = hypergeometricDistribution4.isSupportConnected();
        double double9 = hypergeometricDistribution4.getNumericalVariance();
        double double10 = hypergeometricDistribution4.getNumericalMean();
        int int11 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double13 = hypergeometricDistribution4.probability((int) ' ');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.2275d + "'", double9 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.35d + "'", double10 == 0.35d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test2495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2495");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.cumulativeProbability(0);
        int int7 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double8 = hypergeometricDistribution4.calculateNumericalVariance();
        int int9 = hypergeometricDistribution4.getSupportUpperBound();
        int int10 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double12 = hypergeometricDistribution4.probability((int) 'a');
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.2275d + "'", double8 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test2496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2496");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        double double6 = hypergeometricDistribution4.cumulativeProbability(0);
        double double7 = hypergeometricDistribution4.calculateNumericalVariance();
        int int8 = hypergeometricDistribution4.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2275d + "'", double7 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2497");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        int int5 = hypergeometricDistribution4.getSupportUpperBound();
        int int6 = hypergeometricDistribution4.getPopulationSize();
        int int8 = hypergeometricDistribution4.inverseCumulativeProbability((double) (byte) 0);
        double double9 = hypergeometricDistribution4.getNumericalVariance();
        double double11 = hypergeometricDistribution4.cumulativeProbability((int) '#');
        int int12 = hypergeometricDistribution4.getSampleSize();
        double double13 = hypergeometricDistribution4.calculateNumericalVariance();
        int int14 = hypergeometricDistribution4.getSampleSize();
        int int15 = hypergeometricDistribution4.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.2275d + "'", double9 == 0.2275d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2275d + "'", double13 == 0.2275d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test2498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2498");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 1, (int) '#');
        boolean boolean5 = hypergeometricDistribution4.isSupportConnected();
        int int6 = hypergeometricDistribution4.getSampleSize();
        int int8 = hypergeometricDistribution4.inverseCumulativeProbability((double) 0);
        int int10 = hypergeometricDistribution4.inverseCumulativeProbability((double) 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2499");
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
        double double19 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6500000000000004d + "'", double6 == 0.6500000000000004d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.35d + "'", double15 == 0.35d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
    }

    @Test
    public void test2500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2500");
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
        double double23 = hypergeometricDistribution4.cumulativeProbability((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            double double26 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 10, 4);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (10) must be less than or equal to upper endpoint (4)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
    }
}
